package com.p374my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p374my.target.C10029x2;
import com.p374my.target.C10059y8;
import com.p374my.target.C9594R;
import com.p374my.target.C9596a;
import com.p374my.target.C9618b0;
import com.p374my.target.C9661d6;
import com.p374my.target.C9672e0;
import com.p374my.target.C9791k1;
import com.p374my.target.C9822l3;
import com.p374my.target.C9916q2;
import com.p374my.target.common.CustomParams;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.ads.MyTargetView */
public final class MyTargetView extends FrameLayout {
    private final C9596a adConfig;
    private AdSize adSize;
    private boolean attached;
    private C9791k1 engine;
    private boolean fixedSize;
    private final AtomicBoolean isLoaded;
    private MyTargetViewListener listener;

    /* renamed from: com.my.target.ads.MyTargetView$AdSize */
    public static final class AdSize {
        public static final AdSize ADSIZE_300x250 = new AdSize(300, 250, 1);
        public static final AdSize ADSIZE_320x50 = new AdSize(320, 50, 0);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;
        private static final float MAX_HEIGHT_PROPORTION = 0.15f;
        private static final int MIN_HEIGHT = 50;
        /* access modifiers changed from: private */
        public final int height;
        private final int heightPixels;
        private final int type;
        /* access modifiers changed from: private */
        public final int width;
        private final int widthPixels;

        private AdSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            float a = C10059y8.m29821a();
            this.widthPixels = (int) (((float) i) * a);
            this.heightPixels = (int) (((float) i2) * a);
            this.type = i3;
        }

        private AdSize(int i, int i2, int i3, int i4, int i5) {
            this.width = i;
            this.height = i2;
            this.widthPixels = i3;
            this.heightPixels = i4;
            this.type = i5;
        }

        /* access modifiers changed from: private */
        public static AdSize fromInt(int i, Context context) {
            return i != 1 ? i != 2 ? i != 3 ? ADSIZE_320x50 : getAdSizeForCurrentOrientation(context) : ADSIZE_728x90 : ADSIZE_300x250;
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, int i2, Context context) {
            Point b = C10059y8.m29837b(context);
            float a = C10059y8.m29821a();
            return getSize(((float) i) * a, Math.min(((float) i2) * a, ((float) b.y) * MAX_HEIGHT_PROPORTION));
        }

        public static AdSize getAdSizeForCurrentOrientation(int i, Context context) {
            return getSize(((float) i) * C10059y8.m29821a(), ((float) C10059y8.m29837b(context).y) * MAX_HEIGHT_PROPORTION);
        }

        public static AdSize getAdSizeForCurrentOrientation(Context context) {
            Point b = C10059y8.m29837b(context);
            return getSize((float) b.x, ((float) b.y) * MAX_HEIGHT_PROPORTION);
        }

        private static AdSize getSize(float f, float f2) {
            float a = C10059y8.m29821a();
            float max = Math.max(Math.min(f > 524.0f ? (f / 728.0f) * 90.0f : (f / 320.0f) * 50.0f, f2), 50.0f * a);
            return new AdSize((int) (f / a), (int) (max / a), (int) f, (int) max, 3);
        }

        /* access modifiers changed from: private */
        public static boolean isSame(AdSize adSize, AdSize adSize2) {
            return adSize.height == adSize2.height && adSize.width == adSize2.width && adSize.type == adSize2.type;
        }

        public int getHeight() {
            return this.height;
        }

        public int getHeightPixels() {
            return this.heightPixels;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public int getWidthPixels() {
            return this.widthPixels;
        }
    }

    /* renamed from: com.my.target.ads.MyTargetView$MyTargetViewListener */
    public interface MyTargetViewListener {
        void onClick(MyTargetView myTargetView);

        void onLoad(MyTargetView myTargetView);

        void onNoAd(String str, MyTargetView myTargetView);

        void onShow(MyTargetView myTargetView);
    }

