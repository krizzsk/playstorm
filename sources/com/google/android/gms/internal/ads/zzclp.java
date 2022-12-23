package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzclp extends WebViewClient implements zzcmv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzccj zza;
    private final zzcli zzc;
    private final zzbdl zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zza zzg;
    private zzo zzh;
    private zzcmt zzi;
    private zzcmu zzj;
    private zzbnl zzk;
    private zzbnn zzl;
    private zzdjf zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private zzw zzs;
    private zzbwt zzt;
    private zzb zzu;
    private zzbwo zzv;
    private zzfig zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzclp(zzcli zzcli, zzbdl zzbdl, boolean z) {
        zzbwt zzbwt = new zzbwt(zzcli, zzcli.zzG(), new zzbhi(zzcli.getContext()));
        this.zzd = zzbdl;
        this.zzc = zzcli;
        this.zzp = z;
        this.zzt = zzbwt;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) zzay.zzc().zzb(zzbhy.zzeC)).split(",")));
    }

    private static WebResourceResponse zzM() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzN(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.zzp().zze(this.zzc.getContext(), this.zzc.zzp().zza, false, httpURLConnection, false, 60000);
                        zzcfh zzcfh = new zzcfh((String) null);
                        zzcfh.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcfh.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzt.zzp();
                            WebResourceResponse zzL = zzs.zzL(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    zze.zzj("Protocol is null");
                                    WebResourceResponse zzM = zzM();
                                    TrafficStats.clearThreadStatsTag();
                                    return zzM;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    zze.zze("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    zze.zzj("Unsupported scheme: " + protocol);
                                    return zzM();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.zzp();
            WebResourceResponse zzL2 = zzs.zzL(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return zzL2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzO(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbol) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzP() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzQ(View view, zzccj zzccj, int i) {
        if (zzccj.zzi() && i > 0) {
            zzccj.zzg(view);
            if (zzccj.zzi()) {
                zzs.zza.postDelayed(new zzcll(this, view, zzccj, i), 100);
            }
        }
    }

    private static final boolean zzR(boolean z, zzcli zzcli) {
        return z && !zzcli.zzQ().zzi() && !zzcli.zzU().equals("interstitial_mb");
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzx = true;
        r1 = r0.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.zzf
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcli r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.zzaB()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzcli r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            r2.zzW()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.zzx = r1
            com.google.android.gms.internal.ads.zzcmu r1 = r0.zzj
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.zzj = r1
        L_0x0025:
            r0.zzg()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclp.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zza2 = this.zzg;
                    if (zza2 != null) {
                        zza2.onAdClicked();
                        zzccj zzccj = this.zza;
                        if (zzccj != null) {
                            zzccj.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdjf zzdjf = this.zzm;
                    if (zzdjf != null) {
                        zzdjf.zzq();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzI().willNotDraw()) {
                try {
                    zzaoc zzK = this.zzc.zzK();
                    if (zzK != null && zzK.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcli zzcli = this.zzc;
                        parse = zzK.zza(parse, context, (View) zzcli, zzcli.zzk());
                    }
                } catch (zzaod unused) {
                    zze.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzb2 = this.zzu;
                if (zzb2 == null || zzb2.zzc()) {
                    zzr(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (zzu) null), true);
                } else {
                    this.zzu.zzb(str);
                }
            } else {
                zze.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            zzi(parse);
        }
        return true;
    }

    public final void zzA(int i, int i2) {
        zzbwo zzbwo = this.zzv;
        if (zzbwo != null) {
            zzbwo.zzd(i, i2);
        }
    }

    public final void zzB(boolean z) {
        this.zzn = false;
    }

    public final void zzC(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    public final void zzD() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcfv.zze.execute(new zzclk(this));
        }
    }

    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    public final void zzF(zzcmu zzcmu) {
        this.zzj = zzcmu;
    }

    public final void zzG(String str, zzbol zzbol) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbol);
            }
        }
    }

    public final void zzH(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbol> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbol zzbol : list) {
                    if (predicate.apply(zzbol)) {
                        arrayList.add(zzbol);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzI() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    public final void zzL(zza zza2, zzbnl zzbnl, zzo zzo2, zzbnn zzbnn, zzw zzw2, boolean z, zzboo zzboo, zzb zzb2, zzbwv zzbwv, zzccj zzccj, zzeen zzeen, zzfig zzfig, zzdwg zzdwg, zzfgo zzfgo, zzbom zzbom, zzdjf zzdjf) {
        zzbnl zzbnl2 = zzbnl;
        zzbnn zzbnn2 = zzbnn;
        zzboo zzboo2 = zzboo;
        zzbwv zzbwv2 = zzbwv;
        zzccj zzccj2 = zzccj;
        zzeen zzeen2 = zzeen;
        zzfig zzfig2 = zzfig;
        zzbom zzbom2 = zzbom;
        zzdjf zzdjf2 = zzdjf;
        zzb zzb3 = zzb2 == null ? new zzb(this.zzc.getContext(), zzccj2, (zzbzi) null) : zzb2;
        this.zzv = new zzbwo(this.zzc, zzbwv2);
        this.zza = zzccj2;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaL)).booleanValue()) {
            zzx("/adMetadata", new zzbnk(zzbnl2));
        }
        if (zzbnn2 != null) {
            zzx("/appEvent", new zzbnm(zzbnn2));
        }
        zzx("/backButton", zzbok.zzj);
        zzx("/refresh", zzbok.zzk);
        zzx("/canOpenApp", zzbok.zzb);
        zzx("/canOpenURLs", zzbok.zza);
        zzx("/canOpenIntents", zzbok.zzc);
        zzx("/close", zzbok.zzd);
        zzx("/customClose", zzbok.zze);
        zzx("/instrument", zzbok.zzn);
        zzx("/delayPageLoaded", zzbok.zzp);
        zzx("/delayPageClosed", zzbok.zzq);
        zzx("/getLocationInfo", zzbok.zzr);
        zzx("/log", zzbok.zzg);
        zzx("/mraid", new zzbos(zzb3, this.zzv, zzbwv2));
        zzbwt zzbwt = this.zzt;
        if (zzbwt != null) {
            zzx("/mraidLoaded", zzbwt);
        }
        zzbow zzbow = r4;
        zzbow zzbow2 = new zzbow(zzb3, this.zzv, zzeen, zzdwg, zzfgo);
        zzx("/open", zzbow);
        zzx("/precache", new zzcjv());
        zzx("/touch", zzbok.zzi);
        zzx("/video", zzbok.zzl);
        zzx("/videoMeta", zzbok.zzm);
        if (zzeen2 == null || zzfig2 == null) {
            zzx("/click", zzbok.zza(zzdjf));
            zzx("/httpTrack", zzbok.zzf);
        } else {
            zzx("/click", new zzfcf(zzdjf2, zzfig2, zzeen2));
            zzx("/httpTrack", new zzfce(zzfig2, zzeen2));
        }
        if (zzt.zzn().zzu(this.zzc.getContext())) {
            zzx("/logScionEvent", new zzbor(this.zzc.getContext()));
        }
        if (zzboo2 != null) {
            zzx("/setInterstitialProperties", new zzbon(zzboo2, (byte[]) null));
        }
        if (zzbom2 != null) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
                zzx("/inspectorNetworkExtras", zzbom2);
            }
        }
        this.zzg = zza2;
        this.zzh = zzo2;
        this.zzk = zzbnl2;
        this.zzl = zzbnn2;
        this.zzs = zzw2;
        this.zzu = zzb3;
        this.zzm = zzdjf2;
        this.zzn = z;
        this.zzw = zzfig2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzbcu zzb2;
        try {
            if (((Boolean) zzbjp.zza.zze()).booleanValue()) {
                if (this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.zzw.zzc(str, (zzfhq) null);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String zzc2 = zzcdp.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc2.equals(str)) {
                return zzN(zzc2, map);
            }
            zzbcx zza2 = zzbcx.zza(Uri.parse(str));
            if (zza2 != null && (zzb2 = zzt.zzc().zzb(zza2)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (!zzcfh.zzl() || !((Boolean) zzbjk.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzN(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzt.zzo().zzt(e, "AdWebViewClient.interceptRequest");
            return zzM();
        }
    }

    public final zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && this.zzc.zzo() != null) {
                zzbif.zza(this.zzc.zzo().zza(), this.zzc.zzn(), "awfllc");
            }
            zzcmt zzcmt = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcmt.zza(z);
            this.zzi = null;
        }
        this.zzc.zzae();
    }

    public final void zzh(boolean z) {
        this.zzA = z;
    }

    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzfI)).booleanValue() && zzt.zzo().zzf() != null) {
                zzcfv.zza.execute(new zzclj((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzeB)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzay.zzc().zzb(zzbhy.zzeD)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfva.zzr(zzt.zzp().zzb(uri), new zzcln(this, list, path, uri), zzcfv.zze);
                return;
            }
        }
        zzt.zzp();
        zzO(zzs.zzK(uri), list, path);
    }

    public final void zzj() {
        zzbdl zzbdl = this.zzd;
        if (zzbdl != null) {
            zzbdl.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    public final void zzl() {
        this.zzz--;
        zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzc.zzac();
        zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(View view, zzccj zzccj, int i) {
        zzQ(view, zzccj, i - 1);
    }

    public final void zzo(int i, int i2, boolean z) {
        zzbwt zzbwt = this.zzt;
        if (zzbwt != null) {
            zzbwt.zzb(i, i2);
        }
        zzbwo zzbwo = this.zzv;
        if (zzbwo != null) {
            zzbwo.zzc(i, i2, false);
        }
    }

    public final void zzp() {
        zzccj zzccj = this.zza;
        if (zzccj != null) {
            WebView zzI = this.zzc.zzI();
            if (ViewCompat.isAttachedToWindow(zzI)) {
                zzQ(zzI, zzccj, 10);
                return;
            }
            zzP();
            zzclm zzclm = new zzclm(this, zzccj);
            this.zzC = zzclm;
            ((View) this.zzc).addOnAttachStateChangeListener(zzclm);
        }
    }

    public final void zzq() {
        zzdjf zzdjf = this.zzm;
        if (zzdjf != null) {
            zzdjf.zzq();
        }
    }

    public final void zzr(zzc zzc2, boolean z) {
        zzdjf zzdjf;
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z2 = true;
        if (!zzR && z) {
            z2 = false;
        }
        zza zza2 = zzR ? null : this.zzg;
        zzo zzo2 = zzaC ? null : this.zzh;
        zzw zzw2 = this.zzs;
        zzcfo zzp2 = this.zzc.zzp();
        zzcli zzcli = this.zzc;
        if (z2) {
            zzdjf = null;
        } else {
            zzdjf = this.zzm;
        }
        zzu(new AdOverlayInfoParcel(zzc2, zza2, zzo2, zzw2, zzp2, zzcli, zzdjf));
    }

    public final void zzs(zzbr zzbr, zzeen zzeen, zzdwg zzdwg, zzfgo zzfgo, String str, String str2, int i) {
        zzcli zzcli = this.zzc;
        zzu(new AdOverlayInfoParcel(zzcli, zzcli.zzp(), zzbr, zzeen, zzdwg, zzfgo, str, str2, 14));
    }

    public final void zzt(boolean z, int i, boolean z2) {
        zzdjf zzdjf;
        boolean zzR = zzR(this.zzc.zzaC(), this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        zza zza2 = zzR ? null : this.zzg;
        zzo zzo2 = this.zzh;
        zzw zzw2 = this.zzs;
        zzcli zzcli = this.zzc;
        zzcfo zzp2 = zzcli.zzp();
        if (z3) {
            zzdjf = null;
        } else {
            zzdjf = this.zzm;
        }
        zzu(new AdOverlayInfoParcel(zza2, zzo2, zzw2, zzcli, z, i, zzp2, zzdjf));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc2;
        zzbwo zzbwo = this.zzv;
        boolean zze2 = zzbwo != null ? zzbwo.zze() : false;
        zzt.zzj();
        zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze2);
        zzccj zzccj = this.zza;
        if (zzccj != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc2 = adOverlayInfoParcel.zza) != null) {
                str = zzc2.zzb;
            }
            zzccj.zzh(str);
        }
    }

    public final void zzv(boolean z, int i, String str, boolean z2) {
        zza zza2;
        zzdjf zzdjf;
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        if (zzR) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzclo zzclo = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnl zzbnl = this.zzk;
        zzbnn zzbnn = this.zzl;
        zzw zzw2 = this.zzs;
        zzcli zzcli = this.zzc;
        zzcfo zzp2 = zzcli.zzp();
        if (z3) {
            zzdjf = null;
        } else {
            zzdjf = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, zzclo, zzbnl, zzbnn, zzw2, zzcli, z, i, str, zzp2, zzdjf);
        zzu(adOverlayInfoParcel);
    }

    public final void zzw(boolean z, int i, String str, String str2, boolean z2) {
        zza zza2;
        zzdjf zzdjf;
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        if (zzR) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzclo zzclo = zzaC ? null : new zzclo(this.zzc, this.zzh);
        zzbnl zzbnl = this.zzk;
        zzbnn zzbnn = this.zzl;
        zzw zzw2 = this.zzs;
        zzcli zzcli = this.zzc;
        zzcfo zzp2 = zzcli.zzp();
        if (z3) {
            zzdjf = null;
        } else {
            zzdjf = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzo) zzclo, zzbnl, zzbnn, zzw2, zzcli, z, i, str, str2, zzp2, zzdjf);
        zzu(adOverlayInfoParcel);
    }

    public final void zzx(String str, zzbol zzbol) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbol);
        }
    }

    public final void zzy() {
        zzccj zzccj = this.zza;
        if (zzccj != null) {
            zzccj.zze();
            this.zza = null;
        }
        zzP();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbwo zzbwo = this.zzv;
            if (zzbwo != null) {
                zzbwo.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    public final void zzz(zzcmt zzcmt) {
        this.zzi = zzcmt;
    }
}
