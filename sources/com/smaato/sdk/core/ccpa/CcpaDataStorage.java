package com.smaato.sdk.core.ccpa;

import android.content.SharedPreferences;
import com.smaato.sdk.core.util.Objects;

public final class CcpaDataStorage {
    private final SharedPreferences defaultSharedPreferences;

    public CcpaDataStorage(SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences);
    }

    public String getUsPrivacyString() {
        return this.defaultSharedPreferences.getString("IABUSPrivacy_String", "");
    }
}
