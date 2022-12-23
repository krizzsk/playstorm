package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.C1561a;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: a */
    private static AppLovinCommunicator f1508a;

    /* renamed from: b */
    private static final Object f1509b = new Object();

    /* renamed from: c */
    private C1959m f1510c;

    /* renamed from: d */
    private C2092v f1511d;

    /* renamed from: e */
    private final C1561a f1512e;

    /* renamed from: f */
    private final MessagingServiceImpl f1513f;

    private AppLovinCommunicator(Context context) {
        this.f1512e = new C1561a(context);
        this.f1513f = new MessagingServiceImpl(context);
    }

    /* renamed from: a */
    private void m2328a(String str) {
        C2092v vVar = this.f1511d;
        if (vVar != null) {
            vVar.mo14789b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f1509b) {
            if (f1508a == null) {
                f1508a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f1508a;
    }

    /* renamed from: a */
    public void mo12593a(C1959m mVar) {
        this.f1510c = mVar;
        this.f1511d = mVar.mo14286A();
        if (C2092v.m5047a()) {
            m2328a("Attached SDK instance: " + mVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f1513f;
    }

    public boolean hasSubscriber(String str) {
        return this.f1512e.mo13049a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f1510c.mo14334ag().mo14265a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (this.f1512e.mo13048a(appLovinCommunicatorSubscriber, next)) {
                this.f1513f.maybeFlushStickyMessages(next);
            } else if (C2092v.m5047a()) {
                m2328a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f1510c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (C2092v.m5047a()) {
                m2328a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            }
            this.f1512e.mo13050b(appLovinCommunicatorSubscriber, next);
        }
    }
}
