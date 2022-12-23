package com.unity3d.player;

import java.util.concurrent.atomic.AtomicReference;

public class GoogleVrApi {

    /* renamed from: a */
    private static AtomicReference f28976a = new AtomicReference();

    private GoogleVrApi() {
    }

    /* renamed from: a */
    static void m34433a() {
        f28976a.set((Object) null);
    }

    /* renamed from: a */
    static void m34434a(C11921f fVar) {
        f28976a.compareAndSet((Object) null, new GoogleVrProxy(fVar));
    }

    /* renamed from: b */
    static GoogleVrProxy m34435b() {
        return (GoogleVrProxy) f28976a.get();
    }

    public static GoogleVrVideo getGoogleVrVideo() {
        return (GoogleVrVideo) f28976a.get();
    }
}
