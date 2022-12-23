package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;

/* renamed from: com.tapjoy.internal.ft */
public final class C11645ft {

    /* renamed from: a */
    private static final C11660gc<Void> f28323a = new C11660gc<Void>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ String mo72511a(Object obj) {
            return "InsufficientCurrency";
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ TJPlacement mo72510a(Context context, TJPlacementListener tJPlacementListener, Object obj) {
            return TJPlacementManager.createPlacement(context, "InsufficientCurrency", true, tJPlacementListener);
        }
    };

    /* renamed from: a */
    public static void m33818a() {
        f28323a.mo72536c(null);
    }
}
