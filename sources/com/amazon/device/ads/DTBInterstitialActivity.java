package com.amazon.device.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;

public class DTBInterstitialActivity extends Activity implements DTBMRAIDCloseButtonListener {
    private static final String LOG_TAG = DTBInterstitialActivity.class.getSimpleName();
    static DTBInterstitialActivity theRecent;
    LinearLayout closeIndicatorRegion;
    DTBAdInterstitial interstitial;

    static DTBInterstitialActivity getRecentInterstitialActivity() {
        return theRecent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            theRecent = this;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView(C1164R.layout.mdtb_interstitial_ad);
            if (getIntent().hasExtra("DTBAdInterstitialID")) {
                this.interstitial = DTBAdInterstitial.dtbAdInterstitialCache.get(getIntent().getStringExtra("DTBAdInterstitialID"));
            } else {
                this.interstitial = DTBAdInterstitial.getRecent();
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C1164R.C1166id.inter_container);
            final DTBAdView adView = this.interstitial.getAdView();
            adView.setScrollEnabled(false);
            ViewParent parent = adView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(adView);
            }
            this.closeIndicatorRegion = (LinearLayout) findViewById(C1164R.C1166id.mraid_close_indicator);
            relativeLayout.addView(adView, -1, -1);
            DTBAdMRAIDController controller = adView.getController();
            controller.setCustomButtonListener(this);
            if (controller.getDtbOmSdkSessionManager() != null) {
                controller.getDtbOmSdkSessionManager().addFriendlyObstruction(this.closeIndicatorRegion.findViewById(C1164R.C1166id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
            }
            this.closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C1164R.C1166id.mraid_close_indicator);
            linearLayout.bringToFront();
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(adView.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
            layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
            imageView.setImageDrawable(AppCompatResources.getDrawable(this, C1164R.C1165drawable.mraid_close));
            linearLayout.addView(imageView, layoutParams);
            linearLayout.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    adView.evaluateJavascript("window.mraid.close();", (ValueCallback<String>) null);
                    return true;
                }
            });
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to create DTBInterstitial Activity");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create DTBInterstitial Activity", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public boolean getUseCustomClose() {
        DTBAdInterstitial dTBAdInterstitial = this.interstitial;
        if (dTBAdInterstitial != null && dTBAdInterstitial.getAdView() != null && this.interstitial.getAdView().getController() != null) {
            return this.interstitial.getAdView().getController().useCustomClose;
        }
        String str = LOG_TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to get use custom close , due to ");
        sb.append(this.interstitial);
        DtbLog.info(str, sb.toString() == null ? "null DTBInterstitial instance" : "null AdView/Controller instance");
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        theRecent = null;
        DTBAdInterstitial.theRecent = null;
        DTBAdInterstitial dTBAdInterstitial = this.interstitial;
        if (dTBAdInterstitial != null && !DtbCommonUtils.isNullOrEmpty(dTBAdInterstitial.getAdView().getDtbAdInterstitialId())) {
            DTBAdInterstitial.dtbAdInterstitialCache.remove(this.interstitial.getAdView().getDtbAdInterstitialId());
        }
    }

    public void onBackPressed() {
        try {
            if (!getUseCustomClose()) {
                this.interstitial.getAdView().evaluateJavascript("window.mraid.close();", (ValueCallback<String>) null);
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute onBackPressed method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onBackPressed method", e);
        }
    }

    public void useCustomButtonUpdated() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBInterstitialActivity.this.lambda$useCustomButtonUpdated$0$DTBInterstitialActivity();
            }
        });
    }

    public /* synthetic */ void lambda$useCustomButtonUpdated$0$DTBInterstitialActivity() {
        this.closeIndicatorRegion.setVisibility(getUseCustomClose() ? 4 : 0);
    }
}
