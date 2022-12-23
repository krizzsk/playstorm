package com.ogury.p376ed.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.dc */
public final class C10430dc {

    /* renamed from: a */
    public static final C10430dc f26375a = new C10430dc();

    /* renamed from: b */
    private static final Bundle f26376b = new Bundle();

    private C10430dc() {
    }

    /* renamed from: a */
    public static void m31547a(String str, Boolean bool) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f26376b.putBoolean(str, bool.booleanValue());
        } else {
            m31553d(str);
        }
    }

    /* renamed from: a */
    public static void m31548a(String str, String str2) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        if (str2 != null) {
            f26376b.putString(str, str2);
        } else {
            m31553d(str);
        }
    }

    /* renamed from: a */
    public static Boolean m31546a(String str) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        if (m31552c(str)) {
            return Boolean.valueOf(f26376b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: b */
    public static String m31550b(String str) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        return f26376b.getString(str, (String) null);
    }

    /* renamed from: b */
    public static String m31551b(String str, String str2) {
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        C10765mq.m32773b(str2, "defaultValue");
        String string = f26376b.getString(str, str2);
        C10765mq.m32770a((Object) string, "extraAdConfigurations.getString(key, defaultValue)");
        return string;
    }

    /* renamed from: c */
    private static boolean m31552c(String str) {
        C10765mq.m32773b(str, "configurationKey");
        return f26376b.containsKey(str);
    }

    /* renamed from: d */
    private static void m31553d(String str) {
        C10765mq.m32773b(str, "configurationKey");
        f26376b.remove(str);
    }

    /* renamed from: a */
    public static boolean m31549a() {
        return C10765mq.m32772a((Object) m31546a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE) || C10765mq.m32772a((Object) m31546a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
    }
}
