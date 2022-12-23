package com.fyber.inneractive.sdk.serverapi;

import android.app.Application;
import android.app.NotificationManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4261a;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4327r;
import com.fyber.inneractive.sdk.config.C4344x;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5350l;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.File;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.serverapi.a */
public class C5298a {

    /* renamed from: a */
    public static final HashMap<String, Integer> f14102a = new C5299a();

    /* renamed from: b */
    public static final List<String> f14103b = Arrays.asList(new String[]{"POWER_SAVE_MODE_OPEN", "SmartModeStatus"});

    /* renamed from: com.fyber.inneractive.sdk.serverapi.a$a */
    public class C5299a extends HashMap<String, Integer> {
        public C5299a() {
            put("HUAWEI", 4);
            put("XIAOMI", 1);
        }
    }

    /* renamed from: a */
    public static String m16651a() {
        try {
            Intent registerReceiver = C5350l.f14216a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return "";
            }
            return m16652a(((float) (registerReceiver.getIntExtra("level", -1) * 100)) / ((float) registerReceiver.getIntExtra("scale", -1)));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m16652a(float f) {
        return f < 5.0f ? "1" : f <= 9.0f ? "2" : f <= 24.0f ? "3" : f <= 39.0f ? MBridgeConstans.DYNAMIC_VIEW_TYPE_ALTER_NATIVE_STR_4 : f <= 54.0f ? "5" : f <= 69.0f ? "6" : f <= 84.0f ? "7" : f <= 100.0f ? "8" : "";
    }

    /* renamed from: b */
    public static Long m16653b() {
        long j;
        C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
        d0Var.getClass();
        String str = "";
        try {
            String str2 = d0Var.f10603c.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j, TimeUnit.MILLISECONDS));
    }

