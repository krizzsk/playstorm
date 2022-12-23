package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfuw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzv implements zzfuw {
    final /* synthetic */ zzcdw zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzz zzc;

    zzv(zzz zzz, zzcdw zzcdw, long j) {
        this.zzc = zzz;
        this.zza = zzcdw;
        this.zzb = j;
    }

    public final void zza(Throwable th) {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        long j = this.zzb;
        String message = th.getMessage();
        zzt.zzo().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzz zzz = this.zzc;
        zzf.zzc(zzz.zzr, zzz.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j)));
        try {
            zzcdw zzcdw = this.zza;
            zzcdw.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzal zzal = (zzal) obj;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            try {
                this.zza.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                zze.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
        } else {
            long currentTimeMillis = zzt.zzA().currentTimeMillis() - this.zzb;
            if (zzal == null) {
                try {
                    this.zza.zzc((String) null, (String) null, (Bundle) null);
                    zzz zzz = this.zzc;
                    zzf.zzc(zzz.zzr, zzz.zzj, "sgs", new Pair("rid", "-1"));
                } catch (RemoteException e2) {
                    zzcfi.zzh("", e2);
                }
            } else {
                try {
                    String optString = new JSONObject(zzal.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
                    if (TextUtils.isEmpty(optString)) {
                        zze.zzj("The request ID is empty in request JSON.");
                        this.zza.zzb("Internal error: request ID is empty in request JSON.");
                        zzz zzz2 = this.zzc;
                        zzf.zzc(zzz2.zzr, zzz2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                        return;
                    }
                    zzz zzz3 = this.zzc;
                    zzz.zzF(zzz3, optString, zzal.zzb, zzz3.zzj);
                    Bundle bundle = zzal.zzc;
                    zzz zzz4 = this.zzc;
                    if (zzz4.zzw && bundle != null && bundle.getInt(zzz4.zzy, -1) == -1) {
                        zzz zzz5 = this.zzc;
                        bundle.putInt(zzz5.zzy, zzz5.zzz.get());
                    }
                    zzz zzz6 = this.zzc;
                    if (zzz6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzz6.zzx))) {
                        if (TextUtils.isEmpty(this.zzc.zzB)) {
                            zzz zzz7 = this.zzc;
                            zzs zzp = zzt.zzp();
                            zzz zzz8 = this.zzc;
                            zzz7.zzB = zzp.zzc(zzz8.zzg, zzz8.zzA.zza);
                        }
                        zzz zzz9 = this.zzc;
                        bundle.putString(zzz9.zzx, zzz9.zzB);
                    }
                    this.zza.zzc(zzal.zza, zzal.zzb, bundle);
                    zzz zzz10 = this.zzc;
                    zzf.zzc(zzz10.zzr, zzz10.zzj, "sgs", new Pair("tqgt", String.valueOf(currentTimeMillis)));
                } catch (JSONException e3) {
                    zze.zzj("Failed to create JSON object from the request string.");
                    zzcdw zzcdw = this.zza;
                    String obj2 = e3.toString();
                    zzcdw.zzb("Internal error for request JSON: " + obj2);
                    zzz zzz11 = this.zzc;
                    zzf.zzc(zzz11.zzr, zzz11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                }
            }
        }
    }
}
