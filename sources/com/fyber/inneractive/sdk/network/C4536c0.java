package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4270d;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4315k;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4283a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.serverapi.C5298a;
import com.fyber.inneractive.sdk.serverapi.C5300b;
import com.fyber.inneractive.sdk.serverapi.C5301c;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5349k0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5368r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.c0 */
public class C4536c0 extends C4540e0<C5291e> implements C4558m {

    /* renamed from: g */
    public final InneractiveAdRequest f11209g;

    /* renamed from: h */
    public Map<String, String> f11210h;

    /* renamed from: i */
    public StringBuffer f11211i;

    /* renamed from: j */
    public final C5301c f11212j;

    /* renamed from: k */
    public C4364g f11213k;

    /* renamed from: l */
    public C4309s f11214l;

    /* renamed from: m */
    public boolean f11215m;

    public C4536c0(C4579u<C5291e> uVar, InneractiveAdRequest inneractiveAdRequest, C4309s sVar) {
        this(uVar, inneractiveAdRequest, new C5300b(sVar), C4580v.m14056b().mo24773a(), sVar);
    }

    /* renamed from: a */
    public String mo24715a() {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            str = "https://" + IAConfigManager.f10525J.f10544i.f10686f;
        } else {
            str = C4261a.m13438a(property, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f11209g;
        C5301c cVar = this.f11212j;
        C4538d0 d0Var = new C4538d0(inneractiveAdRequest, cVar);
        d0Var.f11219c = new HashMap();
        d0Var.mo24745a("fromSDK", Boolean.toString(true));
        d0Var.mo24745a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        String str5 = "1";
        d0Var.mo24745a("secure", (C5368r.m16780a() ^ true) || IAConfigManager.f10525J.f10553r ? str5 : "0");
        d0Var.mo24745a("spotid", inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            if (inneractiveAdRequest.getSelectedUnitConfig() == null) {
                property2 = null;
            } else {
                property2 = ((C4345y) inneractiveAdRequest.getSelectedUnitConfig()).f10745a;
            }
        }
        d0Var.mo24745a("uid", property2);
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        if (!TextUtils.isEmpty(iAConfigManager.f10550o)) {
            d0Var.mo24745a("med", String.format("%s_%s", new Object[]{iAConfigManager.f10548m, iAConfigManager.f10550o}));
        } else {
            d0Var.mo24745a("med", iAConfigManager.f10548m);
        }
        cVar.getClass();
        d0Var.mo24745a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        C5300b bVar = (C5300b) cVar;
        List<Integer> list = C5300b.f14105e;
        if (!list.isEmpty()) {
            d0Var.mo24745a("protocols", C5350l.m16755a(",", (Collection<Integer>) list));
        }
        List<String> list2 = C5300b.f14106f;
        if (!list2.isEmpty()) {
            d0Var.mo24745a("mimes", C5350l.m16762b(",", list2));
        }
        List<Integer> list3 = C5300b.f14104d;
        if (!list3.isEmpty()) {
            d0Var.mo24745a("api", C5350l.m16755a(",", (Collection<Integer>) list3));
        }
        d0Var.mo24745a(CampaignUnit.JSON_KEY_SESSION_ID, Integer.toString(iAConfigManager.f10545j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f10545j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            d0Var.mo24745a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            d0Var.mo24745a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        d0Var.mo24745a("zip", iAConfigManager.f10545j.getZipCode());
        d0Var.mo24745a(CampaignEx.JSON_KEY_AD_K, iAConfigManager.f10546k);
        d0Var.mo24745a("t", Long.toString(System.currentTimeMillis()));
        d0Var.mo24745a("v", bVar.mo26398a("2.2.0"));
        Boolean a = iAConfigManager.f10530D.mo24279a();
        if (a != null) {
            if (a.booleanValue()) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            d0Var.mo24745a("gdpr_privacy_consent", str4);
        }
        C4270d dVar = iAConfigManager.f10530D;
        dVar.getClass();
        if (C5350l.f14216a == null) {
            bool = null;
        } else {
            bool = dVar.f10599f;
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str5 = "0";
            }
            d0Var.mo24745a("lgpd_consent", str5);
        }
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
        String str6 = C4315k.m13547b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(property3)) {
            property3 = C4315k.m13546a();
        }
        d0Var.mo24745a(str6, property3);
        d0Var.mo24745a("dnt", Boolean.toString(C4315k.m13548c()));
        d0Var.mo24745a("dml", bVar.mo26400b());
        int c = C5350l.m16765c(C5350l.m16769e());
        int c2 = C5350l.m16765c(C5350l.m16767d());
        if (c > 0 && c2 > 0) {
            d0Var.mo24745a("w", Integer.toString(c));
            d0Var.mo24745a("h", Integer.toString(c2));
        }
        int c3 = C5350l.m16764c();
        d0Var.mo24745a("o", c3 == 1 ? "p" : c3 == 2 ? "l" : "u");
        if (bVar.mo26412n() && iAConfigManager.f10554s) {
            d0Var.mo24745a("lg", bVar.mo26402d() + "," + bVar.mo26403e());
            d0Var.mo24745a("hacc", bVar.mo26401c());
            d0Var.mo24745a("vacc", bVar.mo26405g());
            d0Var.mo24745a("tacc", bVar.mo26404f());
        }
        d0Var.mo24745a("ciso", C5348k.m16742g());
        d0Var.mo24745a("os", APSAnalytics.OS_NAME);
        d0Var.mo24745a("mcc", bVar.mo26406h());
        d0Var.mo24745a("mnc", bVar.mo26407i());
        d0Var.mo24745a("nt", C5349k0.m16751f().f14215a);
        d0Var.mo24745a("crn", bVar.mo26396a());
        d0Var.mo24745a("lng", iAConfigManager.f10551p);
        List<String> list4 = iAConfigManager.f10552q;
        if (list4 != null && !list4.isEmpty()) {
            d0Var.mo24745a("in_lng", C5350l.m16762b(",", list4));
        }
        d0Var.mo24745a(BidResponsed.KEY_BID_ID, C5350l.f14216a.getPackageName());
        d0Var.mo24745a("appv", bVar.mo26409k());
        C4270d dVar2 = iAConfigManager.f10530D;
        dVar2.getClass();
        if (C5350l.f14216a == null) {
            str2 = null;
        } else {
            str2 = dVar2.f10595b;
        }
        d0Var.mo24745a("gdpr_consent_data", str2);
        C4270d dVar3 = iAConfigManager.f10530D;
        dVar3.getClass();
        if (C5350l.f14216a == null) {
            str3 = null;
        } else {
            str3 = dVar3.f10598e;
        }
        d0Var.mo24745a("us_privacy", str3);
        d0Var.mo24745a("mute_video", Boolean.toString(iAConfigManager.f10547l));
        d0Var.mo24745a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        bVar.mo26399a(hashMap, inneractiveAdRequest.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            d0Var.mo24745a((String) entry.getKey(), (String) entry.getValue());
        }
        Map<String, String> map = d0Var.f11219c;
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            sb.append(z ? "?" : "&");
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) next.getValue()));
            z = false;
        }
        String sb2 = sb.toString();
        if (!this.f11215m) {
            int i2 = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "%s %s", "AD_REQUEST", sb2);
            this.f11215m = true;
        }
        return sb2;
    }

    /* renamed from: d */
    public StringBuffer mo24736d() {
        return this.f11211i;
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.HIGH;
    }

    /* renamed from: h */
    public C4309s mo24724h() {
        return this.f11214l;
    }

    /* renamed from: i */
    public C4566o0 mo24725i() {
        C4283a aVar;
        C4309s sVar = this.f11214l;
        if (sVar == null || (aVar = (C4283a) sVar.mo24338a(C4283a.class)) == null) {
            return super.mo24725i();
        }
        Integer b = aVar.mo24314b("connect_timeout");
        int i = 5000;
        int max = Math.max(b != null ? b.intValue() : 5000, 1);
        Integer b2 = aVar.mo24314b("read_timeout");
        if (b2 != null) {
            i = b2.intValue();
        }
        return new C4566o0(max, Math.max(i, 1));
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return false;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11396b;
    }

    /* renamed from: o */
    public Map<String, String> mo24737o() {
        return this.f11210h;
    }

    /* renamed from: p */
    public int mo24731p() {
        return 0;
    }

    /* renamed from: q */
    public Map<String, String> mo24732q() {
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        IAlog.m16699a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    public C4536c0(C4579u<C5291e> uVar, InneractiveAdRequest inneractiveAdRequest, C5301c cVar, C4544g gVar, C4309s sVar) {
        super(uVar, gVar);
        this.f11213k = null;
        this.f11215m = false;
        this.f11214l = sVar;
        this.f11209g = inneractiveAdRequest;
        this.f11212j = cVar;
    }

    /* renamed from: k */
    public byte[] mo24727k() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            C4309s sVar = ((C5300b) this.f11212j).f14107a;
            JSONArray d = sVar != null ? sVar.mo24343d() : null;
            if (d != null && d.length() > 0) {
                jSONObject2.put("experiments", d);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = C5298a.m16649a(this.f11209g.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            JSONArray a2 = iAConfigManager.f10559x.mo24284a(a);
            if (a2 != null && a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = iAConfigManager.f10557v.f10660b.mo24345a("dv_enabled", 0, 0);
            if (a != null && a3 == 1) {
                C4364g a4 = iAConfigManager.f10531E.mo24399a(a);
                this.f11213k = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.f10769a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.m16699a("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.m16699a("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[Catch:{ Exception -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077 A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.network.C4530a0 mo24713a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L_0x003a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0010
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0010
            java.lang.String r2 = r2.toLowerCase()
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L_0x0010
        L_0x0038:
            r5.f11210h = r0
        L_0x003a:
            r7 = 0
            if (r6 == 0) goto L_0x004d
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.C5370s.m16788a((java.io.InputStream) r6, (boolean) r8)     // Catch:{ Exception -> 0x0042 }
            goto L_0x004b
        L_0x0042:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.m16698a(r1, r6, r0)
            r6 = r7
        L_0x004b:
            r5.f11211i = r6
        L_0x004d:
            com.fyber.inneractive.sdk.network.a0 r6 = new com.fyber.inneractive.sdk.network.a0
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f11210h     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = "X-IA-Ad-Type"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0081 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x006f
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r7
        L_0x0070:
            if (r0 == 0) goto L_0x0077
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0078
        L_0x0077:
            r0 = 6
        L_0x0078:
            com.fyber.inneractive.sdk.dv.g r1 = r5.f11213k     // Catch:{ Exception -> 0x0081 }
            com.fyber.inneractive.sdk.response.e r7 = r5.mo24746a(r0, r5, r7, r1)     // Catch:{ Exception -> 0x0081 }
            r6.f11197a = r7     // Catch:{ Exception -> 0x0081 }
            return r6
        L_0x0081:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.m16698a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.z r7 = new com.fyber.inneractive.sdk.network.z
            r7.<init>((java.lang.Exception) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4536c0.mo24713a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.network.a0");
    }
}
