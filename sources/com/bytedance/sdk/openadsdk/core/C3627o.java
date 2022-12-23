package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2614a;
import com.bytedance.sdk.component.p104b.p105a.C2807f;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.p120e.p122b.C2919d;
import com.bytedance.sdk.component.p120e.p123c.C2927d;
import com.bytedance.sdk.component.p120e.p123c.C2928e;
import com.bytedance.sdk.component.p120e.p123c.C2931g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.p120e.p124d.C2938c;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.core.p145a.C3401a;
import com.bytedance.sdk.openadsdk.core.p150d.C3465b;
import com.bytedance.sdk.openadsdk.core.p151e.C3469a;
import com.bytedance.sdk.openadsdk.core.p151e.C3470b;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3500o;
import com.bytedance.sdk.openadsdk.core.p151e.C3504s;
import com.bytedance.sdk.openadsdk.core.p155i.C3531b;
import com.bytedance.sdk.openadsdk.core.p155i.C3533d;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3166i;
import com.bytedance.sdk.openadsdk.p135c.C3217d;
import com.bytedance.sdk.openadsdk.p167d.C3769a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import com.bytedance.sdk.openadsdk.utils.C4006n;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p187b.C4028a;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.o */
/* compiled from: NetApiImpl */
public class C3627o implements C3581n<C3126a> {

    /* renamed from: g */
    private static volatile boolean f9196g = false;

    /* renamed from: i */
    private static boolean f9197i = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f9198a;

    /* renamed from: b */
    private final boolean f9199b;

    /* renamed from: c */
    private final ExecutorService f9200c = Executors.newFixedThreadPool(1);

    /* renamed from: d */
    private final String f9201d;

    /* renamed from: e */
    private long f9202e;

    /* renamed from: f */
    private int f9203f;

