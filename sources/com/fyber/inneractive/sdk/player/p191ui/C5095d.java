package com.fyber.inneractive.sdk.player.p191ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5367q0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.d */
public class C5095d extends C5100i {
    public C5095d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo25726a(C5367q0 q0Var, int i, int i2) {
        if (this.f13641d == UnitDisplayType.DEFAULT && this.f13668s) {
            mo25743a(q0Var, this.f13666q, this.f13667r, i, i2);
        }
        q0Var.f14238a = 0;
        q0Var.f14239b = 0;
    }

    /* renamed from: g */
    public void mo25735g() {
        C5367q0 q0Var = new C5367q0(0, 0);
        this.f13649B = q0Var;
        if (this.f13641d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.f13648A.f14238a, this.f13639b);
            ViewGroup viewGroup = this.f13659j;
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                this.f13659j.getLayoutParams().height = min;
            }
            ImageView imageView = this.f13658i;
            if (imageView != null) {
                imageView.getLayoutParams().width = min;
                this.f13658i.getLayoutParams().height = min;
            }
            mo25743a(this.f13649B, this.f13666q, this.f13667r, min, min);
            return;
        }
        int i = this.f13666q;
        int i2 = this.f13667r;
        C5367q0 q0Var2 = this.f13648A;
        mo25743a(q0Var, i, i2, q0Var2.f14238a, q0Var2.f14239b);
        ImageView imageView2 = this.f13658i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f13649B.f14238a;
            this.f13658i.getLayoutParams().height = this.f13649B.f14239b;
        }
    }
}
