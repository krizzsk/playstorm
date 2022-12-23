package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.l */
public abstract class C11830l<T> {

    /* renamed from: a */
    protected SharedPreferences f28922a;

    /* renamed from: b */
    protected String f28923b;

    public C11830l(SharedPreferences sharedPreferences, String str) {
        this.f28922a = sharedPreferences;
        this.f28923b = str;
    }

    /* renamed from: c */
    public final void mo72811c() {
        this.f28922a.edit().remove(this.f28923b).apply();
    }
}
