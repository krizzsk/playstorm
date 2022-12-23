package com.bytedance.sdk.openadsdk.multipro.p180a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3913a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.a.b */
/* compiled from: DBMultiProviderImpl */
public class C3915b implements C3913a {

    /* renamed from: b */
    private static final Object f10104b = new Object();

    /* renamed from: a */
    private Context f10105a;

    /* renamed from: a */
    public String mo20805a() {
        return "t_db";
    }

    /* renamed from: b */
    public void mo20807b() {
    }

    /* renamed from: b */
    private boolean m12855b(Uri uri) {
        boolean z = uri == null || TextUtils.isEmpty(uri.getPath());
        if (z) {
            C2975l.m8384b("DBMultiProviderImpl", "==check uri is null==");
        }
        return z;
    }

    /* renamed from: c */
    private Context m12856c() {
        Context context = this.f10105a;
        return context == null ? C3578m.m11231a() : context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor mo20803a(android.net.Uri r14, java.lang.String[] r15, java.lang.String r16, java.lang.String[] r17, java.lang.String r18) {
        /*
            r13 = this;
            java.lang.String r0 = "DBMultiProviderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "query: "
            r1.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r14)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r1 = f10104b
            monitor-enter(r1)
            boolean r0 = r13.m12855b(r14)     // Catch:{ all -> 0x0064 }
            r2 = 0
            if (r0 == 0) goto L_0x0026
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            return r2
        L_0x0026:
            java.lang.String r0 = r14.getPath()     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "/"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0062
            int r3 = r0.length     // Catch:{ all -> 0x0064 }
            r4 = 4
            if (r3 >= r4) goto L_0x0037
            goto L_0x0062
        L_0x0037:
            r3 = 2
            r3 = r0[r3]     // Catch:{ all -> 0x0064 }
            r4 = 3
            r6 = r0[r4]     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "ttopensdk.db"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0060
            android.content.Context r0 = r13.m12856c()     // Catch:{ all -> 0x0064 }
            com.bytedance.sdk.openadsdk.core.e r0 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r0)     // Catch:{ all -> 0x0064 }
            com.bytedance.sdk.openadsdk.core.f$c r5 = r0.mo19471a()     // Catch:{ all -> 0x0064 }
            r10 = 0
            r11 = 0
            r7 = r15
            r8 = r16
            r9 = r17
            r12 = r18
            android.database.Cursor r0 = r5.mo19816a(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            return r0
        L_0x0060:
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            return r2
        L_0x0062:
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            return r2
        L_0x0064:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3915b.mo20803a(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo20806a(android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = "DBMultiProviderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getType: "
            r1.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = f10104b
            monitor-enter(r0)
            boolean r1 = r5.m12855b(r6)     // Catch:{ all -> 0x00bc }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return r2
        L_0x0026:
            java.lang.String r1 = r6.getPath()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "/"
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x00ba
            int r3 = r1.length     // Catch:{ all -> 0x00bc }
            r4 = 5
            if (r3 >= r4) goto L_0x0038
            goto L_0x00ba
        L_0x0038:
            r3 = 2
            r3 = r1[r3]     // Catch:{ all -> 0x00bc }
            r4 = 3
            r4 = r1[r4]     // Catch:{ all -> 0x00bc }
            r4 = 4
            r1 = r1[r4]     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = "ttopensdk.db"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x00b8
            java.lang.String r3 = "execSQL"
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x0071
            java.lang.String r1 = "sql"
            java.lang.String r6 = r6.getQueryParameter(r1)     // Catch:{ all -> 0x00bc }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x00b8
            android.content.Context r1 = r5.m12856c()     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.e r1 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r1)     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.f$c r1 = r1.mo19471a()     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = android.net.Uri.decode(r6)     // Catch:{ all -> 0x00bc }
            r1.mo19818a(r6)     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x0071:
            java.lang.String r6 = "transactionBegin"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x0089
            android.content.Context r6 = r5.m12856c()     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.e r6 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r6)     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.f$c r6 = r6.mo19471a()     // Catch:{ all -> 0x00bc }
            r6.mo19817a()     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x0089:
            java.lang.String r6 = "transactionSetSuccess"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x00a1
            android.content.Context r6 = r5.m12856c()     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.e r6 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r6)     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.f$c r6 = r6.mo19471a()     // Catch:{ all -> 0x00bc }
            r6.mo19819b()     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x00a1:
            java.lang.String r6 = "transactionEnd"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x00b8
            android.content.Context r6 = r5.m12856c()     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.e r6 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r6)     // Catch:{ all -> 0x00bc }
            com.bytedance.sdk.openadsdk.core.f$c r6 = r6.mo19471a()     // Catch:{ all -> 0x00bc }
            r6.mo19820c()     // Catch:{ all -> 0x00bc }
        L_0x00b8:
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return r2
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return r2
        L_0x00bc:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3915b.mo20806a(android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri mo20804a(android.net.Uri r5, android.content.ContentValues r6) {
        /*
            r4 = this;
            java.lang.String r0 = "DBMultiProviderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "insert: "
            r1.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = f10104b
            monitor-enter(r0)
            boolean r1 = r4.m12855b(r5)     // Catch:{ all -> 0x0058 }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0026:
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "/"
            java.lang.String[] r5 = r5.split(r1)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0056
            int r1 = r5.length     // Catch:{ all -> 0x0058 }
            r3 = 4
            if (r1 >= r3) goto L_0x0037
            goto L_0x0056
        L_0x0037:
            r1 = 2
            r1 = r5[r1]     // Catch:{ all -> 0x0058 }
            r3 = 3
            r5 = r5[r3]     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = "ttopensdk.db"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0054
            android.content.Context r1 = r4.m12856c()     // Catch:{ all -> 0x0058 }
            com.bytedance.sdk.openadsdk.core.e r1 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r1)     // Catch:{ all -> 0x0058 }
            com.bytedance.sdk.openadsdk.core.f$c r1 = r1.mo19471a()     // Catch:{ all -> 0x0058 }
            r1.mo19815a((java.lang.String) r5, (java.lang.String) r2, (android.content.ContentValues) r6)     // Catch:{ all -> 0x0058 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0058:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3915b.mo20804a(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20802a(android.net.Uri r5, java.lang.String r6, java.lang.String[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = "DBMultiProviderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "delete: "
            r1.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = f10104b
            monitor-enter(r0)
            boolean r1 = r4.m12855b(r5)     // Catch:{ all -> 0x005b }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x0026:
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "/"
            java.lang.String[] r5 = r5.split(r1)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x0059
            int r1 = r5.length     // Catch:{ all -> 0x005b }
            r3 = 4
            if (r1 >= r3) goto L_0x0037
            goto L_0x0059
        L_0x0037:
            r1 = 2
            r1 = r5[r1]     // Catch:{ all -> 0x005b }
            r3 = 3
            r5 = r5[r3]     // Catch:{ all -> 0x005b }
            java.lang.String r3 = "ttopensdk.db"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0057
            android.content.Context r1 = r4.m12856c()     // Catch:{ all -> 0x005b }
            com.bytedance.sdk.openadsdk.core.e r1 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r1)     // Catch:{ all -> 0x005b }
            com.bytedance.sdk.openadsdk.core.f$c r1 = r1.mo19471a()     // Catch:{ all -> 0x005b }
            int r5 = r1.mo19814a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String[]) r7)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r5
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x005b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3915b.mo20802a(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20801a(android.net.Uri r5, android.content.ContentValues r6, java.lang.String r7, java.lang.String[] r8) {
        /*
            r4 = this;
            java.lang.String r0 = "DBMultiProviderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update: "
            r1.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = f10104b
            monitor-enter(r0)
            boolean r1 = r4.m12855b(r5)     // Catch:{ all -> 0x005b }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x0026:
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "/"
            java.lang.String[] r5 = r5.split(r1)     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x0059
            int r1 = r5.length     // Catch:{ all -> 0x005b }
            r3 = 4
            if (r1 >= r3) goto L_0x0037
            goto L_0x0059
        L_0x0037:
            r1 = 2
            r1 = r5[r1]     // Catch:{ all -> 0x005b }
            r3 = 3
            r5 = r5[r3]     // Catch:{ all -> 0x005b }
            java.lang.String r3 = "ttopensdk.db"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0057
            android.content.Context r1 = r4.m12856c()     // Catch:{ all -> 0x005b }
            com.bytedance.sdk.openadsdk.core.e r1 = com.bytedance.sdk.openadsdk.core.C3468e.m10395a(r1)     // Catch:{ all -> 0x005b }
            com.bytedance.sdk.openadsdk.core.f$c r1 = r1.mo19471a()     // Catch:{ all -> 0x005b }
            int r5 = r1.mo19813a(r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r5
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x005b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.p180a.C3915b.mo20801a(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }
}
