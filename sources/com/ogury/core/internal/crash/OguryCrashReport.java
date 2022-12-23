package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C10219ai;

/* compiled from: OguryCrashReport.kt */
public final class OguryCrashReport {
    public static final int LOG_LEVEL_CRASH_REPORT = 1;
    public static final int LOG_LEVEL_TWO = 2;

    /* renamed from: a */
    private static final C10255h f26011a = new C10255h();

    /* renamed from: b */
    private static C10254g f26012b;

    /* renamed from: c */
    private static OguryCrashReport f26013c = new OguryCrashReport();

    private OguryCrashReport() {
    }

    public static final synchronized void start(String str, Context context, SdkInfo sdkInfo, CrashConfig crashConfig) {
        synchronized (OguryCrashReport.class) {
            C10219ai.m31036b(str, "sdkKey");
            C10219ai.m31036b(context, "context");
            C10219ai.m31036b(sdkInfo, "sdkInfo");
            C10219ai.m31036b(crashConfig, "crashConfig");
            m31059a(context, sdkInfo);
            C10254g gVar = f26012b;
            if (gVar != null) {
                gVar.mo66827a(str, crashConfig);
            }
        }
    }

    /* renamed from: a */
    private static void m31059a(Context context, SdkInfo sdkInfo) {
        if (f26012b == null) {
            f26012b = C10255h.m31097a(context, sdkInfo);
        }
    }

    public static final void uploadLevelTwoCrashes(String str) {
        C10219ai.m31036b(str, "sdkKey");
        C10254g gVar = f26012b;
        if (gVar != null) {
            gVar.mo66826a(str);
        }
    }

    public static final synchronized void stop(String str, Context context, SdkInfo sdkInfo) {
        synchronized (OguryCrashReport.class) {
            C10219ai.m31036b(str, "sdkKey");
            C10219ai.m31036b(context, "context");
            C10219ai.m31036b(sdkInfo, "sdkInfo");
            m31059a(context, sdkInfo);
            C10254g gVar = f26012b;
            if (gVar != null) {
                gVar.mo66829b(str);
            }
        }
    }

    public static final void logException(String str, Throwable th) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(th, "throwable");
        C10254g gVar = f26012b;
        if (gVar != null) {
            gVar.mo66830b(str, th);
        }
    }

    public static final void logLevelTwoException(String str, Throwable th) {
        C10219ai.m31036b(str, "sdkKey");
        C10219ai.m31036b(th, "throwable");
        C10254g gVar = f26012b;
        if (gVar != null) {
            gVar.mo66828a(str, th);
        }
    }
}
