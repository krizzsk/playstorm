package com.p374my.target.common.models;

import com.p374my.target.C9983u1;

/* renamed from: com.my.target.common.models.AudioData */
public final class AudioData extends C9983u1<String> {
    private int bitrate;

    private AudioData(String str) {
        super(str);
    }

    public static AudioData newAudioData(String str) {
        return new AudioData(str);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }
}
