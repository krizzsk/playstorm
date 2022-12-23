package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.smaato.sdk.core.SmaatoSdk;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcmb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcli {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbkn zzC;
    private zzbkl zzD;
    private zzbbz zzE;
    private int zzF;
    /* access modifiers changed from: private */
    public int zzG;
    private zzbik zzH;
    private final zzbik zzI;
    private zzbik zzJ;
    private final zzbil zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private zzl zzO;
    private boolean zzP;
    private final zzci zzQ;
    private int zzR = -1;
    private int zzS = -1;
    private int zzT = -1;
    private int zzU = -1;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdl zzX;
    private final zzcmw zzb;
    private final zzaoc zzc;
    private final zzbix zzd;
    private final zzcfo zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbg zzj;
    private zzfbj zzk;
    private boolean zzl = false;
    private boolean zzm = false;
    private zzclp zzn;
    private zzl zzo;
    private IObjectWrapper zzp;
    private zzcmx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx = true;
    private final String zzy = "";
    private zzcme zzz;

    protected zzcmb(zzcmw zzcmw, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbix zzbix, zzcfo zzcfo, zzbin zzbin, com.google.android.gms.ads.internal.zzl zzl2, zza zza2, zzbdl zzbdl, zzfbg zzfbg, zzfbj zzfbj) {
        super(zzcmw);
        zzfbj zzfbj2;
        this.zzb = zzcmw;
        this.zzq = zzcmx;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaoc;
        this.zzd = zzbix;
        this.zze = zzcfo;
        this.zzf = zzl2;
        this.zzg = zza2;
        this.zzW = (WindowManager) getContext().getSystemService("window");
        zzt.zzp();
        DisplayMetrics zzr2 = zzs.zzr(this.zzW);
        this.zzh = zzr2;
        this.zzi = zzr2.density;
        this.zzX = zzbdl;
        this.zzj = zzfbg;
        this.zzk = zzfbj;
        this.zzQ = new zzci(this.zzb.zza(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zze.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzt.zzp().zzc(zzcmw, zzcfo.zza));
        zzt.zzp();
        Context context = getContext();
        zzcb.zza(context, new zzm(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaU();
        addJavascriptInterface(new zzcmi(this, new zzcmh(this), (byte[]) null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbil zzbil = new zzbil(new zzbin(true, "make_wv", this.zzr));
        this.zzK = zzbil;
        zzbil.zza().zzc((zzbin) null);
        if (!(!((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || (zzfbj2 = this.zzk) == null || zzfbj2.zzb == null)) {
            this.zzK.zza().zzd("gqi", this.zzk.zzb);
        }
        this.zzK.zza();
        zzbik zzf2 = zzbin.zzf();
        this.zzI = zzf2;
        this.zzK.zzb("native:view_create", zzf2);
        this.zzJ = null;
        this.zzH = null;
        zzce.zza().zzb(zzcmw);
        zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        zzfbg zzfbg = this.zzj;
        if (zzfbg != null) {
            if (zzfbg.zzao) {
                zze.zze("Disabling hardware acceleration on an overlay.");
                zzaW();
                return;
            }
        }
        if (!this.zzu) {
            if (!this.zzq.zzi()) {
                zze.zze("Enabling hardware acceleration on an AdView.");
                zzaY();
                return;
            }
        }
        zze.zze("Enabling hardware acceleration on an overlay.");
        zzaY();
    }

    private final synchronized void zzaV() {
        if (!this.zzP) {
            this.zzP = true;
            zzt.zzo().zzp();
        }
    }

    private final synchronized void zzaW() {
        if (!this.zzv) {
            setLayerType(1, (Paint) null);
        }
        this.zzv = true;
    }

    private final void zzaX(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaY() {
        if (this.zzv) {
            setLayerType(0, (Paint) null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaZ(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.zzo().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
            zze.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzba() {
        zzbif.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzbb() {
        Map map = this.zzV;
        if (map != null) {
            for (zzcju release : map.values()) {
                release.release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbil zzbil = this.zzK;
        if (zzbil != null) {
            zzbin zza2 = zzbil.zza();
            zzbid zzf2 = zzt.zzo().zzf();
            if (zzf2 != null) {
                zzf2.zzf(zza2);
            }
        }
    }

    private final synchronized void zzbd() {
        Boolean zzk2 = zzt.zzo().zzk();
        this.zzw = zzk2;
        if (zzk2 == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback) null);
                zzaS(true);
            } catch (IllegalStateException unused) {
                zzaS(false);
            }
        }
    }

    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zza();
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzy();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.zzt) {
            zzt.zzy().zzd(this);
            zzbb();
            this.zzt = true;
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzig)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                zzaZ("about:blank");
                return;
            }
            zze.zza("Destroying the WebView immediately...");
            zzW();
        }
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            zzcfi.zzl("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzy();
                    zzt.zzy().zzd(this);
                    zzbb();
                    zzaV();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaB()) {
            super.loadData(str, str2, str3);
        } else {
            zze.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaB()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zze.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!zzaB()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzt.zzo().zzt(th, "AdWebViewImpl.loadUrl");
                zze.zzk("Could not call loadUrl. ", th);
            }
        } else {
            zze.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void onAdClicked() {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzQ.zzc();
        }
        boolean z = this.zzA;
        zzclp zzclp = this.zzn;
        if (zzclp != null && zzclp.zzK()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaT();
            z = true;
        }
        zzaX(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        zzclp zzclp;
        synchronized (this) {
            if (!zzaB()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzclp = this.zzn) != null && zzclp.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaX(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzp();
            zzs.zzI(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zze.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!zzaB()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean zzaT = zzaT();
        zzl zzN2 = zzN();
        if (zzN2 != null && zzaT) {
            zzN2.zzm();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b8 A[SYNTHETIC, Splitter:B:111:0x01b8] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzaB()     // Catch:{ all -> 0x01de }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r8.zzu     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01d9
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01de }
            boolean r0 = r0.zzf()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d9
        L_0x0021:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01de }
            boolean r0 = r0.zzh()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01de }
            boolean r0 = r0.zzj()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzcS     // Catch:{ all -> 0x01de }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x01de }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01de }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzcme r0 = r8.zzs()     // Catch:{ all -> 0x01de }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.zze()     // Catch:{ all -> 0x01de }
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01de }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01de }
            float r2 = (float) r10     // Catch:{ all -> 0x01de }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01de }
            float r3 = (float) r9     // Catch:{ all -> 0x01de }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01de }
            if (r10 != 0) goto L_0x007c
            if (r3 == 0) goto L_0x007b
            float r10 = (float) r3     // Catch:{ all -> 0x01de }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01de }
            r1 = r9
            r10 = r3
            goto L_0x0086
        L_0x007b:
            r10 = r1
        L_0x007c:
            if (r9 != 0) goto L_0x0085
            if (r2 == 0) goto L_0x0086
            float r9 = (float) r2     // Catch:{ all -> 0x01de }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01de }
            r1 = r2
            goto L_0x0086
        L_0x0085:
            r1 = r9
        L_0x0086:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01de }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01de }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x0093:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01de }
            boolean r0 = r0.zzg()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzcY     // Catch:{ all -> 0x01de }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01de }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x01de }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01de }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00b2
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x00b2:
            com.google.android.gms.internal.ads.zzclz r0 = new com.google.android.gms.internal.ads.zzclz     // Catch:{ all -> 0x01de }
            r0.<init>(r8)     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "/contentHeight"
            r8.zzaf(r1, r0)     // Catch:{ all -> 0x01de }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.zzaQ(r0)     // Catch:{ all -> 0x01de }
            android.util.DisplayMetrics r0 = r8.zzh     // Catch:{ all -> 0x01de }
            float r0 = r0.density     // Catch:{ all -> 0x01de }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01de }
            int r1 = r8.zzG     // Catch:{ all -> 0x01de }
            r2 = -1
            if (r1 == r2) goto L_0x00d2
            float r10 = (float) r1     // Catch:{ all -> 0x01de }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01de }
            goto L_0x00d6
        L_0x00d2:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01de }
        L_0x00d6:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x00db:
            com.google.android.gms.internal.ads.zzcmx r0 = r8.zzq     // Catch:{ all -> 0x01de }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x00f0
            android.util.DisplayMetrics r9 = r8.zzh     // Catch:{ all -> 0x01de }
            int r9 = r9.widthPixels     // Catch:{ all -> 0x01de }
            android.util.DisplayMetrics r10 = r8.zzh     // Catch:{ all -> 0x01de }
            int r10 = r10.heightPixels     // Catch:{ all -> 0x01de }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x00f0:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01de }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01de }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01de }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01de }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x010e
            if (r0 != r4) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r0 = r3
            goto L_0x010f
        L_0x010e:
            r0 = r9
        L_0x010f:
            if (r2 == r5) goto L_0x0113
            if (r2 != r4) goto L_0x0114
        L_0x0113:
            r3 = r10
        L_0x0114:
            com.google.android.gms.internal.ads.zzcmx r2 = r8.zzq     // Catch:{ all -> 0x01de }
            int r4 = r2.zzb     // Catch:{ all -> 0x01de }
            r5 = 1
            if (r4 > r0) goto L_0x0122
            int r2 = r2.zza     // Catch:{ all -> 0x01de }
            if (r2 <= r3) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r2 = r1
            goto L_0x0123
        L_0x0122:
            r2 = r5
        L_0x0123:
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzes     // Catch:{ all -> 0x01de }
            com.google.android.gms.internal.ads.zzbhw r6 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x01de }
            java.lang.Object r4 = r6.zzb(r4)     // Catch:{ all -> 0x01de }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01de }
            if (r4 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzcmx r4 = r8.zzq     // Catch:{ all -> 0x01de }
            int r6 = r4.zzb     // Catch:{ all -> 0x01de }
            float r7 = r8.zzi     // Catch:{ all -> 0x01de }
            float r6 = (float) r6     // Catch:{ all -> 0x01de }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01de }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x014f
            int r0 = r4.zza     // Catch:{ all -> 0x01de }
            float r0 = (float) r0     // Catch:{ all -> 0x01de }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01de }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x014f
            r0 = r5
            goto L_0x0150
        L_0x014f:
            r0 = r1
        L_0x0150:
            r2 = r2 & r0
        L_0x0151:
            r0 = 8
            if (r2 == 0) goto L_0x01b8
            com.google.android.gms.internal.ads.zzcmx r2 = r8.zzq     // Catch:{ all -> 0x01de }
            int r3 = r2.zzb     // Catch:{ all -> 0x01de }
            float r4 = r8.zzi     // Catch:{ all -> 0x01de }
            int r2 = r2.zza     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r6.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01de }
            float r3 = (float) r3     // Catch:{ all -> 0x01de }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01de }
            r6.append(r3)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01de }
            float r2 = (float) r2     // Catch:{ all -> 0x01de }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01de }
            r6.append(r2)     // Catch:{ all -> 0x01de }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01de }
            float r9 = (float) r9     // Catch:{ all -> 0x01de }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01de }
            r6.append(r9)     // Catch:{ all -> 0x01de }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01de }
            float r9 = (float) r10     // Catch:{ all -> 0x01de }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01de }
            r6.append(r9)     // Catch:{ all -> 0x01de }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01de }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01de }
            com.google.android.gms.ads.internal.util.zze.zzj(r9)     // Catch:{ all -> 0x01de }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01de }
            if (r9 == r0) goto L_0x01a4
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01de }
        L_0x01a4:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01de }
            boolean r9 = r8.zzl     // Catch:{ all -> 0x01de }
            if (r9 != 0) goto L_0x01b6
            com.google.android.gms.internal.ads.zzbdl r9 = r8.zzX     // Catch:{ all -> 0x01de }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01de }
            r8.zzl = r5     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x01b6:
            monitor-exit(r8)
            return
        L_0x01b8:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01de }
            if (r9 == r0) goto L_0x01c1
            r8.setVisibility(r1)     // Catch:{ all -> 0x01de }
        L_0x01c1:
            boolean r9 = r8.zzm     // Catch:{ all -> 0x01de }
            if (r9 != 0) goto L_0x01ce
            com.google.android.gms.internal.ads.zzbdl r9 = r8.zzX     // Catch:{ all -> 0x01de }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.zzc(r10)     // Catch:{ all -> 0x01de }
            r8.zzm = r5     // Catch:{ all -> 0x01de }
        L_0x01ce:
            com.google.android.gms.internal.ads.zzcmx r9 = r8.zzq     // Catch:{ all -> 0x01de }
            int r10 = r9.zzb     // Catch:{ all -> 0x01de }
            int r9 = r9.zza     // Catch:{ all -> 0x01de }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x01d9:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01de }
            monitor-exit(r8)
            return
        L_0x01de:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!zzaB()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zze.zzh("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!zzaB()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zze.zzh("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzK() || this.zzn.zzI()) {
            zzaoc zzaoc = this.zzc;
            if (zzaoc != null) {
                zzaoc.zzd(motionEvent);
            }
            zzbix zzbix = this.zzd;
            if (zzbix != null) {
                zzbix.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbkn zzbkn = this.zzC;
                if (zzbkn != null) {
                    zzbkn.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclp) {
            this.zzn = (zzclp) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!zzaB()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zze.zzh("Could not stop loading webview.", e);
            }
        }
    }

    public final void zzA(int i) {
        this.zzM = i;
    }

    public final void zzB(boolean z) {
        this.zzn.zzB(false);
    }

    public final synchronized void zzC(int i) {
        this.zzL = i;
    }

    public final void zzD(int i) {
    }

    public final synchronized void zzE(zzcme zzcme) {
        if (this.zzz != null) {
            zze.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcme;
        }
    }

    public final zzfbg zzF() {
        return this.zzj;
    }

    public final Context zzG() {
        return this.zzb.zzb();
    }

    public final View zzH() {
        return this;
    }

    public final WebView zzI() {
        return this;
    }

    public final WebViewClient zzJ() {
        return this.zzn;
    }

    public final zzaoc zzK() {
        return this.zzc;
    }

    public final synchronized zzbbz zzL() {
        return this.zzE;
    }

    public final synchronized zzbkn zzM() {
        return this.zzC;
    }

    public final synchronized zzl zzN() {
        return this.zzo;
    }

    public final synchronized zzl zzO() {
        return this.zzO;
    }

    public final /* synthetic */ zzcmv zzP() {
        return this.zzn;
    }

    public final synchronized zzcmx zzQ() {
        return this.zzq;
    }

    public final zzfbj zzR() {
        return this.zzk;
    }

    public final synchronized IObjectWrapper zzS() {
        return this.zzp;
    }

    public final zzfvj zzT() {
        zzbix zzbix = this.zzd;
        if (zzbix == null) {
            return zzfva.zzi((Object) null);
        }
        return zzbix.zza();
    }

    public final synchronized String zzU() {
        return this.zzr;
    }

    public final void zzV(zzfbg zzfbg, zzfbj zzfbj) {
        this.zzj = zzfbg;
        this.zzk = zzfbj;
    }

    public final synchronized void zzW() {
        zze.zza("Destroying WebView!");
        zzaV();
        zzs.zza.post(new zzcma(this));
    }

    public final void zzX() {
        zzba();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzY(int i) {
        if (i == 0) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzba();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    public final void zzZ() {
        if (this.zzH == null) {
            zzbif.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbik zzf2 = zzbin.zzf();
            this.zzH = zzf2;
            this.zzK.zzb("native:view_show", zzf2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    public final void zza(String str) {
        throw null;
    }

    public final boolean zzaA(boolean z, int i) {
        destroy();
        this.zzX.zzb(new zzcly(z, i));
        this.zzX.zzc(10003);
        return true;
    }

    public final synchronized boolean zzaB() {
        return this.zzt;
    }

    public final synchronized boolean zzaC() {
        return this.zzu;
    }

    public final boolean zzaD() {
        return false;
    }

    public final synchronized boolean zzaE() {
        return this.zzx;
    }

    public final void zzaF(zzc zzc2, boolean z) {
        this.zzn.zzr(zzc2, z);
    }

    public final void zzaG(zzbr zzbr, zzeen zzeen, zzdwg zzdwg, zzfgo zzfgo, String str, String str2, int i) {
        this.zzn.zzs(zzbr, zzeen, zzdwg, zzfgo, str, str2, 14);
    }

    public final void zzaH(boolean z, int i, boolean z2) {
        this.zzn.zzt(z, i, z2);
    }

    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.zzn.zzv(z, i, str, z2);
    }

    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzw(z, i, str, str2, z2);
    }

    public final zzclp zzaL() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Boolean zzaM() {
        return this.zzw;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            zze.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaQ(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaM() == null) {
                zzbd();
            }
            if (zzaM().booleanValue()) {
                zzaP(str, (ValueCallback) null);
            } else {
                zzaR("javascript:".concat(str));
            }
        } else {
            zzaR("javascript:".concat(str));
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzaR(String str) {
        if (!zzaB()) {
            loadUrl(str);
        } else {
            zze.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaS(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        zzt.zzo().zzu(bool);
    }

    public final boolean zzaT() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzn.zzJ() && !this.zzn.zzK()) {
            return false;
        }
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzt2 = zzcfb.zzt(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzt3 = zzcfb.zzt(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 == null || zza2.getWindow() == null) {
            i2 = zzt2;
            i = zzt3;
        } else {
            zzt.zzp();
            int[] zzM2 = zzs.zzM(zza2);
            zzaw.zzb();
            int zzt4 = zzcfb.zzt(this.zzh, zzM2[0]);
            zzaw.zzb();
            i = zzcfb.zzt(this.zzh, zzM2[1]);
            i2 = zzt4;
        }
        int i3 = this.zzS;
        if (i3 == zzt2 && this.zzR == zzt3 && this.zzT == i2 && this.zzU == i) {
            return false;
        }
        if (!(i3 == zzt2 && this.zzR == zzt3)) {
            z = true;
        }
        this.zzS = zzt2;
        this.zzR = zzt3;
        this.zzT = i2;
        this.zzU = i;
        new zzbwu(this, "").zzi(zzt2, zzt3, i2, i, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
        return z;
    }

    public final void zzaa() {
        throw null;
    }

    public final void zzab(boolean z) {
        this.zzn.zzh(z);
    }

    public final void zzac() {
        this.zzQ.zzb();
    }

    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (!zzaB()) {
            String[] strArr = new String[1];
            String str5 = (String) zzay.zzc().zzb(zzbhy.zzN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put(SmaatoSdk.KEY_SDK_VERSION, "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zze.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcmo.zza(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        zze.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    public final void zzae() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbik zzf2 = zzbin.zzf();
            this.zzJ = zzf2;
            this.zzK.zzb("native:view_load", zzf2);
        }
    }

    public final void zzaf(String str, zzbol zzbol) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzx(str, zzbol);
        }
    }

    public final void zzag() {
        throw null;
    }

    public final synchronized void zzah(zzl zzl2) {
        this.zzo = zzl2;
    }

    public final synchronized void zzai(zzcmx zzcmx) {
        this.zzq = zzcmx;
        requestLayout();
    }

    public final synchronized void zzaj(zzbbz zzbbz) {
        this.zzE = zzbbz;
    }

    public final synchronized void zzak(boolean z) {
        this.zzx = z;
    }

    public final void zzal() {
        setBackgroundColor(0);
    }

    public final void zzam(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    public final synchronized void zzan(boolean z) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzw(this.zzn.zzJ(), z);
        } else {
            this.zzs = z;
        }
    }

    public final synchronized void zzao(zzbkl zzbkl) {
        this.zzD = zzbkl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzap(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzu     // Catch:{ all -> 0x003a }
            r2.zzu = r3     // Catch:{ all -> 0x003a }
            r2.zzaU()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzO     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzcmx r0 = r2.zzq     // Catch:{ all -> 0x003a }
            boolean r0 = r0.zzi()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.zzbwu r0 = new com.google.android.gms.internal.ads.zzbwu     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.zzk(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.zzap(boolean):void");
    }

    public final synchronized void zzaq(zzbkn zzbkn) {
        this.zzC = zzbkn;
    }

    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    public final synchronized void zzas(int i) {
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzy(i);
        }
    }

    public final synchronized void zzat(zzl zzl2) {
        this.zzO = zzl2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzau(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.zzF     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.zzF = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzl r3 = r2.zzo     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.zzC()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmb.zzau(boolean):void");
    }

    public final synchronized void zzav(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzl2 = this.zzo;
        if (zzl2 != null) {
            zzl2.zzz(z);
        }
    }

    public final void zzaw(String str, zzbol zzbol) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzG(str, zzbol);
        }
    }

    public final void zzax(String str, Predicate predicate) {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzH(str, predicate);
        }
    }

    public final synchronized boolean zzay() {
        return this.zzs;
    }

    public final synchronized boolean zzaz() {
        return this.zzF > 0;
    }

    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbn();
        }
    }

    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzl2 = this.zzf;
        if (zzl2 != null) {
            zzl2.zzbo();
        }
    }

    public final zzchg zzbp() {
        return null;
    }

    public final void zzc(zzbal zzbal) {
        synchronized (this) {
            this.zzA = zzbal.zzj;
        }
        zzaX(zzbal.zzj);
    }

    public final void zzd(String str, Map map) {
        try {
            zze(str, zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaQ(sb.toString());
    }

    public final int zzf() {
        return this.zzN;
    }

    public final int zzg() {
        return this.zzM;
    }

    public final synchronized int zzh() {
        return this.zzL;
    }

    public final int zzi() {
        return getMeasuredHeight();
    }

    public final int zzj() {
        return getMeasuredWidth();
    }

    public final Activity zzk() {
        return this.zzb.zza();
    }

    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    public final zza zzm() {
        return this.zzg;
    }

    public final zzbik zzn() {
        return this.zzI;
    }

    public final zzbil zzo() {
        return this.zzK;
    }

    public final zzcfo zzp() {
        return this.zze;
    }

    public final void zzq() {
        zzclp zzclp = this.zzn;
        if (zzclp != null) {
            zzclp.zzq();
        }
    }

    public final synchronized zzcju zzr(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcju) map.get(str);
    }

    public final synchronized zzcme zzs() {
        return this.zzz;
    }

    public final synchronized String zzt() {
        zzfbj zzfbj = this.zzk;
        if (zzfbj == null) {
            return null;
        }
        return zzfbj.zzb;
    }

    public final synchronized String zzu() {
        return this.zzy;
    }

    public final synchronized void zzv(String str, zzcju zzcju) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcju);
    }

    public final void zzw() {
        zzl zzN2 = zzN();
        if (zzN2 != null) {
            zzN2.zzd();
        }
    }

    public final void zzx(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    public final synchronized void zzy() {
        zzbkl zzbkl = this.zzD;
        if (zzbkl != null) {
            zzs.zza.post(new zzdrb((zzdrd) zzbkl));
        }
    }

    public final void zzz(int i) {
        this.zzN = i;
    }
}
