package com.p374my.target;

import android.app.Activity;
import com.p374my.target.C9618b0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9942s0;
import com.p374my.target.ads.MyTargetView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.k1 */
public class C9791k1 {

    /* renamed from: a */
    public final MyTargetView f24157a;

    /* renamed from: b */
    public final C9596a f24158b;

    /* renamed from: c */
    public final C9793b f24159c;

    /* renamed from: d */
    public final C9794c f24160d;

    /* renamed from: e */
    public final C9822l3.C9823a f24161e;

    /* renamed from: f */
    public C9942s0 f24162f;

    /* renamed from: g */
    public boolean f24163g = true;

    /* renamed from: h */
    public boolean f24164h;

    /* renamed from: i */
    public int f24165i = -1;

    /* renamed from: j */
    public long f24166j;

    /* renamed from: k */
    public long f24167k;

    /* renamed from: com.my.target.k1$a */
    public static class C9792a implements C9942s0.C9943a {

        /* renamed from: a */
        public final C9791k1 f24168a;

        public C9792a(C9791k1 k1Var) {
            this.f24168a = k1Var;
        }

        /* renamed from: a */
        public void mo64510a() {
            this.f24168a.mo64498e();
        }

        /* renamed from: b */
        public void mo64511b() {
            this.f24168a.mo64500g();
        }

        /* renamed from: c */
        public void mo64512c() {
            this.f24168a.mo64499f();
        }

        /* renamed from: d */
        public void mo64513d() {
            this.f24168a.mo64502i();
        }

        public void onClick() {
            this.f24168a.mo64497d();
        }

        public void onLoad() {
            this.f24168a.mo64501h();
        }

        public void onNoAd(String str) {
            this.f24168a.mo64491a(str);
        }
    }

    /* renamed from: com.my.target.k1$b */
    public static class C9793b {

        /* renamed from: a */
        public boolean f24169a;

        /* renamed from: b */
        public boolean f24170b;

        /* renamed from: c */
        public boolean f24171c;

        /* renamed from: d */
        public boolean f24172d;

        /* renamed from: e */
        public boolean f24173e;

        /* renamed from: f */
        public boolean f24174f;

        /* renamed from: g */
        public boolean f24175g;

        /* renamed from: a */
        public void mo64517a(boolean z) {
            this.f24172d = z;
        }

        /* renamed from: a */
        public boolean mo64518a() {
            return !this.f24170b && this.f24169a && (this.f24175g || !this.f24173e);
        }

        /* renamed from: b */
        public void mo64519b(boolean z) {
            this.f24174f = z;
        }

        /* renamed from: b */
        public boolean mo64520b() {
            return this.f24171c && this.f24169a && (this.f24175g || this.f24173e) && !this.f24174f && this.f24170b;
        }

        /* renamed from: c */
        public void mo64521c(boolean z) {
            this.f24175g = z;
        }

        /* renamed from: c */
        public boolean mo64522c() {
            return this.f24172d && this.f24171c && (this.f24175g || this.f24173e) && !this.f24169a;
        }

        /* renamed from: d */
        public void mo64523d(boolean z) {
            this.f24173e = z;
        }

        /* renamed from: d */
        public boolean mo64524d() {
            return this.f24169a;
        }

        /* renamed from: e */
        public void mo64525e(boolean z) {
            this.f24171c = z;
        }

        /* renamed from: e */
        public boolean mo64526e() {
            return this.f24170b;
        }

        /* renamed from: f */
        public void mo64527f() {
            this.f24174f = false;
            this.f24171c = false;
        }

        /* renamed from: f */
        public void mo64528f(boolean z) {
            this.f24170b = z;
        }

        /* renamed from: g */
        public void mo64529g(boolean z) {
            this.f24169a = z;
            this.f24170b = false;
        }
    }

    /* renamed from: com.my.target.k1$c */
    public static class C9794c implements Runnable {

        /* renamed from: a */
        public final WeakReference<C9791k1> f24176a;

