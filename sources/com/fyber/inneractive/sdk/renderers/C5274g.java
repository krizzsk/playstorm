package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.flow.C4421l;
import com.fyber.inneractive.sdk.flow.C4437u;
import com.fyber.inneractive.sdk.interfaces.C4454b;
import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5314b0;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5367q0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5405c;
import com.fyber.inneractive.sdk.web.C5407d;

/* renamed from: com.fyber.inneractive.sdk.renderers.g */
public class C5274g extends C4421l<C4437u, InneractiveAdViewEventsListener> implements C4454b, C5314b0.C5316b {

    /* renamed from: k */
    public long f13984k = 0;

    /* renamed from: l */
    public InneractiveAdViewUnitController f13985l;

    /* renamed from: m */
    public IAmraidWebViewController f13986m;

    /* renamed from: n */
    public C5407d.C5413f f13987n;

    /* renamed from: o */
    public boolean f13988o = false;

    /* renamed from: p */
    public ViewGroup f13989p;

    /* renamed from: q */
    public FrameLayout f13990q;

    /* renamed from: r */
    public long f13991r = 0;

    /* renamed from: s */
    public Runnable f13992s;

    /* renamed from: t */
    public int f13993t = 0;

    /* renamed from: u */
    public long f13994u = 0;

    /* renamed from: v */
    public boolean f13995v = false;

    /* renamed from: w */
    public boolean f13996w = true;

    /* renamed from: x */
    public boolean f13997x = false;

    /* renamed from: y */
    public C5266b f13998y;

    /* renamed from: com.fyber.inneractive.sdk.renderers.g$a */
    public static class C5275a extends FrameLayout {

        /* renamed from: a */
        public final float f13999a;

        public C5275a(Context context, float f) {
            super(context);
            this.f13999a = f;
        }

