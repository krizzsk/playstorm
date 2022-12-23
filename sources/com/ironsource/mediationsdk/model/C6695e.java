package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.C6765c;
import com.ironsource.sdk.p293g.C8343d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.e */
public final class C6695e {

    /* renamed from: a */
    public C8343d f17488a;

    /* renamed from: b */
    public long f17489b;

    /* renamed from: c */
    public ArrayList<C6696f> f17490c;

    /* renamed from: d */
    public C6696f f17491d;

    /* renamed from: e */
    public int f17492e;

    /* renamed from: f */
    public int f17493f;

    /* renamed from: g */
    public C6765c f17494g;

    /* renamed from: h */
    private int f17495h;

    public C6695e() {
        this.f17488a = new C8343d();
        this.f17490c = new ArrayList<>();
    }

    public C6695e(int i, long j, C8343d dVar, int i2, C6765c cVar, int i3) {
        this.f17490c = new ArrayList<>();
        this.f17495h = i;
        this.f17489b = j;
        this.f17488a = dVar;
        this.f17492e = i2;
        this.f17493f = i3;
        this.f17494g = cVar;
    }

    /* renamed from: a */
    public final C6696f mo36814a() {
        Iterator<C6696f> it = this.f17490c.iterator();
        while (it.hasNext()) {
            C6696f next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f17491d;
    }

    /* renamed from: a */
    public final C6696f mo36815a(String str) {
        Iterator<C6696f> it = this.f17490c.iterator();
        while (it.hasNext()) {
            C6696f next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
