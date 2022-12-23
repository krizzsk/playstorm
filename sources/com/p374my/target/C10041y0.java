package com.p374my.target;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.C10031x4;
import com.p374my.target.C9609a9;
import com.p374my.target.C9891p0;
import com.p374my.target.C9897p3;
import com.p374my.target.C9903p4;
import com.p374my.target.C9965t4;
import com.p374my.target.C9986u4;
import com.p374my.target.ads.Reward;
import com.p374my.target.common.MyTargetActivity;
import com.p374my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.y0 */
public final class C10041y0 extends C9995v0 {

    /* renamed from: g */
    public final C9963t2 f24956g;

    /* renamed from: h */
    public final ArrayList<C9601a3> f24957h;

    /* renamed from: i */
    public final boolean f24958i;

    /* renamed from: j */
    public C9697f2 f24959j;

    /* renamed from: k */
    public WeakReference<C9903p4> f24960k;

    /* renamed from: l */
    public C9609a9 f24961l;

    /* renamed from: m */
    public C9897p3 f24962m;

    /* renamed from: com.my.target.y0$a */
    public class C10042a extends C9609a9.C9612c {

        /* renamed from: a */
        public final /* synthetic */ View f24963a;

        public C10042a(View view) {
            this.f24963a = view;
        }

        /* renamed from: a */
        public void mo63500a() {
            View closeButton;
            super.mo63500a();
            C9897p3 p3Var = C10041y0.this.f24962m;
            if (p3Var != null && !p3Var.mo65204b()) {
                C10041y0.this.f24962m.mo65200a(this.f24963a, new C9897p3.C9900c[0]);
                C9903p4 e = C10041y0.this.mo65733e();
                if (!(e == null || (closeButton = e.getCloseButton()) == null)) {
                    C10041y0.this.f24962m.mo65202a(new C9897p3.C9900c(closeButton, 0));
                }
                C10041y0.this.f24962m.mo65205c();
            }
        }
    }

    /* renamed from: com.my.target.y0$b */
    public static class C10043b implements C9965t4.C9968c, C10031x4.C10032a, C9986u4.C9988b {

        /* renamed from: a */
        public final C10041y0 f24965a;

        public C10043b(C10041y0 y0Var) {
            this.f24965a = y0Var;
        }

        /* renamed from: a */
        public void mo65208a() {
            this.f24965a.mo65734f();
        }

        /* renamed from: a */
        public void mo65460a(Context context) {
            this.f24965a.mo65730b(context);
        }

        /* renamed from: a */
        public void mo65635a(WebView webView) {
            this.f24965a.mo65724a(webView);
        }

        /* renamed from: a */
        public void mo65636a(C10066z1 z1Var, float f, float f2, Context context) {
            this.f24965a.mo65723a(f, f2, context);
        }

        /* renamed from: a */
        public void mo65209a(C10066z1 z1Var, Context context) {
            this.f24965a.mo65578a(z1Var, context);
        }

        /* renamed from: a */
        public void mo65210a(C10066z1 z1Var, View view) {
            this.f24965a.mo65728a(z1Var, view);
        }

        /* renamed from: a */
        public void mo65211a(C10066z1 z1Var, String str, Context context) {
            if (z1Var != null) {
                this.f24965a.mo65729a(z1Var, str, context);
            }
        }

        /* renamed from: b */
        public void mo65637b(Context context) {
        }

        /* renamed from: b */
        public void mo65638b(C10066z1 z1Var, String str, Context context) {
            this.f24965a.mo65732b(z1Var, str, context);
        }

        public void onNoAd(String str) {
        }
    }

    public C10041y0(C9697f2 f2Var, C9963t2 t2Var, boolean z, C9891p0.C9892a aVar) {
        super(aVar);
        this.f24959j = f2Var;
        this.f24956g = t2Var;
        this.f24958i = z;
        ArrayList<C9601a3> arrayList = new ArrayList<>();
        this.f24957h = arrayList;
        arrayList.addAll(f2Var.getStatHolder().mo63682c());
    }

