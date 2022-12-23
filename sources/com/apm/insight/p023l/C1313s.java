package com.apm.insight.p023l;

import android.text.TextUtils;
import com.apm.insight.C1240h;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.s */
public final class C1313s {
    /* renamed from: a */
    public static void m1884a(C1217a aVar, Header header, CrashType crashType) {
        if (aVar != null) {
            m1885a(aVar.mo12265h(), header, crashType);
        }
    }

    /* renamed from: a */
    public static void m1885a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a = C1240h.m1554c().mo12521a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        jSONObject = header.mo12241f();
                        if (jSONObject == null) {
                            return;
                        }
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
