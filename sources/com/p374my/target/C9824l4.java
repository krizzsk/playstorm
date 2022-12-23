package com.p374my.target;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9707g0;
import com.p374my.target.C9894p1;
import com.p374my.target.C9903p4;
import java.util.List;

/* renamed from: com.my.target.l4 */
public class C9824l4 implements C9903p4 {

    /* renamed from: a */
    public final C9903p4.C9904a f24247a;

    /* renamed from: b */
    public final C9737h6 f24248b;

    /* renamed from: c */
    public C9730h0 f24249c;

    /* renamed from: com.my.target.l4$a */
    public class C9825a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C9894p1 f24250a;

        public C9825a(C9894p1 p1Var) {
            this.f24250a = p1Var;
        }

        public void onClick(View view) {
            C9824l4.this.mo64683a(view.getContext(), this.f24250a);
        }
    }

    /* renamed from: com.my.target.l4$b */
    public class C9826b implements C9707g0.C9709b {

        /* renamed from: a */
        public final /* synthetic */ C10066z1 f24252a;

        public C9826b(C10066z1 z1Var) {
            this.f24252a = z1Var;
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            C9824l4.this.f24247a.mo65209a(this.f24252a, context);
        }
    }

    public C9824l4(C9737h6 h6Var, C9903p4.C9904a aVar) {
        this.f24248b = h6Var;
        this.f24247a = aVar;
    }

    /* renamed from: a */
    public static C9824l4 m28592a(Context context, C9903p4.C9904a aVar) {
        return new C9824l4(new C9737h6(context), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28594a(View view) {
        this.f24247a.mo65208a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28595a(C9675e2 e2Var, View view) {
        this.f24247a.mo65211a(e2Var, (String) null, view.getContext());
    }

    /* renamed from: a */
    public void mo64581a() {
    }

    /* renamed from: a */
    public void mo64683a(Context context, C9894p1 p1Var) {
        C9730h0 h0Var = this.f24249c;
        if (h0Var == null || !h0Var.mo64142c()) {
            C9730h0 h0Var2 = this.f24249c;
            if (h0Var2 == null) {
                C9832l8.m28605a(p1Var.mo65193b(), context);
            } else {
                h0Var2.mo64136a(context);
            }
        }
    }

    /* renamed from: a */
    public void mo64684a(C9675e2 e2Var) {
        this.f24248b.mo64180a(e2Var.getOptimalLandscapeImage(), e2Var.getOptimalPortraitImage(), e2Var.getCloseIcon());
        this.f24248b.setAgeRestrictions(e2Var.getAgeRestrictions());
        this.f24248b.getImageView().setOnClickListener(new View.OnClickListener(e2Var) {
            public final /* synthetic */ C9675e2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C9824l4.this.m28595a(this.f$1, view);
            }
        });
        this.f24248b.getCloseButton().setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C9824l4.this.m28594a(view);
            }
        });
        mo64685a((C10066z1) e2Var);
        this.f24247a.mo65210a((C10066z1) e2Var, (View) this.f24248b);
    }

    /* renamed from: a */
    public final void mo64685a(C10066z1 z1Var) {
        C9894p1 adChoices = z1Var.getAdChoices();
        if (adChoices != null) {
            this.f24248b.mo64181a(adChoices, new C9825a(adChoices));
            List<C9894p1.C9895a> a = adChoices.mo65191a();
            if (a != null) {
                C9730h0 a2 = C9730h0.m28115a(a);
                this.f24249c = a2;
                a2.mo64137a((C9707g0.C9709b) new C9826b(z1Var));
            }
        }
    }

    /* renamed from: b */
    public void mo64587b() {
    }

    public void destroy() {
    }

    /* renamed from: e */
    public void mo64593e() {
    }

    public View getCloseButton() {
        return this.f24248b.getCloseButton();
    }

    /* renamed from: j */
    public View mo64595j() {
        return this.f24248b;
    }
}
