package com.inmobi.media;

/* renamed from: com.inmobi.media.io */
/* compiled from: RuleKey */
public final class C6267io {

    /* renamed from: a */
    private String f15873a;

    /* renamed from: b */
    private Class<?> f15874b;

    public C6267io(String str, Class<?> cls) {
        this.f15873a = str;
        this.f15874b = cls;
    }

    public final int hashCode() {
        return this.f15873a.hashCode() + this.f15874b.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6267io) {
            C6267io ioVar = (C6267io) obj;
            if (!this.f15873a.equals(ioVar.f15873a) || this.f15874b != ioVar.f15874b) {
                return false;
            }
            return true;
        }
        return false;
    }
}
