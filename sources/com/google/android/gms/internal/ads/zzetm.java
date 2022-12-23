package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzetm implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzetm(zzfvk zzfvk, Context context) {
        this.zza = zzfvk;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzetl(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetk zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i3 = -1;
        if (zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i = -1;
            z = false;
            i2 = -2;
        }
        return new zzetk(networkOperator, i2, zzt.zzq().zzk(this.zzb), phoneType, z, i);
    }
}
