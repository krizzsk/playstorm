package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.k */
public class C4338k {

    /* renamed from: a */
    public Integer f10736a;

    /* renamed from: b */
    public Integer f10737b;

    /* renamed from: c */
    public Set<Vendor> f10738c = null;

    /* renamed from: a */
    public static C4338k m13565a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optInt("pausePct", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("playPct", Integer.MIN_VALUE));
        C4338k kVar = new C4338k();
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        kVar.f10736a = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        kVar.f10737b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray(Verification.VENDOR);
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i, (String) null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            kVar.f10738c = linkedHashSet;
        }
        return kVar;
    }
}
