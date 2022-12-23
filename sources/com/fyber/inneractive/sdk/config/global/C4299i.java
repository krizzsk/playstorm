package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.i */
public class C4299i implements C4280d {

    /* renamed from: a */
    public Set<Long> f10642a = new HashSet();

    /* renamed from: b */
    public boolean f10643b;

    public C4299i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f10642a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f10643b = z;
    }

    /* renamed from: a */
    public boolean mo24305a(C4281e eVar) {
        if (this.f10642a.isEmpty() || eVar == null || eVar.f10620b == null) {
            return false;
        }
        for (Long equals : this.f10642a) {
            if (equals.equals(eVar.f10620b)) {
                return !this.f10643b;
            }
        }
        return this.f10643b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"pub_id", this.f10642a, Boolean.valueOf(this.f10643b)});
    }
}
