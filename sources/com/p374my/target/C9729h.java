package com.p374my.target;

import android.content.Context;
import com.p374my.target.common.models.VideoData;
import java.util.Iterator;

/* renamed from: com.my.target.h */
public class C9729h extends C9653d<C9930r2> {
    /* renamed from: a */
    public static C9729h m28112a() {
        return new C9729h();
    }

    /* renamed from: a */
    public C9930r2 mo63851a(C9930r2 r2Var, C9596a aVar, Context context) {
        Iterator<C9984u2<VideoData>> it = r2Var.mo65322c().iterator();
        while (it.hasNext()) {
            it.next().mo65533c();
        }
        return r2Var;
    }
}
