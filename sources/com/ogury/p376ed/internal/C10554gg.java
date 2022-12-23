package com.ogury.p376ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.gg */
public final class C10554gg {
    /* renamed from: a */
    public static final int m32083a(Map<String, String> map, String str) {
        C10765mq.m32773b(map, "<this>");
        C10765mq.m32773b(str, SDKConstants.PARAM_KEY);
        String str2 = map.get(str);
        if (str2 != null) {
            return Integer.parseInt(str2);
        }
        throw new IllegalStateException(("Key " + str + " not found in map").toString());
    }
}
