package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C10219ai;

/* renamed from: com.ogury.core.internal.aaid.a */
/* compiled from: AdInfo.kt */
public final class C10206a {

    /* renamed from: a */
    private final String f25984a;

    /* renamed from: b */
    private final boolean f25985b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10206a)) {
            return false;
        }
        C10206a aVar = (C10206a) obj;
        return C10219ai.m31035a((Object) this.f25984a, (Object) aVar.f25984a) && this.f25985b == aVar.f25985b;
    }

    public final int hashCode() {
        String str = this.f25984a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f25985b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        return "AdInfo(id=" + this.f25984a + ", isLimitAdTrackingEnabled=" + this.f25985b + ")";
    }

    public C10206a(String str, boolean z) {
        C10219ai.m31036b(str, "id");
        this.f25984a = str;
        this.f25985b = z;
    }

    /* renamed from: a */
    public final String mo66764a() {
        return this.f25984a;
    }

    /* renamed from: b */
    public final boolean mo66765b() {
        return this.f25985b;
    }
}
