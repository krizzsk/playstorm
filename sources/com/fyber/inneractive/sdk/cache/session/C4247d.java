package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.d */
public class C4247d {

    /* renamed from: a */
    public C4253f f10498a = new C4253f();

    /* renamed from: b */
    public HashMap<C4251b, C4256h> f10499b;

    /* renamed from: c */
    public final Object f10500c = new Object();

    /* renamed from: d */
    public final Object f10501d = new Object();

    /* renamed from: e */
    public C4248a f10502e;

    /* renamed from: com.fyber.inneractive.sdk.cache.session.d$a */
    public interface C4248a {
        /* renamed from: a */
        void mo24253a(C4247d dVar, boolean z, JSONObject jSONObject);
    }

    public C4247d(int i, C4248a aVar) {
        this.f10499b = new C4243a(this, i);
        this.f10502e = null;
    }

    /* renamed from: a */
    public static JSONObject m13418a(C4247d dVar) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", dVar.f10498a.mo24255a());
            for (Map.Entry next : dVar.f10499b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                C4251b bVar = (C4251b) next.getKey();
                Iterator it = ((PriorityQueue) next.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C4249e) it.next()).mo24254a(true, true));
                }
                jSONObject.put(bVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo24251a(C4251b bVar, C4249e eVar) {
        synchronized (this.f10501d) {
            C4256h hVar = this.f10499b.get(bVar);
            if (hVar != null) {
                hVar.add(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo24252a(C4253f fVar) {
        C4249e eVar;
        for (C4251b bVar : C4251b.values()) {
            if (!(bVar == C4251b.NONE || (eVar = fVar.f10523a.get(bVar)) == null || eVar.f10503a == 0)) {
                mo24251a(bVar, eVar);
            }
        }
    }

    /* renamed from: a */
    public int mo24250a() {
        int i;
        C4310h hVar = IAConfigManager.f10525J.f10557v.f10660b;
        String num = Integer.toString(5);
        if (hVar.f10657a.containsKey("number_of_sessions")) {
            num = hVar.f10657a.get("number_of_sessions");
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
            i = 5;
        }
        if (i < 0) {
            return 5;
        }
        return i;
    }
}
