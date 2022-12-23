package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.-$$Lambda$CrashlyticsReportPersistence$01Lorz603_-5ziNugbvmzIHT6dw */
/* compiled from: lambda */
public final /* synthetic */ class C7418x6b11374a implements Comparator {
    public static final /* synthetic */ C7418x6b11374a INSTANCE = new C7418x6b11374a();

    private /* synthetic */ C7418x6b11374a() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
    }
}
