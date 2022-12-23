package com.ogury.p375cm.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aaacb;

/* renamed from: com.ogury.cm.internal.aaaca */
public final class aaaca implements aaacb.aaaaa {

    /* renamed from: a */
    private aaaaa f25629a;

    /* renamed from: b */
    private final aaacb f25630b;

    /* renamed from: com.ogury.cm.internal.aaaca$aaaaa */
    public interface aaaaa<T> {
        /* renamed from: a */
        void mo66517a(int i, String str);
    }

    public aaaca(aaacb aaacb) {
        bbabc.m30943b(aaacb, "tcfConsentDataStorageReader");
        this.f25630b = aaacb;
    }

    /* renamed from: b */
    private final void m30618b() {
        OguryIntegrationLogger.m30996d("[Consent][External] Checking consent data...");
        if (m30619c()) {
            OguryIntegrationLogger.m30996d("[Consent][External][data] Supported consent data");
            if (!m30620d()) {
                aaaaa aaaaa2 = this.f25629a;
                if (aaaaa2 != null) {
                    aaaaa2.mo66517a(this.f25630b.mo66518a(), this.f25630b.mo66522d());
                    return;
                }
                return;
            }
            OguryIntegrationLogger.m30996d("[Consent][External][data] Consent data already known (generated through Ogury CMP)");
            return;
        }
        OguryIntegrationLogger.m30996d("[Consent][External][data] Unsupported consent data");
    }

    /* renamed from: c */
    private final boolean m30619c() {
        int a = this.f25630b.mo66518a();
        boolean b = this.f25630b.mo66520b();
        boolean c = this.f25630b.mo66521c();
        OguryIntegrationLogger.m30996d("[Consent][External][data] Contains consent string: ".concat(String.valueOf(c)));
        OguryIntegrationLogger.m30996d("[Consent][External][data] GDPR applies: ".concat(String.valueOf(b)));
        OguryIntegrationLogger.m30996d("[Consent][External][data] TCF version: ".concat(String.valueOf(a)));
        return a >= 2 && b && c;
    }

    /* renamed from: d */
    private final boolean m30620d() {
        int e = this.f25630b.mo66523e();
        OguryIntegrationLogger.m30996d("[Consent][External][data] CMP SDK ID: ".concat(String.valueOf(e)));
        return this.f25630b.mo66518a() == 2 && e == 45;
    }

    /* renamed from: a */
    public final void mo66515a() {
        OguryIntegrationLogger.m30996d("[Consent][External] Change detected on the TCF consent string");
        m30618b();
    }

    /* renamed from: a */
    public final void mo66516a(aaaaa aaaaa2) {
        bbabc.m30943b(aaaaa2, "tcfConsentStringListener");
        OguryIntegrationLogger.m30996d("[Consent][External] Registering to TCF consent data changes");
        this.f25629a = aaaaa2;
        this.f25630b.mo66519a((aaacb.aaaaa) this);
        OguryIntegrationLogger.m30996d("[Consent][External] Searching for change on TCF consent data...");
        m30618b();
    }
}
