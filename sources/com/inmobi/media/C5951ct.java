package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C6252ic;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ct */
/* compiled from: InMobiActivityAdViewHandler */
public final class C5951ct implements C5956cw {

    /* renamed from: a */
    WeakReference<Activity> f15104a;

    /* renamed from: b */
    public C5948cr f15105b;

    /* renamed from: c */
    public C6286j f15106c = null;

    /* renamed from: d */
    C6359u f15107d;

    /* renamed from: e */
    float f15108e = 1.0f;

    /* renamed from: f */
    final C6362x f15109f = new C6362x() {
        public final void finish() {
            C5951ct.this.m17777h();
        }
    };

    /* renamed from: g */
    private final String f15110g = "InMobiActivityViewHandler";

    /* renamed from: h */
    private RelativeLayout f15111h;

    /* renamed from: i */
    private C5977df f15112i = C5977df.m17846a(C6252ic.m18659b());

    /* renamed from: j */
    private final C6361w f15113j = new C6361w() {
        /* renamed from: a */
        public final void mo35037a(String str, C6360v vVar, float f, boolean z) {
            C5951ct ctVar = C5951ct.this;
            Activity activity = (Activity) ctVar.f15104a.get();
            if (activity != null) {
                if (ctVar.f15107d == null) {
                    ctVar.f15107d = new C6359u(activity);
                    ctVar.f15107d.setId(C6248i.f15818g);
                    ctVar.f15107d.setEmbeddedBrowserUpdateListener(ctVar.f15109f);
                }
                ctVar.mo35033a(ctVar.f15106c);
                ctVar.f15107d.mo35726a(str, vVar, z);
                ctVar.f15108e = 1.0f - f;
                if (ctVar.f15105b != null) {
                    ctVar.f15105b.mo35021a(ctVar.f15108e);
                    ctVar.f15105b.mo35028g();
                }
                ctVar.mo35034b();
            }
        }

        /* renamed from: a */
        public final void mo35036a() {
            C5951ct.this.m17777h();
        }
    };

    public C5951ct(Activity activity) {
        this.f15104a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final void mo35031a(Intent intent, SparseArray<C6286j> sparseArray) {
        Activity activity;
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            C6286j jVar = sparseArray.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (jVar == null) {
                m17776g();
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", -1);
            if (intExtra == -1) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35510a();
                }
                m17776g();
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (activity = (Activity) this.f15104a.get()) != null) {
                activity.requestWindowFeature(1);
                activity.getWindow().setFlags(1024, 1024);
            }
            if (m17769a(intExtra, jVar)) {
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35510a();
                }
                m17776g();
                return;
            }
            try {
                this.f15106c = jVar;
                jVar.setFullScreenActivityContext((Activity) this.f15104a.get());
                m17773d();
                m17774e();
                m17770b(jVar);
                this.f15105b.mo35020a();
                m17775f();
                m17772c(jVar);
                mo35033a(jVar);
            } catch (Exception e) {
                jVar.setFullScreenActivityContext((Activity) null);
                if (jVar.getFullScreenEventsListener() != null) {
                    jVar.getFullScreenEventsListener().mo35510a();
                }
                m17776g();
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
    }

