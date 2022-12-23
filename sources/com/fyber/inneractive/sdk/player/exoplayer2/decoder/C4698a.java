package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a */
public final class C4698a {

    /* renamed from: a */
    public byte[] f11839a;

    /* renamed from: b */
    public byte[] f11840b;

    /* renamed from: c */
    public int f11841c;

    /* renamed from: d */
    public int[] f11842d;

    /* renamed from: e */
    public int[] f11843e;

    /* renamed from: f */
    public int f11844f;

    /* renamed from: g */
    public final MediaCodec.CryptoInfo f11845g;

    /* renamed from: h */
    public final C4700b f11846h;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a$b */
    public static final class C4700b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f11847a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f11848b;

        public C4700b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f11847a = cryptoInfo;
            this.f11848b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C4698a() {
        int i = C5049u.f13471a;
        C4700b bVar = null;
        MediaCodec.CryptoInfo a = i >= 16 ? mo25106a() : null;
        this.f11845g = a;
        this.f11846h = i >= 24 ? new C4700b(a) : bVar;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo25106a() {
        return new MediaCodec.CryptoInfo();
    }
}
