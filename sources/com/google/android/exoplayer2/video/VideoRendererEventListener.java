package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public interface VideoRendererEventListener {
    void onDroppedFrames(int i, long j) {
    }

    void onRenderedFirstFrame(Object obj, long j) {
    }

    void onVideoCodecError(Exception exc) {
    }

    void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    void onVideoDecoderReleased(String str) {
    }

    void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    void onVideoFrameProcessingOffset(long j, int i) {
    }

    @Deprecated
    void onVideoInputFormatChanged(Format format) {
    }

    void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    void onVideoSizeChanged(VideoSize videoSize) {
    }

    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler2, VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler2) : null;
            this.listener = videoRendererEventListener;
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(decoderCounters) {
                    public final /* synthetic */ DecoderCounters f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.lambda$enabled$0$VideoRendererEventListener$EventDispatcher(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$enabled$0$VideoRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        public void decoderInitialized(String str, long j, long j2) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(str, j, j2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31637x9a08f997(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderInitialized$1$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31637x9a08f997(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        public void inputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(format, decoderReuseEvaluation) {
                    public final /* synthetic */ Format f$1;
                    public final /* synthetic */ DecoderReuseEvaluation f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31642xe7570b3(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: lambda$inputFormatChanged$2$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31642xe7570b3(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format);
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        public void droppedFrames(int i, long j) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(i, j) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31640xf7e95759(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: lambda$droppedFrames$3$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31640xf7e95759(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        public void reportVideoFrameProcessingOffset(long j, int i) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(j, i) {
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r4;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31644xac275638(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: lambda$reportVideoFrameProcessingOffset$4$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31644xac275638(long j, int i) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i);
        }

        public void videoSizeChanged(VideoSize videoSize) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(videoSize) {
                    public final /* synthetic */ VideoSize f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31646x32e5b8cb(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$videoSizeChanged$5$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31646x32e5b8cb(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void renderedFirstFrame(Object obj) {
            if (this.handler != null) {
                this.handler.post(new Runnable(obj, SystemClock.elapsedRealtime()) {
                    public final /* synthetic */ Object f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31643x7a7e870(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: lambda$renderedFirstFrame$6$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31643x7a7e870(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        public void decoderReleased(String str) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31638xa2bde45a(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$decoderReleased$7$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31638xa2bde45a(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(decoderCounters) {
                    public final /* synthetic */ DecoderCounters f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.lambda$disabled$8$VideoRendererEventListener$EventDispatcher(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$disabled$8$VideoRendererEventListener$EventDispatcher(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        public void videoCodecError(Exception exc) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.this.mo31645x15635cc(this.f$1);
                    }
                });
            }
        }

        /* renamed from: lambda$videoCodecError$9$VideoRendererEventListener$EventDispatcher */
        public /* synthetic */ void mo31645x15635cc(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }
    }
}
