package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeea {
    public static int zza(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor zzd = zzd(sQLiteDatabase, i);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            i2 = zzd.getInt(zzd.getColumnIndexOrThrow("value"));
        } else {
            i2 = 0;
        }
        zzd.close();
        return i2;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor zzd = zzd(sQLiteDatabase, 2);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            j = zzd.getLong(zzd.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        zzd.close();
        return j;
    }

    public static ArrayList zzc(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzbfu.zzi(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgla e) {
                zze.zzg("Unable to deserialize proto from offline signals database:");
                zze.zzg(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    private static Cursor zzd(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }
}