        public C9794c(C9791k1 k1Var) {
            this.f24176a = new WeakReference<>(k1Var);
        }

        public void run() {
            C9791k1 k1Var = (C9791k1) this.f24176a.get();
            if (k1Var != null) {
                k1Var.mo64504k();
            }
        }
    }

    public C9791k1(MyTargetView myTargetView, C9596a aVar, C9822l3.C9823a aVar2) {
        C9793b bVar = new C9793b();
        this.f24159c = bVar;
        this.f24157a = myTargetView;
        this.f24158b = aVar;
        this.f24161e = aVar2;
        this.f24160d = new C9794c(this);
        if (!(myTargetView.getContext() instanceof Activity)) {
            C9672e0.m27882a("MyTargetView was created with non-activity focus, so system cannot automatically handle lifecycle");
            bVar.mo64521c(true);
            return;
        }
        bVar.mo64521c(false);
    }

    /* renamed from: a */
    public static C9791k1 m28422a(MyTargetView myTargetView, C9596a aVar, C9822l3.C9823a aVar2) {
        return new C9791k1(myTargetView, aVar, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28424a(C10029x2 x2Var, String str) {
        if (x2Var != null) {
            mo64494b(x2Var);
            return;
        }
        C9672e0.m27882a("No new ad");
        mo64507n();
    }

    /* renamed from: a */
    public void mo64488a() {
        if (this.f24159c.mo64524d()) {
            mo64509p();
        }
        this.f24159c.mo64527f();
        mo64505l();
    }

    /* renamed from: a */
    public void mo64489a(MyTargetView.AdSize adSize) {
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63921a(adSize);
        }
    }

    /* renamed from: a */
    public final void mo64490a(C10029x2 x2Var) {
        boolean z = true;
        this.f24164h = x2Var.mo65700d() && this.f24158b.isRefreshAd() && !this.f24158b.getFormat().equals("standard_300x250");
        C9821l2 c = x2Var.mo65699c();
        if (c == null) {
            C9839m2 b = x2Var.mo65294b();
            if (b == null) {
                MyTargetView.MyTargetViewListener listener = this.f24157a.getListener();
                if (listener != null) {
                    listener.onNoAd("no ad", this.f24157a);
                    return;
                }
                return;
            }
            this.f24162f = C9673e1.m27885a(this.f24157a, b, this.f24158b, this.f24161e);
            if (this.f24164h) {
                int a = b.mo64721a() * 1000;
                this.f24165i = a;
                if (a <= 0) {
                    z = false;
                }
                this.f24164h = z;
                return;
            }
            return;
        }
        this.f24162f = C9771j1.m28360a(this.f24157a, c, this.f24161e);
        this.f24165i = c.getTimeout() * 1000;
    }

    /* renamed from: a */
    public void mo64491a(String str) {
        if (this.f24163g) {
            this.f24159c.mo64525e(false);
            MyTargetView.MyTargetViewListener listener = this.f24157a.getListener();
            if (listener != null) {
                listener.onNoAd(str, this.f24157a);
            }
            this.f24163g = false;
            return;
        }
        mo64505l();
        mo64507n();
    }

    /* renamed from: a */
    public void mo64492a(boolean z) {
        this.f24159c.mo64517a(z);
        this.f24159c.mo64523d(this.f24157a.hasWindowFocus());
        if (this.f24159c.mo64522c()) {
            mo64508o();
        } else if (!z && this.f24159c.mo64524d()) {
            mo64509p();
        }
    }

    /* renamed from: b */
    public String mo64493b() {
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            return s0Var.mo64450c();
        }
        return null;
    }

