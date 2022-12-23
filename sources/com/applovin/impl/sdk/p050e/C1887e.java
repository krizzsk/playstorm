package com.applovin.impl.sdk.p050e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1408d;
import com.applovin.impl.p025a.C1412h;
import com.applovin.impl.p025a.C1421n;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.e.e */
class C1887e extends C1883c {

    /* renamed from: c */
    private final C1401a f3489c;

    public C1887e(C1401a aVar, C1959m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, mVar, appLovinAdLoadListener);
        this.f3489c = aVar;
    }

    /* renamed from: j */
    private void m4190j() {
        String str;
        String str2;
        String str3;
        if (!mo14165b()) {
            if (this.f3489c.mo12617aQ()) {
                C1408d aM = this.f3489c.mo12613aM();
                if (aM != null) {
                    C1412h b = aM.mo12668b();
                    if (b != null) {
                        Uri b2 = b.mo12691b();
                        String uri = b2 != null ? b2.toString() : "";
                        String c = b.mo12692c();
                        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(c)) {
                            if (b.mo12688a() == C1412h.C1413a.STATIC) {
                                if (C2092v.m5047a()) {
                                    mo14142a("Caching static companion ad at " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                }
                                Uri c2 = mo14166c(uri, Collections.emptyList(), false);
                                if (c2 != null) {
                                    b.mo12689a(c2);
                                } else if (C2092v.m5047a()) {
                                    str2 = "Failed to cache static companion ad";
                                } else {
                                    return;
                                }
                            } else if (b.mo12688a() == C1412h.C1413a.HTML) {
                                if (StringUtils.isValidString(uri)) {
                                    if (C2092v.m5047a()) {
                                        mo14142a("Begin caching HTML companion ad. Fetching from " + uri + APSSharedUtil.TRUNCATE_SEPARATOR);
                                    }
                                    c = mo14170f(uri);
                                    if (StringUtils.isValidString(c)) {
                                        if (C2092v.m5047a()) {
                                            str3 = "HTML fetched. Caching HTML now...";
                                        }
                                        b.mo12690a(mo14160a(c, (List<String>) Collections.emptyList(), (C1829e) this.f3489c));
                                    } else if (C2092v.m5047a()) {
                                        str2 = "Unable to load companion ad resources from " + uri;
                                    } else {
                                        return;
                                    }
                                } else {
                                    if (C2092v.m5047a()) {
                                        str3 = "Caching provided HTML for companion ad. No fetch required. HTML: " + c;
                                    }
                                    b.mo12690a(mo14160a(c, (List<String>) Collections.emptyList(), (C1829e) this.f3489c));
                                }
                                mo14142a(str3);
                                b.mo12690a(mo14160a(c, (List<String>) Collections.emptyList(), (C1829e) this.f3489c));
                            } else if (b.mo12688a() == C1412h.C1413a.IFRAME && C2092v.m5047a()) {
                                str = "Skip caching of iFrame resource...";
                            } else {
                                return;
                            }
                            this.f3489c.mo13968a(true);
                            return;
                        } else if (C2092v.m5047a()) {
                            mo14145c("Companion ad does not have any resources attached. Skipping...");
                            return;
                        } else {
                            return;
                        }
                    } else if (C2092v.m5047a()) {
                        str2 = "Failed to retrieve non-video resources from companion ad. Skipping...";
                    } else {
                        return;
                    }
                    mo14147d(str2);
                    return;
                } else if (C2092v.m5047a()) {
                    str = "No companion ad provided. Skipping...";
                } else {
                    return;
                }
            } else if (C2092v.m5047a()) {
                str = "Companion ad caching disabled. Skipping...";
            } else {
                return;
            }
            mo14142a(str);
        }
    }

    /* renamed from: k */
    private void m4191k() {
        C1421n n;
        Uri b;
        if (!mo14165b()) {
            if (this.f3489c.mo12618aR()) {
                if (this.f3489c.mo12638m() != null && (n = this.f3489c.mo12639n()) != null && (b = n.mo12718b()) != null) {
                    Uri a = mo14158a(b.toString(), (List<String>) Collections.emptyList(), false);
                    if (a != null) {
                        if (C2092v.m5047a()) {
                            mo14142a("Video file successfully cached into: " + a);
                        }
                        n.mo12717a(a);
                    } else if (C2092v.m5047a()) {
                        mo14147d("Failed to cache video file: " + n);
                    }
                }
            } else if (C2092v.m5047a()) {
                mo14142a("Video caching disabled. Skipping...");
            }
        }
    }

    /* renamed from: l */
    private void m4192l() {
        String str;
        String str2;
        if (!mo14165b()) {
            if (this.f3489c.mo12616aP() != null) {
                if (C2092v.m5047a()) {
                    mo14142a("Begin caching HTML template. Fetching from " + this.f3489c.mo12616aP() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                str = mo14159a(this.f3489c.mo12616aP().toString(), this.f3489c.mo13945H());
            } else {
                str = this.f3489c.mo12615aO();
            }
            if (StringUtils.isValidString(str)) {
                C1401a aVar = this.f3489c;
                aVar.mo12612a(mo14160a(str, aVar.mo13945H(), (C1829e) this.f3489c));
                if (C2092v.m5047a()) {
                    str2 = "Finish caching HTML template " + this.f3489c.mo12615aO() + " for ad #" + this.f3489c.getAdIdNumber();
                } else {
                    return;
                }
            } else if (C2092v.m5047a()) {
                str2 = "Unable to load HTML template";
            } else {
                return;
            }
            mo14142a(str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14171h() {
        this.f3489c.mo12640o().mo13847e();
        super.mo14171h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14172i() {
        this.f3489c.mo12640o().mo13845c();
        super.mo14172i();
    }

    public void run() {
        super.run();
        if (this.f3489c.mo12626f()) {
            if (C2092v.m5047a()) {
                mo14142a("Begin caching for VAST streaming ad #" + this.f3475a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14167c();
            if (this.f3489c.mo12633i()) {
                mo14172i();
            }
            if (this.f3489c.mo12627g() == C1401a.C1404b.COMPANION_AD) {
                m4190j();
                m4192l();
            } else {
                m4191k();
            }
            if (!this.f3489c.mo12633i()) {
                mo14172i();
            }
            if (this.f3489c.mo12627g() == C1401a.C1404b.COMPANION_AD) {
                m4191k();
            } else {
                m4190j();
                m4192l();
            }
        } else {
            if (C2092v.m5047a()) {
                mo14142a("Begin caching for VAST ad #" + this.f3475a.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14167c();
            m4190j();
            m4191k();
            m4192l();
            mo14172i();
        }
        if (C2092v.m5047a()) {
            mo14142a("Finished caching VAST ad #" + this.f3489c.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3489c.getCreatedAtMillis();
        C1869d.m4082a(this.f3489c, this.f3467b);
        C1869d.m4081a(currentTimeMillis, (AppLovinAdBase) this.f3489c, this.f3467b);
        mo14162a((AppLovinAdBase) this.f3489c);
        this.f3489c.mo12621b();
        mo14161a();
    }
}
