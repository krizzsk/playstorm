package com.ogury.p376ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cc */
public final class C10392cc {
    /* renamed from: a */
    public static final String m31455a(Activity activity) {
        C10765mq.m32773b(activity, "<this>");
        String a = m31456a((Object) activity);
        List b = C10814oc.m32860b((CharSequence) a, new char[]{'.'});
        if (b.size() <= 2) {
            return a;
        }
        return ((String) b.get(0)) + '.' + ((String) b.get(1)) + '.';
    }

    /* renamed from: a */
    public static final String m31456a(Object obj) {
        C10765mq.m32773b(obj, "<this>");
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String name = obj.getClass().getName();
        C10765mq.m32770a((Object) name, "this.javaClass.name");
        return name;
    }
}
