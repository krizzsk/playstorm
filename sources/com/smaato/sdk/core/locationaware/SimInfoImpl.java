package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.telephony.TelephonyManager;

public class SimInfoImpl implements SimInfo {

    /* renamed from: tm */
    private final TelephonyManager f27143tm;

    SimInfoImpl(Context context) {
        this.f27143tm = (TelephonyManager) context.getSystemService("phone");
    }

    public String getSimCountryIso() {
        return this.f27143tm.getSimCountryIso();
    }

    public String getNetworkCountryIso() {
        return this.f27143tm.getNetworkCountryIso();
    }
}
