package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4421l;
import com.fyber.inneractive.sdk.flow.C4433s;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.network.C4574r;
import com.fyber.inneractive.sdk.p192ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.renderers.C5281k;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;

public class InneractiveFullscreenAdActivity extends Activity implements C4455c.C4456a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: a */
    public ViewGroup f10318a;

    /* renamed from: b */
    public InneractiveAdSpot f10319b;

    /* renamed from: c */
    public C4455c f10320c;

    /* renamed from: d */
    public int f10321d = 0;

    /* renamed from: e */
    public int f10322e = 0;

    /* renamed from: f */
    public int f10323f = 0;

    /* renamed from: g */
    public boolean f10324g = false;

    /* renamed from: h */
    public CloseButtonFlowManager f10325h;

    public interface FullScreenRendererProvider {
        C4455c getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a */
    public class C4171a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a$a */
        public class C4172a implements Runnable {
            public C4172a() {
            }

            public void run() {
                if (!InneractiveFullscreenAdActivity.this.isFinishing()) {
                    InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity = InneractiveFullscreenAdActivity.this;
                    String str = InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID;
                    inneractiveFullscreenAdActivity.mo23833a();
                }
            }
        }

        public C4171a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                C5357n.f14225b.postDelayed(new C4172a(), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo23833a() {
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            if ((decorView.getSystemUiVisibility() & 2) == 0) {
                decorView.setSystemUiVisibility(2818);
            }
            decorView.setOnSystemUiVisibilityChangeListener(new C4171a());
        }
    }

    public void destroy() {
        if (!isFinishing() && this.f10318a != null) {
            finish();
        }
    }

    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f10325h;
        closeButtonFlowManager.f14112c.setVisibility(8);
        closeButtonFlowManager.f14110a.setVisibility(8);
    }

    public void dismissAd(boolean z) {
        this.f10324g = z;
        C4455c cVar = this.f10320c;
        if (cVar != null) {
            cVar.mo24626c(z);
        }
        finish();
    }

    public View getCloseButton() {
        return this.f10325h.f14114e;
    }

    public ViewGroup getLayout() {
        return this.f10318a;
    }

    public void initWindowFeatures(C4455c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && (((C4421l) cVar) instanceof C5281k)) {
            setTheme(16973831);
            if (i >= 19) {
                requestWindowFeature(67108864);
                requestWindowFeature(134217728);
            }
            if (i >= 21) {
                requestWindowFeature(Integer.MIN_VALUE);
            }
        }
        mo23833a();
        C4345y yVar = (C4345y) this.f10319b.getAdContent().f10916d;
        if (yVar.f10750f != null) {
            Orientation orientation = yVar.f10750f.f10574e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    public boolean isCloseButtonDisplay() {
        return this.f10325h.f14113d.getVisibility() == 0;
    }

    public void onBackPressed() {
        C4455c cVar = this.f10320c;
        if (cVar == null || !cVar.mo24421u()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4455c cVar = this.f10320c;
        if (cVar != null) {
            int i = configuration.orientation;
            if (i != this.f10321d) {
                this.f10321d = i;
                cVar.mo24415b();
                return;
            }
            int i2 = this.f10322e;
            int i3 = configuration.screenHeightDp;
            if (i2 != i3 || this.f10323f != configuration.screenWidthDp) {
                this.f10322e = i3;
                this.f10323f = configuration.screenWidthDp;
                cVar.mo24415b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m16703e("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.m16696a((Object) this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.m16700b("%sSpot id %s cannot be found in spot manager!", IAlog.m16696a((Object) this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.m16699a("%sSpot does not have a content. Cannot start activity", IAlog.m16696a((Object) this));
            }
            if (!(spot == null || spot.getAdContent() == null)) {
                inneractiveAdSpot = spot;
            }
        }
        this.f10319b = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f10319b.getAdContent().f10916d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f10319b.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.m16703e("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.m16696a((Object) this));
            super.onCreate(bundle);
            finish();
            return;
        }
        C4455c fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f10320c = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.m16699a("%sInterstitial for spot id %s created", IAlog.m16696a((Object) this), this.f10319b.getLocalUniqueId());
        this.f10321d = getResources().getConfiguration().orientation;
        this.f10322e = getResources().getConfiguration().screenHeightDp;
        this.f10323f = getResources().getConfiguration().screenWidthDp;
        if (this.f10320c != null) {
            try {
                setContentView(C4167R.layout.ia_fullscreen_activity);
                this.f10318a = (ViewGroup) findViewById(C4167R.C4169id.ia_ad_content);
                this.f10325h = new CloseButtonFlowManager(this);
                C4455c cVar = this.f10320c;
                InneractiveAdSpot inneractiveAdSpot2 = this.f10319b;
                C4433s sVar = (C4433s) cVar;
                sVar.f10920a = inneractiveAdSpot2;
                sVar.f10921b = inneractiveAdSpot2.getAdContent();
                sVar.f10922c = inneractiveAdSpot2.getSelectedUnitController().getEventsListener();
                sVar.f10966u.f14140a = inneractiveAdSpot2;
                try {
                    this.f10320c.mo24413a(this, this);
                    this.f10319b.getAdContent().f10917e = true;
                } catch (InneractiveUnitController.AdDisplayError e) {
                    IAlog.m16703e("Interstitial Activity: %s", e.getMessage());
                    finish();
                } catch (Resources.NotFoundException e2) {
                    IAlog.m16703e("Interstitial Activity: %s", e2.getMessage());
                    finish();
                }
            } catch (Throwable th) {
                C4574r.m14051a(th, this.f10319b.getAdContent().f10913a, this.f10319b.getAdContent().mo24367c());
                finish();
            }
        } else {
            IAlog.m16703e("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
        }
    }

    public void onDestroy() {
        ViewGroup viewGroup = this.f10318a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f10318a = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f10319b;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        C4455c cVar = this.f10320c;
        if (cVar != null) {
            cVar.mo24419m();
            this.f10320c.destroy();
            this.f10320c = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            C4455c cVar = this.f10320c;
            if (cVar != null) {
                cVar.mo24419m();
                this.f10320c.destroy();
                this.f10320c = null;
                return;
            }
            return;
        }
        C4455c cVar2 = this.f10320c;
        if (cVar2 != null) {
            cVar2.mo24630s();
        }
    }

    public void onResume() {
        super.onResume();
        C4455c cVar = this.f10320c;
        if (cVar != null) {
            cVar.mo24629o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo23833a();
        }
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    public void showCloseButton(boolean z, int i, int i2) {
        int i3;
        int i4;
        CloseButtonFlowManager closeButtonFlowManager = this.f10325h;
        if (z) {
            closeButtonFlowManager.f14110a.setAlpha(0.0f);
            closeButtonFlowManager.f14113d.setAlpha(0.0f);
        }
        closeButtonFlowManager.f14111b.setText("");
        closeButtonFlowManager.f14111b.setVisibility(8);
        if (i >= 5) {
            int a = C5350l.m16753a(i);
            closeButtonFlowManager.f14113d.getLayoutParams().width = a;
            closeButtonFlowManager.f14113d.getLayoutParams().height = a;
        }
        if (i2 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closeButtonFlowManager.f14110a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) closeButtonFlowManager.f14112c.getLayoutParams();
            int a2 = C5350l.m16753a(i2);
            int i5 = ((FrameLayout.LayoutParams) closeButtonFlowManager.f14113d.getLayoutParams()).width;
            int i6 = a2 - i5;
            if (a2 <= i5 || i6 <= (i4 = layoutParams.rightMargin)) {
                layoutParams2.width = a2;
                layoutParams2.height = a2;
                i3 = layoutParams.rightMargin;
                if (i6 < i3) {
                    i3 -= i6 / 2;
                }
            } else {
                int i7 = (a2 / 2) + (i5 / 2) + i4;
                layoutParams2.width = i7;
                layoutParams2.height = i7;
                layoutParams.gravity = 53;
                i3 = 0;
            }
            layoutParams2.setMargins(i3, i3, i3, i3);
            layoutParams2.gravity = 17;
        }
        closeButtonFlowManager.f14110a.setVisibility(0);
        closeButtonFlowManager.f14113d.setVisibility(0);
        closeButtonFlowManager.f14112c.setVisibility(0);
    }

    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f10325h;
        closeButtonFlowManager.f14111b.setBackgroundResource(C4167R.C4168drawable.ia_round_overlay_bg);
        closeButtonFlowManager.f14110a.setVisibility(0);
        closeButtonFlowManager.f14111b.setVisibility(0);
        closeButtonFlowManager.f14113d.setVisibility(8);
        closeButtonFlowManager.f14112c.setVisibility(8);
    }

    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.f10325h;
        closeButtonFlowManager.getClass();
        if (i > 0) {
            closeButtonFlowManager.f14111b.setText(Integer.toString(i));
        }
    }

    public boolean wasDismissedByUser() {
        return this.f10324g;
    }
}
