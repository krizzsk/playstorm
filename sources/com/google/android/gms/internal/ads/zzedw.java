package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzedw implements zzffh {
    public final /* synthetic */ zzedx zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbfp zzd;
    public final /* synthetic */ zzbfy zze;

    public /* synthetic */ zzedw(zzedx zzedx, boolean z, ArrayList arrayList, zzbfp zzbfp, zzbfy zzbfy) {
        this.zza = zzedx;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzbfp;
        this.zze = zzbfy;
    }

    public final Object zza(Object obj) {
        zzedx zzedx = this.zza;
        boolean z = this.zzb;
        ArrayList arrayList = this.zzc;
        zzbfp zzbfp = this.zzd;
        zzbfy zzbfy = this.zze;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!zzedx.zzb.zzg.zzP()) {
            byte[] zzf = zzedy.zzf(zzedx.zzb, z, arrayList, zzbfp, zzbfy);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(zzt.zzA().currentTimeMillis()));
            contentValues.put("serialized_proto_data", zzf);
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            if (!z) {
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
            }
        }
        return null;
    }
}
