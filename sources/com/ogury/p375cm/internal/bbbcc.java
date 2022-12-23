package com.ogury.p375cm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbcc */
final class bbbcc implements bbbba<bbbac> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f25949a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f25950b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f25951c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final bbaac<CharSequence, Integer, babbc<Integer, Integer>> f25952d;

    /* renamed from: com.ogury.cm.internal.bbbcc$aaaaa */
    public static final class aaaaa implements Iterator<bbbac> {

        /* renamed from: a */
        final /* synthetic */ bbbcc f25953a;

        /* renamed from: b */
        private int f25954b = -1;

        /* renamed from: c */
        private int f25955c;

        /* renamed from: d */
        private int f25956d;

        /* renamed from: e */
        private bbbac f25957e;

        /* renamed from: f */
        private int f25958f;

        aaaaa(bbbcc bbbcc) {
            this.f25953a = bbbcc;
            int d = bbbcc.f25950b;
            int length = bbbcc.f25949a.length();
            if (length >= 0) {
                if (d < 0) {
                    d = 0;
                } else if (d > length) {
                    d = length;
                }
                this.f25955c = d;
                this.f25956d = d;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p375cm.internal.bbbcc.m30962a(r6.f25953a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m30967a() {
            /*
                r6 = this;
                int r0 = r6.f25956d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f25954b = r1
                r0 = 0
                r6.f25957e = r0
                return
            L_0x000b:
                com.ogury.cm.internal.bbbcc r0 = r6.f25953a
                int r0 = r0.f25951c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f25958f
                int r0 = r0 + r3
                r6.f25958f = r0
                com.ogury.cm.internal.bbbcc r4 = r6.f25953a
                int r4 = r4.f25951c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f25956d
                com.ogury.cm.internal.bbbcc r4 = r6.f25953a
                java.lang.CharSequence r4 = r4.f25949a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f25955c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f25953a
                java.lang.CharSequence r4 = r4.f25949a
                int r4 = com.ogury.p375cm.internal.bbcbc.m30991b(r4)
                r1.<init>(r0, r4)
            L_0x0041:
                r6.f25957e = r1
            L_0x0043:
                r6.f25956d = r2
                goto L_0x0096
            L_0x0046:
                com.ogury.cm.internal.bbbcc r0 = r6.f25953a
                com.ogury.cm.internal.bbaac r0 = r0.f25952d
                com.ogury.cm.internal.bbbcc r4 = r6.f25953a
                java.lang.CharSequence r4 = r4.f25949a
                int r5 = r6.f25956d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo66720a(r4, r5)
                com.ogury.cm.internal.babbc r0 = (com.ogury.p375cm.internal.babbc) r0
                if (r0 != 0) goto L_0x0072
                int r0 = r6.f25955c
                com.ogury.cm.internal.bbbac r1 = new com.ogury.cm.internal.bbbac
                com.ogury.cm.internal.bbbcc r4 = r6.f25953a
                java.lang.CharSequence r4 = r4.f25949a
                int r4 = com.ogury.p375cm.internal.bbcbc.m30991b(r4)
                r1.<init>(r0, r4)
                goto L_0x0041
            L_0x0072:
                java.lang.Object r2 = r0.mo66669c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo66670d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f25955c
                com.ogury.cm.internal.bbbac r4 = com.ogury.p375cm.internal.bbbaa.aaaaa.m30950a(r4, r2)
                r6.f25957e = r4
                int r2 = r2 + r0
                r6.f25955c = r2
                if (r0 != 0) goto L_0x0094
                r1 = r3
            L_0x0094:
                int r2 = r2 + r1
                goto L_0x0043
            L_0x0096:
                r6.f25954b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p375cm.internal.bbbcc.aaaaa.m30967a():void");
        }

        public final boolean hasNext() {
            if (this.f25954b == -1) {
                m30967a();
            }
            return this.f25954b == 1;
        }

        public final /* synthetic */ Object next() {
            if (this.f25954b == -1) {
                m30967a();
            }
            if (this.f25954b != 0) {
                bbbac bbbac = this.f25957e;
                if (bbbac != null) {
                    this.f25957e = null;
                    this.f25954b = -1;
                    return bbbac;
                }
                throw new babca("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bbbcc(CharSequence charSequence, int i, int i2, bbaac<? super CharSequence, ? super Integer, babbc<Integer, Integer>> bbaac) {
        bbabc.m30943b(charSequence, "input");
        bbabc.m30943b(bbaac, "getNextMatch");
        this.f25949a = charSequence;
        this.f25952d = bbaac;
    }

    /* renamed from: a */
    public final Iterator<bbbac> mo66713a() {
        return new aaaaa(this);
    }
}
