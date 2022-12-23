package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.my.target.t8 */
public class C9977t8 {

    /* renamed from: a */
    public boolean f24739a;

    /* renamed from: b */
    public C9897p3 f24740b;

    /* renamed from: c */
    public Set<C9601a3> f24741c;

    /* renamed from: d */
    public C9641c3 f24742d;

    /* renamed from: e */
    public Context f24743e;

    /* renamed from: f */
    public String f24744f;

    /* renamed from: g */
    public C9978a f24745g;

    /* renamed from: h */
    public float f24746h;

    /* renamed from: i */
    public boolean f24747i = true;

    /* renamed from: com.my.target.t8$a */
    public interface C9978a {
        /* renamed from: a */
        void mo63346a();
    }

    public C9977t8(C9711g2 g2Var, C9897p3 p3Var, Context context) {
        this.f24740b = p3Var;
        if (context != null) {
            this.f24743e = context.getApplicationContext();
        }
        if (g2Var != null) {
            this.f24742d = g2Var.getStatHolder();
            this.f24741c = g2Var.getStatHolder().mo63682c();
            this.f24744f = g2Var.getId();
            this.f24746h = g2Var.getDuration();
            this.f24747i = g2Var.isLogErrors();
        }
    }

    /* renamed from: a */
    public static C9977t8 m29379a(C9711g2 g2Var, C9897p3 p3Var, Context context) {
        return new C9977t8(g2Var, p3Var, context);
    }

    /* renamed from: b */
    public static C9977t8 m29380b() {
        return new C9977t8((C9711g2) null, (C9897p3) null, (Context) null);
    }

    /* renamed from: a */
    public void mo65476a(float f, float f2) {
        if (!mo65482a()) {
            if (!this.f24739a) {
                C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackStarted"), this.f24743e);
                C9978a aVar = this.f24745g;
                if (aVar != null) {
                    aVar.mo63346a();
                }
                this.f24739a = true;
            }
            if (!this.f24741c.isEmpty()) {
                Iterator<C9601a3> it = this.f24741c.iterator();
                while (it.hasNext()) {
                    C9601a3 next = it.next();
                    if (C9787j8.m28415a(next.mo63450e(), f) <= 0) {
                        C10039x8.m29718c((C9626b3) next, this.f24743e);
                        it.remove();
                    }
                }
            }
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65203b(f, f2);
            }
            if (this.f24746h > 0.0f && f2 > 0.0f && !TextUtils.isEmpty(this.f24744f) && this.f24747i && Math.abs(f2 - this.f24746h) > 1.5f) {
                C9796k3 a = C9796k3.m28465a("Bad value");
                a.mo64580d("Media duration error: expected " + this.f24746h + ", but was " + f2).mo64579c(this.f24744f).mo64578b(this.f24743e);
                this.f24747i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo65477a(Context context) {
        this.f24743e = context;
    }

    /* renamed from: a */
    public void mo65478a(C9711g2 g2Var) {
        if (g2Var != null) {
            if (g2Var.getStatHolder() != this.f24742d) {
                this.f24739a = false;
            }
            this.f24742d = g2Var.getStatHolder();
            this.f24741c = g2Var.getStatHolder().mo63682c();
            this.f24747i = g2Var.isLogErrors();
        } else {
            this.f24742d = null;
            this.f24741c = null;
        }
        this.f24744f = null;
        this.f24746h = 0.0f;
    }

    /* renamed from: a */
    public void mo65479a(C9897p3 p3Var) {
        this.f24740b = p3Var;
    }

    /* renamed from: a */
    public void mo65480a(C9978a aVar) {
        this.f24745g = aVar;
    }

    /* renamed from: a */
    public void mo65481a(boolean z) {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a(z ? "fullscreenOn" : "fullscreenOff"), this.f24743e);
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65201a(z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo65482a() {
        return this.f24743e == null || this.f24742d == null || this.f24741c == null;
    }

    /* renamed from: b */
    public void mo65483b(float f, float f2) {
        C9641c3 c3Var;
        String str;
        if (C9787j8.m28415a(f, f2) != 0) {
            if (!mo65482a()) {
                if (C9787j8.m28415a(0.0f, f) == 0) {
                    c3Var = this.f24742d;
                    str = "volumeOn";
                } else if (C9787j8.m28415a(0.0f, f2) == 0) {
                    c3Var = this.f24742d;
                    str = "volumeOff";
                }
                C10039x8.m29720c((List<C9626b3>) c3Var.mo63675a(str), this.f24743e);
            }
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65196a(f2);
            }
        }
    }

    /* renamed from: b */
    public void mo65484b(boolean z) {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a(z ? "volumeOn" : "volumeOff"), this.f24743e);
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65196a(z ? 1.0f : 0.0f);
            }
        }
    }

    /* renamed from: c */
    public void mo65485c() {
        if (!mo65482a()) {
            this.f24741c = this.f24742d.mo63682c();
            this.f24739a = false;
        }
    }

    /* renamed from: d */
    public void mo65486d() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("closedByUser"), this.f24743e);
        }
    }

    /* renamed from: e */
    public void mo65487e() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackPaused"), this.f24743e);
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65197a(0);
            }
        }
    }

    /* renamed from: f */
    public void mo65488f() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackError"), this.f24743e);
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65197a(3);
            }
        }
    }

    /* renamed from: g */
    public void mo65489g() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackTimeout"), this.f24743e);
        }
    }

    /* renamed from: h */
    public void mo65490h() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackResumed"), this.f24743e);
            C9897p3 p3Var = this.f24740b;
            if (p3Var != null) {
                p3Var.mo65197a(1);
            }
        }
    }

    /* renamed from: i */
    public void mo65491i() {
        if (!mo65482a()) {
            C10039x8.m29720c((List<C9626b3>) this.f24742d.mo63675a("playbackStopped"), this.f24743e);
        }
    }
}
