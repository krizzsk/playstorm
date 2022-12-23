package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.AudioData;
import java.util.Iterator;

/* renamed from: com.my.target.k */
public class C9788k extends C9653d<C9945s2> {
    /* renamed from: a */
    public static C9788k m28416a() {
        return new C9788k();
    }

    /* renamed from: a */
    public C9945s2 mo63851a(C9945s2 s2Var, C9596a aVar, Context context) {
        Iterator<C9984u2<AudioData>> it = s2Var.mo65356c().iterator();
        while (it.hasNext()) {
            it.next().mo65533c();
        }
        return s2Var;
    }
}
