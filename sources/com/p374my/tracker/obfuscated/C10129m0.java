package com.p374my.tracker.obfuscated;

import android.location.Location;
import com.p374my.tracker.MyTracker;
import com.p374my.tracker.obfuscated.C10101c;
import com.p374my.tracker.obfuscated.C10170t;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.m0 */
public final class C10129m0 implements C10170t.C10171a {

    /* renamed from: a */
    final C10130a f25252a;

    /* renamed from: b */
    final C10149r f25253b;

    /* renamed from: c */
    final C10141k f25254c;

    /* renamed from: d */
    final C10144m f25255d;

    /* renamed from: e */
    final C10145n f25256e;

    /* renamed from: f */
    final C10148q f25257f;

    /* renamed from: g */
    final C10143l f25258g;

    /* renamed from: h */
    final List<C10147p> f25259h;

    /* renamed from: i */
    final ByteArrayOutputStream f25260i;

    /* renamed from: j */
    final ByteArrayOutputStream f25261j;

    /* renamed from: k */
    String f25262k;

    /* renamed from: l */
    byte[] f25263l;

    /* renamed from: m */
    long f25264m = -1;

    /* renamed from: n */
    long f25265n = -1;

    /* renamed from: o */
    int f25266o = -1;

    /* renamed from: com.my.tracker.obfuscated.m0$a */
    static final class C10130a extends C10147p {

        /* renamed from: b */
        final C10131a f25267b = new C10131a();

        /* renamed from: c */
        String f25268c;

        /* renamed from: d */
        String f25269d;

        /* renamed from: e */
        String f25270e;

        /* renamed from: f */
        String f25271f;

        /* renamed from: com.my.tracker.obfuscated.m0$a$a */
        static final class C10131a {

            /* renamed from: a */
            String f25272a;

            /* renamed from: b */
            long f25273b = -1;

            C10131a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo66341a(ByteArrayOutputStream byteArrayOutputStream) {
                C10158o0.m30365a(1, this.f25272a, (OutputStream) byteArrayOutputStream);
                long j = this.f25273b;
                if (j != -1) {
                    C10158o0.m30362a(2, j, (OutputStream) byteArrayOutputStream);
                }
            }
        }

