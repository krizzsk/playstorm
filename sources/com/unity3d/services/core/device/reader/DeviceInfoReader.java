package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.SmaatoSdk;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class DeviceInfoReader implements IDeviceInfoReader {
    public Map<String, Object> getDeviceInfoData() {
        HashMap hashMap = new HashMap();
        hashMap.put("bundleId", ClientProperties.getAppName());
        hashMap.put("encrypted", Boolean.valueOf(ClientProperties.isAppDebuggable()));
        hashMap.put("rooted", Boolean.valueOf(Device.isRooted()));
        hashMap.put(TapjoyConstants.TJC_PLATFORM, "android");
        hashMap.put(SmaatoSdk.KEY_SDK_VERSION, Integer.valueOf(SdkProperties.getVersionCode()));
        hashMap.put("osVersion", Device.getOsVersion());
        hashMap.put("deviceModel", Device.getModel());
        hashMap.put("language", Locale.getDefault().toString());
        hashMap.put("connectionType", Device.getConnectionType());
        hashMap.put("screenHeight", Integer.valueOf(Device.getScreenHeight()));
        hashMap.put("screenWidth", Integer.valueOf(Device.getScreenWidth()));
        hashMap.put("deviceMake", Device.getManufacturer());
        hashMap.put("screenDensity", Integer.valueOf(Device.getScreenDensity()));
        hashMap.put("screenSize", Integer.valueOf(Device.getScreenLayout()));
        hashMap.put("limitAdTracking", Boolean.valueOf(Device.isLimitAdTrackingEnabled()));
        hashMap.put("idfi", Device.getIdfi());
        hashMap.put("networkOperator", Device.getNetworkOperator());
        hashMap.put(TapjoyConstants.TJC_VOLUME, Integer.valueOf(Device.getStreamVolume(1)));
        hashMap.put("deviceFreeSpace", Long.valueOf(Device.getFreeSpace(ClientProperties.getApplicationContext().getCacheDir())));
        hashMap.put("apiLevel", String.valueOf(Device.getApiLevel()));
        hashMap.put("networkType", Integer.valueOf(Device.getNetworkType()));
        hashMap.put("bundleVersion", ClientProperties.getAppVersion());
        hashMap.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        hashMap.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        hashMap.put("webviewUa", WebSettings.getDefaultUserAgent(ClientProperties.getApplicationContext()));
        hashMap.put("networkOperatorName", Device.getNetworkOperatorName());
        hashMap.put("wiredHeadset", Boolean.valueOf(Device.isWiredHeadsetOn()));
        hashMap.put("versionCode", Integer.valueOf(SdkProperties.getVersionCode()));
        hashMap.put("stores", Constants.REFERRER_API_GOOGLE);
        hashMap.put("appStartTime", Long.valueOf(SdkProperties.getInitializationTimeEpoch() / 1000));
        hashMap.put("sdkVersionName", SdkProperties.getVersionName());
        hashMap.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("cpuCount", Long.valueOf(Device.getCPUCount()));
        hashMap.put("usbConnected", Boolean.valueOf(Device.isUSBConnected()));
        try {
            hashMap.put("apkHash", Device.getApkDigest());
        } catch (Exception unused) {
            DeviceLog.error("Could not get APK Digest");
        }
        hashMap.put("apkDeveloperSigningCertificateHash", Device.getCertificateFingerprint());
        hashMap.put("deviceUpTime", Long.valueOf(Device.getUptime()));
        hashMap.put("deviceElapsedRealtime", Long.valueOf(Device.getElapsedRealtime()));
        hashMap.put("adbEnabled", Device.isAdbEnabled());
        hashMap.put("androidFingerprint", Device.getFingerprint());
        hashMap.put("batteryStatus", Integer.valueOf(Device.getBatteryStatus()));
        hashMap.put("batteryLevel", Float.valueOf(Device.getBatteryLevel()));
        hashMap.put("networkMetered", Boolean.valueOf(Device.getNetworkMetered()));
        hashMap.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
        hashMap.put("gameId", ClientProperties.getGameId());
        hashMap.put("test", Boolean.valueOf(SdkProperties.isTestMode()));
        hashMap.put("callType", "token");
        return hashMap;
    }
}
