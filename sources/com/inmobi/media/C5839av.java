package com.inmobi.media;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.inmobi.media.av */
/* compiled from: AdAsset */
public class C5839av {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f14711m = C5839av.class.getSimpleName();

    /* renamed from: a */
    long f14712a = 0;

    /* renamed from: b */
    int f14713b;

    /* renamed from: c */
    int f14714c;

    /* renamed from: d */
    public String f14715d;

    /* renamed from: e */
    public String f14716e;

    /* renamed from: f */
    long f14717f;

    /* renamed from: g */
    long f14718g;

    /* renamed from: h */
    long f14719h;

    /* renamed from: i */
    long f14720i;

    /* renamed from: j */
    boolean f14721j;

    /* renamed from: k */
    public String f14722k;

    /* renamed from: l */
    public byte f14723l;

    /* renamed from: com.inmobi.media.av$a */
    /* compiled from: AdAsset */
    public static final class C5840a {

        /* renamed from: a */
        int f14724a = (new Random().nextInt() & Integer.MAX_VALUE);

        /* renamed from: b */
        int f14725b;

        /* renamed from: c */
        String f14726c;

        /* renamed from: d */
        String f14727d;

        /* renamed from: e */
        long f14728e = System.currentTimeMillis();

        /* renamed from: f */
        long f14729f = System.currentTimeMillis();

        /* renamed from: g */
        long f14730g;

        /* renamed from: h */
        long f14731h;

        /* renamed from: a */
        public final C5840a mo34754a(String str, int i, long j) {
            this.f14726c = str;
            this.f14725b = i;
            this.f14730g = System.currentTimeMillis() + j;
            return this;
        }

        /* renamed from: a */
        private static long m17430a(String str) {
            try {
                return new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str).getTime();
            } catch (ParseException e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                return 0;
            }
        }

