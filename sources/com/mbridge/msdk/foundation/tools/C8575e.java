package com.mbridge.msdk.foundation.tools;

import android.content.Context;

/* renamed from: com.mbridge.msdk.foundation.tools.e */
/* compiled from: DomainSameDiTool */
public class C8575e {
    /* renamed from: a */
    public static void m24768a(Context context) {
        if (context != null) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry");
                Object newInstance = cls.newInstance();
                cls.getMethod("check", new Class[]{Context.class}).invoke(newInstance, new Object[]{context});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
