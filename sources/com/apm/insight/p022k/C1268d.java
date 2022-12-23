package com.apm.insight.p022k;

import android.content.Context;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.p019h.C1243b;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.p023l.C1312r;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1387r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.d */
public class C1268d {

    /* renamed from: a */
    private static volatile C1268d f1228a;

    /* renamed from: b */
    private volatile Context f1229b;

    private C1268d(Context context) {
        this.f1229b = context;
    }

    /* renamed from: a */
    public static C1268d m1648a() {
        if (f1228a == null) {
            f1228a = new C1268d(C1240h.m1558g());
        }
        return f1228a;
    }

    /* renamed from: a */
    public void mo12330a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String f = C1270e.m1677f();
                File file = new File(C1308o.m1830a(this.f1229b), C1308o.m1842c());
                C1298i.m1765a(file, file.getName(), f, jSONObject, C1270e.m1669b());
                if (C1270e.m1655a(f, jSONObject.toString()).mo12351a()) {
                    C1298i.m1777a(file);
                }
            } catch (Throwable th) {
                C1311q.m1877b(th);
            }
        }
    }

    /* renamed from: a */
    public void mo12331a(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C1270e.m1672c();
                int i = 0;
                File file = new File(C1308o.m1830a(this.f1229b), C1240h.m1543a(j, CrashType.ANR, false, false));
                C1298i.m1765a(file, file.getName(), c, jSONObject, C1270e.m1669b());
                if (!z) {
                    return;
                }
                if (!Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    C1312r.m1881a(jSONObject);
                    if (C1341a.m2053j()) {
                        HashMap<String, C1387r.C1388a> a = C1387r.m2273a(j, "anr_trace");
                        fileArr = new File[(a.size() + 2)];
                        for (Map.Entry next : a.entrySet()) {
                            if (!((String) next.getKey()).equals(C1285a.m1725c(this.f1229b))) {
                                fileArr[i] = C1308o.m1831a(this.f1229b, ((C1387r.C1388a) next.getValue()).f1466b);
                                i++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = C1308o.m1831a(this.f1229b, C1240h.m1557f());
                    fileArr[fileArr.length - 2] = C1387r.m2272a(j);
                    if (C1270e.m1657a(c, jSONObject.toString(), fileArr).mo12351a()) {
                        C1298i.m1777a(file);
                        if (!Npth.hasCrash()) {
                            C1298i.m1777a(C1308o.m1846e(C1240h.m1558g()));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo12332a(long j, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = C1270e.m1672c();
                File file = new File(C1308o.m1830a(this.f1229b), C1308o.m1834a(C1240h.m1556e()));
                C1298i.m1765a(file, file.getName(), c, jSONObject, C1270e.m1661a());
                jSONObject.put("upload_scene", "direct");
                C1312r.m1881a(jSONObject);
                if (!C1270e.m1666b(c, jSONObject.toString()).mo12351a()) {
                    return false;
                }
                C1298i.m1777a(file);
                return true;
            } catch (Throwable th) {
                C1311q.m1877b(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo12333a(JSONObject jSONObject, File file, File file2) {
        try {
            String g = C1270e.m1678g();
            C1312r.m1881a(jSONObject);
            return C1270e.m1657a(g, jSONObject.toString(), file, file2, C1387r.m2272a(System.currentTimeMillis()), new File(C1243b.m1576a())).mo12351a();
        } catch (Throwable th) {
            C1311q.m1877b(th);
            return false;
        }
    }

    /* renamed from: b */
    public void mo12334b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    String c = C1270e.m1672c();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C1270e.m1666b(c, jSONObject.toString());
                }
            });
        }
    }
}
