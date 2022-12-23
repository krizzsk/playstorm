package com.fyber.marketplace.fairbid.impl;

import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialDisplayEventsListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.h */
public class C5452h extends C5451g<MarketplaceInterstitialDisplayEventsListener> implements MarketplaceInterstitialAd {
    public C5452h(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAdLoadListener<MarketplaceFullscreenAd<MarketplaceInterstitialDisplayEventsListener>> marketplaceAdLoadListener, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAdLoadListener, marketplaceAuctionParameters);
    }
}
