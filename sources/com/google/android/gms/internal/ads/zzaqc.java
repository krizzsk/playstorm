package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaqc extends zzaqm {
    private List zzi = null;

    public zzaqc(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "Hi6y3/CP3FfCDFHJzBy2rbo5w1qdyw4sxSVfaLENOd74y8BTNPMSy00WznqvaqDe", "doCqFliMrm1a/QUTbgigv63oWalof2MAZ3FbCUkhzYI=", zzali, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzT(-1);
        this.zze.zzP(-1);
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzT(((Long) this.zzi.get(0)).longValue());
                this.zze.zzP(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
