package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.android.exoplayer2.C5487C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g */
public final class C4901g {

    /* renamed from: b */
    public static final int f13062b = C5049u.m15386a("ID3");

    /* renamed from: a */
    public final C4902a f13063a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a */
    public interface C4902a {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b */
    public static final class C4903b {

        /* renamed from: a */
        public final int f13064a;

        /* renamed from: b */
        public final boolean f13065b;

        /* renamed from: c */
        public final int f13066c;

        public C4903b(int i, boolean z, int i2) {
            this.f13064a = i;
            this.f13065b = z;
            this.f13066c = i2;
        }
    }

    public C4901g() {
        this((C4902a) null);
    }

    /* renamed from: a */
    public static int m15029a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    public static C4895d m15039b(C5036k kVar, int i, int i2, boolean z, int i3, C4902a aVar) throws UnsupportedEncodingException {
        C5036k kVar2 = kVar;
        int i4 = kVar2.f13445b;
        int b = m15038b(kVar2.f13444a, i4);
        String str = new String(kVar2.f13444a, i4, b - i4, C5487C.ISO88591_NAME);
        kVar.mo25600e(b + 1);
        int l = kVar.mo25608l();
        boolean z2 = (l & 2) != 0;
        boolean z3 = (l & 1) != 0;
        int l2 = kVar.mo25608l();
        String[] strArr = new String[l2];
        for (int i5 = 0; i5 < l2; i5++) {
            int i6 = kVar2.f13445b;
            int b2 = m15038b(kVar2.f13444a, i6);
            strArr[i5] = new String(kVar2.f13444a, i6, b2 - i6, C5487C.ISO88591_NAME);
            kVar.mo25600e(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar2.f13445b < i7) {
            C4904h a = m15035a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C4904h[] hVarArr = new C4904h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C4895d(str, z2, z3, strArr, hVarArr);
    }

    /* renamed from: b */
    public static String m15042b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C5487C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: c */
    public static C4909k m15044c(C5036k kVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i);
        kVar.f13445b += i;
        return new C4909k(str, (String) null, new String(bArr, 0, m15038b(bArr, 0), C5487C.ISO88591_NAME));
    }

    /* renamed from: d */
    public static C4907j m15045d(C5036k kVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.mo25608l();
        String b = m15042b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i2);
        kVar.f13445b += i2;
        int a = m15030a(bArr, 0, l);
        String str = new String(bArr, 0, a, b);
        int a2 = a + m15029a(l);
        return new C4907j("TXXX", str, a2 < i2 ? new String(bArr, a2, m15030a(bArr, a2, l) - a2, b) : "");
    }

    /* renamed from: e */
    public static C4909k m15046e(C5036k kVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.mo25608l();
        String b = m15042b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i2);
        kVar.f13445b += i2;
        int a = m15030a(bArr, 0, l);
        String str = new String(bArr, 0, a, b);
        int a2 = a + m15029a(l);
        return new C4909k("WXXX", str, a2 < i2 ? new String(bArr, a2, m15038b(bArr, a2) - a2, C5487C.ISO88591_NAME) : "");
    }

