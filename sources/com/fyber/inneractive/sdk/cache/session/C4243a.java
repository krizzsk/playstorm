package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.cache.session.a */
public class C4243a extends HashMap<C4251b, C4256h> {

    /* renamed from: a */
    public final /* synthetic */ int f10491a;

    public C4243a(C4247d dVar, int i) {
        this.f10491a = i;
        for (C4251b bVar : C4251b.values()) {
            if (bVar != C4251b.NONE) {
                put(bVar, new C4256h(this.f10491a));
            }
        }
    }
}
