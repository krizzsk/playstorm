package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.regex.Pattern;

public final class StaticResource {
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String NAME = "StaticResource";
    /* access modifiers changed from: private */
    public static final Pattern PATTERN_IMAGE_MYME_TYPE = Pattern.compile("(image/[^\\s;]+)");
    public final CreativeType creativeType;
    public final String uri;

    private StaticResource(String str, CreativeType creativeType2) {
        this.uri = (String) Objects.requireNonNull(str);
        this.creativeType = (CreativeType) Objects.requireNonNull(creativeType2);
    }

    public enum CreativeType {
        JAVASCRIPT,
        IMAGE,
        UNKNOWN;

        public static CreativeType parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (StaticResource.PATTERN_IMAGE_MYME_TYPE.matcher(str.trim()).find()) {
                return IMAGE;
            }
            if ("application/javascript".equalsIgnoreCase(str)) {
                return JAVASCRIPT;
            }
            return null;
        }
    }

    public static class Builder {
        private CreativeType creativeType;
        private String uri;

        public Builder setUri(String str) {
            this.uri = str;
            return this;
        }

        public Builder setCreativeType(CreativeType creativeType2) {
            this.creativeType = creativeType2;
            return this;
        }

        public StaticResource build() throws VastElementMissingException {
            CreativeType creativeType2 = this.creativeType;
            if (creativeType2 == null) {
                creativeType2 = CreativeType.UNKNOWN;
            }
            return new StaticResource((String) VastModels.requireNonNull(this.uri, "Cannot build StaticResource: uri is missing"), creativeType2);
        }
    }
}
