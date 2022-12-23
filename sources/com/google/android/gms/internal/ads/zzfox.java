package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzfox extends zzfpc {
    final /* synthetic */ zzfoy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfox(zzfoy zzfoy, zzfpe zzfpe, CharSequence charSequence) {
        super(zzfpe, charSequence);
        this.zza = zzfoy;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        zzfof zzfof = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfos.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfof.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
