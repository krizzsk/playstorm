package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzwq extends HandlerThread implements Handler.Callback {
    private zzde zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzws zze;

    public zzwq() {
        super("ExoPlayer:DummySurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzde zzde = this.zza;
                if (zzde != null) {
                    zzde.zzb(i2);
                    this.zze = new zzws(this, this.zza.zza(), i2 != 0, (zzwr) null);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                }
                throw null;
            } catch (RuntimeException e) {
                zzdn.zza("DummySurface", "Failed to initialize dummy surface", e);
                this.zzd = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    zzdn.zza("DummySurface", "Failed to initialize dummy surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
        } else if (i != 2) {
            return true;
        } else {
            try {
                zzde zzde2 = this.zza;
                if (zzde2 != null) {
                    zzde2.zzc();
                    quit();
                    return true;
                }
                throw null;
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
        }
    }

    public final zzws zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzde(this.zzb, (zzdd) null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzws zzws = this.zze;
                if (zzws != null) {
                    return zzws;
                }
                throw null;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        if (handler != null) {
            handler.sendEmptyMessage(2);
            return;
        }
        throw null;
    }
}
