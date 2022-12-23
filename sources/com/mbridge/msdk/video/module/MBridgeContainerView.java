package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8582k;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.dynview.moffer.C9320a;
import com.mbridge.msdk.video.dynview.p360i.C9297b;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.module.p365a.p366a.C9392g;
import com.mbridge.msdk.video.module.p365a.p366a.C9394i;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9530g;
import com.mbridge.msdk.video.signal.factory.C9529b;

public class MBridgeContainerView extends MBridgeBaseView implements C9526e, C9530g {

    /* renamed from: A */
    private boolean f22723A = false;

    /* renamed from: B */
    private boolean f22724B = false;

    /* renamed from: C */
    private boolean f22725C = false;

    /* renamed from: D */
    private boolean f22726D = true;

    /* renamed from: E */
    private boolean f22727E = false;

    /* renamed from: F */
    private boolean f22728F = false;

    /* renamed from: G */
    private int f22729G;

    /* renamed from: H */
    private boolean f22730H = false;

    /* renamed from: I */
    private int f22731I;

    /* renamed from: J */
    private int f22732J;

    /* renamed from: K */
    private int f22733K;

    /* renamed from: L */
    private int f22734L;

    /* renamed from: M */
    private int f22735M;

    /* renamed from: N */
    private String f22736N;

    /* renamed from: O */
    private C9529b f22737O;

    /* renamed from: P */
    private boolean f22738P = false;

    /* renamed from: Q */
    private boolean f22739Q = false;

    /* renamed from: m */
    private MBridgePlayableView f22740m;

    /* renamed from: n */
    private MBridgeClickCTAView f22741n;

    /* renamed from: o */
    private MBridgeClickMiniCardView f22742o;

    /* renamed from: p */
    private MBridgeNativeEndCardView f22743p;

    /* renamed from: q */
    private MBridgeH5EndCardView f22744q;

    /* renamed from: r */
    private MBridgeVastEndCardView f22745r;

    /* renamed from: s */
    private MBridgeLandingPageView f22746s;

    /* renamed from: t */
    private MBridgeVideoEndCoverView f22747t;

    /* renamed from: u */
    private MBridgeAlertWebview f22748u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f22749v;

    /* renamed from: w */
    private int f22750w;

    /* renamed from: x */
    private int f22751x = 1;

    /* renamed from: y */
    private int f22752y = 1;

    /* renamed from: z */
    private int f22753z = 1;

    public void setJSFactory(C9529b bVar) {
        this.f22737O = bVar;
    }

    public int getVideoSkipTime() {
        return this.f22729G;
    }

    public void setVideoSkipTime(int i) {
        this.f22729G = i;
    }

