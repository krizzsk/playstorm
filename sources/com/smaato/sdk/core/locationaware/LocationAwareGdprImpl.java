package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.text.TextUtils;
import com.adcolony.sdk.AdColonyAppOptions;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class LocationAwareGdprImpl implements LocationAware {

    /* renamed from: EU */
    static final Set<String> f27141EU;
    private static final Set<String> ONLY_APPLICABLE_FOR;
    static final Map<String, String> TZ_TO_COUNTRY;
    private final Context context;
    private final DnsLookup dns;
    private volatile Boolean isGeoDns;
    private final Logger logger;
    private final SimInfo simInfo;
    private final TzSettings tzSettings;

    static {
        HashMap hashMap = new HashMap();
        TZ_TO_COUNTRY = hashMap;
        HashSet hashSet = new HashSet();
        ONLY_APPLICABLE_FOR = hashSet;
        hashSet.add("com.grindrapp.android");
        hashMap.put("Europe/Amsterdam", "NL");
        hashMap.put("Europe/Athens", "CY");
        hashMap.put("Europe/Berlin", "DE");
        hashMap.put("Europe/Bratislava", "SK");
        hashMap.put("Europe/Brussels", "BE");
        hashMap.put("Europe/Bucharest", "RO");
        hashMap.put("Europe/Budapest", "HU");
        hashMap.put("Europe/Copenhagen", "DK");
        hashMap.put("Europe/Dublin", "IE");
        hashMap.put("Europe/Helsinki", "FI");
        hashMap.put("Europe/Lisbon", "PT");
        hashMap.put("Europe/Ljubljana", "SI");
        hashMap.put("Europe/London", "GB");
        hashMap.put("Europe/Luxembourg", "LU");
        hashMap.put("Europe/Madrid", "ES");
        hashMap.put("Europe/Malta", "MT");
        hashMap.put("Europe/Oslo", "NO");
        hashMap.put("Europe/Paris", "FR");
        hashMap.put("Europe/Prague", "CZ");
        hashMap.put("Europe/Riga", "LV");
        hashMap.put("Europe/Rome", "IT");
        hashMap.put("Europe/Sofia", "BG");
        hashMap.put("Europe/Stockholm", "SE");
        hashMap.put("Europe/Tallinn", "EE");
        hashMap.put("Europe/Vaduz", "LI");
        hashMap.put("Europe/Vienna", "AT");
        hashMap.put("Europe/Vilnius", "LT");
        hashMap.put("Europe/Warsaw", "PL");
        hashMap.put("Europe/Zagreb", "HR");
        hashMap.put("Atlantic/Reykjavik", IronSourceConstants.INTERSTITIAL_EVENT_TYPE);
        f27141EU = new HashSet(hashMap.values());
    }

    LocationAwareGdprImpl(Context context2, SimInfo simInfo2, TzSettings tzSettings2, DnsLookup dnsLookup, Logger logger2) {
        this.context = context2;
        this.simInfo = simInfo2;
        this.tzSettings = tzSettings2;
        this.dns = dnsLookup;
        this.logger = logger2;
    }

    public boolean isApplicable() {
        Set<String> set = ONLY_APPLICABLE_FOR;
        return set.isEmpty() || set.contains(this.context.getPackageName());
    }

    public boolean isConsentCountry() {
        return isGdprCountry(this.simInfo.getSimCountryIso()) || isGdprCountry(this.simInfo.getNetworkCountryIso()) || isGdprTimeZone() || isGdprGeoDns();
    }

    private boolean isGdprTimeZone() {
        if (!this.tzSettings.isAutoTimeZoneEnabled()) {
            return false;
        }
        return TZ_TO_COUNTRY.containsKey(TimeZone.getDefault().getID());
    }

    private boolean isGdprGeoDns() {
        if (this.isGeoDns == null) {
            synchronized (this) {
                if (this.isGeoDns == null) {
                    try {
                        this.isGeoDns = Boolean.FALSE;
                        for (TxtRecord data : this.dns.blockingTxt("geoclue.smaato.net")) {
                            String[] split = data.data().split(CertificateUtil.DELIMITER);
                            if (split.length > 1 && AdColonyAppOptions.GDPR.equalsIgnoreCase(split[1].trim())) {
                                this.isGeoDns = Boolean.TRUE;
                            }
                        }
                    } catch (IOException e) {
                        this.logger.error(LogDomain.NETWORK, e, "Error when checking geo dns", new Object[0]);
                    }
                }
            }
        }
        if (this.isGeoDns == null || !this.isGeoDns.booleanValue()) {
            return false;
        }
        return true;
    }

    private static boolean isGdprCountry(String str) {
        return !TextUtils.isEmpty(str) && f27141EU.contains(str.toUpperCase(Locale.US));
    }
}
