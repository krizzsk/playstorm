package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.my.target.x6 */
public class C10035x6 extends RelativeLayout {

    /* renamed from: a */
    public final RelativeLayout f24897a;

    /* renamed from: b */
    public final ImageView f24898b;

    /* renamed from: c */
    public final ImageView f24899c;

    /* renamed from: d */
    public final C10059y8 f24900d;

    /* renamed from: e */
    public final boolean f24901e;

    /* renamed from: f */
    public final View.OnClickListener f24902f;

    /* renamed from: com.my.target.x6$b */
    public static class C10037b implements View.OnClickListener {

        /* renamed from: a */
        public final Context f24903a;

        public C10037b(Context context) {
            this.f24903a = context;
        }

        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.f24903a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f24903a.startActivity(intent);
            } catch (Throwable th) {
                C9672e0.m27882a(th.getMessage());
            }
        }
    }

    public C10035x6(Context context, C10059y8 y8Var, boolean z) {
        super(context);
        this.f24897a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.f24898b = imageView;
        C10059y8.m29840b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.f24899c = imageView2;
        C10059y8.m29840b(imageView2, "store_image");
        this.f24900d = y8Var;
        this.f24901e = z;
        this.f24902f = new C10037b(context);
    }

    /* renamed from: a */
    public void mo65710a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f24897a.setLayoutParams(layoutParams);
        this.f24898b.setImageBitmap(C9920q5.m29090a(getContext()));
        this.f24897a.addView(this.f24898b);
        this.f24897a.addView(this.f24899c);
        addView(this.f24897a);
    }

    /* renamed from: a */
    public void mo65711a(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i / 3;
        if (this.f24901e) {
            i9 = i / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i9);
        int b = this.f24900d.mo65778b(24);
        C10059y8 y8Var = this.f24900d;
        if (z) {
            i4 = y8Var.mo65778b(4);
            i3 = this.f24900d.mo65778b(24);
            i2 = this.f24900d.mo65778b(8);
        } else {
            i4 = y8Var.mo65778b(16);
            i3 = this.f24900d.mo65778b(24);
            i2 = this.f24900d.mo65778b(16);
        }
        layoutParams.setMargins(b, i4, i3, i2);
        layoutParams.addRule(15, -1);
        int i10 = Build.VERSION.SDK_INT;
        layoutParams.addRule(i10 >= 17 ? 20 : 9);
        this.f24899c.setScaleType(ImageView.ScaleType.FIT_START);
        this.f24899c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i9);
        if (z) {
            i5 = this.f24900d.mo65778b(8);
            i8 = this.f24900d.mo65778b(4);
            i7 = this.f24900d.mo65778b(8);
            i6 = this.f24900d.mo65778b(8);
        } else {
            i5 = this.f24900d.mo65778b(24);
            i8 = this.f24900d.mo65778b(16);
            i7 = this.f24900d.mo65778b(24);
            i6 = this.f24900d.mo65778b(16);
        }
        layoutParams2.setMargins(i5, i8, i7, i6);
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(i10 >= 17 ? 21 : 11);
        this.f24898b.setScaleType(ImageView.ScaleType.FIT_END);
        this.f24898b.setLayoutParams(layoutParams2);
        this.f24898b.setOnClickListener(this.f24902f);
    }
}