        public void onMeasure(int i, int i2) {
            int i3;
            View.MeasureSpec.getMode(i);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > 0)) {
                int size = View.MeasureSpec.getSize(i);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                float f = this.f13999a;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * f), 1073741824);
                }
                i3 = makeMeasureSpec;
            } else {
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            super.onMeasure(i3, i2);
        }
    }

    /* renamed from: E */
    public final void mo26332E() {
        if (this.f13992s != null) {
            IAlog.m16699a("%scancelling refreen runnable", IAlog.m16696a((Object) this));
            C5357n.f14225b.removeCallbacks(this.f13992s);
            this.f13992s = null;
        }
    }

    /* renamed from: F */
    public final void mo26333F() {
        C5266b bVar = this.f13998y;
        if (bVar != null) {
            bVar.mo26326c();
        }
        if (this.f13986m != null) {
            mo26332E();
            AdContent adcontent = this.f10921b;
            if (adcontent != null) {
                ((C4437u) adcontent).mo24365a();
            }
            this.f13986m = null;
            this.f10921b = null;
            ViewGroup viewGroup = this.f13989p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f13990q);
            }
        }
        this.f13995v = false;
    }

    /* renamed from: G */
    public final int mo26334G() {
        C4327r rVar;
        int intValue;
        int i = this.f13993t;
        if (i == -1) {
            IAlog.m16699a("%sreturning disable value for banner refresh", IAlog.m16696a((Object) this));
            return 0;
        }
        if (i > 0) {
            IAlog.m16699a("%sreturning overriden refresh interval = %d", IAlog.m16696a((Object) this), Integer.valueOf(this.f13993t));
            intValue = this.f13993t;
        } else {
            C4346z zVar = this.f10920a.getAdContent().f10916d;
            if (!(zVar == null || (rVar = ((C4345y) zVar).f10747c) == null)) {
                Integer num = rVar.f10690a;
                IAlog.m16699a("%sreturning refreshConfig = %d", IAlog.m16696a((Object) this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.m16699a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m16696a((Object) this));
            return 0;
        }
        return intValue * 1000;
    }

    /* renamed from: H */
    public final void mo26335H() {
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController != null && iAmraidWebViewController.f14280b != null) {
            IAlog.m16699a("%srefreshing ad", IAlog.m16696a((Object) this));
            if (!this.f13986m.mo26555h() || this.f13986m.mo26556i()) {
                this.f13991r = 0;
                this.f13985l.refreshAd();
            }
        }
    }

    /* renamed from: I */
    public final void mo26336I() {
        C5405c cVar;
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f14280b) != null && cVar.getIsVisible() && this.f13991r != 0 && !this.f13986m.mo26555h() && !this.f13986m.mo26556i()) {
            if (!this.f13996w) {
                if (this.f13984k < System.currentTimeMillis() - this.f13991r) {
                    this.f13994u = 1;
                } else {
                    this.f13994u = this.f13984k - (System.currentTimeMillis() - this.f13991r);
                }
            }
            IAlog.m16699a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m16696a((Object) this), Long.valueOf(this.f13994u));
            mo26337a(this.f13994u, false);
        }
    }

    /* renamed from: a */
    public void mo24374a() {
    }

    public boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController != null) {
            return !iAmraidWebViewController.mo26555h() && !this.f13986m.mo26556i();
        }
        return true;
    }

    /* renamed from: d */
    public final void mo26340d(boolean z) {
        if (this.f13992s != null) {
            this.f13996w = z;
            mo26332E();
            this.f13994u = this.f13984k - (System.currentTimeMillis() - this.f13991r);
            IAlog.m16699a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m16696a((Object) this), Long.valueOf(this.f13994u), Long.valueOf(this.f13984k));
        }
    }

    public void destroy() {
        mo26332E();
        mo26333F();
        this.f13987n = null;
        C5314b0.C5315a.f14151a.f14147a.remove(this);
        Runnable runnable = this.f13992s;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
        }
        super.destroy();
    }

    /* renamed from: f */
    public int mo24380f() {
        return this.f13986m.f14334O;
    }

    /* renamed from: n */
    public void mo24381n() {
    }

    /* renamed from: p */
    public int mo24382p() {
        return this.f13986m.f14335P;
    }

    /* renamed from: t */
    public void mo24384t() {
        C5266b bVar = this.f13998y;
        if (bVar != null) {
            bVar.mo26326c();
        }
        FrameLayout frameLayout = this.f13990q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ViewGroup viewGroup = this.f13989p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f13989p = null;
        }
    }

    /* renamed from: w */
    public int mo24606w() {
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f14280b == null || !iAmraidWebViewController.mo26555h()) {
            return C5350l.m16765c(this.f13986m.f14335P);
        }
        return C5350l.m16765c(this.f13986m.f14280b.getHeight());
    }

    /* renamed from: x */
    public int mo24607x() {
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController == null) {
            return -1;
        }
        if (iAmraidWebViewController.f14280b == null || !iAmraidWebViewController.mo26555h()) {
            return C5350l.m16765c(this.f13986m.f14334O);
        }
        return C5350l.m16765c(this.f13986m.f14280b.getWidth());
    }

    /* renamed from: a */
    public boolean mo24378a(C4419j jVar) {
        return jVar instanceof C4437u;
    }

    /* renamed from: b */
    public void mo26339b(boolean z) {
        IAlog.m16699a("%sgot onLockScreenStateChanged with: %s", IAlog.m16696a((Object) this), Boolean.valueOf(z));
        if (z) {
            mo26340d(false);
            C5266b bVar = this.f13998y;
            if (bVar != null && bVar.f13975h) {
                bVar.mo26326c();
                return;
            }
            return;
        }
        mo26336I();
        C5266b bVar2 = this.f13998y;
        if (bVar2 != null) {
            bVar2.mo26325b();
        }
    }

    /* renamed from: q */
    public void mo24383q() {
        C5405c cVar;
        IAlog.m16699a("%sgot onAdRefreshFailed", IAlog.m16696a((Object) this));
        IAmraidWebViewController iAmraidWebViewController = this.f13986m;
        if (iAmraidWebViewController != null && (cVar = iAmraidWebViewController.f14280b) != null) {
            if (!cVar.getIsVisible() || C5314b0.C5315a.f14151a.f14148b || this.f13986m.mo26555h() || this.f13986m.mo26556i()) {
                IAlog.m16699a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m16696a((Object) this));
                this.f13994u = 1;
                return;
            }
            IAlog.m16699a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m16696a((Object) this));
            long G = (long) mo26334G();
            this.f13984k = G;
            if (G != 0) {
                mo26337a(10000, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24376a(android.view.ViewGroup r15) {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r14.f10920a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.Object[] r15 = new java.lang.Object[r1]
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16696a((java.lang.Object) r14)
            r15[r2] = r0
            java.lang.String r0 = "%sYou must set the spot to render before calling renderAd"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r0, r15)
            return
        L_0x0014:
            r14.f13988o = r2
            r14.f10925f = r2
            java.lang.String r3 = "InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s"
            if (r15 == 0) goto L_0x0027
            r14.f13989p = r15
            com.fyber.inneractive.sdk.external.InneractiveUnitController r15 = r0.getSelectedUnitController()
            com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController r15 = (com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController) r15
            r14.f13985l = r15
            goto L_0x0056
        L_0x0027:
            boolean r15 = r14.f13997x
            if (r15 != 0) goto L_0x0056
            r14.mo26333F()
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r15 = r14.f10920a
            com.fyber.inneractive.sdk.flow.j r15 = r15.getAdContent()
            boolean r15 = r15 instanceof com.fyber.inneractive.sdk.flow.C4437u
            if (r15 == 0) goto L_0x0048
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r15 = r14.f10920a
            com.fyber.inneractive.sdk.flow.j r15 = r15.getAdContent()
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4437u) r15
            r14.f10921b = r15
            r14.f10924e = r2
            r14.mo24597C()
            goto L_0x0056
        L_0x0048:
            java.lang.Object[] r15 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r0 = r14.f10920a
            com.fyber.inneractive.sdk.flow.j r0 = r0.getAdContent()
            r15[r2] = r0
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r3, r15)
            return
        L_0x0056:
            AdContent r15 = r14.f10921b
            r0 = 0
            if (r15 == 0) goto L_0x0061
            r4 = r15
            com.fyber.inneractive.sdk.flow.u r4 = (com.fyber.inneractive.sdk.flow.C4437u) r4
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r4 = r4.f10971g
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            r14.f13986m = r4
            if (r4 == 0) goto L_0x01a1
            com.fyber.inneractive.sdk.web.d$f r15 = r14.f13987n
            if (r15 != 0) goto L_0x0071
            com.fyber.inneractive.sdk.renderers.e r15 = new com.fyber.inneractive.sdk.renderers.e
            r15.<init>(r14)
            r14.f13987n = r15
        L_0x0071:
            com.fyber.inneractive.sdk.web.d$f r15 = r14.f13987n
            r4.setListener(r15)
            AdContent r15 = r14.f10921b
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4437u) r15
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r15.f10913a
            com.fyber.inneractive.sdk.config.z r15 = r15.f10916d
            r3 = -2
            r4 = 0
            if (r15 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.y r15 = (com.fyber.inneractive.sdk.config.C4345y) r15
            com.fyber.inneractive.sdk.config.r r5 = r15.f10747c
            if (r5 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.r r5 = r15.f10747c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f10691b
            if (r5 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.config.r r15 = r15.f10747c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r15.f10691b
            boolean r15 = r15.isFullscreenUnit()
            if (r15 == 0) goto L_0x00c0
            com.fyber.inneractive.sdk.renderers.g$a r15 = new com.fyber.inneractive.sdk.renderers.g$a
            android.view.ViewGroup r5 = r14.f13989p
            android.content.Context r5 = r5.getContext()
            r6 = 1069547520(0x3fc00000, float:1.5)
            r15.<init>(r5, r6)
            r14.f13990q = r15
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13986m
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r6.<init>(r7, r7)
            r5.mo26501a(r15, r6)
            android.view.ViewGroup r15 = r14.f13989p
            android.widget.FrameLayout r5 = r14.f13990q
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r3, r3)
            r15.addView(r5, r6)
            goto L_0x014f
        L_0x00c0:
            com.fyber.inneractive.sdk.renderers.g$a r15 = new com.fyber.inneractive.sdk.renderers.g$a
            android.view.ViewGroup r5 = r14.f13989p
            android.content.Context r5 = r5.getContext()
            r15.<init>(r5, r4)
            r14.f13990q = r15
            AdContent r15 = r14.f10921b
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4437u) r15
            T r5 = r15.f10914b
            com.fyber.inneractive.sdk.response.f r5 = (com.fyber.inneractive.sdk.response.C5292f) r5
            int r6 = r5.f14070e
            int r5 = r5.f14071f
            com.fyber.inneractive.sdk.config.z r15 = r15.f10916d
            com.fyber.inneractive.sdk.util.q0 r15 = m16466a(r6, r5, r15)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13986m
            int r6 = r15.f14238a
            int r7 = r15.f14239b
            r5.setAdDefaultSize(r6, r7)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13986m
            com.fyber.inneractive.sdk.web.c r6 = r5.f14280b
            if (r6 != 0) goto L_0x0120
            android.app.Application r7 = com.fyber.inneractive.sdk.util.C5350l.f14216a
            if (r7 == 0) goto L_0x0120
            boolean r3 = r14.f13997x
            if (r3 != 0) goto L_0x011c
            r14.f13997x = r1
            com.fyber.inneractive.sdk.web.c r3 = new com.fyber.inneractive.sdk.web.c
            r3.<init>(r7)
            r5.f14280b = r3
            r5.mo26506b()     // Catch:{ all -> 0x0115 }
            com.fyber.inneractive.sdk.web.c r8 = r5.f14280b
            java.lang.String r9 = r5.f14297s
            java.lang.String r10 = r5.f14298t
            r13 = 0
            java.lang.String r11 = "text/html"
            java.lang.String r12 = "utf-8"
            r8.loadDataWithBaseURL(r9, r10, r11, r12, r13)
            r5.mo26509e()
            r3 = r1
            goto L_0x0116
        L_0x0115:
            r3 = r2
        L_0x0116:
            if (r3 != 0) goto L_0x014f
            r14.mo26338a((com.fyber.inneractive.sdk.util.C5367q0) r15)
            goto L_0x014f
        L_0x011c:
            r14.mo26338a((com.fyber.inneractive.sdk.util.C5367q0) r15)
            goto L_0x014f
        L_0x0120:
            if (r6 == 0) goto L_0x0127
            android.view.ViewParent r5 = r6.getParent()
            goto L_0x0128
        L_0x0127:
            r5 = r0
        L_0x0128:
            boolean r7 = r5 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0131
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r5.removeView(r6)
        L_0x0131:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r5 = r14.f13986m
            android.widget.FrameLayout r6 = r14.f13990q
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = r15.f14238a
            int r15 = r15.f14239b
            r9 = 17
            r7.<init>(r8, r15, r9)
            r5.mo26501a(r6, r7)
            android.view.ViewGroup r15 = r14.f13989p
            android.widget.FrameLayout r5 = r14.f13990q
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r3, r3)
            r15.addView(r5, r6)
        L_0x014f:
            AdContent r15 = r14.f10921b
            if (r15 == 0) goto L_0x015a
            com.fyber.inneractive.sdk.flow.u r15 = (com.fyber.inneractive.sdk.flow.C4437u) r15
            T r15 = r15.f10914b
            r0 = r15
            com.fyber.inneractive.sdk.response.f r0 = (com.fyber.inneractive.sdk.response.C5292f) r0
        L_0x015a:
            if (r0 == 0) goto L_0x01a8
            com.fyber.inneractive.sdk.renderers.b r15 = new com.fyber.inneractive.sdk.renderers.b
            android.widget.FrameLayout r3 = r14.f13990q
            com.fyber.inneractive.sdk.renderers.d r5 = new com.fyber.inneractive.sdk.renderers.d
            r5.<init>(r14)
            r15.<init>(r0, r3, r5)
            r14.f13998y = r15
            r15.f13976i = r2
            r15.f13972e = r1
            r15.f13973f = r4
            int r3 = r0.f14085t
            if (r3 < r1) goto L_0x017c
            r5 = 100
            int r3 = java.lang.Math.min(r3, r5)
            r15.f13972e = r3
        L_0x017c:
            float r0 = r0.f14086u
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0186
            r15.f13973f = r0
        L_0x0186:
            float r0 = r15.f13973f
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01a8
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "IAVisibilityTracker: startTrackingVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r0)
            r15.f13971d = r4
            long r2 = java.lang.System.currentTimeMillis()
            r15.f13974g = r2
            r15.f13975h = r1
            r15.mo26324a()
            goto L_0x01a8
        L_0x01a1:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r15
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r3, r0)
        L_0x01a8:
            com.fyber.inneractive.sdk.util.b0 r15 = com.fyber.inneractive.sdk.util.C5314b0.C5315a.f14151a
            java.util.List<com.fyber.inneractive.sdk.util.b0$b> r0 = r15.f14147a
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L_0x01b7
            java.util.List<com.fyber.inneractive.sdk.util.b0$b> r15 = r15.f14147a
            r15.add(r14)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5274g.mo24376a(android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public final void mo26337a(long j, boolean z) {
        IAmraidWebViewController iAmraidWebViewController;
        C5405c cVar;
        if (TextUtils.isEmpty(this.f10920a.getMediationNameString()) && j != 0 && !(this.f10920a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) && this.f13993t != -1 && (iAmraidWebViewController = this.f13986m) != null && (cVar = iAmraidWebViewController.f14280b) != null) {
            if (!cVar.getIsVisible()) {
                IAlog.m16699a("%sstartRefreshTimer called but ad is not visible", IAlog.m16696a((Object) this));
                return;
            }
            this.f13991r = System.currentTimeMillis();
            this.f13984k = z ? this.f13984k : j;
            IAlog.m16699a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m16696a((Object) this), Long.valueOf(j), Long.valueOf(this.f13984k));
            if (j > 1) {
                Runnable runnable = this.f13992s;
                if (runnable != null) {
                    C5357n.f14225b.removeCallbacks(runnable);
                }
                mo26332E();
                C5273f fVar = new C5273f(this);
                this.f13992s = fVar;
                C5357n.f14225b.postDelayed(fVar, j);
                return;
            }
            mo26335H();
        }
    }

    /* renamed from: a */
    public static C5367q0 m16466a(int i, int i2, C4346z zVar) {
        int i3;
        int i4;
        C4327r rVar;
        IAlog.m16699a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (!(zVar == null || (rVar = ((C4345y) zVar).f10747c) == null)) {
                unitDisplayType = rVar.f10691b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                i4 = C5350l.m16752a((float) 300);
                i3 = C5350l.m16752a((float) 250);
            } else if (C5348k.m16750o()) {
                i4 = C5350l.m16752a((float) 728);
                i3 = C5350l.m16752a((float) 90);
            } else {
                i4 = C5350l.m16752a((float) 320);
                i3 = C5350l.m16752a((float) 50);
            }
        } else {
            i4 = C5350l.m16752a((float) i);
            i3 = C5350l.m16752a((float) i2);
        }
        IAlog.m16702d("View layout params: final scaled width and height: %d, %d", Integer.valueOf(i4), Integer.valueOf(i3));
        return new C5367q0(i4, i3);
    }

    /* renamed from: a */
    public boolean mo24377a(View view) {
        return view.equals(this.f13989p);
    }

    /* renamed from: a */
    public void mo24375a(int i) {
        this.f13993t = i;
    }

    /* renamed from: a */
    public final void mo26338a(C5367q0 q0Var) {
        FrameLayout frameLayout = new FrameLayout(this.f13989p.getContext());
        frameLayout.setBackgroundResource(C4167R.color.blank_background);
        this.f13989p.removeAllViews();
        this.f13989p.addView(frameLayout, new FrameLayout.LayoutParams(q0Var.f14238a, q0Var.f14239b, 17));
    }
}
