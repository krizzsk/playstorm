package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.C6145fs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gg */
/* compiled from: CrashComponent */
public class C6181gg implements C6145fs.C6148c, C6196gq {

    /* renamed from: a */
    public static AtomicBoolean f15624a = new AtomicBoolean(false);

    /* renamed from: e */
    private static final String f15625e = C6181gg.class.getSimpleName();

    /* renamed from: b */
    public C6162ga f15626b;

    /* renamed from: c */
    public C6184gh f15627c;

    /* renamed from: d */
    public String f15628d;

    /* renamed from: f */
    private C6190gn f15629f;

    /* renamed from: com.inmobi.media.gg$a */
    /* compiled from: CrashComponent */
    static class C6183a {

        /* renamed from: a */
        static final C6181gg f15632a = new C6181gg((byte) 0);
    }

    /* synthetic */ C6181gg(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6181gg m18398a() {
        return C6183a.f15632a;
    }

    private C6181gg() {
        Thread.setDefaultUncaughtExceptionHandler(new C6186gj(Thread.getDefaultUncaughtExceptionHandler()));
        this.f15627c = new C6184gh();
        this.f15626b = (C6162ga) C6144fr.m18314a("crashReporting", (String) null);
    }

    /* renamed from: a */
    public void mo34481a(C6144fr frVar) {
        C6162ga gaVar = (C6162ga) frVar;
        this.f15626b = gaVar;
        this.f15628d = gaVar.url;
    }

    /* renamed from: a */
    public final void mo35357a(final C6217hg hgVar) {
        if (this.f15626b.catchEnabled) {
            C6227ho.m18543a((Runnable) new Runnable() {
                public final void run() {
                    C6181gg.this.mo35356a((C6185gi) hgVar);
                    C6181gg.this.mo35358b();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo35356a(C6185gi giVar) {
        if (!(giVar instanceof C6217hg)) {
            if (this.f15626b.crashEnabled) {
                C6218hh.m18506a().mo35424a("CrashEventOccurred", (Map<String, Object>) new HashMap());
            } else {
                return;
            }
        }
        this.f15627c.mo35365b(this.f15626b.eventTTL);
        if ((this.f15627c.mo35361a() + 1) - this.f15626b.maxEventsToPersist >= 0) {
            C6184gh.m18408b();
        }
        C6184gh.m18407a(giVar);
    }

    /* renamed from: b */
    public final void mo35358b() {
        if (!f15624a.get()) {
            C6162ga gaVar = this.f15626b;
            int i = gaVar.maxRetryCount;
            long j = gaVar.eventTTL;
            long j2 = gaVar.processingInterval;
            long j3 = gaVar.txLatency;
            int i2 = gaVar.networkType.wifi.minBatchSize;
            int i3 = gaVar.networkType.wifi.maxBatchSize;
            int i4 = gaVar.networkType.others.minBatchSize;
            int i5 = gaVar.networkType.others.maxBatchSize;
            int i6 = i4;
            long j4 = gaVar.networkType.wifi.retryInterval;
            long j5 = gaVar.networkType.others.retryInterval;
            C6187gk gkVar = r2;
            C6187gk gkVar2 = new C6187gk(i, j, j2, j3, i2, i3, i6, i5, j4, j5);
            gkVar.f15647e = this.f15628d;
            gkVar.f15644b = "default";
            C6190gn gnVar = this.f15629f;
            if (gnVar == null) {
                this.f15629f = new C6190gn(this.f15627c, this, gkVar);
            } else {
                gnVar.mo35371a(gkVar);
            }
            this.f15629f.mo35374a("default", false);
        }
    }

    /* renamed from: c */
    public final C6189gm mo35359c() {
        int i;
        if (C6251ib.m18647a() != 1) {
            i = this.f15626b.networkType.others.maxBatchSize;
        } else {
            i = this.f15626b.networkType.wifi.maxBatchSize;
        }
        List<C6185gi> a = C6184gh.m18406a(i);
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C6185gi giVar : a) {
                arrayList.add(Integer.valueOf(giVar.f15635a));
            }
            String a2 = m18399a(a);
            if (a2 != null) {
                return new C6189gm(arrayList, a2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m18399a(List<C6185gi> list) {
        try {
            HashMap hashMap = new HashMap(C6251ib.m18650a(false));
            hashMap.put("im-accid", C6227ho.m18559f());
            hashMap.put("version", "2.0.0");
            hashMap.put("component", AppMeasurement.CRASH_ORIGIN);
            hashMap.put("mk-version", C6228hp.m18569a());
            hashMap.putAll(C6249ia.m18645a().f15827c);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C6185gi next : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", next.f15636b);
                jSONObject2.put("eventType", next.f15637c);
                if (!next.mo35368a().trim().isEmpty()) {
                    jSONObject2.put("crash_report", next.mo35368a());
                }
                jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, next.f15639e);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
