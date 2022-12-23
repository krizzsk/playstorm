package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.hi */
/* compiled from: TelemetryDao */
public class C6221hi extends C6188gl {

    /* renamed from: a */
    private static final String f15764a = C6221hi.class.getSimpleName();

    public C6221hi() {
        C6215he a = C6215he.m18482a();
        a.mo35409a("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo35412b();
    }

    /* renamed from: a */
    public static void m18516a(C6222hj hjVar) {
        C6215he a = C6215he.m18482a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", hjVar.f15766b);
        contentValues.put("payload", hjVar.mo35427a());
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(hjVar.f15767c));
        a.mo35406a("telemetry", contentValues);
        a.mo35412b();
    }

    /* renamed from: a */
    public static List<C6222hj> m18515a(int i) {
        C6215he a = C6215he.m18482a();
        List<ContentValues> a2 = a.mo35407a("telemetry", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo35412b();
        for (ContentValues a3 : a2) {
            arrayList.add(C6222hj.m18524a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo35363a(long j) {
        List<C6222hj> a = m18515a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f15767c) < j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo35364a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C6222hj> a = m18515a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f15767c) <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo35361a() {
        C6215he a = C6215he.m18482a();
        int a2 = a.mo35404a("telemetry");
        a.mo35412b();
        return a2;
    }

    /* renamed from: b */
    public final void mo35365b(long j) {
        C6215he a = C6215he.m18482a();
        a.mo35405a("telemetry", "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
        a.mo35412b();
    }

    /* renamed from: a */
    public final void mo35362a(List<Integer> list) {
        if (!list.isEmpty()) {
            C6215he a = C6215he.m18482a();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i));
                sb.append(",");
            }
            sb.append(String.valueOf(list.get(list.size() - 1)));
            a.mo35405a("telemetry", "id IN (" + sb + ")", (String[]) null);
            a.mo35412b();
        }
    }

    /* renamed from: c */
    public final void mo35367c(long j) {
        Context c = C6227ho.m18551c();
        if (c != null) {
            C6216hf.m18493a(c, "batch_processing_info").mo35415a("telemetry_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo35366c() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return -1;
        }
        return C6216hf.m18493a(c, "batch_processing_info").mo35418b("telemetry_last_batch_process", -1);
    }
}
