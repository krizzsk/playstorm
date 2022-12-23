package com.bytedance.mobsec.metasec.p089ov;

import android.content.Context;
import p398ms.p399bd.p400o.Pgl.C12398l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManagerUtils */
public final class PglMSManagerUtils {
    private PglMSManagerUtils() {
    }

    public static synchronized PglMSManager get(String str) {
        PglMSManager pglMSManager;
        synchronized (PglMSManagerUtils.class) {
            C12398l0.pgla a = C12398l0.m34676a(str);
            pglMSManager = a != null ? new PglMSManager(a) : null;
        }
        return pglMSManager;
    }

    public static synchronized boolean init(Context context, PglMSConfig pglMSConfig) {
        boolean a;
        synchronized (PglMSManagerUtils.class) {
            a = C12398l0.m34677a(context, pglMSConfig.mo16509a(), "Pglmetasec_ov", "ms_sensor_ov");
        }
        return a;
    }

    public static String versionInfo() {
        return C12398l0.m34675a();
    }
}
