package com.p374my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.C9672e0;
import com.p374my.target.C9963t2;
import com.p374my.target.ads.Reward;
import com.p374my.target.ads.RewardedAd;
import com.p374my.target.common.CustomParams;
import com.p374my.target.mediation.MediationRewardedAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetRewardedAdAdapter */
public final class MyTargetRewardedAdAdapter implements MediationRewardedAdAdapter {

    /* renamed from: ad */
    private RewardedAd f24355ad;
    private C9963t2 section;

    /* renamed from: com.my.target.mediation.MyTargetRewardedAdAdapter$AdListener */
    public class AdListener implements RewardedAd.RewardedAdListener {
        private final MediationRewardedAdAdapter.MediationRewardedAdListener mediationListener;

        public AdListener(MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener) {
            this.mediationListener = mediationRewardedAdListener;
        }

        public void onClick(RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetRewardedAdAdapter.this);
        }

        public void onDismiss(RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: ad dismissed");
            this.mediationListener.onDismiss(MyTargetRewardedAdAdapter.this);
        }

        public void onDisplay(RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: ad displayed");
            this.mediationListener.onDisplay(MyTargetRewardedAdAdapter.this);
        }

        public void onLoad(RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: ad loaded");
            this.mediationListener.onLoad(MyTargetRewardedAdAdapter.this);
        }

        public void onNoAd(String str, RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetRewardedAdAdapter.this);
        }

        public void onReward(Reward reward, RewardedAd rewardedAd) {
            C9672e0.m27882a("MyTargetRewardedAdAdapter: onReward: " + reward.type);
            this.mediationListener.onReward(reward, MyTargetRewardedAdAdapter.this);
        }
    }

    public void destroy() {
        RewardedAd rewardedAd = this.f24355ad;
        if (rewardedAd != null) {
            rewardedAd.setListener((RewardedAd.RewardedAdListener) null);
            this.f24355ad.destroy();
            this.f24355ad = null;
        }
    }

    public void dismiss() {
        RewardedAd rewardedAd = this.f24355ad;
        if (rewardedAd != null) {
            rewardedAd.dismiss();
        }
    }

    public void load(MediationAdConfig mediationAdConfig, MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener, Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            RewardedAd rewardedAd = new RewardedAd(parseInt, context);
            this.f24355ad = rewardedAd;
            rewardedAd.setMediationEnabled(false);
            this.f24355ad.setListener(new AdListener(mediationRewardedAdListener));
            CustomParams customParams = this.f24355ad.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry next : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                C9672e0.m27882a("MyTargetRewardedAdAdapter: got banner from mediation response");
                this.f24355ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C9672e0.m27882a("MyTargetRewardedAdAdapter: load id " + parseInt);
                this.f24355ad.load();
            } else {
                C9672e0.m27882a("MyTargetRewardedAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f24355ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C9672e0.m27883b("MyTargetRewardedAdAdapter error: " + str);
            mediationRewardedAdListener.onNoAd(str, this);
        }
    }

    public void setSection(C9963t2 t2Var) {
        this.section = t2Var;
    }

    public void show(Context context) {
        RewardedAd rewardedAd = this.f24355ad;
        if (rewardedAd != null) {
            rewardedAd.show();
        }
    }
}
