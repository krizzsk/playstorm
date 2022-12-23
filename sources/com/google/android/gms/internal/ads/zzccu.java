package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzccu extends zzcdo {
    private final Clock zzb;
    private final zzccu zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    /* synthetic */ zzccu(Context context, Clock clock, zzg zzg2, zzcdn zzcdn, zzcct zzcct) {
        this.zzb = clock;
        this.zzd = zzgpv.zza(context);
        this.zze = zzgpv.zza(zzg2);
        zzgpu zza = zzgpv.zza(zzcdn);
        this.zzf = zza;
        this.zzg = zzgpt.zzc(new zzccm(this.zzd, this.zze, zza));
        zzgpu zza2 = zzgpv.zza(clock);
        this.zzh = zza2;
        zzgqh zzc2 = zzgpt.zzc(new zzcco(zza2, this.zze, this.zzf));
        this.zzi = zzc2;
        zzccq zzccq = new zzccq(this.zzh, zzc2);
        this.zzj = zzccq;
        this.zzk = zzgpt.zzc(new zzcdt(this.zzd, zzccq));
    }

    /* access modifiers changed from: package-private */
    public final zzccl zza() {
        return (zzccl) this.zzg.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzccp zzb() {
        return new zzccp(this.zzb, (zzccn) this.zzi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzcds zzc() {
        return (zzcds) this.zzk.zzb();
    }
}
