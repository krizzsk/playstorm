package p009by.saygames;

import android.app.Activity;
import android.app.ActivityManager;
import com.unity3d.player.UnityPlayer;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: by.saygames.SayKitEvents */
public class SayKitEvents {
    public static int ApplicationStartTimestamp = -1;
    private static final HashSet<String> PRIORITY_EVENTS = new HashSet<>(Arrays.asList(new String[]{"app_start", "unity_engine", "crash_report", "level_completed", "level_failed", "level_started", "bonus_level_completed", "bonus_level_started", "bonus_level_failed", "iap_android", "interstitial_imp", "rewarded_imp"}));
    private static final String[] PRIORITY_PREFIXES = {"imp_", "ltv_"};
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    static SayKitEvents instance = null;
    private static ActivityManager mActivityManager = null;
    private static Boolean mTotalMemoryTracked = false;
    static String session = "";
    static long sessionUpdatedAt;
    public String appKey = "";
    public String device_id = "";
    public String device_name = "";
    public String device_os = "";
    SayEndpoint endpoint = new SayEndpoint(getActivity(), "SayKitEvents", SayEndpoint.getDefaultHandler());
    int hcurrency = 0;
    public String idfa = "";
    int level = 0;
    int lifetime = 0;
    int scurrency = 0;
    int segment = 0;
    int sequence = 0;
    String version = "";

    static SayKitEvents getInstance() {
        if (instance == null) {
            SayKitLog.Log("w", "SayKit", "Instantiate SayKitEvents");
            SayKitEvents sayKitEvents = new SayKitEvents();
            instance = sayKitEvents;
            sayKitEvents.endpoint.open();
            instance.endpoint.addSslPin("*.saygames.io", "sha256/4a6cPehI7OG6cuDZka5NDZ7FR8a60d3auda+sKfg4Ng=");
            instance.endpoint.autoFlush(5000);
        }
        return instance;
    }

    public static void init(String str, String str2, String str3, int i) {
        getInstance();
        mActivityManager = (ActivityManager) getActivity().getSystemService("activity");
        SayExceptionHandler.initUncaughtExceptionHandler();
        int appVersion = getAppVersion();
        track("android_build", appVersion, 0, "" + appVersion);
    }

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public static void trackFull(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, int i3, String str8, int i4, int i5, String str9, String str10, int i6, int i7, int i8, int i9) {
        String str11 = str;
        String str12 = str6;
        int i10 = i;
        SayKitEvents instance2 = getInstance();
        synchronized (instance2) {
            instance2.appKey = str11;
            instance2.idfa = str2;
            instance2.device_id = str3;
            instance2.device_os = str4;
            instance2.device_name = str5;
            if (i10 > 0) {
                instance2.version = str6 + "." + i10;
            } else {
                instance2.version = str12;
            }
            instance2.segment = i10;
            instance2.level = i6;
            instance2.scurrency = i7;
            instance2.hcurrency = i8;
            instance2.lifetime = i9;
        }
        SayKitExternalEventManager.SetDeviceId(str3);
        SayEndpoint sayEndpoint = instance2.endpoint;
        sayEndpoint.setUrl("https://track.saygames.io/events/" + str);
        instance2.trackEvent(str7, i2, i3, str8, i4, i5, str9, str10, false);
    }

    public static void track(String str, int i, int i2, String str2) {
        UpdateUnityPlayingTime();
        getInstance().trackEvent(str, i, i2, str2, 0, 0, "", "", false);
    }

    public static void track(String str, int i, int i2, int i3, String str2) {
        UpdateUnityPlayingTime();
        getInstance().trackEvent(str, i, i2, str2, i3, 0, "", "", false);
    }

    public static void track(String str, int i, int i2, String str2, String str3) {
        UpdateUnityPlayingTime();
        getInstance().trackEvent(str, i, i2, str2, 0, 0, str3, "", false);
    }

    public static void trackImmediately(String str, int i, int i2, String str2) {
        UpdateUnityPlayingTime();
        getInstance().trackEvent(str, i, i2, str2, 0, 0, "", "", true);
        getInstance().endpoint.flushRequests();
    }

