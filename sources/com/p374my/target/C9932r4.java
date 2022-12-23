package com.p374my.target;

import com.p374my.target.C10080z7;
import com.p374my.target.C9918q4;

/* renamed from: com.my.target.r4 */
public class C9932r4 implements C9918q4, C10080z7.C10081a {

    /* renamed from: a */
    public final C9640c2 f24603a;

    /* renamed from: b */
    public final C9918q4.C9919a f24604b;

    /* renamed from: c */
    public int f24605c;

    public C9932r4(C9640c2 c2Var, C9918q4.C9919a aVar) {
        this.f24603a = c2Var;
        this.f24604b = aVar;
    }

    /* renamed from: a */
    public static C9918q4 m29135a(C9640c2 c2Var, C9918q4.C9919a aVar) {
        return new C9932r4(c2Var, aVar);
    }

    /* renamed from: a */
    public void mo65298a(C10080z7 z7Var) {
        z7Var.setBanner((C9640c2) null);
        z7Var.setListener((C10080z7.C10081a) null);
    }

    /* renamed from: a */
    public void mo65299a(C10080z7 z7Var, int i) {
        this.f24605c = i;
        this.f24604b.mo65300a(this.f24603a);
        z7Var.setBanner(this.f24603a);
        z7Var.setListener(this);
    }

    /* renamed from: a */
    public void mo65330a(boolean z) {
        this.f24604b.mo65301a(this.f24603a, z, this.f24605c);
    }
}
