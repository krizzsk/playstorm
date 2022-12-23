package com.applovin.impl.mediation.debugger.p033a;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.a.b */
public class C1653b {

    /* renamed from: a */
    private final String f2320a;

    /* renamed from: b */
    private DTBAdSize f2321b;

    /* renamed from: com.applovin.impl.mediation.debugger.a.b$a */
    private enum C1654a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C1653b(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f2320a = str;
        this.f2321b = m3340a(JsonUtils.getInt(jSONObject, "type", m3341a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* renamed from: a */
    private DTBAdSize m3340a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (C1654a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (C1654a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (C1654a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C1654a m3341a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? C1654a.DISPLAY : C1654a.INTERSTITIAL;
    }

    /* renamed from: a */
    public DTBAdSize mo13397a() {
        return this.f2321b;
    }
}
