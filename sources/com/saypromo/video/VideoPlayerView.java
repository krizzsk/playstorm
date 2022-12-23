package com.saypromo.video;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.VideoView;
import com.saypromo.base.SPDebugLog;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.listeners.IVideoPlayerListener;
import java.util.Timer;
import java.util.TimerTask;

public class VideoPlayerView extends VideoView {
    private String _appId;
    private String _debugId;
    private boolean _infoListenerEnabled = true;
    /* access modifiers changed from: private */
    public MediaPlayer _mediaPlayer = null;
    private String _placeId;
    private Timer _prepareTimer;
    private int _progressEventInterval = 500;
    /* access modifiers changed from: private */
    public IVideoPlayerListener _videoPlayerListener;
    private Timer _videoTimer;
    /* access modifiers changed from: private */
    public String _videoUrl;
    private Float _volume = null;

    public VideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void startVideoProgressTimer() {
        Timer timer = new Timer();
        this._videoTimer = timer;
        C109031 r1 = new TimerTask() {
            public void run() {
                try {
                    if (VideoPlayerView.this.isPlaying() && VideoPlayerView.this._videoPlayerListener != null) {
                        VideoPlayerView.this._videoPlayerListener.onVideoPlaying((((float) VideoPlayerView.this.getCurrentPosition()) + 500.0f) / ((float) VideoPlayerView.this.getDuration()));
                    }
                } catch (IllegalStateException e) {
                    DeviceLog.exception("Exception while sending current position to webapp", e);
                }
            }
        };
        int i = this._progressEventInterval;
        timer.scheduleAtFixedRate(r1, (long) i, (long) i);
    }

    public void stopVideoProgressTimer() {
        Timer timer = this._videoTimer;
        if (timer != null) {
            timer.cancel();
            this._videoTimer.purge();
            this._videoTimer = null;
        }
    }

    private void startPrepareTimer(long j) {
        Timer timer = new Timer();
        this._prepareTimer = timer;
        timer.schedule(new TimerTask() {
            public void run() {
                if (!VideoPlayerView.this.isPlaying()) {
                    DeviceLog.error("Video player prepare timeout: " + VideoPlayerView.this._videoUrl);
                }
            }
        }, j);
    }

    public void stopPrepareTimer() {
        Timer timer = this._prepareTimer;
        if (timer != null) {
            timer.cancel();
            this._prepareTimer.purge();
            this._prepareTimer = null;
        }
    }

    public boolean prepare(String str, String str2, String str3, String str4, final float f, int i) {
        DeviceLog.entered();
        this._videoUrl = str;
        this._appId = str2;
        this._placeId = str3;
        this._debugId = str4;
        setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                VideoPlayerView.this.stopPrepareTimer();
                if (mediaPlayer != null) {
                    MediaPlayer unused = VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                VideoPlayerView.this.setVolume(Float.valueOf(f));
                VideoPlayerView.this.TrackDebugEvent("video_prepare");
            }
        });
        setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                VideoPlayerView.this.stopPrepareTimer();
                if (mediaPlayer != null) {
                    MediaPlayer unused = VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                VideoPlayerView.this.stopVideoProgressTimer();
                return true;
            }
        });
        setInfoListenerEnabled(this._infoListenerEnabled);
        if (i > 0) {
            startPrepareTimer((long) i);
        }
        try {
            setVideoPath(this._videoUrl);
            return true;
        } catch (Exception e) {
            DeviceLog.exception("Error preparing video: " + this._videoUrl, e);
            return false;
        }
    }

    public void play(IVideoPlayerListener iVideoPlayerListener) {
        this._videoPlayerListener = iVideoPlayerListener;
        DeviceLog.entered();
        setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (mediaPlayer != null) {
                    MediaPlayer unused = VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                if (VideoPlayerView.this._videoPlayerListener != null) {
                    VideoPlayerView.this._videoPlayerListener.onVideoCompleted();
                }
                VideoPlayerView.this.TrackDebugEvent("video_completed");
                VideoPlayerView.this.stopVideoProgressTimer();
            }
        });
        start();
        stopVideoProgressTimer();
        startVideoProgressTimer();
        TrackDebugEvent("video_start");
    }

    public void setInfoListenerEnabled(boolean z) {
        this._infoListenerEnabled = z;
        if (Build.VERSION.SDK_INT <= 16) {
            return;
        }
        if (this._infoListenerEnabled) {
            setOnInfoListener(new MediaPlayer.OnInfoListener() {
                public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                    return true;
                }
            });
        } else {
            setOnInfoListener((MediaPlayer.OnInfoListener) null);
        }
    }

    public void pause() {
        try {
            super.pause();
            stopVideoProgressTimer();
            TrackDebugEvent("video_pause");
        } catch (Exception e) {
            DeviceLog.exception("Error pausing video", e);
        }
    }

    public void resume() {
        try {
            super.resume();
            startVideoProgressTimer();
        } catch (Exception e) {
            DeviceLog.exception("Error pausing video", e);
        }
    }

    public void seekTo(int i) {
        try {
            super.seekTo(i);
        } catch (Exception e) {
            DeviceLog.exception("Error seeking video", e);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this._videoPlayerListener != null) {
            this._videoPlayerListener.onVideoClicked(motionEvent.getX(), motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void stop() {
        TrackDebugEvent("video_stop");
        stopPlayback();
        stopVideoProgressTimer();
    }

    public float getVolume() {
        return this._volume.floatValue();
    }

    public void setVolume(Float f) {
        try {
            this._mediaPlayer.setVolume(f.floatValue(), f.floatValue());
            this._volume = f;
        } catch (Exception e) {
            DeviceLog.exception("MediaPlayer generic error", e);
        }
    }

    public void setProgressEventInterval(int i) {
        this._progressEventInterval = i;
        if (this._videoTimer != null) {
            stopVideoProgressTimer();
            startVideoProgressTimer();
        }
    }

    public int getProgressEventInterval() {
        return this._progressEventInterval;
    }

    public void TrackDebugEvent(String str) {
        long currentPosition = (long) getCurrentPosition();
        long duration = (long) getDuration();
        long j = duration - currentPosition;
        String str2 = this._debugId;
        if (str2 != null && !str2.isEmpty()) {
            SPDebugLog.sharedInstance.trackEventWithId(this._debugId, this._appId, this._placeId, str, "", j, currentPosition, duration);
        }
    }
}
