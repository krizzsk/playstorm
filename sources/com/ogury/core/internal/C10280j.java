package com.ogury.core.internal;

import com.amazon.aps.shared.util.APSSharedUtil;

/* renamed from: com.ogury.core.internal.j */
/* compiled from: _ArraysJvm.kt */
class C10280j extends C10279i {
    /* renamed from: a */
    public static <T, A extends Appendable> A m31127a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10216af<? super T, ? extends CharSequence> afVar) {
        C10219ai.m31036b(tArr, "$this$joinTo");
        C10219ai.m31036b(a, "buffer");
        C10219ai.m31036b(charSequence, "separator");
        C10219ai.m31036b(charSequence2, "prefix");
        C10219ai.m31036b(charSequence3, "postfix");
        C10219ai.m31036b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            boolean z = true;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C10219ai.m31036b(a, "$this$appendElement");
            if (afVar != null) {
                a.append((CharSequence) afVar.mo66754a(t));
            } else {
                if (t != null) {
                    z = t instanceof CharSequence;
                }
                if (z) {
                    a.append((CharSequence) t);
                } else if (t instanceof Character) {
                    a.append(((Character) t).charValue());
                } else {
                    a.append(String.valueOf(t));
                }
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m31128a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10216af afVar, int i2) {
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = APSSharedUtil.TRUNCATE_SEPARATOR;
        C10219ai.m31036b(objArr, "$this$joinToString");
        C10219ai.m31036b(charSequence, "separator");
        C10219ai.m31036b(charSequence5, "prefix");
        C10219ai.m31036b(charSequence6, "postfix");
        C10219ai.m31036b(charSequence7, "truncated");
        String sb = ((StringBuilder) C10278h.m31127a((T[]) objArr, new StringBuilder(), charSequence, charSequence5, charSequence6, -1, charSequence7, (C10216af) null)).toString();
        C10219ai.m31034a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
