package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.bidder.C4209a;
import com.fyber.inneractive.sdk.cache.session.C4246c;
import com.fyber.inneractive.sdk.cache.session.C4247d;
import com.fyber.inneractive.sdk.cache.session.C4249e;
import com.fyber.inneractive.sdk.cache.session.C4255g;
import com.fyber.inneractive.sdk.cache.session.C4256h;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5357n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.d0 */
public class C4271d0 implements C4274e0 {

    /* renamed from: a */
    public C4247d f10601a;

    /* renamed from: b */
    public final Map<UnitDisplayType, Map<String, String>> f10602b = new HashMap();

    /* renamed from: c */
    public final Map<String, String> f10603c = new HashMap();

    /* renamed from: d */
    public C4272a f10604d;

    /* renamed from: e */
    public boolean f10605e = false;

    /* renamed from: com.fyber.inneractive.sdk.config.d0$a */
    public interface C4272a {
    }

    /* renamed from: a */
    public String mo24283a(UnitDisplayType unitDisplayType, String str) {
        Map map = this.f10602b.get(unitDisplayType);
        if (map == null || map.get(str) == null) {
            return "";
        }
        return (String) map.get(str);
    }

    /* renamed from: a */
    public void mo24287a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = this.f10602b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f10602b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        C4272a aVar = this.f10604d;
        if (aVar != null && this.f10605e) {
            ((C4209a) aVar).mo24091b();
        }
    }

    /* renamed from: a */
    public JSONArray mo24284a(UnitDisplayType unitDisplayType) {
        String str;
        C4247d dVar = this.f10601a;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4251b bVar : C4251b.values()) {
                if (bVar != C4251b.NONE && (unitDisplayType == null || bVar.f10520a == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f10520a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject.put("subType", str);
                    C4256h hVar = dVar.f10499b.get(bVar);
                    int a = dVar.mo24250a();
                    if (a > 0 && hVar != null && hVar.size() >= a) {
                        boolean z = bVar.f10521b;
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = new ArrayList(hVar);
                        Collections.sort(arrayList, new C4255g(hVar));
                        Iterator it = arrayList.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((C4249e) it.next()).mo24254a(false, z));
                            i++;
                            if (i >= a) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return jSONArray;
        }
    }

    /* renamed from: a */
    public void mo24285a(C4251b bVar, C4250a aVar) {
        C4247d dVar = this.f10601a;
        if (dVar != null) {
            C5357n.m16773a(new C4246c(dVar, aVar, bVar));
        }
    }

    /* renamed from: a */
    public void mo24288a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String a : strArr) {
            mo24287a(unitDisplayType, a, "0");
        }
    }

    /* renamed from: a */
    public void mo24286a(C4272a aVar) {
        this.f10604d = aVar;
    }
}
