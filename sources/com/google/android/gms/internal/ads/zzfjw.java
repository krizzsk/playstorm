package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfjw {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private boolean zzh;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfjv zzb(View view) {
        zzfjv zzfjv = (zzfjv) this.zzb.get(view);
        if (zzfjv != null) {
            this.zzb.remove(view);
        }
        return zzfjv;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzh = false;
    }

    public final void zzh() {
        this.zzh = true;
    }

    public final void zzi() {
        zzfja zza2 = zzfja.zza();
        if (zza2 != null) {
            for (zzfip zzfip : zza2.zzb()) {
                View zzf2 = zzfip.zzf();
                if (zzfip.zzj()) {
                    String zzh2 = zzfip.zzh();
                    if (zzf2 != null) {
                        String str = null;
                        if (!zzf2.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view = zzf2;
                            while (true) {
                                if (view == null) {
                                    this.zzd.addAll(hashSet);
                                    break;
                                }
                                String zzb2 = zzfju.zzb(view);
                                if (zzb2 != null) {
                                    str = zzb2;
                                    break;
                                }
                                hashSet.add(view);
                                ViewParent parent = view.getParent();
                                view = parent instanceof View ? (View) parent : null;
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh2);
                            this.zza.put(zzf2, zzh2);
                            for (zzfjd zzfjd : zzfip.zzi()) {
                                View view2 = (View) zzfjd.zzb().get();
                                if (view2 != null) {
                                    zzfjv zzfjv = (zzfjv) this.zzb.get(view2);
                                    if (zzfjv != null) {
                                        zzfjv.zzc(zzfip.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfjv(zzfjd, zzfip.zzh()));
                                    }
                                }
                            }
                        } else {
                            this.zzf.add(zzh2);
                            this.zzc.put(zzh2, zzf2);
                            this.zzg.put(zzh2, str);
                        }
                    } else {
                        this.zzf.add(zzh2);
                        this.zzg.put(zzh2, "noAdView");
                    }
                }
            }
        }
    }

    public final int zzj(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzh ? 2 : 3;
    }
}
