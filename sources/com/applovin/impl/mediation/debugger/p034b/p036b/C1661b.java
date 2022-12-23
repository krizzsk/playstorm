package com.applovin.impl.mediation.debugger.p034b.p036b;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p033a.C1653b;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.b */
public class C1661b implements AppLovinCommunicatorSubscriber, Comparable<C1661b> {

    /* renamed from: A */
    private final Map<MaxAdFormat, C1653b> f2349A;

    /* renamed from: a */
    private final C1959m f2350a;

    /* renamed from: b */
    private final C1662a f2351b;

    /* renamed from: c */
    private int f2352c;

    /* renamed from: d */
    private final boolean f2353d;

    /* renamed from: e */
    private final boolean f2354e;

    /* renamed from: f */
    private final boolean f2355f;

    /* renamed from: g */
    private final boolean f2356g;

    /* renamed from: h */
    private final boolean f2357h;

    /* renamed from: i */
    private final boolean f2358i;

    /* renamed from: j */
    private final boolean f2359j;

    /* renamed from: k */
    private final boolean f2360k;

    /* renamed from: l */
    private final String f2361l;

    /* renamed from: m */
    private final String f2362m;

    /* renamed from: n */
    private final String f2363n;

    /* renamed from: o */
    private String f2364o;

    /* renamed from: p */
    private final String f2365p;

    /* renamed from: q */
    private final String f2366q;

    /* renamed from: r */
    private final String f2367r;

    /* renamed from: s */
    private final int f2368s;

    /* renamed from: t */
    private final List<MaxAdFormat> f2369t;

    /* renamed from: u */
    private final List<C1665d> f2370u;

    /* renamed from: v */
    private final List<C1660a> f2371v;

    /* renamed from: w */
    private final List<String> f2372w;

    /* renamed from: x */
    private final C1664c f2373x;

    /* renamed from: y */
    private final boolean f2374y;

    /* renamed from: z */
    private final String f2375z;

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$a */
    public enum C1662a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e */
        private final String f2381e;

