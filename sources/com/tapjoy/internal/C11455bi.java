package com.tapjoy.internal;

import com.tapjoy.internal.C11452bh;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tapjoy.internal.bi */
public final class C11455bi extends C11452bh {

    /* renamed from: a */
    public static final C11452bh.C11454a f27698a = new C11452bh.C11454a() {
        /* renamed from: a */
        public final C11452bh mo72218a(Reader reader) {
            return new C11455bi(reader);
        }

        /* renamed from: a */
        public final C11452bh mo72219a(String str) {
            return new C11455bi(new StringReader(str));
        }
    };

    /* renamed from: b */
    private final C11480cd f27699b = new C11480cd();

    /* renamed from: c */
    private final Reader f27700c;

    /* renamed from: d */
    private boolean f27701d = false;

    /* renamed from: e */
    private final char[] f27702e = new char[1024];

    /* renamed from: f */
    private int f27703f = 0;

    /* renamed from: g */
    private int f27704g = 0;

    /* renamed from: h */
    private int f27705h = 1;

    /* renamed from: i */
    private int f27706i = 1;

    /* renamed from: j */
    private final List<C11459bk> f27707j = new ArrayList();

    /* renamed from: k */
    private C11461bm f27708k;

    /* renamed from: l */
    private String f27709l;

    /* renamed from: m */
    private String f27710m;

    /* renamed from: n */
    private int f27711n;

    /* renamed from: o */
    private int f27712o;

    /* renamed from: p */
    private boolean f27713p;

