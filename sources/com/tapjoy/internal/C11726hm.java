package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.shared.APSAnalytics;
import com.tapjoy.TapjoyConnectFlag;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.C11588ew;
import com.tapjoy.internal.C11606fc;
import com.tapjoy.internal.C11618fg;
import com.tapjoy.internal.C11627fj;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.tapjoy.internal.hm */
public final class C11726hm {

    /* renamed from: a */
    public static final String f28521a = UUID.randomUUID().toString();

    /* renamed from: d */
    private static C11726hm f28522d;

    /* renamed from: b */
    final C11627fj.C11628a f28523b = new C11627fj.C11628a();

    /* renamed from: c */
    final C11737ht f28524c;

    /* renamed from: e */
    private final C11606fc.C11607a f28525e = new C11606fc.C11607a();

    /* renamed from: f */
    private final C11588ew.C11589a f28526f = new C11588ew.C11589a();

    /* renamed from: g */
    private final Context f28527g;

    /* renamed from: a */
    public static synchronized C11726hm m34053a(Context context) {
        C11726hm hmVar;
        synchronized (C11726hm.class) {
            if (f28522d == null) {
                f28522d = new C11726hm(context, C11737ht.m34105a(context));
            }
            hmVar = f28522d;
        }
        return hmVar;
    }

