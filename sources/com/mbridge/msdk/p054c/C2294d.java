package com.mbridge.msdk.p054c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.d */
/* compiled from: UnitSetting */
public final class C2294d {

    /* renamed from: A */
    private int f4654A;

    /* renamed from: B */
    private int f4655B;

    /* renamed from: C */
    private int f4656C;

    /* renamed from: D */
    private String f4657D = "";

    /* renamed from: E */
    private int f4658E = 10;

    /* renamed from: F */
    private int f4659F = 60;

    /* renamed from: G */
    private String f4660G = "";

    /* renamed from: H */
    private int f4661H = 1;

    /* renamed from: I */
    private int f4662I = 100;

    /* renamed from: J */
    private int f4663J = 0;

    /* renamed from: K */
    private int f4664K;

    /* renamed from: L */
    private int f4665L;

    /* renamed from: a */
    private int f4666a;

    /* renamed from: b */
    private int f4667b;

    /* renamed from: c */
    private int f4668c;

    /* renamed from: d */
    private int f4669d = 30;

    /* renamed from: e */
    private String f4670e;

    /* renamed from: f */
    private String f4671f;

    /* renamed from: g */
    private List<Integer> f4672g;

    /* renamed from: h */
    private long f4673h;

    /* renamed from: i */
    private int f4674i = 1;

    /* renamed from: j */
    private List<Integer> f4675j;

    /* renamed from: k */
    private int f4676k;

    /* renamed from: l */
    private int f4677l;

    /* renamed from: m */
    private int f4678m;

    /* renamed from: n */
    private int f4679n;

    /* renamed from: o */
    private String f4680o;

    /* renamed from: p */
    private int f4681p;

    /* renamed from: q */
    private int f4682q = 1;

    /* renamed from: r */
    private int f4683r = 5000;

    /* renamed from: s */
    private int f4684s;

    /* renamed from: t */
    private int f4685t;

    /* renamed from: u */
    private long f4686u;

    /* renamed from: v */
    private String f4687v;

    /* renamed from: w */
    private int f4688w;

    /* renamed from: x */
    private long f4689x;

    /* renamed from: y */
    private long f4690y;

    /* renamed from: z */
    private int f4691z = 60;

    /* renamed from: a */
    public final String mo15583a() {
        return this.f4660G;
    }

    /* renamed from: a */
    public final void mo15584a(int i) {
        this.f4655B = i;
    }

    /* renamed from: b */
    public final void mo15587b(int i) {
        this.f4656C = i;
    }

    /* renamed from: b */
    public final int mo15586b() {
        return this.f4691z;
    }

    /* renamed from: c */
    public final int mo15588c() {
        return this.f4654A;
    }

    /* renamed from: d */
    public final int mo15590d() {
        return this.f4665L;
    }

    /* renamed from: e */
    public final int mo15591e() {
        return this.f4662I;
    }

    /* renamed from: f */
    public final int mo15592f() {
        return this.f4663J;
    }

    /* renamed from: g */
    public final int mo15593g() {
        return this.f4664K;
    }

    /* renamed from: h */
    public final long mo15595h() {
        return this.f4686u;
    }

    /* renamed from: i */
    public final int mo15596i() {
        return this.f4684s;
    }

    /* renamed from: c */
    public final void mo15589c(int i) {
        this.f4684s = i;
    }

    /* renamed from: j */
    public final int mo15597j() {
        return this.f4685t;
    }

    /* renamed from: k */
    public static C2294d m5328k() {
        return new C2294d();
    }

    /* renamed from: l */
    public final int mo15598l() {
        return this.f4679n;
    }

    /* renamed from: m */
    public final int mo15599m() {
        return this.f4682q;
    }

    /* renamed from: n */
    public final int mo15600n() {
        return this.f4683r;
    }

    /* renamed from: o */
    public final int mo15601o() {
        return this.f4677l;
    }

    /* renamed from: p */
    public final int mo15602p() {
        return this.f4678m;
    }

    public final String toString() {
        List<Integer> list = this.f4672g;
        String str = "";
        if (list != null && list.size() > 0) {
            for (Integer num : this.f4672g) {
                str = str + num + ",";
            }
        }
        return "offset = " + this.f4674i + " unitId = " + this.f4670e + " fbPlacementId = " + this.f4671f + str;
    }

    /* renamed from: a */
    public final void mo15585a(String str) {
        this.f4670e = str;
    }

    /* renamed from: q */
    public final List<Integer> mo15603q() {
        return this.f4672g;
    }

    /* renamed from: r */
    public final List<Integer> mo15604r() {
        return this.f4675j;
    }

