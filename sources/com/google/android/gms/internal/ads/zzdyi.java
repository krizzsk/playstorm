package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdyi {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcga zze = new zzcga();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdub zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdwp zzl;
    private final zzcfo zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdij zzo;
    /* access modifiers changed from: private */
    public final zzfhs zzp;
    private boolean zzq = true;

    public zzdyi(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdub zzdub, ScheduledExecutorService scheduledExecutorService, zzdwp zzdwp, zzcfo zzcfo, zzdij zzdij, zzfhs zzfhs) {
        this.zzh = zzdub;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdwp;
        this.zzm = zzcfo;
        this.zzo = zzdij;
        this.zzp = zzfhs;
        this.zzd = zzt.zzA().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzdyi zzdyi, String str) {
        zzdyi zzdyi2 = zzdyi;
        int i = 5;
        zzfhg zza2 = zzfhf.zza(zzdyi2.zzf, 5);
        zza2.zzf();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfhg zza3 = zzfhf.zza(zzdyi2.zzf, i);
                zza3.zzf();
                zza3.zzc(next);
                Object obj = new Object();
                zzcga zzcga = new zzcga();
                zzfvj zzo2 = zzfva.zzo(zzcga, ((Long) zzay.zzc().zzb(zzbhy.zzbz)).longValue(), TimeUnit.SECONDS, zzdyi2.zzk);
                zzdyi2.zzl.zzc(next);
                zzdyi2.zzo.zzc(next);
                long elapsedRealtime = zzt.zzA().elapsedRealtime();
                zzdxz zzdxz = r1;
                zzfvj zzfvj = zzo2;
                zzdxz zzdxz2 = new zzdxz(zzdyi, obj, zzcga, next, elapsedRealtime, zza3);
                zzfvj.zzc(zzdxz, zzdyi2.zzi);
                arrayList.add(zzfvj);
                zzdyh zzdyh = new zzdyh(zzdyi, obj, next, elapsedRealtime, zza3, zzcga);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqp(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdyi2.zzv(next, false, "", 0);
                try {
                    zzdyi2.zzj.execute(new zzdyd(zzdyi, zzdyi2.zzh.zzc(next, new JSONObject()), zzdyh, arrayList2, next));
                } catch (zzfcd unused2) {
                    try {
                        zzdyh.zze("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        zzcfi.zzh("", e);
                    }
                }
                i = 5;
            }
            zzfva.zza(arrayList).zza(new zzdya(zzdyi2, zza2), zzdyi2.zzi);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
            zzdyi2.zzo.zza("MalformedJson");
            zzdyi2.zzl.zza("MalformedJson");
            zzdyi2.zze.zze(e2);
            zzt.zzo().zzt(e2, "AdapterInitializer.updateAdapterStatus");
            zzfhs zzfhs = zzdyi2.zzp;
            zza2.zze(false);
            zzfhs.zzb(zza2.zzj());
        }
    }

    private final synchronized zzfvj zzu() {
        String zzc2 = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzfva.zzi(zzc2);
        }
        zzcga zzcga = new zzcga();
        zzt.zzo().zzh().zzq(new zzdye(this, zzcga));
        return zzcga;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbqf(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfhg zzfhg) throws Exception {
        this.zze.zzd(true);
        zzfhs zzfhs = this.zzp;
        zzfhg.zze(true);
        zzfhs.zzb(zzfhg.zzj());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbqf zzbqf = (zzbqf) this.zzn.get(str);
            arrayList.add(new zzbqf(str, zzbqf.zzb, zzbqf.zzc, zzbqf.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zze(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zze("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfct r2, com.google.android.gms.internal.ads.zzbqj r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch:{ zzfcd -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzfcd -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzfcd -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.zzf     // Catch:{ zzfcd -> 0x0011 }
        L_0x000d:
            r2.zzi(r0, r3, r4)     // Catch:{ zzfcd -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.zze(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcfi.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyi.zzn(com.google.android.gms.internal.ads.zzfct, com.google.android.gms.internal.ads.zzbqj, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzcga zzcga) {
        this.zzi.execute(new zzdxx(this, zzcga));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcga zzcga, String str, long j, zzfhg zzfhg) {
        synchronized (obj) {
            if (!zzcga.isDone()) {
                zzv(str, false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhs zzfhs = this.zzp;
                zzfhg.zze(false);
                zzfhs.zzb(zzfhg.zzj());
                zzcga.zzd(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbjt.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzay.zzc().zzb(zzbhy.zzby)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.zzc(new zzdxy(this), this.zzi);
                            this.zza = true;
                            zzfvj zzu = zzu();
                            this.zzk.schedule(new zzdyb(this), ((Long) zzay.zzc().zzb(zzbhy.zzbA)).longValue(), TimeUnit.SECONDS);
                            zzfva.zzr(zzu, new zzdyg(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzd(false);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbqm zzbqm) {
        this.zze.zzc(new zzdyc(this, zzbqm), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
