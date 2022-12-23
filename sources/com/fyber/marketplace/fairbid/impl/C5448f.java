package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.serverapi.C5300b;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridge;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.f */
public class C5448f extends MarketplaceBridge {

    /* renamed from: b */
    public final C5442b f14448b = new C5442b(new C5300b(C4309s.m13531b()));

    /* renamed from: c */
    public boolean f14449c = false;

    /* renamed from: com.fyber.marketplace.fairbid.impl.f$a */
    public class C5449a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceOnUserAgentAvailableListener f14450a;

        public C5449a(C5448f fVar, MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
            this.f14450a = marketplaceOnUserAgentAvailableListener;
        }

        public void run() {
            IAConfigManager iAConfigManager;
            int i = 0;
            while (true) {
                iAConfigManager = IAConfigManager.f10525J;
                if (iAConfigManager.f10560y.f14253c.compareAndSet(true, true) || i >= 100) {
                    String a = iAConfigManager.f10560y.mo26469a();
                } else {
                    IAlog.m16699a("UserAgentProvider | waiting on user agent", new Object[0]);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
            String a2 = iAConfigManager.f10560y.mo26469a();
            if (!a2.isEmpty()) {
                IAlog.m16699a("UserAgentAvailable", new Object[0]);
                this.f14450a.onUserAgentAvailable(a2);
            }
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.f$b */
    public class C5450b implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceBridgeAd f14451a;

        /* renamed from: b */
        public final /* synthetic */ MarketplaceAdLoadListener f14452b;

        public C5450b(C5448f fVar, MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            this.f14451a = marketplaceBridgeAd;
            this.f14452b = marketplaceAdLoadListener;
        }

        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
            IAConfigManager.removeListener(this);
            if (IAConfigManager.m13434g()) {
                this.f14451a.load();
                return;
            }
            MarketplaceAdLoadListener marketplaceAdLoadListener = this.f14452b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
            }
        }
    }

    /* renamed from: a */
    public void mo26668a(MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        IAConfigManager.addListener(new C5450b(this, marketplaceBridgeAd, marketplaceAdLoadListener));
        IAConfigManager.m13428a();
    }

    public MarketplaceAuctionParameters getAuctionParameters(String str) {
        this.f14448b.mo26665a(str);
        return this.f14448b;
    }

    public boolean isMuted() {
        return this.f14449c;
    }

    public void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener) {
        IAlog.m16699a("Request Banner with spotId = %s", str);
        C5445d dVar = new C5445d(str, jSONObject, map, this.f14449c, marketplaceBannerListener, this.f14448b);
        C5442b bVar = this.f14448b;
        C4364g gVar = bVar.f14419b.get(bVar.f14421d);
        bVar.f14419b.remove(bVar.f14421d);
        if (gVar != null) {
            dVar.setQueryInfo(gVar);
        }
        mo26668a(dVar, marketplaceBannerListener);
    }

    public void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener) {
        IAlog.m16699a("Request Interstitial with spotId = %s", str);
        mo26668a(new C5452h(str, jSONObject, map, this.f14449c, marketplaceInterstitialListener, this.f14448b), marketplaceInterstitialListener);
    }

    public void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener) {
        IAlog.m16699a("Request Interstitial with spotId = %s", str);
        mo26668a(new C5453i(str, jSONObject, map, marketplaceRewardedListener, this.f14448b), marketplaceRewardedListener);
    }

    public String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        C5357n.m16773a(new C5449a(this, marketplaceOnUserAgentAvailableListener));
        return IAConfigManager.f10525J.f10560y.mo26469a();
    }

    public void setMuted(boolean z) {
        this.f14449c = z;
    }

    public MarketplaceAuctionParameters getAuctionParameters() {
        this.f14448b.mo26665a("");
        return this.f14448b;
    }
}
