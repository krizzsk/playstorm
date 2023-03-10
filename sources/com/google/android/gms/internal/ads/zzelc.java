package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.tapjoy.TapjoyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzelc extends zzbvu {
    private final String zza;
    private final zzbvs zzb;
    private final zzcga zzc;
    private final JSONObject zzd;
    private boolean zze = false;

    public zzelc(String str, zzbvs zzbvs, zzcga zzcga) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzc = zzcga;
        this.zza = str;
        this.zzb = zzbvs;
        try {
            jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, zzbvs.zzf().toString());
            this.zzd.put("sdk_version", this.zzb.zzg().toString());
            this.zzd.put("name", this.zza);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcga zzcga) {
        synchronized (zzelc.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                zzcga.zzd(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzc() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "Signal collection timeout."
            r1.zzf(r0)     // Catch:{ RemoteException -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelc.zzc():void");
    }

    public final synchronized void zzd() {
        if (!this.zze) {
            this.zzc.zzd(this.zzd);
            this.zze = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.zzf(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.zzd     // Catch:{ JSONException -> 0x0017 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0017 }
        L_0x0017:
            com.google.android.gms.internal.ads.zzcga r3 = r2.zzc     // Catch:{ all -> 0x0023 }
            org.json.JSONObject r0 = r2.zzd     // Catch:{ all -> 0x0023 }
            r3.zzd(r0)     // Catch:{ all -> 0x0023 }
            r3 = 1
            r2.zze = r3     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelc.zze(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzf(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.zzd     // Catch:{ JSONException -> 0x000e }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x000e }
        L_0x000e:
            com.google.android.gms.internal.ads.zzcga r3 = r2.zzc     // Catch:{ all -> 0x001a }
            org.json.JSONObject r0 = r2.zzd     // Catch:{ all -> 0x001a }
            r3.zzd(r0)     // Catch:{ all -> 0x001a }
            r3 = 1
            r2.zze = r3     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelc.zzf(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.zzd     // Catch:{ JSONException -> 0x0010 }
            java.lang.String r1 = "signal_error"
            java.lang.String r3 = r3.zzb     // Catch:{ JSONException -> 0x0010 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x0010:
            com.google.android.gms.internal.ads.zzcga r3 = r2.zzc     // Catch:{ all -> 0x001c }
            org.json.JSONObject r0 = r2.zzd     // Catch:{ all -> 0x001c }
            r3.zzd(r0)     // Catch:{ all -> 0x001c }
            r3 = 1
            r2.zze = r3     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzelc.zzg(com.google.android.gms.ads.internal.client.zze):void");
    }
}
