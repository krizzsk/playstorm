package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdog {
    private final zzg zza;
    private final zzfby zzb;
    private final zzdnl zzc;
    private final zzdng zzd;
    private final zzdor zze;
    private final zzdoz zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbko zzi;
    private final zzdnd zzj;

    public zzdog(zzg zzg2, zzfby zzfby, zzdnl zzdnl, zzdng zzdng, zzdor zzdor, zzdoz zzdoz, Executor executor, Executor executor2, zzdnd zzdnd) {
        this.zza = zzg2;
        this.zzb = zzfby;
        this.zzi = zzfby.zzi;
        this.zzc = zzdnl;
        this.zzd = zzdng;
        this.zze = zzdor;
        this.zzf = zzdoz;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdnd;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzf2 = z ? this.zzd.zzf() : this.zzd.zzg();
        if (zzf2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf2.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf2.getParent()).removeView(zzf2);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcS)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzf2, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdng zzdng = this.zzd;
        if (zzdng.zzf() == null) {
            return;
        }
        if (zzdng.zzc() == 2 || zzdng.zzc() == 1) {
            this.zza.zzI(this.zzb.zzf, String.valueOf(zzdng.zzc()), z);
        } else if (zzdng.zzc() == 6) {
            this.zza.zzI(this.zzb.zzf, "2", z);
            this.zza.zzI(this.zzb.zzf, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdpb zzdpb) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        zzbkx zza2;
        Drawable drawable;
        IObjectWrapper iObjectWrapper = null;
        if (this.zzc.zzf() || this.zzc.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View zzg2 = zzdpb.zzg(strArr[i]);
                if (zzg2 != null && (zzg2 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg2;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context = zzdpb.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdng zzdng = this.zzd;
        if (zzdng.zze() != null) {
            view = zzdng.zze();
            zzbko zzbko = this.zzi;
            if (zzbko != null && viewGroup == null) {
                zzg(layoutParams, zzbko.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdng.zzl() instanceof zzbkj)) {
            view = null;
        } else {
            zzbkj zzbkj = (zzbkj) zzdng.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbkj.zzc());
            }
            zzbkk zzbkk = new zzbkk(context, zzbkj, layoutParams);
            zzbkk.setContentDescription((CharSequence) zzay.zzc().zzb(zzbhy.zzcQ));
            view = zzbkk;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zza3 = new zza(zzdpb.zzf().getContext());
                zza3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza3.addView(view);
                FrameLayout zzh2 = zzdpb.zzh();
                if (zzh2 != null) {
                    zzh2.addView(zza3);
                }
            }
            zzdpb.zzq(zzdpb.zzk(), view, true);
        }
        zzfrh zzfrh = zzdoc.zza;
        int size = zzfrh.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg3 = zzdpb.zzg((String) zzfrh.get(i2));
            i2++;
            if (zzg3 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg3;
                break;
            }
        }
        this.zzh.execute(new zzdod(this, viewGroup2));
        if (viewGroup2 != null) {
            if (zzh(viewGroup2, true)) {
                zzdng zzdng2 = this.zzd;
                if (zzdng2.zzr() != null) {
                    zzdng2.zzr().zzaq(new zzdof(zzdpb, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhT)).booleanValue() || !zzh(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View zzf2 = zzdpb.zzf();
                Context context2 = zzf2 != null ? zzf2.getContext() : null;
                if (context2 != null && (zza2 = this.zzj.zza()) != null) {
                    try {
                        IObjectWrapper zzi2 = zza2.zzi();
                        if (zzi2 != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi2)) != null) {
                            ImageView imageView = new ImageView(context2);
                            imageView.setImageDrawable(drawable);
                            if (zzdpb != null) {
                                iObjectWrapper = zzdpb.zzj();
                            }
                            if (iObjectWrapper != null) {
                                if (((Boolean) zzay.zzc().zzb(zzbhy.zzfe)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapper));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zze.zzj("Could not get main image drawable");
                    }
                }
            } else {
                zzdng zzdng3 = this.zzd;
                if (zzdng3.zzp() != null) {
                    zzdng3.zzp().zzaq(new zzdof(zzdpb, viewGroup2));
                }
            }
        }
    }

    public final void zzc(zzdpb zzdpb) {
        if (zzdpb != null && this.zze != null && zzdpb.zzh() != null && this.zzc.zzg()) {
            try {
                zzdpb.zzh().addView(this.zze.zza());
            } catch (zzclt e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zzd(zzdpb zzdpb) {
        if (zzdpb != null) {
            Context context = zzdpb.zzf().getContext();
            if (zzbx.zzh(context, this.zzc.zza)) {
                if (!(context instanceof Activity)) {
                    zze.zze("Activity context is needed for policy validator.");
                } else if (this.zzf != null && zzdpb.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzf.zza(zzdpb.zzh(), windowManager), zzbx.zzb());
                    } catch (zzclt e) {
                        zze.zzb("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    public final void zze(zzdpb zzdpb) {
        this.zzg.execute(new zzdoe(this, zzdpb));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
