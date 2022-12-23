package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Threads;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class LocationAwareLgpdImpl implements LocationAware {
    static final Set<String> LGPD;
    private static final Set<String> ONLY_APPLICABLE_FOR = new HashSet();
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
        hashMap.put("America/Araguaina", "BR");
        hashMap.put("America/Bahia", "BR");
        hashMap.put("America/Belem", "BR");
        hashMap.put("America/Boa_Vista", "BR");
        hashMap.put("America/Campo_Grande", "BR");
        hashMap.put("America/Cuiaba", "BR");
        hashMap.put("America/Eirunepe", "BR");
        hashMap.put("America/Fortaleza", "BR");
        hashMap.put("America/Maceio", "BR");
        hashMap.put("America/Manaus", "BR");
        hashMap.put("America/Noronha", "BR");
        hashMap.put("America/Porto_Acre", "BR");
        hashMap.put("America/Porto_Velho", "BR");
        hashMap.put("America/Recife", "BR");
        hashMap.put("America/Rio_Branco", "BR");
        hashMap.put("America/Santarem", "BR");
        hashMap.put("America/Sao_Paulo", "BR");
        hashMap.put("Brazil/Acre", "BR");
        hashMap.put("Brazil/DeNoronha", "BR");
        hashMap.put("Brazil/East", "BR");
        hashMap.put("Brazil/West", "BR");
        LGPD = new HashSet(hashMap.values());
    }

    LocationAwareLgpdImpl(Context context2, SimInfo simInfo2, TzSettings tzSettings2, DnsLookup dnsLookup, Logger logger2) {
        this.context = context2;
        this.simInfo = simInfo2;
        this.tzSettings = tzSettings2;
        this.dns = dnsLookup;
        this.logger = logger2;
        updateLgpdDNS();
    }

    public boolean isApplicable() {
        Set<String> set = ONLY_APPLICABLE_FOR;
        return set.isEmpty() || set.contains(this.context.getPackageName());
    }

    public boolean isConsentCountry() {
        return isLgpdCountry(this.simInfo.getSimCountryIso()) || isLgpdCountry(this.simInfo.getNetworkCountryIso()) || isLgpdTimeZone() || (this.isGeoDns != null && this.isGeoDns.booleanValue());
    }

    private boolean isLgpdTimeZone() {
        if (!this.tzSettings.isAutoTimeZoneEnabled()) {
            return false;
        }
        return TZ_TO_COUNTRY.containsKey(TimeZone.getDefault().getID());
    }

    private void updateLgpdDNS() {
        Threads.runOnBackgroundThread(new Runnable() {
            public final void run() {
                LocationAwareLgpdImpl.this.isLgpdGeoDns();
            }
        });
    }

    /* access modifiers changed from: private */
    public void isLgpdGeoDns() {
        if (this.isGeoDns == null) {
            synchronized (this) {
                if (this.isGeoDns == null) {
                    try {
                        this.isGeoDns = Boolean.FALSE;
                        for (TxtRecord data : this.dns.blockingTxt("geoclue.smaato.net")) {
                            String[] split = data.data().split(CertificateUtil.DELIMITER);
                            if (split.length > 1 && "LGPD".equalsIgnoreCase(split[1].trim())) {
                                this.isGeoDns = Boolean.TRUE;
                            }
                        }
                    } catch (IOException e) {
                        this.logger.error(LogDomain.NETWORK, e, "Error when checking geo dns", new Object[0]);
                    }
                }
            }
        }
    }

    private static boolean isLgpdCountry(String str) {
        return !TextUtils.isEmpty(str) && LGPD.contains(str.toUpperCase(Locale.US));
    }
}
