package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4281e;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.C4397b;
import com.fyber.inneractive.sdk.flow.C4406c;
import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.network.C4558m;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.response.C5297k;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.marketplace.fairbid.impl.a */
public abstract class C5437a {
    public C5447e adSpot;
    public MarketplaceAuctionParameters mMarketplaceAuctionParameters;
    private C5444c mMarketplaceAuctionResponse;
    /* access modifiers changed from: private */
    public boolean mMuted;
    public String mPlacementId;
    public C4364g mWrapperQueryInfo;

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$a */
    public class C5438a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MarketplaceAdLoadListener f14404a;

        /* renamed from: b */
        public final /* synthetic */ C5287a f14405b;

        /* renamed from: c */
        public final /* synthetic */ String f14406c;

        /* renamed from: d */
        public final /* synthetic */ Map f14407d;

        /* renamed from: e */
        public final /* synthetic */ InneractiveUnitController f14408e;

        public C5438a(MarketplaceAdLoadListener marketplaceAdLoadListener, C5287a aVar, String str, Map map, InneractiveUnitController inneractiveUnitController) {
            this.f14404a = marketplaceAdLoadListener;
            this.f14405b = aVar;
            this.f14406c = str;
            this.f14407d = map;
            this.f14408e = inneractiveUnitController;
        }

