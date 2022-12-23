package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$Ckb34QcYctmy_Q7QdvSnBmK1U98 */
/* compiled from: lambda */
public final /* synthetic */ class C7413xfa2562a4 implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ C7413xfa2562a4 INSTANCE = new C7413xfa2562a4();

    private /* synthetic */ C7413xfa2562a4() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
    }
}
