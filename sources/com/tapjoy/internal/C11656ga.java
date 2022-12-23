package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ga */
public final class C11656ga {

    /* renamed from: a */
    String f28339a;

    /* renamed from: b */
    String f28340b;

    /* renamed from: c */
    String f28341c;

    /* renamed from: d */
    TapjoyURLConnection f28342d;

    /* renamed from: e */
    private Map<String, String> f28343e = new HashMap();

    /* renamed from: f */
    private boolean f28344f;

    public C11656ga(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f28339a = str;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f28343e.put(next, jSONObject.optString(next));
        }
        this.f28340b = jSONObject2.optString(TJAdUnitConstants.String.BEACON_SHOW_PATH);
        this.f28341c = jSONObject2.optString("error");
        this.f28342d = new TapjoyURLConnection();
    }

    /* renamed from: a */
    public final void mo72530a() {
        if (!TextUtils.isEmpty(this.f28340b) && !this.f28344f) {
            this.f28344f = true;
            final HashMap hashMap = new HashMap(this.f28343e);
            new Thread() {
                public final void run() {
                    super.run();
                    TapjoyURLConnection tapjoyURLConnection = C11656ga.this.f28342d;
                    tapjoyURLConnection.getResponseFromURL(C11656ga.this.f28339a + C11656ga.this.f28340b, (Map<String, String>) null, (Map<String, String>) null, (Map<String, String>) hashMap);
                }
            }.start();
        }
    }

    /* renamed from: a */
    public final void mo72531a(String str) {
        if (!TextUtils.isEmpty(this.f28341c)) {
            final HashMap hashMap = new HashMap(this.f28343e);
            hashMap.put("error", str);
            new Thread() {
                public final void run() {
                    TapjoyURLConnection tapjoyURLConnection = C11656ga.this.f28342d;
                    tapjoyURLConnection.getResponseFromURL(C11656ga.this.f28339a + C11656ga.this.f28341c, (Map<String, String>) null, (Map<String, String>) null, (Map<String, String>) hashMap);
                }
            }.start();
        }
    }
}
