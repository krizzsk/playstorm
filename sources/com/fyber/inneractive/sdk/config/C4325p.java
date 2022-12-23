package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.global.C4302l;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4542f;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.network.C4579u;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.p */
public class C4325p implements C4579u<C4302l> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f10680a;

    public C4325p(IAConfigManager iAConfigManager) {
        this.f10680a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo24228a(Object obj, Exception exc, boolean z) {
        C4302l lVar = (C4302l) obj;
        if (lVar != null) {
            IAlog.m16699a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            this.f10680a.f10561z.f10611a = lVar;
        } else if (exc == null) {
        } else {
            if (exc instanceof C4542f) {
                IAlog.m16699a("remote features config not modified", new Object[0]);
                return;
            }
            IAlog.m16699a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager = this.f10680a;
            IAConfigManager iAConfigManager2 = IAConfigManager.f10525J;
            iAConfigManager.getClass();
            new C4569q.C4570a(C4565o.FATAL_FEATURES_CONFIG_ERROR, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null).mo24767a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).mo24768a((String) null);
        }
    }
}
