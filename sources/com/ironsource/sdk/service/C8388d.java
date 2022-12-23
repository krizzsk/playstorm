package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6429h;
import com.ironsource.sdk.p290e.p291a.C8333a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.d */
public final class C8388d {

    /* renamed from: b */
    private static C8388d f20111b;

    /* renamed from: a */
    private JSONObject f20112a = new JSONObject();

    private C8388d() {
    }

    /* renamed from: a */
    public static synchronized C8388d m24005a() {
        C8388d dVar;
        synchronized (C8388d.class) {
            if (f20111b == null) {
                f20111b = new C8388d();
            }
            dVar = f20111b;
        }
        return dVar;
    }

    /* renamed from: a */
    private void m24006a(Activity activity) {
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo56903a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(C6429h.m19305a(activity)));
            }
            mo56903a("appOrientation", SDKUtils.translateRequestedOrientation(C6429h.m19332m(activity)));
        }
    }

    /* renamed from: a */
    private void m24007a(Map<String, String> map) {
        if (map == null) {
            Log.d("TokenService", "collectDataFromExternalParams params=null");
            return;
        }
        for (String next : map.keySet()) {
            mo56903a(next, SDKUtils.encodeString(map.get(next)));
        }
    }

    /* renamed from: c */
    private static void m24008c() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", C8333a.f19967a);
        hashMap.put("omidPartnerVersion", "7");
        f20111b.m24007a((Map<String, String>) hashMap);
    }

    /* renamed from: c */
    private void m24009c(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C8388d.this.mo56904a(C8386b.m23996a(context));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m24010c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo56903a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m24011d() {
        if (IronSourceQaProperties.isInitialized()) {
            f20111b.m24007a(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    /* renamed from: d */
    private void m24012d(Context context) {
        if (context != null) {
            mo56904a(C8386b.m23999c(context));
            mo56904a(C8386b.m23998b(context));
        }
    }

    /* renamed from: a */
    public final String mo56900a(Context context) {
        try {
            return C6399a.C64001.m19225c(mo56905b(context).toString());
        } catch (Exception unused) {
            return C6399a.C64001.m19225c(new JSONObject().toString());
        }
    }

    /* renamed from: a */
    public final void mo56901a(Context context, String str, String str2) {
        m24009c(context);
        if (context instanceof Activity) {
            m24006a((Activity) context);
        }
        m24012d(context);
        mo56902a(str2);
        mo56907b(str);
    }

    /* renamed from: a */
    public final void mo56902a(String str) {
        if (str != null) {
            mo56903a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo56903a(String str, Object obj) {
        try {
            this.f20112a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo56904a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            mo56903a(next, jSONObject.opt(next));
        }
    }

    /* renamed from: b */
    public final JSONObject mo56905b(Context context) {
        mo56906b();
        m24012d(context);
        try {
            return new JSONObject(this.f20112a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void mo56906b() {
        m24010c(SDKUtils.getControllerConfig());
        m24007a(SDKUtils.getInitSDKParams());
        m24011d();
        m24008c();
    }

    /* renamed from: b */
    public final void mo56907b(String str) {
        if (str != null) {
            mo56903a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}
