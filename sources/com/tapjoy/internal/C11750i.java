package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.i */
public final class C11750i extends C11830l<Double> {

    /* renamed from: c */
    private final double f28616c = 0.0d;

    public C11750i(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final double mo72681a() {
        String string = this.f28922a.getString(this.f28923b, (String) null);
        if (string != null) {
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f28616c;
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72682a(SharedPreferences.Editor editor) {
        return editor.remove(this.f28923b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo72683a(SharedPreferences.Editor editor, double d) {
        return editor.putString(this.f28923b, Double.toString(d));
    }
}
