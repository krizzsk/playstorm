package com.mbridge.msdk.video.p346bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2339a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8582k;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.mraid.C8811c;
import com.mbridge.msdk.mbsignalcommon.mraid.C8812d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p365a.p366a.C9385a;
import com.mbridge.msdk.video.module.p365a.p366a.C9386b;
import com.mbridge.msdk.video.module.p365a.p366a.C9387c;
import com.mbridge.msdk.video.module.p365a.p366a.C9391f;
import com.mbridge.msdk.video.module.p365a.p366a.C9393h;
import com.mbridge.msdk.video.module.p365a.p366a.C9402m;
import com.mbridge.msdk.video.module.p365a.p366a.C9405n;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.video.p346bt.module.p348a.C9237b;
import com.mbridge.msdk.video.p346bt.module.p349b.C9240c;
import com.mbridge.msdk.video.p346bt.module.p349b.C9241d;
import com.mbridge.msdk.video.p346bt.module.p349b.C9242e;
import com.mbridge.msdk.video.p346bt.module.p349b.C9246h;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.video.signal.p369a.C9416c;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer */
public class MBTempContainer extends AbstractJSContainer {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f22203y = MBTempContainer.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public CampaignEx f22204A;

    /* renamed from: B */
    private C9552a f22205B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C9246h f22206C;

    /* renamed from: D */
    private C9237b f22207D;

    /* renamed from: E */
    private String f22208E = "";

    /* renamed from: F */
    private C9529b f22209F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f22210G = C8413a.f20336r;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f22211H;

    /* renamed from: I */
    private boolean f22212I = false;

    /* renamed from: J */
    private int f22213J;

    /* renamed from: K */
    private int f22214K;

    /* renamed from: L */
    private int f22215L;

    /* renamed from: M */
    private int f22216M;

    /* renamed from: N */
    private int f22217N;

    /* renamed from: O */
    private String f22218O = "";

    /* renamed from: P */
    private String f22219P;

    /* renamed from: Q */
    private LayoutInflater f22220Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f22221R = 0;

    /* renamed from: S */
    private int f22222S = 0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f22223T;

    /* renamed from: U */
    private boolean f22224U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f22225V = false;

    /* renamed from: W */
    private boolean f22226W = false;

    /* renamed from: a */
    protected boolean f22227a = false;

    /* renamed from: aa */
    private boolean f22228aa;

    /* renamed from: ab */
    private boolean f22229ab = false;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public boolean f22230ac = false;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public boolean f22231ad = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f22232ae = false;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f22233af = false;

    /* renamed from: ag */
    private boolean f22234ag = false;

    /* renamed from: ah */
    private C8812d f22235ah;

