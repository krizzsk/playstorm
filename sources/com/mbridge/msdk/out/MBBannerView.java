package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbbanner.p321a.C8663a;

public class MBBannerView extends RelativeLayout {
    private String bidToken;
    /* access modifiers changed from: private */
    public C8663a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;

    public MBBannerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hadAttached = false;
        this.isVisible = false;
        C2350a.m5601e().mo15778a(context);
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        this.mBridgeIds = new MBridgeIds(str, str2);
        String d = C8613y.m24943d(str2);
        if (!TextUtils.isEmpty(d)) {
            C8613y.m24924a(str2, d);
        }
        C8663a aVar = new C8663a(this, bannerSize, str, str2);
        this.controller = aVar;
        aVar.mo57951c(this.isVisible);
        this.controller.mo57949b(this.hadAttached);
    }

    public String getRequestId() {
        C8663a aVar = this.controller;
        return aVar != null ? aVar.mo57941a() : "";
    }

    public void updateBannerSize(BannerSize bannerSize) {
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57945a(bannerSize);
        }
    }

    public void setRefreshTime(int i) {
        C8663a aVar = this.controller;
        if (aVar != null && i >= 0) {
            aVar.mo57942a(i);
        }
    }

    public void setAllowShowCloseBtn(boolean z) {
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57947a(z);
        }
    }

    public void load() {
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57949b(this.hadAttached);
            this.controller.mo57946a("");
            return;
        }
        BannerAdListener bannerAdListener = this.mBannerAdListener;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
        }
    }

    public void loadFromBid(String str) {
        this.bidToken = str;
        if (this.controller == null) {
            BannerAdListener bannerAdListener = this.mBannerAdListener;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
            }
        } else if (!TextUtils.isEmpty(str)) {
            this.controller.mo57949b(this.hadAttached);
            this.controller.mo57942a(0);
            this.controller.mo57946a(str);
        } else {
            BannerAdListener bannerAdListener2 = this.mBannerAdListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onLoadFailed(this.mBridgeIds, "banner token is null or empty，please check it");
            }
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57944a(bannerAdListener);
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57944a((BannerAdListener) null);
            this.controller.mo57948b();
        }
        removeAllViews();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    private void updateAttachedState(boolean z) {
        this.hadAttached = z;
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57949b(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.isVisible = i == 0;
        if (this.controller == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else if (!C2347b.f4898c) {
            this.controller.mo57951c(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.isVisible = i == 0;
        if (this.controller == null) {
            return;
        }
        if (i == 0) {
            delayedNotify();
        } else if (!C2347b.f4898c) {
            this.controller.mo57951c(false);
        }
    }

    private void delayedNotify() {
        postDelayed(new Runnable() {
            public void run() {
                if (MBBannerView.this.controller != null && !C2347b.f4898c) {
                    MBBannerView.this.controller.mo57951c(true);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C8663a aVar = this.controller;
        if (aVar != null) {
            aVar.mo57943a(i, i2, i3, i4);
        }
    }

    public void onPause() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken)) {
            this.controller.mo57952d();
        }
    }

    public void onResume() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken) && !C2347b.f4898c) {
            this.controller.mo57953e();
        }
    }
}
