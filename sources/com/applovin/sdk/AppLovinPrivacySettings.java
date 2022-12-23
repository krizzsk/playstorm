package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C1944j;
import com.applovin.impl.sdk.C2092v;

public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a = C1944j.m4366b().mo14266a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a = C1944j.m4361a().mo14266a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "isAgeRestrictedUserSet()");
        return C1944j.m4361a().mo14266a(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a = C1944j.m4368c().mo14266a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "isDoNotSellSet()");
        return C1944j.m4368c().mo14266a(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "isUserConsentSet()");
        return C1944j.m4366b().mo14266a(context) != null;
    }

    public static void setDoNotSell(boolean z, Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "setDoNotSell()");
        if (C1944j.m4369c(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (C1944j.m4367b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        C2092v.m5050f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (C1944j.m4365a(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z), (Boolean) null);
        }
    }
}
