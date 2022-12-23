package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.interfaces.C4452a;
import com.fyber.inneractive.sdk.response.C5287a;
import com.fyber.inneractive.sdk.response.C5288b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.factories.b */
public final class C4397b {

    /* renamed from: a */
    public final HashMap<C5287a, C4399b> f10857a = new HashMap<>();

    /* renamed from: com.fyber.inneractive.sdk.factories.b$a */
    public static class C4398a {

        /* renamed from: a */
        public static C4397b f10858a = new C4397b();
    }

    /* renamed from: com.fyber.inneractive.sdk.factories.b$b */
    public interface C4399b {
        /* renamed from: a */
        C4452a mo24387a();

        /* renamed from: b */
        C5288b mo24388b();
    }

    /* renamed from: a */
    public C5288b mo24559a(C5287a aVar) {
        C4399b bVar = this.f10857a.get(aVar);
        if (bVar != null) {
            return bVar.mo24388b();
        }
        return null;
    }

    /* renamed from: a */
    public void mo24560a(C5287a aVar, C4399b bVar) {
        if (this.f10857a.containsKey(aVar)) {
            IAlog.m16703e("Handler already exists for ad type %s! : %s", aVar, this.f10857a.get(aVar));
            return;
        }
        this.f10857a.put(aVar, bVar);
    }
}
