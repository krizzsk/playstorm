package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzkx extends zzkz {
    private final AlarmManager zza = ((AlarmManager) this.zzs.zzau().getSystemService(NotificationCompat.CATEGORY_ALARM));
    private zzap zzb;
    private Integer zzc;

    protected zzkx(zzll zzll) {
        super(zzll);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzs.zzau().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzau = this.zzs.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    private final zzap zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkw(this, this.zzf.zzq());
        }
        return this.zzb;
    }

    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        this.zzs.zzay().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzj();
        return false;
    }

    public final void zzd(long j) {
        zzW();
        this.zzs.zzaw();
        Context zzau = this.zzs.zzau();
        if (!zzlt.zzaj(zzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlt.zzak(zzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime() + j;
        this.zzs.zzf();
        if (j < Math.max(0, ((Long) zzen.zzw.zza((Object) null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j);
        }
        this.zzs.zzaw();
        if (Build.VERSION.SDK_INT >= 24) {
            Context zzau2 = this.zzs.zzau();
            ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int zzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzbt.zza(zzau2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            this.zzs.zzf();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzen.zzr.zza((Object) null)).longValue(), j), zzh());
        }
    }
}
