package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.p */
public class C2021p {

    /* renamed from: a */
    private final String f3917a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final String f3918b;

    /* renamed from: c */
    private final Map<String, Object> f3919c;

    /* renamed from: d */
    private final long f3920d;

    public C2021p(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f3918b = str;
        HashMap hashMap = new HashMap();
        this.f3919c = hashMap;
        hashMap.putAll(map);
        this.f3919c.put("applovin_sdk_super_properties", map2);
        this.f3920d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public String mo14617a() {
        return this.f3918b;
    }

    /* renamed from: b */
    public Map<String, Object> mo14618b() {
        return this.f3919c;
    }

    /* renamed from: c */
    public long mo14619c() {
        return this.f3920d;
    }

    /* renamed from: d */
    public String mo14620d() {
        return this.f3917a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2021p pVar = (C2021p) obj;
        if (this.f3920d != pVar.f3920d) {
            return false;
        }
        String str = this.f3918b;
        if (str == null ? pVar.f3918b != null : !str.equals(pVar.f3918b)) {
            return false;
        }
        Map<String, Object> map = this.f3919c;
        if (map == null ? pVar.f3919c != null : !map.equals(pVar.f3919c)) {
            return false;
        }
        String str2 = this.f3917a;
        String str3 = pVar.f3917a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3918b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f3919c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f3920d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f3917a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event{name='" + this.f3918b + '\'' + ", id='" + this.f3917a + '\'' + ", creationTimestampMillis=" + this.f3920d + ", parameters=" + this.f3919c + '}';
    }
}
