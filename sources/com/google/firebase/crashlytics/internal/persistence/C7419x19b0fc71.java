package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.-$$Lambda$CrashlyticsReportPersistence$5ewmHYO883ri5BmwN_Gn2GLWEFU */
/* compiled from: lambda */
public final /* synthetic */ class C7419x19b0fc71 implements FilenameFilter {
    public static final /* synthetic */ C7419x19b0fc71 INSTANCE = new C7419x19b0fc71();

    private /* synthetic */ C7419x19b0fc71() {
    }

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
    }
}
