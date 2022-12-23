package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* renamed from: com.inmobi.media.dz */
/* compiled from: ViewableNativeV2VideoAd */
public final class C6008dz extends C6004dw {

    /* renamed from: d */
    private final C6332o f15280d;

    /* renamed from: e */
    private boolean f15281e = false;

    /* renamed from: a */
    public final void mo35116a(byte b) {
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
    }

    /* renamed from: d */
    public final void mo35122d() {
    }

    public C6008dz(C6332o oVar) {
        super(oVar);
        this.f15280d = oVar;
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        Context j;
        if (this.f15281e || (j = this.f15280d.mo35570j()) == null) {
            return null;
        }
        C6125fq fqVar = this.f15273c;
        C6332o oVar = this.f15280d;
        this.f15272b = new C6064fb(j, fqVar, oVar, oVar.mo35568h());
        View a = this.f15272b.mo35124a(view, viewGroup, false, (C6337q) null);
        mo35118a(a);
        this.f15280d.mo35586s();
        return a;
    }

    /* renamed from: e */
    public final void mo35123e() {
        if (!this.f15281e) {
            this.f15281e = true;
            if (this.f15272b != null) {
                this.f15272b.mo35125a();
                this.f15272b = null;
            }
            super.mo35123e();
        }
    }
}
