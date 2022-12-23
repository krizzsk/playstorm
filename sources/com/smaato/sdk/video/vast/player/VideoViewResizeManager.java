package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.video.vast.model.MediaFile;

public class VideoViewResizeManager {
    private final Size mediaFileSize;

    VideoViewResizeManager(Size size) {
        this.mediaFileSize = size;
    }

    public static VideoViewResizeManager create(MediaFile mediaFile) {
        Float f = mediaFile.width;
        int i = 0;
        int round = f == null ? 0 : Math.round(f.floatValue());
        Float f2 = mediaFile.height;
        if (f2 != null) {
            i = Math.round(f2.floatValue());
        }
        if (round == 0 || i == 0) {
            round = 16;
            i = 9;
        }
        return new VideoViewResizeManager(new Size(round, i));
    }

    public void resizeToContainerSizes(VideoPlayerView videoPlayerView, int i, int i2) {
        Size size = this.mediaFileSize;
        float f = (float) size.width;
        float f2 = (float) size.height;
        float f3 = (float) i;
        float f4 = (float) i2;
        if (f3 / f4 > f / f2) {
            i = Math.round(f * (f4 / f2));
        } else {
            i2 = Math.round(f2 * (f3 / f));
        }
        videoPlayerView.setVideoSize(i, i2);
    }
}
