package com.bytedance.sdk.component.p110d.p113c.p114a.p116b;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p110d.C2904p;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2849b;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.d */
/* compiled from: MemoryCacheWrapper */
public class C2855d implements C2904p {

    /* renamed from: a */
    private final C2904p f6442a;

    /* renamed from: b */
    private final C2849b f6443b;

    public C2855d(C2904p pVar) {
        this(pVar, (C2849b) null);
    }

    public C2855d(C2904p pVar, C2849b bVar) {
        this.f6442a = pVar;
        this.f6443b = bVar;
    }

    /* renamed from: a */
    public boolean mo17600a(String str, Bitmap bitmap) {
        boolean a = this.f6442a.mo17600a(str, bitmap);
        C2849b bVar = this.f6443b;
        if (bVar != null) {
            bVar.mo17657a(str, Boolean.valueOf(a));
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo17599a(String str) {
        Bitmap bitmap = (Bitmap) this.f6442a.mo17599a(str);
        C2849b bVar = this.f6443b;
        if (bVar != null) {
            bVar.mo17658b(str, bitmap);
        }
        return bitmap;
    }

    /* renamed from: b */
    public boolean mo17601b(String str) {
        return this.f6442a.mo17601b(str);
    }
}
