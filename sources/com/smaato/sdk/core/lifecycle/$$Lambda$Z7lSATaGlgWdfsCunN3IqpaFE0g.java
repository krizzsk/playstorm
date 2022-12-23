package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.lifecycle.-$$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g implements Consumer {
    public static final /* synthetic */ $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g INSTANCE = new $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g();

    private /* synthetic */ $$Lambda$Z7lSATaGlgWdfsCunN3IqpaFE0g() {
    }

    public final void accept(Object obj) {
        ((ProcessLifecycleOwner.Listener) obj).onLastActivityStopped();
    }
}
