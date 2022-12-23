package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.audio.AacUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p374my.target.C10047y4;
import com.p374my.target.C10070z4;
import com.p374my.target.C9603a5;
import com.p374my.target.C9609a9;
import com.p374my.target.C9707g0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9897p3;
import com.p374my.target.C9942s0;
import com.p374my.target.ads.MyTargetView;
import com.p374my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.j1 */
public final class C9771j1 implements C9942s0 {

    /* renamed from: a */
    public final C9897p3 f24111a;

    /* renamed from: b */
    public final MyTargetView f24112b;

    /* renamed from: c */
    public final C9821l2 f24113c;

    /* renamed from: d */
    public final Context f24114d;

    /* renamed from: e */
    public final C10070z4.C10071a f24115e = new C9774c(this);

    /* renamed from: f */
    public final ArrayList<C9601a3> f24116f;

    /* renamed from: g */
    public final C9609a9 f24117g;

    /* renamed from: h */
    public final C9707g0 f24118h;

    /* renamed from: i */
    public final C9822l3.C9823a f24119i;

    /* renamed from: j */
    public C10070z4 f24120j;

    /* renamed from: k */
    public C9942s0.C9943a f24121k;

    /* renamed from: l */
    public boolean f24122l;

    /* renamed from: m */
    public C9822l3 f24123m;

    /* renamed from: com.my.target.j1$a */
    public class C9772a extends C9609a9.C9612c {

        /* renamed from: a */
        public final /* synthetic */ C10066z1 f24124a;

        public C9772a(C10066z1 z1Var) {
            this.f24124a = z1Var;
        }

        /* renamed from: a */
        public void mo63500a() {
            C9672e0.m27882a("Ad shown, banner Id = " + this.f24124a.getId());
            if (C9771j1.this.f24123m != null) {
                C9771j1.this.f24123m.mo64676b();
                C9771j1.this.f24123m.mo64678b(C9771j1.this.f24114d);
            }
            if (C9771j1.this.f24121k != null) {
                C9771j1.this.f24121k.mo64513d();
            }
        }
    }

    /* renamed from: com.my.target.j1$b */
    public class C9773b implements C9707g0.C9709b {
        public C9773b() {
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            C9771j1.this.mo64452g();
        }
    }

    /* renamed from: com.my.target.j1$c */
    public static class C9774c implements C10070z4.C10071a {

        /* renamed from: a */
        public final C9771j1 f24127a;

        public C9774c(C9771j1 j1Var) {
            this.f24127a = j1Var;
        }

        /* renamed from: a */
        public void mo64458a(WebView webView) {
            this.f24127a.mo64444a(webView);
        }

        /* renamed from: a */
        public void mo64459a(C10066z1 z1Var) {
            this.f24127a.mo64446a(z1Var);
        }

        /* renamed from: a */
        public void mo64460a(C10066z1 z1Var, String str) {
            this.f24127a.mo64447a(z1Var, str);
        }
    }

    /* renamed from: com.my.target.j1$d */
    public static class C9775d implements C9603a5.C9604a {

        /* renamed from: a */
        public final C9771j1 f24128a;

        public C9775d(C9771j1 j1Var) {
            this.f24128a = j1Var;
        }

        public void onLoad() {
            this.f24128a.mo64455k();
        }

        public void onNoAd(String str) {
            this.f24128a.mo64448a(str);
        }
    }

    /* renamed from: com.my.target.j1$e */
    public static class C9776e implements C10047y4.C10051d {

        /* renamed from: a */
        public final C9771j1 f24129a;

        public C9776e(C9771j1 j1Var) {
            this.f24129a = j1Var;
        }

        /* renamed from: a */
        public void mo64461a() {
            this.f24129a.mo64453h();
        }

        /* renamed from: a */
        public void mo64462a(float f, float f2, C9821l2 l2Var, Context context) {
            this.f24129a.mo64443a(f, f2, context);
        }

        /* renamed from: a */
        public void mo64463a(String str, C9821l2 l2Var, Context context) {
            this.f24129a.mo64449a(str, l2Var, context);
        }

        /* renamed from: b */
        public void mo64464b() {
            this.f24129a.mo64454j();
        }

        public void onLoad() {
            this.f24129a.mo64455k();
        }

        public void onNoAd(String str) {
            this.f24129a.mo64448a(str);
        }
    }

    public C9771j1(MyTargetView myTargetView, C9821l2 l2Var, C9822l3.C9823a aVar) {
        this.f24112b = myTargetView;
        this.f24113c = l2Var;
        this.f24114d = myTargetView.getContext();
        this.f24119i = aVar;
        ArrayList<C9601a3> arrayList = new ArrayList<>();
        this.f24116f = arrayList;
        arrayList.addAll(l2Var.getStatHolder().mo63682c());
        this.f24117g = C9609a9.m27615a(l2Var.getViewability(), l2Var.getStatHolder());
        this.f24118h = C9707g0.m28052a(l2Var.getAdChoices());
        this.f24111a = C9897p3.m28962a(l2Var, 1, (C9711g2<VideoData>) null, myTargetView.getContext());
    }

    /* renamed from: a */
    public static C9771j1 m28360a(MyTargetView myTargetView, C9821l2 l2Var, C9822l3.C9823a aVar) {
        return new C9771j1(myTargetView, l2Var, aVar);
    }

