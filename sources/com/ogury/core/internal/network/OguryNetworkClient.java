package com.ogury.core.internal.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ogury.core.internal.C10219ai;

/* compiled from: OguryNetworkClient.kt */
public final class OguryNetworkClient {

    /* renamed from: a */
    private final int f26079a;

    /* renamed from: b */
    private final int f26080b;

    public OguryNetworkClient(int i, int i2) {
        this.f26079a = i;
        this.f26080b = i2;
    }

    public final Call newCall(NetworkRequest networkRequest) {
        C10219ai.m31036b(networkRequest, "request");
        return new C10287b(networkRequest, this.f26079a, this.f26080b);
    }

    public final OguryNetworkResponse post(String str, String str2, HeadersLoader headersLoader) {
        C10219ai.m31036b(str, "url");
        C10219ai.m31036b(str2, "body");
        C10219ai.m31036b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, ShareTarget.METHOD_POST, str2, headersLoader)).execute();
    }

    public final OguryNetworkResponse get(String str, HeadersLoader headersLoader) {
        C10219ai.m31036b(str, "url");
        C10219ai.m31036b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, ShareTarget.METHOD_GET, "", headersLoader)).execute();
    }

    public final OguryNetworkResponse put(String str, String str2, HeadersLoader headersLoader) {
        C10219ai.m31036b(str, "url");
        C10219ai.m31036b(str2, "body");
        C10219ai.m31036b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, "PUT", str2, headersLoader)).execute();
    }
}
