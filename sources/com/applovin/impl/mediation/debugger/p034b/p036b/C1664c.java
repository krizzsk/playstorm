package com.applovin.impl.mediation.debugger.p034b.p036b;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.utils.C2035d;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.c */
public class C1664c {

    /* renamed from: a */
    private final boolean f2391a;

    /* renamed from: b */
    private final boolean f2392b;

    /* renamed from: c */
    private final boolean f2393c;

    /* renamed from: d */
    private final String f2394d;

    public C1664c(JSONObject jSONObject, C1959m mVar) {
        this.f2391a = C2035d.m4871a(mVar.mo14297L()).mo14668a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 != null) {
            this.f2392b = true;
            this.f2394d = JsonUtils.getString(jSONObject2, "description", "");
            if (C2040h.m4898a()) {
                this.f2393c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C2040h.m4901a((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            this.f2393c = z;
            return;
        }
        this.f2392b = false;
        this.f2394d = "";
        this.f2393c = C2040h.m4898a();
    }

    /* renamed from: a */
    public boolean mo13459a() {
        return this.f2392b;
    }

    /* renamed from: b */
    public boolean mo13460b() {
        boolean z = this.f2393c;
        return z && (this.f2391a || z);
    }

    /* renamed from: c */
    public String mo13461c() {
        return this.f2391a ? this.f2394d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
