package com.ogury.p375cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbba */
public final class acbba extends acbac {

    /* renamed from: b */
    public static final aaaaa f25846b = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbba$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: com.ogury.cm.internal.acbba$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ acbba f25847a;

        /* renamed from: b */
        final /* synthetic */ Context f25848b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(acbba acbba, Context context) {
            super(0);
            this.f25847a = acbba;
            this.f25848b = context;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66502a() {
            JSONObject j = acbba.m30832a().mo66596j();
            if (j != null) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f25848b.getApplicationContext()).edit();
                acbba acbba = this.f25847a;
                bbabc.m30940a((Object) edit, "editor");
                String optString = j.optString(Fields.VENDOR_CONSENTS);
                bbabc.m30940a((Object) optString, "it.optString(VENDOR_CONSENTS)");
                acbba.m30834a(acbba, edit, optString);
                acbba.m30835a(this.f25847a, edit, j.optJSONObject(Fields.PUBLISHER_RESTRICTIONS));
                acbba acbba2 = this.f25847a;
                String optString2 = j.optString("vendorLegitimateInterests");
                bbabc.m30940a((Object) optString2, "it.optString(VENDOR_LEGITIMATE_INTERESTS)");
                acbba.m30837b(acbba2, edit, optString2);
                aacba aacba = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PUBLISHER_CONSENT, aacba.m30671a(j.optInt("publisherConsent")));
                edit.putInt(CmpApiConstants.IABTCF_CMP_SDK_ID, j.optInt("cmpSdkId"));
                edit.putInt(CmpApiConstants.IABTCF_CMP_SDK_VERSION, j.optInt("cmpSdkVersion"));
                edit.putInt(CmpApiConstants.IABTCF_POLICY_VERSION, j.optInt("policyVersion"));
                abbba abbba = abbba.f25716a;
                edit.putInt(CmpApiConstants.IABTCF_GDPR_APPLIES, abbba.m30722c().mo66560c().mo66581b() ? 1 : 0);
                edit.putString(CmpApiConstants.IABTCF_PUBLISHER_CC, j.optString("publisherCC"));
                edit.putInt(CmpApiConstants.IABTCF_PURPOSE_ONE_TREATMENT, j.optInt("purposeOneTreatment"));
                edit.putInt(CmpApiConstants.IABTCF_USE_NON_STANDARD_STACKS, j.optInt("useNonStandardStacks"));
                abbba abbba2 = abbba.f25716a;
                edit.putString(CmpApiConstants.IABTCF_TC_STRING, abbba.m30722c().mo66560c().mo66578a());
                aacba aacba2 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, aacba.m30671a(j.optInt("purposeConsents")));
                aacba aacba3 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, aacba.m30671a(j.optInt("purposeLegitimateInterests")));
                aacba aacba4 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_SPECIAL_FEATURES_OPT_INS, aacba.m30671a(j.optInt("specialFeaturesOptIns")));
                aacba aacba5 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PUBLISHER_LEGITIMATE_INTERESTS, aacba.m30671a(j.optInt("publisherLegitimateInterests")));
                aacba aacba6 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, aacba.m30671a(j.optInt("publisherCustomPurposesConsents")));
                aacba aacba7 = aacba.f25673a;
                edit.putString(CmpApiConstants.IABTCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, aacba.m30671a(j.optInt("publisherCustomPurposesLegitimateInterests")));
                edit.apply();
            }
            return babcc.f25908a;
        }
    }

    /* renamed from: a */
    public static abcac m30832a() {
        abbba abbba = abbba.f25716a;
        return (abcac) abcab.m30772d();
    }

    /* renamed from: a */
    private static String m30833a(String str) {
        if (str != null) {
            String substring = str.substring(1);
            bbabc.m30940a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new babca("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30834a(acbba acbba, SharedPreferences.Editor editor, String str) {
        aacba aacba = aacba.f25673a;
        String a = aacba.m30672a(str);
        editor.putString(CmpApiConstants.IABTCF_VENDOR_CONSENT, a.length() > 0 ? m30833a(a) : m30836b());
    }

    /* renamed from: a */
    public static final /* synthetic */ void m30835a(acbba acbba, SharedPreferences.Editor editor, JSONObject jSONObject) {
        if (jSONObject != null) {
            aacba aacba = aacba.f25673a;
            bbabc.m30943b(jSONObject, "jsonObject");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            bbabc.m30940a((Object) keys, "purposeIds");
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                String optString = optJSONObject.optString("0");
                bbabc.m30940a((Object) optString, "arrayOfValuesForPurpose.optString(\"0\")");
                String a = aacba.m30672a(optString);
                int length = a.length();
                String optString2 = optJSONObject.optString("1");
                bbabc.m30940a((Object) optString2, "arrayOfValuesForPurpose.optString(\"1\")");
                String a2 = aacba.m30672a(optString2);
                if (a2.length() > length) {
                    length = a2.length();
                }
                String optString3 = optJSONObject.optString("2");
                bbabc.m30940a((Object) optString3, "arrayOfValuesForPurpose.optString(\"2\")");
                String a3 = aacba.m30672a(optString3);
                if (a3.length() > length) {
                    length = a3.length();
                }
                int i = 1;
                String str = "";
                while (i < length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((a.length() <= i || a.charAt(i) != '1') ? (a2.length() <= i || a2.charAt(i) != '1') ? (a3.length() <= i || a3.charAt(i) != '1') ? "3" : "2" : "1" : "0");
                    str = sb.toString();
                    i++;
                }
                bbabc.m30940a((Object) next, BitLength.PURPOSE_ID);
                hashMap.put(next, str);
            }
            for (String str2 : hashMap.keySet()) {
                editor.putString(CmpApiConstants.IABTCF_PUBLISHER_RERSTRICTIONS.concat(String.valueOf(str2)), (String) hashMap.get(str2));
            }
        }
    }

    /* renamed from: b */
    private static String m30836b() {
        int l = m30832a().mo66598l();
        bbabc.m30943b(r0, "receiver$0");
        int i = 1;
        if (!(l >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + l + '.').toString());
        } else if (l == 0) {
            return "";
        } else {
            if (l == 1) {
                return r0.toString();
            }
            int length = r0.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(r0.length() * l);
                if (l > 0) {
                    while (true) {
                        sb.append(r0);
                        if (i == l) {
                            break;
                        }
                        i++;
                    }
                }
                String sb2 = sb.toString();
                bbabc.m30940a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = r0.charAt(0);
            char[] cArr = new char[l];
            for (int i2 = 0; i2 < l; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m30837b(acbba acbba, SharedPreferences.Editor editor, String str) {
        aacba aacba = aacba.f25673a;
        String a = aacba.m30672a(str);
        editor.putString(CmpApiConstants.IABTCF_VENDOR_LEGITIMATE_INTERESTS, (!(a.length() > 0) || a.length() <= 1) ? m30836b() : m30833a(a));
    }

    /* renamed from: a */
    public final void mo66626a(Context context) {
        bbabc.m30943b(context, "context");
        abbba abbba = abbba.f25716a;
        if (abbba.m30729f("TCF")) {
            bacbb.m30926a(false, false, (ClassLoader) null, (String) null, 0, new aaaab(this, context), 31, (Object) null);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        if (defaultSharedPreferences.getInt(CmpApiConstants.IABTCF_GDPR_APPLIES, 0) != 0) {
            defaultSharedPreferences.edit().putInt(CmpApiConstants.IABTCF_GDPR_APPLIES, 0).apply();
        }
    }
}
