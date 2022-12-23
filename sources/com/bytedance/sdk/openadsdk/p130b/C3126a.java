package com.bytedance.sdk.openadsdk.p130b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.p131a.C3129a;
import com.bytedance.sdk.openadsdk.p130b.p131a.C3130b;
import com.bytedance.sdk.openadsdk.p130b.p131a.C3131c;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import com.bytedance.sdk.openadsdk.utils.C4013t;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a */
/* compiled from: AdEvent */
public class C3126a implements C3168k {

    /* renamed from: a */
    public final String f7352a;

    /* renamed from: b */
    protected final JSONObject f7353b;

    /* renamed from: c */
    private AtomicBoolean f7354c = new AtomicBoolean(false);

    /* renamed from: d */
    private JSONObject f7355d = new JSONObject();

    /* renamed from: e */
    private String f7356e;

    /* renamed from: f */
    private String f7357f;

    /* renamed from: g */
    private String f7358g;

    /* renamed from: h */
    private String f7359h;

    /* renamed from: i */
    private String f7360i;

    /* renamed from: j */
    private C3129a f7361j;

    /* renamed from: k */
    private String f7362k;

    /* renamed from: l */
    private String f7363l;

    /* renamed from: m */
    private String f7364m;

    /* renamed from: n */
    private String f7365n;

    C3126a(C3127a aVar) {
        this.f7352a = TextUtils.isEmpty(aVar.f7366a) ? C4002l.m13120a() : aVar.f7366a;
        this.f7361j = aVar.f7378m;
        this.f7363l = aVar.f7370e;
        this.f7356e = aVar.f7367b;
        this.f7357f = aVar.f7368c;
        this.f7358g = TextUtils.isEmpty(aVar.f7369d) ? "app_union" : aVar.f7369d;
        this.f7362k = aVar.f7374i;
        this.f7359h = aVar.f7371f;
        this.f7360i = aVar.f7372g;
        this.f7364m = aVar.f7375j;
        this.f7365n = aVar.f7376k;
        this.f7355d = aVar.f7373h = aVar.f7373h != null ? aVar.f7373h : new JSONObject();
        this.f7353b = new JSONObject();
        if (!TextUtils.isEmpty(aVar.f7376k)) {
            try {
                this.f7353b.put("app_log_url", aVar.f7376k);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    C3126a(String str, JSONObject jSONObject) {
        this.f7352a = str;
        this.f7353b = jSONObject;
    }

    /* renamed from: a */
    static C3126a m9004a(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        return new C3126a(C4002l.m13120a(), m9006b(context, str, str2, str3, jSONObject));
    }

    /* renamed from: a */
    public static C3126a m9005a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("localId", (String) null);
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                return new C3126a(optString, optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static JSONObject m9006b(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("event_ts", System.currentTimeMillis());
            jSONObject2.putOpt("tag", str);
            jSONObject2.putOpt(Constants.ScionAnalytics.PARAM_LABEL, str2);
            jSONObject2.putOpt("category", "app_union");
            try {
                jSONObject2.putOpt("value", Long.valueOf(Long.parseLong(str3)));
            } catch (Exception unused) {
                jSONObject2.putOpt("value", 0L);
            }
            jSONObject2.putOpt("is_ad_event", "1");
            jSONObject2.putOpt("nt", Integer.valueOf(NetworkTools.m13017a(context)));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
            }
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: f */
    private void m9007f() throws JSONException {
        this.f7353b.putOpt("app_log_url", this.f7365n);
        this.f7353b.putOpt("tag", this.f7356e);
        this.f7353b.putOpt(Constants.ScionAnalytics.PARAM_LABEL, this.f7357f);
        this.f7353b.putOpt("category", this.f7358g);
        if (!TextUtils.isEmpty(this.f7359h)) {
            try {
                this.f7353b.putOpt("value", Long.valueOf(Long.parseLong(this.f7359h)));
            } catch (NumberFormatException unused) {
                this.f7353b.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f7360i)) {
            try {
                this.f7353b.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f7360i)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f7363l)) {
            this.f7353b.putOpt("log_extra", this.f7363l);
        }
        if (!TextUtils.isEmpty(this.f7362k)) {
            try {
                this.f7353b.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f7362k)));
            } catch (NumberFormatException unused3) {
            }
        }
        this.f7353b.putOpt("is_ad_event", "1");
        try {
            this.f7353b.putOpt("nt", this.f7364m);
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f7355d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f7353b.putOpt(next, this.f7355d.opt(next));
        }
    }

