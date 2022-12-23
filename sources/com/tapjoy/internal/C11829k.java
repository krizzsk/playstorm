package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.k */
public final class C11829k extends C11830l<Long> {

    /* renamed from: c */
    private final long f28921c = 0;

    public C11829k(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final long mo72807a() {
        return this.f28922a.getLong(this.f28923b, this.f28921c);
    }

    /* renamed from: a */
    public final void mo72810a(long j) {
        this.f28922a.edit().putLong(this.f28923b, j).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72808a(SharedPreferences.Editor editor) {
        return editor.remove(this.f28923b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72809a(SharedPreferences.Editor editor, long j) {
        return editor.putLong(this.f28923b, j);
    }
}
