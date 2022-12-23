package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

public class ISDemandOnlyBannerLayout extends FrameLayout {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public View f16456a;

    /* renamed from: b */
    ISBannerSize f16457b;

    /* renamed from: c */
    String f16458c;

    /* renamed from: d */
    Activity f16459d;

    /* renamed from: e */
    boolean f16460e = false;
    /* access modifiers changed from: package-private */

    /* renamed from: f */
    public boolean f16461f = false;

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f16459d = activity;
        this.f16457b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36087a(final IronSourceError ironSourceError) {
        C6423c.f16330a.mo35933a(new Runnable() {
            public final void run() {
                if (ISDemandOnlyBannerLayout.this.f16461f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError);
                } else {
                    try {
                        if (ISDemandOnlyBannerLayout.this.f16456a != null) {
                            ISDemandOnlyBannerLayout.this.removeView(ISDemandOnlyBannerLayout.this.f16456a);
                            View unused = ISDemandOnlyBannerLayout.this.f16456a = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C6668j.m20352a().mo36702a(ironSourceError);
            }
        });
    }

    public Activity getActivity() {
        return this.f16459d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return C6668j.m20352a().f17385a;
    }

    public View getBannerView() {
        return this.f16456a;
    }

    public String getPlacementName() {
        return this.f16458c;
    }

    public ISBannerSize getSize() {
        return this.f16457b;
    }

    public boolean isDestroyed() {
        return this.f16460e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C6668j.m20352a().f17385a = null;
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        C6668j.m20352a().f17385a = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.f16458c = str;
    }
}
