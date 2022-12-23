package com.tapjoy;

import android.text.TextUtils;
import com.tapjoy.internal.C11675gh;

public class TJPrivacyPolicy {

    /* renamed from: a */
    private static final TJPrivacyPolicy f27437a = new TJPrivacyPolicy();

    public static TJPrivacyPolicy getInstance() {
        return f27437a;
    }

    public void setSubjectToGDPR(boolean z) {
        C11675gh.m33868a().mo72556a(z);
    }

    public void setUserConsent(String str) {
        C11675gh.m33868a().mo72555a(str);
    }

    public void setBelowConsentAge(boolean z) {
        C11675gh.m33868a().mo72558b(z);
    }

    public void setUSPrivacy(String str) {
        C11675gh a = C11675gh.m33868a();
        if (!TextUtils.isEmpty(str)) {
            a.f28400b = str;
            if (!a.mo72559c()) {
                a.f28401c = true;
            }
        }
    }
}
