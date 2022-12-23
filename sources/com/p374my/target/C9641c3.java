package com.p374my.target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.my.target.c3 */
public final class C9641c3 {

    /* renamed from: a */
    public final Set<C9626b3> f23704a = new HashSet();

    /* renamed from: b */
    public final Set<C9601a3> f23705b = new HashSet();

    /* renamed from: c */
    public final List<C10067z2> f23706c = new ArrayList();

    /* renamed from: d */
    public final List<C10045y2> f23707d = new ArrayList();

    /* renamed from: e */
    public final Comparator<C10067z2> f23708e = $$Lambda$3Ri92qehj3Ks9ZBZh2yg_kbDYg0.INSTANCE;

    /* renamed from: a */
    public static /* synthetic */ int m27736a(C9601a3 a3Var, C9601a3 a3Var2) {
        return (int) (a3Var2.mo63450e() - a3Var.mo63450e());
    }

    /* renamed from: f */
    public static C9641c3 m27738f() {
        return new C9641c3();
    }

    /* renamed from: a */
    public ArrayList<C10045y2> mo63674a() {
        return new ArrayList<>(this.f23707d);
    }

    /* renamed from: a */
    public ArrayList<C9626b3> mo63675a(String str) {
        ArrayList<C9626b3> arrayList = new ArrayList<>();
        for (C9626b3 next : this.f23704a) {
            if (str.equals(next.mo63602a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo63676a(C9626b3 b3Var) {
        Set set;
        if (b3Var instanceof C9601a3) {
            set = this.f23705b;
            b3Var = (C9601a3) b3Var;
        } else if (b3Var instanceof C10067z2) {
            C10067z2 z2Var = (C10067z2) b3Var;
            int binarySearch = Collections.binarySearch(this.f23706c, z2Var, this.f23708e);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.f23706c.add(binarySearch, z2Var);
            return;
        } else if (b3Var instanceof C10045y2) {
            this.f23707d.add((C10045y2) b3Var);
            return;
        } else {
            set = this.f23704a;
        }
        set.add(b3Var);
    }

    /* renamed from: a */
    public void mo63677a(C9641c3 c3Var, float f) {
        this.f23704a.addAll(c3Var.mo63683d());
        this.f23707d.addAll(c3Var.mo63674a());
        if (f <= 0.0f) {
            this.f23705b.addAll(c3Var.mo63682c());
            this.f23706c.addAll(c3Var.mo63680b());
            return;
        }
        for (C9601a3 next : c3Var.mo63682c()) {
            float d = next.mo63449d();
            if (d >= 0.0f) {
                next.mo63448b((d * f) / 100.0f);
                next.mo63447a(-1.0f);
            }
            mo63676a((C9626b3) next);
        }
        Iterator<C10067z2> it = c3Var.mo63680b().iterator();
        while (it.hasNext()) {
            C10067z2 next2 = it.next();
            float d2 = next2.mo65858d();
            if (d2 >= 0.0f) {
                next2.mo65856b((d2 * f) / 100.0f);
                next2.mo65855a(-1.0f);
            }
            mo63676a((C9626b3) next2);
        }
    }

    /* renamed from: a */
    public void mo63678a(ArrayList<C9601a3> arrayList) {
        this.f23705b.addAll(arrayList);
    }

    /* renamed from: a */
    public void mo63679a(List<C9626b3> list) {
        for (C9626b3 a : list) {
            mo63676a(a);
        }
    }

    /* renamed from: b */
    public ArrayList<C10067z2> mo63680b() {
        return new ArrayList<>(this.f23706c);
    }

    /* renamed from: b */
    public void mo63681b(List<C9601a3> list) {
        list.addAll(this.f23705b);
        Collections.sort(list, $$Lambda$IP4sDTQNTlS1_Tjs3WUUX9pulqU.INSTANCE);
    }

    /* renamed from: c */
    public Set<C9601a3> mo63682c() {
        return new HashSet(this.f23705b);
    }

    /* renamed from: d */
    public Set<C9626b3> mo63683d() {
        return new HashSet(this.f23704a);
    }

    /* renamed from: e */
    public boolean mo63684e() {
        return !this.f23704a.isEmpty() || !this.f23705b.isEmpty() || !this.f23706c.isEmpty() || !this.f23707d.isEmpty();
    }
}
