package com.mbridge.msdk.videocommon.p371b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.b */
/* compiled from: AdUnitInfo */
public final class C9540b {

    /* renamed from: a */
    private int f23386a;

    /* renamed from: b */
    private int f23387b;

    /* renamed from: c */
    private C9539a f23388c;

    public C9540b(int i, int i2, C9539a aVar) {
        this.f23386a = i;
        this.f23387b = i2;
        this.f23388c = aVar;
    }

    /* renamed from: a */
    public final int mo63095a() {
        return this.f23386a;
    }

    /* renamed from: b */
    public final int mo63096b() {
        return this.f23387b;
    }

    /* renamed from: a */
    public static List<C9540b> m27259a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new C9540b(optInt, optInt2, optJSONObject2 != null ? C9539a.m27258a(optJSONObject2) : null));
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
