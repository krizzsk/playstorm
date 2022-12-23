package com.applovin.impl.mediation.p028a;

import android.os.Bundle;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.f */
public class C1578f {

    /* renamed from: a */
    private final JSONObject f2065a;

    /* renamed from: b */
    protected final C1959m f2066b;

    /* renamed from: c */
    private final JSONObject f2067c;

    /* renamed from: d */
    private final Map<String, Object> f2068d;

    /* renamed from: e */
    private final Object f2069e = new Object();

    /* renamed from: f */
    private final Object f2070f = new Object();

    /* renamed from: g */
    private String f2071g;

    /* renamed from: h */
    private String f2072h;

    public C1578f(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f2066b = mVar;
            this.f2065a = jSONObject2;
            this.f2067c = jSONObject;
            this.f2068d = map;
        } else {
            throw new IllegalArgumentException("No ad object specified");
        }
    }

    /* renamed from: a */
    private int mo13133a() {
        return mo13231b("mute_state", mo13224a("mute_state", ((Integer) this.f2066b.mo14311a(C1856a.f3028K)).intValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public JSONObject mo13205I() {
        JSONObject jSONObject;
        synchronized (this.f2070f) {
            jSONObject = this.f2065a;
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public JSONObject mo13206J() {
        JSONObject jSONObject;
        synchronized (this.f2069e) {
            jSONObject = this.f2067c;
        }
        return jSONObject;
    }

    /* renamed from: K */
    public String mo13207K() {
        return mo13234b("class", (String) null);
    }

    /* renamed from: L */
    public String mo13208L() {
        return mo13234b("name", (String) null);
    }

    /* renamed from: M */
    public String mo13209M() {
        return mo13208L().split("_")[0];
    }

    /* renamed from: N */
    public boolean mo13210N() {
        return mo13233b("is_testing", (Boolean) false).booleanValue();
    }

    /* renamed from: O */
    public Boolean mo13211O() {
        String str = this.f2066b.mo14363p().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13236b("huc") ? mo13233b("huc", (Boolean) false) : mo13226a("huc", (Boolean) null);
    }

    /* renamed from: P */
    public Boolean mo13212P() {
        String str = this.f2066b.mo14363p().getExtraParameters().get("aru");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13236b("aru") ? mo13233b("aru", (Boolean) false) : mo13226a("aru", (Boolean) null);
    }

    /* renamed from: Q */
    public Boolean mo13213Q() {
        String str = this.f2066b.mo14363p().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : mo13236b("dns") ? mo13233b("dns", (Boolean) false) : mo13226a("dns", (Boolean) null);
    }

    /* renamed from: R */
    public String mo13214R() {
        return mo13236b("consent_string") ? mo13234b("consent_string", (String) null) : mo13227a("consent_string", (String) null);
    }

    /* renamed from: S */
    public boolean mo13215S() {
        return mo13233b("run_on_ui_thread", (Boolean) true).booleanValue();
    }

    /* renamed from: T */
    public Map<String, Object> mo13216T() {
        return this.f2068d;
    }

    /* renamed from: U */
    public Bundle mo13217U() {
        Bundle bundle = mo13237c("server_parameters") instanceof JSONObject ? JsonUtils.toBundle(mo13229a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = mo13133a();
        if (a != -1) {
            bundle.putBoolean("is_muted", a == 2 ? this.f2066b.mo14363p().isMuted() : a == 0);
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", mo13225a("amount", 0));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", mo13227a("currency", ""));
        }
        return bundle;
    }

    /* renamed from: V */
    public Bundle mo13218V() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), mo13217U());
    }

    /* renamed from: W */
    public long mo13219W() {
        return mo13232b("adapter_timeout_ms", ((Long) this.f2066b.mo14311a(C1856a.f3051l)).longValue());
    }

    /* renamed from: X */
    public long mo13220X() {
        return mo13232b("init_completion_delay_ms", -1);
    }

    /* renamed from: Y */
    public long mo13221Y() {
        return mo13232b("auto_init_delay_ms", 0);
    }

    /* renamed from: Z */
    public String mo13222Z() {
        return this.f2072h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo13223a(String str, float f) {
        float f2;
        synchronized (this.f2069e) {
            f2 = JsonUtils.getFloat(this.f2067c, str, f);
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13224a(String str, int i) {
        int i2;
        synchronized (this.f2070f) {
            i2 = JsonUtils.getInt(this.f2065a, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo13225a(String str, long j) {
        long j2;
        synchronized (this.f2070f) {
            j2 = JsonUtils.getLong(this.f2065a, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo13226a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f2070f) {
            bool2 = JsonUtils.getBoolean(this.f2065a, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo13227a(String str, String str2) {
        String string;
        synchronized (this.f2070f) {
            string = JsonUtils.getString(this.f2065a, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo13228a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f2070f) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2065a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo13229a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f2069e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f2067c, str, jSONObject);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13230a(String str, Object obj) {
        synchronized (this.f2069e) {
            JsonUtils.putObject(this.f2067c, str, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13231b(String str, int i) {
        int i2;
        synchronized (this.f2069e) {
            i2 = JsonUtils.getInt(this.f2067c, str, i);
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo13232b(String str, long j) {
        long j2;
        synchronized (this.f2069e) {
            j2 = JsonUtils.getLong(this.f2067c, str, j);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Boolean mo13233b(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f2069e) {
            bool2 = JsonUtils.getBoolean(this.f2067c, str, bool);
        }
        return bool2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13234b(String str, String str2) {
        String string;
        synchronized (this.f2069e) {
            string = JsonUtils.getString(this.f2067c, str, str2);
        }
        return string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo13235b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f2069e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2067c, str, jSONArray);
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo13236b(String str) {
        boolean has;
        synchronized (this.f2069e) {
            has = this.f2067c.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo13237c(String str) {
        Object opt;
        synchronized (this.f2069e) {
            opt = this.f2067c.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13238c(String str, int i) {
        synchronized (this.f2069e) {
            JsonUtils.putInt(this.f2067c, str, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13239c(String str, long j) {
        synchronized (this.f2069e) {
            JsonUtils.putLong(this.f2067c, str, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13240c(String str, String str2) {
        synchronized (this.f2069e) {
            JsonUtils.putString(this.f2067c, str, str2);
        }
    }

    /* renamed from: d */
    public void mo13241d(String str) {
        this.f2071g = str;
    }

    /* renamed from: e */
    public void mo13242e(String str) {
        this.f2072h = str;
    }

    /* renamed from: f */
    public List<String> mo13243f(String str) {
        if (str != null) {
            List optList = JsonUtils.optList(mo13228a(str, new JSONArray()), Collections.EMPTY_LIST);
            List optList2 = JsonUtils.optList(mo13235b(str, new JSONArray()), Collections.EMPTY_LIST);
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* renamed from: g */
    public String mo13244g(String str) {
        String b = mo13234b(str, "");
        return StringUtils.isValidString(b) ? b : mo13227a(str, "");
    }

    public String getAdUnitId() {
        return mo13227a("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f2071g;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + mo13207K() + "', adapterName='" + mo13208L() + "', isTesting=" + mo13210N() + '}';
    }
}
