package com.mbridge.msdk.foundation.same.net.p307c;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.same.net.c.b */
/* compiled from: Header */
public final class C8457b {

    /* renamed from: a */
    private final String f20442a;

    /* renamed from: b */
    private final String f20443b;

    public C8457b(String str, String str2) {
        this.f20442a = str;
        this.f20443b = str2;
    }

    /* renamed from: a */
    public final String mo57558a() {
        return this.f20442a;
    }

    /* renamed from: b */
    public final String mo57559b() {
        return this.f20443b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8457b bVar = (C8457b) obj;
        if (!TextUtils.equals(this.f20442a, bVar.f20442a) || !TextUtils.equals(this.f20443b, bVar.f20443b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f20442a.hashCode() * 31) + this.f20443b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20442a + ",value=" + this.f20443b + "]";
    }
}
