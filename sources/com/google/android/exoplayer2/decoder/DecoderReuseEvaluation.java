package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class DecoderReuseEvaluation {
    public static final int DISCARD_REASON_APP_OVERRIDE = 4;
    public static final int DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED = 4096;
    public static final int DISCARD_REASON_AUDIO_ENCODING_CHANGED = 16384;
    public static final int DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED = 8192;
    public static final int DISCARD_REASON_DRM_SESSION_CHANGED = 128;
    public static final int DISCARD_REASON_INITIALIZATION_DATA_CHANGED = 32;
    public static final int DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED = 64;
    public static final int DISCARD_REASON_MIME_TYPE_CHANGED = 8;
    public static final int DISCARD_REASON_OPERATING_RATE_CHANGED = 16;
    public static final int DISCARD_REASON_REUSE_NOT_IMPLEMENTED = 1;
    public static final int DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED = 2048;
    public static final int DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED = 256;
    public static final int DISCARD_REASON_VIDEO_RESOLUTION_CHANGED = 512;
    public static final int DISCARD_REASON_VIDEO_ROTATION_CHANGED = 1024;
    public static final int DISCARD_REASON_WORKAROUND = 2;
    public static final int REUSE_RESULT_NO = 0;
    public static final int REUSE_RESULT_YES_WITHOUT_RECONFIGURATION = 3;
    public static final int REUSE_RESULT_YES_WITH_FLUSH = 1;
    public static final int REUSE_RESULT_YES_WITH_RECONFIGURATION = 2;
    public final String decoderName;
    public final int discardReasons;
    public final Format newFormat;
    public final Format oldFormat;
    public final int result;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        Assertions.checkArgument(i == 0 || i2 == 0);
        this.decoderName = Assertions.checkNotEmpty(str);
        this.oldFormat = (Format) Assertions.checkNotNull(format);
        this.newFormat = (Format) Assertions.checkNotNull(format2);
        this.result = i;
        this.discardReasons = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        if (this.result != decoderReuseEvaluation.result || this.discardReasons != decoderReuseEvaluation.discardReasons || !this.decoderName.equals(decoderReuseEvaluation.decoderName) || !this.oldFormat.equals(decoderReuseEvaluation.oldFormat) || !this.newFormat.equals(decoderReuseEvaluation.newFormat)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.result) * 31) + this.discardReasons) * 31) + this.decoderName.hashCode()) * 31) + this.oldFormat.hashCode()) * 31) + this.newFormat.hashCode();
    }
}