    public MyTargetView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MyTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLoaded = new AtomicBoolean();
        this.fixedSize = false;
        C9672e0.m27884c("MyTargetView created. Version: 5.15.0");
        this.adConfig = C9596a.newConfig(0, "");
        this.adSize = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet != null) {
            TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, C9594R.styleable.MyTargetView);
            } catch (Throwable th) {
                C9672e0.m27882a("unable to get view attributes: " + th.getMessage());
            }
            if (typedArray != null) {
                this.adConfig.setSlotId(typedArray.getInt(C9594R.styleable.MyTargetView_myTarget_slotId, 0));
                this.adConfig.setRefreshAd(typedArray.getBoolean(C9594R.styleable.MyTargetView_myTarget_isRefreshAd, true));
                int i2 = typedArray.getInt(C9594R.styleable.MyTargetView_myTarget_adSize, -1);
                if (i2 >= 0) {
                    if (i2 != 3) {
                        this.fixedSize = true;
                    }
                    this.adSize = AdSize.fromInt(i2, context);
                }
                typedArray.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleResult */
    public void lambda$load$0$MyTargetView(C10029x2 x2Var, String str, C9822l3.C9823a aVar) {
        MyTargetViewListener myTargetViewListener = this.listener;
        if (myTargetViewListener != null) {
            if (x2Var == null) {
                if (str == null) {
                    str = "no ad";
                }
                myTargetViewListener.onNoAd(str, this);
                return;
            }
            C9791k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo64488a();
            }
            C9791k1 a = C9791k1.m28422a(this, this.adConfig, aVar);
            this.engine = a;
            a.mo64492a(this.attached);
            this.engine.mo64494b(x2Var);
            this.adConfig.setBidId((String) null);
        }
    }

    private void setFormat() {
        C9596a aVar;
        String str;
        AdSize adSize2 = this.adSize;
        if (adSize2 == AdSize.ADSIZE_320x50) {
            aVar = this.adConfig;
            str = "standard_320x50";
        } else if (adSize2 == AdSize.ADSIZE_300x250) {
            aVar = this.adConfig;
            str = "standard_300x250";
        } else if (adSize2 == AdSize.ADSIZE_728x90) {
            aVar = this.adConfig;
            str = "standard_728x90";
        } else {
            aVar = this.adConfig;
            str = "standard";
        }
        aVar.setFormat(str);
    }

    private void updateAdaptiveSize() {
        Context context = getContext();
        Point b = C10059y8.m29837b(context);
        int i = b.x;
        float f = (float) b.y;
        if (i != this.adSize.width || ((float) this.adSize.height) > f * 0.15f) {
            AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
            this.adSize = adSizeForCurrentOrientation;
            C9791k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo64489a(adSizeForCurrentOrientation);
            }
        }
    }

    public void destroy() {
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo64488a();
            this.engine = null;
        }
        this.listener = null;
    }

    public String getAdSource() {
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            return k1Var.mo64493b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            return k1Var.mo64496c();
        }
        return 0.0f;
    }

    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public MyTargetViewListener getListener() {
        return this.listener;
    }

    public AdSize getSize() {
        return this.adSize;
    }

    public final void handleSection(C10029x2 x2Var, AdSize adSize2) {
        C9822l3.C9823a a = C9822l3.m28580a(this.adConfig.getSlotId());
        C9618b0.m27646a(x2Var, this.adConfig, a).mo63560a(new C9618b0.C9620b(a) {
            public final /* synthetic */ C9822l3.C9823a f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                MyTargetView.this.lambda$handleSection$1$MyTargetView(this.f$1, (C10029x2) q2Var, str);
            }
        }).mo63567b(a.mo64679a(), getContext());
    }

    @Deprecated
    public void init(int i) {
        init(i, true);
    }

    @Deprecated
    public void init(int i, int i2) {
        init(i, i2, true);
    }

    @Deprecated
    public void init(int i, int i2, boolean z) {
        setAdSize(AdSize.fromInt(i2, getContext()));
        this.adConfig.setSlotId(i);
        this.adConfig.setRefreshAd(z);
        C9672e0.m27882a("MyTargetView initialized");
    }

    @Deprecated
    public void init(int i, boolean z) {
        init(i, 0, z);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public final void load() {
        if (!this.isLoaded.compareAndSet(false, true)) {
            C9672e0.m27882a("MyTargetView doesn't support multiple load");
            return;
        }
        C9822l3.C9823a a = C9822l3.m28580a(this.adConfig.getSlotId());
        C9822l3 a2 = a.mo64679a();
        C9672e0.m27882a("MyTargetView load");
        setFormat();
        C9618b0.m27645a(this.adConfig, a).mo63560a(new C9618b0.C9620b(a) {
            public final /* synthetic */ C9822l3.C9823a f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                MyTargetView.this.lambda$load$0$MyTargetView(this.f$1, (C10029x2) q2Var, str);
            }
        }).mo63567b(a2, getContext());
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        this.adConfig.setRefreshAd(false);
        load();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo64492a(true);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo64492a(false);
        }
    }

    public void onMeasure(int i, int i2) {
        if (!this.fixedSize) {
            updateAdaptiveSize();
        }
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C9791k1 k1Var = this.engine;
        if (k1Var != null) {
            k1Var.mo64495b(z);
        }
    }

    public void setAdSize(AdSize adSize2) {
        if (adSize2 == null) {
            C9672e0.m27882a("AdSize cannot be null");
        } else if (!this.fixedSize || !AdSize.isSame(this.adSize, adSize2)) {
            this.fixedSize = true;
            if (this.isLoaded.get()) {
                AdSize adSize3 = this.adSize;
                AdSize adSize4 = AdSize.ADSIZE_300x250;
                if (AdSize.isSame(adSize3, adSize4) || AdSize.isSame(adSize2, adSize4)) {
                    C9672e0.m27882a("unable to switch size to/from 300x250");
                    return;
                }
            }
            C9791k1 k1Var = this.engine;
            if (k1Var != null) {
                k1Var.mo64489a(adSize2);
                View childAt = getChildAt(0);
                if (childAt instanceof C9661d6) {
                    childAt.requestLayout();
                }
            }
            this.adSize = adSize2;
            setFormat();
        }
    }

    public void setListener(MyTargetViewListener myTargetViewListener) {
        this.listener = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void setRefreshAd(boolean z) {
        this.adConfig.setRefreshAd(z);
    }

    public void setSlotId(int i) {
        if (!this.isLoaded.get()) {
            this.adConfig.setSlotId(i);
        }
    }
}
