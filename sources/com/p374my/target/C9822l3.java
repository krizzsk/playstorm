package com.p374my.target;

import android.content.Context;
import android.util.Base64;
import com.p374my.target.C9700f5;
import com.tapjoy.TapjoyConstants;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.l3 */
public final class C9822l3 {

    /* renamed from: a */
    public final Map<String, Object> f24240a;

    /* renamed from: b */
    public final Map<Integer, Long> f24241b = new HashMap();

    /* renamed from: c */
    public final long f24242c;

    /* renamed from: d */
    public final int f24243d;

    /* renamed from: e */
    public boolean f24244e;

    /* renamed from: com.my.target.l3$a */
    public static final class C9823a {

        /* renamed from: a */
        public final int f24245a;

        /* renamed from: b */
        public boolean f24246b = false;

        public C9823a(int i) {
            this.f24245a = i;
        }

        /* renamed from: a */
        public C9822l3 mo64679a() {
            C9822l3 l3Var = new C9822l3(this.f24245a, "myTarget", 0);
            l3Var.mo64675a(this.f24246b);
            return l3Var;
        }

        /* renamed from: a */
        public C9822l3 mo64680a(String str, float f) {
            C9822l3 l3Var = new C9822l3(this.f24245a, str, 5);
            l3Var.mo64675a(this.f24246b);
            l3Var.f24240a.put("priority", Float.valueOf(f));
            return l3Var;
        }

        /* renamed from: a */
        public void mo64681a(boolean z) {
            this.f24246b = z;
        }

        /* renamed from: b */
        public C9822l3 mo64682b() {
            C9822l3 l3Var = new C9822l3(this.f24245a, "myTarget", 4);
            l3Var.mo64675a(this.f24246b);
            return l3Var;
        }
    }

    public C9822l3(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        this.f24240a = hashMap;
        this.f24243d = i2;
        this.f24242c = System.currentTimeMillis();
        hashMap.put("slot", Integer.valueOf(i));
        hashMap.put("network", str);
    }

    /* renamed from: a */
    public static C9823a m28580a(int i) {
        return new C9823a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28581a(Context context) {
        String a = mo64673a();
        C9672e0.m27882a("send metrics message:\n " + a);
        C9712g3.m28065d().mo64164b("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(a.getBytes(Charset.forName("UTF-8")), 0), context);
    }

    /* renamed from: a */
    public String mo64673a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.f24240a.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry next2 : this.f24241b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", next2.getKey());
                jSONObject2.put("value", next2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo64674a(int i, long j) {
        Long l = this.f24241b.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        mo64677b(i, j);
    }

    /* renamed from: a */
    public void mo64675a(boolean z) {
        this.f24244e = z;
    }

    /* renamed from: b */
    public void mo64676b() {
        mo64677b(this.f24243d, System.currentTimeMillis() - this.f24242c);
    }

    /* renamed from: b */
    public void mo64677b(int i, long j) {
        this.f24241b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo64678b(Context context) {
        if (!this.f24244e) {
            C9672e0.m27882a("metrics sending disabled");
        } else if (this.f24241b.isEmpty()) {
            C9672e0.m27882a("metrics not send: empty");
        } else {
            C9700f5.C9701a a = C9754i5.m28266c().mo64271a();
            if (a == null) {
                C9672e0.m27882a("metrics not send: basic info not collected");
                return;
            }
            this.f24240a.put("instanceId", a.f23885a);
            this.f24240a.put("os", a.f23886b);
            this.f24240a.put("osver", a.f23887c);
            this.f24240a.put(TapjoyConstants.TJC_APP_PLACEMENT, a.f23888d);
            this.f24240a.put("appver", a.f23889e);
            this.f24240a.put("sdkver", a.f23890f);
            C9693f0.m27981b(new Runnable(context) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C9822l3.this.m28581a(this.f$1);
                }
            });
        }
    }
}
