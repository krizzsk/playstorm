package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9741i;
import com.p374my.target.C9745i0;
import com.p374my.target.C9822l3;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.instreamads.InstreamAudioAd;
import com.p374my.target.instreamads.InstreamAudioAdPlayer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u0 */
public class C9980u0 {

    /* renamed from: a */
    public final InstreamAudioAd f24748a;

    /* renamed from: b */
    public final C9945s2 f24749b;

    /* renamed from: c */
    public final C9596a f24750c;

    /* renamed from: d */
    public final C9822l3.C9823a f24751d;

    /* renamed from: e */
    public final C9745i0 f24752e;

    /* renamed from: f */
    public final C9722g8 f24753f;

    /* renamed from: g */
    public C9984u2<AudioData> f24754g;

    /* renamed from: h */
    public C9711g2<AudioData> f24755h;

    /* renamed from: i */
    public InstreamAudioAd.InstreamAudioAdBanner f24756i;

    /* renamed from: j */
    public List<InstreamAudioAd.InstreamAdCompanionBanner> f24757j;

    /* renamed from: k */
    public List<C9711g2<AudioData>> f24758k;

    /* renamed from: l */
    public float[] f24759l = new float[0];

    /* renamed from: m */
    public float f24760m;

    /* renamed from: n */
    public int f24761n;

    /* renamed from: o */
    public int f24762o;

    /* renamed from: p */
    public int f24763p;

    /* renamed from: com.my.target.u0$b */
    public class C9982b implements C9745i0.C9748c {
        public C9982b() {
        }

        /* renamed from: a */
        public void mo64226a(float f, float f2, C9711g2 g2Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (C9980u0.this.f24754g != null && C9980u0.this.f24755h == g2Var && C9980u0.this.f24756i != null && (listener = C9980u0.this.f24748a.getListener()) != null) {
                listener.onBannerTimeLeftChange(f, f2, C9980u0.this.f24748a);
            }
        }

        /* renamed from: a */
        public void mo64227a(C9711g2 g2Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            if (C9980u0.this.f24754g != null && C9980u0.this.f24755h == g2Var && C9980u0.this.f24756i != null && (listener = C9980u0.this.f24748a.getListener()) != null) {
                listener.onBannerComplete(C9980u0.this.f24748a, C9980u0.this.f24756i);
            }
        }

        /* renamed from: a */
        public void mo64228a(String str, C9711g2 g2Var) {
            if (C9980u0.this.f24754g != null && C9980u0.this.f24755h == g2Var) {
                InstreamAudioAd.InstreamAudioAdListener listener = C9980u0.this.f24748a.getListener();
                if (listener != null) {
                    listener.onError(str, C9980u0.this.f24748a);
                }
                C9980u0.this.mo65516f();
            }
        }

        /* renamed from: b */
        public void mo64229b(C9711g2 g2Var) {
            if (C9980u0.this.f24754g != null && C9980u0.this.f24755h == g2Var && C9980u0.this.f24756i != null) {
                InstreamAudioAd.InstreamAudioAdListener listener = C9980u0.this.f24748a.getListener();
                if (listener != null) {
                    listener.onBannerComplete(C9980u0.this.f24748a, C9980u0.this.f24756i);
                }
                C9980u0.this.mo65516f();
            }
        }

        /* renamed from: c */
        public void mo64230c(C9711g2 g2Var) {
            if (C9980u0.this.f24754g != null && C9980u0.this.f24755h == g2Var && C9980u0.this.f24756i != null) {
                C9672e0.m27882a("Ad shown, banner Id = " + g2Var.getId());
                InstreamAudioAd.InstreamAudioAdListener listener = C9980u0.this.f24748a.getListener();
                if (listener != null) {
                    listener.onBannerStart(C9980u0.this.f24748a, C9980u0.this.f24756i);
                }
            }
        }
    }

