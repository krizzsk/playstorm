package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b */
public class C4957b extends C4961d {

    /* renamed from: e */
    public static final int[] f13210e = new int[0];

    /* renamed from: c */
    public final C4964e.C4965a f13211c = null;

    /* renamed from: d */
    public final AtomicReference<C4959b> f13212d = new AtomicReference<>(new C4959b());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a */
    public static final class C4958a {

        /* renamed from: a */
        public final int f13213a;

        /* renamed from: b */
        public final int f13214b;

        /* renamed from: c */
        public final String f13215c;

        public C4958a(int i, int i2, String str) {
            this.f13213a = i;
            this.f13214b = i2;
            this.f13215c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4958a.class != obj.getClass()) {
                return false;
            }
            C4958a aVar = (C4958a) obj;
            if (this.f13213a == aVar.f13213a && this.f13214b == aVar.f13214b && TextUtils.equals(this.f13215c, aVar.f13215c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f13213a * 31) + this.f13214b) * 31;
            String str = this.f13215c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b */
    public static final class C4959b {

        /* renamed from: a */
        public final String f13216a;

        /* renamed from: b */
        public final String f13217b;

        /* renamed from: c */
        public final boolean f13218c;

        /* renamed from: d */
        public final boolean f13219d;

        /* renamed from: e */
        public final int f13220e;

        /* renamed from: f */
        public final int f13221f;

        /* renamed from: g */
        public final int f13222g;

        /* renamed from: h */
        public final boolean f13223h;

        /* renamed from: i */
        public final boolean f13224i;

        /* renamed from: j */
        public final int f13225j;

        /* renamed from: k */
        public final int f13226k;

        /* renamed from: l */
        public final boolean f13227l;

        public C4959b() {
            this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4959b.class != obj.getClass()) {
                return false;
            }
            C4959b bVar = (C4959b) obj;
            if (this.f13218c == bVar.f13218c && this.f13219d == bVar.f13219d && this.f13220e == bVar.f13220e && this.f13221f == bVar.f13221f && this.f13223h == bVar.f13223h && this.f13224i == bVar.f13224i && this.f13227l == bVar.f13227l && this.f13225j == bVar.f13225j && this.f13226k == bVar.f13226k && this.f13222g == bVar.f13222g && TextUtils.equals(this.f13216a, bVar.f13216a) && TextUtils.equals(this.f13217b, bVar.f13217b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f13216a.hashCode() * 31) + this.f13217b.hashCode()) * 31) + (this.f13218c ? 1 : 0)) * 31) + (this.f13219d ? 1 : 0)) * 31) + this.f13220e) * 31) + this.f13221f) * 31) + this.f13222g) * 31) + (this.f13223h ? 1 : 0)) * 31) + (this.f13224i ? 1 : 0)) * 31) + (this.f13227l ? 1 : 0)) * 31) + this.f13225j) * 31) + this.f13226k;
        }

        public C4959b(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
            this.f13216a = null;
            this.f13217b = null;
            this.f13218c = z;
            this.f13219d = z2;
            this.f13220e = i;
            this.f13221f = i2;
            this.f13222g = i3;
            this.f13223h = z3;
            this.f13224i = z4;
            this.f13225j = i4;
            this.f13226k = i5;
            this.f13227l = z5;
        }
    }

    public C4957b(C4964e.C4965a aVar) {
    }

    /* renamed from: a */
    public static int m15165a(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: a */
    public static boolean m15167a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: a */
    public static boolean m15170a(C4869i iVar, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m15167a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C5049u.m15393a((Object) iVar.f12956f, (Object) str)) {
            return false;
        }
        int i6 = iVar.f12960j;
        if (i6 != -1 && i6 > i3) {
            return false;
        }
        int i7 = iVar.f12961k;
        if (i7 != -1 && i7 > i4) {
            return false;
        }
        int i8 = iVar.f12952b;
        if (i8 == -1 || i8 <= i5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15168a(C4869i iVar, int i, C4958a aVar) {
        if (!m15167a(i, false) || iVar.f12968r != aVar.f13213a || iVar.f12969s != aVar.f13214b) {
            return false;
        }
        String str = aVar.f13215c;
        if (str == null || TextUtils.equals(str, iVar.f12956f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15169a(C4869i iVar, String str) {
        String str2;
        if (str != null) {
            String str3 = iVar.f12975y;
            int i = C5049u.f13471a;
            if (str3 == null) {
                str2 = null;
            } else {
                str2 = new Locale(str3).getLanguage();
            }
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Integer> m15166a(com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f13194a
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0009:
            int r3 = r12.f13194a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00a2
            if (r14 != r2) goto L_0x0020
            goto L_0x00a2
        L_0x0020:
            r3 = r1
            r4 = r2
        L_0x0022:
            int r5 = r12.f13194a
            r6 = 1
            if (r3 >= r5) goto L_0x007c
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r12.f13195b
            r5 = r5[r3]
            int r7 = r5.f12960j
            if (r7 <= 0) goto L_0x0079
            int r8 = r5.f12961k
            if (r8 <= 0) goto L_0x0079
            if (r15 == 0) goto L_0x0043
            if (r7 <= r8) goto L_0x0039
            r9 = r6
            goto L_0x003a
        L_0x0039:
            r9 = r1
        L_0x003a:
            if (r13 <= r14) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r6 = r1
        L_0x003e:
            if (r9 == r6) goto L_0x0043
            r6 = r13
            r9 = r14
            goto L_0x0045
        L_0x0043:
            r9 = r13
            r6 = r14
        L_0x0045:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L_0x0055
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r11, (int) r7)
            r6.<init>(r9, r7)
            goto L_0x005f
        L_0x0055:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15385a((int) r10, (int) r8)
            r7.<init>(r8, r6)
            r6 = r7
        L_0x005f:
            int r7 = r5.f12960j
            int r5 = r5.f12961k
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x0079
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x0079
            if (r8 >= r4) goto L_0x0079
            r4 = r8
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x007c:
            if (r4 == r2) goto L_0x00a2
            int r13 = r0.size()
            int r13 = r13 - r6
        L_0x0083:
            if (r13 < 0) goto L_0x00a2
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r12.f13195b
            r14 = r15[r14]
            int r14 = r14.mo25375b()
            r15 = -1
            if (r14 == r15) goto L_0x009c
            if (r14 <= r4) goto L_0x009f
        L_0x009c:
            r0.remove(r13)
        L_0x009f:
            int r13 = r13 + -1
            goto L_0x0083
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15166a(com.fyber.inneractive.sdk.player.exoplayer2.source.r, int, int, boolean):java.util.List");
    }
}
