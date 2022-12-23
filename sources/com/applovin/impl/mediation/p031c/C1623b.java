package com.applovin.impl.mediation.p031c;

import android.content.Context;
import com.applovin.impl.mediation.p028a.C1579g;
import com.applovin.impl.mediation.p028a.C1581h;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.b */
public class C1623b extends C1877a {

    /* renamed from: a */
    private static String f2219a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdFormat f2220c;

    /* renamed from: d */
    private final Map<String, Object> f2221d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f2222e;

    /* renamed from: f */
    private final C1625a f2223f;

    /* renamed from: com.applovin.impl.mediation.c.b$a */
    public interface C1625a {
        /* renamed from: a */
        void mo13359a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.mediation.c.b$b */
    private static class C1626b implements C1579g.C1580a, Runnable {

        /* renamed from: a */
        private final C1625a f2227a;

        /* renamed from: b */
        private final Object f2228b;

        /* renamed from: c */
        private int f2229c;

        /* renamed from: d */
        private final AtomicBoolean f2230d;

        /* renamed from: e */
        private final Collection<C1579g> f2231e;

        /* renamed from: f */
        private final C2092v f2232f;

        private C1626b(int i, C1625a aVar, C2092v vVar) {
            this.f2229c = i;
            this.f2227a = aVar;
            this.f2232f = vVar;
            this.f2228b = new Object();
            this.f2231e = new ArrayList(i);
            this.f2230d = new AtomicBoolean();
        }

        /* renamed from: a */
        private void m3219a() {
            ArrayList<C1579g> arrayList;
            String str;
            String d;
            synchronized (this.f2228b) {
                arrayList = new ArrayList<>(this.f2231e);
            }
            JSONArray jSONArray = new JSONArray();
            for (C1579g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C1581h a = gVar.mo13247a();
                    jSONObject.put("name", a.mo13208L());
                    jSONObject.put("class", a.mo13207K());
                    jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, gVar.mo13249c());
                    jSONObject.put("sdk_version", gVar.mo13248b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.mo13251e())) {
                        str = "error_message";
                        d = gVar.mo13251e();
                    } else {
                        str = "signal";
                        d = gVar.mo13250d();
                    }
                    jSONObject2.put(str, d);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C2092v.m5047a()) {
                        C2092v vVar = this.f2232f;
                        vVar.mo14789b("TaskCollectSignals", "Collected signal from " + a);
                    }
                } catch (JSONException e) {
                    if (C2092v.m5047a()) {
                        this.f2232f.mo14790b("TaskCollectSignals", "Failed to create signal data", e);
                    }
                }
            }
            m3220a(jSONArray);
        }

        /* renamed from: a */
        private void m3220a(JSONArray jSONArray) {
            C1625a aVar = this.f2227a;
            if (aVar != null) {
                aVar.mo13359a(jSONArray);
            }
        }

        /* renamed from: a */
        public void mo13253a(C1579g gVar) {
            boolean z;
            synchronized (this.f2228b) {
                this.f2231e.add(gVar);
                int i = this.f2229c - 1;
                this.f2229c = i;
                z = i < 1;
            }
            if (z && this.f2230d.compareAndSet(false, true)) {
                m3219a();
            }
        }

        public void run() {
            if (this.f2230d.compareAndSet(false, true)) {
                m3219a();
            }
        }
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m3212a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            m3212a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f2219a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C1623b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, C1959m mVar, C1625a aVar) {
        super("TaskCollectSignals", mVar);
        this.f2220c = maxAdFormat;
        this.f2221d = map;
        this.f2222e = context;
        this.f2223f = aVar;
    }

    /* renamed from: a */
    private static JSONObject m3212a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* renamed from: a */
    private void m3213a(final C1581h hVar, final C1579g.C1580a aVar) {
        if (hVar.mo13215S()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C1623b.this.f3467b.mo14290E().collectSignal(C1623b.this.f2220c, hVar, C1623b.this.f2222e, aVar);
                }
            });
        } else {
            this.f3467b.mo14290E().collectSignal(this.f2220c, hVar, this.f2222e, aVar);
        }
    }

    /* renamed from: a */
    private void m3214a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        C1626b bVar = new C1626b(jSONArray.length(), this.f2223f, this.f3467b.mo14286A());
        for (int i = 0; i < jSONArray.length(); i++) {
            m3213a(new C1581h(this.f2221d, jSONArray.getJSONObject(i), jSONObject, this.f3467b), (C1579g.C1580a) bVar);
        }
        this.f3467b.mo14303S().mo14207a((C1877a) new C1934z(this.f3467b, bVar), C1908o.C1910a.MAIN, ((Long) this.f3467b.mo14311a(C1856a.f3050k)).longValue());
    }

    /* renamed from: b */
    private void m3216b(String str, Throwable th) {
        if (C2092v.m5047a()) {
            mo14143a("No signals collected: " + str, th);
        }
        C1625a aVar = this.f2223f;
        if (aVar != null) {
            aVar.mo13359a(new JSONArray());
        }
    }

    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.f3467b.mo14342b(C1859d.f3363x, f2219a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", (JSONArray) null);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    m3214a(jSONArray, jSONObject);
                    return;
                }
            }
            m3216b("No signal providers found", (Throwable) null);
        } catch (JSONException e) {
            th = e;
            str = "Failed to parse signals JSON";
            m3216b(str, th);
        } catch (InterruptedException e2) {
            th = e2;
            str = "Failed to wait for signals";
            m3216b(str, th);
        } catch (Throwable th) {
            th = th;
            str = "Failed to collect signals";
            m3216b(str, th);
        }
    }
}
