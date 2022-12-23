package com.ogury.p375cm.internal;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ogury.p375cm.ConsentActivity;
import java.util.Iterator;

/* renamed from: com.ogury.cm.internal.bbbbb */
public final class bbbbb {
    /* renamed from: a */
    public static <T, R> bbbba<R> m30955a(bbbba<? extends T> bbbba, bbaab<? super T, ? extends R> bbaab) {
        bbabc.m30943b(bbbba, "receiver$0");
        bbabc.m30943b(bbaab, "transform");
        return new bbbca<>(bbbba, bbaab);
    }

    /* renamed from: a */
    private static <T, A extends Appendable> A m30956a(bbbba<? extends T> bbbba, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab<? super T, ? extends CharSequence> bbaab) {
        bbabc.m30943b(bbbba, "receiver$0");
        bbabc.m30943b(a, "buffer");
        bbabc.m30943b(charSequence, "separator");
        bbabc.m30943b(charSequence2, "prefix");
        bbabc.m30943b(charSequence3, "postfix");
        bbabc.m30943b(charSequence4, "truncated");
        a.append(charSequence2);
        Iterator<? extends T> a2 = bbbba.mo66713a();
        int i2 = 0;
        while (a2.hasNext()) {
            Object next = a2.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            bbcbc.m30977a((Appendable) a, next, (bbaab) null);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m30957a(bbbba bbbba, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab bbaab, int i2, Object obj) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = APSSharedUtil.TRUNCATE_SEPARATOR;
        bbabc.m30943b(bbbba, "receiver$0");
        bbabc.m30943b(charSequence, "separator");
        bbabc.m30943b(charSequence5, "prefix");
        bbabc.m30943b(charSequence6, "postfix");
        bbabc.m30943b(charSequence7, "truncated");
        String sb = ((StringBuilder) m30956a(bbbba, new StringBuilder(), charSequence, charSequence5, charSequence6, -1, charSequence7, (bbaab) null)).toString();
        bbabc.m30940a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static boolean m30958a(Context context) {
        bbabc.m30943b(context, "context");
        return ConsentActivity.aaaaa.m30522b(context);
    }
}