    /* renamed from: a */
    public String mo18654a() {
        if (TextUtils.isEmpty(this.f7352a) || this.f7353b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f7352a);
            jSONObject.put("event", mo18655b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public JSONObject mo18655b() {
        if (this.f7354c.get()) {
            return this.f7353b;
        }
        try {
            m9007f();
            if (this.f7361j != null) {
                this.f7361j.mo18669a(this.f7353b);
            }
            this.f7354c.set(true);
        } catch (Throwable th) {
            C2975l.m8386b("AdEvent", th);
        }
        return this.f7353b;
    }

    /* renamed from: c */
    public JSONObject mo18656c() {
        JSONObject b = mo18655b();
        try {
            JSONObject jSONObject = new JSONObject(b.toString());
            jSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return b;
        }
    }

    /* renamed from: d */
    public String mo18657d() {
        return this.f7352a;
    }

    /* renamed from: e */
    public boolean mo18658e() {
        JSONObject jSONObject = this.f7353b;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(Constants.ScionAnalytics.PARAM_LABEL);
        if (!TextUtils.isEmpty(optString)) {
            return C3132b.f7382a.contains(optString);
        }
        if (TextUtils.isEmpty(this.f7357f)) {
            return false;
        }
        return C3132b.f7382a.contains(this.f7357f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.a$a */
    /* compiled from: AdEvent */
    public static final class C3127a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f7366a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f7367b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f7368c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7369d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f7370e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f7371f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f7372g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public JSONObject f7373h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f7374i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final String f7375j = String.valueOf(NetworkTools.m13017a(C3578m.m11231a()));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f7376k;

        /* renamed from: l */
        private C3130b f7377l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C3129a f7378m;

        /* renamed from: a */
        public C3127a mo18659a(String str) {
            this.f7376k = str;
            return this;
        }

        /* renamed from: b */
        public C3127a mo18662b(String str) {
            this.f7367b = str;
            return this;
        }

        /* renamed from: c */
        public C3127a mo18663c(String str) {
            this.f7368c = str;
            return this;
        }

        /* renamed from: d */
        public C3127a mo18664d(String str) {
            this.f7369d = str;
            return this;
        }

        /* renamed from: e */
        public C3127a mo18665e(String str) {
            this.f7370e = str;
            return this;
        }

        /* renamed from: f */
        public C3127a mo18666f(String str) {
            this.f7371f = str;
            return this;
        }

        /* renamed from: g */
        public C3127a mo18667g(String str) {
            this.f7372g = str;
            return this;
        }

        /* renamed from: a */
        public C3127a mo18660a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f7373h = jSONObject;
            return this;
        }

        /* renamed from: a */
        public void mo18661a(C3129a aVar) {
            this.f7378m = aVar;
            final C3126a aVar2 = new C3126a(this);
            try {
                if (this.f7377l != null) {
                    this.f7377l.mo18670a(aVar2.f7353b);
                } else {
                    new C3131c().mo18670a(aVar2.f7353b);
                }
            } catch (Throwable th) {
                C2975l.m8386b("AdEvent", th);
            }
            if (C3953b.m12901c()) {
                C4013t.m13175b(new C2955g("dispatchEvent") {
                    public void run() {
                        C3578m.m11236c().mo18743a(aVar2);
                    }
                });
            } else {
                C3578m.m11236c().mo18743a(aVar2);
            }
        }
    }
}
