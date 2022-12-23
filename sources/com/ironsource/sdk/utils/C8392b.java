package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.p293g.C8350f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.utils.b */
public class C8392b {

    /* renamed from: b */
    private static C8392b f20135b;

    /* renamed from: a */
    public SharedPreferences f20136a;

    static {
        C8392b.class.getSimpleName();
    }

    private C8392b(Context context) {
        this.f20136a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C8392b m24037a() {
        C8392b bVar;
        synchronized (C8392b.class) {
            bVar = f20135b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C8392b m24038a(Context context) {
        C8392b bVar;
        synchronized (C8392b.class) {
            if (f20135b == null) {
                f20135b = new C8392b(context);
            }
            bVar = f20135b;
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m24039b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    /* renamed from: c */
    private String m24040c() {
        return this.f20136a.getString("version", "-1");
    }

    /* renamed from: a */
    public final void mo56912a(String str) {
        if (!m24040c().equalsIgnoreCase(str)) {
            SharedPreferences.Editor edit = this.f20136a.edit();
            edit.putString("version", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo56913a(String str, String str2, String str3) {
        String string = this.f20136a.getString("ssaUserData", (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f20136a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            return edit.commit();
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final List<String> mo56914b() {
        String string = this.f20136a.getString("search_keys", (String) null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C8350f fVar = new C8350f(string);
            if (fVar.mo56863a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.mo56860a((JSONArray) fVar.mo56865c("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
