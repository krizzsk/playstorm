package com.smaato.sdk.core.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.adjust.sdk.Constants;
import java.util.UUID;

public class UUIDProvider {
    private final int MILLIS_IN_DAY = Constants.ONE_HOUR;
    private final String SMAATO_SDK_UUID = "SMAATO_SDK_UUID";
    private final String UUID_STORE_TIME = "UUID_STORE_TIME";
    private final SharedPreferences preferences;

    public UUIDProvider(Context context) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getUuid() {
        if ((System.currentTimeMillis() - this.preferences.getLong("UUID_STORE_TIME", 0)) / 3600000 < 24) {
            return this.preferences.getString("SMAATO_SDK_UUID", "");
        }
        String uuid = UUID.randomUUID().toString();
        this.preferences.edit().putString("SMAATO_SDK_UUID", uuid).apply();
        this.preferences.edit().putLong("UUID_STORE_TIME", System.currentTimeMillis()).apply();
        return uuid;
    }
}
