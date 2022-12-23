package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4762i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5029f;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d */
public final class C4773d implements C4723f {

    /* renamed from: Z */
    public static final byte[] f12156Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f12157a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final UUID f12158b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    public long f12159A = -9223372036854775807L;

    /* renamed from: B */
    public C5029f f12160B;

    /* renamed from: C */
    public C5029f f12161C;

    /* renamed from: D */
    public boolean f12162D;

    /* renamed from: E */
    public int f12163E;

    /* renamed from: F */
    public long f12164F;

    /* renamed from: G */
    public long f12165G;

    /* renamed from: H */
    public int f12166H;

    /* renamed from: I */
    public int f12167I;

    /* renamed from: J */
    public int[] f12168J;

    /* renamed from: K */
    public int f12169K;

    /* renamed from: L */
    public int f12170L;

    /* renamed from: M */
    public int f12171M;

    /* renamed from: N */
    public int f12172N;

    /* renamed from: O */
    public boolean f12173O;

    /* renamed from: P */
    public boolean f12174P;

    /* renamed from: Q */
    public boolean f12175Q;

    /* renamed from: R */
    public boolean f12176R;

    /* renamed from: S */
    public byte f12177S;

    /* renamed from: T */
    public int f12178T;

    /* renamed from: U */
    public int f12179U;

    /* renamed from: V */
    public int f12180V;

    /* renamed from: W */
    public boolean f12181W;

    /* renamed from: X */
    public boolean f12182X;

    /* renamed from: Y */
    public C4731h f12183Y;

    /* renamed from: a */
    public final C4771b f12184a;

    /* renamed from: b */
    public final C4778f f12185b;

    /* renamed from: c */
    public final SparseArray<C4776c> f12186c;

    /* renamed from: d */
    public final boolean f12187d;

    /* renamed from: e */
    public final C5036k f12188e;

    /* renamed from: f */
    public final C5036k f12189f;

    /* renamed from: g */
    public final C5036k f12190g;

    /* renamed from: h */
    public final C5036k f12191h;

    /* renamed from: i */
    public final C5036k f12192i;

    /* renamed from: j */
    public final C5036k f12193j;

    /* renamed from: k */
    public final C5036k f12194k;

    /* renamed from: l */
    public final C5036k f12195l;

    /* renamed from: m */
    public final C5036k f12196m;

    /* renamed from: n */
    public ByteBuffer f12197n;

    /* renamed from: o */
    public long f12198o;

    /* renamed from: p */
    public long f12199p = -1;

    /* renamed from: q */
    public long f12200q = -9223372036854775807L;

    /* renamed from: r */
    public long f12201r = -9223372036854775807L;

    /* renamed from: s */
    public long f12202s = -9223372036854775807L;

    /* renamed from: t */
    public C4776c f12203t;

    /* renamed from: u */
    public boolean f12204u;

    /* renamed from: v */
    public int f12205v;

    /* renamed from: w */
    public long f12206w;

    /* renamed from: x */
    public boolean f12207x;

    /* renamed from: y */
    public long f12208y = -1;

    /* renamed from: z */
    public long f12209z = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$a */
    public class C4774a implements C4762i {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b */
    public final class C4775b implements C4772c {
        public C4775b() {
        }

