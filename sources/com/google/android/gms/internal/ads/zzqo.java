package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzqo implements zzqx {
    public static final /* synthetic */ zzqo zza = new zzqo();

    private /* synthetic */ zzqo() {
    }

    public final int zza(Object obj) {
        int i = zzqy.zza;
        String str = ((zzqg) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzeg.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
