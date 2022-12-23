package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.C3505f;

/* renamed from: com.bytedance.sdk.openadsdk.core.e */
/* compiled from: DBAdapter */
public class C3468e extends C3505f {

    /* renamed from: a */
    private static volatile C3468e f8406a;

    private C3468e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C3468e m10395a(Context context) {
        Class<C3468e> cls = C3468e.class;
        if (f8406a == null) {
            synchronized (cls) {
                if (f8406a == null) {
                    f8406a = new C3468e(context);
                }
            }
        }
        return f8406a;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C3505f.C3509c mo19471a() {
        return super.mo19471a();
    }
}
