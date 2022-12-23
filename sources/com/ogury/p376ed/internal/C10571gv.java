package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gv */
public final class C10571gv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InterstitialActivity f26687a;

    /* renamed from: b */
    private final Intent f26688b;

    /* renamed from: c */
    private final C10483eb f26689c;

    /* renamed from: d */
    private final List<C10483eb> f26690d;

    /* renamed from: e */
    private final C10570gu f26691e;

    /* renamed from: f */
    private final C10344aw f26692f;

    /* renamed from: g */
    private C10546g f26693g;

    /* renamed from: h */
    private C10318aj f26694h;

    private C10571gv(InterstitialActivity interstitialActivity, Intent intent, C10483eb ebVar, List<C10483eb> list, C10570gu guVar, C10344aw awVar) {
        C10765mq.m32773b(interstitialActivity, "activity");
        C10765mq.m32773b(intent, SDKConstants.PARAM_INTENT);
        C10765mq.m32773b(ebVar, "ad");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        C10765mq.m32773b(guVar, "adControllerFactory");
        C10765mq.m32773b(awVar, "expandCacheStore");
        this.f26687a = interstitialActivity;
        this.f26688b = intent;
        this.f26689c = ebVar;
        this.f26690d = list;
        this.f26691e = guVar;
        this.f26692f = awVar;
        int intExtra = intent.getIntExtra("mode", 0);
        if (intExtra == 0) {
            m32126c();
        } else if (intExtra == 1) {
            m32127d();
        } else {
            throw new IllegalStateException(C10765mq.m32765a("Wrong mode ", (Object) Integer.valueOf(intExtra)));
        }
        m32128e();
        m32129f();
    }

    public /* synthetic */ C10571gv(InterstitialActivity interstitialActivity, Intent intent, C10483eb ebVar, List list) {
        this(interstitialActivity, intent, ebVar, list, C10570gu.f26686a, C10344aw.f26217a);
    }

    /* renamed from: a */
    public final C10546g mo67510a() {
        C10546g gVar = this.f26693g;
        if (gVar != null) {
            return gVar;
        }
        C10765mq.m32771a("adLayout");
        return null;
    }

    /* renamed from: b */
    public final C10318aj mo67511b() {
        C10318aj ajVar = this.f26694h;
        if (ajVar != null) {
            return ajVar;
        }
        C10765mq.m32771a("adController");
        return null;
    }

    /* renamed from: c */
    private final void m32126c() {
        Context applicationContext = this.f26687a.getApplicationContext();
        C10765mq.m32770a((Object) applicationContext, "activity.applicationContext");
        C10546g gVar = new C10546g(applicationContext);
        this.f26693g = gVar;
        InterstitialActivity interstitialActivity = this.f26687a;
        C10318aj ajVar = null;
        if (gVar == null) {
            C10765mq.m32771a("adLayout");
            gVar = null;
        }
        C10318aj a = C10570gu.m32124a(interstitialActivity, gVar, new C10336ao(this.f26689c.mo67264w(), InterstitialActivity.f29347a));
        this.f26694h = a;
        if (a == null) {
            C10765mq.m32771a("adController");
            a = null;
        }
        a.mo67024a((C10342au) new C10575gx());
        boolean a2 = this.f26689c.mo67247l().mo67318a();
        String a3 = this.f26689c.mo67249m().mo67292a();
        C10318aj ajVar2 = this.f26694h;
        if (ajVar2 == null) {
            C10765mq.m32771a("adController");
            ajVar2 = null;
        }
        Application application = this.f26687a.getApplication();
        C10765mq.m32770a((Object) application, "activity.application");
        ajVar2.mo67023a((C10334am) new C10339ar(new C10316ai(application), this.f26687a, new C10335an(), a2, a3));
        C10318aj ajVar3 = this.f26694h;
        if (ajVar3 == null) {
            C10765mq.m32771a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo67025a(this.f26689c, this.f26690d);
    }

    /* renamed from: d */
    private final void m32127d() {
        C10316ai aiVar;
        C10343av a = C10344aw.m31300a(this.f26688b.getStringExtra("expand_cache_item_id"));
        if (a != null) {
            this.f26693g = a.mo67084c();
            this.f26694h = a.mo67085d();
            C10546g gVar = null;
            if (C10494el.m31815a(this.f26689c)) {
                Application application = this.f26687a.getApplication();
                C10765mq.m32770a((Object) application, "activity.application");
                aiVar = new C10316ai(application);
            } else {
                aiVar = null;
            }
            if (a.mo67082a().mo67291e()) {
                C10318aj ajVar = this.f26694h;
                if (ajVar == null) {
                    C10765mq.m32771a("adController");
                    ajVar = null;
                }
                FrameLayout b = a.mo67083b();
                Activity activity = this.f26687a;
                C10318aj ajVar2 = this.f26694h;
                if (ajVar2 == null) {
                    C10765mq.m32771a("adController");
                    ajVar2 = null;
                }
                ajVar.mo67023a((C10334am) new C10338aq(b, activity, ajVar2.mo67029b()));
            } else {
                C10318aj ajVar3 = this.f26694h;
                if (ajVar3 == null) {
                    C10765mq.m32771a("adController");
                    ajVar3 = null;
                }
                Activity activity2 = this.f26687a;
                C10318aj ajVar4 = this.f26694h;
                if (ajVar4 == null) {
                    C10765mq.m32771a("adController");
                    ajVar4 = null;
                }
                ajVar3.mo67023a((C10334am) new C10339ar(aiVar, activity2, ajVar4.mo67029b(), this.f26689c.mo67247l().mo67318a(), this.f26689c.mo67249m().mo67292a()));
            }
            C10546g gVar2 = this.f26693g;
            if (gVar2 == null) {
                C10765mq.m32771a("adLayout");
            } else {
                gVar = gVar2;
            }
            gVar.mo67459d();
            return;
        }
        throw new IllegalStateException("Cache Item not found");
    }

    /* renamed from: com.ogury.ed.internal.gv$b */
    public static final class C10573b implements C10334am {

        /* renamed from: a */
        final /* synthetic */ C10571gv f26697a;

        C10573b(C10571gv gvVar) {
            this.f26697a = gvVar;
        }

        /* renamed from: a */
        public final void mo67001a(C10546g gVar, C10318aj ajVar) {
            C10765mq.m32773b(gVar, "adLayout");
            C10765mq.m32773b(ajVar, "adController");
            this.f26697a.f26687a.mo75001a(ajVar.mo67037f());
        }
    }

    /* renamed from: e */
    private final void m32128e() {
        C10318aj ajVar = this.f26694h;
        if (ajVar == null) {
            C10765mq.m32771a("adController");
            ajVar = null;
        }
        ajVar.mo67032c((C10334am) new C10573b(this));
    }

    /* renamed from: f */
    private final void m32129f() {
        C10334am amVar;
        C10318aj ajVar = null;
        if (!C10494el.m31815a(this.f26689c)) {
            C10318aj ajVar2 = this.f26694h;
            if (ajVar2 == null) {
                C10765mq.m32771a("adController");
                ajVar2 = null;
            }
            amVar = ajVar2.mo67029b();
        } else {
            amVar = null;
        }
        C10318aj ajVar3 = this.f26694h;
        if (ajVar3 == null) {
            C10765mq.m32771a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo67030b((C10334am) new C10572a(amVar, this));
    }

    /* renamed from: com.ogury.ed.internal.gv$a */
    public static final class C10572a implements C10334am {

        /* renamed from: a */
        final /* synthetic */ C10334am f26695a;

        /* renamed from: b */
        final /* synthetic */ C10571gv f26696b;

        C10572a(C10334am amVar, C10571gv gvVar) {
            this.f26695a = amVar;
            this.f26696b = gvVar;
        }

        /* renamed from: a */
        public final void mo67001a(C10546g gVar, C10318aj ajVar) {
            C10765mq.m32773b(gVar, "adLayout");
            C10765mq.m32773b(ajVar, "adController");
            C10334am amVar = this.f26695a;
            if (amVar != null) {
                amVar.mo67001a(gVar, ajVar);
            }
            this.f26696b.f26687a.finish();
        }
    }
}
