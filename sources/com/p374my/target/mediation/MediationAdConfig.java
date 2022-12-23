package com.p374my.target.mediation;

import com.p374my.target.common.MyTargetPrivacy;
import java.util.Map;

/* renamed from: com.my.target.mediation.MediationAdConfig */
public interface MediationAdConfig {
    int getAge();

    int getGender();

    String getPayload();

    String getPlacementId();

    MyTargetPrivacy getPrivacy();

    Map<String, String> getServerParams();

    boolean isUserAgeRestricted();

    boolean isUserConsent();

    boolean isUserConsentSpecified();
}
