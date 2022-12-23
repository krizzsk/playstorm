package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfnx {
    public static zzfvj zza(Task task) {
        zzfnw zzfnw = new zzfnw(task);
        task.addOnCompleteListener(zzfvq.zzb(), new zzfnv(zzfnw));
        return zzfnw;
    }
}