        /* renamed from: a */
        public boolean mo25254a(int i) {
            C4773d.this.getClass();
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        public /* synthetic */ C4775b(C4773d dVar, C4774a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo25252a(int i, long j, long j2) throws C4873l {
            C4773d dVar = C4773d.this;
            dVar.getClass();
            if (i == 160) {
                dVar.f12182X = false;
            } else if (i == 174) {
                dVar.f12203t = new C4776c();
            } else if (i == 187) {
                dVar.f12162D = false;
            } else if (i == 19899) {
                dVar.f12205v = -1;
                dVar.f12206w = -1;
            } else if (i == 20533) {
                dVar.f12203t.f12231e = true;
            } else if (i == 21968) {
                dVar.f12203t.f12243q = true;
            } else if (i == 408125543) {
                long j3 = dVar.f12199p;
                if (j3 == -1 || j3 == j) {
                    dVar.f12199p = j;
                    dVar.f12198o = j2;
                    return;
                }
                throw new C4873l("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                dVar.f12160B = new C5029f(32);
                dVar.f12161C = new C5029f(32);
            } else if (i != 524531317 || dVar.f12204u) {
            } else {
                if (!dVar.f12187d || dVar.f12208y == -1) {
                    dVar.f12183Y.mo25174a(new C4767m.C4768a(dVar.f12202s));
                    dVar.f12204u = true;
                    return;
                }
                dVar.f12207x = true;
            }
        }

        /* renamed from: a */
        public void mo25251a(int i, long j) throws C4873l {
            C4773d dVar = C4773d.this;
            dVar.getClass();
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            dVar.f12203t.f12229c = (int) j;
                            return;
                        case 136:
                            C4776c cVar = dVar.f12203t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar.f12222L = z;
                            return;
                        case 155:
                            dVar.f12165G = dVar.mo25244a(j);
                            return;
                        case 159:
                            dVar.f12203t.f12217G = (int) j;
                            return;
                        case 176:
                            dVar.f12203t.f12236j = (int) j;
                            return;
                        case 179:
                            dVar.f12160B.mo25582a(dVar.mo25244a(j));
                            return;
                        case 186:
                            dVar.f12203t.f12237k = (int) j;
                            return;
                        case 215:
                            dVar.f12203t.f12228b = (int) j;
                            return;
                        case 231:
                            dVar.f12159A = dVar.mo25244a(j);
                            return;
                        case 241:
                            if (!dVar.f12162D) {
                                dVar.f12161C.mo25582a(j);
                                dVar.f12162D = true;
                                return;
                            }
                            return;
                        case 251:
                            dVar.f12182X = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                throw new C4873l("ContentCompAlgo " + j + " not supported");
                            }
                            return;
                        case 17029:
                            if (j < 1 || j > 2) {
                                throw new C4873l("DocTypeReadVersion " + j + " not supported");
                            }
                            return;
                        case 17143:
                            if (j != 1) {
                                throw new C4873l("EBMLReadVersion " + j + " not supported");
                            }
                            return;
                        case 18401:
                            if (j != 5) {
                                throw new C4873l("ContentEncAlgo " + j + " not supported");
                            }
                            return;
                        case 18408:
                            if (j != 1) {
                                throw new C4873l("AESSettingsCipherMode " + j + " not supported");
                            }
                            return;
                        case 21420:
                            dVar.f12206w = j + dVar.f12199p;
                            return;
                        case 21432:
                            int i2 = (int) j;
                            if (i2 == 0) {
                                dVar.f12203t.f12242p = 0;
                                return;
                            } else if (i2 == 1) {
                                dVar.f12203t.f12242p = 2;
                                return;
                            } else if (i2 == 3) {
                                dVar.f12203t.f12242p = 1;
                                return;
                            } else if (i2 == 15) {
                                dVar.f12203t.f12242p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            dVar.f12203t.f12238l = (int) j;
                            return;
                        case 21682:
                            dVar.f12203t.f12240n = (int) j;
                            return;
                        case 21690:
                            dVar.f12203t.f12239m = (int) j;
                            return;
                        case 21930:
                            C4776c cVar2 = dVar.f12203t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar2.f12223M = z;
                            return;
                        case 22186:
                            dVar.f12203t.f12220J = j;
                            return;
                        case 22203:
                            dVar.f12203t.f12221K = j;
                            return;
                        case 25188:
                            dVar.f12203t.f12218H = (int) j;
                            return;
                        case 2352003:
                            dVar.f12203t.f12230d = (int) j;
                            return;
                        case 2807729:
                            dVar.f12200q = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i3 = (int) j;
                                    if (i3 == 1) {
                                        dVar.f12203t.f12246t = 2;
                                        return;
                                    } else if (i3 == 2) {
                                        dVar.f12203t.f12246t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i4 = (int) j;
                                    if (i4 != 1) {
                                        if (i4 == 16) {
                                            dVar.f12203t.f12245s = 6;
                                            return;
                                        } else if (i4 == 18) {
                                            dVar.f12203t.f12245s = 7;
                                            return;
                                        } else if (!(i4 == 6 || i4 == 7)) {
                                            return;
                                        }
                                    }
                                    dVar.f12203t.f12245s = 3;
                                    return;
                                case 21947:
                                    C4776c cVar3 = dVar.f12203t;
                                    cVar3.f12243q = true;
                                    int i5 = (int) j;
                                    if (i5 == 1) {
                                        cVar3.f12244r = 1;
                                        return;
                                    } else if (i5 == 9) {
                                        cVar3.f12244r = 6;
                                        return;
                                    } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                        cVar3.f12244r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    dVar.f12203t.f12247u = (int) j;
                                    return;
                                case 21949:
                                    dVar.f12203t.f12248v = (int) j;
                                    return;
                                default:
                                    return;
                            }
                    }
                } else if (j != 1) {
                    throw new C4873l("ContentEncodingScope " + j + " not supported");
                }
            } else if (j != 0) {
                throw new C4873l("ContentEncodingOrder " + j + " not supported");
            }
        }

