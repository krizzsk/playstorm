package com.smaato.sdk.nativead;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.nativead.NativeAdResponse;
import java.util.List;

final class AutoValue_NativeAdResponse extends NativeAdResponse {
    private final NativeAdAssets assets;
    private final Expiration expiration;
    private final ImpressionCountingType impressionCountingType;
    private final NativeAdLink link;
    private final String mraidWrappedVast;
    private final String privacyUrl;
    private final String sessionId;
    private final List<NativeAdTracker> trackers;
    private final Long ttl;

    private AutoValue_NativeAdResponse(NativeAdAssets nativeAdAssets, NativeAdLink nativeAdLink, List<NativeAdTracker> list, String str, Long l, Expiration expiration2, String str2, String str3, ImpressionCountingType impressionCountingType2) {
        this.assets = nativeAdAssets;
        this.link = nativeAdLink;
        this.trackers = list;
        this.privacyUrl = str;
        this.ttl = l;
        this.expiration = expiration2;
        this.sessionId = str2;
        this.mraidWrappedVast = str3;
        this.impressionCountingType = impressionCountingType2;
    }

    public NativeAdAssets assets() {
        return this.assets;
    }

    public NativeAdLink link() {
        return this.link;
    }

    public List<NativeAdTracker> trackers() {
        return this.trackers;
    }

    public String privacyUrl() {
        return this.privacyUrl;
    }

    public Long ttl() {
        return this.ttl;
    }

    public Expiration expiration() {
        return this.expiration;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public String mraidWrappedVast() {
        return this.mraidWrappedVast;
    }

    public ImpressionCountingType impressionCountingType() {
        return this.impressionCountingType;
    }

    public String toString() {
        return "NativeAdResponse{assets=" + this.assets + ", link=" + this.link + ", trackers=" + this.trackers + ", privacyUrl=" + this.privacyUrl + ", ttl=" + this.ttl + ", expiration=" + this.expiration + ", sessionId=" + this.sessionId + ", mraidWrappedVast=" + this.mraidWrappedVast + ", impressionCountingType=" + this.impressionCountingType + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        Expiration expiration2;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdResponse)) {
            return false;
        }
        NativeAdResponse nativeAdResponse = (NativeAdResponse) obj;
        if (!this.assets.equals(nativeAdResponse.assets()) || !this.link.equals(nativeAdResponse.link()) || !this.trackers.equals(nativeAdResponse.trackers()) || ((str = this.privacyUrl) != null ? !str.equals(nativeAdResponse.privacyUrl()) : nativeAdResponse.privacyUrl() != null) || ((l = this.ttl) != null ? !l.equals(nativeAdResponse.ttl()) : nativeAdResponse.ttl() != null) || ((expiration2 = this.expiration) != null ? !expiration2.equals(nativeAdResponse.expiration()) : nativeAdResponse.expiration() != null) || ((str2 = this.sessionId) != null ? !str2.equals(nativeAdResponse.sessionId()) : nativeAdResponse.sessionId() != null) || ((str3 = this.mraidWrappedVast) != null ? !str3.equals(nativeAdResponse.mraidWrappedVast()) : nativeAdResponse.mraidWrappedVast() != null) || !this.impressionCountingType.equals(nativeAdResponse.impressionCountingType())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.assets.hashCode() ^ 1000003) * 1000003) ^ this.link.hashCode()) * 1000003) ^ this.trackers.hashCode()) * 1000003;
        String str = this.privacyUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.ttl;
        int hashCode3 = (hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Expiration expiration2 = this.expiration;
        int hashCode4 = (hashCode3 ^ (expiration2 == null ? 0 : expiration2.hashCode())) * 1000003;
        String str2 = this.sessionId;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mraidWrappedVast;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.impressionCountingType.hashCode();
    }

    static final class Builder extends NativeAdResponse.Builder {
        private NativeAdAssets assets;
        private Expiration expiration;
        private ImpressionCountingType impressionCountingType;
        private NativeAdLink link;
        private String mraidWrappedVast;
        private String privacyUrl;
        private String sessionId;
        private List<NativeAdTracker> trackers;
        private Long ttl;

        Builder() {
        }

        public NativeAdResponse.Builder assets(NativeAdAssets nativeAdAssets) {
            if (nativeAdAssets != null) {
                this.assets = nativeAdAssets;
                return this;
            }
            throw new NullPointerException("Null assets");
        }

        public NativeAdResponse.Builder link(NativeAdLink nativeAdLink) {
            if (nativeAdLink != null) {
                this.link = nativeAdLink;
                return this;
            }
            throw new NullPointerException("Null link");
        }

        public NativeAdResponse.Builder trackers(List<NativeAdTracker> list) {
            if (list != null) {
                this.trackers = list;
                return this;
            }
            throw new NullPointerException("Null trackers");
        }

        public NativeAdResponse.Builder privacyUrl(String str) {
            this.privacyUrl = str;
            return this;
        }

        public NativeAdResponse.Builder ttl(Long l) {
            this.ttl = l;
            return this;
        }

        public NativeAdResponse.Builder expiration(Expiration expiration2) {
            this.expiration = expiration2;
            return this;
        }

        public NativeAdResponse.Builder sessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public NativeAdResponse.Builder mraidWrappedVast(String str) {
            this.mraidWrappedVast = str;
            return this;
        }

        public NativeAdResponse.Builder impressionCountingType(ImpressionCountingType impressionCountingType2) {
            if (impressionCountingType2 != null) {
                this.impressionCountingType = impressionCountingType2;
                return this;
            }
            throw new NullPointerException("Null impressionCountingType");
        }

        public NativeAdResponse build() {
            String str = "";
            if (this.assets == null) {
                str = str + " assets";
            }
            if (this.link == null) {
                str = str + " link";
            }
            if (this.trackers == null) {
                str = str + " trackers";
            }
            if (this.impressionCountingType == null) {
                str = str + " impressionCountingType";
            }
            if (str.isEmpty()) {
                return new AutoValue_NativeAdResponse(this.assets, this.link, this.trackers, this.privacyUrl, this.ttl, this.expiration, this.sessionId, this.mraidWrappedVast, this.impressionCountingType);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
