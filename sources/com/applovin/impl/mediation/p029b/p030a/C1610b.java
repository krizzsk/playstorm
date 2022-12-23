package com.applovin.impl.mediation.p029b.p030a;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.mediation.b.a.b */
public class C1610b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a */
    private final int f2190a;

    /* renamed from: b */
    private final MaxNativeAdLoader f2191b;

    /* renamed from: c */
    private final Queue<MaxAd> f2192c = new LinkedList();

    /* renamed from: d */
    private boolean f2193d = false;

    /* renamed from: e */
    private final Object f2194e = new Object();

    /* renamed from: f */
    private C1611a f2195f;

    /* renamed from: com.applovin.impl.mediation.b.a.b$a */
    public interface C1611a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C1610b(String str, int i, Context context, C1611a aVar) {
        this.f2190a = i;
        this.f2195f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f2191b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        this.f2191b.setRevenueListener(this);
    }

    /* renamed from: a */
    public void mo13329a() {
        this.f2195f = null;
        mo13335e();
        this.f2191b.destroy();
    }

    /* renamed from: a */
    public void mo13330a(MaxAd maxAd) {
        this.f2191b.destroy(maxAd);
    }

    /* renamed from: a */
    public boolean mo13331a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f2191b.render(maxNativeAdView, maxAd);
    }

    /* renamed from: b */
    public boolean mo13332b() {
        boolean z;
        synchronized (this.f2194e) {
            z = !this.f2192c.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public void mo13333c() {
        synchronized (this.f2194e) {
            if (!this.f2193d && this.f2192c.size() < this.f2190a) {
                this.f2193d = true;
                this.f2191b.loadAd();
            }
        }
    }

    /* renamed from: d */
    public MaxAd mo13334d() {
        MaxAd remove;
        synchronized (this.f2194e) {
            remove = this.f2192c.remove();
            mo13333c();
        }
        return remove;
    }

    /* renamed from: e */
    public void mo13335e() {
        synchronized (this.f2194e) {
            for (MaxAd a : this.f2192c) {
                mo13330a(a);
            }
            this.f2192c.clear();
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C1611a aVar = this.f2195f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        C1611a aVar = this.f2195f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        C1611a aVar = this.f2195f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f2194e) {
            this.f2192c.add(maxAd);
            this.f2193d = false;
            mo13333c();
        }
        C1611a aVar = this.f2195f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
