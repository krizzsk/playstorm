package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.C6145fs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hh */
/* compiled from: TelemetryComponent */
public class C6218hh implements C6196gq {

    /* renamed from: a */
    public static AtomicBoolean f15752a = new AtomicBoolean(false);

    /* renamed from: b */
    public static double f15753b = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15754d = C6218hh.class.getSimpleName();

    /* renamed from: h */
    private static final ArrayList<String> f15755h = new ArrayList<>(Arrays.asList(new String[]{"AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure "}));

    /* renamed from: c */
    public C6190gn f15756c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6177gf f15757e;

    /* renamed from: f */
    private C6221hi f15758f;

    /* renamed from: g */
    private String f15759g;

    /* renamed from: com.inmobi.media.hh$a */
    /* compiled from: TelemetryComponent */
    static class C6220a {

        /* renamed from: a */
        static final C6218hh f15763a = new C6218hh((byte) 0);
    }

    /* synthetic */ C6218hh(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6218hh m18506a() {
        return C6220a.f15763a;
    }

    /* renamed from: b */
    public final void mo35425b() {
        f15752a.set(false);
        C6177gf gfVar = (C6177gf) C6145fs.m18321a("telemetry", C6227ho.m18559f(), (C6145fs.C6148c) null);
        this.f15757e = gfVar;
        this.f15759g = gfVar.telemetryUrl;
        if (this.f15758f.mo35361a() > 0) {
            m18511e();
        }
    }

    private C6218hh() {
        this.f15758f = new C6221hi();
        C6177gf gfVar = (C6177gf) C6144fr.m18314a("telemetry", (String) null);
        this.f15757e = gfVar;
        this.f15759g = gfVar.telemetryUrl;
    }

    /* renamed from: a */
    public final void mo35424a(final String str, final Map<String, Object> map) {
        C6227ho.m18543a((Runnable) new Runnable() {
            public final void run() {
                String unused = C6218hh.f15754d;
                try {
                    C6222hj hjVar = new C6222hj(str);
                    if (!map.isEmpty() && str.equals("AssetDownloaded")) {
                        for (Map.Entry entry : map.entrySet()) {
                            if ("assetType".equals(entry.getKey())) {
                                if ("image".equals(entry.getKey()) && !C6218hh.this.f15757e.assetReporting.image) {
                                    String unused2 = C6218hh.f15754d;
                                    return;
                                } else if ("gif".equals(entry.getKey()) && !C6218hh.this.f15757e.assetReporting.gif) {
                                    String unused3 = C6218hh.f15754d;
                                    return;
                                } else if ("video".equals(entry.getKey()) && !C6218hh.this.f15757e.assetReporting.video) {
                                    String unused4 = C6218hh.f15754d;
                                    return;
                                }
                            }
                        }
                    }
                    map.put("eventType", hjVar.f15766b);
                    map.put("eventId", UUID.randomUUID().toString());
                    hjVar.f15768d = map.toString();
                    C6218hh.m18508a(C6218hh.this, hjVar);
                } catch (Exception unused5) {
                    String unused6 = C6218hh.f15754d;
                }
            }
        });
    }

    /* renamed from: a */
    private void m18509a(C6222hj hjVar) {
        if (this.f15757e.base.enabled) {
            int a = (this.f15758f.mo35361a() + 1) - this.f15757e.maxEventsToPersist;
            if (a > 0) {
                C6221hi hiVar = this.f15758f;
                C6215he a2 = C6215he.m18482a();
                List<ContentValues> a3 = a2.mo35407a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(a));
                ArrayList arrayList = new ArrayList();
                for (ContentValues next : a3) {
                    next.getAsString("id");
                    arrayList.add(Integer.valueOf(Integer.parseInt(next.getAsString("id"))));
                }
                hiVar.mo35362a((List<Integer>) arrayList);
                a2.mo35412b();
            }
            C6221hi.m18516a(hjVar);
        }
    }

    /* renamed from: e */
    private void m18511e() {
        if (!f15752a.get()) {
            C6187gk e = this.f15757e.mo35355e();
            e.f15647e = this.f15759g;
            e.f15644b = "default";
            C6190gn gnVar = this.f15756c;
            if (gnVar == null) {
                this.f15756c = new C6190gn(this.f15758f, this, e);
            } else {
                gnVar.mo35371a(e);
            }
            this.f15756c.mo35374a("default", true);
        }
    }

    /* renamed from: c */
    public final C6189gm mo35359c() {
        List<C6222hj> list;
        if (C6251ib.m18647a() != 1) {
            list = C6221hi.m18515a(this.f15757e.networkType.others.maxBatchSize);
        } else {
            list = C6221hi.m18515a(this.f15757e.networkType.wifi.maxBatchSize);
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C6222hj hjVar : list) {
                arrayList.add(Integer.valueOf(hjVar.f15765a));
            }
            String a = m18507a(list);
            if (a != null) {
                return new C6189gm(arrayList, a);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m18507a(List<C6222hj> list) {
        try {
            HashMap hashMap = new HashMap();
            String str = "";
            hashMap.put("im-accid", C6227ho.m18561g() != null ? C6227ho.m18561g() : str);
            if (C6227ho.m18563h() != null) {
                str = C6227ho.m18563h();
            }
            hashMap.put("as-accid", str);
            hashMap.put("version", "4.0.0");
            hashMap.put("mk-version", C6228hp.m18569a());
            hashMap.put("u-appbid", C6249ia.m18645a().f15825a);
            hashMap.put("tp", C6228hp.m18581g());
            if (C6228hp.m18580f() != null) {
                hashMap.put("tp-ver", C6228hp.m18580f());
            }
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C6222hj next : list) {
                if (!next.mo35427a().trim().isEmpty()) {
                    jSONArray.put(new JSONObject(next.mo35427a()));
                }
            }
            jSONObject.put("payload", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18508a(C6218hh hhVar, C6222hj hjVar) {
        if (!hhVar.f15757e.base.enabled) {
            return;
        }
        if (hhVar.f15757e.disableAllGeneralEvents && !hhVar.f15757e.priorityEvents.contains(hjVar.f15766b)) {
            return;
        }
        if (f15755h.contains(hjVar.f15766b) && f15753b < hhVar.f15757e.samplingFactor) {
            return;
        }
        if ("CrashEventOccurred".equals(hjVar.f15766b)) {
            hhVar.m18509a(hjVar);
            return;
        }
        hhVar.m18509a(hjVar);
        hhVar.m18511e();
    }
}
