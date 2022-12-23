package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfck {
    public zzfck() {
        try {
            zzfxk.zza();
        } catch (GeneralSecurityException e) {
            zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            zzt.zzo().zzt(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgjd zzt = zzgjg.zzt();
        try {
            zzfwh.zzb(zzfwr.zzb(zzfwq.zza("AES128_GCM")), zzfwf.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to generate key".concat(e.toString()));
            zzt.zzo().zzt(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdwb zzdwb) {
        zzfwr zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfwd) zzc.zzd(zzfwd.class)).zza(bArr, bArr2);
            zzdwb.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            zze.zza("Failed to decrypt ".concat(e.toString()));
            zzt.zzo().zzt(e, "CryptoUtils.decrypt");
            zzdwb.zza().put("df", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzfwr zzc(String str) {
        try {
            return zzfwh.zza(zzfwe.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to get keysethandle".concat(e.toString()));
            zzt.zzo().zzt(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
