package com.ogury.p376ed.internal;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ogury.p376ed.internal.C10329ak;
import com.ogury.p376ed.internal.C10331al;
import com.ogury.p376ed.internal.C10595ho;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.aj */
public final class C10318aj implements C10647iy {

    /* renamed from: a */
    public static final C10320b f26141a = new C10320b((byte) 0);

    /* renamed from: A */
    private View.OnLayoutChangeListener f26142A;

    /* renamed from: B */
    private int f26143B;

    /* renamed from: C */
    private C10334am f26144C;

    /* renamed from: D */
    private C10342au f26145D;

    /* renamed from: E */
    private C10334am f26146E;

    /* renamed from: F */
    private C10334am f26147F;

    /* renamed from: G */
    private boolean f26148G;

    /* renamed from: b */
    private final Application f26149b;

    /* renamed from: c */
    private final C10595ho.C10596a f26150c;

    /* renamed from: d */
    private final C10331al.C10332a f26151d;

    /* renamed from: e */
    private final C10531fn f26152e;

    /* renamed from: f */
    private final C10329ak f26153f;

    /* renamed from: g */
    private final C10470dw f26154g;

    /* renamed from: h */
    private final C10315ah f26155h;

    /* renamed from: i */
    private final C10586hg f26156i;

    /* renamed from: j */
    private final C10546g f26157j;

    /* renamed from: k */
    private final C10334am f26158k;

    /* renamed from: l */
    private final C10358bf f26159l;

    /* renamed from: m */
    private boolean f26160m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C10829q f26161n;

    /* renamed from: o */
    private final C10510ez f26162o;

    /* renamed from: p */
    private final C10312af f26163p;

    /* renamed from: q */
    private C10660jh f26164q;

    /* renamed from: r */
    private C10331al f26165r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C10580hb f26166s;

    /* renamed from: t */
    private boolean f26167t;

    /* renamed from: u */
    private boolean f26168u;

    /* renamed from: v */
    private C10595ho f26169v;

    /* renamed from: w */
    private C10483eb f26170w;

    /* renamed from: x */
    private List<C10483eb> f26171x;

    /* renamed from: y */
    private C10314ag f26172y;

    /* renamed from: z */
    private C10648iz f26173z;

    public /* synthetic */ C10318aj(C10319a aVar, byte b) {
        this(aVar);
    }

    private C10318aj(C10319a aVar) {
        this.f26149b = aVar.mo67057a();
        this.f26150c = aVar.mo67062e();
        this.f26151d = aVar.mo67063f();
        this.f26152e = aVar.mo67064g();
        this.f26153f = aVar.mo67065h();
        this.f26154g = aVar.mo67066i();
        this.f26155h = aVar.mo67067j();
        this.f26156i = aVar.mo67068k();
        this.f26157j = aVar.mo67059b();
        this.f26158k = aVar.mo67060c();
        this.f26159l = aVar.mo67069l();
        this.f26160m = aVar.mo67061d();
        this.f26161n = aVar.mo67070m();
        this.f26162o = aVar.mo67071n();
        this.f26163p = aVar.mo67072o();
        this.f26168u = true;
        this.f26171x = new ArrayList();
        this.f26173z = new C10648iz();
        this.f26142A = m31184E();
        this.f26143B = 1;
        this.f26144C = C10340as.f26212a;
        this.f26146E = C10340as.f26212a;
        this.f26147F = C10340as.f26212a;
    }

    /* renamed from: a */
    public final Application mo67021a() {
        return this.f26149b;
    }

    /* renamed from: a */
    private final void m31193a(int i) {
        if (this.f26143B != 4) {
            this.f26143B = i;
        }
    }

    /* renamed from: a */
    public final void mo67023a(C10334am amVar) {
        C10765mq.m32773b(amVar, "<set-?>");
        this.f26144C = amVar;
    }

    /* renamed from: a */
    public final void mo67024a(C10342au auVar) {
        this.f26145D = auVar;
    }

    /* renamed from: b */
    public final C10334am mo67029b() {
        return this.f26146E;
    }

    /* renamed from: b */
    public final void mo67030b(C10334am amVar) {
        C10765mq.m32773b(amVar, "<set-?>");
        this.f26146E = amVar;
    }

