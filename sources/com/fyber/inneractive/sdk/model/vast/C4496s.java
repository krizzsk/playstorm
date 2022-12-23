package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5388x0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.s */
public class C4496s extends C4481e {

    /* renamed from: e */
    public String f11153e;

    /* renamed from: c */
    public static C4496s m13874c(Node node) {
        C4496s sVar = new C4496s();
        super.mo24692b(node);
        sVar.f11153e = C5388x0.m16808a(C5388x0.m16811d(node, "VASTAdTagURI"));
        return sVar;
    }
}
