package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcol extends zzett {
    private final zzevf zza;
    private final zzcrb zzb;
    private final zzcol zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;
    private final zzgqh zzl;
    private final zzgqh zzm;
    private final zzgqh zzn;
    private final zzgqh zzo;
    private final zzgqh zzp;
    private final zzgqh zzq;
    private final zzgqh zzr;
    private final zzgqh zzs;
    private final zzgqh zzt;
    private final zzgqh zzu;
    private final zzgqh zzv;
    private final zzgqh zzw;
    private final zzgqh zzx;
    private final zzgqh zzy;
    private final zzgqh zzz;

    /* synthetic */ zzcol(zzcrb zzcrb, zzevf zzevf, zzcok zzcok) {
        zzevf zzevf2 = zzevf;
        this.zzb = zzcrb;
        this.zza = zzevf2;
        this.zzd = zzgpt.zzc(new zzfhr(zzcrb.zzF));
        this.zze = new zzevh(zzevf2);
        zzcsh zza2 = zzcsg.zza;
        zzcrb zzcrb2 = this.zzb;
        zzgqh zzad = zzcrb2.zzh;
        zzgqh zzar = zzcrb2.zzn;
        zzfez zza3 = zzfez.zza();
        zzgqh zzgqh = this.zze;
        this.zzf = new zzets(zza2, zzad, zzar, zza3, zzgqh);
        this.zzg = new zzevg(zzevf2);
        zzcnx zza4 = zzcnw.zza;
        zzgqh zzad2 = zzcrb2.zzh;
        zzgqh zzgqh2 = this.zzg;
        this.zzh = new zzeub(zza4, zzad2, zzgqh2, zzfez.zza());
        this.zzi = new zzeum(zzcsg.zza, zzgqh, zzcrb2.zzh, zzcrb2.zzac, zzcrb2.zzn, zzfez.zza(), zzgqh2);
        this.zzj = new zzeuq(zzcsa.zza, zzfez.zza(), zzcrb2.zzh);
        this.zzk = new zzeux(zzcsc.zza, zzfez.zza(), zzgqh2);
        this.zzl = new zzeve(zzcse.zza, zzcrb2.zzn, zzcrb2.zzh);
        this.zzm = new zzevv(zzfez.zza());
        this.zzn = new zzevi(zzevf2);
        this.zzo = new zzevr(zzcrb2.zzac, this.zzn, zzcsi.zza, zzfez.zza(), zzgqh2, zzcrb2.zzn);
        this.zzp = new zzeug(zzgqh2, zzcry.zza, zzcrb2.zzac, zzcrb2.zzn, zzfez.zza());
        this.zzq = new zzevj(zzevf2);
        this.zzr = zzgpt.zzc(zzdvf.zza());
        this.zzs = zzgpt.zzc(zzdvd.zza());
        this.zzt = zzgpt.zzc(zzdvh.zza());
        this.zzu = zzgpt.zzc(zzdvj.zza());
        zzgpx zzc2 = zzgpy.zzc(4);
        zzc2.zzb(zzffy.GMS_SIGNALS, this.zzr);
        zzc2.zzb(zzffy.BUILD_URL, this.zzs);
        zzc2.zzb(zzffy.HTTP, this.zzt);
        zzc2.zzb(zzffy.PRE_PROCESS, this.zzu);
        this.zzv = zzc2.zzc();
        this.zzw = zzgpt.zzc(new zzdvk(this.zzq, this.zzb.zzh, zzfez.zza(), this.zzv));
        zzgqe zza5 = zzgqf.zza(0, 1);
        zza5.zza(this.zzw);
        zzgqf zzc3 = zza5.zzc();
        this.zzx = zzc3;
        this.zzy = new zzfgh(zzc3);
        this.zzz = zzgpt.zzc(new zzfgg(zzfez.zza(), this.zzb.zzn, this.zzy));
    }

    private final zzetw zze() {
        zzcei zzcei = new zzcei();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        String zzd2 = this.zza.zzd();
        zzgqc.zzb(zzd2);
        return new zzetw(zzcei, zzfvk, zzd2, this.zza.zzb(), this.zza.zza(), (byte[]) null);
    }

    private final zzeuz zzf() {
        zzbhj zzbhj = new zzbhj();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        List zzf2 = this.zza.zzf();
        zzgqc.zzb(zzf2);
        return new zzeuz(zzbhj, zzfvk, zzf2, (byte[]) null);
    }

    public final zzete zza() {
        Context zza2 = this.zzb.zza.zza();
        Context context = zza2;
        zzgqc.zzb(zza2);
        zzcef zzcef = r1;
        zzcef zzcef2 = new zzcef();
        zzceg zzceg = r1;
        zzceg zzceg2 = new zzceg();
        Object zzb2 = this.zzb.zzaA.zzb();
        zzetw zze2 = zze();
        zzeuz zzf2 = zzf();
        zzgpo zza3 = zzgpt.zza(this.zzf);
        zzgpo zza4 = zzgpt.zza(this.zzh);
        zzgpo zza5 = zzgpt.zza(this.zzi);
        zzgpo zza6 = zzgpt.zza(this.zzj);
        zzgpo zza7 = zzgpt.zza(this.zzk);
        zzgpo zza8 = zzgpt.zza(this.zzl);
        zzgpo zza9 = zzgpt.zza(this.zzm);
        zzgpo zza10 = zzgpt.zza(this.zzo);
        zzgpo zza11 = zzgpt.zza(this.zzp);
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return zzevm.zza(context, zzcef, zzceg, zzb2, zze2, zzf2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zza11, zzfvk, (zzfhq) this.zzd.zzb(), (zzdwg) this.zzb.zzV.zzb());
    }

    public final zzete zzb() {
        Context zza2 = this.zzb.zza.zza();
        zzgqc.zzb(zza2);
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        zzcef zzcef = new zzcef();
        zzfvk zzfvk2 = zzcfv.zza;
        zzgqc.zzb(zzfvk2);
        String zzc2 = this.zza.zzc();
        zzgqc.zzb(zzc2);
        zzerm zzerm = new zzerm(new zzeuv(zzcef, zzfvk2, zzc2, (byte[]) null), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        Context zza3 = this.zzb.zza.zza();
        zzgqc.zzb(zza3);
        zzerm zzerm2 = new zzerm(new zzevc(new zzbxy(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zza3, (byte[]) null), ((Long) zzay.zzc().zzb(zzbhy.zzde)).longValue(), (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzcei zzcei = new zzcei();
        Context zza4 = this.zzb.zza.zza();
        zzgqc.zzb(zza4);
        zzfvk zzfvk3 = zzcfv.zza;
        zzgqc.zzb(zzfvk3);
        zzerm zzerm3 = new zzerm(new zzetq(zzcei, zza4, (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk3, this.zza.zza(), (byte[]) null), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzfvk zzfvk4 = zzcfv.zza;
        zzgqc.zzb(zzfvk4);
        zzerm zzerm4 = new zzerm(new zzevt(zzfvk4), 0, (ScheduledExecutorService) this.zzb.zzn.zzb());
        zzevk zzevk = zzevk.zza;
        Context zza5 = this.zzb.zza.zza();
        zzgqc.zzb(zza5);
        String zzc3 = this.zza.zzc();
        zzgqc.zzb(zzc3);
        zzfvk zzfvk5 = zzcfv.zza;
        zzgqc.zzb(zzfvk5);
        zzetz zzetz = new zzetz((zzbzw) null, zza5, zzc3, zzfvk5);
        zzbda zzbda = new zzbda();
        zzfvk zzfvk6 = zzcfv.zza;
        zzgqc.zzb(zzfvk6);
        Context zza6 = this.zzb.zza.zza();
        zzgqc.zzb(zza6);
        zzcei zzcei2 = new zzcei();
        int zza7 = this.zza.zza();
        Context zza8 = this.zzb.zza.zza();
        zzgqc.zzb(zza8);
        zzfvk zzfvk7 = zzcfv.zza;
        zzgqc.zzb(zzfvk7);
        String zzc4 = this.zza.zzc();
        zzgqc.zzb(zzc4);
        String zzc5 = this.zza.zzc();
        zzgqc.zzb(zzc5);
        zzfvk zzfvk8 = zzcfv.zza;
        zzgqc.zzb(zzfvk8);
        return new zzete(zza2, zzfvk, zzfrm.zzm(zzerm, zzerm2, zzerm3, zzerm4, zzevk, zzetz, new zzeuo(zzbda, zzfvk6, zza6, (byte[]) null), zzf(), zze(), new zzeuk(zzcei2, zza7, zza8, (zzcer) this.zzb.zzac.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk7, zzc4, (byte[]) null), (zzetb) this.zzb.zzaA.zzb(), zzeug.zza(zzc5, new zzbco(), (zzcer) this.zzb.zzac.zzb(), (ScheduledExecutorService) this.zzb.zzn.zzb(), zzfvk8)), (zzfhq) this.zzd.zzb(), (zzdwg) this.zzb.zzV.zzb());
    }

    public final zzfge zzc() {
        return (zzfge) this.zzz.zzb();
    }

    public final zzfhq zzd() {
        return (zzfhq) this.zzd.zzb();
    }
}