    public MBridgeContainerView(Context context) {
        super(context);
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22740m, this.f22741n, this.f22742o, this.f22743p, this.f22744q, this.f22745r, this.f22746s, this.f22747t};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void preLoadData(final C9529b bVar) {
        this.f22737O = bVar;
        if (this.f22694b != null) {
            if (this.f22694b.getPlayable_ads_without_video() == 2) {
                if (this.f22740m == null) {
                    this.f22740m = new MBridgePlayableView(this.f22693a);
                }
                this.f22740m.setCloseDelayShowTime(this.f22752y);
                this.f22740m.setPlayCloseBtnTm(this.f22753z);
                this.f22740m.setCampaign(this.f22694b);
                this.f22740m.setNotifyListener(new C9394i(this.f22697e) {
                    /* renamed from: a */
                    public final void mo62252a(int i, Object obj) {
                        super.mo62252a(i, obj);
                        if (i == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            C8412m mVar = new C8412m();
                            mVar.mo57463k(MBridgeContainerView.this.f22694b.getRequestId());
                            mVar.mo57465l(MBridgeContainerView.this.f22694b.getRequestIdNotice());
                            mVar.mo57469n(MBridgeContainerView.this.f22694b.getId());
                            mVar.mo57439a(MBridgeContainerView.this.f22694b.isMraid() ? C8412m.f20281a : C8412m.f20282b);
                            C8524c.m24635a(mVar, MBridgeContainerView.this.f22693a, MBridgeContainerView.this.f22749v);
                        }
                    }
                });
                this.f22740m.preLoadData(bVar);
            } else {
                m26771b(this.f22750w);
                if (this.f22694b.isDynamicView()) {
                    try {
                        m26769a(bVar, Integer.valueOf(this.f22694b.getVideo_end_type()));
                    } catch (Throwable th) {
                        C8608u.m24884d(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.m26769a(bVar, Integer.valueOf(mBridgeContainerView.f22694b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!C8613y.m24949g(this.f22694b.getendcard_url())) {
                        try {
                            String a = C8557ad.m24740a(this.f22694b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a) && Integer.parseInt(a) == 1) {
                                C9320a.m26714a().mo62522a(this.f22694b);
                            }
                        } catch (Exception e) {
                            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.m26769a(bVar, Integer.valueOf(mBridgeContainerView.f22694b.getVideo_end_type()));
                        }
                    }, (long) getVideoSkipTime());
                }
            }
            m26774g();
        }
    }

    public void showPlayableView() {
        if (this.f22694b != null && !this.f22728F) {
            removeAllViews();
            setMatchParent();
            if (this.f22740m == null) {
                preLoadData(this.f22737O);
            }
            addView(this.f22740m);
            MBridgePlayableView mBridgePlayableView = this.f22740m;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f22749v);
                if (this.f22694b != null && this.f22694b.isMraid() && this.f22694b.getPlayable_ads_without_video() == 2) {
                    this.f22740m.setCloseVisible(0);
                }
                this.f22740m.setNotchValue(this.f22736N, this.f22731I, this.f22732J, this.f22733K, this.f22734L);
            }
            this.f22739Q = true;
            bringToFront();
        }
    }

    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f22748u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.f22739Q) {
            removeAllViews();
            bringToFront();
            this.f22738P = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f22748u == null) {
            m26774g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f22748u;
        if (!(mBridgeAlertWebview2 == null || mBridgeAlertWebview2.getParent() == null)) {
            removeView(this.f22748u);
        }
        addView(this.f22748u);
        setBackgroundColor(0);
        this.f22748u.webviewshow();
        return true;
    }

    public void showVideoClickView(int i) {
        if (this.f22694b == null) {
            return;
        }
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    MBridgeClickCTAView mBridgeClickCTAView = this.f22741n;
                    if (!(mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null)) {
                        removeView(this.f22741n);
                    }
                    MBridgeAlertWebview mBridgeAlertWebview = this.f22748u;
                    if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                if (this.f22694b != null && this.f22694b.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    m26773f();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
                            if (!(mBridgeH5EndCardView == null || mBridgeH5EndCardView.getParent() == null)) {
                                removeView(this.f22744q);
                            }
                            this.f22697e.mo62252a(112, "");
                            if (this.f22694b != null && !this.f22694b.isHasReportAdTrackPause()) {
                                this.f22694b.setHasReportAdTrackPause(true);
                                C9410b.m26955f(this.f22693a, this.f22694b);
                            }
                            if (this.f22725C) {
                                this.f22697e.mo62252a(115, "");
                            } else {
                                this.f22739Q = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f22724B = true;
                            return;
                        }
                        m26775h();
                    }
                }
            } else if (!this.f22723A) {
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22744q;
                if (!(mBridgeH5EndCardView2 == null || mBridgeH5EndCardView2.getParent() == null)) {
                    removeView(this.f22744q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f22742o;
                if (!(mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null)) {
                    removeView(this.f22742o);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f22741n;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        if (this.f22694b != null && this.f22694b.getPlayable_ads_without_video() == 1) {
                            this.f22739Q = true;
                            if (this.f22741n == null) {
                                m26771b(-1);
                            }
                            if (this.f22741n != null) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f22741n, 0, layoutParams);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                }
            }
        } else if (!isLast() && !endCardShowing()) {
            m26775h();
        }
    }

    public void showEndcard(int i) {
        if (this.f22694b != null) {
            if (i == 1) {
                this.f22697e.mo62252a(104, "");
            } else if (i == 100) {
                if (this.f22694b.getPlayable_ads_without_video() == 2) {
                    this.f22728F = true;
                }
                m26767a((View) this.f22740m);
                setMatchParent();
                m26772e();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f22745r == null) {
                    m26769a(this.f22737O, 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f22745r, layoutParams);
                this.f22745r.notifyShowListener();
                this.f22739Q = true;
                bringToFront();
            } else if (i == 4) {
                this.f22697e.mo62252a(113, "");
                removeAllViews();
                setMatchParent();
                if (this.f22746s == null) {
                    m26769a(this.f22737O, 4);
                }
                this.f22746s.preLoadData(this.f22737O);
                addView(this.f22746s);
                this.f22739Q = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f22739Q = true;
                bringToFront();
                m26766a();
                this.f22697e.mo62252a(117, "");
            } else {
                this.f22697e.mo62252a(106, "");
            }
        }
        this.f22723A = true;
    }

    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f22747t;
        if (mBridgeVideoEndCoverView == null) {
            C9529b bVar = this.f22737O;
            this.f22737O = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f22693a);
                this.f22747t = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f22694b);
                this.f22747t.setNotifyListener(new C9394i(this.f22697e));
                this.f22747t.preLoadData(bVar);
            }
        }
        addView(this.f22747t);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22739Q = true;
        bringToFront();
    }

    public boolean endCardShowing() {
        return this.f22723A;
    }

    public boolean miniCardShowing() {
        return this.f22724B;
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.f22694b != null) {
            this.f22697e.mo62252a(122, "");
            this.f22697e.mo62252a(104, "");
        }
    }

    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f22730H) {
                return;
            }
        }
        m26766a();
    }

    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f22742o.setRadius(i5);
            this.f22742o.setCloseVisible(8);
            this.f22742o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f22739Q = true;
            bringToFront();
            m26773f();
            if (!this.f22727E) {
                this.f22727E = true;
                this.f22697e.mo62252a(109, "");
                this.f22697e.mo62252a(117, "");
            }
        }
    }

    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.f22742o.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f22739Q = true;
            bringToFront();
            m26773f();
        }
    }

    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f22742o.resizeMiniCard(i, i2);
        }
    }

    public void webviewshow() {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22740m, this.f22742o, this.f22744q, this.f22748u};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    public void install(CampaignEx campaignEx) {
        this.f22697e.mo62252a(105, campaignEx);
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22740m, this.f22742o, this.f22744q, this.f22748u};
        for (int i = 0; i < 4; i++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void setNotifyListener(C9384a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22740m, this.f22741n, this.f22742o, this.f22743p, this.f22744q, this.f22745r, this.f22746s, this.f22747t};
        for (int i = 0; i < 8; i++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new C9392g(this.f22742o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new C9394i(aVar));
                }
            }
        }
    }

    public void defaultShow() {
        super.defaultShow();
    }

    public void addView(View view) {
        if (view != null) {
            m26767a(view);
            super.addView(view);
            return;
        }
        C8608u.m24884d(MBridgeBaseView.TAG, "view is null");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            m26767a(view);
            super.addView(view, layoutParams);
            return;
        }
        C8608u.m24884d(MBridgeBaseView.TAG, "view is null");
    }

    public boolean canBackPress() {
        if (this.f22743p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22746s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public void setShowingTransparent(boolean z) {
        this.f22725C = z;
    }

    public boolean getShowingTransparent() {
        return this.f22725C;
    }

    public String getUnitID() {
        return this.f22749v;
    }

    public void setUnitID(String str) {
        this.f22749v = str;
    }

    public void setVideoInteractiveType(int i) {
        if (this.f22694b == null || !this.f22694b.isDynamicView()) {
            this.f22750w = i;
            return;
        }
        int a = C9297b.m26661a(this.f22694b);
        if (a == 100) {
            this.f22750w = i;
        } else {
            this.f22750w = a;
        }
    }

    public void setEndscreenType(int i) {
        this.f22751x = i;
    }

    public int getVideoInteractiveType() {
        return this.f22750w;
    }

    public void setCloseDelayTime(int i) {
        this.f22752y = i;
    }

    public void setPlayCloseBtnTm(int i) {
        this.f22753z = i;
    }

    /* renamed from: a */
    private void m26767a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    private void m26766a() {
        if (this.f22694b != null) {
            boolean isDynamicView = this.f22694b.isDynamicView();
            boolean g = C8613y.m24949g(this.f22694b.getendcard_url());
            if (isDynamicView && !g) {
                m26772e();
                return;
            }
        }
        if (this.f22751x != 2 || this.f22730H) {
            m26772e();
        } else {
            m26770b();
        }
    }

    /* renamed from: b */
    private void m26770b() {
        if (this.f22744q == null) {
            m26769a(this.f22737O, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            m26772e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22744q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f22744q.setError(true);
            }
        } else {
            this.f22730H = true;
            addView(this.f22744q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f22744q.excuteTask();
            this.f22744q.setNotchValue(this.f22736N, this.f22731I, this.f22732J, this.f22733K, this.f22734L);
            C8412m mVar = new C8412m();
            mVar.mo57463k(this.f22694b.getRequestId());
            mVar.mo57465l(this.f22694b.getRequestIdNotice());
            mVar.mo57469n(this.f22694b.getId());
            mVar.mo57439a(this.f22694b.isMraid() ? C8412m.f20281a : C8412m.f20282b);
            C8524c.m24635a(mVar, this.f22693a, this.f22749v);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f22744q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f22749v);
        }
    }

    /* renamed from: e */
    private void m26772e() {
        this.f22751x = 1;
        if (this.f22743p == null) {
            m26769a(this.f22737O, 2);
        }
        addView(this.f22743p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22743p.notifyShowListener();
        this.f22739Q = true;
        bringToFront();
    }

    /* renamed from: f */
    private void m26773f() {
        if (this.f22742o == null) {
            m26771b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f22725C && this.f22726D) {
            this.f22726D = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f22742o, layoutParams);
    }

    /* renamed from: g */
    private void m26774g() {
        if (this.f22748u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f22693a);
            this.f22748u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f22749v);
            this.f22748u.setCampaign(this.f22694b);
        }
        this.f22748u.preLoadData(this.f22737O);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[SYNTHETIC, Splitter:B:56:0x0127] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m26769a(com.mbridge.msdk.video.signal.factory.C9529b r12, java.lang.Integer r13) {
        /*
            r11 = this;
            r11.f22737O = r12
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b
            if (r0 == 0) goto L_0x01ed
            if (r13 != 0) goto L_0x0012
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            int r13 = r13.getVideo_end_type()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x0012:
            boolean r0 = r11.isLast()
            if (r0 != 0) goto L_0x001b
            r11.m26775h()
        L_0x001b:
            int r13 = r13.intValue()
            r0 = 1
            if (r13 == r0) goto L_0x01ed
            r1 = 3
            if (r13 == r1) goto L_0x01c8
            r1 = 4
            if (r13 == r1) goto L_0x01a7
            r1 = 5
            if (r13 == r1) goto L_0x01ed
            int r13 = r11.f22751x
            r1 = 2
            if (r13 != r1) goto L_0x009e
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            boolean r13 = r13.isDynamicView()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b
            java.lang.String r0 = r0.getendcard_url()
            boolean r0 = com.mbridge.msdk.foundation.tools.C8613y.m24949g((java.lang.String) r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r11.f22694b
            if (r2 == 0) goto L_0x0049
            if (r13 == 0) goto L_0x0049
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            int r13 = r13.getAdSpaceT()
            if (r13 == r1) goto L_0x01ed
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            if (r13 != 0) goto L_0x005e
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = new com.mbridge.msdk.video.module.MBridgeH5EndCardView
            android.content.Context r0 = r11.f22693a
            r13.<init>(r0)
            r11.f22744q = r13
        L_0x005e:
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b
            r13.setCampaign(r0)
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            int r0 = r11.f22752y
            r13.setCloseDelayShowTime(r0)
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            com.mbridge.msdk.video.module.a.a.i r0 = new com.mbridge.msdk.video.module.a.a.i
            com.mbridge.msdk.video.module.a.a r1 = r11.f22697e
            r0.<init>(r1)
            r13.setNotifyListener(r0)
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            java.lang.String r0 = r11.f22749v
            r13.setUnitId(r0)
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r1 = r11.f22744q
            java.lang.String r2 = r11.f22736N
            int r3 = r11.f22731I
            int r4 = r11.f22732J
            int r5 = r11.f22733K
            int r6 = r11.f22734L
            r1.setNotchValue(r2, r3, r4, r5, r6)
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r13 = r11.f22744q
            r13.preLoadData(r12)
            boolean r12 = r11.f22725C
            if (r12 != 0) goto L_0x01ed
            com.mbridge.msdk.video.module.MBridgeH5EndCardView r12 = r11.f22744q
            r11.addView(r12)
            goto L_0x01ed
        L_0x009e:
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            r2 = 0
            if (r13 == 0) goto L_0x00b7
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r13 = r13.getRewardTemplateMode()
            if (r13 == 0) goto L_0x00b7
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            com.mbridge.msdk.foundation.entity.CampaignEx$c r13 = r13.getRewardTemplateMode()
            int r13 = r13.mo57203c()
            r9 = r13
            goto L_0x00b8
        L_0x00b7:
            r9 = r2
        L_0x00b8:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            if (r13 != 0) goto L_0x0173
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            boolean r13 = r13.isDynamicView()
            if (r13 == 0) goto L_0x015b
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            java.lang.String r13 = r13.getendcard_url()
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r10 = "MBridgeBaseView"
            r4 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00e8
            java.lang.String r3 = "ecid"
            java.lang.String r13 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r13, r3)     // Catch:{ all -> 0x00e0 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ all -> 0x00e0 }
            r7 = r13
            goto L_0x00e9
        L_0x00e0:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r10, r13)
        L_0x00e8:
            r7 = r4
        L_0x00e9:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView
            android.content.Context r4 = r11.f22693a
            r5 = 0
            r6 = 1
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r11.f22694b
            int r3 = r3.getAdSpaceT()
            if (r3 != r1) goto L_0x00f9
            r8 = r0
            goto L_0x00fa
        L_0x00f9:
            r8 = r2
        L_0x00fa:
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.f22743p = r13
            com.mbridge.msdk.video.dynview.moffer.a r13 = com.mbridge.msdk.video.dynview.moffer.C9320a.m26714a()
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22694b
            java.lang.String r1 = r1.getRequestId()
            boolean r13 = r13.mo62524a((java.lang.String) r1)
            if (r13 == 0) goto L_0x0127
            com.mbridge.msdk.video.dynview.moffer.a r13 = com.mbridge.msdk.video.dynview.moffer.C9320a.m26714a()
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f22743p
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22694b
            java.lang.String r1 = r1.getRequestId()
            com.mbridge.msdk.video.module.a.a.i r2 = new com.mbridge.msdk.video.module.a.a.i
            com.mbridge.msdk.video.module.a.a r3 = r11.f22697e
            r2.<init>(r3)
            r13.mo62521a((android.view.ViewGroup) r0, (java.lang.String) r1, (com.mbridge.msdk.video.module.p365a.C9384a) r2)
            goto L_0x0173
        L_0x0127:
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b     // Catch:{ Exception -> 0x0152 }
            java.lang.String r13 = r13.getendcard_url()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "mof"
            java.lang.String r13 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r13, r1)     // Catch:{ Exception -> 0x0152 }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0152 }
            if (r1 != 0) goto L_0x0173
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ Exception -> 0x0152 }
            if (r13 != r0) goto L_0x0173
            com.mbridge.msdk.video.dynview.moffer.a r13 = com.mbridge.msdk.video.dynview.moffer.C9320a.m26714a()     // Catch:{ Exception -> 0x0152 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b     // Catch:{ Exception -> 0x0152 }
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r1 = r11.f22743p     // Catch:{ Exception -> 0x0152 }
            com.mbridge.msdk.video.module.a.a.i r2 = new com.mbridge.msdk.video.module.a.a.i     // Catch:{ Exception -> 0x0152 }
            com.mbridge.msdk.video.module.a.a r3 = r11.f22697e     // Catch:{ Exception -> 0x0152 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0152 }
            r13.mo62523a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.view.ViewGroup) r1, (com.mbridge.msdk.video.module.p365a.C9384a) r2)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0173
        L_0x0152:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r10, r13)
            goto L_0x0173
        L_0x015b:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView
            android.content.Context r4 = r11.f22693a
            r5 = 0
            r6 = 0
            r7 = -1
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r11.f22694b
            int r3 = r3.getAdSpaceT()
            if (r3 != r1) goto L_0x016c
            r8 = r0
            goto L_0x016d
        L_0x016c:
            r8 = r2
        L_0x016d:
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.f22743p = r13
        L_0x0173:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b
            r13.setCampaign(r0)
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            java.lang.String r0 = r11.f22749v
            r13.setUnitId(r0)
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            int r0 = r11.f22752y
            r13.setCloseBtnDelay(r0)
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            com.mbridge.msdk.video.module.a.a.i r0 = new com.mbridge.msdk.video.module.a.a.i
            com.mbridge.msdk.video.module.a.a r1 = r11.f22697e
            r0.<init>(r1)
            r13.setNotifyListener(r0)
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r13 = r11.f22743p
            r13.preLoadData(r12)
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r12 = r11.f22743p
            int r13 = r11.f22731I
            int r0 = r11.f22732J
            int r1 = r11.f22733K
            int r2 = r11.f22734L
            r12.setNotchPadding(r13, r0, r1, r2)
            goto L_0x01ed
        L_0x01a7:
            com.mbridge.msdk.video.module.MBridgeLandingPageView r12 = r11.f22746s
            if (r12 != 0) goto L_0x01b4
            com.mbridge.msdk.video.module.MBridgeLandingPageView r12 = new com.mbridge.msdk.video.module.MBridgeLandingPageView
            android.content.Context r13 = r11.f22693a
            r12.<init>(r13)
            r11.f22746s = r12
        L_0x01b4:
            com.mbridge.msdk.video.module.MBridgeLandingPageView r12 = r11.f22746s
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r11.f22694b
            r12.setCampaign(r13)
            com.mbridge.msdk.video.module.MBridgeLandingPageView r12 = r11.f22746s
            com.mbridge.msdk.video.module.a.a.i r13 = new com.mbridge.msdk.video.module.a.a.i
            com.mbridge.msdk.video.module.a.a r0 = r11.f22697e
            r13.<init>(r0)
            r12.setNotifyListener(r13)
            goto L_0x01ed
        L_0x01c8:
            com.mbridge.msdk.video.module.MBridgeVastEndCardView r13 = r11.f22745r
            if (r13 != 0) goto L_0x01d5
            com.mbridge.msdk.video.module.MBridgeVastEndCardView r13 = new com.mbridge.msdk.video.module.MBridgeVastEndCardView
            android.content.Context r0 = r11.f22693a
            r13.<init>(r0)
            r11.f22745r = r13
        L_0x01d5:
            com.mbridge.msdk.video.module.MBridgeVastEndCardView r13 = r11.f22745r
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22694b
            r13.setCampaign(r0)
            com.mbridge.msdk.video.module.MBridgeVastEndCardView r13 = r11.f22745r
            com.mbridge.msdk.video.module.a.a.l r0 = new com.mbridge.msdk.video.module.a.a.l
            com.mbridge.msdk.video.module.a.a r1 = r11.f22697e
            r0.<init>(r1)
            r13.setNotifyListener(r0)
            com.mbridge.msdk.video.module.MBridgeVastEndCardView r13 = r11.f22745r
            r13.preLoadData(r12)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeContainerView.m26769a(com.mbridge.msdk.video.signal.factory.b, java.lang.Integer):void");
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m26775h() {
        this.f22724B = false;
        this.f22739Q = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    private void m26771b(int i) {
        if (i == -3) {
            return;
        }
        if (i != -2) {
            if (this.f22741n == null) {
                this.f22741n = new MBridgeClickCTAView(this.f22693a);
            }
            this.f22741n.setCampaign(this.f22694b);
            this.f22741n.setUnitId(this.f22749v);
            this.f22741n.setNotifyListener(new C9394i(this.f22697e));
            this.f22741n.preLoadData(this.f22737O);
        } else if (this.f22694b != null && this.f22694b.getVideo_end_type() == 2) {
            if (this.f22742o == null) {
                this.f22742o = new MBridgeClickMiniCardView(this.f22693a);
            }
            this.f22742o.setCampaign(this.f22694b);
            this.f22742o.setNotifyListener(new C9392g(this.f22742o, this.f22697e));
            this.f22742o.preLoadData(this.f22737O);
            setMatchParent();
            m26773f();
            m26775h();
        }
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22742o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f22742o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f22724B) {
            this.f22697e.mo62252a(107, "");
        }
    }

    public void onEndcardBackPress() {
        if (this.f22743p != null || this.f22745r != null) {
            this.f22697e.mo62252a(104, "");
        } else if (this.f22746s != null) {
            this.f22697e.mo62252a(103, "");
        } else {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
            }
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f22744q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22746s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22743p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
        }
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        return mBridgeH5EndCardView == null ? this.f22740m : mBridgeH5EndCardView;
    }

    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f22738P && !this.f22739Q) {
                m26775h();
                this.f22738P = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f22748u;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f22748u);
                MBridgeClickCTAView mBridgeClickCTAView = this.f22741n;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    public void ivRewardAdsWithoutVideo(String str) {
        this.f22697e.mo62252a(103, str);
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        C8608u.m24884d(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)}));
        this.f22735M = i;
        this.f22731I = i2;
        this.f22732J = i3;
        this.f22733K = i4;
        this.f22734L = i5;
        this.f22736N = C8582k.m24787a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22743p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22744q;
        if (!(mBridgeH5EndCardView == null || mBridgeH5EndCardView.f22779p == null)) {
            this.f22744q.setNotchValue(this.f22736N, i2, i3, i4, i5);
            C8824g.m25670a().mo58310a((WebView) this.f22744q.f22779p, "oncutoutfetched", Base64.encodeToString(this.f22736N.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f22740m;
        if (mBridgePlayableView != null && mBridgePlayableView.f22779p != null) {
            this.f22740m.setNotchValue(this.f22736N, i2, i3, i4, i5);
            C8824g.m25670a().mo58310a((WebView) this.f22740m.f22779p, "oncutoutfetched", Base64.encodeToString(this.f22736N.getBytes(), 0));
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22743p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22743p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }
}
