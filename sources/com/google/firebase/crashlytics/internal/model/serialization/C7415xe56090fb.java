package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$NhzBXeLMMIRDAHr-yokwvoZKlwo */
/* compiled from: lambda */
public final /* synthetic */ class C7415xe56090fb implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7415xe56090fb INSTANCE = new C7415xe56090fb();

    private /* synthetic */ C7415xe56090fb() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
    }
}
