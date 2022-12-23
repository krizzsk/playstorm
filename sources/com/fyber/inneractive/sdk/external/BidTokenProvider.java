package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.C4209a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

public final class BidTokenProvider {
    public static String getBidderToken() {
        boolean z = false;
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.m16700b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        C4209a aVar = C4209a.f10389h;
        if (aVar.f10395f.get() == null) {
            aVar.mo24089a();
        } else {
            aVar.mo24091b();
        }
        String str = aVar.f10395f.get();
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        String str2 = iAConfigManager.f10548m;
        int i = 2000;
        if (!TextUtils.isEmpty(str2)) {
            i = iAConfigManager.f10557v.f10660b.mo24345a(aVar.f10394e.get(str2.toLowerCase()), 2000, 1);
        } else {
            str2 = "unknown";
        }
        if (str != null && str.getBytes().length > i) {
            C4565o oVar = C4565o.TOKEN_EXCEEDS_LIMIT;
            C4569q.C4570a aVar2 = new C4569q.C4570a((C5291e) null);
            aVar2.f11364b = oVar;
            aVar2.f11363a = null;
            aVar2.f11366d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer valueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", valueOf);
            } catch (Exception unused2) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "token_size", valueOf);
            }
            Integer valueOf2 = Integer.valueOf(i);
            try {
                jSONObject.put("token_limit", valueOf2);
            } catch (Exception unused3) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
            }
            aVar2.f11368f.put(jSONObject);
            aVar2.mo24768a((String) null);
            z = true;
        }
        if (z) {
            return null;
        }
        return str;
    }
}
