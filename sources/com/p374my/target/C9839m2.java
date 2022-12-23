package com.p374my.target;

import java.util.ArrayList;

/* renamed from: com.my.target.m2 */
public class C9839m2 {

    /* renamed from: a */
    public final ArrayList<C9858n2> f24288a = new ArrayList<>();

    /* renamed from: b */
    public int f24289b = 60;

    /* renamed from: c */
    public static final C9839m2 m28656c() {
        return new C9839m2();
    }

    /* renamed from: a */
    public int mo64721a() {
        return this.f24289b;
    }

    /* renamed from: a */
    public void mo64722a(int i) {
        this.f24289b = i;
    }

    /* renamed from: a */
    public void mo64723a(C9858n2 n2Var) {
        int size = this.f24288a.size();
        for (int i = 0; i < size; i++) {
            if (n2Var.mo64846f() > this.f24288a.get(i).mo64846f()) {
                this.f24288a.add(i, n2Var);
                return;
            }
        }
        this.f24288a.add(n2Var);
    }

    /* renamed from: b */
    public boolean mo64724b() {
        return !this.f24288a.isEmpty();
    }

    /* renamed from: d */
    public C9858n2 mo64725d() {
        if (this.f24288a.isEmpty()) {
            return null;
        }
        return this.f24288a.remove(0);
    }
}
