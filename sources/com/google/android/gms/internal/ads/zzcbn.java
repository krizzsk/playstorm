package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcbn implements RewardItem {
    private final zzcba zza;

    public zzcbn(zzcba zzcba) {
        this.zza = zzcba;
    }

    public final int getAmount() {
        zzcba zzcba = this.zza;
        if (zzcba != null) {
            try {
                return zzcba.zze();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        zzcba zzcba = this.zza;
        if (zzcba != null) {
            try {
                return zzcba.zzf();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
