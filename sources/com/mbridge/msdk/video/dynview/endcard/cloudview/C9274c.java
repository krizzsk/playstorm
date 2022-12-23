package com.mbridge.msdk.video.dynview.endcard.cloudview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.c */
/* compiled from: TagCloud */
public final class C9274c {

    /* renamed from: c */
    private static final float[] f22475c = {0.886f, 0.725f, 0.188f, 1.0f};

    /* renamed from: d */
    private static final float[] f22476d = {0.3f, 0.3f, 0.3f, 1.0f};

    /* renamed from: a */
    private List<C9271a> f22477a;

    /* renamed from: b */
    private int f22478b;

    /* renamed from: e */
    private float[] f22479e;

    /* renamed from: f */
    private float[] f22480f;

    /* renamed from: g */
    private float f22481g;

    /* renamed from: h */
    private float f22482h;

    /* renamed from: i */
    private float f22483i;

    /* renamed from: j */
    private float f22484j;

    /* renamed from: k */
    private float f22485k;

    /* renamed from: l */
    private float f22486l;

    /* renamed from: m */
    private float f22487m;

    /* renamed from: n */
    private float f22488n;

    /* renamed from: o */
    private float f22489o;

    /* renamed from: p */
    private int f22490p;

    /* renamed from: q */
    private int f22491q;

    /* renamed from: r */
    private boolean f22492r;

    /* renamed from: s */
    private float f22493s;

    /* renamed from: t */
    private float f22494t;

    public C9274c() {
        this(3);
    }

    private C9274c(int i) {
        this(new ArrayList(), i);
    }

    private C9274c(List<C9271a> list, int i) {
        this(list, i, f22475c, f22476d);
    }

    private C9274c(List<C9271a> list, int i, float[] fArr, float[] fArr2) {
        this.f22487m = 0.0f;
        this.f22488n = 0.0f;
        this.f22489o = 0.0f;
        this.f22492r = true;
        this.f22477a = list;
        this.f22478b = i;
        this.f22479e = fArr;
        this.f22480f = fArr2;
    }

