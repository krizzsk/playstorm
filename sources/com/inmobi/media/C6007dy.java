package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* renamed from: com.inmobi.media.dy */
/* compiled from: ViewableNativeV2DisplayAd */
public final class C6007dy extends C6004dw {

    /* renamed from: d */
    private final C6318n f15277d;

    /* renamed from: e */
    private boolean f15278e = false;

    /* renamed from: f */
    private C6337q f15279f;

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

    public C6007dy(C6318n nVar, C6337q qVar) {
        super(nVar);
        this.f15277d = nVar;
        this.f15279f = qVar;
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        Context j;
        if (this.f15278e || (j = this.f15277d.mo35570j()) == null) {
            return null;
        }
        C6125fq fqVar = this.f15273c;
        C6318n nVar = this.f15277d;
        this.f15272b = new C6064fb(j, fqVar, nVar, nVar.mo35568h());
        C6238hu.m18605a((byte) 2, "InMobi", "Ad markup loaded into the container will be inflated into a View.");
        View a = this.f15272b.mo35124a(view, viewGroup, z, this.f15279f);
        mo35118a(a);
        this.f15277d.mo35586s();
        return a;
    }

    /* renamed from: e */
    public final void mo35123e() {
        if (!this.f15278e) {
            this.f15278e = true;
            if (this.f15272b != null) {
                this.f15272b.mo35125a();
                this.f15272b = null;
            }
            C6337q qVar = this.f15279f;
            if (qVar != null) {
                qVar.destroy();
                this.f15279f = null;
            }
            super.mo35123e();
        }
    }
}
