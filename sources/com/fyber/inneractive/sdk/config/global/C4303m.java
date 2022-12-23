package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.cache.C4235a;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.m */
public class C4303m implements C4235a<C4302l> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo24242a(Object obj) {
        C4302l lVar = (C4302l) obj;
    }

    /* renamed from: b */
    public String mo24243b() {
        return "IALastModifiedFromHeader.remote";
    }

    /* renamed from: c */
    public String mo24244c() {
        return "ia-remote.config";
    }

    /* renamed from: d */
    public boolean mo24245d() {
        return true;
    }

    /* renamed from: a */
    public Object mo24240a(String str) throws Exception {
        try {
            return C4302l.m13504a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m16700b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f14137a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    /* renamed from: a */
    public String mo24241a() {
        int i = C4273e.f10606a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") != null) {
            return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
        }
        return String.format(Locale.ENGLISH, "https://%sfeatures_config.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});
    }
}
