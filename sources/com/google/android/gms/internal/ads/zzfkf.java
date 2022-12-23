package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzfkf extends AsyncTask {
    private zzfkg zza;
    protected final zzfjx zzd;

    public zzfkf(zzfjx zzfjx, byte[] bArr) {
        this.zzd = zzfjx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfkg zzfkg = this.zza;
        if (zzfkg != null) {
            zzfkg.zza(this);
        }
    }

    public final void zzb(zzfkg zzfkg) {
        this.zza = zzfkg;
    }
}
