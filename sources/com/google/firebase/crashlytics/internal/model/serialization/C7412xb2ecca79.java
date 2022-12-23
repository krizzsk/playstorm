package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr-1hcsJXE */
/* compiled from: lambda */
public final /* synthetic */ class C7412xb2ecca79 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7412xb2ecca79 INSTANCE = new C7412xb2ecca79();

    private /* synthetic */ C7412xb2ecca79() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
    }
}
