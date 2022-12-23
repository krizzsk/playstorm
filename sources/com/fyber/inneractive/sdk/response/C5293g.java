package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.vast.C4442c;
import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4482f;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.response.g */
public class C5293g extends C5291e {

    /* renamed from: B */
    public long f14093B;

    /* renamed from: C */
    public C4478b f14094C;

    /* renamed from: D */
    public Map<C4489m, C4442c> f14095D = new LinkedHashMap();

    /* renamed from: E */
    public List<C4482f> f14096E = new ArrayList();

    /* renamed from: F */
    public final List<C4468i> f14097F = new ArrayList();

    /* renamed from: G */
    public LinkedHashMap<String, String> f14098G = new LinkedHashMap<>();

    /* renamed from: a */
    public InneractiveErrorCode mo24396a(InneractiveAdRequest inneractiveAdRequest) {
        return mo24397a((InneractiveAdRequest) null, (C4309s) null);
    }

    /* renamed from: e */
    public List<C4468i> mo26392e() {
        return this.f14097F;
    }

    /* renamed from: f */
    public C4478b mo26393f() {
        return this.f14094C;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0216  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode mo24397a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r18, com.fyber.inneractive.sdk.config.global.C4309s r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            com.fyber.inneractive.sdk.flow.vast.g r3 = new com.fyber.inneractive.sdk.flow.vast.g
            r3.<init>()
            java.lang.String r0 = r1.f14074i
            java.lang.String r4 = "VastErrorInvalidFile"
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "reason"
            r6 = 0
            if (r4 == 0) goto L_0x0034
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.VAST_ERROR_INVALID_RESPONSE
            java.lang.String r8 = r1.f14075j
            if (r8 == 0) goto L_0x002c
            com.fyber.inneractive.sdk.network.q$b r8 = new com.fyber.inneractive.sdk.network.q$b
            r8.<init>()
            java.lang.String r9 = r1.f14075j
            java.lang.String r10 = "exception"
            com.fyber.inneractive.sdk.network.q$b r8 = r8.mo24770a(r10, r9)
            goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            r16 = r4
            r4 = r0
            r0 = r16
            goto L_0x0113
        L_0x0034:
            java.lang.String r4 = "ErrorNoCompatibleMediaFile"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00c3
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE
            java.util.Map<com.fyber.inneractive.sdk.model.vast.m, com.fyber.inneractive.sdk.flow.vast.c> r8 = r1.f14095D
            if (r8 == 0) goto L_0x002c
            java.util.Set r9 = r8.keySet()
            if (r9 == 0) goto L_0x002c
            int r10 = r9.size()
            if (r10 <= 0) goto L_0x002c
            com.fyber.inneractive.sdk.network.q$b r10 = new com.fyber.inneractive.sdk.network.q$b
            r10.<init>()
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x005e:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00bb
            java.lang.Object r12 = r9.next()
            com.fyber.inneractive.sdk.model.vast.m r12 = (com.fyber.inneractive.sdk.model.vast.C4489m) r12
            java.lang.Object r13 = r8.get(r12)     // Catch:{ JSONException -> 0x00b2 }
            com.fyber.inneractive.sdk.flow.vast.c r13 = (com.fyber.inneractive.sdk.flow.vast.C4442c) r13     // Catch:{ JSONException -> 0x00b2 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b2 }
            r14.<init>()     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r15 = "url"
            java.lang.String r7 = r12.f11117g     // Catch:{ JSONException -> 0x00b2 }
            r14.put(r15, r7)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r7 = "bitrate"
            java.lang.Integer r15 = r12.f11115e     // Catch:{ JSONException -> 0x00b2 }
            r14.put(r7, r15)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r7 = "mime"
            java.lang.String r15 = r12.f11114d     // Catch:{ JSONException -> 0x00b2 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x00b2 }
            if (r15 == 0) goto L_0x0090
            java.lang.String r15 = "na"
            goto L_0x0092
        L_0x0090:
            java.lang.String r15 = r12.f11114d     // Catch:{ JSONException -> 0x00b2 }
        L_0x0092:
            r14.put(r7, r15)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r7 = "delivery"
            java.lang.String r12 = r12.f11111a     // Catch:{ JSONException -> 0x00b2 }
            r14.put(r7, r12)     // Catch:{ JSONException -> 0x00b2 }
            com.fyber.inneractive.sdk.flow.vast.c$a r7 = r13.f10984a     // Catch:{ JSONException -> 0x00b2 }
            if (r7 == 0) goto L_0x00a3
            int r7 = r7.f10994a     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x00a4
        L_0x00a3:
            r7 = r6
        L_0x00a4:
            r14.put(r5, r7)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r7 = "required_value"
            java.lang.Object r12 = r13.f10985b     // Catch:{ JSONException -> 0x00b2 }
            r14.put(r7, r12)     // Catch:{ JSONException -> 0x00b2 }
            r11.put(r14)     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x005e
        L_0x00b2:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "VastResponseValidator: Failed converting media file data to Extra data json!"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r8, r7)
            goto L_0x002c
        L_0x00bb:
            java.lang.String r7 = "media_files"
            r10.mo24770a(r7, r11)
            r8 = r10
            goto L_0x002d
        L_0x00c3:
            java.lang.String r4 = "VastErrorTooManyWrappers"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00e6
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.VAST_ERROR_TOO_MANY_WRAPPERS
            com.fyber.inneractive.sdk.network.q$b r7 = new com.fyber.inneractive.sdk.network.q$b
            r7.<init>()
            com.fyber.inneractive.sdk.config.IAConfigManager r8 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.q r8 = r8.f10544i
            int r8 = r8.f10683c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "max"
            com.fyber.inneractive.sdk.network.q$b r8 = r7.mo24770a(r9, r8)
            goto L_0x002d
        L_0x00e6:
            java.lang.String r4 = "ErrorNoMediaFiles"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x00f4
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.VAST_ERROR_NO_MEDIA_FILES
            goto L_0x002c
        L_0x00f4:
            java.lang.String r4 = "ErrorConfigurationMismatch"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0102
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.INTERNAL_CONFIG_MISMATCH
            goto L_0x002c
        L_0x0102:
            java.lang.String r4 = "VastErrorUnsecure"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0110
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r0 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE
            com.fyber.inneractive.sdk.network.o r4 = com.fyber.inneractive.sdk.network.C4565o.VAST_ERROR_UNSECURE_URL
            goto L_0x002c
        L_0x0110:
            r0 = 0
            r4 = 0
            r8 = 0
        L_0x0113:
            if (r0 == 0) goto L_0x0135
            com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
            if (r19 != 0) goto L_0x011b
            r9 = 0
            goto L_0x011f
        L_0x011b:
            org.json.JSONArray r9 = r19.mo24342c()
        L_0x011f:
            r7.<init>(r1)
            r7.f11364b = r0
            r7.f11363a = r2
            r7.f11366d = r9
            if (r8 == 0) goto L_0x0131
            org.json.JSONArray r0 = r7.f11368f
            org.json.JSONObject r8 = r8.f11378a
            r0.put(r8)
        L_0x0131:
            r8 = 0
            r7.mo24768a((java.lang.String) r8)
        L_0x0135:
            java.util.List<com.fyber.inneractive.sdk.model.vast.f> r0 = r1.f14096E
            java.lang.String r7 = "Got exception adding param to json object: %s, %s"
            r9 = 1
            if (r0 == 0) goto L_0x0206
            int r10 = r0.size()
            if (r10 <= 0) goto L_0x0206
            com.fyber.inneractive.sdk.network.q$a r10 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r11 = com.fyber.inneractive.sdk.network.C4567p.VAST_EVENT_COMPANION_FILTERED
            if (r19 != 0) goto L_0x014a
            r12 = 0
            goto L_0x014e
        L_0x014a:
            org.json.JSONArray r12 = r19.mo24342c()
        L_0x014e:
            r10.<init>(r1)
            r10.f11365c = r11
            r10.f11363a = r2
            r10.f11366d = r12
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x0165:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r13.next()
            com.fyber.inneractive.sdk.model.vast.f r0 = (com.fyber.inneractive.sdk.model.vast.C4482f) r0
            r0.getClass()
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = "w"
            java.lang.Integer r8 = r0.f11084a     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r15, r8)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "h"
            java.lang.Integer r15 = r0.f11085b     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "ctr"
            java.lang.String r15 = r0.f11090g     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "clt"
            java.util.List<java.lang.String> r15 = r0.f11091h     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r8, r15)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = r0.f11089f     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r15 = "content"
            if (r8 == 0) goto L_0x01a1
            r14.put(r15, r8)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "HTMLResource"
            goto L_0x01a2
        L_0x01a1:
            r8 = 0
        L_0x01a2:
            com.fyber.inneractive.sdk.model.vast.i r6 = r0.f11087d     // Catch:{ JSONException -> 0x01d6 }
            if (r6 == 0) goto L_0x01b6
            java.lang.String r6 = r6.f11103b     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r15, r6)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r6 = "creativeType"
            com.fyber.inneractive.sdk.model.vast.i r8 = r0.f11087d     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = r8.f11102a     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r6, r8)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "StaticResource"
        L_0x01b6:
            java.lang.String r6 = r0.f11088e     // Catch:{ JSONException -> 0x01d6 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x01d6 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r6 = r0.f11088e     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r15, r6)     // Catch:{ JSONException -> 0x01d6 }
            java.lang.String r8 = "iFrameResource"
        L_0x01c5:
            if (r8 == 0) goto L_0x01cc
            java.lang.String r6 = "type"
            r14.put(r6, r8)     // Catch:{ JSONException -> 0x01d6 }
        L_0x01cc:
            com.fyber.inneractive.sdk.flow.vast.a$a r0 = r0.f11092i     // Catch:{ JSONException -> 0x01d6 }
            if (r0 == 0) goto L_0x01e6
            int r0 = r0.f10981a     // Catch:{ JSONException -> 0x01d6 }
            r14.put(r5, r0)     // Catch:{ JSONException -> 0x01d6 }
            goto L_0x01e6
        L_0x01d6:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "Failed creating Companion json object: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r0, r6)
            r14 = 0
        L_0x01e6:
            r12.put(r14)
            r6 = 0
            goto L_0x0165
        L_0x01ec:
            java.lang.String r0 = "companion_data"
            r11.put(r0, r12)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01fd
        L_0x01f2:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            r6[r9] = r12
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r7, r6)
        L_0x01fd:
            org.json.JSONArray r0 = r10.f11368f
            r0.put(r11)
            r5 = 0
            r10.mo24768a((java.lang.String) r5)
        L_0x0206:
            com.fyber.inneractive.sdk.model.vast.b r0 = r1.f14094C
            if (r0 == 0) goto L_0x0211
            java.util.PriorityQueue<com.fyber.inneractive.sdk.model.vast.c> r0 = r0.f11065f
            int r0 = r0.size()
            goto L_0x0212
        L_0x0211:
            r0 = 0
        L_0x0212:
            java.util.List<com.fyber.inneractive.sdk.model.vast.f> r5 = r1.f14096E
            if (r5 == 0) goto L_0x021b
            int r5 = r5.size()
            goto L_0x021c
        L_0x021b:
            r5 = 0
        L_0x021c:
            com.fyber.inneractive.sdk.network.q$a r6 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4567p.NUMBER_OF_COMPANIONS
            if (r19 != 0) goto L_0x0224
            r10 = 0
            goto L_0x0228
        L_0x0224:
            org.json.JSONArray r10 = r19.mo24342c()
        L_0x0228:
            r6.<init>(r1)
            r6.f11365c = r8
            r6.f11363a = r2
            r6.f11366d = r10
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = "number_of_endcards"
            int r0 = r0 + r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r10, r0)     // Catch:{ Exception -> 0x0241 }
            goto L_0x024c
        L_0x0241:
            r5 = 2
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r5 = 0
            r11[r5] = r10
            r11[r9] = r0
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r7, r11)
        L_0x024c:
            org.json.JSONArray r0 = r6.f11368f
            r0.put(r8)
            r5 = 0
            r6.mo24768a((java.lang.String) r5)
            com.fyber.inneractive.sdk.model.vast.b r0 = r1.f14094C
            if (r0 == 0) goto L_0x02d9
            com.fyber.inneractive.sdk.flow.vast.f r0 = new com.fyber.inneractive.sdk.flow.vast.f
            r0.<init>(r3, r1)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x02d9
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            com.fyber.inneractive.sdk.network.q$a r6 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C4567p.OMID_VAST_DETECTION
            if (r19 != 0) goto L_0x0276
            r10 = 0
            goto L_0x027a
        L_0x0276:
            org.json.JSONArray r10 = r19.mo24342c()
        L_0x027a:
            r6.<init>(r1)
            r6.f11365c = r8
            r6.f11363a = r2
            r6.f11366d = r10
            java.util.Iterator r0 = r0.iterator()
        L_0x0287:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02bf
            java.lang.Object r2 = r0.next()
            com.fyber.inneractive.sdk.measurement.i r2 = (com.fyber.inneractive.sdk.measurement.C4468i) r2
            r2.getClass()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r10 = "success"
            boolean r11 = r2.mo24667b()     // Catch:{ JSONException -> 0x02b8 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ JSONException -> 0x02b8 }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x02b8 }
            boolean r10 = r2.mo24667b()     // Catch:{ JSONException -> 0x02b8 }
            if (r10 != 0) goto L_0x02b9
            java.lang.String r10 = "error_reason"
            java.lang.String r2 = r2.mo24665a()     // Catch:{ JSONException -> 0x02b8 }
            r8.put(r10, r2)     // Catch:{ JSONException -> 0x02b8 }
            goto L_0x02b9
        L_0x02b8:
            r8 = 0
        L_0x02b9:
            if (r8 == 0) goto L_0x0287
            r5.put(r8)
            goto L_0x0287
        L_0x02bf:
            java.lang.String r0 = "verifications"
            r3.put(r0, r5)     // Catch:{ Exception -> 0x02c5 }
            goto L_0x02d0
        L_0x02c5:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r8 = 0
            r2[r8] = r0
            r2[r9] = r5
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r7, r2)
        L_0x02d0:
            org.json.JSONArray r0 = r6.f11368f
            r0.put(r3)
            r2 = 0
            r6.mo24768a((java.lang.String) r2)
        L_0x02d9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.C5293g.mo24397a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s):com.fyber.inneractive.sdk.external.InneractiveErrorCode");
    }
}
