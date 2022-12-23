package com.bytedance.sdk.component.adexpress.dynamic.p100b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.h */
/* compiled from: DynamicLayoutUnit */
public class C2688h {

    /* renamed from: a */
    private String f5892a;

    /* renamed from: b */
    private float f5893b;

    /* renamed from: c */
    private float f5894c;

    /* renamed from: d */
    private float f5895d;

    /* renamed from: e */
    private float f5896e;

    /* renamed from: f */
    private float f5897f;

    /* renamed from: g */
    private float f5898g;

    /* renamed from: h */
    private float f5899h;

    /* renamed from: i */
    private C2685e f5900i;

    /* renamed from: j */
    private List<C2688h> f5901j;

    /* renamed from: k */
    private C2688h f5902k;

    /* renamed from: l */
    private List<List<C2688h>> f5903l;

    /* renamed from: m */
    private String f5904m;

    /* renamed from: a */
    public String mo17138a() {
        return this.f5904m;
    }

    /* renamed from: a */
    public void mo17142a(String str) {
        this.f5904m = str;
    }

    /* renamed from: b */
    public String mo17144b() {
        return this.f5892a;
    }

    /* renamed from: b */
    public void mo17147b(String str) {
        this.f5892a = str;
    }

    /* renamed from: c */
    public float mo17149c() {
        return this.f5895d;
    }

    /* renamed from: a */
    public void mo17139a(float f) {
        this.f5895d = f;
    }

    /* renamed from: d */
    public float mo17151d() {
        return this.f5896e;
    }

    /* renamed from: b */
    public void mo17145b(float f) {
        this.f5896e = f;
    }

    /* renamed from: e */
    public float mo17153e() {
        return this.f5893b;
    }

    /* renamed from: c */
    public void mo17150c(float f) {
        this.f5893b = f;
    }

    /* renamed from: f */
    public float mo17155f() {
        return this.f5894c;
    }

    /* renamed from: d */
    public void mo17152d(float f) {
        this.f5894c = f;
    }

    /* renamed from: g */
    public float mo17157g() {
        return this.f5897f;
    }

    /* renamed from: e */
    public void mo17154e(float f) {
        this.f5897f = f;
    }

    /* renamed from: h */
    public float mo17159h() {
        return this.f5898g;
    }

    /* renamed from: f */
    public void mo17156f(float f) {
        this.f5898g = f;
    }

    /* renamed from: g */
    public void mo17158g(float f) {
        this.f5899h = f;
    }

    /* renamed from: i */
    public C2685e mo17160i() {
        return this.f5900i;
    }

    /* renamed from: a */
    public void mo17140a(C2685e eVar) {
        this.f5900i = eVar;
    }

    /* renamed from: j */
    public List<C2688h> mo17161j() {
        return this.f5901j;
    }

    /* renamed from: a */
    public void mo17143a(List<C2688h> list) {
        this.f5901j = list;
    }

    /* renamed from: a */
    public void mo17141a(C2688h hVar) {
        if (this.f5901j == null) {
            this.f5901j = new ArrayList();
        }
        this.f5901j.add(hVar);
    }

    /* renamed from: b */
    public void mo17146b(C2688h hVar) {
        this.f5902k = hVar;
    }

    /* renamed from: k */
    public C2688h mo17162k() {
        return this.f5902k;
    }

    /* renamed from: l */
    public int mo17163l() {
        C2686f e = this.f5900i.mo16960e();
        return e.mo16965C() + e.mo16966D();
    }

    /* renamed from: m */
    public int mo17164m() {
        C2686f e = this.f5900i.mo16960e();
        return e.mo16963A() + e.mo16964B();
    }

    /* renamed from: n */
    public float mo17165n() {
        C2686f e = this.f5900i.mo16960e();
        return ((float) mo17163l()) + e.mo17038g() + e.mo17043h() + (e.mo17023d() * 2.0f);
    }

    /* renamed from: o */
    public float mo17166o() {
        C2686f e = this.f5900i.mo16960e();
        return ((float) mo17164m()) + e.mo17048i() + e.mo17033f() + (e.mo17023d() * 2.0f);
    }

    /* renamed from: b */
    public void mo17148b(List<List<C2688h>> list) {
        this.f5903l = list;
    }

    /* renamed from: p */
    public List<List<C2688h>> mo17167p() {
        return this.f5903l;
    }

    /* renamed from: q */
    public boolean mo17168q() {
        List<C2688h> list = this.f5901j;
        return list == null || list.size() <= 0;
    }

    /* renamed from: r */
    public void mo17169r() {
        List<List<C2688h>> list = this.f5903l;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List next : this.f5903l) {
                if (next != null && next.size() > 0) {
                    arrayList.add(next);
                }
            }
            this.f5903l = arrayList;
        }
    }

    /* renamed from: s */
    public boolean mo17170s() {
        return TextUtils.equals(this.f5900i.mo16960e().mo17081r(), "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f5892a + '\'' + ", x=" + this.f5893b + ", y=" + this.f5894c + ", width=" + this.f5897f + ", height=" + this.f5898g + ", remainWidth=" + this.f5899h + ", rootBrick=" + this.f5900i + ", childrenBrickUnits=" + this.f5901j + '}';
    }

    /* renamed from: a */
    public static void m7230a(JSONObject jSONObject, C2688h hVar, C2688h hVar2) {
        if (jSONObject != null && hVar != null) {
            hVar.mo17147b(jSONObject.optString("id", "root"));
            hVar.mo17150c((float) jSONObject.optDouble("x", 0.0d));
            hVar.mo17152d((float) jSONObject.optDouble("y", 0.0d));
            hVar.mo17154e((float) jSONObject.optDouble("width", 0.0d));
            hVar.mo17156f((float) jSONObject.optDouble("height", 0.0d));
            hVar.mo17158g((float) jSONObject.optDouble("remainWidth", 0.0d));
            C2685e eVar = new C2685e();
            C2685e.m7037a(jSONObject.optJSONObject("brick"), eVar);
            hVar.mo17140a(eVar);
            hVar.mo17146b(hVar2);
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    Object opt = optJSONArray.opt(i);
                    if (opt != null && !"null".equals(opt.toString()) && (opt instanceof JSONArray)) {
                        int i2 = 0;
                        while (true) {
                            JSONArray jSONArray = (JSONArray) opt;
                            if (i2 >= jSONArray.length()) {
                                break;
                            }
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            C2688h hVar3 = new C2688h();
                            m7230a(optJSONObject, hVar3, hVar);
                            hVar.mo17141a(hVar3);
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public boolean mo17171t() {
        return this.f5900i.mo16960e().mo16985W() < 0 || this.f5900i.mo16960e().mo16986X() < 0 || this.f5900i.mo16960e().mo16983U() < 0 || this.f5900i.mo16960e().mo16984V() < 0;
    }
}
