package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.r */
public class C4574r {
    /* renamed from: a */
    public static void m14050a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, C5291e eVar) {
        C4567p pVar = C4567p.CAUGHT_EXCEPTION;
        C4569q.C4570a aVar = new C4569q.C4570a(eVar);
        aVar.f11365c = pVar;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "description", str2);
        }
        aVar.f11368f.put(jSONObject);
        aVar.mo24768a((String) null);
    }

    /* renamed from: a */
    public static void m14051a(Throwable th, InneractiveAdRequest inneractiveAdRequest, C5291e eVar) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        C4567p pVar = C4567p.CAUGHT_EXCEPTION;
        C4569q.C4570a aVar = new C4569q.C4570a(eVar);
        aVar.f11365c = pVar;
        aVar.f11363a = inneractiveAdRequest;
        aVar.f11366d = null;
        JSONObject jSONObject = new JSONObject();
        String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (Exception unused) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", stringBuffer);
        } catch (Exception unused3) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "stack_trace", stringBuffer);
        }
        aVar.f11368f.put(jSONObject);
        aVar.mo24768a((String) null);
    }
}
