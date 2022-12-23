package com.ogury.core.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OguryPersistentMessageEventBus.kt */
public final class OguryPersistentMessageEventBus implements OguryEventBus {
    public static final C10202a Companion = new C10202a((byte) 0);
    private static final String UNKNOWN_MESSAGE = "UNKNOWN";
    private final OguryBroadcastEventBus broadcastEventBus;
    private final Map<String, C10205aa> lastEventsMap;

    public OguryPersistentMessageEventBus() {
        this((OguryBroadcastEventBus) null, 1, (C10218ah) null);
    }

    public OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus) {
        C10219ai.m31036b(oguryBroadcastEventBus, "broadcastEventBus");
        this.broadcastEventBus = oguryBroadcastEventBus;
        this.lastEventsMap = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus, int i, C10218ah ahVar) {
        this((i & 1) != 0 ? new OguryBroadcastEventBus() : oguryBroadcastEventBus);
    }

    /* renamed from: com.ogury.core.internal.OguryPersistentMessageEventBus$a */
    /* compiled from: OguryPersistentMessageEventBus.kt */
    public static final class C10202a {
        private C10202a() {
        }

        public /* synthetic */ C10202a(byte b) {
            this();
        }
    }

    public final void dispatch(String str, String str2) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(str2, "message");
        Map<String, C10205aa> map = this.lastEventsMap;
        C10219ai.m31034a((Object) map, "lastEventsMap");
        map.put(str, new C10205aa(str2, 0, 2));
        this.broadcastEventBus.dispatch(str, str2);
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(oguryEventCallback, "callback");
        this.broadcastEventBus.register(str, oguryEventCallback);
        C10205aa aaVar = this.lastEventsMap.get(str);
        if (aaVar == null) {
            aaVar = new C10205aa(UNKNOWN_MESSAGE, 0, 2);
        }
        oguryEventCallback.onNewEvent(str, aaVar.mo66759a(), aaVar.mo66760b());
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C10219ai.m31036b(str, "event");
        C10219ai.m31036b(oguryEventCallback, "callback");
        this.broadcastEventBus.unregister(str, oguryEventCallback);
    }
}
