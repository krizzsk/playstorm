package com.ogury.p376ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11286Ad;
import java.util.List;
import p394io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.j */
public final class C10650j {

    /* renamed from: a */
    private final Context f26882a;

    /* renamed from: b */
    private final C10538fu f26883b;

    /* renamed from: c */
    private final C10549gb f26884c;

    /* renamed from: d */
    private final C10491ej f26885d;

    /* renamed from: e */
    private final C10531fn f26886e;

    /* renamed from: f */
    private final PresageSdk f26887f;

    /* renamed from: g */
    private final C10831s f26888g;

    /* renamed from: h */
    private C10530fm f26889h;

    private C10650j(Context context, C10538fu fuVar, C10549gb gbVar, C10491ej ejVar, C10531fn fnVar, PresageSdk presageSdk, C10831s sVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(fuVar, "appBackgroundChecker");
        C10765mq.m32773b(gbVar, "internetChecker");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(presageSdk, "presageSdk");
        C10765mq.m32773b(sVar, "oguryAds");
        this.f26882a = context;
        this.f26883b = fuVar;
        this.f26884c = gbVar;
        this.f26885d = ejVar;
        this.f26886e = fnVar;
        this.f26887f = presageSdk;
        this.f26888g = sVar;
    }

    public /* synthetic */ C10650j(Context context, C10538fu fuVar, C10549gb gbVar, C10491ej ejVar) {
        this(context, fuVar, gbVar, ejVar, C10531fn.f26635a, PresageSdk.f29336a, C10831s.f27048a);
    }

    /* renamed from: a */
    public final boolean mo67679a(C10578h hVar, boolean z, List<C10483eb> list) {
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        if (m32550a()) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (module not set up)");
            m32549a(hVar, 5);
            return false;
        }
        this.f26889h = C10531fn.m32005a(this.f26882a);
        if (!z || list.isEmpty()) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m30996d("[Ads][" + this.f26885d.mo67288b() + "][show] Triggering onAdError() callback");
            if (hVar == null) {
                OguryIntegrationLogger.m30996d("[Ads][" + this.f26885d.mo67288b() + "][show] No ad listener registered");
            }
            if (hVar != null) {
                hVar.mo67352e();
            }
            return false;
        }
        for (Number intValue : C10692km.m32649b(3, 2, 7, 8, 1)) {
            int intValue2 = intValue.intValue();
            if (m32551a(intValue2)) {
                m32552b(intValue2);
                m32549a(hVar, intValue2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m32551a(int i) {
        if (i == 1) {
            return mo67680b();
        }
        if (i == 2) {
            return m32554d();
        }
        if (i == 3) {
            return m32553c();
        }
        if (i == 7) {
            return m32558h();
        }
        if (i == 8) {
            return m32557g();
        }
        OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (error code: " + i + ')');
        throw new IllegalArgumentException(C10765mq.m32765a("Illegal argument ", (Object) Integer.valueOf(i)));
    }

    /* renamed from: b */
    private final void m32552b(int i) {
        if (i == 1) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (No Internet connection)");
        } else if (i == 2) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (Ad serving has been disabled)");
        } else if (i == 3) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (missing configuration)");
        } else if (i == 7) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (Activity in background)");
        } else if (i == 8) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26885d.mo67288b() + "][show] Failed to show (Another ad already displayed)");
        }
    }

    /* renamed from: a */
    public static boolean m32550a() {
        return !PresageSdk.m34607b();
    }

    /* renamed from: c */
    private final boolean m32553c() {
        return this.f26889h == null;
    }

    /* renamed from: d */
    private final boolean m32554d() {
        if (!m32553c()) {
            C10530fm fmVar = this.f26889h;
            return fmVar != null && !fmVar.mo67416b();
        }
    }

    /* renamed from: e */
    private final boolean m32555e() {
        return this.f26885d.mo67289c() && C10831s.m32878b();
    }

    /* renamed from: f */
    private final boolean m32556f() {
        return this.f26885d.mo67290d() && C10831s.m32876a();
    }

    /* renamed from: g */
    private final boolean m32557g() {
        return m32555e() || m32556f();
    }

    /* renamed from: b */
    public final boolean mo67680b() {
        return !this.f26884c.mo67495a(this.f26882a);
    }

    /* renamed from: h */
    private boolean m32558h() {
        return C10538fu.m32043a(this.f26882a);
    }

    /* renamed from: a */
    private final void m32549a(C10578h hVar, int i) {
        OguryIntegrationLogger.m30996d("[Ads][" + this.f26885d.mo67288b() + "][show] Triggering onAdError() callback");
        if (hVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][" + this.f26885d.mo67288b() + "][show] No ad listener registered");
        }
        if (hVar != null) {
            hVar.mo67348a(i);
        }
    }
}
