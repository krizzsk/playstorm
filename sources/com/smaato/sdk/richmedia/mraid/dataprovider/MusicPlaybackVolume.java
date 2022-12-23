package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;

public final class MusicPlaybackVolume {
    private static final Uri TARGET_URI = Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build();
    private final AudioManager audioManager;
    private final int maxVolume;

    public MusicPlaybackVolume(AudioManager audioManager2) {
        int i;
        this.audioManager = audioManager2;
        if (audioManager2 == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = audioManager2.getStreamMaxVolume(3);
        }
        this.maxVolume = i;
    }

    public int getCurrentVolume() {
        AudioManager audioManager2 = this.audioManager;
        if (audioManager2 == null) {
            return 0;
        }
        return audioManager2.getStreamVolume(3);
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    /* access modifiers changed from: package-private */
    public Uri getUri() {
        return TARGET_URI;
    }
}
