package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.j */
public final class C11798j extends C11830l<Integer> {

    /* renamed from: c */
    private final int f28803c;

    public C11798j(SharedPreferences sharedPreferences, String str, int i) {
        super(sharedPreferences, str);
        this.f28803c = i;
    }

    /* renamed from: a */
    public final Integer mo72736a() {
        return Integer.valueOf(mo72739b());
    }

    /* renamed from: b */
    public final int mo72739b() {
        return this.f28922a.getInt(this.f28923b, this.f28803c);
    }

    /* renamed from: a */
    public final void mo72738a(Integer num) {
        if (num != null) {
            mo72737a(num.intValue());
        } else {
            mo72811c();
        }
    }

    /* renamed from: a */
    public final void mo72737a(int i) {
        this.f28922a.edit().putInt(this.f28923b, i).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72735a(SharedPreferences.Editor editor, int i) {
        return editor.putInt(this.f28923b, i);
    }
}
