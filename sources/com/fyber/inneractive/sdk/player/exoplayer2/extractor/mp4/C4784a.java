package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a */
public abstract class C4784a {

    /* renamed from: A */
    public static final int f12286A = C5049u.m15386a("trun");

    /* renamed from: A0 */
    public static final int f12287A0 = C5049u.m15386a("udta");

    /* renamed from: B */
    public static final int f12288B = C5049u.m15386a("sidx");

    /* renamed from: B0 */
    public static final int f12289B0 = C5049u.m15386a("meta");

    /* renamed from: C */
    public static final int f12290C = C5049u.m15386a("moov");

    /* renamed from: C0 */
    public static final int f12291C0 = C5049u.m15386a("ilst");

    /* renamed from: D */
    public static final int f12292D = C5049u.m15386a("mvhd");

    /* renamed from: D0 */
    public static final int f12293D0 = C5049u.m15386a("mean");

    /* renamed from: E */
    public static final int f12294E = C5049u.m15386a("trak");

    /* renamed from: E0 */
    public static final int f12295E0 = C5049u.m15386a("name");

    /* renamed from: F */
    public static final int f12296F = C5049u.m15386a("mdia");

    /* renamed from: F0 */
    public static final int f12297F0 = C5049u.m15386a("data");

    /* renamed from: G */
    public static final int f12298G = C5049u.m15386a("minf");

    /* renamed from: G0 */
    public static final int f12299G0 = C5049u.m15386a("emsg");

    /* renamed from: H */
    public static final int f12300H = C5049u.m15386a("stbl");

    /* renamed from: H0 */
    public static final int f12301H0 = C5049u.m15386a("st3d");

    /* renamed from: I */
    public static final int f12302I = C5049u.m15386a("avcC");

    /* renamed from: I0 */
    public static final int f12303I0 = C5049u.m15386a("sv3d");

    /* renamed from: J */
    public static final int f12304J = C5049u.m15386a("hvcC");

    /* renamed from: J0 */
    public static final int f12305J0 = C5049u.m15386a("proj");

    /* renamed from: K */
    public static final int f12306K = C5049u.m15386a("esds");

    /* renamed from: K0 */
    public static final int f12307K0 = C5049u.m15386a("vp08");

    /* renamed from: L */
    public static final int f12308L = C5049u.m15386a("moof");

    /* renamed from: L0 */
    public static final int f12309L0 = C5049u.m15386a("vp09");

    /* renamed from: M */
    public static final int f12310M = C5049u.m15386a("traf");

    /* renamed from: M0 */
    public static final int f12311M0 = C5049u.m15386a("vpcC");

    /* renamed from: N */
    public static final int f12312N = C5049u.m15386a("mvex");

    /* renamed from: N0 */
    public static final int f12313N0 = C5049u.m15386a("camm");

    /* renamed from: O */
    public static final int f12314O = C5049u.m15386a("mehd");

    /* renamed from: O0 */
    public static final int f12315O0 = C5049u.m15386a("alac");

    /* renamed from: P */
    public static final int f12316P = C5049u.m15386a("tkhd");

    /* renamed from: Q */
    public static final int f12317Q = C5049u.m15386a("edts");

    /* renamed from: R */
    public static final int f12318R = C5049u.m15386a("elst");

    /* renamed from: S */
    public static final int f12319S = C5049u.m15386a("mdhd");

    /* renamed from: T */
    public static final int f12320T = C5049u.m15386a("hdlr");

    /* renamed from: U */
    public static final int f12321U = C5049u.m15386a("stsd");

    /* renamed from: V */
    public static final int f12322V = C5049u.m15386a("pssh");

    /* renamed from: W */
    public static final int f12323W = C5049u.m15386a("sinf");

    /* renamed from: X */
    public static final int f12324X = C5049u.m15386a("schm");

    /* renamed from: Y */
    public static final int f12325Y = C5049u.m15386a("schi");

    /* renamed from: Z */
    public static final int f12326Z = C5049u.m15386a("tenc");

    /* renamed from: a0 */
    public static final int f12327a0 = C5049u.m15386a("encv");

    /* renamed from: b */
    public static final int f12328b = C5049u.m15386a("ftyp");

    /* renamed from: b0 */
    public static final int f12329b0 = C5049u.m15386a("enca");

    /* renamed from: c */
    public static final int f12330c = C5049u.m15386a("avc1");

    /* renamed from: c0 */
    public static final int f12331c0 = C5049u.m15386a("frma");

    /* renamed from: d */
    public static final int f12332d = C5049u.m15386a("avc3");

    /* renamed from: d0 */
    public static final int f12333d0 = C5049u.m15386a("saiz");

    /* renamed from: e */
    public static final int f12334e = C5049u.m15386a("hvc1");

    /* renamed from: e0 */
    public static final int f12335e0 = C5049u.m15386a("saio");

    /* renamed from: f */
    public static final int f12336f = C5049u.m15386a("hev1");

    /* renamed from: f0 */
    public static final int f12337f0 = C5049u.m15386a("sbgp");

    /* renamed from: g */
    public static final int f12338g = C5049u.m15386a("s263");

