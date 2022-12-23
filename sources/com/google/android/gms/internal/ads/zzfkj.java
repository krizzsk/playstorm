package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfkj extends zzfke {
    public zzfkj(zzfjx zzfjx, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfjx, hashSet, jSONObject, j, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfjr.zzi(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzfja zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfja.zza()) != null) {
            for (zzfip zzfip : zza.zzc()) {
                if (this.zza.contains(zzfip.zzh())) {
                    zzfip.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