    /* renamed from: a */
    public void mo63919a() {
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.mo63607a();
        }
        this.f24122l = true;
        this.f24117g.mo63498b(this.f24112b);
    }

    /* renamed from: a */
    public void mo64443a(float f, float f2, Context context) {
        if (!this.f24116f.isEmpty()) {
            float f3 = f2 - f;
            ArrayList arrayList = new ArrayList();
            Iterator<C9601a3> it = this.f24116f.iterator();
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
    public void mo64444a(WebView webView) {
        C10070z4 z4Var;
        if (this.f24111a != null && (z4Var = this.f24120j) != null) {
            C9661d6 view = z4Var.getView();
            this.f24111a.mo65200a((View) webView, new C9897p3.C9900c(view.getAdChoicesView(), 3));
            this.f24111a.mo65205c();
        }
    }

    /* renamed from: a */
    public void mo63921a(MyTargetView.AdSize adSize) {
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.getView().mo63869a(adSize.getWidthPixels(), adSize.getHeightPixels());
        }
    }

    /* renamed from: a */
    public final void mo64445a(C9661d6 d6Var) {
        if (this.f24120j != null) {
            MyTargetView.AdSize size = this.f24112b.getSize();
            this.f24120j.getView().mo63869a(size.getWidthPixels(), size.getHeightPixels());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        d6Var.setLayoutParams(layoutParams);
        this.f24112b.removeAllViews();
        this.f24112b.addView(d6Var);
        if (this.f24113c.getAdChoices() != null) {
            this.f24118h.mo64038a(d6Var.getAdChoicesView(), new C9773b());
        }
    }

    /* renamed from: a */
    public void mo63923a(C9942s0.C9943a aVar) {
        this.f24121k = aVar;
    }

    /* renamed from: a */
    public void mo64446a(C10066z1 z1Var) {
        this.f24117g.mo63497b();
        this.f24117g.mo63495a((C9609a9.C9612c) new C9772a(z1Var));
        if (this.f24122l) {
            this.f24117g.mo63498b(this.f24112b);
        }
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("playbackStarted"), this.f24112b.getContext());
    }

    /* renamed from: a */
    public void mo64447a(C10066z1 z1Var, String str) {
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.onClick();
        }
        C9722g8 a = C9722g8.m28089a();
        if (TextUtils.isEmpty(str)) {
            a.mo64119a(z1Var, this.f24112b.getContext());
        } else {
            a.mo64120a(z1Var, str, this.f24112b.getContext());
        }
    }

    /* renamed from: a */
    public void mo64448a(String str) {
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: a */
    public void mo64449a(String str, C9821l2 l2Var, Context context) {
        C10039x8.m29720c((List<C9626b3>) l2Var.getStatHolder().mo63675a(str), context);
    }

    /* renamed from: b */
    public void mo63924b() {
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.mo63614b();
        }
        this.f24122l = false;
        this.f24117g.mo63497b();
    }

    /* renamed from: c */
    public String mo64450c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo64451d() {
        return 0.0f;
    }

    public void destroy() {
        this.f24117g.mo63497b();
        this.f24118h.mo64036a();
        C9897p3 p3Var = this.f24111a;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.mo63608a(this.f24111a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            this.f24120j = null;
        }
    }

    /* renamed from: e */
    public void mo63926e() {
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.mo63613a(this.f24111a == null);
        }
    }

    /* renamed from: f */
    public void mo63927f() {
        this.f24122l = true;
        C10070z4 z4Var = this.f24120j;
        if (z4Var != null) {
            z4Var.mo63618f();
        }
    }

    /* renamed from: g */
    public void mo64452g() {
        C10039x8.m29720c((List<C9626b3>) this.f24113c.getStatHolder().mo63675a("closedByUser"), this.f24114d);
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.mo64512c();
        }
    }

    /* renamed from: h */
    public void mo64453h() {
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.mo64510a();
        }
    }

    /* renamed from: i */
    public void mo63928i() {
        this.f24123m = this.f24119i.mo64682b();
        if (CampaignEx.JSON_KEY_MRAID.equals(this.f24113c.getType())) {
            mo64456l();
        } else {
            mo64457m();
        }
    }

    /* renamed from: j */
    public void mo64454j() {
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.mo64511b();
        }
    }

    /* renamed from: k */
    public void mo64455k() {
        C9942s0.C9943a aVar = this.f24121k;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    /* renamed from: l */
    public final void mo64456l() {
        C10047y4 y4Var;
        C10070z4 z4Var = this.f24120j;
        if (z4Var instanceof C10047y4) {
            y4Var = (C10047y4) z4Var;
        } else {
            if (z4Var != null) {
                z4Var.mo63611a((C10070z4.C10071a) null);
                this.f24120j.mo63608a(this.f24111a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            }
            y4Var = C10047y4.m29765a((ViewGroup) this.f24112b);
            y4Var.mo63611a(this.f24115e);
            this.f24120j = y4Var;
            mo64445a(y4Var.getView());
        }
        y4Var.mo65746a((C10047y4.C10051d) new C9776e(this));
        y4Var.mo63610a(this.f24113c);
    }

    /* renamed from: m */
    public final void mo64457m() {
        C9603a5 a5Var;
        C10070z4 z4Var = this.f24120j;
        if (z4Var instanceof C9628b5) {
            a5Var = (C9603a5) z4Var;
        } else {
            if (z4Var != null) {
                z4Var.mo63611a((C10070z4.C10071a) null);
                this.f24120j.mo63608a(this.f24111a != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
            }
            a5Var = C9628b5.m27675a(this.f24114d);
            a5Var.mo63611a(this.f24115e);
            this.f24120j = a5Var;
            mo64445a(a5Var.getView());
        }
        a5Var.mo63456a(new C9775d(this));
        a5Var.mo63610a(this.f24113c);
    }
}
