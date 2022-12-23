package com.smaato.sdk.core.flow;

abstract class Functions {
    private static final Action0 EMPTY_ACTION_0 = $$Lambda$Functions$D02K6gP7WLBXTr1KFVMoIyL7rAM.INSTANCE;
    private static final Action1<?> EMPTY_ACTION_1 = $$Lambda$Functions$cJ6avJCYI2M6YrnPaMbZDm7lTxc.INSTANCE;
    private static final Function1<?, ?> IDENTITY = $$Lambda$Functions$zvocQH8tyInUS6f1yZFilyb7N4.INSTANCE;

    static /* synthetic */ void lambda$static$0() throws Throwable {
    }

    static /* synthetic */ void lambda$static$1(Object obj) throws Throwable {
    }

    static /* synthetic */ Object lambda$static$2(Object obj) throws Throwable {
        return obj;
    }

    private Functions() {
    }

    static Action0 emptyAction() {
        return EMPTY_ACTION_0;
    }

    static <T> Action1<T> emptyConsumer() {
        return EMPTY_ACTION_1;
    }

    static <T> Function1<T, T> identity() {
        return IDENTITY;
    }
}
