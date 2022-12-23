package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.network.C4579u;

/* renamed from: com.fyber.inneractive.sdk.util.o */
public class C5361o implements C4579u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f14228a;

    /* renamed from: b */
    public final /* synthetic */ long f14229b;

    public C5361o(String str, long j) {
        this.f14228a = str;
        this.f14229b = j;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16699a("Hit Request: Hitting URL finished: %s", this.f14228a);
        if (exc == null) {
            IAlog.m16699a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16699a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16699a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f14229b));
    }
}
