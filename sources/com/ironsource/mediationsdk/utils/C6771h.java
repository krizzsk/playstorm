package com.ironsource.mediationsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ironsource.mediationsdk.utils.h */
public final class C6771h implements Runnable {

    /* renamed from: A */
    private final String f17701A = "mnc";

    /* renamed from: B */
    private final String f17702B = "icc";

    /* renamed from: C */
    private final String f17703C = "tz";

    /* renamed from: D */
    private final String f17704D = "auid";

    /* renamed from: E */
    private Context f17705E;

    /* renamed from: a */
    private final String f17706a = getClass().getSimpleName();

    /* renamed from: b */
    private final String f17707b = "bundleId";

    /* renamed from: c */
    private final String f17708c = "advertisingId";

    /* renamed from: d */
    private final String f17709d = "isLimitAdTrackingEnabled";

    /* renamed from: e */
    private final String f17710e = "appKey";

    /* renamed from: f */
    private final String f17711f = "deviceOS";

    /* renamed from: g */
    private final String f17712g = "osVersion";

    /* renamed from: h */
    private final String f17713h = "connectionType";

    /* renamed from: i */
    private final String f17714i = "language";

    /* renamed from: j */
    private final String f17715j = "deviceOEM";

    /* renamed from: k */
    private final String f17716k = "deviceModel";

    /* renamed from: l */
    private final String f17717l = "mobileCarrier";

    /* renamed from: m */
    private final String f17718m = "externalFreeMemory";

    /* renamed from: n */
    private final String f17719n = "internalFreeMemory";

    /* renamed from: o */
    private final String f17720o = "battery";

    /* renamed from: p */
    private final String f17721p = "gmtMinutesOffset";

    /* renamed from: q */
    private final String f17722q = "appVersion";

    /* renamed from: r */
    private final String f17723r = "sessionId";

    /* renamed from: s */
    private final String f17724s = "pluginType";

    /* renamed from: t */
    private final String f17725t = "pluginVersion";

    /* renamed from: u */
    private final String f17726u = "plugin_fw_v";

    /* renamed from: v */
    private final String f17727v = "jb";

    /* renamed from: w */
    private final String f17728w = "advertisingIdType";

    /* renamed from: x */
    private final String f17729x = "mt";

    /* renamed from: y */
    private final String f17730y = "firstSession";

    /* renamed from: z */
    private final String f17731z = "mcc";

    private C6771h() {
    }

    public C6771h(Context context) {
        this.f17705E = context.getApplicationContext();
    }

