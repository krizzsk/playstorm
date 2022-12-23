package com.fyber.inneractive.sdk.p189dv.handler;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.b */
public class C4366b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdFormat f10770a;

    /* renamed from: b */
    public final /* synthetic */ C4368c f10771b;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.b$a */
    public class C4367a extends QueryInfoGenerationCallback {
        public C4367a() {
        }

        public void onFailure(String str) {
            String str2;
            C4366b bVar = C4366b.this;
            C4368c cVar = bVar.f10771b;
            if (!cVar.f10774b) {
                AdFormat adFormat = bVar.f10770a;
                cVar.getClass();
                IAlog.m16699a(String.format("Firing Event 1000 - Fetch error DV - msg  %s", new Object[]{str}), new Object[0]);
                C4569q.C4570a aVar = new C4569q.C4570a(C4565o.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("message", str);
                } catch (Exception unused) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", str);
                }
                try {
                    str2 = MobileAds.getVersionString();
                } catch (Exception unused2) {
                    str2 = "na";
                }
                try {
                    jSONObject.put("version", str2);
                } catch (Exception unused3) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "version", str2);
                }
                String name = adFormat.name();
                try {
                    jSONObject.put("adFormat", name);
                } catch (Exception unused4) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "adFormat", name);
                }
                Integer valueOf = Integer.valueOf(cVar.f10776d);
                try {
                    jSONObject.put("success_count", valueOf);
                } catch (Exception unused5) {
                    IAlog.m16703e("Got exception adding param to json object: %s, %s", "success_count", valueOf);
                }
                aVar.f11368f.put(jSONObject);
                aVar.mo24768a((String) null);
                boolean unused6 = C4366b.this.f10771b.f10774b = true;
            }
        }

        public void onSuccess(QueryInfo queryInfo) {
            IAlog.m16699a("DVHanlder - %s - put query: %s", C4366b.this.f10770a.toString(), queryInfo.getQuery());
            synchronized (C4366b.this.f10771b.f10775c) {
                C4366b bVar = C4366b.this;
                C4368c cVar = bVar.f10771b;
                cVar.f10776d++;
                cVar.f10773a.put(bVar.f10770a, queryInfo);
            }
        }
    }

    public C4366b(C4368c cVar, AdFormat adFormat) {
        this.f10771b = cVar;
        this.f10770a = adFormat;
    }

    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_3");
            QueryInfo.generate(C5350l.f14216a, this.f10770a, new AdRequest.Builder().setRequestAgent(String.format("FyberMarketplace-v%s", new Object[]{"8.1.5"})).addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new C4367a());
        } catch (Throwable unused) {
        }
    }
}
