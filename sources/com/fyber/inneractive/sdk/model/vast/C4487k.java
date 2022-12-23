package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5388x0;
import com.smaato.sdk.video.vast.model.InLine;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.k */
public class C4487k extends C4481e {
    /* renamed from: c */
    public static C4487k m13866c(Node node) {
        C4487k kVar = new C4487k();
        super.mo24692b(node);
        C5388x0.m16808a(C5388x0.m16811d(node, InLine.AD_TITLE));
        C5388x0.m16808a(C5388x0.m16811d(node, InLine.DESCRIPTION));
        return kVar;
    }
}
