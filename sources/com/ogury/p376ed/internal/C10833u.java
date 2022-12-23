package com.ogury.p376ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.u */
public final class C10833u {

    /* renamed from: a */
    public static final C10834a f27051a = new C10834a((byte) 0);

    /* renamed from: b */
    private final Application f27052b;

    /* renamed from: c */
    private final C10337ap f27053c;

    /* renamed from: d */
    private C10546g f27054d;

    /* renamed from: e */
    private final C10844z f27055e;

    /* renamed from: f */
    private final C10306ab f27056f;

    /* renamed from: g */
    private C10318aj f27057g;

    /* renamed from: h */
    private boolean f27058h;

    /* renamed from: i */
    private FrameLayout f27059i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10833u(android.app.Application r8, com.ogury.p376ed.internal.C10337ap r9) {
        /*
            r7 = this;
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            com.ogury.ed.internal.g r4 = com.ogury.p376ed.internal.C10833u.C10834a.m32892a(r0)
            com.ogury.ed.internal.z r5 = new com.ogury.ed.internal.z
            r5.<init>(r9)
            com.ogury.ed.internal.ab r6 = new com.ogury.ed.internal.ab
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "<init>"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r0, (java.lang.String) r1)
            r6.<init>(r4, r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10833u.<init>(android.app.Application, com.ogury.ed.internal.ap):void");
    }

    private C10833u(Application application, C10337ap apVar, C10546g gVar, C10844z zVar, C10306ab abVar) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(zVar, "adControllerFactory");
        C10765mq.m32773b(abVar, "sizeCalculator");
        this.f27052b = application;
        this.f27053c = apVar;
        this.f27054d = gVar;
        this.f27055e = zVar;
        this.f27056f = abVar;
        this.f27057g = m32886c();
    }

    /* renamed from: com.ogury.ed.internal.u$a */
    public static final class C10834a {
        public /* synthetic */ C10834a(byte b) {
            this();
        }

        private C10834a() {
        }

        /* renamed from: a */
        public static C10546g m32892a(Context context) {
            C10765mq.m32773b(context, "context");
            C10546g gVar = new C10546g(context);
            gVar.setupDrag(false);
            return gVar;
        }
    }

    /* renamed from: com.ogury.ed.internal.u$b */
    public static final class C10835b implements C10334am {

        /* renamed from: a */
        final /* synthetic */ C10833u f27060a;

        C10835b(C10833u uVar) {
            this.f27060a = uVar;
        }

        /* renamed from: a */
        public final void mo67001a(C10546g gVar, C10318aj ajVar) {
            C10765mq.m32773b(gVar, "adLayout");
            C10765mq.m32773b(ajVar, "adController");
            this.f27060a.m32887d();
        }
    }

    /* renamed from: c */
    private final C10318aj m32886c() {
        C10318aj a = this.f27055e.mo67900a(this.f27052b, this.f27054d);
        a.mo67030b((C10334am) new C10835b(this));
        a.mo67024a((C10342au) new C10308ad(new C10836c(this)));
        a.mo67023a((C10334am) new C10305aa());
        return a;
    }

    /* renamed from: com.ogury.ed.internal.u$c */
    /* synthetic */ class C10836c extends C10764mp implements C10741lv<C10483eb, List<C10483eb>, C10684ke> {
        C10836c(Object obj) {
            super(2, obj, C10833u.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m32894a(C10483eb ebVar, List<C10483eb> list) {
            C10765mq.m32773b(ebVar, "p0");
            C10765mq.m32773b(list, "p1");
            ((C10833u) this.f26984a).m32883a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67117a(Object obj, Object obj2) {
            m32894a((C10483eb) obj, (List<C10483eb>) (List) obj2);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: a */
    public final void mo67886a(FrameLayout frameLayout, List<C10483eb> list) {
        C10765mq.m32773b(frameLayout, "bannerView");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        this.f27059i = frameLayout;
        try {
            C10483eb remove = list.remove(0);
            C10405cm.m31491a(list);
            if (remove.mo67262u()) {
                this.f27053c.mo67080a(this.f27052b, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m32882a(list.remove(0), frameLayout, list, true);
                    return;
                }
                return;
            }
            m32882a(remove, frameLayout, list, false);
        } catch (Throwable unused) {
            mo67889b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m32883a(C10483eb ebVar, List<C10483eb> list) {
        C10546g a = C10834a.m32892a(this.f27052b);
        this.f27054d = a;
        this.f27056f.mo67003a(a);
        this.f27057g = m32886c();
        m32882a(ebVar, this.f27059i, list, false);
    }

    /* renamed from: a */
    private final void m32882a(C10483eb ebVar, FrameLayout frameLayout, List<C10483eb> list, boolean z) {
        if (frameLayout != null) {
            C10318aj ajVar = this.f27057g;
            if (ajVar != null) {
                ajVar.mo67025a(ebVar, list);
            }
            this.f27058h = ebVar.mo67265x().mo67304a();
            frameLayout.addView(this.f27054d);
            OguryIntegrationLogger.m30996d("[Ads][" + ebVar.mo67264w().mo67288b() + "][show][" + ebVar.mo67249m().mo67292a() + "] Ad succefully attached to the banner view");
            OguryIntegrationLogger.m30996d("[Ads][" + ebVar.mo67264w().mo67288b() + "][show][" + ebVar.mo67249m().mo67292a() + "] Waiting for adding banner view in a layout...");
            m32881a(frameLayout, z);
        }
    }

    /* renamed from: a */
    private final void m32881a(FrameLayout frameLayout, boolean z) {
        C10318aj ajVar;
        if ((!frameLayout.hasWindowFocus() || z) && (ajVar = this.f27057g) != null) {
            ajVar.mo67046o();
        }
    }

    /* renamed from: a */
    public final void mo67887a(C10407cn cnVar) {
        C10765mq.m32773b(cnVar, "adSize");
        C10318aj ajVar = this.f27057g;
        this.f27056f.mo67002a(cnVar, this.f27058h, ajVar == null ? false : ajVar.mo67041j());
    }

    /* renamed from: a */
    public final boolean mo67888a() {
        C10318aj ajVar = this.f27057g;
        if (ajVar == null) {
            return false;
        }
        return ajVar.mo67055x();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32887d() {
        this.f27054d.mo67454a();
        C10318aj ajVar = this.f27057g;
        if (ajVar != null) {
            ajVar.mo67042k();
        }
        this.f27057g = null;
    }

    /* renamed from: b */
    public final void mo67889b() {
        C10318aj ajVar = this.f27057g;
        if (ajVar != null) {
            if (ajVar.mo67055x()) {
                ajVar.mo67056y();
                ajVar.mo67035d();
            } else {
                ajVar.mo67054w();
            }
            ajVar.mo67043l();
        }
    }
}
