package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.l */
public class C4514l extends C4501a {
    public C4514l(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: d */
    public void mo24708d() {
        C5407d dVar = this.f11164c;
        if (dVar != null) {
            dVar.mo26545a(C4508f.OPEN, "No native click was detected in a timely fashion");
        }
    }

    /* renamed from: a */
    public void mo24710a() {
        C5320d0.C5321a aVar;
        String str;
        String str2;
        String str3 = this.f11163b.get("url");
        IAlog.m16702d("IAmraidActionOpen: opening Internal Browser For Url: %s", str3);
        C5407d dVar = this.f11164c;
        if (dVar != null) {
            C5364p0 p0Var = this.f11165d;
            L l = dVar.f14285g;
            if (l != null) {
                aVar = ((C5407d.C5413f) l).mo24961a(str3, p0Var);
            } else {
                C5320d0.C5323c cVar = C5320d0.C5323c.FAILED;
                Exception exc = new Exception("No webview listener available");
                if (dVar.mo26554g() == null) {
                    str2 = "null";
                } else {
                    str2 = dVar.mo26554g().getClass().getName();
                }
                aVar = new C5320d0.C5321a(cVar, exc, str2);
            }
            if (aVar.f14158a == C5320d0.C5323c.FAILED) {
                C5407d dVar2 = this.f11164c;
                C4508f fVar = C4508f.OPEN;
                Throwable th = aVar.f14159b;
                if (th == null) {
                    str = "unknown error";
                } else {
                    str = th.getMessage();
                }
                dVar2.mo26545a(fVar, str);
            }
        }
    }

    /* renamed from: c */
    public String mo24707c() {
        return this.f11163b.get("url");
    }
}
