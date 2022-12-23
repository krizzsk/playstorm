package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.p192ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.m */
public class C4515m extends C4501a {
    public C4515m(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        String str = this.f11163b.get("uri");
        if (str == null || "".equals(str)) {
            this.f11164c.mo26545a(C4508f.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        L l = ((IAmraidWebViewController) this.f11164c).f14285g;
        if (l != null) {
            ((C5407d.C5413f) l).mo24969a(str);
        }
    }

    /* renamed from: c */
    public String mo24707c() {
        return this.f11163b.get("uri");
    }
}
