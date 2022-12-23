package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p189dv.C4350a;
import com.fyber.inneractive.sdk.p189dv.C4363f;
import com.fyber.inneractive.sdk.p189dv.interstitial.C4371a;
import com.fyber.inneractive.sdk.response.C5291e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.a */
public abstract class C4170a<T> extends C4350a<T> {

    /* renamed from: j */
    public C4371a f10317j = null;

    public C4170a(C4346z zVar, C4309s sVar, C4363f fVar) {
        super(zVar, sVar, fVar);
    }

    /* renamed from: a */
    public abstract void mo23831a(C4371a aVar, Activity activity);

    /* renamed from: f */
    public void mo23832f() {
        try {
            new C4569q.C4570a(C4567p.EVENT_READY_ON_CLIENT, this.f10913a, (C5291e) (C4363f) this.f10914b, (JSONArray) null).mo24768a((String) null);
        } catch (Exception unused) {
        }
    }
}
