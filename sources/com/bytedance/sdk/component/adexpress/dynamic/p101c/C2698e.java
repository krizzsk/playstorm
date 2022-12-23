package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2681b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2689i;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.e */
/* compiled from: DynamicCanvas */
public class C2698e {

    /* renamed from: a */
    public C2681b f5923a;

    /* renamed from: b */
    protected C2691a f5924b = new C2691a();

    /* renamed from: c */
    private C2688h f5925c;

    /* renamed from: d */
    private C2699a f5926d;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.e$a */
    /* compiled from: DynamicCanvas */
    static class C2699a {

        /* renamed from: a */
        float f5927a;

        /* renamed from: b */
        float f5928b;

        /* renamed from: c */
        float f5929c;

        C2699a() {
        }
    }

    /* renamed from: a */
    public void mo17195a(C2699a aVar) {
        this.f5926d = aVar;
    }

    /* renamed from: a */
    public void mo17192a() {
        this.f5924b.mo17182a();
    }

    /* renamed from: a */
    public void mo17194a(C2688h hVar, float f, float f2) {
        if (hVar != null) {
            this.f5925c = hVar;
        }
        C2688h hVar2 = this.f5925c;
        float g = hVar2.mo17157g();
        float h = hVar2.mo17159h();
        float f3 = TextUtils.equals(hVar2.mo17160i().mo16960e().mo17078q(), "fixed") ? h : 65536.0f;
        this.f5924b.mo17182a();
        this.f5924b.mo17184c(hVar2, g, f3);
        C2691a.C2694c a = this.f5924b.mo17179a(hVar2);
        C2681b bVar = new C2681b();
        bVar.f5792a = f;
        bVar.f5793b = f2;
        if (a != null) {
            g = a.f5919a;
        }
        bVar.f5794c = g;
        if (a != null) {
            h = a.f5920b;
        }
        bVar.f5795d = h;
        bVar.f5796e = "root";
        bVar.f5800i = 1280.0f;
        bVar.f5797f = hVar2;
        bVar.f5797f.mo17150c(bVar.f5792a);
        bVar.f5797f.mo17152d(bVar.f5793b);
        bVar.f5797f.mo17154e(bVar.f5794c);
        bVar.f5797f.mo17156f(bVar.f5795d);
        C2681b a2 = mo17191a(bVar, 0.0f);
        this.f5923a = a2;
        mo17193a(a2);
    }

