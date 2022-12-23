package com.p374my.target;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.my.target.w2 */
public class C10016w2 extends C9916q2 {

    /* renamed from: b */
    public final String f24848b;

    /* renamed from: c */
    public final ArrayList<C9795k2> f24849c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<Pair<String, String>> f24850d = new ArrayList<>();

    /* renamed from: e */
    public JSONObject f24851e;

    /* renamed from: f */
    public boolean f24852f;

    /* renamed from: g */
    public String f24853g;

    /* renamed from: h */
    public String f24854h;

    /* renamed from: i */
    public String f24855i;

    /* renamed from: j */
    public String f24856j;

    /* renamed from: k */
    public String f24857k;

    /* renamed from: l */
    public String f24858l;

    public C10016w2(String str) {
        this.f24848b = str;
    }

    /* renamed from: b */
    public static C10016w2 m29614b(String str) {
        return new C10016w2(str);
    }

    /* renamed from: a */
    public int mo65292a() {
        return this.f24849c.size();
    }

    /* renamed from: a */
    public String mo65646a(String str) {
        Iterator<Pair<String, String>> it = this.f24850d.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            if (str.equals(next.first)) {
                return (String) next.second;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo65647a(C9795k2 k2Var) {
        this.f24849c.add(k2Var);
    }

    /* renamed from: a */
    public void mo65648a(JSONObject jSONObject) {
        this.f24851e = jSONObject;
    }

    /* renamed from: a */
    public void mo65649a(boolean z) {
        this.f24852f = z;
    }

    /* renamed from: c */
    public List<C9795k2> mo65650c() {
        return new ArrayList(this.f24849c);
    }

    /* renamed from: c */
    public void mo65651c(String str) {
        this.f24855i = str;
    }

    /* renamed from: d */
    public String mo65652d() {
        return this.f24855i;
    }

    /* renamed from: d */
    public void mo65653d(String str) {
        this.f24857k = str;
    }

    /* renamed from: e */
    public String mo65654e() {
        return this.f24857k;
    }

    /* renamed from: e */
    public void mo65655e(String str) {
        this.f24854h = str;
    }

    /* renamed from: f */
    public String mo65656f() {
        return this.f24854h;
    }

    /* renamed from: f */
    public void mo65657f(String str) {
        this.f24858l = str;
    }

    /* renamed from: g */
    public String mo65658g() {
        return this.f24858l;
    }

    /* renamed from: g */
    public void mo65659g(String str) {
        this.f24856j = str;
    }

    /* renamed from: h */
    public String mo65660h() {
        return this.f24856j;
    }

    /* renamed from: h */
    public void mo65661h(String str) {
        this.f24853g = str;
    }

    /* renamed from: i */
    public String mo65662i() {
        return this.f24848b;
    }

    /* renamed from: j */
    public JSONObject mo65663j() {
        return this.f24851e;
    }

    /* renamed from: k */
    public ArrayList<Pair<String, String>> mo65664k() {
        return this.f24850d;
    }

    /* renamed from: l */
    public String mo65665l() {
        return this.f24853g;
    }

    /* renamed from: m */
    public boolean mo65666m() {
        return this.f24852f;
    }
}