    public C9980u0(InstreamAudioAd instreamAudioAd, C9945s2 s2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        this.f24748a = instreamAudioAd;
        this.f24749b = s2Var;
        this.f24750c = aVar;
        this.f24751d = aVar2;
        C9745i0 h = C9745i0.m28192h();
        this.f24752e = h;
        h.mo64206a((C9745i0.C9748c) new C9982b());
        this.f24753f = C9722g8.m28089a();
    }

    /* renamed from: a */
    public static C9980u0 m29401a(InstreamAudioAd instreamAudioAd, C9945s2 s2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9980u0(instreamAudioAd, s2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public final C9600a2 mo65493a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        String str;
        C9711g2<AudioData> g2Var;
        if (this.f24757j == null || this.f24756i == null || (g2Var = this.f24755h) == null) {
            str = "can't find companion banner: no playing banner";
        } else {
            ArrayList<C9600a2> companionBanners = g2Var.getCompanionBanners();
            int indexOf = this.f24757j.indexOf(instreamAdCompanionBanner);
            if (indexOf >= 0 && indexOf < companionBanners.size()) {
                return companionBanners.get(indexOf);
            }
            str = "can't find companion banner: provided instreamAdCompanionBanner not found in current playing banner";
        }
        C9672e0.m27882a(str);
        return null;
    }

    /* renamed from: a */
    public void mo65494a() {
        this.f24752e.mo64210c();
    }

    /* renamed from: a */
    public void mo65495a(float f) {
        this.f24752e.mo64211c(f);
    }

    /* renamed from: a */
    public void mo65496a(int i) {
        this.f24761n = i;
    }

    /* renamed from: a */
    public final void mo65497a(C9711g2 g2Var, String str) {
        if (g2Var == null) {
            C9672e0.m27882a("can't send stat: banner is null");
            return;
        }
        Context d = this.f24752e.mo64212d();
        if (d == null) {
            C9672e0.m27882a("can't send stat: context is null");
        } else {
            C10039x8.m29720c((List<C9626b3>) g2Var.getStatHolder().mo63675a(str), d);
        }
    }

    /* renamed from: a */
    public void mo65498a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        C9600a2 a = mo65493a(instreamAdCompanionBanner);
        if (a == null) {
            C9672e0.m27882a("can't handle click: companion banner not found");
        } else {
            this.f24753f.mo64119a(a, context);
        }
    }

