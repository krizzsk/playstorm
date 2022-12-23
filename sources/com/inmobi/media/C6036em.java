package com.inmobi.media;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.em */
/* compiled from: OmidNativeTracker */
public final class C6036em extends C5922cf {

    /* renamed from: i */
    private static final String f15356i = C6036em.class.getSimpleName();

    /* renamed from: g */
    public final String f15357g;

    /* renamed from: h */
    public final String f15358h;

    public C6036em(String str, String str2, String str3, String str4, Map<String, String> map) {
        super(str3, 0, str4, map);
        this.f15358h = str;
        this.f15357g = str2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f15001a);
            jSONObject.put("url", this.f15002b);
            jSONObject.put("eventType", this.f15004d);
            jSONObject.put("eventId", this.f15003c);
            if (!TextUtils.isEmpty(this.f15358h)) {
                jSONObject.put("vendorKey", this.f15358h);
            }
            if (!TextUtils.isEmpty(this.f15357g)) {
                jSONObject.put("verificationParams", this.f15357g);
            }
            Map map = this.f15005e;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", C6239hv.m18611a((Map<String, String>) map, ","));
            return jSONObject.toString();
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }
}
