package com.ogury.p375cm;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aabaa;
import com.ogury.p375cm.internal.aabac;
import com.ogury.p375cm.internal.aabba;
import com.ogury.p375cm.internal.aabcb;
import com.ogury.p375cm.internal.bbabc;
import com.ogury.p375cm.internal.bbcbc;
import java.util.Arrays;

/* renamed from: com.ogury.cm.OguryChoiceManagerExternal */
public final class OguryChoiceManagerExternal {

    /* renamed from: a */
    public static final OguryChoiceManagerExternal f25535a = new OguryChoiceManagerExternal();

    /* renamed from: b */
    private static Integer f25536b;

    /* renamed from: com.ogury.cm.OguryChoiceManagerExternal$TcfV2 */
    public static final class TcfV2 {

        /* renamed from: a */
        public static final TcfV2 f25537a = new TcfV2();

        private TcfV2() {
        }

        /* renamed from: a */
        private static final void m30527a(String str, Integer[] numArr) {
            if (bbcbc.m30979a(str)) {
                OguryIntegrationLogger.m30997e("[Consent][external] Failed (invalid IAB string: \"" + str + "\")");
                return;
            }
            OguryChoiceManagerExternal.access$checkTcfVersion(OguryChoiceManagerExternal.f25535a, 2);
            OguryChoiceManagerExternal.f25535a.setConsumedTcfVersion$consent_manager_prodRelease(2);
            if (numArr == null) {
                numArr = new Integer[0];
            }
            aabac aabac = new aabac(str, aabba.MANUAL, numArr);
            aabcb aabcb = aabcb.f25665a;
            aabcb.m30656a(aabac);
        }

        @Deprecated
        public static final void setConsent(Context context, String str, String str2, Integer[] numArr) {
            String str3;
            bbabc.m30943b(context, "context");
            bbabc.m30943b(str, "assetKey");
            bbabc.m30943b(str2, "iabString");
            StringBuilder sb = new StringBuilder("[Consent] External Choice Manager - setConsent() called with asset key: ");
            sb.append(str);
            sb.append(" iabString: ");
            sb.append(str2);
            sb.append(" nonIabVendorsAccepted: ");
            if (numArr != null) {
                str3 = Arrays.toString(numArr);
                bbabc.m30940a((Object) str3, "java.util.Arrays.toString(this)");
            } else {
                str3 = null;
            }
            sb.append(str3);
            OguryIntegrationLogger.m30996d(sb.toString());
            if (bbcbc.m30979a(str)) {
                OguryIntegrationLogger.m30997e("[Consent][external] Failed (invalid asset key: \"" + str + "\")");
                return;
            }
            aabcb aabcb = aabcb.f25665a;
            String token = InternalCore.getToken(context, "consent_token");
            bbabc.m30940a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
            aabcb.m30655a(context, str, token);
            m30527a(str2, numArr);
        }

        public static final void setConsent(String str, Integer[] numArr) {
            String str2;
            bbabc.m30943b(str, "iabString");
            StringBuilder sb = new StringBuilder("[Consent] External Choice Manager - setConsent() called with iabString: ");
            sb.append(str);
            sb.append(" nonIabVendorsAccepted: ");
            if (numArr != null) {
                str2 = Arrays.toString(numArr);
                bbabc.m30940a((Object) str2, "java.util.Arrays.toString(this)");
            } else {
                str2 = null;
            }
            sb.append(str2);
            OguryIntegrationLogger.m30996d(sb.toString());
            m30527a(str, numArr);
        }

        public static /* synthetic */ void setConsent$default(String str, Integer[] numArr, int i, Object obj) {
            if ((i & 2) != 0) {
                numArr = null;
            }
            setConsent(str, numArr);
        }
    }

    private OguryChoiceManagerExternal() {
    }

    public static final /* synthetic */ void access$checkTcfVersion(OguryChoiceManagerExternal oguryChoiceManagerExternal, int i) {
        Integer num = f25536b;
        if (!(num == null || (num != null && num.intValue() == i))) {
            throw new IllegalStateException("You cannot use method from another TCF version.".toString());
        }
    }

    public static /* synthetic */ void consumedTcfVersion$annotations() {
    }

    public static final void setConsent(boolean z, String str) {
        bbabc.m30943b(str, "userConsentOrigin");
        OguryIntegrationLogger.m30996d("[Consent] External Choice Manager - setConsent() called with isOptInUser: " + z + " userConsentOrigin: " + str);
        if (!bbcbc.m30979a(str)) {
            aabaa aabaa = new aabaa(z, str);
            aabcb aabcb = aabcb.f25665a;
            aabcb.m30656a(aabaa);
            return;
        }
        throw new IllegalStateException("Wrong userConsentOrigin param. This param cannot be null or empty.".toString());
    }

    public final Integer getConsumedTcfVersion$consent_manager_prodRelease() {
        return f25536b;
    }

    public final void setConsumedTcfVersion$consent_manager_prodRelease(Integer num) {
        f25536b = num;
    }
}
