package com.applovin.impl.sdk.p050e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C1990c;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.m */
public class C1902m extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1904a f3508a;

    /* renamed from: com.applovin.impl.sdk.e.m$a */
    public interface C1904a {
        /* renamed from: a */
        void mo13820a();
    }

    public C1902m(C1959m mVar, C1904a aVar) {
        super("TaskFetchVariables", mVar);
        this.f3508a = aVar;
    }

    /* renamed from: a */
    private Map<String, String> m4238a() {
        return Utils.stringifyObjectMap(this.f3467b.mo14306V().mo14598a((Map<String, String>) null, false, false));
    }

    public void run() {
        C19031 r1 = new C1925u<JSONObject>(C1990c.m4570a(this.f3467b).mo14501a(C2040h.m4914k(this.f3467b)).mo14511c(C2040h.m4915l(this.f3467b)).mo14502a(m4238a()).mo14507b(ShareTarget.METHOD_GET).mo14500a(new JSONObject()).mo14506b(((Integer) this.f3467b.mo14311a(C1857b.f3256dc)).intValue()).mo14505a(), this.f3467b) {
            /* renamed from: a */
            public void mo13362a(int i, String str, JSONObject jSONObject) {
                if (C2092v.m5047a()) {
                    mo14147d("Unable to fetch variables: server returned " + i);
                    C2092v.m5053i("AppLovinVariableService", "Failed to load variables.");
                }
                C1902m.this.f3508a.mo13820a();
            }

            /* renamed from: a */
            public void mo13364a(JSONObject jSONObject, int i) {
                C2040h.m4905d(jSONObject, this.f3467b);
                C2040h.m4904c(jSONObject, this.f3467b);
                C2040h.m4909f(jSONObject, this.f3467b);
                C2040h.m4907e(jSONObject, this.f3467b);
                C1902m.this.f3508a.mo13820a();
            }
        };
        r1.mo14230a(C1857b.f3094aX);
        r1.mo14232b(C1857b.f3095aY);
        this.f3467b.mo14303S().mo14205a((C1877a) r1);
    }
}
