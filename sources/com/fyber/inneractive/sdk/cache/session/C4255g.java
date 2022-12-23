package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.cache.session.g */
public class C4255g implements Comparator<C4249e> {
    public C4255g(C4256h hVar) {
    }

    public int compare(Object obj, Object obj2) {
        C4249e eVar = (C4249e) obj;
        C4249e eVar2 = (C4249e) obj2;
        if (eVar == null || eVar2 == null) {
            return 0;
        }
        return eVar2.f10506d - eVar.f10506d > 0 ? 1 : -1;
    }
}
