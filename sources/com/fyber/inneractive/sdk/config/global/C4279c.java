package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.c */
public class C4279c implements C4280d {

    /* renamed from: a */
    public Set<Long> f10617a = new HashSet();

    /* renamed from: b */
    public boolean f10618b;

    public C4279c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f10617a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f10618b = z;
    }

    /* renamed from: a */
    public boolean mo24305a(C4281e eVar) {
        if (this.f10617a.isEmpty() || eVar == null || eVar.f10619a == null) {
            return false;
        }
        for (Long equals : this.f10617a) {
            if (equals.equals(eVar.f10619a)) {
                return !this.f10618b;
            }
        }
        return this.f10618b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"demand", this.f10617a, Boolean.valueOf(this.f10618b)});
    }
}
