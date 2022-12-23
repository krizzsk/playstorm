package com.smaato.sdk.core.linkhandler;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.smaato.sdk.core.lifecycle.ActivityProvider;

public class IntentLauncher {
    private final Application application;

    public IntentLauncher(Application application2) {
        this.application = application2;
    }

    public boolean launch(Intent intent) {
        try {
            Activity currentActivity = ActivityProvider.get().getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
                return true;
            }
            this.application.startActivity(intent.addFlags(268435456));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
