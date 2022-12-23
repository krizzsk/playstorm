package com.p374my.tracker.obfuscated;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.i */
public final class C10114i {

    /* renamed from: a */
    private final C10126m f25188a;

    private C10114i(C10126m mVar) {
        this.f25188a = mVar;
    }

    /* renamed from: a */
    public static C10114i m30082a(C10126m mVar) {
        return new C10114i(mVar);
    }

    /* renamed from: a */
    public String mo66168a(Intent intent) {
        C10175u0.m30440a("DeeplinkHandler: handling deeplink");
        if (intent == null) {
            C10175u0.m30440a("DeeplinkHandler: intent is null");
            return null;
        }
        try {
            Uri data = intent.getData();
            if (data == null) {
                C10175u0.m30440a("DeeplinkHandler: intent data is null");
                return null;
            }
            C10175u0.m30440a("DeeplinkHandler: intent data: " + data);
            String queryParameter = data.getQueryParameter("mt_deeplink");
            String queryParameter2 = data.getQueryParameter("mt_click_id");
            if (queryParameter != null) {
                C10175u0.m30440a("DeeplinkHandler: found mt_deeplink in intent");
            } else {
                C10175u0.m30440a("DeeplinkHandler: mt_deeplink not found in intent");
                queryParameter = data.toString();
            }
            C10175u0.m30440a("DeeplinkHandler: deeplink " + queryParameter);
            C10175u0.m30440a("DeeplinkHandler: clickId " + queryParameter2);
            this.f25188a.mo66237a(queryParameter, queryParameter2);
            return queryParameter;
        } catch (Throwable th) {
            C10175u0.m30445b("DeeplinkHandler error: ", th);
            return null;
        }
    }
}
