package com.bytedance.sdk.openadsdk.p130b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2970j;
import com.bytedance.sdk.openadsdk.core.C3455c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.b.s */
/* compiled from: StatsEventRepertoryImpl */
public class C3183s implements C3159f<C3837c.C3840a> {

    /* renamed from: a */
    protected final C3455c f7543a = C3455c.m10351a(mo18806e());

    /* renamed from: b */
    private final Context f7544b;

    /* renamed from: c */
    public String mo18803c() {
        return "logstats";
    }

    public C3183s(Context context) {
        this.f7544b = context;
    }

    /* renamed from: e */
    public Context mo18806e() {
        Context context = this.f7544b;
        return context == null ? C3578m.m11231a() : context;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047 A[Catch:{ all -> 0x0075 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bytedance.sdk.openadsdk.p172h.p175c.C3837c.C3840a> mo18750a(int r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 <= 0) goto L_0x001d
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " DESC limit "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto L_0x001e
        L_0x001d:
            r11 = 0
        L_0x001e:
            r7 = r11
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            com.bytedance.sdk.openadsdk.multipro.aidl.c r12 = new com.bytedance.sdk.openadsdk.multipro.aidl.c
            android.content.Context r0 = r10.mo18806e()
            java.lang.String r1 = r10.mo18803c()
            java.lang.String r8 = "id"
            java.lang.String r9 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r8, r9}
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.m12852a(r0, r1, r2, r3, r4, r5, r6, r7)
            r12.<init>(r0)
        L_0x0041:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0071
            int r0 = r12.getColumnIndex(r8)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x0075 }
            int r1 = r12.getColumnIndex(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r12.getString(r1)     // Catch:{ all -> 0x0075 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0041 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0041 }
            com.bytedance.sdk.openadsdk.h.c.c$a r1 = new com.bytedance.sdk.openadsdk.h.c.c$a     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0041 }
            r11.add(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0041
        L_0x0071:
            r12.close()
            return r11
        L_0x0075:
            r11 = move-exception
            r12.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3183s.mo18750a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public synchronized void mo18753a(C3837c.C3840a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", aVar.f9947a);
        contentValues.put("value", aVar.f9948b.toString());
        contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put(TapjoyConstants.TJC_RETRY, 0);
        C3914a.m12854a(mo18806e(), mo18803c(), contentValues);
    }

    /* renamed from: a */
    public synchronized void mo18754a(List<C3837c.C3840a> list) {
        if (!C2970j.m8370a(list)) {
            LinkedList linkedList = new LinkedList();
            for (C3837c.C3840a aVar : list) {
                linkedList.add(aVar.f9947a);
            }
            C3914a.m12853a(mo18806e(), "DELETE FROM " + mo18803c() + " WHERE " + m9321a("id", linkedList, 1000, true));
        }
    }

    /* renamed from: a */
    public synchronized void mo18752a(int i, long j) {
        m9322b(i, j);
    }

    /* renamed from: b */
    private synchronized void m9322b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context e = mo18806e();
        String c = mo18803c();
        C3914a.m12849a(e, c, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    /* renamed from: a */
    public synchronized void mo18755a(List<C3837c.C3840a> list, int i, long j) {
        if (!C2970j.m8370a(list)) {
            try {
                m9323b(list);
                m9322b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m9323b(List<C3837c.C3840a> list) {
        LinkedList linkedList = new LinkedList();
        for (C3837c.C3840a aVar : list) {
            linkedList.add(aVar.f9947a);
        }
        C3914a.m12853a(mo18806e(), "UPDATE " + mo18803c() + " SET " + TapjoyConstants.TJC_RETRY + " = " + TapjoyConstants.TJC_RETRY + "+1" + " WHERE " + m9321a("id", linkedList, 1000, true));
    }

    /* renamed from: a */
    public void mo18756a(boolean z) {
        this.f7543a.mo19458a("stats_serverbusy_flag", z);
    }

    /* renamed from: a */
    public boolean mo18757a() {
        return this.f7543a.mo19462b("stats_serverbusy_flag", false);
    }

    /* renamed from: b */
    public int mo18758b() {
        return this.f7543a.mo19459b("stats_serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo18751a(int i) {
        this.f7543a.mo19455a("stats_serverbusy_retrycount", i);
    }

    /* renamed from: f */
    public static String m9324f() {
        return "CREATE TABLE IF NOT EXISTS " + "logstats" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }

    /* renamed from: a */
    private static String m9321a(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String a = m9320a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(a);
            sb.append("')");
        }
        String sb2 = sb.toString();
        return m9320a(sb2, str + str2 + "('')");
    }

    /* renamed from: a */
    private static String m9320a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
