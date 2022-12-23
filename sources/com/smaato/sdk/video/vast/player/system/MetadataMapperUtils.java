package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.video.vast.player.exception.IOVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.MalformedVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.TimeoutVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.UnknownVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.UnsupportedVideoPlayerException;
import com.smaato.sdk.video.vast.player.exception.VideoPlayerException;

final class MetadataMapperUtils {
    static Metadata mapToMetadata(int i, int i2) {
        return new Metadata.Builder().putInt("what", i).putInt("extra", i2).build();
    }

    static VideoPlayerException mapToVideoPlayerException(Metadata metadata) {
        Integer num = null;
        Integer num2 = metadata == null ? null : metadata.getInt("what");
        if (metadata != null) {
            num = metadata.getInt("extra");
        }
        if (num2 == null) {
            return new UnknownVideoPlayerException();
        }
        if (num2.intValue() != 1) {
            return new UnknownVideoPlayerException();
        }
        return mapExtraToVideoPlayerException(num);
    }

    private static VideoPlayerException mapExtraToVideoPlayerException(Integer num) {
        if (num == null) {
            return new UnknownVideoPlayerException();
        }
        int intValue = num.intValue();
        if (intValue == -1010) {
            return new UnsupportedVideoPlayerException();
        }
        if (intValue == -1007) {
            return new MalformedVideoPlayerException();
        }
        if (intValue == -1004) {
            return new IOVideoPlayerException();
        }
        if (intValue != -110) {
            return new UnknownVideoPlayerException();
        }
        return new TimeoutVideoPlayerException();
    }
}
