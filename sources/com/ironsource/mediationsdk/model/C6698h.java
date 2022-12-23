package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.sdk.p293g.C8343d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.h */
public final class C6698h {

    /* renamed from: a */
    public ArrayList<InterstitialPlacement> f17501a;

    /* renamed from: b */
    public C8343d f17502b;

    /* renamed from: c */
    public int f17503c;

    /* renamed from: d */
    public boolean f17504d;

    /* renamed from: e */
    public int f17505e;

    /* renamed from: f */
    public int f17506f;

    /* renamed from: g */
    public String f17507g;

    /* renamed from: h */
    public String f17508h;

    /* renamed from: i */
    public C6765c f17509i;

    /* renamed from: j */
    public InterstitialPlacement f17510j;

    public C6698h() {
        this.f17501a = new ArrayList<>();
        this.f17502b = new C8343d();
    }

    public C6698h(int i, boolean z, int i2, C8343d dVar, C6765c cVar, int i3) {
        this.f17501a = new ArrayList<>();
        this.f17503c = i;
        this.f17504d = z;
        this.f17505e = i2;
        this.f17502b = dVar;
        this.f17509i = cVar;
        this.f17506f = i3;
    }

    /* renamed from: a */
    public final InterstitialPlacement mo36817a() {
        Iterator<InterstitialPlacement> it = this.f17501a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17510j;
    }
}
