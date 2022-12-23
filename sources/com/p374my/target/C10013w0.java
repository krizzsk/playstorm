package com.p374my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.C10031x4;
import com.p374my.target.C9891p0;
import com.p374my.target.C9897p3;
import com.p374my.target.ads.Reward;
import com.p374my.target.common.MyTargetActivity;
import com.p374my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.w0 */
public final class C10013w0 extends C9995v0 {

    /* renamed from: g */
    public final C9657d2 f24836g;

    /* renamed from: h */
    public final C9963t2 f24837h;

    /* renamed from: i */
    public final ArrayList<C9601a3> f24838i;

    /* renamed from: j */
    public WeakReference<C10031x4> f24839j;

    /* renamed from: k */
    public C9609a9 f24840k;

    /* renamed from: l */
    public C9897p3 f24841l;

    /* renamed from: com.my.target.w0$a */
    public static class C10014a implements C10031x4.C10032a {

        /* renamed from: a */
        public final C10013w0 f24842a;

        /* renamed from: b */
        public final C9657d2 f24843b;

        /* renamed from: c */
        public final C9891p0.C9892a f24844c;

        public C10014a(C10013w0 w0Var, C9657d2 d2Var, C9891p0.C9892a aVar) {
            this.f24842a = w0Var;
            this.f24843b = d2Var;
            this.f24844c = aVar;
        }

        /* renamed from: a */
        public void mo65208a() {
            this.f24842a.dismiss();
        }

        /* renamed from: a */
        public void mo65635a(WebView webView) {
            this.f24842a.mo65630a(webView);
        }

        /* renamed from: a */
        public void mo65636a(C10066z1 z1Var, float f, float f2, Context context) {
            this.f24842a.mo65628a(f, f2, context);
        }

        /* renamed from: a */
        public void mo65209a(C10066z1 z1Var, Context context) {
            this.f24842a.mo65578a(z1Var, context);
        }

        /* renamed from: a */
        public void mo65210a(C10066z1 z1Var, View view) {
            C9672e0.m27882a("Ad shown, banner Id = " + this.f24843b.getId());
            this.f24842a.mo65631a(z1Var, view);
        }

        /* renamed from: a */
        public void mo65211a(C10066z1 z1Var, String str, Context context) {
            C9722g8 a = C9722g8.m28089a();
            if (TextUtils.isEmpty(str)) {
                a.mo64119a(this.f24843b, context);
            } else {
                a.mo64120a((C10066z1) this.f24843b, str, context);
            }
            this.f24844c.onClick();
        }

        /* renamed from: b */
        public void mo65637b(Context context) {
            this.f24842a.mo65633b(context);
        }

        /* renamed from: b */
        public void mo65638b(C10066z1 z1Var, String str, Context context) {
            this.f24842a.mo65632a(z1Var, str, context);
        }

        public void onNoAd(String str) {
            this.f24842a.dismiss();
        }
    }

    public C10013w0(C9657d2 d2Var, C9963t2 t2Var, C9891p0.C9892a aVar) {
        super(aVar);
        this.f24836g = d2Var;
        this.f24837h = t2Var;
        ArrayList<C9601a3> arrayList = new ArrayList<>();
        this.f24838i = arrayList;
        arrayList.addAll(d2Var.getStatHolder().mo63682c());
    }

    /* renamed from: a */
    public static C10013w0 m29590a(C9657d2 d2Var, C9963t2 t2Var, C9891p0.C9892a aVar) {
        return new C10013w0(d2Var, t2Var, aVar);
    }

    /* renamed from: a */
    public void mo65628a(float f, float f2, Context context) {
        if (!this.f24838i.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C9601a3> it = this.f24838i.iterator();
            while (it.hasNext()) {
                C9601a3 next = it.next();
                float e = next.mo63450e();
                if (e < 0.0f && next.mo63449d() >= 0.0f) {
                    e = (f2 / 100.0f) * next.mo63449d();
                }
                if (e >= 0.0f && e <= f3) {
                    arrayList.add(next);
                    it.remove();
                }
            }
            C10039x8.m29720c((List<C9626b3>) arrayList, context);
        }
    }

