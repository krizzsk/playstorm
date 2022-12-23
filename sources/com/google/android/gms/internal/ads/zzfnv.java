package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfnv implements OnCompleteListener {
    public final /* synthetic */ zzfnw zza;

    public /* synthetic */ zzfnv(zzfnw zzfnw) {
        this.zza = zzfnw;
    }

    public final void onComplete(Task task) {
        zzfnw zzfnw = this.zza;
        if (task.isCanceled()) {
            zzfnw.cancel(false);
        } else if (task.isSuccessful()) {
            zzfnw.zzd(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfnw.zze(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
