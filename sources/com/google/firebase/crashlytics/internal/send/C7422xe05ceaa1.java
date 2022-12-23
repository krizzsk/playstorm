package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.Transformer;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* renamed from: com.google.firebase.crashlytics.internal.send.-$$Lambda$DataTransportCrashlyticsReportSender$J-l-tQxiH58gc27V_xiyanKrAKU */
/* compiled from: lambda */
public final /* synthetic */ class C7422xe05ceaa1 implements Transformer {
    public static final /* synthetic */ C7422xe05ceaa1 INSTANCE = new C7422xe05ceaa1();

    private /* synthetic */ C7422xe05ceaa1() {
    }

    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
