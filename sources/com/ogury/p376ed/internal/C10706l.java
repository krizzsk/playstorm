package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10420cw;
import java.util.ArrayList;
import java.util.List;
import p394io.presage.common.AdConfig;
import p394io.presage.common.PresageSdk;
import p394io.presage.common.PresageSdkInitCallback;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.l */
public final class C10706l implements C10622ig {

    /* renamed from: a */
    public static final C10707a f26944a = new C10707a((byte) 0);

    /* renamed from: b */
    private final Context f26945b;

    /* renamed from: c */
    private final AdConfig f26946c;

    /* renamed from: d */
    private final C10618id f26947d;

    /* renamed from: e */
    private final C10531fn f26948e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10445di f26949f;

    /* renamed from: g */
    private final C10586hg f26950g;

    /* renamed from: h */
    private final C10619ie f26951h;

    /* renamed from: i */
    private final C10456dm f26952i;

    /* renamed from: j */
    private final C10650j f26953j;

    /* renamed from: k */
    private final C10527fk f26954k;

    /* renamed from: l */
    private final C10491ej f26955l;

    /* renamed from: m */
    private final C10424cz f26956m;

    /* renamed from: n */
    private final C10614i f26957n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f26958o;

    /* renamed from: p */
    private String f26959p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<C10483eb> f26960q;

    /* renamed from: r */
    private C10578h f26961r;

    /* renamed from: s */
    private C10679k f26962s;

    /* renamed from: t */
    private PresageSdk f26963t;

    /* renamed from: u */
    private C10730lk<? super RewardItem, C10684ke> f26964u;

    /* renamed from: v */
    private C10501es f26965v;

    /* renamed from: w */
    private boolean f26966w;

    /* renamed from: x */
    private boolean f26967x;

    /* renamed from: y */
    private OguryEventCallback f26968y;

    private C10706l(Context context, AdConfig adConfig, C10618id idVar, C10531fn fnVar, C10445di diVar, C10586hg hgVar, C10619ie ieVar, C10456dm dmVar, C10650j jVar, C10527fk fkVar, C10491ej ejVar, C10424cz czVar, C10614i iVar) {
        this.f26945b = context;
        this.f26946c = adConfig;
        this.f26947d = idVar;
        this.f26948e = fnVar;
        this.f26949f = diVar;
        this.f26950g = hgVar;
        this.f26951h = ieVar;
        this.f26952i = dmVar;
        this.f26953j = jVar;
        this.f26954k = fkVar;
        this.f26955l = ejVar;
        this.f26956m = czVar;
        this.f26957n = iVar;
        this.f26959p = "";
        this.f26960q = new ArrayList();
        this.f26963t = PresageSdk.f29336a;
        this.f26967x = true;
    }

    /* renamed from: a */
    public final boolean mo67815a() {
        return this.f26958o;
    }

    /* renamed from: a */
    public final void mo67814a(String str) {
        C10765mq.m32773b(str, "<set-?>");
        this.f26959p = str;
    }

    /* renamed from: a */
    public final void mo67810a(C10578h hVar) {
        this.f26961r = hVar;
    }

    /* renamed from: b */
    public final C10578h mo67816b() {
        return this.f26961r;
    }

    /* renamed from: a */
    public final void mo67811a(C10679k kVar) {
        this.f26962s = kVar;
    }

    /* renamed from: a */
    public final void mo67812a(C10730lk<? super RewardItem, C10684ke> lkVar) {
        this.f26964u = lkVar;
    }

    /* renamed from: a */
    public final void mo67809a(C10501es esVar) {
        this.f26965v = esVar;
    }

