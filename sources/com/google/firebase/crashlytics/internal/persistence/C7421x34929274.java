package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.-$$Lambda$CrashlyticsReportPersistence$yrLDYcvA2rHplfuqiXhfFmNn2UQ */
/* compiled from: lambda */
public final /* synthetic */ class C7421x34929274 implements FilenameFilter {
    public static final /* synthetic */ C7421x34929274 INSTANCE = new C7421x34929274();

    private /* synthetic */ C7421x34929274() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
