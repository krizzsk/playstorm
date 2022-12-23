package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.ExecutorService;

public class NativeTokenGenerator implements INativeTokenGenerator {
    /* access modifiers changed from: private */
    public IDeviceInfoReader _deviceInfoReader;
    private ExecutorService _executorService;

    public NativeTokenGenerator(ExecutorService executorService, IDeviceInfoReader iDeviceInfoReader) {
        this._executorService = executorService;
        this._deviceInfoReader = iDeviceInfoReader;
    }

    public void generateToken(final INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        this._executorService.execute(new Runnable() {
            public void run() {
                try {
                    String encodeToString = Base64.encodeToString(new DeviceInfoReaderCompressor(NativeTokenGenerator.this._deviceInfoReader).getDeviceData(), 2);
                    StringBuilder sb = new StringBuilder(encodeToString.length() + 2);
                    sb.append("1:");
                    sb.append(encodeToString);
                    iNativeTokenGeneratorListener.onReady(sb.toString());
                } catch (Exception e) {
                    DeviceLog.exception("Unity Ads failed to generate token.", e);
                    iNativeTokenGeneratorListener.onReady((String) null);
                }
            }
        });
    }
}
