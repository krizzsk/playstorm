package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bs */
public final class C10374bs {

    /* renamed from: a */
    private final Application f26275a;

    /* renamed from: b */
    private final C10385bx f26276b;

    /* renamed from: c */
    private final C10337ap f26277c;

    /* renamed from: d */
    private C10384bw f26278d;

    /* renamed from: e */
    private C10546g f26279e;

    /* renamed from: f */
    private final C10386by f26280f;

    /* renamed from: g */
    private final C10369bp f26281g;

    /* renamed from: h */
    private C10318aj f26282h;

    /* renamed from: i */
    private C10648iz f26283i;

    /* renamed from: j */
    private Activity f26284j;

    private C10374bs(Application application, C10385bx bxVar, C10337ap apVar, C10546g gVar, C10386by byVar, C10369bp bpVar) {
        C10765mq.m32773b(application, "application");
        C10765mq.m32773b(bxVar, "overlayInjectorFactory");
        C10765mq.m32773b(apVar, "interstitialShowCommand");
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(byVar, "mraidAdControllerFactory");
        C10765mq.m32773b(bpVar, "positionManager");
        this.f26275a = application;
        this.f26276b = bxVar;
        this.f26277c = apVar;
        this.f26278d = null;
        this.f26279e = gVar;
        this.f26280f = byVar;
        this.f26281g = bpVar;
        this.f26283i = new C10648iz();
        this.f26279e.setContainsOverlayAd(true);
        this.f26282h = m31404b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10374bs(android.app.Application r8, com.ogury.p376ed.internal.C10385bx r9, com.ogury.p376ed.internal.C10337ap r10) {
        /*
            r7 = this;
            com.ogury.ed.internal.g r4 = new com.ogury.ed.internal.g
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "constructor(\n    private…Controller = null\n    }\n}"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r0, (java.lang.String) r1)
            r4.<init>(r0)
            com.ogury.ed.internal.by r5 = new com.ogury.ed.internal.by
            r5.<init>(r10)
            com.ogury.ed.internal.bp r6 = com.ogury.p376ed.internal.C10369bp.f26259a
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10374bs.<init>(android.app.Application, com.ogury.ed.internal.bx, com.ogury.ed.internal.ap):void");
    }

    /* renamed from: b */
    private final C10318aj m31404b() {
        C10318aj a = this.f26280f.mo67137a(this.f26275a, this.f26279e);
        a.mo67023a((C10334am) new C10341at());
        a.mo67030b((C10334am) new C10375a(this));
        a.mo67024a((C10342au) new C10394ce(new C10376b(this)));
        return a;
    }

    /* renamed from: com.ogury.ed.internal.bs$a */
    public static final class C10375a implements C10334am {

        /* renamed from: a */
        final /* synthetic */ C10374bs f26285a;

        C10375a(C10374bs bsVar) {
            this.f26285a = bsVar;
        }

        /* renamed from: a */
        public final void mo67001a(C10546g gVar, C10318aj ajVar) {
            C10765mq.m32773b(gVar, "adLayout");
            C10765mq.m32773b(ajVar, "adController");
            this.f26285a.mo67115a();
        }
    }

    /* renamed from: com.ogury.ed.internal.bs$b */
    /* synthetic */ class C10376b extends C10764mp implements C10741lv<C10483eb, List<C10483eb>, C10684ke> {
        C10376b(Object obj) {
            super(2, obj, C10374bs.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m31408a(C10483eb ebVar, List<C10483eb> list) {
            C10765mq.m32773b(ebVar, "p0");
            C10765mq.m32773b(list, "p1");
            ((C10374bs) this.f26984a).m31401a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo67117a(Object obj, Object obj2) {
            m31408a((C10483eb) obj, (List<C10483eb>) (List) obj2);
            return C10684ke.f26938a;
        }
    }

    /* renamed from: a */
    public final void mo67116a(Activity activity, int i, int i2, List<C10483eb> list) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
        this.f26284j = activity;
        try {
            C10483eb remove = list.remove(0);
            C10405cm.m31491a(list);
            this.f26283i.mo67669c(C10556gi.m32087b(i));
            this.f26283i.mo67671d(C10556gi.m32087b(i2));
            if (remove.mo67262u()) {
                this.f26277c.mo67080a(this.f26275a, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m31402a(list.remove(0), list, activity, false);
                    return;
                }
                return;
            }
            m31402a(remove, list, activity, true);
        } catch (Throwable unused) {
            mo67115a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31401a(C10483eb ebVar, List<C10483eb> list) {
        Activity activity = this.f26284j;
        if (activity != null) {
            C10546g gVar = new C10546g(this.f26275a);
            this.f26279e = gVar;
            gVar.setContainsOverlayAd(true);
            this.f26282h = m31404b();
            m31402a(ebVar, list, activity, true);
        }
    }

    /* renamed from: a */
    private final void m31402a(C10483eb ebVar, List<C10483eb> list, Activity activity, boolean z) {
        C10384bw bwVar;
        C10384bw bwVar2 = this.f26278d;
        if (bwVar2 != null) {
            bwVar2.mo67114d();
        }
        C10318aj ajVar = this.f26282h;
        if (ajVar != null) {
            this.f26278d = this.f26276b.mo67136a(activity, this.f26279e, ajVar);
            String a = ebVar.mo67249m().mo67292a();
            C10369bp.m31381a(this.f26279e, a);
            m31403a(a);
            ajVar.mo67025a(ebVar, list);
            if (z && (bwVar = this.f26278d) != null) {
                bwVar.mo67113c();
            }
            C10384bw bwVar3 = this.f26278d;
            if (bwVar3 != null) {
                bwVar3.mo67112b();
            }
        }
    }

    /* renamed from: a */
    private final void m31403a(String str) {
        Rect a = C10369bp.m31378a(str);
        if (a != null) {
            this.f26283i.mo67669c(a.left);
            this.f26283i.mo67671d(a.top);
        }
        C10318aj ajVar = this.f26282h;
        if (ajVar != null) {
            ajVar.mo67022a(this.f26283i.mo67670d(), this.f26283i.mo67672e());
        }
    }

    /* renamed from: a */
    public final void mo67115a() {
        C10384bw bwVar = this.f26278d;
        if (bwVar != null) {
            bwVar.mo67114d();
        }
        this.f26278d = null;
        this.f26279e.mo67454a();
        C10318aj ajVar = this.f26282h;
        if (ajVar != null) {
            ajVar.mo67042k();
        }
        this.f26282h = null;
    }
}
