package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.core.p151e.C3481j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.e */
/* compiled from: ExpressClickCreativeListener */
public class C3610e extends C3426a {
    public C3610e(Context context, C3498n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3476g mo19393a(float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        int i4;
        float f11;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
        int[] a = C4020v.m13296a(view);
        if (a == null || a.length != 2) {
            f10 = f;
            f9 = f2;
            f8 = f3;
            f7 = f4;
            i4 = 0;
            i3 = 0;
        } else {
            i4 = a[0];
            i3 = a[1];
            if (this.f8277r == 0) {
                float b = C4020v.m13297b(this.f8261b, f);
                float f12 = (float) i4;
                float b2 = C4020v.m13297b(this.f8261b, f2);
                float f13 = (float) i3;
                f8 = (C4020v.m13297b(this.f8261b, f3) + f12) - 0.5f;
                f7 = (C4020v.m13297b(this.f8261b, f4) + f13) - 0.5f;
                f9 = (b2 + f13) - 0.5f;
                f10 = (b + f12) - 0.5f;
            } else {
                f10 = f;
                f9 = f2;
                f8 = f3;
                f7 = f4;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.f8262c != null) {
            j4 = this.f8262c.f8484e;
            f11 = f8;
            j3 = this.f8262c.f8485f;
            if (this.f8277r == 0) {
                iArr[0] = ((int) C4020v.m13297b(this.f8261b, (float) this.f8262c.f8486g)) + i4;
                iArr[1] = ((int) C4020v.m13297b(this.f8261b, (float) this.f8262c.f8487h)) + i3;
                i7 = (int) C4020v.m13297b(this.f8261b, (float) this.f8262c.f8488i);
                i6 = (int) C4020v.m13297b(this.f8261b, (float) this.f8262c.f8489j);
                i5 = 1;
            } else {
                iArr[0] = this.f8262c.f8486g;
                i5 = 1;
                iArr[1] = this.f8262c.f8487h;
                i7 = this.f8262c.f8488i;
                i6 = this.f8262c.f8489j;
            }
            iArr2[0] = i7;
            iArr2[i5] = i6;
            if (i7 == 0 && i6 == 0 && view2 != null) {
                iArr = C4020v.m13296a(view2);
                iArr2 = C4020v.m13309c(view2);
            }
        } else {
            i5 = 1;
            f11 = f8;
            j4 = j;
            j3 = j2;
        }
        this.f8277r = 0;
        return new C3476g.C3478a().mo19532f(f10).mo19530e(f9).mo19527d(f11).mo19524c(f7).mo19522b(j4).mo19514a(j3).mo19523b(a).mo19518a(iArr).mo19526c(C4020v.m13309c(view)).mo19529d(iArr2).mo19528d(this.f8296y).mo19531e(this.f8297z).mo19533f(this.f8284A).mo19521b(C3524h.m10852d().mo19842b() ? i5 : 2).mo19515a(sparseArray).mo19516a(str).mo19512a(f5).mo19525c(i).mo19520b(f6).mo19513a(i2).mo19517a(jSONObject).mo19519a();
    }

    /* renamed from: a */
    public void mo20182a(C3481j jVar) {
        this.f8262c = jVar;
    }
}
