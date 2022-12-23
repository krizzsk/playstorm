package com.tapjoy;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

public class TJCloseButton extends ImageButton {

    /* renamed from: a */
    private static final String f27331a = TJCloseButton.class.getSimpleName();

    /* renamed from: b */
    private ClosePosition f27332b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f27333c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f27334d;

    public enum ClosePosition {
        TOP_LEFT(new int[]{10, 9}),
        TOP_CENTER(new int[]{10, 14}),
        TOP_RIGHT(new int[]{10, 11}),
        CENTER(new int[]{13}),
        BOTTOM_LEFT(new int[]{12, 9}),
        BOTTOM_CENTER(new int[]{12, 14}),
        BOTTOM_RIGHT(new int[]{12, 11});
        

        /* renamed from: a */
        final RelativeLayout.LayoutParams f27338a;

        private ClosePosition(int[] iArr) {
            this.f27338a = new RelativeLayout.LayoutParams((int) (((double) TapjoyConnectCore.getDeviceScreenDensityScale()) * 75.0d), (int) (((double) TapjoyConnectCore.getDeviceScreenDensityScale()) * 75.0d));
            for (int addRule : iArr) {
                this.f27338a.addRule(addRule);
            }
            int deviceScreenDensityScale = (int) (TapjoyConnectCore.getDeviceScreenDensityScale() * -10.0f);
            this.f27338a.setMargins(0, deviceScreenDensityScale, deviceScreenDensityScale, 0);
        }
    }

    public TJCloseButton(Context context) {
        this(context, ClosePosition.TOP_RIGHT);
    }

    public TJCloseButton(Context context, ClosePosition closePosition) {
        super(context);
        this.f27333c = true;
        this.f27332b = closePosition;
        setImageBitmap(TapjoyIcons.getCloseCircularImage(new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale()));
        setScaleType(ImageView.ScaleType.FIT_XY);
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        setLayoutParams(this.f27332b.f27338a);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 12) {
            setAlpha(0.0f);
            setVisibility(0);
            this.f27334d = true;
            setClickable(false);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    TJCloseButton.this.animate().alpha(1.0f).setDuration(500).setListener(new Animator.AnimatorListener() {
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationCancel(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f27333c);
                            boolean unused = TJCloseButton.this.f27334d = false;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f27333c);
                            boolean unused = TJCloseButton.this.f27334d = false;
                        }
                    });
                }
            }, 2000);
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickableRequested(boolean z) {
        this.f27333c = z;
        if (!this.f27334d) {
            setClickable(z);
        }
    }
}
