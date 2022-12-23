package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.environment.C6408c;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.C6437l;
import com.ironsource.environment.p201a.C6404b;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p207a.C6552c;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.server.C6758b;
import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.mediationsdk.utils.C6770g;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.tapjoy.TapjoyConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f */
public final class C6656f {

    /* renamed from: b */
    private static C6656f f17297b = new C6656f();

    /* renamed from: a */
    private final AtomicBoolean f17298a = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    public static class C6657a {

        /* renamed from: a */
        String f17299a;

        /* renamed from: b */
        List<C6758b> f17300b;

        /* renamed from: c */
        C6758b f17301c;

        /* renamed from: d */
        JSONObject f17302d;

        /* renamed from: e */
        JSONObject f17303e;

        /* renamed from: f */
        int f17304f;

        /* renamed from: g */
        String f17305g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    static class C6658b implements Runnable {

        /* renamed from: a */
        private String f17306a;

        /* renamed from: b */
        private String f17307b;

        /* renamed from: c */
        private String f17308c;

        public C6658b(String str, String str2, String str3) {
            this.f17306a = str;
            this.f17307b = str2;
            this.f17308c = str3;
        }

        public final void run() {
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17308c).openConnection();
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z = true;
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("exception - e");
            }
            if (!z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                    jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f17306a + ";" + this.f17307b + ";" + this.f17308c);
                } catch (JSONException e) {
                    e.printStackTrace();
                    IronLog.INTERNAL.error("Send auction failure exception " + e.getMessage());
                }
                C6557h.m19950d().mo36371b(new C6552c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f$c */
    enum C6659c {
        ;
        

        /* renamed from: a */
        public static final int f17309a = 1;

        /* renamed from: b */
        public static final int f17310b = 2;

        static {
            f17311c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    static C6657a m20308a(JSONObject jSONObject) {
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID);
        if (!TextUtils.isEmpty(optString)) {
            C6657a aVar = new C6657a();
            aVar.f17299a = optString;
            JSONObject jSONObject2 = null;
            if (jSONObject.has("settings")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("settings");
                aVar.f17301c = new C6758b(jSONObject3);
                if (jSONObject3.has("armData")) {
                    jSONObject2 = jSONObject3.optJSONObject("armData");
                }
                if (jSONObject3.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                    aVar.f17302d = jSONObject3.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
                }
                if (jSONObject3.has(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS)) {
                    aVar.f17303e = jSONObject3.optJSONObject(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                }
            }
            aVar.f17300b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
            int i = 0;
            while (i < jSONArray.length()) {
                C6758b bVar = new C6758b(jSONArray.getJSONObject(i), jSONObject2);
                if (bVar.mo36945g()) {
                    aVar.f17300b.add(bVar);
                    i++;
                } else {
                    aVar.f17304f = 1002;
                    aVar.f17305g = "waterfall " + i;
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    /* renamed from: a */
    public static C6656f m20309a() {
        return f17297b;
    }

    /* renamed from: a */
    public static C6758b m20310a(String str, List<C6758b> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo36939a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m20311a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* renamed from: a */
    static JSONObject m20312a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(C6770g.m20577a().mo36966b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m20313a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static void m20314a(String str, String str2, String str3) {
        C6423c.f16330a.mo35934c(new C6658b(str, str2, str3));
    }

    /* renamed from: a */
    private void m20315a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    int i = 0;
                    str = next;
                    while (jSONObject.has(str)) {
                        i++;
                        str = next + "_" + i;
                    }
                } else {
                    str = next;
                }
                try {
                    jSONObject.put(str, jSONObject2.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (((com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m20316b() {
        /*
            int r0 = com.ironsource.mediationsdk.C6656f.C6659c.f17310b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0016
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            int r0 = com.ironsource.mediationsdk.C6656f.C6659c.f17310b
            goto L_0x0036
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0034
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0013
        L_0x0034:
            int r0 = com.ironsource.mediationsdk.C6656f.C6659c.f17309a
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6656f.m20316b():int");
    }

    /* renamed from: b */
    public static Map<String, String> m20317b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: b */
    private JSONObject m20318b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = C6437l.f16349b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !C6437l.f16348a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: c */
    public static String m20319c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
            return str;
        }
    }

    /* renamed from: d */
    public static String m20320d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID)) {
                return "";
            }
            String string = jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("demand source = " + string);
            return string;
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.error("exception " + e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public final String mo36671a(String str, int i, C6758b bVar, String str2, String str3, String str4) {
        String str5;
        String c = bVar.mo36941c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(((double) Math.round((parseDouble / parseDouble2) * 1000.0d)) / 1000.0d);
                return m20311a(str, bVar.mo36939a(), i, m20320d(bVar.mo36940b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return m20311a(str, bVar.mo36939a(), i, m20320d(bVar.mo36940b()), c, str5, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo36672a(Context context, Map<String, Object> map, List<String> list, C6663i iVar, int i, String str, C6765c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        String str3;
        boolean z;
        C6663i iVar2 = iVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instanceType", 2);
            Map<String, Object> map2 = map;
            jSONObject4.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar2.mo36680a(next);
            }
            jSONObject4.put("performance", str2);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instanceType", 1);
                jSONObject5.put("performance", iVar2 != null ? iVar2.mo36680a(next2) : str2);
                jSONObject3.put(next2, jSONObject5);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C6653d.m20285a().f17286c;
        concurrentHashMap.putAll(C6774k.m20599a().mo36978d());
        JSONObject jSONObject6 = new JSONObject();
        for (Map.Entry next3 : concurrentHashMap.entrySet()) {
            jSONObject6.put((String) next3.getKey(), TextUtils.join(",", (Iterable) next3.getValue()));
        }
        mo36675a(new C6404b().mo35915a(), false);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationUserId", C6490J.m19474a().f16545k);
        Boolean bool = C6490J.m19474a().f16559y;
        if (bool != null) {
            jSONObject7.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject7.put("mobileCarrier", C6429h.m19324i(context));
        jSONObject7.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject7.put("deviceOS", "android");
        jSONObject7.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject7.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject7.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject7.put("deviceModel", Build.MODEL);
        jSONObject7.put("deviceMake", Build.MANUFACTURER);
        jSONObject7.put("bundleId", context.getPackageName());
        Context context2 = context;
        jSONObject7.put("appVersion", C6408c.m19242c(context, context.getPackageName()));
        jSONObject7.put("clientTimestamp", new Date().getTime());
        jSONObject7.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject7.put("browserUserAgent", C6429h.m19342r());
        jSONObject7.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject7.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject7.put("secure", m20316b() - 1);
        if (iSBannerSize != null) {
            jSONObject7.put("bannerSize", iSBannerSize.getDescription());
            jSONObject7.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject7.put("bannerHeight", iSBannerSize.getHeight());
        }
        String[] C = C6429h.m19297C(context);
        if (C == null || C.length != 2) {
            z = false;
            str3 = str2;
        } else {
            str3 = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
            z = Boolean.valueOf(C[1]).booleanValue();
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = IronSourceConstants.TYPE_GAID;
        } else {
            str3 = C6429h.m19349x(context);
            if (!TextUtils.isEmpty(str3)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject7.put("advId", str3);
            jSONObject7.put("advIdType", str2);
            jSONObject7.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String B = C6429h.m19296B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject7.put("asid", B);
        }
        String y = C6429h.m19350y(context);
        if (!TextUtils.isEmpty(y)) {
            jSONObject7.put("auid", y);
        }
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("applicationKey", C6490J.m19474a().f16544j);
        jSONObject8.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject8.put("clientParams", jSONObject7);
        jSONObject8.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject8.put("sessionId", str);
        jSONObject8.put("instances", jSONObject3);
        jSONObject8.put("auctionData", cVar.f17671c);
        jSONObject8.put("metaData", jSONObject6);
        if (jSONObject2 != null) {
            jSONObject8.put("sg", jSONObject2);
        }
        return jSONObject8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo36673a(String str, boolean z, Map<String, Object> map, List<String> list, C6663i iVar, int i, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        C6663i iVar2 = iVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("instp", 2);
            Map<String, Object> map2 = map;
            jSONObject5.put("badt", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar2.mo36680a(next);
            }
            jSONObject5.put("prfm", str2);
            jSONObject4.put(next, jSONObject5);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("instp", 1);
                jSONObject6.put("prfm", iVar2 != null ? iVar2.mo36680a(next2) : str2);
                jSONObject4.put(next2, jSONObject6);
            }
        }
        jSONObject3.put("inst", jSONObject4);
        JSONObject a = new C6404b().mo35915a();
        mo36675a(a, false);
        a.put("sd", i);
        a.put("scr", m20316b() - 1);
        if (jSONObject2 != null) {
            a.put("sg", jSONObject2);
        }
        jSONObject3.put("ctdt", a);
        if (iSBannerSize != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("bns", iSBannerSize.getDescription());
            jSONObject7.put("bnw", iSBannerSize.getWidth());
            jSONObject7.put("bnh", iSBannerSize.getHeight());
            jSONObject3.put("bndt", jSONObject7);
        }
        String str3 = str;
        jSONObject3.put("adu", str);
        jSONObject3.put("dner", z ^ true ? 1 : 0);
        return jSONObject3;
    }

    /* renamed from: a */
    public final JSONObject mo36674a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        C6639aj a = C6639aj.m20232a();
        a.mo36627a(C6639aj.m20237c());
        a.mo36627a(C6639aj.m20236b());
        JSONObject a2 = m20313a(a.f17238a, list.isEmpty() ? C6437l.f16348a : list);
        m20315a(a2, m20318b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = m20313a(jSONObject2, list);
        }
        m20315a(a2, jSONObject2);
        return a2;
    }

    /* renamed from: a */
    public final void mo36675a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null && jSONObject.length() > 0 && !TextUtils.isEmpty(jSONObject.optString("tcs")) && this.f17298a.compareAndSet(false, true)) {
            C6557h.m19950d().mo36371b(new C6552c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
        }
    }
}