    /* renamed from: a */
    private static String m20581a() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* renamed from: b */
    private static String m20582b() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    /* renamed from: c */
    private static String m20583c() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* renamed from: d */
    private String m20584d() {
        try {
            return this.f17705E.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    private static String m20585e() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private static String m20586f() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static String m20587g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    private static String m20588h() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    private String m20589i() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f17705E.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17706a + ":getMobileCarrier()", e);
            return "";
        }
    }

    /* renamed from: j */
    private static boolean m20590j() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    private static long m20591k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private int m20592l() {
        try {
            Intent registerReceiver = this.f17705E.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17706a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    /* renamed from: m */
    private int m20593m() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round((float) (((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15)) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17706a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0132 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015b A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0180 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018f A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b3 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c8 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d9 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208 A[Catch:{ Exception -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0217 A[Catch:{ Exception -> 0x0244 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r0.<init>()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = r9.m20584d()     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = "bundleId"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
            android.content.Context r2 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = com.ironsource.environment.C6408c.m19242c(r2, r1)     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = "appVersion"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x002e:
            java.lang.String r1 = "appKey"
            com.ironsource.mediationsdk.J r2 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r2 = r2.f16544j     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0244 }
            android.content.Context r1 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String[] r1 = com.ironsource.environment.C6429h.m19297C(r1)     // Catch:{ Exception -> 0x0244 }
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L_0x0060
            int r5 = r1.length     // Catch:{ Exception -> 0x0244 }
            r6 = 2
            if (r5 != r6) goto L_0x0060
            r5 = r1[r4]     // Catch:{ Exception -> 0x0244 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0244 }
            if (r5 != 0) goto L_0x0054
            r5 = r1[r4]     // Catch:{ Exception -> 0x0244 }
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r1 = r1[r2]     // Catch:{ Exception -> 0x0244 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0244 }
            goto L_0x0062
        L_0x0060:
            r5 = r3
            r1 = r4
        L_0x0062:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0244 }
            if (r6 != 0) goto L_0x006b
            java.lang.String r3 = "GAID"
            goto L_0x0079
        L_0x006b:
            android.content.Context r5 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String r5 = com.ironsource.environment.C6429h.m19349x(r5)     // Catch:{ Exception -> 0x0244 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0244 }
            if (r6 != 0) goto L_0x0079
            java.lang.String r3 = "UUID"
        L_0x0079:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0244 }
            if (r6 != 0) goto L_0x0092
            java.lang.String r6 = "advertisingId"
            r0.put(r6, r5)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r5 = "advertisingIdType"
            r0.put(r5, r3)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r3 = "isLimitAdTrackingEnabled"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0092:
            java.lang.String r1 = "deviceOS"
            java.lang.String r3 = "Android"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = m20585e()     // Catch:{ Exception -> 0x0244 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r1 != 0) goto L_0x00ac
            java.lang.String r1 = "osVersion"
            java.lang.String r3 = m20585e()     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0244 }
        L_0x00ac:
            android.content.Context r1 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getConnectionType(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = "connectionType"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x00bd:
            java.lang.String r1 = "sdkVersion"
            java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = m20586f()     // Catch:{ Exception -> 0x0244 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x00d5
            java.lang.String r3 = "language"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x00d5:
            java.lang.String r1 = m20587g()     // Catch:{ Exception -> 0x0244 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = "deviceOEM"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x00e4:
            java.lang.String r1 = m20588h()     // Catch:{ Exception -> 0x0244 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x00f3
            java.lang.String r3 = "deviceModel"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x00f3:
            java.lang.String r1 = r9.m20589i()     // Catch:{ Exception -> 0x0244 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x0102
            java.lang.String r3 = "mobileCarrier"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0102:
            long r5 = m20591k()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = "internalFreeMemory"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0244 }
            boolean r1 = m20590j()     // Catch:{ Exception -> 0x0244 }
            if (r1 == 0) goto L_0x0132
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0244 }
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0244 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0244 }
            int r1 = r3.getBlockSize()     // Catch:{ Exception -> 0x0244 }
            long r5 = (long) r1     // Catch:{ Exception -> 0x0244 }
            int r1 = r3.getAvailableBlocks()     // Catch:{ Exception -> 0x0244 }
            long r7 = (long) r1     // Catch:{ Exception -> 0x0244 }
            long r7 = r7 * r5
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r7 / r5
            goto L_0x0134
        L_0x0132:
            r7 = -1
        L_0x0134:
            java.lang.String r1 = "externalFreeMemory"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0244 }
            int r1 = r9.m20592l()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r3 = "battery"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0244 }
            int r1 = r9.m20593m()     // Catch:{ Exception -> 0x0244 }
            r3 = 840(0x348, float:1.177E-42)
            if (r1 > r3) goto L_0x015b
            r3 = -720(0xfffffffffffffd30, float:NaN)
            if (r1 < r3) goto L_0x015b
            int r3 = r1 % 15
            if (r3 != 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r2 = r4
        L_0x015c:
            if (r2 == 0) goto L_0x0167
            java.lang.String r2 = "gmtMinutesOffset"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0167:
            java.lang.String r1 = m20581a()     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x0176
            java.lang.String r2 = "pluginType"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0176:
            java.lang.String r1 = m20582b()     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x0185
            java.lang.String r2 = "pluginVersion"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0185:
            java.lang.String r1 = m20583c()     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x0194
            java.lang.String r2 = "plugin_fw_v"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x0194:
            boolean r1 = com.ironsource.environment.C6429h.m19326j()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x01a7
            java.lang.String r2 = "jb"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x01a7:
            com.ironsource.mediationsdk.J r1 = com.ironsource.mediationsdk.C6490J.m19474a()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = r1.f16549o     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x01b8
            java.lang.String r2 = "mt"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x01b8:
            android.content.Context r1 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r1)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x01cd
            java.lang.String r2 = "firstSession"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x01cd:
            android.content.Context r1 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = com.ironsource.environment.C6429h.m19350y(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x01de
            java.lang.String r2 = "auid"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x01de:
            java.lang.String r1 = "mcc"
            android.content.Context r2 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            int r2 = com.ironsource.environment.C6399a.C64001.m19223c((android.content.Context) r2)     // Catch:{ Exception -> 0x0244 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = "mnc"
            android.content.Context r2 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            int r2 = com.ironsource.environment.C6399a.C64001.m19226d(r2)     // Catch:{ Exception -> 0x0244 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0244 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0244 }
            android.content.Context r1 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            java.lang.String r1 = com.ironsource.environment.C6429h.m19325j(r1)     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x020d
            java.lang.String r2 = "icc"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x020d:
            java.lang.String r1 = com.ironsource.environment.C6429h.m19309c()     // Catch:{ Exception -> 0x0244 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x021c
            java.lang.String r2 = "tz"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0244 }
        L_0x021c:
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x0244 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
            java.lang.String r3 = "collecting data for events: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0244 }
            r2.append(r0)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0244 }
            r1.verbose(r2)     // Catch:{ Exception -> 0x0244 }
            com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6723e.m20496a()     // Catch:{ Exception -> 0x0244 }
            r1.mo36911a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ Exception -> 0x0244 }
            android.content.Context r0 = r9.f17705E     // Catch:{ Exception -> 0x0244 }
            com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C6723e.m20496a()     // Catch:{ Exception -> 0x0244 }
            org.json.JSONObject r1 = r1.mo36912b()     // Catch:{ Exception -> 0x0244 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveGeneralProperties(r0, r1)     // Catch:{ Exception -> 0x0244 }
            return
        L_0x0244:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Thread name = "
            r3.<init>(r4)
            java.lang.Class r4 = r9.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.logException(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6771h.run():void");
    }
}
