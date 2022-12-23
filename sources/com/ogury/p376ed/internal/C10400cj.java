package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cj */
public final class C10400cj implements C10384bw {

    /* renamed from: a */
    private final C10378bu f26329a;

    /* renamed from: b */
    private final C10399ci f26330b;

    /* renamed from: c */
    private final C10560gm f26331c;

    /* renamed from: d */
    private FragmentActivity f26332d;

    /* renamed from: e */
    private final Application f26333e;

    /* renamed from: f */
    private final C10401a f26334f;

    /* renamed from: g */
    private final FragmentManager.OnBackStackChangedListener f26335g;

    /* renamed from: h */
    private final C10402b f26336h;

    private C10400cj(Activity activity, C10378bu buVar, C10399ci ciVar, C10560gm gmVar) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(buVar, "adLayoutController");
        C10765mq.m32773b(ciVar, "overlayFragmentFilter");
        C10765mq.m32773b(gmVar, "topActivityMonitor");
        this.f26329a = buVar;
        this.f26330b = ciVar;
        this.f26331c = gmVar;
        this.f26332d = (FragmentActivity) activity;
        this.f26333e = activity.getApplication();
        this.f26334f = new C10401a(this);
        this.f26335g = new FragmentManager.OnBackStackChangedListener() {
            public final void onBackStackChanged() {
                C10400cj.m31476a(C10400cj.this);
            }
        };
        this.f26336h = new C10402b(this);
    }

    public /* synthetic */ C10400cj(Activity activity, C10378bu buVar, C10399ci ciVar) {
        this(activity, buVar, ciVar, C10560gm.f26679a);
    }

    /* renamed from: com.ogury.ed.internal.cj$a */
    public static final class C10401a extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C10400cj f26337a;

        C10401a(C10400cj cjVar) {
            this.f26337a = cjVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31476a(C10400cj cjVar) {
        C10765mq.m32773b(cjVar, "this$0");
        FragmentManager supportFragmentManager = cjVar.f26332d.getSupportFragmentManager();
        C10765mq.m32770a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        cjVar.m31475a(supportFragmentManager);
    }

    /* renamed from: com.ogury.ed.internal.cj$b */
    public static final class C10402b extends C10422cx {

        /* renamed from: a */
        final /* synthetic */ C10400cj f26338a;

        C10402b(C10400cj cjVar) {
            this.f26338a = cjVar;
        }

        public final void onActivityResumed(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f26338a.m31474a((FragmentActivity) activity);
            }
        }

        public final void onActivityPaused(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f26338a.m31478b((FragmentActivity) activity);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31474a(FragmentActivity fragmentActivity) {
        this.f26332d = fragmentActivity;
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f26334f, true);
        fragmentActivity.getSupportFragmentManager().addOnBackStackChangedListener(this.f26335g);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31478b(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f26334f);
        fragmentActivity.getSupportFragmentManager().removeOnBackStackChangedListener(this.f26335g);
        this.f26329a.mo67119a();
    }

    /* renamed from: a */
    private final void m31475a(FragmentManager fragmentManager) {
        if (this.f26330b.mo67154a((List<? extends Object>) C10398ch.m31469a(fragmentManager))) {
            this.f26329a.mo67120a(this.f26332d);
        } else {
            this.f26329a.mo67119a();
        }
    }

    /* renamed from: b */
    public final void mo67112b() {
        this.f26333e.registerActivityLifecycleCallbacks(this.f26336h);
    }

    /* renamed from: c */
    public final void mo67113c() {
        Activity a = C10560gm.m32095a();
        FragmentActivity fragmentActivity = a instanceof FragmentActivity ? (FragmentActivity) a : null;
        if (fragmentActivity == null) {
            fragmentActivity = this.f26332d;
        }
        m31474a(fragmentActivity);
        FragmentManager supportFragmentManager = this.f26332d.getSupportFragmentManager();
        C10765mq.m32770a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        m31475a(supportFragmentManager);
    }

    /* renamed from: d */
    public final void mo67114d() {
        this.f26333e.unregisterActivityLifecycleCallbacks(this.f26336h);
        m31478b(this.f26332d);
    }
}
