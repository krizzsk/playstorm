package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4490n;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.d */
public class C4444d implements Comparator<C4489m> {

    /* renamed from: a */
    public int f10995a;

    /* renamed from: b */
    public int f10996b;

    /* renamed from: c */
    public int f10997c;

    public C4444d(int i, int i2, int i3) {
        this.f10995a = i;
        this.f10996b = i2;
        this.f10997c = i3;
    }

    /* renamed from: a */
    public final Integer mo24642a(String str) {
        HashMap hashMap = (HashMap) C4490n.f11122f;
        C4490n nVar = hashMap.containsKey(str) ? (C4490n) hashMap.get(str) : C4490n.UNKNOWN;
        if (nVar == C4490n.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (nVar == C4490n.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (nVar == C4490n.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C4489m mVar = (C4489m) obj;
        C4489m mVar2 = (C4489m) obj2;
        if (!TextUtils.equals("VPAID", mVar2.f11116f)) {
            if (!TextUtils.equals("VPAID", mVar.f11116f)) {
                Integer num = mVar.f11115e;
                if (num == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                Integer num2 = mVar2.f11115e;
                if (num2 == null) {
                    i2 = 0;
                } else {
                    i2 = num2.intValue();
                }
                int i7 = this.f10995a;
                if (i2 <= i7 || i > i7) {
                    if (i <= i7 || i2 > i7) {
                        int compareTo = mo24642a(mVar2.f11114d).compareTo(mo24642a(mVar.f11114d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (i >= i2) {
                            if (i <= i2) {
                                Integer num3 = mVar.f11112b;
                                if (num3 == null) {
                                    i3 = 0;
                                } else {
                                    i3 = num3.intValue();
                                }
                                Integer num4 = mVar.f11113c;
                                if (num4 == null) {
                                    i4 = 0;
                                } else {
                                    i4 = num4.intValue();
                                }
                                Integer num5 = mVar2.f11112b;
                                if (num5 == null) {
                                    i5 = 0;
                                } else {
                                    i5 = num5.intValue();
                                }
                                Integer num6 = mVar2.f11113c;
                                if (num6 == null) {
                                    i6 = 0;
                                } else {
                                    i6 = num6.intValue();
                                }
                                int i8 = i3 * i4;
                                int i9 = i5 * i6;
                                int i10 = this.f10996b * this.f10997c;
                                int abs = Math.abs(i8 - i10);
                                int abs2 = Math.abs(i9 - i10);
                                if (abs >= abs2) {
                                    if (abs > abs2) {
                                        return 1;
                                    }
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