    static String getSession() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - sessionUpdatedAt > 120000) {
            session = "";
            for (int i = 0; i < 16; i++) {
                session += "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt((int) (Math.random() * ((double) 62)));
            }
            SayKitExternalEventManager.SetSessionId(session);
        }
        sessionUpdatedAt = timeInMillis;
        return session;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0096 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trackEvent(java.lang.String r5, int r6, int r7, java.lang.String r8, int r9, int r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.text.SimpleDateFormat r1 = dateFormat
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.util.Date r2 = r2.getTime()
            java.lang.String r1 = r1.format(r2)
            monitor-enter(r4)
            int r2 = r4.sequence     // Catch:{ all -> 0x00b8 }
            r3 = 1
            int r2 = r2 + r3
            r4.sequence = r2     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "time"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "sequence"
            int r2 = r4.sequence     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "session"
            java.lang.String r2 = getSession()     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "idfa"
            java.lang.String r2 = r4.idfa     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "device_id"
            java.lang.String r2 = r4.device_id     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "device_os"
            java.lang.String r2 = r4.device_os     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "device_name"
            java.lang.String r2 = r4.device_name     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "version"
            java.lang.String r2 = r4.version     // Catch:{ Exception -> 0x0096 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "event"
            r0.put(r1, r5)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "tag"
            r0.put(r1, r12)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r12 = "param1"
            r0.put(r12, r6)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "param2"
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "extra"
            r0.put(r6, r8)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "param3"
            r0.put(r6, r9)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "param4"
            r0.put(r6, r10)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "extra2"
            r0.put(r6, r11)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "level"
            int r7 = r4.level     // Catch:{ Exception -> 0x0096 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "scurrency"
            int r7 = r4.scurrency     // Catch:{ Exception -> 0x0096 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "hcurrency"
            int r7 = r4.hcurrency     // Catch:{ Exception -> 0x0096 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "ptime"
            int r7 = r4.lifetime     // Catch:{ Exception -> 0x0096 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = "w"
            java.lang.String r7 = "SayKit"
            java.lang.String r8 = r0.toString()
            p009by.saygames.SayKitLog.Log(r6, r7, r8)
            if (r13 != 0) goto L_0x00ac
            boolean r5 = r4.isPriorityEvent(r5)
            if (r5 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            by.saygames.SayEndpoint r5 = r4.endpoint
            java.lang.String r6 = r0.toString()
            by.saygames.SayEndpoint$AppendWithNewLineBatching r7 = p009by.saygames.SayEndpoint.batch.appendWithNewLine
            r5.addBatchRequest(r6, r7, r3)
            return
        L_0x00b8:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p009by.saygames.SayKitEvents.trackEvent(java.lang.String, int, int, java.lang.String, int, int, java.lang.String, java.lang.String, boolean):void");
    }

    private boolean isPriorityEvent(String str) {
        if (PRIORITY_EVENTS.contains(str)) {
            return true;
        }
        for (String startsWith : PRIORITY_PREFIXES) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static int getApplicationStartTimestamp() {
        return ApplicationStartTimestamp;
    }

    private static void trackTotalMemory() {
        try {
            if (mActivityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                mActivityManager.getMemoryInfo(memoryInfo);
                track("total_memory", (int) (((double) memoryInfo.totalMem) / 1048576.0d), 0, "");
                mTotalMemoryTracked = true;
            }
        } catch (Exception e) {
            mTotalMemoryTracked = true;
            SayKitLog.Log("e", "Error", e.getMessage());
        }
    }

    public static void trackAvailableMemory() {
        try {
            if (!mTotalMemoryTracked.booleanValue()) {
                trackTotalMemory();
            }
            if (mActivityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                mActivityManager.getMemoryInfo(memoryInfo);
                track("free_memory", (int) (((double) memoryInfo.availMem) / 1048576.0d), 0, "");
            }
        } catch (Exception e) {
            SayKitLog.Log("e", "Error", e.getMessage());
        }
    }

    private static int getAppVersion() {
        try {
            String packageName = UnityPlayer.currentActivity.getApplicationContext().getPackageName();
            Class<?> cls = Class.forName(packageName + ".BuildConfig");
            Object newInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField("VERSION_CODE");
            declaredField.setAccessible(true);
            return declaredField.getInt(newInstance);
        } catch (Exception e) {
            SayKitLog.Log("i", "[SayKitVersion]", "Error getting VERSION_CODE ", e);
            return 0;
        }
    }

    public static void trackSDKVersions() {
        SayKitVersionManager.trackSDKVersions();
    }

    public static void trackNotificationStart() {
        if (SayKitNotifications.isAppLaunchedFromNotification) {
            track("notification_start", 0, 0, (SayKitNotifications.extraAppLaunchedFromNotification == null || SayKitNotifications.extraAppLaunchedFromNotification.isEmpty()) ? "" : SayKitNotifications.extraAppLaunchedFromNotification);
        }
    }

    static void UpdateUnityPlayingTime() {
        UnityPlayer.UnitySendMessage("SayKitBridje", "UpdatePlayingTime", "true");
    }
}
