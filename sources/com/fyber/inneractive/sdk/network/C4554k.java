package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.k */
public abstract class C4554k {

    /* renamed from: a */
    public String f11251a;

    /* renamed from: b */
    public Map<String, Object> f11252b;

    /* renamed from: c */
    public String f11253c = null;

    public C4554k(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11252b = new HashMap();
            this.f11251a = str;
            return;
        }
        throw new InvalidParameterException();
    }

    /* renamed from: a */
    public void mo24761a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f11252b.put(str, obj);
        }
    }
}
