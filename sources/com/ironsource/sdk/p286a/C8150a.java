package com.ironsource.sdk.p286a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sdk.a.a */
public final class C8150a {

    /* renamed from: a */
    public HashMap<String, Object> f19410a = new HashMap<>();

    /* renamed from: a */
    public final C8150a mo56415a(String str, Object obj) {
        if (obj != null) {
            this.f19410a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
