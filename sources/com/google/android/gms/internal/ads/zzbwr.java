package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C5745R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbwr extends zzbwu {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbwr(zzcli zzcli, Map map) {
        super(zzcli, "storePicture");
        this.zza = map;
        this.zzb = zzcli.zzk();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new zzbhi(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = zzt.zzo().zzd();
                zzt.zzp();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
                builder.setTitle(zzd != null ? zzd.getString(C5745R.string.f14498s1) : "Save image");
                builder.setMessage(zzd != null ? zzd.getString(C5745R.string.f14499s2) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(zzd != null ? zzd.getString(C5745R.string.f14500s3) : "Accept", new zzbwp(this, str, lastPathSegment));
                builder.setNegativeButton(zzd != null ? zzd.getString(C5745R.string.f14501s4) : "Decline", new zzbwq(this));
                builder.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
