package com.applovin.impl.sdk.p050e;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1985b;
import com.applovin.impl.sdk.p047b.C1854c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.w */
public abstract class C1928w extends C1932y {
    protected C1928w(String str, C1959m mVar) {
        super(str, mVar);
    }

    /* renamed from: a */
    private JSONObject m4299a(C1854c cVar) {
        JSONObject i = mo14241i();
        JsonUtils.putString(i, IronSourceConstants.EVENTS_RESULT, cVar.mo14050b());
        Map<String, String> a = cVar.mo14049a();
        if (a != null) {
            JsonUtils.putJSONObject(i, "params", new JSONObject(a));
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1854c mo13376b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13377b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo13378c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo14151h() {
        return ((Integer) this.f3467b.mo14311a(C1857b.f3169bt)).intValue();
    }

    public void run() {
        C1854c b = mo13376b();
        if (b != null) {
            if (C2092v.m5047a()) {
                mo14142a("Reporting pending reward: " + b + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            mo14240a(m4299a(b), new C1985b.C1989c<JSONObject>() {
                /* renamed from: a */
                public void mo13362a(int i, String str, JSONObject jSONObject) {
                    C1928w.this.mo13374a(i);
                }

                /* renamed from: a */
                public void mo13364a(JSONObject jSONObject, int i) {
                    C1928w.this.mo13377b(jSONObject);
                }
            });
            return;
        }
        if (C2092v.m5047a()) {
            mo14147d("Pending reward not found");
        }
        mo13378c();
    }
}
