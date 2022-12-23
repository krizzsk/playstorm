package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9689f;
import com.p374my.target.C9766j0;
import com.p374my.target.C9822l3;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.instreamads.InstreamAd;
import com.p374my.target.instreamads.InstreamAdPlayer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.t0 */
public class C9959t0 {

    /* renamed from: a */
    public final InstreamAd f24643a;

    /* renamed from: b */
    public final C9930r2 f24644b;

    /* renamed from: c */
    public final C9596a f24645c;

    /* renamed from: d */
    public final C9766j0 f24646d;

    /* renamed from: e */
    public final C9722g8 f24647e;

    /* renamed from: f */
    public final C9822l3.C9823a f24648f;

    /* renamed from: g */
    public C9984u2<VideoData> f24649g;

    /* renamed from: h */
    public C9711g2<VideoData> f24650h;

    /* renamed from: i */
    public InstreamAd.InstreamAdBanner f24651i;

    /* renamed from: j */
    public List<C9711g2<VideoData>> f24652j;

    /* renamed from: k */
    public float[] f24653k = new float[0];

    /* renamed from: l */
    public float f24654l;

    /* renamed from: m */
    public int f24655m;

    /* renamed from: n */
    public int f24656n;

    /* renamed from: o */
    public int f24657o;

    /* renamed from: com.my.target.t0$b */
    public class C9961b implements C9766j0.C9770d {
        public C9961b() {
        }

        /* renamed from: a */
        public void mo64436a(float f, float f2, C9711g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null && (listener = C9959t0.this.f24643a.getListener()) != null) {
                listener.onBannerTimeLeftChange(f, f2, C9959t0.this.f24643a);
            }
        }

