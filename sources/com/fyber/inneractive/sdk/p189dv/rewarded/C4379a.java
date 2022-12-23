package com.fyber.inneractive.sdk.p189dv.rewarded;

import android.app.Activity;
import android.content.Context;
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
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a */
public class C4379a extends C4170a<RewardedAd> {

    /* renamed from: k */
    public final RewardedAdLoadCallback f10787k = new C4380a();

    /* renamed from: l */
    public final FullScreenContentCallback f10788l = new C4381b();

    /* renamed from: m */
    public final OnUserEarnedRewardListener f10789m = new C4382c();

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$a */
    public class C4380a extends RewardedAdLoadCallback {
        public C4380a() {
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C4360d dVar = C4379a.this.f10754g;
            if (dVar != null) {
                ((C4351b) dVar).mo24372f();
                InneractiveAdRequest inneractiveAdRequest = C4379a.this.f10913a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                C4362a aVar = C4362a.Load;
                C4379a aVar2 = C4379a.this;
                C4368c.m13611a(spotId, aVar, aVar2.f10913a, (C4363f) aVar2.f10914b, loadAdError.getMessage());
            }
        }

        public void onAdLoaded(Object obj) {
            T t = (RewardedAd) obj;
            C4379a aVar = C4379a.this;
            if (aVar.f10754g != null) {
                aVar.f10756i = t;
                aVar.mo23832f();
                ((C4351b) C4379a.this.f10754g).mo24571d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$b */
    public class C4381b extends FullScreenContentCallback {
        public C4381b() {
        }

        public void onAdDismissedFullScreenContent() {
            C4371a aVar = C4379a.this.f10317j;
            if (aVar != null) {
                aVar.mo24403i();
            }
        }

        public void onAdImpression() {
            C4371a aVar = C4379a.this.f10317j;
            if (aVar != null) {
                aVar.mo24405v();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$c */
    public class C4382c implements OnUserEarnedRewardListener {
        public C4382c() {
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C4371a aVar = C4379a.this.f10317j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public C4379a(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public void mo24366a(AdRequest adRequest, C4360d dVar) {
        this.f10754g = dVar;
        RewardedAd.load((Context) C5350l.f14216a, "FyberRewarded", adRequest, this.f10787k);
    }

    /* renamed from: d */
    public boolean mo24373d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo24368e() {
        return this.f10756i != null;
    }

    /* renamed from: a */
    public void mo23831a(C4371a aVar, Activity activity) {
        this.f10317j = aVar;
        T t = this.f10756i;
        if (t != null) {
            ((RewardedAd) t).setFullScreenContentCallback(this.f10788l);
            ((RewardedAd) this.f10756i).show(activity, this.f10789m);
        }
    }
}
