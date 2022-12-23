package com.p374my.target;

import com.p374my.target.C10018w4;
import com.p374my.target.C9666d8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.v4 */
public class C9999v4 implements C10018w4, C9666d8.C9667a {

    /* renamed from: a */
    public final C9666d8 f24817a;

    /* renamed from: b */
    public final C10018w4.C10019a f24818b;

    /* renamed from: c */
    public final boolean[] f24819c;

    /* renamed from: d */
    public final List<C10066z1> f24820d = new ArrayList();

    /* renamed from: e */
    public final List<C9640c2> f24821e;

    public C9999v4(C9666d8 d8Var, List<C9640c2> list, C10018w4.C10019a aVar) {
        this.f24817a = d8Var;
        this.f24818b = aVar;
        this.f24821e = new ArrayList(list);
        this.f24819c = new boolean[list.size()];
        d8Var.setListener(this);
    }

    /* renamed from: a */
    public static C10018w4 m29562a(C9666d8 d8Var, List<C9640c2> list, C10018w4.C10019a aVar) {
        return new C9999v4(d8Var, list, aVar);
    }

    /* renamed from: a */
    public void mo65300a(C10066z1 z1Var) {
        if (!this.f24820d.contains(z1Var)) {
            this.f24818b.mo65546c(z1Var);
            this.f24820d.add(z1Var);
        }
    }

    /* renamed from: a */
    public void mo65301a(C10066z1 z1Var, boolean z, int i) {
        if (!this.f24817a.mo63898a(i)) {
            this.f24817a.mo63899b(i);
        } else if (z) {
            this.f24818b.mo65406a(z1Var);
        }
    }

    /* renamed from: a */
    public void mo63901a(int[] iArr) {
        for (int i : iArr) {
            if (i >= 0) {
                boolean[] zArr = this.f24819c;
                if (i < zArr.length && !zArr[i]) {
                    zArr[i] = true;
                    this.f24818b.mo65545b(this.f24821e.get(i));
                }
            }
        }
    }
}
