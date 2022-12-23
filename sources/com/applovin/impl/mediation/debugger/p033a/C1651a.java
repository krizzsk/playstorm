package com.applovin.impl.mediation.debugger.p033a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.a.a */
public class C1651a implements DTBAdCallback {

    /* renamed from: a */
    private final MaxAdFormat f2317a;

    /* renamed from: b */
    private final C1652a f2318b;

    /* renamed from: c */
    private DTBAdRequest f2319c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a */
    public interface C1652a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C1651a(C1653b bVar, MaxAdFormat maxAdFormat, C1652a aVar) {
        this((List<C1653b>) Arrays.asList(new C1653b[]{bVar}), maxAdFormat, aVar);
    }

    public C1651a(List<C1653b> list, MaxAdFormat maxAdFormat, C1652a aVar) {
        this.f2317a = maxAdFormat;
        this.f2318b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                dTBAdSizeArr[i] = list.get(i).mo13397a();
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f2319c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo13394a() {
        this.f2319c.loadAd(this);
    }

    public void onFailure(AdError adError) {
        this.f2318b.onAdLoadFailed(adError, this.f2317a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f2318b.onAdResponseLoaded(dTBAdResponse, this.f2317a);
    }
}
