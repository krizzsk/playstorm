package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9822l3;
import com.p374my.target.C9916q2;
import org.json.JSONObject;

/* renamed from: com.my.target.c */
public abstract class C9635c<T extends C9916q2> {
    /* renamed from: a */
    public static JSONObject m27712a(String str, C9822l3.C9823a aVar, C9822l3 l3Var) {
        if (str != null) {
            str = str.trim();
        }
        if (str == null || "".equals(str)) {
            C9672e0.m27882a("parsing ad response: empty data");
            return null;
        }
        C9672e0.m27882a("Converting to JSON...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            m27714b(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("sdk_ms", false);
            aVar.mo64681a(optBoolean);
            l3Var.mo64675a(optBoolean);
            C9672e0.m27882a("done");
            if (m27713a(jSONObject)) {
                return jSONObject;
            }
            C9672e0.m27882a("invalid json version");
            return null;
        } catch (Throwable th) {
            C9672e0.m27882a("parsing ad response error: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m27713a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("version");
            C9672e0.m27882a("json version: " + string);
            int indexOf = string.indexOf(".");
            return indexOf > 0 && Integer.parseInt(string.substring(0, indexOf), 10) == 2;
        } catch (Throwable th) {
            C9672e0.m27882a("Check version failed: " + th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m27714b(JSONObject jSONObject) {
        if (!C9672e0.f23794a && jSONObject.optBoolean("sdk_debug_mode", false)) {
            C9672e0.f23794a = true;
        }
    }

    public static boolean isVast(String str) {
        String trim = str.trim();
        return trim.startsWith("<VAST") || trim.startsWith("<?xml");
    }

    /* renamed from: a */
    public abstract T mo63651a(String str, C9915q1 q1Var, T t, C9596a aVar, C9822l3.C9823a aVar2, C9822l3 l3Var, Context context);
}
