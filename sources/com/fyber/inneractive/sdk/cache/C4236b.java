package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.b */
public class C4236b implements C4235a<C4310h> {

    /* renamed from: a */
    public static final String f10479a = String.format("https://%sconfig_android.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo24242a(Object obj) {
        C4310h hVar = (C4310h) obj;
    }

    /* renamed from: b */
    public String mo24243b() {
        return "IALastModifiedFromHeader.global";
    }

    /* renamed from: c */
    public String mo24244c() {
        return "ia-global.config";
    }

    /* renamed from: d */
    public boolean mo24245d() {
        return true;
    }

    /* renamed from: a */
    public Object mo24240a(String str) throws Exception {
        try {
            return C4310h.m13539a(new JSONObject(str));
        } catch (JSONException e) {
            IAlog.m16700b("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public String mo24241a() {
        int i = C4273e.f10606a;
        if (System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return f10479a;
        }
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
