package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfic {
    private final zzeil zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfbt zzf;
    private final Clock zzg;
    private final zzaoc zzh;

    public zzfic(zzeil zzeil, zzcfo zzcfo, String str, String str2, Context context, zzfbt zzfbt, Clock clock, zzaoc zzaoc) {
        this.zza = zzeil;
        this.zzb = zzcfo.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfbt;
        this.zzg = clock;
        this.zzh = zzaoc;
    }

    public static final List zzd(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzf((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    private static String zze(String str) {
        return (TextUtils.isEmpty(str) || !zzcfh.zzl()) ? str : "fakeForAdDebugLog";
    }

    private static String zzf(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zza(zzfbs zzfbs, zzfbg zzfbg, List list) {
        return zzb(zzfbs, zzfbg, false, "", "", list);
    }

    public final List zzb(zzfbs zzfbs, zzfbg zzfbg, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String zzf2 = zzf(zzf(zzf((String) it.next(), "@gw_adlocid@", zzfbs.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfbg != null) {
                zzf2 = zzcdp.zzc(zzf(zzf(zzf(zzf2, "@gw_qdata@", zzfbg.zzz), "@gw_adnetid@", zzfbg.zzy), "@gw_allocid@", zzfbg.zzx), this.zze, zzfbg.zzX);
            }
            String zzf3 = zzf(zzf(zzf(zzf2, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzcE)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zzf3);
                }
            }
            if (this.zzh.zzf(Uri.parse(zzf3))) {
                Uri.Builder buildUpon = Uri.parse(zzf3).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzf3 = buildUpon.build().toString();
            }
            arrayList.add(zzf3);
        }
        return arrayList;
    }

    public final List zzc(zzfbg zzfbg, List list, zzcak zzcak) {
        String str;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String zzc2 = zzcak.zzc();
            String num = Integer.toString(zzcak.zzb());
            zzfbt zzfbt = this.zzf;
            String str2 = "";
            if (zzfbt == null) {
                str = str2;
            } else {
                str = zze(zzfbt.zza);
            }
            zzfbt zzfbt2 = this.zzf;
            if (zzfbt2 != null) {
                str2 = zze(zzfbt2.zzb);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcdp.zzc(zzf(zzf(zzf(zzf(zzf(zzf((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc2)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfbg.zzX));
            }
            return arrayList;
        } catch (RemoteException e) {
            zze.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
