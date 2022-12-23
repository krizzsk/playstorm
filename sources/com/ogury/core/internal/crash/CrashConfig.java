package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;

/* compiled from: CrashConfig.kt */
public final class CrashConfig {

    /* renamed from: a */
    private final int f26009a;

    /* renamed from: b */
    private final int f26010b;
    private final String packageName;
    private final String url;

    public CrashConfig(String str, String str2, int i, int i2) {
        C10219ai.m31036b(str, "url");
        C10219ai.m31036b(str2, "packageName");
        this.url = str;
        this.packageName = str2;
        this.f26009a = i;
        this.f26010b = i2;
    }

    public final int getDeleteAllCrashesFrequency() {
        return this.f26010b;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getSendCrashFrequency() {
        return this.f26009a;
    }

    public final String getUrl() {
        return this.url;
    }
}