        private C1662a(String str) {
            this.f2381e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m3403a() {
            return this.f2381e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.b.b$b */
    public enum C1663b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f */
        private final String f2388f;

        /* renamed from: g */
        private final int f2389g;

        /* renamed from: h */
        private final String f2390h;

        private C1663b(String str, int i, String str2) {
            this.f2388f = str;
            this.f2389g = i;
            this.f2390h = str2;
        }

        /* renamed from: a */
        public String mo13456a() {
            return this.f2388f;
        }

        /* renamed from: b */
        public int mo13457b() {
            return this.f2389g;
        }

        /* renamed from: c */
        public String mo13458c() {
            return this.f2390h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1661b(org.json.JSONObject r19, com.applovin.impl.sdk.C1959m r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "MediatedNetwork"
            r18.<init>()
            r1.f2350a = r3
            java.lang.String r0 = "name"
            java.lang.String r5 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2361l = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2362m = r0
            java.lang.String r6 = "adapter_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r6, r5)
            r1.f2363n = r0
            java.lang.String r0 = "latest_adapter_version"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f2366q = r0
            java.util.List r0 = r18.m3373a((org.json.JSONObject) r19)
            r1.f2372w = r0
            r7 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "hide_if_missing"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.f2359j = r8
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "configuration"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r9, (org.json.JSONObject) r8)
            java.util.List r9 = r1.m3374a(r8, r3)
            r1.f2370u = r9
            com.applovin.impl.mediation.debugger.b.b.c r9 = new com.applovin.impl.mediation.debugger.b.b.c
            r9.<init>(r8, r3)
            r1.f2373x = r9
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "test_mode"
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r10, (org.json.JSONObject) r9)
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            java.lang.String r12 = "supported"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r12, r11)
            boolean r11 = r11.booleanValue()
            r1.f2357h = r11
            java.lang.String r11 = "test_mode_requires_init"
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r11, r0)
            boolean r0 = r0.booleanValue()
            r1.f2358i = r0
            java.lang.String r0 = "message"
            r11 = 0
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r0, r11)
            r1.f2367r = r0
            java.lang.String r0 = "existence_classes"
            java.util.List r0 = com.applovin.impl.sdk.utils.JsonUtils.getList(r2, r0, r11)
            if (r0 == 0) goto L_0x009c
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassesExistence(r0)
            goto L_0x00a6
        L_0x009c:
            java.lang.String r0 = "existence_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
        L_0x00a6:
            r1.f2353d = r0
            java.util.List r9 = java.util.Collections.emptyList()
            java.lang.String r0 = r1.f2363n
            com.applovin.mediation.adapter.MaxAdapter r0 = com.applovin.impl.mediation.p032d.C1645c.m3317b(r0, r3)
            if (r0 == 0) goto L_0x0131
            r1.f2354e = r10
            java.lang.String r12 = r0.getAdapterVersion()     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x00d5 }
            if (r13 == 0) goto L_0x00c5
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x00d5 }
            goto L_0x00c6
        L_0x00c5:
            r13 = r5
        L_0x00c6:
            java.util.List r9 = r1.m3372a((com.applovin.mediation.adapter.MaxAdapter) r0)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.isBeta()     // Catch:{ all -> 0x00d3 }
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r0
            goto L_0x00fd
        L_0x00d3:
            r0 = move-exception
            goto L_0x00db
        L_0x00d5:
            r0 = move-exception
            r13 = r5
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            r12 = r5
            r13 = r12
        L_0x00db:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Failed to load adapter for network "
            r14.append(r15)
            java.lang.String r15 = r1.f2361l
            r14.append(r15)
            java.lang.String r15 = ". Please check that you have a compatible network SDK integrated. Error: "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.applovin.impl.sdk.C2092v.m5053i(r4, r0)
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r7
        L_0x00fd:
            java.lang.String r0 = r1.f2363n     // Catch:{ all -> 0x0123 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r15 = "loadNativeAd"
            r11 = 3
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ all -> 0x0123 }
            java.lang.Class<com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters> r16 = com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class
            r11[r7] = r16     // Catch:{ all -> 0x0123 }
            java.lang.Class<android.app.Activity> r16 = android.app.Activity.class
            r11[r10] = r16     // Catch:{ all -> 0x0123 }
            r16 = 2
            java.lang.Class<com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener> r17 = com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class
            r11[r16] = r17     // Catch:{ all -> 0x0123 }
            java.lang.reflect.Method r11 = r0.getMethod(r15, r11)     // Catch:{ all -> 0x0123 }
            java.lang.Class r11 = r11.getDeclaringClass()     // Catch:{ all -> 0x0123 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x012e
        L_0x0123:
            r0 = move-exception
            com.applovin.impl.sdk.v r11 = r20.mo14286A()
            java.lang.String r15 = "Failed to check if adapter overrides MaxNativeAdAdapter"
            r11.mo14790b(r4, r15, r0)
            r0 = r7
        L_0x012e:
            r4 = r9
            r9 = r12
            goto L_0x0137
        L_0x0131:
            r1.f2354e = r7
            r13 = r5
            r14 = r13
            r0 = r7
            r4 = r0
        L_0x0137:
            r1.f2365p = r13
            r1.f2364o = r14
            r1.f2369t = r9
            r1.f2360k = r0
            java.util.List r0 = r1.m3375a(r8, r13, r3)
            r1.f2371v = r0
            java.lang.String r0 = "alternative_network"
            r9 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r0, (org.json.JSONObject) r9)
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r6, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
            r1.f2356g = r0
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = r18.m3371A()
            r1.f2351b = r0
            java.lang.String r0 = r1.f2366q
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0168
            if (r4 != 0) goto L_0x0168
            r0 = r10
            goto L_0x0169
        L_0x0168:
            r0 = r7
        L_0x0169:
            r1.f2355f = r0
            android.content.Context r0 = r20.mo14297L()
            java.lang.String r2 = r1.f2361l
            java.lang.String r3 = "_"
            int r2 = r2.lastIndexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x0185
            java.lang.String r3 = r1.f2361l
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r2 = r3.substring(r7, r2)
            goto L_0x018b
        L_0x0185:
            java.lang.String r2 = r1.f2361l
            java.lang.String r2 = r2.toLowerCase()
        L_0x018b:
            android.content.res.Resources r3 = r0.getResources()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "applovin_ic_mediation_"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = r0.getPackageName()
            java.lang.String r5 = "drawable"
            int r2 = r3.getIdentifier(r2, r5, r4)
            r1.f2368s = r2
            com.applovin.mediation.adapter.MaxAdapter$InitializationStatus r2 = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED
            int r2 = r2.getCode()
            r1.f2352c = r2
            com.applovin.communicator.AppLovinCommunicator r0 = com.applovin.communicator.AppLovinCommunicator.getInstance(r0)
            java.lang.String r2 = "adapter_initialization_status"
            r0.subscribe((com.applovin.communicator.AppLovinCommunicatorSubscriber) r1, (java.lang.String) r2)
            java.lang.String r0 = "amazon_marketplace"
            r2 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r0, (org.json.JSONObject) r2)
            if (r0 == 0) goto L_0x0218
            boolean r3 = r1.f2353d
            if (r3 == 0) goto L_0x0218
            r1.f2374y = r10
            java.lang.String r3 = "test_mode_app_id"
            java.lang.String r3 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r3, r2)
            r1.f2375z = r3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "test_mode_slot_ids"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r3, (org.json.JSONObject) r2)
            java.util.HashMap r2 = new java.util.HashMap
            int r3 = r0.length()
            r2.<init>(r3)
            java.util.Iterator r3 = r0.keys()
        L_0x01ec:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.applovin.mediation.MaxAdFormat r5 = com.applovin.mediation.MaxAdFormat.formatFromString(r4)
            r6 = 0
            org.json.JSONObject r4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r4, (org.json.JSONObject) r6)
            if (r5 == 0) goto L_0x01ec
            if (r4 != 0) goto L_0x0206
            goto L_0x01ec
        L_0x0206:
            java.lang.String r7 = "uuid"
            java.lang.String r7 = com.applovin.impl.sdk.utils.JsonUtils.getString(r4, r7, r6)
            if (r7 != 0) goto L_0x020f
            goto L_0x01ec
        L_0x020f:
            com.applovin.impl.mediation.debugger.a.b r6 = new com.applovin.impl.mediation.debugger.a.b
            r6.<init>(r7, r4, r5)
            r2.put(r5, r6)
            goto L_0x01ec
        L_0x0218:
            r1.f2374y = r7
            r2 = 0
            r1.f2375z = r2
        L_0x021d:
            r1.f2349A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.<init>(org.json.JSONObject, com.applovin.impl.sdk.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.f2376a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3.f2356g != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r3.f2354e != false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a m3371A() {
        /*
            r3 = this;
            boolean r0 = r3.f2353d
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f2354e
            if (r0 == 0) goto L_0x000b
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.COMPLETE
            goto L_0x0019
        L_0x000b:
            boolean r0 = r3.f2356g
            if (r0 == 0) goto L_0x0014
            goto L_0x0017
        L_0x0010:
            boolean r0 = r3.f2354e
            if (r0 == 0) goto L_0x0017
        L_0x0014:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.INCOMPLETE_INTEGRATION
            goto L_0x0019
        L_0x0017:
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.MISSING
        L_0x0019:
            com.applovin.impl.mediation.debugger.b.b.b$a r1 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.MISSING
            if (r0 != r1) goto L_0x001e
            return r0
        L_0x001e:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.d> r1 = r3.f2370u
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.d r2 = (com.applovin.impl.mediation.debugger.p034b.p036b.C1665d) r2
            boolean r2 = r2.mo13464c()
            if (r2 != 0) goto L_0x0024
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.INVALID_INTEGRATION
            return r0
        L_0x0039:
            java.util.List<com.applovin.impl.mediation.debugger.b.b.a> r1 = r3.f2371v
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.b.a r2 = (com.applovin.impl.mediation.debugger.p034b.p036b.C1660a) r2
            boolean r2 = r2.mo13426c()
            if (r2 != 0) goto L_0x003f
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.INVALID_INTEGRATION
            return r0
        L_0x0054:
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f2373x
            boolean r1 = r1.mo13459a()
            if (r1 == 0) goto L_0x0066
            com.applovin.impl.mediation.debugger.b.b.c r1 = r3.f2373x
            boolean r1 = r1.mo13460b()
            if (r1 != 0) goto L_0x0066
            com.applovin.impl.mediation.debugger.b.b.b$a r0 = com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.C1662a.INVALID_INTEGRATION
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p034b.p036b.C1661b.m3371A():com.applovin.impl.mediation.debugger.b.b.b$a");
    }

    /* renamed from: a */
    private List<MaxAdFormat> m3372a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m3373a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", (JSONArray) null), (List) null);
    }

    /* renamed from: a */
    private List<C1665d> m3374a(JSONObject jSONObject, C1959m mVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f2363n.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C1665d dVar = new C1665d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", mVar.mo14297L());
            if (dVar.mo13464c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C1665d(next, jSONObject2.getString(next), mVar.mo14297L()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C1660a> m3375a(JSONObject jSONObject, String str, C1959m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1660a(jSONObject2, mVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C1660a.m3367a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", (String) null), JsonUtils.getString(jSONObject3, "max_adapter_version", (String) null))) {
                arrayList.add(new C1660a(jSONObject3, mVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public int compareTo(C1661b bVar) {
        return this.f2362m.compareToIgnoreCase(bVar.f2362m);
    }

    /* renamed from: a */
    public C1662a mo13428a() {
        return this.f2351b;
    }

    /* renamed from: b */
    public int mo13429b() {
        return this.f2352c;
    }

    /* renamed from: c */
    public C1663b mo13430c() {
        return !this.f2357h ? C1663b.NOT_SUPPORTED : this.f2351b == C1662a.INVALID_INTEGRATION ? C1663b.INVALID_INTEGRATION : !this.f2350a.mo14295J().mo13583a() ? C1663b.DISABLED : (!this.f2358i || !(this.f2352c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f2352c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? C1663b.READY : C1663b.NOT_INITIALIZED;
    }

    /* renamed from: d */
    public boolean mo13432d() {
        return this.f2353d;
    }

    /* renamed from: e */
    public boolean mo13433e() {
        return this.f2354e;
    }

    /* renamed from: f */
    public boolean mo13434f() {
        return this.f2355f;
    }

    /* renamed from: g */
    public boolean mo13435g() {
        return this.f2351b == C1662a.MISSING && this.f2359j;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public String mo13436h() {
        return this.f2361l;
    }

    /* renamed from: i */
    public String mo13437i() {
        return this.f2362m;
    }

    /* renamed from: j */
    public String mo13438j() {
        return this.f2364o;
    }

    /* renamed from: k */
    public String mo13439k() {
        return this.f2365p;
    }

    /* renamed from: l */
    public String mo13440l() {
        return this.f2366q;
    }

    /* renamed from: m */
    public String mo13441m() {
        return this.f2363n;
    }

    /* renamed from: n */
    public List<String> mo13442n() {
        return this.f2372w;
    }

    /* renamed from: o */
    public int mo13443o() {
        return this.f2368s;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f2363n.equals(string)) {
            this.f2352c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b = C1645c.m3317b(string, this.f2350a);
            if (b != null && !this.f2364o.equals(b.getSdkVersion())) {
                this.f2364o = b.getSdkVersion();
                this.f2350a.mo14334ag().mo14261a(this.f2364o, string);
            }
        }
    }

    /* renamed from: p */
    public List<MaxAdFormat> mo13444p() {
        return this.f2369t;
    }

    /* renamed from: q */
    public boolean mo13445q() {
        return this.f2360k;
    }

    /* renamed from: r */
    public List<C1665d> mo13446r() {
        return this.f2370u;
    }

    /* renamed from: s */
    public List<C1660a> mo13447s() {
        return this.f2371v;
    }

    /* renamed from: t */
    public final C1664c mo13448t() {
        return this.f2373x;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f2361l + ", displayName=" + this.f2362m + ", sdkAvailable=" + this.f2353d + ", sdkVersion=" + this.f2364o + ", adapterAvailable=" + this.f2354e + ", adapterVersion=" + this.f2365p + "}";
    }

    /* renamed from: u */
    public String mo13450u() {
        return this.f2367r;
    }

    /* renamed from: v */
    public final C1959m mo13451v() {
        return this.f2350a;
    }

    /* renamed from: w */
    public final String mo13452w() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f2361l);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f2351b.m3403a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f2353d || TextUtils.isEmpty(this.f2364o)) ? str : this.f2364o);
        sb.append("\nAdapter - ");
        if (this.f2354e && !TextUtils.isEmpty(this.f2365p)) {
            str = this.f2365p;
        }
        sb.append(str);
        if (this.f2373x.mo13459a() && !this.f2373x.mo13460b()) {
            sb.append("\n* ");
            sb.append(this.f2373x.mo13461c());
        }
        for (C1665d next : mo13446r()) {
            if (!next.mo13464c()) {
                sb.append("\n* MISSING ");
                sb.append(next.mo13462a());
                sb.append(": ");
                sb.append(next.mo13463b());
            }
        }
        for (C1660a next2 : mo13447s()) {
            if (!next2.mo13426c()) {
                sb.append("\n* MISSING ");
                sb.append(next2.mo13424a());
                sb.append(": ");
                sb.append(next2.mo13425b());
            }
        }
        return sb.toString();
    }

    /* renamed from: x */
    public boolean mo13453x() {
        return this.f2374y;
    }

    /* renamed from: y */
    public String mo13454y() {
        return this.f2375z;
    }

    /* renamed from: z */
    public Map<MaxAdFormat, C1653b> mo13455z() {
        return this.f2349A;
    }
}
