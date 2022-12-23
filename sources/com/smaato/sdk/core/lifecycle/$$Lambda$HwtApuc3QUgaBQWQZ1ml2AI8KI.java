package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.lifecycle.-$$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8K-I  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI implements Consumer {
    public static final /* synthetic */ $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI INSTANCE = new $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI();

    private /* synthetic */ $$Lambda$HwtApuc3QUgaBQWQZ1ml2AI8KI() {
    }

    public final void accept(Object obj) {
        ((ProcessLifecycleOwner.Listener) obj).onFirstActivityStarted();
    }
}
