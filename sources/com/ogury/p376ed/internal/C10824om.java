package com.ogury.p376ed.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.ed.internal.om */
class C10824om extends C10823ol {
    /* renamed from: a */
    public static final void m32854a(int i) {
    }

    /* renamed from: b */
    public static final C10784nh m32858b(CharSequence charSequence) {
        C10765mq.m32773b(charSequence, "$this$indices");
        return new C10784nh(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final int m32862c(CharSequence charSequence) {
        C10765mq.m32773b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    public static final String m32851a(CharSequence charSequence, C10784nh nhVar) {
        C10765mq.m32773b(charSequence, "$this$substring");
        C10765mq.m32773b(nhVar, SessionDescription.ATTR_RANGE);
        return charSequence.subSequence(nhVar.mo67876e().intValue(), nhVar.mo67877f().intValue() + 1).toString();
    }

    /* renamed from: c */
    public static final String m32865c(String str, String str2) {
        C10765mq.m32773b(str, "$this$substringAfterLast");
        C10765mq.m32773b(str2, "missingDelimiterValue");
        int d = C10814oc.m32845a((CharSequence) str, C10814oc.m32862c(str));
        if (d == -1) {
            return str2;
        }
        String substring = str.substring(d + 1, str.length());
        C10765mq.m32770a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final CharSequence m32850a(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C10765mq.m32773b(charSequence, "$this$replaceRange");
        C10765mq.m32773b(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C10765mq.m32770a((Object) sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C10765mq.m32770a((Object) sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: a */
    public static final boolean m32856a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C10765mq.m32773b(charSequence, "$this$regionMatchesImpl");
        C10765mq.m32773b(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C10801nw.m32817a(charSequence.charAt(i3 + 0), charSequence2.charAt(i + i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final int m32849a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C10765mq.m32773b(charSequence, "$this$indexOfAny");
        C10765mq.m32773b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C10786ni.m32810a(i);
            int c = C10814oc.m32862c(charSequence);
            if (a > c) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C10801nw.m32817a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == c) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C10686kg.m32638a(cArr), i);
        }
    }

    /* renamed from: a */
    public static final int m32848a(CharSequence charSequence, char[] cArr, int i) {
        C10765mq.m32773b(charSequence, "$this$lastIndexOfAny");
        C10765mq.m32773b(cArr, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(C10686kg.m32638a(cArr), i);
        }
        for (int b = C10786ni.m32812b(i, C10814oc.m32862c(charSequence)); b >= 0; b--) {
            char charAt = charSequence.charAt(b);
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    break;
                } else if (C10801nw.m32817a(cArr[i2], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return b;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m32857b(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        C10781nf nhVar = new C10784nh(C10786ni.m32810a(i), C10786ni.m32812b(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = nhVar.mo67867a();
            int b = nhVar.mo67868b();
            int c = nhVar.mo67869c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (!C10814oc.m32856a(charSequence2, charSequence, a, charSequence2.length(), z)) {
                if (a == b) {
                    return -1;
                }
                a += c;
            }
            return a;
        }
        int a2 = nhVar.mo67867a();
        int b2 = nhVar.mo67868b();
        int c2 = nhVar.mo67869c();
        if (c2 >= 0) {
            if (a2 > b2) {
                return -1;
            }
        } else if (a2 < b2) {
            return -1;
        }
        while (!C10814oc.m32842a((String) charSequence2, (String) charSequence, a2, charSequence2.length(), z)) {
            if (a2 == b2) {
                return -1;
            }
            a2 += c2;
        }
        return a2;
    }

    /* renamed from: a */
    public static final int m32847a(CharSequence charSequence, String str, int i, boolean z) {
        C10765mq.m32773b(charSequence, "$this$indexOf");
        C10765mq.m32773b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m32857b(charSequence, str, i, charSequence.length(), z);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: a */
    public static final int m32845a(CharSequence charSequence, int i) {
        C10765mq.m32773b(charSequence, "$this$lastIndexOf");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(46, i);
        }
        return C10814oc.m32848a(charSequence, new char[]{'.'}, i);
    }

    /* renamed from: a */
    public static final boolean m32855a(CharSequence charSequence, CharSequence charSequence2) {
        C10765mq.m32773b(charSequence, "$this$contains");
        C10765mq.m32773b(charSequence2, "other");
        return charSequence2 instanceof String ? C10814oc.m32847a(charSequence, (String) charSequence2, 0, false) >= 0 : m32857b(charSequence, charSequence2, 0, charSequence.length(), false) >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C10793np<C10784nh> m32864c(CharSequence charSequence, char[] cArr) {
        C10814oc.m32854a(0);
        return new C10808oa(charSequence, 0, new C10825a(cArr, false));
    }

    /* renamed from: com.ogury.ed.internal.om$a */
    static final class C10825a extends C10766mr implements C10741lv<CharSequence, Integer, C10678jz<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f27046a;

        /* renamed from: b */
        final /* synthetic */ boolean f27047b = false;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10825a(char[] cArr, boolean z) {
            super(2);
            this.f27046a = cArr;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67117a(Object obj, Object obj2) {
            return m32868a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        private C10678jz<Integer, Integer> m32868a(CharSequence charSequence, int i) {
            C10765mq.m32773b(charSequence, "$receiver");
            int a = C10814oc.m32849a(charSequence, this.f27046a, i, this.f27047b);
            if (a < 0) {
                return null;
            }
            return C10681kb.m32635a(Integer.valueOf(a), 1);
        }
    }

    /* renamed from: a */
    public static final List<String> m32853a(CharSequence charSequence, char[] cArr) {
        C10765mq.m32773b(charSequence, "$this$split");
        C10765mq.m32773b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m32859b(charSequence, String.valueOf(cArr[0]));
        }
        Iterable<C10784nh> a = C10794nq.m32815a(m32864c(charSequence, cArr));
        Collection arrayList = new ArrayList(C10692km.m32651a(a));
        for (C10784nh a2 : a) {
            arrayList.add(C10814oc.m32851a(charSequence, a2));
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private static final List<String> m32859b(CharSequence charSequence, String str) {
        C10814oc.m32854a(0);
        int a = C10814oc.m32847a(charSequence, str, 0, false);
        if (a == -1) {
            return C10692km.m32644a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, a).toString());
            i = str.length() + a;
            a = C10814oc.m32847a(charSequence, str, i, false);
        } while (a != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }
}
