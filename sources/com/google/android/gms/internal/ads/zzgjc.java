package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
class zzgjc extends zzgjb {
    protected final byte[] zza;

    zzgjc(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgjg) || zzd() != ((zzgjg) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgjc)) {
            return obj.equals(this);
        }
        zzgjc zzgjc = (zzgjc) obj;
        int zzr = zzr();
        int zzr2 = zzgjc.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgjc, 0, zzd());
        }
        return false;
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(zzgjg zzgjg, int i, int i2) {
        if (i2 <= zzgjg.zzd()) {
            int i3 = i + i2;
            if (i3 > zzgjg.zzd()) {
                int zzd = zzgjg.zzd();
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzd);
            } else if (!(zzgjg instanceof zzgjc)) {
                return zzgjg.zzk(i, i3).equals(zzk(0, i2));
            } else {
                zzgjc zzgjc = (zzgjc) zzgjg;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgjc.zza;
                int zzc = zzc() + i2;
                int zzc2 = zzc();
                int zzc3 = zzgjc.zzc() + i;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        return zzgky.zzd(i, this.zza, zzc() + i2, i3);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgnx.zzf(i, this.zza, zzc, i3 + zzc);
    }

    public final zzgjg zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        if (zzq == 0) {
            return zzgjg.zzb;
        }
        return new zzgiz(this.zza, zzc() + i, zzq);
    }

    public final zzgjo zzl() {
        return zzgjo.zzI(this.zza, zzc(), zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgiv zzgiv) throws IOException {
        zzgiv.zza(this.zza, zzc(), zzd());
    }

    public final boolean zzp() {
        int zzc = zzc();
        return zzgnx.zzj(this.zza, zzc, zzd() + zzc);
    }
}
