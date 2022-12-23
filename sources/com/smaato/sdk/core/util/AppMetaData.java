package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;

public final class AppMetaData {
    private final Context context;
    private final Logger logger;

    public AppMetaData(Context context2, Logger logger2) {
        this.context = (Context) Objects.requireNonNull(context2, "Parameter context cannot be null for PermissionChecker::new");
        this.logger = logger2;
    }

    public boolean isPermissionGranted(String str) {
        Objects.requireNonNull(str);
        try {
            if (this.context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            this.logger.error(LogDomain.CONFIG_CHECK, "permission not granted", e);
            return false;
        }
    }

    public boolean isActivityRegistered(Class<? extends Activity> cls) {
        return Intents.canHandleIntent(this.context, new Intent(this.context, cls));
    }
}
