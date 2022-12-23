package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzchq {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final long zzp;
    public final long zzq;

    public zzchq(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbhy.zzG);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbhy.zzj);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbhy.zzu);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbhy.zzf);
        zzbhq zzbhq = zzbhy.zze;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = str2;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbhy.zzg);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbhy.zzh);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbhy.zzi);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbhy.zzk);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbhy.zzdn);
            this.zzk = zzb(jSONObject, "min_retry_count", zzbhy.zzl);
            this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbhy.zzo);
            this.zzm = zza(jSONObject, "using_official_simple_exo_player", zzbhy.zzbC);
            this.zzn = zza(jSONObject, "enable_multiple_video_playback", zzbhy.zzbD);
            this.zzo = zza(jSONObject, "use_range_http_data_source", zzbhy.zzbF);
            this.zzp = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbhy.zzbG);
            this.zzq = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbhy.zzbH);
        }
        str2 = (String) zzay.zzc().zzb(zzbhq);
        this.zze = str2;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbhy.zzg);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbhy.zzh);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbhy.zzi);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbhy.zzk);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbhy.zzdn);
        this.zzk = zzb(jSONObject, "min_retry_count", zzbhy.zzl);
        this.zzl = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbhy.zzo);
        this.zzm = zza(jSONObject, "using_official_simple_exo_player", zzbhy.zzbC);
        this.zzn = zza(jSONObject, "enable_multiple_video_playback", zzbhy.zzbD);
        this.zzo = zza(jSONObject, "use_range_http_data_source", zzbhy.zzbF);
        this.zzp = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbhy.zzbG);
        this.zzq = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbhy.zzbH);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbhq zzbhq) {
        boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhq)).booleanValue();
        if (jSONObject == null) {
            return booleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return booleanValue;
        }
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbhq zzbhq) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzay.zzc().zzb(zzbhq)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbhq zzbhq) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzay.zzc().zzb(zzbhq)).longValue();
    }
}
