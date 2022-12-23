package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5350l;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.external.b */
public class C4393b implements Runnable {
    public C4393b(InneractiveAdManager inneractiveAdManager) {
    }

    public void run() {
        IAConfigManager iAConfigManager = IAConfigManager.f10525J;
        SharedPreferences sharedPreferences = C5350l.f14216a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (!(sharedPreferences != null && sharedPreferences.contains("IAConfigFQE"))) {
            SharedPreferences sharedPreferences2 = C5350l.f14216a.getSharedPreferences("IAConfigurationPreferences", 0);
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putBoolean("IAConfigFQE", true).apply();
            }
            new C4569q.C4570a(C4567p.FIRST_OPENED, (InneractiveAdRequest) null, (C5291e) null, (JSONArray) null).mo24768a((String) null);
        }
    }
}
