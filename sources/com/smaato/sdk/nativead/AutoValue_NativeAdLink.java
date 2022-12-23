package com.smaato.sdk.nativead;

import java.util.List;

final class AutoValue_NativeAdLink extends NativeAdLink {
    private final List<String> trackers;
    private final String url;

    AutoValue_NativeAdLink(String str, List<String> list) {
        if (str != null) {
            this.url = str;
            if (list != null) {
                this.trackers = list;
                return;
            }
            throw new NullPointerException("Null trackers");
        }
        throw new NullPointerException("Null url");
    }

    public String url() {
        return this.url;
    }

    public List<String> trackers() {
        return this.trackers;
    }

    public String toString() {
        return "NativeAdLink{url=" + this.url + ", trackers=" + this.trackers + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdLink)) {
            return false;
        }
        NativeAdLink nativeAdLink = (NativeAdLink) obj;
        if (!this.url.equals(nativeAdLink.url()) || !this.trackers.equals(nativeAdLink.trackers())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.url.hashCode() ^ 1000003) * 1000003) ^ this.trackers.hashCode();
    }
}
