package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfyj implements zzfwd {
    private static final byte[] zza = new byte[0];
    private final zzgfm zzb;
    private final zzfwd zzc;

    public zzfyj(zzgfm zzgfm, zzfwd zzfwd) {
        this.zzb = zzgfm;
        this.zzc = zzfwd;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzfwd) zzfxi.zzh(this.zzb.zzf(), this.zzc.zza(bArr3, zza), zzfwd.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzau = zzfxi.zzd(this.zzb).zzau();
        byte[] zzb2 = this.zzc.zzb(zzau, zza);
        byte[] zzb3 = ((zzfwd) zzfxi.zzh(this.zzb.zzf(), zzau, zzfwd.class)).zzb(bArr, bArr2);
        int length = zzb2.length;
        return ByteBuffer.allocate(length + 4 + zzb3.length).putInt(length).put(zzb2).put(zzb3).array();
    }
}
