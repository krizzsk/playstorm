package com.unity3d.services.core.configuration;

import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressorWithMetrics;
import com.unity3d.services.core.device.reader.DeviceInfoReaderUrlEncoder;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

public class ConfigurationRequestFactory {
    private final String _configUrl;
    private final Configuration _configuration;
    private final IDeviceInfoReader _deviceInfoReader;

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoReader iDeviceInfoReader, String str) {
        this._configuration = configuration;
        this._deviceInfoReader = iDeviceInfoReader;
        this._configUrl = str;
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String str = this._configUrl + buildQueryString();
        DeviceLog.debug("Requesting configuration with: " + str);
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled() || !experiments.isPOSTMethodInConfigRequestEnabled()) {
            return new WebRequest(str, ShareTarget.METHOD_GET);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
        WebRequest webRequest = new WebRequest(str, ShareTarget.METHOD_POST, hashMap);
        webRequest.setBody(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments).getDeviceData());
        return webRequest;
    }

    private String buildQueryString() {
        StringBuilder sb = new StringBuilder();
        sb.append("?");
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled()) {
            sb.append("ts=");
            sb.append(System.currentTimeMillis());
            sb.append("&sdkVersion=");
            sb.append(SdkProperties.getVersionCode());
            sb.append("&sdkVersionName=");
            sb.append(SdkProperties.getVersionName());
            sb.append("&gameId=");
            sb.append(ClientProperties.getGameId());
        } else {
            sb.append(buildCompressedQueryStringIfNeeded());
        }
        return sb.toString();
    }

    private String buildCompressedQueryStringIfNeeded() {
        Experiments experiments = this._configuration.getExperiments();
        if (experiments == null || !experiments.isTwoStageInitializationEnabled() || experiments.isPOSTMethodInConfigRequestEnabled()) {
            return "";
        }
        String urlEncodedData = new DeviceInfoReaderUrlEncoder(new DeviceInfoReaderCompressorWithMetrics(new DeviceInfoReaderCompressor(this._deviceInfoReader), experiments)).getUrlEncodedData();
        return "c=" + urlEncodedData;
    }
}