    /* renamed from: a */
    public void mo17193a(C2681b bVar) {
        if (bVar != null) {
            C2975l.m8384b("DynamicCanvas", "native parser: type = " + bVar.f5797f.mo17160i().mo16954b() + "; width = " + bVar.f5794c + "; height = " + bVar.f5795d + "; x = " + bVar.f5792a + "; y = " + bVar.f5793b);
            List<List<C2681b>> list = bVar.f5798g;
            if (list != null && list.size() > 0) {
                for (List<C2681b> next : list) {
                    if (next != null && next.size() > 0) {
                        for (C2681b a : next) {
                            mo17193a(a);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0201  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p100b.C2681b mo17191a(com.bytedance.sdk.component.adexpress.dynamic.p100b.C2681b r37, float r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.h r2 = r1.f5797f
            if (r2 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r2.mo17169r()
            java.util.List r3 = r2.mo17167p()
            if (r3 == 0) goto L_0x03fe
            int r4 = r3.size()
            if (r4 > 0) goto L_0x001a
            goto L_0x03fe
        L_0x001a:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r4 = r2.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r4 = r4.mo16960e()
            float r5 = r4.mo17048i()
            float r6 = r4.mo17043h()
            float r7 = r4.mo17033f()
            float r8 = r4.mo17038g()
            float r9 = r4.mo17023d()
            java.lang.String r10 = r4.mo17093w()
            java.lang.String r11 = r4.mo17095x()
            float r12 = r1.f5792a
            float r12 = r12 + r8
            float r13 = r1.f5793b
            float r13 = r13 + r5
            float r14 = r1.f5794c
            float r14 = r14 - r8
            float r14 = r14 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r6
            float r14 = r14 - r9
            float r8 = r1.f5795d
            float r8 = r8 - r5
            float r8 = r8 - r7
            float r8 = r8 - r9
            com.bytedance.sdk.component.adexpress.dynamic.b.i r5 = new com.bytedance.sdk.component.adexpress.dynamic.b.i
            r5.<init>(r12, r13)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r7 = r1.f5798g
            if (r7 != 0) goto L_0x0061
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.f5798g = r7
        L_0x0061:
            java.util.Iterator r7 = r3.iterator()
            r13 = 0
        L_0x0066:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x007e
            java.lang.Object r15 = r7.next()
            java.util.List r15 = (java.util.List) r15
            com.bytedance.sdk.component.adexpress.dynamic.c.a r9 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r9 = r9.mo17181a((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>) r15)
            if (r9 == 0) goto L_0x0066
            float r9 = r9.f5920b
            float r13 = r13 + r9
            goto L_0x0066
        L_0x007e:
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            java.lang.String r9 = "space-between"
            java.lang.String r15 = "space-around"
            java.lang.String r6 = "flex-end"
            r17 = r12
            java.lang.String r12 = "center"
            r18 = r4
            r4 = 1
            if (r7 >= 0) goto L_0x00d1
            boolean r7 = android.text.TextUtils.equals(r11, r12)
            if (r7 == 0) goto L_0x009b
            float r8 = r8 - r13
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r7
        L_0x0099:
            r7 = 0
            goto L_0x00d3
        L_0x009b:
            boolean r7 = android.text.TextUtils.equals(r11, r6)
            if (r7 == 0) goto L_0x00a3
            float r8 = r8 - r13
            goto L_0x0099
        L_0x00a3:
            boolean r7 = android.text.TextUtils.equals(r11, r15)
            if (r7 == 0) goto L_0x00b7
            float r8 = r8 - r13
            int r7 = r3.size()
            int r7 = r7 + r4
            float r7 = (float) r7
            float r8 = r8 / r7
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.p101c.C2709k.m7346a(r8)
            r7 = r8
            goto L_0x00d3
        L_0x00b7:
            boolean r7 = android.text.TextUtils.equals(r11, r9)
            if (r7 == 0) goto L_0x00d1
            int r7 = r3.size()
            if (r7 <= r4) goto L_0x00d1
            float r8 = r8 - r13
            int r7 = r3.size()
            int r7 = r7 - r4
            float r7 = (float) r7
            float r8 = r8 / r7
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.p101c.C2709k.m7346a(r8)
            r7 = r8
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            r8 = 0
        L_0x00d3:
            float r11 = r5.f5906b
            float r11 = r11 + r8
            r5.f5906b = r11
            r11 = r38
            r13 = 0
        L_0x00db:
            int r8 = r3.size()
            if (r13 >= r8) goto L_0x03fc
            java.lang.Object r8 = r3.get(r13)
            java.util.List r8 = (java.util.List) r8
            int r13 = r13 + 1
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r4 = r1.f5798g
            int r4 = r4.size()
            if (r13 < r4) goto L_0x0117
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r4 = r1.f5798g
            int r4 = r4.size()
            int r4 = r13 - r4
            r19 = 1
            int r4 = r4 + 1
            r20 = r3
            r3 = 0
        L_0x0100:
            if (r3 >= r4) goto L_0x0119
            r38 = r4
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r4 = r1.f5798g
            r21 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r4.add(r11)
            int r3 = r3 + 1
            r4 = r38
            r11 = r21
            goto L_0x0100
        L_0x0117:
            r20 = r3
        L_0x0119:
            r21 = r11
            java.util.Iterator r3 = r8.iterator()
            r4 = 0
        L_0x0120:
            boolean r11 = r3.hasNext()
            r22 = r7
            if (r11 == 0) goto L_0x0161
            java.lang.Object r11 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r11 = (com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11
            com.bytedance.sdk.component.adexpress.dynamic.b.e r23 = r11.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r23 = r23.mo16960e()
            java.lang.String r7 = r23.mo17081r()
            r24 = r3
            int r3 = r23.mo16972J()
            java.lang.String r1 = "flex"
            boolean r1 = android.text.TextUtils.equals(r7, r1)
            if (r1 != 0) goto L_0x015a
            r1 = 1
            if (r3 == r1) goto L_0x015a
            r1 = 2
            if (r3 != r1) goto L_0x014f
            goto L_0x015a
        L_0x014f:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r1 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r1.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11)
            if (r1 == 0) goto L_0x015a
            float r1 = r1.f5919a
            float r4 = r4 + r1
        L_0x015a:
            r1 = r37
            r7 = r22
            r3 = r24
            goto L_0x0120
        L_0x0161:
            float r1 = r14 - r4
            r3 = 0
            float r1 = java.lang.Math.max(r1, r3)
            java.util.Iterator r4 = r8.iterator()
            r7 = r3
        L_0x016d:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01a1
            java.lang.Object r11 = r4.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r11 = (com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11
            com.bytedance.sdk.component.adexpress.dynamic.b.e r16 = r11.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r16 = r16.mo16960e()
            int r3 = r16.mo16972J()
            r24 = r4
            r4 = 1
            if (r3 == r4) goto L_0x019d
            int r3 = r16.mo16972J()
            r4 = 2
            if (r3 != r4) goto L_0x0192
            goto L_0x019d
        L_0x0192:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11)
            if (r3 == 0) goto L_0x019d
            float r3 = r3.f5919a
            float r7 = r7 + r3
        L_0x019d:
            r4 = r24
            r3 = 0
            goto L_0x016d
        L_0x01a1:
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ef
            boolean r3 = android.text.TextUtils.equals(r10, r12)
            if (r3 == 0) goto L_0x01b1
            float r3 = r14 - r7
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            goto L_0x01f0
        L_0x01b1:
            boolean r3 = android.text.TextUtils.equals(r10, r6)
            if (r3 == 0) goto L_0x01ba
            float r3 = r14 - r7
            goto L_0x01f0
        L_0x01ba:
            boolean r3 = android.text.TextUtils.equals(r10, r15)
            if (r3 == 0) goto L_0x01d0
            float r3 = r14 - r7
            int r4 = r8.size()
            r11 = 1
            int r4 = r4 + r11
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.p101c.C2709k.m7346a(r3)
            r4 = r3
            goto L_0x01f1
        L_0x01d0:
            r11 = 1
            boolean r3 = android.text.TextUtils.equals(r10, r9)
            if (r3 == 0) goto L_0x01ef
            int r3 = r8.size()
            if (r3 <= r11) goto L_0x01ef
            float r3 = r14 - r7
            int r4 = r8.size()
            float r4 = (float) r4
            r7 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r7
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.p101c.C2709k.m7346a(r3)
            r4 = r3
            r3 = 0
            goto L_0x01f1
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            r4 = 0
        L_0x01f1:
            float r7 = r5.f5905a
            float r7 = r7 + r3
            r5.f5905a = r7
            java.util.Iterator r3 = r8.iterator()
            r7 = 0
        L_0x01fb:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x0243
            java.lang.Object r11 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r11 = (com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11
            r16 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11)
            if (r3 == 0) goto L_0x021a
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r11)
            float r3 = r3.f5920b
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r11 = r11.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r11 = r11.mo16960e()
            r24 = r3
            int r3 = r11.mo16972J()
            r25 = r9
            r9 = 1
            if (r3 == r9) goto L_0x0239
            int r3 = r11.mo16972J()
            r9 = 2
            if (r3 != r9) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r3 = r24
            goto L_0x023a
        L_0x0239:
            r3 = 0
        L_0x023a:
            float r7 = java.lang.Math.max(r7, r3)
            r3 = r16
            r9 = r25
            goto L_0x01fb
        L_0x0243:
            r25 = r9
            java.util.Iterator r3 = r8.iterator()
            r11 = r21
        L_0x024b:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x03d7
            java.lang.Object r9 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r9 = (com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r9
            r16 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r9)
            com.bytedance.sdk.component.adexpress.dynamic.b.e r21 = r9.mo17160i()
            r24 = r10
            com.bytedance.sdk.component.adexpress.dynamic.b.f r10 = r21.mo16960e()
            r21 = r11
            int r11 = r10.mo16963A()
            float r11 = (float) r11
            r26 = r14
            int r14 = r10.mo16966D()
            float r14 = (float) r14
            r27 = r15
            int r15 = r10.mo16964B()
            float r15 = (float) r15
            r28 = r4
            int r4 = r10.mo16965C()
            float r4 = (float) r4
            r29 = r5
            if (r3 != 0) goto L_0x028b
            r5 = 0
            goto L_0x028d
        L_0x028b:
            float r5 = r3.f5919a
        L_0x028d:
            if (r3 != 0) goto L_0x0293
            r30 = r8
            r3 = 0
            goto L_0x0297
        L_0x0293:
            float r3 = r3.f5920b
            r30 = r8
        L_0x0297:
            java.lang.String r8 = r2.mo17144b()
            r31 = r2
            java.lang.String r2 = "root"
            boolean r2 = android.text.TextUtils.equals(r8, r2)
            if (r2 == 0) goto L_0x02a7
            float r2 = (float) r13
            goto L_0x02a9
        L_0x02a7:
            r2 = r21
        L_0x02a9:
            int r8 = r10.mo16972J()
            r32 = r13
            r13 = 1
            if (r8 != r13) goto L_0x02c1
            float r8 = r5 - r14
            float r8 = r8 - r4
            float r13 = r3 - r11
            float r13 = r13 - r15
            r21 = r2
            r2 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.m7299a(r2, r10, r8, r13)
            goto L_0x02c7
        L_0x02c1:
            r21 = r2
            r2 = r37
            r8 = r29
        L_0x02c7:
            int r13 = r10.mo16972J()
            r33 = r8
            r8 = 2
            if (r13 != r8) goto L_0x02ed
            com.bytedance.sdk.component.adexpress.dynamic.c.a r8 = r0.f5924b
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = r0.f5925c
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r8 = r8.mo17179a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r13)
            float r13 = r5 - r14
            float r13 = r13 - r4
            float r33 = r3 - r11
            r34 = r1
            float r1 = r33 - r15
            r35 = r9
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r9 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r9.<init>(r13, r1)
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.m7300a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f) r10, (com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.C2694c) r8, (com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.C2694c) r9)
            goto L_0x02f3
        L_0x02ed:
            r34 = r1
            r35 = r9
            r8 = r33
        L_0x02f3:
            java.lang.String r1 = r18.mo16987Y()
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0334
            java.lang.String r9 = "flex-start"
            boolean r9 = android.text.TextUtils.equals(r1, r9)
            if (r9 != 0) goto L_0x0334
            int r13 = r1.hashCode()
            r9 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r13 == r9) goto L_0x031a
            r9 = 1742952711(0x67e35907, float:2.1472389E24)
            if (r13 == r9) goto L_0x0312
            goto L_0x0322
        L_0x0312:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0322
            r1 = 1
            goto L_0x0323
        L_0x031a:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0322
            r1 = 0
            goto L_0x0323
        L_0x0322:
            r1 = -1
        L_0x0323:
            if (r1 == 0) goto L_0x032e
            r9 = 1
            if (r1 == r9) goto L_0x0329
            goto L_0x0334
        L_0x0329:
            float r1 = r7 - r3
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x0337
        L_0x032e:
            float r1 = r7 - r3
            r9 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r9
            goto L_0x0337
        L_0x0334:
            r9 = 1073741824(0x40000000, float:2.0)
            r1 = 0
        L_0x0337:
            com.bytedance.sdk.component.adexpress.dynamic.b.b r13 = new com.bytedance.sdk.component.adexpress.dynamic.b.b
            r13.<init>()
            float r9 = r8.f5905a
            float r9 = r9 + r4
            r13.f5792a = r9
            float r8 = r8.f5906b
            float r8 = r8 + r11
            float r8 = r8 + r1
            r13.f5793b = r8
            float r1 = r5 - r14
            float r1 = r1 - r4
            r13.f5794c = r1
            float r3 = r3 - r11
            float r3 = r3 - r15
            r13.f5795d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.f5796e
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r35.mo17144b()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r13.f5796e = r1
            r13.f5799h = r2
            r9 = r35
            r13.f5797f = r9
            r1 = r34
            r13.f5800i = r1
            r8 = r30
            r13.f5801j = r8
            com.bytedance.sdk.component.adexpress.dynamic.b.h r3 = r13.f5797f
            float r4 = r13.f5792a
            r3.mo17150c(r4)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r3 = r13.f5797f
            float r4 = r13.f5793b
            r3.mo17152d(r4)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r3 = r13.f5797f
            float r4 = r13.f5794c
            r3.mo17154e(r4)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r3 = r13.f5797f
            float r4 = r13.f5795d
            r3.mo17156f(r4)
            r3 = r21
            com.bytedance.sdk.component.adexpress.dynamic.b.b r4 = r0.mo17191a(r13, r3)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r9 = r2.f5798g
            r13 = r32
            java.lang.Object r9 = r9.get(r13)
            java.util.List r9 = (java.util.List) r9
            r9.add(r4)
            int r4 = r10.mo16972J()
            r9 = 1
            if (r4 == r9) goto L_0x03c4
            int r4 = r10.mo16972J()
            r10 = 2
            if (r4 == r10) goto L_0x03c1
            r4 = r29
            float r11 = r4.f5905a
            float r5 = r5 + r28
            float r11 = r11 + r5
            r4.f5905a = r11
            goto L_0x03c7
        L_0x03c1:
            r4 = r29
            goto L_0x03c7
        L_0x03c4:
            r4 = r29
            r10 = 2
        L_0x03c7:
            r11 = r3
            r5 = r4
            r3 = r16
            r10 = r24
            r14 = r26
            r15 = r27
            r4 = r28
            r2 = r31
            goto L_0x024b
        L_0x03d7:
            r31 = r2
            r4 = r5
            r24 = r10
            r21 = r11
            r26 = r14
            r27 = r15
            r3 = r17
            r9 = 1
            r2 = r37
            r4.f5905a = r3
            float r1 = r4.f5906b
            float r7 = r7 + r22
            float r1 = r1 + r7
            r4.f5906b = r1
            r1 = r2
            r4 = r9
            r3 = r20
            r7 = r22
            r9 = r25
            r2 = r31
            goto L_0x00db
        L_0x03fc:
            r2 = r1
            return r2
        L_0x03fe:
            r2 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p101c.C2698e.mo17191a(com.bytedance.sdk.component.adexpress.dynamic.b.b, float):com.bytedance.sdk.component.adexpress.dynamic.b.b");
    }

    /* renamed from: a */
    private C2689i m7300a(C2686f fVar, C2691a.C2694c cVar, C2691a.C2694c cVar2) {
        float U = (float) fVar.mo16983U();
        float W = (float) fVar.mo16985W();
        float V = (float) fVar.mo16984V();
        float X = (float) fVar.mo16986X();
        boolean L = fVar.mo16974L();
        boolean M = fVar.mo16975M();
        boolean N = fVar.mo16976N();
        boolean O = fVar.mo16977O();
        if (!L) {
            if (M) {
                U = ((this.f5926d.f5927a != 0.0f ? this.f5926d.f5927a : cVar.f5919a) - V) - cVar2.f5919a;
            } else {
                U = 0.0f;
            }
        }
        if (!N) {
            if (O) {
                W = ((this.f5926d.f5928b != 0.0f ? this.f5926d.f5928b : cVar.f5920b) - X) - cVar2.f5920b;
            } else {
                W = 0.0f;
            }
        }
        return new C2689i(U, W);
    }

    /* renamed from: a */
    private C2689i m7299a(C2681b bVar, C2686f fVar, float f, float f2) {
        float f3;
        float f4;
        C2681b bVar2 = bVar;
        float f5 = bVar2.f5792a;
        float f6 = bVar2.f5793b;
        float U = (float) fVar.mo16983U();
        float W = (float) fVar.mo16985W();
        float V = (float) fVar.mo16984V();
        float X = (float) fVar.mo16986X();
        boolean L = fVar.mo16974L();
        boolean M = fVar.mo16975M();
        boolean N = fVar.mo16976N();
        boolean O = fVar.mo16977O();
        String K = fVar.mo16973K();
        float f7 = bVar2.f5794c;
        float f8 = bVar2.f5795d;
        if (TextUtils.equals(K, "0")) {
            if (L) {
                f5 = bVar2.f5792a + U;
            } else if (M) {
                f5 = ((bVar2.f5792a + f7) - V) - f;
            }
            if (N) {
                f4 = bVar2.f5793b;
            } else {
                if (O) {
                    f3 = bVar2.f5793b;
                    f6 = ((f3 + f8) - X) - f2;
                }
                return new C2689i(f5, f6);
            }
        } else {
            if (TextUtils.equals(K, "1")) {
                f5 = bVar2.f5792a + ((f7 - f) / 2.0f);
                if (N) {
                    f4 = bVar2.f5793b;
                } else if (O) {
                    f3 = bVar2.f5793b;
                    f6 = ((f3 + f8) - X) - f2;
                }
            } else if (TextUtils.equals(K, "2")) {
                f6 = bVar2.f5793b + ((f8 - f2) / 2.0f);
                if (L) {
                    f5 = bVar2.f5792a + U;
                } else if (M) {
                    f5 = ((bVar2.f5792a + f7) - V) - f;
                }
            } else if (TextUtils.equals(K, "3")) {
                f5 = bVar2.f5792a + ((f7 - f) / 2.0f);
                f6 = bVar2.f5793b + ((f8 - f2) / 2.0f);
            }
            return new C2689i(f5, f6);
        }
        f6 = f4 + W;
        return new C2689i(f5, f6);
    }
}