        C10130a() {
            super(21);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f25267b.mo66341a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C10158o0.m30363a(31, byteArrayOutputStream2, (OutputStream) byteArrayOutputStream);
            }
            C10158o0.m30365a(1, this.f25268c, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(2, this.f25269d, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(3, this.f25270e, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(4, this.f25271f, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$b */
    static final class C10132b extends C10139i {

        /* renamed from: b */
        final int f25274b;

        /* renamed from: c */
        final int f25275c;

        /* renamed from: d */
        final int f25276d;

        /* renamed from: e */
        final int f25277e;

        /* renamed from: f */
        final int f25278f;

        /* renamed from: g */
        final int f25279g;

        /* renamed from: h */
        final int f25280h;

        /* renamed from: i */
        final int f25281i;

        /* renamed from: j */
        final int f25282j;

        /* renamed from: k */
        final int f25283k;

        /* renamed from: l */
        final int f25284l;

        /* renamed from: m */
        final int f25285m;

        C10132b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            super(32);
            this.f25274b = i;
            this.f25275c = i2;
            this.f25276d = i3;
            this.f25277e = i4;
            this.f25278f = i5;
            this.f25279g = i6;
            this.f25280h = i7;
            this.f25281i = i8;
            this.f25282j = i9;
            this.f25283k = i10;
            this.f25284l = i11;
            this.f25285m = i12;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10139i.m30330a(1, this.f25274b, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(2, this.f25275c, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(3, this.f25276d, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25277e, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25278f, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25279g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(7, this.f25280h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(8, this.f25281i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(9, this.f25282j, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(10, this.f25283k, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(11, this.f25284l, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(12, this.f25285m, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$c */
    static final class C10133c extends C10135e {

        /* renamed from: g */
        final int f25286g;

        /* renamed from: h */
        final int f25287h;

        /* renamed from: i */
        final int f25288i;

        /* renamed from: j */
        final int f25289j;

        /* renamed from: k */
        final int f25290k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10133c(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(33, str, str2, i5, i6, i7);
            this.f25286g = i;
            this.f25287h = i2;
            this.f25288i = i3;
            this.f25289j = i4;
            this.f25290k = i8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            C10139i.m30330a(3, this.f25286g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25287h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25288i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25289j, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(10, this.f25290k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$d */
    static final class C10134d extends C10135e {

        /* renamed from: g */
        final int f25291g;

        /* renamed from: h */
        final int f25292h;

        /* renamed from: i */
        final int f25293i;

        /* renamed from: j */
        final int f25294j;

        /* renamed from: k */
        final int f25295k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10134d(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(34, str, str2, i5, i6, i7);
            this.f25291g = i;
            this.f25292h = i2;
            this.f25293i = i3;
            this.f25294j = i4;
            this.f25295k = i8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            C10139i.m30330a(3, this.f25291g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25292h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25293i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25294j, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(10, this.f25295k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$e */
    static abstract class C10135e extends C10139i {

        /* renamed from: b */
        final String f25296b;

        /* renamed from: c */
        final String f25297c;

        /* renamed from: d */
        final int f25298d;

        /* renamed from: e */
        final int f25299e;

        /* renamed from: f */
        final int f25300f;

        protected C10135e(int i, String str, String str2, int i2, int i3, int i4) {
            super(i);
            this.f25296b = str;
            this.f25297c = str2;
            this.f25298d = i2;
            this.f25299e = i3;
            this.f25300f = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10158o0.m30365a(1, this.f25296b, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(2, this.f25297c, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(7, this.f25298d, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(8, this.f25299e, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(9, this.f25300f, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$f */
    static final class C10136f extends C10135e {

        /* renamed from: g */
        final long f25301g;

        /* renamed from: h */
        final int f25302h;

        /* renamed from: i */
        final int f25303i;

        /* renamed from: j */
        final int f25304j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10136f(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
            super(37, str, str2, i4, i5, i6);
            this.f25301g = j;
            this.f25302h = i;
            this.f25303i = i2;
            this.f25304j = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            C10139i.m30331a(3, this.f25301g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25302h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25303i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25304j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$g */
    static final class C10137g extends C10135e {

        /* renamed from: g */
        final int f25305g;

        /* renamed from: h */
        final int f25306h;

        /* renamed from: i */
        final int f25307i;

        /* renamed from: j */
        final int f25308j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10137g(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(36, str, str2, i5, i6, i7);
            this.f25305g = i;
            this.f25306h = i2;
            this.f25307i = i3;
            this.f25308j = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            C10139i.m30330a(3, this.f25305g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25306h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25307i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25308j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$h */
    static final class C10138h extends C10135e {

        /* renamed from: g */
        final int f25309g;

        /* renamed from: h */
        final int f25310h;

        /* renamed from: i */
        final int f25311i;

        /* renamed from: j */
        final int f25312j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10138h(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(35, str, str2, i5, i6, i7);
            this.f25309g = i;
            this.f25310h = i2;
            this.f25311i = i3;
            this.f25312j = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            C10139i.m30330a(3, this.f25309g, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(4, this.f25310h, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(5, this.f25311i, (OutputStream) byteArrayOutputStream);
            C10139i.m30330a(6, this.f25312j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$i */
    static abstract class C10139i extends C10147p {
        protected C10139i(int i) {
            super(i);
        }

        /* renamed from: a */
        protected static void m30330a(int i, int i2, OutputStream outputStream) {
            if (C10122l.m30153a(i2)) {
                C10158o0.m30372b(i, i2, outputStream);
            }
        }

        /* renamed from: a */
        protected static void m30331a(int i, long j, OutputStream outputStream) {
            if (C10122l.m30154a(j)) {
                C10158o0.m30362a(i, j, outputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$j */
    static final class C10140j extends C10147p {

        /* renamed from: b */
        final String f25313b;

        /* renamed from: c */
        final String f25314c;

        /* renamed from: d */
        final int f25315d;

        /* renamed from: e */
        final int f25316e;

        /* renamed from: f */
        final int f25317f;

        C10140j(String str, String str2, int i, int i2, int i3) {
            super(28);
            this.f25313b = str;
            this.f25314c = str2;
            this.f25315d = i;
            this.f25316e = i2;
            this.f25317f = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10158o0.m30365a(1, this.f25314c, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(2, this.f25313b, (OutputStream) byteArrayOutputStream);
            C10158o0.m30372b(3, this.f25315d, byteArrayOutputStream);
            C10158o0.m30372b(5, this.f25316e, byteArrayOutputStream);
            C10158o0.m30372b(6, this.f25317f, byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$k */
    static final class C10141k extends C10147p {

        /* renamed from: A */
        String f25318A;

        /* renamed from: b */
        final C10142a f25319b = new C10142a();

        /* renamed from: c */
        int f25320c = -1;

        /* renamed from: d */
        String f25321d;

        /* renamed from: e */
        String f25322e;

        /* renamed from: f */
        String f25323f;

        /* renamed from: g */
        String f25324g;

        /* renamed from: h */
        String f25325h;

        /* renamed from: i */
        String f25326i;

        /* renamed from: j */
        String f25327j;

        /* renamed from: k */
        int f25328k = -1;

        /* renamed from: l */
        int f25329l = -1;

        /* renamed from: m */
        int f25330m = -1;

        /* renamed from: n */
        int f25331n = -1;

        /* renamed from: o */
        float f25332o = Float.NaN;

        /* renamed from: p */
        float f25333p = Float.NaN;

        /* renamed from: q */
        float f25334q = Float.NaN;

        /* renamed from: r */
        String f25335r;

        /* renamed from: s */
        int f25336s = -1;

        /* renamed from: t */
        int f25337t = -1;

        /* renamed from: u */
        long f25338u = -1;

        /* renamed from: v */
        long f25339v = -1;

        /* renamed from: w */
        long f25340w = -1;

        /* renamed from: x */
        long f25341x = -1;

        /* renamed from: y */
        int f25342y = -1;

        /* renamed from: z */
        int f25343z = -1;

        /* renamed from: com.my.tracker.obfuscated.m0$k$a */
        static final class C10142a {

            /* renamed from: a */
            String f25344a;

            /* renamed from: b */
            String f25345b;

            /* renamed from: c */
            int f25346c = -1;

            /* renamed from: d */
            String f25347d;

            /* renamed from: e */
            int f25348e = -1;

            C10142a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo66342a(ByteArrayOutputStream byteArrayOutputStream) {
                C10158o0.m30365a(1, this.f25344a, (OutputStream) byteArrayOutputStream);
                C10158o0.m30365a(2, this.f25345b, (OutputStream) byteArrayOutputStream);
                int i = this.f25346c;
                if (i != -1) {
                    C10158o0.m30372b(3, i, byteArrayOutputStream);
                }
                C10158o0.m30365a(4, this.f25347d, (OutputStream) byteArrayOutputStream);
                int i2 = this.f25348e;
                if (i2 != -1) {
                    C10158o0.m30372b(5, i2, byteArrayOutputStream);
                }
            }
        }

        C10141k() {
            super(23);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f25319b.mo66342a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C10158o0.m30363a(31, byteArrayOutputStream2, (OutputStream) byteArrayOutputStream);
            }
            int i = this.f25320c;
            if (i != -1) {
                C10158o0.m30372b(1, i, byteArrayOutputStream);
            }
            C10158o0.m30365a(2, this.f25321d, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(3, this.f25322e, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(4, this.f25323f, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(5, this.f25324g, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(6, this.f25325h, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(7, this.f25326i, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(8, this.f25327j, (OutputStream) byteArrayOutputStream);
            int i2 = this.f25328k;
            if (i2 != -1) {
                C10158o0.m30372b(9, i2, byteArrayOutputStream);
            }
            int i3 = this.f25329l;
            if (i3 > -1) {
                C10158o0.m30372b(10, i3, byteArrayOutputStream);
            }
            int i4 = this.f25330m;
            if (i4 > -1) {
                C10158o0.m30372b(11, i4, byteArrayOutputStream);
            }
            int i5 = this.f25331n;
            if (i5 > -1) {
                C10158o0.m30372b(12, i5, byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f25332o)) {
                C10158o0.m30360a(13, this.f25332o, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f25333p)) {
                C10158o0.m30360a(14, this.f25333p, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f25334q)) {
                C10158o0.m30360a(15, this.f25334q, (OutputStream) byteArrayOutputStream);
            }
            C10158o0.m30365a(16, this.f25335r, (OutputStream) byteArrayOutputStream);
            int i6 = this.f25336s;
            if (i6 > -1) {
                C10158o0.m30372b(17, i6, byteArrayOutputStream);
            }
            int i7 = this.f25337t;
            if (i7 > -1) {
                C10158o0.m30372b(18, i7, byteArrayOutputStream);
            }
            long j = this.f25338u;
            if (j > -1) {
                C10158o0.m30362a(19, j, (OutputStream) byteArrayOutputStream);
            }
            long j2 = this.f25339v;
            if (j2 > -1) {
                C10158o0.m30362a(20, j2, (OutputStream) byteArrayOutputStream);
            }
            long j3 = this.f25340w;
            if (j3 > -1) {
                C10158o0.m30362a(21, j3, (OutputStream) byteArrayOutputStream);
            }
            long j4 = this.f25341x;
            if (j4 > -1) {
                C10158o0.m30362a(22, j4, (OutputStream) byteArrayOutputStream);
            }
            int i8 = this.f25342y;
            if (i8 != -1) {
                C10158o0.m30372b(23, i8, byteArrayOutputStream);
            }
            int i9 = this.f25343z;
            if (i9 > -1) {
                C10158o0.m30372b(24, i9, byteArrayOutputStream);
            }
            C10158o0.m30365a(25, this.f25318A, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$l */
    static final class C10143l extends C10147p {

        /* renamed from: b */
        int f25349b = -1;

        /* renamed from: c */
        double f25350c = Double.NaN;

        /* renamed from: d */
        double f25351d = Double.NaN;

        /* renamed from: e */
        double f25352e = Double.NaN;

        /* renamed from: f */
        double f25353f = Double.NaN;

        /* renamed from: g */
        long f25354g = -1;

        C10143l() {
            super(26);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            if (!Double.isNaN(this.f25350c)) {
                C10158o0.m30359a(1, this.f25350c, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f25351d)) {
                C10158o0.m30359a(2, this.f25351d, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f25352e)) {
                C10158o0.m30359a(3, this.f25352e, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f25353f)) {
                C10158o0.m30359a(4, this.f25353f, (OutputStream) byteArrayOutputStream);
            }
            long j = this.f25354g;
            if (j > -1) {
                C10158o0.m30362a(5, j, (OutputStream) byteArrayOutputStream);
            }
            int i = this.f25349b;
            if (i != -1) {
                C10158o0.m30372b(6, i, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$m */
    static final class C10144m extends C10147p {

        /* renamed from: b */
        String f25355b;

        /* renamed from: c */
        String f25356c;

        /* renamed from: d */
        String f25357d;

        C10144m() {
            super(24);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10158o0.m30365a(1, this.f25355b, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(2, this.f25356c, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(3, this.f25357d, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$n */
    static final class C10145n extends C10147p {

        /* renamed from: b */
        int f25358b = -1;

        /* renamed from: c */
        int f25359c = -1;

        /* renamed from: d */
        String f25360d;

        /* renamed from: e */
        String f25361e;

        /* renamed from: f */
        String f25362f;

        /* renamed from: g */
        String f25363g;

        /* renamed from: h */
        String f25364h;

        /* renamed from: i */
        byte[] f25365i;

        C10145n() {
            super(25);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f25358b;
            if (i != -1) {
                C10158o0.m30372b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f25359c;
            if (i2 != -1) {
                C10158o0.m30372b(7, i2, byteArrayOutputStream);
            }
            C10158o0.m30365a(2, this.f25360d, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(3, this.f25361e, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(4, this.f25362f, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(5, this.f25363g, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(6, this.f25364h, (OutputStream) byteArrayOutputStream);
            C10158o0.m30366a(8, this.f25365i, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$o */
    static final class C10146o extends C10147p {

        /* renamed from: b */
        final C10101c.C10102a f25366b;

        protected C10146o(C10101c.C10102a aVar) {
            super(31);
            this.f25366b = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10158o0.m30365a(1, this.f25366b.f25154a, (OutputStream) byteArrayOutputStream);
            C10158o0.m30362a(2, this.f25366b.f25155b, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$p */
    static abstract class C10147p {

        /* renamed from: a */
        final int f25367a;

        protected C10147p(int i) {
            this.f25367a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo66343a(OutputStream outputStream, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            mo66340a(byteArrayOutputStream, byteArrayOutputStream2);
            if (byteArrayOutputStream.size() > 0) {
                C10158o0.m30363a(this.f25367a, byteArrayOutputStream, outputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$q */
    static final class C10148q extends C10147p {

        /* renamed from: b */
        int f25368b = -1;

        /* renamed from: c */
        int f25369c = -1;

        /* renamed from: d */
        int f25370d = -1;

        /* renamed from: e */
        int f25371e = -1;

        /* renamed from: f */
        int f25372f = -1;

        /* renamed from: g */
        int f25373g = -1;

        /* renamed from: h */
        int f25374h = -1;

        /* renamed from: i */
        int f25375i = -1;

        /* renamed from: j */
        int f25376j = -1;

        /* renamed from: k */
        int f25377k = -1;

        /* renamed from: l */
        int f25378l = -1;

        /* renamed from: m */
        int f25379m = -1;

        /* renamed from: n */
        int f25380n = -1;

        /* renamed from: o */
        int f25381o = -1;

        C10148q() {
            super(27);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f25368b;
            if (i > -1) {
                C10158o0.m30372b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f25369c;
            if (i2 != -1) {
                C10158o0.m30372b(2, i2, byteArrayOutputStream);
            }
            int i3 = this.f25370d;
            if (i3 != -1) {
                C10158o0.m30372b(3, i3, byteArrayOutputStream);
            }
            int i4 = this.f25371e;
            if (i4 != -1) {
                C10158o0.m30372b(4, i4, byteArrayOutputStream);
            }
            int i5 = this.f25372f;
            if (i5 > -1) {
                C10158o0.m30372b(5, i5, byteArrayOutputStream);
            }
            int i6 = this.f25373g;
            if (i6 > -1) {
                C10158o0.m30372b(6, i6, byteArrayOutputStream);
            }
            int i7 = this.f25374h;
            if (i7 != -1) {
                C10158o0.m30372b(7, i7, byteArrayOutputStream);
            }
            int i8 = this.f25375i;
            if (i8 != -1) {
                C10158o0.m30372b(8, i8, byteArrayOutputStream);
            }
            int i9 = this.f25376j;
            if (i9 != -1) {
                C10158o0.m30372b(9, i9, byteArrayOutputStream);
            }
            int i10 = this.f25377k;
            if (i10 != -1) {
                C10158o0.m30372b(11, i10, byteArrayOutputStream);
            }
            int i11 = this.f25378l;
            if (i11 != -1) {
                C10158o0.m30372b(12, i11, byteArrayOutputStream);
            }
            int i12 = this.f25379m;
            if (i12 != -1) {
                C10158o0.m30372b(13, i12, byteArrayOutputStream);
            }
            int i13 = this.f25380n;
            if (i13 != -1) {
                C10158o0.m30372b(14, i13, byteArrayOutputStream);
            }
            int i14 = this.f25381o;
            if (i14 != -1) {
                C10158o0.m30372b(15, i14, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$r */
    static final class C10149r extends C10147p {

        /* renamed from: b */
        int f25382b = -1;

        /* renamed from: c */
        int f25383c = -1;

        /* renamed from: d */
        String[] f25384d;

        /* renamed from: e */
        String[] f25385e;

        /* renamed from: f */
        String[] f25386f;

        /* renamed from: g */
        String[] f25387g;

        /* renamed from: h */
        String[] f25388h;

        /* renamed from: i */
        String[] f25389i;

        /* renamed from: j */
        String[] f25390j;

        C10149r() {
            super(22);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f25382b;
            if (i != -1) {
                C10158o0.m30372b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f25383c;
            if (i2 > -1) {
                C10158o0.m30372b(2, i2, byteArrayOutputStream);
            }
            C10158o0.m30367a(3, this.f25384d, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(4, this.f25385e, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(5, this.f25386f, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(6, this.f25387g, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(7, this.f25388h, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(8, this.f25389i, (OutputStream) byteArrayOutputStream);
            C10158o0.m30367a(9, this.f25390j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$s */
    static final class C10150s extends C10147p {

        /* renamed from: b */
        final String f25391b;

        /* renamed from: c */
        final String f25392c;

        /* renamed from: d */
        final int f25393d;

        C10150s(String str, String str2, int i) {
            super(29);
            this.f25391b = str;
            this.f25392c = str2;
            this.f25393d = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo66340a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C10158o0.m30365a(1, this.f25392c, (OutputStream) byteArrayOutputStream);
            C10158o0.m30365a(2, this.f25391b, (OutputStream) byteArrayOutputStream);
            C10158o0.m30372b(3, this.f25393d, byteArrayOutputStream);
        }
    }

    private C10129m0(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        C10130a aVar = new C10130a();
        this.f25252a = aVar;
        C10149r rVar = new C10149r();
        this.f25253b = rVar;
        C10141k kVar = new C10141k();
        this.f25254c = kVar;
        C10144m mVar = new C10144m();
        this.f25255d = mVar;
        C10145n nVar = new C10145n();
        this.f25256e = nVar;
        C10148q qVar = new C10148q();
        this.f25257f = qVar;
        C10143l lVar = new C10143l();
        this.f25258g = lVar;
        this.f25259h = C10110g.m30075a((T[]) new C10147p[]{aVar, rVar, kVar, mVar, nVar, qVar, lVar});
        this.f25260i = byteArrayOutputStream;
        this.f25261j = byteArrayOutputStream2;
    }

    /* renamed from: a */
    public static C10129m0 m30237a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        return new C10129m0(byteArrayOutputStream, byteArrayOutputStream2);
    }

    /* renamed from: a */
    public String mo66257a() {
        return "application/octet-stream";
    }

    /* renamed from: a */
    public void mo66258a(float f) {
        this.f25254c.f25334q = f;
    }

    /* renamed from: a */
    public void mo66259a(int i) {
        this.f25257f.f25372f = i;
    }

    /* renamed from: a */
    public void mo66260a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f25259h.add(new C10132b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12));
    }

    /* renamed from: a */
    public void mo66261a(int i, String str) {
        C10145n nVar = this.f25256e;
        nVar.f25358b = i;
        nVar.f25360d = str;
    }

    /* renamed from: a */
    public void mo66262a(long j) {
        this.f25254c.f25341x = j;
    }

    /* renamed from: a */
    public void mo66263a(Location location, int i) {
        this.f25258g.f25351d = location.getLongitude();
        this.f25258g.f25350c = location.getLatitude();
        this.f25258g.f25353f = (double) location.getAccuracy();
        this.f25258g.f25352e = (double) location.getSpeed();
        this.f25258g.f25354g = C10173t0.m30435b(location.getTime());
        this.f25258g.f25349b = i;
    }

    /* renamed from: a */
    public void mo66264a(OutputStream outputStream) {
        C10158o0.m30365a(1, MyTracker.VERSION, outputStream);
        C10158o0.m30365a(2, this.f25262k, outputStream);
        long j = this.f25264m;
        if (j > -1) {
            C10158o0.m30362a(3, j, outputStream);
        }
        long j2 = this.f25265n;
        if (j2 > -1) {
            C10158o0.m30362a(4, j2, outputStream);
        }
        int i = this.f25266o;
        if (i > -1) {
            C10158o0.m30372b(5, i, outputStream);
        }
        byte[] bArr = this.f25263l;
        if (bArr != null) {
            outputStream.write(bArr);
        }
        for (C10147p a : this.f25259h) {
            this.f25260i.reset();
            this.f25261j.reset();
            a.mo66343a(outputStream, this.f25260i, this.f25261j);
        }
    }

    /* renamed from: a */
    public void mo66265a(String str) {
        this.f25254c.f25319b.f25344a = str;
    }

    /* renamed from: a */
    public void mo66266a(String str, int i) {
        C10130a.C10131a aVar = this.f25252a.f25267b;
        aVar.f25272a = str;
        aVar.f25273b = (long) i;
    }

    /* renamed from: a */
    public void mo66267a(String str, String str2, int i) {
        this.f25259h.add(new C10150s(str, str2, i));
    }

    /* renamed from: a */
    public void mo66268a(String str, String str2, int i, int i2, int i3) {
        this.f25259h.add(new C10140j(str, str2, i, i2, i3));
    }

    /* renamed from: a */
    public void mo66269a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f25259h.add(new C10137g(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public void mo66270a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f25259h.add(new C10133c(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: a */
    public void mo66271a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f25259h.add(new C10136f(str, str2, j, i, i2, i3, i4, i5, i6));
    }

    /* renamed from: a */
    public void mo66272a(String str, boolean z) {
        C10141k.C10142a aVar = this.f25254c.f25319b;
        aVar.f25345b = str;
        aVar.f25346c = z ? 1 : 0;
    }

    /* renamed from: a */
    public void mo66273a(List<C10101c.C10102a> list) {
        for (C10101c.C10102a oVar : list) {
            this.f25259h.add(new C10146o(oVar));
        }
    }

    /* renamed from: a */
    public void mo66274a(byte[] bArr) {
        this.f25263l = bArr;
    }

    /* renamed from: a */
    public void mo66275a(String[] strArr) {
        this.f25253b.f25388h = strArr;
    }

    /* renamed from: b */
    public void mo66276b() {
        this.f25257f.f25374h = 0;
    }

    /* renamed from: b */
    public void mo66277b(float f) {
        this.f25254c.f25332o = f;
    }

    /* renamed from: b */
    public void mo66278b(int i) {
        this.f25257f.f25373g = i;
    }

    /* renamed from: b */
    public void mo66279b(long j) {
        this.f25254c.f25340w = j;
    }

    /* renamed from: b */
    public void mo66280b(String str) {
        this.f25252a.f25269d = str;
    }

    /* renamed from: b */
    public void mo66281b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f25259h.add(new C10138h(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: b */
    public void mo66282b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f25259h.add(new C10134d(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: b */
    public void mo66283b(String str, boolean z) {
        C10141k.C10142a aVar = this.f25254c.f25319b;
        aVar.f25347d = str;
        aVar.f25348e = z ? 1 : 0;
    }

    /* renamed from: b */
    public void mo66284b(byte[] bArr) {
        this.f25256e.f25365i = bArr;
    }

    /* renamed from: b */
    public void mo66285b(String[] strArr) {
        this.f25253b.f25386f = strArr;
    }

    /* renamed from: c */
    public void mo66286c() {
        this.f25257f.f25379m = 0;
    }

    /* renamed from: c */
    public void mo66287c(float f) {
        this.f25254c.f25333p = f;
    }

    /* renamed from: c */
    public void mo66288c(int i) {
        this.f25257f.f25368b = i;
    }

    /* renamed from: c */
    public void mo66289c(long j) {
        this.f25254c.f25339v = j;
    }

    /* renamed from: c */
    public void mo66290c(String str) {
        this.f25262k = str;
    }

    /* renamed from: c */
    public void mo66291c(String[] strArr) {
        this.f25253b.f25387g = strArr;
    }

    /* renamed from: d */
    public void mo66292d() {
        this.f25257f.f25377k = 0;
    }

    /* renamed from: d */
    public void mo66293d(int i) {
        this.f25253b.f25383c = i;
    }

    /* renamed from: d */
    public void mo66294d(long j) {
        this.f25254c.f25338u = j;
    }

    /* renamed from: d */
    public void mo66295d(String str) {
        this.f25252a.f25270e = str;
    }

    /* renamed from: d */
    public void mo66296d(String[] strArr) {
        this.f25253b.f25384d = strArr;
    }

    /* renamed from: e */
    public void mo66297e() {
        this.f25257f.f25378l = 0;
    }

    /* renamed from: e */
    public void mo66298e(int i) {
        this.f25254c.f25337t = i;
    }

    /* renamed from: e */
    public void mo66299e(long j) {
        this.f25264m = j;
    }

    /* renamed from: e */
    public void mo66300e(String str) {
        this.f25252a.f25271f = str;
    }

    /* renamed from: e */
    public void mo66301e(String[] strArr) {
        this.f25253b.f25389i = strArr;
    }

    /* renamed from: f */
    public void mo66302f() {
        this.f25257f.f25375i = 0;
    }

    /* renamed from: f */
    public void mo66303f(int i) {
        this.f25254c.f25336s = i;
    }

    /* renamed from: f */
    public void mo66304f(long j) {
        this.f25265n = j;
    }

    /* renamed from: f */
    public void mo66305f(String str) {
        this.f25252a.f25268c = str;
    }

    /* renamed from: f */
    public void mo66306f(String[] strArr) {
        this.f25253b.f25390j = strArr;
    }

    /* renamed from: g */
    public void mo66307g() {
        this.f25257f.f25376j = 0;
    }

    /* renamed from: g */
    public void mo66308g(int i) {
        this.f25256e.f25359c = i;
    }

    /* renamed from: g */
    public void mo66309g(String str) {
        this.f25254c.f25325h = str;
    }

    /* renamed from: g */
    public void mo66310g(String[] strArr) {
        this.f25253b.f25385e = strArr;
    }

    /* renamed from: h */
    public void mo66311h() {
        this.f25257f.f25380n = 0;
    }

    /* renamed from: h */
    public void mo66312h(int i) {
        this.f25266o = i;
    }

    /* renamed from: h */
    public void mo66313h(String str) {
        this.f25254c.f25326i = str;
    }

    /* renamed from: i */
    public void mo66314i() {
        this.f25257f.f25381o = 0;
    }

    /* renamed from: i */
    public void mo66315i(int i) {
        this.f25254c.f25331n = i;
    }

    /* renamed from: i */
    public void mo66316i(String str) {
        this.f25254c.f25318A = str;
    }

    /* renamed from: j */
    public void mo66317j() {
        this.f25257f.f25370d = 0;
    }

    /* renamed from: j */
    public void mo66318j(int i) {
        this.f25253b.f25382b = i;
    }

    /* renamed from: j */
    public void mo66319j(String str) {
        this.f25254c.f25324g = str;
    }

    /* renamed from: k */
    public void mo66320k() {
        this.f25257f.f25371e = 0;
    }

    /* renamed from: k */
    public void mo66321k(int i) {
        this.f25254c.f25330m = i;
    }

    /* renamed from: k */
    public void mo66322k(String str) {
        this.f25254c.f25335r = str;
    }

    /* renamed from: l */
    public void mo66323l() {
        this.f25257f.f25369c = 0;
    }

    /* renamed from: l */
    public void mo66324l(int i) {
        this.f25254c.f25320c = i;
    }

    /* renamed from: l */
    public void mo66325l(String str) {
        this.f25254c.f25327j = str;
    }

    /* renamed from: m */
    public void mo66326m(int i) {
        if (i == 1) {
            this.f25254c.f25328k = i;
        }
    }

    /* renamed from: m */
    public void mo66327m(String str) {
        this.f25255d.f25355b = str;
    }

    /* renamed from: n */
    public void mo66328n(int i) {
        this.f25254c.f25342y = i;
    }

    /* renamed from: n */
    public void mo66329n(String str) {
        this.f25255d.f25356c = str;
    }

    /* renamed from: o */
    public void mo66330o(int i) {
        this.f25254c.f25343z = i;
    }

    /* renamed from: o */
    public void mo66331o(String str) {
        this.f25255d.f25357d = str;
    }

    /* renamed from: p */
    public void mo66332p(int i) {
        this.f25254c.f25329l = i;
    }

    /* renamed from: p */
    public void mo66333p(String str) {
        this.f25254c.f25322e = str;
    }

    /* renamed from: q */
    public void mo66334q(String str) {
        this.f25254c.f25321d = str;
    }

    /* renamed from: r */
    public void mo66335r(String str) {
        this.f25256e.f25362f = str;
    }

    /* renamed from: s */
    public void mo66336s(String str) {
        this.f25256e.f25363g = str;
    }

    /* renamed from: t */
    public void mo66337t(String str) {
        this.f25256e.f25361e = str;
    }

    /* renamed from: u */
    public void mo66338u(String str) {
        this.f25256e.f25364h = str;
    }

    /* renamed from: v */
    public void mo66339v(String str) {
        this.f25254c.f25323f = str;
    }
}
