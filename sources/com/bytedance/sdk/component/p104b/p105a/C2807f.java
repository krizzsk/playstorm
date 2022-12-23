package com.bytedance.sdk.component.p104b.p105a;

import com.bytedance.sdk.component.p104b.p105a.p108b.C2795a;
import com.bytedance.sdk.component.p104b.p105a.p108b.C2803i;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;

/* renamed from: com.bytedance.sdk.component.b.a.f */
/* compiled from: HttpUrl */
public final class C2807f {

    /* renamed from: d */
    private static final char[] f6307d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f6308a;

    /* renamed from: b */
    final String f6309b;

    /* renamed from: c */
    final int f6310c;

    /* renamed from: e */
    private final String f6311e;

    /* renamed from: f */
    private final String f6312f;

    /* renamed from: g */
    private final List<String> f6313g;

    /* renamed from: h */
    private final List<String> f6314h;

    /* renamed from: i */
    private final String f6315i;

    /* renamed from: j */
    private final String f6316j;

    C2807f(C2808a aVar) {
        this.f6308a = aVar.f6317a;
        this.f6311e = m7692a(aVar.f6318b, false);
        this.f6312f = m7692a(aVar.f6319c, false);
        this.f6309b = aVar.f6320d;
        this.f6310c = aVar.mo17564a();
        this.f6313g = m7693a(aVar.f6322f, false);
        String str = null;
        this.f6314h = aVar.f6323g != null ? m7693a(aVar.f6323g, true) : null;
        this.f6315i = aVar.f6324h != null ? m7692a(aVar.f6324h, false) : str;
        this.f6316j = aVar.toString();
    }

