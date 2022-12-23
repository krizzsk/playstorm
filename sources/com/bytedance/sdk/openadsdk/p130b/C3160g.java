package com.bytedance.sdk.openadsdk.p130b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2970j;
import com.bytedance.sdk.openadsdk.core.C3455c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.b.g */
/* compiled from: AdEventRepertoryImpl */
public class C3160g implements C3159f<C3126a> {

    /* renamed from: a */
    private final Context f7465a;

    /* renamed from: b */
    private final C3455c f7466b = C3455c.m10351a(mo18760c());

    /* renamed from: d */
    public String mo18761d() {
        return "adevent";
    }

    public C3160g(Context context) {
        this.f7465a = context;
    }

    /* renamed from: c */
    public Context mo18760c() {
        Context context = this.f7465a;
        return context == null ? C3578m.m11231a() : context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|26|25|9|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[Catch:{ all -> 0x006e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.p130b.C3126a> mo18750a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            if (r9 <= 0) goto L_0x001e
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0073 }
            if (r1 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r0.<init>()     // Catch:{ all -> 0x0073 }
            r0.append(r10)     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = " DESC limit "
            r0.append(r10)     // Catch:{ all -> 0x0073 }
            r0.append(r9)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0073 }
        L_0x001e:
            r7 = r0
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x0073 }
            r9.<init>()     // Catch:{ all -> 0x0073 }
            com.bytedance.sdk.openadsdk.multipro.aidl.c r10 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x0073 }
            android.content.Context r0 = r8.mo18760c()     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r8.mo18761d()     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "id"
            java.lang.String r3 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x0073 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.m12852a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0073 }
            r10.<init>(r0)     // Catch:{ all -> 0x0073 }
        L_0x0041:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x006e }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0041 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0041 }
            com.bytedance.sdk.openadsdk.b.a r1 = new com.bytedance.sdk.openadsdk.b.a     // Catch:{ JSONException -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ JSONException -> 0x0041 }
            r9.add(r1)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0041
        L_0x0069:
            r10.close()     // Catch:{ all -> 0x0073 }
            monitor-exit(r8)
            return r9
        L_0x006e:
            r9 = move-exception
            r10.close()     // Catch:{ all -> 0x0073 }
            throw r9     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3160g.mo18750a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public synchronized void mo18753a(C3126a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.f7352a);
            contentValues.put("value", aVar.mo18655b().toString());
            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(TapjoyConstants.TJC_RETRY, 0);
            C3914a.m12854a(mo18760c(), mo18761d(), contentValues);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo18754a(List<C3126a> list) {
        if (!C2970j.m8370a(list)) {
            LinkedList linkedList = new LinkedList();
            for (C3126a aVar : list) {
                linkedList.add(aVar.f7352a);
            }
            C3914a.m12853a(mo18760c(), "DELETE FROM " + mo18761d() + " WHERE " + m9214a("id", linkedList, 1000, true));
        }
    }

    /* renamed from: a */
    public synchronized void mo18752a(int i, long j) {
        m9215b(i, j);
    }

    /* renamed from: b */
    private synchronized void m9215b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context c = mo18760c();
        String d = mo18761d();
        C3914a.m12849a(c, d, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    /* renamed from: a */
    public synchronized void mo18755a(List<C3126a> list, int i, long j) {
        if (!C2970j.m8370a(list)) {
            try {
                m9216b(list);
                m9215b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m9216b(List<C3126a> list) {
        LinkedList linkedList = new LinkedList();
        for (C3126a aVar : list) {
            linkedList.add(aVar.f7352a);
        }
        C3914a.m12853a(mo18760c(), "UPDATE " + mo18761d() + " SET " + TapjoyConstants.TJC_RETRY + " = " + TapjoyConstants.TJC_RETRY + "+1" + " WHERE " + m9214a("id", linkedList, 1000, true));
    }

    /* renamed from: a */
    public void mo18756a(boolean z) {
        this.f7466b.mo19458a("serverbusy_flag", z);
    }

    /* renamed from: a */
    public boolean mo18757a() {
        return this.f7466b.mo19462b("serverbusy_flag", false);
    }

    /* renamed from: b */
    public int mo18758b() {
        return this.f7466b.mo19459b("serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo18751a(int i) {
        this.f7466b.mo19455a("serverbusy_retrycount", i);
    }

    /* renamed from: e */
    public static String m9217e() {
        return "CREATE TABLE IF NOT EXISTS " + "adevent" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }

    /* renamed from: a */
    private static String m9214a(String str, List<?> list, int i, boolean z) {
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
            String a = m9213a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
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
        return m9213a(sb2, str + str2 + "('')");
    }

    /* renamed from: a */
    private static String m9213a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
