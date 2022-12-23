package com.bytedance.sdk.component.p110d.p113c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p110d.C2835c;
import com.bytedance.sdk.component.p110d.C2897i;
import com.bytedance.sdk.component.p110d.C2900l;
import com.bytedance.sdk.component.p110d.C2901m;
import com.bytedance.sdk.component.p110d.C2905q;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import com.bytedance.sdk.component.p110d.p113c.p118c.C2869c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* renamed from: com.bytedance.sdk.component.d.c.b */
/* compiled from: ImageLoader */
public class C2858b implements C2901m {

    /* renamed from: a */
    private volatile C2874f f6452a;

    private C2858b() {
    }

    /* renamed from: a */
    public static C2901m m7919a(Context context, C2900l lVar) {
        C2858b bVar = new C2858b();
        bVar.m7920b(context, lVar);
        return bVar;
    }

    /* renamed from: b */
    private void m7920b(Context context, C2900l lVar) {
        if (this.f6452a != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (lVar == null) {
            lVar = C2871e.m8011a(context);
        }
        this.f6452a = new C2874f(context, lVar);
    }

    /* renamed from: a */
    public C2897i mo17677a(String str) {
        return new C2860c.C2866b(this.f6452a).mo17721c(str);
    }

    /* renamed from: a */
    public InputStream mo17678a(String str, String str2) {
        if (this.f6452a != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = C2869c.m8000a(str);
            }
            Collection<C2905q> a = this.f6452a.mo17745a();
            if (a != null) {
                for (C2905q a2 : a) {
                    byte[] bArr = (byte[]) a2.mo17599a(str2);
                    if (bArr != null) {
                        return new ByteArrayInputStream(bArr);
                    }
                }
            }
            Collection<C2835c> b = this.f6452a.mo17747b();
            if (b != null) {
                for (C2835c a3 : b) {
                    InputStream a4 = a3.mo17625a(str2);
                    if (a4 != null) {
                        return a4;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo17679a(String str, String str2, String str3) {
        if (this.f6452a == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = C2869c.m8000a(str);
        }
        C2835c a = this.f6452a.mo17743a(str3);
        if (a != null) {
            return a.mo17601b(str2);
        }
        return false;
    }
}
