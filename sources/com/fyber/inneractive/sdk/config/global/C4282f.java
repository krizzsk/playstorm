package com.fyber.inneractive.sdk.config.global;

/* renamed from: com.fyber.inneractive.sdk.config.global.f */
public class C4282f implements C4280d {

    /* renamed from: a */
    public String f10622a;

    /* renamed from: b */
    public boolean f10623b;

    public C4282f(String str, boolean z) {
        this.f10622a = str;
        this.f10623b = z;
    }

    /* renamed from: a */
    public boolean mo24305a(C4281e eVar) {
        String str = this.f10622a;
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("android")) {
            return !this.f10623b;
        }
        return this.f10623b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"os", this.f10622a, Boolean.valueOf(this.f10623b)});
    }
}
