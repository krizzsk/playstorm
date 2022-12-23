package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.util.C5350l;

public class InneractiveInternalBrowserActivity extends Activity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* renamed from: j */
    public static InternalBrowserListener f10328j;

    /* renamed from: a */
    public C4419j f10329a;

    /* renamed from: b */
    public String f10330b;

    /* renamed from: c */
    public LinearLayout f10331c;

    /* renamed from: d */
    public WebView f10332d;

    /* renamed from: e */
    public ImageButton f10333e;

    /* renamed from: f */
    public ImageButton f10334f;

    /* renamed from: g */
    public ImageButton f10335g;

    /* renamed from: h */
    public ImageButton f10336h;

    /* renamed from: i */
    public boolean f10337i = false;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f10328j = internalBrowserListener;
    }

    public void finish() {
        InternalBrowserListener internalBrowserListener = f10328j;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            android.view.Window r0 = r5.getWindow()
            r1 = 2
            r0.requestFeature(r1)
            android.view.Window r0 = r5.getWindow()
            r2 = -1
            r0.setFeatureInt(r1, r2)
            super.onCreate(r6)
            android.view.View r6 = r5.mo23857a()     // Catch:{ Exception -> 0x0147 }
            r5.setContentView(r6)     // Catch:{ Exception -> 0x0147 }
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "spotId"
            java.lang.String r6 = r6.getStringExtra(r0)
            r5.f10330b = r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x003e
            com.fyber.inneractive.sdk.external.InneractiveAdSpotManager r6 = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get()
            java.lang.String r0 = r5.f10330b
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r6 = r6.getSpot(r0)
            if (r6 == 0) goto L_0x003e
            com.fyber.inneractive.sdk.flow.j r6 = r6.getAdContent()
            r5.f10329a = r6
        L_0x003e:
            android.content.Intent r6 = r5.getIntent()
            android.webkit.WebView r0 = r5.f10332d
            android.webkit.WebSettings r0 = r0.getSettings()
            r1 = 1
            r0.setJavaScriptEnabled(r1)
            r0.setSupportZoom(r1)
            r0.setBuiltInZoomControls(r1)
            r0.setUseWideViewPort(r1)
            r0.setLoadWithOverviewMode(r1)
            android.webkit.WebView r0 = r5.f10332d
            disableWebviewZoomControls(r0)
            android.webkit.WebView r0 = r5.f10332d
            com.fyber.inneractive.sdk.activities.a r2 = new com.fyber.inneractive.sdk.activities.a
            r2.<init>(r5)
            r0.setWebViewClient(r2)
            android.webkit.WebView r0 = r5.f10332d
            com.fyber.inneractive.sdk.activities.b r2 = new com.fyber.inneractive.sdk.activities.b
            r2.<init>(r5)
            r0.setWebChromeClient(r2)
            java.lang.String r0 = "extra_url"
            java.lang.String r6 = r6.getStringExtra(r0)
            boolean r0 = com.fyber.inneractive.sdk.util.C5320d0.m16721e(r6)
            r2 = 0
            if (r0 == 0) goto L_0x00ce
            boolean r0 = com.fyber.inneractive.sdk.util.C5320d0.m16720d(r6)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r6, r0)     // Catch:{ Exception -> 0x0096 }
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0096 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0096 }
            android.webkit.WebView r6 = r5.f10332d     // Catch:{ Exception -> 0x0095 }
            r6.loadUrl(r0)     // Catch:{ Exception -> 0x0095 }
            goto L_0x00d3
        L_0x0095:
            r6 = r0
        L_0x0096:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r6
            java.lang.String r6 = "Failed to open Url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r6, r0)
            r5.finish()
            goto L_0x00d3
        L_0x00a3:
            android.content.Intent r0 = new android.content.Intent
            android.net.Uri r3 = android.net.Uri.parse(r6)
            java.lang.String r4 = "android.intent.action.VIEW"
            r0.<init>(r4, r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r3)
            r5.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00b7 }
            goto L_0x00c1
        L_0x00b7:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r6
            java.lang.String r6 = "Failed to start activity for %s. Please ensure that your phone can handle this intent."
            com.fyber.inneractive.sdk.util.IAlog.m16703e(r6, r0)
            r1 = r2
        L_0x00c1:
            if (r1 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity$InternalBrowserListener r6 = f10328j
            if (r6 == 0) goto L_0x00ca
            r6.onApplicationInBackground()
        L_0x00ca:
            r5.finish()
            goto L_0x00d3
        L_0x00ce:
            android.webkit.WebView r0 = r5.f10332d
            r0.loadUrl(r6)
        L_0x00d3:
            android.widget.ImageButton r6 = r5.f10333e
            r6.setBackgroundColor(r2)
            android.widget.ImageButton r6 = r5.f10333e
            com.fyber.inneractive.sdk.activities.c r0 = new com.fyber.inneractive.sdk.activities.c
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            android.widget.ImageButton r6 = r5.f10333e
            java.lang.String r0 = "IABackButton"
            r6.setContentDescription(r0)
            android.widget.ImageButton r6 = r5.f10334f
            r6.setBackgroundColor(r2)
            android.widget.ImageButton r6 = r5.f10334f
            com.fyber.inneractive.sdk.activities.d r0 = new com.fyber.inneractive.sdk.activities.d
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            android.widget.ImageButton r6 = r5.f10334f
            java.lang.String r0 = "IAForwardButton"
            r6.setContentDescription(r0)
            android.widget.ImageButton r6 = r5.f10335g
            r6.setBackgroundColor(r2)
            android.widget.ImageButton r6 = r5.f10335g
            com.fyber.inneractive.sdk.activities.e r0 = new com.fyber.inneractive.sdk.activities.e
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            android.widget.ImageButton r6 = r5.f10335g
            java.lang.String r0 = "IARefreshButton"
            r6.setContentDescription(r0)
            android.widget.ImageButton r6 = r5.f10336h
            r6.setBackgroundColor(r2)
            android.widget.ImageButton r6 = r5.f10336h
            com.fyber.inneractive.sdk.activities.f r0 = new com.fyber.inneractive.sdk.activities.f
            r0.<init>(r5)
            r6.setOnClickListener(r0)
            android.widget.ImageButton r6 = r5.f10336h
            java.lang.String r0 = "IACloseButton"
            r6.setContentDescription(r0)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r6 >= r0) goto L_0x013d
            android.app.Application r1 = com.fyber.inneractive.sdk.util.C5350l.f14216a
            android.webkit.CookieSyncManager.createInstance(r1)
            android.webkit.CookieSyncManager r1 = android.webkit.CookieSyncManager.getInstance()
            r1.startSync()
        L_0x013d:
            if (r6 >= r0) goto L_0x0146
            android.webkit.CookieSyncManager r6 = android.webkit.CookieSyncManager.getInstance()
            r6.startSync()
        L_0x0146:
            return
        L_0x0147:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        LinearLayout linearLayout = this.f10331c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f10332d;
        if (webView != null) {
            webView.destroy();
            this.f10332d = null;
        }
        super.onDestroy();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().stopSync();
        }
        this.f10337i = false;
    }

    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().startSync();
        }
    }

    /* renamed from: a */
    public final View mo23857a() {
        this.f10331c = new LinearLayout(this);
        this.f10331c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f10331c.setOrientation(1);
        this.f10331c.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f10331c.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C5350l.m16760b(getResources().getInteger(C4167R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(C5350l.m16768d(C4167R.C4168drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f10333e = mo23858a(C5350l.m16768d(C4167R.C4168drawable.ia_ib_left_arrow));
        this.f10334f = mo23858a(C5350l.m16768d(C4167R.C4168drawable.ia_ib_right_arrow));
        this.f10335g = mo23858a(C5350l.m16768d(C4167R.C4168drawable.ia_ib_refresh));
        this.f10336h = mo23858a(C5350l.m16768d(C4167R.C4168drawable.ia_ib_close));
        linearLayout.addView(this.f10333e);
        linearLayout.addView(this.f10334f);
        linearLayout.addView(this.f10335g);
        linearLayout.addView(this.f10336h);
        WebView webView = new WebView(this);
        this.f10332d = webView;
        webView.setId(C4167R.C4169id.inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f10332d.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f10332d);
        return this.f10331c;
    }

    /* renamed from: a */
    public final ImageButton mo23858a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C5350l.m16760b(getResources().getInteger(C4167R.integer.ia_ib_button_size_dp)), C5350l.m16760b(getResources().getInteger(C4167R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
