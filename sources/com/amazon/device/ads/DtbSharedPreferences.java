package com.amazon.device.ads;

import android.content.SharedPreferences;
import java.util.Set;
import org.json.JSONObject;

class DtbSharedPreferences {
    private static final String AAX_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-hostname";
    private static final String ADID_PREF_NAME = "amzn-dtb-ad-id";
    private static final String BID_TIMEOUT_PREF_NAME = "amzn-dtb-bid-timeout";
    private static final String CONFIG_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    private static final String CONFIG_TTL_PREF_NAME = "amzn-dtb-ad-config-ttl";
    private static final String DTB_VERSION_IN_USE = "amzn-dtb-version_in_use";
    private static final String ENCODED_PRICE_CHECK_PREF_NAME = "amzn-dtb-enable-encoded-price-check";
    private static final String IDFA_PREF_NAME = "amzn-dtb-idfa";
    private static final String IS_ADID_CHANGED_PREF_NAME = "amzn-dtb-adid-changed";
    private static final String IS_ADID_NEW_PREF_NAME = "amzn-dtb-adid-new";
    private static final String IS_GPS_UNAVAILABLE_PREF_NAME = "amzn-dtb-is-gps-unavailable";
    private static boolean IS_SIS_REGISTERATION_SUCCESSFUL = false;
    private static final String NON_IAB_CMP_FLAVOR = "NON_IAB_CMP_FLAVOR";
    private static final String NON_IAB_CONSENT_STATUS = "NON_IAB_CONSENT_STATUS";
    private static final String NON_IAB_CUSTOM_CONSENT = "NON_IAB_Custom_Consent";
    private static final String NON_IAB_VENDORLIST = "NON_IAB_VENDORLIST";
    private static final String OO_PREF_NAME = "amzn-dtb-oo";
    private static final String PJ_TEMPLATE_PREF_NAME = "amzn-dtb-pj-template";
    private static final String PREF_FILE_NAME = "com.amazon.device.ads.dtb.preferences";
    private static final String SDK_WRAPPER_PING = "sdk-wrapper-ping";
    private static final String SIS_ENDPOINT_PREF_NAME = "amzn-dtb-ad-sis-endpoint";
    private static final String SIS_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    private static final String SIS_LAST_PING_PREF_NAME = "amzn-dtb-ad-sis-last-ping";
    private static final String SIS_LAST_PING_WEB_RESOURCES = "amzn-dtb-web-resource-ping";
    public static DtbSharedPreferences dtbSharedPreferencesInstance = null;
    private static boolean isIgnore = false;
    private static SharedPreferences sharedPreferences;
    private final String LOG_TAG = DtbSharedPreferences.class.getSimpleName();

    static void setIgnoreMode() {
        isIgnore = true;
    }

    public boolean getIsSisRegisterationSuccessful() {
        return IS_SIS_REGISTERATION_SUCCESSFUL;
    }

    public void setIsSisRegisterationSuccessful(boolean z) {
        IS_SIS_REGISTERATION_SUCCESSFUL = z;
    }

