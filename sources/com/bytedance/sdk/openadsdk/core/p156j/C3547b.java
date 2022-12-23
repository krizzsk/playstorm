package com.bytedance.sdk.openadsdk.core.p156j;

import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b */
/* compiled from: VastIcon */
public class C3547b extends C3557c {

    /* renamed from: i */
    private long f8911i;

    /* renamed from: j */
    private long f8912j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3547b(int i, int i2, long j, long j2, C3559a.C3562a aVar, C3559a.C3563b bVar, String str, List<C3553c> list, List<C3553c> list2, String str2) {
        super(i, i2, aVar, bVar, str, list, list2, str2);
        this.f8911i = j;
        this.f8912j = j2;
    }

    /* renamed from: a */
    public JSONObject mo20006a() throws JSONException {
        JSONObject a = super.mo20006a();
        if (a != null) {
            a.put("offset", this.f8911i);
            a.put("duration", this.f8912j);
        }
        return a;
    }

    /* renamed from: a */
    public static C3547b m11102a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C3557c b = C3557c.m11132b(jSONObject);
        if (b == null) {
            return null;
        }
        long optLong = jSONObject2.optLong("offset", -1);
        long optLong2 = jSONObject2.optLong("duration", -1);
        return new C3547b(b.f8933a, b.f8934b, optLong, optLong2, b.f8935c, b.f8936d, b.f8937e, b.f8938f, b.f8939g, b.f8940h);
    }
}