    /* renamed from: a */
    public static C10041y0 m29730a(C9697f2 f2Var, C9963t2 t2Var, boolean z, C9891p0.C9892a aVar) {
        return new C10041y0(f2Var, t2Var, z, aVar);
    }

    /* renamed from: a */
    public void mo65723a(float f, float f2, Context context) {
        if (!this.f24957h.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C9601a3> it = this.f24957h.iterator();
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
    public void mo65724a(WebView webView) {
        C9897p3 p3Var = this.f24962m;
        if (p3Var != null && p3Var.mo65204b()) {
            this.f24962m.mo65200a((View) webView, new C9897p3.C9900c[0]);
            C9903p4 e = mo65733e();
            if (e != null) {
                View closeButton = e.getCloseButton();
                if (closeButton != null) {
                    this.f24962m.mo65202a(new C9897p3.C9900c(closeButton, 0));
                }
                this.f24962m.mo65205c();
            }
        }
    }

    /* renamed from: a */
    public final void mo65725a(C9625b2 b2Var, ViewGroup viewGroup) {
        C9903p4 e = mo65733e();
        if (e != null) {
            e.destroy();
        }
        if (b2Var instanceof C9657d2) {
            viewGroup.removeAllViews();
            mo65731b(b2Var, viewGroup);
        } else if (b2Var instanceof C9675e2) {
            viewGroup.removeAllViews();
            mo65726a((C9675e2) b2Var, viewGroup);
        } else if (b2Var instanceof C9697f2) {
            viewGroup.removeAllViews();
            mo65727a((C9697f2) b2Var, viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo65726a(C9675e2 e2Var, ViewGroup viewGroup) {
        C9897p3 p3Var = this.f24962m;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        this.f24962m = C9897p3.m28962a(e2Var, 2, (C9711g2<VideoData>) null, viewGroup.getContext());
        C9824l4 a = C9824l4.m28592a(viewGroup.getContext(), (C9903p4.C9904a) new C10043b(this));
        this.f24960k = new WeakReference<>(a);
        a.mo64684a(e2Var);
        viewGroup.addView(a.mo64595j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo65727a(C9697f2 f2Var, ViewGroup viewGroup) {
        C9965t4 t4Var;
        C9897p3 p3Var = this.f24962m;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        this.f24962m = C9897p3.m28962a(f2Var, videoBanner != null ? 3 : 2, videoBanner, viewGroup.getContext());
        if (f2Var.getStyle() != 2) {
            C9850m7 a = C9850m7.m28743a(this.f24962m, viewGroup.getContext());
            a.mo64769a(this.f24958i);
            t4Var = C9965t4.m29336a(a, f2Var, new C10043b(this), viewGroup.getContext());
        } else {
            C9863n7 a2 = C9863n7.m28830a(f2Var.getPromoStyleSettings(), this.f24962m, viewGroup.getContext());
            a2.mo64887a(this.f24958i);
            C9986u4 a3 = C9986u4.m29464a(a2, f2Var, new C10043b(this));
            a3.mo65551u();
            t4Var = a3;
        }
        this.f24960k = new WeakReference<>(t4Var);
        viewGroup.addView(t4Var.mo64595j(), new FrameLayout.LayoutParams(-1, -1));
        this.f24959j = f2Var;
    }

    /* renamed from: a */
    public void mo65728a(C10066z1 z1Var, View view) {
        C9609a9 a9Var = this.f24961l;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
        C9609a9 a = C9609a9.m27615a(z1Var.getViewability(), z1Var.getStatHolder());
        this.f24961l = a;
        a.mo63495a((C9609a9.C9612c) new C10042a(view));
        if (this.f24799b) {
            this.f24961l.mo63498b(view);
        }
        C9672e0.m27882a("Ad shown, banner Id = " + z1Var.getId());
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("playbackStarted"), view.getContext());
    }

    /* renamed from: a */
    public void mo65729a(C10066z1 z1Var, String str, Context context) {
        if (mo65733e() != null) {
            C9722g8 a = C9722g8.m28089a();
            if (TextUtils.isEmpty(str)) {
                a.mo64119a(z1Var, context);
            } else {
                a.mo64120a(z1Var, str, context);
            }
            boolean z = z1Var instanceof C9640c2;
            if (z) {
                C10039x8.m29720c((List<C9626b3>) this.f24959j.getStatHolder().mo63675a("click"), context);
            }
            this.f24798a.onClick();
            if ((z || (z1Var instanceof C9697f2)) && this.f24959j.isCloseOnClick()) {
                dismiss();
            }
        }
    }

    /* renamed from: b */
    public void mo65730b(Context context) {
        this.f24798a.onVideoCompleted();
        if (!this.f24800c) {
            this.f24800c = true;
            C10039x8.m29720c((List<C9626b3>) this.f24959j.getStatHolder().mo63675a("reward"), context);
            C9891p0.C9893b a = mo65577a();
            if (a != null) {
                a.onReward(Reward.getDefault());
            }
        }
        C9625b2 endCard = this.f24959j.getEndCard();
        ViewParent viewParent = null;
        C9903p4 e = mo65733e();
        if (e != null) {
            viewParent = e.mo64595j().getParent();
        }
        if (endCard != null && (viewParent instanceof ViewGroup)) {
            mo65725a(endCard, (ViewGroup) viewParent);
        }
    }

    /* renamed from: b */
    public final void mo65731b(C9625b2 b2Var, ViewGroup viewGroup) {
        C9897p3 p3Var = this.f24962m;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        this.f24962m = C9897p3.m28962a(b2Var, 2, (C9711g2<VideoData>) null, viewGroup.getContext());
        C10031x4 a = CampaignEx.JSON_KEY_MRAID.equals(b2Var.getType()) ? C9881o4.m28893a(viewGroup.getContext()) : C9797k4.m28473a(viewGroup.getContext());
        this.f24960k = new WeakReference<>(a);
        a.mo64585a((C10031x4.C10032a) new C10043b(this));
        a.mo64584a(this.f24956g, (C9657d2) b2Var);
        viewGroup.addView(a.mo64595j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: b */
    public void mo65732b(C10066z1 z1Var, String str, Context context) {
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a(str), context);
    }

    /* renamed from: b */
    public boolean mo65579b() {
        return this.f24959j.isAllowBackButton();
    }

    /* renamed from: e */
    public C9903p4 mo65733e() {
        WeakReference<C9903p4> weakReference = this.f24960k;
        if (weakReference != null) {
            return (C9903p4) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public void mo65734f() {
        dismiss();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo65727a(this.f24959j, (ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        WeakReference<C9903p4> weakReference = this.f24960k;
        if (weakReference != null) {
            C9903p4 p4Var = (C9903p4) weakReference.get();
            if (p4Var != null) {
                View j = p4Var.mo64595j();
                ViewParent parent = j.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(j);
                }
                p4Var.destroy();
            }
            this.f24960k.clear();
            this.f24960k = null;
        }
        C9609a9 a9Var = this.f24961l;
        if (a9Var != null) {
            a9Var.mo63497b();
            this.f24961l = null;
        }
        C9897p3 p3Var = this.f24962m;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
    }

    public void onActivityPause() {
        super.onActivityPause();
        C9903p4 e = mo65733e();
        if (e != null) {
            e.mo64587b();
        }
        C9609a9 a9Var = this.f24961l;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
    }

    public void onActivityResume() {
        super.onActivityResume();
        C9903p4 e = mo65733e();
        if (e != null) {
            e.mo64581a();
            C9609a9 a9Var = this.f24961l;
            if (a9Var != null) {
                a9Var.mo63498b(e.mo64595j());
            }
        }
    }

    public void onActivityStop() {
        super.onActivityStop();
        C9903p4 e = mo65733e();
        if (e != null) {
            e.mo64593e();
        }
    }
}
