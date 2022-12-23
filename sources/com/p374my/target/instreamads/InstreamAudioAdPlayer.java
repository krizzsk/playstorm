package com.p374my.target.instreamads;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.my.target.instreamads.InstreamAudioAdPlayer */
public interface InstreamAudioAdPlayer {

    /* renamed from: com.my.target.instreamads.InstreamAudioAdPlayer$AdPlayerListener */
    public interface AdPlayerListener {
        void onAdAudioCompleted();

        void onAdAudioError(String str);

        void onAdAudioPaused();

        void onAdAudioResumed();

        void onAdAudioStarted();

        void onAdAudioStopped();

        void onVolumeChanged(float f);
    }

    void destroy();

    float getAdAudioDuration();

    float getAdAudioPosition();

    AdPlayerListener getAdPlayerListener();

    Context getCurrentContext();

    void pauseAdAudio();

    void playAdAudio(Uri uri);

    void resumeAdAudio();

    void setAdPlayerListener(AdPlayerListener adPlayerListener);

    void setVolume(float f);

    void stopAdAudio();
}
