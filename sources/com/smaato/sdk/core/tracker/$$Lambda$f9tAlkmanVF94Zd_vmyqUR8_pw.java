package com.smaato.sdk.core.tracker;

import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.p382fi.Consumer;

/* renamed from: com.smaato.sdk.core.tracker.-$$Lambda$f9tAlkm-anVF94Zd_vmyqUR8_pw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$f9tAlkmanVF94Zd_vmyqUR8_pw implements Consumer {
    public static final /* synthetic */ $$Lambda$f9tAlkmanVF94Zd_vmyqUR8_pw INSTANCE = new $$Lambda$f9tAlkmanVF94Zd_vmyqUR8_pw();

    private /* synthetic */ $$Lambda$f9tAlkmanVF94Zd_vmyqUR8_pw() {
    }

    public final void accept(Object obj) {
        ((ImpressionDetector.Callback) obj).onImpressionStateDetected();
    }
}
