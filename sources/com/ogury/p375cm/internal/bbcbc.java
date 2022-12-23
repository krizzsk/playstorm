package com.ogury.p375cm.internal;

import com.ogury.p375cm.internal.bacab;
import com.ogury.p375cm.internal.bbcbb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ogury.cm.internal.bbcbc */
public final class bbcbc extends bbcbb.aaaaa {

    /* renamed from: com.ogury.cm.internal.bbcbc$aaaaa */
    static final class aaaaa extends bbaca implements bbaac<CharSequence, Integer, babbc<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f25970a;

        /* renamed from: b */
        final /* synthetic */ boolean f25971b = false;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(List list, boolean z) {
            super(2);
            this.f25970a = list;
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x015d A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object mo66720a(java.lang.Object r18, java.lang.Object r19) {
            /*
                r17 = this;
                r0 = r17
                r7 = r18
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r1 = r19
                java.lang.Number r1 = (java.lang.Number) r1
                int r3 = r1.intValue()
                java.lang.String r1 = "receiver$0"
                com.ogury.p375cm.internal.bbabc.m30943b(r7, r1)
                java.util.List r2 = r0.f25970a
                r8 = r2
                java.util.Collection r8 = (java.util.Collection) r8
                boolean r15 = r0.f25971b
                r2 = 0
                r16 = 0
                if (r15 != 0) goto L_0x0096
                int r4 = r8.size()
                r5 = 1
                if (r4 != r5) goto L_0x0096
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                com.ogury.p375cm.internal.bbabc.m30943b(r8, r1)
                boolean r4 = r8 instanceof java.util.List
                if (r4 == 0) goto L_0x0055
                java.util.List r8 = (java.util.List) r8
                com.ogury.p375cm.internal.bbabc.m30943b(r8, r1)
                int r1 = r8.size()
                if (r1 == 0) goto L_0x004b
                if (r1 != r5) goto L_0x0041
                java.lang.Object r1 = r8.get(r2)
                goto L_0x006a
            L_0x0041:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "List has more than one element."
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x004b:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "List is empty."
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x0055:
                java.util.Iterator r1 = r8.iterator()
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x008c
                java.lang.Object r2 = r1.next()
                boolean r1 = r1.hasNext()
                if (r1 != 0) goto L_0x0082
                r1 = r2
            L_0x006a:
                r8 = r1
                java.lang.String r8 = (java.lang.String) r8
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r7
                r2 = r8
                int r1 = com.ogury.p375cm.internal.bbcbc.m30984a((java.lang.CharSequence) r1, (java.lang.String) r2, (int) r3, (boolean) r4, (int) r5, (java.lang.Object) r6)
                if (r1 < 0) goto L_0x0142
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.ogury.cm.internal.babbc r1 = com.ogury.p375cm.ConsentActivity.aaaaa.m30518a(r1, r8)
                goto L_0x0144
            L_0x0082:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Collection has more than one element."
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x008c:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "Collection is empty."
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x0096:
                if (r3 >= 0) goto L_0x0099
                r3 = r2
            L_0x0099:
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                int r2 = r7.length()
                r1.<init>(r3, r2)
                com.ogury.cm.internal.bbbaa r1 = (com.ogury.p375cm.internal.bbbaa) r1
                boolean r2 = r7 instanceof java.lang.String
                if (r2 == 0) goto L_0x00f3
                int r2 = r1.mo66724a()
                int r3 = r1.mo66725b()
                int r1 = r1.mo66726c()
                if (r1 <= 0) goto L_0x00b9
                if (r2 > r3) goto L_0x0142
                goto L_0x00bb
            L_0x00b9:
                if (r2 < r3) goto L_0x0142
            L_0x00bb:
                r4 = r8
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x00c2:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x00e0
                java.lang.Object r5 = r4.next()
                r9 = r5
                java.lang.String r9 = (java.lang.String) r9
                r10 = 0
                r11 = r7
                java.lang.String r11 = (java.lang.String) r11
                int r13 = r9.length()
                r12 = r2
                r14 = r15
                boolean r6 = com.ogury.p375cm.internal.bbcbc.m30980a((java.lang.String) r9, (int) r10, (java.lang.String) r11, (int) r12, (int) r13, (boolean) r14)
                if (r6 == 0) goto L_0x00c2
                goto L_0x00e2
            L_0x00e0:
                r5 = r16
            L_0x00e2:
                java.lang.String r5 = (java.lang.String) r5
                if (r5 == 0) goto L_0x00ef
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                com.ogury.cm.internal.babbc r1 = com.ogury.p375cm.ConsentActivity.aaaaa.m30518a(r1, r5)
                goto L_0x0144
            L_0x00ef:
                if (r2 == r3) goto L_0x0142
                int r2 = r2 + r1
                goto L_0x00bb
            L_0x00f3:
                int r2 = r1.mo66724a()
                int r9 = r1.mo66725b()
                int r10 = r1.mo66726c()
                if (r10 <= 0) goto L_0x0104
                if (r2 > r9) goto L_0x0142
                goto L_0x0106
            L_0x0104:
                if (r2 < r9) goto L_0x0142
            L_0x0106:
                r11 = r2
            L_0x0107:
                r1 = r8
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r12 = r1.iterator()
            L_0x010e:
                boolean r1 = r12.hasNext()
                if (r1 == 0) goto L_0x012f
                java.lang.Object r13 = r12.next()
                r1 = r13
                java.lang.String r1 = (java.lang.String) r1
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3 = 0
                int r5 = r1.length()
                r1 = r2
                r2 = r3
                r3 = r7
                r4 = r11
                r6 = r15
                boolean r1 = com.ogury.p375cm.internal.bbcbc.m30989a((java.lang.CharSequence) r1, (int) r2, (java.lang.CharSequence) r3, (int) r4, (int) r5, (boolean) r6)
                if (r1 == 0) goto L_0x010e
                goto L_0x0131
            L_0x012f:
                r13 = r16
            L_0x0131:
                java.lang.String r13 = (java.lang.String) r13
                if (r13 == 0) goto L_0x013e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                com.ogury.cm.internal.babbc r1 = com.ogury.p375cm.ConsentActivity.aaaaa.m30518a(r1, r13)
                goto L_0x0144
            L_0x013e:
                if (r11 == r9) goto L_0x0142
                int r11 = r11 + r10
                goto L_0x0107
            L_0x0142:
                r1 = r16
            L_0x0144:
                if (r1 == 0) goto L_0x015d
                java.lang.Object r2 = r1.mo66667a()
                java.lang.Object r1 = r1.mo66668b()
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.ogury.cm.internal.babbc r1 = com.ogury.p375cm.ConsentActivity.aaaaa.m30518a(r2, r1)
                return r1
            L_0x015d:
                return r16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p375cm.internal.bbcbc.aaaaa.mo66720a(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ogury.cm.internal.bbcbc$aaaab */
    static final class aaaab extends bbaca implements bbaab<bbbac, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f25972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(CharSequence charSequence) {
            super(1);
            this.f25972a = charSequence;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66506a(Object obj) {
            bbbac bbbac = (bbbac) obj;
            bbabc.m30943b(bbbac, "it");
            return bbcbc.m30986a(this.f25972a, bbbac);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m30982a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        bbabc.m30943b(charSequence, "receiver$0");
        boolean z3 = charSequence instanceof String;
        if (z3) {
            return ((String) charSequence).indexOf(46, i);
        }
        char[] cArr = {'.'};
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(cArr, "chars");
        if (z3) {
            bbabc.m30943b(cArr, "receiver$0");
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int b = m30991b(charSequence);
        if (i > b) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 > 0) {
                    z2 = false;
                    break;
                } else if (bbcbb.aaaaa.m30978a(cArr[i3], charAt, false)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return i;
            }
            if (i == b) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: a */
    private static int m30983a(CharSequence charSequence, String str, int i, boolean z) {
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(str, "string");
        boolean z2 = charSequence instanceof String;
        if (z2) {
            return ((String) charSequence).indexOf(str, i);
        }
        CharSequence charSequence2 = str;
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        bbbaa bbbac = new bbbac(i, length);
        if (!z2 || !(charSequence2 instanceof String)) {
            int a = bbbac.mo66724a();
            int b = bbbac.mo66725b();
            int c = bbbac.mo66726c();
            if (c > 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (true) {
                if (m30989a(charSequence2, 0, charSequence, a, charSequence2.length(), false)) {
                    return a;
                }
                if (a == b) {
                    return -1;
                }
                a += c;
            }
        } else {
            int a2 = bbbac.mo66724a();
            int b2 = bbbac.mo66725b();
            int c2 = bbbac.mo66726c();
            if (c2 > 0) {
                if (a2 > b2) {
                    return -1;
                }
            } else if (a2 < b2) {
                return -1;
            }
            while (true) {
                if (m30980a((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), false)) {
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
    public static /* synthetic */ int m30984a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m30983a(charSequence, str, i, false);
    }

    /* renamed from: a */
    static /* synthetic */ bbbba m30985a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        return new bbbcc(charSequence, 0, 0, new aaaaa(bacab.aaaaa.m30919a((T[]) strArr), false));
    }

    /* renamed from: a */
    public static final String m30986a(CharSequence charSequence, bbbac bbbac) {
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(bbbac, SessionDescription.ATTR_RANGE);
        return charSequence.subSequence(bbbac.mo66724a(), bbbac.mo66725b() + 1).toString();
    }

    /* renamed from: a */
    public static /* synthetic */ String m30987a(String str, String str2, String str3, int i, Object obj) {
        bbabc.m30943b(str, "receiver$0");
        bbabc.m30943b(str2, TtmlNode.RUBY_DELIMITER);
        bbabc.m30943b(str, "missingDelimiterValue");
        int a = m30984a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str;
        }
        String substring = str.substring(a + str2.length(), str.length());
        bbabc.m30940a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ List m30988a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(strArr, "delimiters");
        String str = strArr[0];
        if (!(str.length() == 0)) {
            int a = m30983a(charSequence, str, 0, false);
            if (a == -1) {
                return bacab.aaaaa.m30918a(charSequence.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(charSequence.subSequence(i3, a).toString());
                i3 = str.length() + a;
                a = m30983a(charSequence, str, i3, false);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        bbbba a2 = m30985a(charSequence, strArr, 0, false, 0, 2, (Object) null);
        bbabc.m30943b(a2, "receiver$0");
        Iterable<bbbac> bbbbc = new bbbbc(a2);
        bbabc.m30943b(bbbbc, "receiver$0");
        Collection arrayList2 = new ArrayList(10);
        for (bbbac a3 : bbbbc) {
            arrayList2.add(m30986a(charSequence, a3));
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    public static final boolean m30989a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(charSequence2, "other");
        if (i2 < 0 || charSequence.length() - i3 < 0 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!bbcbb.aaaaa.m30978a(charSequence.charAt(i4 + 0), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m30990a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        bbabc.m30943b(charSequence, "receiver$0");
        bbabc.m30943b(charSequence2, "other");
        return m30984a(charSequence, (String) charSequence2, 0, false, 2, (Object) null) >= 0;
    }

    /* renamed from: b */
    public static final int m30991b(CharSequence charSequence) {
        bbabc.m30943b(charSequence, "receiver$0");
        return charSequence.length() - 1;
    }

    /* renamed from: c */
    public static CharSequence m30992c(CharSequence charSequence) {
        bbabc.m30943b(charSequence, "receiver$0");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        bbabc.m30940a((Object) reverse, "StringBuilder(this).reverse()");
        return reverse;
    }
}
