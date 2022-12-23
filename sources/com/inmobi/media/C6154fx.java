package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fx */
/* compiled from: ConfigNetworkRequest */
public final class C6154fx extends C6206gx {

    /* renamed from: d */
    private static final String f15598d = C6154fx.class.getSimpleName();

    /* renamed from: e */
    private static String f15599e = "https://config.inmobi.com/config-server/v1/config/secure.cfg";

    /* renamed from: u */
    private static Map<String, String> f15600u;

    /* renamed from: a */
    int f15601a;

    /* renamed from: b */
    int f15602b;

    /* renamed from: c */
    Map<String, C6144fr> f15603c;

    C6154fx(Map<String, C6144fr> map, C6271ir irVar, String str, int i, int i2, boolean z, String str2) {
        this(map, irVar, str, i, i2, false, z, str2);
    }

    /* renamed from: a */
    public final void mo34922a() {
        super.mo34922a();
        this.f15708h.put("p", m18349h());
        this.f15708h.put("im-accid", this.f15719s);
        Map<String, String> map = f15600u;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!this.f15706f.containsKey(next.getKey())) {
                    this.f15706f.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
    }

    /* renamed from: h */
    private String m18349h() {
        long j;
        new C6149ft();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f15603c.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", next.getKey());
                if (((C6144fr) next.getValue()).mo35331g() == null) {
                    j = 0;
                } else {
                    j = C6149ft.m18342c((String) next.getKey(), ((C6144fr) next.getValue()).mo35331g());
                }
                jSONObject.put("t", j);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final String mo35339b() {
        return this.f15719s;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6154fx(Map<String, C6144fr> map, C6271ir irVar, String str, int i, int i2, boolean z, boolean z2, String str2) {
        super(ShareTarget.METHOD_POST, ((map.get("root") != null) || str == null || str.trim().length() == 0) ? z ? "https://config.inmobi.com/config-server/v1/config/secure.cfg" : f15599e : str, irVar, z2, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15603c = map;
        this.f15601a = i;
        this.f15602b = i2;
        this.f15719s = str2;
    }
}
