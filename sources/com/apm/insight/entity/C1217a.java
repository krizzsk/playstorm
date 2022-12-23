package com.apm.insight.entity;

import android.content.Context;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.apm.insight.C1240h;
import com.apm.insight.nativecrash.C1323b;
import com.apm.insight.nativecrash.C1330c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.p024a.C1343b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.a */
public class C1217a {

    /* renamed from: a */
    protected JSONObject f1085a;

    /* renamed from: b */
    protected Header f1086b;

    public C1217a() {
        this.f1085a = new JSONObject();
    }

    public C1217a(JSONObject jSONObject) {
        this.f1085a = jSONObject;
    }

    /* renamed from: a */
    public static C1217a m1407a(long j, Context context, String str) {
        C1217a aVar = new C1217a();
        aVar.mo12251a("is_dart", (Object) 1);
        aVar.mo12251a("crash_time", (Object) Long.valueOf(j));
        aVar.mo12251a("process_name", (Object) C1285a.m1725c(context));
        aVar.mo12251a("data", (Object) str);
        C1285a.m1718a(context, aVar.mo12265h());
        return aVar;
    }

    /* renamed from: a */
    public static C1217a m1408a(long j, Context context, Thread thread, Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        C1217a aVar = new C1217a();
        aVar.mo12251a("isJava", (Object) 1);
        aVar.mo12251a("data", (Object) C1316v.m1903a(th));
        aVar.mo12251a("crash_time", (Object) Long.valueOf(j));
        aVar.mo12251a("process_name", (Object) C1285a.m1725c(context));
        if (!C1285a.m1724b(context)) {
            aVar.mo12251a("remote_process", (Object) 1);
        }
        String name = thread == null ? null : thread.getName();
        if (name != null) {
            aVar.mo12251a("crash_thread_name", (Object) name);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m1409a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, str3);
        }
    }

    /* renamed from: a */
    public static void m1410a(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt(str) != null) {
            int i = 0;
            while (i < 5) {
                if (jSONObject.opt(str + i) == null) {
                    str = str + i;
                } else {
                    i++;
                }
            }
            return;
        }
        try {
            jSONObject.put(str, C1316v.m1903a(th));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1411a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1412a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        try {
            jSONObject3.put("storage", jSONObject4);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject4.optLong("inner_free");
        long optLong2 = jSONObject4.optLong("sdcard_free");
        long optLong3 = jSONObject4.optLong("inner_free_real");
        String str = "1M - 64M";
        String str2 = optLong <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID ? "0 - 1K" : optLong <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH ? "1K - 64K" : optLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "64K - 512K" : optLong <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? "512K - 1M" : optLong <= 67108864 ? str : "64M - ";
        String str3 = optLong3 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID ? "0 - 1K" : optLong3 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH ? "1K - 64K" : optLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "64K - 512K" : optLong3 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? "512K - 1M" : optLong3 <= 67108864 ? str : "64M - ";
        if (optLong2 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            str = "0 - 1K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str = "1K - 64K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (optLong2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str = "512K - 1M";
        } else if (optLong2 > 67108864) {
            str = "64M - ";
        }
        m1409a(jSONObject3, "filters", "inner_free", str2);
        m1409a(jSONObject3, "filters", "inner_free_real", str3);
        m1409a(jSONObject3, "filters", "sdcard_free", str);
    }

    /* renamed from: a */
    public static boolean m1413a(String str) {
        return C1308o.m1845d(str).exists();
    }

    /* renamed from: b */
    public static void m1414b(JSONObject jSONObject, JSONObject jSONObject2) {
        Object opt;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt2 = jSONObject.opt(next);
                    if (opt2 == null) {
                        opt = jSONObject2.opt(next);
                    } else {
                        if (opt2 instanceof JSONObject) {
                            jSONObject3 = jSONObject.getJSONObject(next);
                            jSONObject4 = jSONObject2.getJSONObject(next);
                        } else if (opt2 instanceof JSONArray) {
                            JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                            if (optJSONArray != null) {
                                JSONArray jSONArray = (JSONArray) opt2;
                                if (jSONArray.length() != 1 || !(jSONArray.opt(0) instanceof JSONObject) || !(optJSONArray.opt(0) instanceof JSONObject)) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        jSONArray.put(optJSONArray.get(i));
                                    }
                                } else {
                                    jSONObject3 = jSONArray.getJSONObject(0);
                                    jSONObject4 = optJSONArray.getJSONObject(0);
                                }
                            }
                        } else {
                            opt = jSONObject2.opt(next);
                        }
                        m1414b(jSONObject3, jSONObject4);
                    }
                    jSONObject.put(next, opt);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static boolean m1415b(String str) {
        return ((long) C1330c.m2022c(str)) > C1323b.m1991i();
    }

    /* renamed from: c */
    public static boolean m1416c(String str) {
        return C1330c.m2019a(str) > 960;
    }

    /* renamed from: d */
    public static boolean m1417d(String str) {
        return C1330c.m2021b(str) > 350;
    }

    /* renamed from: a */
    public C1217a mo12242a(int i, String str) {
        try {
            this.f1085a.put("miniapp_id", i);
            this.f1085a.put("miniapp_version", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C1217a mo12243a(long j) {
        try {
            mo12251a("app_start_time", (Object) Long.valueOf(j));
            mo12251a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C1217a mo12244a(Header header) {
        mo12251a("header", (Object) header.mo12241f());
        this.f1086b = header;
        return this;
    }

    /* renamed from: a */
    public C1217a mo12245a(C1343b bVar) {
        mo12251a("activity_trace", (Object) bVar.mo12451g());
        mo12247a("activity_track", bVar.mo12453i());
        return this;
    }

    /* renamed from: a */
    public C1217a mo12246a(String str, String str2) {
        Object opt = mo12265h().opt("data");
        m1409a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12265h(), "filters", str, str2);
        return this;
    }

    /* renamed from: a */
    public C1217a mo12247a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = mo12265h().optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo12251a("custom_long", (Object) optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public C1217a mo12248a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo12251a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        mo12251a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public C1217a mo12249a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f1085a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String next : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, next);
                jSONObject.put("version_code", map.get(next));
                jSONArray.put(jSONObject);
            }
            this.f1085a.put("plugin_info", jSONArray);
            return this;
        }
    }

    /* renamed from: a */
    public C1217a mo12250a(JSONObject jSONObject) {
        mo12251a("header", (Object) jSONObject);
        return this;
    }

    /* renamed from: a */
    public void mo12251a(String str, Object obj) {
        try {
            this.f1085a.put(str, obj);
        } catch (Exception e) {
            C1311q.m1877b((Throwable) e);
        }
    }

    /* renamed from: a */
    public boolean mo12252a() {
        Object opt = mo12265h().opt("data");
        return opt instanceof JSONArray ? !C1301l.m1805a(((JSONArray) opt).optJSONObject(0), "logcat") : !C1301l.m1805a(this.f1085a, "logcat");
    }

    /* renamed from: b */
    public C1217a mo12253b(String str, String str2) {
        Object opt = mo12265h().opt("data");
        m1409a(opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12265h(), "custom", str, str2);
        return this;
    }

    /* renamed from: b */
    public C1217a mo12254b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer next : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(next), map.get(next));
                } catch (JSONException e) {
                    C1311q.m1877b((Throwable) e);
                }
            }
            try {
                this.f1085a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* renamed from: b */
    public C1217a mo12255b(JSONObject jSONObject) {
        m1412a(this.f1085a, jSONObject);
        return this;
    }

    /* renamed from: b */
    public void mo12256b() {
        mo12246a("has_logcat", String.valueOf(mo12252a()));
    }

    /* renamed from: c */
    public C1217a mo12257c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject e = mo12261e("filters");
            for (Map.Entry next : map.entrySet()) {
                try {
                    e.put((String) next.getKey(), next.getValue());
                } catch (JSONException unused) {
                }
            }
            mo12251a("filters", (Object) e);
        }
        return this;
    }

    /* renamed from: c */
    public void mo12258c() {
        mo12246a("is_64_devices", String.valueOf(Header.m1386a()));
        mo12246a("is_64_runtime", String.valueOf(NativeImpl.m1965e()));
        mo12246a("is_x86_devices", String.valueOf(Header.m1389b()));
    }

    /* renamed from: c */
    public void mo12259c(JSONObject jSONObject) {
        m1414b(this.f1085a, jSONObject);
    }

    /* renamed from: d */
    public boolean mo12260d() {
        return m1416c(C1240h.m1557f());
    }

    /* renamed from: e */
    public JSONObject mo12261e(String str) {
        Object opt = mo12265h().opt("data");
        JSONObject optJSONObject = opt instanceof JSONArray ? ((JSONArray) opt).optJSONObject(0) : mo12265h();
        if (optJSONObject == null) {
            return new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2;
        }
        JSONObject jSONObject = new JSONObject();
        mo12251a(str, (Object) jSONObject);
        return jSONObject;
    }

    /* renamed from: e */
    public boolean mo12262e() {
        return m1417d(C1240h.m1557f());
    }

    /* renamed from: f */
    public boolean mo12263f() {
        return m1415b(C1240h.m1557f());
    }

    /* renamed from: g */
    public boolean mo12264g() {
        return m1413a(C1240h.m1557f());
    }

    /* renamed from: h */
    public JSONObject mo12265h() {
        return this.f1085a;
    }

    /* renamed from: i */
    public Header mo12266i() {
        if (this.f1086b == null) {
            Header header = new Header(C1240h.m1558g());
            this.f1086b = header;
            mo12244a(header);
        }
        return this.f1086b;
    }
}
