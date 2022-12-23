package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import com.smaato.sdk.core.util.p382fi.Function;

/* renamed from: com.smaato.sdk.richmedia.util.-$$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4 implements Function {
    public static final /* synthetic */ $$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4 INSTANCE = new $$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4();

    private /* synthetic */ $$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(OrientationLockedCompat.isLockedInManifest((Activity) obj));
    }
}
