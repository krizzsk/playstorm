package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.g */
public final class C11655g extends C11830l<Boolean> {

    /* renamed from: c */
    private final boolean f28338c = false;

    public C11655g(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final void mo72529a(boolean z) {
        this.f28922a.edit().putBoolean(this.f28923b, z).apply();
    }

    /* renamed from: a */
    public final Boolean mo72528a() {
        return Boolean.valueOf(this.f28922a.getBoolean(this.f28923b, this.f28338c));
    }
}
