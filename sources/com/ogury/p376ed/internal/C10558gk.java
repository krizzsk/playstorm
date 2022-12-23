package com.ogury.p376ed.internal;

import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.gk */
public final class C10558gk {
    /* renamed from: a */
    public static final String m32091a(SharedPreferences sharedPreferences, String str, String str2) {
        C10765mq.m32773b(sharedPreferences, "<this>");
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        C10765mq.m32773b(str2, "defaultValue");
        String string = sharedPreferences.getString(str, str2);
        return string == null ? str2 : string;
    }
}
