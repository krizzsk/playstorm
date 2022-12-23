package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzco {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final zzfrh zzh;
    /* access modifiers changed from: private */
    public final zzfrh zzi;
    private final int zzj;
    private final int zzk;
    /* access modifiers changed from: private */
    public final zzfrh zzl;
    /* access modifiers changed from: private */
    public zzfrh zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public final HashMap zzo;
    /* access modifiers changed from: private */
    public final HashSet zzp;

    @Deprecated
    public zzco() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfrh.zzo();
        this.zzi = zzfrh.zzo();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfrh.zzo();
        this.zzm = zzfrh.zzo();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public final zzco zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzeg.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfrh.zzp(zzeg.zzM(locale));
            }
        }
        return this;
    }

    public zzco zze(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    protected zzco(zzcp zzcp) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzcp.zzl;
        this.zzf = zzcp.zzm;
        this.zzg = zzcp.zzn;
        this.zzh = zzcp.zzo;
        this.zzi = zzcp.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzcp.zzu;
        this.zzm = zzcp.zzv;
        this.zzn = zzcp.zzw;
        this.zzp = new HashSet(zzcp.zzB);
        this.zzo = new HashMap(zzcp.zzA);
    }
}
