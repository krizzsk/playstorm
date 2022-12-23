package com.smaato.sdk.core.util.p382fi;

/* renamed from: com.smaato.sdk.core.util.fi.FunctionUtils */
public final class FunctionUtils {
    private static final Runnable EMPTY_ACTION = $$Lambda$FunctionUtils$sZWLK4hXSr9mGmR_SLLmi9dC50.INSTANCE;
    private static final Consumer<?> EMPTY_CONSUMER = $$Lambda$FunctionUtils$mqKAsN3kZp9WyrA_xrrEfRuyqxw.INSTANCE;

    static /* synthetic */ Object lambda$identity$2(Object obj) {
        return obj;
    }

    static /* synthetic */ void lambda$static$0() {
    }

    static /* synthetic */ void lambda$static$1(Object obj) {
    }

    private FunctionUtils() {
    }

    public static <T> Function<T, T> identity() {
        return $$Lambda$FunctionUtils$KIv1jn8sHXRKbC6Klr0zAXHkRcA.INSTANCE;
    }

    public static <T> Consumer<T> emptyConsumer() {
        return EMPTY_CONSUMER;
    }

    public static Runnable emptyAction() {
        return EMPTY_ACTION;
    }
}
