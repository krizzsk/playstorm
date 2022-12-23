package com.apm.insight.p013d;

import com.apm.insight.C1223f;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.p022k.C1268d;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.p024a.C1352f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.d.a */
public class C1209a {
    /* renamed from: a */
    public static void m1363a(String str) {
        m1364a(str, (Map<? extends String, ? extends String>) null, (Map<String, String>) null, (C1223f) null);
    }

    /* renamed from: a */
    public static void m1364a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1223f fVar) {
        m1365a(str, map, map2, (Map<String, String>) null, fVar);
    }

    /* renamed from: a */
    public static void m1365a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C1223f fVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            final String str2 = str;
            final Map<? extends String, ? extends String> map4 = map;
            final Map<String, String> map5 = map2;
            final Map<String, String> map6 = map3;
            final C1223f fVar2 = fVar;
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    boolean z;
                    try {
                        C1217a a = C1352f.m2138a().mo12477a(CrashType.DART, C1217a.m1407a(currentTimeMillis, C1240h.m1558g(), str2));
                        if (map4 != null) {
                            JSONObject optJSONObject = a.mo12265h().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            C1217a.m1411a(optJSONObject, (Map<? extends String, ? extends String>) map4);
                            a.mo12251a("custom", (Object) optJSONObject);
                        }
                        if (map5 != null) {
                            JSONObject optJSONObject2 = a.mo12265h().optJSONObject("custom_long");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            C1217a.m1411a(optJSONObject2, (Map<? extends String, ? extends String>) map5);
                            a.mo12251a("custom_long", (Object) optJSONObject2);
                        }
                        if (map6 != null) {
                            JSONObject optJSONObject3 = a.mo12265h().optJSONObject("filters");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new JSONObject();
                                a.mo12251a("filters", (Object) optJSONObject3);
                            }
                            C1217a.m1411a(optJSONObject3, (Map<? extends String, ? extends String>) map6);
                        }
                        z = C1268d.m1648a().mo12332a(currentTimeMillis, a.mo12265h());
                    } catch (Throwable unused) {
                        z = false;
                    }
                    C1223f fVar = fVar2;
                    if (fVar != null) {
                        try {
                            fVar.mo12282a(z);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
