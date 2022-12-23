package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfip extends zzfil {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfin zzb;
    private final zzfim zzc;
    private final List zzd = new ArrayList();
    private zzfkk zze;
    private zzfjn zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi;

    zzfip(zzfim zzfim, zzfin zzfin) {
        this.zzc = zzfim;
        this.zzb = zzfin;
        this.zzi = UUID.randomUUID().toString();
        zzk((View) null);
        if (zzfin.zzd() == zzfio.HTML || zzfin.zzd() == zzfio.JAVASCRIPT) {
            this.zzf = new zzfjo(zzfin.zza());
        } else {
            this.zzf = new zzfjq(zzfin.zzi(), (String) null);
        }
        this.zzf.zzj();
        zzfja.zza().zzd(this);
        zzfjg.zza().zzd(this.zzf.zza(), zzfim.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfkk(view);
    }

    public final void zzb(View view, zzfir zzfir, String str) {
        zzfjd zzfjd;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfjd = null;
                    break;
                }
                zzfjd = (zzfjd) it.next();
                if (zzfjd.zzb().get() == view) {
                    break;
                }
            }
            if (zzfjd == null) {
                this.zzd.add(new zzfjd(view, zzfir, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    public final void zzc() {
        if (!this.zzh) {
            this.zze.clear();
            if (!this.zzh) {
                this.zzd.clear();
            }
            this.zzh = true;
            zzfjg.zza().zzc(this.zzf.zza());
            zzfja.zza().zze(this);
            this.zzf.zzc();
            this.zzf = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzh && zzf() != view) {
            zzk(view);
            this.zzf.zzb();
            Collection<zzfip> zzc2 = zzfja.zza().zzc();
            if (zzc2 != null && zzc2.size() > 0) {
                for (zzfip zzfip : zzc2) {
                    if (zzfip != this && zzfip.zzf() == view) {
                        zzfip.zze.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zzg) {
            this.zzg = true;
            zzfja.zza().zzf(this);
            this.zzf.zzh(zzfjh.zzb().zza());
            this.zzf.zzf(this, this.zzb);
        }
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfjn zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
