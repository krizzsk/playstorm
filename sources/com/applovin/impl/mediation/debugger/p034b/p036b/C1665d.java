package com.applovin.impl.mediation.debugger.p034b.p036b;

import android.content.Context;
import com.applovin.impl.sdk.utils.C2039g;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.d */
public class C1665d {

    /* renamed from: a */
    private final String f2395a;

    /* renamed from: b */
    private final String f2396b;

    /* renamed from: c */
    private final boolean f2397c;

    C1665d(String str, String str2, Context context) {
        this.f2395a = str.replace("android.permission.", "");
        this.f2396b = str2;
        this.f2397c = C2039g.m4882a(str, context);
    }

    /* renamed from: a */
    public String mo13462a() {
        return this.f2395a;
    }

    /* renamed from: b */
    public String mo13463b() {
        return this.f2396b;
    }

    /* renamed from: c */
    public boolean mo13464c() {
        return this.f2397c;
    }
}
