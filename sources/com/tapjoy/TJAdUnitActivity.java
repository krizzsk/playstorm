package com.tapjoy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11636fo;
import com.tapjoy.internal.C11714hj;

public class TJAdUnitActivity extends Activity implements View.OnClickListener {

    /* renamed from: c */
    private static TJAdUnitActivity f27262c;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public TJAdUnit f27263a;

    /* renamed from: b */
    private final Handler f27264b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private TJPlacementData f27265d;

    /* renamed from: e */
    private TJAdUnitSaveStateData f27266e = new TJAdUnitSaveStateData();

    /* renamed from: f */
    private RelativeLayout f27267f = null;

    /* renamed from: g */
    private TJCloseButton f27268g;

    /* renamed from: h */
    private ProgressBar f27269h;

    /* renamed from: i */
    private boolean f27270i = false;

    /* renamed from: j */
    private boolean f27271j = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TapjoyLog.m33194d("TJAdUnitActivity", "TJAdUnitActivity onCreate: ".concat(String.valueOf(bundle)));
        super.onCreate(bundle);
        f27262c = this;
        if (bundle != null) {
            TJAdUnitSaveStateData tJAdUnitSaveStateData = (TJAdUnitSaveStateData) bundle.getSerializable("ad_unit_bundle");
            this.f27266e = tJAdUnitSaveStateData;
            if (tJAdUnitSaveStateData != null && tJAdUnitSaveStateData.isVideoComplete) {
                TapjoyLog.m33194d("TJAdUnitActivity", "finishing TJAdUnitActivity");
                finish();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA) == null) {
            TapjoyLog.m33195e("TJAdUnitActivity", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to launch AdUnit Activity"));
            finish();
            return;
        }
        TJPlacementData tJPlacementData = (TJPlacementData) extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA);
        this.f27265d = tJPlacementData;
        if (tJPlacementData.getContentViewId() != null) {
            TapjoyConnectCore.viewWillOpen(this.f27265d.getContentViewId(), 1);
        }
        if (TJPlacementManager.m33111a(this.f27265d.getKey()) != null) {
            this.f27263a = TJPlacementManager.m33111a(this.f27265d.getKey()).getAdUnit();
        } else {
            this.f27263a = new TJAdUnit();
            this.f27263a.setAdContentTracker(new C11636fo(this.f27265d.getPlacementName(), this.f27265d.getPlacementType()));
        }
        if (!this.f27263a.hasCalledLoad()) {
            TapjoyLog.m33194d("TJAdUnitActivity", "No content loaded for ad unit -- loading now");
            this.f27263a.load(this.f27265d, false, this);
        }
        this.f27263a.setAdUnitActivity(this);
        if (Build.VERSION.SDK_INT < 11) {
            setTheme(16973829);
        } else {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().setFlags(16777216, 16777216);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f27267f = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f27267f.setBackgroundColor(0);
        try {
            TJWebView backgroundWebView = this.f27263a.getBackgroundWebView();
            backgroundWebView.setLayoutParams(layoutParams);
            if (backgroundWebView.getParent() != null) {
                ((ViewGroup) backgroundWebView.getParent()).removeView(backgroundWebView);
            }
            TJWebView webView = this.f27263a.getWebView();
            webView.setLayoutParams(layoutParams);
            if (webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            this.f27267f.addView(backgroundWebView);
            VideoView videoView = this.f27263a.getVideoView();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            if (videoView.getParent() != null) {
                ((ViewGroup) videoView.getParent()).removeView(videoView);
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setGravity(17);
            linearLayout.addView(videoView, new LinearLayout.LayoutParams(-1, -1));
            this.f27267f.addView(linearLayout, layoutParams2);
            this.f27267f.addView(webView);
            this.f27269h = new ProgressBar(this, (AttributeSet) null, 16842874);
            if (this.f27265d.hasProgressSpinner()) {
                setProgressSpinnerVisibility(true);
            } else {
                setProgressSpinnerVisibility(false);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            this.f27269h.setLayoutParams(layoutParams3);
            this.f27267f.addView(this.f27269h);
            TJCloseButton tJCloseButton = new TJCloseButton(this);
            this.f27268g = tJCloseButton;
            tJCloseButton.setOnClickListener(this);
            this.f27267f.addView(this.f27268g);
            setContentView(this.f27267f);
            this.f27263a.setVisible(true);
        } catch (Exception e) {
            TapjoyLog.m33196e("TJAdUnitActivity", e.getMessage());
        }
        TJCorePlacement a = TJPlacementManager.m33111a(this.f27265d.getKey());
        if (a != null) {
            String str = TJCorePlacement.f27342a;
            TapjoyLog.m33197i(str, "Content shown for placement " + a.f27345c.getPlacementName());
            a.f27348f.mo72523b();
            TJPlacement a2 = a.mo71875a("SHOW");
            if (!(a2 == null || a2.getListener() == null)) {
                a2.getListener().onContentShow(a2);
            }
            if (this.f27263a.getSdkBeacon() != null) {
                this.f27263a.getSdkBeacon().mo72530a();
            }
        }
    }

    public void setCloseButtonVisibility(boolean z) {
        if (z) {
            this.f27268g.setVisibility(0);
        } else {
            this.f27268g.setVisibility(4);
        }
    }

    public void setCloseButtonClickable(boolean z) {
        this.f27268g.setClickableRequested(z);
    }

    public void setProgressSpinnerVisibility(boolean z) {
        if (z) {
            this.f27269h.setVisibility(0);
        } else {
            this.f27269h.setVisibility(4);
        }
    }

    public void onBackPressed() {
        handleClose();
    }

    public void handleClose() {
        handleClose(false);
    }

    public void handleClose(boolean z) {
        if (!this.f27263a.getCloseRequested()) {
            TapjoyLog.m33194d("TJAdUnitActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
            this.f27263a.closeRequested(z);
            this.f27264b.postDelayed(new Runnable() {
                public final void run() {
                    if (TJAdUnitActivity.this.f27263a.getCloseRequested()) {
                        TapjoyLog.m33194d("TJAdUnitActivity", "Did not receive callback from content. Closing ad.");
                        TJAdUnitActivity.this.finish();
                    }
                }
            }, 1000);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        TJPlacementData tJPlacementData = this.f27265d;
        if ((tJPlacementData != null && !tJPlacementData.shouldHandleDismissOnPause()) || !this.f27271j) {
            m33049b();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        TapjoyLog.m33194d("TJAdUnitActivity", "onResume");
        super.onResume();
        if (this.f27263a.isLockedOrientation()) {
            setRequestedOrientation(this.f27263a.getLockedOrientation());
        }
        this.f27263a.resume(this.f27266e);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        TapjoyLog.m33194d("TJAdUnitActivity", "onStart");
        if (C11714hj.m33999a().f28492m) {
            this.f27270i = true;
            C11714hj.m33999a().mo72612a((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        TJPlacementData tJPlacementData;
        super.onPause();
        TapjoyLog.m33194d("TJAdUnitActivity", "onPause");
        this.f27263a.pause();
        if (isFinishing() && (tJPlacementData = this.f27265d) != null && tJPlacementData.shouldHandleDismissOnPause()) {
            TapjoyLog.m33194d("TJAdUnitActivity", "is Finishing");
            m33049b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TapjoyLog.m33194d("TJAdUnitActivity", "onSaveInstanceState");
        this.f27266e.seekTime = this.f27263a.getVideoSeekTime();
        this.f27266e.isVideoComplete = this.f27263a.isVideoComplete();
        this.f27266e.isVideoMuted = this.f27263a.isMuted();
        bundle.putSerializable("ad_unit_bundle", this.f27266e);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f27270i) {
            this.f27270i = false;
            C11714hj.m33999a().mo72623b((Activity) this);
        }
        super.onStop();
        TapjoyLog.m33194d("TJAdUnitActivity", "onStop");
    }

    public void showErrorDialog() {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AlertDialog.Builder(this, 16974394).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(this).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        }
    }

    public void onClick(View view) {
        handleClose();
    }

    /* renamed from: a */
    static void m33048a() {
        TJAdUnitActivity tJAdUnitActivity = f27262c;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.handleClose(true);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27263a.notifyOrientationChanged();
    }

    /* renamed from: b */
    private void m33049b() {
        f27262c = null;
        this.f27271j = true;
        TJAdUnit tJAdUnit = this.f27263a;
        if (tJAdUnit != null) {
            tJAdUnit.destroy();
        }
        TJPlacementData tJPlacementData = this.f27265d;
        if (tJPlacementData != null) {
            if (tJPlacementData.getContentViewId() != null) {
                TapjoyConnectCore.viewDidClose(this.f27265d.getContentViewId());
            }
            TJCorePlacement a = TJPlacementManager.m33111a(this.f27265d.getKey());
            if (a != null) {
                a.mo71883d();
            }
        }
    }
}
