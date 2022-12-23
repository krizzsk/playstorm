package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4814h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g */
public final class C4813g extends C4814h {

    /* renamed from: o */
    public static final int f12569o = C5049u.m15386a("Opus");

    /* renamed from: p */
    public static final byte[] f12570p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f12571n;

    /* renamed from: a */
    public void mo25281a(boolean z) {
        super.mo25281a(z);
        if (z) {
            this.f12571n = false;
        }
    }

    /* renamed from: a */
    public long mo25280a(C5036k kVar) {
        byte[] bArr = kVar.f13444a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo25288a((long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* renamed from: a */
    public boolean mo25282a(C5036k kVar, long j, C4814h.C4815a aVar) throws IOException, InterruptedException {
        C5036k kVar2 = kVar;
        boolean z = true;
        if (!this.f12571n) {
            byte[] copyOf = Arrays.copyOf(kVar2.f13444a, kVar2.f13446c);
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            mo25287a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            mo25287a(arrayList, 3840);
            aVar.f12585a = C4869i.m14975a((String) null, "audio/opus", (String) null, -1, -1, (int) b, (int) OpusUtil.SAMPLE_RATE, -1, (List<byte[]>) arrayList, (C4702a) null, 0, (String) null);
            this.f12571n = true;
            return true;
        }
        if (kVar.mo25595c() != f12569o) {
            z = false;
        }
        kVar2.mo25600e(0);
        return z;
    }

    /* renamed from: a */
    public final void mo25287a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
