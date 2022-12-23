package com.inmobi.media;

import android.widget.RelativeLayout;
import com.inmobi.media.C6252ic;

/* renamed from: com.inmobi.media.cr */
/* compiled from: AdMarkupViewHandler */
public abstract class C5948cr {

    /* renamed from: a */
    private final String f15091a = C5948cr.class.getSimpleName();

    /* renamed from: b */
    private C5977df f15092b = C5977df.PORTRAIT;

    /* renamed from: c */
    private float f15093c = 1.0f;

    /* renamed from: d */
    private RelativeLayout f15094d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo35020a();

    /* renamed from: b */
    public abstract void mo35023b();

    /* renamed from: c */
    public abstract void mo35024c();

    /* renamed from: d */
    public abstract void mo35025d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo35026e();

    /* renamed from: f */
    public abstract void mo35027f();

    public C5948cr(RelativeLayout relativeLayout) {
        this.f15094d = relativeLayout;
    }

    /* renamed from: a */
    public void mo35022a(C5977df dfVar) {
        this.f15092b = dfVar;
    }

    /* renamed from: a */
    public void mo35021a(float f) {
        this.f15093c = f;
    }

    /* renamed from: g */
    public void mo35028g() {
        RelativeLayout.LayoutParams layoutParams;
        if (this.f15093c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f15094d.setLayoutParams(layoutParams2);
            return;
        }
        C6252ic.C6254a b = C6252ic.m18661b(this.f15094d.getContext());
        if (this.f15092b.mo35080a()) {
            layoutParams = new RelativeLayout.LayoutParams((int) (((float) b.f15836a) * this.f15093c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (((float) b.f15837b) * this.f15093c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f15094d.setLayoutParams(layoutParams);
    }
}
