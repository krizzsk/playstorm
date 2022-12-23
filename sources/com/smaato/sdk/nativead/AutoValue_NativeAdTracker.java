package com.smaato.sdk.nativead;

import com.smaato.sdk.nativead.NativeAdTracker;

final class AutoValue_NativeAdTracker extends NativeAdTracker {
    private final NativeAdTracker.Type type;
    private final String url;

    AutoValue_NativeAdTracker(NativeAdTracker.Type type2, String str) {
        if (type2 != null) {
            this.type = type2;
            if (str != null) {
                this.url = str;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null type");
    }

    public NativeAdTracker.Type type() {
        return this.type;
    }

    public String url() {
        return this.url;
    }

    public String toString() {
        return "NativeAdTracker{type=" + this.type + ", url=" + this.url + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdTracker)) {
            return false;
        }
        NativeAdTracker nativeAdTracker = (NativeAdTracker) obj;
        if (!this.type.equals(nativeAdTracker.type()) || !this.url.equals(nativeAdTracker.url())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.type.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode();
    }
}
