package com.p374my.target.common.models;

import com.p374my.target.C9672e0;
import com.p374my.target.C9983u1;
import java.util.List;

/* renamed from: com.my.target.common.models.VideoData */
public final class VideoData extends C9983u1<String> {
    public static final String M3U8 = ".m3u8";
    private int bitrate;
    private final boolean cacheable = (!this.url.endsWith(M3U8));

    private VideoData(String str, int i, int i2) {
        super(str);
        this.width = i;
        this.height = i2;
    }

    public static VideoData chooseBest(List<VideoData> list, int i) {
        VideoData videoData = null;
        int i2 = 0;
        for (VideoData next : list) {
            int height = next.getHeight();
            if (videoData == null || ((height <= i && i2 > i) || ((height <= i && height > i2) || (height > i && height < i2)))) {
                videoData = next;
                i2 = height;
            }
        }
        C9672e0.m27882a("Accepted videoData quality = " + i2 + "p");
        return videoData;
    }

    public static VideoData newVideoData(String str, int i, int i2) {
        return new VideoData(str, i, i2);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public boolean isCacheable() {
        return this.cacheable;
    }

    public void setBitrate(int i) {
        this.bitrate = i;
    }
}
