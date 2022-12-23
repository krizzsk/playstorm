package com.p374my.target;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.my.target.q1 */
public final class C9915q1 {

    /* renamed from: A */
    public Boolean f24528A;

    /* renamed from: B */
    public Boolean f24529B;

    /* renamed from: C */
    public C9879o2 f24530C;

    /* renamed from: a */
    public final String f24531a;

    /* renamed from: b */
    public final String f24532b;

    /* renamed from: c */
    public final ArrayList<C9915q1> f24533c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<C9626b3> f24534d = new ArrayList<>();

    /* renamed from: e */
    public final C9641c3 f24535e = C9641c3.m27738f();

    /* renamed from: f */
    public ArrayList<C9626b3> f24536f;

    /* renamed from: g */
    public ArrayList<C9600a2> f24537g;

    /* renamed from: h */
    public C9915q1 f24538h;

    /* renamed from: i */
    public String f24539i;

    /* renamed from: j */
    public String f24540j;

    /* renamed from: k */
    public int f24541k;

    /* renamed from: l */
    public int f24542l = -1;

    /* renamed from: m */
    public int f24543m = -1;

    /* renamed from: n */
    public int f24544n = -1;

    /* renamed from: o */
    public float f24545o = -1.0f;

    /* renamed from: p */
    public float f24546p = -1.0f;

    /* renamed from: q */
    public boolean f24547q;

    /* renamed from: r */
    public boolean f24548r;

    /* renamed from: s */
    public boolean f24549s;

    /* renamed from: t */
    public float f24550t = -1.0f;

    /* renamed from: u */
    public Boolean f24551u;

    /* renamed from: v */
    public Boolean f24552v;

    /* renamed from: w */
    public Boolean f24553w;

    /* renamed from: x */
    public Boolean f24554x;

    /* renamed from: y */
    public Boolean f24555y;

    /* renamed from: z */
    public Boolean f24556z;

    public C9915q1(String str, String str2) {
        this.f24532b = str;
        this.f24531a = str2;
    }

    /* renamed from: a */
    public static C9915q1 m29022a(String str, String str2) {
        return new C9915q1(str, str2);
    }

    /* renamed from: b */
    public static C9915q1 m29023b(String str) {
        return m29022a(str, (String) null);
    }

    /* renamed from: a */
    public Boolean mo65238a() {
        return this.f24551u;
    }

