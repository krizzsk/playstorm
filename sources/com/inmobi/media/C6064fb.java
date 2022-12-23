package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C6004dw;
import com.inmobi.media.C6067fc;

/* renamed from: com.inmobi.media.fb */
/* compiled from: NativeInflater */
public class C6064fb extends C6004dw.C6005a implements C6067fc.C6078b {

    /* renamed from: c */
    private static final String f15427c = C6064fb.class.getSimpleName();

    /* renamed from: b */
    public final C6067fc f15428b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6318n f15429d;

    public C6064fb(Context context, C6125fq fqVar, C6318n nVar, C5907bx bxVar) {
        this.f15429d = nVar;
        Context context2 = context;
        C6125fq fqVar2 = fqVar;
        this.f15428b = new C6067fc(context2, fqVar2, this.f15429d, bxVar, new C6067fc.C6079c() {
            /* renamed from: a */
            public final void mo35217a(int i, C5901bt btVar) {
                if (!C6064fb.this.f15275a) {
                    C6064fb.this.f15429d.mo35553a(i, btVar);
                }
            }
        }, new C6067fc.C6077a() {
            /* renamed from: a */
            public final void mo35218a(View view, C5901bt btVar) {
                if (!C6064fb.this.f15275a) {
                    C6064fb.this.f15429d.mo35556a(view, btVar);
                    C6064fb.this.f15429d.mo35557a(btVar, false);
                }
            }
        }, this);
        C6103fl.m18236a(nVar.f16016q);
    }

    /* renamed from: a */
    public final View mo35124a(View view, ViewGroup viewGroup, boolean z, C6337q qVar) {
        C6081fe feVar;
        if (view != null) {
            View findViewWithTag = view.findViewWithTag("InMobiAdView");
            if (findViewWithTag != null) {
                C6081fe feVar2 = (C6081fe) findViewWithTag;
                if (z) {
                    feVar = this.f15428b.mo35224b(feVar2, viewGroup, qVar);
                } else {
                    feVar = this.f15428b.mo35221a(feVar2, viewGroup, qVar);
                }
            } else if (z) {
                feVar = this.f15428b.mo35224b((C6081fe) null, viewGroup, qVar);
            } else {
                feVar = this.f15428b.mo35221a((C6081fe) null, viewGroup, qVar);
            }
        } else if (z) {
            feVar = this.f15428b.mo35224b((C6081fe) null, viewGroup, qVar);
        } else {
            feVar = this.f15428b.mo35221a((C6081fe) null, viewGroup, qVar);
        }
        feVar.setNativeStrandAd(this.f15429d);
        feVar.setTag("InMobiAdView");
        return feVar;
    }

    /* renamed from: a */
    public final void mo35125a() {
        this.f15428b.mo35222a();
        super.mo35125a();
    }

    /* renamed from: a */
    public final void mo35216a(C5918cd cdVar) {
        if (cdVar.f14902k == 1) {
            this.f15429d.mo35499b();
        }
    }
}
