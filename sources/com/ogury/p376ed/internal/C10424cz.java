package com.ogury.p376ed.internal;

import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.cz */
public final class C10424cz {

    /* renamed from: a */
    public static final C10424cz f26365a = new C10424cz();

    /* renamed from: b */
    private static OguryEventBuses f26366b;

    private C10424cz() {
    }

    /* renamed from: a */
    public static void m31536a(OguryEventBuses oguryEventBuses) {
        f26366b = oguryEventBuses;
    }

    /* renamed from: a */
    public static OguryEventCallback m31534a(C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(ljVar, "consentDoneAction");
        OguryEventBuses oguryEventBuses = f26366b;
        OguryEventBus persistentMessage = oguryEventBuses == null ? null : oguryEventBuses.getPersistentMessage();
        if (persistentMessage == null) {
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] Consent sync not available");
            ljVar.mo67074a();
            return null;
        }
        OguryEventCallback a = m31535a(ljVar, persistentMessage);
        OguryIntegrationLogger.m30996d("[Ads][EvenBus] Register to consent status");
        persistentMessage.register("CM-status", a);
        return a;
    }

    /* renamed from: b */
    public static OguryEventCallback m31540b(C10729lj<C10684ke> ljVar) {
        C10765mq.m32773b(ljVar, "consentChangedAction");
        OguryEventBuses oguryEventBuses = f26366b;
        OguryEventBus broadcast = oguryEventBuses == null ? null : oguryEventBuses.getBroadcast();
        if (broadcast == null) {
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] Impossible to register to consent changes");
            return null;
        }
        OguryEventCallback c = m31542c(ljVar);
        OguryIntegrationLogger.m30996d("[Ads][EvenBus] Register to consent changes");
        broadcast.register("CM-consent-change", c);
        return c;
    }

    /* renamed from: com.ogury.ed.internal.cz$a */
    public static final class C10425a implements OguryEventCallback {

        /* renamed from: a */
        final /* synthetic */ C10729lj<C10684ke> f26367a;

        /* renamed from: b */
        final /* synthetic */ OguryEventBus f26368b;

        C10425a(C10729lj<C10684ke> ljVar, OguryEventBus oguryEventBus) {
            this.f26367a = ljVar;
            this.f26368b = oguryEventBus;
        }

        public final void onNewEvent(String str, String str2, long j) {
            C10765mq.m32773b(str, "event");
            C10765mq.m32773b(str2, "message");
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
            if (!C10765mq.m32772a((Object) str2, (Object) "COMPLETE") && !C10765mq.m32772a((Object) str2, (Object) "UNKNOWN") && !C10765mq.m32772a((Object) str2, (Object) "ERROR")) {
                C10424cz czVar = C10424cz.f26365a;
                if (!C10424cz.m31541b(j)) {
                    return;
                }
            }
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] Consent synced");
            this.f26367a.mo67074a();
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] Unregister from consent status");
            this.f26368b.unregister(str, this);
        }
    }

    /* renamed from: a */
    private static OguryEventCallback m31535a(C10729lj<C10684ke> ljVar, OguryEventBus oguryEventBus) {
        return new C10425a(ljVar, oguryEventBus);
    }

    /* renamed from: c */
    private static OguryEventCallback m31542c(C10729lj<C10684ke> ljVar) {
        return new OguryEventCallback() {
            public final void onNewEvent(String str, String str2, long j) {
                C10424cz.m31538a(C10729lj.this, str, str2, j);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31538a(C10729lj ljVar, String str, String str2, long j) {
        C10765mq.m32773b(ljVar, "$consentChangedAction");
        OguryIntegrationLogger.m30996d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
        ljVar.mo67074a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m31541b(long j) {
        return j < System.currentTimeMillis() - 30000;
    }

    /* renamed from: a */
    public static void m31537a(OguryEventCallback oguryEventCallback) {
        OguryEventBus persistentMessage;
        if (oguryEventCallback != null) {
            OguryIntegrationLogger.m30996d("[Ads][EvenBus] Unregister from consent status");
            OguryEventBuses oguryEventBuses = f26366b;
            if (oguryEventBuses != null && (persistentMessage = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage.unregister("CM-status", oguryEventCallback);
            }
        }
    }
}
