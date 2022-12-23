package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public interface zzcli extends zza, zzdjf, zzckz, zzbrc, zzcmf, zzcmj, zzbrp, zzbam, zzcmn, zzl, zzcmq, zzcmr, zzchr, zzcms {
    boolean canGoBack();

    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zzE(zzcme zzcme);

    zzfbg zzF();

    Context zzG();

    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    zzaoc zzK();

    zzbbz zzL();

    zzbkn zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcmv zzP();

    zzcmx zzQ();

    zzfbj zzR();

    IObjectWrapper zzS();

    zzfvj zzT();

    String zzU();

    void zzV(zzfbg zzfbg, zzfbj zzfbj);

    void zzW();

    void zzX();

    void zzY(int i);

    void zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean z);

    void zzac();

    void zzad(String str, String str2, String str3);

    void zzae();

    void zzaf(String str, zzbol zzbol);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl zzl);

    void zzai(zzcmx zzcmx);

    void zzaj(zzbbz zzbbz);

    void zzak(boolean z);

    void zzal();

    void zzam(Context context);

    void zzan(boolean z);

    void zzao(zzbkl zzbkl);

    void zzap(boolean z);

    void zzaq(zzbkn zzbkn);

    void zzar(IObjectWrapper iObjectWrapper);

    void zzas(int i);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl zzl);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbol zzbol);

    void zzax(String str, Predicate predicate);

    boolean zzay();

    boolean zzaz();

    Activity zzk();

    com.google.android.gms.ads.internal.zza zzm();

    zzbil zzo();

    zzcfo zzp();

    zzcme zzs();

    void zzv(String str, zzcju zzcju);
}
