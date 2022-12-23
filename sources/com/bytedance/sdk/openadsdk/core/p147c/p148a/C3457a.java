package com.bytedance.sdk.openadsdk.core.p147c.p148a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.a */
/* compiled from: DynamicAdInfo */
public class C3457a {

    /* renamed from: a */
    private String f8387a;

    /* renamed from: b */
    private String f8388b;

    /* renamed from: c */
    private String f8389c;

    public C3457a(String str, String str2, String str3) {
        this.f8387a = str;
        this.f8388b = str2;
        this.f8389c = str3;
    }

    /* renamed from: a */
    public JSONObject mo19463a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f8387a)) {
                jSONObject.put(BidResponsedEx.KEY_CID, this.f8387a);
            }
            if (!TextUtils.isEmpty(this.f8388b)) {
                jSONObject.put("log_extra", this.f8388b);
            }
            if (!TextUtils.isEmpty(this.f8389c)) {
                jSONObject.put(DownloadModel.DOWNLOAD_URL, this.f8389c);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
