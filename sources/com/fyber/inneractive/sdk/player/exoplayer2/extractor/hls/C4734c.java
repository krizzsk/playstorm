package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4920a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4922c;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4954a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c */
public class C4734c {

    /* renamed from: a */
    public final C4996g f11942a;

    /* renamed from: b */
    public final C4996g f11943b;

    /* renamed from: c */
    public final C4747k f11944c;

    /* renamed from: d */
    public final C4749a.C4750a[] f11945d;

    /* renamed from: e */
    public final C4756e f11946e;

    /* renamed from: f */
    public final C4947r f11947f;

    /* renamed from: g */
    public final List<C4869i> f11948g;

    /* renamed from: h */
    public boolean f11949h;

    /* renamed from: i */
    public byte[] f11950i;

    /* renamed from: j */
    public IOException f11951j;

    /* renamed from: k */
    public C4749a.C4750a f11952k;

    /* renamed from: l */
    public Uri f11953l;

    /* renamed from: m */
    public byte[] f11954m;

    /* renamed from: n */
    public String f11955n;

    /* renamed from: o */
    public byte[] f11956o;

    /* renamed from: p */
    public C4964e f11957p;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a */
    public static final class C4735a extends C4922c {

        /* renamed from: l */
        public final String f11958l;

        /* renamed from: m */
        public byte[] f11959m;

        public C4735a(C4996g gVar, C5000j jVar, C4869i iVar, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i, obj, bArr);
            this.f11958l = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b */
    public static final class C4736b {

        /* renamed from: a */
        public C4920a f11960a;

        /* renamed from: b */
        public boolean f11961b;

        /* renamed from: c */
        public C4749a.C4750a f11962c;

        public C4736b() {
            mo25178a();
        }

        /* renamed from: a */
        public void mo25178a() {
            this.f11960a = null;
            this.f11961b = false;
            this.f11962c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c */
    public static final class C4737c extends C4954a {

        /* renamed from: g */
        public int f11963g;

        public C4737c(C4947r rVar, int[] iArr) {
            super(rVar, iArr);
            this.f11963g = mo25489a(rVar.mo25482a(0));
        }

        /* renamed from: a */
        public void mo25179a(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo25494b(this.f11963g, elapsedRealtime)) {
                for (int i = this.f13205b - 1; i >= 0; i--) {
                    if (!mo25494b(i, elapsedRealtime)) {
                        this.f11963g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: d */
        public int mo25180d() {
            return 0;
        }

        /* renamed from: e */
        public int mo25181e() {
            return this.f11963g;
        }

        /* renamed from: g */
        public Object mo25182g() {
            return null;
        }
    }

    public C4734c(C4756e eVar, C4749a.C4750a[] aVarArr, C4738d dVar, C4747k kVar, List<C4869i> list) {
        this.f11946e = eVar;
        this.f11945d = aVarArr;
        this.f11944c = kVar;
        this.f11948g = list;
        C4869i[] iVarArr = new C4869i[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            iVarArr[i] = aVarArr[i].f12052b;
            iArr[i] = i;
        }
        C4733b bVar = (C4733b) dVar;
        this.f11942a = bVar.mo25176a(1);
        this.f11943b = bVar.mo25176a(3);
        C4947r rVar = new C4947r(iVarArr);
        this.f11947f = rVar;
        this.f11957p = new C4737c(rVar, iArr);
    }

    /* renamed from: a */
    public final void mo25177a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f11953l = uri;
        this.f11954m = bArr;
        this.f11955n = str;
        this.f11956o = bArr2;
    }
}
