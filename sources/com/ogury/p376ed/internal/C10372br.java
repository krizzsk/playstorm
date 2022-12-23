package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.br */
public final class C10372br implements C10384bw {

    /* renamed from: a */
    private final Activity f26268a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10378bu f26269b;

    /* renamed from: c */
    private final C10371bq f26270c;

    /* renamed from: d */
    private final C10560gm f26271d;

    /* renamed from: e */
    private final Application f26272e;

    /* renamed from: f */
    private Application.ActivityLifecycleCallbacks f26273f;

    private C10372br(Activity activity, C10378bu buVar, C10371bq bqVar, C10560gm gmVar) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(buVar, "adLayoutController");
        C10765mq.m32773b(bqVar, "overlayActivityFilter");
        C10765mq.m32773b(gmVar, "topActivityMonitor");
        this.f26268a = activity;
        this.f26269b = buVar;
        this.f26270c = bqVar;
        this.f26271d = gmVar;
        this.f26272e = activity.getApplication();
    }

    /* renamed from: a */
    public final C10371bq mo67111a() {
        return this.f26270c;
    }

    public /* synthetic */ C10372br(Activity activity, C10378bu buVar, C10371bq bqVar) {
        this(activity, buVar, bqVar, C10560gm.f26679a);
    }

    /* renamed from: com.ogury.ed.internal.br$a */
    public static final class C10373a extends C10422cx {

        /* renamed from: a */
        final /* synthetic */ C10372br f26274a;

        C10373a(C10372br brVar) {
            this.f26274a = brVar;
        }

        public final void onActivityPaused(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            if (!(activity instanceof C10431dd)) {
                this.f26274a.f26269b.mo67119a();
            }
        }

        public final void onActivityResumed(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            if (!(activity instanceof C10431dd)) {
                this.f26274a.m31394a(activity);
            }
        }
    }

    /* renamed from: b */
    public final void mo67112b() {
        Application.ActivityLifecycleCallbacks aVar = new C10373a(this);
        this.f26273f = aVar;
        this.f26272e.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: c */
    public final void mo67113c() {
        Activity a = C10560gm.m32095a();
        if (a == null) {
            a = this.f26268a;
        }
        m31394a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31394a(Activity activity) {
        if (this.f26270c.mo67110b(activity)) {
            this.f26269b.mo67120a(activity);
        }
    }

    /* renamed from: d */
    public final void mo67114d() {
        this.f26272e.unregisterActivityLifecycleCallbacks(this.f26273f);
    }
}
