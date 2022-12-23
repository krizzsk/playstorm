package com.bytedance.sdk.openadsdk.p168e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3685b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.e.a */
/* compiled from: JsAppAdDownloadManager */
public class C3789a implements C3791c {

    /* renamed from: a */
    private final C3498n f9863a;

    /* renamed from: b */
    private final C3790b f9864b;

    /* renamed from: c */
    private final Map<String, C4026c> f9865c = new HashMap();

    /* renamed from: a */
    public void mo20605a() {
    }

    /* renamed from: b */
    public void mo20609b() {
    }

    /* renamed from: b */
    public void mo20610b(JSONObject jSONObject) {
    }

    private C3789a(C3790b bVar, C3498n nVar) {
        this.f9864b = bVar;
        this.f9863a = nVar;
    }

    /* renamed from: a */
    public static C3789a m12449a(C3790b bVar, C3498n nVar) {
        return new C3789a(bVar, nVar);
    }

    /* renamed from: c */
    public void mo20611c() {
        this.f9865c.clear();
    }

    /* renamed from: a */
    private C3498n m12448a(JSONObject jSONObject, String str) {
        String str2 = null;
        if (jSONObject == null) {
            return null;
        }
        C3498n nVar = new C3498n();
        nVar.mo19689b(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nVar.mo19729m(str);
        }
        if (this.f9863a == null) {
            return nVar;
        }
        if (nVar.mo19657aa() != null) {
            str2 = nVar.mo19657aa().mo19491a();
        }
        if (TextUtils.isEmpty(str2)) {
            return this.f9863a;
        }
        return (this.f9863a.mo19657aa() == null || !str2.equals(this.f9863a.mo19657aa().mo19491a())) ? nVar : this.f9863a;
    }

    /* renamed from: a */
    public void mo20607a(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12452a(context, m12448a(optJSONObject, str), optJSONObject, i, z);
        }
    }

    /* renamed from: a */
    private void m12452a(Context context, C3498n nVar, JSONObject jSONObject, int i, boolean z) {
        if (context != null && nVar != null && nVar.mo19657aa() != null && jSONObject != null && this.f9864b != null && this.f9865c.get(nVar.mo19657aa().mo19491a()) == null) {
            String a = C4014u.m13181a(i);
            if (!TextUtils.isEmpty(a)) {
                this.f9865c.put(nVar.mo19657aa().mo19491a(), m12450a(context, nVar, jSONObject, a, z));
            }
        }
    }

    /* renamed from: a */
    public void mo20606a(Context context, JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (context != null && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12451a(context, m12448a(optJSONObject, (String) null), str);
        }
    }

    /* renamed from: a */
    private void m12451a(Context context, C3498n nVar, String str) {
        if (context != null && nVar != null) {
            if (nVar.mo19657aa() == null) {
                C4027d.m13342a(context, nVar, str).mo20934d();
            } else {
                C4026c cVar = this.f9865c.get(nVar.mo19657aa().mo19491a());
                if (cVar != null) {
                    cVar.mo20934d();
                }
            }
            if (context instanceof C3685b) {
                ((C3685b) context).mo18516K();
            }
        }
    }

    /* renamed from: a */
    public void mo20608a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            m12453a(m12448a(optJSONObject, (String) null), optJSONObject);
        }
    }

    /* renamed from: a */
    private void m12453a(C3498n nVar, JSONObject jSONObject) {
        if (this.f9864b != null && nVar != null && nVar.mo19657aa() != null) {
            String a = nVar.mo19657aa().mo19491a();
            if (this.f9865c.containsKey(a)) {
                this.f9865c.remove(a);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", "success");
                    jSONObject2.put("status", "unsubscribed");
                    jSONObject2.put("appad", jSONObject);
                    this.f9864b.mo20439a("app_ad_event", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private C4026c m12450a(Context context, C3498n nVar, JSONObject jSONObject, String str, boolean z) {
        C4026c a = C4027d.m13342a(context, nVar, str);
        a.mo20931a(true);
        return a;
    }
}
