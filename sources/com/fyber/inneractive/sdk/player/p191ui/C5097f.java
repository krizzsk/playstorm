package com.fyber.inneractive.sdk.player.p191ui;

import android.content.Context;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5367q0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.f */
public class C5097f extends C5100i {
    public C5097f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo25726a(C5367q0 q0Var, int i, int i2) {
        if (q0Var != null) {
            UnitDisplayType unitDisplayType = this.f13641d;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                int min = Math.min(i, this.f13639b) - C5350l.m16760b(((C4345y) this.f13640c).f10750f.f10575f.intValue() * 2);
                q0Var.f14238a = min;
                q0Var.f14239b = min;
            } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
                int min2 = Math.min(i, this.f13639b) - C5350l.m16760b(((C4345y) this.f13640c).f10750f.f10575f.intValue() * 2);
                q0Var.f14238a = min2;
                q0Var.f14239b = (min2 * 9) / 16;
            } else if (unitDisplayType == UnitDisplayType.MRECT) {
                q0Var.f14238a = C5350l.m16760b(300);
                q0Var.f14239b = C5350l.m16760b(250);
            } else if (unitDisplayType != UnitDisplayType.DEFAULT || !this.f13668s) {
                q0Var.f14238a = 0;
                q0Var.f14239b = 0;
            } else {
                mo25743a(q0Var, this.f13666q, this.f13667r, i, i2);
            }
        }
    }

    /* renamed from: g */
    public void mo25735g() {
        C5367q0 q0Var = new C5367q0(0, 0);
        this.f13649B = q0Var;
        if (this.f13641d == UnitDisplayType.SQUARE) {
            ImageView imageView = this.f13658i;
            if (imageView != null) {
                imageView.getLayoutParams().width = this.f13648A.f14238a;
                this.f13658i.getLayoutParams().height = this.f13648A.f14238a;
            }
            C5367q0 q0Var2 = this.f13649B;
            int i = this.f13666q;
            int i2 = this.f13667r;
            int i3 = this.f13648A.f14238a;
            mo25743a(q0Var2, i, i2, i3, i3);
            return;
        }
        int i4 = this.f13666q;
        int i5 = this.f13667r;
        C5367q0 q0Var3 = this.f13648A;
        mo25743a(q0Var, i4, i5, q0Var3.f14238a, q0Var3.f14239b);
        ImageView imageView2 = this.f13658i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f13649B.f14238a;
            this.f13658i.getLayoutParams().height = this.f13649B.f14239b;
        }
    }
}
