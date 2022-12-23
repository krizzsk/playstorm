package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdbc;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfcu;
import com.google.android.gms.internal.ads.zzfig;
import com.google.android.gms.internal.ads.zzfpg;
import com.google.android.gms.internal.ads.zzfur;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfvk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzz extends zzcdy {
    protected static final List zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int zze = 0;
    /* access modifiers changed from: private */
    public final zzcfo zzA;
    /* access modifiers changed from: private */
    public String zzB;
    /* access modifiers changed from: private */
    public final String zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcnf zzf;
    /* access modifiers changed from: private */
    public Context zzg;
    private final zzaoc zzh;
    private final zzfcu zzi;
    /* access modifiers changed from: private */
    public zzdwb zzj = null;
    private final zzfvk zzk;
    private final ScheduledExecutorService zzl;
    private zzbys zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final zzc zzq;
    /* access modifiers changed from: private */
    public final zzdwl zzr;
    /* access modifiers changed from: private */
    public final zzfig zzs;
    /* access modifiers changed from: private */
    public final boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final boolean zzv;
    /* access modifiers changed from: private */
    public final boolean zzw;
    /* access modifiers changed from: private */
    public final String zzx;
    /* access modifiers changed from: private */
    public final String zzy;
    /* access modifiers changed from: private */
    public final AtomicInteger zzz = new AtomicInteger(0);

    public zzz(zzcnf zzcnf, Context context, zzaoc zzaoc, zzfcu zzfcu, zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, zzdwl zzdwl, zzfig zzfig, zzcfo zzcfo) {
        List list;
        this.zzf = zzcnf;
        this.zzg = context;
        this.zzh = zzaoc;
        this.zzi = zzfcu;
        this.zzk = zzfvk;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcnf.zzm();
        this.zzr = zzdwl;
        this.zzs = zzfig;
        this.zzA = zzcfo;
        this.zzt = ((Boolean) zzay.zzc().zzb(zzbhy.zzgi)).booleanValue();
        this.zzu = ((Boolean) zzay.zzc().zzb(zzbhy.zzgh)).booleanValue();
        this.zzv = ((Boolean) zzay.zzc().zzb(zzbhy.zzgj)).booleanValue();
        this.zzw = ((Boolean) zzay.zzc().zzb(zzbhy.zzgl)).booleanValue();
        this.zzx = (String) zzay.zzc().zzb(zzbhy.zzgk);
        this.zzy = (String) zzay.zzc().zzb(zzbhy.zzgm);
        this.zzC = (String) zzay.zzc().zzb(zzbhy.zzgn);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgo)).booleanValue()) {
            this.zzD = zzW((String) zzay.zzc().zzb(zzbhy.zzgp));
            this.zzE = zzW((String) zzay.zzc().zzb(zzbhy.zzgq));
            this.zzF = zzW((String) zzay.zzc().zzb(zzbhy.zzgr));
            list = zzW((String) zzay.zzc().zzb(zzbhy.zzgs));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    static /* bridge */ /* synthetic */ void zzE(zzz zzz2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzz2.zzM((Uri) it.next())) {
                zzz2.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzF(zzz zzz2, String str, String str2, zzdwb zzdwb) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfT)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzfZ)).booleanValue()) {
                zzcfv.zza.execute(new zzi(zzz2, str, str2, zzdwb));
            } else {
                zzz2.zzq.zzd(str, str2, zzdwb);
            }
        }
    }

    static final /* synthetic */ Uri zzO(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzV(uri, "nas", str) : uri;
    }

    private final zzh zzP(Context context, String str, String str2, zzq zzq2, zzl zzl2) {
        zzg zzn2 = this.zzf.zzn();
        zzdbc zzdbc = new zzdbc();
        zzdbc.zzc(context);
        zzfbw zzfbw = new zzfbw();
        if (str == null) {
            str = "adUnitId";
        }
        zzfbw.zzs(str);
        if (zzl2 == null) {
            zzl2 = new zzm().zza();
        }
        zzfbw.zzE(zzl2);
        if (zzq2 == null) {
            zzq2 = new zzq();
        }
        zzfbw.zzr(zzq2);
        zzfbw.zzx(true);
        zzdbc.zzf(zzfbw.zzG());
        zzn2.zza(zzdbc.zzg());
        zzab zzab = new zzab();
        zzab.zza(str2);
        zzn2.zzb(new zzad(zzab, (zzac) null));
        new zzdhc();
        zzh zzc2 = zzn2.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final zzfvj zzQ(String str) {
        zzdsd[] zzdsdArr = new zzdsd[1];
        zzfvj zzn2 = zzfva.zzn(this.zzi.zza(), new zzj(this, zzdsdArr, str), this.zzk);
        zzn2.zzc(new zzk(this, zzdsdArr), this.zzk);
        return zzfva.zzf(zzfva.zzm((zzfur) zzfva.zzo(zzfur.zzv(zzn2), (long) ((Integer) zzay.zzc().zzb(zzbhy.zzgv)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzt.zza, this.zzk), Exception.class, zzu.zza, this.zzk);
    }

    private final void zzR(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj, boolean z) {
        zzfvj zzfvj;
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            zze.zzj("The updating URL feature is not enabled.");
            try {
                zzbyj.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
            }
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (zzM((Uri) it.next())) {
                    i++;
                }
            }
            if (i > 1) {
                zze.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!zzM(uri)) {
                    zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    zzfvj = zzfva.zzi(uri);
                } else {
                    zzfvj = this.zzk.zzb(new zzo(this, uri, iObjectWrapper));
                    if (zzU()) {
                        zzfvj = zzfva.zzn(zzfvj, new zzp(this), this.zzk);
                    } else {
                        zze.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(zzfvj);
            }
            zzfva.zzr(zzfva.zze(arrayList), new zzx(this, zzbyj, z), this.zzf.zzA());
        }
    }

    private final void zzS(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj, boolean z) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            try {
                zzbyj.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzcfi.zzh("", e);
            }
        } else {
            zzfvj zzb2 = this.zzk.zzb(new zzq(this, list, iObjectWrapper));
            if (zzU()) {
                zzb2 = zzfva.zzn(zzb2, new zzr(this), this.zzk);
            } else {
                zze.zzi("Asset view map is empty.");
            }
            zzfva.zzr(zzb2, new zzw(this, zzbyj, z), this.zzf.zzA());
        }
    }

    private static boolean zzT(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzU() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzbys r0 = r1.zzm
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzz.zzU():boolean");
    }

    /* access modifiers changed from: private */
    public static final Uri zzV(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private static final List zzW(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfpg.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzA(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzN(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzV(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh2 = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zzh2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzN(uri)) {
                    zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzV(uri, "ms", zzh2));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(zzdsd[] zzdsdArr) {
        zzdsd zzdsd = zzdsdArr[0];
        if (zzdsd != null) {
            this.zzi.zzb(zzfva.zzi(zzdsd));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(String str, String str2, zzdwb zzdwb) {
        this.zzq.zzd(str, str2, zzdwb);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzM(Uri uri) {
        return zzT(uri, this.zzD, this.zzE);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzN(Uri uri) {
        return zzT(uri, this.zzF, this.zzG);
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzced zzced, zzcdw zzcdw) {
        zzfvj zzfvj;
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzio)).booleanValue()) {
            zzfvj = zzfva.zzl(new zzn(this, zzced), zzcfv.zza);
        } else {
            zzfvj = zzP(this.zzg, zzced.zza, zzced.zzb, zzced.zzc, zzced.zzd).zzb();
        }
        zzfva.zzr(zzfvj, new zzv(this, zzcdw, zzt.zzA().currentTimeMillis()), this.zzf.zzA());
    }

    public final void zzf(zzbys zzbys) {
        this.zzm = zzbys;
        this.zzi.zzc(1);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) {
        zzR(list, iObjectWrapper, zzbyj, true);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) {
        zzS(list, iObjectWrapper, zzbyj, true);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        zzfvj zzfvj;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhK)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zze.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhL)).booleanValue()) {
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzio)).booleanValue()) {
                    zzfvj = zzfva.zzl(new zzs(this), zzcfv.zza);
                } else {
                    zzfvj = zzP(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzb();
                }
                zzfva.zzr(zzfvj, new zzy(this), this.zzf.zzA());
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zze.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zze.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
            }
        }
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgu)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbys zzbys = this.zzm;
            if (zzbys == null) {
                view = null;
            } else {
                view = zzbys.zza;
            }
            this.zzn = zzbx.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzn.x, (float) this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) {
        zzR(list, iObjectWrapper, zzbyj, false);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) {
        zzS(list, iObjectWrapper, zzbyj, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } catch (zzaod e) {
            zzcfi.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzs(zzced zzced) throws Exception {
        return zzP(this.zzg, zzced.zza, zzced.zzb, zzced.zzc, zzced.zzd).zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzt() throws Exception {
        return zzP(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzu(zzdsd[] zzdsdArr, String str, zzdsd zzdsd) throws Exception {
        zzdsdArr[0] = zzdsd;
        Context context = this.zzg;
        zzbys zzbys = this.zzm;
        Map map = zzbys.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzbys.zza);
        JSONObject zzg2 = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf2 = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg2);
        jSONObject.put("scroll_view_signal", zzf2);
        jSONObject.put("lock_screen_signal", zze2);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbx.zzc((String) null, this.zzg, this.zzo, this.zzn));
        }
        return zzdsd.zzd(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzv(ArrayList arrayList) throws Exception {
        return zzfva.zzm(zzQ("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzm(this, arrayList), this.zzk);
    }
}
