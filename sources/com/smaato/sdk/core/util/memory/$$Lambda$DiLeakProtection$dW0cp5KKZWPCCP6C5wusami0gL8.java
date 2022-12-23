package com.smaato.sdk.core.util.memory;

import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.util.memory.-$$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8 implements Consumer {
    public static final /* synthetic */ $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8 INSTANCE = new $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8();

    private /* synthetic */ $$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8() {
    }

    public final void accept(Object obj) {
        ((DiRegistry) obj).registerSingletonFactory(LeakProtection.class, $$Lambda$DiLeakProtection$7ekXMOQGhw5MfYlkm_Q3qG7DHc.INSTANCE);
    }
}
