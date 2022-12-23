package com.applovin.impl.sdk.p050e;

import android.text.TextUtils;
import com.applovin.impl.adview.C1513d;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C2010i;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.g */
public class C1890g extends C1877a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2010i f3491a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinPostbackListener f3492c;

    /* renamed from: d */
    private final C1908o.C1910a f3493d;

    public C1890g(C2010i iVar, C1908o.C1910a aVar, C1959m mVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", mVar);
        if (iVar != null) {
            this.f3491a = iVar;
            this.f3492c = appLovinPostbackListener;
            this.f3493d = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4197a() {
        C18922 r0 = new C1925u<Object>(this.f3491a, mo14146d()) {

            /* renamed from: a */
            final String f3495a = C1890g.this.f3491a.mo14478a();

            /* renamed from: a */
            public void mo13362a(int i, String str, Object obj) {
                if (C2092v.m5047a()) {
                    mo14147d("Failed to dispatch postback. Error code: " + i + " URL: " + this.f3495a);
                }
                if (C1890g.this.f3492c != null) {
                    C1890g.this.f3492c.onPostbackFailure(this.f3495a, i);
                }
                if (C1890g.this.f3491a.mo14579p()) {
                    this.f3467b.mo14334ag().mo14262a(C1890g.this.f3491a.mo14580q(), this.f3495a, i, obj, str, false);
                }
            }

            /* renamed from: a */
            public void mo13364a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String next : this.f3467b.mo14344b(C1857b.f3085aO)) {
                        if (next.startsWith(next)) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    C2040h.m4905d(jSONObject, this.f3467b);
                                    C2040h.m4904c(jSONObject, this.f3467b);
                                    C2040h.m4907e(jSONObject, this.f3467b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (C1890g.this.f3492c != null) {
                    C1890g.this.f3492c.onPostbackSuccess(this.f3495a);
                }
                if (C1890g.this.f3491a.mo14579p()) {
                    this.f3467b.mo14334ag().mo14262a(C1890g.this.f3491a.mo14580q(), this.f3495a, i, obj, (String) null, true);
                }
            }
        };
        r0.mo14231a(this.f3493d);
        mo14146d().mo14303S().mo14205a((C1877a) r0);
    }

    public void run() {
        if (!StringUtils.isValidString(this.f3491a.mo14478a())) {
            if (C2092v.m5047a()) {
                mo14144b("Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f3492c;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f3491a.mo14478a(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f3491a.mo14581r()) {
            C1513d.m2774a(this.f3491a, mo14146d(), new AppLovinPostbackListener() {
                public void onPostbackFailure(String str, int i) {
                    C1890g.this.m4197a();
                }

                public void onPostbackSuccess(String str) {
                    if (C1890g.this.f3492c != null) {
                        C1890g.this.f3492c.onPostbackSuccess(C1890g.this.f3491a.mo14478a());
                    }
                }
            });
        } else {
            m4197a();
        }
    }
}