    /* renamed from: d */
    public static Long m16655d() {
        try {
            Application application = C5350l.f14216a;
            return Long.valueOf((m16648a(application, true) + application.getCacheDir().getFreeSpace()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Long m16656e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert((long) Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r7.isRemovable() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r8 = m16648a(com.fyber.inneractive.sdk.util.C5350l.f14216a, false) / android.support.p003v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0051 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m16657f() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1048576(0x100000, double:5.180654E-318)
            r4 = 0
            r6 = 26
            if (r0 < r6) goto L_0x0061
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "storagestats"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x0072 }
            android.app.usage.StorageStatsManager r0 = (android.app.usage.StorageStatsManager) r0     // Catch:{ all -> 0x0072 }
            android.app.Application r6 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = "storage"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ all -> 0x0072 }
            android.os.storage.StorageManager r6 = (android.os.storage.StorageManager) r6     // Catch:{ all -> 0x0072 }
            java.util.List r6 = r6.getStorageVolumes()     // Catch:{ all -> 0x0072 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0028:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0072 }
            if (r7 == 0) goto L_0x0072
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0072 }
            android.os.storage.StorageVolume r7 = (android.os.storage.StorageVolume) r7     // Catch:{ all -> 0x0072 }
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0051 }
            if (r8 != 0) goto L_0x003d
            java.util.UUID r8 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ all -> 0x0051 }
            goto L_0x0049
        L_0x003d:
            java.lang.String r8 = r7.getUuid()     // Catch:{ all -> 0x0051 }
            byte[] r8 = r8.getBytes()     // Catch:{ all -> 0x0051 }
            java.util.UUID r8 = java.util.UUID.nameUUIDFromBytes(r8)     // Catch:{ all -> 0x0051 }
        L_0x0049:
            if (r8 == 0) goto L_0x0028
            long r8 = r0.getTotalBytes(r8)     // Catch:{ all -> 0x0051 }
            long r8 = r8 / r2
            goto L_0x005f
        L_0x0051:
            boolean r7 = r7.isRemovable()     // Catch:{ all -> 0x0028 }
            if (r7 == 0) goto L_0x0028
            android.app.Application r7 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ all -> 0x0028 }
            long r7 = m16648a(r7, r1)     // Catch:{ all -> 0x0028 }
            long r8 = r7 / r2
        L_0x005f:
            long r4 = r4 + r8
            goto L_0x0028
        L_0x0061:
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ all -> 0x0072 }
            long r6 = m16648a(r0, r1)     // Catch:{ all -> 0x0072 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x0072 }
            long r0 = r0.getTotalSpace()     // Catch:{ all -> 0x0072 }
            long r6 = r6 + r0
            long r4 = r6 / r2
        L_0x0072:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C5298a.m16657f():java.lang.Long");
    }

    /* renamed from: g */
    public static Boolean m16658g() {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        try {
            boolean z = false;
            if (Settings.System.getInt(C5350l.f14216a.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m16659h() {
        if (C5350l.m16763b("android.permission.BLUETOOTH") && Build.VERSION.SDK_INT >= 18) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) C5350l.f14216a.getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2) {
                    if (bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                        return null;
                    }
                }
                return Boolean.TRUE;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public static Boolean m16660i() {
        return Boolean.valueOf((C5350l.f14216a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    /* renamed from: j */
    public static Boolean m16661j() {
        try {
            Intent registerReceiver = C5350l.f14216a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = true;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("plugged", -1);
                if (!(intExtra == 1 || intExtra == 2)) {
                    if (intExtra == 4) {
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static Boolean m16662k() {
        try {
            boolean z = false;
            int ringerMode = ((AudioManager) C5350l.f14216a.getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static Boolean m16663l() {
        try {
            NotificationManager notificationManager = (NotificationManager) C5350l.f14216a.getSystemService("notification");
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
            return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static Boolean m16664m() {
        boolean z;
        try {
            AudioManager audioManager = (AudioManager) C5350l.f14216a.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                z = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        z = true;
                    }
                }
            } else {
                z = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static Boolean m16665n() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (!TextUtils.isEmpty(upperCase) && f14102a.containsKey(upperCase)) {
                try {
                    for (String str : f14103b) {
                        int i = Settings.System.getInt(C5350l.f14216a.getContentResolver(), str, -1);
                        if (i != -1 && (num = f14102a.get(upperCase)) != null) {
                            return Boolean.valueOf(num.intValue() == i);
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                return Boolean.valueOf(((PowerManager) C5350l.f14216a.getSystemService("power")).isPowerSaveMode());
            } else {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m16654c() {
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return "unity3d";
        } catch (Throwable unused) {
            return "native";
        }
    }

    /* renamed from: a */
    public static UnitDisplayType m16649a(String str) {
        C4345y yVar;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        C4344x a = C4261a.m13436a(str);
        if (a == null || a.f10743a.size() <= 0 || (yVar = a.f10743a.get(0)) == null) {
            return unitDisplayType;
        }
        C4262a0 a0Var = yVar.f10750f;
        C4327r rVar = yVar.f10747c;
        if (a0Var != null) {
            return a0Var.f10579j;
        }
        return rVar != null ? rVar.f10691b : unitDisplayType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m16648a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C5350l.m16761b()     // Catch:{ all -> 0x0025 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0025 }
            r2 = 19
            if (r1 < r2) goto L_0x0025
            r1 = 0
            java.io.File[] r1 = r3.getExternalFilesDirs(r1)     // Catch:{ all -> 0x0025 }
            int r1 = r1.length     // Catch:{ all -> 0x0025 }
            r2 = 2
            if (r1 < r2) goto L_0x0025
            java.lang.String r1 = "mounted"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "mounted_ro"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0025
        L_0x0023:
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x003c
            if (r4 == 0) goto L_0x0033
            java.io.File r3 = m16650a((android.content.Context) r3)     // Catch:{ all -> 0x003c }
            long r3 = r3.getFreeSpace()     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x0033:
            java.io.File r3 = m16650a((android.content.Context) r3)     // Catch:{ all -> 0x003c }
            long r3 = r3.getTotalSpace()     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r3 = 0
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.serverapi.C5298a.m16648a(android.content.Context, boolean):long");
    }

    /* renamed from: a */
    public static File m16650a(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        for (File file : context.getExternalCacheDirs()) {
            if (!Environment.isExternalStorageEmulated(file)) {
                return file;
            }
        }
        return null;
    }
}
