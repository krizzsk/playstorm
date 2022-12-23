package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.mediation.p031c.C1619a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.e */
public class C1727e {

    /* renamed from: a */
    private final C1959m f2632a;

    /* renamed from: b */
    private final C2092v f2633b;

    /* renamed from: c */
    private final AtomicBoolean f2634c = new AtomicBoolean();

    /* renamed from: d */
    private final JSONArray f2635d = new JSONArray();

    /* renamed from: e */
    private final LinkedHashSet<String> f2636e = new LinkedHashSet<>();

    /* renamed from: f */
    private final Object f2637f = new Object();

    /* renamed from: g */
    private List<C1578f> f2638g;

    public C1727e(C1959m mVar) {
        this.f2632a = mVar;
        this.f2633b = mVar.mo14286A();
    }

    /* renamed from: a */
    private List<C1578f> m3629a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1578f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f2632a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo13588a(Activity activity) {
        if (this.f2634c.compareAndSet(false, true)) {
            String str = (String) this.f2632a.mo14312a(C1859d.f3364y);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C1578f> a = m3629a(JsonUtils.getJSONArray(jSONObject, this.f2632a.mo14295J().mo13583a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f2638g = a;
                    this.f2632a.mo14303S().mo14205a((C1877a) new C1619a(a, activity, this.f2632a));
                } catch (JSONException e) {
                    if (C2092v.m5047a()) {
                        this.f2633b.mo14790b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13589a(C1578f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f2637f) {
                z = !mo13594a(fVar);
                if (z) {
                    this.f2636e.add(fVar.mo13207K());
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", fVar.mo13207K());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f2635d.put(jSONObject);
                }
            }
            if (z) {
                this.f2632a.mo14317a(fVar);
                this.f2632a.mo14290E().processAdapterInitializationPostback(fVar, j, initializationStatus, str);
                this.f2632a.mo14334ag().mo14260a(initializationStatus, fVar.mo13207K());
            }
        }
    }

    /* renamed from: a */
    public void mo13590a(C1578f fVar, Activity activity) {
        mo13591a(fVar, activity, (Runnable) null);
    }

    /* renamed from: a */
    public void mo13591a(C1578f fVar, Activity activity, Runnable runnable) {
        List<C1578f> list;
        if (this.f2632a.mo14295J().mo13583a() && (list = this.f2638g) != null) {
            Iterator<C1578f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                C1578f next = it.next();
                if (next.mo13207K().equals(fVar.mo13207K())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar != null) {
            C1730g a = this.f2632a.mo14288C().mo13597a(fVar);
            if (a != null) {
                if (C2092v.m5047a()) {
                    C2092v vVar = this.f2633b;
                    vVar.mo14791c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
                }
                a.mo13610a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.m2910a(fVar), activity, runnable);
            } else if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo13592a(MaxAdapter.InitializationStatus initializationStatus) {
        this.f2632a.mo14334ag().mo14260a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    /* renamed from: a */
    public boolean mo13593a() {
        return this.f2634c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo13594a(C1578f fVar) {
        boolean contains;
        synchronized (this.f2637f) {
            contains = this.f2636e.contains(fVar.mo13207K());
        }
        return contains;
    }

    /* renamed from: b */
    public LinkedHashSet<String> mo13595b() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f2637f) {
            linkedHashSet = this.f2636e;
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public JSONArray mo13596c() {
        JSONArray jSONArray;
        synchronized (this.f2637f) {
            jSONArray = this.f2635d;
        }
        return jSONArray;
    }
}
