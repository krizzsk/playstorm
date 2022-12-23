package com.unity3d.services.core.device.reader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DeviceInfoReaderWithStorageInfo implements IDeviceInfoReader {
    private static final List<String> _blackListOfKeys = Arrays.asList(new String[]{CampaignEx.JSON_KEY_ST_TS, "exclude", "pii", "nonBehavioral", "nonbehavioral"});
    private static final List<String> _includedKeys = Arrays.asList(new String[]{"privacy", "gdpr", "framework", "adapter", "mediation", TapjoyConstants.TJC_PLUGIN_UNITY, "pipl", "configuration", "user", JsonStorageKeyNames.UNIFIED_CONFIG_KEY});
    private final IDeviceInfoReader _deviceInfoReader;
    private final List<IJsonStorageReader> _storageReaders;

    public DeviceInfoReaderWithStorageInfo(IDeviceInfoReader iDeviceInfoReader, IJsonStorageReader... iJsonStorageReaderArr) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._storageReaders = Arrays.asList(iJsonStorageReaderArr);
    }

    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        return deviceInfoData != null ? Utilities.combineJsonIntoMap(deviceInfoData, new JsonFlattener(new JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", _includedKeys, Collections.singletonList("value"), _blackListOfKeys)) : deviceInfoData;
    }
}