    /* renamed from: b */
    public static C2294d m5323b(String str) {
        C2294d dVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C2294d dVar2 = new C2294d();
            try {
                JSONObject jSONObject = new JSONObject(str);
                dVar2.f4670e = jSONObject.optString("unitId");
                String optString = jSONObject.optString("ab_id");
                dVar2.f4660G = optString;
                C2350a.f4905c.put(dVar2.f4670e, optString);
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    dVar2.f4672g = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i2)));
                    }
                    dVar2.f4675j = arrayList2;
                }
                dVar2.f4676k = jSONObject.optInt("tpqn");
                dVar2.f4677l = jSONObject.optInt("aqn");
                dVar2.f4678m = jSONObject.optInt("acn");
                dVar2.f4679n = jSONObject.optInt("wt");
                int i3 = 1;
                dVar2.f4682q = jSONObject.optInt("iscasf", 1);
                dVar2.f4683r = jSONObject.optInt("spmxrt", 5000);
                dVar2.f4673h = jSONObject.optLong("current_time");
                dVar2.f4674i = jSONObject.optInt("offset");
                dVar2.f4686u = jSONObject.optLong("dlct", 3600);
                dVar2.f4684s = jSONObject.optInt("autoplay", 0);
                dVar2.f4685t = jSONObject.optInt("dlnet", 2);
                dVar2.f4687v = jSONObject.optString("no_offer");
                dVar2.f4688w = jSONObject.optInt("cb_type");
                dVar2.f4689x = jSONObject.optLong("clct", 86400);
                dVar2.f4690y = jSONObject.optLong("clcq", 300);
                dVar2.f4662I = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                dVar2.f4663J = jSONObject.optInt("cd_rate", 0);
                dVar2.f4664K = jSONObject.optInt("content", 1);
                dVar2.f4665L = jSONObject.optInt("impt", 0);
                dVar2.f4681p = jSONObject.optInt("icon_type", 1);
                dVar2.f4680o = jSONObject.optString("no_ads_url", "");
                dVar2.f4666a = jSONObject.optInt("playclosebtn_tm", -1);
                dVar2.f4667b = jSONObject.optInt("play_ctdown", 0);
                dVar2.f4668c = jSONObject.optInt("close_alert", 0);
                dVar2.f4669d = jSONObject.optInt("intershowlimit", 30);
                dVar2.f4691z = jSONObject.optInt("refreshFq", 60);
                dVar2.f4654A = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2) {
                    if (optInt > 0) {
                        i3 = optInt;
                    }
                }
                dVar2.f4661H = i3;
                dVar2.f4657D = jSONObject.optString("placementid", "");
                dVar2.f4658E = jSONObject.optInt("ltafemty", 10);
                dVar2.f4659F = jSONObject.optInt("ltorwc", 60);
                return dVar2;
            } catch (Exception e) {
                e = e;
                dVar = dVar2;
                e.printStackTrace();
                return dVar;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return dVar;
        }
    }

    /* renamed from: s */
    public final JSONObject mo15605s() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f4672g != null && this.f4672g.size() > 0) {
                int size = this.f4672g.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f4672g.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            if (this.f4675j != null && this.f4675j.size() > 0) {
                int size2 = this.f4675j.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(this.f4675j.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f4676k);
            jSONObject.put("aqn", this.f4677l);
            jSONObject.put("acn", this.f4678m);
            jSONObject.put("wt", this.f4679n);
            jSONObject.put("current_time", this.f4673h);
            jSONObject.put("offset", this.f4674i);
            jSONObject.put("dlct", this.f4686u);
            jSONObject.put("autoplay", this.f4684s);
            jSONObject.put("dlnet", this.f4685t);
            jSONObject.put("no_offer", this.f4687v);
            jSONObject.put("cb_type", this.f4688w);
            jSONObject.put("clct", this.f4689x);
            jSONObject.put("clcq", this.f4690y);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f4662I);
            jSONObject.put("content", this.f4664K);
            jSONObject.put("impt", this.f4665L);
            jSONObject.put("icon_type", this.f4681p);
            jSONObject.put("no_ads_url", this.f4680o);
            jSONObject.put("playclosebtn_tm", this.f4666a);
            jSONObject.put("play_ctdown", this.f4667b);
            jSONObject.put("close_alert", this.f4668c);
            jSONObject.put("closeBtn", this.f4654A);
            jSONObject.put("refreshFq", this.f4691z);
            jSONObject.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_COUNTDOWN, this.f4656C);
            jSONObject.put("allowSkip", this.f4655B);
            jSONObject.put("tmorl", this.f4661H);
            jSONObject.put("unitId", this.f4670e);
            jSONObject.put("placementid", this.f4657D);
            jSONObject.put("ltafemty", this.f4658E);
            jSONObject.put("ltorwc", this.f4659F);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: t */
    public final long mo15606t() {
        return this.f4673h;
    }

    /* renamed from: u */
    public final int mo15608u() {
        return this.f4674i;
    }

    /* renamed from: c */
    public static C2294d m5324c(String str) {
        C2294d k = m5328k();
        k.f4684s = 0;
        return k;
    }

    /* renamed from: d */
    public static C2294d m5325d(String str) {
        C2294d dVar = new C2294d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        dVar.f4674i = 1;
        dVar.f4670e = str;
        dVar.f4672g = arrayList;
        dVar.f4675j = arrayList2;
        dVar.f4676k = 1;
        dVar.f4678m = -2;
        dVar.f4677l = -2;
        dVar.f4679n = 5;
        dVar.f4686u = 3600;
        dVar.f4685t = 2;
        dVar.f4684s = 1;
        dVar.f4662I = 100;
        dVar.f4663J = 0;
        dVar.f4664K = 1;
        dVar.f4665L = 0;
        dVar.f4691z = 60;
        dVar.f4658E = 10;
        dVar.f4659F = 60;
        return dVar;
    }

    /* renamed from: e */
    public static C2294d m5326e(String str) {
        C2294d dVar = new C2294d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            dVar.f4672g = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            dVar.f4675j = arrayList2;
            dVar.f4670e = str;
            dVar.f4674i = 1;
            dVar.f4676k = 1;
            dVar.f4678m = -2;
            dVar.f4677l = -2;
            dVar.f4679n = 5;
            dVar.f4686u = 3600;
            dVar.f4685t = 2;
            dVar.f4684s = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public static C2294d m5327f(String str) {
        C2294d dVar = new C2294d();
        try {
            dVar.f4670e = str;
            dVar.f4674i = 1;
            dVar.f4676k = 1;
            dVar.f4679n = 5;
            dVar.f4678m = 1;
            dVar.f4677l = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: g */
    public final void mo15594g(String str) {
        this.f4657D = str;
    }

    /* renamed from: v */
    public final int mo15609v() {
        return this.f4658E;
    }

    /* renamed from: w */
    public final int mo15610w() {
        return this.f4659F;
    }
}
