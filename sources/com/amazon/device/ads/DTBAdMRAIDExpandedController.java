package com.amazon.device.ads;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Map;
import org.json.JSONException;

class DTBAdMRAIDExpandedController extends DTBAdMRAIDController {
    static final String LOG_TAG = DTBAdMRAIDExpandedController.class.getSimpleName();
    private DTBAdMRAIDBannerController masterController;

    /* access modifiers changed from: protected */
    public void onAdLeftApplication() {
    }

    /* access modifiers changed from: package-private */
    public void setMasterController(DTBAdMRAIDBannerController dTBAdMRAIDBannerController) {
        this.masterController = dTBAdMRAIDBannerController;
    }

    DTBAdMRAIDExpandedController(DTBAdView dTBAdView) {
        super(dTBAdView);
    }

    /* access modifiers changed from: protected */
    public void onResize(Map<String, Object> map) {
        fireErrorEvent(MraidJsMethods.RESIZE, "Expanded View does not allow resize");
        commandCompleted(MraidJsMethods.RESIZE);
    }

    /* access modifiers changed from: protected */
    public void expand(Map<String, Object> map) {
        fireErrorEvent(MraidJsMethods.EXPAND, "Expanded View does not allow expand");
        commandCompleted(MraidJsMethods.EXPAND);
    }

    /* access modifiers changed from: protected */
    public MraidStateType getInitialStateType() {
        return MraidStateType.EXPANDED;
    }

    /* access modifiers changed from: protected */
    public void onPageLoad() {
        try {
            prepareMraid();
            if (getDtbOmSdkSessionManager() != null) {
                getDtbOmSdkSessionManager().registerAdView(getAdView());
            }
        } catch (JSONException e) {
            DtbLog.error("Error:" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void addCloseIndicator() {
        addCloseIndicator(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DTBAdMRAIDExpandedController.this.lambda$addCloseIndicator$0$DTBAdMRAIDExpandedController(view, motionEvent);
            }
        });
    }

    public /* synthetic */ boolean lambda$addCloseIndicator$0$DTBAdMRAIDExpandedController(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        closeExpandedPartTwo();
        return true;
    }

    /* access modifiers changed from: protected */
    public void layoutCloseIndicator() {
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 0;
        rootView.addView(this.closeIndicatorRegion, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void addCloseIndicator(View.OnTouchListener onTouchListener) {
        createContentIndicator();
        layoutCloseIndicator();
        setCloseIndicatorContent(onTouchListener);
    }

    /* access modifiers changed from: protected */
    public void onMRAIDClose() {
        closeExpandedPartTwo();
    }

    /* access modifiers changed from: protected */
    public void closeExpandedPartTwo() {
        DTBAdMRAIDBannerController findControllerByIndex;
        DTBAdActivity dTBAdActivity = (DTBAdActivity) DTBAdUtil.getActivity(getAdView());
        Intent intent = dTBAdActivity.getIntent();
        if (!(intent == null || (findControllerByIndex = DTBAdMRAIDBannerController.findControllerByIndex(intent.getIntExtra("cntrl_index", -1))) == null)) {
            findControllerByIndex.closeExpandedPartTwo();
        }
        dTBAdActivity.straightFinish();
    }

    /* access modifiers changed from: package-private */
    public void passLoadError() {
        DTBAdMRAIDBannerController dTBAdMRAIDBannerController = this.masterController;
        if (dTBAdMRAIDBannerController != null) {
            dTBAdMRAIDBannerController.passLoadError();
        }
    }
}
