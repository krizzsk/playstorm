package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdza implements zzdzi, zzdyl {
    private final zzdzh zza;
    private final zzdzj zzb;
    private final zzdym zzc;
    private final zzdyv zzd;
    private final zzdyk zze;
    private final String zzf;
    private final Map zzg;
    private String zzh = JsonUtils.EMPTY_JSON;
    private String zzi = "";
    private long zzj = Long.MAX_VALUE;
    private zzdyw zzk = zzdyw.NONE;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private zzdyz zzo = zzdyz.UNKNOWN;

    zzdza(zzdzh zzdzh, zzdzj zzdzj, zzdym zzdym, Context context, zzcfo zzcfo, zzdyv zzdyv) {
        this.zza = zzdzh;
        this.zzb = zzdzj;
        this.zzc = zzdym;
        this.zzg = new HashMap();
        this.zze = new zzdyk(context);
        this.zzf = zzcfo.zza;
        this.zzd = zzdyv;
        zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzo() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdyo zzdyo : (List) entry.getValue()) {
                if (zzdyo.zzd()) {
                    jSONArray.put(zzdyo.zzc());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzp() {
        this.zzn = true;
        this.zzd.zzc();
        this.zza.zzg(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        zzv(zzt.zzo().zzh().zzo());
    }

    private final void zzq() {
        zzt.zzo().zzh().zzG(zzc());
    }

    private final synchronized void zzr(zzdyw zzdyw, boolean z) {
        if (this.zzk != zzdyw) {
            if (zzm()) {
                zzt();
            }
            this.zzk = zzdyw;
            if (zzm()) {
                zzu();
            }
            if (z) {
                zzq();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzs(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzl     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.zzl = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbhq r2 = com.google.android.gms.internal.ads.zzbhy.zzhG     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.zzb(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.util.zzaw r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.zzl()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.zzu()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.zzm()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.zzt()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.zzq()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdza.zzs(boolean, boolean):void");
    }

    private final synchronized void zzt() {
        zzdyw zzdyw = zzdyw.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else if (ordinal == 2) {
            this.zzc.zza();
        }
    }

    private final synchronized void zzu() {
        zzdyw zzdyw = zzdyw.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal == 2) {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzv(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                zzs(jSONObject.optBoolean("isTestMode", false), false);
                zzr(zzdyw.zza(jSONObject.optString("gesture", "NONE")), false);
                this.zzh = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    public final zzdyw zza() {
        return this.zzk;
    }

    public final synchronized String zzb() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
            if (zzm()) {
                if (this.zzj < zzt.zzA().currentTimeMillis() / 1000) {
                    this.zzh = JsonUtils.EMPTY_JSON;
                    this.zzj = Long.MAX_VALUE;
                    return "";
                } else if (this.zzh.equals(JsonUtils.EMPTY_JSON)) {
                    return "";
                } else {
                    return this.zzh;
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zzc() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.zzl     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.zzdyw r2 = r7.zzk     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.zzj     // Catch:{ JSONException -> 0x0033 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.currentTimeMillis()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.zzh     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.zzj     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdza.zzc():java.lang.String");
    }

    public final synchronized JSONObject zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(TapjoyConstants.TJC_PLATFORM, "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zza());
            if (this.zzj < zzt.zzA().currentTimeMillis() / 1000) {
                this.zzh = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzo());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc2 = zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc2)) {
                jSONObject.put("cld", new JSONObject(zzc2));
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhH)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String str = this.zzi;
                zze.zze("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhG)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e) {
            zzt.zzo().zzs(e, "Inspector.toJson");
            zze.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(java.lang.String r4, com.google.android.gms.internal.ads.zzdyo r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzhr     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.zzm()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x001a
            goto L_0x005a
        L_0x001a:
            int r0 = r3.zzm     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzht     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x005c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x005c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x005c }
            if (r0 < r1) goto L_0x0035
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.ads.internal.util.zze.zzj(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x0035:
            java.util.Map r0 = r3.zzg     // Catch:{ all -> 0x005c }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0047
            java.util.Map r0 = r3.zzg     // Catch:{ all -> 0x005c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            r0.put(r4, r1)     // Catch:{ all -> 0x005c }
        L_0x0047:
            int r0 = r3.zzm     // Catch:{ all -> 0x005c }
            int r0 = r0 + 1
            r3.zzm = r0     // Catch:{ all -> 0x005c }
            java.util.Map r0 = r3.zzg     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x005c }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x005c }
            r4.add(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)
            return
        L_0x005a:
            monitor-exit(r3)
            return
        L_0x005c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdza.zze(java.lang.String, com.google.android.gms.internal.ads.zzdyo):void");
    }

    public final void zzf() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhG)).booleanValue() || !zzt.zzo().zzh().zzO()) {
                String zzo2 = zzt.zzo().zzh().zzo();
                if (!TextUtils.isEmpty(zzo2)) {
                    try {
                        if (new JSONObject(zzo2).optBoolean("isTestMode", false)) {
                            zzp();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                zzp();
            }
        }
    }

    public final synchronized void zzg(zzcy zzcy, zzdyz zzdyz) {
        if (!zzm()) {
            try {
                zzcy.zze(zzfcx.zzd(18, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            } catch (RemoteException unused) {
                zze.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
                try {
                    zzcy.zze(zzfcx.zzd(1, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                } catch (RemoteException unused2) {
                    zze.zzj("Ad inspector had an internal error.");
                }
            } else {
                this.zzo = zzdyz;
                this.zza.zzi(zzcy, new zzbom(this));
            }
        }
    }

    public final synchronized void zzh(String str, long j) {
        this.zzh = str;
        this.zzj = j;
        zzq();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzn
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.zzp()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.zzl
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.zzu()
            return
        L_0x0015:
            boolean r2 = r1.zzm()
            if (r2 != 0) goto L_0x001e
            r1.zzt()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdza.zzi(boolean):void");
    }

    public final void zzj(zzdyw zzdyw) {
        zzr(zzdyw, true);
    }

    public final synchronized void zzk(String str) {
        this.zzi = str;
    }

    public final void zzl(boolean z) {
        if (!this.zzn && z) {
            zzp();
        }
        zzs(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.zzl || com.google.android.gms.ads.internal.zzt.zzs().zzl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzm() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzhG     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.zzl     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.ads.internal.util.zzaw r0 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.zzl()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.zzl     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdza.zzm():boolean");
    }

    public final synchronized boolean zzn() {
        return this.zzl;
    }
}
