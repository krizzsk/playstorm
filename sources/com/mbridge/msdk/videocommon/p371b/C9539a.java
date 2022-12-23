package com.mbridge.msdk.videocommon.p371b;

import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.a */
/* compiled from: AdParams */
public final class C9539a {

    /* renamed from: a */
    private String f23384a;

    /* renamed from: b */
    private String f23385b;

    private C9539a(String str, String str2) {
        this.f23384a = str;
        this.f23385b = str2;
    }

    /* renamed from: a */
    public static C9539a m27258a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C9539a(jSONObject.optString("appId"), jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