    private C11726hm(Context context, C11737ht htVar) {
        C11745hx.m34124a();
        this.f28525e.f28151p = "12.10.0/Android";
        this.f28525e.f28142g = APSAnalytics.OS_NAME;
        this.f28525e.f28143h = Build.VERSION.RELEASE;
        this.f28525e.f28140e = Build.MANUFACTURER;
        this.f28525e.f28141f = Build.MODEL;
        this.f28525e.f28147l = Locale.getDefault().toString();
        this.f28525e.f28148m = TimeZone.getDefault().getID();
        Context applicationContext = context.getApplicationContext();
        this.f28527g = applicationContext;
        C11606fc.C11607a aVar = this.f28525e;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        File file = new File(C11714hj.m34004c(applicationContext), "deviceid");
        String string = sharedPreferences.getString(TapjoyConstants.PREF_ANALYTICS_ID, (String) null);
        if (TextUtils.isEmpty(string)) {
            String b = file.exists() ? C11690gs.m33927b(C11442ba.m33241a(file)) : null;
            string = b == null ? UUID.randomUUID().toString() : b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(TapjoyConstants.PREF_ANALYTICS_ID, string);
            edit.apply();
        }
        aVar.f28139d = string;
        if (!C11662gd.m33848b().mo72577a(TapjoyConnectFlag.DISABLE_ANDROID_ID_AS_ANALYTICS_ID, true)) {
            C11606fc.C11607a aVar2 = this.f28525e;
            String string2 = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
            aVar2.f28155t = !"9774d56d682e549c".equals(string2) ? C11690gs.m33927b(string2) : null;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(simCountryIso)) {
                this.f28525e.f28152q = simCountryIso.toUpperCase(Locale.US);
            }
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                this.f28525e.f28153r = networkCountryIso.toUpperCase(Locale.US);
            }
        }
        String packageName = applicationContext.getPackageName();
        this.f28525e.f28149n = packageName;
        C11606fc.C11607a aVar3 = this.f28525e;
        Signature[] e = C11847y.m34422e(packageManager, packageName);
        aVar3.f28150o = C11690gs.m33926a((e == null || e.length <= 0) ? null : Base64.encodeToString(C11478cb.m33382a(e[0].toByteArray()), 2));
        this.f28526f.f28023c = C11847y.m34418a(packageManager, packageName);
        this.f28526f.f28024d = Integer.valueOf(C11847y.m34419b(packageManager, packageName));
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        if (!TextUtils.isEmpty(installerPackageName)) {
            this.f28526f.f28026f = installerPackageName;
        }
        String a = m34054a(packageManager, packageName);
        if (!TextUtils.isEmpty(a)) {
            this.f28526f.f28027g = a;
        }
        mo72641a();
        this.f28524c = htVar;
        String a2 = htVar.f28568c.mo72813a();
        if (a2 != null && a2.length() > 0) {
            C11606fc.C11607a aVar4 = this.f28525e;
            aVar4.f28151p = a2 + " 12.10.0/Android";
        }
        String b2 = this.f28524c.mo72669b();
        if (b2 != null) {
            this.f28523b.f28263d = b2;
        }
        C11627fj.C11628a aVar5 = this.f28523b;
        C11737ht htVar2 = this.f28524c;
        long j = htVar2.f28567b.getLong("it", 0);
        if (j == 0) {
            Context context2 = htVar2.f28566a;
            j = C11847y.m34420c(context2.getPackageManager(), context2.getPackageName());
            if (j == 0) {
                j = C11714hj.m34005d(htVar2.f28566a).lastModified();
                if (j == 0) {
                    Context context3 = htVar2.f28566a;
                    j = new File(C11847y.m34421d(context3.getPackageManager(), context3.getPackageName())).lastModified();
                    if (j == 0) {
                        j = System.currentTimeMillis();
                    }
                }
            }
            htVar2.f28567b.edit().putLong("it", j).apply();
        }
        aVar5.f28262c = Long.valueOf(j);
        int b3 = this.f28524c.f28571f.mo72739b();
        this.f28523b.f28264e = Integer.valueOf(m34052a(7, b3));
        this.f28523b.f28265f = Integer.valueOf(m34052a(30, b3));
        int b4 = this.f28524c.f28573h.mo72739b();
        if (b4 > 0) {
            this.f28523b.f28267h = Integer.valueOf(b4);
        }
        long a3 = this.f28524c.f28574i.mo72807a();
        if (a3 > 0) {
            this.f28523b.f28268i = Long.valueOf(a3);
        }
        long a4 = this.f28524c.f28575j.mo72807a();
        if (a4 > 0) {
            this.f28523b.f28269j = Long.valueOf(a4);
        }
        long a5 = this.f28524c.f28576k.mo72807a();
        if (a5 > 0) {
            this.f28523b.f28270k = Long.valueOf(a5);
        }
        String a6 = this.f28524c.f28577l.mo72813a();
        if (a6 != null) {
            this.f28523b.f28271l = a6;
        }
        int b5 = this.f28524c.f28578m.mo72739b();
        if (b5 > 0) {
            this.f28523b.f28272m = Integer.valueOf(b5);
        }
        double a7 = this.f28524c.f28579n.mo72681a();
        if (a7 != 0.0d) {
            this.f28523b.f28273n = Double.valueOf(a7);
        }
        long a8 = this.f28524c.f28580o.mo72807a();
        if (a8 > 0) {
            this.f28523b.f28274o = Long.valueOf(a8);
        }
        double a9 = this.f28524c.f28581p.mo72681a();
        if (a9 != 0.0d) {
            this.f28523b.f28275p = Double.valueOf(a9);
        }
        String a10 = this.f28524c.f28572g.mo72813a();
        if (a10 != null) {
            try {
                byte[] decode = Base64.decode(a10, 2);
                this.f28523b.f28266g.clear();
                this.f28523b.f28266g.addAll(C11621fh.f28212c.mo72355a(decode).f28213d);
            } catch (IllegalArgumentException unused) {
                this.f28524c.f28572g.mo72811c();
            } catch (IOException unused2) {
                this.f28524c.f28572g.mo72811c();
            }
        }
        this.f28526f.f28025e = this.f28524c.f28582q.mo72813a();
        this.f28523b.f28278s = this.f28524c.f28583r.mo72813a();
        int intValue = this.f28524c.f28584s.mo72736a().intValue();
        this.f28523b.f28279t = intValue != -1 ? Integer.valueOf(intValue) : null;
        int intValue2 = this.f28524c.f28585t.mo72736a().intValue();
        this.f28523b.f28280u = intValue2 != -1 ? Integer.valueOf(intValue2) : null;
        this.f28523b.f28281v = this.f28524c.f28586u.mo72813a();
        this.f28523b.f28282w = this.f28524c.f28587v.mo72813a();
        this.f28523b.f28283x = this.f28524c.f28588w.mo72813a();
        this.f28523b.f28284y = this.f28524c.f28589x.mo72813a();
        this.f28523b.f28285z = this.f28524c.f28590y.mo72813a();
        String a11 = this.f28524c.f28591z.mo72813a();
        if (a11 != null) {
            try {
                byte[] decode2 = Base64.decode(a11, 2);
                this.f28523b.f28260A.clear();
                this.f28523b.f28260A.addAll(C11624fi.f28215c.mo72355a(decode2).f28216d);
            } catch (IllegalArgumentException unused3) {
                this.f28524c.f28591z.mo72811c();
            } catch (IOException unused4) {
                this.f28524c.f28591z.mo72811c();
            }
        }
        String a12 = this.f28524c.f28562A.mo72813a();
        boolean booleanValue = this.f28524c.f28563B.mo72528a().booleanValue();
        if (a12 != null) {
            this.f28523b.f28276q = a12;
            this.f28523b.f28277r = Boolean.valueOf(booleanValue);
        } else {
            this.f28523b.f28276q = null;
            this.f28523b.f28277r = null;
        }
        this.f28523b.f28261B = this.f28524c.f28564C.mo72528a();
    }

    /* renamed from: a */
    private static String m34054a(PackageManager packageManager, String str) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str, 128).metaData;
            if (bundle == null || (obj = bundle.get("com.tapjoy.appstore")) == null) {
                return null;
            }
            return obj.toString().trim();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72641a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0049 }
            r0.<init>()     // Catch:{ Exception -> 0x0049 }
            android.content.Context r1 = r3.f28527g     // Catch:{ Exception -> 0x0049 }
            android.view.WindowManager r1 = com.tapjoy.internal.C11698h.m33949a(r1)     // Catch:{ Exception -> 0x0049 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0049 }
            r1.getMetrics(r0)     // Catch:{ Exception -> 0x0049 }
            android.app.Activity r1 = com.tapjoy.internal.C11700hb.m33954a()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            int r2 = r0.heightPixels     // Catch:{ Exception -> 0x0049 }
            int r1 = com.tapjoy.internal.C11415ac.m33204a(r1)     // Catch:{ Exception -> 0x0049 }
            int r2 = r2 - r1
            r0.heightPixels = r2     // Catch:{ Exception -> 0x0049 }
        L_0x0028:
            com.tapjoy.internal.fc$a r1 = r3.f28525e     // Catch:{ Exception -> 0x0049 }
            int r2 = r0.densityDpi     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0049 }
            r1.f28144i = r2     // Catch:{ Exception -> 0x0049 }
            com.tapjoy.internal.fc$a r1 = r3.f28525e     // Catch:{ Exception -> 0x0049 }
            int r2 = r0.widthPixels     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0049 }
            r1.f28145j = r2     // Catch:{ Exception -> 0x0049 }
            com.tapjoy.internal.fc$a r1 = r3.f28525e     // Catch:{ Exception -> 0x0049 }
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0049 }
            r1.f28146k = r0     // Catch:{ Exception -> 0x0049 }
            goto L_0x0049
        L_0x0047:
            r0 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            return
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11726hm.mo72641a():void");
    }

    /* renamed from: b */
    public final C11609fd mo72651b() {
        C11609fd fdVar;
        synchronized (this) {
            this.f28525e.f28147l = Locale.getDefault().toString();
            this.f28525e.f28148m = TimeZone.getDefault().getID();
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() - 259200000;
            Iterator<C11618fg> it = this.f28523b.f28266g.iterator();
            while (it.hasNext()) {
                if (it.next().f28207g.longValue() <= currentTimeMillis) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                m34055g();
            }
            fdVar = new C11609fd(this.f28525e.mo72470b(), this.f28526f.mo72448b(), this.f28523b.mo72491b());
        }
        return fdVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo72654c() {
        String a;
        synchronized (this) {
            a = this.f28524c.f28569d.mo72813a();
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dc  */
    @javax.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tapjoy.internal.C11612fe mo72655d() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            r2 = 1
            int r3 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r3 = r3 * 10000
            r4 = 2
            int r5 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r5 = r5 * 100
            int r3 = r3 + r5
            int r3 = r3 + 100
            r5 = 5
            int r6 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            int r3 = r3 + r6
            com.tapjoy.internal.ht r6 = r1.f28524c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r6 = r6.f28570e     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = r6.mo72736a()     // Catch:{ all -> 0x0141 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0141 }
            r7 = 0
            if (r6 == r3) goto L_0x013f
            if (r6 != 0) goto L_0x004a
            com.tapjoy.internal.fj$a r0 = r1.f28523b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f28264e = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r0 = r1.f28523b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f28265f = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fe r0 = new com.tapjoy.internal.fe     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "fq7_0_1"
            java.lang.String r5 = "fq30_0_1"
            r0.<init>(r4, r5, r7)     // Catch:{ all -> 0x0141 }
            goto L_0x012f
        L_0x004a:
            com.tapjoy.internal.ht r8 = r1.f28524c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r8 = r8.f28571f     // Catch:{ all -> 0x0141 }
            java.lang.Integer r8 = r8.mo72736a()     // Catch:{ all -> 0x0141 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0141 }
            r9 = 7
            int r10 = m34052a((int) r9, (int) r8)     // Catch:{ all -> 0x0141 }
            r11 = 30
            int r12 = m34052a((int) r11, (int) r8)     // Catch:{ all -> 0x0141 }
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            int r14 = r6 / 10000
            int r15 = r6 / 100
            int r15 = r15 % 100
            int r15 = r15 - r2
            int r6 = r6 % 100
            r13.set(r14, r15, r6)     // Catch:{ all -> 0x0141 }
            int r6 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r14 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r6 = r6 - r14
            int r6 = java.lang.Integer.signum(r6)     // Catch:{ all -> 0x0141 }
            r14 = -1
            if (r6 == r14) goto L_0x00a8
            if (r6 == r2) goto L_0x008e
            r4 = 6
            int r0 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0 - r4
            goto L_0x00d4
        L_0x008e:
            java.lang.Object r14 = r0.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r13 = r13.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r13)     // Catch:{ all -> 0x0141 }
            long r16 = r0.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            goto L_0x00c1
        L_0x00a8:
            java.lang.Object r14 = r13.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r0)     // Catch:{ all -> 0x0141 }
            long r16 = r13.getTimeInMillis()     // Catch:{ all -> 0x0141 }
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            long r18 = r14.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            r14.add(r5, r2)     // Catch:{ all -> 0x0141 }
            int r0 = r0 + 1
            goto L_0x00c2
        L_0x00d0:
            if (r6 <= 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            int r0 = -r0
        L_0x00d4:
            int r4 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0141 }
            if (r4 < r11) goto L_0x00dc
            r15 = 0
            goto L_0x00e4
        L_0x00dc:
            if (r0 < 0) goto L_0x00e1
            int r15 = r8 << r0
            goto L_0x00e4
        L_0x00e1:
            int r0 = -r0
            int r15 = r8 >> r0
        L_0x00e4:
            r2 = r2 | r15
            int r0 = m34052a((int) r9, (int) r2)     // Catch:{ all -> 0x0141 }
            int r4 = m34052a((int) r11, (int) r2)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r5 = r1.f28523b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0141 }
            r5.f28264e = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r5 = r1.f28523b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r5.f28265f = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fe r5 = new com.tapjoy.internal.fe     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq7_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r10)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq30_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0141 }
            r5.<init>(r0, r4, r7)     // Catch:{ all -> 0x0141 }
            r0 = r5
        L_0x012f:
            com.tapjoy.internal.ht r4 = r1.f28524c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r4 = r4.f28570e     // Catch:{ all -> 0x0141 }
            r4.mo72737a((int) r3)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.ht r3 = r1.f28524c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r3 = r3.f28571f     // Catch:{ all -> 0x0141 }
            r3.mo72737a((int) r2)     // Catch:{ all -> 0x0141 }
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r0
        L_0x013f:
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r7
        L_0x0141:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11726hm.mo72655d():com.tapjoy.internal.fe");
    }

    /* renamed from: a */
    private static int m34052a(int i, int i2) {
        return Integer.bitCount(((1 << i) - 1) & i2);
    }

    /* renamed from: a */
    public final void mo72643a(String str, double d) {
        synchronized (this) {
            SharedPreferences.Editor a = this.f28524c.mo72667a();
            int i = 1;
            if (str.equals(this.f28524c.f28577l.mo72813a())) {
                i = 1 + this.f28524c.f28578m.mo72739b();
                this.f28524c.f28578m.mo72735a(a, i);
                d += this.f28524c.f28579n.mo72681a();
                this.f28524c.f28579n.mo72683a(a, d);
                a.apply();
            } else {
                this.f28524c.f28577l.mo72812a(a, str);
                this.f28524c.f28578m.mo72735a(a, 1);
                this.f28524c.f28579n.mo72683a(a, d);
                this.f28524c.f28580o.mo72808a(a);
                this.f28524c.f28581p.mo72682a(a);
                a.apply();
                this.f28523b.f28271l = str;
                this.f28523b.f28274o = null;
                this.f28523b.f28275p = null;
            }
            this.f28523b.f28272m = Integer.valueOf(i);
            this.f28523b.f28273n = Double.valueOf(d);
        }
    }

    /* renamed from: a */
    public final void mo72642a(long j, double d) {
        synchronized (this) {
            SharedPreferences.Editor a = this.f28524c.mo72667a();
            this.f28524c.f28580o.mo72809a(a, j);
            this.f28524c.f28581p.mo72683a(a, d);
            a.apply();
            this.f28523b.f28274o = Long.valueOf(j);
            this.f28523b.f28275p = Double.valueOf(d);
        }
    }

    /* renamed from: a */
    public final boolean mo72649a(String str, long j, boolean z) {
        synchronized (this) {
            int size = this.f28523b.f28266g.size();
            int i = 0;
            while (i < size) {
                C11618fg fgVar = this.f28523b.f28266g.get(i);
                if (!fgVar.f28206f.equals(str)) {
                    i++;
                } else if (!z) {
                    return false;
                } else {
                    C11618fg.C11619a aVar = new C11618fg.C11619a();
                    aVar.f28209c = fgVar.f28206f;
                    aVar.f28210d = fgVar.f28207g;
                    aVar.f28211e = fgVar.f28208h;
                    aVar.mo72350a(fgVar.mo72347a());
                    aVar.f28210d = Long.valueOf(j);
                    this.f28523b.f28266g.set(i, aVar.mo72482b());
                    return true;
                }
            }
            this.f28523b.f28266g.add(new C11618fg(str, Long.valueOf(j)));
            m34055g();
            return true;
        }
    }

    /* renamed from: g */
    private void m34055g() {
        this.f28524c.f28572g.mo72814a(Base64.encodeToString(C11621fh.f28212c.mo72358b(new C11621fh(this.f28523b.f28266g)), 2));
    }

    /* renamed from: a */
    public final boolean mo72648a(String str) {
        boolean z;
        synchronized (this) {
            this.f28524c.f28582q.mo72814a(str);
            z = true;
            if (str != null) {
                if (C11688gq.m33923a(this.f28526f.f28025e, str)) {
                    z = false;
                }
                this.f28526f.f28025e = str;
            } else {
                if (this.f28526f.f28025e == null) {
                    z = false;
                }
                this.f28526f.f28025e = null;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo72653b(String str) {
        boolean z;
        synchronized (this) {
            this.f28524c.f28583r.mo72814a(str);
            z = !C11688gq.m33923a(this.f28523b.f28278s, str);
            if (z) {
                this.f28523b.f28278s = str;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo72647a(Integer num) {
        boolean z;
        synchronized (this) {
            this.f28524c.f28584s.mo72738a(num);
            z = !C11688gq.m33923a(this.f28523b.f28279t, num);
            if (z) {
                this.f28523b.f28279t = num;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo72652b(Integer num) {
        boolean z;
        synchronized (this) {
            this.f28524c.f28585t.mo72738a(num);
            z = !C11688gq.m33923a(this.f28523b.f28280u, num);
            if (z) {
                this.f28523b.f28280u = num;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo72646a(int i, String str) {
        boolean z;
        synchronized (this) {
            z = false;
            if (i == 1) {
                this.f28524c.f28586u.mo72814a(str);
                z = !C11688gq.m33923a(this.f28523b.f28281v, str);
                if (z) {
                    this.f28523b.f28281v = str;
                }
            } else if (i == 2) {
                this.f28524c.f28587v.mo72814a(str);
                z = !C11688gq.m33923a(this.f28523b.f28282w, str);
                if (z) {
                    this.f28523b.f28282w = str;
                }
            } else if (i == 3) {
                this.f28524c.f28588w.mo72814a(str);
                z = !C11688gq.m33923a(this.f28523b.f28283x, str);
                if (z) {
                    this.f28523b.f28283x = str;
                }
            } else if (i == 4) {
                this.f28524c.f28589x.mo72814a(str);
                z = !C11688gq.m33923a(this.f28523b.f28284y, str);
                if (z) {
                    this.f28523b.f28284y = str;
                }
            } else if (i == 5) {
                this.f28524c.f28590y.mo72814a(str);
                z = !C11688gq.m33923a(this.f28523b.f28285z, str);
                if (z) {
                    this.f28523b.f28285z = str;
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    public final Set<String> mo72656e() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f28523b.f28260A);
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo72645a(Set<String> set) {
        synchronized (this) {
            if (set != null) {
                if (!set.isEmpty()) {
                    this.f28524c.f28591z.mo72814a(Base64.encodeToString(C11624fi.f28215c.mo72358b(new C11624fi(new ArrayList(set))), 2));
                    this.f28523b.f28260A.clear();
                    this.f28523b.f28260A.addAll(set);
                }
            }
            this.f28524c.f28591z.mo72811c();
            this.f28523b.f28260A.clear();
        }
    }

    /* renamed from: a */
    public final void mo72644a(String str, boolean z) {
        String a = this.f28524c.f28562A.mo72813a();
        this.f28523b.f28276q = str;
        this.f28523b.f28277r = Boolean.valueOf(z);
        this.f28524c.f28562A.mo72814a(str);
        this.f28524c.f28563B.mo72529a(z);
        C11745hx.m34125a(str, z);
        if (!TextUtils.isEmpty(a) && !str.equals(a)) {
            this.f28524c.mo72668a(false);
        }
    }

    /* renamed from: f */
    public final boolean mo72657f() {
        return ((Boolean) C11688gq.m33924b(this.f28523b.f28261B, C11627fj.f28233r)).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo72650a(boolean z) {
        boolean z2;
        synchronized (this) {
            this.f28524c.f28564C.mo72529a(z);
            z2 = z != ((Boolean) C11688gq.m33924b(this.f28523b.f28261B, C11627fj.f28233r)).booleanValue();
            this.f28523b.f28261B = Boolean.valueOf(z);
        }
        return z2;
    }
}
