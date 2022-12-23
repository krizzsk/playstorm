package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.-$$Lambda$CrashlyticsReportPersistence$cus4xBFpk-zHLsoBdoVy1SdmpDs */
/* compiled from: lambda */
public final /* synthetic */ class C7420xde5b7e13 implements Comparator {
    public static final /* synthetic */ C7420xde5b7e13 INSTANCE = new C7420xde5b7e13();

    private /* synthetic */ C7420xde5b7e13() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
