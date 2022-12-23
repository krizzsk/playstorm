package com.ogury.p376ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fe */
public final class C10520fe {

    /* renamed from: a */
    private final boolean f26590a;

    /* renamed from: b */
    private final long f26591b;

    /* renamed from: c */
    private final JSONObject f26592c;

    /* renamed from: d */
    private final boolean f26593d;

    /* renamed from: e */
    private final String f26594e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10520fe)) {
            return false;
        }
        C10520fe feVar = (C10520fe) obj;
        return this.f26590a == feVar.f26590a && this.f26591b == feVar.f26591b && C10765mq.m32772a((Object) this.f26592c, (Object) feVar.f26592c) && this.f26593d == feVar.f26593d && C10765mq.m32772a((Object) this.f26594e, (Object) feVar.f26594e);
    }

    public final int hashCode() {
        boolean z = this.f26590a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + Long.hashCode(this.f26591b)) * 31) + this.f26592c.hashCode()) * 31;
        boolean z3 = this.f26593d;
        if (!z3) {
            z2 = z3;
        }
        int i = (hashCode + (z2 ? 1 : 0)) * 31;
        String str = this.f26594e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProfigRequest(allowRequest=" + this.f26590a + ", jobScheduleWindow=" + this.f26591b + ", request=" + this.f26592c + ", profigEnabled=" + this.f26593d + ", profigHash=" + this.f26594e + ')';
    }

    public /* synthetic */ C10520fe(long j, JSONObject jSONObject, boolean z) {
        this(false, j, jSONObject, z, (String) null);
    }

    public C10520fe(boolean z, long j, JSONObject jSONObject, boolean z2, String str) {
        C10765mq.m32773b(jSONObject, "request");
        this.f26590a = z;
        this.f26591b = j;
        this.f26592c = jSONObject;
        this.f26593d = z2;
        this.f26594e = str;
    }

    /* renamed from: a */
    public final boolean mo67369a() {
        return this.f26590a;
    }

    /* renamed from: b */
    public final JSONObject mo67370b() {
        return this.f26592c;
    }

    /* renamed from: c */
    public final String mo67371c() {
        return this.f26594e;
    }
}
