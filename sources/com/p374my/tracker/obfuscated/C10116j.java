package com.p374my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.TimeZone;

/* renamed from: com.my.tracker.obfuscated.j */
public final class C10116j {

    /* renamed from: A */
    private long f25193A = -1;

    /* renamed from: B */
    private long f25194B = -1;

    /* renamed from: C */
    private long f25195C = -1;

    /* renamed from: D */
    private int f25196D = -1;

    /* renamed from: E */
    private int f25197E = -1;

    /* renamed from: a */
    private boolean f25198a = false;

    /* renamed from: b */
    private String f25199b = "";

    /* renamed from: c */
    private String f25200c = "";

    /* renamed from: d */
    private String f25201d = "";

    /* renamed from: e */
    private String f25202e = "";

    /* renamed from: f */
    private String f25203f = "";

    /* renamed from: g */
    private String f25204g = "";

    /* renamed from: h */
    private String f25205h = "";

    /* renamed from: i */
    private String f25206i = "";

    /* renamed from: j */
    private String f25207j = "";

    /* renamed from: k */
    private String f25208k = "";

    /* renamed from: l */
    private String f25209l = "";

    /* renamed from: m */
    private String f25210m = "";

    /* renamed from: n */
    private String f25211n = "";

    /* renamed from: o */
    private String f25212o = "";

    /* renamed from: p */
    private String f25213p = "";

    /* renamed from: q */
    private String f25214q = "";

    /* renamed from: r */
    private String f25215r = "";

    /* renamed from: s */
    private int f25216s = -1;

    /* renamed from: t */
    private int f25217t = -1;

    /* renamed from: u */
    private int f25218u = -1;

    /* renamed from: v */
    private float f25219v = Float.NaN;

    /* renamed from: w */
    private float f25220w = Float.NaN;

    /* renamed from: x */
    private float f25221x = Float.NaN;

    /* renamed from: y */
    private int f25222y = -1;

    /* renamed from: z */
    private long f25223z = -1;

    /* renamed from: com.my.tracker.obfuscated.j$a */
    static final class C10117a {