    /* renamed from: h */
    private C2902n f9204h = new C2902n() {
        /* renamed from: a */
        public void mo17256a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo17257a(C2898j jVar) {
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$a */
    /* compiled from: NetApiImpl */
    public static class C3637a {

        /* renamed from: a */
        final int f9230a;

        /* renamed from: b */
        final long f9231b;

        /* renamed from: c */
        final long f9232c;

        /* renamed from: d */
        final int f9233d;

        /* renamed from: e */
        final String f9234e;

        /* renamed from: f */
        final int f9235f;

        /* renamed from: g */
        final String f9236g;

        /* renamed from: h */
        public final C3469a f9237h;

        /* renamed from: i */
        final String f9238i;

        /* renamed from: j */
        final ArrayList<Integer> f9239j;

        private C3637a(String str, int i, int i2, String str2, int i3, String str3, C3469a aVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.f9230a = i;
            this.f9233d = i2;
            this.f9234e = str2;
            this.f9236g = str3;
            this.f9237h = aVar;
            this.f9238i = str;
            this.f9235f = i3;
            this.f9231b = j;
            this.f9232c = j2;
            this.f9239j = arrayList;
        }

        /* renamed from: a */
        public static C3637a m11562a(JSONObject jSONObject, AdSlot adSlot, C3500o oVar) {
            C3637a aVar;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString(C2859a.a1655274989226dc("dhf"));
            int optInt = jSONObject2.optInt(C2859a.a1655274989226dc("psm`avunfnUe`kP}b"));
            long optLong = jSONObject2.optLong(C2859a.a1655274989226dc("s^pfg`oqmV~x"));
            long optLong2 = jSONObject2.optLong(C2859a.a1655274989226dc("s^qfjaYs{"));
            int optInt2 = jSONObject2.optInt(C2859a.a1655274989226dc("sucwqvYdgmo"));
            String optString2 = jSONObject2.optString(C2859a.a1655274989226dc("ddq`"));
            String optString3 = jSONObject2.optString(C2859a.a1655274989226dc("rdsvavrXam"));
            int optInt3 = jSONObject2.optInt(C2859a.a1655274989226dc("rdcpkk"));
            Pair<C3469a, ArrayList<Integer>> a = C3423b.m10207a(jSONObject, adSlot, oVar);
            if (!(a == null || a.first == null)) {
                ((C3469a) a.first).mo19474a(jSONObject2.optLong(C2859a.a1655274989226dc("rdsvavrXio~n~")));
            }
            if (a == null) {
                return aVar;
            }
            new C3637a(optString, optInt, optInt2, optString2, optInt3, optString3, (C3469a) a.first, optLong, optLong2, (ArrayList) a.second);
            return aVar;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$b */
    /* compiled from: NetApiImpl */
    public static class C3638b {

        /* renamed from: a */
        public final int f9240a;

        /* renamed from: b */
        public final boolean f9241b;

        /* renamed from: c */
        public final C3504s f9242c;

        private C3638b(int i, boolean z, C3504s sVar) {
            this.f9240a = i;
            this.f9241b = z;
            this.f9242c = sVar;
        }

        /* renamed from: a */
        public static C3638b m11563a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(C2927d.d1655274989178dc("cnff"));
            boolean optBoolean = jSONObject.optBoolean(C2927d.d1655274989178dc("vdpjb|"));
            JSONObject optJSONObject = jSONObject.optJSONObject(C2927d.d1655274989178dc("d`vb"));
            C3504s sVar = new C3504s();
            if (optJSONObject != null) {
                try {
                    sVar.mo19797a(optJSONObject.optInt(C2927d.d1655274989178dc("rdcpkk")));
                    sVar.mo19800b(optJSONObject.optInt(C2927d.d1655274989178dc("cnps[qwm")));
                    sVar.mo19801c(optJSONObject.optInt(C2927d.d1655274989178dc("rdubvaYfefex")));
                    sVar.mo19798a(optJSONObject.optString(C2927d.d1655274989178dc("rdubvaYiido")));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return new C3638b(optInt, optBoolean, sVar);
        }
    }

    C3627o(Context context) {
        this.f9198a = context;
        this.f9199b = m11532d();
        this.f9201d = m11537g();
    }

    /* renamed from: a */
    private static String m11497a(int i) {
        String str;
        if (i != 120) {
            if (i != 160) {
                if (i == 240) {
                    str = "herj";
                } else if (i == 320) {
                    str = "xifsm";
                } else if (i == 480) {
                    str = "xyjgtl";
                } else if (i == 640) {
                    str = "xyzk`uo";
                }
            }
            return C2975l.l1655274989215dc("merj");
        }
        str = "lerj";
        return C2975l.l1655274989215dc(str);
    }

    /* renamed from: a */
    private static String m11498a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C3166i.i1655274989219dc("pimma"));
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static JSONObject m11499a(AdSlot adSlot) {
        C3639p pVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2859a.a1655274989226dc("pdppkkgkasooSlj"), C3578m.m11241h().mo19914A());
            jSONObject.put(C2859a.a1655274989226dc("llv"), C3985e.m13056b());
            jSONObject.put(C2859a.a1655274989226dc("cnrse"), C3524h.m10852d().mo19861k());
            jSONObject.put(C2859a.a1655274989226dc("gerq"), C3524h.m10852d().mo19860j());
            jSONObject.put(C2859a.a1655274989226dc("ir]d`utX}zoy"), C3578m.m11241h().mo19974x());
            jSONObject.put(C2859a.a1655274989226dc("cbrb"), C3524h.m10852d().mo19872v());
            if (!(adSlot == null || !C3639p.f9243a.containsKey(Integer.valueOf(adSlot.getCodeId())) || (pVar = C3639p.f9243a.get(Integer.valueOf(adSlot.getCodeId()))) == null)) {
                jSONObject.put(C2859a.a1655274989226dc("l`qweaiji`d"), pVar.mo20207b());
                jSONObject.put(C2859a.a1655274989226dc("l`qwfphcdl"), pVar.mo20209c());
                jSONObject.put(C2859a.a1655274989226dc("l`qwgiodc"), pVar.mo20210d());
                jSONObject.put(C2859a.a1655274989226dc("l`qwwnow"), pVar.mo20211e());
            }
            m11520a(jSONObject, C2859a.a1655274989226dc("kd{tkwbt"), C3524h.m10852d().mo19863m());
            m11520a(jSONObject, C2859a.a1655274989226dc("d`vb"), m11521b(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126 A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148 A[Catch:{ Exception -> 0x017d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11500a(com.bytedance.sdk.openadsdk.AdSlot r6, int r7, com.bytedance.sdk.openadsdk.core.p151e.C3500o r8) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ie"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "aevzt`"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r7)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 != 0) goto L_0x0092
        L_0x003f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r1.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = "ae]j`"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x005d:
            java.lang.String r2 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "csgbplpbW`n"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0076:
            java.lang.String r2 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "eyv"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0089:
            java.lang.String r2 = "psgum`qXimy"
            java.lang.String r2 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x017d }
        L_0x0092:
            java.lang.String r1 = "rdlgawYjm}bdh"
            java.lang.String r2 = "abaftqccWzcqi"
            r3 = 1
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            int r4 = r8.f8660f     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x017d }
            int r1 = r8.f8660f     // Catch:{ Exception -> 0x017d }
            if (r1 != r3) goto L_0x00b6
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
        L_0x00ae:
            int r4 = r6.getImgAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m11519a((org.json.JSONObject) r0, (java.lang.String) r1, (int) r2, (int) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00b6:
            int r1 = r8.f8660f     // Catch:{ Exception -> 0x017d }
            r4 = 2
            if (r1 != r4) goto L_0x00db
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            float r2 = r6.getExpressViewAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            float r4 = r6.getExpressViewAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m11518a((org.json.JSONObject) r0, (java.lang.String) r1, (float) r2, (float) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00cb:
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            goto L_0x00ae
        L_0x00db:
            java.lang.String r1 = "puro[lbt"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            org.json.JSONArray r2 = r2.mo19943g((java.lang.String) r4)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "pnq"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            int r2 = com.bytedance.sdk.openadsdk.AdSlot.getPosition(r7)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "ir]pquvhz}Uo|a"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            boolean r2 = r6.isSupportDeepLink()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getNativeAdType()     // Catch:{ Exception -> 0x017d }
            if (r1 > 0) goto L_0x0117
            r1 = 9
            if (r7 == r1) goto L_0x0117
            r1 = 5
            if (r7 != r1) goto L_0x0120
        L_0x0117:
            java.lang.String r1 = "ir]lvlanfVko"
            java.lang.String r1 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0120:
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
            if (r1 >= r3) goto L_0x0127
            r1 = r3
        L_0x0127:
            r2 = 3
            if (r1 <= r2) goto L_0x012b
            r1 = r2
        L_0x012b:
            r2 = 7
            if (r7 == r2) goto L_0x0132
            r2 = 8
            if (r7 != r2) goto L_0x0133
        L_0x0132:
            r1 = r3
        L_0x0133:
            if (r8 == 0) goto L_0x013d
            org.json.JSONArray r8 = r8.f8659e     // Catch:{ Exception -> 0x017d }
            if (r8 == 0) goto L_0x013d
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
        L_0x013d:
            java.lang.String r8 = "ae]`kphs"
            java.lang.String r8 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r8)     // Catch:{ Exception -> 0x017d }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            if (r7 != r3) goto L_0x017d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r7.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "ir]qkqgsmVhjbck}"
            java.lang.String r8 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getIsRotateBanner()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Ysado"
            java.lang.String r8 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getRotateTime()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Yhzmoy"
            java.lang.String r8 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r8)     // Catch:{ Exception -> 0x017d }
            int r6 = r6.getRotateOrder()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x017d }
            java.lang.String r6 = "b`lmaw"
            java.lang.String r6 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r6)     // Catch:{ Exception -> 0x017d }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.m11500a(com.bytedance.sdk.openadsdk.AdSlot, int, com.bytedance.sdk.openadsdk.core.e.o):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ all -> 0x015a }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m11501a(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.p151e.C3500o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "aqr"
            java.lang.String r1 = "4/7-4+2"
            java.lang.String r2 = "ae]p`nYqm{ybcc"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x015a }
            r4.<init>()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x0020
            java.lang.String r5 = r12.f8655a     // Catch:{ all -> 0x015a }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x015a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x015a }
            if (r5 == 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            java.lang.String r5 = r12.f8655a     // Catch:{ all -> 0x015a }
            goto L_0x0024
        L_0x0020:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.utils.C4014u.m13208c()     // Catch:{ all -> 0x015a }
        L_0x0024:
            r6 = 7
            java.lang.String r7 = "rds\\p|vb"
            if (r13 != r6) goto L_0x0039
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8656b     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8656b     // Catch:{ all -> 0x015a }
        L_0x0035:
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x005a
        L_0x0039:
            r6 = 8
            if (r13 != r6) goto L_0x004a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8657c     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8657c     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x004a:
            r6 = 3
            if (r13 != r6) goto L_0x005a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f8658d     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f8658d     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.mo19939e()     // Catch:{ all -> 0x008e }
            com.bytedance.sdk.openadsdk.core.i.f r7 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.mo19942f()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x008e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x008e }
            r8.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "vdppmjh"
            java.lang.String r9 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r9)     // Catch:{ all -> 0x008e }
            r8.put(r9, r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "p`pbi"
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r6)     // Catch:{ all -> 0x008e }
            r8.put(r6, r7)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "acvfwq"
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r6)     // Catch:{ all -> 0x008e }
            r4.put(r6, r8)     // Catch:{ all -> 0x008e }
        L_0x008e:
            java.lang.String r6 = "rdsvavrXam"
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r6)     // Catch:{ all -> 0x015a }
            r4.put(r6, r5)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r1)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = "snwqg`Ysqyo"
            java.lang.String r6 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r6 = r10.m11523b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r6)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r10.f9198a     // Catch:{ all -> 0x015a }
            r6 = 1
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.utils.C3985e.m13051a(r0, r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "ddtjg`"
            java.lang.String r7 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r7, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "urgq"
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r7 = m11499a((com.bytedance.sdk.openadsdk.AdSlot) r11)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "u`"
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.utils.C4014u.m13197b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "cicmj`j"
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "m`km"
            java.lang.String r7 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x015a }
            r0.<init>()     // Catch:{ all -> 0x015a }
            org.json.JSONObject r13 = r10.m11500a((com.bytedance.sdk.openadsdk.AdSlot) r11, (int) r13, (com.bytedance.sdk.openadsdk.core.p151e.C3500o) r12)     // Catch:{ all -> 0x015a }
            r0.put(r13)     // Catch:{ all -> 0x015a }
            java.lang.String r13 = "aeqokqu"
            java.lang.String r13 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r13)     // Catch:{ all -> 0x015a }
            r4.put(r13, r0)     // Catch:{ all -> 0x015a }
            r10.m11517a((org.json.JSONObject) r4, (com.bytedance.sdk.openadsdk.core.p151e.C3500o) r12)     // Catch:{ all -> 0x015a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015a }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r7
            java.lang.String r0 = "tr"
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r0, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = ""
            java.lang.String r7 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            if (r7 == 0) goto L_0x0135
            if (r5 == 0) goto L_0x0135
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r11.concat(r5)     // Catch:{ all -> 0x015a }
        L_0x0135:
            java.lang.String r11 = "rds\\wlai"
            java.lang.String r11 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.component.utils.C2963e.m8350a((java.lang.String) r0)     // Catch:{ all -> 0x015a }
            r4.put(r11, r12)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r3 = com.bytedance.sdk.component.utils.C2958a.m8335a((org.json.JSONObject) r4)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r1)     // Catch:{ all -> 0x015a }
            r3.put(r11, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = "owgqw`gX~lxxeb`Pdhbv"
            java.lang.String r11 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r11)     // Catch:{ all -> 0x015a }
            r3.put(r11, r6)     // Catch:{ all -> 0x015a }
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.m11501a(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.e.o, int):org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11502a(long j, String str, int i, C3637a aVar, int i2, String str2) {
    }

    /* renamed from: a */
    private void m11503a(C3126a aVar) {
        if (aVar != null) {
            String optString = aVar.mo18655b().optString(C2933b.b1655274989200dc("lne\\a}rui"), "");
            long c = C4014u.m13207c(optString);
            int d = C4014u.m13213d(optString);
            if (c == 0) {
                c = this.f9202e;
            }
            this.f9202e = c;
            if (d == 0) {
                d = this.f9203f;
            }
            this.f9203f = d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11504a(C3469a aVar) {
        List<C3498n> b = aVar.mo19477b();
        if (b != null && b.size() != 0) {
            for (int i = 0; i < b.size(); i++) {
                C3498n nVar = b.get(i);
                if (nVar != null && nVar.mo19683b() == null) {
                    m11516a("", nVar.mo19610M());
                    m11516a("", nVar.mo19611N());
                    List<C3484k> P = nVar.mo19613P();
                    if (P != null && P.size() > 0) {
                        for (int i2 = 0; i2 < P.size(); i2++) {
                            m11505a(nVar, P.get(i2));
                        }
                    }
                    if (nVar.mo19607J() != null) {
                        m11516a(nVar.mo19607J().mo16358h(), (C3484k) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m11505a(final C3498n nVar, C3484k kVar) {
        C2975l.m8387c(C2807f.f1655274989236dc("ile@efnb"), C2807f.f1655274989236dc("lncgMhaFfmXn|b|{*1"));
        if (kVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            C3769a.m12387a(kVar).mo17711a((C2902n) new C2902n() {
                /* renamed from: a */
                public void mo17256a(int i, String str, Throwable th) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C2928e.e1655274989197dc("esplvZehll"), i);
                        jSONObject.put(C2928e.e1655274989197dc("esplvZkb{zkli"), str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C2975l.m8387c(C2928e.e1655274989197dc("ile@efnb"), C2928e.e1655274989197dc("lncgMhaFfmXn|b|{*1夣贶"));
                    Context a = C3627o.this.f9198a;
                    C3498n nVar = nVar;
                    C3156e.m9193b(a, nVar, C4014u.m13183a(nVar), C2928e.e1655274989197dc("lncg[lkfolUn~a}"), currentTimeMillis, jSONObject);
                }

                /* renamed from: a */
                public void mo17257a(C2898j jVar) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C2931g.g1655274989199dc("psgokdbX{`pn"), jVar.mo17729f() / 1024);
                        jSONObject.put(C2931g.g1655274989199dc("lnabhZefkao"), jVar.mo17727d() ? 1 : 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C2975l.m8387c(C2931g.g1655274989199dc("ile@efnb"), C2931g.g1655274989199dc("lncgMhaFfmXn|b|{*1戂劌"));
                    Context a = C3627o.this.f9198a;
                    C3498n nVar = nVar;
                    C3156e.m9193b(a, nVar, C4014u.m13183a(nVar), C2931g.g1655274989199dc("lncg[lkfolUxynmjcb"), currentTimeMillis, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11506a(C3500o oVar, long j, long j2, int i, long j3, C3498n nVar, String str) {
        if (C3578m.m11241h().mo19919F()) {
            JSONObject jSONObject = new JSONObject();
            long j4 = 0;
            if (oVar != null) {
                try {
                    if (oVar.f8661g > 0) {
                        jSONObject.put(C2938c.c1655274989199dc("cmkfjqYt|hxSygbu"), j - oVar.f8661g);
                        j4 = j3 - oVar.f8661g;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(C2938c.c1655274989199dc("ndvtkwmX|`gn"), j2 - j);
            jSONObject.put(C2938c.c1655274989199dc("sdtfvZrnel"), i);
            jSONObject.put(C2938c.c1655274989199dc("cmkfjqYbfmUe`k"), j3 - j2);
            C3156e.m9171a(this.f9198a, nVar, str, C2938c.c1655274989199dc("lncg[dbX|`gn"), j4, jSONObject);
            while (true) {
                char c = 19;
                while (true) {
                    switch (c) {
                        case 18:
                            return;
                        case 20:
                        default:
                            c = 18;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11507a(C3581n.C3582a aVar, C3470b bVar) {
        aVar.mo18544a(-1, C3513g.m10825a(-1));
        bVar.mo19482a(-1);
        C3470b.m10407a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11508a(C3581n.C3583b bVar) {
        bVar.mo18585a(-1, C3513g.m10825a(-1));
    }

    /* renamed from: a */
    private void m11516a(String str, C3484k kVar) {
        if (!TextUtils.isEmpty(str)) {
            C3769a.m12388a(str).mo17711a(this.f9204h);
        } else if (kVar != null) {
            C3769a.m12387a(kVar).mo17711a(this.f9204h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = 'J';
        r3 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        switch(r3) {
            case 55: goto L_0x0029;
            case 56: goto L_0x0029;
            case 57: goto L_0x0021;
            default: goto L_0x0020;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11517a(org.json.JSONObject r2, com.bytedance.sdk.openadsdk.core.p151e.C3500o r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0029
            org.json.JSONArray r0 = r3.f8659e
            if (r0 != 0) goto L_0x0007
            goto L_0x0029
        L_0x0007:
            java.lang.String r0 = "snwqg`YsmdkbS}|`tdqgK|rd"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p130b.C3166i.i1655274989219dc(r0)     // Catch:{ Exception -> 0x0029 }
            org.json.JSONArray r3 = r3.f8659e     // Catch:{ Exception -> 0x0029 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0029 }
        L_0x0012:
            r2 = 73
            r3 = 96
        L_0x0016:
            switch(r2) {
                case 72: goto L_0x0021;
                case 73: goto L_0x001a;
                case 74: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0026
        L_0x001a:
            switch(r3) {
                case 94: goto L_0x0012;
                case 95: goto L_0x0021;
                case 96: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r3) {
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0012
        L_0x0021:
            r2 = 74
            r3 = 55
            goto L_0x0016
        L_0x0026:
            r2 = 72
            goto L_0x0016
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.m11517a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.e.o):void");
    }

    /* renamed from: a */
    private void m11518a(JSONObject jSONObject, String str, float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject2.put(C2933b.b1655274989200dc("whfwl"), (int) f);
                jSONObject2.put(C2933b.b1655274989200dc("hdkdlq"), (int) f2);
                jSONArray.put(jSONObject2);
                jSONObject.put(str, jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        switch(r5) {
            case 52: goto L_0x0029;
            case 53: goto L_0x0033;
            case 54: goto L_0x003e;
            default: goto L_0x0032;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        switch(r4) {
            case 29: goto L_0x0029;
            case 30: goto L_0x0029;
            case 31: goto L_0x002f;
            default: goto L_0x0036;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11519a(org.json.JSONObject r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = this;
            if (r6 <= 0) goto L_0x0043
            if (r7 <= 0) goto L_0x0043
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "whfwl"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r2)     // Catch:{ Exception -> 0x0043 }
            r0.put(r2, r6)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r6)     // Catch:{ Exception -> 0x0043 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0043 }
            r1.put(r0)     // Catch:{ Exception -> 0x0043 }
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0043 }
            r4 = 55
            r5 = 0
        L_0x0029:
            r6 = 72
        L_0x002b:
            switch(r6) {
                case 72: goto L_0x003e;
                case 73: goto L_0x0039;
                case 74: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0029
        L_0x002f:
            switch(r5) {
                case 52: goto L_0x0029;
                case 53: goto L_0x0033;
                case 54: goto L_0x003e;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x003e
        L_0x0033:
            switch(r4) {
                case 29: goto L_0x0029;
                case 30: goto L_0x0029;
                case 31: goto L_0x002f;
                default: goto L_0x0036;
            }
        L_0x0036:
            r4 = 30
            goto L_0x0033
        L_0x0039:
            r6 = 57
            if (r5 > r6) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r6 = 73
            r5 = 16
            goto L_0x002b
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.m11519a(org.json.JSONObject, java.lang.String, int, int):void");
    }

    /* renamed from: a */
    private static void m11520a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }

    /* renamed from: b */
    private static String m11521b(AdSlot adSlot) {
        if (adSlot == null) {
            return "";
        }
        String n = C3524h.m10852d().mo19864n();
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(n)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return n;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(C2931g.g1655274989199dc("n`of"), (String) null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(n);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(C2931g.g1655274989199dc("n`of"), (String) null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return n;
        }
    }

    /* renamed from: b */
    private JSONArray m11522b(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord id : list) {
            jSONArray.put(id.getId());
        }
        return jSONArray;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m11523b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2975l.l1655274989215dc("aqrj`"), C3524h.m10852d().mo19854f());
            jSONObject.put(C2975l.l1655274989215dc("n`of"), C3524h.m10852d().mo19857g());
            m11538g(jSONObject);
            Context a = C3578m.m11231a();
            String str = "";
            if (a != null) {
                try {
                    str = a.getPackageResourcePath();
                } catch (Throwable th) {
                    String l1655274989215dc = C2975l.l1655274989215dc("NdvBtlOjxe");
                    C2975l.m8391e(l1655274989215dc, C2975l.l1655274989215dc("f`koaa&sg)mnx-zgu1scdytymstr=wqSUCOHDRNGG\n[MNENWT\u0012CUA^\u0019\u0018\\HISO\u0004\u001f") + th.getMessage());
                }
            }
            jSONObject.put(C2975l.l1655274989215dc("p`ahebcXagymabP`pf{"), str);
            int i = 0;
            C4014u.m13192a(jSONObject, false);
            jSONObject.put(C2975l.l1655274989215dc("ir]selbXiyz"), C3524h.m10852d().mo19862l());
            if (C3644s.m11585a() != null) {
                jSONObject.put(C2975l.l1655274989215dc("aqi\\wlai"), C3644s.m11585a());
            }
            jSONObject.put(C2975l.l1655274989215dc("aqr\\vphiagmTxdcj"), (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
            jSONObject.put(C2975l.l1655274989215dc("flumehc"), C3985e.m13075i(this.f9198a));
            String l1655274989215dc2 = C2975l.l1655274989215dc("ir]jjlr");
            if (TTAdSdk.isInitSuccess()) {
                i = 1;
            }
            jSONObject.put(l1655274989215dc2, i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m11524b(C3498n nVar, List<FilterWord> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C2938c.c1655274989199dc("abvjkk"), C2938c.c1655274989199dc("dhqomnc"));
            jSONObject2.put(C2938c.c1655274989199dc("thofwqgjx"), System.currentTimeMillis());
            jSONObject2.put(C2938c.c1655274989199dc("ae]p`nYqm{ybcc"), C2938c.c1655274989199dc("4/7-4+2"));
            jSONObject2.put(C2938c.c1655274989199dc("eyvqe"), nVar.mo19659ac());
            jSONObject2.put(C2938c.c1655274989199dc("fhnwawYpg{nx"), m11522b(list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(C2938c.c1655274989199dc("abvjkku"), jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    @JProtect
    /* renamed from: b */
    public void m11525b(AdSlot adSlot, C3500o oVar, int i, C3581n.C3582a aVar) {
        AdSlot adSlot2 = adSlot;
        C3581n.C3582a aVar2 = aVar;
        final C3470b bVar = new C3470b();
        bVar.mo19483a(adSlot2);
        if (!C3536e.m10968a()) {
            if (aVar2 != null) {
                aVar2.mo18544a(1000, C2927d.d1655274989178dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                bVar.mo19482a(1000);
                C3470b.m10407a(bVar);
            }
        } else if (C3578m.m11241h().mo19976z()) {
            C3533d.m10949a((C3531b) null).mo19910a(false);
            if (aVar2 != null) {
                if (m11527b(adSlot.getCodeId())) {
                    aVar2.mo18544a(-8, C3513g.m10825a(-8));
                    bVar.mo19482a(-8);
                    C3470b.m10407a(bVar);
                } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C3815b.m12552a().mo20667c();
                    bVar.mo19487b(2);
                    bVar.mo19484a(adSlot.getBidAdm());
                    String d1655274989178dc = C2927d.d1655274989178dc("bhfgmka");
                    C2975l.m8384b(d1655274989178dc, C2927d.d1655274989178dc("gdvB`%dnlHnf,d}/fp~zp９c8nswp=zvRDAWH\\\u0006WI[YN\fYFJ\u0010CWGAGXR\\\u0019[_JXLK)2'.!+2}h\u000b#/\r)#bn\u001c\u0016fyk") + C2535b.m6426a(adSlot.getBidAdm()));
                    if (C3578m.m11241h().mo19917D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C4014u.m13189a(C2927d.d1655274989178dc("P`ldh`YCmklS@aku"), adSlot.getBidAdm(), this.f9198a);
                    }
                    try {
                        JSONObject a = mo20072a(new JSONObject(adSlot.getBidAdm()));
                        if (a == null) {
                            m11507a(aVar2, bVar);
                            return;
                        }
                        C3637a a2 = C3637a.m11562a(a, adSlot2, oVar);
                        bVar.mo19485a(a2.f9239j);
                        C3538j.m11046a(this.f9198a, a2.f9238i);
                        if (a2.f9233d != 20000) {
                            aVar2.mo18544a(a2.f9233d, a2.f9234e);
                            bVar.mo19482a(a2.f9233d);
                            C3470b.m10407a(bVar);
                        } else if (a2.f9237h == null) {
                            m11507a(aVar2, bVar);
                        } else {
                            if (a2.f9237h.mo19477b() != null && a2.f9237h.mo19477b().size() > 0) {
                                C3156e.m9180a(a2.f9237h.mo19477b().get(0), C4014u.m13198b(i));
                            }
                            a2.f9237h.mo19480c(a.toString());
                            aVar2.mo18545a(a2.f9237h, bVar);
                            m11504a(a2.f9237h);
                        }
                    } catch (Throwable th) {
                        C2975l.m8388c(C2927d.d1655274989178dc("NdvBtlOjxe"), C2927d.d1655274989178dc("gdv#ea&bz{ey6-"), th);
                        m11507a(aVar2, bVar);
                    }
                } else {
                    C3500o oVar2 = oVar;
                    JSONObject a3 = m11501a(adSlot, oVar, i);
                    if (a3 == null) {
                        aVar2.mo18544a(-9, C3513g.m10825a(-9));
                        bVar.mo19482a(-9);
                        C3470b.m10407a(bVar);
                        return;
                    }
                    if (C3578m.m11241h().mo19917D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C4014u.m13189a(C2927d.d1655274989178dc("P`ldh`YCmklS@aku"), a3.toString(), this.f9198a);
                    }
                    String a4 = C4014u.m13185a(C3166i.i1655274989219dc("/`rj+db(}gcdb\"}k{>uv`Jwsk6"), true);
                    C2919d b = C3854d.m12660a().mo20705b().mo17761b();
                    try {
                        b.mo17789a(C3217d.m9387a(b, a4));
                    } catch (Exception unused) {
                    }
                    b.mo17798a(a3);
                    HashMap hashMap = new HashMap();
                    hashMap.put(C2927d.d1655274989178dc("eyvqeZrnelUxxl|{"), Long.valueOf(System.currentTimeMillis()));
                    b.mo17795e(hashMap);
                    Map<String, String> a5 = C3644s.m11586a(a4, a3.toString());
                    if (a5 != null && a5.size() > 0) {
                        C2975l.m8387c(C2927d.d1655274989178dc("mrqgo%kt{maCiljjbb("), a5.toString());
                        for (String next : a5.keySet()) {
                            try {
                                b.mo17792b(next, a5.get(next));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    try {
                        b.mo17792b(C2927d.d1655274989178dc("Urgq)Dabf}"), C4014u.m13197b());
                    } catch (Exception unused3) {
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final AtomicLong atomicLong = new AtomicLong(currentTimeMillis);
                    final AtomicLong atomicLong2 = new AtomicLong(currentTimeMillis);
                    final C3581n.C3582a aVar3 = aVar;
                    final AdSlot adSlot3 = adSlot;
                    final int i2 = i;
                    final C3500o oVar3 = oVar;
                    b.mo17797a((C2912a) new C2912a() {
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                            */
                        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
                        /* renamed from: a */
                        public void mo17771a(com.bytedance.sdk.component.p120e.p122b.C2918c r23, com.bytedance.sdk.component.p120e.C2913b r24) {
                            /*
                                r22 = this;
                                r1 = r22
                                java.lang.String r2 = "p`ppaZ`fae"
                                if (r24 == 0) goto L_0x030c
                                boolean r0 = r24.mo17779f()
                                if (r0 == 0) goto L_0x02dc
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r24.mo17777d()     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
                                r3.<init>(r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ all -> 0x02ab }
                                boolean r4 = r4.mo19917D()     // Catch:{ all -> 0x02ab }
                                if (r4 == 0) goto L_0x0046
                                com.bytedance.sdk.openadsdk.TTAdManager r4 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()     // Catch:{ all -> 0x02ab }
                                int r4 = r4.getDebugLog()     // Catch:{ all -> 0x02ab }
                                r5 = 1
                                if (r4 != r5) goto L_0x0046
                                java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "P`ldh`YCmklS@aku"
                                java.lang.String r5 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r6 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r6 = r6.f9198a     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.utils.C4014u.m13189a((java.lang.String) r5, (java.lang.String) r4, (android.content.Context) r6)     // Catch:{ all -> 0x02ab }
                            L_0x0046:
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r4.mo19484a((java.lang.String) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r0 = r0.mo20072a((org.json.JSONObject) r3)     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x0076
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m11507a((com.bytedance.sdk.openadsdk.core.C3581n.C3582a) r3, (com.bytedance.sdk.openadsdk.core.p151e.C3470b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17780g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r10 = 0
                                r11 = -1
                                java.lang.String r0 = "m`vf$ugu{lUmmdb"
                                java.lang.String r12 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r0)     // Catch:{ all -> 0x02ab }
                                r5.m11502a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x0076:
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r4 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o$a r10 = com.bytedance.sdk.openadsdk.core.C3627o.C3637a.m11562a(r0, r3, r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4     // Catch:{ all -> 0x02ab }
                                java.util.ArrayList<java.lang.Integer> r4 = r10.f9239j     // Catch:{ all -> 0x02ab }
                                r3.mo19485a((java.util.ArrayList<java.lang.Integer>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C3423b.C3424a.m10226a((com.bytedance.sdk.openadsdk.core.p151e.C3469a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r3 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r3 = r3.f9198a     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f9238i     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C3538j.m11046a(r3, r4)     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9233d     // Catch:{ all -> 0x02ab }
                                r4 = 20000(0x4e20, float:2.8026E-41)
                                if (r3 == r4) goto L_0x00e6
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9233d     // Catch:{ all -> 0x02ab }
                                r0.mo19482a((int) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11241h()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.mo19964o()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x00bf
                                int r0 = r10.f9233d     // Catch:{ all -> 0x02ab }
                                r3 = 40029(0x9c5d, float:5.6093E-41)
                                if (r0 != r3) goto L_0x00bf
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                r3 = -100
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3513g.m10825a(r3)     // Catch:{ all -> 0x02ab }
                            L_0x00bb:
                                r0.mo18544a((int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02ab }
                                goto L_0x00c6
                            L_0x00bf:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f9233d     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f9234e     // Catch:{ all -> 0x02ab }
                                goto L_0x00bb
                            L_0x00c6:
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p151e.C3470b.m10407a((com.bytedance.sdk.openadsdk.core.p151e.C3470b) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17780g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                int r11 = r10.f9233d     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f9235f     // Catch:{ all -> 0x02ab }
                                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02ab }
                                r5.m11502a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                goto L_0x02aa
                            L_0x00e6:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                if (r3 != 0) goto L_0x010a
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m11507a((com.bytedance.sdk.openadsdk.core.C3581n.C3582a) r3, (com.bytedance.sdk.openadsdk.core.p151e.C3470b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17780g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r2)     // Catch:{ all -> 0x02ab }
                                r5.m11502a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x010a:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02ab }
                                r3.mo19480c(r0)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r9     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r0 = r0.f8663i     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r11 = r0.f8663i     // Catch:{ all -> 0x02ab }
                                long r12 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r14 = r0.get()     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f9230a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r3 = r9     // Catch:{ all -> 0x02ab }
                                long r17 = r3.get()     // Catch:{ all -> 0x02ab }
                                r16 = r0
                                r11.mo19786a(r12, r14, r16, r17)     // Catch:{ all -> 0x02ab }
                            L_0x013f:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.mo18545a((com.bytedance.sdk.openadsdk.core.p151e.C3469a) r3, (com.bytedance.sdk.openadsdk.core.p151e.C3470b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                r0.m11504a((com.bytedance.sdk.openadsdk.core.p151e.C3469a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p151e.C3469a.m10397a((com.bytedance.sdk.openadsdk.core.p151e.C3469a) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19477b()     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x02a4
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19477b()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x02a1
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f9237h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo19477b()     // Catch:{ all -> 0x02ab }
                                r3 = 0
                                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.n r0 = (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0     // Catch:{ all -> 0x02ab }
                                int r3 = r7     // Catch:{ all -> 0x02ab }
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.C4014u.m13198b((int) r3)     // Catch:{ all -> 0x02ab }
                                java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x02ab }
                                r4.<init>()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                if (r5 == 0) goto L_0x01cb
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                long r5 = r5.f8661g     // Catch:{ all -> 0x02ab }
                                r7 = 0
                                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                                if (r5 <= 0) goto L_0x01cb
                                java.lang.String r5 = "cmkfjqYt|hxSygbu"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f8661g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "lncg[qu"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r6 = r8     // Catch:{ all -> 0x02ab }
                                long r6 = r6.f8661g     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "tnvbhZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f8661g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                            L_0x01cb:
                                java.lang.String r5 = "rdsvavrX|z"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9231b     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^qfjaYs{"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9232c     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^gm`Zrt"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "ndvtkwmX|`gn"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo17780g()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "gn]wmhc"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f9231b     // Catch:{ all -> 0x02ab }
                                long r8 = r10     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "sdtfvZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                int r6 = r10.f9230a     // Catch:{ all -> 0x02ab }
                                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "b`ah[qojm"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                long r8 = r10.f9232c     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "cmkfjqYbfmUe`k"
                                java.lang.String r5 = com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r8 = r3     // Catch:{ all -> 0x02ab }
                                long r8 = r8.get()     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.p130b.C3156e.m9186a((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r0, (java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r11 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r12 = r8     // Catch:{ all -> 0x02ab }
                                long r13 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r4 = r3     // Catch:{ all -> 0x02ab }
                                long r15 = r4.get()     // Catch:{ all -> 0x02ab }
                                int r4 = r10.f9230a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r5 = r9     // Catch:{ all -> 0x02ab }
                                long r18 = r5.get()     // Catch:{ all -> 0x02ab }
                                r17 = r4
                                r20 = r0
                                r21 = r3
                                r11.m11506a((com.bytedance.sdk.openadsdk.core.p151e.C3500o) r12, (long) r13, (long) r15, (int) r17, (long) r18, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r20, (java.lang.String) r21)     // Catch:{ all -> 0x02ab }
                                goto L_0x030c
                            L_0x02a1:
                                r0 = 53
                                goto L_0x02a6
                            L_0x02a4:
                                r0 = 51
                            L_0x02a6:
                                switch(r0) {
                                    case 51: goto L_0x030c;
                                    case 52: goto L_0x02aa;
                                    case 53: goto L_0x030c;
                                    default: goto L_0x02a9;
                                }
                            L_0x02a9:
                                goto L_0x02a4
                            L_0x02aa:
                                return
                            L_0x02ab:
                                r0 = move-exception
                                java.lang.String r3 = "NdvBtlOjxe"
                                java.lang.String r3 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r3)
                                java.lang.String r4 = "gdv#ea&bz{ey6-"
                                java.lang.String r4 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r4)
                                com.bytedance.sdk.component.utils.C2975l.m8388c(r3, r4, r0)
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C3627o.this
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4
                                r0.m11507a((com.bytedance.sdk.openadsdk.core.C3581n.C3582a) r3, (com.bytedance.sdk.openadsdk.core.p151e.C3470b) r4)
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C3627o.this
                                long r6 = r24.mo17780g()
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6
                                java.lang.String r8 = r0.getCodeId()
                                int r9 = r7
                                r10 = 0
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r2)
                                r5.m11502a(r6, r8, r9, r10, r11, r12)
                                goto L_0x030c
                            L_0x02dc:
                                int r0 = r24.mo17773a()
                                java.lang.String r2 = r24.mo17775b()
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                r3.mo18544a((int) r0, (java.lang.String) r2)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                r3.mo19482a((int) r0)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                com.bytedance.sdk.openadsdk.core.p151e.C3470b.m10407a((com.bytedance.sdk.openadsdk.core.p151e.C3470b) r3)
                                com.bytedance.sdk.openadsdk.core.o r13 = com.bytedance.sdk.openadsdk.core.C3627o.this
                                long r14 = r24.mo17780g()
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6
                                java.lang.String r16 = r3.getCodeId()
                                int r3 = r7
                                r18 = 0
                                r17 = r3
                                r19 = r0
                                r20 = r2
                                r13.m11502a(r14, r16, r17, r18, r19, r20)
                            L_0x030c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.C36303.mo17771a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                        }

                        /* renamed from: a */
                        public void mo17772a(C2918c cVar, IOException iOException) {
                            if (C3578m.m11241h().mo19917D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                                C4014u.m13189a(C2933b.b1655274989200dc("P`ldh`YCmklS@aku"), iOException != null ? iOException.getMessage() : null, C3627o.this.f9198a);
                            }
                            long longValue = ((Long) cVar.mo17793c().get(C2933b.b1655274989200dc("eyvqeZrnelUxxl|{"))).longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            String message = iOException != null ? iOException.getMessage() : "";
                            if (iOException != null && SocketTimeoutException.class.equals(iOException.getCause())) {
                                aVar3.mo18544a(602, message);
                            }
                            aVar3.mo18544a(602, message);
                            C2975l.m8380a(C2933b.b1655274989200dc("NdvBtlOjxe"), C2933b.b1655274989200dc("ooDbmisum3*"), 601);
                            bVar.mo19482a(601);
                            C3470b.m10407a(bVar);
                            C3627o.this.m11502a(currentTimeMillis - longValue, adSlot3.getCodeId(), i2, (C3637a) null, 601, message);
                        }
                    });
                    C3460d.m10372a().mo19465b();
                }
            }
        } else if (aVar2 != null) {
            aVar2.mo18544a(-16, C3513g.m10825a(-16));
            bVar.mo19482a(1001);
            C3470b.m10407a(bVar);
        }
    }

    /* renamed from: b */
    private void m11526b(JSONObject jSONObject, String str) {
        C2919d b = C3854d.m12660a().mo20705b().mo17761b();
        b.mo17789a(str);
        b.mo17798a(jSONObject);
        b.mo17796a();
    }

    /* renamed from: b */
    private boolean m11527b(String str) {
        if (C3465b.m10388a()) {
            return true;
        }
        if (!C3465b.m10389a(str)) {
            return false;
        }
        String b = C3465b.m10390b();
        if (!TextUtils.isEmpty(b)) {
            C3156e.m9176a(this.f9198a, b, System.currentTimeMillis());
        }
        return true;
    }

    @JProtect
    /* renamed from: c */
    private JSONObject m11528c() {
        char c = 26;
        while (true) {
            char c2 = 31;
            while (true) {
                switch (c2) {
                    case 31:
                    case '!':
                        break;
                    case ' ':
                        switch (c) {
                            case 18:
                            case 19:
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(C2933b.b1655274989200dc("u`"), C4014u.m13197b());
                                    jSONObject.put(C2933b.b1655274989200dc("ae]p`nYqm{ybcc"), C2933b.b1655274989200dc("4/7-4+2"));
                                    jSONObject.put(C2933b.b1655274989200dc("sho\\ku"), m11498a(this.f9198a));
                                    int i = 1;
                                    jSONObject.put(C2933b.b1655274989200dc("rnmw"), this.f9199b ? 1 : 0);
                                    jSONObject.put(C2933b.b1655274989200dc("thof~jhb"), m11535f());
                                    jSONObject.put(C2933b.b1655274989200dc("abafwv"), C2979o.m8413g(this.f9198a));
                                    jSONObject.put(C2933b.b1655274989200dc("or"), C2933b.b1655274989200dc("Aofqklb"));
                                    jSONObject.put(C2933b.b1655274989200dc("or]uawungg"), Build.VERSION.RELEASE);
                                    jSONObject.put(C2933b.b1655274989200dc("or]btl"), Build.VERSION.SDK_INT);
                                    jSONObject.put(C2933b.b1655274989200dc("ddtjg`Ysqyo"), this.f9201d);
                                    jSONObject.put(C2933b.b1655274989200dc("ddtjg`Yjgmog"), Build.MODEL);
                                    jSONObject.put(C2933b.b1655274989200dc("ddtjg`Yezhdo"), Build.BRAND);
                                    jSONObject.put(C2933b.b1655274989200dc("ddtjg`Yjigmmnzzbt`"), Build.MANUFACTURER);
                                    jSONObject.put(C2933b.b1655274989200dc("l`ldqdab"), Locale.getDefault().getLanguage());
                                    jSONObject.put(C2933b.b1655274989200dc("rdqlhprngg"), C4020v.m13310d(this.f9198a) + C2933b.b1655274989200dc("x") + C4020v.m13306c(this.f9198a));
                                    jSONObject.put(C2933b.b1655274989200dc("dhqshdXlldxeyw"), m11497a(C4020v.m13319g(this.f9198a)));
                                    jSONObject.put(C2933b.b1655274989200dc("ddlpmqXlyc"), C4020v.m13319g(this.f9198a));
                                    jSONObject.put(C2933b.b1655274989200dc("ddtjg`Ynl"), C3538j.m11045a(this.f9198a));
                                    jSONObject.put(C2933b.b1655274989200dc("ahf"), C2933b.b1655274989200dc("1252"));
                                    jSONObject.put(C2933b.b1655274989200dc("rno"), m11533e());
                                    jSONObject.put(C2933b.b1655274989200dc("cqw\\ego"), Build.CPU_ABI);
                                    jSONObject.put(C2933b.b1655274989200dc("uu"), this.f9203f);
                                    jSONObject.put(C2933b.b1655274989200dc("uhf"), this.f9202e);
                                    jSONObject.put(C2933b.b1655274989200dc("gnmdh`Yfam"), C4028a.m13343a().mo20936b());
                                    jSONObject.put(C2933b.b1655274989200dc("lnabh`Ykigm~mjk"), C3985e.m13062c());
                                    jSONObject.put(C2933b.b1655274989200dc("sbpfakYez`mcx"), Math.ceil((double) (C3985e.m13064d() * 10.0f)) / 10.0d);
                                    String b1655274989200dc = C2933b.b1655274989200dc("ir]pgwcbfVemj");
                                    if (C3985e.m13054a()) {
                                        i = 0;
                                    }
                                    jSONObject.put(b1655274989200dc, i);
                                    C3537f h = C3578m.m11241h();
                                    jSONObject.put(C2933b.b1655274989200dc("fnp`aZjffnjkh"), C2984t.m8425a(this.f9198a, C2933b.b1655274989200dc("tu]`ljitmVfjbj{nwt")));
                                    if (h.mo19966p(C2933b.b1655274989200dc("moa"))) {
                                        jSONObject.put(C2933b.b1655274989200dc("moa"), C4006n.m13150c());
                                    }
                                    if (h.mo19966p(C2933b.b1655274989200dc("mba"))) {
                                        jSONObject.put(C2933b.b1655274989200dc("mba"), C4006n.m13149b());
                                    }
                                } catch (Exception unused) {
                                }
                                return jSONObject;
                            case 20:
                                continue;
                        }
                    default:
                        if (c2 <= 'N') {
                            continue;
                        }
                }
                c2 = ' ';
                c = 18;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11529c(String str) {
        C2916b c = C3854d.m12660a().mo20705b().mo17762c();
        c.mo17789a(str);
        c.mo17786a(new C2912a() {
            /* renamed from: a */
            public void mo17771a(C2918c cVar, C2913b bVar) {
                C2975l.m8384b(C2931g.g1655274989199dc("cmkfjq&eamnbbj.|erqvgf"), bVar.mo17777d());
            }

            /* renamed from: a */
            public void mo17772a(C2918c cVar, IOException iOException) {
                C2975l.m8384b(C2931g.g1655274989199dc("cmkfjq&eamnbbj.iqx~"), iOException.toString());
            }
        });
    }

    /* renamed from: c */
    private boolean m11530c(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @JProtect
    /* renamed from: d */
    private void m11531d(JSONObject jSONObject) {
        if (C3524h.m10852d().mo19869s()) {
            try {
                jSONObject.getJSONObject(C2807f.f1655274989236dc("hdcgaw")).put(C2807f.f1655274989236dc("ahf"), C2807f.f1655274989236dc("4441"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            JSONObject a = C2958a.m8335a(jSONObject);
            if (m11530c(a)) {
                jSONObject = a;
            }
            Map<String, String> e2 = m11534e(jSONObject);
            C2919d b = C3854d.m12660a().mo20705b().mo17761b();
            b.mo17789a(C4014u.m13248l());
            if (e2 != null) {
                for (Map.Entry next : e2.entrySet()) {
                    try {
                        b.mo17792b((String) next.getKey(), (String) next.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
            b.mo17799c(jSONObject.toString());
            try {
                b.mo17792b(C2807f.f1655274989236dc("Urgq)Dabf}"), C4014u.m13197b());
            } catch (Exception unused2) {
            }
            b.mo17797a((C2912a) new C2912a() {
                /* renamed from: a */
                public void mo17771a(C2918c cVar, C2913b bVar) {
                    if (bVar == null || !bVar.mo17779f()) {
                        C2975l.m8387c(C2927d.d1655274989178dc("NdvBtlOjxe"), C2927d.d1655274989178dc("ooPfwuii{l0+Bhz]ubb|zfs7qj:uiqr"));
                        return;
                    }
                    C2975l.m8380a(C2927d.d1655274989178dc("NdvBtlOjxe"), C2927d.d1655274989178dc("ooPfwuii{l0+"), bVar.mo17777d());
                }

                /* renamed from: a */
                public void mo17772a(C2918c cVar, IOException iOException) {
                    C2975l.m8380a(C2859a.a1655274989226dc("NdvBtlOjxe"), C2859a.a1655274989226dc("ooDbmisum3*"), iOException.getMessage());
                }
            });
        }
    }

    /* renamed from: d */
    private static boolean m11532d() {
        try {
            return new File(C3166i.i1655274989219dc("/r{pp`k(j`d$x")).exists() || new File(C3166i.i1655274989219dc("/r{pp`k(pkce#~{")).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @JProtect
    /* renamed from: e */
    private static String m11533e() {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (C4003m.m13129e()) {
                str = "MHWJ)";
            } else if (C4003m.m13124b()) {
                str = "FM[NA(";
            } else {
                String n = C4003m.m13138n();
                if (C4003m.m13122a(n)) {
                    sb.append(C3166i.i1655274989219dc("ELWJ)"));
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    str = "-";
                }
                sb.append(Build.VERSION.INCREMENTAL);
                return sb.toString();
            }
            sb.append(C3166i.i1655274989219dc(str));
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: e */
    private Map<String, String> m11534e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(C2928e.e1655274989197dc("Cnlwakr*\\pzn"), C2928e.e1655274989197dc("aqromfgsafd$f~aa+1q{ugerl$ooz0&"));
        if (m11530c(jSONObject)) {
            hashMap.put(C2928e.e1655274989197dc("Cnlwakr*Mgidhd`h"), C2928e.e1655274989197dc("uokljZuccVoeobjj"));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static int m11535f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: f */
    private boolean m11536f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            boolean equalsIgnoreCase = jSONObject.optString(C2975l.l1655274989215dc("mdqpebc")).equalsIgnoreCase(C2975l.l1655274989215dc("sta`avu"));
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '8':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return equalsIgnoreCase;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    private String m11537g() {
        String str;
        if (C3985e.m13063c(this.f9198a)) {
            str = "tw";
        } else if (C3985e.m13059b(this.f9198a)) {
            return C2859a.a1655274989226dc("aofqklbXxhn");
        } else {
            str = "aofqklb";
        }
        return C2859a.a1655274989226dc(str);
    }

    @JProtect
    /* renamed from: g */
    private void m11538g(JSONObject jSONObject) {
        try {
            jSONObject.put(C2807f.f1655274989236dc("p`ahebcXfhgn"), C4014u.m13214d());
            jSONObject.put(C2807f.f1655274989236dc("vdppmjhXkfnn"), C4014u.m13220e());
            jSONObject.put(C2807f.f1655274989236dc("vdppmjh"), C4014u.m13226f());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public C2614a mo20070a() {
        if (!C3536e.m10968a()) {
            return null;
        }
        C2916b c = C3854d.m12660a().mo20705b().mo17762c();
        try {
            c.mo17789a(C3217d.m9387a(c, C3578m.m11241h().mo19972v()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2913b a = c.mo17785a();
        if (a == null) {
            return null;
        }
        try {
            if (a.mo17779f()) {
                return C2614a.m6694e(a.mo17777d());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:5|(1:11)|12|13|14|(2:17|15)|64|18|19|20|(1:22)|23|(2:25|(6:29|30|31|66|65|26))|32|33|34|35|36|37|38|(1:45)(1:44)|46|(1:48)(1:49)|(2:(1:57)|58)(1:53)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0147, code lost:
        com.bytedance.sdk.component.utils.C2975l.m8388c(com.bytedance.sdk.component.utils.C2975l.l1655274989215dc("NdvBtlOjxe"), com.bytedance.sdk.component.utils.C2975l.l1655274989215dc("uqnleaCqmg~+i|`b"), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        return new com.bytedance.sdk.openadsdk.p130b.C3166i(false, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, com.bytedance.sdk.component.utils.C2975l.l1655274989215dc("sdpumfcXj|yr"), false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[ADDED_TO_REGION, Catch:{ all -> 0x0146 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.p130b.C3166i mo20071a(java.util.List<com.bytedance.sdk.openadsdk.p130b.C3126a> r8) {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.core.p155i.C3536e.m10968a()     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0009
            r8 = 0
            return r8
        L_0x0009:
            java.lang.String r1 = ""
            int r2 = r8.size()     // Catch:{ all -> 0x0146 }
            if (r2 <= 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r2     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r2 = r2.mo18655b()     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r1 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r1     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r1 = r1.mo18655b()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "aqr\\hjaX}{f"
            java.lang.String r2 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = r1.optString(r2)     // Catch:{ all -> 0x0146 }
        L_0x0037:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            r2.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r8.get(r0)     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r3 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r3     // Catch:{ JSONException -> 0x0091 }
            r7.m11503a((com.bytedance.sdk.openadsdk.p130b.C3126a) r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r3 = "hdcgaw"
            java.lang.String r3 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r3)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r7.m11528c()     // Catch:{ JSONException -> 0x0091 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x0091 }
        L_0x005b:
            boolean r4 = r8.hasNext()     // Catch:{ JSONException -> 0x0091 }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r8.next()     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r4 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r4     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r4.mo18656c()     // Catch:{ JSONException -> 0x0091 }
            r3.put(r4)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x005b
        L_0x006f:
            java.lang.String r8 = "ewgmp"
            java.lang.String r8 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "_fgm[qojm"
            java.lang.String r8 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "lnabhZrnel"
            java.lang.String r8 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x0091:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.C2958a.m8335a((org.json.JSONObject) r2)     // Catch:{ all -> 0x0146 }
            boolean r3 = r7.m11530c((org.json.JSONObject) r8)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x009c
            r8 = r2
        L_0x009c:
            java.util.Map r3 = r7.m11534e(r8)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.i.d r4 = com.bytedance.sdk.openadsdk.p176i.C3854d.m12660a()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.a r4 = r4.mo20705b()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.b.d r4 = r4.mo17761b()     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13236h((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            r4.mo17789a((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0146 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0146 }
        L_0x00bd:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0146 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0146 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00bd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bd }
            r4.mo17792b(r5, r3)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00d9:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0146 }
            r4.mo17799c(r8)     // Catch:{ all -> 0x0146 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r8)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13197b()     // Catch:{ Exception -> 0x00ed }
            r4.mo17792b(r8, r1)     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            com.bytedance.sdk.component.e.b r8 = r4.mo17796a()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0113
            boolean r1 = r8.mo17779f()     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = r8.mo17777d()     // Catch:{ all -> 0x0146 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0146 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0113
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = r8.mo17777d()     // Catch:{ all -> 0x0146 }
            r1.<init>(r3)     // Catch:{ all -> 0x0146 }
            boolean r1 = r7.m11536f(r1)     // Catch:{ all -> 0x0146 }
            goto L_0x0114
        L_0x0113:
            r1 = r0
        L_0x0114:
            java.lang.String r3 = "esplv%sicge|b"
            java.lang.String r3 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r3)     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0121
            int r4 = r8.mo17773a()     // Catch:{ all -> 0x0146 }
            goto L_0x0122
        L_0x0121:
            r4 = r0
        L_0x0122:
            if (r1 != 0) goto L_0x0130
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0130
            java.lang.String r8 = "sdpuaw&tip*ecy.|erqvgf"
            java.lang.String r3 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r8)     // Catch:{ all -> 0x0146 }
            r8 = 1
            goto L_0x013d
        L_0x0130:
            if (r8 == 0) goto L_0x013c
            java.lang.String r5 = r8.mo17775b()     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x013c
            java.lang.String r3 = r8.mo17775b()     // Catch:{ all -> 0x0146 }
        L_0x013c:
            r8 = r0
        L_0x013d:
            r7.m11531d(r2)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.i r2 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x0146 }
            r2.<init>(r1, r4, r3, r8)     // Catch:{ all -> 0x0146 }
            return r2
        L_0x0146:
            r8 = move-exception
            java.lang.String r1 = "NdvBtlOjxe"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r1)
            java.lang.String r2 = "uqnleaCqmg~+i|`b"
            java.lang.String r2 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r2)
            com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r2, r8)
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r1 = 509(0x1fd, float:7.13E-43)
            java.lang.String r2 = "sdpumfcXj|yr"
            java.lang.String r2 = com.bytedance.sdk.component.utils.C2975l.l1655274989215dc(r2)
            r8.<init>(r0, r1, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.mo20071a(java.util.List):com.bytedance.sdk.openadsdk.b.i");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo20072a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "atawmjhXx{chi"
            if (r6 != 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r1 = f9197i     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "cxrkaw"
            java.lang.String r1 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r1)     // Catch:{ Exception -> 0x0045 }
            r2 = -1
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = "mdqpebc"
            java.lang.String r2 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r6.optString(r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r4 = ""
            java.lang.String r3 = r6.optString(r3, r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 3
            if (r1 != r4) goto L_0x002f
            java.lang.String r2 = com.bytedance.sdk.component.utils.C2958a.m8337b(r2)     // Catch:{ Exception -> 0x0045 }
        L_0x002f:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0045 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0045 }
            if (r1 != 0) goto L_0x0045
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.lang.String r0 = com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(r0)     // Catch:{ all -> 0x0046 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0046
        L_0x0045:
            r1 = r6
        L_0x0046:
            boolean r0 = f9197i
            if (r0 == 0) goto L_0x004b
            r6 = r1
        L_0x004b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.mo20072a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo20073a(AdSlot adSlot, C3500o oVar, int i, C3581n.C3582a aVar) {
        final C3401a aVar2 = new C3401a(aVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final AdSlot adSlot2 = adSlot;
            final C3500o oVar2 = oVar;
            final int i2 = i;
            C3568k.m11191c().post(new C2955g(C3166i.i1655274989219dc("gdvB`")) {
                public void run() {
                    C3627o.this.m11525b(adSlot2, oVar2, i2, aVar2);
                }
            });
            return;
        }
        m11525b(adSlot, oVar, i, aVar2);
    }

    /* renamed from: a */
    public void mo20074a(C3498n nVar, List<FilterWord> list) {
        JSONObject b;
        if (C3536e.m10968a() && (b = m11524b(nVar, list)) != null) {
            C2919d b2 = C3854d.m12660a().mo20705b().mo17761b();
            b2.mo17789a(C4014u.m13231g(C2938c.c1655274989199dc("/`rj+db(}gcdb\"jfc}{xqJsa}wn4")));
            b2.mo17799c(C2958a.m8335a(b).toString());
            b2.mo17797a((C2912a) new C2912a() {
                /* renamed from: a */
                public void mo17771a(C2918c cVar, C2913b bVar) {
                }

                /* renamed from: a */
                public void mo17772a(C2918c cVar, IOException iOException) {
                }
            });
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[LOOP:0: B:5:0x0020->B:9:0x0031, LOOP_END] */
    /* renamed from: a */
    public void mo20075a(final java.lang.String r3) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0019
            com.bytedance.sdk.openadsdk.core.o$9 r0 = new com.bytedance.sdk.openadsdk.core.o$9
            java.lang.String r1 = "uqnleaEkaldNdjkyu"
            java.lang.String r1 = com.bytedance.sdk.component.p120e.p124d.C2938c.c1655274989199dc(r1)
            r0.<init>(r1, r3)
            com.bytedance.sdk.component.p125f.C2952e.m8307a((com.bytedance.sdk.component.p125f.C2955g) r0)
            goto L_0x002c
        L_0x0019:
            r2.m11529c((java.lang.String) r3)
        L_0x001c:
            r3 = 74
            r0 = 55
        L_0x0020:
            switch(r3) {
                case 72: goto L_0x001c;
                case 73: goto L_0x0024;
                case 74: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0031
        L_0x0024:
            switch(r0) {
                case 94: goto L_0x002c;
                case 95: goto L_0x002b;
                case 96: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r0) {
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x002c
        L_0x002b:
            return
        L_0x002c:
            r3 = 73
            r0 = 96
            goto L_0x0020
        L_0x0031:
            r3 = 72
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.mo20075a(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo20076a(JSONObject jSONObject, final C3581n.C3583b bVar) {
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                if (!C3536e.m10968a()) {
                                    if (bVar != null) {
                                        bVar.mo18585a(1000, C2859a.a1655274989226dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                                        return;
                                    }
                                    return;
                                } else if (jSONObject != null && bVar != null) {
                                    JSONObject a = C2958a.m8335a(jSONObject);
                                    C2919d b = C3854d.m12660a().mo20705b().mo17761b();
                                    try {
                                        b.mo17789a(C3217d.m9387a(b, C4014u.m13231g(C2859a.a1655274989226dc("/`rj+db(}gcdb\"}k{>`vctdsGosyr1mEVCQ@\n"))));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    b.mo17799c(a.toString());
                                    b.mo17797a((C2912a) new C2912a() {
                                        /* JADX WARNING: Can't wrap try/catch for region: R(8:5|6|(1:8)|9|(3:11|12|13)|14|15|(2:17|18)(2:19|(2:21|22)(2:23|35))) */
                                        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
                                        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ JSONException -> 0x0073 }] */
                                        /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[Catch:{ JSONException -> 0x0073 }] */
                                        /* renamed from: a */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public void mo17771a(com.bytedance.sdk.component.p120e.p122b.C2918c r4, com.bytedance.sdk.component.p120e.C2913b r5) {
                                            /*
                                                r3 = this;
                                                if (r5 == 0) goto L_0x009f
                                                boolean r4 = r5.mo17779f()
                                                if (r4 == 0) goto L_0x007a
                                                java.lang.String r4 = r5.mo17777d()
                                                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                                                boolean r4 = android.text.TextUtils.isEmpty(r4)
                                                if (r4 != 0) goto L_0x007a
                                                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0073 }
                                                java.lang.String r5 = r5.mo17777d()     // Catch:{ JSONException -> 0x0073 }
                                                r4.<init>(r5)     // Catch:{ JSONException -> 0x0073 }
                                                java.lang.String r5 = "cxrkaw"
                                                java.lang.String r5 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r5)     // Catch:{ JSONException -> 0x0073 }
                                                r0 = -1
                                                int r5 = r4.optInt(r5, r0)     // Catch:{ JSONException -> 0x0073 }
                                                java.lang.String r0 = "mdqpebc"
                                                java.lang.String r0 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r0)     // Catch:{ JSONException -> 0x0073 }
                                                java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x0073 }
                                                r1 = 0
                                                r2 = 3
                                                if (r5 != r2) goto L_0x003a
                                                java.lang.String r1 = com.bytedance.sdk.component.utils.C2958a.m8337b(r0)     // Catch:{ JSONException -> 0x0073 }
                                            L_0x003a:
                                                r5 = r1
                                                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ JSONException -> 0x0073 }
                                                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0073 }
                                                if (r5 != 0) goto L_0x0049
                                                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0049 }
                                                r5.<init>(r1)     // Catch:{ all -> 0x0049 }
                                                r4 = r5
                                            L_0x0049:
                                                com.bytedance.sdk.openadsdk.core.o$b r4 = com.bytedance.sdk.openadsdk.core.C3627o.C3638b.m11563a(r4)     // Catch:{ JSONException -> 0x0073 }
                                                int r5 = r4.f9240a     // Catch:{ JSONException -> 0x0073 }
                                                r0 = 20000(0x4e20, float:2.8026E-41)
                                                if (r5 == r0) goto L_0x0061
                                                com.bytedance.sdk.openadsdk.core.n$b r5 = r5     // Catch:{ JSONException -> 0x0073 }
                                                int r0 = r4.f9240a     // Catch:{ JSONException -> 0x0073 }
                                                int r4 = r4.f9240a     // Catch:{ JSONException -> 0x0073 }
                                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3513g.m10825a(r4)     // Catch:{ JSONException -> 0x0073 }
                                                r5.mo18585a(r0, r4)     // Catch:{ JSONException -> 0x0073 }
                                                return
                                            L_0x0061:
                                                com.bytedance.sdk.openadsdk.core.e.s r5 = r4.f9242c     // Catch:{ JSONException -> 0x0073 }
                                                if (r5 != 0) goto L_0x006d
                                                com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C3627o.this     // Catch:{ JSONException -> 0x0073 }
                                                com.bytedance.sdk.openadsdk.core.n$b r5 = r5     // Catch:{ JSONException -> 0x0073 }
                                                r4.m11508a((com.bytedance.sdk.openadsdk.core.C3581n.C3583b) r5)     // Catch:{ JSONException -> 0x0073 }
                                                return
                                            L_0x006d:
                                                com.bytedance.sdk.openadsdk.core.n$b r5 = r5     // Catch:{ JSONException -> 0x0073 }
                                                r5.mo18586a(r4)     // Catch:{ JSONException -> 0x0073 }
                                                goto L_0x00a6
                                            L_0x0073:
                                                r4 = move-exception
                                                org.json.JSONException r4 = (org.json.JSONException) r4
                                                r4.printStackTrace()
                                                goto L_0x009f
                                            L_0x007a:
                                                r4 = -2
                                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3513g.m10825a(r4)
                                                int r0 = r5.mo17773a()
                                                boolean r1 = r5.mo17779f()
                                                if (r1 != 0) goto L_0x0099
                                                java.lang.String r1 = r5.mo17775b()
                                                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                                                boolean r1 = android.text.TextUtils.isEmpty(r1)
                                                if (r1 != 0) goto L_0x0099
                                                java.lang.String r4 = r5.mo17775b()
                                            L_0x0099:
                                                com.bytedance.sdk.openadsdk.core.n$b r5 = r5
                                                r5.mo18585a(r0, r4)
                                                goto L_0x00a6
                                            L_0x009f:
                                                com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C3627o.this
                                                com.bytedance.sdk.openadsdk.core.n$b r5 = r5
                                                r4.m11508a((com.bytedance.sdk.openadsdk.core.C3581n.C3583b) r5)
                                            L_0x00a6:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3627o.C36358.mo17771a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                                        }

                                        /* renamed from: a */
                                        public void mo17772a(C2918c cVar, IOException iOException) {
                                            bVar.mo18585a(-2, iOException.getMessage());
                                        }
                                    });
                                    return;
                                } else {
                                    return;
                                }
                        }
                    case '`':
                        switch (c2) {
                            case '7':
                            case '8':
                            case '9':
                                continue;
                        }
                }
                c = '_';
                c2 = '_';
            }
        }
    }

    /* renamed from: a */
    public void mo20077a(JSONObject jSONObject, String str) {
        m11526b(jSONObject, str);
    }

    /* renamed from: b */
    public C3166i mo20078b(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (!C3536e.m10968a() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        JSONObject a = C2958a.m8335a(jSONObject);
        C2919d b = C3854d.m12660a().mo20705b().mo17761b();
        try {
            b.mo17789a(C4014u.m13231g(C2931g.g1655274989199dc("/`rj+db(}gcdb\"}k{>aguae8zxnxt2")));
            b.mo17799c(a.toString());
            b.mo17792b(C2931g.g1655274989199dc("Urgq)Dabf}"), C4014u.m13197b());
        } catch (Exception unused) {
        }
        C2913b a2 = b.mo17796a();
        String g1655274989199dc = C2931g.g1655274989199dc("esplv%sicge|b");
        boolean z3 = false;
        if (a2 == null) {
            try {
                return new C3166i(false, 0, g1655274989199dc, false);
            } catch (Throwable unused2) {
                i2 = 0;
                z2 = false;
                z = z3;
                i = i2;
                return new C3166i(z2, i, g1655274989199dc, z);
            }
        } else {
            z = true;
            if (!a2.mo17779f() || TextUtils.isEmpty(a2.mo17777d())) {
                z2 = false;
                z = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(a2.mo17777d());
                int optInt = jSONObject2.optInt(C2931g.g1655274989199dc("cnff"), -1);
                g1655274989199dc = jSONObject2.optString(C2931g.g1655274989199dc("d`vb"), "");
                z2 = optInt == 20000;
                if (optInt != 60005) {
                    z = false;
                }
            }
            try {
                i = a2.mo17773a();
                if (!a2.mo17779f()) {
                    g1655274989199dc = a2.mo17775b();
                }
            } catch (Throwable unused3) {
                i2 = 0;
                z3 = z;
                z = z3;
                i = i2;
                return new C3166i(z2, i, g1655274989199dc, z);
            }
            return new C3166i(z2, i, g1655274989199dc, z);
        }
    }
}
