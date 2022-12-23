package com.p374my.target.ads;

import android.content.Context;
import com.p374my.target.C10023w8;
import com.p374my.target.C9672e0;
import com.p374my.target.C9822l3;
import com.p374my.target.C9870o;
import com.p374my.target.C9891p0;
import com.p374my.target.C9916q2;
import com.p374my.target.C9963t2;
import com.p374my.target.common.BaseAd;

/* renamed from: com.my.target.ads.BaseInterstitialAd */
public abstract class BaseInterstitialAd extends BaseAd {
    public final Context context;
    public C9891p0 engine;
    private C9822l3 renderMetricsMessage;
    public boolean useExoPlayer = true;

    public BaseInterstitialAd(int i, String str, Context context2) {
        super(i, str);
        this.context = context2;
    }

    public void destroy() {
        C9891p0 p0Var = this.engine;
        if (p0Var != null) {
            p0Var.destroy();
            this.engine = null;
        }
    }

    public void dismiss() {
        C9891p0 p0Var = this.engine;
        if (p0Var != null) {
            p0Var.dismiss();
        }
    }

    public void finishRenderMetrics() {
        C9822l3 l3Var = this.renderMetricsMessage;
        if (l3Var != null) {
            l3Var.mo64676b();
            this.renderMetricsMessage.mo64678b(this.context);
        }
    }

    public String getAdSource() {
        C9891p0 p0Var = this.engine;
        if (p0Var != null) {
            return p0Var.mo65189c();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C9891p0 p0Var = this.engine;
        if (p0Var != null) {
            return p0Var.mo65190d();
        }
        return 0.0f;
    }

    public abstract void handleResult(C9963t2 t2Var, String str);

    public final void handleSection(C9963t2 t2Var) {
        C9870o.m28855a(t2Var, this.adConfig, this.metricFactory).mo63560a(new C9870o.C9873c() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                BaseInterstitialAd.this.handleResult((C9963t2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.context);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    public final void load() {
        if (isLoadCalled()) {
            C9672e0.m27882a("Interstitial/Rewarded doesn't support multiple load");
            return;
        }
        C9870o.m28854a(this.adConfig, this.metricFactory).mo63560a(new C9870o.C9873c() {
            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                BaseInterstitialAd.this.handleResult((C9963t2) q2Var, str);
            }
        }).mo63567b(this.metricFactory.mo64679a(), this.context);
    }

    public void loadFromBid(String str) {
        this.adConfig.setBidId(str);
        load();
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void show() {
        show((Context) null);
    }

    public void show(Context context2) {
        C9891p0 p0Var = this.engine;
        if (p0Var == null) {
            C9672e0.m27884c("InterstitialAd.show: No ad");
            return;
        }
        if (context2 == null) {
            context2 = this.context;
        }
        p0Var.mo63410a(context2);
    }

    public void startRenderMetrics() {
        this.renderMetricsMessage = this.metricFactory.mo64682b();
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (!z) {
            C10023w8.m29665g();
        }
    }
}
