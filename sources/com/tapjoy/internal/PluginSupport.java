package com.tapjoy.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class PluginSupport {
    private PluginSupport() {
    }

    public static void trackUsage(String str, String str2, String str3) {
        TreeMap treeMap;
        C11452bh b;
        C11452bh b2;
        try {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(str2)) {
                treeMap = new TreeMap();
                b2 = C11452bh.m33266b(str2);
                b2.mo72210a((Map) treeMap);
                b2.close();
            } else {
                treeMap = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap = new HashMap();
                b = C11452bh.m33266b(str3);
                b.mo72223h();
                while (b.mo72225j()) {
                    hashMap.put(b.mo72227l(), Long.valueOf(b.mo72232q()));
                }
                b.mo72224i();
                b.close();
            }
            C11676gi.m33882a(str, (TreeMap<String, Object>) treeMap, (Map<String, Long>) hashMap);
        } catch (Exception unused) {
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }
}
