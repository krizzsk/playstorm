package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.k */
public class C6434k {

    /* renamed from: a */
    private static final String f16345a = C6434k.class.getSimpleName();

    /* renamed from: b */
    private static final ArrayList<String> f16346b = new ArrayList<String>() {
        {
            add("com.google.market");
            add("com.android.vending");
        }
    };

    /* renamed from: a */
    private static JSONObject m19354a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b = m19356b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                final boolean contains = b.contains(next.trim().toLowerCase());
                jSONObject.put(next, new JSONObject() {
                    {
                        put("isInstalled", contains);
                    }
                });
            }
        } catch (Exception unused) {
            Log.d(f16345a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m19355a(Context context) {
        JSONObject a = m19354a(context, f16346b);
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ArrayList<String> m19356b(Context context) {
        List<ApplicationInfo> p = C6429h.m19338p(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo next : p) {
            if (next != null) {
                arrayList.add(next.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