    /* renamed from: g0 */
    public static final int f12339g0 = C5049u.m15386a("sgpd");

    /* renamed from: h */
    public static final int f12340h = C5049u.m15386a("d263");

    /* renamed from: h0 */
    public static final int f12341h0 = C5049u.m15386a("uuid");

    /* renamed from: i */
    public static final int f12342i = C5049u.m15386a("mdat");

    /* renamed from: i0 */
    public static final int f12343i0 = C5049u.m15386a("senc");

    /* renamed from: j */
    public static final int f12344j = C5049u.m15386a("mp4a");

    /* renamed from: j0 */
    public static final int f12345j0 = C5049u.m15386a("pasp");

    /* renamed from: k */
    public static final int f12346k = C5049u.m15386a(".mp3");

    /* renamed from: k0 */
    public static final int f12347k0 = C5049u.m15386a("TTML");

    /* renamed from: l */
    public static final int f12348l = C5049u.m15386a("wave");

    /* renamed from: l0 */
    public static final int f12349l0 = C5049u.m15386a("mp4v");

    /* renamed from: m */
    public static final int f12350m = C5049u.m15386a("lpcm");

    /* renamed from: m0 */
    public static final int f12351m0 = C5049u.m15386a("stts");

    /* renamed from: n */
    public static final int f12352n = C5049u.m15386a("sowt");

    /* renamed from: n0 */
    public static final int f12353n0 = C5049u.m15386a("stss");

    /* renamed from: o */
    public static final int f12354o = C5049u.m15386a("ac-3");

    /* renamed from: o0 */
    public static final int f12355o0 = C5049u.m15386a("ctts");

    /* renamed from: p */
    public static final int f12356p = C5049u.m15386a("dac3");

    /* renamed from: p0 */
    public static final int f12357p0 = C5049u.m15386a("stsc");

    /* renamed from: q */
    public static final int f12358q = C5049u.m15386a("ec-3");

    /* renamed from: q0 */
    public static final int f12359q0 = C5049u.m15386a("stsz");

    /* renamed from: r */
    public static final int f12360r = C5049u.m15386a("dec3");

    /* renamed from: r0 */
    public static final int f12361r0 = C5049u.m15386a("stz2");

    /* renamed from: s */
    public static final int f12362s = C5049u.m15386a("dtsc");

    /* renamed from: s0 */
    public static final int f12363s0 = C5049u.m15386a("stco");

    /* renamed from: t */
    public static final int f12364t = C5049u.m15386a("dtsh");

    /* renamed from: t0 */
    public static final int f12365t0 = C5049u.m15386a("co64");

    /* renamed from: u */
    public static final int f12366u = C5049u.m15386a("dtsl");

    /* renamed from: u0 */
    public static final int f12367u0 = C5049u.m15386a("tx3g");

    /* renamed from: v */
    public static final int f12368v = C5049u.m15386a("dtse");

    /* renamed from: v0 */
    public static final int f12369v0 = C5049u.m15386a("wvtt");

    /* renamed from: w */
    public static final int f12370w = C5049u.m15386a("ddts");

    /* renamed from: w0 */
    public static final int f12371w0 = C5049u.m15386a("stpp");

    /* renamed from: x */
    public static final int f12372x = C5049u.m15386a("tfdt");

    /* renamed from: x0 */
    public static final int f12373x0 = C5049u.m15386a("c608");

    /* renamed from: y */
    public static final int f12374y = C5049u.m15386a("tfhd");

    /* renamed from: y0 */
    public static final int f12375y0 = C5049u.m15386a("samr");

    /* renamed from: z */
    public static final int f12376z = C5049u.m15386a("trex");

    /* renamed from: z0 */
    public static final int f12377z0 = C5049u.m15386a("sawb");

    /* renamed from: a */
    public final int f12378a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a */
    public static final class C4785a extends C4784a {

        /* renamed from: P0 */
        public final long f12379P0;

        /* renamed from: Q0 */
        public final List<C4786b> f12380Q0 = new ArrayList();

        /* renamed from: R0 */
        public final List<C4785a> f12381R0 = new ArrayList();

        public C4785a(int i, long j) {
            super(i);
            this.f12379P0 = j;
        }

        /* renamed from: c */
        public C4785a mo25261c(int i) {
            int size = this.f12381R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4785a aVar = this.f12381R0.get(i2);
                if (aVar.f12378a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C4786b mo25262d(int i) {
            int size = this.f12380Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4786b bVar = this.f12380Q0.get(i2);
                if (bVar.f12378a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C4784a.m14699a(this.f12378a) + " leaves: " + Arrays.toString(this.f12380Q0.toArray()) + " containers: " + Arrays.toString(this.f12381R0.toArray());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b */
    public static final class C4786b extends C4784a {

        /* renamed from: P0 */
        public final C5036k f12382P0;

        public C4786b(int i, C5036k kVar) {
            super(i);
            this.f12382P0 = kVar;
        }
    }

    static {
        C5049u.m15386a("vmhd");
    }

    public C4784a(int i) {
        this.f12378a = i;
    }

    /* renamed from: a */
    public static String m14699a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m14700b(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m14699a(this.f12378a);
    }
}