    private static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
        return sharedPreferences;
    }

    protected DtbSharedPreferences() {
        if (AdRegistration.getContext() != null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
    }

    public static DtbSharedPreferences createInstance() {
        DtbSharedPreferences dtbSharedPreferences = new DtbSharedPreferences();
        dtbSharedPreferencesInstance = dtbSharedPreferences;
        return dtbSharedPreferences;
    }

    public static DtbSharedPreferences getInstance() {
        DtbSharedPreferences dtbSharedPreferences = dtbSharedPreferencesInstance;
        if (dtbSharedPreferences != null) {
            return dtbSharedPreferences;
        }
        throw new IllegalArgumentException("unable to retrieve shared preferences without initialization");
    }

    public String getVersionInUse() {
        return (String) getPref(DTB_VERSION_IN_USE, String.class);
    }

    public void setVersionInUse(String str) {
        savePref(DTB_VERSION_IN_USE, str);
    }

    public String getAdId() {
        return (String) getPref(ADID_PREF_NAME, String.class);
    }

    public void saveAdId(String str) {
        if (str != null) {
            savePref(ADID_PREF_NAME, str);
        }
    }

    public void removeAdid() {
        flushPreference(ADID_PREF_NAME);
    }

    public String getIdfa() {
        return (String) getPref(IDFA_PREF_NAME, String.class);
    }

    public void saveIdfa(String str) {
        if (str != null) {
            savePref(IDFA_PREF_NAME, str);
        } else {
            savePref(IDFA_PREF_NAME, "");
        }
    }

    public synchronized Boolean getOptOut() {
        if (!containsPreference(OO_PREF_NAME)) {
            return null;
        }
        return (Boolean) getPref(OO_PREF_NAME, Boolean.class);
    }

    public synchronized void saveOptOut(Boolean bool) {
        flushPreference(OO_PREF_NAME);
        if (bool != null) {
            savePref(OO_PREF_NAME, bool);
        }
    }

    public boolean getIsAdIdNew() {
        return ((Boolean) getPref(IS_ADID_NEW_PREF_NAME, Boolean.class)).booleanValue();
    }

    public void saveIsAdIdNew(boolean z) {
        savePref(IS_ADID_NEW_PREF_NAME, Boolean.valueOf(z));
    }

    public boolean getIsAdIdChanged() {
        return ((Boolean) getPref(IS_ADID_CHANGED_PREF_NAME, Boolean.class)).booleanValue();
    }

    public void saveIsAdIdChanged(boolean z) {
        savePref(IS_ADID_CHANGED_PREF_NAME, Boolean.valueOf(z));
    }

    public boolean isGooglePlayServicesUnavailable() {
        return ((Boolean) getPref(IS_GPS_UNAVAILABLE_PREF_NAME, Boolean.class)).booleanValue();
    }

    public void setGooglePlayServicesUnavailable(boolean z) {
        savePref(IS_GPS_UNAVAILABLE_PREF_NAME, Boolean.valueOf(z));
    }

    public Long getSisLastCheckIn() {
        return (Long) getPref("amzn-dtb-ad-sis-last-checkin", Long.class);
    }

    public void saveSisLastCheckIn(long j) {
        savePref("amzn-dtb-ad-sis-last-checkin", Long.valueOf(j));
    }

    public Long getConfigLastCheckIn() {
        return (Long) getPref("amzn-dtb-ad-sis-last-checkin", Long.class);
    }

    public void saveConfigLastCheckIn(long j) {
        savePref("amzn-dtb-ad-sis-last-checkin", Long.valueOf(j));
    }

    public void saveAaxHostname(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            savePref(AAX_HOSTNAME_PREF_NAME, str);
        } else {
            savePref(AAX_HOSTNAME_PREF_NAME, DtbConstants.AAX_HOSTNAME);
        }
    }

    public String getAaxHostname() {
        String str = (String) getPref(AAX_HOSTNAME_PREF_NAME, String.class);
        if (!AdRegistration.isTestMode() || !DtbDebugProperties.isInternalDebugMode) {
            return DtbCommonUtils.isNullOrEmpty(str) ? DtbConstants.AAX_HOSTNAME : str;
        }
        if (str == null) {
            str = DtbConstants.AAX_HOSTNAME;
        }
        return DtbDebugProperties.getAaxHostName(str);
    }

    public String getRoute53EnabledCNAME() {
        if (!AdRegistration.isTestMode() || !DtbDebugProperties.isInternalDebugMode) {
            return DtbConstants.AAX_ROUTE53_ENABLED_CNAME;
        }
        return DtbDebugProperties.getRoute53EnabledCNAME(DtbConstants.AAX_ROUTE53_ENABLED_CNAME);
    }

    public long getConfigTtl() {
        long longValue = ((Long) getPref(CONFIG_TTL_PREF_NAME, Long.class)).longValue();
        if (longValue < 1 || longValue > 172800000) {
            return 172800000;
        }
        return longValue;
    }

    public void saveConfigTtl(long j) {
        if (j < 1 || j > 172800000) {
            savePref(CONFIG_TTL_PREF_NAME, 172800000L);
        } else {
            savePref(CONFIG_TTL_PREF_NAME, Long.valueOf(j));
        }
    }

    public boolean saveSisEndpoint(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            String str2 = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
            String str3 = str + "/api3";
            if (str2 != null && str2.equals(str3)) {
                return false;
            }
            savePref(SIS_ENDPOINT_PREF_NAME, str3);
            return true;
        }
        savePref(SIS_ENDPOINT_PREF_NAME, DtbConstants.SIS_END_POINT + "/api3");
        return false;
    }

    public String getSisEndpoint() {
        String str = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            return str;
        }
        return DtbConstants.SIS_END_POINT + "/api3";
    }

    /* access modifiers changed from: package-private */
    public void saveWebResoucesLastPing(long j) {
        savePref(SIS_LAST_PING_WEB_RESOURCES, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public Long getWebResoucesLastPing() {
        return (Long) getPref(SIS_LAST_PING_WEB_RESOURCES, Long.class);
    }

    /* access modifiers changed from: package-private */
    public void resetWebResoucesLastPing() {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(SIS_LAST_PING_WEB_RESOURCES);
            edit.commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveWrapperDetectionLastPing(long j) {
        savePref(SDK_WRAPPER_PING, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public Long getWrapperDetectionLastPing() {
        return (Long) getPref(SDK_WRAPPER_PING, Long.class);
    }

    /* access modifiers changed from: package-private */
    public void resetWrapperDetectionLastPing() {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(SDK_WRAPPER_PING);
            edit.commit();
        }
    }

    public void saveSisLastPing(long j) {
        savePref(SIS_LAST_PING_PREF_NAME, Long.valueOf(j));
    }

    public long getSisLastPing() {
        return ((Long) getPref(SIS_LAST_PING_PREF_NAME, Long.class)).longValue();
    }

    private static <T> void savePref(String str, T t) {
        SharedPreferences sharedPreferences2;
        if (!isIgnore && (sharedPreferences2 = getSharedPreferences()) != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            if (t instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) t).booleanValue());
            } else if (t instanceof String) {
                edit.putString(str, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(str, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(str, ((Long) t).longValue());
            } else if (t instanceof Set) {
                edit.putStringSet(str, (Set) t);
            } else {
                throw new IllegalArgumentException("Saving of " + t.getClass() + " is not supported.");
            }
            edit.commit();
        }
    }

    private static <T> T getPref(String str, Class<T> cls) {
        if (isIgnore) {
            return null;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (cls.isAssignableFrom(String.class)) {
            return sharedPreferences2.getString(str, (String) null);
        }
        if (cls.isAssignableFrom(Set.class)) {
            return sharedPreferences2.getStringSet(str, (Set) null);
        }
        if (cls.isAssignableFrom(Boolean.class)) {
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, false));
        }
        if (cls.isAssignableFrom(Long.class)) {
            return Long.valueOf(sharedPreferences2.getLong(str, 0));
        }
        if (cls.isAssignableFrom(Integer.class)) {
            return Integer.valueOf(sharedPreferences2.getInt(str, 0));
        }
        if (cls.isAssignableFrom(Float.class)) {
            return Float.valueOf(sharedPreferences2.getFloat(str, 0.0f));
        }
        throw new IllegalArgumentException(cls.getName() + " is not supported");
    }

    private static boolean containsPreference(String str) {
        return getSharedPreferences().contains(str);
    }

    private static void flushPreference(String str) {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2.contains(str)) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public void saveVendorList(String str) {
        savePref(NON_IAB_VENDORLIST, str);
    }

    public String getVendorList() {
        return (String) getPref(NON_IAB_VENDORLIST, String.class);
    }

    public void saveConsentStatus(String str) {
        savePref(NON_IAB_CONSENT_STATUS, str);
    }

    public String getConsentStatus() {
        return (String) getPref(NON_IAB_CONSENT_STATUS, String.class);
    }

    public void saveCMPFlavor(String str) {
        savePref(NON_IAB_CMP_FLAVOR, str);
    }

    public String getCMPFlavor() {
        return (String) getPref(NON_IAB_CMP_FLAVOR, String.class);
    }

    public void saveNonIABCustomConsent(String str) {
        savePref(NON_IAB_CUSTOM_CONSENT, str);
    }

    public String getNonIABCustomConsent() {
        return (String) getPref(NON_IAB_CUSTOM_CONSENT, String.class);
    }

    public void removeVendorList() {
        flushPreference(NON_IAB_VENDORLIST);
    }

    public void removeCMPFlavor() {
        flushPreference(NON_IAB_CMP_FLAVOR);
    }

    public void removeConsentStatus() {
        flushPreference(NON_IAB_CONSENT_STATUS);
    }

    public void removeNonIABCustomConsent() {
        flushPreference(NON_IAB_CUSTOM_CONSENT);
    }

    public void savePJTemplate(JSONObject jSONObject) {
        if (jSONObject != null) {
            savePref(PJ_TEMPLATE_PREF_NAME, jSONObject.toString());
        }
    }

    public JSONObject getPJTemplate() {
        try {
            return new JSONObject((String) getPref(PJ_TEMPLATE_PREF_NAME, String.class));
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            DtbLog.warn(this.LOG_TAG, "Get Pj template failed when fetching from Cache");
            return jSONObject;
        }
    }

    public void removePJTemplate() {
        flushPreference(PJ_TEMPLATE_PREF_NAME);
    }

    public void saveBidTimeout(Integer num) {
        savePref(BID_TIMEOUT_PREF_NAME, num);
    }

    public int getBidTimeout() {
        Integer num = (Integer) getPref(BID_TIMEOUT_PREF_NAME, Integer.class);
        if (num == null || num.intValue() == 0) {
            return 5000;
        }
        return num.intValue();
    }

    public void removeBidTimeout() {
        flushPreference(BID_TIMEOUT_PREF_NAME);
    }
}