    /* renamed from: c */
    public final boolean mo67818c() {
        return this.f26967x;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10706l(android.content.Context r5, p394io.presage.common.AdConfig r6, com.ogury.p376ed.internal.C10491ej r7) {
        /*
            r4 = this;
            com.ogury.ed.internal.j r0 = new com.ogury.ed.internal.j
            android.content.Context r1 = r5.getApplicationContext()
            java.lang.String r2 = "constructor(\n        con…AdsCallbackFilter()\n    )"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r1, (java.lang.String) r2)
            com.ogury.ed.internal.fu r2 = new com.ogury.ed.internal.fu
            r2.<init>()
            com.ogury.ed.internal.gc r3 = new com.ogury.ed.internal.gc
            r3.<init>()
            com.ogury.ed.internal.gb r3 = (com.ogury.p376ed.internal.C10549gb) r3
            r0.<init>(r1, r2, r3, r7)
            r4.<init>(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10706l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10706l(android.content.Context r17, p394io.presage.common.AdConfig r18, com.ogury.p376ed.internal.C10491ej r19, com.ogury.p376ed.internal.C10650j r20) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "context"
            com.ogury.p376ed.internal.C10765mq.m32773b(r0, r1)
            java.lang.String r1 = "adType"
            r13 = r19
            com.ogury.p376ed.internal.C10765mq.m32773b(r13, r1)
            java.lang.String r1 = "adsConditionsChecker"
            r11 = r20
            com.ogury.p376ed.internal.C10765mq.m32773b(r11, r1)
            android.content.Context r3 = r17.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r3, (java.lang.String) r1)
            com.ogury.ed.internal.id r5 = com.ogury.p376ed.internal.C10618id.f26806a
            com.ogury.ed.internal.fn r6 = com.ogury.p376ed.internal.C10531fn.f26635a
            com.ogury.ed.internal.di r7 = com.ogury.p376ed.internal.C10445di.f26411a
            com.ogury.ed.internal.hg r8 = com.ogury.p376ed.internal.C10586hg.f26712a
            com.ogury.ed.internal.ie$a r1 = com.ogury.p376ed.internal.C10619ie.f26812a
            com.ogury.ed.internal.ie r9 = com.ogury.p376ed.internal.C10619ie.C10620a.m32380a(r17)
            com.ogury.ed.internal.dm r10 = new com.ogury.ed.internal.dm
            r10.<init>(r0)
            com.ogury.ed.internal.fk$a r1 = com.ogury.p376ed.internal.C10527fk.f26610a
            com.ogury.ed.internal.fk r12 = com.ogury.p376ed.internal.C10527fk.C10528a.m31966a(r17)
            com.ogury.ed.internal.cz r14 = com.ogury.p376ed.internal.C10424cz.f26365a
            com.ogury.ed.internal.i r15 = new com.ogury.ed.internal.i
            r15.<init>()
            r2 = r16
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10706l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej, com.ogury.ed.internal.j):void");
    }

    /* renamed from: com.ogury.ed.internal.l$a */
    public static final class C10707a {
        public /* synthetic */ C10707a(byte b) {
            this();
        }

        private C10707a() {
        }
    }

    /* renamed from: a */
    public final void mo67621a(C10483eb ebVar) {
        C10765mq.m32773b(ebVar, "ad");
        m32682c("Ad " + ebVar.mo67234f() + " expired");
        m32670a(4);
        this.f26960q.remove(ebVar);
    }

    /* renamed from: d */
    public final void mo67819d() {
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f26946c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m32682c(sb.toString());
        if (this.f26953j.mo67680b()) {
            m32682c("Impossible to join Ogury servers. No Internet connection");
            m32670a(1);
        } else if (PresageSdk.m34608c()) {
            m32682c("Module setup issue");
            m32670a(6);
        } else if (PresageSdk.m34606a()) {
            m32682c("Module setup is still in progress");
            m32688g();
        } else if (C10650j.m32550a()) {
            m32682c("Module not set up");
            m32685f();
        } else {
            m32689h();
        }
    }

    /* renamed from: b */
    public final void mo67817b(String str) {
        C10765mq.m32773b(str, "adMarkup");
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f26946c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m32682c(sb.toString());
        this.f26952i.mo67193a(str, this.f26955l).mo67169a(new C10714h(this)).mo67170b(new C10715i(this));
    }

    /* renamed from: com.ogury.ed.internal.l$h */
    static final class C10714h extends C10766mr implements C10730lk<Throwable, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26974a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10714h(C10706l lVar) {
            super(1);
            this.f26974a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32720a((Throwable) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32720a(Throwable th) {
            C10765mq.m32773b(th, "errorThrowable");
            this.f26974a.m32682c(C10765mq.m32765a("Failed to load (", (Object) th.getMessage()));
            this.f26974a.m32670a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$i */
    static final class C10715i extends C10766mr implements C10730lk<C10490ei, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26975a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10715i(C10706l lVar) {
            super(1);
            this.f26975a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32722a((C10490ei) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32722a(C10490ei eiVar) {
            C10765mq.m32773b(eiVar, "adResponse");
            C10445di unused = this.f26975a.f26949f;
            C10483eb ebVar = (C10483eb) C10692km.m32656b(eiVar.mo67286a());
            C10445di.m31608a((C10444dh) new C10454dk("LOAD", ebVar == null ? null : ebVar.mo67212A()));
            this.f26975a.m32682c("LOAD event");
            this.f26975a.m32671a(eiVar);
        }
    }

    /* renamed from: f */
    private final void m32685f() {
        m32682c("Trying to set up module...");
        String i = this.f26954k.mo67405i();
        if (i.length() == 0) {
            m32682c("Impossible to set up module (no asset key found)");
            m32670a(5);
            return;
        }
        PresageSdk.init(this.f26945b, i);
        m32688g();
    }

    /* renamed from: com.ogury.ed.internal.l$b */
    public static final class C10708b implements PresageSdkInitCallback {

        /* renamed from: a */
        final /* synthetic */ C10706l f26969a;

        C10708b(C10706l lVar) {
            this.f26969a = lVar;
        }

        public final void onSdkNotInitialized() {
            this.f26969a.m32682c("Failed to set up module");
            this.f26969a.m32670a(5);
        }

        public final void onSdkInitialized() {
            this.f26969a.m32689h();
        }

        public final void onSdkInitFailed() {
            this.f26969a.m32670a(6);
        }
    }

    /* renamed from: g */
    private final void m32688g() {
        m32682c("Waiting for module setup...");
        this.f26963t.addSdkInitCallback(new C10708b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m32689h() {
        m32682c("Syncing with consent...");
        C10424cz.m31537a(this.f26968y);
        this.f26968y = C10424cz.m31534a((C10729lj<C10684ke>) new C10719m(this));
    }

    /* renamed from: com.ogury.ed.internal.l$m */
    /* synthetic */ class C10719m extends C10764mp implements C10729lj<C10684ke> {
        C10719m(Object obj) {
            super(0, obj, C10706l.class, "checkProfig", "checkProfig()V");
        }

        /* renamed from: h */
        private void m32731h() {
            ((C10706l) this.f26984a).m32691i();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m32731h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$c */
    /* synthetic */ class C10709c extends C10764mp implements C10729lj<C10530fm> {
        C10709c(Object obj) {
            super(0, obj, C10706l.class, "getProfigAndSyncIfNeeded", "getProfigAndSyncIfNeeded()Lio/presage/common/profig/data/ProfigFullResponse;");
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C10530fm mo67074a() {
            return ((C10706l) this.f26984a).m32692j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m32691i() {
        m32682c("Retrieving configuration...");
        C10420cw.C10421a aVar = C10420cw.f26359a;
        C10420cw.C10421a.m31531a(new C10709c(this)).mo67169a(new C10710d(this)).mo67170b(new C10711e(this));
    }

    /* renamed from: com.ogury.ed.internal.l$d */
    static final class C10710d extends C10766mr implements C10730lk<Throwable, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26970a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10710d(C10706l lVar) {
            super(1);
            this.f26970a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32712a((Throwable) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32712a(Throwable th) {
            C10765mq.m32773b(th, "it");
            this.f26970a.m32682c("Failed. Configuration not synced");
            this.f26970a.m32670a(3);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$e */
    static final class C10711e extends C10766mr implements C10730lk<C10530fm, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26971a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10711e(C10706l lVar) {
            super(1);
            this.f26971a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32714a((C10530fm) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32714a(C10530fm fmVar) {
            this.f26971a.m32672a(fmVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C10530fm m32692j() {
        C10530fm a = C10531fn.m32005a(this.f26945b);
        if (!this.f26954k.mo67407k() && a != null) {
            return a;
        }
        m32682c("Configuration need to be synced");
        C10531fn.m32007b(this.f26945b);
        return C10531fn.m32005a(this.f26945b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32672a(C10530fm fmVar) {
        if (fmVar == null) {
            m32682c("Failed. Configuration not synced");
            m32670a(3);
        } else if (!fmVar.mo67416b()) {
            m32682c("Failed. Ad serving has been disabled");
            m32670a(2);
        } else {
            m32682c("Configuration successfully retrieved");
            C10445di.m31608a((C10444dh) new C10454dk("LOAD"));
            m32682c("LOAD event");
            m32682c("Loading ads from servers...");
            this.f26952i.mo67192a(this.f26955l, this.f26946c, this.f26959p, this.f26965v).mo67169a(new C10712f(this)).mo67170b(new C10713g(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$f */
    static final class C10712f extends C10766mr implements C10730lk<Throwable, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10712f(C10706l lVar) {
            super(1);
            this.f26972a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32716a((Throwable) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32716a(Throwable th) {
            C10765mq.m32773b(th, "errorThrowable");
            C10706l lVar = this.f26972a;
            lVar.m32682c("Failed to load (" + th.getMessage() + ')');
            this.f26972a.m32670a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$g */
    static final class C10713g extends C10766mr implements C10730lk<C10490ei, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10706l f26973a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10713g(C10706l lVar) {
            super(1);
            this.f26973a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32718a((C10490ei) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m32718a(C10490ei eiVar) {
            C10765mq.m32773b(eiVar, "adResponse");
            this.f26973a.m32671a(eiVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32671a(C10490ei eiVar) {
        if (!this.f26966w) {
            if (!eiVar.mo67286a().isEmpty()) {
                m32682c("Ads available");
                C10578h hVar = this.f26961r;
                if (hVar != null) {
                    hVar.mo67349b();
                }
                m32679a((List<C10483eb>) C10692km.m32655a(eiVar.mo67286a()));
                return;
            }
            m32682c("Failed to load (no ad available)");
            m32682c("Triggering onAdError() callback");
            m32695m();
            C10578h hVar2 = this.f26961r;
            if (hVar2 != null) {
                hVar2.mo67350c();
            }
        }
    }

    /* renamed from: a */
    private final void m32679a(List<C10483eb> list) {
        boolean z;
        m32682c("Precaching available ads...");
        for (C10483eb c : list) {
            if (c.mo67225c().length() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                m32682c("Failed to load (invalid ad)");
                m32682c("Triggering onAdError() callback");
                m32695m();
                C10578h b = mo67816b();
                if (b != null) {
                    b.mo67352e();
                    return;
                }
                return;
            }
        }
        this.f26960q = C10692km.m32655a(list);
        this.f26951h.mo67617a(this, list, new C10716j(this));
    }

    /* renamed from: com.ogury.ed.internal.l$j */
    public static final class C10716j implements C10621if {

        /* renamed from: a */
        final /* synthetic */ C10706l f26976a;

        C10716j(C10706l lVar) {
            this.f26976a = lVar;
        }

        /* renamed from: a */
        public final void mo67618a() {
            this.f26976a.f26958o = true;
            this.f26976a.m32682c("Ads successfully loaded!");
            this.f26976a.m32682c("Triggering onAdLoaded() callback");
            this.f26976a.m32695m();
            C10578h b = this.f26976a.mo67816b();
            if (b != null) {
                b.mo67351d();
            }
        }

        /* renamed from: b */
        public final void mo67620b() {
            this.f26976a.m32682c("Failed to load (precaching failed)");
            this.f26976a.m32670a(0);
        }

        /* renamed from: a */
        public final void mo67619a(C10483eb ebVar) {
            C10765mq.m32773b(ebVar, "ad");
            this.f26976a.m32682c(C10765mq.m32765a("Do not precache ad ", (Object) ebVar.mo67234f()));
            this.f26976a.f26960q.remove(ebVar);
        }
    }

    /* renamed from: b */
    public final void mo67622b(C10483eb ebVar) {
        C10765mq.m32773b(ebVar, "ad");
        m32682c(C10765mq.m32765a("Unload ad ", (Object) ebVar.mo67234f()));
        this.f26958o = false;
        this.f26960q.remove(ebVar);
    }

    /* renamed from: a */
    public final void mo67813a(C10832t tVar) {
        C10765mq.m32773b(tVar, "showAction");
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f26955l.mo67288b());
        sb.append("][show] Showing ad unit [");
        AdConfig adConfig = this.f26946c;
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        OguryIntegrationLogger.m30996d(sb.toString());
        C10618id.m32364a();
        if (this.f26953j.mo67679a(this.f26961r, this.f26958o, this.f26960q)) {
            this.f26967x = false;
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(this.f26955l.mo67288b());
            sb2.append("][show][");
            AdConfig adConfig2 = this.f26946c;
            sb2.append(adConfig2 == null ? null : adConfig2.getAdUnitId());
            sb2.append("] SHOW event");
            OguryIntegrationLogger.m30996d(sb2.toString());
            C10483eb ebVar = (C10483eb) C10692km.m32656b(this.f26960q);
            if (ebVar != null) {
                str = ebVar.mo67212A();
            }
            C10445di.m31608a((C10444dh) new C10454dk("SHOW", str));
            this.f26958o = false;
            List<C10483eb> list = this.f26960q;
            this.f26957n.mo67608a(list.size());
            this.f26957n.mo67610a((C10729lj<C10684ke>) new C10717k(this));
            for (C10483eb b : list) {
                C10586hg.m32205a(b.mo67222b(), new C10718l(this));
            }
            tVar.mo67135a(this.f26945b, C10692km.m32655a(list));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$k */
    /* synthetic */ class C10717k extends C10764mp implements C10729lj<C10684ke> {
        C10717k(Object obj) {
            super(0, obj, C10706l.class, "onAdClosed", "onAdClosed()V");
        }

        /* renamed from: h */
        private void m32727h() {
            ((C10706l) this.f26984a).m32693k();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m32727h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$l */
    /* synthetic */ class C10718l extends C10764mp implements C10730lk<C10585hf, C10684ke> {
        C10718l(Object obj) {
            super(1, obj, C10706l.class, "sendShowEvent", "sendShowEvent(Lio/presage/mraid/MraidEvent;)V");
        }

        /* renamed from: a */
        private void m32729a(C10585hf hfVar) {
            C10765mq.m32773b(hfVar, "p0");
            ((C10706l) this.f26984a).m32673a(hfVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m32729a((C10585hf) obj);
            return C10684ke.f26938a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32673a(C10585hf hfVar) {
        this.f26957n.mo67609a(hfVar, this.f26955l, this.f26946c, this.f26961r, this.f26964u, this.f26962s);
    }

    /* renamed from: e */
    public final void mo67820e() {
        m32682c("Reset existing cache");
        this.f26966w = true;
        m32694l();
        this.f26951h.mo67616a((C10622ig) this);
        C10424cz.m31537a(this.f26968y);
        this.f26961r = null;
        this.f26964u = null;
        this.f26968y = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m32693k() {
        m32694l();
        this.f26961r = null;
        this.f26964u = null;
    }

    /* renamed from: l */
    private final void m32694l() {
        for (C10483eb b : this.f26960q) {
            C10586hg.m32204a(b.mo67222b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32670a(int i) {
        m32682c("Triggering onAdError() callback");
        m32695m();
        C10578h hVar = this.f26961r;
        if (hVar != null) {
            hVar.mo67348a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m32695m() {
        if (this.f26961r == null) {
            m32682c("No ad listener registered");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m32682c(String str) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f26955l.mo67288b());
        sb.append("][load][");
        AdConfig adConfig = this.f26946c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] ");
        sb.append(str);
        OguryIntegrationLogger.m30996d(sb.toString());
    }
}
