package com.applovin.impl.sdk.p050e;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.C1873e;
import com.applovin.impl.sdk.C1944j;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2078k;
import com.applovin.impl.sdk.utils.C2084p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.n */
public class C1905n extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f3510a;

    public C1905n(C1959m mVar) {
        super("TaskInitializeSdk", mVar);
        this.f3510a = mVar;
    }

    /* renamed from: a */
    private void m4245a() {
        if (!this.f3510a.mo14289D().mo13593a()) {
            Activity an = this.f3510a.mo14341an();
            if (an != null) {
                this.f3510a.mo14289D().mo13588a(an);
            } else {
                this.f3510a.mo14303S().mo14207a((C1877a) new C1934z(this.f3510a, true, new Runnable() {
                    public void run() {
                        C1905n.this.f3510a.mo14289D().mo13588a(C1905n.this.f3510a.mo14333af().mo13822a());
                    }
                }), C1908o.C1910a.MAIN, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    /* renamed from: b */
    private void m4246b() {
        String str;
        if (!this.f3510a.mo14352e()) {
            boolean d = this.f3510a.mo14296K().mo14069d();
            if (d) {
                str = this.f3510a.mo14306V().mo14609k().f3912b + " (use this for test devices)";
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            Map<String, Object> d2 = this.f3510a.mo14306V().mo14602d();
            Map<String, Object> c = this.f3510a.mo14306V().mo14601c();
            C2078k kVar = new C2078k();
            kVar.mo14712a().mo14718a("=====AppLovin SDK=====");
            kVar.mo14718a("===SDK Versions===").mo14719a("Version", AppLovinSdk.VERSION).mo14719a("Plugin Version", this.f3510a.mo14311a(C1857b.f3279dz)).mo14719a("Ad Review Version", C1873e.m4119a()).mo14719a("OM SDK Version", this.f3510a.mo14339al().mo13863c());
            kVar.mo14718a("===Device Info===").mo14719a("OS", Utils.getAndroidOSInfo()).mo14719a(IronSourceConstants.TYPE_GAID, str).mo14719a(ExifInterface.TAG_MODEL, d2.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)).mo14719a("Locale", d2.get("locale")).mo14719a("Emulator", d2.get("sim")).mo14719a("Tablet", d2.get("is_tablet"));
            kVar.mo14718a("===App Info===").mo14719a("Application ID", c.get(CampaignEx.JSON_KEY_PACKAGE_NAME)).mo14719a("Target SDK", c.get("target_sdk")).mo14719a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
            kVar.mo14718a("===SDK Settings===").mo14719a("SDK Key", this.f3510a.mo14374z()).mo14719a("Mediation Provider", this.f3510a.mo14367t()).mo14719a("TG", C2084p.m5012a(this.f3510a)).mo14719a("Test Mode On", Boolean.valueOf(this.f3510a.mo14295J().mo13583a())).mo14719a("Verbose Logging On", Boolean.valueOf(d));
            kVar.mo14718a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").mo14718a(C1944j.m4362a(mo14149f()));
            kVar.mo14712a();
            C2092v.m5050f("AppLovinSdk", kVar.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014e, code lost:
        if (r12.f3510a.mo14351d() != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ad, code lost:
        if (r12.f3510a.mo14351d() != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b0, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b1, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        mo14142a(r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            boolean r8 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r8 == 0) goto L_0x0031
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Initializing AppLovin SDK v"
            r8.append(r9)
            java.lang.String r9 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r9)
            java.lang.String r9 = "..."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12.mo14142a(r8)
        L_0x0031:
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.d.g r8 = r8.mo14304T()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.p049d.C1871f.f3437b     // Catch:{ all -> 0x0151 }
            r8.mo14134c(r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.q r8 = r8.mo14329ab()     // Catch:{ all -> 0x0151 }
            android.content.Context r9 = r12.mo14149f()     // Catch:{ all -> 0x0151 }
            r8.mo14629a((android.content.Context) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.q r8 = r8.mo14329ab()     // Catch:{ all -> 0x0151 }
            android.content.Context r9 = r12.mo14149f()     // Catch:{ all -> 0x0151 }
            r8.mo14632b((android.content.Context) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.o r8 = r8.mo14303S()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.b r9 = new com.applovin.impl.sdk.e.b     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r10 = r12.f3510a     // Catch:{ all -> 0x0151 }
            r9.<init>(r10)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.e.o$a r10 = com.applovin.impl.sdk.p050e.C1908o.C1910a.MAIN     // Catch:{ all -> 0x0151 }
            r8.mo14206a((com.applovin.impl.sdk.p050e.C1877a) r9, (com.applovin.impl.sdk.p050e.C1908o.C1910a) r10)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.o r8 = r8.mo14306V()     // Catch:{ all -> 0x0151 }
            r8.mo14603e()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.utils.n r8 = r8.mo14335ah()     // Catch:{ all -> 0x0151 }
            r8.mo14745a()     // Catch:{ all -> 0x0151 }
            android.content.Context r8 = r12.mo14149f()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r9 = r12.f3510a     // Catch:{ all -> 0x0151 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x008b
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            r8.mo14355h()     // Catch:{ all -> 0x0151 }
        L_0x008b:
            r12.m4246b()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p048c.C1857b.f3247dT     // Catch:{ all -> 0x0151 }
            java.lang.Object r8 = r8.mo14311a(r9)     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00a6
            com.applovin.impl.sdk.e.n$1 r8 = new com.applovin.impl.sdk.e.n$1     // Catch:{ all -> 0x0151 }
            r8.<init>()     // Catch:{ all -> 0x0151 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r8)     // Catch:{ all -> 0x0151 }
        L_0x00a6:
            r12.m4245a()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            r9 = 1
            r8.mo14325a((boolean) r9)     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.network.f r8 = r8.mo14305U()     // Catch:{ all -> 0x0151 }
            r8.mo14545c()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.sdk.AppLovinEventService r8 = r8.mo14371w()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.EventServiceImpl r8 = (com.applovin.impl.sdk.EventServiceImpl) r8     // Catch:{ all -> 0x0151 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.mediation.debugger.a r8 = r8.mo14292G()     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo13388b()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00d7
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo14352e()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x00fd
        L_0x00d7:
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p048c.C1856a.f3047h     // Catch:{ all -> 0x0151 }
            java.lang.Object r8 = r8.mo14311a(r9)     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            android.content.Context r8 = r8.mo14297L()     // Catch:{ all -> 0x0151 }
            com.applovin.impl.sdk.m r9 = r12.f3510a     // Catch:{ all -> 0x0151 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            boolean r8 = r8.mo14353f()     // Catch:{ all -> 0x0151 }
            if (r8 == 0) goto L_0x0106
        L_0x00fd:
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x0151 }
            com.applovin.impl.mediation.debugger.a r8 = r8.mo14292G()     // Catch:{ all -> 0x0151 }
            r8.mo13384a()     // Catch:{ all -> 0x0151 }
        L_0x0106:
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.a.f r8 = r8.mo14339al()
            r8.mo13861a()
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p048c.C1857b.f3122az
            java.lang.Object r8 = r8.mo14311a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p048c.C1857b.f3071aA
            java.lang.Object r8 = r8.mo14311a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.m r10 = r12.f3510a
            r10.mo14315a((long) r8)
        L_0x0132:
            boolean r8 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r8 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3510a
            boolean r4 = r4.mo14351d()
            if (r4 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x0151:
            r8 = move-exception
            boolean r9 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01ca }
            if (r9 == 0) goto L_0x015f
            java.lang.String r9 = "AppLovinSdk"
            java.lang.String r10 = "Failed to initialize SDK!"
            com.applovin.impl.sdk.C2092v.m5049c(r9, r10, r8)     // Catch:{ all -> 0x01ca }
        L_0x015f:
            com.applovin.impl.sdk.m r8 = r12.f3510a     // Catch:{ all -> 0x01ca }
            r9 = 0
            r8.mo14325a((boolean) r9)     // Catch:{ all -> 0x01ca }
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.a.f r8 = r8.mo14339al()
            r8.mo13861a()
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p048c.C1857b.f3122az
            java.lang.Object r8 = r8.mo14311a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0191
            com.applovin.impl.sdk.m r8 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p048c.C1857b.f3071aA
            java.lang.Object r8 = r8.mo14311a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.m r10 = r12.f3510a
            r10.mo14315a((long) r8)
        L_0x0191:
            boolean r8 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r8 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r8.append(r5)
            r8.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3510a
            boolean r4 = r4.mo14351d()
            if (r4 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r2 = r3
        L_0x01b1:
            r8.append(r2)
            r8.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r12.mo14142a(r0)
        L_0x01c9:
            return
        L_0x01ca:
            r8 = move-exception
            com.applovin.impl.sdk.m r9 = r12.f3510a
            com.applovin.impl.sdk.a.f r9 = r9.mo14339al()
            r9.mo13861a()
            com.applovin.impl.sdk.m r9 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.p048c.C1857b.f3122az
            java.lang.Object r9 = r9.mo14311a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x01f7
            com.applovin.impl.sdk.m r9 = r12.f3510a
            com.applovin.impl.sdk.c.b<java.lang.Long> r10 = com.applovin.impl.sdk.p048c.C1857b.f3071aA
            java.lang.Object r9 = r9.mo14311a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.applovin.impl.sdk.m r11 = r12.f3510a
            r11.mo14315a((long) r9)
        L_0x01f7:
            boolean r9 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r9 == 0) goto L_0x022f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r9.append(r5)
            r9.append(r4)
            com.applovin.impl.sdk.m r4 = r12.f3510a
            boolean r4 = r4.mo14351d()
            if (r4 == 0) goto L_0x0216
            goto L_0x0217
        L_0x0216:
            r2 = r3
        L_0x0217:
            r9.append(r2)
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r9.append(r1)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r12.mo14142a(r0)
        L_0x022f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p050e.C1905n.run():void");
    }
}
