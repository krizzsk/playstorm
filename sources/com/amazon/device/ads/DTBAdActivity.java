package com.amazon.device.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.Serializable;
import java.util.Map;

public class DTBAdActivity extends Activity {
    static final String ADTYPE_ATTR = "ad_state";
    static final String EXPANDED = "expanded";
    static final String INDEX_ATTR = "cntrl_index";
    static final String TWO_PART_EXPAND = "two_part_expand";
    static final String URL_ATTR = "url";
    private final String LOG_TAG = DTBAdActivity.class.getSimpleName();
    DTBAdView adView;
    int index;
    RelativeLayout pageLayout;
    String type;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.pageLayout = relativeLayout;
        setContentView(relativeLayout);
        this.type = getIntent().getStringExtra(ADTYPE_ATTR);
        this.index = getIntent().getIntExtra(INDEX_ATTR, 0);
        if (this.type.equals(EXPANDED)) {
            createExpanded();
        }
        handleOrientation();
    }

    /* access modifiers changed from: package-private */
    public void handleOrientation() {
        Serializable serializableExtra = getIntent().getSerializableExtra("orientation");
        if (serializableExtra != null) {
            Map map = (Map) serializableExtra;
            boolean booleanValue = ((Boolean) map.get("allowOrientationChange")).booleanValue();
            String str = (String) map.get("forceOrientation");
            if (str == null) {
                return;
            }
            if ("portrait".equals(str)) {
                setRequestedOrientation(1);
            } else if ("landscape".equals(str)) {
                setRequestedOrientation(0);
            } else if (booleanValue) {
            } else {
                if (DisplayUtils.determineSimpleOrientation() == 2) {
                    setRequestedOrientation(6);
                } else {
                    setRequestedOrientation(7);
                }
            }
        }
    }

    private void createExpanded() {
        this.adView = new DTBAdView(this, new DTBAdExpandedListener() {
            public void onAdLoaded(DTBAdView dTBAdView) {
            }

            public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            }
        }, this.index);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra(TWO_PART_EXPAND, false);
        this.pageLayout.addView(this.adView, -1, -1);
        this.adView.fetchAdWithLocation(stringExtra);
        this.adView.setScrollEnabled(true);
        DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = (DTBAdMRAIDExpandedController) this.adView.getController();
        dTBAdMRAIDExpandedController.setTwoPartExpand(booleanExtra);
        dTBAdMRAIDExpandedController.addCloseIndicator();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public boolean isExpanded() {
        return EXPANDED.equals(this.type);
    }

    public void finish() {
        try {
            this.adView.getController().closeExpandedPartTwo();
        } catch (RuntimeException e) {
            DtbLog.error(this.LOG_TAG, "Fail to execute finish method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finish method", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void straightFinish() {
        super.finish();
    }
}
