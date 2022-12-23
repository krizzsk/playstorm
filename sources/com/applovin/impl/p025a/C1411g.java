package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;

/* renamed from: com.applovin.impl.a.g */
public class C1411g {

    /* renamed from: a */
    private final String f1584a;

    /* renamed from: b */
    private final String f1585b;

    private C1411g(String str, String str2) {
        this.f1584a = str;
        this.f1585b = str2;
    }

    /* renamed from: a */
    public static C1411g m2410a(C2088r rVar, C1959m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                return new C1411g(rVar.mo14768b().get("apiFramework"), rVar.mo14770c());
            } catch (Throwable th) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                mVar.mo14286A().mo14790b("VastJavaScriptResource", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo12683a() {
        return this.f1584a;
    }

    /* renamed from: b */
    public String mo12684b() {
        return this.f1585b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1411g gVar = (C1411g) obj;
        String str = this.f1584a;
        if (str == null ? gVar.f1584a != null : !str.equals(gVar.f1584a)) {
            return false;
        }
        String str2 = this.f1585b;
        String str3 = gVar.f1585b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f1584a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1585b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f1584a + '\'' + ", javascriptResourceUrl='" + this.f1585b + '\'' + '}';
    }
}
