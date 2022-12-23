package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.k */
/* compiled from: FlexComputeRuler */
public class C2709k {
    /* renamed from: a */
    public static float m7346a(float f) {
        return (float) Math.ceil((double) ((f * 16.0f) / 16.0f));
    }

    /* renamed from: a */
    public static List<C2691a.C2692a> m7347a(float f, List<C2691a.C2692a> list) {
        ArrayList<C2691a.C2692a> arrayList = new ArrayList<>();
        for (C2691a.C2692a clone : list) {
            arrayList.add((C2691a.C2692a) clone.clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (C2691a.C2692a aVar : arrayList) {
            if (aVar.f5912b) {
                i = (int) (((float) i) + aVar.f5911a);
            } else {
                i2 = (int) (((float) i2) + aVar.f5911a);
                z = false;
            }
        }
        if (z && f > ((float) i)) {
            return arrayList;
        }
        float f2 = (float) i;
        int i3 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f3 = i3 < 0 ? f / f2 : 1.0f;
        int i4 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f4 = i4 > 0 ? (f - f2) / ((float) i2) : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C2691a.C2692a aVar2 : arrayList) {
                if (!aVar2.f5912b && aVar2.f5913c != 0.0f && aVar2.f5911a * f4 > aVar2.f5913c) {
                    aVar2.f5911a = aVar2.f5913c;
                    aVar2.f5912b = true;
                    z2 = true;
                }
                arrayList2.add(aVar2);
            }
            if (z2) {
                return m7347a(f, arrayList2);
            }
        }
        int i5 = 0;
        for (C2691a.C2692a aVar3 : arrayList) {
            if (aVar3.f5912b) {
                aVar3.f5911a = m7346a(aVar3.f5911a * f3);
            } else {
                aVar3.f5911a = m7346a(aVar3.f5911a * f4);
            }
            i5 = (int) (((float) i5) + aVar3.f5911a);
        }
        float f5 = (float) i5;
        if (f5 < f) {
            float f6 = f - f5;
            for (int i6 = 0; i6 < arrayList.size() && f6 > 0.0f; i6 = (i6 + 1) % arrayList.size()) {
                C2691a.C2692a aVar4 = (C2691a.C2692a) arrayList.get(i6);
                if ((i3 < 0 && aVar4.f5912b) || (i4 > 0 && !aVar4.f5912b)) {
                    aVar4.f5911a += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
