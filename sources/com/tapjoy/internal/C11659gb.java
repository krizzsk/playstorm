package com.tapjoy.internal;

import com.tapjoy.internal.C11683gm;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gb */
public final class C11659gb extends C11683gm {

    /* renamed from: a */
    static final Map<String, String> f28349a = Collections.unmodifiableMap(new HashMap());

    /* renamed from: c */
    private final C11683gm.C11684a f28350c = mo72576a("BuildConfig");

    /* renamed from: d */
    private final C11683gm.C11684a f28351d = mo72576a("ServerFinal");

    /* renamed from: e */
    private final C11683gm.C11684a f28352e;

    /* renamed from: f */
    private final C11683gm.C11684a f28353f;

    /* renamed from: g */
    private final C11683gm.C11684a f28354g;

    C11659gb() {
        C11683gm.C11684a a = mo72576a("AppRuntime");
        this.f28352e = a;
        a.f28434b = new ConcurrentHashMap();
        this.f28353f = mo72576a("ConnectFlags");
        this.f28354g = mo72576a("ServerDefault");
        C11683gm.C11684a a2 = mo72576a("SDKDefault");
        HashMap hashMap = new HashMap();
        hashMap.put("placement_request_content_retry_timeout", -1);
        hashMap.put("placement_request_content_retry_backoff", Arrays.asList(new Number[]{0L, 500L, 10000L, Double.valueOf(2.0d)}));
        a2.f28434b = hashMap;
    }

    /* renamed from: a */
    public final void mo72535a(@Nullable Map map) {
        Map<String, Object> map2;
        Map<String, Object> map3 = null;
        if (map != null) {
            map3 = (Map) map.get("final");
            map2 = (Map) map.get("default");
        } else {
            map2 = null;
        }
        this.f28351d.f28434b = map3;
        this.f28354g.f28434b = map2;
        setChanged();
    }

    /* renamed from: a */
    public final void mo72534a(Hashtable<String, ?> hashtable) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : hashtable.entrySet()) {
            String str = f28349a.get(next.getKey());
            if (str == null) {
                str = (String) next.getKey();
            }
            this.f28352e.f28434b.remove(str);
            hashMap.put(str, next.getValue());
        }
        this.f28353f.f28434b = hashMap;
        setChanged();
    }
}
