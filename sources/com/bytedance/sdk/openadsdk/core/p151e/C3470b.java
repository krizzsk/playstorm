package com.bytedance.sdk.openadsdk.core.p151e;

import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.b */
/* compiled from: AdLogInfoModel */
public class C3470b {

    /* renamed from: a */
    public String f8413a;

    /* renamed from: b */
    public int f8414b;

    /* renamed from: c */
    public int f8415c = 1;

    /* renamed from: d */
    public ArrayList<Integer> f8416d;

    /* renamed from: e */
    public AdSlot f8417e;

    /* renamed from: a */
    public static void m10407a(C3470b bVar) {
        if (bVar != null && bVar.mo19489d() != null) {
            C3815b.m12552a().mo20659a((C3812a) new C3812a(bVar) {

                /* renamed from: a */
                final /* synthetic */ C3470b f8418a;

                {
                    this.f8418a = r1;
                }

                /* renamed from: a */
                public C3813a mo18671a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.MessagePayloadKeys.FROM, this.f8418a.mo19488c());
                    jSONObject.put("err_code", this.f8418a.mo19486b());
                    jSONObject.put("server_res_str", this.f8418a.mo19481a());
                    if (this.f8418a.mo19490e() != null && this.f8418a.mo19490e().size() > 0) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray(this.f8418a.mo19490e()).toString());
                    }
                    C2975l.m8380a("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                    return C3814b.m12522b().mo20634a("rd_client_custom_error").mo20632a(this.f8418a.mo19489d().getDurationSlotType()).mo20636b(jSONObject.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public String mo19481a() {
        return this.f8413a;
    }

    /* renamed from: a */
    public void mo19482a(int i) {
        this.f8414b = i;
    }

    /* renamed from: a */
    public void mo19483a(AdSlot adSlot) {
        this.f8417e = adSlot;
    }

    /* renamed from: a */
    public void mo19484a(String str) {
        this.f8413a = str;
    }

    /* renamed from: a */
    public void mo19485a(ArrayList<Integer> arrayList) {
        this.f8416d = arrayList;
    }

    /* renamed from: b */
    public int mo19486b() {
        return this.f8414b;
    }

    /* renamed from: b */
    public void mo19487b(int i) {
        this.f8415c = i;
    }

    /* renamed from: c */
    public int mo19488c() {
        return this.f8415c;
    }

    /* renamed from: d */
    public AdSlot mo19489d() {
        return this.f8417e;
    }

    /* renamed from: e */
    public ArrayList<Integer> mo19490e() {
        return this.f8416d;
    }
}
