package com.p374my.target;

import android.content.Context;

/* renamed from: com.my.target.d0 */
public class C9654d0 extends C9653d<C10029x2> {
    /* renamed from: a */
    public static C9654d0 m27808a() {
        return new C9654d0();
    }

    /* renamed from: a */
    public C10029x2 mo63851a(C10029x2 x2Var, C9596a aVar, Context context) {
        C9821l2 c = x2Var.mo65699c();
        if (c == null) {
            C9839m2 b = x2Var.mo65294b();
            if (b == null || !b.mo64724b()) {
                return null;
            }
            return x2Var;
        }
        C9894p1 adChoices = c.getAdChoices();
        if (adChoices == null) {
            return x2Var;
        }
        C9807k8.m28508a(adChoices.mo65194c()).mo64623c(context);
        return x2Var;
    }
}
