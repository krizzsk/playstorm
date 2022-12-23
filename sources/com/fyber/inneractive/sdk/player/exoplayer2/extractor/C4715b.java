package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.b */
public final class C4715b implements C4730g {

    /* renamed from: g */
    public static final byte[] f11868g = new byte[4096];

    /* renamed from: a */
    public final C4996g f11869a;

    /* renamed from: b */
    public final long f11870b;

    /* renamed from: c */
    public long f11871c;

    /* renamed from: d */
    public byte[] f11872d = new byte[65536];

    /* renamed from: e */
    public int f11873e;

    /* renamed from: f */
    public int f11874f;

    public C4715b(C4996g gVar, long j, long j2) {
        this.f11869a = gVar;
        this.f11871c = j;
        this.f11870b = j2;
    }

    /* renamed from: a */
    public boolean mo25136a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo25135a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f11872d, this.f11873e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: b */
    public int mo25137b(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f11874f, i);
        mo25140d(min);
        if (min == 0) {
            byte[] bArr = f11868g;
            min = mo25133a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        mo25134a(min);
        return min;
    }

    /* renamed from: c */
    public void mo25139c(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f11874f, i);
        mo25140d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = f11868g;
            i2 = mo25133a(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        mo25134a(i2);
    }

    /* renamed from: d */
    public final void mo25140d(int i) {
        int i2 = this.f11874f - i;
        this.f11874f = i2;
        this.f11873e = 0;
        byte[] bArr = this.f11872d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f11872d = bArr2;
    }

    /* renamed from: a */
    public boolean mo25135a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f11873e + i;
        byte[] bArr = this.f11872d;
        if (i2 > bArr.length) {
            int i3 = C5049u.f13471a;
            this.f11872d = Arrays.copyOf(this.f11872d, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f11874f - this.f11873e, i);
        while (min < i) {
            min = mo25133a(this.f11872d, this.f11873e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.f11873e + i;
        this.f11873e = i4;
        this.f11874f = Math.max(this.f11874f, i4);
        return true;
    }

    /* renamed from: b */
    public boolean mo25138b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3;
        int i4 = this.f11874f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f11872d, 0, bArr, i, min);
            mo25140d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = mo25133a(bArr, i, i2, i3, z);
        }
        mo25134a(i3);
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo25132a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = this.f11874f;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f11872d, 0, bArr, i, min);
            mo25140d(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo25133a(bArr, i, i2, 0, true);
        }
        mo25134a(i4);
        return i4;
    }

    /* renamed from: a */
    public final int mo25133a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f11869a.mo24830a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public final void mo25134a(int i) {
        if (i != -1) {
            this.f11871c += (long) i;
        }
    }
}
