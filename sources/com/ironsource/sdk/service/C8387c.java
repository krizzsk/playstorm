package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.C6434k;
import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.sdk.p290e.p291a.C8333a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.c */
public final class C8387c {

    /* renamed from: a */
    private C6590a f20110a = new C6590a();

    /* renamed from: a */
    public final void mo56895a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", C8333a.f19967a);
        hashMap.put("ompv", "7");
        C6590a.m20033a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public final void mo56896a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C6590a.m20031a("imm", (Object) Boolean.valueOf(C6429h.m19305a(activity)));
            }
        }
    }

    /* renamed from: b */
    public final void mo56897b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                C6590a.m20031a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo56898b(Context context) {
        C6590a.m20031a("gpi", (Object) Boolean.valueOf(C6434k.m19355a(context)));
    }

    /* renamed from: c */
    public final void mo56899c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C6590a.m20032a(TapjoyConstants.TJC_DEBUG, jSONObject);
        }
    }
}