        /* renamed from: a */
        public final C5839av mo34756a() {
            return new C5839av(this.f14724a, this.f14726c, this.f14727d, this.f14725b, this.f14728e, this.f14729f, this.f14730g, this.f14731h);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
            r4 = (java.lang.String) r1.get("Date").get(0);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.inmobi.media.C5839av.C5840a mo34755a(java.lang.String r20, java.lang.String r21, com.inmobi.media.C6207gy r22, int r23, long r24) {
            /*
                r19 = this;
                r0 = r19
                r1 = r22
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r1.f15724c
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.String r4 = "Date"
                java.lang.Object r5 = r1.get(r4)
                java.util.List r5 = (java.util.List) r5
                r6 = 0
                if (r5 == 0) goto L_0x002e
                int r5 = r5.size()
                if (r5 <= 0) goto L_0x002e
                java.lang.Object r4 = r1.get(r4)
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r4 = r4.get(r6)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L_0x002e
                long r4 = m17430a(r4)
                goto L_0x0030
            L_0x002e:
                r4 = 0
            L_0x0030:
                java.lang.String r9 = "Cache-Control"
                java.lang.Object r10 = r1.get(r9)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x00b9
                int r10 = r10.size()
                if (r10 <= 0) goto L_0x00b9
                java.lang.Object r9 = r1.get(r9)
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r9 = r9.get(r6)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L_0x00b9
                java.lang.String r10 = ","
                java.lang.String[] r9 = r9.split(r10)
                int r10 = r9.length
                r12 = r6
                r17 = r12
                r13 = 0
                r15 = 0
            L_0x005c:
                if (r12 >= r10) goto L_0x00b7
                r18 = r9[r12]
                java.lang.String r11 = r18.trim()
                java.lang.String r7 = "no-cache"
                boolean r7 = r7.equals(r11)
                if (r7 != 0) goto L_0x00b4
                java.lang.String r7 = "no-store"
                boolean r7 = r7.equals(r11)
                if (r7 != 0) goto L_0x00b4
                java.lang.String r7 = "max-age="
                boolean r7 = r11.startsWith(r7)
                if (r7 == 0) goto L_0x008b
                r7 = 8
                java.lang.String r7 = r11.substring(r7)     // Catch:{ Exception -> 0x0087 }
                long r13 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0087 }
                goto L_0x00b4
            L_0x0087:
                java.lang.String unused = com.inmobi.media.C5839av.f14711m
                goto L_0x00b4
            L_0x008b:
                java.lang.String r7 = "stale-while-revalidate="
                boolean r7 = r11.startsWith(r7)
                if (r7 == 0) goto L_0x00a2
                r7 = 23
                java.lang.String r7 = r11.substring(r7)     // Catch:{ Exception -> 0x009e }
                long r15 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x009e }
                goto L_0x00b4
            L_0x009e:
                java.lang.String unused = com.inmobi.media.C5839av.f14711m
                goto L_0x00b4
            L_0x00a2:
                java.lang.String r7 = "must-revalidate"
                boolean r7 = r7.equals(r11)
                if (r7 != 0) goto L_0x00b2
                java.lang.String r7 = "proxy-revalidate"
                boolean r7 = r7.equals(r11)
                if (r7 == 0) goto L_0x00b4
            L_0x00b2:
                r17 = 1
            L_0x00b4:
                int r12 = r12 + 1
                goto L_0x005c
            L_0x00b7:
                r11 = 1
                goto L_0x00c0
            L_0x00b9:
                r11 = r6
                r17 = r11
                r13 = 0
                r15 = 0
            L_0x00c0:
                java.lang.String r7 = "Expires"
                java.lang.Object r8 = r1.get(r7)
                java.util.List r8 = (java.util.List) r8
                if (r8 == 0) goto L_0x00e3
                int r8 = r8.size()
                if (r8 <= 0) goto L_0x00e3
                java.lang.Object r1 = r1.get(r7)
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r1.get(r6)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x00e3
                long r6 = m17430a(r1)
                goto L_0x00e5
            L_0x00e3:
                r6 = 0
            L_0x00e5:
                r8 = 1000(0x3e8, double:4.94E-321)
                if (r11 == 0) goto L_0x00f6
                long r13 = r13 * r8
                long r4 = r2 + r13
                if (r17 == 0) goto L_0x00f0
                r15 = r4
                goto L_0x00f2
            L_0x00f0:
                long r15 = r15 * r8
                long r15 = r15 + r4
            L_0x00f2:
                r1 = r20
                r10 = r15
                goto L_0x010a
            L_0x00f6:
                r10 = 0
                int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r1 <= 0) goto L_0x0107
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 < 0) goto L_0x0107
                long r6 = r6 - r4
                long r4 = r2 + r6
                r1 = r20
                r10 = r4
                goto L_0x010a
            L_0x0107:
                r1 = r20
                r4 = r10
            L_0x010a:
                r0.f14726c = r1
                r1 = r21
                r0.f14727d = r1
                r1 = r23
                r0.f14725b = r1
                long r6 = r24 * r8
                long r2 = r2 + r6
                r0.f14730g = r2
                r0.f14731h = r4
                long r1 = java.lang.Math.min(r2, r10)
                r0.f14730g = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5839av.C5840a.mo34755a(java.lang.String, java.lang.String, com.inmobi.media.gy, int, long):com.inmobi.media.av$a");
        }
    }

    C5839av(int i, String str, String str2, int i2, long j, long j2, long j3, long j4) {
        this.f14713b = i;
        this.f14715d = str;
        this.f14716e = str2;
        this.f14714c = i2;
        this.f14717f = j;
        this.f14718g = j2;
        this.f14719h = j3;
        this.f14720i = j4;
        this.f14721j = false;
        this.f14722k = null;
    }

    /* renamed from: a */
    public final boolean mo34750a() {
        String str = this.f14716e;
        return (str == null || str.length() == 0 || !new File(this.f14716e).exists()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14715d.equals(((C5839av) obj).f14715d);
    }

    public int hashCode() {
        return this.f14715d.hashCode();
    }

    public String toString() {
        return "AdAsset{url='" + this.f14715d + '\'' + '}';
    }
}
