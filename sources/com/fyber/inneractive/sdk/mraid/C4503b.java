package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.b */
public abstract class C4503b {

    /* renamed from: a */
    public String f11162a;

    /* renamed from: b */
    public Map<String, String> f11163b;

    /* renamed from: c */
    public C5407d f11164c;

    /* renamed from: d */
    public C5364p0 f11165d;

    public C4503b(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        this.f11163b = map;
        this.f11165d = p0Var;
        this.f11164c = dVar;
    }

    /* renamed from: a */
    public int mo24709a(String str) {
        String str2 = this.f11163b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public abstract void mo24710a();

    /* renamed from: b */
    public abstract boolean mo24706b();
}
