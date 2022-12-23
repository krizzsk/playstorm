package com.fyber.inneractive.sdk.p189dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.C4170a;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p189dv.C4351b;
import com.fyber.inneractive.sdk.p189dv.C4360d;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.p189dv.enums.C4362a;
import com.fyber.inneractive.sdk.p189dv.handler.C4368c;
import com.fyber.inneractive.sdk.p189dv.interstitial.C4371a;
import com.fyber.inneractive.sdk.util.C5350l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b */
public class C4383b extends C4170a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f10793k = new C4384a();

    /* renamed from: l */
    public final RewardedAdCallback f10794l = new C4385b();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$a */
    public class C4384a extends RewardedAdLoadCallback {
        public C4384a() {
        }

        public void onRewardedAdFailedToLoad(int i) {
            C4360d dVar = C4383b.this.f10754g;
            if (dVar != null) {
                ((C4351b) dVar).mo24372f();
                InneractiveAdRequest inneractiveAdRequest = C4383b.this.f10913a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4362a aVar = C4362a.Load;
                C4383b bVar = C4383b.this;
                C4368c.m13611a(spotId, aVar, bVar.f10913a, (C4363f) bVar.f10914b, String.format("errorCode - %d", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void onRewardedAdLoaded() {
            C4383b bVar = C4383b.this;
            if (bVar.f10754g != null) {
                bVar.mo23832f();
                ((C4351b) C4383b.this.f10754g).mo24571d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$b */
    public class C4385b extends RewardedAdCallback {
        public C4385b() {
        }

        public void onRewardedAdClosed() {
            C4371a aVar = C4383b.this.f10317j;
            if (aVar != null) {
                aVar.mo24403i();
            }
        }

        public void onRewardedAdFailedToShow(int i) {
        }

        public void onRewardedAdOpened() {
            C4371a aVar = C4383b.this.f10317j;
            if (aVar != null) {
                aVar.mo24405v();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C4371a aVar = C4383b.this.f10317j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C4383b(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        this.f10754g = dVar;
        T rewardedAd = new RewardedAd(C5350l.f14216a, "FyberRewarded");
        this.f10756i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f10793k);
    }

    /* renamed from: d */
    public boolean mo24373d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        T t = this.f10756i;
        if (t != null) {
            return ((RewardedAd) t).isLoaded();
        }
        return false;
    }

    /* renamed from: a */
    public void mo23831a(C4371a aVar, Activity activity) {
        this.f10317j = aVar;
        ((RewardedAd) this.f10756i).show(activity, this.f10794l);
    }
}
