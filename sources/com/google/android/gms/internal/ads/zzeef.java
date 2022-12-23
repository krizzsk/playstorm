package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeef {
    private final zzbdl zza;
    private final Context zzb;
    private final zzedn zzc;
    private final zzcfo zzd;
    private final String zze;
    private final zzfgo zzf;
    private final zzg zzg = zzt.zzo().zzh();

    public zzeef(Context context, zzcfo zzcfo, zzbdl zzbdl, zzedn zzedn, String str, zzfgo zzfgo) {
        this.zzb = context;
        this.zzd = zzcfo;
        this.zza = zzbdl;
        this.zzc = zzedn;
        this.zze = str;
        this.zzf = zzfgo;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbfu zzbfu = (zzbfu) arrayList.get(i);
            if (zzbfu.zzv() == 2 && zzbfu.zze() > j) {
                j = zzbfu.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    public final void zzb(boolean z) {
        try {
            this.zzc.zza(new zzeeb(this, z));
        } catch (Exception e) {
            zze.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgn zzb2 = zzfgn.zzb("oa_upload");
            zzb2.zza("oa_failed_reqs", String.valueOf(zzeea.zza(sQLiteDatabase2, 0)));
            zzb2.zza("oa_total_reqs", String.valueOf(zzeea.zza(sQLiteDatabase2, 1)));
            zzb2.zza("oa_upload_time", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzb2.zza("oa_last_successful_time", String.valueOf(zzeea.zzb(sQLiteDatabase2, 2)));
            zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb2);
            ArrayList zzc2 = zzeea.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase2, zzc2);
            int size = zzc2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbfu zzbfu = (zzbfu) zzc2.get(i2);
                zzfgn zzb3 = zzfgn.zzb("oa_signals");
                if (this.zzg.zzP()) {
                    str = "";
                } else {
                    str = this.zze;
                }
                zzb3.zza("oa_session_id", str);
                zzbfp zzf2 = zzbfu.zzf();
                String valueOf = zzf2.zzf() ? String.valueOf(zzf2.zzh() - 1) : "-1";
                String obj = zzfrv.zzb(zzbfu.zzk(), zzeee.zza).toString();
                zzb3.zza("oa_sig_ts", String.valueOf(zzbfu.zze()));
                zzb3.zza("oa_sig_status", String.valueOf(zzbfu.zzv() - 1));
                zzb3.zza("oa_sig_resp_lat", String.valueOf(zzbfu.zzd()));
                zzb3.zza("oa_sig_render_lat", String.valueOf(zzbfu.zzc()));
                zzb3.zza("oa_sig_formats", obj);
                zzb3.zza("oa_sig_nw_type", valueOf);
                zzb3.zza("oa_sig_wifi", String.valueOf(zzbfu.zzw() - 1));
                zzb3.zza("oa_sig_airplane", String.valueOf(zzbfu.zzs() - 1));
                zzb3.zza("oa_sig_data", String.valueOf(zzbfu.zzt() - 1));
                zzb3.zza("oa_sig_nw_resp", String.valueOf(zzbfu.zza()));
                zzb3.zza("oa_sig_offline", String.valueOf(zzbfu.zzu() - 1));
                zzb3.zza("oa_sig_nw_state", String.valueOf(zzbfu.zzj().zza()));
                if (zzf2.zze() && zzf2.zzf() && zzf2.zzh() == 2) {
                    zzb3.zza("oa_sig_cell_type", String.valueOf(zzf2.zzg() - 1));
                }
                this.zzf.zzb(zzb3);
            }
        } else {
            ArrayList zzc3 = zzeea.zzc(sQLiteDatabase);
            zzbfv zza2 = zzbfz.zza();
            zza2.zzb(this.zzb.getPackageName());
            zza2.zzc(Build.MODEL);
            zza2.zzd(zzeea.zza(sQLiteDatabase2, 0));
            zza2.zza(zzc3);
            zza2.zzf(zzeea.zza(sQLiteDatabase2, 1));
            zza2.zzg(zzt.zzA().currentTimeMillis());
            zza2.zze(zzeea.zzb(sQLiteDatabase2, 2));
            zzc(sQLiteDatabase2, zzc3);
            this.zza.zzb(new zzeec((zzbfz) zza2.zzaj()));
            zzbgk zza3 = zzbgl.zza();
            zza3.zza(this.zzd.zzb);
            zza3.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i = 0;
            }
            zza3.zzb(i);
            this.zza.zzb(new zzeed((zzbgl) zza3.zzaj()));
            this.zza.zzc(10004);
        }
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
