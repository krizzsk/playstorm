package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.j */
/* compiled from: SkipProxySelector */
class C2478j extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f5272a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f5273b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f5274c;

    /* renamed from: d */
    private final int f5275d;

    private C2478j(String str, int i) {
        this.f5274c = str;
        this.f5275d = i;
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (!this.f5274c.equalsIgnoreCase(uri.getHost()) || this.f5275d != uri.getPort()) ? this.f5273b.select(uri) : f5272a;
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f5273b.connectFailed(uri, socketAddress, iOException);
    }

    /* renamed from: a */
    static void m6037a(String str, int i) {
        ProxySelector.setDefault(new C2478j(str, i));
    }
}
