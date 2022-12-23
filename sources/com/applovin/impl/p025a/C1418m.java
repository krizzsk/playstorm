package com.applovin.impl.p025a;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.m */
public class C1418m {

    /* renamed from: a */
    private List<C1421n> f1604a = Collections.emptyList();

    /* renamed from: b */
    private List<String> f1605b = Collections.emptyList();

    /* renamed from: c */
    private int f1606c;

    /* renamed from: d */
    private Uri f1607d;

    /* renamed from: e */
    private final Set<C1415j> f1608e = new HashSet();

    /* renamed from: f */
    private final Map<String, Set<C1415j>> f1609f = new HashMap();

    /* renamed from: com.applovin.impl.a.m$a */
    public enum C1420a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private C1418m() {
    }

    private C1418m(C1409e eVar) {
        this.f1605b = eVar.mo12680g();
    }

    /* renamed from: a */
    private static int m2445a(String str, C1959m mVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, CertificateUtil.DELIMITER);
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds((long) StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds((long) StringUtils.parseInt(explode.get(1))) + ((long) StringUtils.parseInt(explode.get(2))));
            }
        } catch (Throwable unused) {
            if (C2092v.m5047a()) {
                C2092v A = mVar.mo14286A();
                A.mo14793e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static C1418m m2446a(C2088r rVar, C1418m mVar, C1409e eVar, C1959m mVar2) {
        C2088r b;
        List<C1421n> a;
        C2088r b2;
        int a2;
        if (rVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        } else if (mVar2 != null) {
            if (mVar == null) {
                try {
                    mVar = new C1418m(eVar);
                } catch (Throwable th) {
                    if (!C2092v.m5047a()) {
                        return null;
                    }
                    mVar2.mo14286A().mo14790b("VastVideoCreative", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (mVar.f1606c == 0 && (b2 = rVar.mo14767b(Linear.DURATION)) != null && (a2 = m2445a(b2.mo14770c(), mVar2)) > 0) {
                mVar.f1606c = a2;
            }
            C2088r b3 = rVar.mo14767b(Linear.MEDIA_FILES);
            if (!(b3 == null || (a = m2447a(b3, mVar2)) == null || a.size() <= 0)) {
                if (mVar.f1604a != null) {
                    a.addAll(mVar.f1604a);
                }
                mVar.f1604a = a;
            }
            C2088r b4 = rVar.mo14767b("VideoClicks");
            if (b4 != null) {
                if (mVar.f1607d == null && (b = b4.mo14767b(VideoClicks.CLICK_THROUGH)) != null) {
                    String c = b.mo14770c();
                    if (StringUtils.isValidString(c)) {
                        mVar.f1607d = Uri.parse(c);
                    }
                }
                C1417l.m2436a(b4.mo14766a(VideoClicks.CLICK_TRACKING), mVar.f1608e, eVar, mVar2);
            }
            C1417l.m2435a(rVar, mVar.f1609f, eVar, mVar2);
            return mVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static List<C1421n> m2447a(C2088r rVar, C1959m mVar) {
        List<C2088r> a = rVar.mo14766a(MediaFile.NAME);
        ArrayList arrayList = new ArrayList(a.size());
        List<String> explode = CollectionUtils.explode((String) mVar.mo14311a(C1857b.f3314ek));
        List<String> explode2 = CollectionUtils.explode((String) mVar.mo14311a(C1857b.f3313ej));
        for (C2088r a2 : a) {
            C1421n a3 = C1421n.m2456a(a2, mVar);
            if (a3 != null) {
                try {
                    String c = a3.mo12719c();
                    if (!StringUtils.isValidString(c) || explode.contains(c)) {
                        if (((Boolean) mVar.mo14311a(C1857b.f3315el)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.mo12718b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        if (C2092v.m5047a()) {
                            C2092v A = mVar.mo14286A();
                            A.mo14792d("VastVideoCreative", "Video file not supported: " + a3);
                        }
                    }
                    arrayList.add(a3);
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v A2 = mVar.mo14286A();
                        A2.mo14790b("VastVideoCreative", "Failed to validate video file: " + a3, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1421n mo12705a(C1420a aVar) {
        List<C1421n> list = this.f1604a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String next : this.f1605b) {
            for (C1421n next2 : this.f1604a) {
                String c = next2.mo12719c();
                if (StringUtils.isValidString(c) && next.equalsIgnoreCase(c)) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f1604a;
        }
        if (C2039g.m4884c()) {
            Collections.sort(arrayList, new Comparator<C1421n>() {
                /* renamed from: a */
                public int compare(C1421n nVar, C1421n nVar2) {
                    return Integer.compare(nVar.mo12720d(), nVar2.mo12720d());
                }
            });
        }
        return (C1421n) arrayList.get(aVar == C1420a.LOW ? 0 : aVar == C1420a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    /* renamed from: a */
    public List<C1421n> mo12706a() {
        return this.f1604a;
    }

    /* renamed from: b */
    public int mo12707b() {
        return this.f1606c;
    }

    /* renamed from: c */
    public Uri mo12708c() {
        return this.f1607d;
    }

    /* renamed from: d */
    public Set<C1415j> mo12709d() {
        return this.f1608e;
    }

    /* renamed from: e */
    public Map<String, Set<C1415j>> mo12710e() {
        return this.f1609f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1418m)) {
            return false;
        }
        C1418m mVar = (C1418m) obj;
        if (this.f1606c != mVar.f1606c) {
            return false;
        }
        List<C1421n> list = this.f1604a;
        if (list == null ? mVar.f1604a != null : !list.equals(mVar.f1604a)) {
            return false;
        }
        Uri uri = this.f1607d;
        if (uri == null ? mVar.f1607d != null : !uri.equals(mVar.f1607d)) {
            return false;
        }
        Set<C1415j> set = this.f1608e;
        if (set == null ? mVar.f1608e != null : !set.equals(mVar.f1608e)) {
            return false;
        }
        Map<String, Set<C1415j>> map = this.f1609f;
        Map<String, Set<C1415j>> map2 = mVar.f1609f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        List<C1421n> list = this.f1604a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f1606c) * 31;
        Uri uri = this.f1607d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<C1415j> set = this.f1608e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C1415j>> map = this.f1609f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f1604a + ", durationSeconds=" + this.f1606c + ", destinationUri=" + this.f1607d + ", clickTrackers=" + this.f1608e + ", eventTrackers=" + this.f1609f + '}';
    }
}
