package com.smaato.sdk.core.network;

import java.util.List;
import java.util.Map;

final class AutoValue_Headers extends Headers {
    private final Map<String, List<String>> headers;

    AutoValue_Headers(Map<String, List<String>> map) {
        if (map != null) {
            this.headers = map;
            return;
        }
        throw new NullPointerException("Null headers");
    }

    public Map<String, List<String>> headers() {
        return this.headers;
    }

    public String toString() {
        return "Headers{headers=" + this.headers + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Headers) {
            return this.headers.equals(((Headers) obj).headers());
        }
        return false;
    }

    public int hashCode() {
        return this.headers.hashCode() ^ 1000003;
    }
}