    /* renamed from: a */
    public final void mo62448a(boolean z) {
        double d;
        double d2;
        this.f22492r = z;
        try {
            int size = this.f22477a.size();
            for (int i = 1; i < size + 1; i++) {
                if (z) {
                    double d3 = (double) size;
                    d = Math.acos((((((double) i) * 2.0d) - 1.0d) / d3) - 4.0d);
                    d2 = Math.sqrt(d3 * 3.141592653589793d) * d;
                } else {
                    d = Math.random() * 3.141592653589793d;
                    d2 = Math.random() * 6.283185307179586d;
                }
                int i2 = i - 1;
                this.f22477a.get(i2).mo62424a((float) ((int) (((double) this.f22478b) * Math.cos(d2) * Math.sin(d))));
                this.f22477a.get(i2).mo62428b((float) ((int) (((double) this.f22478b) * Math.sin(d2) * Math.sin(d))));
                this.f22477a.get(i2).mo62430c((float) ((int) (((double) this.f22478b) * Math.cos(d))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i3 = 0;
        while (i3 < this.f22477a.size()) {
            try {
                int f = this.f22477a.get(i3).mo62436f();
                this.f22491q = Math.max(this.f22491q, f);
                this.f22490p = Math.min(this.f22490p, f);
                i3++;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        for (C9271a b : this.f22477a) {
            m26585b(b);
        }
        m26588f();
        m26587e();
    }

    /* renamed from: a */
    public final void mo62445a() {
        this.f22477a.clear();
    }

    /* renamed from: b */
    public final List<C9271a> mo62450b() {
        return this.f22477a;
    }

    /* renamed from: a */
    public final C9271a mo62444a(int i) {
        return this.f22477a.get(i);
    }

    /* renamed from: c */
    public final void mo62453c() {
        mo62448a(this.f22492r);
    }

    /* renamed from: d */
    public final void mo62454d() {
        if (Math.abs(this.f22488n) > 0.1f || Math.abs(this.f22489o) > 0.1f) {
            m26588f();
            m26587e();
        }
    }

    /* renamed from: b */
    private void m26585b(C9271a aVar) {
        aVar.mo62426a(m26584a(m26586c(aVar)));
    }

    /* renamed from: c */
    private float m26586c(C9271a aVar) {
        int f = aVar.mo62436f();
        int i = this.f22490p;
        int i2 = this.f22491q;
        if (i == i2) {
            return 1.0f;
        }
        return (((float) f) - ((float) i)) / (((float) i2) - ((float) i));
    }

    /* renamed from: a */
    public final void mo62447a(C9271a aVar) {
        m26585b(aVar);
        double random = Math.random() * 3.141592653589793d;
        double random2 = Math.random() * 6.283185307179586d;
        aVar.mo62424a((float) ((int) (((double) this.f22478b) * Math.cos(random2) * Math.sin(random))));
        aVar.mo62428b((float) ((int) (((double) this.f22478b) * Math.sin(random2) * Math.sin(random))));
        aVar.mo62430c((float) ((int) (((double) this.f22478b) * Math.cos(random))));
        this.f22477a.add(aVar);
        m26587e();
    }

    /* renamed from: e */
    private void m26587e() {
        int i = 0;
        while (i < this.f22477a.size()) {
            try {
                C9271a aVar = this.f22477a.get(i);
                float a = aVar.mo62423a();
                float b = aVar.mo62427b();
                float c = aVar.mo62429c();
                float f = (this.f22482h * b) + ((-this.f22481g) * c);
                float f2 = (b * this.f22481g) + (c * this.f22482h);
                float f3 = (this.f22484j * a) + (this.f22483i * f2);
                float f4 = (a * (-this.f22483i)) + (f2 * this.f22484j);
                float f5 = (this.f22486l * f3) + ((-this.f22485k) * f);
                float f6 = (f3 * this.f22485k) + (f * this.f22486l);
                aVar.mo62424a(f5);
                aVar.mo62428b(f6);
                aVar.mo62430c(f4);
                float f7 = (float) (this.f22478b * 2);
                float f8 = f7 / 1.0f;
                float f9 = f7 + f4;
                float f10 = f8 / f9;
                aVar.mo62437f((float) ((int) (f5 * f10)));
                aVar.mo62439g((float) ((int) (f6 * f10)));
                aVar.mo62433d(f10);
                this.f22493s = Math.max(this.f22493s, f9);
                float min = Math.min(this.f22494t, f9);
                this.f22494t = min;
                aVar.mo62435e(1.0f - ((f9 - min) / (this.f22493s - min)));
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        Collections.sort(this.f22477a);
    }

    /* renamed from: a */
    private float[] m26584a(float f) {
        float[] fArr = this.f22480f;
        float f2 = 1.0f - f;
        float[] fArr2 = this.f22479e;
        return new float[]{1.0f, (fArr[0] * f) + (fArr2[0] * f2), (fArr[1] * f) + (fArr2[1] * f2), (f * fArr[2]) + (f2 * fArr2[2])};
    }

    /* renamed from: f */
    private void m26588f() {
        this.f22481g = (float) Math.sin(((double) this.f22488n) * 0.017453292519943295d);
        this.f22482h = (float) Math.cos(((double) this.f22488n) * 0.017453292519943295d);
        this.f22483i = (float) Math.sin(((double) this.f22489o) * 0.017453292519943295d);
        this.f22484j = (float) Math.cos(((double) this.f22489o) * 0.017453292519943295d);
        this.f22485k = (float) Math.sin(((double) this.f22487m) * 0.017453292519943295d);
        this.f22486l = (float) Math.cos(((double) this.f22487m) * 0.017453292519943295d);
    }

    /* renamed from: b */
    public final void mo62451b(int i) {
        this.f22478b = i;
    }

    /* renamed from: a */
    public final void mo62449a(float[] fArr) {
        this.f22479e = fArr;
    }

    /* renamed from: b */
    public final void mo62452b(float[] fArr) {
        this.f22480f = fArr;
    }

    /* renamed from: a */
    public final void mo62446a(float f, float f2) {
        this.f22488n = f;
        this.f22489o = f2;
    }
}
