package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import com.smaato.sdk.core.util.p382fi.Function;

/* renamed from: com.smaato.sdk.richmedia.util.-$$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ implements Function {
    public static final /* synthetic */ $$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ INSTANCE = new $$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ();

    private /* synthetic */ $$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(OrientationLockedCompat.isLocked((Activity) obj));
    }
}
