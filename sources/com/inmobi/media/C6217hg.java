package com.inmobi.media;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hg */
/* compiled from: CatchEvent */
public final class C6217hg extends C6185gi {

    /* renamed from: g */
    private static final String f15751g = C6222hj.class.getSimpleName();

    public C6217hg(Throwable th) {
        super("crashReporting", "catchEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", Thread.currentThread().getName());
            this.f15640f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }
}
