package com.applovin.impl.mediation.p031c;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.network.C2010i;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.d */
public class C1629d extends C1877a {

    /* renamed from: a */
    private final String f2241a;

    /* renamed from: c */
    private final String f2242c;

    /* renamed from: d */
    private final C1578f f2243d;

    /* renamed from: e */
    private final Map<String, String> f2244e;

    /* renamed from: f */
    private final Map<String, String> f2245f;

    /* renamed from: g */
    private final MaxError f2246g;

    public C1629d(String str, Map<String, String> map, MaxError maxError, C1578f fVar, C1959m mVar) {
        super("TaskFireMediationPostbacks", mVar);
        this.f2241a = str;
        this.f2242c = str + "_urls";
        this.f2244e = Utils.toUrlSafeMap(map, mVar);
        this.f2246g = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f2243d = fVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", fVar.mo13208L());
        if (fVar instanceof C1573a) {
            C1573a aVar = (C1573a) fVar;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.mo13162l());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f2245f = hashMap;
    }

    /* renamed from: a */
    private String m3241a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), mo14146d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, mo14146d()));
    }

    /* renamed from: a */
    private List<String> m3242a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String next2 : map.keySet()) {
                next = next.replace(next2, this.f2243d.mo13244g(map.get(next2)));
            }
            arrayList.add(m3241a(m3247b(next, map2), maxError));
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, String> m3243a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f3467b.mo14311a(C1856a.f3048i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: a */
    private void m3245a(String str, Map<String, Object> map) {
        mo14146d().mo14305U().mo14541a(C2007h.m4678o().mo14575c(str).mo14572b(ShareTarget.METHOD_POST).mo14573b(this.f2245f).mo14570a(false).mo14576c(map).mo14574b(((Boolean) this.f3467b.mo14311a(C1856a.f3039V)).booleanValue()).mo14571a());
    }

    /* renamed from: a */
    private void m3246a(List<String> list) {
        if (!list.isEmpty()) {
            for (String c : list) {
                mo14146d().mo14305U().mo14541a(C2007h.m4678o().mo14575c(c).mo14570a(false).mo14573b(this.f2245f).mo14571a());
            }
        }
    }

    /* renamed from: b */
    private String m3247b(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            str = str.replace(next, StringUtils.emptyIfNull(map.get(next)));
        }
        return str;
    }

    /* renamed from: b */
    private void m3248b(List<String> list) {
        if (!list.isEmpty()) {
            for (String d : list) {
                mo14146d().mo14308X().dispatchPostbackRequest(C2010i.m4714b(mo14146d()).mo14501a(d).mo14512c(false).mo14508b(this.f2245f).mo14505a(), C1908o.C1910a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() {
                    public void onPostbackFailure(String str, int i) {
                        if (C2092v.m5047a()) {
                            C1629d dVar = C1629d.this;
                            dVar.mo14147d("Failed to fire postback with code: " + i + " and url: " + str);
                        }
                    }

                    public void onPostbackSuccess(String str) {
                    }
                });
            }
        }
    }

    public void run() {
        List<String> f = this.f2243d.mo13243f(this.f2242c);
        Map<String, String> a = m3243a();
        if (((Boolean) mo14146d().mo14311a(C1856a.f3033P)).booleanValue()) {
            for (String b : f) {
                Uri parse = Uri.parse(m3241a(m3247b(b, this.f2244e), this.f2246g));
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                HashMap hashMap = new HashMap(a.size());
                for (String next : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(next);
                    if (a.containsKey(queryParameter)) {
                        hashMap.put(next, this.f2243d.mo13244g(a.get(queryParameter)));
                    } else {
                        clearQuery.appendQueryParameter(next, queryParameter);
                    }
                }
                m3245a(clearQuery.build().toString(), (Map<String, Object>) hashMap);
            }
            return;
        }
        List<String> a2 = m3242a(f, a, this.f2244e, this.f2246g);
        if (((Boolean) mo14146d().mo14311a(C1856a.f3049j)).booleanValue()) {
            m3246a(a2);
        } else {
            m3248b(a2);
        }
    }
}