        public void run() {
            C5437a.this.loadParsedData(this.f14408e, this.f14404a, C5437a.this.parseResponseData(this.f14404a, this.f14405b, this.f14406c, this.f14407d), C5437a.this.getAdContentLoader(this.f14404a, this.f14405b));
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$c */
    public class C5441c implements C4558m {

        /* renamed from: a */
        public final /* synthetic */ Map f14416a;

        /* renamed from: b */
        public final /* synthetic */ String f14417b;

        public C5441c(C5437a aVar, Map map, String str) {
            this.f14416a = map;
            this.f14417b = str;
        }

        /* renamed from: d */
        public StringBuffer mo24736d() {
            return new StringBuffer(this.f14417b);
        }

        /* renamed from: o */
        public Map<String, String> mo24737o() {
            return this.f14416a;
        }
    }

    public C5437a(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        Map<String, String> lowerCaseHeaders = lowerCaseHeaders(map);
        C5287a responseAdType = getResponseAdType(lowerCaseHeaders);
        this.mMarketplaceAuctionParameters = marketplaceAuctionParameters;
        this.mPlacementId = str;
        if (responseAdType != null) {
            this.mMarketplaceAuctionResponse = new C5444c(jSONObject, responseAdType, lowerCaseHeaders);
        }
        this.mMuted = z;
    }

    private void fireAdLoadFailedEvent(MarketplaceAdLoadError marketplaceAdLoadError) {
        if (isFullscreen()) {
            IAlog.m16699a("Firing Event 801 - AdLoadFailed - errorCode - %s", marketplaceAdLoadError.getErrorMessage());
            C4569q.C4570a aVar = new C4569q.C4570a(C4565o.IA_AD_LOAD_FAILED, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            String str = marketplaceAdLoadError.toString();
            try {
                jSONObject.put("message", str);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", str);
            }
            String errorMessage = marketplaceAdLoadError.getErrorMessage();
            try {
                jSONObject.put("extra_description", errorMessage);
            } catch (Exception unused2) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "extra_description", errorMessage);
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
        }
    }

    private C5288b generateParser(C5287a aVar, String str, Map<String, String> map) {
        C5288b a = C4397b.C4398a.f10858a.mo24559a(aVar);
        IAlog.m16699a("IA Exchange response handler: final headers: %s", map);
        if (a != null) {
            C5441c cVar = new C5441c(this, map, str);
            a.f14055a = a.mo24393a();
            a.f14057c = new C5297k(cVar);
        }
        return a;
    }

    /* access modifiers changed from: private */
    public void loadParsedData(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5291e eVar, C4452a aVar) {
        if (eVar != null && aVar != null) {
            C5357n.f14225b.post(new C5439b(eVar, aVar, inneractiveUnitController, marketplaceAdLoadListener));
        }
    }

    public C4452a getAdContentLoader(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5287a aVar) {
        C4397b.C4399b bVar = C4397b.C4398a.f10858a.f10857a.get(aVar);
        C4452a a = bVar != null ? bVar.mo24387a() : null;
        if (a != null) {
            return a;
        }
        notifyFailToListener(MarketplaceAdLoadError.UNSUPPORTED_AD_TYPE, marketplaceAdLoadListener);
        return null;
    }

    public abstract void internalOnAdLoaded(C5437a aVar, C5447e eVar);

    public abstract boolean isFullscreen();

    public boolean isMuted() {
        return this.mMuted;
    }

    public void loadAd(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        C5444c cVar = this.mMarketplaceAuctionResponse;
        if (cVar == null) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            return;
        }
        C5287a aVar = cVar.f14442b;
        String str = cVar.f14441a;
        Map<String, String> map = cVar.f14443c;
        if (aVar == null || str == null || map.isEmpty()) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
        } else {
            C5357n.m16773a(new C5438a(marketplaceAdLoadListener, aVar, str, map, inneractiveUnitController));
        }
    }

    public Map<String, String> lowerCaseHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (String next : map.keySet()) {
                hashMap.put(TextUtils.isEmpty(next) ? next : next.toLowerCase(Locale.ENGLISH), map.get(next));
            }
        }
        return hashMap;
    }

    public void notifyFailToListener(MarketplaceAdLoadError marketplaceAdLoadError, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        fireAdLoadFailedEvent(marketplaceAdLoadError);
        marketplaceAdLoadListener.onAdLoadFailed(marketplaceAdLoadError);
    }

    public C5291e parseResponseData(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, C5287a aVar, String str, Map<String, String> map) {
        try {
            C5291e a = generateParser(aVar, str, map).mo26384a(str);
            C4364g gVar = this.mWrapperQueryInfo;
            if (gVar != null) {
                a.f14084s = gVar;
            }
            InneractiveErrorCode a2 = a.mo24396a((InneractiveAdRequest) null);
            if (a2 == null) {
                return a;
            }
            notifyFailToListener(MarketplaceAdLoadError.RESPONSE_VALIDATION_FAILED, marketplaceAdLoadListener);
            IAlog.m16699a("failed parsing response data with error: %s", a2.toString());
            return null;
        } catch (Exception e) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            if (e.getMessage() != null) {
                IAlog.m16699a("failed parsing response data with error: %s", e.getMessage());
            }
            return null;
        }
    }

    public void setQueryInfo(C4364g gVar) {
        this.mWrapperQueryInfo = gVar;
    }

    public C5287a getResponseAdType(Map<String, String> map) {
        String str = map.get("X-IA-Ad-Type".toLowerCase(Locale.ENGLISH));
        if (str == null) {
            return null;
        }
        try {
            return C5287a.m16615a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: com.fyber.marketplace.fairbid.impl.a$b */
    public class C5439b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C5291e f14410a;

        /* renamed from: b */
        public final /* synthetic */ C4452a f14411b;

        /* renamed from: c */
        public final /* synthetic */ InneractiveUnitController f14412c;

        /* renamed from: d */
        public final /* synthetic */ MarketplaceAdLoadListener f14413d;

        public C5439b(C5291e eVar, C4452a aVar, InneractiveUnitController inneractiveUnitController, MarketplaceAdLoadListener marketplaceAdLoadListener) {
            this.f14410a = eVar;
            this.f14411b = aVar;
            this.f14412c = inneractiveUnitController;
            this.f14413d = marketplaceAdLoadListener;
        }

        public void run() {
            C5437a aVar = C5437a.this;
            C4309s featureProvider = aVar.mMarketplaceAuctionParameters.getFeatureProvider(aVar.mPlacementId);
            if (featureProvider == null) {
                featureProvider = new C4309s();
            }
            C5291e eVar = this.f14410a;
            C4281e eVar2 = new C4281e();
            ImpressionData impressionData = eVar.f14083r;
            eVar2.f10619a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.f10620b = Long.valueOf(IAConfigManager.f10525J.f10539d);
            } catch (NumberFormatException unused) {
                IAlog.m16699a("invalid publisherId", new Object[0]);
            }
            featureProvider.mo24340a(eVar2);
            C4452a aVar2 = this.f14411b;
            C5291e eVar3 = this.f14410a;
            boolean access$100 = C5437a.this.mMuted;
            C5440a aVar3 = new C5440a();
            C4406c cVar = (C4406c) aVar2;
            cVar.f10876g = access$100;
            cVar.mo24567a((InneractiveAdRequest) null, eVar3, featureProvider, aVar3);
        }

        /* renamed from: com.fyber.marketplace.fairbid.impl.a$b$a */
        public class C5440a implements C4452a.C4453a {
            public C5440a() {
            }

            /* renamed from: a */
            public void mo24578a() {
                C5439b bVar = C5439b.this;
                C5437a.this.adSpot = new C5447e(bVar.f14412c, ((C4406c) bVar.f14411b).f10872c);
                C5437a aVar = C5437a.this;
                aVar.internalOnAdLoaded(aVar, aVar.adSpot);
            }

            /* renamed from: a */
            public void mo24580a(InneractiveInfrastructureError inneractiveInfrastructureError) {
                C5439b.this.f14413d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
            }
        }
    }
}
