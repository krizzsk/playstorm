package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* renamed from: com.fyber.inneractive.sdk.config.s */
public class C4339s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f10739a;

    /* renamed from: b */
    public final /* synthetic */ C4340t f10740b;

    public C4339s(Context context, C4340t tVar) {
        this.f10739a = context;
        this.f10740b = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0040 }
            android.content.Context r1 = r5.f10739a     // Catch:{ ClassNotFoundException -> 0x0040 }
            com.fyber.inneractive.sdk.config.t r2 = r5.f10740b     // Catch:{ ClassNotFoundException -> 0x0040 }
            com.fyber.inneractive.sdk.config.C4341u.m13566a(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0040 }
            java.lang.String r1 = com.fyber.inneractive.sdk.config.C4315k.m13546a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x003f
            android.content.Context r1 = r5.f10739a
            com.fyber.inneractive.sdk.config.t r2 = r5.f10740b
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x003f }
            java.lang.String r3 = "limit_ad_tracking"
            int r3 = android.provider.Settings.Secure.getInt(r1, r3)     // Catch:{ SettingNotFoundException -> 0x003f }
            r4 = 1
            if (r3 == 0) goto L_0x0029
            r0 = r4
        L_0x0029:
            java.lang.String r3 = "advertising_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r3)     // Catch:{ SettingNotFoundException -> 0x003f }
            com.fyber.inneractive.sdk.config.k r2 = (com.fyber.inneractive.sdk.config.C4315k) r2     // Catch:{ SettingNotFoundException -> 0x003f }
            monitor-enter(r2)     // Catch:{ SettingNotFoundException -> 0x003f }
            com.fyber.inneractive.sdk.config.k$c r3 = r2.f10667b     // Catch:{ all -> 0x003c }
            r3.f10669a = r1     // Catch:{ all -> 0x003c }
            r3.f10670b = r0     // Catch:{ all -> 0x003c }
            r3.f10671c = r4     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ SettingNotFoundException -> 0x003f }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SettingNotFoundException -> 0x003f }
            throw r0     // Catch:{ SettingNotFoundException -> 0x003f }
        L_0x003f:
            return
        L_0x0040:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project"
            r2.append(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.util.IAlog.m16700b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.C4339s.run():void");
    }
}
