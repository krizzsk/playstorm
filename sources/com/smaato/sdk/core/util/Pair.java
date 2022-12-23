package com.smaato.sdk.core.util;

public abstract class Pair<F, S> {
    public abstract F first();

    public abstract S second();

    /* renamed from: of */
    public static <F, S> Pair<F, S> m32964of(F f, S s) {
        return new AutoValue_Pair(f, s);
    }
}
