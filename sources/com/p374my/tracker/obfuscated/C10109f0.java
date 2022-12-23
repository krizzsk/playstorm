package com.p374my.tracker.obfuscated;

import android.text.TextUtils;
import com.p374my.tracker.MyTrackerConfig;
import com.p374my.tracker.obfuscated.C10170t;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.my.tracker.obfuscated.f0 */
public final class C10109f0 extends C10170t<String> {

    /* renamed from: a */
    final MyTrackerConfig.OkHttpClientProvider f25182a;

    C10109f0(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f25182a = okHttpClientProvider;
    }

    /* renamed from: a */
    public C10170t.C10172b<String> mo66167a(String str) {
        Response response;
        Throwable th;
        C10170t.C10172b<String> c = C10170t.C10172b.m30430c();
        T t = null;
        try {
            C10175u0.m30440a("OkHttpGetRequest: send request to " + str);
            response = this.f25182a.getOkHttpClient().newCall(new Request.Builder().url(str).get().build()).execute();
            try {
                int code = response.code();
                if (code == 200) {
                    C10175u0.m30440a("OkHttpGetRequest: response successfully received");
                    c.f25471a = true;
                } else {
                    C10175u0.m30440a("OkHttpGetRequest error: response code " + code);
                    c.f25471a = false;
                }
                if (code == 200) {
                    C10175u0.m30440a("OkHttpGetRequest: processing server response");
                    ResponseBody body = response.body();
                    if (body != null) {
                        t = body.string();
                    }
                    if (!TextUtils.isEmpty(t)) {
                        c.f25472b = t;
                    } else {
                        C10175u0.m30440a("OkHttpGetRequest: response data is empty");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    C10175u0.m30441a("OkHttpGetRequest error: error while sending data", th);
                    c.f25471a = false;
                    c.f25473c = "OkHttpGetRequest error: error while sending data";
                } finally {
                    if (response != null) {
                        response.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            response = null;
            C10175u0.m30441a("OkHttpGetRequest error: error while sending data", th);
            c.f25471a = false;
            c.f25473c = "OkHttpGetRequest error: error while sending data";
        }
        return c;
    }
}
