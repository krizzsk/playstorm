package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.az */
/* compiled from: StringsJVM.kt */
class C10238az extends C10237ay {
    /* renamed from: a */
    public static /* synthetic */ boolean m31054a(String str, String str2, boolean z, int i) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static int m31050a(CharSequence charSequence) {
        C10219ai.m31036b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: a */
    private static /* synthetic */ int m31052a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        boolean z3;
        boolean z4;
        C10225ao aqVar = new C10228aq(C10230ar.m31045a(i, 0), C10230ar.m31046b(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = aqVar.mo66781a();
            int b = aqVar.mo66782b();
            int c = aqVar.mo66783c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (true) {
                int length = charSequence2.length();
                C10219ai.m31036b(charSequence2, "$this$regionMatchesImpl");
                C10219ai.m31036b(charSequence, "other");
                if (a >= 0 && charSequence2.length() - length >= 0 && a <= charSequence.length() - length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z3 = true;
                            break;
                        } else if (!C10231as.m31049a(charSequence2.charAt(i4 + 0), charSequence.charAt(a + i4), z)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    return a;
                }
                if (a == b) {
                    return -1;
                }
                a += c;
            }
        } else {
            int a2 = aqVar.mo66781a();
            int b2 = aqVar.mo66782b();
            int c2 = aqVar.mo66783c();
            if (c2 >= 0) {
                if (a2 > b2) {
                    return -1;
                }
            } else if (a2 < b2) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                String str2 = (String) charSequence;
                int length2 = charSequence2.length();
                C10219ai.m31036b(str, "$this$regionMatches");
                C10219ai.m31036b(str2, "other");
                if (!z) {
                    z4 = str.regionMatches(0, str2, a2, length2);
                } else {
                    z4 = str.regionMatches(z, 0, str2, a2, length2);
                }
                if (z4) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 += c2;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m31051a(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C10219ai.m31036b(charSequence, "$this$indexOf");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(46, i);
        }
        char[] cArr = {'.'};
        C10219ai.m31036b(charSequence, "$this$indexOfAny");
        C10219ai.m31036b(cArr, "chars");
        if (charSequence instanceof String) {
            C10219ai.m31036b(cArr, "$this$single");
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        int a = C10230ar.m31045a(i, 0);
        int a2 = C10234av.m31050a(charSequence);
        if (a > a2) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a);
            int i3 = 0;
            while (true) {
                if (i3 > 0) {
                    z2 = false;
                    break;
                } else if (C10231as.m31049a(cArr[i3], charAt, false)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return a;
            }
            if (a == a2) {
                return -1;
            }
            a++;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m31053a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        int i2;
        C10219ai.m31036b(charSequence, "$this$contains");
        C10219ai.m31036b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            String str = (String) charSequence2;
            C10219ai.m31036b(charSequence, "$this$indexOf");
            C10219ai.m31036b(str, "string");
            if (!(charSequence instanceof String)) {
                i2 = m31052a(charSequence, str, 0, charSequence.length(), false, false, 16);
            } else {
                i2 = ((String) charSequence).indexOf(str, 0);
            }
            return i2 >= 0;
        }
        return m31052a(charSequence, charSequence2, 0, charSequence.length(), false, false, 16) >= 0;
    }
}
