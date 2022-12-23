package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfby;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzf {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "unspecified"
            return r1
        L_0x0009:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L_0x0057;
                case 1743582863: goto L_0x004d;
                case 1743582864: goto L_0x0043;
                case 1743582865: goto L_0x0039;
                case 1743582866: goto L_0x002f;
                case 1743582867: goto L_0x0025;
                case 1743582868: goto L_0x001b;
                case 1743582869: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0061
        L_0x0011:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 7
            goto L_0x0062
        L_0x001b:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 6
            goto L_0x0062
        L_0x0025:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 5
            goto L_0x0062
        L_0x002f:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 4
            goto L_0x0062
        L_0x0039:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0061
            r0 = 0
            goto L_0x0062
        L_0x0061:
            r0 = -1
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0078;
                case 2: goto L_0x0075;
                case 3: goto L_0x0072;
                case 4: goto L_0x006f;
                case 5: goto L_0x006c;
                case 6: goto L_0x0069;
                case 7: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r1
        L_0x0066:
            java.lang.String r1 = "7"
            return r1
        L_0x0069:
            java.lang.String r1 = "6"
            return r1
        L_0x006c:
            java.lang.String r1 = "5"
            return r1
        L_0x006f:
            java.lang.String r1 = "4"
            return r1
        L_0x0072:
            java.lang.String r1 = "3"
            return r1
        L_0x0075:
            java.lang.String r1 = "2"
            return r1
        L_0x0078:
            java.lang.String r1 = "1"
            return r1
        L_0x007b:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(java.lang.String):java.lang.String");
    }

    public static String zzb(zzl zzl) {
        Bundle bundle = zzl.zzc;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzc(zzdwl zzdwl, zzdwb zzdwb, String str, Pair... pairArr) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            zzcfv.zza.execute(new zze(zzdwl, zzdwb, str, pairArr));
        }
    }

    public static int zzd(zzfby zzfby) {
        if (zzfby.zzq) {
            return 2;
        }
        zzl zzl = zzfby.zzd;
        zzc zzc = zzl.zzs;
        if (zzc == null && zzl.zzx == null) {
            return 1;
        }
        if (zzc == null || zzl.zzx == null) {
            return zzc != null ? 3 : 4;
        }
        return 5;
    }
}
