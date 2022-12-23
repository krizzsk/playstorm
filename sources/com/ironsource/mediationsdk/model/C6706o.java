package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.sdk.p293g.C8343d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.o */
public final class C6706o {

    /* renamed from: a */
    public ArrayList<Placement> f17543a;

    /* renamed from: b */
    public C8343d f17544b;

    /* renamed from: c */
    public int f17545c;

    /* renamed from: d */
    public boolean f17546d;

    /* renamed from: e */
    public int f17547e;

    /* renamed from: f */
    public String f17548f;

    /* renamed from: g */
    public String f17549g;

    /* renamed from: h */
    public int f17550h;

    /* renamed from: i */
    public int f17551i;

    /* renamed from: j */
    public int f17552j;

    /* renamed from: k */
    public Placement f17553k;

    /* renamed from: l */
    public C6765c f17554l;

    public C6706o() {
        this.f17543a = new ArrayList<>();
        this.f17544b = new C8343d();
    }

    public C6706o(int i, boolean z, int i2, int i3, int i4, C8343d dVar, C6765c cVar, int i5) {
        this.f17543a = new ArrayList<>();
        this.f17545c = i;
        this.f17546d = z;
        this.f17547e = i2;
        this.f17550h = i3;
        this.f17544b = dVar;
        this.f17551i = i4;
        this.f17554l = cVar;
        this.f17552j = i5;
    }

    /* renamed from: a */
    public final Placement mo36830a() {
        Iterator<Placement> it = this.f17543a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17553k;
    }
}
