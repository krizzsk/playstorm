package com.ironsource.sdk.p287b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.d */
public final class C8163d {

    /* renamed from: a */
    HashMap<String, Boolean> f19462a = new HashMap<String, Boolean>() {
        {
            boolean z = true;
            put("isVisible", Boolean.valueOf(C8163d.this.f19463b == 0));
            put("isWindowVisible", Boolean.valueOf(C8163d.this.f19464c != 0 ? false : z));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    /* renamed from: b */
    int f19463b = 4;

    /* renamed from: c */
    int f19464c = 4;

    C8163d() {
    }

    /* renamed from: a */
    public final JSONObject mo56436a() {
        return new JSONObject(this.f19462a);
    }
}
