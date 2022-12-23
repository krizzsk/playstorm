package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.metrics.C4470a;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5370s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.a */
public class C4403a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InneractiveError f10861a;

    /* renamed from: b */
    public final /* synthetic */ C4405b f10862b;

    public C4403a(C4405b bVar, InneractiveError inneractiveError) {
        this.f10862b = bVar;
        this.f10861a = inneractiveError;
    }

    public void run() {
        String str;
        String str2;
        T t = this.f10862b.f10867b;
        if (t != null && (str = t.f14073h) != null) {
            Map<String, String> map = t.f14081p;
            if (map != null || t.f14082q != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f10525J;
                C4310h hVar = iAConfigManager.f10557v.f10660b;
                String str3 = C4405b.f10865e;
                if (hVar.f10657a.containsKey("max_failed_creatives_interval_hours")) {
                    str3 = hVar.f10657a.get("max_failed_creatives_interval_hours");
                }
                C4310h hVar2 = iAConfigManager.f10557v.f10660b;
                String str4 = C4405b.f10866f;
                if (hVar2.f10657a.containsKey("max_failed_creatives_per_interval")) {
                    str4 = hVar2.f10657a.get("max_failed_creatives_per_interval");
                }
                int a = C5370s.m16783a(str3, 24);
                int a2 = C5370s.m16783a(str4, 1);
                Application application = C5350l.f14216a;
                if (application != null) {
                    SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
                    } catch (JSONException unused) {
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    C4405b bVar = this.f10862b;
                    bVar.getClass();
                    if (IAConfigManager.f10525J.f10557v.f10660b.mo24347a(bVar.f11032a, false) && !C4470a.m13823a(a, a2, jSONArray, copyOnWriteArrayList)) {
                        copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                        if (map != null) {
                            try {
                                str2 = new JSONObject(map).toString();
                            } catch (Throwable unused2) {
                                str2 = "";
                            }
                        } else {
                            str2 = this.f10862b.f10867b.f14082q;
                        }
                        C4405b bVar2 = this.f10862b;
                        InneractiveAdRequest inneractiveAdRequest = bVar2.f10868c;
                        T t2 = bVar2.f10867b;
                        InneractiveError inneractiveError = this.f10861a;
                        JSONArray jSONArray2 = bVar2.f10869d;
                        C4567p pVar = C4567p.IA_AD_FAILURE_DATA;
                        C4569q.C4570a aVar = new C4569q.C4570a(t2);
                        aVar.f11365c = pVar;
                        aVar.f11363a = inneractiveAdRequest;
                        aVar.f11366d = jSONArray2;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("raw_response", str);
                        } catch (Exception unused3) {
                            IAlog.m16703e("Got exception adding param to json object: %s, %s", "raw_response", str);
                        }
                        try {
                            jSONObject.put("headers", str2);
                        } catch (Exception unused4) {
                            IAlog.m16703e("Got exception adding param to json object: %s, %s", "headers", str2);
                        }
                        String description = inneractiveError.description();
                        try {
                            jSONObject.put("error_code", description);
                        } catch (Exception unused5) {
                            IAlog.m16703e("Got exception adding param to json object: %s, %s", "error_code", description);
                        }
                        aVar.f11368f.put(jSONObject);
                        aVar.mo24768a((String) null);
                    }
                    sharedPreferences.edit().putString("lt", new JSONArray(copyOnWriteArrayList).toString()).apply();
                }
            }
        }
    }
}
