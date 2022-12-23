package com.p374my.target.ads;

import android.content.Context;
import com.p374my.target.C9625b2;
import com.p374my.target.C9655d1;
import com.p374my.target.C9672e0;
import com.p374my.target.C9839m2;
import com.p374my.target.C9891p0;
import com.p374my.target.C9963t2;
import com.p374my.target.C9995v0;

/* renamed from: com.my.target.ads.RewardedAd */
public final class RewardedAd extends BaseInterstitialAd {
    public RewardedAdListener listener;

    /* renamed from: com.my.target.ads.RewardedAd$EngineListener */
    public class EngineListener implements C9891p0.C9892a {
        private EngineListener() {
        }

        public void onClick() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onClick(rewardedAd);
            }
        }

        public void onDismiss() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDismiss(rewardedAd);
            }
        }

        public void onDisplay() {
            RewardedAd.this.finishRenderMetrics();
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onDisplay(rewardedAd);
            }
        }

        public void onLoad() {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onLoad(rewardedAd);
            }
        }

        public void onNoAd(String str) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onNoAd(str, rewardedAd);
            }
        }

        public void onStartDisplaying() {
            RewardedAd.this.startRenderMetrics();
        }

        public void onVideoCompleted() {
        }
    }

    /* renamed from: com.my.target.ads.RewardedAd$RewardedAdListener */
    public interface RewardedAdListener {
        void onClick(RewardedAd rewardedAd);

        void onDismiss(RewardedAd rewardedAd);

        void onDisplay(RewardedAd rewardedAd);

        void onLoad(RewardedAd rewardedAd);

        void onNoAd(String str, RewardedAd rewardedAd);

        void onReward(Reward reward, RewardedAd rewardedAd);
    }

    /* renamed from: com.my.target.ads.RewardedAd$RewardedListener */
    public class RewardedListener implements C9891p0.C9893b {
        private RewardedListener() {
        }

        public void onReward(Reward reward) {
            RewardedAd rewardedAd = RewardedAd.this;
            RewardedAdListener rewardedAdListener = rewardedAd.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onReward(reward, rewardedAd);
            }
        }
    }

    public RewardedAd(int i, Context context) {
        super(i, "rewarded", context);
        C9672e0.m27884c("RewardedAd created. Version: 5.15.0");
    }

    public void destroy() {
        super.destroy();
        this.listener = null;
    }

    public RewardedAdListener getListener() {
        return this.listener;
    }

    public void handleResult(C9963t2 t2Var, String str) {
        C9839m2 m2Var;
        C9625b2 b2Var;
        if (this.listener != null) {
            if (t2Var != null) {
                b2Var = t2Var.mo65447c();
                m2Var = t2Var.mo65294b();
            } else {
                b2Var = null;
                m2Var = null;
            }
            if (b2Var != null) {
                C9995v0 a = C9995v0.m29522a(b2Var, t2Var, this.useExoPlayer, new EngineListener());
                this.engine = a;
                if (a != null) {
                    a.mo63413a((C9891p0.C9893b) new RewardedListener());
                    this.listener.onLoad(this);
                    return;
                }
                this.listener.onNoAd("no ad", this);
            } else if (m2Var != null) {
                C9655d1 a2 = C9655d1.m27811a(m2Var, this.adConfig, this.metricFactory, new EngineListener());
                a2.mo63413a((C9891p0.C9893b) new RewardedListener());
                this.engine = a2;
                a2.mo65787b(this.context);
            } else {
                RewardedAdListener rewardedAdListener = this.listener;
                if (str == null) {
                    str = "no ad";
                }
                rewardedAdListener.onNoAd(str, this);
            }
        }
    }

    public void setListener(RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }
}
