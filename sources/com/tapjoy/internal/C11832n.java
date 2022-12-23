package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.n */
public final class C11832n extends C11830l<String> {

    /* renamed from: c */
    private final String f28924c = null;

    public C11832n(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final String mo72813a() {
        return this.f28922a.getString(this.f28923b, this.f28924c);
    }

    /* renamed from: a */
    public final void mo72814a(String str) {
        this.f28922a.edit().putString(this.f28923b, str).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72812a(SharedPreferences.Editor editor, String str) {
        return str != null ? editor.putString(this.f28923b, str) : editor.remove(this.f28923b);
    }
}
