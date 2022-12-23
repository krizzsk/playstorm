package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiDataSelector;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeviceInfoReaderBuilder {
    private ConfigurationReader _configurationReader;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader) {
        this._configurationReader = configurationReader;
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        JsonStorageAggregator jsonStorageAggregator = new JsonStorageAggregator(Arrays.asList(new IJsonStorageReader[]{storage2, storage}));
        DeviceInfoReaderFilterProvider deviceInfoReaderFilterProvider = new DeviceInfoReaderFilterProvider(storage);
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithPII(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReader(), CachedLifecycle.getLifecycleListener()), storage, storage2), new PiiDataSelector(new PiiTrackingStatusReader(jsonStorageAggregator), storage, getCurrentExperiments()), new PiiDataProvider()), deviceInfoReaderFilterProvider.getFilterList()), getCurrentMetricTags());
    }

    private Experiments getCurrentExperiments() {
        ConfigurationReader configurationReader = this._configurationReader;
        if (configurationReader == null || configurationReader.getCurrentConfiguration() == null) {
            return new Experiments();
        }
        return this._configurationReader.getCurrentConfiguration().getExperiments();
    }

    private Map<String, String> getCurrentMetricTags() {
        ConfigurationReader configurationReader = this._configurationReader;
        if (configurationReader == null || configurationReader.getCurrentConfiguration() == null) {
            return new HashMap();
        }
        return this._configurationReader.getCurrentConfiguration().getMetricTags();
    }
}
