package com.ironsource.mediationsdk.p207a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.a */
abstract class C6543a {

    /* renamed from: a */
    JSONObject f16889a;

    /* renamed from: b */
    int f16890b;

    /* renamed from: c */
    String f16891c;

    /* renamed from: d */
    private final String f16892d = "eventId";

    /* renamed from: e */
    private final String f16893e = "timestamp";

    /* renamed from: f */
    private final String f16894f = "InterstitialEvents";

    /* renamed from: g */
    private final String f16895g = "events";

    /* renamed from: h */
    private final String f16896h = "events";

    C6543a() {
    }

    /* renamed from: a */
    static JSONObject m19878a(C6552c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.mo36394c()) ? new JSONObject(cVar.mo36394c()) : new JSONObject();
            jSONObject.put("eventId", cVar.mo36390a());
            jSONObject.put("timestamp", cVar.mo36393b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo36353a() {
        return TextUtils.isEmpty(this.f16891c) ? mo36356b() : this.f16891c;
    }

    /* renamed from: a */
    public abstract String mo36354a(ArrayList<C6552c> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo36355a(JSONArray jSONArray) {
        try {
            if (this.f16889a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f16889a.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f16890b == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo36356b();

    /* renamed from: c */
    public abstract String mo36357c();
}