    /* renamed from: c */
    public final void mo67032c(C10334am amVar) {
        C10765mq.m32773b(amVar, "<set-?>");
        this.f26147F = amVar;
    }

    /* renamed from: c */
    public final boolean mo67034c() {
        return this.f26148G;
    }

    /* renamed from: d */
    public final void mo67035d() {
        this.f26148G = true;
    }

    /* renamed from: com.ogury.ed.internal.aj$b */
    public static final class C10320b {
        public /* synthetic */ C10320b(byte b) {
            this();
        }

        private C10320b() {
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$a */
    public static final class C10319a {

        /* renamed from: a */
        private final Application f26174a;

        /* renamed from: b */
        private final C10546g f26175b;

        /* renamed from: c */
        private final C10334am f26176c;

        /* renamed from: d */
        private final boolean f26177d;

        /* renamed from: e */
        private C10595ho.C10596a f26178e = C10595ho.f26725a;

        /* renamed from: f */
        private C10331al.C10332a f26179f = C10331al.f26194a;

        /* renamed from: g */
        private C10531fn f26180g = C10531fn.f26635a;

        /* renamed from: h */
        private C10329ak f26181h;

        /* renamed from: i */
        private C10470dw f26182i;

        /* renamed from: j */
        private C10315ah f26183j;

        /* renamed from: k */
        private C10586hg f26184k;

        /* renamed from: l */
        private C10316ai f26185l;

        /* renamed from: m */
        private C10358bf f26186m;

        /* renamed from: n */
        private C10829q f26187n;

        /* renamed from: o */
        private C10510ez f26188o;

        /* renamed from: p */
        private C10312af f26189p;

        public C10319a(Application application, C10546g gVar, C10334am amVar, boolean z) {
            C10765mq.m32773b(application, "application");
            C10765mq.m32773b(gVar, "adLayout");
            C10765mq.m32773b(amVar, "expandCommand");
            this.f26174a = application;
            this.f26175b = gVar;
            this.f26176c = amVar;
            this.f26177d = z;
            C10329ak.C10330a aVar = C10329ak.f26192a;
            this.f26181h = C10329ak.C10330a.m31277a();
            this.f26182i = C10470dw.f26453a;
            this.f26183j = C10315ah.f26136a;
            this.f26184k = C10586hg.f26712a;
            this.f26185l = new C10316ai(this.f26174a);
            this.f26186m = new C10358bf();
            this.f26187n = new C10345ax(this.f26175b);
            this.f26188o = new C10510ez(this.f26174a);
            this.f26189p = new C10312af(this.f26174a);
        }

        /* renamed from: a */
        public final Application mo67057a() {
            return this.f26174a;
        }

        /* renamed from: b */
        public final C10546g mo67059b() {
            return this.f26175b;
        }

        /* renamed from: c */
        public final C10334am mo67060c() {
            return this.f26176c;
        }

        /* renamed from: d */
        public final boolean mo67061d() {
            return this.f26177d;
        }

        /* renamed from: e */
        public final C10595ho.C10596a mo67062e() {
            return this.f26178e;
        }

        /* renamed from: f */
        public final C10331al.C10332a mo67063f() {
            return this.f26179f;
        }

        /* renamed from: g */
        public final C10531fn mo67064g() {
            return this.f26180g;
        }

        /* renamed from: h */
        public final C10329ak mo67065h() {
            return this.f26181h;
        }

        /* renamed from: i */
        public final C10470dw mo67066i() {
            return this.f26182i;
        }

        /* renamed from: j */
        public final C10315ah mo67067j() {
            return this.f26183j;
        }

        /* renamed from: k */
        public final C10586hg mo67068k() {
            return this.f26184k;
        }

        /* renamed from: l */
        public final C10358bf mo67069l() {
            return this.f26186m;
        }

        /* renamed from: a */
        public final void mo67058a(C10829q qVar) {
            C10765mq.m32773b(qVar, "<set-?>");
            this.f26187n = qVar;
        }

        /* renamed from: m */
        public final C10829q mo67070m() {
            return this.f26187n;
        }

        /* renamed from: n */
        public final C10510ez mo67071n() {
            return this.f26188o;
        }

        /* renamed from: o */
        public final C10312af mo67072o() {
            return this.f26189p;
        }

        /* renamed from: p */
        public final C10318aj mo67073p() {
            return new C10318aj(this, (byte) 0);
        }
    }

    /* renamed from: e */
    public final List<C10483eb> mo67036e() {
        return this.f26171x;
    }

    /* renamed from: f */
    public final C10483eb mo67037f() {
        return this.f26170w;
    }

    /* renamed from: g */
    public final void mo67038g() {
        m31193a(2);
    }

    /* renamed from: h */
    public final void mo67039h() {
        m31193a(3);
    }

    /* renamed from: i */
    public final boolean mo67040i() {
        if (this.f26143B == 3) {
            return false;
        }
        C10660jh jhVar = this.f26164q;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        return !C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "expanded");
    }

