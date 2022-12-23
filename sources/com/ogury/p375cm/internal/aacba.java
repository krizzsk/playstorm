package com.ogury.p375cm.internal;

import com.ogury.p375cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.aacba */
public final class aacba {

    /* renamed from: a */
    public static final aacba f25673a = new aacba();

    private aacba() {
    }

    /* renamed from: a */
    public static String m30671a(int i) {
        aacbb aacbb = aacbb.f25674a;
        String a = aacbb.m30673a(i);
        if (a != null) {
            String obj = bbcbc.m30992c(a).toString();
            if (obj != null) {
                String substring = obj.substring(1);
                bbabc.m30940a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
            throw new babca("null cannot be cast to non-null type java.lang.String");
        }
        throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public static String m30672a(String str) {
        bbabc.m30943b(str, "responseArray");
        int i = 0;
        Object[] array = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(str)).toArray(new Integer[0]);
        if (array != null) {
            int length = array.length;
            String str2 = "";
            while (i < length) {
                int intValue = ((Number) array[i]).intValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                aacbb aacbb = aacbb.f25674a;
                String a = aacbb.m30673a(intValue);
                if (a != null) {
                    sb.append(bbcbc.m30992c(a).toString());
                    str2 = sb.toString();
                    i++;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return str2;
        }
        throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
