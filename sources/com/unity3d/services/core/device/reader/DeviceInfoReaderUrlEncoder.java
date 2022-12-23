package com.unity3d.services.core.device.reader;

import android.util.Base64;
import com.unity3d.services.core.log.DeviceLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DeviceInfoReaderUrlEncoder {
    private final IDeviceInfoDataContainer _deviceInfoDataContainer;

    public DeviceInfoReaderUrlEncoder(IDeviceInfoDataContainer iDeviceInfoDataContainer) {
        this._deviceInfoDataContainer = iDeviceInfoDataContainer;
    }

    public String getUrlEncodedData() {
        try {
            return URLEncoder.encode(Base64.encodeToString(this._deviceInfoDataContainer.getDeviceData(), 2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            DeviceLog.error("Could not encode device data using UTF-8.");
            return "";
        }
    }
}
