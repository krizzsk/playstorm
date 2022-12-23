package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.sdk.x */
class C2095x {

    /* renamed from: a */
    private final Queue<AppLovinAdImpl> f4107a = new LinkedList();

    /* renamed from: b */
    private final Object f4108b = new Object();

    C2095x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo14797a() {
        int size;
        synchronized (this.f4108b) {
            size = this.f4107a.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14798a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f4108b) {
            if (mo14797a() <= 25) {
                this.f4107a.offer(appLovinAdImpl);
            } else if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14799b() {
        boolean z;
        synchronized (this.f4108b) {
            z = mo14797a() == 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AppLovinAdImpl mo14800c() {
        AppLovinAdImpl poll;
        synchronized (this.f4108b) {
            poll = !mo14799b() ? this.f4107a.poll() : null;
        }
        return poll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AppLovinAdImpl mo14801d() {
        AppLovinAdImpl peek;
        synchronized (this.f4108b) {
            peek = this.f4107a.peek();
        }
        return peek;
    }
}
