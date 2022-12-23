package com.ogury.core.internal.network;

import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10294u;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.a */
/* compiled from: HeadersLoader.kt */
public final class C10285a {
    /* renamed from: a */
    public static final boolean m31131a(HeadersLoader headersLoader) {
        C10219ai.m31036b(headersLoader, "$this$isContentGzipEncoded");
        return C10219ai.m31035a((Object) headersLoader.loadHeaders().get("Content-Encoding"), (Object) "gzip");
    }

    /* renamed from: a */
    public static final boolean m31132a(HttpURLConnection httpURLConnection) {
        C10219ai.m31036b(httpURLConnection, "$this$isResponseGzipEncoded");
        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
        if (headerField == null) {
            return false;
        }
        Locale locale = Locale.US;
        C10219ai.m31034a((Object) locale, "Locale.US");
        String lowerCase = headerField.toLowerCase(locale);
        C10219ai.m31034a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C10219ai.m31035a((Object) lowerCase, (Object) "gzip");
    }

    /* renamed from: com.ogury.core.internal.network.a$a */
    /* compiled from: HeadersLoader.kt */
    public static final class C10286a implements HeadersLoader {
        C10286a() {
        }

        public final Map<String, String> loadHeaders() {
            return C10294u.m31135a();
        }
    }

    static {
        new C10286a();
    }
}
