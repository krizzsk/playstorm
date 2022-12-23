package com.inmobi.media;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jk */
/* compiled from: InMobiUnifiedIdKeyStoreInterface */
public final class C6309jk {

    /* renamed from: a */
    private static final Object f15960a = new Object();

    /* renamed from: b */
    private static final Object f15961b = new Object();

    /* renamed from: c */
    private static boolean f15962c = false;

    /* renamed from: d */
    private static boolean f15963d = false;

    /* renamed from: e */
    private static JSONObject f15964e = null;

    /* renamed from: f */
    private static JSONObject f15965f = null;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18862a() {
        /*
            java.lang.Object r0 = f15960a
            monitor-enter(r0)
            boolean r1 = f15962c     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x000b
            org.json.JSONObject r1 = f15964e     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x000b:
            r1 = 1
            f15962c = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "unified_id_info_store"
            com.inmobi.media.hf r1 = com.inmobi.media.C6216hf.m18493a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "ufids"
            java.lang.String r1 = r1.mo35419b(r2)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0023
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x0023:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x002a }
            f15964e = r2     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            org.json.JSONObject r1 = f15964e     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6309jk.m18862a():org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m18863a(JSONObject jSONObject) {
        synchronized (f15960a) {
            f15964e = jSONObject;
            f15962c = true;
            Context c = C6227ho.m18551c();
            if (c != null) {
                if (f15964e == null) {
                    C6216hf.m18493a(c, "unified_id_info_store").mo35423e("ufids");
                } else {
                    C6216hf.m18493a(c, "unified_id_info_store").mo35416a("ufids", f15964e.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m18865b(JSONObject jSONObject) {
        synchronized (C6309jk.class) {
            synchronized (f15961b) {
                f15965f = jSONObject;
                f15963d = true;
                Context c = C6227ho.m18551c();
                if (c != null) {
                    if (f15965f == null) {
                        C6216hf.m18493a(c, "unified_id_info_store").mo35423e("publisher_provided_unified_id");
                    } else {
                        C6216hf.m18493a(c, "unified_id_info_store").mo35416a("publisher_provided_unified_id", f15965f.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18864b() {
        /*
            java.lang.Object r0 = f15961b
            monitor-enter(r0)
            boolean r1 = f15963d     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x000b
            org.json.JSONObject r1 = f15965f     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x000b:
            r1 = 1
            f15963d = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.inmobi.media.C6227ho.m18551c()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "unified_id_info_store"
            com.inmobi.media.hf r1 = com.inmobi.media.C6216hf.m18493a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "publisher_provided_unified_id"
            java.lang.String r1 = r1.mo35419b(r2)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0023
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x0023:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x002a }
            f15965f = r2     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            org.json.JSONObject r1 = f15965f     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6309jk.m18864b():org.json.JSONObject");
    }

    /* renamed from: c */
    public static void m18866c() {
        m18862a();
        m18864b();
    }

    /* renamed from: d */
    public static void m18867d() {
        f15963d = false;
        f15962c = false;
        m18863a((JSONObject) null);
        m18865b((JSONObject) null);
    }
}
