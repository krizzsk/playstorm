package com.applovin.impl.p025a;

import android.net.Uri;
import com.applovin.impl.p025a.C1418m;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p045a.C1803g;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1865a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.a */
public class C1401a extends C1829e {

    /* renamed from: a */
    private final String f1514a;

    /* renamed from: b */
    private final String f1515b;

    /* renamed from: c */
    private final C1414i f1516c;

    /* renamed from: d */
    private final long f1517d;

    /* renamed from: e */
    private final C1418m f1518e;

    /* renamed from: f */
    private final C1408d f1519f;

    /* renamed from: g */
    private final String f1520g;

    /* renamed from: h */
    private final C1407c f1521h;

    /* renamed from: i */
    private final C1803g f1522i;

    /* renamed from: j */
    private final Set<C1415j> f1523j;

    /* renamed from: k */
    private final Set<C1415j> f1524k;

    /* renamed from: com.applovin.impl.a.a$a */
    public static class C1403a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public JSONObject f1525a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public JSONObject f1526b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1825b f1527c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1959m f1528d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f1529e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f1530f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f1531g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C1414i f1532h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C1418m f1533i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C1408d f1534j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C1407c f1535k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Set<C1415j> f1536l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Set<C1415j> f1537m;

        /* renamed from: a */
        public C1403a mo12642a(long j) {
            this.f1529e = j;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12643a(C1407c cVar) {
            this.f1535k = cVar;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12644a(C1408d dVar) {
            this.f1534j = dVar;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12645a(C1414i iVar) {
            this.f1532h = iVar;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12646a(C1418m mVar) {
            this.f1533i = mVar;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12647a(C1825b bVar) {
            this.f1527c = bVar;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12648a(C1959m mVar) {
            if (mVar != null) {
                this.f1528d = mVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public C1403a mo12649a(String str) {
            this.f1530f = str;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12650a(Set<C1415j> set) {
            this.f1536l = set;
            return this;
        }

        /* renamed from: a */
        public C1403a mo12651a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1525a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public C1401a mo12652a() {
            return new C1401a(this);
        }

        /* renamed from: b */
        public C1403a mo12653b(String str) {
            this.f1531g = str;
            return this;
        }

        /* renamed from: b */
        public C1403a mo12654b(Set<C1415j> set) {
            this.f1537m = set;
            return this;
        }

        /* renamed from: b */
        public C1403a mo12655b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f1526b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* renamed from: com.applovin.impl.a.a$b */
    public enum C1404b {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.a.a$c */
    public enum C1405c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private C1401a(C1403a aVar) {
        super(aVar.f1525a, aVar.f1526b, aVar.f1527c, aVar.f1528d);
        this.f1514a = aVar.f1530f;
        this.f1516c = aVar.f1532h;
        this.f1515b = aVar.f1531g;
        this.f1518e = aVar.f1533i;
        this.f1519f = aVar.f1534j;
        this.f1521h = aVar.f1535k;
        this.f1523j = aVar.f1536l;
        this.f1524k = aVar.f1537m;
        this.f1522i = new C1803g(this);
        Uri h = mo12630h();
        this.f1520g = h != null ? h.toString() : "";
        this.f1517d = aVar.f1529e;
    }

    /* renamed from: a */
    private Set<C1415j> m2330a(C1404b bVar, String[] strArr) {
        C1408d dVar;
        C1418m mVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<C1415j>> map = null;
        if (bVar == C1404b.VIDEO && (mVar = this.f1518e) != null) {
            map = mVar.mo12710e();
        } else if (bVar == C1404b.COMPANION_AD && (dVar = this.f1519f) != null) {
            map = dVar.mo12670d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: aT */
    private String m2331aT() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: aU */
    private C1418m.C1420a m2332aU() {
        C1418m.C1420a[] values = C1418m.C1420a.values();
        int intValue = ((Integer) this.sdk.mo14311a(C1857b.f3316em)).intValue();
        return (intValue < 0 || intValue >= values.length) ? C1418m.C1420a.UNSPECIFIED : values[intValue];
    }

    /* renamed from: aV */
    private Set<C1415j> m2333aV() {
        C1418m mVar = this.f1518e;
        return mVar != null ? mVar.mo12709d() : Collections.emptySet();
    }

    /* renamed from: aW */
    private Set<C1415j> m2334aW() {
        C1408d dVar = this.f1519f;
        return dVar != null ? dVar.mo12669c() : Collections.emptySet();
    }

    /* renamed from: D */
    public boolean mo12608D() {
        return getBooleanFromAdObject("video_clickable", false) && mo12635j() != null;
    }

    /* renamed from: a */
    public Set<C1415j> mo12609a(C1405c cVar, String str) {
        return mo12610a(cVar, new String[]{str});
    }

    /* renamed from: a */
    public Set<C1415j> mo12610a(C1405c cVar, String[] strArr) {
        C1404b bVar;
        if (C2092v.m5047a()) {
            C2092v A = this.sdk.mo14286A();
            A.mo14789b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == C1405c.IMPRESSION) {
            return this.f1523j;
        }
        if (cVar == C1405c.VIDEO_CLICK) {
            return m2333aV();
        }
        if (cVar == C1405c.COMPANION_CLICK) {
            return m2334aW();
        }
        if (cVar == C1405c.VIDEO) {
            bVar = C1404b.VIDEO;
        } else if (cVar == C1405c.COMPANION) {
            bVar = C1404b.COMPANION_AD;
        } else if (cVar == C1405c.ERROR) {
            return this.f1524k;
        } else {
            if (C2092v.m5047a()) {
                C2092v A2 = this.sdk.mo14286A();
                A2.mo14793e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
            }
            return Collections.emptySet();
        }
        return m2330a(bVar, strArr);
    }

    /* renamed from: a */
    public void mo12611a() {
    }

    /* renamed from: a */
    public void mo12612a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    /* renamed from: aM */
    public C1408d mo12613aM() {
        return this.f1519f;
    }

    /* renamed from: aN */
    public boolean mo12614aN() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    /* renamed from: aO */
    public String mo12615aO() {
        return getStringFromAdObject("html_template", "");
    }

    /* renamed from: aP */
    public Uri mo12616aP() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aQ */
    public boolean mo12617aQ() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    /* renamed from: aR */
    public boolean mo12618aR() {
        return getBooleanFromAdObject("cache_video", true);
    }

    /* renamed from: aS */
    public C1407c mo12619aS() {
        return this.f1521h;
    }

    /* renamed from: at */
    public List<C1865a> mo12620at() {
        List<C1865a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), (Map<String, String>) null, m2331aT(), mo14000au(), mo14018y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: b */
    public void mo12621b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    /* renamed from: c */
    public C1803g mo12640o() {
        return this.f1522i;
    }

    /* renamed from: d */
    public String mo12623d() {
        return this.f1520g;
    }

    /* renamed from: e */
    public long mo12624e() {
        return getLongFromAdObject("real_close_delay", 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1401a) || !super.equals(obj)) {
            return false;
        }
        C1401a aVar = (C1401a) obj;
        String str = this.f1514a;
        if (str == null ? aVar.f1514a != null : !str.equals(aVar.f1514a)) {
            return false;
        }
        String str2 = this.f1515b;
        if (str2 == null ? aVar.f1515b != null : !str2.equals(aVar.f1515b)) {
            return false;
        }
        C1414i iVar = this.f1516c;
        if (iVar == null ? aVar.f1516c != null : !iVar.equals(aVar.f1516c)) {
            return false;
        }
        C1418m mVar = this.f1518e;
        if (mVar == null ? aVar.f1518e != null : !mVar.equals(aVar.f1518e)) {
            return false;
        }
        C1408d dVar = this.f1519f;
        if (dVar == null ? aVar.f1519f != null : !dVar.equals(aVar.f1519f)) {
            return false;
        }
        C1407c cVar = this.f1521h;
        if (cVar == null ? aVar.f1521h != null : !cVar.equals(aVar.f1521h)) {
            return false;
        }
        Set<C1415j> set = this.f1523j;
        if (set == null ? aVar.f1523j != null : !set.equals(aVar.f1523j)) {
            return false;
        }
        Set<C1415j> set2 = this.f1524k;
        Set<C1415j> set3 = aVar.f1524k;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    /* renamed from: f */
    public boolean mo12626f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    /* renamed from: g */
    public C1404b mo12627g() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? C1404b.COMPANION_AD : C1404b.VIDEO;
    }

    public long getCreatedAtMillis() {
        return this.f1517d;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    /* renamed from: h */
    public Uri mo12630h() {
        C1421n n = mo12639n();
        if (n != null) {
            return n.mo12718b();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo12706a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideoUrl() {
        /*
            r2 = this;
            com.applovin.impl.a.m r0 = r2.f1518e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r0.mo12706a()
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p025a.C1401a.hasVideoUrl():boolean");
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f1514a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1515b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C1414i iVar = this.f1516c;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C1418m mVar = this.f1518e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C1408d dVar = this.f1519f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C1407c cVar = this.f1521h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<C1415j> set = this.f1523j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<C1415j> set2 = this.f1524k;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public boolean mo12633i() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", true) && this.f1521h != null;
    }

    /* renamed from: j */
    public Uri mo12635j() {
        C1418m mVar = this.f1518e;
        if (mVar != null) {
            return mVar.mo12708c();
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo12636k() {
        return mo12635j();
    }

    /* renamed from: l */
    public C1414i mo12637l() {
        return this.f1516c;
    }

    /* renamed from: m */
    public C1418m mo12638m() {
        return this.f1518e;
    }

    /* renamed from: n */
    public C1421n mo12639n() {
        C1418m mVar = this.f1518e;
        if (mVar != null) {
            return mVar.mo12705a(m2332aU());
        }
        return null;
    }

    public String toString() {
        return "VastAd{title='" + this.f1514a + '\'' + ", adDescription='" + this.f1515b + '\'' + ", systemInfo=" + this.f1516c + ", videoCreative=" + this.f1518e + ", companionAd=" + this.f1519f + ", adVerifications=" + this.f1521h + ", impressionTrackers=" + this.f1523j + ", errorTrackers=" + this.f1524k + '}';
    }
}
