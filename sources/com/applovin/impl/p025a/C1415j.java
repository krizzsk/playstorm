package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.j */
public class C1415j {

    /* renamed from: a */
    private String f1596a;

    /* renamed from: b */
    private String f1597b;

    /* renamed from: c */
    private String f1598c;

    /* renamed from: d */
    private long f1599d = -1;

    /* renamed from: e */
    private int f1600e = -1;

    private C1415j() {
    }

    /* renamed from: a */
    private static int m2421a(String str, C1409e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if (TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE.equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if (TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE.equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.mo12681h();
        }
        return 95;
    }

    /* renamed from: a */
    public static C1415j m2422a(C2088r rVar, C1409e eVar, C1959m mVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (mVar != null) {
            try {
                String c = rVar.mo14770c();
                if (StringUtils.isValidString(c)) {
                    C1415j jVar = new C1415j();
                    jVar.f1598c = c;
                    jVar.f1596a = rVar.mo14768b().get("id");
                    jVar.f1597b = rVar.mo14768b().get("event");
                    jVar.f1600e = m2421a(jVar.mo12699a(), eVar);
                    String str = rVar.mo14768b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            jVar.f1600e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(CertificateUtil.DELIMITER) && (size = explode.size()) > 0) {
                            long j = 0;
                            int i = size - 1;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = (explode = CollectionUtils.explode(trim, CertificateUtil.DELIMITER)).get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = (long) parseInt;
                                    } else {
                                        if (i2 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i2 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds((long) parseInt);
                                    }
                                    j += seconds;
                                }
                            }
                            jVar.f1599d = j;
                            jVar.f1600e = -1;
                        }
                    }
                    return jVar;
                } else if (!C2092v.m5047a()) {
                    return null;
                } else {
                    mVar.mo14286A().mo14793e("VastTracker", "Unable to create tracker. Could not find URL.");
                    return null;
                }
            } catch (Throwable th) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                mVar.mo14286A().mo14790b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo12699a() {
        return this.f1597b;
    }

    /* renamed from: a */
    public boolean mo12700a(long j, int i) {
        boolean z = this.f1599d >= 0;
        boolean z2 = j >= this.f1599d;
        boolean z3 = this.f1600e >= 0;
        boolean z4 = i >= this.f1600e;
        if (!z || !z2) {
            return z3 && z4;
        }
        return true;
    }

    /* renamed from: b */
    public String mo12701b() {
        return this.f1598c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1415j)) {
            return false;
        }
        C1415j jVar = (C1415j) obj;
        if (this.f1599d != jVar.f1599d || this.f1600e != jVar.f1600e) {
            return false;
        }
        String str = this.f1596a;
        if (str == null ? jVar.f1596a != null : !str.equals(jVar.f1596a)) {
            return false;
        }
        String str2 = this.f1597b;
        if (str2 == null ? jVar.f1597b == null : str2.equals(jVar.f1597b)) {
            return this.f1598c.equals(jVar.f1598c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1596a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1597b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f1599d;
        return ((((((hashCode + i) * 31) + this.f1598c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f1600e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f1596a + '\'' + ", event='" + this.f1597b + '\'' + ", uriString='" + this.f1598c + '\'' + ", offsetSeconds=" + this.f1599d + ", offsetPercent=" + this.f1600e + '}';
    }
}
