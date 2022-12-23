package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdps implements Callable {
    public final /* synthetic */ zzdpt zza;
    public final /* synthetic */ zzfvj zzb;
    public final /* synthetic */ zzfvj zzc;
    public final /* synthetic */ zzfvj zzd;
    public final /* synthetic */ zzfvj zze;
    public final /* synthetic */ zzfvj zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ zzfvj zzh;
    public final /* synthetic */ zzfvj zzi;
    public final /* synthetic */ zzfvj zzj;
    public final /* synthetic */ zzfvj zzk;

    public /* synthetic */ zzdps(zzdpt zzdpt, zzfvj zzfvj, zzfvj zzfvj2, zzfvj zzfvj3, zzfvj zzfvj4, zzfvj zzfvj5, JSONObject jSONObject, zzfvj zzfvj6, zzfvj zzfvj7, zzfvj zzfvj8, zzfvj zzfvj9) {
        this.zza = zzdpt;
        this.zzb = zzfvj;
        this.zzc = zzfvj2;
        this.zzd = zzfvj3;
        this.zze = zzfvj4;
        this.zzf = zzfvj5;
        this.zzg = jSONObject;
        this.zzh = zzfvj6;
        this.zzi = zzfvj7;
        this.zzj = zzfvj8;
        this.zzk = zzfvj9;
    }

    public final Object call() {
        zzfvj zzfvj = this.zzb;
        zzfvj zzfvj2 = this.zzc;
        zzfvj zzfvj3 = this.zzd;
        zzfvj zzfvj4 = this.zze;
        zzfvj zzfvj5 = this.zzf;
        JSONObject jSONObject = this.zzg;
        zzfvj zzfvj6 = this.zzh;
        zzfvj zzfvj7 = this.zzi;
        zzfvj zzfvj8 = this.zzj;
        zzfvj zzfvj9 = this.zzk;
        zzdng zzdng = (zzdng) zzfvj.get();
        zzdng.zzN((List) zzfvj2.get());
        zzdng.zzK((zzbla) zzfvj3.get());
        zzdng.zzO((zzbla) zzfvj4.get());
        zzdng.zzH((zzbks) zzfvj5.get());
        zzdng.zzQ(zzdqg.zzj(jSONObject));
        zzdng.zzJ(zzdqg.zzi(jSONObject));
        zzcli zzcli = (zzcli) zzfvj6.get();
        if (zzcli != null) {
            zzdng.zzY(zzcli);
            zzdng.zzX(zzcli.zzH());
            zzdng.zzW(zzcli.zzs());
        }
        zzcli zzcli2 = (zzcli) zzfvj7.get();
        if (zzcli2 != null) {
            zzdng.zzM(zzcli2);
            zzdng.zzZ(zzcli2.zzH());
        }
        zzcli zzcli3 = (zzcli) zzfvj8.get();
        if (zzcli3 != null) {
            zzdng.zzR(zzcli3);
        }
        for (zzdqk zzdqk : (List) zzfvj9.get()) {
            if (zzdqk.zza != 1) {
                zzdng.zzL(zzdqk.zzb, zzdqk.zzd);
            } else {
                zzdng.zzU(zzdqk.zzb, zzdqk.zzc);
            }
        }
        return zzdng;
    }
}
