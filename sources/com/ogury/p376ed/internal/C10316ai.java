package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.ai */
public final class C10316ai {

    /* renamed from: a */
    private final Application f26137a;

    /* renamed from: b */
    private Application.ActivityLifecycleCallbacks f26138b;

    public C10316ai(Application application) {
        C10765mq.m32773b(application, "application");
        this.f26137a = application;
    }

    /* renamed from: com.ogury.ed.internal.ai$a */
    public static final class C10317a extends C10422cx {

        /* renamed from: a */
        final /* synthetic */ C10546g f26139a;

        /* renamed from: b */
        final /* synthetic */ C10316ai f26140b;

        C10317a(C10546g gVar, C10316ai aiVar) {
            this.f26139a = gVar;
            this.f26140b = aiVar;
        }

        public final void onActivityPaused(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            this.f26139a.mo67454a();
        }

        public final void onActivityResumed(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            this.f26140b.mo67017a();
            C10546g gVar = this.f26139a;
            activity.addContentView(gVar, gVar.getLayoutParams());
        }
    }

    /* renamed from: a */
    public final void mo67018a(C10546g gVar) {
        C10765mq.m32773b(gVar, "adLayout");
        Application.ActivityLifecycleCallbacks aVar = new C10317a(gVar, this);
        this.f26138b = aVar;
        this.f26137a.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: a */
    public final void mo67017a() {
        this.f26137a.unregisterActivityLifecycleCallbacks(this.f26138b);
    }
}
