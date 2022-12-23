package com.bytedance.sdk.openadsdk.core.p151e;

import com.bytedance.sdk.component.utils.C2975l;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.c */
/* compiled from: AppInfo */
public class C3472c {

    /* renamed from: f */
    private static int f8419f = 1;

    /* renamed from: g */
    private static int f8420g = 5;

    /* renamed from: a */
    private String f8421a = "";

    /* renamed from: b */
    private String f8422b = "";

    /* renamed from: c */
    private String f8423c = "";

    /* renamed from: d */
    private double f8424d = -1.0d;

    /* renamed from: e */
    private int f8425e = -1;

    /* renamed from: h */
    private int f8426h;

    /* renamed from: a */
    public String mo19491a() {
        return this.f8421a;
    }

    /* renamed from: a */
    public void mo19494a(String str) {
        this.f8421a = str;
    }

    /* renamed from: b */
    public String mo19495b() {
        return this.f8422b;
    }

    /* renamed from: b */
    public void mo19497b(String str) {
        this.f8422b = str;
    }

    /* renamed from: c */
    public String mo19498c() {
        return this.f8423c;
    }

    /* renamed from: c */
    public void mo19499c(String str) {
        this.f8423c = str;
    }

    /* renamed from: d */
    public double mo19500d() {
        return this.f8424d;
    }

    /* renamed from: a */
    public void mo19492a(double d) {
        if (d < ((double) f8419f) || d > ((double) f8420g)) {
            this.f8424d = -1.0d;
        } else {
            this.f8424d = d;
        }
    }

    /* renamed from: e */
    public int mo19501e() {
        return this.f8425e;
    }

    /* renamed from: a */
    public void mo19493a(int i) {
        if (i <= 0) {
            this.f8425e = -1;
        } else {
            this.f8425e = i;
        }
    }

    /* renamed from: f */
    public int mo19502f() {
        return this.f8426h;
    }

    /* renamed from: b */
    public void mo19496b(int i) {
        this.f8426h = i;
    }

    /* renamed from: g */
    public JSONObject mo19503g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, mo19495b());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, mo19502f());
            jSONObject.put("comment_num", mo19501e());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, mo19491a());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, mo19498c());
            jSONObject.put("score", mo19500d());
        } catch (Exception e) {
            C2975l.m8383b(e.toString());
        }
        return jSONObject;
    }
}
