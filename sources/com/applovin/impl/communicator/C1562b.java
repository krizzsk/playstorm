package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C2092v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.b */
public class C1562b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private boolean f1989a = true;

    /* renamed from: b */
    private final String f1990b;

    /* renamed from: c */
    private final WeakReference<AppLovinCommunicatorSubscriber> f1991c;

    /* renamed from: d */
    private final Set<CommunicatorMessageImpl> f1992d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f1993e = new Object();

    C1562b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f1990b = str;
        this.f1991c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public String mo13051a() {
        return this.f1990b;
    }

    /* renamed from: a */
    public void mo13052a(boolean z) {
        this.f1989a = z;
    }

    /* renamed from: b */
    public AppLovinCommunicatorSubscriber mo13053b() {
        return (AppLovinCommunicatorSubscriber) this.f1991c.get();
    }

    /* renamed from: c */
    public boolean mo13054c() {
        return this.f1989a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1562b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f1991c.get();
        C1562b bVar = (C1562b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) bVar.f1991c.get();
        if (mo13051a().equals(bVar.mo13051a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f1990b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f1991c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (mo13053b() != null) {
            CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
            boolean z = false;
            synchronized (this.f1993e) {
                if (!this.f1992d.contains(communicatorMessageImpl)) {
                    this.f1992d.add(communicatorMessageImpl);
                    z = true;
                }
            }
            if (z) {
                mo13053b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
            }
        } else if (C2092v.m5047a()) {
            C2092v.m5053i("AppLovinCommunicator", "Message received for GC'd subscriber");
        }
    }
}
