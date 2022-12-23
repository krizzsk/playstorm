package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4889a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4897e;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4904h;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4907j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.IronSourceSegment;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e */
public final class C4796e {

    /* renamed from: A */
    public static final int f12447A = C5049u.m15386a("sosn");

    /* renamed from: B */
    public static final int f12448B = C5049u.m15386a("tvsh");

    /* renamed from: C */
    public static final int f12449C = C5049u.m15386a("----");

    /* renamed from: D */
    public static final String[] f12450D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static final int f12451a = C5049u.m15386a("nam");

    /* renamed from: b */
    public static final int f12452b = C5049u.m15386a("trk");

    /* renamed from: c */
    public static final int f12453c = C5049u.m15386a("cmt");

    /* renamed from: d */
    public static final int f12454d = C5049u.m15386a("day");

    /* renamed from: e */
    public static final int f12455e = C5049u.m15386a("ART");

    /* renamed from: f */
    public static final int f12456f = C5049u.m15386a("too");

    /* renamed from: g */
    public static final int f12457g = C5049u.m15386a("alb");

    /* renamed from: h */
    public static final int f12458h = C5049u.m15386a("com");

    /* renamed from: i */
    public static final int f12459i = C5049u.m15386a("wrt");

    /* renamed from: j */
    public static final int f12460j = C5049u.m15386a("lyr");

    /* renamed from: k */
    public static final int f12461k = C5049u.m15386a(IronSourceSegment.GENDER);

    /* renamed from: l */
    public static final int f12462l = C5049u.m15386a("covr");

    /* renamed from: m */
    public static final int f12463m = C5049u.m15386a("gnre");

    /* renamed from: n */
    public static final int f12464n = C5049u.m15386a("grp");

    /* renamed from: o */
    public static final int f12465o = C5049u.m15386a("disk");

    /* renamed from: p */
    public static final int f12466p = C5049u.m15386a("trkn");

    /* renamed from: q */
    public static final int f12467q = C5049u.m15386a("tmpo");

    /* renamed from: r */
    public static final int f12468r = C5049u.m15386a("cpil");

    /* renamed from: s */
    public static final int f12469s = C5049u.m15386a("aART");

    /* renamed from: t */
    public static final int f12470t = C5049u.m15386a("sonm");

    /* renamed from: u */
    public static final int f12471u = C5049u.m15386a("soal");

    /* renamed from: v */
    public static final int f12472v = C5049u.m15386a("soar");

    /* renamed from: w */
    public static final int f12473w = C5049u.m15386a("soaa");

    /* renamed from: x */
    public static final int f12474x = C5049u.m15386a("soco");

    /* renamed from: y */
    public static final int f12475y = C5049u.m15386a("rtng");

    /* renamed from: z */
    public static final int f12476z = C5049u.m15386a("pgap");

    /* renamed from: a */
    public static C4904h m14731a(C5036k kVar, int i) {
        int i2 = -1;
        int i3 = -1;
        String str = null;
        String str2 = null;
        while (true) {
            int i4 = kVar.f13445b;
            if (i4 >= i) {
                break;
            }
            int c = kVar.mo25595c();
            int c2 = kVar.mo25595c();
            kVar.mo25602f(4);
            if (c2 == C4784a.f12293D0) {
                str = kVar.mo25589a(c - 12);
            } else if (c2 == C4784a.f12295E0) {
                str2 = kVar.mo25589a(c - 12);
            } else {
                if (c2 == C4784a.f12297F0) {
                    i2 = i4;
                    i3 = c;
                }
                kVar.mo25602f(c - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        kVar.mo25600e(i2);
        kVar.mo25602f(16);
        return new C4897e("und", str2, kVar.mo25589a(i3 - 16));
    }

    /* renamed from: b */
    public static C4907j m14734b(int i, String str, C5036k kVar) {
        int c = kVar.mo25595c();
        if (kVar.mo25595c() == C4784a.f12297F0) {
            kVar.mo25602f(8);
            return new C4907j(str, (String) null, kVar.mo25589a(c - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + C4784a.m14699a(i));
        return null;
    }

    /* renamed from: b */
    public static int m14733b(C5036k kVar) {
        kVar.mo25602f(4);
        if (kVar.mo25595c() == C4784a.f12297F0) {
            kVar.mo25602f(8);
            return kVar.mo25608l();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    public static C4897e m14729a(int i, C5036k kVar) {
        int c = kVar.mo25595c();
        if (kVar.mo25595c() == C4784a.f12297F0) {
            kVar.mo25602f(8);
            String a = kVar.mo25589a(c - 16);
            return new C4897e("und", a, a);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + C4784a.m14699a(i));
        return null;
    }

    /* renamed from: a */
    public static C4904h m14730a(int i, String str, C5036k kVar, boolean z, boolean z2) {
        int b = m14733b(kVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + C4784a.m14699a(i));
            return null;
        } else if (z) {
            return new C4907j(str, (String) null, Integer.toString(b));
        } else {
            return new C4897e("und", str, Integer.toString(b));
        }
    }

    /* renamed from: a */
    public static C4907j m14732a(int i, String str, C5036k kVar) {
        int c = kVar.mo25595c();
        if (kVar.mo25595c() == C4784a.f12297F0 && c >= 22) {
            kVar.mo25602f(10);
            int q = kVar.mo25613q();
            if (q > 0) {
                String str2 = "" + q;
                int q2 = kVar.mo25613q();
                if (q2 > 0) {
                    str2 = str2 + "/" + q2;
                }
                return new C4907j(str, (String) null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + C4784a.m14699a(i));
        return null;
    }

    /* renamed from: a */
    public static C4889a m14728a(C5036k kVar) {
        int c = kVar.mo25595c();
        if (kVar.mo25595c() == C4784a.f12297F0) {
            int c2 = kVar.mo25595c() & ViewCompat.MEASURED_SIZE_MASK;
            String str = c2 == 13 ? MimeTypes.IMAGE_JPEG : c2 == 14 ? "image/png" : null;
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + c2);
                return null;
            }
            kVar.mo25602f(4);
            int i = c - 16;
            byte[] bArr = new byte[i];
            System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, i);
            kVar.f13445b += i;
            return new C4889a(str, (String) null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