    /* renamed from: d */
    private void m17773d() {
        Activity activity = (Activity) this.f15104a.get();
        if (activity != null) {
            FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
            if (((RelativeLayout) frameLayout.findViewById(C6248i.f15817f)) == null) {
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                relativeLayout.setId(C6248i.f15817f);
                relativeLayout.setBackgroundColor(0);
                frameLayout.removeAllViews();
                frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: e */
    private void m17774e() {
        Activity activity = (Activity) this.f15104a.get();
        if (activity != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            this.f15111h = relativeLayout;
            relativeLayout.setId(C6248i.f15813b);
        }
    }

    /* renamed from: b */
    private void m17770b(C6286j jVar) {
        if (((Activity) this.f15104a.get()) != null && this.f15111h != null) {
            String markupType = jVar.getMarkupType();
            char c = 65535;
            int hashCode = markupType.hashCode();
            if (hashCode != -1084172778) {
                if (hashCode != 3213227) {
                    if (hashCode == 1236050372 && markupType.equals("htmlUrl")) {
                        c = 1;
                    }
                } else if (markupType.equals(TJAdUnitConstants.String.HTML)) {
                    c = 0;
                }
            } else if (markupType.equals("inmobiJson")) {
                c = 2;
            }
            if (c == 0 || c == 1) {
                this.f15105b = new C5949cs(this.f15104a, jVar, this.f15111h);
            } else if (c == 2) {
                this.f15105b = new C5954cv(this.f15104a, jVar, this.f15111h);
            } else {
                throw new IllegalArgumentException("Unknown Markup Type");
            }
            this.f15105b.mo35021a(this.f15108e);
            this.f15105b.mo35022a(this.f15112i);
        }
    }

    /* renamed from: f */
    private void m17775f() {
        RelativeLayout relativeLayout;
        Activity activity = (Activity) this.f15104a.get();
        if (activity != null && (relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(C6248i.f15817f)) != null && this.f15111h != null) {
            m17768a(relativeLayout);
            relativeLayout.addView(this.f15111h);
            this.f15105b.mo35028g();
        }
    }

    /* renamed from: a */
    private static void m17768a(RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(C6248i.f15813b);
        if (relativeLayout2 != null) {
            relativeLayout.removeView(relativeLayout2);
        }
    }

    /* renamed from: c */
    private void m17772c(C6286j jVar) {
        if (jVar instanceof C6337q) {
            ((C6337q) jVar).setEmbeddedBrowserJSCallbacks(this.f15113j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35033a(C6286j jVar) {
        C6359u uVar;
        if ((jVar instanceof C6337q) && (uVar = this.f15107d) != null) {
            uVar.setUserLeftApplicationListener(((C6337q) jVar).getListener());
        }
    }

    /* renamed from: a */
    public final void mo35030a() {
        C5948cr crVar = this.f15105b;
        if (crVar != null) {
            crVar.mo35026e();
        }
        RelativeLayout relativeLayout = this.f15111h;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        C6359u uVar = this.f15107d;
        if (uVar != null) {
            uVar.mo35727b();
        }
        this.f15104a.clear();
        this.f15106c = null;
        this.f15105b = null;
        this.f15111h = null;
        this.f15107d = null;
    }

    /* renamed from: a */
    public final void mo35032a(C5977df dfVar) {
        if (((Activity) this.f15104a.get()) != null) {
            C5948cr crVar = this.f15105b;
            if (crVar != null) {
                crVar.mo35022a(dfVar);
            }
            if (dfVar != null && this.f15112i.mo35080a() == dfVar.mo35080a()) {
                this.f15112i = dfVar;
                return;
            }
            this.f15112i = dfVar;
            C5948cr crVar2 = this.f15105b;
            if (crVar2 != null) {
                crVar2.mo35028g();
            }
            mo35034b();
        }
    }

    /* renamed from: a */
    private static boolean m17769a(int i, C6286j jVar) {
        if (200 == i && !TJAdUnitConstants.String.HTML.equals(jVar.getMarkupType())) {
            return true;
        }
        if (202 != i || "htmlUrl".equals(jVar.getMarkupType())) {
            return 201 == i && !"inmobiJson".equals(jVar.getMarkupType());
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35034b() {
        C6359u uVar = this.f15107d;
        if (uVar != null) {
            C6252ic.C6254a b = C6252ic.m18661b(uVar.getContext());
            if (this.f15112i.mo35080a()) {
                m17767a((int) (((float) b.f15836a) * (1.0f - this.f15108e)), -1);
            } else {
                m17767a(-1, (int) (((float) b.f15837b) * (1.0f - this.f15108e)));
            }
        }
    }

    /* renamed from: a */
    private void m17767a(int i, int i2) {
        Activity activity = (Activity) this.f15104a.get();
        if (activity != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            if (this.f15112i.mo35080a()) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(12);
            }
            RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(C6248i.f15817f);
            if (relativeLayout != null && this.f15107d != null) {
                if (m17771b(relativeLayout)) {
                    this.f15107d.setLayoutParams(layoutParams);
                } else {
                    relativeLayout.addView(this.f15107d, layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m17777h() {
        C6359u uVar = this.f15107d;
        if (uVar != null) {
            uVar.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        C6359u uVar2 = this.f15107d;
        if (uVar2 != null) {
            ViewParent parent = uVar2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f15107d);
            }
            this.f15107d.mo35727b();
            this.f15107d = null;
        }
        this.f15108e = 1.0f;
        C5948cr crVar = this.f15105b;
        if (crVar != null) {
            crVar.mo35021a(1.0f);
            this.f15105b.mo35028g();
        }
    }

    /* renamed from: b */
    private static boolean m17771b(RelativeLayout relativeLayout) {
        return ((RelativeLayout) relativeLayout.findViewById(C6248i.f15818g)) != null;
    }

    /* renamed from: g */
    private void m17776g() {
        Activity activity = (Activity) this.f15104a.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }
}
