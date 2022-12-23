package com.ogury.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.sdk.internal.k */
/* compiled from: SharedPreferencesCreator.kt */
public final class C10863k {

    /* renamed from: a */
    private final Context f27092a;

    public C10863k(Context context) {
        C10865m.m32951b(context, "context");
        this.f27092a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo67931a(String str) {
        C10865m.m32951b(str, "name");
        SharedPreferences sharedPreferences = this.f27092a.getSharedPreferences(str, 0);
        C10865m.m32949a((Object) sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
