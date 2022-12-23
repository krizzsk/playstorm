package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.factories.c */
public final class C4400c {

    /* renamed from: a */
    public final Set<C4401a> f10859a = new HashSet();

    /* renamed from: com.fyber.inneractive.sdk.factories.c$a */
    public interface C4401a {
        /* renamed from: a */
        boolean mo24389a(InneractiveAdSpot inneractiveAdSpot);

        /* renamed from: b */
        C4455c mo24390b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.c$b */
    public static class C4402b {

        /* renamed from: a */
        public static C4400c f10860a = new C4400c();
    }

    /* renamed from: a */
    public C4455c mo24561a(InneractiveAdSpot inneractiveAdSpot) {
        for (C4401a next : this.f10859a) {
            if (next.mo24389a(inneractiveAdSpot)) {
                return next.mo24390b(inneractiveAdSpot);
            }
        }
        return null;
    }
}
