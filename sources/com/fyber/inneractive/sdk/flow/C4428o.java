package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.o */
public class C4428o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f10949a;

    /* renamed from: b */
    public final /* synthetic */ InneractiveAdRequest f10950b;

    /* renamed from: c */
    public final /* synthetic */ C5291e f10951c;

    /* renamed from: d */
    public final /* synthetic */ C4423m f10952d;

    public C4428o(C4423m mVar, String str, InneractiveAdRequest inneractiveAdRequest, C5291e eVar) {
        this.f10952d = mVar;
        this.f10949a = str;
        this.f10950b = inneractiveAdRequest;
        this.f10951c = eVar;
    }

    public void run() {
        IAlog.m16699a("Firing Event 803 - Stack trace - %s", this.f10949a);
        C4565o oVar = C4565o.IA_AD_DESTROYED_WITHOUT_SHOW;
        InneractiveAdRequest inneractiveAdRequest = this.f10950b;
        C5291e eVar = this.f10951c;
        C4423m mVar = this.f10952d;
        JSONArray a = C4309s.m13530a(mVar.f10939h, mVar.f10936e);
        C4569q.C4570a aVar = new C4569q.C4570a(eVar);
        aVar.f11364b = oVar;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = a;
        JSONObject jSONObject = new JSONObject();
        String str = this.f10949a;
        try {
            jSONObject.put("stack_trace", str);
        } catch (Exception unused) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "stack_trace", str);
        }
        aVar.f11368f.put(jSONObject);
        aVar.mo24768a((String) null);
    }
}
