package com.p374my.target.nativeads;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9637c1;
import com.p374my.target.C9672e0;
import com.p374my.target.C9731h1;
import com.p374my.target.C9733h2;
import com.p374my.target.C9822l3;
import com.p374my.target.C9839m2;
import com.p374my.target.C9916q2;
import com.p374my.target.C9927q8;
import com.p374my.target.C9928r0;
import com.p374my.target.C9939s;
import com.p374my.target.C9997v2;
import com.p374my.target.common.BaseAd;
import com.p374my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeBannerAd */
public final class NativeBannerAd extends BaseAd implements INativeAd {
    private int adChoicesPlacement = 0;
    private final Context appContext;
    private C9928r0 engine;
    private NativeBannerAdListener listener;
    private NativeBannerAdMediaListener mediaListener;

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdListener */
    public interface NativeBannerAdListener {
        void onClick(NativeBannerAd nativeBannerAd);

        void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd);

        void onNoAd(String str, NativeBannerAd nativeBannerAd);

        void onShow(NativeBannerAd nativeBannerAd);
    }

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdMediaListener */
    public interface NativeBannerAdMediaListener {
        void onIconLoad(NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i, Context context) {
        super(i, "nativebanner");
        this.appContext = context.getApplicationContext();
        C9672e0.m27884c("NativeBannerAd created. Version: 5.15.0");
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
                C9731h1 a = C9731h1.m28125a(this, h2Var, this.appContext);
                this.engine = a;
                a.mo63658a(this.mediaListener);
                NativeBanner h = this.engine.mo63661h();
                if (h != null) {
                    this.listener.onLoad(h, this);
                }
            } else if (m2Var != null) {
                C9637c1 a2 = C9637c1.m27722a(this, m2Var, this.adConfig, this.metricFactory);
                this.engine = a2;
                a2.mo65787b(this.appContext);
            } else {
                NativeBannerAdListener nativeBannerAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                nativeBannerAdListener.onNoAd(str, this);
            }
        }
    }

    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public String getAdSource() {
        C9928r0 r0Var = this.engine;
        if (r0Var != null) {
            return r0Var.mo64147c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C9928r0 r0Var = this.engine;
        if (r0Var != null) {
            return r0Var.mo64148d();
        }
        return 0.0f;
    }

    public NativeBanner getBanner() {
        C9928r0 r0Var = this.engine;
        if (r0Var == null) {
            return null;
        }
        return r0Var.mo63661h();
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public NativeBannerAdListener getListener() {
        return this.listener;
    }

    public NativeBannerAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleData(String str) {
        C9939s.m29177a(str, this.adConfig, this.metricFactory).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C9997v2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.appContext);
    }

    public final void handleSection(C9997v2 v2Var) {
        C9822l3.C9823a a = C9822l3.m28580a(this.adConfig.getSlotId());
        C9939s.m29176a(v2Var, this.adConfig, a).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C9997v2) q2Var, str);
            }
        }).mo63567b(a.mo64679a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public final void load() {
        if (isLoadCalled()) {
            C9672e0.m27882a("NativeBannerAd doesn't support multiple load");
            return;
        }
        C9939s.m29175a(this.adConfig, this.metricFactory).mo63560a(new C9939s.C9941b() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeBannerAd.this.handleResult((C9997v2) q2Var, str);
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
        C9928r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.registerView(view, list, this.adChoicesPlacement);
        }
    }

    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(C9733h2 h2Var) {
        this.engine = C9731h1.m28125a(this, h2Var, this.appContext);
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(NativeBannerAdListener nativeBannerAdListener) {
        this.listener = nativeBannerAdListener;
    }

    public void setMediaListener(NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.mediaListener = nativeBannerAdMediaListener;
        C9928r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.mo63658a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public final void unregisterView() {
        C9927q8.m29116a(this);
        C9928r0 r0Var = this.engine;
        if (r0Var != null) {
            r0Var.unregisterView();
        }
    }
}
