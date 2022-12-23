package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.b */
public class C4590b implements C4579u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f11403a;

    /* renamed from: b */
    public final /* synthetic */ long f11404b;

    public C4590b(String str, long j) {
        this.f11403a = str;
        this.f11404b = j;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16699a("Hit Request: Hitting URL finished: %s", this.f11403a);
        if (exc == null) {
            IAlog.m16699a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16699a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16699a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f11404b));
    }
}
