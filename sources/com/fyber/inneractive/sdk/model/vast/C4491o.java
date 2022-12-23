package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5388x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.o */
public class C4491o {

    /* renamed from: a */
    public String f11125a;

    /* renamed from: b */
    public List<C4480d> f11126b;

    /* renamed from: a */
    public static C4491o m13868a(Node node) {
        C4480d dVar;
        C4491o oVar = new C4491o();
        oVar.f11125a = C5388x0.m16809b(node, "version");
        ArrayList arrayList = (ArrayList) C5388x0.m16810c(node, "Ad");
        if (!arrayList.isEmpty()) {
            oVar.f11126b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    dVar = null;
                } else {
                    C4480d dVar2 = new C4480d();
                    dVar2.f11077a = C5388x0.m16809b(node2, "id");
                    Node d = C5388x0.m16811d(node2, "Wrapper");
                    if (d != null) {
                        dVar2.f11078b = C4496s.m13874c(d);
                    }
                    Node d2 = C5388x0.m16811d(node2, "InLine");
                    if (d2 != null) {
                        dVar2.f11079c = C4487k.m13866c(d2);
                    }
                    dVar = dVar2;
                }
                oVar.f11126b.add(dVar);
            }
        }
        return oVar;
    }

    public String toString() {
        return new StringBuilder("Vast: version - " + this.f11125a + "\nAds: ").toString();
    }
}
