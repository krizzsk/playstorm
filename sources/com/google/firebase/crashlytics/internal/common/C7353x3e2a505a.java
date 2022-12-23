package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.internal.common.-$$Lambda$SessionReportingCoordinator$TX0lZug2FS1EXHwsWNz9vWcgWJw */
/* compiled from: lambda */
public final /* synthetic */ class C7353x3e2a505a implements Comparator {
    public static final /* synthetic */ C7353x3e2a505a INSTANCE = new C7353x3e2a505a();

    private /* synthetic */ C7353x3e2a505a() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
    }
}
