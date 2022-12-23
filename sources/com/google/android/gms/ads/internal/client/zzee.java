package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzee {
    private static zzee zza;
    /* access modifiers changed from: private */
    public final ArrayList zzb = new ArrayList();
    private final Object zzc = new Object();
    private zzcm zzd;
    /* access modifiers changed from: private */
    public boolean zze = false;
    /* access modifiers changed from: private */
    public boolean zzf = false;
    /* access modifiers changed from: private */
    @Nullable
    public OnAdInspectorClosedListener zzg = null;
    private RequestConfiguration zzh = new RequestConfiguration.Builder().build();
    private InitializationStatus zzi;

    private zzee() {
    }

    /* access modifiers changed from: private */
    public static final InitializationStatus zzA(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqf zzbqf = (zzbqf) it.next();
            hashMap.put(zzbqf.zza, new zzbqn(zzbqf.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqf.zzd, zzbqf.zzc));
        }
        return new zzbqo(hashMap);
    }

    public static zzee zzf() {
        zzee zzee;
        synchronized (zzee.class) {
            if (zza == null) {
                zza = new zzee();
            }
            zzee = zza;
        }
        return zzee;
    }

    private final void zzx(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            zzbts.zza().zzb(context, (String) null);
            this.zzd.zzj();
            this.zzd.zzk((String) null, ObjectWrapper.wrap(null));
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzeq)).booleanValue() && !zzg().endsWith("0")) {
                zzcfi.zzg("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                this.zzi = new zzdw(this);
                if (onInitializationCompleteListener != null) {
                    zzcfb.zza.post(new zzdv(this, onInitializationCompleteListener));
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzy(Context context) {
        if (this.zzd == null) {
            this.zzd = (zzcm) new zzao(zzaw.zza(), context).zzd(context, false);
        }
    }

    private final void zzz(RequestConfiguration requestConfiguration) {
        try {
            this.zzd.zzs(new zzfa(requestConfiguration));
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzh;
    }

    public final InitializationStatus zze() {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                InitializationStatus initializationStatus = this.zzi;
                if (initializationStatus != null) {
                    return initializationStatus;
                }
                InitializationStatus zzA = zzA(this.zzd.zzg());
                return zzA;
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to get Initialization status.");
                return new zzdw(this);
            }
        }
    }

    @Deprecated
    public final String zzg() {
        String zzc2;
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc2 = zzfpg.zzc(this.zzd.zzf());
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return zzc2;
    }

    public final void zzk(Context context) {
        synchronized (this.zzc) {
            zzy(context);
            try {
                this.zzd.zzi();
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl(android.content.Context r4, @javax.annotation.Nullable java.lang.String r5, @javax.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.zzc
            monitor-enter(r5)
            boolean r0 = r3.zze     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0014
            if (r6 == 0) goto L_0x0012
            com.google.android.gms.ads.internal.client.zzee r4 = zzf()     // Catch:{ all -> 0x00da }
            java.util.ArrayList r4 = r4.zzb     // Catch:{ all -> 0x00da }
            r4.add(r6)     // Catch:{ all -> 0x00da }
        L_0x0012:
            monitor-exit(r5)     // Catch:{ all -> 0x00da }
            return
        L_0x0014:
            boolean r0 = r3.zzf     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0021
            com.google.android.gms.ads.initialization.InitializationStatus r4 = r3.zze()     // Catch:{ all -> 0x00da }
            r6.onInitializationComplete(r4)     // Catch:{ all -> 0x00da }
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x00da }
            return
        L_0x0023:
            r0 = 1
            r3.zze = r0     // Catch:{ all -> 0x00da }
            if (r6 == 0) goto L_0x0031
            com.google.android.gms.ads.internal.client.zzee r0 = zzf()     // Catch:{ all -> 0x00da }
            java.util.ArrayList r0 = r0.zzb     // Catch:{ all -> 0x00da }
            r0.add(r6)     // Catch:{ all -> 0x00da }
        L_0x0031:
            if (r4 == 0) goto L_0x00d2
            r0 = 0
            r3.zzy(r4)     // Catch:{ RemoteException -> 0x0064 }
            if (r6 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.client.zzcm r1 = r3.zzd     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.ads.internal.client.zzed r2 = new com.google.android.gms.ads.internal.client.zzed     // Catch:{ RemoteException -> 0x0064 }
            r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x0064 }
            r1.zzr(r2)     // Catch:{ RemoteException -> 0x0064 }
        L_0x0043:
            com.google.android.gms.ads.internal.client.zzcm r1 = r3.zzd     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.internal.ads.zzbtw r2 = new com.google.android.gms.internal.ads.zzbtw     // Catch:{ RemoteException -> 0x0064 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0064 }
            r1.zzn(r2)     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.ads.RequestConfiguration r1 = r3.zzh     // Catch:{ RemoteException -> 0x0064 }
            int r1 = r1.getTagForChildDirectedTreatment()     // Catch:{ RemoteException -> 0x0064 }
            r2 = -1
            if (r1 != r2) goto L_0x005e
            com.google.android.gms.ads.RequestConfiguration r1 = r3.zzh     // Catch:{ RemoteException -> 0x0064 }
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ RemoteException -> 0x0064 }
            if (r1 == r2) goto L_0x006a
        L_0x005e:
            com.google.android.gms.ads.RequestConfiguration r1 = r3.zzh     // Catch:{ RemoteException -> 0x0064 }
            r3.zzz(r1)     // Catch:{ RemoteException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r1 = move-exception
            java.lang.String r2 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.zzcfi.zzk(r2, r1)     // Catch:{ all -> 0x00da }
        L_0x006a:
            com.google.android.gms.internal.ads.zzbhy.zzc(r4)     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.internal.ads.zzbjm.zza     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r1.zze()     // Catch:{ all -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzip     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "Initializing on bg thread"
            com.google.android.gms.internal.ads.zzcfi.zze(r1)     // Catch:{ all -> 0x00da }
            java.util.concurrent.ThreadPoolExecutor r1 = com.google.android.gms.internal.ads.zzcex.zza     // Catch:{ all -> 0x00da }
            com.google.android.gms.ads.internal.client.zzdx r2 = new com.google.android.gms.ads.internal.client.zzdx     // Catch:{ all -> 0x00da }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x00da }
            r1.execute(r2)     // Catch:{ all -> 0x00da }
            goto L_0x00d0
        L_0x009d:
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.internal.ads.zzbjm.zzb     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r1.zze()     // Catch:{ all -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzip     // Catch:{ all -> 0x00da }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x00da }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00da }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x00c8
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.internal.ads.zzcex.zzb     // Catch:{ all -> 0x00da }
            com.google.android.gms.ads.internal.client.zzdy r2 = new com.google.android.gms.ads.internal.client.zzdy     // Catch:{ all -> 0x00da }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x00da }
            r1.execute(r2)     // Catch:{ all -> 0x00da }
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r1 = "Initializing on calling thread"
            com.google.android.gms.internal.ads.zzcfi.zze(r1)     // Catch:{ all -> 0x00da }
            r3.zzx(r4, r0, r6)     // Catch:{ all -> 0x00da }
        L_0x00d0:
            monitor-exit(r5)     // Catch:{ all -> 0x00da }
            return
        L_0x00d2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "Context cannot be null."
            r4.<init>(r6)     // Catch:{ all -> 0x00da }
            throw r4     // Catch:{ all -> 0x00da }
        L_0x00da:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00da }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzee.zzl(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            zzx(context, (String) null, onInitializationCompleteListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            zzx(context, (String) null, onInitializationCompleteListener);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzc) {
            zzy(context);
            zzf().zzg = onAdInspectorClosedListener;
            try {
                this.zzd.zzl(new zzeb((zzea) null));
            } catch (RemoteException unused) {
                zzcfi.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzd.zzm(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzc) {
            try {
                this.zzd.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(WebView webView) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        synchronized (this.zzc) {
            if (webView == null) {
                zzcfi.zzg("The webview to be registered cannot be null.");
                return;
            }
            zzcdz zza2 = zzbyl.zza(webView.getContext());
            if (zza2 == null) {
                zzcfi.zzj("Internal error, query info generator is null.");
                return;
            }
            try {
                zza2.zzi(ObjectWrapper.wrap(webView));
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.zzc) {
            Preconditions.checkState(this.zzd != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzd.zzo(z);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzc) {
            if (this.zzd == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzd.zzp(f);
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to set app volume.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzv(com.google.android.gms.ads.RequestConfiguration r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r4.zzc
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.zzh     // Catch:{ all -> 0x0030 }
            r4.zzh = r5     // Catch:{ all -> 0x0030 }
            com.google.android.gms.ads.internal.client.zzcm r2 = r4.zzd     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.zzz(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzee.zzv(com.google.android.gms.ads.RequestConfiguration):void");
    }

    public final float zza() {
        float f;
        synchronized (this.zzc) {
            zzcm zzcm = this.zzd;
            f = 1.0f;
            if (zzcm == null) {
                return 1.0f;
            }
            try {
                f = zzcm.zze();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get app volume.", e);
            }
        }
        return f;
    }

    public final boolean zzw() {
        boolean z;
        synchronized (this.zzc) {
            zzcm zzcm = this.zzd;
            z = false;
            if (zzcm == null) {
                return false;
            }
            try {
                z = zzcm.zzt();
            } catch (RemoteException e) {
                zzcfi.zzh("Unable to get app mute state.", e);
            }
        }
        return z;
    }
}
