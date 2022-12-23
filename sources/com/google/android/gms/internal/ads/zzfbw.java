package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfbw {
    /* access modifiers changed from: private */
    public zzl zza;
    /* access modifiers changed from: private */
    public zzq zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzfg zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbko zzh;
    /* access modifiers changed from: private */
    public zzw zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzbz zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbqr zzn;
    /* access modifiers changed from: private */
    public final zzfbm zzo = new zzfbm();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public zzemc zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    /* access modifiers changed from: private */
    public zzcd zzs;

    public final zzfbw zzA(zzbko zzbko) {
        this.zzh = zzbko;
        return this;
    }

    public final zzfbw zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfbw zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfbw zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfbw zzE(zzl zzl2) {
        this.zza = zzl2;
        return this;
    }

    public final zzfbw zzF(zzfg zzfg) {
        this.zzd = zzfg;
        return this;
    }

    public final zzfby zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfby(this, (zzfbx) null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfbw zzQ(zzcd zzcd) {
        this.zzs = zzcd;
        return this;
    }

    public final zzl zze() {
        return this.zza;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzfbm zzo() {
        return this.zzo;
    }

    public final zzfbw zzp(zzfby zzfby) {
        this.zzo.zza(zzfby.zzo.zza);
        this.zza = zzfby.zzd;
        this.zzb = zzfby.zze;
        this.zzs = zzfby.zzr;
        this.zzc = zzfby.zzf;
        this.zzd = zzfby.zza;
        this.zzf = zzfby.zzg;
        this.zzg = zzfby.zzh;
        this.zzh = zzfby.zzi;
        this.zzi = zzfby.zzj;
        zzq(zzfby.zzl);
        zzD(zzfby.zzm);
        this.zzp = zzfby.zzp;
        this.zzq = zzfby.zzc;
        this.zzr = zzfby.zzq;
        return this;
    }

    public final zzfbw zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfbw zzr(zzq zzq2) {
        this.zzb = zzq2;
        return this;
    }

    public final zzfbw zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfbw zzt(zzw zzw) {
        this.zzi = zzw;
        return this;
    }

    public final zzfbw zzu(zzemc zzemc) {
        this.zzq = zzemc;
        return this;
    }

    public final zzfbw zzv(zzbqr zzbqr) {
        this.zzn = zzbqr;
        this.zzd = new zzfg(false, true, false);
        return this;
    }

    public final zzfbw zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfbw zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfbw zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfbw zzz(int i) {
        this.zzm = i;
        return this;
    }
}
