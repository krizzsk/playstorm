package com.fyber.inneractive.sdk.player.p191ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.C5370s;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.ui.e */
public class C5096e extends TextureView {

    /* renamed from: a */
    public WeakReference<C5100i> f13646a;

    public C5096e(C5100i iVar) {
        super(iVar.getContext());
        this.f13646a = new WeakReference<>(iVar);
    }

    public void onMeasure(int i, int i2) {
        C5100i iVar = (C5100i) C5370s.m16784a(this.f13646a);
        if (iVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(iVar.f13649B.f14238a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(iVar.f13649B.f14239b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