    /* renamed from: f */
    public static int m15047f(C5036k kVar, int i) {
        byte[] bArr = kVar.f13444a;
        int i2 = kVar.f13445b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a mo25439a(byte[] r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r1.<init>(r13, r14)
            int r13 = r1.mo25588a()
            r14 = 2
            r2 = 10
            java.lang.String r3 = "Id3Decoder"
            r4 = 4
            r5 = 0
            r6 = 0
            r7 = 1
            if (r13 >= r2) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r3, r13)
        L_0x001e:
            r10 = r5
            goto L_0x00b9
        L_0x0021:
            int r13 = r1.mo25610n()
            int r8 = f13062b
            if (r13 == r8) goto L_0x003e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected first three bytes of ID3 tag header: "
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x003e:
            int r13 = r1.mo25608l()
            r1.mo25602f(r7)
            int r8 = r1.mo25608l()
            int r9 = r1.mo25607k()
            if (r13 != r14) goto L_0x005e
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0055
            r10 = r7
            goto L_0x0056
        L_0x0055:
            r10 = r6
        L_0x0056:
            if (r10 == 0) goto L_0x0094
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x005e:
            r10 = 3
            if (r13 != r10) goto L_0x0074
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0067
            r10 = r7
            goto L_0x0068
        L_0x0067:
            r10 = r6
        L_0x0068:
            if (r10 == 0) goto L_0x0094
            int r10 = r1.mo25595c()
            r1.mo25602f(r10)
            int r10 = r10 + r4
            int r9 = r9 - r10
            goto L_0x0094
        L_0x0074:
            if (r13 != r4) goto L_0x00a3
            r10 = r8 & 64
            if (r10 == 0) goto L_0x007c
            r10 = r7
            goto L_0x007d
        L_0x007c:
            r10 = r6
        L_0x007d:
            if (r10 == 0) goto L_0x0089
            int r10 = r1.mo25607k()
            int r11 = r10 + -4
            r1.mo25602f(r11)
            int r9 = r9 - r10
        L_0x0089:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x008f
            r10 = r7
            goto L_0x0090
        L_0x008f:
            r10 = r6
        L_0x0090:
            if (r10 == 0) goto L_0x0094
            int r9 = r9 + -10
        L_0x0094:
            if (r13 >= r4) goto L_0x009c
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x009c
            r8 = r7
            goto L_0x009d
        L_0x009c:
            r8 = r6
        L_0x009d:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b r10 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b
            r10.<init>(r13, r8, r9)
            goto L_0x00b9
        L_0x00a3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r3, r13)
            goto L_0x001e
        L_0x00b9:
            if (r10 != 0) goto L_0x00bc
            return r5
        L_0x00bc:
            int r13 = r1.f13445b
            int r8 = r10.f13064a
            if (r8 != r14) goto L_0x00c3
            r2 = 6
        L_0x00c3:
            int r14 = r10.f13066c
            boolean r8 = r10.f13065b
            if (r8 == 0) goto L_0x00cd
            int r14 = m15047f(r1, r14)
        L_0x00cd:
            int r13 = r13 + r14
            r1.mo25598d(r13)
            int r13 = r10.f13064a
            boolean r13 = m15037a(r1, r13, r2, r6)
            if (r13 != 0) goto L_0x00fc
            int r13 = r10.f13064a
            if (r13 != r4) goto L_0x00e5
            boolean r13 = m15037a(r1, r4, r2, r7)
            if (r13 == 0) goto L_0x00e5
            r6 = r7
            goto L_0x00fc
        L_0x00e5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Failed to validate ID3 tag with majorVersion="
            r13.append(r14)
            int r14 = r10.f13064a
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r3, r13)
            return r5
        L_0x00fc:
            int r13 = r1.mo25588a()
            if (r13 < r2) goto L_0x0110
            int r13 = r10.f13064a
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a r14 = r12.f13063a
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r13 = m15035a((int) r13, (com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r1, (boolean) r6, (int) r2, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g.C4902a) r14)
            if (r13 == 0) goto L_0x00fc
            r0.add(r13)
            goto L_0x00fc
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r13 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a
            r13.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a.C4888b>) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g.mo25439a(byte[], int):com.fyber.inneractive.sdk.player.exoplayer2.metadata.a");
    }

    public C4901g(C4902a aVar) {
        this.f13063a = aVar;
    }

    /* renamed from: c */
    public static C4905i m15043c(C5036k kVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i);
        kVar.f13445b += i;
        int b = m15038b(bArr, 0);
        String str = new String(bArr, 0, b, C5487C.ISO88591_NAME);
        int i2 = b + 1;
        return new C4905i(str, i2 < i ? Arrays.copyOfRange(bArr, i2, i) : new byte[0]);
    }

    /* renamed from: b */
    public static C4907j m15041b(C5036k kVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.mo25608l();
        String b = m15042b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i2);
        kVar.f13445b += i2;
        return new C4907j(str, (String) null, new String(bArr, 0, m15030a(bArr, 0, l), b));
    }

    /* renamed from: b */
    public static C4899f m15040b(C5036k kVar, int i) throws UnsupportedEncodingException {
        int l = kVar.mo25608l();
        String b = m15042b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i2);
        kVar.f13445b += i2;
        int b2 = m15038b(bArr, 0);
        String str = new String(bArr, 0, b2, C5487C.ISO88591_NAME);
        int i3 = b2 + 1;
        int a = m15030a(bArr, i3, l);
        String str2 = new String(bArr, i3, a - i3, b);
        int a2 = a + m15029a(l);
        int a3 = m15030a(bArr, a2, l);
        return new C4899f(str, str2, new String(bArr, a2, a3 - a2, b), Arrays.copyOfRange(bArr, a3 + m15029a(l), i2));
    }

    /* renamed from: b */
    public static int m15038b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: a */
    public static C4893c m15033a(C5036k kVar, int i, int i2, boolean z, int i3, C4902a aVar) throws UnsupportedEncodingException {
        C5036k kVar2 = kVar;
        int i4 = kVar2.f13445b;
        int b = m15038b(kVar2.f13444a, i4);
        String str = new String(kVar2.f13444a, i4, b - i4, C5487C.ISO88591_NAME);
        kVar.mo25600e(b + 1);
        int c = kVar.mo25595c();
        int c2 = kVar.mo25595c();
        long m = kVar.mo25609m();
        long j = m == 4294967295L ? -1 : m;
        long m2 = kVar.mo25609m();
        long j2 = m2 == 4294967295L ? -1 : m2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar2.f13445b < i5) {
            C4904h a = m15035a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C4904h[] hVarArr = new C4904h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C4893c(str, c, c2, j, j2, hVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r10 & 1) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if ((r10 & 128) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC, Splitter:B:46:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0092 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15037a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f13445b
        L_0x0006:
            int r3 = r18.mo25588a()     // Catch:{ all -> 0x00ad }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0020
            int r7 = r18.mo25595c()     // Catch:{ all -> 0x00ad }
            long r8 = r18.mo25609m()     // Catch:{ all -> 0x00ad }
            int r10 = r18.mo25613q()     // Catch:{ all -> 0x00ad }
            goto L_0x002a
        L_0x0020:
            int r7 = r18.mo25610n()     // Catch:{ all -> 0x00ad }
            int r8 = r18.mo25610n()     // Catch:{ all -> 0x00ad }
            long r8 = (long) r8
            r10 = r6
        L_0x002a:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            r1.mo25600e(r2)
            return r4
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r21 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0049
            r1.mo25600e(r2)
            return r6
        L_0x0049:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x0069:
            if (r0 != r7) goto L_0x0077
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            r3 = r4
            goto L_0x0072
        L_0x0071:
            r3 = r6
        L_0x0072:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0077:
            if (r0 != r3) goto L_0x0087
            r3 = r10 & 32
            if (r3 == 0) goto L_0x007f
            r3 = r4
            goto L_0x0080
        L_0x007f:
            r3 = r6
        L_0x0080:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            r4 = r6
            goto L_0x0089
        L_0x0087:
            r3 = r6
            r4 = r3
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            int r3 = r3 + 4
        L_0x008d:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0096
            r1.mo25600e(r2)
            return r6
        L_0x0096:
            int r3 = r18.mo25588a()     // Catch:{ all -> 0x00ad }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a3
            r1.mo25600e(r2)
            return r6
        L_0x00a3:
            int r3 = (int) r8
            r1.mo25602f(r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0006
        L_0x00a9:
            r1.mo25600e(r2)
            return r4
        L_0x00ad:
            r0 = move-exception
            r1.mo25600e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g.m15037a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x018a, code lost:
        if (r11 == 67) goto L_0x018c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4904h m15035a(int r21, com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r22, boolean r23, int r24, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g.C4902a r25) {
        /*
            r0 = r21
            r7 = r22
            int r8 = r22.mo25608l()
            int r9 = r22.mo25608l()
            int r10 = r22.mo25608l()
            r1 = 3
            if (r0 < r1) goto L_0x0019
            int r3 = r22.mo25608l()
            r11 = r3
            goto L_0x001a
        L_0x0019:
            r11 = 0
        L_0x001a:
            r3 = 4
            if (r0 != r3) goto L_0x003b
            int r4 = r22.mo25611o()
            if (r23 != 0) goto L_0x0046
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 7
            r5 = r5 | r6
            int r6 = r4 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 14
            r5 = r5 | r6
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 21
            r4 = r4 | r5
            goto L_0x0046
        L_0x003b:
            if (r0 != r1) goto L_0x0042
            int r4 = r22.mo25611o()
            goto L_0x0046
        L_0x0042:
            int r4 = r22.mo25610n()
        L_0x0046:
            if (r0 < r1) goto L_0x004d
            int r5 = r22.mo25613q()
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            r12 = 0
            if (r8 != 0) goto L_0x0061
            if (r9 != 0) goto L_0x0061
            if (r10 != 0) goto L_0x0061
            if (r11 != 0) goto L_0x0061
            if (r4 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x0061
            int r0 = r7.f13446c
            r7.mo25600e(r0)
            return r12
        L_0x0061:
            int r6 = r7.f13445b
            int r13 = r6 + r4
            int r6 = r7.f13446c
            java.lang.String r14 = "Id3Decoder"
            if (r13 <= r6) goto L_0x0076
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r14, r0)
            int r0 = r7.f13446c
            r7.mo25600e(r0)
            return r12
        L_0x0076:
            r6 = 77
            r15 = 79
            r2 = 2
            r3 = 67
            r1 = 1
            if (r25 == 0) goto L_0x0095
            if (r8 != r3) goto L_0x008d
            if (r9 != r15) goto L_0x008d
            if (r10 != r6) goto L_0x008d
            if (r11 == r6) goto L_0x008a
            if (r0 != r2) goto L_0x008d
        L_0x008a:
            r18 = r1
            goto L_0x008f
        L_0x008d:
            r18 = 0
        L_0x008f:
            if (r18 != 0) goto L_0x0095
            r7.mo25600e(r13)
            return r12
        L_0x0095:
            r12 = 3
            if (r0 != r12) goto L_0x00b9
            r12 = r5 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x009e
            r12 = r1
            goto L_0x009f
        L_0x009e:
            r12 = 0
        L_0x009f:
            r17 = r5 & 64
            if (r17 == 0) goto L_0x00a6
            r17 = r1
            goto L_0x00a8
        L_0x00a6:
            r17 = 0
        L_0x00a8:
            r5 = r5 & 32
            if (r5 == 0) goto L_0x00ae
            r5 = r1
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            r16 = r12
            r19 = r17
            r20 = 0
            r12 = r5
            r17 = r16
            goto L_0x00f0
        L_0x00b9:
            r12 = 4
            if (r0 != r12) goto L_0x00e7
            r12 = r5 & 64
            if (r12 == 0) goto L_0x00c2
            r12 = r1
            goto L_0x00c3
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            r17 = r5 & 8
            if (r17 == 0) goto L_0x00ca
            r17 = r1
            goto L_0x00cc
        L_0x00ca:
            r17 = 0
        L_0x00cc:
            r19 = r5 & 4
            if (r19 == 0) goto L_0x00d3
            r19 = r1
            goto L_0x00d5
        L_0x00d3:
            r19 = 0
        L_0x00d5:
            r20 = r5 & 2
            if (r20 == 0) goto L_0x00dc
            r20 = r1
            goto L_0x00de
        L_0x00dc:
            r20 = 0
        L_0x00de:
            r5 = r5 & r1
            if (r5 == 0) goto L_0x00e4
            r16 = r1
            goto L_0x00f0
        L_0x00e4:
            r16 = 0
            goto L_0x00f0
        L_0x00e7:
            r12 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
        L_0x00f0:
            if (r17 != 0) goto L_0x0210
            if (r19 == 0) goto L_0x00f6
            goto L_0x0210
        L_0x00f6:
            if (r12 == 0) goto L_0x00fd
            int r4 = r4 + -1
            r7.mo25602f(r1)
        L_0x00fd:
            if (r16 == 0) goto L_0x0105
            int r4 = r4 + -4
            r1 = 4
            r7.mo25602f(r1)
        L_0x0105:
            if (r20 == 0) goto L_0x010b
            int r4 = m15047f(r7, r4)
        L_0x010b:
            r12 = r4
            r1 = 84
            r4 = 88
            if (r8 != r1) goto L_0x0120
            if (r9 != r4) goto L_0x0120
            if (r10 != r4) goto L_0x0120
            if (r0 == r2) goto L_0x011a
            if (r11 != r4) goto L_0x0120
        L_0x011a:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r1 = m15045d(r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x0120:
            if (r8 != r1) goto L_0x012f
            java.lang.String r1 = m15036a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r1 = m15041b(r7, r12, r1)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x012c:
            r0 = move-exception
            goto L_0x020c
        L_0x012f:
            r5 = 87
            if (r8 != r5) goto L_0x0141
            if (r9 != r4) goto L_0x0141
            if (r10 != r4) goto L_0x0141
            if (r0 == r2) goto L_0x013b
            if (r11 != r4) goto L_0x0141
        L_0x013b:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k r1 = m15046e(r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x0141:
            if (r8 != r5) goto L_0x014d
            java.lang.String r1 = m15036a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k r1 = m15044c(r7, r12, r1)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x014d:
            r4 = 73
            r5 = 80
            if (r8 != r5) goto L_0x0163
            r1 = 82
            if (r9 != r1) goto L_0x0163
            if (r10 != r4) goto L_0x0163
            r1 = 86
            if (r11 != r1) goto L_0x0163
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i r1 = m15043c(r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x0163:
            r1 = 71
            if (r8 != r1) goto L_0x0179
            r1 = 69
            if (r9 != r1) goto L_0x0179
            if (r10 != r15) goto L_0x0179
            r1 = 66
            if (r11 == r1) goto L_0x0173
            if (r0 != r2) goto L_0x0179
        L_0x0173:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f r1 = m15040b((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r7, (int) r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x0179:
            r1 = 65
            if (r0 != r2) goto L_0x0184
            if (r8 != r5) goto L_0x0191
            if (r9 != r4) goto L_0x0191
            if (r10 != r3) goto L_0x0191
            goto L_0x018c
        L_0x0184:
            if (r8 != r1) goto L_0x0191
            if (r9 != r5) goto L_0x0191
            if (r10 != r4) goto L_0x0191
            if (r11 != r3) goto L_0x0191
        L_0x018c:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a r1 = m15031a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r7, (int) r12, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x0191:
            if (r8 != r3) goto L_0x01a0
            if (r9 != r15) goto L_0x01a0
            if (r10 != r6) goto L_0x01a0
            if (r11 == r6) goto L_0x019b
            if (r0 != r2) goto L_0x01a0
        L_0x019b:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r1 = m15034a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r7, (int) r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x01a0:
            if (r8 != r3) goto L_0x01ba
            r2 = 72
            if (r9 != r2) goto L_0x01ba
            if (r10 != r1) goto L_0x01ba
            if (r11 != r5) goto L_0x01ba
            r1 = r22
            r2 = r12
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c r1 = m15033a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x01ba:
            if (r8 != r3) goto L_0x01d4
            r1 = 84
            if (r9 != r1) goto L_0x01d4
            if (r10 != r15) goto L_0x01d4
            if (r11 != r3) goto L_0x01d4
            r1 = r22
            r2 = r12
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d r1 = m15039b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            goto L_0x01dc
        L_0x01d4:
            java.lang.String r1 = m15036a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b r1 = m15032a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r7, (int) r12, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
        L_0x01dc:
            if (r1 != 0) goto L_0x01fe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            java.lang.String r0 = m15036a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            r2.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0202 }
            android.util.Log.w(r14, r0)     // Catch:{ UnsupportedEncodingException -> 0x0202 }
        L_0x01fe:
            r7.mo25600e(r13)
            return r1
        L_0x0202:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r14, r0)     // Catch:{ all -> 0x012c }
            r7.mo25600e(r13)
        L_0x020a:
            r0 = 0
            return r0
        L_0x020c:
            r7.mo25600e(r13)
            throw r0
        L_0x0210:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r14, r0)
            r7.mo25600e(r13)
            goto L_0x020a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g.m15035a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.k, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h");
    }

    /* renamed from: a */
    public static C4889a m15031a(C5036k kVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int l = kVar.mo25608l();
        String b = m15042b(l);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i4);
        kVar.f13445b += i4;
        if (i2 == 2) {
            str = "image/" + new String(bArr, 0, 3, C5487C.ISO88591_NAME).toLowerCase(Locale.US);
            if (str.equals("image/jpg")) {
                str = MimeTypes.IMAGE_JPEG;
            }
            i3 = 2;
        } else {
            i3 = m15038b(bArr, 0);
            String lowerCase = new String(bArr, 0, i3, C5487C.ISO88591_NAME).toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i5 = i3 + 2;
        int a = m15030a(bArr, i5, l);
        return new C4889a(str, new String(bArr, i5, a - i5, b), bArr[i3 + 1] & 255, Arrays.copyOfRange(bArr, a + m15029a(l), i4));
    }

    /* renamed from: a */
    public static C4897e m15034a(C5036k kVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int l = kVar.mo25608l();
        String b = m15042b(l);
        byte[] bArr = new byte[3];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, 3);
        kVar.f13445b += 3;
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr2, 0, i2);
        kVar.f13445b += i2;
        int a = m15030a(bArr2, 0, l);
        String str2 = new String(bArr2, 0, a, b);
        int a2 = a + m15029a(l);
        return new C4897e(str, str2, a2 < i2 ? new String(bArr2, a2, m15030a(bArr2, a2, l) - a2, b) : "");
    }

    /* renamed from: a */
    public static C4891b m15032a(C5036k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i);
        kVar.f13445b += i;
        return new C4891b(str, bArr);
    }

    /* renamed from: a */
    public static String m15036a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    public static int m15030a(byte[] bArr, int i, int i2) {
        int b = m15038b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m15038b(bArr, b + 1);
        }
        return bArr.length;
    }
}
