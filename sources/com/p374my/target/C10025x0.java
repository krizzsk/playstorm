package com.p374my.target;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p374my.target.C9609a9;
import com.p374my.target.C9891p0;
import com.p374my.target.C9897p3;
import com.p374my.target.C9903p4;
import com.p374my.target.common.MyTargetActivity;
import com.p374my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.x0 */
public final class C10025x0 extends C9995v0 {

    /* renamed from: g */
    public final C9675e2 f24878g;

    /* renamed from: h */
    public C9609a9 f24879h;

    /* renamed from: i */
    public WeakReference<C9824l4> f24880i;

    /* renamed from: j */
    public C9897p3 f24881j;

    /* renamed from: com.my.target.x0$a */
    public class C10026a extends C9609a9.C9612c {

        /* renamed from: a */
        public final /* synthetic */ View f24882a;

        public C10026a(View view) {
            this.f24882a = view;
        }

        /* renamed from: a */
        public void mo63500a() {
            View closeButton;
            super.mo63500a();
            if (C10025x0.this.f24881j != null) {
                C10025x0.this.f24881j.mo65200a(this.f24882a, new C9897p3.C9900c[0]);
                if (!(C10025x0.this.f24880i == null || (closeButton = ((C9824l4) C10025x0.this.f24880i.get()).getCloseButton()) == null)) {
                    C10025x0.this.f24881j.mo65202a(new C9897p3.C9900c(closeButton, 0));
                }
                C10025x0.this.f24881j.mo65205c();
            }
        }
    }

    /* renamed from: com.my.target.x0$b */
    public static class C10027b implements C9903p4.C9904a {

        /* renamed from: a */
        public final C10025x0 f24884a;

        public C10027b(C10025x0 x0Var) {
            this.f24884a = x0Var;
        }

        /* renamed from: a */
        public void mo65208a() {
            this.f24884a.mo65692e();
        }

        /* renamed from: a */
        public void mo65209a(C10066z1 z1Var, Context context) {
            this.f24884a.mo65578a(z1Var, context);
        }

        /* renamed from: a */
        public void mo65210a(C10066z1 z1Var, View view) {
            C9672e0.m27882a("Ad shown, banner Id = " + z1Var.getId());
            this.f24884a.mo65690a(z1Var, view);
        }

        /* renamed from: a */
        public void mo65211a(C10066z1 z1Var, String str, Context context) {
            this.f24884a.mo65691b(context);
        }
    }

    public C10025x0(C9675e2 e2Var, C9891p0.C9892a aVar) {
        super(aVar);
        this.f24878g = e2Var;
    }

    /* renamed from: a */
    public static C10025x0 m29672a(C9675e2 e2Var, C9891p0.C9892a aVar) {
        return new C10025x0(e2Var, aVar);
    }

    /* renamed from: a */
    public final void mo65689a(ViewGroup viewGroup) {
        this.f24881j = C9897p3.m28962a(this.f24878g, 2, (C9711g2<VideoData>) null, viewGroup.getContext());
        C9824l4 a = C9824l4.m28592a(viewGroup.getContext(), (C9903p4.C9904a) new C10027b(this));
        this.f24880i = new WeakReference<>(a);
        a.mo64684a(this.f24878g);
        viewGroup.addView(a.mo64595j(), new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo65690a(C10066z1 z1Var, View view) {
        C9609a9 a9Var = this.f24879h;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
        C9609a9 a = C9609a9.m27615a(this.f24878g.getViewability(), this.f24878g.getStatHolder());
        this.f24879h = a;
        a.mo63495a((C9609a9.C9612c) new C10026a(view));
        if (this.f24799b) {
            this.f24879h.mo63498b(view);
        }
        C9672e0.m27882a("Ad shown, banner Id = " + z1Var.getId());
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("playbackStarted"), view.getContext());
    }

    /* renamed from: b */
    public void mo65691b(Context context) {
        C9722g8.m28089a().mo64119a(this.f24878g, context);
        this.f24798a.onClick();
        dismiss();
    }

    /* renamed from: b */
    public boolean mo65579b() {
        return this.f24878g.isAllowBackButton();
    }

    /* renamed from: e */
    public void mo65692e() {
        dismiss();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        super.onActivityCreate(myTargetActivity, intent, frameLayout);
        mo65689a((ViewGroup) frameLayout);
    }

    public void onActivityDestroy() {
        super.onActivityDestroy();
        C9609a9 a9Var = this.f24879h;
        if (a9Var != null) {
            a9Var.mo63497b();
            this.f24879h = null;
        }
        C9897p3 p3Var = this.f24881j;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
    }

    public void onActivityPause() {
        super.onActivityPause();
        C9609a9 a9Var = this.f24879h;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
    }

    public void onActivityResume() {
        C9824l4 l4Var;
        C9609a9 a9Var;
        super.onActivityResume();
        WeakReference<C9824l4> weakReference = this.f24880i;
        if (weakReference != null && (l4Var = (C9824l4) weakReference.get()) != null && (a9Var = this.f24879h) != null) {
            a9Var.mo63498b(l4Var.mo64595j());
        }
    }
}
