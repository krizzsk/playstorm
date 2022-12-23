package com.apm.insight;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.p017f.C1225b;
import com.apm.insight.p021j.C1252b;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.C1379o;
import com.apm.insight.runtime.ConfigManager;
import java.util.HashMap;
import java.util.Map;

public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit = false;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String[] mPackageName;
        String mSSID;
        String[] mSoList;
        String mUID;
        long mVersionInt = -1;
        String mVersionStr;

        public Config() {
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            C1252b.m1604d();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C1252b.m1604d();
            return this;
        }

        public Config setPackageName(String str) {
            return setPackageName(str);
        }

        public Config setPackageName(String... strArr) {
            this.mPackageName = strArr;
            C1252b.m1604d();
            return this;
        }

        public Config setSSID(String str) {
            this.mSSID = str;
            C1252b.m1604d();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C1252b.m1604d();
            return this;
        }

        public Config setUID(String str) {
            this.mUID = str;
            C1252b.m1604d();
            return this;
        }
    }

    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    private MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        C1229g.m1494a(context, this);
    }

    private MonitorCrash(String str, long j, String str2, String... strArr) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = strArr;
        C1229g.m1495a(this);
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            C1379o.m2225a(context, true, true, true, true, 0);
            MonitorCrash monitorCrash = new MonitorCrash(context, str, j, str2);
            return monitorCrash;
        }
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        String str4 = str3;
        C1379o.m2225a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str4);
        monitorCrash.config().setPackageName(str4);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        String str4 = str3;
        C1379o.m2225a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str4);
        monitorCrash.config().setPackageName(str4).setSoList(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String... strArr) {
        C1379o.m2225a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String[] strArr, String[] strArr2) {
        C1379o.m2225a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr).setSoList(strArr2);
        return monitorCrash;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public Config config() {
        return this.mConfig;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        C1225b.m1481a(this, th, str, true, (Map<String, String>) null, str2, "core_exception_monitor");
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash setReportUrl(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int indexOf = str.indexOf("://");
        if (indexOf < 0) {
            i = 8;
            str = "https://" + str;
        } else {
            i = indexOf + 3;
        }
        int indexOf2 = str.indexOf("/", i);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        C1311q.m1870a((Object) "set url " + str);
        C1240h.m1560i().setLaunchCrashUrl(str + ConfigManager.EXCEPTION_URL_SUFFIX);
        C1240h.m1560i().setJavaCrashUploadUrl(str + ConfigManager.JAVA_URL_SUFFIX);
        C1240h.m1560i().setNativeCrashUrl(str + ConfigManager.NATIVE_URL_SUFFIX);
        C1240h.m1560i().setConfigUrl(str + ConfigManager.CONFIG_URL_SUFFIX);
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }
}
