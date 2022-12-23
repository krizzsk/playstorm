package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.o */
public class C4517o extends C4503b {
    public C4517o(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        Map<String, String> map = this.f11163b;
        this.f11164c.setOrientationProperties(map == null || !map.containsKey("allowOrientationChange") || !"false".equals(this.f11163b.get("allowOrientationChange")), this.f11163b.get("forceOrientation"));
    }

    /* renamed from: b */
    public boolean mo24706b() {
        return false;
    }
}
