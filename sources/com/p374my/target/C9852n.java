package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9670e;
import java.util.Map;

/* renamed from: com.my.target.n */
public class C9852n extends C9670e.C9671a {

    /* renamed from: b */
    public final int f24356b;

    public C9852n(int i) {
        this.f24356b = i;
    }

    /* renamed from: a */
    public static C9670e m28752a(int i) {
        return new C9852n(i);
    }

    /* renamed from: c */
    public Map<String, String> mo63918c(C9596a aVar, Context context) {
        Map<String, String> c = super.mo63918c(aVar, context);
        c.put("duration", Integer.toString(this.f24356b));
        return c;
    }
}