    /* renamed from: a */
    public void mo65499a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.f24752e.mo64207a(instreamAudioAdPlayer);
    }

    /* renamed from: a */
    public final void mo65500a(C9915q1 q1Var, C9984u2<AudioData> u2Var) {
        Context d = this.f24752e.mo64212d();
        if (d == null) {
            C9672e0.m27882a("can't load doAfter service: context is null");
            return;
        }
        C9672e0.m27882a("loading doAfter service: " + q1Var.f24532b);
        C9741i.m28171a(q1Var, this.f24750c, this.f24751d, this.f24761n).mo63560a(new C9741i.C9744c(u2Var) {
            public final /* synthetic */ C9984u2 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                C9980u0.this.m29405b(this.f$1, (C9945s2) q2Var, str);
            }
        }).mo63567b(this.f24751d.mo64679a(), d);
    }

    /* renamed from: a */
    public final void mo65501a(C9984u2<AudioData> u2Var) {
        if (u2Var == this.f24754g) {
            if ("midroll".equals(u2Var.mo65538h())) {
                this.f24754g.mo65532b(this.f24763p);
            }
            this.f24754g = null;
            this.f24755h = null;
            this.f24756i = null;
            this.f24762o = -1;
            InstreamAudioAd.InstreamAudioAdListener listener = this.f24748a.getListener();
            if (listener != null) {
                listener.onComplete(u2Var.mo65538h(), this.f24748a);
            }
        }
    }

    /* renamed from: a */
    public final void mo65502a(C9984u2<AudioData> u2Var, float f) {
        C9915q1 j = u2Var.mo65540j();
        if (j == null) {
            mo65501a(u2Var);
        } else if ("midroll".equals(u2Var.mo65538h())) {
            j.mo65261c(true);
            j.mo65249b(f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(j);
            C9672e0.m27882a("using doAfter service for point: " + f);
            mo65506a((ArrayList<C9915q1>) arrayList, u2Var, f);
        } else {
            mo65500a(j, u2Var);
        }
    }

    /* renamed from: a */
    public final void m29405b(C9984u2<AudioData> u2Var, C9945s2 s2Var, String str) {
        if (s2Var == null) {
            if (str != null) {
                C9672e0.m27882a("loading doAfter service failed: " + str);
            }
            if (u2Var == this.f24754g) {
                mo65502a(u2Var, this.f24760m);
                return;
            }
            return;
        }
        C9984u2<AudioData> a = s2Var.mo65355a(u2Var.mo65538h());
        if (a != null) {
            u2Var.mo65531a(a);
        }
        if (u2Var == this.f24754g) {
            this.f24758k = u2Var.mo65534d();
            mo65516f();
        }
    }

    /* renamed from: a */
    public final void m29403a(C9984u2<AudioData> u2Var, C9945s2 s2Var, String str, float f) {
        if (s2Var == null) {
            if (str != null) {
                C9672e0.m27882a("loading midpoint services failed: " + str);
            }
            if (u2Var == this.f24754g && f == this.f24760m) {
                mo65502a(u2Var, f);
                return;
            }
            return;
        }
        C9984u2<AudioData> a = s2Var.mo65355a(u2Var.mo65538h());
        if (a != null) {
            u2Var.mo65531a(a);
        }
        if (u2Var == this.f24754g && f == this.f24760m) {
            mo65511b(u2Var, f);
        }
    }

    /* renamed from: a */
    public void mo65505a(String str) {
        mo65520j();
        C9984u2<AudioData> a = this.f24749b.mo65355a(str);
        this.f24754g = a;
        if (a != null) {
            this.f24752e.mo64204a(a.mo65535e());
            this.f24763p = this.f24754g.mo65536f();
            this.f24762o = -1;
            this.f24758k = this.f24754g.mo65534d();
            mo65516f();
            return;
        }
        C9672e0.m27882a("no section with name " + str);
    }

    /* renamed from: a */
    public final void mo65506a(ArrayList<C9915q1> arrayList, C9984u2<AudioData> u2Var, float f) {
        Context d = this.f24752e.mo64212d();
        if (d == null) {
            C9672e0.m27882a("can't load midpoint services: context is null");
            return;
        }
        C9672e0.m27882a("loading midpoint services for point: " + f);
        C9741i.m28172a((List<C9915q1>) arrayList, this.f24750c, this.f24751d, this.f24761n).mo63560a(new C9741i.C9744c(u2Var, f) {
            public final /* synthetic */ C9984u2 f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                C9980u0.this.m29403a(this.f$1, this.f$2, (C9945s2) q2Var, str);
            }
        }).mo63567b(this.f24751d.mo64679a(), d);
    }

    /* renamed from: a */
    public void mo65507a(float[] fArr) {
        this.f24759l = fArr;
    }

    /* renamed from: b */
    public InstreamAudioAd.InstreamAudioAdBanner mo65508b() {
        return this.f24756i;
    }

    /* renamed from: b */
    public void mo65509b(float f) {
        mo65520j();
        float[] fArr = this.f24759l;
        int length = fArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Float.compare(fArr[i], f) == 0) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C9984u2<AudioData> a = this.f24749b.mo65355a("midroll");
            this.f24754g = a;
            if (a != null) {
                this.f24752e.mo64204a(a.mo65535e());
                this.f24763p = this.f24754g.mo65536f();
                this.f24762o = -1;
                this.f24760m = f;
                mo65511b(this.f24754g, f);
                return;
            }
            return;
        }
        C9672e0.m27882a("attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    /* renamed from: b */
    public void mo65510b(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context d = this.f24752e.mo64212d();
        if (d == null) {
            C9672e0.m27882a("can't handle click: context is null");
            return;
        }
        C9600a2 a = mo65493a(instreamAdCompanionBanner);
        if (a == null) {
            C9672e0.m27882a("can't handle click: companion banner not found");
        } else {
            this.f24753f.mo64119a(a, d);
        }
    }

    /* renamed from: b */
    public final void mo65511b(C9984u2<AudioData> u2Var, float f) {
        ArrayList arrayList = new ArrayList();
        for (C9711g2 next : u2Var.mo65534d()) {
            if (next.getPoint() == f) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size <= 0 || this.f24762o >= size - 1) {
            ArrayList<C9915q1> a = u2Var.mo65526a(f);
            if (a.size() > 0) {
                mo65506a(a, u2Var, f);
                return;
            }
            C9672e0.m27882a("There is no one midpoint service for point: " + f);
            mo65502a(u2Var, f);
            return;
        }
        this.f24758k = arrayList;
        mo65516f();
    }

    /* renamed from: c */
    public InstreamAudioAdPlayer mo65512c() {
        return this.f24752e.mo64213e();
    }

    /* renamed from: c */
    public void mo65513c(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context d = this.f24752e.mo64212d();
        if (d == null) {
            C9672e0.m27882a("can't handle show: context is null");
            return;
        }
        C9600a2 a = mo65493a(instreamAdCompanionBanner);
        if (a == null) {
            C9672e0.m27882a("can't handle show: companion banner not found");
        } else {
            C10039x8.m29720c((List<C9626b3>) a.getStatHolder().mo63675a("playbackStarted"), d);
        }
    }

    /* renamed from: d */
    public float mo65514d() {
        return this.f24752e.mo64214f();
    }

    /* renamed from: e */
    public void mo65515e() {
        if (this.f24754g != null) {
            this.f24752e.mo64216i();
        }
    }

    /* renamed from: f */
    public final void mo65516f() {
        List<C9711g2<AudioData>> list;
        C9984u2<AudioData> u2Var = this.f24754g;
        if (u2Var != null) {
            if (this.f24763p == 0 || (list = this.f24758k) == null) {
                mo65502a(u2Var, this.f24760m);
                return;
            }
            int i = this.f24762o + 1;
            if (i < list.size()) {
                this.f24762o = i;
                C9711g2<AudioData> g2Var = this.f24758k.get(i);
                if ("statistics".equals(g2Var.getType())) {
                    mo65497a((C9711g2) g2Var, "playbackStarted");
                    mo65516f();
                    return;
                }
                int i2 = this.f24763p;
                if (i2 > 0) {
                    this.f24763p = i2 - 1;
                }
                this.f24755h = g2Var;
                this.f24756i = InstreamAudioAd.InstreamAudioAdBanner.newBanner(g2Var);
                this.f24757j = new ArrayList(this.f24756i.companionBanners);
                this.f24752e.mo64205a(g2Var);
                return;
            }
            mo65502a(this.f24754g, this.f24760m);
        }
    }

    /* renamed from: g */
    public void mo65517g() {
        if (this.f24754g != null) {
            this.f24752e.mo64217j();
        }
    }

    /* renamed from: h */
    public void mo65518h() {
        mo65497a((C9711g2) this.f24755h, "closedByUser");
        mo65520j();
    }

    /* renamed from: i */
    public void mo65519i() {
        mo65497a((C9711g2) this.f24755h, "closedByUser");
        this.f24752e.mo64218k();
        mo65516f();
    }

    /* renamed from: j */
    public void mo65520j() {
        if (this.f24754g != null) {
            this.f24752e.mo64218k();
            mo65501a(this.f24754g);
        }
    }
}