    /* renamed from: z */
    private final boolean m31206z() {
        C10660jh jhVar = this.f26164q;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        return !C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "resized");
    }

    /* renamed from: j */
    public final boolean mo67041j() {
        if (this.f26164q != null) {
            return m31206z() && (this.f26157j.getParent() instanceof C10307ac);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo67025a(C10483eb ebVar, List<C10483eb> list) {
        C10765mq.m32773b(ebVar, "ad");
        C10765mq.m32773b(list, "notDisplayedAds");
        this.f26171x = list;
        this.f26170w = ebVar;
        m31196a(ebVar);
        m31191L();
        m31197a(ebVar, this.f26157j);
        C10331al alVar = null;
        C10643iv ivVar = new C10643iv(this.f26149b, this, (C10729lj<C10684ke>) null);
        C10595ho a = C10595ho.C10596a.m32254a(this.f26149b, ebVar, this.f26157j, ivVar);
        this.f26169v = a;
        a.mo67549a((C10729lj<C10684ke>) new C10321c(this));
        a.mo67553b((C10729lj<C10684ke>) new C10322d(this));
        C10331al a2 = C10331al.C10332a.m31284a(a, ivVar);
        this.f26165r = a2;
        if (a2 == null) {
            C10765mq.m32771a("webViewGateway");
        } else {
            alVar = a2;
        }
        C10660jh a3 = alVar.mo67078a(ebVar);
        if (a3 != null) {
            this.f26164q = a3;
            this.f26166s = a3.getMraidCommandExecutor();
            a.mo67551a(ebVar.mo67243j().length() > 0 ? ebVar.mo67243j() : "controller", a3, ebVar.mo67263v());
            C10530fm a4 = C10531fn.m32005a((Context) this.f26149b);
            if (a4 != null) {
                m31198a(a4);
                m31199a(a3);
                this.f26157j.addView(a3, new FrameLayout.LayoutParams(-1, -1));
                if (ebVar.mo67264w().mo67290d() && !this.f26160m) {
                    m31201b(ebVar);
                }
                this.f26153f.mo67077a(a4, ebVar, a3);
                m31181B();
                m31182C();
                this.f26157j.setOnWindowGainFocusListener(new C10323e(this));
                this.f26157j.setOnWindowLoseFocusListener(new C10324f(this));
                this.f26157j.setOnAttachToWindowListener(new C10325g(this));
                this.f26157j.setOnDetachFromWindowListener(new C10326h(this));
                return;
            }
            throw new IllegalStateException("Profig must not be null");
        }
        throw new IllegalStateException("WebView must not be null");
    }

    /* renamed from: com.ogury.ed.internal.aj$c */
    /* synthetic */ class C10321c extends C10764mp implements C10729lj<C10684ke> {
        C10321c(Object obj) {
            super(0, obj, C10318aj.class, "handleNewOguryBrowserWebViewCreated", "handleNewOguryBrowserWebViewCreated()V");
        }

        /* renamed from: h */
        private void m31260h() {
            ((C10318aj) this.f26984a).m31187H();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31260h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$d */
    /* synthetic */ class C10322d extends C10764mp implements C10729lj<C10684ke> {
        C10322d(Object obj) {
            super(0, obj, C10318aj.class, "closeAd", "closeAd()V");
        }

        /* renamed from: h */
        private void m31262h() {
            ((C10318aj) this.f26984a).mo67054w();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31262h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$e */
    /* synthetic */ class C10323e extends C10764mp implements C10729lj<C10684ke> {
        C10323e(Object obj) {
            super(0, obj, C10318aj.class, "resumeAd", "resumeAd()V");
        }

        /* renamed from: h */
        private void m31264h() {
            ((C10318aj) this.f26984a).mo67047p();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31264h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$f */
    /* synthetic */ class C10324f extends C10764mp implements C10729lj<C10684ke> {
        C10324f(Object obj) {
            super(0, obj, C10318aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m31266h() {
            ((C10318aj) this.f26984a).mo67046o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31266h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$g */
    /* synthetic */ class C10325g extends C10764mp implements C10729lj<C10684ke> {
        C10325g(Object obj) {
            super(0, obj, C10318aj.class, "onAttachToWindow", "onAttachToWindow()V");
        }

        /* renamed from: h */
        private void m31268h() {
            ((C10318aj) this.f26984a).m31180A();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31268h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$h */
    /* synthetic */ class C10326h extends C10764mp implements C10729lj<C10684ke> {
        C10326h(Object obj) {
            super(0, obj, C10318aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m31270h() {
            ((C10318aj) this.f26984a).mo67046o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m31270h();
            return C10684ke.f26938a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m31180A() {
        if (this.f26157j.mo67463g()) {
            mo67047p();
        }
    }

    /* renamed from: a */
    private final void m31196a(C10483eb ebVar) {
        this.f26163p.mo67011a(ebVar);
        this.f26163p.mo67012a(this.f26161n);
    }

    /* renamed from: com.ogury.ed.internal.aj$i */
    static final class C10327i extends C10766mr implements C10730lk<C10546g, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10318aj f26190a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10327i(C10318aj ajVar) {
            super(1);
            this.f26190a = ajVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31272a((C10546g) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31272a(C10546g gVar) {
            C10765mq.m32773b(gVar, "adLayout");
            C10580hb c = this.f26190a.f26166s;
            if (c == null) {
                C10765mq.m32771a("mraidCommandExecutor");
                c = null;
            }
            c.mo67530b(C10556gi.m32086a(gVar.getWidth()), C10556gi.m32086a(gVar.getHeight()), C10556gi.m32085a(gVar.getX()), C10556gi.m32085a(gVar.getY()));
            this.f26190a.f26161n.mo67005a();
            this.f26190a.m31183D();
        }
    }

    /* renamed from: B */
    private final void m31181B() {
        this.f26157j.setAdLayoutChangeListener(new C10327i(this));
    }

    /* renamed from: com.ogury.ed.internal.aj$j */
    public static final class C10328j implements C10664jl {

        /* renamed from: a */
        final /* synthetic */ C10318aj f26191a;

        C10328j(C10318aj ajVar) {
            this.f26191a = ajVar;
        }

        /* renamed from: a */
        public final void mo67075a() {
            this.f26191a.f26161n.mo67005a();
        }
    }

    /* renamed from: C */
    private final void m31182C() {
        C10660jh jhVar = this.f26164q;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        jhVar.setVisibilityChangedListener(new C10328j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m31183D() {
        C10510ez ezVar = this.f26162o;
        C10660jh jhVar = this.f26164q;
        C10580hb hbVar = null;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        Rect a = ezVar.mo67337a((View) jhVar);
        C10580hb hbVar2 = this.f26166s;
        if (hbVar2 == null) {
            C10765mq.m32771a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo67529b(C10556gi.m32086a(a.width()), C10556gi.m32086a(a.height()));
    }

    /* renamed from: E */
    private final View.OnLayoutChangeListener m31184E() {
        return new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C10318aj.m31195a(C10318aj.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31195a(C10318aj ajVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C10765mq.m32773b(ajVar, "this$0");
        C10660jh jhVar = ajVar.f26164q;
        if (jhVar != null) {
            C10660jh jhVar2 = null;
            if (jhVar == null) {
                C10765mq.m32771a("webView");
                jhVar = null;
            }
            if (!C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "hidden")) {
                C10660jh jhVar3 = ajVar.f26164q;
                if (jhVar3 == null) {
                    C10765mq.m32771a("webView");
                } else {
                    jhVar2 = jhVar3;
                }
                if (C10566gr.m32111e(jhVar2)) {
                    ajVar.f26161n.mo67005a();
                }
            }
        }
    }

    /* renamed from: F */
    private final void m31185F() {
        ViewGroup parentAsViewGroup = this.f26157j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.addOnLayoutChangeListener(this.f26142A);
        }
    }

    /* renamed from: G */
    private final void m31186G() {
        ViewGroup parentAsViewGroup = this.f26157j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeOnLayoutChangeListener(this.f26142A);
        }
    }

    /* renamed from: b */
    private final void m31201b(C10483eb ebVar) {
        this.f26173z.mo67663a(ebVar.mo67247l().mo67319b());
        this.f26173z.mo67667b(ebVar.mo67247l().mo67321c());
        this.f26157j.setInitialSize(this.f26173z);
        this.f26157j.setupDrag(ebVar.mo67247l().mo67318a());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m31187H() {
        /*
            r6 = this;
            boolean r0 = r6.f26160m
            r1 = 0
            r2 = 0
            java.lang.String r3 = "webView"
            r4 = 1
            if (r0 == 0) goto L_0x001f
            com.ogury.ed.internal.jh r0 = r6.f26164q
            if (r0 != 0) goto L_0x0011
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r3)
            r0 = r2
        L_0x0011:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r5 = "default"
            boolean r0 = com.ogury.p376ed.internal.C10765mq.m32772a((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 != 0) goto L_0x001f
            r0 = r4
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6.f26160m
            if (r0 != 0) goto L_0x0044
        L_0x0026:
            com.ogury.ed.internal.jh r0 = r6.f26164q
            if (r0 != 0) goto L_0x002e
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r3)
            r0 = r2
        L_0x002e:
            r0.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r0 = r6.f26164q
            if (r0 != 0) goto L_0x0039
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r3)
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            r0 = 4
            r2.setVisibility(r0)
            r6.mo67046o()
            r6.m31188I()
        L_0x0044:
            com.ogury.ed.internal.eb r0 = r6.f26170w
            if (r0 == 0) goto L_0x004f
            boolean r0 = com.ogury.p376ed.internal.C10494el.m31816b(r0)
            if (r0 != r4) goto L_0x004f
            r1 = r4
        L_0x004f:
            if (r1 == 0) goto L_0x0053
            r6.f26160m = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10318aj.m31187H():void");
    }

    /* renamed from: I */
    private final void m31188I() {
        mo67051t();
    }

    /* renamed from: a */
    private final void m31198a(C10530fm fmVar) {
        this.f26167t = fmVar.mo67432g();
        this.f26168u = fmVar.mo67433h();
        C10314ag agVar = this.f26172y;
        if (agVar != null) {
            agVar.mo67014a(fmVar.mo67436k());
        }
    }

    /* renamed from: a */
    private final void m31199a(C10660jh jhVar) {
        C10314ag agVar;
        if (!jhVar.getShowSdkCloseButton() && (agVar = this.f26172y) != null) {
            agVar.mo67015b();
        }
    }

    /* renamed from: a */
    private final void m31197a(C10483eb ebVar, C10546g gVar) {
        if (C10494el.m31816b(ebVar)) {
            this.f26172y = C10315ah.m31177a(this, gVar, C10470dw.m31662a(this.f26149b), ebVar.mo67257q());
        }
    }

    /* renamed from: J */
    private final boolean m31189J() {
        C10595ho hoVar = this.f26169v;
        if (hoVar == null) {
            return true;
        }
        return hoVar.mo67555b();
    }

    /* renamed from: k */
    public final void mo67042k() {
        String b;
        if (this.f26143B != 4) {
            C10553gf.m32082a("destroying ad");
            m31193a(4);
            this.f26161n.mo67007b();
            C10595ho hoVar = this.f26169v;
            if (hoVar != null) {
                hoVar.mo67558d();
            }
            C10314ag agVar = this.f26172y;
            if (agVar != null) {
                agVar.mo67016c();
            }
            C10483eb ebVar = this.f26170w;
            String str = "";
            if (!(ebVar == null || (b = ebVar.mo67222b()) == null)) {
                str = b;
            }
            C10586hg.m32203a(new C10585hf(str, "adClosed"));
            this.f26153f.mo67076a();
            this.f26157j.mo67462f();
            this.f26144C = C10340as.f26212a;
            C10660jh jhVar = this.f26164q;
            if (jhVar != null) {
                if (jhVar == null) {
                    C10765mq.m32771a("webView");
                    jhVar = null;
                }
                jhVar.mo67704i();
            }
        }
    }

    /* renamed from: a */
    public final void mo67028a(boolean z) {
        if (m31190K() && m31189J() && this.f26168u) {
            mo67042k();
            this.f26146E.mo67001a(this.f26157j, this);
            if (!z) {
                mo67043l();
            }
        }
    }

    /* renamed from: l */
    public final void mo67043l() {
        String b;
        C10483eb ebVar = this.f26170w;
        String str = "";
        if (!(ebVar == null || (b = ebVar.mo67222b()) == null)) {
            str = b;
        }
        C10586hg.m32203a(new C10585hf(str, "closeWhithoutShowNextAd"));
    }

    /* renamed from: m */
    public final void mo67044m() {
        if (this.f26148G || m31190K()) {
            mo67042k();
        }
    }

    /* renamed from: K */
    private final boolean m31190K() {
        return this.f26160m && this.f26143B != 2;
    }

    /* renamed from: n */
    public final boolean mo67045n() {
        C10595ho hoVar = this.f26169v;
        if (hoVar != null) {
            hoVar.mo67556c();
        }
        return this.f26167t;
    }

    /* renamed from: o */
    public final void mo67046o() {
        C10660jh jhVar = this.f26164q;
        C10580hb hbVar = null;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        if (!jhVar.mo67687a()) {
            C10553gf.m32082a("ad already paused");
            return;
        }
        C10553gf.m32082a("pauseAd");
        C10660jh jhVar2 = this.f26164q;
        if (jhVar2 == null) {
            C10765mq.m32771a("webView");
            jhVar2 = null;
        }
        jhVar2.setResumed(false);
        m31186G();
        C10576gy gyVar = new C10576gy();
        gyVar.mo67513a(0.0f);
        C10580hb hbVar2 = this.f26166s;
        if (hbVar2 == null) {
            C10765mq.m32771a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo67522a(gyVar);
    }

    /* renamed from: p */
    public final void mo67047p() {
        C10660jh jhVar = this.f26164q;
        C10660jh jhVar2 = null;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        if (jhVar.mo67687a()) {
            C10553gf.m32082a("ad already resumed");
            return;
        }
        C10553gf.m32082a("resumeAd");
        C10660jh jhVar3 = this.f26164q;
        if (jhVar3 == null) {
            C10765mq.m32771a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        jhVar2.setResumed(true);
        if (this.f26160m) {
            m31185F();
        }
        if (this.f26143B != 2) {
            m31193a(1);
        }
        this.f26161n.mo67005a();
    }

    /* renamed from: a */
    public final void mo67022a(int i, int i2) {
        this.f26173z.mo67669c(i);
        this.f26173z.mo67671d(i2);
    }

    /* renamed from: L */
    private final void m31191L() {
        this.f26147F.mo67001a(this.f26157j, this);
    }

    /* renamed from: q */
    public final void mo67048q() {
        C10314ag agVar = this.f26172y;
        if (agVar != null) {
            agVar.mo67013a();
        }
    }

    /* renamed from: r */
    public final void mo67049r() {
        C10314ag agVar = this.f26172y;
        if (agVar != null) {
            agVar.mo67015b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67027a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "adId"
            com.ogury.p376ed.internal.C10765mq.m32773b(r4, r0)
            boolean r0 = r3.f26160m
            r1 = 0
            if (r0 != 0) goto L_0x0023
            com.ogury.ed.internal.jh r0 = r3.f26164q
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "webView"
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r0)
            r0 = 0
        L_0x0014:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r2 = "hidden"
            boolean r0 = com.ogury.p376ed.internal.C10765mq.m32772a((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 == 0) goto L_0x0038
            com.ogury.ed.internal.au r0 = r3.f26145D
            if (r0 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            android.app.Application r1 = r3.f26149b
            java.util.List<com.ogury.ed.internal.eb> r2 = r3.f26171x
            boolean r1 = r0.mo67004a(r1, r2, r4)
        L_0x0033:
            if (r1 != 0) goto L_0x0038
            r3.mo67043l()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10318aj.mo67027a(java.lang.String):void");
    }

    /* renamed from: s */
    public final void mo67050s() {
        mo67031b(false);
    }

    /* renamed from: a */
    public final void mo67026a(C10648iz izVar) {
        this.f26157j.setResizeProps(izVar);
    }

    /* renamed from: t */
    public final void mo67051t() {
        if (!mo67052u()) {
            this.f26158k.mo67001a(this.f26157j, this);
            m31202b(this.f26160m ? "default" : "expanded");
        }
    }

    /* renamed from: u */
    public final boolean mo67052u() {
        C10660jh jhVar = this.f26164q;
        C10660jh jhVar2 = null;
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        if (C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "expanded")) {
            return true;
        }
        if (!this.f26160m) {
            return false;
        }
        C10660jh jhVar3 = this.f26164q;
        if (jhVar3 == null) {
            C10765mq.m32771a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        return C10765mq.m32772a((Object) jhVar2.getAdState(), (Object) "default");
    }

    /* renamed from: v */
    public final void mo67053v() {
        C10648iz resizeProps = this.f26157j.getResizeProps();
        if (resizeProps == null) {
            throw new IllegalStateException("setResizeProperties must be called first");
        } else if (this.f26159l.mo67091a((ViewGroup) this.f26157j, resizeProps)) {
            m31202b("resized");
            this.f26144C.mo67001a(this.f26157j, this);
        } else {
            throw new IllegalArgumentException("Invalid resize command".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r0 == null ? true : com.ogury.p376ed.internal.C10494el.m31816b(r0)) != false) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67031b(boolean r6) {
        /*
            r5 = this;
            com.ogury.ed.internal.jh r0 = r5.f26164q
            r1 = 0
            java.lang.String r2 = "webView"
            if (r0 != 0) goto L_0x000b
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r2)
            r0 = r1
        L_0x000b:
            boolean r0 = r0.mo67689b()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0020
            com.ogury.ed.internal.eb r0 = r5.f26170w
            if (r0 != 0) goto L_0x0019
            r0 = r3
            goto L_0x001d
        L_0x0019:
            boolean r0 = com.ogury.p376ed.internal.C10494el.m31816b(r0)
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            if (r3 != 0) goto L_0x005a
            com.ogury.ed.internal.jh r0 = r5.f26164q
            if (r0 != 0) goto L_0x002b
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r2)
            r0 = r1
        L_0x002b:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r3 = "default"
            boolean r0 = com.ogury.p376ed.internal.C10765mq.m32772a((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5.f26160m
            if (r0 == 0) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            com.ogury.ed.internal.jh r6 = r5.f26164q
            if (r6 != 0) goto L_0x0044
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r2)
            r6 = r1
        L_0x0044:
            r6.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r6 = r5.f26164q
            if (r6 != 0) goto L_0x004f
            com.ogury.p376ed.internal.C10765mq.m32771a((java.lang.String) r2)
            goto L_0x0050
        L_0x004f:
            r1 = r6
        L_0x0050:
            r1.setVisibility(r4)
            r5.m31192M()
            r5.m31202b((java.lang.String) r3)
            return
        L_0x005a:
            r5.mo67033c((boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10318aj.mo67031b(boolean):void");
    }

    /* renamed from: c */
    public final void mo67033c(boolean z) {
        mo67054w();
        if (!z) {
            mo67043l();
        }
    }

    /* renamed from: w */
    public final void mo67054w() {
        this.f26146E.mo67001a(this.f26157j, this);
    }

    /* renamed from: b */
    private final void m31202b(String str) {
        C10580hb hbVar = this.f26166s;
        if (hbVar == null) {
            C10765mq.m32771a("mraidCommandExecutor");
            hbVar = null;
        }
        hbVar.mo67531b(str);
    }

    /* renamed from: M */
    private final void m31192M() {
        this.f26157j.mo67461e();
        this.f26144C.mo67001a(this.f26157j, this);
    }

    /* renamed from: x */
    public final boolean mo67055x() {
        C10660jh jhVar = this.f26164q;
        if (jhVar == null) {
            return false;
        }
        if (jhVar == null) {
            C10765mq.m32771a("webView");
            jhVar = null;
        }
        return jhVar.mo67689b();
    }

    /* renamed from: y */
    public final void mo67056y() {
        C10483eb ebVar = this.f26170w;
        String b = ebVar == null ? null : ebVar.mo67222b();
        if (b != null) {
            C10586hg.m32203a(new C10585hf(b, "adClosed"));
        }
    }
}