    /* renamed from: a */
    public final void mo65629a(ViewGroup viewGroup) {
        this.f24841l = C9897p3.m28962a(this.f24836g, 1, (C9711g2<VideoData>) null, viewGroup.getContext());
        C10031x4 a = CampaignEx.JSON_KEY_MRAID.equals(this.f24836g.getType()) ? C9881o4.m28893a(viewGroup.getContext()) : C9797k4.m28473a(viewGroup.getContext());
        this.f24839j = new WeakReference<>(a);
        a.mo64585a((C10031x4.C10032a) new C10014a(this, this.f24836g, this.f24798a));
        a.mo64584a(this.f24837h, this.f24836g);
        viewGroup.addView(a.mo64595j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo65630a(WebView webView) {
        C10031x4 e;
        if (this.f24841l != null && (e = mo65634e()) != null) {
            this.f24841l.mo65200a((View) webView, new C9897p3.C9900c[0]);
            View closeButton = e.getCloseButton();
            if (closeButton != null) {
                this.f24841l.mo65202a(new C9897p3.C9900c(closeButton, 0));
            }
            this.f24841l.mo65205c();
        }
    }

    /* renamed from: a */
    public void mo65631a(C10066z1 z1Var, View view) {
        C9609a9 a9Var = this.f24840k;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
        C9609a9 a = C9609a9.m27615a(this.f24836g.getViewability(), this.f24836g.getStatHolder());
        this.f24840k = a;
        if (this.f24799b) {
            a.mo63498b(view);
        }
        C9672e0.m27882a("Ad shown, banner Id = " + z1Var.getId());
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("playbackStarted"), view.getContext());
    }

    /* renamed from: a */
    public void mo65632a(C10066z1 z1Var, String str, Context context) {
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a(str), context);
    }

    /* renamed from: b */
    public void mo65633b(Context context) {
        if (!this.f24800c) {
            this.f24800c = true;
            this.f24798a.onVideoCompleted();
            C10039x8.m29720c((List<C9626b3>) this.f24836g.getStatHolder().mo63675a("reward"), context);
            C9891p0.C9893b a = mo65577a();
            if (a != null) {
                a.onReward(Reward.getDefault());
            }
        }
    }

    /* renamed from: b */
    public boolean mo65579b() {
        return this.f24836g.isAllowBackButton();
    }

    /* renamed from: e */
    public C10031x4 mo65634e() {
        WeakReference<C10031x4> weakReference = this.f24839j;
        if (weakReference != null) {
            return (C10031x4) weakReference.get();
        }
        return null;
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo65629a((ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        C10031x4 x4Var;
        super.onActivityDestroy();
        C9609a9 a9Var = this.f24840k;
        if (a9Var != null) {
            a9Var.mo63497b();
            this.f24840k = null;
        }
        C9897p3 p3Var = this.f24841l;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        WeakReference<C10031x4> weakReference = this.f24839j;
        if (!(weakReference == null || (x4Var = (C10031x4) weakReference.get()) == null)) {
            x4Var.mo64582a(this.f24841l != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
        }
        this.f24839j = null;
    }

    public void onActivityPause() {
        C10031x4 x4Var;
        super.onActivityPause();
        WeakReference<C10031x4> weakReference = this.f24839j;
        if (!(weakReference == null || (x4Var = (C10031x4) weakReference.get()) == null)) {
            x4Var.mo64587b();
        }
        C9609a9 a9Var = this.f24840k;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
    }

    public void onActivityResume() {
        C10031x4 x4Var;
        super.onActivityResume();
        WeakReference<C10031x4> weakReference = this.f24839j;
        if (weakReference != null && (x4Var = (C10031x4) weakReference.get()) != null) {
            x4Var.mo64581a();
            C9609a9 a9Var = this.f24840k;
            if (a9Var != null) {
                a9Var.mo63498b(x4Var.mo64595j());
            }
        }
    }
}
