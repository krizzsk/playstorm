package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.b */
public class C4441b implements Comparator<C4479c> {

    /* renamed from: a */
    public int f10982a;

    /* renamed from: b */
    public int f10983b;

    public C4441b(int i, int i2) {
        this.f10982a = i;
        this.f10983b = i2;
    }

    /* renamed from: a */
    public Integer mo24639a(C4479c cVar) {
        C4483g gVar = cVar.f11069a;
        if (gVar == C4483g.Html) {
            return 3;
        }
        if (gVar == C4483g.Iframe) {
            return 2;
        }
        if (gVar == C4483g.Static) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        C4479c cVar = (C4479c) obj;
        C4479c cVar2 = (C4479c) obj2;
        int i = cVar.f11071c * cVar.f11072d;
        int i2 = cVar2.f11071c * cVar2.f11072d;
        int i3 = this.f10982a * this.f10983b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs >= abs2) {
            if (abs <= abs2) {
                float floatValue = Float.valueOf((float) this.f10982a).floatValue() / Float.valueOf((float) this.f10983b).floatValue();
                float abs3 = Math.abs(floatValue - (Float.valueOf((float) cVar.f11071c).floatValue() / Float.valueOf((float) cVar.f11072d).floatValue()));
                float abs4 = Math.abs(floatValue - (Float.valueOf((float) cVar2.f11071c).floatValue() / Float.valueOf((float) cVar2.f11072d).floatValue()));
                if (abs3 >= abs4) {
                    if (abs3 <= abs4) {
                        int compareTo = mo24639a(cVar2).compareTo(mo24639a(cVar));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
