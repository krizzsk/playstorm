package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdzh implements zzo, zzcmt {
    private final Context zza;
    private final zzcfo zzb;
    private zzdza zzc;
    private zzcli zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzcy zzh;
    private boolean zzi;

    zzdzh(Context context, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzcfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzj() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzfvk r0 = com.google.android.gms.internal.ads.zzcfv.zze     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzdzg r1 = new com.google.android.gms.internal.ads.zzdzg     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzh.zzj():void");
    }

    private final synchronized boolean zzk(zzcy zzcy) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
            zze.zzj("Ad inspector had an internal error.");
            try {
                zzcy.zze(zzfcx.zzd(16, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused) {
            }
        } else if (this.zzc == null) {
            zze.zzj("Ad inspector had an internal error.");
            try {
                zzcy.zze(zzfcx.zzd(16, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.zze && !this.zzf) {
                if (zzt.zzA().currentTimeMillis() >= this.zzg + ((long) ((Integer) zzay.zzc().zzb(zzbhy.zzhu)).intValue())) {
                    return true;
                }
            }
            zze.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzcy.zze(zzfcx.zzd(19, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0010
            java.lang.String r4 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x002c }
            r3.zze = r0     // Catch:{ all -> 0x002c }
            r3.zzj()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x0010:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.ads.internal.util.zze.zzj(r4)     // Catch:{ all -> 0x002c }
            com.google.android.gms.ads.internal.client.zzcy r4 = r3.zzh     // Catch:{ RemoteException -> 0x0023 }
            if (r4 == 0) goto L_0x0023
            r1 = 17
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzfcx.zzd(r1, r2, r2)     // Catch:{ RemoteException -> 0x0023 }
            r4.zze(r1)     // Catch:{ RemoteException -> 0x0023 }
        L_0x0023:
            r3.zzi = r0     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.zzcli r4 = r3.zzd     // Catch:{ all -> 0x002c }
            r4.destroy()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzh.zza(boolean):void");
    }

    public final synchronized void zzb() {
        this.zzf = true;
        zzj();
    }

    public final void zzbC() {
    }

    public final void zzbK() {
    }

    public final void zzbr() {
    }

    public final void zze() {
    }

    public final synchronized void zzf(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            zze.zza("Inspector closed.");
            zzcy zzcy = this.zzh;
            if (zzcy != null) {
                try {
                    zzcy.zze((com.google.android.gms.ads.internal.client.zze) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0;
        this.zzi = false;
        this.zzh = null;
    }

    public final void zzg(zzdza zzdza) {
        this.zzc = zzdza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzb("window.inspectorInfo", this.zzc.zzd().toString());
    }

    public final synchronized void zzi(zzcy zzcy, zzbom zzbom) {
        zzcy zzcy2 = zzcy;
        synchronized (this) {
            if (zzk(zzcy)) {
                try {
                    zzt.zzz();
                    zzcli zza2 = zzclu.zza(this.zza, zzcmx.zza(), "", false, false, (zzaoc) null, (zzbix) null, this.zzb, (zzbin) null, (zzl) null, (zza) null, zzbdl.zza(), (zzfbg) null, (zzfbj) null);
                    this.zzd = zza2;
                    zzcmv zzP = zza2.zzP();
                    if (zzP == null) {
                        zze.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            zzcy2.zze(zzfcx.zzd(17, "Failed to obtain a web view for the ad inspector", (com.google.android.gms.ads.internal.client.zze) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.zzh = zzcy2;
                        zzP.zzL((com.google.android.gms.ads.internal.client.zza) null, (zzbnl) null, (zzo) null, (zzbnn) null, (zzw) null, false, (zzboo) null, (zzb) null, (zzbwv) null, (zzccj) null, (zzeen) null, (zzfig) null, (zzdwg) null, (zzfgo) null, zzbom, (zzdjf) null);
                        zzP.zzz(this);
                        this.zzd.loadUrl((String) zzay.zzc().zzb(zzbhy.zzhs));
                        zzt.zzj();
                        zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                        this.zzg = zzt.zzA().currentTimeMillis();
                    }
                } catch (zzclt e) {
                    zze.zzk("Failed to obtain a web view for the ad inspector", e);
                    try {
                        zzcy2.zze(zzfcx.zzd(17, "Failed to obtain a web view for the ad inspector", (com.google.android.gms.ads.internal.client.zze) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }
}
