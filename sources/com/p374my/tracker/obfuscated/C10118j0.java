package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.j0 */
public final class C10118j0 {

    /* renamed from: a */
    final C10126m f25225a;

    /* renamed from: b */
    final C10178v0 f25226b;

    /* renamed from: c */
    final Context f25227c;

    /* renamed from: com.my.tracker.obfuscated.j0$a */
    public static final class C10119a {

        /* renamed from: a */
        public final int f25228a;

        /* renamed from: b */
        public final String f25229b;

        /* renamed from: c */
        public final String f25230c;

        C10119a(int i, String str, String str2) {
            this.f25228a = i;
            this.f25229b = str;
            this.f25230c = str2;
        }
    }

    C10118j0(C10126m mVar, C10178v0 v0Var, Context context) {
        this.f25225a = mVar;
        this.f25226b = v0Var;
        this.f25227c = context.getApplicationContext();
    }

    /* renamed from: a */
    static C10119a m30095a(int i, String str, String str2) {
        try {
            C10175u0.m30440a("PreInstallHandler: converting raw data to json");
            return new C10119a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            C10175u0.m30445b("PreInstallHandler error: exception when converting raw data to json with pid", th);
            C10175u0.m30440a("PreInstallHandler: nothing has been found for source: " + i);
            return null;
        }
    }

    /* renamed from: a */
    public static C10118j0 m30096a(C10126m mVar, C10178v0 v0Var, Context context) {
        return new C10118j0(mVar, v0Var, context);
    }

    /* renamed from: a */
    static String m30097a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* renamed from: a */
    public C10119a mo66173a() {
        if (!this.f25226b.mo66430q()) {
            C10175u0.m30440a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        C10119a b = mo66176b();
        if (b != null) {
            return b;
        }
        C10119a a = mo66174a(1);
        if (a != null) {
            return a;
        }
        if (this.f25226b.mo66431r()) {
            return mo66174a(2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10119a mo66174a(int i) {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        if (i == 1) {
            str2 = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str2 = "ro.appsflyer.preinstall.path";
        } else {
            str = "PreInstallHandler: wrong property property key";
            C10175u0.m30440a(str);
            return null;
        }
        String a = C10169s0.m30423a(str2);
        if (TextUtils.isEmpty(a)) {
            sb = new StringBuilder();
            str3 = "PreInstallHandler: empty path for source: ";
        } else {
            String a2 = mo66175a(a);
            if (TextUtils.isEmpty(a2)) {
                sb = new StringBuilder();
                str3 = "PreInstallHandler: empty data for source: ";
            } else {
                C10175u0.m30440a("PreInstallHandler: raw data for source has been found: " + a2);
                return m30095a(i, a2, a);
            }
        }
        sb.append(str3);
        sb.append(i);
        str = sb.toString();
        C10175u0.m30440a(str);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r3 != null) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo66175a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r1.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "PreInstallHandler: searching string in file "
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            r1.append(r8)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r1)     // Catch:{ all -> 0x0074 }
            android.content.Context r1 = r7.f25227c     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r2.<init>()     // Catch:{ all -> 0x0074 }
            r2.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "="
            r2.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0074 }
            int r2 = r1.length()     // Catch:{ all -> 0x0074 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0074 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0074 }
            r4.<init>(r8)     // Catch:{ all -> 0x0074 }
            r3.<init>(r4)     // Catch:{ all -> 0x0074 }
        L_0x003a:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "PreInstallHandler: processing string "
            r5.append(r6)     // Catch:{ all -> 0x0072 }
            r5.append(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            boolean r5 = r4.startsWith(r1)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x003a
            int r5 = r4.length()     // Catch:{ all -> 0x0072 }
            if (r5 <= r2) goto L_0x003a
            java.lang.String r4 = r4.substring(r2)     // Catch:{ all -> 0x0072 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0072 }
            if (r5 != 0) goto L_0x003a
            r3.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            return r4
        L_0x006e:
            r3.close()     // Catch:{ all -> 0x008d }
            goto L_0x008d
        L_0x0072:
            r1 = move-exception
            goto L_0x0076
        L_0x0074:
            r1 = move-exception
            r3 = r0
        L_0x0076:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "PreInstallHandler error: exception while retrieving data in file"
            r2.append(r4)     // Catch:{ all -> 0x008e }
            r2.append(r8)     // Catch:{ all -> 0x008e }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x008e }
            com.p374my.tracker.obfuscated.C10175u0.m30445b(r8, r1)     // Catch:{ all -> 0x008e }
            if (r3 == 0) goto L_0x008d
            goto L_0x006e
        L_0x008d:
            return r0
        L_0x008e:
            r8 = move-exception
            if (r3 == 0) goto L_0x0094
            r3.close()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10118j0.mo66175a(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10119a mo66176b() {
        String format = String.format("ro.mtpi.%s", new Object[]{this.f25226b.mo66418f()});
        String a = C10169s0.m30423a(format);
        if (TextUtils.isEmpty(a)) {
            C10175u0.m30440a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        C10175u0.m30440a("PreInstallHandler: raw data in SystemProperties has been found: " + a);
        return m30095a(3, a, format);
    }

    @Deprecated
    /* renamed from: c */
    public void mo66177c() {
        String l = this.f25226b.mo66425l();
        if (!TextUtils.isEmpty(l)) {
            C10121k0 a = C10121k0.m30104a(this.f25227c);
            if (!a.mo66212o()) {
                C10175u0.m30440a("PreInstallHandler: checking preinstall");
                PackageManager packageManager = this.f25227c.getPackageManager();
                try {
                    String a2 = m30097a(packageManager.getResourcesForApplication(l), this.f25227c.getPackageName(), l);
                    a.mo66215r();
                    if (TextUtils.isEmpty(a2)) {
                        C10175u0.m30440a("PreInstallHandler: referrer is empty");
                        return;
                    }
                    C10175u0.m30440a("PreInstallHandler: referrer " + a2);
                    this.f25225a.mo66239a(a2, C10112h.m30079b(this.f25227c), (Runnable) null);
                    C10121k0.m30104a(this.f25227c).mo66216s();
                } catch (Throwable unused) {
                    C10175u0.m30440a("PreInstallHandler: unable to locate vendor app " + l);
                }
            }
        }
    }
}
