package com.applovin.impl.sdk.p050e;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.d */
public class C1886d extends C1883c {

    /* renamed from: c */
    private final C1824a f3486c;

    /* renamed from: d */
    private boolean f3487d;

    /* renamed from: e */
    private boolean f3488e;

    public C1886d(C1824a aVar, C1959m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, mVar, appLovinAdLoadListener);
        this.f3486c = aVar;
    }

    /* renamed from: j */
    private void m4186j() {
        if (C2092v.m5047a()) {
            mo14142a("Caching HTML resources...");
        }
        this.f3486c.mo13915a(mo14160a(this.f3486c.mo12621b(), this.f3486c.mo13945H(), (C1829e) this.f3486c));
        this.f3486c.mo13968a(true);
        if (C2092v.m5047a()) {
            mo14142a("Finish caching non-video resources for ad #" + this.f3486c.getAdIdNumber());
            C2092v A = this.f3467b.mo14286A();
            String e = mo14148e();
            A.mo14787a(e, "Ad updated with cachedHTML = " + this.f3486c.mo12621b());
        }
    }

    /* renamed from: k */
    private void m4187k() {
        Uri e;
        if (!mo14165b() && (e = mo14169e(this.f3486c.mo13918i())) != null) {
            if (this.f3486c.mo13979aK()) {
                this.f3486c.mo13915a(this.f3486c.mo12621b().replaceFirst(this.f3486c.mo13916e(), e.toString()));
                if (C2092v.m5047a()) {
                    mo14142a("Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f3486c.mo13917g();
            this.f3486c.mo13914a(e);
        }
    }

    /* renamed from: a */
    public void mo14177a(boolean z) {
        this.f3487d = z;
    }

    /* renamed from: b */
    public void mo14178b(boolean z) {
        this.f3488e = z;
    }

    public void run() {
        super.run();
        boolean f = this.f3486c.mo12626f();
        boolean z = this.f3488e;
        if (f || z) {
            if (C2092v.m5047a()) {
                mo14142a("Begin caching for streaming ad #" + this.f3486c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14167c();
            if (f) {
                if (this.f3487d) {
                    mo14172i();
                }
                m4186j();
                if (!this.f3487d) {
                    mo14172i();
                }
                m4187k();
            } else {
                mo14172i();
                m4186j();
            }
        } else {
            if (C2092v.m5047a()) {
                mo14142a("Begin processing for non-streaming ad #" + this.f3486c.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14167c();
            m4186j();
            m4187k();
            mo14172i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3486c.getCreatedAtMillis();
        C1869d.m4082a(this.f3486c, this.f3467b);
        C1869d.m4081a(currentTimeMillis, (AppLovinAdBase) this.f3486c, this.f3467b);
        mo14162a((AppLovinAdBase) this.f3486c);
        mo14161a();
    }
}
