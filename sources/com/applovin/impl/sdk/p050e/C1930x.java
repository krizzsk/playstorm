package com.applovin.impl.sdk.p050e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.p025a.C1409e;
import com.applovin.impl.p025a.C1410f;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.x */
class C1930x extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1409e f3580a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinAdLoadListener f3581c;

    C1930x(C1409e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1959m mVar) {
        super("TaskResolveVastWrapper", mVar);
        this.f3581c = appLovinAdLoadListener;
        this.f3580a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4309a(int i) {
        if (C2092v.m5047a()) {
            mo14147d("Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f3581c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        C1417l.m2434a(this.f3580a, this.f3581c, i == -1001 ? C1410f.TIMED_OUT : C1410f.GENERAL_WRAPPER_ERROR, i, this.f3467b);
    }

    public void run() {
        String a = C1417l.m2430a(this.f3580a);
        if (StringUtils.isValidString(a)) {
            if (C2092v.m5047a()) {
                mo14142a("Resolving VAST ad with depth " + this.f3580a.mo12674a() + " at " + a);
            }
            try {
                this.f3467b.mo14303S().mo14205a((C1877a) new C1925u<C2088r>(C1990c.m4570a(this.f3467b).mo14501a(a).mo14507b(ShareTarget.METHOD_GET).mo14500a(C2088r.f4088a).mo14499a(((Integer) this.f3467b.mo14311a(C1857b.f3317en)).intValue()).mo14506b(((Integer) this.f3467b.mo14311a(C1857b.f3318eo)).intValue()).mo14512c(false).mo14505a(), this.f3467b) {
                    /* renamed from: a */
                    public void mo13362a(int i, String str, C2088r rVar) {
                        if (C2092v.m5047a()) {
                            mo14147d("Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        C1930x.this.m4309a(i);
                    }

                    /* renamed from: a */
                    public void mo13364a(C2088r rVar, int i) {
                        this.f3467b.mo14303S().mo14205a((C1877a) C1918r.m4273a(rVar, C1930x.this.f3580a, C1930x.this.f3581c, C1930x.this.f3467b));
                    }
                });
            } catch (Throwable th) {
                if (C2092v.m5047a()) {
                    mo14143a("Unable to resolve VAST wrapper", th);
                }
            }
        } else {
            if (C2092v.m5047a()) {
                mo14147d("Resolving VAST failed. Could not find resolution URL");
            }
            m4309a(-1);
        }
    }
}
