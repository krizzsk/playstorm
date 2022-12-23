package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ */
/* compiled from: lambda */
public final /* synthetic */ class C7416xa6122bf8 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7416xa6122bf8 INSTANCE = new C7416xa6122bf8();

    private /* synthetic */ C7416xa6122bf8() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseFile(jsonReader);
    }
}
