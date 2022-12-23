package com.p374my.target;

import android.content.Context;

/* renamed from: com.my.target.h3 */
public abstract class C9734h3<T> {

    /* renamed from: a */
    public boolean f23988a;

    /* renamed from: b */
    public boolean f23989b;

    /* renamed from: c */
    public int f23990c = -1;

    /* renamed from: d */
    public T f23991d;

    /* renamed from: e */
    public String f23992e;

    /* renamed from: a */
    public abstract T mo63942a(String str, String str2, Context context);

    /* renamed from: a */
    public String mo64162a() {
        return this.f23992e;
    }

    /* renamed from: b */
    public T mo64163b() {
        return this.f23991d;
    }

    /* renamed from: b */
    public final T mo64164b(String str, String str2, Context context) {
        this.f23988a = true;
        this.f23989b = false;
        this.f23990c = -1;
        this.f23991d = null;
        this.f23992e = null;
        return mo63942a(str, str2, context);
    }

    /* renamed from: c */
    public boolean mo64165c() {
        return this.f23988a;
    }
}
