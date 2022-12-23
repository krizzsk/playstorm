package com.applovin.impl.sdk.p050e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1944j;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.i */
public class C1895i extends C1877a {

    /* renamed from: a */
    private static final AtomicBoolean f3499a = new AtomicBoolean();

    /* renamed from: c */
    private final int f3500c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f3501d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1897a f3502e;

    /* renamed from: com.applovin.impl.sdk.e.i$a */
    public interface C1897a {
        /* renamed from: a */
        void mo14197a(JSONObject jSONObject);
    }

    /* renamed from: com.applovin.impl.sdk.e.i$b */
    private class C1898b extends C1877a {
        public C1898b(C1959m mVar) {
            super("TaskTimeoutFetchBasicSettings", mVar, true);
        }

        public void run() {
            synchronized (C1895i.this.f3501d) {
                if (C1895i.this.f3502e != null) {
                    if (C2092v.m5047a()) {
                        mo14147d("Timing out fetch basic settings...");
                    }
                    C1895i.this.m4217a(new JSONObject());
                }
            }
        }
    }

    public C1895i(int i, C1959m mVar, C1897a aVar) {
        super("TaskFetchBasicSettings", mVar, true);
        this.f3500c = i;
        this.f3502e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4217a(JSONObject jSONObject) {
        synchronized (this.f3501d) {
            if (this.f3502e != null) {
                this.f3502e.mo14197a(jSONObject);
                this.f3502e = null;
            }
        }
    }

    /* renamed from: c */
    private String m4219c() {
        return C2040h.m4894a((String) this.f3467b.mo14311a(C1857b.f3086aP), "5.0/i", mo14146d());
    }

    /* renamed from: h */
    private String m4220h() {
        return C2040h.m4894a((String) this.f3467b.mo14311a(C1857b.f3087aQ), "5.0/i", mo14146d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14192a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f3467b.mo14311a(C1857b.f3319ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3467b.mo14374z());
        }
        Boolean a = C1944j.m4366b().mo14266a(mo14149f());
        if (a != null) {
            hashMap.put("huc", a.toString());
        }
        Boolean a2 = C1944j.m4361a().mo14266a(mo14149f());
        if (a2 != null) {
            hashMap.put("aru", a2.toString());
        }
        Boolean a3 = C1944j.m4368c().mo14266a(mo14149f());
        if (a3 != null) {
            hashMap.put("dns", a3.toString());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|(1:4)|5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)|17|(1:21)|22|(1:24)|25|26|(1:28)|29|30|(1:32)|33|(1:37)|38|(1:41)|42|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|62) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x01cc */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01dc A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0250 A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026b A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0286 A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x029d A[Catch:{ JSONException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02b2 A[Catch:{ JSONException -> 0x02cc }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo14193b() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "screen_size_in"
            java.lang.String r2 = "is_tablet"
            java.lang.String r3 = "revision"
            java.lang.String r4 = "model"
            java.lang.String r5 = "hardware"
            java.lang.String r6 = "brand_name"
            java.lang.String r7 = "brand"
            java.lang.String r8 = "locale"
            java.lang.String r9 = "os"
            java.lang.String r10 = "platform"
            java.lang.String r11 = "target_sdk"
            java.lang.String r12 = "tg"
            java.lang.String r13 = "debug"
            java.lang.String r14 = "test_ads"
            java.lang.String r15 = "app_version"
            r16 = r0
            java.lang.String r0 = "package_name"
            r17 = r2
            java.lang.String r2 = "IABTCF_TCString"
            r18 = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r19 = r4
            java.lang.String r4 = "sdk_version"
            r20 = r5
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "is_cross_promo"
            com.applovin.impl.sdk.m r5 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            boolean r5 = r5.mo14352e()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "init_count"
            int r5 = r1.f3500c     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = "server_installed_at"
            com.applovin.impl.sdk.m r5 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            r21 = r6
            com.applovin.impl.sdk.c.b<java.lang.String> r6 = com.applovin.impl.sdk.p048c.C1857b.f3102af     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r5 = r5.mo14311a(r6)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = com.applovin.impl.sdk.utils.Utils.getUserEngagementSdkVersion()     // Catch:{ JSONException -> 0x02cc }
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = "ue_sdk_version"
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x006a:
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            boolean r4 = r4.mo14300P()     // Catch:{ JSONException -> 0x02cc }
            r5 = 1
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = "first_install"
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x0078:
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            boolean r4 = r4.mo14301Q()     // Catch:{ JSONException -> 0x02cc }
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = "first_install_v2"
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x0085:
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.String> r6 = com.applovin.impl.sdk.p048c.C1857b.f3279dz     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r4 = r4.mo14311a(r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x02cc }
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r6 == 0) goto L_0x009a
            java.lang.String r6 = "plugin_version"
            r3.put(r6, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x009a:
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r4 = r4.mo14367t()     // Catch:{ JSONException -> 0x02cc }
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)     // Catch:{ JSONException -> 0x02cc }
            if (r6 == 0) goto L_0x00ab
            java.lang.String r6 = "mediation_provider"
            r3.put(r6, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x00ab:
            java.lang.String r4 = "installed_mediation_adapters"
            com.applovin.impl.sdk.m r6 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            org.json.JSONArray r6 = com.applovin.impl.mediation.p032d.C1645c.m3314a((com.applovin.impl.sdk.C1959m) r6)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r4, r6)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r4 = r4.mo14306V()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r4 = r4.mo14606h()     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r6 = r4.get(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r15)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r15, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r14)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r14, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r13)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r13, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r12)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r12, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r11, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinSdkSettings r0 = r0.mo14363p()     // Catch:{ JSONException -> 0x02cc }
            java.util.List r0 = r0.getInitializationAdUnitIds()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x010d
            int r6 = r0.size()     // Catch:{ JSONException -> 0x02cc }
            if (r6 <= 0) goto L_0x010d
            java.util.List r0 = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r6 = "ad_unit_ids"
            int r11 = r0.size()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = com.applovin.impl.sdk.utils.CollectionUtils.implode(r0, r11)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r6, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x010d:
            java.lang.Object r0 = r4.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = "IABTCF_gdprApplies"
            java.lang.Object r0 = r4.get(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14306V()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r0 = r0.mo14600b()     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r10, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r9, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r8, r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r7, r2)     // Catch:{ JSONException -> 0x02cc }
            r2 = r21
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r20
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r19
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r18
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r17
            java.lang.Object r4 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            r2 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p048c.C1857b.f3236dI     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14311a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "mtl"
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.y r2 = r2.mo14331ad()     // Catch:{ JSONException -> 0x02cc }
            int r2 = r2.mo14803b()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0198:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ all -> 0x01cc }
            android.content.Context r0 = r0.mo14297L()     // Catch:{ all -> 0x01cc }
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x01cc }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x01cc }
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x01cc }
            r2.<init>()     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x01cc
            r0.getMemoryInfo(r2)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "fm"
            long r6 = r2.availMem     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "tm"
            long r6 = r2.totalMem     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "lmt"
            long r6 = r2.threshold     // Catch:{ all -> 0x01cc }
            r3.put(r0, r6)     // Catch:{ all -> 0x01cc }
            java.lang.String r0 = "lm"
            boolean r2 = r2.lowMemory     // Catch:{ all -> 0x01cc }
            r3.put(r0, r2)     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.AppLovinTargetingDataImpl r0 = r0.mo14365r()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r0 = r0.getAllData()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x02cc }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = "targeting_data"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02cc }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
        L_0x01e6:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14306V()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o$a r0 = r0.mo14609k()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "dnt"
            boolean r4 = r0.f3911a     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r4 = com.applovin.impl.sdk.p048c.C1857b.f3277dx     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r2.mo14311a(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = r0.f3912b     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = "idfa"
            java.lang.String r0 = r0.f3912b     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x0216:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o r0 = r0.mo14306V()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.o$b r0 = r0.mo14610l()     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r4 = com.applovin.impl.sdk.p048c.C1857b.f3270dq     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r2 = r2.mo14311a(r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = r2.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x0240
            if (r0 == 0) goto L_0x0240
            java.lang.String r2 = "idfv"
            java.lang.String r4 = r0.f3913a     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.f3914b     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x0240:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.mo14364q()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x025b
            java.lang.String r2 = "user_segment_name"
            com.applovin.impl.sdk.m r4 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(r0, r4)     // Catch:{ JSONException -> 0x02cc }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x025b:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p048c.C1857b.f3273dt     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14311a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "compass_random_token"
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = r2.mo14361n()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0276:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p048c.C1857b.f3275dv     // Catch:{ JSONException -> 0x02cc }
            java.lang.Object r0 = r0.mo14311a(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x0291
            java.lang.String r0 = "applovin_random_token"
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = r2.mo14362o()     // Catch:{ JSONException -> 0x02cc }
            r3.put(r0, r2)     // Catch:{ JSONException -> 0x02cc }
        L_0x0291:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.mediation.debugger.ui.testmode.b r0 = r0.mo14295J()     // Catch:{ JSONException -> 0x02cc }
            boolean r0 = r0.mo13583a()     // Catch:{ JSONException -> 0x02cc }
            if (r0 == 0) goto L_0x02a2
            java.lang.String r0 = "test_mode"
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x02cc }
        L_0x02a2:
            com.applovin.impl.sdk.m r0 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.mediation.debugger.ui.testmode.b r0 = r0.mo14295J()     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r0 = r0.mo13586c()     // Catch:{ JSONException -> 0x02cc }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02cc }
            if (r2 == 0) goto L_0x02b7
            java.lang.String r2 = "test_mode_network"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
        L_0x02b7:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02cc }
            com.applovin.impl.sdk.m r2 = r1.f3467b     // Catch:{ JSONException -> 0x02cc }
            com.applovin.sdk.AppLovinSdkSettings r2 = r2.mo14363p()     // Catch:{ JSONException -> 0x02cc }
            java.util.Map r2 = r2.getExtraParameters()     // Catch:{ JSONException -> 0x02cc }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x02cc }
            java.lang.String r2 = "sdk_extra_parameters"
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x02cc }
            goto L_0x02d8
        L_0x02cc:
            r0 = move-exception
            boolean r2 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r2 == 0) goto L_0x02d8
            java.lang.String r2 = "Failed to construct JSON body"
            r1.mo14143a(r2, r0)
        L_0x02d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p050e.C1895i.mo14193b():org.json.JSONObject");
    }

    public void run() {
        if (!C2039g.m4890i() && f3499a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f3467b.mo14297L());
            } catch (Throwable th) {
                if (C2092v.m5047a()) {
                    mo14143a("Cannot update security provider", th);
                }
            }
        }
        Map<String, String> a = mo14192a();
        C1990c<T> a2 = C1990c.m4570a(this.f3467b).mo14501a(m4219c()).mo14511c(m4220h()).mo14502a(a).mo14503a(mo14193b()).mo14513d(((Boolean) this.f3467b.mo14311a(C1857b.f3325ev)).booleanValue()).mo14507b(ShareTarget.METHOD_POST).mo14500a(new JSONObject()).mo14499a(((Integer) this.f3467b.mo14311a(C1857b.f3200cY)).intValue()).mo14510c(((Integer) this.f3467b.mo14311a(C1857b.f3255db)).intValue()).mo14506b(((Integer) this.f3467b.mo14311a(C1857b.f3199cX)).intValue()).mo14505a();
        this.f3467b.mo14303S().mo14207a((C1877a) new C1898b(this.f3467b), C1908o.C1910a.TIMEOUT, ((long) ((Integer) this.f3467b.mo14311a(C1857b.f3199cX)).intValue()) + 250);
        C18961 r1 = new C1925u<JSONObject>(a2, this.f3467b, mo14150g()) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                if (C2092v.m5047a()) {
                    mo14147d("Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C1895i.this.m4217a(jSONObject);
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                C1895i.this.m4217a(jSONObject);
            }
        };
        r1.mo14230a(C1857b.f3086aP);
        r1.mo14232b(C1857b.f3087aQ);
        this.f3467b.mo14303S().mo14205a((C1877a) r1);
    }
}
