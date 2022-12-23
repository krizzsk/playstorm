package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p203c.C6409a;
import com.ironsource.mediationsdk.utils.C6774k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.o */
public class C6711o {

    /* renamed from: com.ironsource.mediationsdk.o$a */
    interface C6712a {
        /* renamed from: a */
        void mo36281a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.o$b */
    interface C6713b {
        /* renamed from: a */
        void mo36278a();

        /* renamed from: a */
        void mo36279a(String str);
    }

    /* renamed from: a */
    public static JSONObject m20429a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6409a.C6411a.f16305a.mo35920a(context);
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m20430a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6409a.C6411a.f16305a.mo35920a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a.has(str)) {
                jSONObject.put(str, a.opt(str));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m20431a(String str, ConcurrentHashMap<String, C6523T> concurrentHashMap, C6712a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!C6774k.m20612b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (C6523T next : concurrentHashMap.values()) {
                if (next.mo36398h()) {
                    Map<String, Object> c = next.mo36287c();
                    if (c != null) {
                        hashMap.put(next.mo36401k(), c);
                        sb = new StringBuilder("2");
                    }
                } else if (!next.mo36398h()) {
                    arrayList.add(next.mo36401k());
                    sb = new StringBuilder("1");
                }
                sb.append(next.mo36401k());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        aVar.mo36281a(hashMap, arrayList, sb2);
    }

    /* renamed from: a */
    static boolean m20432a(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public JSONObject mo36837a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a = C6409a.C6411a.f16305a.mo35920a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a.has(next)) {
                jSONObject.put(next, a.opt(next));
            }
        }
        return jSONObject;
    }
}
