package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f16469a;

    /* renamed from: b */
    private ISBannerSize f16470b;

    /* renamed from: c */
    private String f16471c;

    /* renamed from: d */
    private Activity f16472d;

    /* renamed from: e */
    private boolean f16473e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f16474f = false;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f16472d = activity;
        this.f16470b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IronSourceBannerLayout mo36100a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f16472d, this.f16470b);
        ironSourceBannerLayout.setBannerListener(C6675k.m20355a().f17394a);
        ironSourceBannerLayout.setPlacementName(this.f16471c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36101a(final View view, final FrameLayout.LayoutParams layoutParams) {
        C6423c.f16330a.mo35933a(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.f16469a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36102a(final IronSourceError ironSourceError, final boolean z) {
        C6423c.f16330a.mo35933a(new Runnable() {
            public final void run() {
                C6675k a;
                IronSourceError ironSourceError;
                boolean z;
                if (IronSourceBannerLayout.this.f16474f) {
                    a = C6675k.m20355a();
                    ironSourceError = ironSourceError;
                    z = true;
                } else {
                    try {
                        if (IronSourceBannerLayout.this.f16469a != null) {
                            IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.f16469a);
                            View unused = IronSourceBannerLayout.this.f16469a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    a = C6675k.m20355a();
                    ironSourceError = ironSourceError;
                    z = z;
                }
                a.mo36710a(ironSourceError, z);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36103a(boolean z) {
        C6675k.m20355a().mo36711a(z);
        this.f16474f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36104b() {
        this.f16473e = true;
        this.f16472d = null;
        this.f16470b = null;
        this.f16471c = null;
        this.f16469a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.f16472d;
    }

    public BannerListener getBannerListener() {
        return C6675k.m20355a().f17394a;
    }

    public View getBannerView() {
        return this.f16469a;
    }

    public String getPlacementName() {
        return this.f16471c;
    }

    public ISBannerSize getSize() {
        return this.f16470b;
    }

    public boolean isDestroyed() {
        return this.f16473e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C6675k.m20355a().f17394a = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C6675k.m20355a().f17394a = bannerListener;
    }

    public void setPlacementName(String str) {
        this.f16471c = str;
    }
}
