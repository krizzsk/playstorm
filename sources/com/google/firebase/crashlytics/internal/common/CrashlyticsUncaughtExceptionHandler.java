package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashListener crashListener;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final CrashlyticsNativeComponent nativeComponent;
    private final SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener2, SettingsProvider settingsProvider2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener2;
        this.settingsProvider = settingsProvider2;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.isHandlingException.set(true);
        try {
            if (shouldRecordUncaughtException(thread, th)) {
                this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
            } else {
                Logger.getLogger().mo51961d("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            Logger.getLogger().mo51964e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            Logger.getLogger().mo51961d("Completed exception processing. Invoking default exception handler.");
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
            throw th2;
        }
        Logger.getLogger().mo51961d("Completed exception processing. Invoking default exception handler.");
        this.defaultHandler.uncaughtException(thread, th);
        this.isHandlingException.set(false);
    }

    /* access modifiers changed from: package-private */
    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    private boolean shouldRecordUncaughtException(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().mo51963e("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            Logger.getLogger().mo51963e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        } else {
            Logger.getLogger().mo51961d("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }
}
