package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.a.c */
public class C1407c {

    /* renamed from: a */
    private final List<C1406b> f1552a;

    private C1407c(List<C1406b> list) {
        this.f1552a = list;
    }

    /* renamed from: a */
    public static C1407c m2394a(C2088r rVar, C1407c cVar, C1409e eVar, C1959m mVar) {
        List list;
        if (cVar != null) {
            try {
                list = cVar.mo12663a();
            } catch (Throwable th) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                mVar.mo14286A().mo14790b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
        } else {
            list = new ArrayList();
        }
        for (C2088r a : rVar.mo14766a(Verification.NAME)) {
            C1406b a2 = C1406b.m2389a(a, eVar, mVar);
            if (a2 != null) {
                list.add(a2);
            }
        }
        return new C1407c(list);
    }

    /* renamed from: a */
    public List<C1406b> mo12663a() {
        return this.f1552a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1407c)) {
            return false;
        }
        return this.f1552a.equals(((C1407c) obj).f1552a);
    }

    public int hashCode() {
        return this.f1552a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f1552a + '\'' + '}';
    }
}
