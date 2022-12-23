package com.ogury.p376ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.ol */
class C10823ol extends C10822ok {
    /* renamed from: a */
    public static final String m32839a(String str, String str2, String str3) {
        C10765mq.m32773b(str, "$this$replaceFirst");
        C10765mq.m32773b(str2, "oldValue");
        C10765mq.m32773b(str3, "newValue");
        CharSequence charSequence = str;
        int a = C10814oc.m32846a(charSequence, str2);
        if (a < 0) {
            return str;
        }
        return C10814oc.m32850a(charSequence, a, str2.length() + a, (CharSequence) str3).toString();
    }

    /* renamed from: a */
    public static final boolean m32841a(String str, String str2) {
        C10765mq.m32773b(str, "$this$startsWith");
        C10765mq.m32773b(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: a */
    public static final boolean m32840a(CharSequence charSequence) {
        boolean z;
        C10765mq.m32773b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            Iterator it = C10814oc.m32858b(charSequence).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C10801nw.m32816a(charSequence.charAt(((C10721lb) it).mo67840a()))) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m32842a(String str, String str2, int i, int i2, boolean z) {
        C10765mq.m32773b(str, "$this$regionMatches");
        C10765mq.m32773b(str2, "other");
        if (!z) {
            return str.regionMatches(0, str2, i, i2);
        }
        return str.regionMatches(z, 0, str2, i, i2);
    }
}
