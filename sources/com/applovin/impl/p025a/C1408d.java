package com.applovin.impl.p025a;

import android.net.Uri;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.smaato.sdk.video.vast.model.Companion;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.d */
public class C1408d {

    /* renamed from: a */
    private int f1553a;

    /* renamed from: b */
    private int f1554b;

    /* renamed from: c */
    private Uri f1555c;

    /* renamed from: d */
    private C1412h f1556d;

    /* renamed from: e */
    private Set<C1415j> f1557e = new HashSet();

    /* renamed from: f */
    private Map<String, Set<C1415j>> f1558f = new HashMap();

    private C1408d() {
    }

    /* renamed from: a */
    public static C1408d m2396a(C2088r rVar, C1408d dVar, C1409e eVar, C1959m mVar) {
        C2088r b;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            if (dVar == null) {
                try {
                    dVar = new C1408d();
                } catch (Throwable th) {
                    if (!C2092v.m5047a()) {
                        return null;
                    }
                    mVar.mo14286A().mo14790b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (dVar.f1553a == 0 && dVar.f1554b == 0) {
                int parseInt = StringUtils.parseInt(rVar.mo14768b().get("width"));
                int parseInt2 = StringUtils.parseInt(rVar.mo14768b().get("height"));
                if (parseInt > 0 && parseInt2 > 0) {
                    dVar.f1553a = parseInt;
                    dVar.f1554b = parseInt2;
                }
            }
            dVar.f1556d = C1412h.m2413a(rVar, dVar.f1556d, mVar);
            if (dVar.f1555c == null && (b = rVar.mo14767b(Companion.COMPANION_CLICK_THROUGH)) != null) {
                String c = b.mo14770c();
                if (StringUtils.isValidString(c)) {
                    dVar.f1555c = Uri.parse(c);
                }
            }
            C1417l.m2436a(rVar.mo14766a(Companion.COMPANION_CLICK_TRACKING), dVar.f1557e, eVar, mVar);
            C1417l.m2435a(rVar, dVar.f1558f, eVar, mVar);
            return dVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo12667a() {
        return this.f1555c;
    }

    /* renamed from: b */
    public C1412h mo12668b() {
        return this.f1556d;
    }

    /* renamed from: c */
    public Set<C1415j> mo12669c() {
        return this.f1557e;
    }

    /* renamed from: d */
    public Map<String, Set<C1415j>> mo12670d() {
        return this.f1558f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1408d)) {
            return false;
        }
        C1408d dVar = (C1408d) obj;
        if (this.f1553a != dVar.f1553a || this.f1554b != dVar.f1554b) {
            return false;
        }
        Uri uri = this.f1555c;
        if (uri == null ? dVar.f1555c != null : !uri.equals(dVar.f1555c)) {
            return false;
        }
        C1412h hVar = this.f1556d;
        if (hVar == null ? dVar.f1556d != null : !hVar.equals(dVar.f1556d)) {
            return false;
        }
        Set<C1415j> set = this.f1557e;
        if (set == null ? dVar.f1557e != null : !set.equals(dVar.f1557e)) {
            return false;
        }
        Map<String, Set<C1415j>> map = this.f1558f;
        Map<String, Set<C1415j>> map2 = dVar.f1558f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f1553a * 31) + this.f1554b) * 31;
        Uri uri = this.f1555c;
        int i2 = 0;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C1412h hVar = this.f1556d;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Set<C1415j> set = this.f1557e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1415j>> map = this.f1558f;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f1553a + ", height=" + this.f1554b + ", destinationUri=" + this.f1555c + ", nonVideoResource=" + this.f1556d + ", clickTrackers=" + this.f1557e + ", eventTrackers=" + this.f1558f + '}';
    }
}
