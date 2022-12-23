package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeel implements zzffh {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ zzcfn zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzeel(zzeen zzeen, zzcfn zzcfn, String str) {
        this.zza = zzeen;
        this.zzb = zzcfn;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
