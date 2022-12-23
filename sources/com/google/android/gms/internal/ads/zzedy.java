package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzedy {
    private static final SparseArray zza;
    private final Context zzb;
    private final zzday zzc;
    private final TelephonyManager zzd;
    private final zzedr zze;
    /* access modifiers changed from: private */
    public final zzedn zzf;
    /* access modifiers changed from: private */
    public final zzg zzg;
    private int zzh;

    static {
        SparseArray sparseArray = new SparseArray();
        zza = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfy.CONNECTED);
        zza.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbfy.CONNECTING);
        zza.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbfy.CONNECTING);
        zza.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbfy.CONNECTING);
        zza.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfy.DISCONNECTING);
        zza.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbfy.DISCONNECTED);
        zza.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbfy.DISCONNECTED);
        zza.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbfy.DISCONNECTED);
        zza.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbfy.DISCONNECTED);
        zza.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbfy.DISCONNECTED);
        zza.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfy.SUSPENDED);
        zza.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbfy.CONNECTING);
        zza.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbfy.CONNECTING);
    }

    zzedy(Context context, zzday zzday, zzedr zzedr, zzedn zzedn, zzg zzg2) {
        this.zzb = context;
        this.zzc = zzday;
        this.zze = zzedr;
        this.zzf = zzedn;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
        this.zzg = zzg2;
    }

    static /* bridge */ /* synthetic */ zzbfp zza(zzedy zzedy, Bundle bundle) {
        zzbfi zza2 = zzbfp.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzedy.zzh = 2;
        } else {
            zzedy.zzh = 1;
            if (i == 0) {
                zza2.zzb(2);
            } else if (i != 1) {
                zza2.zzb(1);
            } else {
                zza2.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza2.zza(i3);
        }
        return (zzbfp) zza2.zzaj();
    }

    static /* bridge */ /* synthetic */ zzbfy zzb(zzedy zzedy, Bundle bundle) {
        return (zzbfy) zza.get(zzfcj.zza(zzfcj.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbfy.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zzf(zzedy zzedy, boolean z, ArrayList arrayList, zzbfp zzbfp, zzbfy zzbfy) {
        zzbft zzg2 = zzbfu.zzg();
        zzg2.zza(arrayList);
        boolean z2 = false;
        zzg2.zzh(zzg(Settings.Global.getInt(zzedy.zzb.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg2.zzi(zzt.zzq().zzh(zzedy.zzb, zzedy.zzd));
        zzg2.zzf(zzedy.zze.zzd());
        zzg2.zze(zzedy.zze.zzb());
        zzg2.zzb(zzedy.zze.zza());
        zzg2.zzc(zzbfy);
        zzg2.zzd(zzbfp);
        zzg2.zzj(zzedy.zzh);
        zzg2.zzk(zzg(z));
        zzg2.zzg(zzt.zzA().currentTimeMillis());
        if (Settings.Global.getInt(zzedy.zzb.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        zzg2.zzl(zzg(z2));
        return ((zzbfu) zzg2.zzaj()).zzau();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zze(boolean z) {
        zzfva.zzr(this.zzc.zzb(), new zzedx(this, z), zzcfv.zzf);
    }
}
