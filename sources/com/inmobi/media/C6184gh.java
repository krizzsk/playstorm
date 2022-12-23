package com.inmobi.media;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.gh */
/* compiled from: CrashDao */
public class C6184gh extends C6188gl {

    /* renamed from: a */
    private static final String f15633a = C6184gh.class.getSimpleName();

    public C6184gh() {
        C6215he a = C6215he.m18482a();
        a.mo35409a(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
        a.mo35412b();
    }

    /* renamed from: a */
    public static void m18407a(C6185gi giVar) {
        C6215he a = C6215he.m18482a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", giVar.f15636b);
        contentValues.put("componentType", giVar.f15638d);
        contentValues.put("eventType", giVar.f15637c);
        contentValues.put("payload", giVar.mo35368a());
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(giVar.f15639e));
        a.mo35406a(AppMeasurement.CRASH_ORIGIN, contentValues);
        a.mo35412b();
    }

    /* renamed from: a */
    public static List<C6185gi> m18406a(int i) {
        C6215he a = C6215he.m18482a();
        List<ContentValues> a2 = a.mo35407a(AppMeasurement.CRASH_ORIGIN, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        a.mo35412b();
        for (ContentValues a3 : a2) {
            arrayList.add(C6185gi.m18416a(a3));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo35363a(long j) {
        List<C6185gi> a = m18406a(1);
        if (a.size() <= 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - a.get(0).f15639e) <= j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo35364a(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
        List<C6185gi> a = m18406a(1);
        if (a.size() <= 0 || seconds - TimeUnit.MILLISECONDS.toSeconds(a.get(0).f15639e) < j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo35361a() {
        C6215he a = C6215he.m18482a();
        int a2 = a.mo35404a(AppMeasurement.CRASH_ORIGIN);
        a.mo35412b();
        return a2;
    }

    /* renamed from: b */
    public final void mo35365b(long j) {
        C6215he a = C6215he.m18482a();
        a.mo35405a(AppMeasurement.CRASH_ORIGIN, "ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (j * 1000))});
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
            a.mo35405a(AppMeasurement.CRASH_ORIGIN, "id IN (" + sb + ")", (String[]) null);
            a.mo35412b();
        }
    }

    /* renamed from: b */
    public static void m18408b() {
        C6215he a = C6215he.m18482a();
        List<ContentValues> a2 = a.mo35407a(AppMeasurement.CRASH_ORIGIN, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC", "1");
        if (!a2.isEmpty()) {
            String asString = a2.get(0).getAsString("id");
            a.mo35405a(AppMeasurement.CRASH_ORIGIN, "id IN (" + asString + ")", (String[]) null);
        }
        a.mo35412b();
    }

    /* renamed from: c */
    public final void mo35367c(long j) {
        Context c = C6227ho.m18551c();
        if (c != null) {
            C6216hf.m18493a(c, "batch_processing_info").mo35415a("crash_last_batch_process", j);
        }
    }

    /* renamed from: c */
    public final long mo35366c() {
        Context c = C6227ho.m18551c();
        if (c != null) {
            return C6216hf.m18493a(c, "batch_processing_info").mo35418b("crash_last_batch_process", -1);
        }
        return -1;
    }
}
