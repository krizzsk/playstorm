package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdng {
    private int zza;
    private zzdk zzb;
    private zzbks zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzeg zzg;
    private Bundle zzh;
    private zzcli zzi;
    private zzcli zzj;
    private zzcli zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbla zzq;
    private zzbla zzr;
    private String zzs;
    private final SimpleArrayMap zzt = new SimpleArrayMap();
    private final SimpleArrayMap zzu = new SimpleArrayMap();
    private float zzv;
    private String zzw;

    public static zzdng zzab(zzbuk zzbuk) {
        try {
            zzdnf zzaf = zzaf(zzbuk.zzg(), (zzbuo) null);
            zzbks zzh2 = zzbuk.zzh();
            String zzo2 = zzbuk.zzo();
            List zzr2 = zzbuk.zzr();
            String zzm2 = zzbuk.zzm();
            Bundle zzf2 = zzbuk.zzf();
            String zzn2 = zzbuk.zzn();
            IObjectWrapper zzl2 = zzbuk.zzl();
            String zzq2 = zzbuk.zzq();
            String zzp2 = zzbuk.zzp();
            double zze2 = zzbuk.zze();
            zzbla zzi2 = zzbuk.zzi();
            zzdng zzdng = new zzdng();
            zzdng.zza = 2;
            zzdng.zzb = zzaf;
            zzdng.zzc = zzh2;
            zzdng.zzd = (View) zzah(zzbuk.zzj());
            zzdng.zzU("headline", zzo2);
            zzdng.zze = zzr2;
            zzdng.zzU("body", zzm2);
            zzdng.zzh = zzf2;
            zzdng.zzU("call_to_action", zzn2);
            zzdng.zzm = (View) zzah(zzbuk.zzk());
            zzdng.zzo = zzl2;
            zzdng.zzU("store", zzq2);
            zzdng.zzU("price", zzp2);
            zzdng.zzp = zze2;
            zzdng.zzq = zzi2;
            return zzdng;
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdng zzac(zzbul zzbul) {
        try {
            zzdnf zzaf = zzaf(zzbul.zzf(), (zzbuo) null);
            zzbks zzg2 = zzbul.zzg();
            String zzo2 = zzbul.zzo();
            List zzp2 = zzbul.zzp();
            String zzm2 = zzbul.zzm();
            Bundle zze2 = zzbul.zze();
            String zzn2 = zzbul.zzn();
            IObjectWrapper zzk2 = zzbul.zzk();
            String zzl2 = zzbul.zzl();
            zzbla zzh2 = zzbul.zzh();
            zzdng zzdng = new zzdng();
            zzdng.zza = 1;
            zzdng.zzb = zzaf;
            zzdng.zzc = zzg2;
            zzdng.zzd = (View) zzah(zzbul.zzi());
            zzdng.zzU("headline", zzo2);
            zzdng.zze = zzp2;
            zzdng.zzU("body", zzm2);
            zzdng.zzh = zze2;
            zzdng.zzU("call_to_action", zzn2);
            zzdng.zzm = (View) zzah(zzbul.zzj());
            zzdng.zzo = zzk2;
            zzdng.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, zzl2);
            zzdng.zzr = zzh2;
            return zzdng;
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdng zzad(zzbuk zzbuk) {
        try {
            return zzag(zzaf(zzbuk.zzg(), (zzbuo) null), zzbuk.zzh(), (View) zzah(zzbuk.zzj()), zzbuk.zzo(), zzbuk.zzr(), zzbuk.zzm(), zzbuk.zzf(), zzbuk.zzn(), (View) zzah(zzbuk.zzk()), zzbuk.zzl(), zzbuk.zzq(), zzbuk.zzp(), zzbuk.zze(), zzbuk.zzi(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdng zzae(zzbul zzbul) {
        try {
            return zzag(zzaf(zzbul.zzf(), (zzbuo) null), zzbul.zzg(), (View) zzah(zzbul.zzi()), zzbul.zzo(), zzbul.zzp(), zzbul.zzm(), zzbul.zze(), zzbul.zzn(), (View) zzah(zzbul.zzj()), zzbul.zzk(), (String) null, (String) null, -1.0d, zzbul.zzh(), zzbul.zzl(), 0.0f);
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdnf zzaf(zzdk zzdk, zzbuo zzbuo) {
        if (zzdk == null) {
            return null;
        }
        return new zzdnf(zzdk, zzbuo);
    }

    private static zzdng zzag(zzdk zzdk, zzbks zzbks, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbla zzbla, String str6, float f) {
        zzdng zzdng = new zzdng();
        zzdng.zza = 6;
        zzdng.zzb = zzdk;
        zzdng.zzc = zzbks;
        zzdng.zzd = view;
        String str7 = str;
        zzdng.zzU("headline", str);
        zzdng.zze = list;
        String str8 = str2;
        zzdng.zzU("body", str2);
        zzdng.zzh = bundle;
        String str9 = str3;
        zzdng.zzU("call_to_action", str3);
        zzdng.zzm = view2;
        zzdng.zzo = iObjectWrapper;
        String str10 = str4;
        zzdng.zzU("store", str4);
        String str11 = str5;
        zzdng.zzU("price", str5);
        zzdng.zzp = d;
        zzdng.zzq = zzbla;
        zzdng.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, str6);
        zzdng.zzP(f);
        return zzdng;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdng zzs(zzbuo zzbuo) {
        try {
            return zzag(zzaf(zzbuo.zzj(), zzbuo), zzbuo.zzk(), (View) zzah(zzbuo.zzm()), zzbuo.zzs(), zzbuo.zzv(), zzbuo.zzq(), zzbuo.zzi(), zzbuo.zzr(), (View) zzah(zzbuo.zzn()), zzbuo.zzo(), zzbuo.zzu(), zzbuo.zzt(), zzbuo.zze(), zzbuo.zzl(), zzbuo.zzp(), zzbuo.zzf());
        } catch (RemoteException e) {
            zze.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD("price");
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.get(str);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcli zzcli = this.zzi;
        if (zzcli != null) {
            zzcli.destroy();
            this.zzi = null;
        }
        zzcli zzcli2 = this.zzj;
        if (zzcli2 != null) {
            zzcli2.destroy();
            this.zzj = null;
        }
        zzcli zzcli3 = this.zzk;
        if (zzcli3 != null) {
            zzcli3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzbks zzbks) {
        this.zzc = zzbks;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(zzeg zzeg) {
        this.zzg = zzeg;
    }

    public final synchronized void zzK(zzbla zzbla) {
        this.zzq = zzbla;
    }

    public final synchronized void zzL(String str, zzbkm zzbkm) {
        if (zzbkm == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzbkm);
        }
    }

    public final synchronized void zzM(zzcli zzcli) {
        this.zzj = zzcli;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzbla zzbla) {
        this.zzr = zzbla;
    }

    public final synchronized void zzP(float f) {
        this.zzv = f;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcli zzcli) {
        this.zzk = zzcli;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d) {
        this.zzp = d;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i) {
        this.zza = i;
    }

    public final synchronized void zzW(zzdk zzdk) {
        this.zzb = zzdk;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcli zzcli) {
        this.zzi = zzcli;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzt;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzu;
    }

    public final synchronized zzdk zzj() {
        return this.zzb;
    }

    public final synchronized zzeg zzk() {
        return this.zzg;
    }

    public final synchronized zzbks zzl() {
        return this.zzc;
    }

    public final zzbla zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbkz.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbla zzn() {
        return this.zzq;
    }

    public final synchronized zzbla zzo() {
        return this.zzr;
    }

    public final synchronized zzcli zzp() {
        return this.zzj;
    }

    public final synchronized zzcli zzq() {
        return this.zzk;
    }

    public final synchronized zzcli zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER);
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