        /* renamed from: a */
        public void mo25249a(int i, double d) throws C4873l {
            C4773d dVar = C4773d.this;
            dVar.getClass();
            if (i == 181) {
                dVar.f12203t.f12219I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        dVar.f12203t.f12249w = (float) d;
                        return;
                    case 21970:
                        dVar.f12203t.f12250x = (float) d;
                        return;
                    case 21971:
                        dVar.f12203t.f12251y = (float) d;
                        return;
                    case 21972:
                        dVar.f12203t.f12252z = (float) d;
                        return;
                    case 21973:
                        dVar.f12203t.f12211A = (float) d;
                        return;
                    case 21974:
                        dVar.f12203t.f12212B = (float) d;
                        return;
                    case 21975:
                        dVar.f12203t.f12213C = (float) d;
                        return;
                    case 21976:
                        dVar.f12203t.f12214D = (float) d;
                        return;
                    case 21977:
                        dVar.f12203t.f12215E = (float) d;
                        return;
                    case 21978:
                        dVar.f12203t.f12216F = (float) d;
                        return;
                    default:
                        return;
                }
            } else {
                dVar.f12201r = (long) d;
            }
        }

        /* renamed from: a */
        public void mo25253a(int i, String str) throws C4873l {
            C4773d dVar = C4773d.this;
            dVar.getClass();
            if (i == 134) {
                dVar.f12203t.f12227a = str;
            } else if (i != 17026) {
                if (i == 2274716) {
                    dVar.f12203t.f12224N = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new C4873l("DocType " + str + " not supported");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fb, code lost:
            throw new com.fyber.inneractive.sdk.player.exoplayer2.C4873l("EBML lacing sample size out of range.");
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo25250a(int r24, int r25, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r26) throws java.io.IOException, java.lang.InterruptedException {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                r2 = r23
                r3 = r26
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.this
                r4.getClass()
                r5 = 161(0xa1, float:2.26E-43)
                r6 = 163(0xa3, float:2.28E-43)
                r7 = 0
                if (r0 == r5) goto L_0x009b
                if (r0 == r6) goto L_0x009b
                r5 = 16981(0x4255, float:2.3795E-41)
                if (r0 == r5) goto L_0x008d
                r5 = 18402(0x47e2, float:2.5787E-41)
                if (r0 == r5) goto L_0x007f
                r5 = 21419(0x53ab, float:3.0014E-41)
                if (r0 == r5) goto L_0x005d
                r5 = 25506(0x63a2, float:3.5742E-41)
                if (r0 == r5) goto L_0x004f
                r5 = 30322(0x7672, float:4.249E-41)
                if (r0 != r5) goto L_0x0038
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12203t
                byte[] r4 = new byte[r1]
                r0.f12241o = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r0
                r0.mo25138b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x0038:
                com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected id: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.<init>((java.lang.String) r0)
                throw r1
            L_0x004f:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12203t
                byte[] r4 = new byte[r1]
                r0.f12234h = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r0
                r0.mo25138b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x005d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f12192i
                byte[] r0 = r0.f13444a
                java.util.Arrays.fill(r0, r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f12192i
                byte[] r0 = r0.f13444a
                int r5 = 4 - r1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r3
                r3.mo25138b(r0, r5, r1, r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f12192i
                r0.mo25600e(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r4.f12192i
                long r0 = r0.mo25609m()
                int r0 = (int) r0
                r4.f12205v = r0
                goto L_0x02aa
            L_0x007f:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12203t
                byte[] r4 = new byte[r1]
                r0.f12233g = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r0
                r0.mo25138b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x008d:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r0 = r4.f12203t
                byte[] r4 = new byte[r1]
                r0.f12232f = r4
                r0 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r0
                r0.mo25138b(r4, r7, r1, r7)
                goto L_0x02aa
            L_0x009b:
                int r5 = r4.f12163E
                r8 = 8
                r9 = 1
                if (r5 != 0) goto L_0x00bf
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r4.f12185b
                long r10 = r5.mo25256a(r3, r7, r9, r8)
                int r5 = (int) r10
                r4.f12169K = r5
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r4.f12185b
                int r5 = r5.f12258c
                r4.f12170L = r5
                r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r4.f12165G = r10
                r4.f12163E = r9
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r4.f12190g
                r5.mo25614r()
            L_0x00bf:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r5 = r4.f12186c
                int r10 = r4.f12169K
                java.lang.Object r5 = r5.get(r10)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.C4776c) r5
                if (r5 != 0) goto L_0x00d9
                int r0 = r4.f12170L
                int r0 = r1 - r0
                r1 = r3
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r1
                r1.mo25139c(r0)
                r4.f12163E = r7
                goto L_0x02aa
            L_0x00d9:
                int r10 = r4.f12163E
                if (r10 != r9) goto L_0x0279
                r10 = 3
                r4.mo25246a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (int) r10)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f12190g
                byte[] r11 = r11.f13444a
                r12 = 2
                byte r11 = r11[r12]
                r11 = r11 & 6
                int r11 = r11 >> r9
                r13 = 255(0xff, float:3.57E-43)
                if (r11 != 0) goto L_0x0101
                r4.f12167I = r9
                int[] r11 = r4.f12168J
                int[] r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.m14656a((int[]) r11, (int) r9)
                r4.f12168J = r11
                int r14 = r4.f12170L
                int r1 = r1 - r14
                int r1 = r1 - r10
                r11[r7] = r1
                goto L_0x020d
            L_0x0101:
                if (r0 != r6) goto L_0x0271
                r14 = 4
                r4.mo25246a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r4.f12190g
                byte[] r15 = r15.f13444a
                byte r15 = r15[r10]
                r15 = r15 & r13
                int r15 = r15 + r9
                r4.f12167I = r15
                int[] r6 = r4.f12168J
                int[] r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.m14656a((int[]) r6, (int) r15)
                r4.f12168J = r6
                if (r11 != r12) goto L_0x0127
                int r10 = r4.f12170L
                int r1 = r1 - r10
                int r1 = r1 - r14
                int r10 = r4.f12167I
                int r1 = r1 / r10
                java.util.Arrays.fill(r6, r7, r10, r1)
                goto L_0x020d
            L_0x0127:
                if (r11 != r9) goto L_0x015c
                r6 = r7
                r10 = r6
            L_0x012b:
                int r11 = r4.f12167I
                int r11 = r11 - r9
                if (r6 >= r11) goto L_0x0151
                int[] r11 = r4.f12168J
                r11[r6] = r7
            L_0x0134:
                int r14 = r14 + r9
                r4.mo25246a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f12190g
                byte[] r11 = r11.f13444a
                int r15 = r14 + -1
                byte r11 = r11[r15]
                r11 = r11 & r13
                int[] r15 = r4.f12168J
                r16 = r15[r6]
                int r16 = r16 + r11
                r15[r6] = r16
                if (r11 == r13) goto L_0x0134
                r11 = r15[r6]
                int r10 = r10 + r11
                int r6 = r6 + 1
                goto L_0x012b
            L_0x0151:
                int[] r6 = r4.f12168J
                int r15 = r4.f12170L
                int r1 = r1 - r15
                int r1 = r1 - r14
                int r1 = r1 - r10
                r6[r11] = r1
                goto L_0x020d
            L_0x015c:
                if (r11 != r10) goto L_0x025a
                r6 = r7
                r10 = r6
            L_0x0160:
                int r11 = r4.f12167I
                int r11 = r11 - r9
                if (r6 >= r11) goto L_0x0204
                int[] r11 = r4.f12168J
                r11[r6] = r7
                int r14 = r14 + 1
                r4.mo25246a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r4.f12190g
                byte[] r11 = r11.f13444a
                int r15 = r14 + -1
                byte r11 = r11[r15]
                if (r11 == 0) goto L_0x01fc
                r16 = 0
                r11 = r7
            L_0x017b:
                if (r11 >= r8) goto L_0x01cb
                int r18 = 7 - r11
                int r12 = r9 << r18
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r4.f12190g
                byte[] r9 = r9.f13444a
                byte r9 = r9[r15]
                r9 = r9 & r12
                if (r9 == 0) goto L_0x01c3
                int r14 = r14 + r11
                r4.mo25246a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (int) r14)
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r4.f12190g
                byte[] r9 = r9.f13444a
                int r16 = r15 + 1
                byte r9 = r9[r15]
                r9 = r9 & r13
                int r12 = ~r12
                r9 = r9 & r12
                long r7 = (long) r9
                r21 = r7
                r7 = r16
                r16 = r21
            L_0x01a0:
                if (r7 >= r14) goto L_0x01b4
                r8 = 8
                long r16 = r16 << r8
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r4.f12190g
                byte[] r8 = r8.f13444a
                int r9 = r7 + 1
                byte r7 = r8[r7]
                r7 = r7 & r13
                long r7 = (long) r7
                long r16 = r16 | r7
                r7 = r9
                goto L_0x01a0
            L_0x01b4:
                if (r6 <= 0) goto L_0x01cb
                int r11 = r11 * 7
                int r11 = r11 + 6
                r7 = 1
                long r19 = r7 << r11
                long r19 = r19 - r7
                long r16 = r16 - r19
                goto L_0x01cb
            L_0x01c3:
                int r11 = r11 + 1
                r7 = 0
                r8 = 8
                r9 = 1
                r12 = 2
                goto L_0x017b
            L_0x01cb:
                r7 = r16
                r16 = -2147483648(0xffffffff80000000, double:NaN)
                int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r9 < 0) goto L_0x01f4
                r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r9 > 0) goto L_0x01f4
                int r7 = (int) r7
                int[] r8 = r4.f12168J
                if (r6 != 0) goto L_0x01e1
                goto L_0x01e6
            L_0x01e1:
                int r9 = r6 + -1
                r9 = r8[r9]
                int r7 = r7 + r9
            L_0x01e6:
                r8[r6] = r7
                r7 = r8[r6]
                int r10 = r10 + r7
                int r6 = r6 + 1
                r7 = 0
                r8 = 8
                r9 = 1
                r12 = 2
                goto L_0x0160
            L_0x01f4:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "EBML lacing sample size out of range."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x01fc:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "No valid varint length mask found"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0204:
                int[] r6 = r4.f12168J
                int r7 = r4.f12170L
                int r1 = r1 - r7
                int r1 = r1 - r14
                int r1 = r1 - r10
                r6[r11] = r1
            L_0x020d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r4.f12190g
                byte[] r1 = r1.f13444a
                r6 = 0
                byte r7 = r1[r6]
                r6 = 8
                int r7 = r7 << r6
                r6 = 1
                byte r1 = r1[r6]
                r1 = r1 & r13
                r1 = r1 | r7
                long r6 = r4.f12159A
                long r8 = (long) r1
                long r8 = r4.mo25244a((long) r8)
                long r6 = r6 + r8
                r4.f12164F = r6
                com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r4.f12190g
                byte[] r1 = r1.f13444a
                r6 = 2
                byte r7 = r1[r6]
                r8 = 8
                r7 = r7 & r8
                if (r7 != r8) goto L_0x0234
                r7 = 1
                goto L_0x0235
            L_0x0234:
                r7 = 0
            L_0x0235:
                int r8 = r5.f12229c
                if (r8 == r6) goto L_0x0247
                r8 = 163(0xa3, float:2.28E-43)
                if (r0 != r8) goto L_0x0245
                byte r1 = r1[r6]
                r6 = 128(0x80, float:1.794E-43)
                r1 = r1 & r6
                if (r1 != r6) goto L_0x0245
                goto L_0x0247
            L_0x0245:
                r1 = 0
                goto L_0x0248
            L_0x0247:
                r1 = 1
            L_0x0248:
                if (r7 == 0) goto L_0x024d
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x024e
            L_0x024d:
                r6 = 0
            L_0x024e:
                r1 = r1 | r6
                r4.f12171M = r1
                r1 = 2
                r4.f12163E = r1
                r1 = 0
                r4.f12166H = r1
                r1 = 163(0xa3, float:2.28E-43)
                goto L_0x027a
            L_0x025a:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unexpected lacing value: "
                r1.append(r3)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0271:
                com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
                java.lang.String r1 = "Lacing only supported in SimpleBlocks."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0279:
                r1 = r6
            L_0x027a:
                if (r0 != r1) goto L_0x02a2
            L_0x027c:
                int r0 = r4.f12166H
                int r1 = r4.f12167I
                if (r0 >= r1) goto L_0x029e
                int[] r1 = r4.f12168J
                r0 = r1[r0]
                r4.mo25247a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.C4776c) r5, (int) r0)
                long r0 = r4.f12164F
                int r6 = r4.f12166H
                int r7 = r5.f12230d
                int r6 = r6 * r7
                int r6 = r6 / 1000
                long r6 = (long) r6
                long r0 = r0 + r6
                r4.mo25248a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.C4776c) r5, (long) r0)
                int r0 = r4.f12166H
                r1 = 1
                int r0 = r0 + r1
                r4.f12166H = r0
                goto L_0x027c
            L_0x029e:
                r0 = 0
                r4.f12163E = r0
                goto L_0x02aa
            L_0x02a2:
                r0 = 0
                int[] r1 = r4.f12168J
                r0 = r1[r0]
                r4.mo25247a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r3, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.C4776c) r5, (int) r0)
            L_0x02aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.C4775b.mo25250a(int, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c */
    public static final class C4776c {

        /* renamed from: A */
        public float f12211A = -1.0f;

        /* renamed from: B */
        public float f12212B = -1.0f;

        /* renamed from: C */
        public float f12213C = -1.0f;

        /* renamed from: D */
        public float f12214D = -1.0f;

        /* renamed from: E */
        public float f12215E = -1.0f;

        /* renamed from: F */
        public float f12216F = -1.0f;

        /* renamed from: G */
        public int f12217G = 1;

        /* renamed from: H */
        public int f12218H = -1;

        /* renamed from: I */
        public int f12219I = 8000;

        /* renamed from: J */
        public long f12220J = 0;

        /* renamed from: K */
        public long f12221K = 0;

        /* renamed from: L */
        public boolean f12222L;

        /* renamed from: M */
        public boolean f12223M = true;

        /* renamed from: N */
        public String f12224N = "eng";

        /* renamed from: O */
        public C4804n f12225O;

        /* renamed from: P */
        public int f12226P;

        /* renamed from: a */
        public String f12227a;

        /* renamed from: b */
        public int f12228b;

        /* renamed from: c */
        public int f12229c;

        /* renamed from: d */
        public int f12230d;

        /* renamed from: e */
        public boolean f12231e;

        /* renamed from: f */
        public byte[] f12232f;

        /* renamed from: g */
        public byte[] f12233g;

        /* renamed from: h */
        public byte[] f12234h;

        /* renamed from: i */
        public C4702a f12235i;

        /* renamed from: j */
        public int f12236j = -1;

        /* renamed from: k */
        public int f12237k = -1;

        /* renamed from: l */
        public int f12238l = -1;

        /* renamed from: m */
        public int f12239m = -1;

        /* renamed from: n */
        public int f12240n = 0;

        /* renamed from: o */
        public byte[] f12241o = null;

        /* renamed from: p */
        public int f12242p = -1;

        /* renamed from: q */
        public boolean f12243q = false;

        /* renamed from: r */
        public int f12244r = -1;

        /* renamed from: s */
        public int f12245s = -1;

        /* renamed from: t */
        public int f12246t = -1;

        /* renamed from: u */
        public int f12247u = 1000;

        /* renamed from: v */
        public int f12248v = 200;

        /* renamed from: w */
        public float f12249w = -1.0f;

        /* renamed from: x */
        public float f12250x = -1.0f;

        /* renamed from: y */
        public float f12251y = -1.0f;

        /* renamed from: z */
        public float f12252z = -1.0f;
    }

    public C4773d(C4771b bVar, int i) {
        this.f12184a = bVar;
        ((C4769a) bVar).mo25239a((C4772c) new C4775b(this, (C4774a) null));
        this.f12187d = (i & 1) != 0 ? false : true;
        this.f12185b = new C4778f();
        this.f12186c = new SparseArray<>();
        this.f12190g = new C5036k(4);
        this.f12191h = new C5036k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f12192i = new C5036k(4);
        this.f12188e = new C5036k(C5032i.f13423a);
        this.f12189f = new C5036k(4);
        this.f12193j = new C5036k();
        this.f12194k = new C5036k();
        this.f12195l = new C5036k(8);
        this.f12196m = new C5036k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r3 = r1.mo25255a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25166a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e
            r1.<init>()
            r2 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            long r3 = r2.f11870b
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 1024(0x400, double:5.06E-321)
            if (r5 == 0) goto L_0x001a
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r6 = r3
        L_0x001a:
            int r6 = (int) r6
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12253a
            byte[] r7 = r7.f13444a
            r8 = 0
            r9 = 4
            r2.mo25136a(r7, r8, r9, r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12253a
            long r10 = r7.mo25609m()
            r1.f12254b = r9
        L_0x002c:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r9 = 1
            if (r7 == 0) goto L_0x0056
            int r7 = r1.f12254b
            int r7 = r7 + r9
            r1.f12254b = r7
            if (r7 != r6) goto L_0x003c
            goto L_0x00a1
        L_0x003c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12253a
            byte[] r7 = r7.f13444a
            r2.mo25136a(r7, r8, r9, r8)
            r7 = 8
            long r9 = r10 << r7
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r7 = r1.f12253a
            byte[] r7 = r7.f13444a
            byte r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r11 = (long) r7
            long r10 = r9 | r11
            goto L_0x002c
        L_0x0056:
            long r6 = r1.mo25255a(r0)
            int r10 = r1.f12254b
            long r10 = (long) r10
            r12 = -9223372036854775808
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00a1
            if (r5 == 0) goto L_0x006c
            long r14 = r10 + r6
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x006c
            goto L_0x00a1
        L_0x006c:
            int r3 = r1.f12254b
            long r3 = (long) r3
            long r14 = r10 + r6
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x009e
            long r3 = r1.mo25255a(r0)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x007e
            goto L_0x00a1
        L_0x007e:
            long r3 = r1.mo25255a(r0)
            r14 = 0
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x00a1
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            if (r5 == 0) goto L_0x006c
            int r5 = (int) r3
            r2.mo25135a(r5, r8)
            int r5 = r1.f12254b
            long r14 = (long) r5
            long r14 = r14 + r3
            int r3 = (int) r14
            r1.f12254b = r3
            goto L_0x006c
        L_0x009e:
            if (r3 != 0) goto L_0x00a1
            r8 = r9
        L_0x00a1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.mo25166a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12183Y = hVar;
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12159A = -9223372036854775807L;
        this.f12163E = 0;
        C4769a aVar = (C4769a) this.f12184a;
        aVar.f12151e = 0;
        aVar.f12148b.clear();
        C4778f fVar = aVar.f12149c;
        fVar.f12257b = 0;
        fVar.f12258c = 0;
        C4778f fVar2 = this.f12185b;
        fVar2.f12257b = 0;
        fVar2.f12258c = 0;
        mo25245a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r9, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f12181W = r0
            r1 = 1
            r2 = r1
        L_0x0005:
            if (r2 == 0) goto L_0x003d
            boolean r3 = r8.f12181W
            if (r3 != 0) goto L_0x003d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b r2 = r8.f12184a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4769a) r2
            boolean r2 = r2.mo25240a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r9)
            if (r2 == 0) goto L_0x0005
            r3 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r3
            long r3 = r3.f11871c
            boolean r5 = r8.f12207x
            if (r5 == 0) goto L_0x0028
            r8.f12209z = r3
            long r3 = r8.f12208y
            r10.f12145a = r3
            r8.f12207x = r0
        L_0x0026:
            r3 = r1
            goto L_0x003a
        L_0x0028:
            boolean r3 = r8.f12204u
            if (r3 == 0) goto L_0x0039
            long r3 = r8.f12209z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            r10.f12145a = r3
            r8.f12209z = r5
            goto L_0x0026
        L_0x0039:
            r3 = r0
        L_0x003a:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4773d.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo25248a(C4776c cVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(cVar.f12227a)) {
            byte[] bArr2 = this.f12194k.f13444a;
            long j2 = this.f12165G;
            if (j2 == -9223372036854775807L) {
                bArr = f12157a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))});
                int i4 = C5049u.f13471a;
                bArr = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C4804n nVar = cVar.f12225O;
            C5036k kVar = this.f12194k;
            nVar.mo25150a(kVar, kVar.f13446c);
            this.f12180V += this.f12194k.f13446c;
        }
        cVar.f12225O.mo25147a(j, this.f12171M, this.f12180V, 0, cVar.f12233g);
        this.f12181W = true;
        mo25245a();
    }

    /* renamed from: a */
    public final void mo25245a() {
        this.f12172N = 0;
        this.f12180V = 0;
        this.f12179U = 0;
        this.f12173O = false;
        this.f12174P = false;
        this.f12176R = false;
        this.f12178T = 0;
        this.f12177S = 0;
        this.f12175Q = false;
        this.f12193j.mo25614r();
    }

    /* renamed from: a */
    public final void mo25246a(C4730g gVar, int i) throws IOException, InterruptedException {
        C5036k kVar = this.f12190g;
        if (kVar.f13446c < i) {
            if (kVar.mo25593b() < i) {
                C5036k kVar2 = this.f12190g;
                byte[] bArr = kVar2.f13444a;
                kVar2.mo25591a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f12190g.f13446c);
            }
            C5036k kVar3 = this.f12190g;
            byte[] bArr2 = kVar3.f13444a;
            int i2 = kVar3.f13446c;
            ((C4715b) gVar).mo25138b(bArr2, i2, i - i2, false);
            this.f12190g.mo25598d(i);
        }
    }

    /* renamed from: a */
    public final void mo25247a(C4730g gVar, C4776c cVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f12227a)) {
            byte[] bArr = f12156Z;
            int length = bArr.length + i;
            if (this.f12194k.mo25593b() < length) {
                this.f12194k.f13444a = Arrays.copyOf(bArr, length + i);
            }
            ((C4715b) gVar).mo25138b(this.f12194k.f13444a, bArr.length, i, false);
            this.f12194k.mo25600e(0);
            this.f12194k.mo25598d(length);
            return;
        }
        C4804n nVar = cVar.f12225O;
        if (!this.f12173O) {
            if (cVar.f12231e) {
                this.f12171M &= -1073741825;
                int i3 = 128;
                if (!this.f12174P) {
                    ((C4715b) gVar).mo25138b(this.f12190g.f13444a, 0, 1, false);
                    this.f12172N++;
                    byte[] bArr2 = this.f12190g.f13444a;
                    if ((bArr2[0] & 128) != 128) {
                        this.f12177S = bArr2[0];
                        this.f12174P = true;
                    } else {
                        throw new C4873l("Extension bit is set in signal byte");
                    }
                }
                byte b = this.f12177S;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.f12171M |= 1073741824;
                    if (!this.f12175Q) {
                        ((C4715b) gVar).mo25138b(this.f12195l.f13444a, 0, 8, false);
                        this.f12172N += 8;
                        this.f12175Q = true;
                        C5036k kVar = this.f12190g;
                        byte[] bArr3 = kVar.f13444a;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr3[0] = (byte) (i3 | 8);
                        kVar.mo25600e(0);
                        nVar.mo25150a(this.f12190g, 1);
                        this.f12180V++;
                        this.f12195l.mo25600e(0);
                        nVar.mo25150a(this.f12195l, 8);
                        this.f12180V += 8;
                    }
                    if (z) {
                        if (!this.f12176R) {
                            ((C4715b) gVar).mo25138b(this.f12190g.f13444a, 0, 1, false);
                            this.f12172N++;
                            this.f12190g.mo25600e(0);
                            this.f12178T = this.f12190g.mo25608l();
                            this.f12176R = true;
                        }
                        int i4 = this.f12178T * 4;
                        this.f12190g.mo25596c(i4);
                        ((C4715b) gVar).mo25138b(this.f12190g.f13444a, 0, i4, false);
                        this.f12172N += i4;
                        short s = (short) ((this.f12178T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f12197n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f12197n = ByteBuffer.allocate(i5);
                        }
                        this.f12197n.position(0);
                        this.f12197n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f12178T;
                            if (i6 >= i2) {
                                break;
                            }
                            int o = this.f12190g.mo25611o();
                            if (i6 % 2 == 0) {
                                this.f12197n.putShort((short) (o - i7));
                            } else {
                                this.f12197n.putInt(o - i7);
                            }
                            i6++;
                            i7 = o;
                        }
                        int i8 = (i - this.f12172N) - i7;
                        if (i2 % 2 == 1) {
                            this.f12197n.putInt(i8);
                        } else {
                            this.f12197n.putShort((short) i8);
                            this.f12197n.putInt(0);
                        }
                        this.f12196m.mo25591a(this.f12197n.array(), i5);
                        nVar.mo25150a(this.f12196m, i5);
                        this.f12180V += i5;
                    }
                }
            } else {
                byte[] bArr4 = cVar.f12232f;
                if (bArr4 != null) {
                    C5036k kVar2 = this.f12193j;
                    int length2 = bArr4.length;
                    kVar2.f13444a = bArr4;
                    kVar2.f13446c = length2;
                    kVar2.f13445b = 0;
                }
            }
            this.f12173O = true;
        }
        int i9 = i + this.f12193j.f13446c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f12227a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f12227a)) {
            while (true) {
                int i10 = this.f12172N;
                if (i10 >= i9) {
                    break;
                }
                mo25243a(gVar, nVar, i9 - i10);
            }
        } else {
            byte[] bArr5 = this.f12189f.f13444a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i11 = cVar.f12226P;
            int i12 = 4 - i11;
            while (this.f12172N < i9) {
                int i13 = this.f12179U;
                if (i13 == 0) {
                    int min = Math.min(i11, this.f12193j.mo25588a());
                    ((C4715b) gVar).mo25138b(bArr5, i12 + min, i11 - min, false);
                    if (min > 0) {
                        C5036k kVar3 = this.f12193j;
                        System.arraycopy(kVar3.f13444a, kVar3.f13445b, bArr5, i12, min);
                        kVar3.f13445b += min;
                    }
                    this.f12172N += i11;
                    this.f12189f.mo25600e(0);
                    this.f12179U = this.f12189f.mo25611o();
                    this.f12188e.mo25600e(0);
                    nVar.mo25150a(this.f12188e, 4);
                    this.f12180V += 4;
                } else {
                    this.f12179U = i13 - mo25243a(gVar, nVar, i13);
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f12227a)) {
            this.f12191h.mo25600e(0);
            nVar.mo25150a(this.f12191h, 4);
            this.f12180V += 4;
        }
    }

    /* renamed from: a */
    public final int mo25243a(C4730g gVar, C4804n nVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f12193j.mo25588a();
        if (a > 0) {
            i2 = Math.min(i, a);
            nVar.mo25150a(this.f12193j, i2);
        } else {
            i2 = nVar.mo25143a(gVar, i, false);
        }
        this.f12172N += i2;
        this.f12180V += i2;
        return i2;
    }

    /* renamed from: a */
    public final long mo25244a(long j) throws C4873l {
        long j2 = this.f12200q;
        if (j2 != -9223372036854775807L) {
            return C5049u.m15388a(j, j2, 1000);
        }
        throw new C4873l("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    public static int[] m14656a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
