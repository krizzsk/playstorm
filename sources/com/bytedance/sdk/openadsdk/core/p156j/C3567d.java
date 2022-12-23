package com.bytedance.sdk.openadsdk.core.p156j;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3548a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3550b;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.d */
/* compiled from: VideoTrackers */
public class C3567d {

    /* renamed from: a */
    public List<C3553c> f8961a = new ArrayList();

    /* renamed from: b */
    public List<C3553c> f8962b = new ArrayList();

    /* renamed from: c */
    public List<C3553c> f8963c = new ArrayList();

    /* renamed from: d */
    public List<C3553c> f8964d = new ArrayList();

    /* renamed from: e */
    public List<C3553c> f8965e = new ArrayList();

    /* renamed from: f */
    public List<C3553c> f8966f = new ArrayList();

    /* renamed from: g */
    public List<C3553c> f8967g = new ArrayList();

    /* renamed from: h */
    public List<C3553c> f8968h = new ArrayList();

    /* renamed from: i */
    public List<C3553c> f8969i = new ArrayList();

    /* renamed from: j */
    public List<C3553c> f8970j = new ArrayList();

    /* renamed from: k */
    public List<C3550b> f8971k = new ArrayList();

    /* renamed from: l */
    public List<C3548a> f8972l = new ArrayList();

    /* renamed from: m */
    private C3539a f8973m;

    /* renamed from: n */
    private long f8974n;

    /* renamed from: o */
    private C3498n f8975o;

    /* renamed from: p */
    private boolean f8976p;

    /* renamed from: q */
    private boolean f8977q;

    /* renamed from: r */
    private boolean f8978r;

    /* renamed from: s */
    private String f8979s;

    public C3567d(C3539a aVar) {
        this.f8973m = aVar;
    }

    /* renamed from: a */
    public void mo20039a(C3540a aVar) {
        m11152a(-1, this.f8961a, aVar);
    }

    /* renamed from: a */
    public void mo20036a(long j) {
        m11152a(j, this.f8962b, (C3540a) null);
    }

    /* renamed from: b */
    public void mo20046b(long j) {
        m11152a(j, this.f8963c, (C3540a) null);
    }

    /* renamed from: c */
    public void mo20048c(long j) {
        m11152a(j, this.f8964d, (C3540a) null);
    }

    /* renamed from: d */
    public void mo20050d(long j) {
        m11152a(j, this.f8965e, (C3540a) null);
    }

    /* renamed from: e */
    public void mo20052e(long j) {
        m11152a(j, this.f8966f, (C3540a) null);
    }

    /* renamed from: f */
    public void mo20054f(long j) {
        m11152a(j, this.f8967g, (C3540a) null);
    }

    /* renamed from: g */
    public void mo20056g(long j) {
        m11152a(j, this.f8968h, (C3540a) null);
    }

    /* renamed from: h */
    public void mo20058h(long j) {
        m11152a(j, this.f8969i, (C3540a) null);
    }

    /* renamed from: i */
    public void mo20060i(long j) {
        m11152a(j, this.f8970j, (C3540a) null);
    }

    /* renamed from: a */
    public void mo20037a(long j, long j2) {
        if (System.currentTimeMillis() - this.f8974n >= 1000 && j >= 0 && j2 > 0) {
            this.f8974n = System.currentTimeMillis();
            float f = ((float) j) / ((float) j2);
            m11152a(j, mo20034a(j, f), (C3540a) null);
            if (f >= 0.25f && !this.f8976p) {
                m11154b(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE);
                this.f8976p = true;
            } else if (f >= 0.5f && !this.f8977q) {
                m11154b("midpoint");
                this.f8977q = true;
            } else if (f >= 0.75f && !this.f8978r) {
                m11154b(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE);
                this.f8978r = true;
            }
        }
    }

