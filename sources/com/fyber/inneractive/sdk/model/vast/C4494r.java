package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C5370s;
import com.smaato.sdk.core.dns.DnsName;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.r */
public class C4494r implements Comparable<C4494r> {

    /* renamed from: a */
    public Integer[] f11151a = new Integer[0];

    /* renamed from: b */
    public final String f11152b;

    /* renamed from: com.fyber.inneractive.sdk.model.vast.r$a */
    public static class C4495a extends Exception {
    }

    public C4494r(String str) throws C4495a {
        mo24700b(str);
        mo24699a(str);
        this.f11152b = str;
    }

    /* renamed from: a */
    public final void mo24699a(String str) throws C4495a {
        ArrayList arrayList = new ArrayList();
        for (String a : str.split(DnsName.ESCAPED_DOT)) {
            arrayList.add(Integer.valueOf(C5370s.m16783a(a, 0)));
        }
        this.f11151a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    /* renamed from: b */
    public final void mo24700b(String str) throws C4495a {
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new C4495a();
        }
    }

    public String toString() {
        return this.f11152b;
    }

    /* renamed from: a */
    public int compareTo(C4494r rVar) {
        if (rVar == null) {
            return 1;
        }
        int max = Math.max(this.f11151a.length, rVar.f11151a.length);
        int i = 0;
        while (i < max) {
            Integer[] numArr = this.f11151a;
            int intValue = numArr.length > i ? numArr[i].intValue() : 0;
            Integer[] numArr2 = rVar.f11151a;
            int intValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
