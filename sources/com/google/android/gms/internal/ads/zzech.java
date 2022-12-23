package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzech implements zzfuh {
    public final /* synthetic */ zzecn zza;

    public /* synthetic */ zzech(zzecn zzecn) {
        this.zza = zzecn;
    }

    public final zzfvj zza(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzcfv.zza.execute(new zzfcw((InputStream) obj, createPipe[1]));
        return zzfva.zzi(parcelFileDescriptor);
    }
}
