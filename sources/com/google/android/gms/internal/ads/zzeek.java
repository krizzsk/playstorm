package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzeek implements zzffh {
    public final /* synthetic */ zzeen zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzeek(zzeen zzeen, String str) {
        this.zza = zzeen;
        this.zzb = str;
    }

    public final Object zza(Object obj) {
        zzeen.zzi((SQLiteDatabase) obj, this.zzb);
        return null;
    }
}
