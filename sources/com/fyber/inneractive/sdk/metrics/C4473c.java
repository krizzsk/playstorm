package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.c */
public class C4473c {

    /* renamed from: c */
    public static final C4473c f11045c = new C4473c();

    /* renamed from: a */
    public final Map<String, C4476f> f11046a = new HashMap();

    /* renamed from: b */
    public final C4476f f11047b = new C4475e();

    /* renamed from: a */
    public C4476f mo24671a(String str) {
        if (str == null) {
            try {
                return this.f11047b;
            } catch (Exception unused) {
                return this.f11047b;
            }
        } else {
            C4476f fVar = this.f11046a.get(str);
            if (fVar != null) {
                return fVar;
            }
            C4474d dVar = new C4474d();
            this.f11046a.put(str, dVar);
            return dVar;
        }
    }
}
