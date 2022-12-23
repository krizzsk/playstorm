package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10389ca;
import com.ogury.p376ed.internal.C10420cw;
import java.util.Iterator;
import java.util.List;
import p394io.presage.common.AdConfig;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.bv */
public final class C10379bv {

    /* renamed from: a */
    private final Context f26290a;

    /* renamed from: b */
    private final C10377bt f26291b;

    /* renamed from: c */
    private final C10746m f26292c;

    /* renamed from: d */
    private final C10393cd f26293d;

    /* renamed from: e */
    private final C10403ck f26294e;

    /* renamed from: f */
    private final C10531fn f26295f;

    /* renamed from: g */
    private final C10389ca.C10390a f26296g;

    /* renamed from: h */
    private C10578h f26297h;

    /* renamed from: i */
    private C10679k f26298i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10374bs f26299j;

    /* renamed from: k */
    private C10706l f26300k;

    private C10379bv(Context context, C10377bt btVar, C10746m mVar, C10393cd cdVar, C10403ck ckVar, C10531fn fnVar, C10389ca.C10390a aVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(btVar, "adControllerFactory");
        C10765mq.m32773b(mVar, "adsSourceFactory");
        C10765mq.m32773b(cdVar, "publisherActivityFilter");
        C10765mq.m32773b(ckVar, "publisherFragmentFilter");
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(aVar, "positionCalculatorFactory");
        this.f26290a = context;
        this.f26291b = btVar;
        this.f26292c = mVar;
        this.f26293d = cdVar;
        this.f26294e = ckVar;
        this.f26295f = fnVar;
        this.f26296g = aVar;
    }

