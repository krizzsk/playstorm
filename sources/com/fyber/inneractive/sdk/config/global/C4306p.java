package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.global.p */
public abstract class C4306p implements C4304n {

    /* renamed from: a */
    public C4304n f10650a;

    /* renamed from: a */
    public String mo24311a(String str, String str2) {
        C4304n nVar = this.f10650a;
        return nVar != null ? nVar.mo24311a(str, str2) : str2;
    }

    /* renamed from: b */
    public Integer mo24314b(String str) {
        C4304n nVar = this.f10650a;
        if (nVar == null || nVar.mo24335a() == null || this.f10650a.mo24335a().size() <= 0) {
            return null;
        }
        return this.f10650a.mo24314b(str);
    }

    /* renamed from: c */
    public String mo24315c(String str) {
        C4304n nVar = this.f10650a;
        if (nVar == null || nVar.mo24335a() == null || this.f10650a.mo24335a().size() <= 0) {
            return null;
        }
        return this.f10650a.mo24315c(str);
    }

    /* renamed from: d */
    public Boolean mo24316d(String str) {
        C4304n nVar = this.f10650a;
        if (nVar == null || nVar.mo24335a() == null || this.f10650a.mo24335a().size() <= 0) {
            return null;
        }
        return this.f10650a.mo24316d(str);
    }

    /* renamed from: a */
    public Double mo24310a(String str) {
        C4304n nVar = this.f10650a;
        if (nVar == null || nVar.mo24335a() == null || this.f10650a.mo24335a().size() <= 0) {
            return null;
        }
        return this.f10650a.mo24310a(str);
    }

    /* renamed from: a */
    public Map<String, Object> mo24335a() {
        C4304n nVar = this.f10650a;
        if (nVar != null) {
            return nVar.mo24335a();
        }
        return null;
    }
}
