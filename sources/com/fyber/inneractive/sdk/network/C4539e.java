package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.network.e */
public class C4539e implements C4579u<String> {

    /* renamed from: a */
    public final /* synthetic */ String f11220a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f11221b;

    /* renamed from: c */
    public final /* synthetic */ long f11222c;

    public C4539e(C4534c cVar, String str, JSONArray jSONArray, long j) {
        this.f11220a = str;
        this.f11221b = jSONArray;
        this.f11222c = j;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m16699a("Event Request: Hitting URL finished: %s, body: %s", this.f11220a, this.f11221b);
        if (exc == null) {
            IAlog.m16699a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m16699a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.m16699a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f11222c));
    }
}
