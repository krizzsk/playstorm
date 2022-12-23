package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p305a.C8452a;

/* renamed from: com.mbridge.msdk.foundation.same.net.b */
/* compiled from: DefaultRetryPolicy */
public final class C8453b implements C8502l {

    /* renamed from: a */
    private int f20432a;

    /* renamed from: b */
    private int f20433b;

    /* renamed from: c */
    private final int f20434c;

    /* renamed from: d */
    private int f20435d;

    /* renamed from: e */
    private int f20436e;

    /* renamed from: f */
    private int f20437f;

    /* renamed from: g */
    private int f20438g;

    /* renamed from: h */
    private int f20439h;

    public C8453b() {
        this(30000, 0);
    }

    public C8453b(int i, int i2) {
        this.f20435d = 2;
        this.f20436e = 0;
        this.f20437f = 0;
        this.f20438g = 0;
        this.f20439h = 0;
        this.f20432a = i <= 0 ? 30000 : i;
        this.f20434c = i2;
    }

    public C8453b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f20435d = 2;
        this.f20436e = 0;
        this.f20437f = 0;
        this.f20438g = 0;
        this.f20439h = 0;
        this.f20436e = Math.max(i, 0);
        this.f20437f = Math.max(i2, 0);
        this.f20438g = Math.max(i3, 0);
        this.f20439h = Math.max(i4, 0);
        this.f20434c = Math.max(i5, 0);
        this.f20435d = i6;
    }

    /* renamed from: a */
    public final int mo57541a() {
        return this.f20434c;
    }

    /* renamed from: b */
    public final int mo57543b() {
        return this.f20432a;
    }

    /* renamed from: c */
    public final int mo57544c() {
        return this.f20433b;
    }

    /* renamed from: a */
    public final boolean mo57542a(C8452a aVar) {
        int i = this.f20433b + 1;
        this.f20433b = i;
        if (i > this.f20434c) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo57545d() {
        return this.f20436e;
    }

    /* renamed from: e */
    public final int mo57546e() {
        return this.f20437f;
    }

    /* renamed from: f */
    public final int mo57547f() {
        return this.f20438g;
    }

    /* renamed from: g */
    public final int mo57548g() {
        return this.f20439h;
    }
}
