package com.p374my.target;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p374my.target.C10070z4;
import com.p374my.target.C10072z5;
import com.p374my.target.C9603a5;

/* renamed from: com.my.target.b5 */
public class C9628b5 implements C9603a5, C10072z5.C10073a {

    /* renamed from: a */
    public final C10072z5 f23667a;

    /* renamed from: b */
    public final C9661d6 f23668b;

    /* renamed from: c */
    public C10070z4.C10071a f23669c;

    /* renamed from: d */
    public C9603a5.C9604a f23670d;

    /* renamed from: e */
    public C9821l2 f23671e;

    public C9628b5(Context context) {
        this(new C10072z5(context), new C9661d6(context));
    }

    public C9628b5(C10072z5 z5Var, C9661d6 d6Var) {
        this.f23667a = z5Var;
        this.f23668b = d6Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        d6Var.addView(z5Var, 0);
        z5Var.setLayoutParams(layoutParams);
        z5Var.setBannerWebViewListener(this);
    }

    /* renamed from: a */
    public static C9628b5 m27675a(Context context) {
        return new C9628b5(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m27676e(String str) {
        mo63619f(str);
        this.f23667a.setOnLayoutListener((C10072z5.C10076d) null);
    }

    /* renamed from: a */
    public void mo63607a() {
    }

    /* renamed from: a */
    public void mo63608a(int i) {
        mo63456a((C9603a5.C9604a) null);
        mo63611a((C10070z4.C10071a) null);
        if (this.f23667a.getParent() != null) {
            ((ViewGroup) this.f23667a.getParent()).removeView(this.f23667a);
        }
        this.f23667a.mo63459a(i);
    }

    /* renamed from: a */
    public void mo63609a(WebView webView) {
        C10070z4.C10071a aVar = this.f23669c;
        if (aVar != null) {
            aVar.mo64458a(webView);
        }
    }

    /* renamed from: a */
    public void mo63456a(C9603a5.C9604a aVar) {
        this.f23670d = aVar;
    }

    /* renamed from: a */
    public void mo63610a(C9821l2 l2Var) {
        this.f23671e = l2Var;
        String source = l2Var.getSource();
        if (source == null) {
            mo63616c("failed to load, null html");
            return;
        }
        if (this.f23667a.getMeasuredHeight() == 0 || this.f23667a.getMeasuredWidth() == 0) {
            this.f23667a.setOnLayoutListener(new C10072z5.C10076d(source) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                /* renamed from: a */
                public final void mo63332a() {
                    C9628b5.this.m27676e(this.f$1);
                }
            });
        } else {
            mo63619f(source);
        }
        C9603a5.C9604a aVar = this.f23670d;
        if (aVar != null) {
            aVar.onLoad();
        }
    }

    /* renamed from: a */
    public void mo63611a(C10070z4.C10071a aVar) {
        this.f23669c = aVar;
    }

    /* renamed from: a */
    public void mo63612a(String str) {
    }

    /* renamed from: a */
    public void mo63613a(boolean z) {
    }

    /* renamed from: b */
    public void mo63614b() {
    }

    /* renamed from: b */
    public void mo63615b(String str) {
        if (this.f23671e != null) {
            mo63617d(str);
        }
    }

    /* renamed from: c */
    public final void mo63616c(String str) {
        C9603a5.C9604a aVar = this.f23670d;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: d */
    public final void mo63617d(String str) {
        C9821l2 l2Var;
        C10070z4.C10071a aVar = this.f23669c;
        if (aVar != null && (l2Var = this.f23671e) != null) {
            aVar.mo64460a(l2Var, str);
        }
    }

    /* renamed from: f */
    public void mo63618f() {
        C9821l2 l2Var;
        C10070z4.C10071a aVar = this.f23669c;
        if (aVar != null && (l2Var = this.f23671e) != null) {
            aVar.mo64459a((C10066z1) l2Var);
        }
    }

    /* renamed from: f */
    public final void mo63619f(String str) {
        this.f23667a.setData(str);
    }

    public C9661d6 getView() {
        return this.f23668b;
    }
}