        /* renamed from: a */
        static final int f25224a = (m30094a() ? 1 : 0);

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0095 */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0090 A[SYNTHETIC, Splitter:B:40:0x0090] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef A[SYNTHETIC, Splitter:B:72:0x00ef] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x00f5 A[SYNTHETIC, Splitter:B:78:0x00f5] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0098 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m30094a() {
            /*
                java.lang.String r0 = android.os.Build.TAGS
                r1 = 1
                if (r0 == 0) goto L_0x000e
                java.lang.String r2 = "test-keys"
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x000e
                return r1
            L_0x000e:
                r0 = 10
                java.lang.String r2 = "/system/app/Superuser.apk"
                java.lang.String r3 = "/sbin/su"
                java.lang.String r4 = "/system/bin/su"
                java.lang.String r5 = "/system/xbin/su"
                java.lang.String r6 = "/data/local/xbin/su"
                java.lang.String r7 = "/data/local/bin/su"
                java.lang.String r8 = "/system/sd/xbin/su"
                java.lang.String r9 = "/system/bin/failsafe/su"
                java.lang.String r10 = "/data/local/su"
                java.lang.String r11 = "/su/bin/su"
                java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                r3 = 0
                r4 = r3
            L_0x002a:
                if (r4 >= r0) goto L_0x003d
                r5 = r2[r4]
                java.io.File r6 = new java.io.File
                r6.<init>(r5)
                boolean r5 = r6.exists()
                if (r5 == 0) goto L_0x003a
                return r1
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x002a
            L_0x003d:
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                r2 = 3
                java.lang.String r4 = "/system/xbin/which su"
                java.lang.String r5 = "/system/bin/which su"
                java.lang.String r6 = "which su"
                java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}
                r5 = r3
            L_0x004d:
                r6 = 0
                if (r5 >= r2) goto L_0x009b
                r7 = r4[r5]
                java.lang.Process r7 = r0.exec(r7)     // Catch:{ all -> 0x008d }
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x008e }
                java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }
                java.io.InputStream r10 = r7.getInputStream()     // Catch:{ all -> 0x008e }
                r9.<init>(r10)     // Catch:{ all -> 0x008e }
                r8.<init>(r9)     // Catch:{ all -> 0x008e }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r6.<init>()     // Catch:{ all -> 0x008b }
            L_0x0069:
                java.lang.String r9 = r8.readLine()     // Catch:{ all -> 0x008b }
                if (r9 == 0) goto L_0x0073
                r6.append(r9)     // Catch:{ all -> 0x008b }
                goto L_0x0069
            L_0x0073:
                r7.destroy()     // Catch:{ all -> 0x008b }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008b }
                boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008b }
                if (r6 != 0) goto L_0x0087
                r8.close()     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r7.destroy()     // Catch:{ all -> 0x0086 }
            L_0x0086:
                return r1
            L_0x0087:
                r8.close()     // Catch:{ all -> 0x0095 }
                goto L_0x0095
            L_0x008b:
                r6 = r8
                goto L_0x008e
            L_0x008d:
                r7 = r6
            L_0x008e:
                if (r6 == 0) goto L_0x0093
                r6.close()     // Catch:{ all -> 0x0093 }
            L_0x0093:
                if (r7 == 0) goto L_0x0098
            L_0x0095:
                r7.destroy()     // Catch:{ all -> 0x0098 }
            L_0x0098:
                int r5 = r5 + 1
                goto L_0x004d
            L_0x009b:
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.lang.String r2 = "/proc/%d/mounts"
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                int r5 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                r4[r3] = r5     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.lang.String r0 = java.lang.String.format(r0, r2, r4)     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                r5.<init>(r0)     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                r4.<init>(r5)     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                r2.<init>(r4)     // Catch:{ Exception -> 0x00f3, all -> 0x00ec }
                r0 = 4
                java.lang.String r4 = "/sbin/.magisk/"
                java.lang.String r5 = "/sbin/.core/mirror"
                java.lang.String r6 = "/sbin/.core/img"
                java.lang.String r7 = "/sbin/.core/db-0/magisk.db"
                java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            L_0x00cb:
                java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
                if (r5 == 0) goto L_0x00e3
                r6 = r3
            L_0x00d2:
                if (r6 >= r0) goto L_0x00cb
                r7 = r4[r6]     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
                boolean r7 = r5.contains(r7)     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
                if (r7 == 0) goto L_0x00e0
                r2.close()     // Catch:{ all -> 0x00df }
            L_0x00df:
                return r1
            L_0x00e0:
                int r6 = r6 + 1
                goto L_0x00d2
            L_0x00e3:
                r2.close()     // Catch:{ all -> 0x00f8 }
                goto L_0x00f8
            L_0x00e7:
                r0 = move-exception
                r6 = r2
                goto L_0x00ed
            L_0x00ea:
                r6 = r2
                goto L_0x00f3
            L_0x00ec:
                r0 = move-exception
            L_0x00ed:
                if (r6 == 0) goto L_0x00f2
                r6.close()     // Catch:{ all -> 0x00f2 }
            L_0x00f2:
                throw r0
            L_0x00f3:
                if (r6 == 0) goto L_0x00f8
                r6.close()     // Catch:{ all -> 0x00f8 }
            L_0x00f8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10116j.C10117a.m30094a():boolean");
        }
    }

    C10116j() {
    }

    /* renamed from: b */
    private void m30087b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            this.f25223z = filesDir.getTotalSpace();
            this.f25193A = filesDir.getFreeSpace();
            File d = m30089d(context);
            if (d != null) {
                long freeSpace = d.getFreeSpace();
                if (this.f25193A != freeSpace) {
                    long totalSpace = d.getTotalSpace();
                    if (this.f25223z != totalSpace) {
                        this.f25194B = totalSpace;
                        this.f25195C = freeSpace;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m30088c(Context context) {
        Display display;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                return;
            }
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                display = windowManager.getDefaultDisplay();
            } else {
                return;
            }
        }
        if (display != null) {
            Point point = new Point();
            if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            this.f25216s = point.x;
            this.f25217t = point.y;
        }
    }

    /* renamed from: d */
    private static File m30089d(Context context) {
        Stack stack = new Stack();
        if (Build.VERSION.SDK_INT >= 19) {
            File[] externalFilesDirs = context.getExternalFilesDirs((String) null);
            if (externalFilesDirs != null) {
                for (File file : externalFilesDirs) {
                    if (file != null && (Build.VERSION.SDK_INT < 21 || (Environment.isExternalStorageRemovable(file) && !Environment.isExternalStorageEmulated(file)))) {
                        stack.push(file);
                    }
                }
            }
        } else {
            File externalFilesDir = context.getExternalFilesDir((String) null);
            if (externalFilesDir != null) {
                stack.push(externalFilesDir);
            }
        }
        if (stack.isEmpty()) {
            return null;
        }
        return (File) stack.pop();
    }

    /* renamed from: e */
    private static String m30090e(Context context) {
        String str;
        C10121k0 a = C10121k0.m30104a(context);
        String k = a.mo66205k();
        if (!TextUtils.isEmpty(k)) {
            C10175u0.m30440a("DeviceParamsDataProvider: retrieving mac " + k + " from cache");
            return k;
        }
        Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "DeviceParamsDataProvider: unable to retrieve mac: network interfaces does not contain wlan0";
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    str = "DeviceParamsDataProvider: unable to retrieve mac: getHardwareAddress is null";
                    break;
                }
                StringBuilder sb = new StringBuilder();
                int length = hardwareAddress.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    a.mo66208l(sb2);
                    C10175u0.m30440a("DeviceParamsDataProvider: succesfully retreived mac " + sb2);
                    return sb2;
                }
            }
        }
        C10175u0.m30440a(str);
        return "";
    }

    /* renamed from: a */
    public void mo66170a(Context context) {
        if (!this.f25198a) {
            C10175u0.m30440a("DeviceParamsDataProvider: collect application info...");
            this.f25200c = Build.DEVICE;
            this.f25206i = Build.MANUFACTURER;
            this.f25207j = Build.MODEL;
            this.f25202e = Build.VERSION.RELEASE;
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    String string = Settings.Secure.getString(contentResolver, "android_id");
                    this.f25201d = string;
                    if (string == null) {
                        this.f25201d = "";
                    }
                }
            } catch (Throwable th) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting android ID exception ", th);
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    this.f25212o = telephonyManager.getNetworkOperatorName();
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                        this.f25211n = networkOperator;
                    } else {
                        this.f25211n = networkOperator.substring(3);
                        this.f25210m = networkOperator.substring(0, 3);
                    }
                    if (telephonyManager.getSimState() == 5) {
                        this.f25213p = telephonyManager.getSimOperator();
                    }
                }
            } catch (Throwable th2) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting telephony exception: ", th2);
            }
            try {
                this.f25203f = context.getPackageName();
            } catch (Throwable th3) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting packageName exception: ", th3);
            }
            try {
                this.f25209l = context.getResources().getConfiguration().locale.getLanguage();
            } catch (Throwable th4) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting app lang exception: ", th4);
            }
            try {
                this.f25215r = m30090e(context);
            } catch (Throwable th5) {
                C10175u0.m30441a("DeviceParamsDataProvider: unable to retrieve mac: exception ", th5);
            }
            try {
                PackageInfo a = C10112h.m30078a(context);
                if (a != null) {
                    this.f25205h = a.versionName;
                    this.f25204g = Long.toString(Build.VERSION.SDK_INT < 28 ? (long) a.versionCode : a.getLongVersionCode());
                }
            } catch (Throwable th6) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting app package info exception: ", th6);
            }
            try {
                m30088c(context);
            } catch (Throwable th7) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting screen size exception: ", th7);
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f25218u = displayMetrics.densityDpi;
                    this.f25219v = displayMetrics.density;
                    this.f25220w = displayMetrics.xdpi;
                    this.f25221x = displayMetrics.ydpi;
                }
            } catch (Throwable th8) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting display metrics exception: ", th8);
            }
            try {
                TimeZone timeZone = TimeZone.getDefault();
                this.f25214q = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
            } catch (Throwable th9) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting timezone exception: ", th9);
            }
            try {
                this.f25222y = C10117a.f25224a;
            } catch (Throwable th10) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting isRooted exception: ", th10);
            }
            try {
                m30087b(context);
            } catch (Throwable th11) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting disk info exception: ", th11);
            }
            try {
                this.f25208k = Locale.getDefault().getLanguage();
            } catch (Throwable th12) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting lang exception: ", th12);
            }
            try {
                this.f25196D = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
            } catch (Throwable th13) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th13);
            }
            try {
                this.f25197E = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
            } catch (Throwable th14) {
                C10175u0.m30441a("DeviceParamsDataProvider: collecting ui mode info exception: ", th14);
            }
            this.f25199b = C10180w0.m30493a(context);
            this.f25198a = true;
            C10175u0.m30440a("DeviceParamsDataProvider: collected");
        }
    }

    /* renamed from: a */
    public void mo66171a(C10129m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f25201d)) {
            m0Var.mo66265a(this.f25201d);
        }
        if (!TextUtils.isEmpty(this.f25200c)) {
            m0Var.mo66309g(this.f25200c);
        }
        if (!TextUtils.isEmpty(this.f25206i)) {
            m0Var.mo66325l(this.f25206i);
        }
        if (!TextUtils.isEmpty(this.f25202e)) {
            m0Var.mo66334q(this.f25202e);
        }
        if (!TextUtils.isEmpty(this.f25208k)) {
            m0Var.mo66333p(this.f25208k);
        }
        if (!TextUtils.isEmpty(this.f25210m)) {
            m0Var.mo66337t(this.f25210m);
        }
        if (!TextUtils.isEmpty(this.f25207j)) {
            m0Var.mo66313h(this.f25207j);
        }
        if (!TextUtils.isEmpty(this.f25211n)) {
            m0Var.mo66335r(this.f25211n);
        }
        if (!TextUtils.isEmpty(this.f25212o)) {
            m0Var.mo66336s(this.f25212o);
        }
        if (!TextUtils.isEmpty(this.f25213p)) {
            m0Var.mo66338u(this.f25213p);
        }
        if (!TextUtils.isEmpty(this.f25214q)) {
            m0Var.mo66339v(this.f25214q);
        }
        if (!TextUtils.isEmpty(this.f25203f)) {
            m0Var.mo66300e(this.f25203f);
        }
        if (!TextUtils.isEmpty(this.f25205h)) {
            m0Var.mo66305f(this.f25205h);
        }
        if (!TextUtils.isEmpty(this.f25204g)) {
            m0Var.mo66280b(this.f25204g);
        }
        if (!TextUtils.isEmpty(this.f25209l)) {
            m0Var.mo66295d(this.f25209l);
        }
        if (!TextUtils.isEmpty(this.f25215r)) {
            m0Var.mo66322k(this.f25215r);
        }
        if (!TextUtils.isEmpty(this.f25199b)) {
            m0Var.mo66319j(this.f25199b);
        }
        m0Var.mo66324l(3);
        m0Var.mo66332p(this.f25216s);
        m0Var.mo66321k(this.f25217t);
        m0Var.mo66315i(this.f25218u);
        m0Var.mo66258a(this.f25219v);
        m0Var.mo66277b(this.f25220w);
        m0Var.mo66287c(this.f25221x);
        m0Var.mo66326m(this.f25222y);
        m0Var.mo66294d(this.f25223z);
        m0Var.mo66289c(this.f25193A);
        m0Var.mo66279b(this.f25194B);
        m0Var.mo66262a(this.f25195C);
        m0Var.mo66328n(this.f25196D);
        m0Var.mo66330o(this.f25197E);
    }

    /* renamed from: f */
    public void mo66172f(Context context) {
    }
}
