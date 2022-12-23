package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.C1229g;
import com.apm.insight.CrashType;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.C1341a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.b */
public final class C1218b {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C1229g> f1087a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private static ConcurrentHashMap<Integer, C1229g> f1088b = new ConcurrentHashMap<>();

    /* renamed from: com.apm.insight.entity.b$a */
    public interface C1219a {
        /* renamed from: a */
        void mo12188a(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static File m1443a(File file) {
        return new File(file, "all_data.json");
    }

    /* renamed from: a */
    public static JSONArray m1444a() {
        C1229g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo12292c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1445a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C1229g> it = f1087a.iterator();
        while (true) {
            if (it.hasNext()) {
                C1229g next = it.next();
                if (next != null && next.mo12290a(obj)) {
                    jSONArray.put(next.mo12289a(CrashType.JAVA, (JSONArray) null));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1446a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext()) {
            C1229g next = it.next();
            if (next != null && next.mo12290a(obj)) {
                JSONArray a = next.mo12286a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", next.mo12291b());
                    jSONObject.put("lines", a);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m1447a(String str) {
        C1229g next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (C1341a.m2044b(next.mo12291b())) {
                JSONArray a = next.mo12287a(split);
                if (!C1301l.m1803a(a)) {
                    jSONArray.put(next.mo12289a(CrashType.ANR, a));
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m1448a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && C1341a.m2046c(String.valueOf(optJSONObject.opt("aid")))) {
                if (!TextUtils.isEmpty(optJSONObject.optString("package"))) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("so_list");
                    if (!C1301l.m1803a(optJSONArray)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= optJSONArray.length()) {
                                break;
                            } else if (str.contains(optJSONArray.optString(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                jSONArray2.put(optJSONObject2);
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONArray m1449a(Throwable th, Thread thread, File file) {
        C1229g next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] b = C1316v.m1921b(th);
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (!C1341a.m2042a(next.mo12291b())) {
                C1311q.m1870a((Object) "not enable javaCrash aid: " + next.mo12291b());
            } else {
                JSONArray a = next.mo12286a(b, th);
                if (!C1301l.m1803a(a)) {
                    jSONArray.put(next.mo12289a(CrashType.JAVA, a));
                }
            }
        }
        if (C1301l.m1803a(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                C1298i.m1771a(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m1450a(C1229g gVar) {
        f1087a.add(gVar);
        if (gVar.mo12293d()) {
            f1088b.put(4444, gVar);
        }
    }

    /* renamed from: a */
    public static void m1451a(JSONObject jSONObject, JSONArray jSONArray, C1219a aVar) {
        JSONObject optJSONObject;
        C1311q.m1870a((Object) "uploadFromFile with allData " + jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        while (i < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i)) != null) {
            if (C1301l.m1798a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                C1217a.m1414b(jSONObject2, jSONObject);
                C1217a.m1414b(jSONObject2, optJSONObject);
                aVar.mo12188a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
            i++;
        }
        if (jSONArray2.length() != 0) {
            JSONObject jSONObject3 = new JSONObject();
            C1217a.m1414b(jSONObject3, jSONObject);
            try {
                jSONObject3.put("all_data", jSONArray2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            aVar.mo12188a(jSONObject3);
        }
    }

    /* renamed from: b */
    public static String m1452b(Object obj) {
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext()) {
            C1229g next = it.next();
            if (next != null && next.mo12290a(obj)) {
                return next.mo12291b();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static JSONArray m1453b() {
        C1229g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1229g> it = f1087a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.mo12288a((CrashType) null));
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static int m1454c() {
        return f1087a.size();
    }
}
