package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzchf extends FrameLayout implements zzcgw {
    final zzcht zza;
    private final zzchr zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbin zze;
    private final long zzf;
    private final zzcgx zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.gms.internal.ads.zzcij} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: com.google.android.gms.internal.ads.zzcgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.gms.internal.ads.zzcij} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: com.google.android.gms.internal.ads.zzcij} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzchf(android.content.Context r15, com.google.android.gms.internal.ads.zzchr r16, int r17, boolean r18, com.google.android.gms.internal.ads.zzbin r19, com.google.android.gms.internal.ads.zzchq r20) {
        /*
            r14 = this;
            r0 = r14
            r8 = r15
            r14.<init>(r15)
            r7 = r16
            r0.zzb = r7
            r9 = r19
            r0.zze = r9
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r15)
            r0.zzc = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r2.<init>(r10, r10)
            r14.addView(r1, r2)
            com.google.android.gms.ads.internal.zza r1 = r16.zzm()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.ads.internal.zza r1 = r16.zzm()
            com.google.android.gms.internal.ads.zzcgy r1 = r1.zza
            com.google.android.gms.internal.ads.zzchs r11 = new com.google.android.gms.internal.ads.zzchs
            com.google.android.gms.internal.ads.zzcfo r3 = r16.zzp()
            java.lang.String r4 = r16.zzu()
            com.google.android.gms.internal.ads.zzbik r6 = r16.zzn()
            r1 = r11
            r2 = r15
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 2
            r2 = r17
            if (r2 != r1) goto L_0x0057
            com.google.android.gms.internal.ads.zzcij r9 = new com.google.android.gms.internal.ads.zzcij
            boolean r6 = com.google.android.gms.internal.ads.zzchj.zza(r16)
            r1 = r9
            r2 = r15
            r3 = r11
            r4 = r16
            r5 = r18
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x007f
        L_0x0057:
            com.google.android.gms.internal.ads.zzcgv r11 = new com.google.android.gms.internal.ads.zzcgv
            boolean r12 = com.google.android.gms.internal.ads.zzchj.zza(r16)
            com.google.android.gms.internal.ads.zzchs r13 = new com.google.android.gms.internal.ads.zzchs
            com.google.android.gms.internal.ads.zzcfo r3 = r16.zzp()
            java.lang.String r4 = r16.zzu()
            com.google.android.gms.internal.ads.zzbik r6 = r16.zzn()
            r1 = r13
            r2 = r15
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r11
            r3 = r16
            r4 = r18
            r5 = r12
            r6 = r20
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = r11
        L_0x007f:
            r0.zzg = r9
            android.view.View r1 = new android.view.View
            r1.<init>(r15)
            r0.zzd = r1
            r2 = 0
            r1.setBackgroundColor(r2)
            com.google.android.gms.internal.ads.zzcgx r1 = r0.zzg
            if (r1 == 0) goto L_0x00d6
            android.widget.FrameLayout r2 = r0.zzc
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 17
            r3.<init>(r10, r10, r4)
            r2.addView(r1, r3)
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzD
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c1
            android.widget.FrameLayout r1 = r0.zzc
            android.view.View r2 = r0.zzd
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r10, r10)
            r1.addView(r2, r3)
            android.widget.FrameLayout r1 = r0.zzc
            android.view.View r2 = r0.zzd
            r1.bringChildToFront(r2)
        L_0x00c1:
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzA
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00d6
            r14.zzm()
        L_0x00d6:
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r15)
            r0.zzq = r1
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzF
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.zzf = r1
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzC
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zzk = r1
            com.google.android.gms.internal.ads.zzbin r2 = r0.zze
            if (r2 == 0) goto L_0x0112
            r3 = 1
            if (r3 == r1) goto L_0x010b
            java.lang.String r1 = "0"
            goto L_0x010d
        L_0x010b:
            java.lang.String r1 = "1"
        L_0x010d:
            java.lang.String r3 = "spinner_used"
            r2.zzd(r3, r1)
        L_0x0112:
            com.google.android.gms.internal.ads.zzcht r1 = new com.google.android.gms.internal.ads.zzcht
            r1.<init>(r14)
            r0.zza = r1
            com.google.android.gms.internal.ads.zzcgx r1 = r0.zzg
            if (r1 == 0) goto L_0x0120
            r1.zzr(r14)
        L_0x0120:
            com.google.android.gms.internal.ads.zzcgx r1 = r0.zzg
            if (r1 != 0) goto L_0x012b
            java.lang.String r1 = "AdVideoUnderlay Error"
            java.lang.String r2 = "Allocating player failed."
            r14.zzb(r1, r2)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchf.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchr, int, boolean, com.google.android.gms.internal.ads.zzbin, com.google.android.gms.internal.ads.zzchq):void");
    }

    private final void zzI() {
        if (this.zzb.zzk() != null && this.zzi && !this.zzj) {
            this.zzb.zzk().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzJ(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzK() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcgx zzcgx = this.zzg;
            if (zzcgx != null) {
                zzcfv.zze.execute(new zzcgz(zzcgx));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzs.zza.post(new zzcha(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzs.zza.post(new zzche(this, z));
    }

    public final void zzA(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzz(i);
        }
    }

    public final void zzB(int i) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzC(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzA(i);
        }
    }

    public final void zzD(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzE(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzF(float f) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zze(f);
            zzcgx.zzn();
        }
    }

    public final void zzG(float f, float f2) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzu(f, f2);
        }
    }

    public final void zzH() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zzd(false);
            zzcgx.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zza();
        }
        zzJ("ended", new String[0]);
        zzI();
    }

    public final void zzb(String str, String str2) {
        zzJ("error", "what", str, "extra", str2);
    }

    public final void zzc(String str, String str2) {
        zzJ("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzd() {
        zzJ(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzI();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzk() != null && !this.zzi) {
            boolean z = (this.zzb.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzk().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null && this.zzm == 0) {
            zzJ("canplaythrough", "duration", String.valueOf(((float) zzcgx.zzc()) / 1000.0f), TJAdUnitConstants.String.VIDEO_WIDTH, String.valueOf(this.zzg.zze()), TJAdUnitConstants.String.VIDEO_HEIGHT, String.valueOf(this.zzg.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzs.zza.post(new zzchb(this));
    }

    public final void zzh() {
        this.zza.zzb();
        zzs.zza.post(new zzchc(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzK()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzs.zza.post(new zzchd(this));
    }

    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) zzay.zzc().zzb(zzbhy.zzE)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzay.zzc().zzb(zzbhy.zzE)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzK()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = zzt.zzA().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = zzt.zzA().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zze.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbin zzbin = this.zze;
                if (zzbin != null) {
                    zzbin.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzm() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            TextView textView = new TextView(zzcgx.getContext());
            textView.setText("AdMob - ".concat(this.zzg.zzj()));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzc.bringChildToFront(textView);
        }
    }

    public final void zzn() {
        this.zza.zza();
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzt();
        }
        zzI();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        zzJ("firstFrameRendered", new String[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z) {
        zzJ("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzq() {
        if (this.zzg != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                this.zzg.zzB(this.zzn, this.zzo);
            } else {
                zzJ("no_src", new String[0]);
            }
        }
    }

    public final void zzr() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzb.zzd(true);
            zzcgx.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            long zza2 = (long) zzcgx.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f = ((float) zza2) / 1000.0f;
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue()) {
                    zzJ("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzt.zzA().currentTimeMillis()));
                } else {
                    zzJ("timeupdate", "time", String.valueOf(f));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzt() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzo();
        }
    }

    public final void zzu() {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzp();
        }
    }

    public final void zzv(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzq(i);
        }
    }

    public final void zzw(MotionEvent motionEvent) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzx(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzw(i);
        }
    }

    public final void zzy(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzx(i);
        }
    }

    public final void zzz(int i) {
        zzcgx zzcgx = this.zzg;
        if (zzcgx != null) {
            zzcgx.zzy(i);
        }
    }
}
