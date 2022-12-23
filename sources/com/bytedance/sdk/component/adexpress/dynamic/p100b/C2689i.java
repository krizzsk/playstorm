package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.i */
/* compiled from: DynamicPoint */
public class C2689i {

    /* renamed from: a */
    public float f5905a;

    /* renamed from: b */
    public float f5906b;

    public C2689i(float f, float f2) {
        this.f5905a = f;
        this.f5906b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2689i iVar = (C2689i) obj;
        if (Float.compare(iVar.f5905a, this.f5905a) == 0 && Float.compare(iVar.f5906b, this.f5906b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5905a), Float.valueOf(this.f5906b)});
    }
}
