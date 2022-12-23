package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.p176i.C3845a;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3846a;
import com.bytedance.sdk.openadsdk.p176i.p177a.C3850b;

/* renamed from: com.bytedance.sdk.openadsdk.utils.g */
/* compiled from: ImageBytesHelper */
public class C3995g {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.g$a */
    /* compiled from: ImageBytesHelper */
    public interface C3997a {
        /* renamed from: a */
        void mo18399a();

        /* renamed from: a */
        void mo18400a(C3850b bVar);

        /* renamed from: b */
        void mo18401b();
    }

    /* renamed from: a */
    public static void m13103a(C3845a aVar, int i, int i2, final C3997a aVar2, String str) {
        C2975l.m8391e("splashLoadAd", " getImageBytes url " + aVar);
        C3854d.m12660a().mo20706c().mo20691a(aVar, new C3846a.C3849b() {
            /* renamed from: a */
            public void mo20694a(String str, C3850b bVar) {
                C3997a aVar;
                if (!bVar.mo20697c() || (aVar = aVar2) == null) {
                    C3997a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.mo18399a();
                        return;
                    }
                    return;
                }
                aVar.mo18400a(bVar);
            }

            /* renamed from: a */
            public void mo20693a(int i, String str, Throwable th) {
                C3997a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo18399a();
                }
            }

            /* renamed from: a */
            public void mo20692a() {
                C3997a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo18401b();
                }
            }
        }, i, i2, str);
    }

    /* renamed from: a */
    public static Drawable m13102a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
