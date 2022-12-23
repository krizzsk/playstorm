package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY */
/* compiled from: lambda */
public final /* synthetic */ class C7414x303c6f4 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7414x303c6f4 INSTANCE = new C7414x303c6f4();

    private /* synthetic */ C7414x303c6f4() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
    }
}
