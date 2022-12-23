package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.h */
public class C4298h implements C4280d {

    /* renamed from: a */
    public Set<String> f10640a = new HashSet();

    /* renamed from: b */
    public boolean f10641b;

    public C4298h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f10640a.add(optString);
                }
            }
        }
        this.f10641b = z;
    }

    /* renamed from: a */
    public boolean mo24305a(C4281e eVar) {
        if (this.f10640a.isEmpty() || eVar == null || eVar.f10621c == null) {
            return false;
        }
        for (String equals : this.f10640a) {
            if (equals.equals(eVar.f10621c.value())) {
                return !this.f10641b;
            }
        }
        return this.f10641b;
    }

    public String toString() {
        return String.format("%s - %s include: %b", new Object[]{"placement_type", this.f10640a, Boolean.valueOf(this.f10641b)});
    }
}
