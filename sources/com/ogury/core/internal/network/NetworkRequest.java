package com.ogury.core.internal.network;

import com.ogury.core.internal.C10218ah;
import com.ogury.core.internal.C10219ai;

/* compiled from: NetworkRequest.kt */
public final class NetworkRequest {

    /* renamed from: a */
    private final String f26075a;

    /* renamed from: b */
    private final String f26076b;

    /* renamed from: c */
    private final String f26077c;

    /* renamed from: d */
    private final HeadersLoader f26078d;

    public NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader) {
        C10219ai.m31036b(str, "url");
        C10219ai.m31036b(str2, "method");
        C10219ai.m31036b(str3, "body");
        C10219ai.m31036b(headersLoader, "headers");
        this.f26075a = str;
        this.f26076b = str2;
        this.f26077c = str3;
        this.f26078d = headersLoader;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkRequest(String str, String str2, String str3, HeadersLoader headersLoader, int i, C10218ah ahVar) {
        this(str, str2, (i & 4) != 0 ? "" : str3, headersLoader);
    }

    public final String getBody() {
        return this.f26077c;
    }

    public final HeadersLoader getHeaders() {
        return this.f26078d;
    }

    public final String getMethod() {
        return this.f26076b;
    }

    public final String getUrl() {
        return this.f26075a;
    }
}
