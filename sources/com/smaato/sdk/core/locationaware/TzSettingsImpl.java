package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

public class TzSettingsImpl implements TzSettings {
    private final Context context;

    TzSettingsImpl(Context context2) {
        this.context = context2;
    }

    public boolean isAutoTimeZoneEnabled() {
        if (Build.VERSION.SDK_INT >= 17) {
            if (Settings.Global.getInt(this.context.getContentResolver(), "auto_time_zone", 0) > 0) {
                return true;
            }
            return false;
        } else if (Settings.System.getInt(this.context.getContentResolver(), "auto_time_zone", 0) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
