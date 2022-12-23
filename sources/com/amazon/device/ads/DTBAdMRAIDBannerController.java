package com.amazon.device.ads;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

class DTBAdMRAIDBannerController extends DTBAdMRAIDController implements DTBMRAIDCloseButtonListener {
    private static final int ANIMATION_DURATION = 500;
    private static List<WeakReference<DTBAdMRAIDBannerController>> bannerControllers = new ArrayList();
    private static AtomicInteger indexDispencer = new AtomicInteger(100);
    private ObjectAnimator animater;
    private float animationProgress;
    DTBAdBannerListener bannerListener;
    private ViewGroup defaultParent;
    private AnimationPoint endAnimation;
    private ViewGroup expandedBackground;
    private int index = indexDispencer.incrementAndGet();
    private int originalHeight;
    private ViewGroup.LayoutParams originalParams;
    private int originalWidth;
    private float originalX;
    private int originalXPos;
    private float originalY;
    private int originalYPos;
    private AnimationPoint startAnimation;

    /* access modifiers changed from: protected */
    public String getPlacementType() {
        return TJAdUnitConstants.String.INLINE;
    }

    /* access modifiers changed from: protected */
    public boolean onBackPressed() {
        return false;
    }

    class AnimationPoint {
        int height;
        int width;
        int xPos;
        int yPos;

        AnimationPoint(int i, int i2, int i3, int i4) {
            this.xPos = i;
            this.yPos = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
    }

    DTBAdMRAIDBannerController(DTBAdView dTBAdView, DTBAdBannerListener dTBAdBannerListener) {
        super(dTBAdView);
        this.bannerListener = dTBAdBannerListener;
        this.customButtonListener = this;
    }

