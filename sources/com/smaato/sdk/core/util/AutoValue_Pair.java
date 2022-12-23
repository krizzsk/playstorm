package com.smaato.sdk.core.util;

final class AutoValue_Pair<F, S> extends Pair<F, S> {
    private final F first;
    private final S second;

    AutoValue_Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public F first() {
        return this.first;
    }

    public S second() {
        return this.second;
    }

    public String toString() {
        return "Pair{first=" + this.first + ", second=" + this.second + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f = this.first;
        if (f != null ? f.equals(pair.first()) : pair.first() == null) {
            S s = this.second;
            if (s == null) {
                if (pair.second() == null) {
                    return true;
                }
            } else if (s.equals(pair.second())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        F f = this.first;
        int i = 0;
        int hashCode = ((f == null ? 0 : f.hashCode()) ^ 1000003) * 1000003;
        S s = this.second;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }
}
