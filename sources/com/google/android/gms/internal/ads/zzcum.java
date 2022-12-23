package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcum implements zzbam {
    private zzcli zza;
    private final Executor zzb;
    private final zzcty zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcub zzg = new zzcub();

    public zzcum(Executor executor, zzcty zzcty, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcty;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcul(this, zza2));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final void zzc(zzbal zzbal) {
        boolean z;
        zzcub zzcub = this.zzg;
        if (this.zzf) {
            z = false;
        } else {
            z = zzbal.zzj;
        }
        zzcub.zza = z;
        zzcub.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbal;
        if (this.zze) {
            zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcli zzcli) {
        this.zza = zzcli;
    }
}