    /* renamed from: b */
    public void mo64494b(C10029x2 x2Var) {
        if (this.f24159c.mo64524d()) {
            mo64509p();
        }
        mo64505l();
        mo64490a(x2Var);
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63923a((C9942s0.C9943a) new C9792a(this));
            this.f24166j = System.currentTimeMillis() + ((long) this.f24165i);
            this.f24167k = 0;
            if (this.f24164h && this.f24159c.mo64526e()) {
                this.f24167k = (long) this.f24165i;
            }
            this.f24162f.mo63928i();
        }
    }

    /* renamed from: b */
    public void mo64495b(boolean z) {
        this.f24159c.mo64523d(z);
        if (this.f24159c.mo64522c()) {
            mo64508o();
        } else if (this.f24159c.mo64520b()) {
            mo64506m();
        } else if (this.f24159c.mo64518a()) {
            mo64503j();
        }
    }

    /* renamed from: c */
    public float mo64496c() {
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            return s0Var.mo64451d();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void mo64497d() {
        MyTargetView.MyTargetViewListener listener = this.f24157a.getListener();
        if (listener != null) {
            listener.onClick(this.f24157a);
        }
    }

    /* renamed from: e */
    public void mo64498e() {
        this.f24159c.mo64519b(false);
        if (this.f24159c.mo64520b()) {
            mo64506m();
        }
    }

    /* renamed from: f */
    public void mo64499f() {
        mo64505l();
    }

    /* renamed from: g */
    public void mo64500g() {
        if (this.f24159c.mo64518a()) {
            mo64503j();
        }
        this.f24159c.mo64519b(true);
    }

    /* renamed from: h */
    public void mo64501h() {
        if (this.f24163g) {
            this.f24159c.mo64525e(true);
            MyTargetView.MyTargetViewListener listener = this.f24157a.getListener();
            if (listener != null) {
                listener.onLoad(this.f24157a);
            }
            this.f24163g = false;
        }
        if (this.f24159c.mo64522c()) {
            mo64508o();
        }
    }

    /* renamed from: i */
    public final void mo64502i() {
        MyTargetView.MyTargetViewListener listener = this.f24157a.getListener();
        if (listener != null) {
            listener.onShow(this.f24157a);
        }
    }

    /* renamed from: j */
    public void mo64503j() {
        this.f24157a.removeCallbacks(this.f24160d);
        if (this.f24164h) {
            this.f24167k = this.f24166j - System.currentTimeMillis();
        }
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63924b();
        }
        this.f24159c.mo64528f(true);
    }

    /* renamed from: k */
    public void mo64504k() {
        C9672e0.m27882a("load new standard ad");
        C9618b0.m27645a(this.f24158b, this.f24161e).mo63560a(new C9618b0.C9620b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                C9791k1.this.m28424a((C10029x2) q2Var, str);
            }
        }).mo63567b(this.f24161e.mo64679a(), this.f24157a.getContext());
    }

    /* renamed from: l */
    public void mo64505l() {
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.destroy();
            this.f24162f.mo63923a((C9942s0.C9943a) null);
            this.f24162f = null;
        }
        this.f24157a.removeAllViews();
    }

    /* renamed from: m */
    public void mo64506m() {
        if (this.f24167k > 0 && this.f24164h) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f24167k;
            this.f24166j = currentTimeMillis + j;
            this.f24157a.postDelayed(this.f24160d, j);
            this.f24167k = 0;
        }
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63919a();
        }
        this.f24159c.mo64528f(false);
    }

    /* renamed from: n */
    public void mo64507n() {
        if (this.f24164h && this.f24165i > 0) {
            this.f24157a.removeCallbacks(this.f24160d);
            this.f24157a.postDelayed(this.f24160d, (long) this.f24165i);
        }
    }

    /* renamed from: o */
    public void mo64508o() {
        int i = this.f24165i;
        if (i > 0 && this.f24164h) {
            this.f24157a.postDelayed(this.f24160d, (long) i);
        }
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63927f();
        }
        this.f24159c.mo64529g(true);
    }

    /* renamed from: p */
    public void mo64509p() {
        this.f24159c.mo64529g(false);
        this.f24157a.removeCallbacks(this.f24160d);
        C9942s0 s0Var = this.f24162f;
        if (s0Var != null) {
            s0Var.mo63926e();
        }
    }
}
