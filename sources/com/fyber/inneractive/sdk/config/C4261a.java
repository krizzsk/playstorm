package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.config.a */
public class C4261a {
    /* renamed from: a */
    public static C4344x m13436a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        Map<String, C4344x> map = iAConfigManager.f10536a;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return iAConfigManager.f10536a.get(str);
    }

    /* renamed from: b */
    public static C4345y m13439b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        Map<String, C4345y> map = iAConfigManager.f10537b;
        if (map != null && map.containsKey(str)) {
            return iAConfigManager.f10537b.get(str);
        }
        IAlog.m16701c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    /* renamed from: a */
    public static String m13437a() {
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return property + ".inner-active.mobi/simpleM2M/";
    }

    /* renamed from: b */
    public static String m13440b() {
        int i = C4273e.f10606a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (!TextUtils.isEmpty(property)) {
            return m13438a(property, "Event");
        }
        return "https://" + IAConfigManager.f10525J.f10544i.f10687g;
    }

    /* renamed from: a */
    public static String m13438a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
