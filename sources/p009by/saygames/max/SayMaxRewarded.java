package p009by.saygames.max;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.unity3d.player.UnityPlayer;

/* renamed from: by.saygames.max.SayMaxRewarded */
public class SayMaxRewarded implements MaxRewardedAdListener {
    public static SayMaxRewarded instance = new SayMaxRewarded();
    private MaxRewardedAd _rewardedAd;
    private String _rewardedId;

    public void onRewardedVideoCompleted(MaxAd maxAd) {
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
    }

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public void createRewardedAd(String str) {
        if (this._rewardedAd == null) {
            this._rewardedId = str;
            MaxRewardedAd instance2 = MaxRewardedAd.getInstance(str, getActivity());
            this._rewardedAd = instance2;
            instance2.setListener(this);
        }
    }

    public void loadAdWithInit(String str) {
        createRewardedAd(str);
        MaxRewardedAd maxRewardedAd = this._rewardedAd;
        if (maxRewardedAd != null) {
            maxRewardedAd.loadAd();
        }
    }

    public void loadAd() {
        MaxRewardedAd maxRewardedAd = this._rewardedAd;
        if (maxRewardedAd != null) {
            maxRewardedAd.loadAd();
        }
    }

    public void showAd() {
        MaxRewardedAd maxRewardedAd = this._rewardedAd;
        if (maxRewardedAd != null) {
            maxRewardedAd.showAd();
        }
    }

    public boolean hasRewarded() {
        MaxRewardedAd maxRewardedAd = this._rewardedAd;
        if (maxRewardedAd != null) {
            return maxRewardedAd.isReady();
        }
        return false;
    }

    public void onAdLoaded(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdLoadedEvent", maxAd, (MaxError) null);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdLoadFailedEvent", (MaxAd) null, maxError);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdFailedToDisplayEvent", maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdDisplayedEvent", maxAd, (MaxError) null);
    }

    public void onAdClicked(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdClickedEvent", maxAd, (MaxError) null);
    }

    public void onAdHidden(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdHiddenEvent", maxAd, (MaxError) null);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        SayMaxManager.SendEventToUnityMaxMediation("OnRewardedAdReceivedRewardEvent", maxAd, (MaxError) null);
    }
}
