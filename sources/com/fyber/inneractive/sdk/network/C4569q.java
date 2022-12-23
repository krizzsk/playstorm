package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4342v;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.q */
public final class C4569q extends C4554k {

    /* renamed from: com.fyber.inneractive.sdk.network.q$b */
    public static class C4572b {

        /* renamed from: a */
        public JSONObject f11378a = new JSONObject();

        /* renamed from: a */
        public C4572b mo24770a(String str, Object obj) {
            try {
                this.f11378a.put(str, obj);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    public C4569q(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(C4261a.m13440b());
        mo24761a("osn", APSAnalytics.OS_NAME);
        mo24761a("osv", Build.VERSION.RELEASE);
        mo24761a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C5348k.m16743h());
        mo24761a("sdkv", str7 == null ? "8.1.5" : str7);
        mo24761a("pkgn", C5348k.m16746k());
        mo24761a("pkgv", C5348k.m16747l());
        mo24761a("appid", str);
        mo24761a("session", str2);
        mo24761a("adnt", str3);
        mo24761a("adnt_id", l);
        mo24761a(CampaignEx.JSON_KEY_CREATIVE_ID, str4);
        mo24761a("adomain", str5);
        mo24761a("campaign_id", str6);
    }

    /* renamed from: com.fyber.inneractive.sdk.network.q$a */
    public static class C4570a {

        /* renamed from: h */
        public static final SimpleDateFormat f11362h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        /* renamed from: a */
        public InneractiveAdRequest f11363a;

        /* renamed from: b */
        public C4565o f11364b;

        /* renamed from: c */
        public C4567p f11365c;

        /* renamed from: d */
        public JSONArray f11366d;

        /* renamed from: e */
        public C5291e f11367e;

        /* renamed from: f */
        public JSONArray f11368f;

        /* renamed from: g */
        public boolean f11369g;

        /* renamed from: com.fyber.inneractive.sdk.network.q$a$a */
        public class C4571a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4569q f11370a;

            /* renamed from: b */
            public final /* synthetic */ String f11371b;

            /* renamed from: c */
            public final /* synthetic */ String f11372c;

            /* renamed from: d */
            public final /* synthetic */ String f11373d;

            /* renamed from: e */
            public final /* synthetic */ String f11374e;

            /* renamed from: f */
            public final /* synthetic */ Object f11375f;

            /* renamed from: g */
            public final /* synthetic */ String f11376g;

            public C4571a(C4569q qVar, String str, String str2, String str3, String str4, Object obj, String str5) {
                this.f11370a = qVar;
                this.f11371b = str;
                this.f11372c = str2;
                this.f11373d = str3;
                this.f11374e = str4;
                this.f11375f = obj;
                this.f11376g = str5;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a4, code lost:
                r1 = r0.f11252b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    java.lang.String r1 = r11.f11371b
                    java.lang.String r2 = "contentid"
                    r0.mo24761a(r2, r1)
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    java.lang.String r1 = r11.f11372c
                    java.lang.String r2 = "fairbidv"
                    r0.mo24761a(r2, r1)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.o r1 = r0.f11364b
                    java.lang.String r2 = "%s %s"
                    r3 = 2
                    r4 = 0
                    r5 = 0
                    r6 = 1
                    if (r1 == 0) goto L_0x0059
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    int r1 = r1.f11332a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.String r7 = "err"
                    r0.mo24761a(r7, r1)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.o r0 = r0.f11364b
                    r0.getClass()
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.o r1 = r1.f11364b
                    r0[r5] = r1
                    java.lang.String r1 = "Event dispatcher - dispatching error: %s"
                    com.fyber.inneractive.sdk.util.IAlog.m16699a(r1, r0)
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    java.lang.String r1 = "DISPATCHED_SDK_ERROR"
                    r0[r5] = r1
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.o r1 = r1.f11364b
                    int r1 = r1.f11332a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r6] = r1
                    com.fyber.inneractive.sdk.util.IAlog.m16697a(r6, r4, r2, r0)
                    java.lang.String r0 = "sdk_error_"
                    goto L_0x0099
                L_0x0059:
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11365c
                    if (r0 == 0) goto L_0x0098
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    int r0 = r0.f11359a
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.String r7 = "event"
                    r1.mo24761a(r7, r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11365c
                    r0.getClass()
                    java.lang.Object[] r0 = new java.lang.Object[r6]
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.p r1 = r1.f11365c
                    r0[r5] = r1
                    java.lang.String r1 = "Event dispatcher - dispatching event: %s"
                    com.fyber.inneractive.sdk.util.IAlog.m16699a(r1, r0)
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    java.lang.String r1 = "DISPATCHED_SDK_EVENT"
                    r0[r5] = r1
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.p r1 = r1.f11365c
                    int r1 = r1.f11359a
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r6] = r1
                    com.fyber.inneractive.sdk.util.IAlog.m16697a(r6, r4, r2, r0)
                    java.lang.String r0 = "sdk_event_"
                    goto L_0x0099
                L_0x0098:
                    r0 = r4
                L_0x0099:
                    java.lang.String r1 = r11.f11373d
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00aa
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.String r2 = r11.f11373d
                    java.lang.String r7 = "placement_type"
                    r1.mo24761a(r7, r2)
                L_0x00aa:
                    java.lang.String r1 = r11.f11374e
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00bb
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.String r2 = r11.f11374e
                    java.lang.String r7 = "spot_id"
                    r1.mo24761a(r7, r2)
                L_0x00bb:
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.String r2 = com.fyber.inneractive.sdk.util.C5348k.m16742g()
                    java.lang.String r7 = "ciso"
                    r1.mo24761a(r7, r2)
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.Object r2 = r11.f11375f
                    java.lang.String r7 = "ad_type"
                    r1.mo24761a(r7, r2)
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    boolean r1 = r1.f11369g
                    if (r1 == 0) goto L_0x00e3
                    java.lang.String r1 = r11.f11376g
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x00e3
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.String r2 = r11.f11376g
                    r1.f11253c = r2
                L_0x00e3:
                    java.lang.String r1 = "UTC"
                    java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                    java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11370a
                    com.fyber.inneractive.sdk.util.k0 r7 = com.fyber.inneractive.sdk.util.C5349k0.m16751f()
                    java.lang.String r7 = r7.f14215a
                    java.lang.String r8 = "n"
                    r2.mo24761a(r8, r7)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11370a
                    long r7 = r1.getTimeInMillis()
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    java.lang.String r8 = "date_created"
                    r2.mo24761a(r8, r7)
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11370a     // Catch:{ all -> 0x011a }
                    java.lang.String r7 = "day"
                    java.text.SimpleDateFormat r8 = com.fyber.inneractive.sdk.network.C4569q.C4570a.f11362h     // Catch:{ all -> 0x011a }
                    java.util.Date r9 = r1.getTime()     // Catch:{ all -> 0x011a }
                    java.lang.String r8 = r8.format(r9)     // Catch:{ all -> 0x011a }
                    r2.mo24761a(r7, r8)     // Catch:{ all -> 0x011a }
                L_0x011a:
                    com.fyber.inneractive.sdk.network.q r2 = r11.f11370a
                    r7 = 11
                    int r1 = r1.get(r7)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.String r7 = "hour"
                    r2.mo24761a(r7, r1)
                    com.fyber.inneractive.sdk.network.q r1 = r11.f11370a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.network.o r7 = r0.f11364b
                    if (r7 == 0) goto L_0x0142
                    int r0 = r7.f11332a
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    goto L_0x014a
                L_0x0142:
                    com.fyber.inneractive.sdk.network.p r0 = r0.f11365c
                    int r0 = r0.f11359a
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                L_0x014a:
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    java.lang.String r2 = "table"
                    r1.mo24761a(r2, r0)
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    org.json.JSONArray r0 = r0.f11366d
                    if (r0 == 0) goto L_0x016d
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x016d
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    org.json.JSONArray r1 = r1.f11366d
                    java.lang.String r2 = "experiments"
                    r0.mo24761a(r2, r1)
                L_0x016d:
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    com.fyber.inneractive.sdk.response.e r0 = r0.f11367e
                    if (r0 == 0) goto L_0x0180
                    boolean r0 = r0.f14065A
                    if (r0 == 0) goto L_0x0180
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    java.lang.String r1 = "sdk_bidding"
                    java.lang.String r2 = "1"
                    r0.mo24761a(r1, r2)
                L_0x0180:
                    com.fyber.inneractive.sdk.network.q$a r0 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    org.json.JSONArray r0 = r0.f11368f
                    if (r0 == 0) goto L_0x0197
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0197
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    com.fyber.inneractive.sdk.network.q$a r1 = com.fyber.inneractive.sdk.network.C4569q.C4570a.this
                    org.json.JSONArray r1 = r1.f11368f
                    java.lang.String r2 = "extra"
                    r0.mo24761a(r2, r1)
                L_0x0197:
                    com.fyber.inneractive.sdk.network.q r0 = r11.f11370a
                    r0.getClass()
                    java.lang.String r1 = r0.f11251a
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x01b0
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r0.f11252b
                    if (r1 == 0) goto L_0x01b0
                    int r1 = r1.size()
                    if (r1 == 0) goto L_0x01b0
                    r1 = r6
                    goto L_0x01b1
                L_0x01b0:
                    r1 = r5
                L_0x01b1:
                    if (r1 == 0) goto L_0x025b
                    com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
                    com.fyber.inneractive.sdk.network.c r1 = r1.f10533G
                    r1.getClass()
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.util.Map<java.lang.String, java.lang.Object> r7 = r0.f11252b
                    java.util.Set r8 = r7.keySet()
                    java.util.Iterator r8 = r8.iterator()
                L_0x01c9:
                    boolean r9 = r8.hasNext()
                    if (r9 == 0) goto L_0x01df
                    java.lang.Object r9 = r8.next()
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.Object r10 = r7.get(r9)
                    if (r10 == 0) goto L_0x01c9
                    r2.put(r9, r10)     // Catch:{ JSONException -> 0x01c9 }
                    goto L_0x01c9
                L_0x01df:
                    java.lang.String r0 = r0.f11253c
                    if (r0 == 0) goto L_0x021e
                    int r7 = r0.length()
                    r8 = 51200(0xc800, float:7.1746E-41)
                    if (r7 <= r8) goto L_0x0210
                    java.lang.String r9 = "iawrapper"
                    int r9 = r0.indexOf(r9)
                    r10 = -1
                    if (r9 != r10) goto L_0x01f6
                    r9 = r5
                L_0x01f6:
                    r10 = 51199(0xc7ff, float:7.1745E-41)
                    java.lang.String r0 = r0.substring(r9, r10)
                    java.lang.Object[] r9 = new java.lang.Object[r3]
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r9[r5] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                    r9[r6] = r7
                    java.lang.String r7 = "Sdk event dispatcher: message size %d is too long! trimming message to %d Characters"
                    com.fyber.inneractive.sdk.util.IAlog.m16699a(r7, r9)
                L_0x0210:
                    java.lang.String r7 = "ad"
                    r2.put(r7, r0)     // Catch:{ JSONException -> 0x0216 }
                    goto L_0x021e
                L_0x0216:
                    r0 = move-exception
                    java.lang.Object[] r7 = new java.lang.Object[r5]
                    java.lang.String r8 = "Failed inserting ad body to json"
                    com.fyber.inneractive.sdk.util.IAlog.m16698a(r8, r0, r7)
                L_0x021e:
                    int r0 = com.fyber.inneractive.sdk.util.IAlog.f14137a
                    int r7 = com.fyber.inneractive.sdk.util.IAlog.f14137a
                    if (r0 != r6) goto L_0x0235
                    java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0235 }
                    java.lang.String r7 = "%s, Event: %s"
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0235 }
                    java.lang.String r8 = "SDK_EVENT"
                    r3[r5] = r8     // Catch:{ all -> 0x0235 }
                    r3[r6] = r0     // Catch:{ all -> 0x0235 }
                    com.fyber.inneractive.sdk.util.IAlog.m16697a(r6, r4, r7, r3)     // Catch:{ all -> 0x0235 }
                L_0x0235:
                    java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r1.f11199a
                    r0.offer(r2)
                    java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r1.f11199a
                    int r0 = r0.size()
                    r2 = 30
                    if (r0 <= r2) goto L_0x025b
                    android.os.Handler r0 = r1.f11202d
                    r2 = 12312329(0xbbdf09, float:1.7253248E-38)
                    if (r0 == 0) goto L_0x0256
                    boolean r0 = r0.hasMessages(r2)
                    if (r0 == 0) goto L_0x0256
                    android.os.Handler r0 = r1.f11202d
                    r0.removeMessages(r2)
                L_0x0256:
                    r3 = 0
                    r1.mo24733a(r2, r3)
                L_0x025b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4569q.C4570a.C4571a.run():void");
            }
        }

        public C4570a(C4565o oVar, InneractiveAdRequest inneractiveAdRequest, C5291e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f11364b = oVar;
            this.f11363a = inneractiveAdRequest;
            this.f11366d = null;
        }

        /* renamed from: a */
        public C4570a mo24767a(Object... objArr) {
            if (objArr.length > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    String obj = objArr[i].toString();
                    Object obj2 = objArr[i + 1];
                    try {
                        jSONObject.put(obj, obj2);
                    } catch (Exception unused) {
                        IAlog.m16703e("Got exception adding param to json object: %s, %s", obj, obj2);
                    }
                }
                this.f11368f.put(jSONObject);
            }
            return this;
        }

        public C4570a(C4567p pVar, InneractiveAdRequest inneractiveAdRequest, C5291e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f11365c = pVar;
            this.f11363a = inneractiveAdRequest;
            this.f11366d = null;
        }

        public C4570a(C5291e eVar) {
            this.f11369g = false;
            this.f11367e = eVar;
            this.f11368f = new JSONArray();
        }

        /* renamed from: a */
        public void mo24768a(String str) {
            String str2;
            String str3;
            String str4;
            Long l;
            String str5;
            String str6;
            String str7;
            String str8;
            UnitDisplayType unitDisplayType;
            Integer num;
            String str9;
            boolean z;
            boolean z2;
            UnitDisplayType unitDisplayType2;
            UnitDisplayType unitDisplayType3;
            C5291e eVar = this.f11367e;
            if (eVar != null) {
                ImpressionData impressionData = eVar.f14083r;
                String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
                ImpressionData impressionData2 = this.f11367e.f14083r;
                String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
                ImpressionData impressionData3 = this.f11367e.f14083r;
                Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
                ImpressionData impressionData4 = this.f11367e.f14083r;
                String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
                ImpressionData impressionData5 = this.f11367e.f14083r;
                String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
                ImpressionData impressionData6 = this.f11367e.f14083r;
                if (impressionData6 != null) {
                    str6 = impressionId;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                    str2 = impressionData6.getCampaignId();
                } else {
                    str6 = impressionId;
                    str2 = null;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                }
            } else {
                str6 = null;
                str5 = null;
                l = null;
                str4 = null;
                str3 = null;
                str2 = null;
            }
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            C4569q qVar = new C4569q(iAConfigManager.f10538c, str6, str5, l, str4, str3, str2, str);
            InneractiveAdRequest inneractiveAdRequest = this.f11363a;
            C4346z selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                C4345y yVar = (C4345y) selectedUnitConfig;
                C4342v vVar = yVar.f10748d;
                Track track = Track.ERRORS;
                Set<Track> set = vVar.f10741a;
                if (set == null) {
                    z = false;
                } else {
                    z = set.contains(track);
                }
                if (z) {
                    C4327r rVar = yVar.f10747c;
                    if (rVar == null || (unitDisplayType3 = rVar.f10691b) == null) {
                        C4262a0 a0Var = yVar.f10750f;
                        z2 = (a0Var == null || (unitDisplayType2 = a0Var.f10579j) == null) ? false : unitDisplayType2.isDeprecated();
                    } else {
                        z2 = unitDisplayType3.isDeprecated();
                    }
                    if (z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C5291e eVar2 = this.f11367e;
            if (eVar2 == null) {
                str7 = null;
            } else {
                str7 = eVar2.f14069d;
            }
            if (TextUtils.isEmpty(iAConfigManager.f10556u)) {
                str8 = null;
            } else {
                str8 = iAConfigManager.f10556u;
            }
            if (this.f11364b == null && this.f11365c == null) {
                IAlog.m16699a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.f11363a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f10548m)) {
                sb.append(iAConfigManager.f10548m);
                sb.append("_");
            }
            C5291e eVar3 = this.f11367e;
            if (eVar3 == null) {
                unitDisplayType = null;
            } else {
                unitDisplayType = eVar3.f14079n;
            }
            sb.append(unitDisplayType != null ? unitDisplayType.toString() : "unknown");
            String sb2 = sb.toString();
            C5291e eVar4 = this.f11367e;
            if (eVar4 == null) {
                num = null;
            } else {
                num = Integer.valueOf(eVar4.f14072g);
            }
            C5291e eVar5 = this.f11367e;
            if (eVar5 == null) {
                str9 = "";
            } else {
                str9 = eVar5.f14073h;
            }
            C5357n.m16773a(new C4571a(qVar, str7, str8, sb2, spotId, num, str9));
        }
    }
}
