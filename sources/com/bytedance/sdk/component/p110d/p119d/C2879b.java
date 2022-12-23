package com.bytedance.sdk.component.p110d.p119d;

import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.C2908t;
import com.bytedance.sdk.component.p110d.p113c.C2860c;
import com.bytedance.sdk.component.p110d.p113c.p118c.C2867a;

/* renamed from: com.bytedance.sdk.component.d.d.b */
/* compiled from: BytesVisitor */
public class C2879b implements C2887i {

    /* renamed from: a */
    private byte[] f6548a;

    /* renamed from: b */
    private C2894f f6549b;

    /* renamed from: a */
    public String mo17755a() {
        return "image_type";
    }

    public C2879b(byte[] bArr, C2894f fVar) {
        this.f6548a = bArr;
        this.f6549b = fVar;
    }

    /* renamed from: a */
    public void mo17756a(C2860c cVar) {
        C2887i iVar;
        C2908t i = cVar.mo17696i();
        cVar.mo17682a(this.f6548a.length);
        int i2 = C28801.f6550a[i.ordinal()];
        if (i2 == 1) {
            byte[] bArr = this.f6548a;
            iVar = new C2892m(bArr, this.f6549b, C2867a.m7998b(bArr));
        } else if (i2 != 3) {
            if (C2867a.m7997a(this.f6548a)) {
                iVar = new C2883e(this.f6548a, this.f6549b);
            } else {
                byte[] bArr2 = this.f6548a;
                iVar = new C2892m(bArr2, this.f6549b, C2867a.m7998b(bArr2));
            }
        } else if (C2867a.m7997a(this.f6548a)) {
            iVar = new C2883e(this.f6548a, this.f6549b);
        } else if (this.f6549b == null) {
            iVar = new C2889k();
        } else {
            iVar = new C2886h(1001, "not image format", (Throwable) null);
        }
        cVar.mo17687a(iVar);
    }

    /* renamed from: com.bytedance.sdk.component.d.d.b$1 */
    /* compiled from: BytesVisitor */
    static /* synthetic */ class C28801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6550a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.component.d.t[] r0 = com.bytedance.sdk.component.p110d.C2908t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6550a = r0
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p110d.C2908t.RAW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6550a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p110d.C2908t.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6550a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.p110d.C2908t.BITMAP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p110d.p119d.C2879b.C28801.<clinit>():void");
        }
    }
}
