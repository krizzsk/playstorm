package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.cs */
/* compiled from: HtmlMarkupAdHandler */
public class C5949cs extends C5948cr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f15095a = C5949cs.class.getSimpleName();

    /* renamed from: b */
    private final String f15096b = "InMobi";

    /* renamed from: c */
    private WeakReference<Activity> f15097c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6286j f15098d;

    /* renamed from: e */
    private RelativeLayout f15099e;

    /* renamed from: f */
    private C5933cp f15100f;

    /* renamed from: g */
    private C5933cp f15101g;

    /* renamed from: h */
    private boolean f15102h = false;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35025d() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo35021a(float f) {
        super.mo35021a(f);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo35028g() {
        super.mo35028g();
    }

    public C5949cs(WeakReference<Activity> weakReference, C6286j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f15097c = weakReference;
        this.f15098d = jVar;
        this.f15099e = relativeLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35020a() {
        float f = C6252ic.m18655a().f15840c;
        this.f15099e.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        C59501 r3 = new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    C5949cs.this.f15098d.mo35499b();
                } catch (Exception unused) {
                    String unused2 = C5949cs.this.f15095a;
                    C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                }
            }
        };
        int i = (int) (50.0f * f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(11);
        C5933cp cpVar = new C5933cp(this.f15099e.getContext(), f, (byte) 0);
        this.f15100f = cpVar;
        cpVar.setId(C6248i.f15815d);
        this.f15100f.setOnClickListener(r3);
        C5933cp cpVar2 = new C5933cp(this.f15099e.getContext(), f, (byte) 1);
        this.f15101g = cpVar2;
        cpVar2.setId(C6248i.f15816e);
        this.f15101g.setOnClickListener(r3);
        View c = this.f15098d.getViewableAd().mo35121c();
        if (c != null) {
            ViewGroup viewGroup = (ViewGroup) c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            this.f15099e.addView(c, layoutParams);
            this.f15099e.addView(this.f15100f, layoutParams2);
            this.f15099e.addView(this.f15101g, layoutParams2);
            C6286j jVar = this.f15098d;
            ((C6337q) jVar).mo35615b(((C6337q) jVar).f16116n);
            C6286j jVar2 = this.f15098d;
            ((C6337q) jVar2).mo35618c(((C6337q) jVar2).f16114l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35023b() {
        if (1 == this.f15098d.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(this.f15100f, FriendlyObstructionPurpose.CLOSE_AD);
                hashMap.put(this.f15101g, FriendlyObstructionPurpose.CLOSE_AD);
                C6004dw viewableAd = this.f15098d.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.mo35119a((Map<View, FriendlyObstructionPurpose>) hashMap);
                }
            } catch (Exception unused) {
                if (this.f15098d.getFullScreenEventsListener() != null) {
                    this.f15098d.getFullScreenEventsListener().mo35510a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35024c() {
        if (!this.f15102h) {
            try {
                this.f15102h = true;
                if (this.f15098d.getFullScreenEventsListener() != null) {
                    this.f15098d.getFullScreenEventsListener().mo35511a((Object) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo35027f() {
        C6337q qVar;
        if (!this.f15098d.mo35500c() && (qVar = (C6337q) this.f15098d) != null) {
            if (qVar.f16118p != null) {
                qVar.mo35611a(qVar.f16118p, "broadcastEvent('backButtonPressed')");
            }
            if (!qVar.f16117o) {
                try {
                    qVar.mo35499b();
                } catch (Exception unused) {
                    C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35022a(C5977df dfVar) {
        super.mo35022a(dfVar);
        int i = dfVar.f15193e;
        ((C6337q) this.f15098d).mo35620d("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo35026e() {
        boolean z;
        Activity activity = (Activity) this.f15097c.get();
        if (activity instanceof InMobiAdActivity) {
            z = ((InMobiAdActivity) activity).f19389b;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f15098d.getFullScreenEventsListener().mo35512b((Object) null);
            } catch (Exception unused) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            C6337q qVar = (C6337q) this.f15098d;
            qVar.setFullScreenActivityContext((Activity) null);
            try {
                qVar.mo35499b();
            } catch (Exception unused2) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
        }
        this.f15098d.destroy();
    }
}
