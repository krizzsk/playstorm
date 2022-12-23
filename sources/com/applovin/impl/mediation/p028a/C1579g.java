package com.applovin.impl.mediation.p028a;

import com.applovin.impl.mediation.C1730g;

/* renamed from: com.applovin.impl.mediation.a.g */
public class C1579g {

    /* renamed from: a */
    private final C1581h f2073a;

    /* renamed from: b */
    private final String f2074b;

    /* renamed from: c */
    private final String f2075c;

    /* renamed from: d */
    private final String f2076d;

    /* renamed from: e */
    private final String f2077e;

    /* renamed from: com.applovin.impl.mediation.a.g$a */
    public interface C1580a {
        /* renamed from: a */
        void mo13253a(C1579g gVar);
    }

    private C1579g(C1581h hVar, C1730g gVar, String str, String str2) {
        String str3;
        this.f2073a = hVar;
        this.f2076d = str;
        this.f2077e = str2;
        if (gVar != null) {
            this.f2074b = gVar.mo13621h();
            str3 = gVar.mo13622i();
        } else {
            str3 = null;
            this.f2074b = null;
        }
        this.f2075c = str3;
    }

    /* renamed from: a */
    public static C1579g m3049a(C1581h hVar, C1730g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (gVar != null) {
            return new C1579g(hVar, gVar, str, (String) null);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    /* renamed from: a */
    public static C1579g m3050a(C1581h hVar, String str) {
        return m3051b(hVar, (C1730g) null, str);
    }

    /* renamed from: b */
    public static C1579g m3051b(C1581h hVar, C1730g gVar, String str) {
        if (hVar != null) {
            return new C1579g(hVar, gVar, (String) null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public C1581h mo13247a() {
        return this.f2073a;
    }

    /* renamed from: b */
    public String mo13248b() {
        return this.f2074b;
    }

    /* renamed from: c */
    public String mo13249c() {
        return this.f2075c;
    }

    /* renamed from: d */
    public String mo13250d() {
        return this.f2076d;
    }

    /* renamed from: e */
    public String mo13251e() {
        return this.f2077e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f2073a);
        sb.append(", mSdkVersion='");
        sb.append(this.f2074b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f2075c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f2076d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.f2077e);
        sb.append('}');
        return sb.toString();
    }
}
