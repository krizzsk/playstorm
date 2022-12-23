package com.applovin.impl.mediation.debugger.p034b.p035a;

import com.applovin.impl.mediation.debugger.p034b.p036b.C1661b;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.d */
public class C1658d implements Comparable<C1658d> {

    /* renamed from: a */
    private final String f2340a;

    /* renamed from: b */
    private final String f2341b;

    /* renamed from: c */
    private final boolean f2342c;

    /* renamed from: d */
    private final C1661b f2343d;

    C1658d(String str, String str2, boolean z, C1661b bVar) {
        this.f2340a = str;
        this.f2341b = str2;
        this.f2342c = z;
        this.f2343d = bVar;
    }

    /* renamed from: a */
    public int compareTo(C1658d dVar) {
        return this.f2341b.compareToIgnoreCase(dVar.f2341b);
    }

    /* renamed from: a */
    public String mo13416a() {
        return this.f2340a;
    }

    /* renamed from: b */
    public String mo13417b() {
        return this.f2341b;
    }

    /* renamed from: c */
    public C1661b mo13418c() {
        return this.f2343d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1658d dVar = (C1658d) obj;
        String str = this.f2340a;
        if (str == null ? dVar.f2340a != null : !str.equals(dVar.f2340a)) {
            return false;
        }
        String str2 = this.f2341b;
        if (str2 == null ? dVar.f2341b == null : str2.equals(dVar.f2341b)) {
            return this.f2342c == dVar.f2342c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2340a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2341b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + (this.f2342c ? 1 : 0);
    }
}
