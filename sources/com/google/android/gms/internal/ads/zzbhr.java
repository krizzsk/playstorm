package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbhr {
    private final Collection zza = new ArrayList();
    private final Collection zzb = new ArrayList();
    private final Collection zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbhq zzb2 : this.zzb) {
            String str = (String) zzay.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbhz.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbhq zzb2 : this.zzc) {
            String str = (String) zzay.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbhz.zzb());
        return zza2;
    }

    public final void zzc(zzbhq zzbhq) {
        this.zzb.add(zzbhq);
    }

    public final void zzd(zzbhq zzbhq) {
        this.zza.add(zzbhq);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbhq zzbhq : this.zza) {
            if (zzbhq.zze() == 1) {
                zzbhq.zzd(editor, zzbhq.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcfi.zzg("Flag Json is null.");
        }
    }
}
