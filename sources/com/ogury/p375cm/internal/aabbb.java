package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p375cm.internal.aacaa;
import com.ogury.p375cm.internal.bacab;
import java.util.List;

/* renamed from: com.ogury.cm.internal.aabbb */
public final class aabbb {

    /* renamed from: a */
    public static final aaaaa f25647a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final SharedPreferences f25648b;

    /* renamed from: c */
    private final abaab f25649c;

    /* renamed from: com.ogury.cm.internal.aabbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aabbb(Context context, abaab abaab) {
        bbabc.m30943b(context, "context");
        bbabc.m30943b(abaab, "timeUtils");
        this.f25649c = abaab;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentExternal", 0);
        bbabc.m30940a((Object) sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f25648b = sharedPreferences;
    }

    public /* synthetic */ aabbb(Context context, abaab abaab, int i, bbabb bbabb) {
        this(context, abaab.f25687a);
    }

    /* renamed from: a */
    private static aabac m30639a(aabab aabab) {
        return aabab instanceof aabac ? (aabac) aabab : new aabac(aabab.mo66528b(), aabab.mo66529c(), new Integer[0]);
    }

    /* renamed from: b */
    private synchronized aabab m30641b() {
        Integer[] numArr;
        int i = this.f25648b.getInt("tcfVersion", 0);
        String string = this.f25648b.getString("consentString", "");
        if (i == 2) {
            SharedPreferences sharedPreferences = this.f25648b;
            Integer[] numArr2 = new Integer[0];
            bbabc.m30943b(sharedPreferences, "receiver$0");
            bbabc.m30943b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
            bbabc.m30943b(numArr2, "defaultIntArray");
            String string2 = sharedPreferences.getString("tcfv2_nonIabVendorIdsAccepted", "");
            bbabc.m30940a((Object) string2, "serializedIntArray");
            if (string2.length() == 0) {
                numArr = numArr2;
            } else {
                Object[] array = aacaa.aaaaa.m30661a(aacaa.aaaaa.m30664b(string2)).toArray(new Integer[0]);
                if (array != null) {
                    numArr = (Integer[]) array;
                } else {
                    throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            bbabc.m30940a((Object) string, "consentString");
            return new aabac(string, (aabba) null, numArr, 2, (bbabb) null);
        }
        bbabc.m30940a((Object) string, "consentString");
        return new aabab(i, string, (aabba) null, 4, (bbabb) null);
    }

    /* renamed from: a */
    public final void mo66531a() {
        this.f25648b.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo66532a(aaacc aaacc, boolean z) {
        bbabc.m30943b(aaacc, "externalConsentData");
        if (aaacc instanceof aabab) {
            OguryIntegrationLogger.m30996d("[Consent][External] Marking the consent data as sent...");
            SharedPreferences.Editor edit = this.f25648b.edit();
            edit.clear();
            edit.putLong("dt", z ? abaab.m30685a() : -1);
            edit.putInt("tcfVersion", ((aabab) aaacc).mo66527a());
            edit.putString("consentString", ((aabab) aaacc).mo66528b());
            if (((aabab) aaacc).mo66527a() == 2) {
                Integer[] d = aaacc instanceof aabac ? ((aabac) aaacc).mo66530d() : new Integer[0];
                bbabc.m30940a((Object) edit, "editor");
                bbabc.m30943b(edit, "receiver$0");
                bbabc.m30943b("tcfv2_nonIabVendorIdsAccepted", SDKConstants.PARAM_KEY);
                bbabc.m30943b(d, "intArray");
                edit.putString("tcfv2_nonIabVendorIdsAccepted", aacaa.aaaaa.m30660a(d));
            }
            edit.apply();
            OguryIntegrationLogger.m30996d("[Consent][External] Consent data marked");
        }
    }

    /* renamed from: a */
    public final boolean mo66533a(aaacc aaacc) {
        bbabc.m30943b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return false;
        }
        aabab b = m30641b();
        aabab aabab = (aabab) aaacc;
        if (b.mo66527a() != aabab.mo66527a() || (!bbabc.m30942a((Object) b.mo66528b(), (Object) aabab.mo66528b()))) {
            return false;
        }
        if (b.mo66527a() != 2) {
            return true;
        }
        List a = bacab.aaaaa.m30919a((T[]) m30639a(b).mo66530d());
        List a2 = bacab.aaaaa.m30919a((T[]) m30639a(aabab).mo66530d());
        bbabc.m30943b(a, "receiver$0");
        bbabc.m30943b(a2, "other");
        if (a == a2) {
            return true;
        }
        if (a.size() != a2.size()) {
            return false;
        }
        return a.containsAll(a2);
    }

    /* renamed from: b */
    public final boolean mo66534b(aaacc aaacc) {
        bbabc.m30943b(aaacc, "externalConsentData");
        if (!(aaacc instanceof aabab)) {
            return true;
        }
        long j = this.f25648b.getLong("dt", 0);
        if (j == -1) {
            return false;
        }
        return j == 0 || abaab.m30685a() > j + 86400000;
    }
}