        /* renamed from: a */
        public void mo64437a(C9711g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null && (listener = C9959t0.this.f24643a.getListener()) != null) {
                listener.onBannerComplete(C9959t0.this.f24643a, C9959t0.this.f24651i);
            }
        }

        /* renamed from: a */
        public void mo64438a(String str, C9711g2 g2Var) {
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var) {
                InstreamAd.InstreamAdListener listener = C9959t0.this.f24643a.getListener();
                if (listener != null) {
                    listener.onError(str, C9959t0.this.f24643a);
                }
                C9959t0.this.mo65439f();
            }
        }

        /* renamed from: b */
        public void mo64439b(C9711g2 g2Var) {
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null) {
                InstreamAd.InstreamAdListener listener = C9959t0.this.f24643a.getListener();
                if (listener != null) {
                    listener.onBannerComplete(C9959t0.this.f24643a, C9959t0.this.f24651i);
                }
                C9959t0.this.mo65439f();
            }
        }

        /* renamed from: c */
        public void mo64440c(C9711g2 g2Var) {
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null) {
                InstreamAd.InstreamAdListener listener = C9959t0.this.f24643a.getListener();
                C9672e0.m27882a("Ad shown, banner Id = " + g2Var.getId());
                if (listener != null) {
                    listener.onBannerStart(C9959t0.this.f24643a, C9959t0.this.f24651i);
                }
            }
        }

        /* renamed from: d */
        public void mo64441d(C9711g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null && (listener = C9959t0.this.f24643a.getListener()) != null) {
                listener.onBannerResume(C9959t0.this.f24643a, C9959t0.this.f24651i);
            }
        }

        /* renamed from: e */
        public void mo64442e(C9711g2 g2Var) {
            InstreamAd.InstreamAdListener listener;
            if (C9959t0.this.f24649g != null && C9959t0.this.f24650h == g2Var && C9959t0.this.f24651i != null && (listener = C9959t0.this.f24643a.getListener()) != null) {
                listener.onBannerPause(C9959t0.this.f24643a, C9959t0.this.f24651i);
            }
        }
    }

    public C9959t0(InstreamAd instreamAd, C9930r2 r2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        this.f24643a = instreamAd;
        this.f24644b = r2Var;
        this.f24645c = aVar;
        this.f24648f = aVar2;
        C9766j0 j = C9766j0.m28331j();
        this.f24646d = j;
        j.mo64420a((C9766j0.C9770d) new C9961b());
        this.f24647e = C9722g8.m28089a();
    }

    /* renamed from: a */
    public static C9959t0 m29280a(InstreamAd instreamAd, C9930r2 r2Var, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9959t0(instreamAd, r2Var, aVar, aVar2);
    }

    /* renamed from: a */
    public void mo65418a() {
        this.f24646d.mo64426d();
    }

    /* renamed from: a */
    public void mo65419a(float f) {
        this.f24646d.mo64425c(f);
    }

    /* renamed from: a */
    public void mo65420a(int i) {
        this.f24655m = i;
    }

    /* renamed from: a */
    public final void mo65421a(C9711g2 g2Var, String str) {
        if (g2Var == null) {
            C9672e0.m27882a("can't send stat: banner is null");
            return;
        }
        Context e = this.f24646d.mo64427e();
        if (e == null) {
            C9672e0.m27882a("can't send stat: context is null");
        } else {
            C10039x8.m29720c((List<C9626b3>) g2Var.getStatHolder().mo63675a(str), e);
        }
    }

    /* renamed from: a */
    public void mo65422a(InstreamAdPlayer instreamAdPlayer) {
        this.f24646d.mo64419a(instreamAdPlayer);
    }

    /* renamed from: a */
    public final void mo65423a(C9915q1 q1Var, C9984u2<VideoData> u2Var) {
        Context e = this.f24646d.mo64427e();
        if (e == null) {
            C9672e0.m27882a("can't load doAfter service: context is null");
            return;
        }
        C9672e0.m27882a("loading doAfter service: " + q1Var.f24532b);
        C9689f.m27968a(q1Var, this.f24645c, this.f24648f, this.f24655m).mo63560a(new C9689f.C9692c(u2Var) {
            public final /* synthetic */ C9984u2 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                C9959t0.this.m29284b(this.f$1, (C9930r2) q2Var, str);
            }
        }).mo63567b(this.f24648f.mo64679a(), e);
    }

    /* renamed from: a */
    public final void mo65424a(C9984u2 u2Var) {
        if (u2Var == this.f24649g) {
            if ("midroll".equals(u2Var.mo65538h())) {
                this.f24649g.mo65532b(this.f24657o);
            }
            this.f24649g = null;
            this.f24650h = null;
            this.f24651i = null;
            this.f24656n = -1;
            InstreamAd.InstreamAdListener listener = this.f24643a.getListener();
            if (listener != null) {
                listener.onComplete(u2Var.mo65538h(), this.f24643a);
            }
        }
    }

    /* renamed from: a */
    public final void mo65425a(C9984u2<VideoData> u2Var, float f) {
        C9915q1 j = u2Var.mo65540j();
        if (j == null) {
            mo65424a((C9984u2) u2Var);
        } else if ("midroll".equals(u2Var.mo65538h())) {
            j.mo65261c(true);
            j.mo65249b(f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(j);
            C9672e0.m27882a("using doAfter service for point: " + f);
            mo65429a((ArrayList<C9915q1>) arrayList, u2Var, f);
        } else {
            mo65423a(j, u2Var);
        }
    }

    /* renamed from: a */
    public final void m29284b(C9984u2<VideoData> u2Var, C9930r2 r2Var, String str) {
        if (r2Var == null) {
            if (str != null) {
                C9672e0.m27882a("loading doAfter service failed: " + str);
            }
            if (u2Var == this.f24649g) {
                mo65425a(u2Var, this.f24654l);
                return;
            }
            return;
        }
        C9984u2<VideoData> a = r2Var.mo65321a(u2Var.mo65538h());
        if (a != null) {
            u2Var.mo65531a(a);
        }
        if (u2Var == this.f24649g) {
            this.f24652j = u2Var.mo65534d();
            mo65439f();
        }
    }

    /* renamed from: a */
    public final void m29282a(C9984u2<VideoData> u2Var, C9930r2 r2Var, String str, float f) {
        if (r2Var == null) {
            if (str != null) {
                C9672e0.m27882a("loading midpoint services failed: " + str);
            }
            if (u2Var == this.f24649g && f == this.f24654l) {
                mo65425a(u2Var, f);
                return;
            }
            return;
        }
        C9984u2<VideoData> a = r2Var.mo65321a(u2Var.mo65538h());
        if (a != null) {
            u2Var.mo65531a(a);
        }
        if (u2Var == this.f24649g && f == this.f24654l) {
            mo65435b(u2Var, f);
        }
    }

    /* renamed from: a */
    public void mo65428a(String str) {
        mo65443j();
        C9984u2<VideoData> a = this.f24644b.mo65321a(str);
        this.f24649g = a;
        if (a != null) {
            this.f24646d.mo64417a(a.mo65535e());
            this.f24657o = this.f24649g.mo65536f();
            this.f24656n = -1;
            this.f24652j = this.f24649g.mo65534d();
            mo65439f();
            return;
        }
        C9672e0.m27882a("no section with name " + str);
    }

    /* renamed from: a */
    public final void mo65429a(ArrayList<C9915q1> arrayList, C9984u2<VideoData> u2Var, float f) {
        Context e = this.f24646d.mo64427e();
        if (e == null) {
            C9672e0.m27882a("can't load midpoint services: context is null");
            return;
        }
        C9672e0.m27882a("loading midpoint services for point: " + f);
        C9689f.m27969a((List<C9915q1>) arrayList, this.f24645c, this.f24648f, this.f24655m).mo63560a(new C9689f.C9692c(u2Var, f) {
            public final /* synthetic */ C9984u2 f$1;
            public final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                C9959t0.this.m29282a(this.f$1, this.f$2, (C9930r2) q2Var, str);
            }
        }).mo63567b(this.f24648f.mo64679a(), e);
    }

    /* renamed from: a */
    public void mo65430a(boolean z) {
        mo65421a((C9711g2) this.f24650h, z ? "fullscreenOn" : "fullscreenOff");
    }

    /* renamed from: a */
    public void mo65431a(float[] fArr) {
        this.f24653k = fArr;
    }

    /* renamed from: b */
    public InstreamAdPlayer mo65432b() {
        return this.f24646d.mo64428f();
    }

    /* renamed from: b */
    public void mo65433b(float f) {
        mo65443j();
        float[] fArr = this.f24653k;
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
            C9984u2<VideoData> a = this.f24644b.mo65321a("midroll");
            this.f24649g = a;
            if (a != null) {
                this.f24646d.mo64417a(a.mo65535e());
                this.f24657o = this.f24649g.mo65536f();
                this.f24656n = -1;
                this.f24654l = f;
                mo65435b(this.f24649g, f);
                return;
            }
            return;
        }
        C9672e0.m27882a("attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
    }

    /* renamed from: b */
    public void mo65434b(InstreamAdPlayer instreamAdPlayer) {
        this.f24646d.mo64423b(instreamAdPlayer);
    }

    /* renamed from: b */
    public final void mo65435b(C9984u2<VideoData> u2Var, float f) {
        ArrayList arrayList = new ArrayList();
        for (C9711g2 next : u2Var.mo65534d()) {
            if (next.getPoint() == f) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size <= 0 || this.f24656n >= size - 1) {
            ArrayList<C9915q1> a = u2Var.mo65526a(f);
            if (a.size() > 0) {
                mo65429a(a, u2Var, f);
                return;
            }
            C9672e0.m27882a("There is no one midpoint service for point: " + f);
            mo65425a(u2Var, f);
            return;
        }
        this.f24652j = arrayList;
        mo65439f();
    }

    /* renamed from: c */
    public float mo65436c() {
        return this.f24646d.mo64429g();
    }

    /* renamed from: d */
    public void mo65437d() {
        if (this.f24650h == null) {
            C9672e0.m27882a("can't handle click: no playing banner");
            return;
        }
        Context e = this.f24646d.mo64427e();
        if (e == null) {
            C9672e0.m27882a("can't handle click: context is null");
        } else {
            this.f24647e.mo64119a(this.f24650h, e);
        }
    }

    /* renamed from: e */
    public void mo65438e() {
        if (this.f24649g != null) {
            this.f24646d.mo64431k();
        }
    }

    /* renamed from: f */
    public final void mo65439f() {
        List<C9711g2<VideoData>> list;
        C9984u2<VideoData> u2Var = this.f24649g;
        if (u2Var != null) {
            if (this.f24657o == 0 || (list = this.f24652j) == null) {
                mo65425a(u2Var, this.f24654l);
                return;
            }
            int i = this.f24656n + 1;
            if (i < list.size()) {
                this.f24656n = i;
                C9711g2<VideoData> g2Var = this.f24652j.get(i);
                if ("statistics".equals(g2Var.getType())) {
                    mo65421a((C9711g2) g2Var, "playbackStarted");
                    mo65439f();
                    return;
                }
                int i2 = this.f24657o;
                if (i2 > 0) {
                    this.f24657o = i2 - 1;
                }
                this.f24650h = g2Var;
                this.f24651i = InstreamAd.InstreamAdBanner.newBanner(g2Var);
                this.f24646d.mo64418a(g2Var);
                return;
            }
            mo65425a(this.f24649g, this.f24654l);
        }
    }

    /* renamed from: g */
    public void mo65440g() {
        if (this.f24649g != null) {
            this.f24646d.mo64432l();
        }
    }

    /* renamed from: h */
    public void mo65441h() {
        mo65421a((C9711g2) this.f24650h, "closedByUser");
        this.f24646d.mo64434n();
        mo65443j();
    }

    /* renamed from: i */
    public void mo65442i() {
        mo65421a((C9711g2) this.f24650h, "closedByUser");
        this.f24646d.mo64434n();
        this.f24646d.mo64433m();
        mo65439f();
    }

    /* renamed from: j */
    public void mo65443j() {
        if (this.f24649g != null) {
            this.f24646d.mo64433m();
            mo65424a((C9984u2) this.f24649g);
        }
    }
}