    /* renamed from: a */
    public static int m7688a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: a */
    static String m7689a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m7697a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C2795a aVar = new C2795a();
            int i5 = i;
            aVar.mo17513a(str, i, i4);
            m7694a(aVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return aVar.mo17524c();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m7690a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C2795a aVar = new C2795a();
                aVar.mo17513a(str, i, i3);
                m7695a(aVar, str, i3, i2, z);
                return aVar.mo17524c();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m7691a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m7689a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: a */
    static String m7692a(String str, boolean z) {
        return m7690a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m7693a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m7692a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m7694a(C2795a aVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C2795a aVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    aVar.mo17512a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m7697a(str, i, i2)))))) {
                    if (aVar2 == null) {
                        aVar2 = new C2795a();
                    }
                    if (charset == null || charset.equals(C2803i.f6305a)) {
                        aVar2.mo17511a(codePointAt);
                    } else {
                        aVar2.mo17514a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!aVar2.mo17517a()) {
                        byte b = aVar2.mo17519b() & 255;
                        aVar.mo17520b(37);
                        aVar.mo17520b((int) f6307d[(b >> 4) & 15]);
                        aVar.mo17520b((int) f6307d[b & Ascii.f17944SI]);
                    }
                } else {
                    aVar.mo17511a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static void m7695a(C2795a aVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = C2803i.m7666a(str.charAt(i + 1));
                int a2 = C2803i.m7666a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    aVar.mo17520b((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                aVar.mo17520b(32);
                i += Character.charCount(codePointAt);
            }
            aVar.mo17511a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static void m7696a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: a */
    static boolean m7697a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C2803i.m7666a(str.charAt(i + 1)) != -1 && C2803i.m7666a(str.charAt(i3)) != -1;
    }

    /* renamed from: b */
    static List<String> m7698b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: b */
    static void m7699b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: c */
    public static C2807f m7700c(String str) {
        C2808a aVar = new C2808a();
        if (aVar.mo17565a((C2807f) null, str) == C2808a.C2809a.SUCCESS) {
            return aVar.mo17569b();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f1655274989236dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p104b.p105a.C2807f.f1655274989236dc(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public URL mo17556a() {
        try {
            return new URL(this.f6316j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String mo17557b() {
        if (this.f6311e.isEmpty()) {
            return "";
        }
        int length = this.f6308a.length() + 3;
        String str = this.f6316j;
        return this.f6316j.substring(length, C2803i.m7669a(str, length, str.length(), ":@"));
    }

    /* renamed from: c */
    public String mo17558c() {
        if (this.f6312f.isEmpty()) {
            return "";
        }
        int indexOf = this.f6316j.indexOf(64);
        return this.f6316j.substring(this.f6316j.indexOf(58, this.f6308a.length() + 3) + 1, indexOf);
    }

    /* renamed from: d */
    public List<String> mo17559d() {
        int indexOf = this.f6316j.indexOf(47, this.f6308a.length() + 3);
        String str = this.f6316j;
        int a = C2803i.m7669a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C2803i.m7668a(this.f6316j, i, a, '/');
            arrayList.add(this.f6316j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo17560e() {
        if (this.f6314h == null) {
            return null;
        }
        int indexOf = this.f6316j.indexOf(63) + 1;
        String str = this.f6316j;
        return this.f6316j.substring(indexOf, C2803i.m7668a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2807f) && ((C2807f) obj).f6316j.equals(this.f6316j);
    }

    public int hashCode() {
        return this.f6316j.hashCode();
    }

    public String toString() {
        return this.f6316j;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.f$a */
    /* compiled from: HttpUrl */
    public static final class C2808a {

        /* renamed from: a */
        String f6317a;

        /* renamed from: b */
        String f6318b = "";

        /* renamed from: c */
        String f6319c = "";

        /* renamed from: d */
        String f6320d;

        /* renamed from: e */
        int f6321e = -1;

        /* renamed from: f */
        final List<String> f6322f;

        /* renamed from: g */
        List<String> f6323g;

        /* renamed from: h */
        String f6324h;

        /* renamed from: com.bytedance.sdk.component.b.a.f$a$a */
        /* compiled from: HttpUrl */
        enum C2809a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C2808a() {
            ArrayList arrayList = new ArrayList();
            this.f6322f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public C2808a mo17566a(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f6317a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f6317a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: b */
        public C2808a mo17568b(String str) {
            if (str != null) {
                String e = m7713e(str, 0, str.length());
                if (e != null) {
                    this.f6320d = e;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo17564a() {
            int i = this.f6321e;
            return i != -1 ? i : C2807f.m7688a(this.f6317a);
        }

        /* renamed from: c */
        public C2808a mo17570c(String str) {
            if (str != null) {
                return m7706a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        /* renamed from: a */
        private C2808a m7706a(String str, boolean z) {
            int i = 0;
            do {
                int a = C2803i.m7669a(str, i, str.length(), "/\\");
                m7708a(str, i, a, a < str.length(), z);
                i = a + 1;
            } while (i <= str.length());
            return this;
        }

        /* renamed from: d */
        public C2808a mo17571d(String str) {
            this.f6323g = str != null ? C2807f.m7698b(C2807f.m7691a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: a */
        public C2808a mo17567a(String str, String str2) {
            if (str != null) {
                if (this.f6323g == null) {
                    this.f6323g = new ArrayList();
                }
                this.f6323g.add(C2807f.m7691a(str, " \"'<>#&=", true, false, true, true));
                this.f6323g.add(str2 != null ? C2807f.m7691a(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C2807f mo17569b() {
            if (this.f6317a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f6320d != null) {
                return new C2807f(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6317a);
            sb.append("://");
            if (!this.f6318b.isEmpty() || !this.f6319c.isEmpty()) {
                sb.append(this.f6318b);
                if (!this.f6319c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f6319c);
                }
                sb.append('@');
            }
            if (this.f6320d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f6320d);
                sb.append(']');
            } else {
                sb.append(this.f6320d);
            }
            int a = mo17564a();
            if (a != C2807f.m7688a(this.f6317a)) {
                sb.append(':');
                sb.append(a);
            }
            C2807f.m7696a(sb, this.f6322f);
            if (this.f6323g != null) {
                sb.append('?');
                C2807f.m7699b(sb, this.f6323g);
            }
            if (this.f6324h != null) {
                sb.append('#');
                sb.append(this.f6324h);
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2809a mo17565a(C2807f fVar, String str) {
            int a;
            int i;
            C2807f fVar2 = fVar;
            String str2 = str;
            int a2 = C2803i.m7667a(str2, 0, str.length());
            int b = C2803i.m7675b(str2, a2, str.length());
            if (m7709b(str2, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f6317a = "https";
                    a2 += 6;
                } else if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                    return C2809a.UNSUPPORTED_SCHEME;
                } else {
                    this.f6317a = "http";
                    a2 += 5;
                }
            } else if (fVar2 == null) {
                return C2809a.MISSING_SCHEME;
            } else {
                this.f6317a = fVar2.f6308a;
            }
            int c = m7710c(str2, a2, b);
            char c2 = '?';
            char c3 = '#';
            if (c >= 2 || fVar2 == null || !fVar2.f6308a.equals(this.f6317a)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = a2 + c;
                while (true) {
                    a = C2803i.m7669a(str2, i2, b, "@/\\?#");
                    char charAt = a != b ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int d = m7712d(str2, i2, i3);
                        int i4 = d + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a3 = C2803i.m7668a(str2, i2, a, ':');
                                int i5 = a3;
                                String str3 = "%40";
                                i = a;
                                String a4 = C2807f.m7689a(str, i2, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a4 = this.f6318b + str3 + a4;
                                }
                                this.f6318b = a4;
                                if (i5 != i) {
                                    this.f6319c = C2807f.m7689a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = a;
                                this.f6319c += "%40" + C2807f.m7689a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int d2 = m7712d(str2, i2, i32);
                int i42 = d2 + 1;
                if (i42 < i32) {
                    this.f6320d = m7713e(str2, i2, d2);
                    int f = m7715f(str2, i42, i32);
                    this.f6321e = f;
                    if (f == -1) {
                        return C2809a.INVALID_PORT;
                    }
                } else {
                    this.f6320d = m7713e(str2, i2, d2);
                    this.f6321e = C2807f.m7688a(this.f6317a);
                }
                if (this.f6320d == null) {
                    return C2809a.INVALID_HOST;
                }
                a2 = i32;
            } else {
                this.f6318b = fVar.mo17557b();
                this.f6319c = fVar.mo17558c();
                this.f6320d = fVar2.f6309b;
                this.f6321e = fVar2.f6310c;
                this.f6322f.clear();
                this.f6322f.addAll(fVar.mo17559d());
                if (a2 == b || str2.charAt(a2) == '#') {
                    mo17571d(fVar.mo17560e());
                }
            }
            int a5 = C2803i.m7669a(str2, a2, b, "?#");
            m7707a(str2, a2, a5);
            if (a5 < b && str2.charAt(a5) == '?') {
                int a6 = C2803i.m7668a(str2, a5, b, '#');
                this.f6323g = C2807f.m7698b(C2807f.m7689a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, (Charset) null));
                a5 = a6;
            }
            if (a5 < b && str2.charAt(a5) == '#') {
                this.f6324h = C2807f.m7689a(str, 1 + a5, b, "", true, false, false, false, (Charset) null);
            }
            return C2809a.SUCCESS;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: a */
        private void m7707a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f6322f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f6322f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f6322f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = com.bytedance.sdk.component.p104b.p105a.p108b.C2803i.m7669a((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m7708a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p104b.p105a.C2807f.C2808a.m7707a(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private void m7708a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C2807f.m7689a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m7714e(a)) {
                if (m7716f(a)) {
                    m7711c();
                    return;
                }
                List<String> list = this.f6322f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f6322f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f6322f.add(a);
                }
                if (z) {
                    this.f6322f.add("");
                }
            }
        }

        /* renamed from: e */
        private boolean m7714e(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: f */
        private boolean m7716f(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: c */
        private void m7711c() {
            List<String> list = this.f6322f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f6322f.isEmpty()) {
                this.f6322f.add("");
                return;
            }
            List<String> list2 = this.f6322f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: b */
        private static int m7709b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: c */
        private static int m7710c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m7712d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: e */
        private static String m7713e(String str, int i, int i2) {
            return C2803i.m7670a(C2807f.m7690a(str, i, i2, false));
        }

        /* renamed from: f */
        private static int m7715f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C2807f.m7689a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
    }
}
