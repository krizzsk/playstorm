package com.smaato.sdk.core.p380ub;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.p380ub.AutoValue_AdMarkup;

/* renamed from: com.smaato.sdk.core.ub.AdMarkup */
public abstract class AdMarkup {

    /* renamed from: com.smaato.sdk.core.ub.AdMarkup$Builder */
    public static abstract class Builder {
        public abstract Builder adFormat(String str);

        public abstract Builder adSpaceId(String str);

        public abstract AdMarkup build();

        public abstract Builder expiresAt(Expiration expiration);

        public abstract Builder impressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder markup(String str);

        public abstract Builder sessionId(String str);
    }

    public abstract String adFormat();

    public abstract String adSpaceId();

    public abstract Expiration expiresAt();

    public abstract ImpressionCountingType impressionCountingType();

    public abstract String markup();

    public abstract String sessionId();

    AdMarkup() {
    }

    public static Builder builder() {
        return new AutoValue_AdMarkup.Builder().impressionCountingType(ImpressionCountingType.STANDARD);
    }
}
