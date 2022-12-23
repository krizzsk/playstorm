package com.ogury.p376ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.oa */
final class C10808oa implements C10793np<C10784nh> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f27031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f27032b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f27033c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10741lv<CharSequence, Integer, C10678jz<Integer, Integer>> f27034d;

    public C10808oa(CharSequence charSequence, int i, C10741lv<? super CharSequence, ? super Integer, C10678jz<Integer, Integer>> lvVar) {
        C10765mq.m32773b(charSequence, "input");
        C10765mq.m32773b(lvVar, "getNextMatch");
        this.f27031a = charSequence;
        this.f27034d = lvVar;
    }

    /* renamed from: com.ogury.ed.internal.oa$a */
    public static final class C10809a implements C10772mx, Iterator<C10784nh> {

        /* renamed from: a */
        final /* synthetic */ C10808oa f27035a;

        /* renamed from: b */
        private int f27036b = -1;

        /* renamed from: c */
        private int f27037c;

        /* renamed from: d */
        private int f27038d;

        /* renamed from: e */
        private C10784nh f27039e;

        /* renamed from: f */
        private int f27040f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C10809a(C10808oa oaVar) {
            this.f27035a = oaVar;
            int c = C10786ni.m32813c(oaVar.f27032b, oaVar.f27031a.length());
            this.f27037c = c;
            this.f27038d = c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
            if (r0 < com.ogury.p376ed.internal.C10808oa.m32830a(r6.f27035a)) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m32835a() {
            /*
                r6 = this;
                int r0 = r6.f27038d
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f27036b = r1
                r0 = 0
                r6.f27039e = r0
                return
            L_0x000b:
                com.ogury.ed.internal.oa r0 = r6.f27035a
                int r0 = r0.f27033c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0022
                int r0 = r6.f27040f
                int r0 = r0 + r3
                r6.f27040f = r0
                com.ogury.ed.internal.oa r4 = r6.f27035a
                int r4 = r4.f27033c
                if (r0 >= r4) goto L_0x0030
            L_0x0022:
                int r0 = r6.f27038d
                com.ogury.ed.internal.oa r4 = r6.f27035a
                java.lang.CharSequence r4 = r4.f27031a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0046
            L_0x0030:
                int r0 = r6.f27037c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f27035a
                java.lang.CharSequence r4 = r4.f27031a
                int r4 = com.ogury.p376ed.internal.C10814oc.m32862c(r4)
                r1.<init>(r0, r4)
                r6.f27039e = r1
                r6.f27038d = r2
                goto L_0x009b
            L_0x0046:
                com.ogury.ed.internal.oa r0 = r6.f27035a
                com.ogury.ed.internal.lv r0 = r0.f27034d
                com.ogury.ed.internal.oa r4 = r6.f27035a
                java.lang.CharSequence r4 = r4.f27031a
                int r5 = r6.f27038d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo67117a(r4, r5)
                com.ogury.ed.internal.jz r0 = (com.ogury.p376ed.internal.C10678jz) r0
                if (r0 != 0) goto L_0x0076
                int r0 = r6.f27037c
                com.ogury.ed.internal.nh r1 = new com.ogury.ed.internal.nh
                com.ogury.ed.internal.oa r4 = r6.f27035a
                java.lang.CharSequence r4 = r4.f27031a
                int r4 = com.ogury.p376ed.internal.C10814oc.m32862c(r4)
                r1.<init>(r0, r4)
                r6.f27039e = r1
                r6.f27038d = r2
                goto L_0x009b
            L_0x0076:
                java.lang.Object r2 = r0.mo67739c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo67740d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f27037c
                com.ogury.ed.internal.nh r4 = com.ogury.p376ed.internal.C10786ni.m32811a(r4, r2)
                r6.f27039e = r4
                int r2 = r2 + r0
                r6.f27037c = r2
                if (r0 != 0) goto L_0x0098
                r1 = r3
            L_0x0098:
                int r2 = r2 + r1
                r6.f27038d = r2
            L_0x009b:
                r6.f27036b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10808oa.C10809a.m32835a():void");
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C10784nh next() {
            if (this.f27036b == -1) {
                m32835a();
            }
            if (this.f27036b != 0) {
                C10784nh nhVar = this.f27039e;
                if (nhVar != null) {
                    this.f27039e = null;
                    this.f27036b = -1;
                    return nhVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (this.f27036b == -1) {
                m32835a();
            }
            return this.f27036b == 1;
        }
    }

    /* renamed from: a */
    public final Iterator<C10784nh> mo67878a() {
        return new C10809a(this);
    }
}
