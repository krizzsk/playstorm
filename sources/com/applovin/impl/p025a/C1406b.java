package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.b */
public class C1406b {

    /* renamed from: a */
    private final String f1548a;

    /* renamed from: b */
    private final List<C1411g> f1549b;

    /* renamed from: c */
    private final String f1550c;

    /* renamed from: d */
    private final Set<C1415j> f1551d;

    private C1406b(String str, List<C1411g> list, String str2, Set<C1415j> set) {
        this.f1548a = str;
        this.f1549b = list;
        this.f1550c = str2;
        this.f1551d = set;
    }

    /* renamed from: a */
    public static C1406b m2389a(C2088r rVar, C1409e eVar, C1959m mVar) {
        try {
            String str = rVar.mo14768b().get(Verification.VENDOR);
            C2088r c = rVar.mo14769c(Verification.VERIFICATION_PARAMETERS);
            String c2 = c != null ? c.mo14770c() : null;
            List<C2088r> a = rVar.mo14766a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            for (C2088r a2 : a) {
                C1411g a3 = C1411g.m2410a(a2, mVar);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            HashMap hashMap = new HashMap();
            C1417l.m2435a(rVar, (Map<String, Set<C1415j>>) hashMap, eVar, mVar);
            return new C1406b(str, arrayList, c2, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mVar.mo14286A().mo14790b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo12656a() {
        return this.f1548a;
    }

    /* renamed from: b */
    public List<C1411g> mo12657b() {
        return this.f1549b;
    }

    /* renamed from: c */
    public String mo12658c() {
        return this.f1550c;
    }

    /* renamed from: d */
    public Set<C1415j> mo12659d() {
        return this.f1551d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1406b bVar = (C1406b) obj;
        String str = this.f1548a;
        if (str == null ? bVar.f1548a != null : !str.equals(bVar.f1548a)) {
            return false;
        }
        List<C1411g> list = this.f1549b;
        if (list == null ? bVar.f1549b != null : !list.equals(bVar.f1549b)) {
            return false;
        }
        String str2 = this.f1550c;
        if (str2 == null ? bVar.f1550c != null : !str2.equals(bVar.f1550c)) {
            return false;
        }
        Set<C1415j> set = this.f1551d;
        Set<C1415j> set2 = bVar.f1551d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f1548a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C1411g> list = this.f1549b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f1550c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<C1415j> set = this.f1551d;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f1548a + '\'' + "javascriptResources='" + this.f1549b + '\'' + "verificationParameters='" + this.f1550c + '\'' + "errorEventTrackers='" + this.f1551d + '\'' + '}';
    }
}
