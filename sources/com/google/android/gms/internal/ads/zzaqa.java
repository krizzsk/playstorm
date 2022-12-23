package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqa extends zzaqm {
    public zzaqa(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "886A7k0gCRGrgCy/c5GSpG0vYnwEUdVtxuzPfTnYprNYN9F5XuGF9g0NY4fPk5Hd", "4rwcEO1STWNFfBc3lwJoy7fjIKj0+9F5WKY6nBJgTk0=", zzali, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhy.zzch)).booleanValue();
        zzaoj zzaoj = new zzaoj((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(booleanValue)}));
        synchronized (this.zze) {
            this.zze.zzi(zzaoj.zza);
            this.zze.zzz(zzaoj.zzb);
        }
    }
}
