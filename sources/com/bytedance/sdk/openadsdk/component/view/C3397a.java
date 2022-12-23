package com.bytedance.sdk.openadsdk.component.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.component.view.a */
/* compiled from: TTAppOpenAdUserInfo */
public class C3397a {

    /* renamed from: a */
    private static boolean f8194a;

    /* renamed from: b */
    private static Drawable f8195b;

    /* renamed from: c */
    private LinearLayout f8196c;

    /* renamed from: d */
    private TTRoundRectImageView f8197d;

    /* renamed from: e */
    private TextView f8198e;

    /* renamed from: a */
    public void mo19346a(Activity activity) {
        this.f8196c = (LinearLayout) activity.findViewById(C2984t.m8432e(activity, "tt_user_info"));
        this.f8197d = (TTRoundRectImageView) activity.findViewById(C2984t.m8432e(activity, "tt_app_icon"));
        this.f8198e = (TextView) activity.findViewById(C2984t.m8432e(activity, "tt_app_name"));
        this.f8196c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    /* renamed from: a */
    public void mo19345a() {
        String g = C3524h.m10852d().mo19857g();
        if (TextUtils.isEmpty(g)) {
            this.f8198e.setVisibility(8);
        } else {
            this.f8198e.setText(g);
        }
        mo19348b();
        try {
            if (f8195b == null) {
                this.f8197d.setVisibility(8);
                return;
            }
            this.f8197d.setImageDrawable(f8195b);
            if (this.f8198e.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8197d.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f8197d.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.f8197d.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo19348b() {
        if (!f8194a) {
            try {
                int h = C3524h.m10852d().mo19858h();
                if (h != 0) {
                    f8195b = C3578m.m11231a().getResources().getDrawable(h);
                }
            } catch (Throwable unused) {
            }
            f8194a = true;
        }
    }

    /* renamed from: c */
    public static Drawable m10178c() {
        return f8195b;
    }

    /* renamed from: a */
    public void mo19347a(C3498n nVar, float f, float f2) {
        int i;
        int i2;
        int d = nVar.mo19697d();
        if (d == 1 || d == 3) {
            if (C3498n.m10583c(nVar)) {
                i2 = nVar.mo19607J().mo16344c();
                i = nVar.mo19607J().mo16341b();
            } else {
                i2 = nVar.mo19613P().get(0).mo19563b();
                i = nVar.mo19613P().get(0).mo19566c();
            }
            if (i2 > 0 && i > 0) {
                float f3 = (float) i;
                float min = f2 - (f3 * Math.min(f / ((float) i2), f2 / f3));
                try {
                    float e = (float) C4020v.m13315e(C3578m.m11231a(), 60.0f);
                    if (min < e) {
                        min = e;
                    }
                    this.f8196c.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) min));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
