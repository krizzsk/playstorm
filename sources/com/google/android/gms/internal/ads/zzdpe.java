package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdpe implements zzdno {
    private final zzbuo zza;
    private final zzdck zzb;
    private final zzdbq zzc;
    private final zzdjd zzd;
    private final Context zze;
    private final zzfbg zzf;
    private final zzcfo zzg;
    private final zzfby zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbuk zzl;
    private final zzbul zzm;

    public zzdpe(zzbuk zzbuk, zzbul zzbul, zzbuo zzbuo, zzdck zzdck, zzdbq zzdbq, zzdjd zzdjd, Context context, zzfbg zzfbg, zzcfo zzcfo, zzfby zzfby, byte[] bArr) {
        this.zzl = zzbuk;
        this.zzm = zzbul;
        this.zza = zzbuo;
        this.zzb = zzdck;
        this.zzc = zzdbq;
        this.zzd = zzdjd;
        this.zze = context;
        this.zzf = zzfbg;
        this.zzg = zzcfo;
        this.zzh = zzfby;
    }

    private final void zza(View view) {
        try {
            zzbuo zzbuo = this.zza;
            if (zzbuo == null || zzbuo.zzA()) {
                zzbuk zzbuk = this.zzl;
                if (zzbuk == null || zzbuk.zzx()) {
                    zzbul zzbul = this.zzm;
                    if (zzbul != null && !zzbul.zzv()) {
                        this.zzm.zzq(ObjectWrapper.wrap(view));
                        this.zzc.onAdClicked();
                        if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                            this.zzd.zzq();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            this.zza.zzw(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                this.zzd.zzq();
            }
        } catch (RemoteException e) {
            zze.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzb(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final boolean zzA(Bundle bundle) {
        return false;
    }

    public final JSONObject zzd(View view, Map map, Map map2) {
        return null;
    }

    public final JSONObject zze(View view, Map map, Map map2) {
        return null;
    }

    public final void zzf() {
        throw null;
    }

    public final void zzg() {
    }

    public final void zzh() {
    }

    public final void zzi(zzcu zzcu) {
        zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzj(View view, View view2, Map map, Map map2, boolean z) {
        if (!this.zzj || !this.zzf.zzM) {
            zza(view);
        }
    }

    public final void zzk(String str) {
    }

    public final void zzl(Bundle bundle) {
    }

    public final void zzn(View view, Map map, Map map2, boolean z) {
        if (!this.zzj) {
            zze.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            zze.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zza(view);
        }
    }

    public final void zzo() {
    }

    public final void zzp(View view, Map map, Map map2) {
        try {
            if (!this.zzi) {
                this.zzi = zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbuo zzbuo = this.zza;
                if (zzbuo != null) {
                    if (!zzbuo.zzB()) {
                        this.zza.zzx();
                        this.zzb.zza();
                        return;
                    }
                }
                zzbuk zzbuk = this.zzl;
                if (zzbuk != null) {
                    if (!zzbuk.zzy()) {
                        this.zzl.zzt();
                        this.zzb.zza();
                        return;
                    }
                }
                zzbul zzbul = this.zzm;
                if (zzbul != null && !zzbul.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            zze.zzk("Failed to call recordImpression", e);
        }
    }

    public final void zzq() {
    }

    public final void zzr(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzs(Bundle bundle) {
    }

    public final void zzt(View view) {
    }

    public final void zzu() {
        this.zzj = true;
    }

    public final void zzv(zzcq zzcq) {
        zze.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzw(zzbmu zzbmu) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzx(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzfbg r12 = r8.zzf     // Catch:{ RemoteException -> 0x0122 }
            org.json.JSONObject r12 = r12.zzal     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbhq r13 = com.google.android.gms.internal.ads.zzbhy.zzbq     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Object r13 = r0.zzb(r13)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0122 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0122 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00de
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0122 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00de
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0122 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0122 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0122 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0122 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0122 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0122 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0122 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0122 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0122 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0122 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = r1
            goto L_0x00de
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0122 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbhq r6 = com.google.android.gms.internal.ads.zzbhy.zzbr     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ RemoteException -> 0x0122 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0122 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0122 }
            if (r6 == 0) goto L_0x00b1
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzbuo r2 = r8.zza     // Catch:{ RemoteException -> 0x0122 }
            r5 = 0
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzn()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x0091:
            com.google.android.gms.internal.ads.zzbuk r2 = r8.zzl     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x009a
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzk()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x009a:
            com.google.android.gms.internal.ads.zzbul r2 = r8.zzm     // Catch:{ RemoteException -> 0x0122 }
            if (r2 == 0) goto L_0x00a3
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x00a3:
            r2 = r5
        L_0x00a4:
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{  }
        L_0x00aa:
            if (r5 != 0) goto L_0x00ad
            goto L_0x005f
        L_0x00ad:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0122 }
        L_0x00b1:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzbu.zzc(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.zze     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c6:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c6 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x00c6
            goto L_0x0045
        L_0x00de:
            r8.zzk = r0     // Catch:{ RemoteException -> 0x0122 }
            java.util.HashMap r10 = zzb(r10)     // Catch:{ RemoteException -> 0x0122 }
            java.util.HashMap r11 = zzb(r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbuo r12 = r8.zza     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x00f8
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.zzy(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            return
        L_0x00f8:
            com.google.android.gms.internal.ads.zzbuk r12 = r8.zzl     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x010d
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.zzv(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbuk r10 = r8.zzl     // Catch:{ RemoteException -> 0x0122 }
            r10.zzu(r9)     // Catch:{ RemoteException -> 0x0122 }
            return
        L_0x010d:
            com.google.android.gms.internal.ads.zzbul r12 = r8.zzm     // Catch:{ RemoteException -> 0x0122 }
            if (r12 == 0) goto L_0x0121
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0122 }
            r12.zzt(r9, r10, r11)     // Catch:{ RemoteException -> 0x0122 }
            com.google.android.gms.internal.ads.zzbul r10 = r8.zzm     // Catch:{ RemoteException -> 0x0122 }
            r10.zzs(r9)     // Catch:{ RemoteException -> 0x0122 }
        L_0x0121:
            return
        L_0x0122:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.ads.internal.util.zze.zzk(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpe.zzx(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    public final void zzy(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbuo zzbuo = this.zza;
            if (zzbuo != null) {
                zzbuo.zzz(wrap);
                return;
            }
            zzbuk zzbuk = this.zzl;
            if (zzbuk != null) {
                zzbuk.zzw(wrap);
                return;
            }
            zzbul zzbul = this.zzm;
            if (zzbul != null) {
                zzbul.zzu(wrap);
            }
        } catch (RemoteException e) {
            zze.zzk("Failed to call untrackView", e);
        }
    }

    public final boolean zzz() {
        return this.zzf.zzM;
    }
}
