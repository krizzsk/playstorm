package com.smaato.sdk.core.util.p382fi;

/* renamed from: com.smaato.sdk.core.util.fi.NullableFunction */
public interface NullableFunction<T, R> {
    static /* synthetic */ Object lambda$identity$0(Object obj) {
        return obj;
    }

    R apply(T t);

    static <T> NullableFunction<T, T> identity() {
        return $$Lambda$NullableFunction$ybqyGb3em48ciXiIgEZzqWwEmds.INSTANCE;
    }
}
