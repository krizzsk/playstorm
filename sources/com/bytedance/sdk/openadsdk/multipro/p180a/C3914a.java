package com.bytedance.sdk.openadsdk.multipro.p180a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.C3969e;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3922a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3928g;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.a.a */
/* compiled from: DBMultiAdapter */
public class C3914a {

    /* renamed from: a */
    public static IListenerManager f10103a;

    /* renamed from: a */
    public static IListenerManager m12850a(Context context) {
        if (context == null) {
            try {
                context = C3578m.m11231a();
            } catch (Throwable unused) {
                C4014u.m13249l("binder error");
            }
        }
        if (f10103a == null) {
            if (C3953b.m12901c()) {
                f10103a = C3922a.asInterface(C3917a.m12866a(context).mo20811a(5));
            } else {
                f10103a = C3928g.m12883a();
            }
        }
        return f10103a;
    }

    /* renamed from: a */
    private static String m12851a() {
        return C3969e.f10187b + "/" + "t_db" + "/" + "ttopensdk.db" + "/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m12854a(android.content.Context r3, java.lang.String r4, android.content.ContentValues r5) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.multipro.a.a> r0 = com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.class
            monitor-enter(r0)
            if (r5 == 0) goto L_0x0031
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x000c
            goto L_0x0031
        L_0x000c:
            com.bytedance.sdk.openadsdk.IListenerManager r3 = m12850a(r3)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x002c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r1.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = m12851a()     // Catch:{ all -> 0x002c }
            r1.append(r2)     // Catch:{ all -> 0x002c }
            r1.append(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x002c }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x002c }
            r3.insert(r4, r5)     // Catch:{ all -> 0x002c }
        L_0x002c:
            monitor-exit(r0)
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0031:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.m12854a(android.content.Context, java.lang.String, android.content.ContentValues):void");
    }

    /* renamed from: a */
    public static synchronized int m12849a(Context context, String str, String str2, String[] strArr) {
        synchronized (C3914a.class) {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                IListenerManager a = m12850a(context);
                if (a != null) {
                    int delete = a.delete(Uri.parse(m12851a() + str), str2, strArr);
                    return delete;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m12848a(android.content.Context r4, java.lang.String r5, android.content.ContentValues r6, java.lang.String r7, java.lang.String[] r8) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.multipro.a.a> r0 = com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.class
            monitor-enter(r0)
            r1 = 0
            if (r6 == 0) goto L_0x0035
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x000d
            goto L_0x0035
        L_0x000d:
            com.bytedance.sdk.openadsdk.IListenerManager r4 = m12850a(r4)     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0030
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r2.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = m12851a()     // Catch:{ all -> 0x0030 }
            r2.append(r3)     // Catch:{ all -> 0x0030 }
            r2.append(r5)     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0030 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0030 }
            int r4 = r4.update(r5, r6, r7, r8)     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)
            return r4
        L_0x0030:
            monitor-exit(r0)
            return r1
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0035:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3914a.m12848a(android.content.Context, java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: a */
    public static synchronized Map<String, List<String>> m12852a(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        synchronized (C3914a.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                IListenerManager a = m12850a(context);
                if (a != null) {
                    Map<String, List<String>> query = a.query(Uri.parse(m12851a() + str), strArr, str2, strArr2, str5);
                    return query;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized void m12853a(Context context, String str) {
        synchronized (C3914a.class) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    IListenerManager a = m12850a(context);
                    if (a != null) {
                        a.getType(Uri.parse(m12851a() + "unknown" + "/" + "execSQL" + "?sql=" + Uri.encode(str)));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
