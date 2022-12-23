package com.p374my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p374my.target.C9606a7;
import com.p374my.target.C9707g0;
import com.p374my.target.C9894p1;
import com.p374my.target.C9903p4;
import java.util.List;

/* renamed from: com.my.target.t4 */
public final class C9965t4 implements C9903p4 {

    /* renamed from: a */
    public final C9697f2 f24667a;

    /* renamed from: b */
    public final C9970e f24668b;

    /* renamed from: c */
    public final C9606a7 f24669c;

    /* renamed from: d */
    public final Handler f24670d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final C9968c f24671e;

    /* renamed from: f */
    public C9730h0 f24672f;

    /* renamed from: g */
    public C10079z6 f24673g;

    /* renamed from: h */
    public C9784j7 f24674h;

    /* renamed from: i */
    public C9779j4 f24675i;

    /* renamed from: j */
    public C9841m4 f24676j;

    /* renamed from: k */
    public long f24677k;

    /* renamed from: l */
    public long f24678l;

    /* renamed from: com.my.target.t4$a */
    public static class C9966a implements View.OnClickListener {

        /* renamed from: a */
        public final C9965t4 f24679a;

        public C9966a(C9965t4 t4Var) {
            this.f24679a = t4Var;
        }

        public void onClick(View view) {
            C9841m4 f = this.f24679a.mo65457f();
            if (f != null) {
                f.mo64738d();
            }
            this.f24679a.mo65458g().mo65208a();
        }
    }

    /* renamed from: com.my.target.t4$b */
    public interface C9967b {
        /* renamed from: c */
        void mo63359c();
    }

    /* renamed from: com.my.target.t4$c */
    public interface C9968c extends C9903p4.C9904a {
        /* renamed from: a */
        void mo65460a(Context context);
    }

    /* renamed from: com.my.target.t4$d */
    public static class C9969d implements C9606a7.C9607a {

        /* renamed from: a */
        public final C9965t4 f24680a;

        public C9969d(C9965t4 t4Var) {
            this.f24680a = t4Var;
        }

        /* renamed from: a */
        public final void mo65461a() {
            Context context = this.f24680a.mo64595j().getContext();
            C9894p1 adChoices = this.f24680a.mo65456d().getAdChoices();
            if (adChoices != null) {
                C9730h0 a = this.f24680a.f24672f;
                if (a != null && a.mo64142c()) {
                    return;
                }
                if (a == null) {
                    C9832l8.m28605a(adChoices.mo65193b(), context);
                } else {
                    a.mo64136a(context);
                }
            }
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            C9841m4 f = this.f24680a.mo65457f();
            if (f != null) {
                f.mo64729a();
            }
            this.f24680a.mo65458g().mo65209a((C10066z1) this.f24680a.mo65456d(), context);
        }

        /* renamed from: d */
        public void mo63484d() {
            mo65461a();
        }

        /* renamed from: e */
        public void mo63485e() {
            this.f24680a.mo65458g().mo65211a(this.f24680a.mo65456d(), (String) null, this.f24680a.mo64595j().getContext());
        }
    }

    /* renamed from: com.my.target.t4$e */
    public static class C9970e implements Runnable {

        /* renamed from: a */
        public final C9606a7 f24681a;

        public C9970e(C9606a7 a7Var) {
            this.f24681a = a7Var;
        }

