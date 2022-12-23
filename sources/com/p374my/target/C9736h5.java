package com.p374my.target;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.h5 */
public abstract class C9736h5 {
    private final Map<String, String> map = new HashMap();

    public static boolean checkPermission(String str, Context context) {
        int i;
        try {
            i = context.checkCallingOrSelfPermission(str);
        } catch (Throwable th) {
            C9672e0.m27882a("unable to check " + str + " permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method: " + th.getMessage());
            i = -1;
        }
        return i == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean addParam(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000a
            r2 = 0
        L_0x0008:
            monitor-exit(r1)
            return r2
        L_0x000a:
            if (r3 != 0) goto L_0x0012
            boolean r2 = r1.removeParam(r2)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return r2
        L_0x0012:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.map     // Catch:{ all -> 0x0019 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0019 }
            r2 = 1
            goto L_0x0008
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9736h5.addParam(java.lang.String, java.lang.String):boolean");
    }

    public synchronized void addParams(Map<String, String> map2) {
        this.map.putAll(map2);
    }

    public abstract void collectData(Context context);

    public synchronized Map<String, String> getData() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.putAll(this.map);
        return hashMap;
    }

    public synchronized Map<String, String> getMap() {
        return this.map;
    }

    public synchronized String getParam(String str) {
        return this.map.get(str);
    }

    public synchronized void putDataTo(Map<String, String> map2) {
        map2.putAll(this.map);
    }

    public synchronized void removeAll() {
        this.map.clear();
    }

    public synchronized boolean removeParam(String str) {
        boolean z;
        if (this.map.containsKey(str)) {
            this.map.remove(str);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
