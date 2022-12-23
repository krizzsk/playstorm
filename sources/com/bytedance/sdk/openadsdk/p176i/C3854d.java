package com.bytedance.sdk.openadsdk.p176i;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p104b.p105a.C2805d;
import com.bytedance.sdk.component.p120e.C2909a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3851c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.i.d */
/* compiled from: TTNetClient */
public class C3854d {

    /* renamed from: a */
    private static volatile C3854d f9970a;

    /* renamed from: b */
    private Context f9971b;

    /* renamed from: c */
    private final C2909a f9972c;

    /* renamed from: d */
    private C3851c f9973d;

    /* renamed from: a */
    public static C3854d m12660a() {
        if (f9970a == null) {
            synchronized (C3854d.class) {
                if (f9970a == null) {
                    f9970a = new C3854d(C3578m.m11231a());
                }
            }
        }
        return f9970a;
    }

    private C3854d(Context context) {
        this.f9971b = context == null ? C3578m.m11231a() : context.getApplicationContext();
        C2909a a = new C2909a.C2911a().mo17765a(10000, TimeUnit.MILLISECONDS).mo17768b(10000, TimeUnit.MILLISECONDS).mo17769c(10000, TimeUnit.MILLISECONDS).mo17766a(true).mo17767a();
        this.f9972c = a;
        C2805d a2 = a.mo17764e().mo17477a();
        if (a2 != null) {
            a2.mo17479a(32);
        }
    }

    /* renamed from: b */
    public C2909a mo20705b() {
        return this.f9972c;
    }

    /* renamed from: c */
    public C3851c mo20706c() {
        m12661d();
        return this.f9973d;
    }

    /* renamed from: a */
    public void mo20704a(String str, ImageView imageView) {
        C3769a.m12388a(str).mo17710a(imageView);
    }

    /* renamed from: a */
    public void mo20703a(C3484k kVar, ImageView imageView) {
        if (kVar != null && !TextUtils.isEmpty(kVar.mo19559a()) && imageView != null) {
            C3769a.m12387a(kVar).mo17710a(imageView);
        }
    }

    /* renamed from: d */
    private void m12661d() {
        if (this.f9973d == null) {
            this.f9973d = new C3851c();
        }
    }
}