    /* renamed from: a */
    public ArrayList<C9626b3> mo65239a(String str) {
        ArrayList<C9626b3> arrayList = new ArrayList<>();
        Iterator<C9626b3> it = this.f24534d.iterator();
        while (it.hasNext()) {
            C9626b3 next = it.next();
            if (str.equals(next.mo63602a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo65240a(float f) {
        this.f24550t = f;
    }

    /* renamed from: a */
    public void mo65241a(int i) {
        this.f24544n = i;
    }

    /* renamed from: a */
    public void mo65242a(C9626b3 b3Var) {
        this.f24534d.add(b3Var);
    }

    /* renamed from: a */
    public void mo65243a(C9879o2 o2Var) {
        this.f24530C = o2Var;
    }

    /* renamed from: a */
    public void mo65244a(C9915q1 q1Var) {
        this.f24533c.add(q1Var);
    }

    /* renamed from: a */
    public void mo65245a(Boolean bool) {
        this.f24551u = bool;
    }

    /* renamed from: a */
    public void mo65246a(ArrayList<C9626b3> arrayList) {
        ArrayList<C9626b3> arrayList2 = this.f24536f;
        if (arrayList2 == null) {
            this.f24536f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    /* renamed from: a */
    public void mo65247a(boolean z) {
        this.f24547q = z;
    }

    /* renamed from: b */
    public float mo65248b() {
        return this.f24550t;
    }

    /* renamed from: b */
    public void mo65249b(float f) {
        this.f24545o = f;
    }

    /* renamed from: b */
    public void mo65250b(int i) {
        this.f24542l = i;
    }

    /* renamed from: b */
    public void mo65251b(C9915q1 q1Var) {
        this.f24538h = q1Var;
        if (q1Var != null) {
            q1Var.mo65257c(this.f24543m);
        }
    }

    /* renamed from: b */
    public void mo65252b(Boolean bool) {
        this.f24552v = bool;
    }

    /* renamed from: b */
    public void mo65253b(ArrayList<C9600a2> arrayList) {
        this.f24537g = arrayList;
    }

    /* renamed from: b */
    public void mo65254b(boolean z) {
        this.f24548r = z;
    }

    /* renamed from: c */
    public Boolean mo65255c() {
        return this.f24552v;
    }

    /* renamed from: c */
    public void mo65256c(float f) {
        this.f24546p = f;
    }

    /* renamed from: c */
    public void mo65257c(int i) {
        this.f24543m = i;
        C9915q1 q1Var = this.f24538h;
        if (q1Var != null) {
            q1Var.mo65257c(i);
        }
    }

    /* renamed from: c */
    public void mo65258c(Boolean bool) {
        this.f24529B = bool;
    }

    /* renamed from: c */
    public void mo65259c(String str) {
        this.f24540j = str;
    }

    /* renamed from: c */
    public void mo65260c(ArrayList<C9626b3> arrayList) {
        this.f24536f = arrayList;
    }

    /* renamed from: c */
    public void mo65261c(boolean z) {
        this.f24549s = z;
    }

    /* renamed from: d */
    public Boolean mo65262d() {
        return this.f24529B;
    }

    /* renamed from: d */
    public void mo65263d(int i) {
        this.f24541k = i;
    }

    /* renamed from: d */
    public void mo65264d(Boolean bool) {
        this.f24553w = bool;
    }

    /* renamed from: d */
    public void mo65265d(String str) {
        this.f24539i = str;
    }

    /* renamed from: e */
    public Boolean mo65266e() {
        return this.f24553w;
    }

    /* renamed from: e */
    public void mo65267e(Boolean bool) {
        this.f24554x = bool;
    }

    /* renamed from: f */
    public Boolean mo65268f() {
        return this.f24554x;
    }

    /* renamed from: f */
    public void mo65269f(Boolean bool) {
        this.f24555y = bool;
    }

    /* renamed from: g */
    public Boolean mo65270g() {
        return this.f24555y;
    }

    /* renamed from: g */
    public void mo65271g(Boolean bool) {
        this.f24556z = bool;
    }

    /* renamed from: h */
    public C9641c3 mo65272h() {
        return this.f24535e;
    }

    /* renamed from: h */
    public void mo65273h(Boolean bool) {
        this.f24528A = bool;
    }

    /* renamed from: i */
    public ArrayList<C9600a2> mo65274i() {
        return this.f24537g;
    }

    /* renamed from: j */
    public String mo65275j() {
        return this.f24540j;
    }

    /* renamed from: k */
    public Boolean mo65276k() {
        return this.f24556z;
    }

    /* renamed from: l */
    public int mo65277l() {
        return this.f24544n;
    }

    /* renamed from: m */
    public int mo65278m() {
        return this.f24542l;
    }

    /* renamed from: n */
    public ArrayList<C9626b3> mo65279n() {
        if (this.f24536f != null) {
            return new ArrayList<>(this.f24536f);
        }
        return null;
    }

    /* renamed from: o */
    public String mo65280o() {
        return this.f24539i;
    }

    /* renamed from: p */
    public C9879o2 mo65281p() {
        return this.f24530C;
    }

    /* renamed from: q */
    public C9915q1 mo65282q() {
        return this.f24538h;
    }

    /* renamed from: r */
    public Boolean mo65283r() {
        return this.f24528A;
    }

    /* renamed from: s */
    public float mo65284s() {
        return this.f24545o;
    }

    /* renamed from: t */
    public float mo65285t() {
        return this.f24546p;
    }

    /* renamed from: u */
    public int mo65286u() {
        return this.f24543m;
    }

    /* renamed from: v */
    public int mo65287v() {
        return this.f24541k;
    }

    /* renamed from: w */
    public ArrayList<C9915q1> mo65288w() {
        return this.f24533c;
    }

    /* renamed from: x */
    public boolean mo65289x() {
        return this.f24547q;
    }

    /* renamed from: y */
    public boolean mo65290y() {
        return this.f24548r;
    }

    /* renamed from: z */
    public boolean mo65291z() {
        return this.f24549s;
    }
}
