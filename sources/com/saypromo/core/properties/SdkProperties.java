package com.saypromo.core.properties;

import android.content.Context;
import com.saypromo.core.cache.CacheDirectory;
import java.io.File;

public class SdkProperties {
    private static final String CACHE_DIR_NAME = "SPCache";
    private static final String LOCAL_CACHE_FILE_PREFIX = "SPCache";
    private static CacheDirectory _cacheDirectory;

    public static String getCacheFilePrefix() {
        return "SPCache";
    }

    public static File getCacheDirectory() {
        return getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getCacheDirectory(Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new CacheDirectory("SPCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }
}
