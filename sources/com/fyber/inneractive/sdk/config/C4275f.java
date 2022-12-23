package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.config.f */
public class C4275f {

    /* renamed from: a */
    public final Map<String, String> f10609a = new HashMap();

    /* renamed from: a */
    public boolean mo24302a(String str, boolean z) {
        try {
            if (this.f10609a.containsKey(str)) {
                return Boolean.parseBoolean(this.f10609a.get(str));
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
