package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.da */
/* compiled from: MraidJsFetcher */
public class C5964da {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f15155c = C5964da.class.getSimpleName();

    /* renamed from: a */
    public String f15156a;

    /* renamed from: b */
    public C6206gx f15157b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f15158d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f15159e;

    /* renamed from: f */
    private long f15160f;

    public C5964da(String str, int i, int i2, long j) {
        this.f15156a = str;
        this.f15158d = i;
        this.f15159e = i2;
        this.f15160f = j;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m17820a(C5964da daVar) {
        Context c = C6227ho.m18551c();
        if (c != null) {
            if ((System.currentTimeMillis() / 1000) - new C6241hx(c, "mraid_js_store").mo35447a() > daVar.f15160f) {
                return true;
            }
        }
        return false;
    }
}
