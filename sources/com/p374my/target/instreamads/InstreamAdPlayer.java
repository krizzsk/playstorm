package com.p374my.target.instreamads;

import android.net.Uri;
import android.view.View;

/* renamed from: com.my.target.instreamads.InstreamAdPlayer */
public interface InstreamAdPlayer {

    /* renamed from: com.my.target.instreamads.InstreamAdPlayer$AdPlayerListener */
    public interface AdPlayerListener {
        void onAdVideoCompleted();

        void onAdVideoError(String str);

        void onAdVideoPaused();

        void onAdVideoResumed();

        void onAdVideoStarted();

        void onAdVideoStopped();

        void onVolumeChanged(float f);
    }

    void destroy();

    AdPlayerListener getAdPlayerListener();

    float getAdVideoDuration();

    float getAdVideoPosition();

    View getView();

    void pauseAdVideo();

    void playAdVideo(Uri uri, int i, int i2);

    void playAdVideo(Uri uri, int i, int i2, float f);

    void resumeAdVideo();

    void setAdPlayerListener(AdPlayerListener adPlayerListener);

    void setVolume(float f);

    void stopAdVideo();
}