        public void run() {
            C9672e0.m27882a("banner became just closeable");
            this.f24681a.mo63478d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.my.target.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.my.target.j7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.my.target.z6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.my.target.z6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9965t4(com.p374my.target.C9850m7 r7, com.p374my.target.C9697f2 r8, com.p374my.target.C9965t4.C9968c r9, android.content.Context r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.f24667a = r8
            r6.f24671e = r9
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r6.f24670d = r0
            com.my.target.t4$d r0 = new com.my.target.t4$d
            r0.<init>(r6)
            com.my.target.g2 r1 = r8.getVideoBanner()
            java.util.List r2 = r8.getInterstitialAdCards()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002e
            com.my.target.j7 r2 = r7.mo64767a()
            r6.f24674h = r2
        L_0x002b:
            r6.f24669c = r2
            goto L_0x0043
        L_0x002e:
            if (r1 == 0) goto L_0x003c
            int r2 = r8.getStyle()
            r3 = 1
            if (r2 != r3) goto L_0x003c
            com.my.target.z6 r2 = r7.mo64772c()
            goto L_0x0040
        L_0x003c:
            com.my.target.z6 r2 = r7.mo64771b()
        L_0x0040:
            r6.f24673g = r2
            goto L_0x002b
        L_0x0043:
            com.my.target.t4$e r2 = new com.my.target.t4$e
            com.my.target.a7 r3 = r6.f24669c
            r2.<init>(r3)
            r6.f24668b = r2
            com.my.target.a7 r2 = r6.f24669c
            r2.setInterstitialPromoViewListener(r0)
            com.my.target.a7 r2 = r6.f24669c
            android.view.View r2 = r2.getCloseButton()
            com.my.target.t4$a r3 = new com.my.target.t4$a
            r3.<init>(r6)
            r2.setOnClickListener(r3)
            com.my.target.z6 r2 = r6.f24673g
            r3 = 0
            if (r2 == 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
            com.my.target.-$$Lambda$plDRtsAvR3ScsvrqWiUeo_ZAtmA r5 = new com.my.target.-$$Lambda$plDRtsAvR3ScsvrqWiUeo_ZAtmA
            r5.<init>()
            com.my.target.m4 r7 = com.p374my.target.C9841m4.m28666a(r7, r1, r2, r9, r5)
            r6.f24676j = r7
            r7.mo64734a((com.p374my.target.C9711g2<com.p374my.target.common.models.VideoData>) r1, (android.content.Context) r10)
            boolean r7 = r1.isAutoPlay()
            if (r7 == 0) goto L_0x007d
            r6.f24678l = r3
        L_0x007d:
            com.my.target.a7 r7 = r6.f24669c
            r7.setBanner(r8)
            com.my.target.a7 r7 = r6.f24669c
            com.my.target.r1 r10 = r8.getClickArea()
            r7.setClickArea(r10)
            if (r1 == 0) goto L_0x0093
            boolean r7 = r1.isAutoPlay()
            if (r7 != 0) goto L_0x00cc
        L_0x0093:
            float r7 = r8.getAllowCloseDelay()
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r10
            long r1 = (long) r7
            r6.f24677k = r1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "banner will be allowed to close in "
            r7.append(r10)
            long r1 = r6.f24677k
            r7.append(r1)
            java.lang.String r10 = " millis"
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.p374my.target.C9672e0.m27882a(r7)
            long r1 = r6.f24677k
            r6.mo65453a((long) r1)
            goto L_0x00cc
        L_0x00c2:
            java.lang.String r7 = "banner is allowed to close"
            com.p374my.target.C9672e0.m27882a(r7)
            com.my.target.a7 r7 = r6.f24669c
            r7.mo63478d()
        L_0x00cc:
            java.util.List r7 = r8.getInterstitialAdCards()
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L_0x00e0
            com.my.target.j7 r10 = r6.f24674h
            if (r10 == 0) goto L_0x00e0
            com.my.target.j4 r7 = com.p374my.target.C9779j4.m28398a(r7, r10)
            r6.f24675i = r7
        L_0x00e0:
            com.my.target.j4 r7 = r6.f24675i
            if (r7 == 0) goto L_0x00e7
            r7.mo64469a((com.p374my.target.C9965t4.C9968c) r9)
        L_0x00e7:
            com.my.target.p1 r7 = r8.getAdChoices()
            if (r7 == 0) goto L_0x00f0
            r6.mo65454a(r0, r7)
        L_0x00f0:
            com.my.target.a7 r7 = r6.f24669c
            android.view.View r7 = r7.getView()
            r9.mo65210a((com.p374my.target.C10066z1) r8, (android.view.View) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9965t4.<init>(com.my.target.m7, com.my.target.f2, com.my.target.t4$c, android.content.Context):void");
    }

    /* renamed from: a */
    public static C9965t4 m29336a(C9850m7 m7Var, C9697f2 f2Var, C9968c cVar, Context context) {
        return new C9965t4(m7Var, f2Var, cVar, context);
    }

    /* renamed from: a */
    public void mo64581a() {
        if (this.f24676j == null) {
            long j = this.f24677k;
            if (j > 0) {
                mo65453a(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo65453a(long j) {
        this.f24670d.removeCallbacks(this.f24668b);
        this.f24678l = System.currentTimeMillis();
        this.f24670d.postDelayed(this.f24668b, j);
    }

    /* renamed from: a */
    public final void mo65454a(C9606a7.C9607a aVar, C9894p1 p1Var) {
        List<C9894p1.C9895a> a = p1Var.mo65191a();
        if (a != null) {
            C9730h0 a2 = C9730h0.m28115a(a);
            this.f24672f = a2;
            a2.mo64137a((C9707g0.C9709b) aVar);
        }
    }

    /* renamed from: b */
    public void mo64587b() {
        C9841m4 m4Var = this.f24676j;
        if (m4Var != null) {
            m4Var.mo64739e();
        }
        this.f24670d.removeCallbacks(this.f24668b);
        if (this.f24678l > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f24678l;
            if (currentTimeMillis > 0) {
                long j = this.f24677k;
                if (currentTimeMillis < j) {
                    this.f24677k = j - currentTimeMillis;
                    return;
                }
            }
            this.f24677k = 0;
        }
    }

    /* renamed from: c */
    public void mo65455c() {
        C9841m4 m4Var = this.f24676j;
        if (m4Var != null) {
            m4Var.mo64733a(this.f24667a);
            this.f24676j.mo64729a();
            this.f24676j = null;
        }
    }

    /* renamed from: d */
    public C9697f2 mo65456d() {
        return this.f24667a;
    }

    public void destroy() {
        this.f24670d.removeCallbacks(this.f24668b);
        C9841m4 m4Var = this.f24676j;
        if (m4Var != null) {
            m4Var.mo64729a();
        }
    }

    /* renamed from: e */
    public void mo64593e() {
        C9841m4 m4Var = this.f24676j;
        if (m4Var != null) {
            m4Var.mo64741g();
        }
    }

    /* renamed from: f */
    public C9841m4 mo65457f() {
        return this.f24676j;
    }

    /* renamed from: g */
    public C9968c mo65458g() {
        return this.f24671e;
    }

    public View getCloseButton() {
        return this.f24669c.getCloseButton();
    }

    /* renamed from: j */
    public View mo64595j() {
        return this.f24669c.getView();
    }
}