    /* access modifiers changed from: protected */
    public void onPageLoad() {
        try {
            if (!this.pageLoaded) {
                prepareMraid();
                this.bannerListener.onAdLoaded(getAdView());
                if (!getAdView().isVideo() && getDtbOmSdkSessionManager() != null) {
                    getDtbOmSdkSessionManager().displayAdEventLoaded();
                }
            }
        } catch (JSONException e) {
            DtbLog.error("Error:" + e.getMessage());
        }
        this.originalParams = getAdView().getLayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onMRAIDClose() {
        if (this.state == MraidStateType.RESIZED) {
            moveResizedToDefault();
        } else if (this.state == MraidStateType.EXPANDED) {
            moveExpandedToDefault();
        } else if (this.state == MraidStateType.DEFAULT) {
            setState(MraidStateType.HIDDEN);
            commandCompleted("close");
        } else {
            fireErrorEvent("close", "Command is not allowed in a given ad state:" + this.state.toString());
            commandCompleted("close");
        }
    }

    private void moveResizedToDefault() {
        moveResizedToDefault(500, false);
    }

    private void moveResizedToDefault(int i, boolean z) {
        new Handler(Looper.getMainLooper()).post(new Runnable(i, z) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                DTBAdMRAIDBannerController.this.lambda$moveResizedToDefault$0$DTBAdMRAIDBannerController(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: moveResizedToDefaultImpl */
    public void lambda$moveResizedToDefault$0$DTBAdMRAIDBannerController(int i, boolean z) {
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        animationPoint.height = this.originalHeight;
        this.endAnimation.width = this.originalWidth;
        this.endAnimation.xPos = this.originalXPos;
        this.endAnimation.yPos = this.originalYPos;
        ViewGroup viewGroup = (ViewGroup) getAdView().getParent();
        if (this.closeIndicatorRegion != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animationProgress", new float[]{0.0f, 1.0f});
        this.animater = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(viewGroup, z) {
            public final /* synthetic */ ViewGroup f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.this.lambda$moveResizedToDefaultImpl$1$DTBAdMRAIDBannerController(this.f$1, this.f$2, valueAnimator);
            }
        });
        this.animater.setDuration((long) i);
        this.animater.start();
    }

    public /* synthetic */ void lambda$moveResizedToDefaultImpl$1$DTBAdMRAIDBannerController(ViewGroup viewGroup, boolean z, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateResizedToDefaultListener(viewGroup, z);
        }
    }

    private void moveExpandedToDefault() {
        moveExpandedToDefault(500, false);
    }

    private void moveExpandedToDefault(int i, boolean z) {
        new Handler(Looper.getMainLooper()).post(new Runnable(i, z) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                DTBAdMRAIDBannerController.this.lambda$moveExpandedToDefault$2$DTBAdMRAIDBannerController(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: moveExpandedToDefaultImpl */
    public void lambda$moveExpandedToDefault$2$DTBAdMRAIDBannerController(int i, boolean z) {
        ViewGroup viewGroup;
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        ViewGroup viewGroup2 = (ViewGroup) getAdView().getParent();
        if (!(this.closeIndicatorRegion == null || (viewGroup = (ViewGroup) this.closeIndicatorRegion.getParent()) == null)) {
            viewGroup.removeView(this.closeIndicatorRegion);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animationProgress", new float[]{0.0f, 1.0f});
        this.animater = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(viewGroup2, z) {
            public final /* synthetic */ ViewGroup f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DTBAdMRAIDBannerController.this.lambda$moveExpandedToDefaultImpl$3$DTBAdMRAIDBannerController(this.f$1, this.f$2, valueAnimator);
            }
        });
        this.animater.setDuration((long) i);
        this.animater.start();
    }

    public /* synthetic */ void lambda$moveExpandedToDefaultImpl$3$DTBAdMRAIDBannerController(ViewGroup viewGroup, boolean z, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateExpandedToDefaultListener(viewGroup, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDUnload() {
        if (this.state == MraidStateType.RESIZED) {
            moveResizedToDefault(10, true);
        } else if (this.state == MraidStateType.EXPANDED) {
            moveExpandedToDefault(10, true);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    DTBAdMRAIDBannerController.this.lambda$onMRAIDUnload$4$DTBAdMRAIDBannerController();
                }
            });
        }
    }

    public /* synthetic */ void lambda$onMRAIDUnload$4$DTBAdMRAIDBannerController() {
        getAdView().loadUrl("about:blank");
        commandCompleted(MraidJsMethods.UNLOAD);
    }

    /* access modifiers changed from: protected */
    public void onResize(Map<String, Object> map) {
        if (this.state == MraidStateType.DEFAULT || this.state == MraidStateType.RESIZED) {
            try {
                int i = 0;
                int intValue = map.containsKey("offsetX") ? ((Integer) map.get("offsetX")).intValue() : 0;
                if (map.containsKey("offsetY")) {
                    i = ((Integer) map.get("offsetY")).intValue();
                }
                new Handler(Looper.getMainLooper()).post(new Runnable(intValue, i, ((Integer) map.get("width")).intValue(), ((Integer) map.get("height")).intValue(), ((Boolean) map.get("allowOffscreen")).booleanValue()) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ int f$3;
                    public final /* synthetic */ int f$4;
                    public final /* synthetic */ boolean f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    public final void run() {
                        DTBAdMRAIDBannerController.this.lambda$onResize$5$DTBAdMRAIDBannerController(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                    }
                });
            } catch (Exception unused) {
                fireErrorEvent(MraidJsMethods.RESIZE, "invalid input parameters");
                commandCompleted(MraidJsMethods.RESIZE);
            }
        } else {
            fireErrorEvent(MraidJsMethods.RESIZE, "invalid current state");
            commandCompleted(MraidJsMethods.RESIZE);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc  */
    /* renamed from: onResizeImpl */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onResize$5$DTBAdMRAIDBannerController(int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r6 = r15
            com.amazon.device.ads.DTBAdView r0 = r15.getAdView()
            android.view.ViewGroup r7 = com.amazon.device.ads.DTBAdUtil.getRootView(r0)
            if (r7 != 0) goto L_0x0016
            java.lang.String r0 = "resize"
            java.lang.String r1 = "rootview doesn't exist"
            r15.fireErrorEvent(r0, r1)
            r15.commandCompleted(r0)
            return
        L_0x0016:
            r15.removeCloseIndicator()
            r8 = 2
            int[] r0 = new int[r8]
            com.amazon.device.ads.DTBAdView r1 = r15.getAdView()
            r1.getLocationInWindow(r0)
            int[] r1 = new int[r8]
            r7.getLocationInWindow(r1)
            android.view.ViewGroup r2 = r6.defaultParent
            r3 = 1
            r9 = 0
            if (r2 != 0) goto L_0x0080
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            float r2 = r2.getX()
            r6.originalX = r2
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            float r2 = r2.getY()
            r6.originalY = r2
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            int r2 = r2.getWidth()
            r6.originalWidth = r2
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            int r2 = r2.getHeight()
            r6.originalHeight = r2
            r2 = r0[r9]
            r4 = r1[r9]
            int r2 = r2 - r4
            r6.originalXPos = r2
            r2 = r0[r3]
            r4 = r1[r3]
            int r2 = r2 - r4
            r6.originalYPos = r2
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.defaultParent = r2
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            r2.setIgnoreDetachment()
            android.view.ViewGroup r2 = r6.defaultParent
            com.amazon.device.ads.DTBAdView r4 = r15.getAdView()
            r2.removeView(r4)
        L_0x0080:
            int r10 = r7.getHeight()
            int r11 = r7.getWidth()
            int r2 = r6.originalXPos
            int r4 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r16)
            int r2 = r2 + r4
            int r4 = r6.originalYPos
            int r5 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r17)
            int r4 = r4 + r5
            if (r20 != 0) goto L_0x00aa
            int r5 = r11 + -20
            if (r2 <= r5) goto L_0x009d
            r2 = r5
        L_0x009d:
            if (r2 >= 0) goto L_0x00a0
            r2 = r9
        L_0x00a0:
            int r5 = r10 + -20
            if (r4 <= r5) goto L_0x00a5
            r4 = r5
        L_0x00a5:
            if (r4 >= 0) goto L_0x00aa
            r12 = r2
            r13 = r9
            goto L_0x00ac
        L_0x00aa:
            r12 = r2
            r13 = r4
        L_0x00ac:
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r14 = new com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint
            r2 = r0[r9]
            r4 = r1[r9]
            int r2 = r2 - r4
            r0 = r0[r3]
            r1 = r1[r3]
            int r3 = r0 - r1
            com.amazon.device.ads.DTBAdView r0 = r15.getAdView()
            int r4 = r0.getWidth()
            com.amazon.device.ads.DTBAdView r0 = r15.getAdView()
            int r5 = r0.getHeight()
            r0 = r14
            r1 = r15
            r0.<init>(r2, r3, r4, r5)
            r6.startAnimation = r14
            int r0 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r18)
            int r1 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r19)
            if (r20 != 0) goto L_0x00f0
            int r2 = r12 + r0
            if (r2 >= r11) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            int r0 = r11 - r12
        L_0x00e1:
            if (r0 >= 0) goto L_0x00e4
            r0 = r9
        L_0x00e4:
            int r2 = r13 + r1
            if (r2 >= r10) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            int r1 = r10 - r13
        L_0x00eb:
            if (r1 >= 0) goto L_0x00f0
            r10 = r9
            r9 = r0
            goto L_0x00f2
        L_0x00f0:
            r9 = r0
            r10 = r1
        L_0x00f2:
            com.amazon.device.ads.DTBAdView r0 = r15.getAdView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r7) goto L_0x0124
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            com.amazon.device.ads.DTBAdView r1 = r15.getAdView()
            int r1 = r1.getWidth()
            com.amazon.device.ads.DTBAdView r2 = r15.getAdView()
            int r2 = r2.getHeight()
            r0.<init>(r1, r2)
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r1 = r6.startAnimation
            int r1 = r1.xPos
            r0.leftMargin = r1
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r1 = r6.startAnimation
            int r1 = r1.yPos
            r0.topMargin = r1
            com.amazon.device.ads.DTBAdView r1 = r15.getAdView()
            r7.addView(r1, r0)
        L_0x0124:
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r7 = new com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint
            r0 = r7
            r1 = r15
            r2 = r12
            r3 = r13
            r4 = r9
            r5 = r10
            r0.<init>(r2, r3, r4, r5)
            r6.endAnimation = r7
            int r0 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r9)
            float r0 = (float) r0
            int r1 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r10)
            float r1 = (float) r1
            r15.setCurrentPositionProperty(r0, r1)
            float[] r0 = new float[r8]
            r0 = {0, 1065353216} // fill-array
            java.lang.String r1 = "animationProgress"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r15, r1, r0)
            r6.animater = r7
            com.amazon.device.ads.-$$Lambda$DTBAdMRAIDBannerController$opeqKY6zpuyt8L0fRyJ_n_tQ8JU r8 = new com.amazon.device.ads.-$$Lambda$DTBAdMRAIDBannerController$opeqKY6zpuyt8L0fRyJ_n_tQ8JU
            r0 = r8
            r1 = r15
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r2, r3, r4, r5)
            r7.addUpdateListener(r8)
            android.animation.ObjectAnimator r0 = r6.animater
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r6.animater
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDBannerController.lambda$onResize$5$DTBAdMRAIDBannerController(int, int, int, int, boolean):void");
    }

    public /* synthetic */ void lambda$onResizeImpl$6$DTBAdMRAIDBannerController(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i), DTBAdUtil.pixelsToDeviceIndependenPixels(i2));
            addCloseIndicator(i3 + i, i4);
            commandCompleted(MraidJsMethods.RESIZE);
            setState(MraidStateType.RESIZED);
            this.animater = null;
            getAdView().computeExposure(true);
        }
    }

    /* access modifiers changed from: protected */
    public void expand(Map<String, Object> map) {
        if (!this.state.equals(MraidStateType.DEFAULT)) {
            fireErrorEvent(MraidJsMethods.EXPAND, "current state does not allow transition to expand");
            commandCompleted(MraidJsMethods.EXPAND);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable(map) {
            public final /* synthetic */ Map f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DTBAdMRAIDBannerController.this.lambda$expand$7$DTBAdMRAIDBannerController(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$expand$7$DTBAdMRAIDBannerController(Map map) {
        if (((String) map.get("url")) != null) {
            executeTwoPartsExpand(map);
        } else {
            executeOnePartExpand(map);
        }
    }

    private void executeTwoPartsExpand(Map<String, Object> map) {
        String str = (String) map.get("url");
        Activity activity = DTBAdUtil.getActivity(getAdView());
        Intent intent = new Intent(activity, DTBAdActivity.class);
        if (str != null) {
            intent.putExtra("url", str);
        }
        intent.putExtra("ad_state", "expanded");
        intent.putExtra("cntrl_index", this.index);
        intent.putExtra("two_part_expand", true);
        if (map.get("orientation") != null) {
            intent.putExtra("orientation", (Serializable) map.get("orientation"));
        }
        activity.startActivity(intent);
        commandCompleted(MraidJsMethods.EXPAND);
        setState(MraidStateType.EXPANDED);
        bannerControllers.add(new WeakReference(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a1, code lost:
        r2 = ((java.lang.Integer) r15.get("width")).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void executeOnePartExpand(java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r14 = this;
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            float r0 = r0.getX()
            r14.originalX = r0
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            float r0 = r0.getY()
            r14.originalY = r0
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            android.view.ViewGroup r0 = com.amazon.device.ads.DTBAdUtil.getRootView(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r15 = "expand"
            java.lang.String r0 = "rootview doesn't exist in one part expand"
            r14.fireErrorEvent(r15, r0)
            r14.commandCompleted(r15)
            return
        L_0x0029:
            r1 = 2
            int[] r2 = new int[r1]
            com.amazon.device.ads.DTBAdView r3 = r14.getAdView()
            r3.getLocationInWindow(r2)
            com.amazon.device.ads.DTBAdView r3 = r14.getAdView()
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r14.defaultParent = r3
            com.amazon.device.ads.DTBAdView r3 = r14.getAdView()
            r3.setIgnoreDetachment()
            android.view.ViewGroup r3 = r14.defaultParent
            com.amazon.device.ads.DTBAdView r4 = r14.getAdView()
            r3.removeView(r4)
            int[] r3 = new int[r1]
            r0.getLocationInWindow(r3)
            int r4 = r0.getHeight()
            int r5 = r0.getWidth()
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r12 = new com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint
            r13 = 0
            r6 = r2[r13]
            r7 = r3[r13]
            int r8 = r6 - r7
            r6 = 1
            r2 = r2[r6]
            r3 = r3[r6]
            int r9 = r2 - r3
            com.amazon.device.ads.DTBAdView r2 = r14.getAdView()
            int r10 = r2.getWidth()
            com.amazon.device.ads.DTBAdView r2 = r14.getAdView()
            int r11 = r2.getHeight()
            r6 = r12
            r7 = r14
            r6.<init>(r8, r9, r10, r11)
            r14.startAnimation = r12
            java.lang.String r2 = "position"
            boolean r3 = r15.containsKey(r2)
            if (r3 == 0) goto L_0x00df
            java.lang.Object r3 = r15.get(r2)
            boolean r3 = r3 instanceof java.util.Map
            if (r3 == 0) goto L_0x00df
            java.lang.Object r15 = r15.get(r2)
            java.util.Map r15 = (java.util.Map) r15
            java.lang.String r2 = "width"
            boolean r3 = r15.containsKey(r2)
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r2 = r15.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L_0x00b2
            int r2 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r2)
            goto L_0x00b3
        L_0x00b2:
            r2 = r5
        L_0x00b3:
            java.lang.String r3 = "height"
            boolean r6 = r15.containsKey(r3)
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r3 = r15.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto L_0x00cc
            int r3 = com.amazon.device.ads.DTBAdUtil.sizeToDevicePixels(r3)
            r4 = r3
        L_0x00cc:
            java.lang.String r3 = "useCustomClose"
            boolean r6 = r15.containsKey(r3)
            if (r6 == 0) goto L_0x00e0
            java.lang.Object r15 = r15.get(r3)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            goto L_0x00e1
        L_0x00df:
            r2 = r5
        L_0x00e0:
            r15 = r13
        L_0x00e1:
            com.amazon.device.ads.DTBAdMRAIDBannerController$BackgroundView r3 = new com.amazon.device.ads.DTBAdMRAIDBannerController$BackgroundView
            com.amazon.device.ads.DTBAdView r6 = r14.getAdView()
            android.content.Context r6 = r6.getContext()
            r3.<init>(r6)
            r14.expandedBackground = r3
            r3.setBackgroundColor(r13)
            r6 = -1
            r0.addView(r3, r6, r6)
            android.view.ViewGroup$MarginLayoutParams r6 = new android.view.ViewGroup$MarginLayoutParams
            com.amazon.device.ads.DTBAdView r7 = r14.getAdView()
            int r7 = r7.getWidth()
            com.amazon.device.ads.DTBAdView r8 = r14.getAdView()
            int r8 = r8.getHeight()
            r6.<init>(r7, r8)
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r7 = r14.startAnimation
            int r7 = r7.xPos
            r6.leftMargin = r7
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r7 = r14.startAnimation
            int r7 = r7.yPos
            r6.topMargin = r7
            r0.bringChildToFront(r3)
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            r3.addView(r0, r6)
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r3 = r14.startAnimation
            int r3 = r3.xPos
            float r3 = (float) r3
            r0.setX(r3)
            com.amazon.device.ads.DTBAdView r0 = r14.getAdView()
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r3 = r14.startAnimation
            int r3 = r3.yPos
            float r3 = (float) r3
            r0.setY(r3)
            com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint r0 = new com.amazon.device.ads.DTBAdMRAIDBannerController$AnimationPoint
            r8 = 0
            r9 = 0
            r6 = r0
            r7 = r14
            r10 = r2
            r11 = r4
            r6.<init>(r8, r9, r10, r11)
            r14.endAnimation = r0
            int r0 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r2)
            float r0 = (float) r0
            int r2 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r4)
            float r2 = (float) r2
            r14.setCurrentPositionProperty(r0, r2)
            float[] r0 = new float[r1]
            r0 = {0, 1065353216} // fill-array
            java.lang.String r1 = "animationProgress"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r14, r1, r0)
            r14.animater = r0
            com.amazon.device.ads.-$$Lambda$DTBAdMRAIDBannerController$D7A5aQwm6oKptCOJ1ikzM0pL3SE r1 = new com.amazon.device.ads.-$$Lambda$DTBAdMRAIDBannerController$D7A5aQwm6oKptCOJ1ikzM0pL3SE
            r1.<init>(r5, r15)
            r0.addUpdateListener(r1)
            android.animation.ObjectAnimator r15 = r14.animater
            r0 = 500(0x1f4, double:2.47E-321)
            r15.setDuration(r0)
            android.animation.ObjectAnimator r15 = r14.animater
            r15.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDBannerController.executeOnePartExpand(java.util.Map):void");
    }

    public /* synthetic */ void lambda$executeOnePartExpand$8$DTBAdMRAIDBannerController(int i, boolean z, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            addCloseIndicator(i, 0, z);
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
            setState(MraidStateType.EXPANDED);
            commandCompleted(MraidJsMethods.EXPAND);
            this.animater = null;
            getAdView().computeExposure(true);
        }
    }

    private Float updateAdViewLayout(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = getAdView().getLayoutParams();
        getAdView().setX(((float) this.startAnimation.xPos) + (((float) (this.endAnimation.xPos - this.startAnimation.xPos)) * f.floatValue()));
        getAdView().setY(((float) this.startAnimation.yPos) + (((float) (this.endAnimation.yPos - this.startAnimation.yPos)) * f.floatValue()));
        layoutParams.width = (int) (((float) this.startAnimation.width) + (((float) (this.endAnimation.width - this.startAnimation.width)) * f.floatValue()));
        layoutParams.height = (int) (((float) this.startAnimation.height) + (((float) (this.endAnimation.height - this.startAnimation.height)) * f.floatValue()));
        getAdView().setLayoutParams(layoutParams);
        getAdView().invalidate();
        return f;
    }

    private void updateResizedToDefaultListener(ViewGroup viewGroup, boolean z) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        this.defaultParent.addView(getAdView(), this.originalParams);
        this.defaultParent.requestLayout();
        getAdView().invalidate();
        setCurrentPositionProperty();
        this.defaultParent = null;
        fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
        setState(MraidStateType.DEFAULT);
        this.animater = null;
        commandCompleted("close");
        if (z) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    DTBAdMRAIDBannerController.this.mo11728xb5450449();
                }
            }, 500);
        }
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                DTBAdMRAIDBannerController.this.mo11727x1c68753b();
            }
        }, 100);
    }

    /* renamed from: lambda$updateResizedToDefaultListener$9$DTBAdMRAIDBannerController */
    public /* synthetic */ void mo11728xb5450449() {
        getAdView().loadUrl("about:blank");
        commandCompleted(MraidJsMethods.UNLOAD);
    }

    /* renamed from: lambda$updateResizedToDefaultListener$10$DTBAdMRAIDBannerController */
    public /* synthetic */ void mo11727x1c68753b() {
        getAdView().computeExposure(true);
    }

    private void updateExpandedToDefaultListener(ViewGroup viewGroup, boolean z) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        ViewGroup viewGroup2 = this.expandedBackground;
        if (viewGroup2 != null) {
            ((ViewGroup) viewGroup2.getParent()).removeView(this.expandedBackground);
            this.expandedBackground = null;
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.height));
        }
        this.defaultParent.addView(getAdView(), this.originalParams);
        this.defaultParent.requestLayout();
        setCurrentPositionProperty();
        setState(MraidStateType.DEFAULT);
        commandCompleted("close");
        this.defaultParent = null;
        this.animater = null;
        if (z) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    DTBAdMRAIDBannerController.this.mo11725x5120b7e5();
                }
            }, 500);
        }
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                DTBAdMRAIDBannerController.this.mo11726x41f1bf44();
            }
        }, 100);
    }

    /* renamed from: lambda$updateExpandedToDefaultListener$11$DTBAdMRAIDBannerController */
    public /* synthetic */ void mo11725x5120b7e5() {
        getAdView().loadUrl("about:blank");
        commandCompleted(MraidJsMethods.UNLOAD);
    }

    /* renamed from: lambda$updateExpandedToDefaultListener$12$DTBAdMRAIDBannerController */
    public /* synthetic */ void mo11726x41f1bf44() {
        getAdView().computeExposure(true);
    }

    class ExpandedBannerListener implements DTBAdExpandedListener {
        public void onAdLoaded(DTBAdView dTBAdView) {
        }

        ExpandedBannerListener() {
        }

        public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.this);
        }
    }

    /* access modifiers changed from: package-private */
    public void openExpanded() {
        setState(MraidStateType.EXPANDED);
    }

    static DTBAdMRAIDBannerController findControllerByIndex(int i) {
        for (WeakReference<DTBAdMRAIDBannerController> weakReference : bannerControllers) {
            DTBAdMRAIDBannerController dTBAdMRAIDBannerController = (DTBAdMRAIDBannerController) weakReference.get();
            if (dTBAdMRAIDBannerController != null && dTBAdMRAIDBannerController.index == i) {
                return dTBAdMRAIDBannerController;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void closeExpandedPartTwo() {
        setState(MraidStateType.DEFAULT);
    }

    public void useCustomButtonUpdated() {
        if (this.state == MraidStateType.EXPANDED && this.closeIndicatorRegion != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    DTBAdMRAIDBannerController.this.lambda$useCustomButtonUpdated$13$DTBAdMRAIDBannerController();
                }
            });
        }
    }

    public /* synthetic */ void lambda$useCustomButtonUpdated$13$DTBAdMRAIDBannerController() {
        this.closeIndicatorRegion.setVisibility(this.useCustomClose ? 4 : 0);
    }

    /* access modifiers changed from: protected */
    public void onAdClicked() {
        DTBAdView dTBAdView = this.adView;
        if (this.bannerListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(dTBAdView) {
                public final /* synthetic */ View f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DTBAdMRAIDBannerController.this.lambda$onAdClicked$14$DTBAdMRAIDBannerController(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onAdClicked$14$DTBAdMRAIDBannerController(View view) {
        this.bannerListener.onAdClicked(view);
    }

    class BackgroundView extends LinearLayout {
        BackgroundView(Context context) {
            super(context);
            setOrientation(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBAdMRAIDBannerController.this.lambda$onAdLeftApplication$15$DTBAdMRAIDBannerController();
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    public /* synthetic */ void lambda$onAdLeftApplication$15$DTBAdMRAIDBannerController() {
        this.bannerListener.onAdOpen(this.adView);
        this.bannerListener.onAdLeftApplication(this.adView);
    }

    public void onActivityResumed(Activity activity) {
        this.bannerListener.onAdClosed(this.adView);
    }

    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener((DTBActivityListener) null);
    }

    /* access modifiers changed from: protected */
    public void onAdRemoved() {
        ViewGroup viewGroup;
        super.onAdRemoved();
        removeCloseIndicator();
        ObjectAnimator objectAnimator = this.animater;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        if (!isVisibleRecyclerOrListView(this.adView.getParent())) {
            this.adView.setVisibility(8);
        }
        if (this.state == MraidStateType.RESIZED) {
            ViewParent parent = this.adView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.adView);
            }
        } else if (this.state == MraidStateType.EXPANDED && (viewGroup = this.expandedBackground) != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.expandedBackground.getParent()).removeView(this.expandedBackground);
        }
    }

    /* access modifiers changed from: package-private */
    public void passLoadError() {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        this.bannerListener.onAdFailed(this.adView);
    }

    /* access modifiers changed from: protected */
    public void impressionFired() {
        this.bannerListener.onImpressionFired(this.adView);
        super.impressionFired();
    }

    private boolean isVisibleRecyclerOrListView(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        if (viewParent.toString().toLowerCase().contains("recyclerview") || viewParent.toString().toLowerCase().contains("listview")) {
            return true;
        }
        return isVisibleRecyclerOrListView(viewParent.getParent());
    }
}
