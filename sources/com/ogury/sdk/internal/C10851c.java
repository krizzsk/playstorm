package com.ogury.sdk.internal;

import android.os.AsyncTask;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.sdk.internal.c */
/* compiled from: MonitoringInfoAsyncTask.kt */
public final class C10851c extends AsyncTask<Object, Object, Object> {

    /* renamed from: a */
    private final C10852d f27080a;

    /* renamed from: b */
    private final C10860i f27081b;

    /* renamed from: c */
    private final C10858h f27082c;

    public C10851c(C10852d dVar, C10860i iVar, C10858h hVar) {
        C10865m.m32951b(dVar, "monitoringInfoFetcher");
        C10865m.m32951b(iVar, "monitoringInfoStorage");
        C10865m.m32951b(hVar, "monitoringInfoSender");
        this.f27080a = dVar;
        this.f27081b = iVar;
        this.f27082c = hVar;
    }

    public final Object doInBackground(Object[] objArr) {
        C10865m.m32951b(objArr, "objects");
        try {
            C10850b a = this.f27080a.mo67920a();
            if (a.mo67910a()) {
                OguryIntegrationLogger.m30996d("[Ogury][[environment] Failed to check environment");
                return null;
            }
            C10850b a2 = this.f27081b.mo67928a();
            if (a.mo67912a(TapjoyConstants.TJC_APP_VERSION_NAME) && a2.mo67912a(TapjoyConstants.TJC_APP_VERSION_NAME) && (!C10865m.m32950a((Object) a.mo67913b(TapjoyConstants.TJC_APP_VERSION_NAME), (Object) a2.mo67913b(TapjoyConstants.TJC_APP_VERSION_NAME)))) {
                OguryIntegrationLogger.m30996d("[Ogury][environment] New environment detected");
                this.f27081b.mo67930b();
                a2.mo67916c();
            }
            if (!a2.mo67911a(a)) {
                OguryIntegrationLogger.m30996d("[Ogury][environment] New environment info detected");
                a2.mo67915b(a);
                if (this.f27082c.mo67927a(a2) instanceof OguryNetworkResponse.Success) {
                    this.f27081b.mo67929a(a2);
                }
            }
            OguryIntegrationLogger.m30996d("[Ogury][environment] Environment checked");
            return null;
        } catch (Throwable unused) {
        }
    }
}
