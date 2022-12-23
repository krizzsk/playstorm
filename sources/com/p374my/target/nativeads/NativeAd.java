package com.p374my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.p374my.target.C10023w8;
import com.p374my.target.C9622b1;
import com.p374my.target.C9672e0;
import com.p374my.target.C9695f1;
import com.p374my.target.C9733h2;
import com.p374my.target.C9839m2;
import com.p374my.target.C9914q0;
import com.p374my.target.C9916q2;
import com.p374my.target.C9927q8;
import com.p374my.target.C9939s;
import com.p374my.target.C9997v2;
import com.p374my.target.common.BaseAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeAd */
public final class NativeAd extends BaseAd implements INativeAd {
    private int adChoicesPlacement = 0;
    private final Context appContext;
    private C9914q0 engine;
    private NativeAdListener listener;
    private NativeAdMediaListener mediaListener;
    private boolean useExoPlayer = true;

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdListener */
    public interface NativeAdListener {
        void onClick(NativeAd nativeAd);

        void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd);

        void onNoAd(String str, NativeAd nativeAd);

        void onShow(NativeAd nativeAd);

        void onVideoComplete(NativeAd nativeAd);

        void onVideoPause(NativeAd nativeAd);

        void onVideoPlay(NativeAd nativeAd);
    }

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdMediaListener */
    public interface NativeAdMediaListener {
        void onIconLoad(NativeAd nativeAd);

        void onImageLoad(NativeAd nativeAd);
    }

    public NativeAd(int i, Context context) {
        super(i, "nativeads");
        this.appContext = context.getApplicationContext();
        C9672e0.m27884c("NativeAd created. Version: 5.15.0");
    }

    /* access modifiers changed from: private */
    public void handleResult(C9997v2 v2Var, String str) {
        C9839m2 m2Var;
        if (this.listener != null) {
            C9733h2 h2Var = null;
            if (v2Var != null) {
                h2Var = v2Var.mo65604e();
                m2Var = v2Var.mo65294b();
            } else {
                m2Var = null;
            }
            if (h2Var != null) {
                C9695f1 a = C9695f1.m27984a(this, h2Var, this.appContext);
                this.engine = a;
                a.mo63576a(this.mediaListener);
                if (this.engine.mo63579g() != null) {
                    this.listener.onLoad(this.engine.mo63579g(), this);
                }
            } else if (m2Var != null) {
                C9622b1 a2 = C9622b1.m27653a(this, m2Var, this.adConfig, this.metricFactory);
                this.engine = a2;
                a2.mo65787b(this.appContext);
            } else {
                NativeAdListener nativeAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                nativeAdListener.onNoAd(str, this);
            }
        }
    }

    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            return q0Var.mo63981c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            return q0Var.mo63982d();
        }
        return 0.0f;
    }

    public NativePromoBanner getBanner() {
        C9914q0 q0Var = this.engine;
        if (q0Var == null) {
            return null;
        }
        return q0Var.mo63579g();
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeAdListener getListener() {
        return this.listener;
    }

    public NativeAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleData(String str) {
        C9939s.m29177a(str, this.adConfig, this.metricFactory).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeAd.this.handleResult((C9997v2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.appContext);
    }

    public final void handleSection(C9997v2 v2Var) {
        C9939s.m29176a(v2Var, this.adConfig, this.metricFactory).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeAd.this.handleResult((C9997v2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    public final void load() {
        if (isLoadCalled()) {
            C9672e0.m27882a("NativeAd doesn't support multiple load");
            return;
        }
        C9939s.m29175a(this.adConfig, this.metricFactory).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeAd.this.handleResult((C9997v2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.appContext);
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        load();
    }

    public final void registerView(View view) {
        registerView(view, (List<View>) null);
    }

    public final void registerView(View view, List<View> list) {
        C9927q8.m29115a(view, this);
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo63573a(view, list, this.adChoicesPlacement, (MediaAdView) null);
        }
    }

    public void registerView(View view, List<View> list, MediaAdView mediaAdView) {
        C9927q8.m29115a(view, this);
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo63573a(view, list, this.adChoicesPlacement, mediaAdView);
        }
    }

    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(C9733h2 h2Var) {
        this.engine = C9695f1.m27984a(this, h2Var, this.appContext);
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeAdListener nativeAdListener) {
        this.listener = nativeAdListener;
    }

    public void setMediaListener(NativeAdMediaListener nativeAdMediaListener) {
        this.mediaListener = nativeAdMediaListener;
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.mo63576a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public final void unregisterView() {
        C9927q8.m29116a(this);
        C9914q0 q0Var = this.engine;
        if (q0Var != null) {
            q0Var.unregisterView();
        }
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (!z) {
            C10023w8.m29665g();
        }
    }
}