    private /* synthetic */ C10379bv(Context context, C10377bt btVar, C10746m mVar) {
        this(context, btVar, mVar, new C10393cd(), new C10403ck(), C10531fn.f26635a, C10389ca.f26316a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10379bv(Context context, AdConfig adConfig) {
        this(context, new C10377bt(InterstitialActivity.f29347a), new C10746m(context, adConfig, C10491ej.OVERLAY_THUMBNAIL));
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(adConfig, "adConfig");
    }

    /* renamed from: a */
    public final void mo67126a(String str) {
        C10765mq.m32773b(str, "campaignId");
        this.f26292c.mo67844a(str);
    }

    /* renamed from: b */
    public final void mo67132b(String str) {
        C10765mq.m32773b(str, "creativeId");
        this.f26292c.mo67845b(str);
    }

    /* renamed from: a */
    public final boolean mo67129a() {
        C10706l lVar = this.f26300k;
        if (lVar == null) {
            return false;
        }
        return lVar.mo67815a();
    }

    /* renamed from: a */
    public final void mo67124a(C10578h hVar) {
        OguryIntegrationLogger.m30996d("[Ads][Thumbnail] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][Thumbnail] Ad listener is null");
        }
        this.f26297h = hVar;
        C10706l lVar = this.f26300k;
        if (lVar != null) {
            lVar.mo67810a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo67125a(C10679k kVar) {
        this.f26298i = kVar;
        C10706l lVar = this.f26300k;
        if (lVar != null) {
            lVar.mo67811a(kVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$b */
    static final class C10381b extends C10766mr implements C10730lk<C10503eu, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10379bv f26302a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10381b(C10379bv bvVar) {
            super(1);
            this.f26302a = bvVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31436a((C10503eu) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31436a(C10503eu euVar) {
            C10765mq.m32773b(euVar, "it");
            this.f26302a.mo67121a(euVar.mo67328d(), euVar.mo67330e());
        }
    }

    /* renamed from: b */
    public final void mo67130b() {
        m31419d().mo67170b(new C10381b(this));
    }

    /* renamed from: a */
    public final void mo67121a(int i, int i2) {
        C10706l lVar = this.f26300k;
        boolean z = true;
        if (lVar == null || !lVar.mo67818c()) {
            z = false;
        }
        if (z) {
            C10374bs bsVar = this.f26299j;
            if (bsVar != null) {
                bsVar.mo67115a();
            }
            C10706l lVar2 = this.f26300k;
            if (lVar2 != null) {
                lVar2.mo67820e();
            }
        }
        m31418c();
        m31417b(i, i2);
        C10706l lVar3 = this.f26300k;
        if (lVar3 != null) {
            lVar3.mo67819d();
        }
    }

    /* renamed from: b */
    private final void m31417b(int i, int i2) {
        C10706l a = this.f26292c.mo67843a();
        this.f26300k = a;
        if (a != null) {
            a.mo67810a(this.f26297h);
        }
        C10706l lVar = this.f26300k;
        if (lVar != null) {
            lVar.mo67811a(this.f26298i);
        }
        C10706l lVar2 = this.f26300k;
        if (lVar2 != null) {
            lVar2.mo67809a(new C10501es(i, i2));
        }
    }

    /* renamed from: c */
    private final void m31418c() {
        C10377bt btVar = this.f26291b;
        Context applicationContext = this.f26290a.getApplicationContext();
        if (applicationContext != null) {
            this.f26299j = btVar.mo67118a((Application) applicationContext, this.f26293d, this.f26294e);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: com.ogury.ed.internal.bv$c */
    static final class C10382c extends C10766mr implements C10730lk<C10503eu, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ C10379bv f26303a;

        /* renamed from: b */
        final /* synthetic */ Activity f26304b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10382c(C10379bv bvVar, Activity activity) {
            super(1);
            this.f26303a = bvVar;
            this.f26304b = activity;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31438a((C10503eu) obj);
            return C10684ke.f26938a;
        }

        /* renamed from: a */
        private void m31438a(C10503eu euVar) {
            C10765mq.m32773b(euVar, "it");
            this.f26303a.mo67123a(this.f26304b, new C10387bz(euVar.mo67322a(), euVar.mo67324b(), euVar.mo67326c()));
        }
    }

    /* renamed from: a */
    public final void mo67122a(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        m31419d().mo67170b(new C10382c(this, activity));
    }

    /* renamed from: com.ogury.ed.internal.bv$a */
    static final class C10380a extends C10766mr implements C10729lj<C10503eu> {

        /* renamed from: a */
        final /* synthetic */ C10379bv f26301a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10380a(C10379bv bvVar) {
            super(0);
            this.f26301a = bvVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            return m31434b();
        }

        /* renamed from: b */
        private static C10503eu m31434b() {
            C10530fm a = C10531fn.m32004a();
            C10503eu p = a == null ? null : a.mo67441p();
            return p == null ? new C10503eu() : p;
        }
    }

    /* renamed from: d */
    private final C10420cw<C10503eu> m31419d() {
        C10420cw.C10421a aVar = C10420cw.f26359a;
        return C10420cw.C10421a.m31531a(new C10380a(this));
    }

    /* renamed from: a */
    public final void mo67123a(Activity activity, C10387bz bzVar) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(bzVar, "overlayPosition");
        if (this.f26300k == null) {
            OguryIntegrationLogger.m30997e("[Ads][Thumbnail][show] Failed to show (no ad loaded)");
            C10578h hVar = this.f26297h;
            if (hVar != null) {
                hVar.mo67352e();
            }
        }
        C10706l lVar = this.f26300k;
        if (lVar != null) {
            lVar.mo67813a((C10832t) new C10383d(this, activity, bzVar));
        }
    }

    /* renamed from: com.ogury.ed.internal.bv$d */
    public static final class C10383d implements C10832t {

        /* renamed from: a */
        final /* synthetic */ C10379bv f26305a;

        /* renamed from: b */
        final /* synthetic */ Activity f26306b;

        /* renamed from: c */
        final /* synthetic */ C10387bz f26307c;

        C10383d(C10379bv bvVar, Activity activity, C10387bz bzVar) {
            this.f26305a = bvVar;
            this.f26306b = activity;
            this.f26307c = bzVar;
        }

        /* renamed from: a */
        public final void mo67135a(Context context, List<C10483eb> list) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
            C10502et a = C10379bv.m31416b(list);
            C10389ca a2 = C10389ca.C10390a.m31452a(this.f26306b);
            int a3 = a2.mo67144a(this.f26307c, a);
            int b = a2.mo67145b(this.f26307c, a);
            C10374bs a4 = this.f26305a.f26299j;
            if (a4 != null) {
                a4.mo67116a(this.f26306b, a3, b, list);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C10502et m31416b(List<C10483eb> list) {
        C10502et etVar;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            etVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((C10483eb) obj).mo67262u()) {
                break;
            }
        }
        C10483eb ebVar = (C10483eb) obj;
        if (ebVar != null) {
            etVar = ebVar.mo67247l();
        }
        return etVar == null ? new C10502et() : etVar;
    }

    /* renamed from: a */
    public final void mo67128a(String[] strArr) {
        C10765mq.m32773b(strArr, "packages");
        this.f26293d.mo67149a(C10686kg.m32641b(strArr));
    }

    /* renamed from: a */
    public final void mo67127a(Class<? extends Activity>[] clsArr) {
        C10765mq.m32773b(clsArr, "activities");
        this.f26293d.mo67151b(C10686kg.m32641b(clsArr));
    }

    /* renamed from: b */
    public final void mo67134b(String[] strArr) {
        C10765mq.m32773b(strArr, "packages");
        this.f26294e.mo67156a(C10686kg.m32637a(strArr));
    }

    /* renamed from: b */
    public final void mo67133b(Class<? extends Object>[] clsArr) {
        C10765mq.m32773b(clsArr, "fragments");
        this.f26294e.mo67158b(C10686kg.m32637a(clsArr));
    }

    /* renamed from: b */
    public final void mo67131b(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        C10395cf cfVar = C10395cf.f26322a;
        C10395cf.m31462a(activity, this.f26293d, this.f26294e);
    }
}
