package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.mo */
public class C10763mo extends C10755mi implements C10762mn, C10792no {

    /* renamed from: c */
    private final int f26999c;

    /* renamed from: d */
    private final int f27000d = 0;

    public C10763mo(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2);
        this.f26999c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C10789nl mo67849b() {
        return C10768mt.m32779a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10763mo) {
            C10763mo moVar = (C10763mo) obj;
            return C10765mq.m32772a((Object) mo67852e(), (Object) moVar.mo67852e()) && mo67853f().equals(moVar.mo67853f()) && mo67854g().equals(moVar.mo67854g()) && this.f27000d == moVar.f27000d && this.f26999c == moVar.f26999c && C10765mq.m32772a(mo67850c(), moVar.mo67850c());
        } else if (obj instanceof C10792no) {
            return obj.equals(mo67851d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo67852e() == null ? 0 : mo67852e().hashCode() * 31) + mo67853f().hashCode()) * 31) + mo67854g().hashCode();
    }

    public String toString() {
        C10789nl d = mo67851d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(mo67853f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo67853f() + " (Kotlin reflection is not available)";
    }
}
