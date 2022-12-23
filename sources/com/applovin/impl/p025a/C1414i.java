package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.a.i */
public class C1414i {

    /* renamed from: a */
    private String f1594a;

    /* renamed from: b */
    private String f1595b;

    private C1414i() {
    }

    /* renamed from: a */
    public static C1414i m2420a(C2088r rVar, C1414i iVar, C1959m mVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (iVar == null) {
                try {
                    iVar = new C1414i();
                } catch (Throwable th) {
                    if (!C2092v.m5047a()) {
                        return null;
                    }
                    mVar.mo14286A().mo14790b("VastSystemInfo", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(iVar.f1594a)) {
                String c = rVar.mo14770c();
                if (StringUtils.isValidString(c)) {
                    iVar.f1594a = c;
                }
            }
            if (!StringUtils.isValidString(iVar.f1595b)) {
                String str = rVar.mo14768b().get("version");
                if (StringUtils.isValidString(str)) {
                    iVar.f1595b = str;
                }
            }
            return iVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1414i)) {
            return false;
        }
        C1414i iVar = (C1414i) obj;
        String str = this.f1594a;
        if (str == null ? iVar.f1594a != null : !str.equals(iVar.f1594a)) {
            return false;
        }
        String str2 = this.f1595b;
        String str3 = iVar.f1595b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f1594a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1595b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f1594a + '\'' + ", version='" + this.f1595b + '\'' + '}';
    }
}
