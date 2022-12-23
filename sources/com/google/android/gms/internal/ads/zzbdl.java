package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbdl {
    private final zzbdr zza;
    private final zzbfa zzb;
    private final boolean zzc;

    private zzbdl() {
        this.zzb = zzbfb.zzd();
        this.zzc = false;
        this.zza = new zzbdr();
    }

    public static zzbdl zza() {
        return new zzbdl();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzk(), Long.valueOf(zzt.zzA().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbfb) this.zzb.zzaj()).zzau(), 3)});
    }

    private final synchronized void zze(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i) {
        zzbfa zzbfa = this.zzb;
        zzbfa.zzd();
        List<String> zzb2 = zzbhy.zzb();
        ArrayList arrayList = new ArrayList();
        for (String split : zzb2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbfa.zzc(arrayList);
        zzbdq zzbdq = new zzbdq(this.zza, ((zzbfb) this.zzb.zzaj()).zzau(), (zzbdp) null);
        int i2 = i - 1;
        zzbdq.zza(i2);
        zzbdq.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbdk zzbdk) {
        if (this.zzc) {
            try {
                zzbdk.zza(this.zzb);
            } catch (NullPointerException e) {
                zzt.zzo().zzt(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzdV)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbdl(zzbdr zzbdr) {
        this.zzb = zzbfb.zzd();
        this.zza = zzbdr;
        this.zzc = ((Boolean) zzay.zzc().zzb(zzbhy.zzdU)).booleanValue();
    }
}