    /* renamed from: ai */
    private AdSession f22236ai = null;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public MediaEvents f22237aj = null;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public Runnable f22238ak = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.f22223T != null) {
                MBTempContainer.this.f22223T.setVisibility(8);
            }
        }
    };

    /* renamed from: b */
    protected boolean f22239b = false;

    /* renamed from: c */
    protected C9209a f22240c = new C9209a.C9210a();

    /* renamed from: d */
    protected WindVaneWebView f22241d;

    /* renamed from: e */
    protected MBridgeVideoView f22242e;

    /* renamed from: f */
    protected MBridgeContainerView f22243f;

    /* renamed from: g */
    protected Handler f22244g = new Handler();

    /* renamed from: h */
    protected Runnable f22245h = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo62809h() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                int unused = MBTempContainer.this.f22221R = -3;
            }
        }
    };

    /* renamed from: i */
    protected Runnable f22246i = new Runnable() {
        public final void run() {
            if (MBTempContainer.this.getActivityProxy().mo62809h() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                int unused = MBTempContainer.this.f22221R = -4;
            }
        }
    };

    /* renamed from: z */
    private View f22247z;

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    public MBTempContainer(Context context) {
        super(context);
        init(context);
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public void init(Context context) {
        this.f22220Q = LayoutInflater.from(context);
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void registerErrorListener(C9209a aVar) {
        this.f22240c = aVar;
    }

    public int findID(String str) {
        return C8594o.m24812a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8594o.m24812a(getContext(), str, "layout");
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a */
    public interface C9209a {
        /* renamed from: a */
        void mo62250a(String str);

        /* renamed from: a */
        void mo62251a(boolean z);

        /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$a$a */
        public static class C9210a implements C9209a {

            /* renamed from: a */
            private boolean f22256a = false;

            /* renamed from: a */
            public void mo62250a(String str) {
                C8608u.m24884d("ActivityErrorListener", str);
                this.f22256a = true;
            }

            /* renamed from: a */
            public final void mo62251a(boolean z) {
                this.f22256a = z;
            }
        }
    }

    public boolean isLoadSuccess() {
        return this.f22239b;
    }

    /* renamed from: c */
    private int m26283c() {
        C9425j b = mo63047b(this.f22204A);
        if (b != null) {
            return b.mo62835j();
        }
        return 0;
    }

    /* renamed from: d */
    private boolean m26288d() {
        C9425j b = mo63047b(this.f22204A);
        if (b != null) {
            return b.mo62838m();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m26290e() {
        MBridgeVideoView mBridgeVideoView = this.f22242e;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.isShowingAlertView();
        }
        return false;
    }

    public void superDefaultLoad(int i, String str) {
        this.f22244g.removeCallbacks(this.f22245h);
        this.f22244g.removeCallbacks(this.f22246i);
        this.f22240c.mo62251a(true);
        WindVaneWebView windVaneWebView = this.f22241d;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62204a(String str) {
        C9246h hVar = this.f22206C;
        if (hVar != null) {
            hVar.mo60932a(str);
        }
        super.mo62204a(str);
    }

    public void onPause() {
        super.onPause();
        this.f22226W = true;
        try {
            getJSVideoModule().videoOperate(2);
            if (this.f22243f != null) {
                this.f22243f.setOnPause();
            }
        } catch (Throwable th) {
            C8608u.m24881a(f22203y, th.getMessage(), th);
        }
    }

    public void onResume() {
        Runnable runnable;
        super.onResume();
        int i = this.f22221R;
        if (i == -3) {
            runnable = this.f22245h;
        } else {
            runnable = i == -4 ? this.f22246i : null;
        }
        if (runnable != null) {
            runnable.run();
            this.f22221R = 0;
        }
        try {
            if (this.f22242e != null && !m26290e() && !this.f22242e.isMiniCardShowing() && !C2347b.f4898c) {
                this.f22242e.setCover(false);
            }
            if (this.f22243f != null) {
                this.f22243f.setOnResume();
            }
            if (this.f22226W && !m26290e() && !C2347b.f4898c) {
                getJSVideoModule().videoOperate(1);
            }
            if (this.f23338j != null) {
                C8613y.m24921a(this.f23338j.getWindow().getDecorView());
            }
            if (this.f22229ab && this.f22230ac && this.f23338j != null) {
                this.f23338j.finish();
            }
        } catch (Throwable th) {
            C8608u.m24881a(f22203y, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.f22242e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
        }
    }

    public void onDestroy() {
        if (!this.f22212I) {
            boolean z = true;
            this.f22212I = true;
            super.onDestroy();
            try {
                if (this.f22242e != null) {
                    this.f22242e.releasePlayer();
                }
                if (this.f22241d != null) {
                    ViewGroup viewGroup = (ViewGroup) this.f22241d.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    this.f22241d.clearWebView();
                    this.f22241d.release();
                }
                if (this.f22207D != null) {
                    this.f22207D = null;
                }
                this.f22244g.removeCallbacks(this.f22245h);
                this.f22244g.removeCallbacks(this.f22246i);
                getJSCommon().mo62826e();
                if (this.f23346r) {
                    C2283b.m5275a().mo15570e(this.f23339k);
                }
                if (!this.f22224U) {
                    this.f22224U = true;
                    if (this.f22204A != null && this.f22204A.getPlayable_ads_without_video() == 2) {
                        this.f22225V = true;
                    }
                    if (this.f22206C != null) {
                        if (this.f23346r && (this.f23348t == C8413a.f20332n || this.f23348t == C8413a.f20333o)) {
                            C9246h hVar = this.f22206C;
                            if (this.f22211H != 1) {
                                z = false;
                            }
                            hVar.mo60934a(z, this.f22210G);
                        }
                        if (!this.f22225V) {
                            this.f23343o.mo63098a(0);
                        }
                        this.f22206C.mo60935a(this.f22225V, this.f23343o);
                    }
                    this.f22244g.removeCallbacks(this.f22238ak);
                    if (((!this.f23346r && !this.f23351w) || (this.f22204A != null && this.f22204A.isDynamicView())) && this.f22225V) {
                        C8608u.m24880a(f22203y, "sendToServerRewardInfo");
                        C9410b.m26946a(this.f22204A, this.f23343o, this.f23339k, this.f23342n, this.f22219P);
                    }
                    if (!this.f23351w) {
                        if (this.f23346r) {
                            C9536a.m27226b(287, this.f22204A);
                        } else {
                            C9536a.m27226b(94, this.f22204A);
                        }
                    }
                    if (this.f22243f != null) {
                        this.f22243f.release();
                    }
                }
            } catch (Throwable th) {
                C8608u.m24880a(f22203y, th.getMessage());
                return;
            }
            if (!this.f22228aa) {
                m26293f();
            }
            if (this.f22235ah != null) {
                this.f22235ah.mo58266d();
            }
            if (this.f22236ai != null) {
                this.f22236ai.removeAllFriendlyObstructions();
                this.f22236ai.finish();
                this.f22236ai = null;
            }
            if (!this.f23351w) {
                if (isLoadSuccess()) {
                    this.f22244g.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBTempContainer.this.f23338j != null) {
                                MBTempContainer.this.f23338j.finish();
                            }
                        }
                    }, 100);
                } else if (this.f23338j != null) {
                    this.f23338j.finish();
                }
            }
            if (!this.f22228aa) {
                m26293f();
            }
            C9196c.m26194a().mo62146f(this.f22208E);
        }
    }

    /* renamed from: f */
    private void m26293f() {
        C8526d dVar = new C8526d(getContext());
        CampaignEx campaignEx = this.f22204A;
        if (campaignEx != null) {
            dVar.mo57697a(campaignEx.getRequestId(), this.f22204A.getRequestIdNotice(), this.f22204A.getId(), this.f23339k, C8811c.m25637a(this.f22204A.getId()), this.f22204A.isBidCampaign());
            C8811c.m25638b(this.f22204A.getId());
            this.f22228aa = true;
        }
    }

    public void setShowingTransparent() {
        int a;
        boolean d = m26288d();
        this.f22229ab = d;
        if (!d && (a = C8594o.m24812a(getContext(), "mbridge_reward_theme", "style")) > 1 && this.f23338j != null) {
            this.f23338j.setTheme(a);
        }
    }

    /* renamed from: g */
    private void m26296g() {
        AdSession adSession = this.f22236ai;
        if (adSession != null) {
            adSession.addFriendlyObstruction(this.f22243f, FriendlyObstructionPurpose.OTHER, (String) null);
            View view = this.f22223T;
            if (view != null) {
                this.f22236ai.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, (String) null);
            }
            WindVaneWebView windVaneWebView = this.f22241d;
            if (windVaneWebView != null) {
                this.f22236ai.addFriendlyObstruction(windVaneWebView, FriendlyObstructionPurpose.OTHER, (String) null);
            }
            AdEvents createAdEvents = AdEvents.createAdEvents(this.f22236ai);
            this.f22237aj = MediaEvents.createMediaEvents(this.f22236ai);
            this.f22236ai.start();
            createAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            this.f22242e.setVideoEvents(this.f22237aj);
            if (createAdEvents != null) {
                try {
                    createAdEvents.impressionOccurred();
                } catch (Exception e) {
                    C8608u.m24880a("omsdk", e.getMessage());
                }
            }
        }
    }

    public void receiveSuccess() {
        C8608u.m24880a(f22203y, "receiveSuccess ,start hybrid");
        this.f22244g.removeCallbacks(this.f22246i);
        this.f22244g.postDelayed(this.f22238ak, 250);
    }

    public void defaultLoad(int i, String str) {
        int i2;
        int i3;
        superDefaultLoad(i, str);
        if (isLoadSuccess()) {
            if (this.f22204A.getPlayable_ads_without_video() == 2) {
                this.f22243f.setCampaign(this.f22204A);
                this.f22243f.setUnitID(this.f23339k);
                if (this.f22204A.getCbd() > -2) {
                    i3 = this.f22204A.getCbd();
                } else {
                    i3 = this.f23341m.mo63166n();
                }
                this.f22243f.setCloseDelayTime(i3);
                this.f22243f.setPlayCloseBtnTm(this.f23341m.mo63154h());
                this.f22243f.setNotifyListener(new C9393h(this.f22204A, this.f22205B, this.f23343o, mo63048b(), this.f23339k, new C9212c(), this.f23341m.mo63186x(), this.f23351w));
                this.f22243f.preLoadData(this.f22209F);
                this.f22243f.showPlayableView();
            } else {
                m26278a(i, str);
                this.f22223T.setVisibility(8);
                loadModuleDatas();
                int f = this.f23341m.mo63150f();
                int c = m26283c();
                int i4 = c != 0 ? c : f;
                CampaignEx campaignEx = this.f22204A;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f22242e.setContainerViewOnNotifyListener(new C9211b(this.f23338j, this.f22204A));
                }
                CampaignEx campaignEx2 = this.f22204A;
                if (campaignEx2 == null || campaignEx2.getVst() <= -2) {
                    i2 = this.f23341m.mo63148e();
                } else {
                    i2 = this.f22204A.getVst();
                }
                int i5 = i2;
                this.f22242e.setVideoSkipTime(i5);
                this.f22242e.setNotifyListener(new C9402m(this.f22242e, this.f22243f, this.f22204A, this.f23343o, this.f22205B, mo63048b(), this.f23339k, i4, i5, new C9214e(), this.f23341m.mo63186x(), this.f23351w, this.f23341m.mo63132B()));
                this.f22242e.defaultShow();
                this.f22243f.setNotifyListener(new C9386b(this.f22242e, this.f22243f, this.f22204A, this.f23343o, this.f22205B, mo63048b(), this.f23339k, new C9211b(this.f23338j, this.f22204A), this.f23341m.mo63186x(), this.f23351w));
                this.f22243f.defaultShow();
            }
            m26296g();
            return;
        }
        m26278a(i, str);
        if (this.f23338j != null) {
            this.f23338j.finish();
        }
    }

    public int getLayoutID() {
        return findLayout(this.f22229ab ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public WindVaneWebView findWindVaneWebView() {
        C9536a.C9537a aVar;
        try {
            if (!this.f23351w) {
                if (this.f23346r) {
                    aVar = C9536a.m27221a(287, this.f22204A);
                } else {
                    aVar = C9536a.m27221a(94, this.f22204A);
                }
                if (aVar == null || !aVar.mo63075c()) {
                    return null;
                }
                if (this.f23346r) {
                    C9536a.m27226b(287, this.f22204A);
                } else {
                    C9536a.m27226b(94, this.f22204A);
                }
                WindVaneWebView a = aVar.mo63070a();
                if (this.f22229ab) {
                    a.setWebViewTransparent();
                }
                return a;
            } else if (this.f22204A == null || this.f22204A.getRewardTemplateMode() == null) {
                return null;
            } else {
                C9536a.C9537a a2 = C9536a.m27222a(this.f23339k + "_" + this.f22204A.getId() + "_" + this.f22204A.getRequestId() + "_" + this.f22204A.getRewardTemplateMode().mo57205e());
                if (a2 != null) {
                    return a2.mo63070a();
                }
                return null;
            }
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f22223T = findViewById;
        return findViewById != null;
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.f22243f;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f22229ab && (mBridgeVideoView2 = this.f22242e) != null) {
            mBridgeVideoView2.notifyVideoClose();
        } else if (!this.f22231ad || (mBridgeVideoView = this.f22242e) == null) {
            if (!this.f22233af || (mBridgeContainerView2 = this.f22243f) == null) {
                if (this.f22232ae && (mBridgeContainerView = this.f22243f) != null) {
                    mBridgeContainerView.onEndcardBackPress();
                }
                if (getJSCommon().mo62821b()) {
                    if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                        getActivityProxy().mo62808g();
                    }
                } else if (!canBackPress()) {
                    C8608u.m24880a(f22203y, "onBackPressed can't excute");
                } else if (this.f23338j != null && !this.f23351w && !this.f22234ag) {
                    this.f22234ag = true;
                    this.f23338j.onBackPressed();
                }
            } else {
                mBridgeContainerView2.onPlayableBackPress();
            }
        } else if (mBridgeVideoView.isMiniCardShowing()) {
            MBridgeContainerView mBridgeContainerView3 = this.f22243f;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
            }
        } else {
            this.f22242e.onBackPress();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[Catch:{ all -> 0x00a7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26278a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            com.mbridge.msdk.foundation.entity.m r0 = new com.mbridge.msdk.foundation.entity.m     // Catch:{ all -> 0x00a7 }
            r0.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "2000037"
            r0.mo57471o(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "code="
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = ",desc="
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r0.mo57461j(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x003f
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx$c r4 = r4.getRewardTemplateMode()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.mo57205e()     // Catch:{ all -> 0x00a7 }
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            r0.mo57459i(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r3.f23339k     // Catch:{ all -> 0x00a7 }
            r0.mo57467m(r4)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0052
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r4.getId()     // Catch:{ all -> 0x00a7 }
        L_0x0052:
            r0.mo57469n(r5)     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x006e
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ all -> 0x00a7 }
            r0.mo57463k(r4)     // Catch:{ all -> 0x00a7 }
        L_0x006e:
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x0087
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r3.f22204A     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.getRequestIdNotice()     // Catch:{ all -> 0x00a7 }
            r0.mo57465l(r4)     // Catch:{ all -> 0x00a7 }
        L_0x0087:
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            int r4 = com.mbridge.msdk.foundation.tools.C8596q.m24849n(r4)     // Catch:{ all -> 0x00a7 }
            r0.mo57445c((int) r4)     // Catch:{ all -> 0x00a7 }
            android.content.Context r5 = r3.getContext()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.tools.C8596q.m24818a((android.content.Context) r5, (int) r4)     // Catch:{ all -> 0x00a7 }
            r0.mo57477r(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = com.mbridge.msdk.foundation.entity.C8412m.m24231e((com.mbridge.msdk.foundation.entity.C8412m) r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r3.f23339k     // Catch:{ all -> 0x00a7 }
            com.mbridge.msdk.video.module.p367b.C9410b.m26950a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x00a7 }
            goto L_0x00b1
        L_0x00a7:
            r4 = move-exception
            java.lang.String r5 = f22203y
            java.lang.String r0 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r5, r0, r4)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.MBTempContainer.m26278a(int, java.lang.String):void");
    }

    /* renamed from: h */
    private int m26297h() {
        try {
            C9548a b = C9549b.m27299a().mo63129b();
            if (b == null) {
                C9549b.m27299a().mo63130c();
            }
            if (b != null) {
                return (int) b.mo63118f();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$e */
    private final class C9214e extends C9391f {
        private C9214e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
            if (com.mbridge.msdk.video.p346bt.module.MBTempContainer.m26287d(r5.f22260a).isCampaignIsFiltered() != false) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
            if (com.mbridge.msdk.video.p346bt.module.MBTempContainer.m26287d(r5.f22260a).isCampaignIsFiltered() != false) goto L_0x0169;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62252a(int r6, java.lang.Object r7) {
            /*
                r5 = this;
                super.mo62252a(r6, r7)
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean r0 = r0.f23346r
                java.lang.String r1 = "NotifyListener"
                if (r0 == 0) goto L_0x003e
                boolean r0 = r7 instanceof java.lang.String     // Catch:{ Exception -> 0x0036 }
                if (r0 == 0) goto L_0x003e
                r0 = r7
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0036 }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0036 }
                if (r2 != 0) goto L_0x003e
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0036 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0036 }
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this     // Catch:{ Exception -> 0x0036 }
                java.lang.String r3 = "Alert_window_status"
                int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x0036 }
                int unused = r0.f22210G = r3     // Catch:{ Exception -> 0x0036 }
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this     // Catch:{ Exception -> 0x0036 }
                java.lang.String r3 = "complete_info"
                int r2 = r2.getInt(r3)     // Catch:{ Exception -> 0x0036 }
                int unused = r0.f22211H = r2     // Catch:{ Exception -> 0x0036 }
                goto L_0x003e
            L_0x0036:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)
            L_0x003e:
                r0 = 2
                r2 = 0
                if (r6 == r0) goto L_0x00df
                r3 = 121(0x79, float:1.7E-43)
                r4 = 1
                if (r6 == r3) goto L_0x00be
                r3 = 16
                if (r6 == r3) goto L_0x00b3
                r3 = 17
                if (r6 == r3) goto L_0x00ac
                switch(r6) {
                    case 10: goto L_0x0054;
                    case 11: goto L_0x00df;
                    case 12: goto L_0x00df;
                    default: goto L_0x0052;
                }
            L_0x0052:
                goto L_0x0194
            L_0x0054:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r6.f22231ad = r4
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r6.f22204A
                if (r6 == 0) goto L_0x0194
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r6.f22204A
                boolean r6 = r6.isDynamicView()
                if (r6 == 0) goto L_0x008c
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean r6 = r6.f23351w
                if (r6 == 0) goto L_0x0082
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r6.f22204A
                boolean r6 = r6.isCampaignIsFiltered()
                if (r6 == 0) goto L_0x0095
                goto L_0x008c
            L_0x0082:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r6 = r6.f22206C
                r6.mo60930a()
                goto L_0x0095
            L_0x008c:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r6 = r6.f22206C
                r6.mo60930a()
            L_0x0095:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                android.content.Context r6 = r6.getContext()
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22204A
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                java.lang.String r0 = r0.f23339k
                com.mbridge.msdk.video.p346bt.module.p349b.C9243f.m26460a((android.content.Context) r6, (com.mbridge.msdk.foundation.entity.CampaignEx) r7, (java.lang.String) r0)
                goto L_0x0194
            L_0x00ac:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r6.f22225V = r4
                goto L_0x0194
            L_0x00b3:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.signal.c r6 = r6.getJSCommon()
                r6.mo62824d()
                goto L_0x0194
            L_0x00be:
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r6.f22225V = r4
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r6 = r6.f22206C
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                java.lang.String r7 = r7.f23340l
                com.mbridge.msdk.video.bt.module.MBTempContainer r0 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                java.lang.String r0 = r0.f23339k
                r6.mo60933a((java.lang.String) r7, (java.lang.String) r0)
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r6.f22231ad = r2
                goto L_0x0194
            L_0x00df:
                r3 = 12
                if (r6 != r3) goto L_0x0172
                java.lang.String r3 = "Play error but has no message."
                boolean r4 = r7 instanceof java.lang.String     // Catch:{ all -> 0x00ef }
                if (r4 == 0) goto L_0x00f7
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
                r3 = r7
                goto L_0x00f7
            L_0x00ef:
                r7 = move-exception
                java.lang.String r7 = r7.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r7)
            L_0x00f7:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                android.content.Context r7 = r7.getContext()
                com.mbridge.msdk.video.bt.module.MBTempContainer r1 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r1.f22204A
                com.mbridge.msdk.video.bt.module.MBTempContainer r4 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                java.lang.String r4 = r4.f23339k
                com.mbridge.msdk.video.p346bt.module.p349b.C9243f.m26461a(r7, r1, r4, r3)
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean r7 = r7.f22231ad
                if (r7 != 0) goto L_0x0172
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.videocommon.d.c r7 = r7.f23341m
                int r7 = r7.mo63132B()
                if (r7 != 0) goto L_0x0136
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r6 = r6.f22206C
                java.lang.String r7 = "play error"
                r6.mo60932a(r7)
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r6.f22231ad = r2
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.p346bt.module.MBTempContainer.m26302l(r6)
                return
            L_0x0136:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22204A
                if (r7 == 0) goto L_0x0169
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22204A
                boolean r7 = r7.isDynamicView()
                if (r7 == 0) goto L_0x0169
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean r7 = r7.f23351w
                if (r7 == 0) goto L_0x015f
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.foundation.entity.CampaignEx r7 = r7.f22204A
                boolean r7 = r7.isCampaignIsFiltered()
                if (r7 == 0) goto L_0x0172
                goto L_0x0169
            L_0x015f:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22206C
                r7.mo60930a()
                goto L_0x0172
            L_0x0169:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.bt.module.b.h r7 = r7.f22206C
                r7.mo60930a()
            L_0x0172:
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.mbridge.msdk.video.signal.i r7 = r7.getJSVideoModule()
                r1 = 3
                r7.videoOperate(r1)
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                boolean unused = r7.f22231ad = r2
                com.mbridge.msdk.video.bt.module.MBTempContainer r7 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r7 = r7.f22237aj
                if (r7 == 0) goto L_0x0194
                if (r6 != r0) goto L_0x0194
                com.mbridge.msdk.video.bt.module.MBTempContainer r6 = com.mbridge.msdk.video.p346bt.module.MBTempContainer.this
                com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r6 = r6.f22237aj
                r6.skipped()
            L_0x0194:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.MBTempContainer.C9214e.mo62252a(int, java.lang.Object):void");
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$b */
    private final class C9211b extends C9385a {
        public C9211b(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* renamed from: a */
        public final void mo62252a(int i, Object obj) {
            String str = "";
            if (i != 108) {
                if (i != 113) {
                    if (i != 117) {
                        if (i != 126 && i != 128) {
                            switch (i) {
                                case 103:
                                case 104:
                                    MBTempContainer.m26302l(MBTempContainer.this);
                                    break;
                                case 105:
                                    C9432c jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        str = obj.toString();
                                    }
                                    jSCommon.click(1, str);
                                    break;
                                case 106:
                                    break;
                            }
                        } else {
                            MBTempContainer.this.f22206C.mo60936a(false, MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
                        }
                    } else {
                        if (MBTempContainer.this.f22242e != null) {
                            MBTempContainer.this.f22242e.setVisible(4);
                        }
                        boolean unused = MBTempContainer.this.f22232ae = true;
                        MBTempContainer.this.f22206C.mo60937b(MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
                    }
                }
                MBTempContainer.this.f22206C.mo60936a(true, MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
            } else {
                MBTempContainer.this.getJSCommon().mo62814a((C9432c.C9433a) new C9416c.C9418b(MBTempContainer.this.getJSCommon(), new C9213d()));
                C9432c jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    str = obj.toString();
                }
                jSCommon2.click(1, str);
            }
            super.mo62252a(i, obj);
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$c */
    private final class C9212c extends C9391f {
        private C9212c() {
        }

        /* renamed from: a */
        public final void mo62252a(int i, Object obj) {
            String str;
            super.mo62252a(i, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (MBTempContainer.this.f23346r && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt("complete");
                    if (optInt == 2) {
                        int unused = MBTempContainer.this.f22210G = C8413a.f20338t;
                    } else if (optInt != 3) {
                        int unused2 = MBTempContainer.this.f22210G = C8413a.f20336r;
                    } else {
                        int unused3 = MBTempContainer.this.f22210G = C8413a.f20337s;
                    }
                    int unused4 = MBTempContainer.this.f22211H = optInt2;
                }
            } catch (Exception unused5) {
                C8608u.m24884d("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i == 120) {
                MBTempContainer.this.f22206C.mo60937b(MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
            } else if (i == 126) {
                MBTempContainer.this.f22206C.mo60936a(false, MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
            } else if (i != 127) {
                switch (i) {
                    case 100:
                        boolean unused6 = MBTempContainer.this.f22233af = true;
                        MBTempContainer.this.f22244g.postDelayed(MBTempContainer.this.f22238ak, 250);
                        MBTempContainer.this.f22206C.mo60930a();
                        return;
                    case 101:
                    case 102:
                        MBTempContainer.this.getJSCommon().mo62824d();
                        return;
                    case 103:
                        boolean unused7 = MBTempContainer.this.f22225V = true;
                        if (MBTempContainer.this.f22204A.isMraid()) {
                            MBTempContainer.m26302l(MBTempContainer.this);
                            return;
                        } else {
                            MBTempContainer.this.getJSCommon().mo62824d();
                            return;
                        }
                    case 104:
                        MBTempContainer.m26302l(MBTempContainer.this);
                        return;
                    case 105:
                        MBTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        return;
                    default:
                        return;
                }
            } else {
                boolean unused8 = MBTempContainer.this.f22225V = true;
                MBTempContainer.this.f22206C.mo60930a();
                MBTempContainer.this.f22206C.mo60937b(MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
                MBTempContainer.this.getJSContainerModule().showEndcard(100);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBTempContainer$d */
    private class C9213d extends C9416c.C9417a {
        private C9213d() {
        }

        /* renamed from: a */
        public final void mo62253a() {
            super.mo62253a();
            MBTempContainer.this.receiveSuccess();
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.m26268E(MBTempContainer.this);
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            boolean unused = MBTempContainer.this.f22230ac = true;
            MBTempContainer.m26269F(MBTempContainer.this);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && MBTempContainer.this.f23338j != null) {
                        if (MBTempContainer.this.f23351w) {
                            MBTempContainer.m26302l(MBTempContainer.this);
                        } else {
                            MBTempContainer.this.f23338j.finish();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.m26269F(MBTempContainer.this);
            boolean unused = MBTempContainer.this.f22230ac = true;
        }

        /* renamed from: a */
        public final void mo62255a(boolean z) {
            super.mo62255a(z);
            MBTempContainer.this.f22206C.mo60936a(z, MBTempContainer.this.f23340l, MBTempContainer.this.f23339k);
        }

        /* renamed from: a */
        public final void mo62254a(int i, String str) {
            super.mo62254a(i, str);
            MBTempContainer.this.defaultLoad(i, str);
        }

        /* renamed from: b */
        public final void mo62256b() {
            super.mo62256b();
            if (MBTempContainer.this.f22244g != null) {
                MBTempContainer.this.f22244g.removeCallbacks(MBTempContainer.this.f22245h);
            }
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22204A = campaignEx;
        if (campaignEx != null) {
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f23339k)) {
                campaignEx.setCampaignUnitId(this.f23339k);
            }
            C2347b a = C2347b.m5579a();
            a.mo15768a(campaignEx.getCampaignUnitId() + "_" + 1, campaignEx);
        }
    }

    public CampaignEx getCampaign() {
        return this.f22204A;
    }

    public void setCampaignExpired(boolean z) {
        try {
            if (this.f22204A == null) {
                return;
            }
            if (z) {
                this.f22204A.setSpareOfferFlag(1);
                if (this.f23341m == null) {
                    return;
                }
                if (this.f23341m.mo63186x() == 1) {
                    this.f22204A.setCbt(1);
                } else {
                    this.f22204A.setCbt(0);
                }
            } else {
                this.f22204A.setSpareOfferFlag(0);
                this.f22204A.setCbt(0);
            }
        } catch (Exception e) {
            C8608u.m24884d(f22203y, e.getMessage());
        }
    }

    public void setCampaignDownLoadTask(C9552a aVar) {
        this.f22205B = aVar;
    }

    public void setShowRewardListener(C9246h hVar) {
        this.f22206C = hVar;
    }

    public void setMBridgeTempCallback(C9237b bVar) {
        this.f22207D = bVar;
    }

    public void setJSFactory(C9529b bVar) {
        this.f22209F = bVar;
    }

    public void setInstanceId(String str) {
        this.f22208E = str;
    }

    public String getInstanceId() {
        return this.f22208E;
    }

    public void setWebViewFront(int i) {
        this.f22222S = i;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.f22213J = i;
        this.f22214K = i2;
        this.f22215L = i3;
        this.f22216M = i4;
        this.f22217N = i5;
        String a = C8582k.m24787a(i, i2, i3, i4, i5);
        this.f22218O = a;
        C8608u.m24884d(f22203y, a);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f22218O)) {
            getJSCommon().mo62819b(this.f22218O);
            if (this.f22241d != null && !TextUtils.isEmpty(this.f22218O)) {
                C8824g.m25670a().mo58310a((WebView) this.f22241d, "oncutoutfetched", Base64.encodeToString(this.f22218O.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.f22242e;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeContainerView mBridgeContainerView = this.f22243f;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f22219P = str;
    }

    public void onCreate() {
        ViewGroup viewGroup;
        int i;
        int i2;
        if (this.f23341m == null) {
            this.f23341m = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f23339k, this.f23346r);
        }
        this.f22234ag = false;
        try {
            if (!this.f23351w) {
                this.f22206C = new C9241d(getContext(), this.f23346r, this.f23341m, this.f22204A, this.f22206C, mo63048b(), this.f23339k);
            } else if (this.f22204A == null || !this.f22204A.isDynamicView()) {
                this.f22206C = new C9240c(this.f22207D, this.f22208E);
            } else {
                this.f22206C = new C9241d(getContext(), this.f23346r, this.f23341m, this.f22204A, this.f22206C, mo63048b(), this.f23339k);
            }
            if (this.f22204A != null && this.f22204A.isActiveOm()) {
                this.f22236ai = C2265b.m5114a(getContext(), false, this.f22204A.getOmid(), this.f22204A.getRequestId(), this.f22204A.getId(), this.f23339k, this.f22205B.mo63219n(), this.f22204A.getRequestIdNotice());
            }
            registerErrorListener(new C9242e(this.f22206C));
            mo63044a(this.f23341m, this.f22204A);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                mo62204a("layoutID not found");
                return;
            }
            View inflate = this.f22220Q.inflate(layoutID, (ViewGroup) null);
            this.f22247z = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f22227a) {
                setMatchParent();
            }
            this.f22241d = findWindVaneWebView();
            MBridgeVideoView findMBridgeVideoView = findMBridgeVideoView();
            this.f22242e = findMBridgeVideoView;
            findMBridgeVideoView.setVideoLayout(this.f22204A);
            this.f22242e.setIsIV(this.f23346r);
            this.f22242e.setUnitId(this.f23339k);
            if (this.f23351w) {
                this.f22242e.setNotchPadding(this.f22214K, this.f22215L, this.f22216M, this.f22217N);
            }
            this.f22243f = findMBridgeContainerView();
            if (this.f23351w) {
                this.f22243f.setNotchPadding(this.f22213J, this.f22214K, this.f22215L, this.f22216M, this.f22217N);
            }
            if (!((this.f22242e == null || this.f22243f == null || !initViews()) ? false : true)) {
                this.f22240c.mo62250a("not found View IDS");
                if (this.f23338j != null) {
                    this.f23338j.finish();
                    return;
                }
                return;
            }
            this.f22239b = true;
            WindVaneWebView windVaneWebView = this.f22241d;
            C9529b bVar = new C9529b(this.f23338j, windVaneWebView, this.f22242e, this.f22243f, this.f22204A, new C9213d());
            this.f22209F = bVar;
            registerJsFactory(bVar);
            C2347b a = C2347b.m5579a();
            a.mo15767a(this.f23339k + "_" + 1, (C2339a) new C2339a() {
                /* renamed from: a */
                public final void mo15737a() {
                    String str;
                    MBTempContainer.this.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBTempContainer.f22203y, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBTempContainer.this.f22241d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo15739b() {
                    String str;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBTempContainer.f22203y, th.getMessage(), th);
                        str = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBTempContainer.this.f22241d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo15738a(String str) {
                    String str2;
                    MBTempContainer.this.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C2350a.m5601e().mo15792g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8608u.m24881a(MBTempContainer.f22203y, th.getMessage(), th);
                        str2 = "";
                    }
                    C8824g.m25670a().mo58310a((WebView) MBTempContainer.this.f22241d, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f22247z.findViewById(C8594o.m24812a(getContext(), "mbridge_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.f22209F);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof C9425j) {
                    this.f22209F.mo63067a((C9425j) windVaneWebView.getObject());
                    getJSCommon().mo62811a(this.f23345q);
                    getJSCommon().mo62816a(this.f23339k);
                    getJSCommon().mo62815a(this.f23341m);
                    getJSCommon().mo62814a((C9432c.C9433a) new C9213d());
                    if (this.f22204A != null && (this.f22204A.isMraid() || this.f22204A.isActiveOm())) {
                        C8812d dVar = new C8812d(getContext());
                        this.f22235ah = dVar;
                        dVar.mo58265c();
                        this.f22235ah.mo58262a();
                        this.f22235ah.mo58263a(new C8812d.C8814b() {
                            /* renamed from: a */
                            public final void mo57882a(double d) {
                                String a = MBTempContainer.f22203y;
                                C8608u.m24884d(a, "volume is : " + d);
                                try {
                                    if (MBTempContainer.this.f22204A.isMraid() && MBTempContainer.this.f22243f != null && MBTempContainer.this.f22243f.getH5EndCardView() != null) {
                                        MBTempContainer.this.f22243f.getH5EndCardView().volumeChange(d);
                                    }
                                } catch (Exception e) {
                                    C8608u.m24884d(MBTempContainer.f22203y, e.getMessage());
                                }
                            }
                        });
                    }
                    getJSContainerModule().readyStatus(((C9425j) windVaneWebView.getObject()).mo62856o());
                    if (this.f22241d != null) {
                        int i3 = getResources().getConfiguration().orientation;
                        if (m26288d()) {
                            i2 = C8613y.m24952i(getContext());
                            i = C8613y.m24954j(getContext());
                            if (C8613y.m24769a(getContext())) {
                                int k = C8613y.m24956k(getContext());
                                if (i3 == 2) {
                                    i2 += k;
                                } else {
                                    i += k;
                                }
                            }
                        } else {
                            i2 = C8613y.m24950h(getContext());
                            i = C8613y.m24948g(getContext());
                        }
                        int c = this.f22204A.getRewardTemplateMode().mo57203c();
                        if (mo63049c(this.f22204A) == 1) {
                            c = i3;
                        }
                        getJSNotifyProxy().mo62840a(i3, c, i2, i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C8413a.f20328j, (double) C8613y.m24941d(getContext()));
                        try {
                            if (this.f23343o != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", this.f23343o.mo63097a());
                                jSONObject2.put("amount", this.f23343o.mo63100b());
                                jSONObject2.put("id", this.f23344p);
                                jSONObject.put(DataKeys.USER_ID, this.f23342n);
                                jSONObject.put("reward", jSONObject2);
                                jSONObject.put("playVideoMute", this.f23345q);
                                jSONObject.put("extra", this.f22219P);
                            }
                        } catch (JSONException e) {
                            C8608u.m24880a(f22203y, e.getMessage());
                        } catch (Exception e2) {
                            C8608u.m24880a(f22203y, e2.getMessage());
                        }
                        getJSNotifyProxy().mo62843a((Object) jSONObject.toString());
                        C8824g.m25670a().mo58310a((WebView) this.f22241d, "oncutoutfetched", Base64.encodeToString(this.f22218O.getBytes(), 0));
                        getJSCommon().mo62820b(true);
                        loadModuleDatas();
                        this.f22244g.postDelayed(this.f22245h, 2000);
                    }
                    ((C9425j) windVaneWebView.getObject()).f23028l.mo62253a();
                    if (this.f23351w) {
                        getJSCommon().mo62827e(this.f22222S);
                    }
                }
                if (getJSCommon().mo62810a() == 1 && (viewGroup = (ViewGroup) this.f22247z.findViewById(C8594o.m24812a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.f22247z).removeView(viewGroup);
                    ((ViewGroup) this.f22247z).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                m26296g();
                return;
            }
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                e3.printStackTrace();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mo62204a("onCreate error" + th);
        }
    }

    public void loadModuleDatas() {
        int i;
        int i2;
        int i3;
        C9425j b = mo63047b(this.f22204A);
        if (b != null) {
            i = b.mo62836k();
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f23345q = i;
        }
        int f = this.f23341m.mo63150f();
        int c = m26283c();
        int i4 = c != 0 ? c : f;
        this.f22242e.setSoundState(this.f23345q);
        this.f22242e.setCampaign(this.f22204A);
        this.f22242e.setPlayURL(this.f22205B.mo63219n());
        CampaignEx campaignEx = this.f22204A;
        if (campaignEx == null || campaignEx.getVst() <= -2) {
            i2 = this.f23341m.mo63148e();
        } else {
            i2 = this.f22204A.getVst();
        }
        this.f22242e.setVideoSkipTime(i2);
        this.f22242e.setCloseAlert(this.f23341m.mo63156i());
        this.f22242e.setBufferTimeout(m26297h());
        MBridgeVideoView mBridgeVideoView = this.f22242e;
        C9405n nVar = r3;
        int i5 = i2;
        C9405n nVar2 = new C9405n(this.f22209F, this.f22204A, this.f23343o, this.f22205B, mo63048b(), this.f23339k, i4, i2, new C9214e(), this.f23341m.mo63186x(), this.f23351w, this.f23341m.mo63132B());
        mBridgeVideoView.setNotifyListener(nVar);
        this.f22242e.setShowingTransparent(this.f22229ab);
        this.f22242e.setAdSession(this.f22236ai);
        if (this.f23346r && (this.f23348t == C8413a.f20332n || this.f23348t == C8413a.f20333o)) {
            this.f22242e.setIVRewardEnable(this.f23348t, this.f23349u, this.f23350v);
            this.f22242e.setDialogRole(getJSCommon() != null ? getJSCommon().mo62832h() : 1);
        }
        this.f22243f.setCampaign(this.f22204A);
        this.f22243f.setUnitID(this.f23339k);
        if (this.f22204A.getCbd() > -2) {
            i3 = this.f22204A.getCbd();
        } else {
            i3 = this.f23341m.mo63166n();
        }
        this.f22243f.setCloseDelayTime(i3);
        this.f22243f.setPlayCloseBtnTm(this.f23341m.mo63154h());
        this.f22243f.setVideoInteractiveType(this.f23341m.mo63152g());
        this.f22243f.setEndscreenType(this.f23341m.mo63168o());
        this.f22243f.setVideoSkipTime(i5);
        this.f22243f.setShowingTransparent(this.f22229ab);
        this.f22243f.setJSFactory(this.f22209F);
        if (this.f22204A.getPlayable_ads_without_video() == 2) {
            this.f22243f.setNotifyListener(new C9393h(this.f22204A, this.f22205B, this.f23343o, mo63048b(), this.f23339k, new C9212c(), this.f23341m.mo63186x(), this.f23351w));
            this.f22243f.preLoadData(this.f22209F);
            this.f22243f.showPlayableView();
        } else {
            this.f22243f.setNotifyListener(new C9387c(this.f22209F, this.f22204A, this.f23343o, this.f22205B, mo63048b(), this.f23339k, new C9211b(this.f23338j, this.f22204A), this.f23341m.mo63186x(), this.f23351w));
            this.f22243f.preLoadData(this.f22209F);
            this.f22242e.preLoadData(this.f22209F);
        }
        if (this.f22229ab) {
            this.f22243f.setMBridgeClickMiniCardViewTransparent();
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m26302l(MBTempContainer mBTempContainer) {
        try {
            if (mBTempContainer.f22207D != null) {
                if (mBTempContainer.f23346r && (mBTempContainer.f23348t == C8413a.f20332n || mBTempContainer.f23348t == C8413a.f20333o)) {
                    C9237b bVar = mBTempContainer.f22207D;
                    boolean z = true;
                    if (mBTempContainer.f22211H != 1) {
                        z = false;
                    }
                    bVar.mo62287a(z, mBTempContainer.f22210G);
                }
                mBTempContainer.f22207D.mo62286a(mBTempContainer.f22208E, mBTempContainer.f22225V, mBTempContainer.f23343o);
            } else if (mBTempContainer.f23338j != null) {
                mBTempContainer.f23338j.finish();
            }
        } catch (Exception unused) {
            if (mBTempContainer.f23338j != null) {
                mBTempContainer.f23338j.finish();
            }
        }
    }

    /* renamed from: E */
    static /* synthetic */ void m26268E(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23338j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f22223T.setBackgroundColor(0);
                    MBTempContainer.this.f22223T.setVisibility(0);
                    MBTempContainer.this.f22223T.bringToFront();
                }
            });
        }
    }

    /* renamed from: F */
    static /* synthetic */ void m26269F(MBTempContainer mBTempContainer) {
        if (mBTempContainer.isLoadSuccess()) {
            mBTempContainer.f23338j.runOnUiThread(new Runnable() {
                public final void run() {
                    MBTempContainer.this.f22223T.setVisibility(8);
                }
            });
        }
    }
}
