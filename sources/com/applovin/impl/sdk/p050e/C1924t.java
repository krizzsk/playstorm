package com.applovin.impl.sdk.p050e;

import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1407c;
import com.applovin.impl.p025a.C1408d;
import com.applovin.impl.p025a.C1409e;
import com.applovin.impl.p025a.C1410f;
import com.applovin.impl.p025a.C1414i;
import com.applovin.impl.p025a.C1415j;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.p025a.C1418m;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e.t */
class C1924t extends C1877a {

    /* renamed from: a */
    private final C1409e f3568a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f3569c;

    C1924t(C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super("TaskRenderVastAd", mVar);
        this.f3569c = appLovinAdLoadListener;
        this.f3568a = eVar;
    }

    public void run() {
        if (C2092v.m5047a()) {
            mo14142a("Rendering VAST ad...");
        }
        int size = this.f3568a.mo12675b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        C1414i iVar = null;
        C1418m mVar = null;
        C1408d dVar = null;
        C1407c cVar = null;
        String str2 = str;
        for (C2088r next : this.f3568a.mo12675b()) {
            C2088r c = next.mo14769c(C1417l.m2440a(next) ? "Wrapper" : "InLine");
            if (c != null) {
                C2088r c2 = c.mo14769c("AdSystem");
                if (c2 != null) {
                    iVar = C1414i.m2420a(c2, iVar, this.f3467b);
                }
                str = C1417l.m2431a(c, InLine.AD_TITLE, str);
                str2 = C1417l.m2431a(c, InLine.DESCRIPTION, str2);
                C1417l.m2436a(c.mo14766a("Impression"), (Set<C1415j>) hashSet, this.f3568a, this.f3467b);
                C2088r b = c.mo14767b("ViewableImpression");
                if (b != null) {
                    C1417l.m2436a(b.mo14766a(ViewableImpression.VIEWABLE), (Set<C1415j>) hashSet, this.f3568a, this.f3467b);
                }
                C2088r c3 = c.mo14769c("AdVerifications");
                if (c3 != null) {
                    cVar = C1407c.m2394a(c3, cVar, this.f3568a, this.f3467b);
                }
                C1417l.m2436a(c.mo14766a("Error"), (Set<C1415j>) hashSet2, this.f3568a, this.f3467b);
                C2088r b2 = c.mo14767b("Creatives");
                if (b2 != null) {
                    for (C2088r next2 : b2.mo14771d()) {
                        C2088r b3 = next2.mo14767b("Linear");
                        if (b3 != null) {
                            mVar = C1418m.m2446a(b3, mVar, this.f3568a, this.f3467b);
                        } else {
                            C2088r c4 = next2.mo14769c("CompanionAds");
                            if (c4 != null) {
                                C2088r c5 = c4.mo14769c("Companion");
                                if (c5 != null) {
                                    dVar = C1408d.m2396a(c5, dVar, this.f3568a, this.f3467b);
                                }
                            } else if (C2092v.m5047a()) {
                                mo14147d("Received and will skip rendering for an unidentified creative: " + next2);
                            }
                        }
                    }
                }
            } else if (C2092v.m5047a()) {
                mo14147d("Did not find wrapper or inline response for node: " + next);
            }
        }
        C1401a a = new C1401a.C1403a().mo12648a(this.f3467b).mo12651a(this.f3568a.mo12676c()).mo12655b(this.f3568a.mo12677d()).mo12647a(this.f3568a.mo12678e()).mo12642a(this.f3568a.mo12679f()).mo12649a(str).mo12653b(str2).mo12645a(iVar).mo12646a(mVar).mo12644a(dVar).mo12643a(cVar).mo12650a((Set<C1415j>) hashSet).mo12643a(cVar).mo12654b((Set<C1415j>) hashSet2).mo12652a();
        C1410f a2 = C1417l.m2427a(a);
        if (a2 == null) {
            if (C2092v.m5047a()) {
                mo14142a("Finished rendering VAST ad: " + a);
            }
            a.mo12640o().mo13843b();
            C1887e eVar = new C1887e(a, this.f3467b, this.f3569c);
            C1908o.C1910a aVar = C1908o.C1910a.CACHING_OTHER;
            if (((Boolean) this.f3467b.mo14311a(C1857b.f3158bi)).booleanValue()) {
                if (a.getType() == AppLovinAdType.REGULAR) {
                    aVar = C1908o.C1910a.CACHING_INTERSTITIAL;
                } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = C1908o.C1910a.CACHING_INCENTIVIZED;
                }
            }
            this.f3467b.mo14303S().mo14206a((C1877a) eVar, aVar);
            return;
        }
        C1417l.m2434a(this.f3568a, this.f3569c, a2, -6, this.f3467b);
    }
}
