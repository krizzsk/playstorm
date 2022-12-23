package com.bytedance.sdk.component.p090a;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.w */
/* compiled from: PermissionConfigRepository */
class C2592w {

    /* renamed from: a */
    private final Collection<String> f5547a;

    /* renamed from: b */
    private final Map<String, C2587v> f5548b;

    /* renamed from: c */
    private final C2570k f5549c;

    /* renamed from: d */
    private final Set<C2593a> f5550d;

    /* renamed from: com.bytedance.sdk.component.a.w$a */
    /* compiled from: PermissionConfigRepository */
    interface C2593a {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2587v mo16615a(String str) {
        if (this.f5547a.contains(str) || TextUtils.equals(str, "host")) {
            return m6592a(str, (JSONObject) null);
        }
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16616a(C2593a aVar) {
        this.f5550d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16617b(C2593a aVar) {
        this.f5550d.remove(aVar);
    }

    /* renamed from: a */
    private C2587v m6592a(String str, JSONObject jSONObject) {
        C2587v vVar = this.f5548b.get(str);
        if (vVar == null) {
            C2587v vVar2 = new C2587v(str, this.f5549c.mo16580c(), this.f5549c.mo16578a(), this.f5549c.mo16579b(), jSONObject);
            this.f5548b.put(str, vVar2);
            return vVar2;
        } else if (jSONObject == null) {
            return vVar;
        } else {
            vVar.mo16614a(jSONObject);
            return vVar;
        }
    }
}
