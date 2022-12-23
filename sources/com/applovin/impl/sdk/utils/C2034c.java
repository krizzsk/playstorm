package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.C2012o;
import com.applovin.impl.sdk.C2092v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.applovin.impl.sdk.utils.c */
public class C2034c {

    /* renamed from: a */
    private static boolean f3951a = true;

    /* renamed from: b */
    private static final Object f3952b = new Object();

    /* renamed from: c */
    private static final Collection<CountDownLatch> f3953c = new HashSet();

    /* renamed from: d */
    private static boolean f3954d = false;

    /* renamed from: e */
    private static C2012o.C2018a f3955e = null;

    /* renamed from: a */
    public static C2012o.C2018a m4865a(Context context) {
        return m4867b(context);
    }

    /* renamed from: a */
    public static boolean m4866a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5 = m4868c(r5);
        r0 = f3952b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        f3954d = true;
        f3955e = r5;
        r5 = new java.util.HashSet(f3953c);
        f3953c.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r5.hasNext() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        ((java.util.concurrent.CountDownLatch) r5.next()).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2.await(60, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (com.applovin.impl.sdk.C2092v.m5047a() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        com.applovin.impl.sdk.C2092v.m5053i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (com.applovin.impl.sdk.C2092v.m5047a() != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        com.applovin.impl.sdk.C2092v.m5049c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        r5 = f3952b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0 = f3955e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.sdk.C2012o.C2018a m4867b(android.content.Context r5) {
        /*
            java.lang.Object r0 = f3952b
            monitor-enter(r0)
            boolean r1 = f3954d     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x000b
            com.applovin.impl.sdk.o$a r5 = f3955e     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r5
        L_0x000b:
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3953c     // Catch:{ all -> 0x007e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x007e }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x007e }
            r3 = 1
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            java.util.Collection<java.util.concurrent.CountDownLatch> r4 = f3953c     // Catch:{ all -> 0x007e }
            r4.add(r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x004e
            com.applovin.impl.sdk.o$a r5 = m4868c(r5)
            java.lang.Object r0 = f3952b
            monitor-enter(r0)
            f3954d = r3     // Catch:{ all -> 0x004b }
            f3955e = r5     // Catch:{ all -> 0x004b }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3953c     // Catch:{ all -> 0x004b }
            r5.<init>(r1)     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f3953c     // Catch:{ all -> 0x004b }
            r1.clear()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            java.util.Iterator r5 = r5.iterator()
        L_0x003b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r5.next()
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x003b
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r5
        L_0x004e:
            r0 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0066 }
            boolean r5 = r2.await(r0, r5)     // Catch:{ InterruptedException -> 0x0066 }
            if (r5 != 0) goto L_0x0074
            boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ InterruptedException -> 0x0066 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "DataCollector"
            java.lang.String r0 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout"
            com.applovin.impl.sdk.C2092v.m5053i(r5, r0)     // Catch:{ InterruptedException -> 0x0066 }
            goto L_0x0074
        L_0x0066:
            r5 = move-exception
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "DataCollector"
            java.lang.String r1 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }"
            com.applovin.impl.sdk.C2092v.m5049c(r0, r1, r5)
        L_0x0074:
            java.lang.Object r5 = f3952b
            monitor-enter(r5)
            com.applovin.impl.sdk.o$a r0 = f3955e     // Catch:{ all -> 0x007b }
            monitor-exit(r5)     // Catch:{ all -> 0x007b }
            return r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007b }
            throw r0
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2034c.m4867b(android.content.Context):com.applovin.impl.sdk.o$a");
    }

    /* renamed from: c */
    private static C2012o.C2018a m4868c(Context context) {
        C2012o.C2018a d = m4869d(context);
        if (d == null) {
            d = m4870e(context);
        }
        return d == null ? new C2012o.C2018a() : d;
    }

    /* renamed from: d */
    private static C2012o.C2018a m4869d(Context context) {
        if (m4866a()) {
            try {
                C2012o.C2018a aVar = new C2012o.C2018a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                aVar.f3911a = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.f3912b = advertisingIdInfo.getId();
                return aVar;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context) || !C2092v.m5047a()) {
                    return null;
                }
                C2092v.m5049c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        } else if (AppLovinSdkUtils.isFireOS(context) || !C2092v.m5047a()) {
            return null;
        } else {
            C2092v.m5053i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
    }

    /* renamed from: e */
    private static C2012o.C2018a m4870e(Context context) {
        String str;
        if (f3951a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                C2012o.C2018a aVar = new C2012o.C2018a();
                aVar.f3912b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID));
                aVar.f3911a = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                return aVar;
            } catch (Settings.SettingNotFoundException e) {
                th = e;
                if (C2092v.m5047a()) {
                    str = "Unable to determine if Fire OS limited ad tracking is turned on";
                    C2092v.m5049c("DataCollector", str, th);
                }
            } catch (Throwable th) {
                th = th;
                if (C2092v.m5047a()) {
                    str = "Unable to collect Fire OS IDFA";
                    C2092v.m5049c("DataCollector", str, th);
                }
            }
        }
        f3951a = false;
        return null;
    }
}
