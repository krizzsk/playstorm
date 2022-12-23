package com.smaato.sdk.nativead;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.nativead.AutoValue_NativeAdResponse;
import java.util.Collections;
import java.util.List;

public abstract class NativeAdResponse {
    private static final NativeAdResponse EMPTY = builder().assets(NativeAdAssets.builder().build()).link(NativeAdLink.create("", Collections.emptyList())).trackers(Collections.emptyList()).privacyUrl("").ttl((Long) null).sessionId("").expiration((Expiration) null).mraidWrappedVast("").impressionCountingType(ImpressionCountingType.STANDARD).build();

    public static abstract class Builder {
        public abstract Builder assets(NativeAdAssets nativeAdAssets);

        public abstract NativeAdResponse build();

        public abstract Builder expiration(Expiration expiration);

        public abstract Builder impressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder link(NativeAdLink nativeAdLink);

        public abstract Builder mraidWrappedVast(String str);

        public abstract Builder privacyUrl(String str);

        public abstract Builder sessionId(String str);

        public abstract Builder trackers(List<NativeAdTracker> list);

        public abstract Builder ttl(Long l);
    }

    public abstract NativeAdAssets assets();

    public abstract Expiration expiration();

    public abstract ImpressionCountingType impressionCountingType();

    public abstract NativeAdLink link();

    public abstract String mraidWrappedVast();

    public abstract String privacyUrl();

    public abstract String sessionId();

    public abstract List<NativeAdTracker> trackers();

    public abstract Long ttl();

    public static NativeAdResponse empty() {
        return EMPTY;
    }

    public static Builder builder() {
        return new AutoValue_NativeAdResponse.Builder().impressionCountingType(ImpressionCountingType.STANDARD);
    }

    public Builder buildUpon() {
        return builder().link(link()).assets(assets()).trackers(trackers()).ttl(ttl()).expiration(expiration()).sessionId(sessionId()).mraidWrappedVast(mraidWrappedVast()).privacyUrl(privacyUrl()).impressionCountingType(impressionCountingType());
    }

    public boolean isVastTagPresent() {
        return assets().vastTag() != null && !assets().vastTag().isEmpty();
    }
}
