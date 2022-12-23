package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C4555k0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.response.C5296j;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5357n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.e */
public class C4226e implements C5296j {

    /* renamed from: a */
    public AdmParametersOuterClass$AdmParameters f10433a;

    /* renamed from: b */
    public final String f10434b;

    /* renamed from: c */
    public String f10435c;

    /* renamed from: d */
    public String f10436d;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.e$a */
    public interface C4227a {
    }

    public C4226e(String str) {
        this.f10434b = str;
    }

    /* renamed from: a */
    public static void m13383a(C4226e eVar, C4227a aVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = eVar.f10433a;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : eVar.f10433a.getMarkupUrl();
        if (!TextUtils.isEmpty(markupUrl)) {
            C4555k0 k0Var = new C4555k0(new C4223b(eVar, aVar), markupUrl, eVar);
            k0Var.f11226d = new C4224c(eVar);
            IAConfigManager.f10525J.f10555t.f11387a.offer(k0Var);
            k0Var.mo24717a(C4559m0.QUEUED);
            return;
        }
        C5357n.f14225b.post(new C4225d(eVar, aVar));
    }

    /* renamed from: a */
    public void mo24232a(C5288b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        int i;
        int i2;
        int i3;
        String str6;
        C5288b bVar2 = bVar;
        bVar2.f14055a.f14065A = true;
        IAConfigManager.f10525J.f10559x.f10605e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f10433a;
        if (admParametersOuterClass$AdmParameters != null) {
            int a = admParametersOuterClass$AdmParameters.getAdType().mo24088a();
            if (this.f10433a.hasErrorMessage()) {
                this.f10433a.getErrorMessage();
            }
            String sessionId = this.f10433a.hasSessionId() ? this.f10433a.getSessionId() : null;
            Long valueOf = this.f10433a.hasContentId() ? Long.valueOf(this.f10433a.getContentId()) : null;
            if (this.f10433a.hasPublisherId()) {
                this.f10433a.getPublisherId();
            }
            Integer valueOf2 = this.f10433a.hasAdWidth() ? Integer.valueOf(this.f10433a.getAdWidth()) : null;
            Integer valueOf3 = this.f10433a.hasAdHeight() ? Integer.valueOf(this.f10433a.getAdHeight()) : null;
            String sdkImpressionUrl = this.f10433a.hasSdkImpressionUrl() ? this.f10433a.getSdkImpressionUrl() : null;
            String sdkClickUrl = this.f10433a.hasSdkClickUrl() ? this.f10433a.getSdkClickUrl() : null;
            Integer valueOf4 = this.f10433a.hasAdExpirationInterval() ? Integer.valueOf(this.f10433a.getAdExpirationInterval()) : null;
            String adCompletionUrl = this.f10433a.hasAdCompletionUrl() ? this.f10433a.getAdCompletionUrl() : null;
            bVar2.f14056b = this.f10433a.hasAdUnitId() ? this.f10433a.getAdUnitId() : null;
            this.f10433a.getAdUnitType().name().toLowerCase();
            String lowerCase = this.f10433a.hasAdUnitId() ? this.f10433a.getAdUnitDisplayType().name().toLowerCase() : null;
            String adNetworkName = this.f10433a.hasAdNetworkName() ? this.f10433a.getAdNetworkName() : null;
            Long valueOf5 = this.f10433a.hasAdNetworkId() ? Long.valueOf(this.f10433a.getAdNetworkId()) : null;
            String creativeId = this.f10433a.hasCreativeId() ? this.f10433a.getCreativeId() : null;
            String adDomain = this.f10433a.hasAdDomain() ? this.f10433a.getAdDomain() : null;
            if (this.f10433a.hasAppBundleId()) {
                str2 = this.f10433a.getAppBundleId();
                str = lowerCase;
            } else {
                str = lowerCase;
                str2 = null;
            }
            String campaignId = this.f10433a.hasCampaignId() ? this.f10433a.getCampaignId() : null;
            impressionData.setCpmValue(this.f10433a.hasPricingValue() ? Double.toString(this.f10433a.getPricingValue()) : null);
            impressionData.setCurrency("USD");
            if (this.f10433a.hasMrcData()) {
                if (this.f10433a.getMrcData().hasPixelPercent()) {
                    i2 = this.f10433a.getMrcData().getPixelPercent();
                    str5 = adCompletionUrl;
                } else {
                    str5 = adCompletionUrl;
                    i2 = 0;
                }
                if (this.f10433a.getMrcData().hasPixelDuration()) {
                    i3 = this.f10433a.getMrcData().getPixelDuration();
                    str4 = sdkClickUrl;
                } else {
                    str4 = sdkClickUrl;
                    i3 = -1;
                }
                if (this.f10433a.getMrcData().hasPixelImpressionUrl()) {
                    str6 = this.f10433a.getMrcData().getPixelImpressionUrl();
                    str3 = sdkImpressionUrl;
                } else {
                    str3 = sdkImpressionUrl;
                    str6 = null;
                }
                C5291e eVar = bVar2.f14055a;
                eVar.f14085t = i2;
                eVar.f14086u = (float) i3;
                eVar.f14087v = str6;
            } else {
                str3 = sdkImpressionUrl;
                str4 = sdkClickUrl;
                str5 = adCompletionUrl;
            }
            Boolean valueOf6 = this.f10433a.hasSkipMode() ? Boolean.valueOf(this.f10433a.getSkipMode()) : null;
            if (bVar.mo24395b()) {
                bVar2.f14055a.f14082q = this.f10433a.toString();
            }
            C5291e eVar2 = bVar2.f14055a;
            String num = valueOf4.toString();
            eVar2.getClass();
            try {
                j = Long.parseLong(num);
            } catch (NumberFormatException unused) {
                j = 20;
            }
            eVar2.f14067b = j;
            Integer num2 = valueOf3;
            eVar2.f14066a = eVar2.f14068c + TimeUnit.MINUTES.toMillis(j);
            impressionData.setImpressionId(sessionId);
            impressionData.setDemandSource(adNetworkName);
            bVar2.f14055a.f14069d = valueOf != null ? valueOf.toString() : "";
            bVar2.f14055a.getClass();
            bVar2.f14055a.getClass();
            C5291e eVar3 = bVar2.f14055a;
            eVar3.f14090y = str2;
            eVar3.f14091z = this.f10436d;
            if (valueOf5 != null) {
                impressionData.setDemandId(valueOf5);
            }
            C5291e eVar4 = bVar2.f14055a;
            eVar4.f14072g = a;
            if (valueOf2 != null) {
                eVar4.f14070e = valueOf2.intValue();
            }
            if (num2 != null) {
                bVar2.f14055a.f14071f = num2.intValue();
            }
            C5291e eVar5 = bVar2.f14055a;
            eVar5.f14076k = str3;
            eVar5.f14077l = str4;
            eVar5.f14080o = str5;
            eVar5.f14078m = bVar2.f14056b;
            try {
                eVar5.f14079n = UnitDisplayType.fromValue(str);
            } catch (IllegalArgumentException unused2) {
                bVar2.f14055a.f14079n = UnitDisplayType.INTERSTITIAL;
            }
            if (!TextUtils.isEmpty(creativeId)) {
                impressionData.setCreativeId(creativeId);
            }
            if (!TextUtils.isEmpty(adDomain)) {
                impressionData.setAdvertiserDomain(adDomain);
            }
            if (!TextUtils.isEmpty(campaignId)) {
                impressionData.setCampaignId(campaignId);
            }
            impressionData.setCountry(C5348k.m16742g());
            bVar2.f14055a.f14083r = impressionData;
            if (valueOf6 == null) {
                i = -1;
            } else {
                i = valueOf6.booleanValue() ? 1 : 0;
            }
            bVar2.f14055a.f14088w = i;
        }
    }

    /* renamed from: a */
    public String mo24231a() {
        return this.f10435c;
    }
}
