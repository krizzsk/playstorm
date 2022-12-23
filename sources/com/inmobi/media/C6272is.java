package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.inmobi.media.is */
/* compiled from: FileManager */
public final class C6272is {

    /* renamed from: a */
    private static final String f15881a = C6272is.class.getSimpleName();

    /* renamed from: a */
    public static boolean m18745a(Context context) {
        for (String str : Arrays.asList(new String[]{"carbpreference", "IMAdMLtvpRuleCache", "inmobiAppAnalyticsSession", "aeskeygenerate", "impref", "IMAdTrackerStatusUpload", "IMAdMMediationCache", "inmobiAppAnalyticsAppId", "inmobiAppAnalyticsSession", "inmobisdkaid", "IMAdTrackerStatusUpload", "testAppPref"})) {
            File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + str + ".xml");
            if (file.exists()) {
                file.delete();
            }
        }
        List<String> asList = Arrays.asList(new String[]{C6216hf.m18494a("carb_store"), C6216hf.m18494a("aes_key_store"), C6216hf.m18494a("mraid_js_store"), C6216hf.m18494a("omid_js_store"), C6216hf.m18494a("user_info_store"), C6216hf.m18494a("coppa_store"), C6216hf.m18494a("gesture_info_store"), C6216hf.m18494a("unified_id_info_store"), C6216hf.m18494a("app_bundle_store")});
        if (Build.VERSION.SDK_INT >= 24) {
            for (String deleteSharedPreferences : asList) {
                context.deleteSharedPreferences(deleteSharedPreferences);
            }
        } else {
            for (String str2 : asList) {
                File file2 = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + str2 + ".xml");
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
        for (String str3 : Arrays.asList(new String[]{"inmobi.cache", "inmobi.cache.data", "inmobi.cache.data.events.number", "inmobi.cache.data.events.timestamp"})) {
            if (context.getCacheDir() != null) {
                File file3 = new File(context.getCacheDir(), str3);
                if (file3.exists()) {
                    file3.delete();
                }
            }
        }
        for (String str4 : Arrays.asList(new String[]{"eventlog", "imai_click_events"})) {
            if (context.getDir("data", 0) != null) {
                File file4 = new File(context.getDir("data", 0), str4);
                if (file4.exists()) {
                    file4.delete();
                }
            }
        }
        if (m18747b(context).size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m18746a(Context context, String str) {
        File databasePath = context.getDatabasePath(str);
        return databasePath == null || !databasePath.exists() || context.deleteDatabase(str);
    }

    /* renamed from: b */
    public static List<String> m18747b(Context context) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add("adcache.db");
        hashSet.add("appengage.db");
        hashSet.add("im.db");
        hashSet.add("ltvp.db");
        hashSet.add("analytics.db");
        hashSet.add("com.im.db");
        hashSet.add("IMInitialization.db");
        String[] databaseList = context.databaseList();
        if (databaseList != null && databaseList.length > 0) {
            for (String str : databaseList) {
                if (hashSet.contains(str) && !m18746a(context, str)) {
                    arrayList.add(str);
                } else if (str.matches("com\\.im_([0-9]+\\.){3}db") && !str.equals(C6214hd.f15741a) && !m18746a(context, str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m18744a(File file) {
        try {
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            m18744a(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static long m18743a(String str) {
        try {
            File file = new File(Uri.parse(str).getPath());
            if (file.exists()) {
                return file.length();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