    public C11455bi(Reader reader) {
        m33292a(C11459bk.EMPTY_DOCUMENT);
        this.f27713p = false;
        if (reader != null) {
            this.f27700c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: f */
    public final void mo72221f() {
        m33293a(C11461bm.BEGIN_ARRAY);
    }

    /* renamed from: g */
    public final void mo72222g() {
        m33293a(C11461bm.END_ARRAY);
    }

    /* renamed from: h */
    public final void mo72223h() {
        m33293a(C11461bm.BEGIN_OBJECT);
    }

    /* renamed from: i */
    public final void mo72224i() {
        m33293a(C11461bm.END_OBJECT);
    }

    /* renamed from: a */
    private void m33293a(C11461bm bmVar) {
        mo72226k();
        if (this.f27708k == bmVar) {
            m33300t();
            return;
        }
        throw new IllegalStateException("Expected " + bmVar + " but was " + mo72226k());
    }

    /* renamed from: j */
    public final boolean mo72225j() {
        mo72226k();
        return (this.f27708k == C11461bm.END_OBJECT || this.f27708k == C11461bm.END_ARRAY) ? false : true;
    }

    /* renamed from: k */
    public final C11461bm mo72226k() {
        C11461bm bmVar = this.f27708k;
        if (bmVar != null) {
            return bmVar;
        }
        int[] iArr = C114572.f27714a;
        List<C11459bk> list = this.f27707j;
        switch (iArr[list.get(list.size() - 1).ordinal()]) {
            case 1:
                m33296b(C11459bk.NONEMPTY_DOCUMENT);
                C11461bm v = m33302v();
                if (this.f27701d || this.f27708k == C11461bm.BEGIN_ARRAY || this.f27708k == C11461bm.BEGIN_OBJECT) {
                    return v;
                }
                throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.f27708k);
            case 2:
                return m33289a(true);
            case 3:
                return m33289a(false);
            case 4:
                return m33295b(true);
            case 5:
                int y = m33305y();
                if (y != 58) {
                    if (y == 61) {
                        m33306z();
                        if (this.f27703f < this.f27704g || m33294a(1)) {
                            char[] cArr = this.f27702e;
                            int i = this.f27703f;
                            if (cArr[i] == '>') {
                                this.f27703f = i + 1;
                            }
                        }
                    } else {
                        throw m33299e("Expected ':'");
                    }
                }
                m33296b(C11459bk.NONEMPTY_OBJECT);
                return m33302v();
            case 6:
                return m33295b(false);
            case 7:
                try {
                    C11461bm v2 = m33302v();
                    if (this.f27701d) {
                        return v2;
                    }
                    throw m33299e("Expected EOF");
                } catch (EOFException unused) {
                    C11461bm bmVar2 = C11461bm.END_DOCUMENT;
                    this.f27708k = bmVar2;
                    return bmVar2;
                }
            case 8:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: com.tapjoy.internal.bi$2 */
    static /* synthetic */ class C114572 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27714a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tapjoy.internal.bk[] r0 = com.tapjoy.internal.C11459bk.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27714a = r0
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.EMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.EMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.NONEMPTY_ARRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.EMPTY_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.DANGLING_NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.NONEMPTY_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.NONEMPTY_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27714a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tapjoy.internal.bk r1 = com.tapjoy.internal.C11459bk.CLOSED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11455bi.C114572.<clinit>():void");
        }
    }

    /* renamed from: t */
    private C11461bm m33300t() {
        mo72226k();
        C11461bm bmVar = this.f27708k;
        this.f27708k = null;
        this.f27710m = null;
        this.f27709l = null;
        return bmVar;
    }

    /* renamed from: l */
    public final String mo72227l() {
        mo72226k();
        if (this.f27708k == C11461bm.NAME) {
            String str = this.f27709l;
            m33300t();
            return str;
        }
        throw new IllegalStateException("Expected a name but was " + mo72226k());
    }

    /* renamed from: m */
    public final String mo72228m() {
        mo72226k();
        if (this.f27708k == C11461bm.STRING || this.f27708k == C11461bm.NUMBER) {
            String str = this.f27710m;
            m33300t();
            return str;
        }
        throw new IllegalStateException("Expected a string but was " + mo72226k());
    }

    /* renamed from: n */
    public final boolean mo72229n() {
        mo72226k();
        if (this.f27708k == C11461bm.BOOLEAN) {
            boolean z = this.f27710m == "true";
            m33300t();
            return z;
        }
        throw new IllegalStateException("Expected a boolean but was " + this.f27708k);
    }

    /* renamed from: o */
    public final void mo72230o() {
        mo72226k();
        if (this.f27708k == C11461bm.NULL) {
            m33300t();
            return;
        }
        throw new IllegalStateException("Expected null but was " + this.f27708k);
    }

    /* renamed from: p */
    public final double mo72231p() {
        mo72226k();
        if (this.f27708k == C11461bm.STRING || this.f27708k == C11461bm.NUMBER) {
            double parseDouble = Double.parseDouble(this.f27710m);
            m33300t();
            return parseDouble;
        }
        throw new IllegalStateException("Expected a double but was " + this.f27708k);
    }

    /* renamed from: q */
    public final long mo72232q() {
        long j;
        mo72226k();
        if (this.f27708k == C11461bm.STRING || this.f27708k == C11461bm.NUMBER) {
            try {
                j = Long.parseLong(this.f27710m);
            } catch (NumberFormatException unused) {
                double parseDouble = Double.parseDouble(this.f27710m);
                long j2 = (long) parseDouble;
                if (((double) j2) == parseDouble) {
                    j = j2;
                } else {
                    throw new NumberFormatException(this.f27710m);
                }
            }
            m33300t();
            return j;
        }
        throw new IllegalStateException("Expected a long but was " + this.f27708k);
    }

    /* renamed from: r */
    public final int mo72233r() {
        int i;
        mo72226k();
        if (this.f27708k == C11461bm.STRING || this.f27708k == C11461bm.NUMBER) {
            try {
                i = Integer.parseInt(this.f27710m);
            } catch (NumberFormatException unused) {
                double parseDouble = Double.parseDouble(this.f27710m);
                int i2 = (int) parseDouble;
                if (((double) i2) == parseDouble) {
                    i = i2;
                } else {
                    throw new NumberFormatException(this.f27710m);
                }
            }
            m33300t();
            return i;
        }
        throw new IllegalStateException("Expected an int but was " + this.f27708k);
    }

    public final void close() {
        this.f27710m = null;
        this.f27708k = null;
        this.f27707j.clear();
        this.f27707j.add(C11459bk.CLOSED);
        this.f27700c.close();
    }

    /* renamed from: s */
    public final void mo72234s() {
        mo72226k();
        if (this.f27708k == C11461bm.END_ARRAY || this.f27708k == C11461bm.END_OBJECT) {
            throw new IllegalStateException("Expected a value but was " + this.f27708k);
        }
        this.f27713p = true;
        int i = 0;
        do {
            try {
                C11461bm t = m33300t();
                if (t != C11461bm.BEGIN_ARRAY) {
                    if (t != C11461bm.BEGIN_OBJECT) {
                        if (t == C11461bm.END_ARRAY || t == C11461bm.END_OBJECT) {
                            i--;
                            continue;
                        }
                    }
                }
                i++;
                continue;
            } finally {
                this.f27713p = false;
            }
        } while (i != 0);
    }

    /* renamed from: u */
    private C11459bk m33301u() {
        List<C11459bk> list = this.f27707j;
        return list.remove(list.size() - 1);
    }

    /* renamed from: a */
    private void m33292a(C11459bk bkVar) {
        this.f27707j.add(bkVar);
    }

    /* renamed from: b */
    private void m33296b(C11459bk bkVar) {
        List<C11459bk> list = this.f27707j;
        list.set(list.size() - 1, bkVar);
    }

    /* renamed from: a */
    private C11461bm m33289a(boolean z) {
        if (z) {
            m33296b(C11459bk.NONEMPTY_ARRAY);
        } else {
            int y = m33305y();
            if (y != 44) {
                if (y == 59) {
                    m33306z();
                } else if (y == 93) {
                    m33301u();
                    C11461bm bmVar = C11461bm.END_ARRAY;
                    this.f27708k = bmVar;
                    return bmVar;
                } else {
                    throw m33299e("Unterminated array");
                }
            }
        }
        int y2 = m33305y();
        if (!(y2 == 44 || y2 == 59)) {
            if (y2 != 93) {
                this.f27703f--;
                return m33302v();
            } else if (z) {
                m33301u();
                C11461bm bmVar2 = C11461bm.END_ARRAY;
                this.f27708k = bmVar2;
                return bmVar2;
            }
        }
        m33306z();
        this.f27703f--;
        this.f27710m = "null";
        C11461bm bmVar3 = C11461bm.NULL;
        this.f27708k = bmVar3;
        return bmVar3;
    }

    /* renamed from: b */
    private C11461bm m33295b(boolean z) {
        if (!z) {
            int y = m33305y();
            if (!(y == 44 || y == 59)) {
                if (y == 125) {
                    m33301u();
                    C11461bm bmVar = C11461bm.END_OBJECT;
                    this.f27708k = bmVar;
                    return bmVar;
                }
                throw m33299e("Unterminated object");
            }
        } else if (m33305y() != 125) {
            this.f27703f--;
        } else {
            m33301u();
            C11461bm bmVar2 = C11461bm.END_OBJECT;
            this.f27708k = bmVar2;
            return bmVar2;
        }
        int y2 = m33305y();
        if (y2 != 34) {
            if (y2 != 39) {
                m33306z();
                this.f27703f--;
                String c = m33297c(false);
                this.f27709l = c;
                if (c.length() == 0) {
                    throw m33299e("Expected name");
                }
                m33296b(C11459bk.DANGLING_NAME);
                C11461bm bmVar3 = C11461bm.NAME;
                this.f27708k = bmVar3;
                return bmVar3;
            }
            m33306z();
        }
        this.f27709l = m33291a((char) y2);
        m33296b(C11459bk.DANGLING_NAME);
        C11461bm bmVar32 = C11461bm.NAME;
        this.f27708k = bmVar32;
        return bmVar32;
    }

    /* renamed from: v */
    private C11461bm m33302v() {
        int y = m33305y();
        if (y != 34) {
            if (y == 39) {
                m33306z();
            } else if (y == 91) {
                m33292a(C11459bk.EMPTY_ARRAY);
                C11461bm bmVar = C11461bm.BEGIN_ARRAY;
                this.f27708k = bmVar;
                return bmVar;
            } else if (y != 123) {
                this.f27703f--;
                return m33287C();
            } else {
                m33292a(C11459bk.EMPTY_OBJECT);
                C11461bm bmVar2 = C11461bm.BEGIN_OBJECT;
                this.f27708k = bmVar2;
                return bmVar2;
            }
        }
        this.f27710m = m33291a((char) y);
        C11461bm bmVar3 = C11461bm.STRING;
        this.f27708k = bmVar3;
        return bmVar3;
    }

    /* renamed from: a */
    private boolean m33294a(int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            i2 = this.f27703f;
            if (i4 >= i2) {
                break;
            }
            if (this.f27702e[i4] == 10) {
                this.f27705h++;
                this.f27706i = 1;
            } else {
                this.f27706i++;
            }
            i4++;
        }
        int i5 = this.f27704g;
        if (i5 != i2) {
            int i6 = i5 - i2;
            this.f27704g = i6;
            char[] cArr = this.f27702e;
            System.arraycopy(cArr, i2, cArr, 0, i6);
        } else {
            this.f27704g = 0;
        }
        this.f27703f = 0;
        do {
            Reader reader = this.f27700c;
            char[] cArr2 = this.f27702e;
            int i7 = this.f27704g;
            int read = reader.read(cArr2, i7, cArr2.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f27704g + read;
            this.f27704g = i8;
            if (this.f27705h == 1 && (i3 = this.f27706i) == 1 && i8 > 0 && this.f27702e[0] == 65279) {
                this.f27703f++;
                this.f27706i = i3 - 1;
            }
        } while (this.f27704g < i);
        return true;
    }

    /* renamed from: w */
    private int m33303w() {
        int i = this.f27705h;
        for (int i2 = 0; i2 < this.f27703f; i2++) {
            if (this.f27702e[i2] == 10) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: x */
    private int m33304x() {
        int i = this.f27706i;
        for (int i2 = 0; i2 < this.f27703f; i2++) {
            i = this.f27702e[i2] == 10 ? 1 : i + 1;
        }
        return i;
    }

    /* renamed from: y */
    private int m33305y() {
        while (true) {
            if (this.f27703f < this.f27704g || m33294a(1)) {
                char[] cArr = this.f27702e;
                int i = this.f27703f;
                int i2 = i + 1;
                this.f27703f = i2;
                char c = cArr[i];
                if (!(c == 9 || c == 10 || c == 13 || c == ' ')) {
                    if (c == '#') {
                        m33306z();
                        m33285A();
                    } else if (c != '/') {
                        return c;
                    } else {
                        if (i2 == this.f27704g && !m33294a(1)) {
                            return c;
                        }
                        m33306z();
                        char[] cArr2 = this.f27702e;
                        int i3 = this.f27703f;
                        char c2 = cArr2[i3];
                        if (c2 == '*') {
                            this.f27703f = i3 + 1;
                            if (m33298d("*/")) {
                                this.f27703f += 2;
                            } else {
                                throw m33299e("Unterminated comment");
                            }
                        } else if (c2 != '/') {
                            return c;
                        } else {
                            this.f27703f = i3 + 1;
                            m33285A();
                        }
                    }
                }
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: z */
    private void m33306z() {
        if (!this.f27701d) {
            throw m33299e("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33285A() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.f27703f
            int r1 = r3.f27704g
            if (r0 < r1) goto L_0x000d
            r0 = 1
            boolean r0 = r3.m33294a((int) r0)
            if (r0 == 0) goto L_0x001f
        L_0x000d:
            char[] r0 = r3.f27702e
            int r1 = r3.f27703f
            int r2 = r1 + 1
            r3.f27703f = r2
            char r0 = r0[r1]
            r1 = 13
            if (r0 == r1) goto L_0x001f
            r1 = 10
            if (r0 != r1) goto L_0x0000
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11455bi.m33285A():void");
    }

    /* renamed from: d */
    private boolean m33298d(String str) {
        while (true) {
            int i = 0;
            if (this.f27703f + str.length() > this.f27704g && !m33294a(str.length())) {
                return false;
            }
            while (i < str.length()) {
                if (this.f27702e[this.f27703f + i] == str.charAt(i)) {
                    i++;
                } else {
                    this.f27703f++;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0.append(r6.f27702e, r1, r6.f27703f - r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m33291a(char r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.f27703f
        L_0x0003:
            int r2 = r6.f27703f
            int r3 = r6.f27704g
            r4 = 1
            if (r2 >= r3) goto L_0x004e
            char[] r3 = r6.f27702e
            int r5 = r2 + 1
            r6.f27703f = r5
            char r2 = r3[r2]
            if (r2 != r7) goto L_0x0030
            boolean r7 = r6.f27713p
            if (r7 == 0) goto L_0x001b
            java.lang.String r7 = "skipped!"
            return r7
        L_0x001b:
            if (r0 != 0) goto L_0x0026
            com.tapjoy.internal.cd r7 = r6.f27699b
            int r5 = r5 - r1
            int r5 = r5 - r4
            java.lang.String r7 = r7.mo72275a(r3, r1, r5)
            return r7
        L_0x0026:
            int r5 = r5 - r1
            int r5 = r5 - r4
            r0.append(r3, r1, r5)
            java.lang.String r7 = r0.toString()
            return r7
        L_0x0030:
            r3 = 92
            if (r2 != r3) goto L_0x0003
            if (r0 != 0) goto L_0x003b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x003b:
            char[] r2 = r6.f27702e
            int r3 = r6.f27703f
            int r3 = r3 - r1
            int r3 = r3 - r4
            r0.append(r2, r1, r3)
            char r1 = r6.m33286B()
            r0.append(r1)
            int r1 = r6.f27703f
            goto L_0x0003
        L_0x004e:
            if (r0 != 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0055:
            char[] r2 = r6.f27702e
            int r3 = r6.f27703f
            int r3 = r3 - r1
            r0.append(r2, r1, r3)
            boolean r1 = r6.m33294a((int) r4)
            if (r1 == 0) goto L_0x0064
            goto L_0x0001
        L_0x0064:
            java.lang.String r7 = "Unterminated string"
            java.io.IOException r7 = r6.m33299e(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11455bi.m33291a(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        m33306z();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m33297c(boolean r8) {
        /*
            r7 = this;
            r0 = -1
            r7.f27711n = r0
            r0 = 0
            r7.f27712o = r0
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0009:
            int r4 = r7.f27703f
            int r5 = r4 + r2
            int r6 = r7.f27704g
            if (r5 >= r6) goto L_0x0054
            char[] r5 = r7.f27702e
            int r4 = r4 + r2
            char r4 = r5[r4]
            r5 = 9
            if (r4 == r5) goto L_0x0067
            r5 = 10
            if (r4 == r5) goto L_0x0067
            r5 = 12
            if (r4 == r5) goto L_0x0067
            r5 = 13
            if (r4 == r5) goto L_0x0067
            r5 = 32
            if (r4 == r5) goto L_0x0067
            r5 = 35
            if (r4 == r5) goto L_0x0050
            r5 = 44
            if (r4 == r5) goto L_0x0067
            r5 = 47
            if (r4 == r5) goto L_0x0050
            r5 = 61
            if (r4 == r5) goto L_0x0050
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L_0x0067
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L_0x0067
            r5 = 58
            if (r4 == r5) goto L_0x0067
            r5 = 59
            if (r4 == r5) goto L_0x0050
            switch(r4) {
                case 91: goto L_0x0067;
                case 92: goto L_0x0050;
                case 93: goto L_0x0067;
                default: goto L_0x004d;
            }
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0050:
            r7.m33306z()
            goto L_0x0067
        L_0x0054:
            char[] r4 = r7.f27702e
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0069
            int r4 = r2 + 1
            boolean r4 = r7.m33294a((int) r4)
            if (r4 != 0) goto L_0x0009
            char[] r4 = r7.f27702e
            int r5 = r7.f27704g
            r4[r5] = r0
        L_0x0067:
            r0 = r2
            goto L_0x0088
        L_0x0069:
            if (r3 != 0) goto L_0x0070
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0070:
            char[] r4 = r7.f27702e
            int r5 = r7.f27703f
            r3.append(r4, r5, r2)
            int r4 = r7.f27712o
            int r4 = r4 + r2
            r7.f27712o = r4
            int r4 = r7.f27703f
            int r4 = r4 + r2
            r7.f27703f = r4
            r2 = 1
            boolean r2 = r7.m33294a((int) r2)
            if (r2 != 0) goto L_0x00bb
        L_0x0088:
            if (r8 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x0091
            int r8 = r7.f27703f
            r7.f27711n = r8
            goto L_0x00b0
        L_0x0091:
            boolean r8 = r7.f27713p
            if (r8 == 0) goto L_0x0098
            java.lang.String r1 = "skipped!"
            goto L_0x00b0
        L_0x0098:
            if (r3 != 0) goto L_0x00a5
            com.tapjoy.internal.cd r8 = r7.f27699b
            char[] r1 = r7.f27702e
            int r2 = r7.f27703f
            java.lang.String r1 = r8.mo72275a(r1, r2, r0)
            goto L_0x00b0
        L_0x00a5:
            char[] r8 = r7.f27702e
            int r1 = r7.f27703f
            r3.append(r8, r1, r0)
            java.lang.String r1 = r3.toString()
        L_0x00b0:
            int r8 = r7.f27712o
            int r8 = r8 + r0
            r7.f27712o = r8
            int r8 = r7.f27703f
            int r8 = r8 + r0
            r7.f27703f = r8
            return r1
        L_0x00bb:
            r2 = r0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11455bi.m33297c(boolean):java.lang.String");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" near ");
        StringBuilder sb2 = new StringBuilder();
        int min = Math.min(this.f27703f, 20);
        sb2.append(this.f27702e, this.f27703f - min, min);
        sb2.append(this.f27702e, this.f27703f, Math.min(this.f27704g - this.f27703f, 20));
        sb.append(sb2);
        return sb.toString();
    }

    /* renamed from: B */
    private char m33286B() {
        if (this.f27703f != this.f27704g || m33294a(1)) {
            char[] cArr = this.f27702e;
            int i = this.f27703f;
            int i2 = i + 1;
            this.f27703f = i2;
            char c = cArr[i];
            if (c == 'b') {
                return 8;
            }
            if (c == 'f') {
                return 12;
            }
            if (c == 'n') {
                return 10;
            }
            if (c == 'r') {
                return 13;
            }
            if (c == 't') {
                return 9;
            }
            if (c != 'u') {
                return c;
            }
            if (i2 + 4 <= this.f27704g || m33294a(4)) {
                String a = this.f27699b.mo72275a(this.f27702e, this.f27703f, 4);
                this.f27703f += 4;
                return (char) Integer.parseInt(a, 16);
            }
            throw m33299e("Unterminated escape sequence");
        }
        throw m33299e("Unterminated escape sequence");
    }

    /* renamed from: C */
    private C11461bm m33287C() {
        this.f27710m = m33297c(true);
        if (this.f27712o != 0) {
            C11461bm D = m33288D();
            this.f27708k = D;
            if (D == C11461bm.STRING) {
                m33306z();
            }
            return this.f27708k;
        }
        throw m33299e("Expected literal value");
    }

    /* renamed from: D */
    private C11461bm m33288D() {
        int i = this.f27711n;
        if (i == -1) {
            return C11461bm.STRING;
        }
        if (this.f27712o == 4) {
            char[] cArr = this.f27702e;
            if ('n' == cArr[i] || 'N' == cArr[i]) {
                char[] cArr2 = this.f27702e;
                int i2 = this.f27711n;
                if ('u' == cArr2[i2 + 1] || 'U' == cArr2[i2 + 1]) {
                    char[] cArr3 = this.f27702e;
                    int i3 = this.f27711n;
                    if ('l' == cArr3[i3 + 2] || 'L' == cArr3[i3 + 2]) {
                        char[] cArr4 = this.f27702e;
                        int i4 = this.f27711n;
                        if ('l' == cArr4[i4 + 3] || 'L' == cArr4[i4 + 3]) {
                            this.f27710m = "null";
                            return C11461bm.NULL;
                        }
                    }
                }
            }
        }
        if (this.f27712o == 4) {
            char[] cArr5 = this.f27702e;
            int i5 = this.f27711n;
            if ('t' == cArr5[i5] || 'T' == cArr5[i5]) {
                char[] cArr6 = this.f27702e;
                int i6 = this.f27711n;
                if ('r' == cArr6[i6 + 1] || 'R' == cArr6[i6 + 1]) {
                    char[] cArr7 = this.f27702e;
                    int i7 = this.f27711n;
                    if ('u' == cArr7[i7 + 2] || 'U' == cArr7[i7 + 2]) {
                        char[] cArr8 = this.f27702e;
                        int i8 = this.f27711n;
                        if ('e' == cArr8[i8 + 3] || 'E' == cArr8[i8 + 3]) {
                            this.f27710m = "true";
                            return C11461bm.BOOLEAN;
                        }
                    }
                }
            }
        }
        if (this.f27712o == 5) {
            char[] cArr9 = this.f27702e;
            int i9 = this.f27711n;
            if ('f' == cArr9[i9] || 'F' == cArr9[i9]) {
                char[] cArr10 = this.f27702e;
                int i10 = this.f27711n;
                if ('a' == cArr10[i10 + 1] || 'A' == cArr10[i10 + 1]) {
                    char[] cArr11 = this.f27702e;
                    int i11 = this.f27711n;
                    if ('l' == cArr11[i11 + 2] || 'L' == cArr11[i11 + 2]) {
                        char[] cArr12 = this.f27702e;
                        int i12 = this.f27711n;
                        if ('s' == cArr12[i12 + 3] || 'S' == cArr12[i12 + 3]) {
                            char[] cArr13 = this.f27702e;
                            int i13 = this.f27711n;
                            if ('e' == cArr13[i13 + 4] || 'E' == cArr13[i13 + 4]) {
                                this.f27710m = "false";
                                return C11461bm.BOOLEAN;
                            }
                        }
                    }
                }
            }
        }
        this.f27710m = this.f27699b.mo72275a(this.f27702e, this.f27711n, this.f27712o);
        return m33290a(this.f27702e, this.f27711n, this.f27712o);
    }

    /* renamed from: a */
    private static C11461bm m33290a(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        char c2 = cArr[i];
        if (c2 == '-') {
            int i5 = i + 1;
            i3 = i5;
            c2 = cArr[i5];
        } else {
            i3 = i;
        }
        if (c2 == '0') {
            i4 = i3 + 1;
            c = cArr[i4];
        } else if (c2 < '1' || c2 > '9') {
            return C11461bm.STRING;
        } else {
            i4 = i3 + 1;
            c = cArr[i4];
            while (c >= '0' && c <= '9') {
                i4++;
                c = cArr[i4];
            }
        }
        if (c == '.') {
            int i6 = i4 + 1;
            char c3 = cArr[i6];
            while (c >= '0' && c <= '9') {
                i6 = i4 + 1;
                c3 = cArr[i6];
            }
        }
        if (c == 'e' || c == 'E') {
            int i7 = i4 + 1;
            char c4 = cArr[i7];
            if (c4 == '+' || c4 == '-') {
                i7++;
                c4 = cArr[i7];
            }
            if (c4 < '0' || c4 > '9') {
                return C11461bm.STRING;
            }
            int i8 = i7 + 1;
            char c5 = cArr[i8];
            while (c5 >= '0' && c5 <= '9') {
                i8 = i4 + 1;
                c5 = cArr[i8];
            }
        }
        if (i4 == i + i2) {
            return C11461bm.NUMBER;
        }
        return C11461bm.STRING;
    }

    /* renamed from: e */
    private IOException m33299e(String str) {
        throw new C11464bo(str + " at line " + m33303w() + " column " + m33304x());
    }
}
