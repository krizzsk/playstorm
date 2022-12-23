package com.amazon.device.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kotlin.text.Typography;

class DtbDebugProperties {
    public static final String AAX_HOSTNAME = "aaxHostname";
    public static final String AAX_ROUTE53_ENABLED_CNAME = "route53EnabledAAXCname";
    public static final String CONFIG_HOSTNAME = "configHostname";
    public static final String INTERNAL_DEBUG_MODE = "internalDebugMode";
    public static final String SIS_URL = "sisUrl";
    private static final String TEST_OVERRIDE_FILE = "com.amazon.device.ads.dtb.debug.override";
    public static final String USE_SECURE = "useSecure";
    private static DtbDebugProperties debugProperties = null;
    private static boolean isInitialized = false;
    static boolean isInternalDebugMode = false;
    private static Set<String> preDefinedKeys;
    private static HashMap<String, String> propertyMap = new HashMap<>();

    DtbDebugProperties() {
    }

    public static DtbDebugProperties getInstance() {
        if (!isInitialized) {
            DtbLog.debug("Running the debug initialization.");
            debugProperties = new DtbDebugProperties();
            HashSet hashSet = new HashSet();
            preDefinedKeys = hashSet;
            hashSet.add(AAX_HOSTNAME.toLowerCase());
            preDefinedKeys.add(SIS_URL.toLowerCase());
            preDefinedKeys.add(USE_SECURE.toLowerCase());
            preDefinedKeys.add(CONFIG_HOSTNAME.toLowerCase());
            preDefinedKeys.add(INTERNAL_DEBUG_MODE.toLowerCase());
            initializeDtbDebugProperties();
        }
        return debugProperties;
    }

    public boolean isDebugMode() {
        return isInternalDebugMode;
    }

    public static void initializeDtbDebugProperties() {
        InputStream resourceAsStream;
        try {
            if (AdRegistration.isTestMode()) {
                if (AdRegistration.getContext() == null) {
                    DtbLog.debugError("unable to initialize debug preferences without setting app context");
                    throw new IllegalArgumentException("unable to initialize debug preferences without setting app context");
                }
            }
            String string = DtbCommonUtils.getApplicationBundle().getString(TEST_OVERRIDE_FILE);
            if (!DtbCommonUtils.isNullOrEmpty(string)) {
                DtbLog.debug("Override file: " + string);
                resourceAsStream = DtbCommonUtils.getResourceAsStream(string);
                if (resourceAsStream == null) {
                    DtbLog.debug("Failed to read override from classpath, trying to read override file from absolute location: " + string);
                    File file = new File(string);
                    if (!file.exists()) {
                        DtbLog.debug("Couldn't find the override file, skipping.");
                        return;
                    }
                    resourceAsStream = new FileInputStream(file);
                }
                DtbLog.debug("Reading debug params..");
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                for (Map.Entry entry : properties.entrySet()) {
                    String str = (String) entry.getKey();
                    if (DtbCommonUtils.isNullOrWhiteSpace(str)) {
                        DtbLog.debug("Error: The debug property name must not be null or empty string");
                    } else {
                        String str2 = (String) entry.getValue();
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                        DtbLog.debug("Overrides found: " + str + " --> " + str2);
                        if (str.equalsIgnoreCase(INTERNAL_DEBUG_MODE)) {
                            isInternalDebugMode = str2.equalsIgnoreCase("true");
                        }
                        propertyMap.put(str, str2);
                    }
                }
                resourceAsStream.close();
            }
        } catch (Exception e) {
            DtbLog.debug("Error:: Failed to read the debug params. ignoring." + e.getStackTrace());
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
        isInitialized = true;
    }

    public static HashMap<String, String> getDebugParams() {
        if (!AdRegistration.isTestMode() || !isInternalDebugMode) {
            return new HashMap<>();
        }
        return propertyMap;
    }

    public static String getAaxHostName(String str) {
        return getDebugProperty(AAX_HOSTNAME, str);
    }

    public static String getRoute53EnabledCNAME(String str) {
        return getDebugProperty(AAX_ROUTE53_ENABLED_CNAME, str);
    }

    public static String getSISUrl(String str) {
        return getDebugProperty(SIS_URL, str);
    }

    public static boolean getIsSecure(boolean z) {
        String debugProperty = getDebugProperty(USE_SECURE, "");
        if (debugProperty.equals("true")) {
            return true;
        }
        if (debugProperty.equals("false")) {
            return false;
        }
        return z;
    }

    public static String getConfigHostName(String str) {
        return getDebugProperty(CONFIG_HOSTNAME, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = propertyMap;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDebugProperty(java.lang.String r1, java.lang.String r2) {
        /*
            boolean r0 = com.amazon.device.ads.AdRegistration.isTestMode()
            if (r0 == 0) goto L_0x001d
            boolean r0 = isInternalDebugMode
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.lang.String> r0 = propertyMap
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.lang.String> r2 = propertyMap
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbDebugProperties.getDebugProperty(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void resetProperties() {
        isInitialized = false;
        propertyMap = new HashMap<>();
    }

    public static String getEncodedUrlParams() {
        if (!isInternalDebugMode) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : propertyMap.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            try {
                if (!preDefinedKeys.contains(str.toLowerCase())) {
                    sb.append(Typography.amp);
                    sb.append(str);
                    sb.append('=');
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                }
            } catch (UnsupportedEncodingException e) {
                DtbLog.debugError(String.format("Cannot encode %d=%d due to exception %d", new Object[]{str, str2, e.getMessage()}));
            }
        }
        return sb.toString();
    }
}
