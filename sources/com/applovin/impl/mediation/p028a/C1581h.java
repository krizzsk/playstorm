package com.applovin.impl.mediation.p028a;

import com.applovin.impl.sdk.C1959m;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.h */
public class C1581h extends C1578f {
    public C1581h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
    }

    /* renamed from: a */
    public boolean mo13133a() {
        return mo13233b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    public String toString() {
        return "SignalProviderSpec{adObject=" + mo13206J() + '}';
    }
}