    /* renamed from: b */
    private void m11154b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", str);
            C3156e.m9195b(C3578m.m11231a(), this.f8975o, this.f8979s, "vast_play_track", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m11152a(long j, List<C3553c> list, C3540a aVar) {
        C3539a aVar2 = this.f8973m;
        C3553c.m11120b(list, aVar, j, aVar2 != null ? aVar2.mo19993g() : null);
    }

    /* renamed from: a */
    public List<C3553c> mo20034a(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f8971k.size(); i++) {
            C3550b bVar = this.f8971k.get(i);
            if (bVar.mo20013a(f)) {
                arrayList.add(bVar);
            }
        }
        for (int i2 = 0; i2 < this.f8972l.size(); i2++) {
            C3548a aVar = this.f8972l.get(i2);
            if (aVar.mo20009a(j)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo20044a(List<C3553c> list) {
        this.f8962b.addAll(list);
    }

    /* renamed from: b */
    public void mo20047b(List<C3553c> list) {
        this.f8963c.addAll(list);
    }

    /* renamed from: c */
    public void mo20049c(List<C3553c> list) {
        this.f8964d.addAll(list);
    }

    /* renamed from: d */
    public void mo20051d(List<C3553c> list) {
        this.f8965e.addAll(list);
    }

    /* renamed from: e */
    public void mo20053e(List<C3553c> list) {
        this.f8966f.addAll(list);
    }

    /* renamed from: f */
    public void mo20055f(List<C3553c> list) {
        this.f8967g.addAll(list);
    }

    /* renamed from: g */
    public void mo20057g(List<C3553c> list) {
        this.f8968h.addAll(list);
    }

    /* renamed from: h */
    public void mo20059h(List<C3550b> list) {
        this.f8971k.addAll(list);
        Collections.sort(this.f8971k);
    }

    /* renamed from: i */
    public void mo20061i(List<C3548a> list) {
        this.f8972l.addAll(list);
        Collections.sort(this.f8972l);
    }

    /* renamed from: j */
    public void mo20062j(List<C3553c> list) {
        this.f8961a.addAll(list);
    }

    /* renamed from: k */
    public void mo20063k(List<C3553c> list) {
        this.f8969i.addAll(list);
    }

    /* renamed from: l */
    public void mo20064l(List<C3553c> list) {
        this.f8970j.addAll(list);
    }

    /* renamed from: a */
    public JSONObject mo20035a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", C3553c.m11119b(this.f8961a));
        jSONObject.put("impressionTrackers", C3553c.m11119b(this.f8962b));
        jSONObject.put("pauseTrackers", C3553c.m11119b(this.f8963c));
        jSONObject.put("resumeTrackers", C3553c.m11119b(this.f8964d));
        jSONObject.put("completeTrackers", C3553c.m11119b(this.f8965e));
        jSONObject.put("closeTrackers", C3553c.m11119b(this.f8966f));
        jSONObject.put("skipTrackers", C3553c.m11119b(this.f8967g));
        jSONObject.put("clickTrackers", C3553c.m11119b(this.f8968h));
        jSONObject.put("muteTrackers", C3553c.m11119b(this.f8969i));
        jSONObject.put("unMuteTrackers", C3553c.m11119b(this.f8970j));
        jSONObject.put("fractionalTrackers", m11153b());
        jSONObject.put("absoluteTrackers", m11155c());
        return jSONObject;
    }

    /* renamed from: b */
    private JSONArray m11153b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C3550b b : this.f8971k) {
            jSONArray.put(b.mo20014b());
        }
        return jSONArray;
    }

    /* renamed from: c */
    private JSONArray m11155c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C3548a a : this.f8972l) {
            jSONArray.put(a.mo20008a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public void mo20045a(JSONObject jSONObject) {
        mo20062j(C3553c.m11115a(jSONObject.optJSONArray("errorTrackers")));
        mo20044a(C3553c.m11115a(jSONObject.optJSONArray("impressionTrackers")));
        mo20047b(C3553c.m11116a(jSONObject.optJSONArray("pauseTrackers"), true));
        mo20049c(C3553c.m11116a(jSONObject.optJSONArray("resumeTrackers"), true));
        mo20051d(C3553c.m11115a(jSONObject.optJSONArray("completeTrackers")));
        mo20053e(C3553c.m11115a(jSONObject.optJSONArray("closeTrackers")));
        mo20055f(C3553c.m11115a(jSONObject.optJSONArray("skipTrackers")));
        mo20057g(C3553c.m11115a(jSONObject.optJSONArray("clickTrackers")));
        mo20063k(C3553c.m11116a(jSONObject.optJSONArray("muteTrackers"), true));
        mo20064l(C3553c.m11116a(jSONObject.optJSONArray("unMuteTrackers"), true));
        mo20059h(C3553c.m11118b(jSONObject.optJSONArray("fractionalTrackers")));
        mo20061i(C3553c.m11121c(jSONObject.optJSONArray("absoluteTrackers")));
    }

    /* renamed from: a */
    public void mo20038a(C3498n nVar) {
        this.f8975o = nVar;
    }

    /* renamed from: a */
    public void mo20041a(String str) {
        this.f8979s = str;
    }

    /* renamed from: a */
    public void mo20043a(String str, long j) {
        if (!TextUtils.isEmpty(str) && j >= 0) {
            mo20061i((List<C3548a>) Collections.singletonList(new C3548a.C3549a(str, j).mo20011a()));
        }
    }

    /* renamed from: a */
    public void mo20042a(String str, float f) {
        if (!TextUtils.isEmpty(str) && f >= 0.0f) {
            mo20059h((List<C3550b>) Collections.singletonList(new C3550b.C3552a(str, f).mo20017a()));
        }
    }

    /* renamed from: a */
    public void mo20040a(C3567d dVar) {
        mo20062j(dVar.f8961a);
        mo20044a(dVar.f8962b);
        mo20047b(dVar.f8963c);
        mo20049c(dVar.f8964d);
        mo20051d(dVar.f8965e);
        mo20053e(dVar.f8966f);
        mo20055f(dVar.f8967g);
        mo20057g(dVar.f8968h);
        mo20063k(dVar.f8969i);
        mo20064l(dVar.f8970j);
        mo20059h(dVar.f8971k);
        mo20061i(dVar.f8972l);
    }
}
