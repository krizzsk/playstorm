package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
final class zzh {
    private long zzA;
    private long zzB;
    private String zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzgk zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private String zzr;
    private Boolean zzs;
    private long zzt;
    private List zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    zzh(zzgk zzgk, String str) {
        Preconditions.checkNotNull(zzgk);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgk;
        this.zzb = str;
        zzgk.zzaz().zzg();
    }

    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    public final String zzB() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    public final List zzC() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    public final void zzD() {
        this.zza.zzaz().zzg();
        this.zzD = false;
    }

    public final void zzE() {
        this.zza.zzaz().zzg();
        long j = this.zzg + 1;
        if (j > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzfa.zzn(this.zzb));
            j = 0;
        }
        this.zzD = true;
        this.zzg = j;
    }

    public final void zzF(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzg.zza(this.zzr, str);
        this.zzr = str;
    }

    public final void zzG(boolean z) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzq != z;
        this.zzq = z;
    }

    public final void zzH(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzp != j;
        this.zzp = j;
    }

    public final void zzI(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    public final void zzJ(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    public final void zzK(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    public final void zzL(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzk != j;
        this.zzk = j;
    }

    public final void zzM(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzE != j;
        this.zzE = j;
    }

    public final void zzN(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzz != j;
        this.zzz = j;
    }

    public final void zzO(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzA != j;
        this.zzA = j;
    }

    public final void zzP(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzy != j;
        this.zzy = j;
    }

    public final void zzQ(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzx != j;
        this.zzx = j;
    }

    public final void zzR(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzB != j;
        this.zzB = j;
    }

    public final void zzS(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzw != j;
        this.zzw = j;
    }

    public final void zzT(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzn != j;
        this.zzn = j;
    }

    public final void zzU(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzt != j;
        this.zzt = j;
    }

    public final void zzV(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzF != j;
        this.zzF = j;
    }

    public final void zzW(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    public final void zzX(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    public final void zzY(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzm != j;
        this.zzm = j;
    }

    public final void zzZ(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzC, str);
        this.zzC = str;
    }

    public final long zza() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    public final void zzaa(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzi != j;
        this.zzi = j;
    }

    public final void zzab(long j) {
        boolean z = true;
        Preconditions.checkArgument(j >= 0);
        this.zza.zzaz().zzg();
        boolean z2 = this.zzD;
        if (this.zzg == j) {
            z = false;
        }
        this.zzD = z2 | z;
        this.zzg = j;
    }

    public final void zzac(long j) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzh != j;
        this.zzh = j;
    }

    public final void zzad(boolean z) {
        this.zza.zzaz().zzg();
        this.zzD |= this.zzo != z;
        this.zzo = z;
    }

    public final void zzae(Boolean bool) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzs, bool);
        this.zzs = bool;
    }

    public final void zzaf(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    public final void zzag(List list) {
        this.zza.zzaz().zzg();
        if (!zzg.zza(this.zzu, list)) {
            this.zzD = true;
            this.zzu = list != null ? new ArrayList(list) : null;
        }
    }

    public final void zzah(String str) {
        this.zza.zzaz().zzg();
        this.zzD |= !zzg.zza(this.zzv, str);
        this.zzv = str;
    }

    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    public final boolean zzaj() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    public final boolean zzak() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }

    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzF;
    }

    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzC;
        zzZ((String) null);
        return str;
    }

    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }
}
