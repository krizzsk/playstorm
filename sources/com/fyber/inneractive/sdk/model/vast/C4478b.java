package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.response.C5295i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.model.vast.b */
public class C4478b implements C5295i {

    /* renamed from: a */
    public String f11060a;

    /* renamed from: b */
    public String f11061b;

    /* renamed from: c */
    public Map<C4493q, List<String>> f11062c = new HashMap();

    /* renamed from: d */
    public PriorityQueue<C4489m> f11063d;

    /* renamed from: e */
    public final List<C4468i> f11064e = new ArrayList();

    /* renamed from: f */
    public PriorityQueue<C4479c> f11065f;

    /* renamed from: g */
    public C4479c f11066g = null;

    /* renamed from: h */
    public int f11067h = 0;

    /* renamed from: i */
    public int f11068i = 0;

    public C4478b(Comparator<C4489m> comparator, Comparator<C4479c> comparator2) {
        this.f11063d = new PriorityQueue<>(1, comparator);
        this.f11065f = new PriorityQueue<>(1, comparator2);
    }

    /* renamed from: a */
    public List<String> mo24664a(C4493q qVar) {
        Map<C4493q, List<String>> map = this.f11062c;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: b */
    public List<C4489m> mo24685b() {
        return new ArrayList(this.f11063d);
    }

    /* renamed from: c */
    public List<C4468i> mo24686c() {
        return this.f11064e;
    }

    /* renamed from: a */
    public int mo24683a() {
        return this.f11063d.size();
    }

    /* renamed from: a */
    public void mo24684a(C4493q qVar, String str) {
        List list = this.f11062c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f11062c.put(qVar, list);
        }
        list.add(str);
    }
}
