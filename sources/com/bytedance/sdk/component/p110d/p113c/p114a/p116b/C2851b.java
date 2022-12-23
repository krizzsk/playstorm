package com.bytedance.sdk.component.p110d.p113c.p114a.p116b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.p110d.C2904p;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2857c;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.b */
/* compiled from: LruCountBitmapCache */
public class C2851b implements C2904p {

    /* renamed from: a */
    private int f6432a;

    /* renamed from: b */
    private int f6433b;

    /* renamed from: c */
    private int f6434c;

    /* renamed from: d */
    private C2857c<String, Bitmap> f6435d;

    public C2851b(int i, int i2) {
        this.f6434c = i;
        this.f6432a = i2;
        this.f6435d = new C2857c<String, Bitmap>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo17663b(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return C2851b.m7888a(bitmap);
            }
        };
    }

    /* renamed from: a */
    public boolean mo17600a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f6435d.mo17672a(str, bitmap);
        return true;
    }

    /* renamed from: a */
    public Bitmap mo17599a(String str) {
        return this.f6435d.mo17671a(str);
    }

    /* renamed from: b */
    public boolean mo17601b(String str) {
        return this.f6435d.mo17671a(str) != null;
    }

    /* renamed from: a */
    public static int m7888a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
