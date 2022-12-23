package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5388x0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.p */
public class C4492p {

    /* renamed from: a */
    public String f11127a;

    /* renamed from: b */
    public String f11128b;

    /* renamed from: a */
    public static C4492p m13869a(Node node) {
        if (node == null) {
            return null;
        }
        C4492p pVar = new C4492p();
        pVar.f11127a = C5388x0.m16809b(node, "event");
        pVar.f11128b = C5388x0.m16808a(node);
        return pVar;
    }

    public String toString() {
        return "VTracking: " + " name:" + this.f11127a + " url:" + this.f11128b;
    }
}
