package com.bytedance.sdk.component.adexpress.dynamic.p101c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a */
/* compiled from: ComputeRuler */
public class C2691a {

    /* renamed from: a */
    public Map<String, C2694c> f5907a = new HashMap();

    /* renamed from: b */
    public Map<String, C2694c> f5908b = new HashMap();

    /* renamed from: c */
    public Map<String, C2694c> f5909c = new HashMap();

    /* renamed from: d */
    private double f5910d = Math.random();

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.C2694c mo17180a(com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17160i()
            java.lang.String r0 = r0.mo16957c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r0 = r0.mo16960e()
            java.lang.String r0 = r0.mo16978P()
            if (r0 != 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0023:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.mo17160i()
            java.lang.String r0 = r0.mo16954b()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0039
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0039:
            float r0 = r13.mo17157g()
            float r1 = r13.mo17159h()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r2 = r13.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r2 = r2.mo16960e()
            java.lang.String r3 = r2.mo17081r()
            java.lang.String r2 = r2.mo17078q()
            int r4 = r13.mo17163l()
            float r4 = (float) r4
            int r5 = r13.mo17164m()
            float r5 = (float) r5
            float r6 = r13.mo17165n()
            float r7 = r13.mo17166o()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L_0x0086
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17183b((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r13, (float) r0, (float) r1)
            float r13 = r13.f5920b
        L_0x0083:
            float r1 = r13 + r7
            goto L_0x00b7
        L_0x0086:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L_0x009f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17183b((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r13, (float) r14, (float) r0)
            float r14 = r13.f5919a
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r13 = r13.f5920b
            goto L_0x0083
        L_0x009f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto L_0x00b6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.mo17183b((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r13, (float) r0, (float) r1)
            float r13 = r13.f5920b
            goto L_0x0083
        L_0x00b6:
            r14 = r0
        L_0x00b7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto L_0x00d9
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto L_0x00ed
        L_0x00d7:
            r15 = r13
            goto L_0x00ed
        L_0x00d9:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto L_0x00e5
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto L_0x00ed
        L_0x00e5:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r15 = r1
        L_0x00ed:
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>()
            r13.f5919a = r14
            r13.f5920b = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.mo17180a(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: b */
    public C2694c mo17183b(C2688h hVar, float f, float f2) {
        C2694c cVar = new C2694c();
        if (hVar.mo17160i().mo16960e() == null) {
            return cVar;
        }
        C2694c e = m7281e(hVar, f, f2);
        float f3 = e.f5919a;
        float f4 = e.f5920b;
        cVar.f5919a = Math.min(f3, f);
        cVar.f5920b = Math.min(f4, f2);
        return cVar;
    }

    /* renamed from: e */
    private C2694c m7281e(C2688h hVar, float f, float f2) {
        String str = hVar.mo17144b() + "_" + f + "_" + f2;
        if (this.f5909c.containsKey(str)) {
            return this.f5909c.get(str);
        }
        C2694c f3 = m7283f(hVar, f, f2);
        this.f5909c.put(str, f3);
        return f3;
    }

    /* renamed from: f */
    private C2694c m7283f(C2688h hVar, float f, float f2) {
        new C2694c();
        C2686f e = hVar.mo17160i().mo16960e();
        hVar.mo17160i().mo16957c();
        e.mo16969G();
        float j = e.mo17053j();
        int F = e.mo16968F();
        double E = e.mo16967E();
        int H = e.mo16970H();
        boolean y = e.mo17097y();
        boolean I = e.mo16971I();
        int z = e.mo17098z();
        C2693b bVar = new C2693b();
        bVar.f5914a = j;
        bVar.f5915b = F;
        bVar.f5916c = H;
        bVar.f5917d = E;
        bVar.f5918e = f;
        return m7267a(hVar.mo17160i().mo16957c(), bVar, y, I, z, hVar);
    }

    /* renamed from: a */
    private C2694c m7267a(String str, C2693b bVar, boolean z, boolean z2, int i, C2688h hVar) {
        return C2710l.m7350a(str, hVar.mo17160i().mo16954b(), C2693b.m7291a(bVar).toString(), z, z2, i);
    }

    /* renamed from: c */
    public C2694c mo17184c(C2688h hVar, float f, float f2) {
        if (hVar == null) {
            return null;
        }
        C2694c a = mo17179a(hVar);
        if (a != null && (a.f5919a != 0.0f || a.f5920b != 0.0f)) {
            return a;
        }
        C2694c d = mo17185d(hVar, f, f2);
        m7268a(hVar, d);
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.C2694c mo17185d(com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h r19, float r20, float r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r3.<init>()
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x011a
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x0016
            goto L_0x011a
        L_0x0016:
            boolean r5 = r19.mo17168q()
            if (r5 == 0) goto L_0x0021
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r18.mo17180a((com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h) r19, (float) r20, (float) r21)
            return r1
        L_0x0021:
            float r5 = r19.mo17157g()
            float r6 = r19.mo17159h()
            float r7 = r19.mo17165n()
            float r8 = r19.mo17166o()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r9 = r19.mo17160i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r9.mo16960e()
            java.lang.String r10 = r9.mo17081r()
            java.lang.String r9 = r9.mo17078q()
            java.lang.String r11 = "flex"
            boolean r12 = android.text.TextUtils.equals(r10, r11)
            java.lang.String r13 = "auto"
            if (r12 != 0) goto L_0x0057
            boolean r12 = android.text.TextUtils.equals(r10, r13)
            if (r12 == 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            float r5 = java.lang.Math.min(r5, r1)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            float r5 = r5 - r7
            java.lang.String r12 = "scale"
            boolean r12 = android.text.TextUtils.equals(r9, r12)
            if (r12 == 0) goto L_0x0076
            float r12 = r5 / r6
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            float r12 = r12 + r8
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0089
            float r5 = r2 - r8
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            goto L_0x0088
        L_0x0076:
            boolean r12 = android.text.TextUtils.equals(r9, r13)
            if (r12 != 0) goto L_0x0088
            boolean r12 = android.text.TextUtils.equals(r9, r11)
            if (r12 == 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            float r12 = java.lang.Math.min(r6, r2)
            goto L_0x0089
        L_0x0088:
            r12 = r2
        L_0x0089:
            float r12 = r12 - r8
            java.util.List r6 = r19.mo17167p()
            java.util.Iterator r14 = r6.iterator()
            r15 = r4
            r16 = r15
        L_0x0095:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x00c3
            java.lang.Object r17 = r14.next()
            r1 = r17
            java.util.List r1 = (java.util.List) r1
            r19 = r14
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r14 = r0.m7273b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>) r1, (float) r5, (float) r12)
            boolean r1 = r0.m7275b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>) r1)
            if (r1 == 0) goto L_0x00b3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r1
            goto L_0x00ba
        L_0x00b3:
            float r1 = r14.f5919a
            float r1 = java.lang.Math.max(r15, r1)
            r15 = r1
        L_0x00ba:
            float r1 = r14.f5920b
            float r16 = r16 + r1
            r14 = r19
            r1 = r20
            goto L_0x0095
        L_0x00c3:
            boolean r1 = android.text.TextUtils.equals(r10, r13)
            if (r1 == 0) goto L_0x00ec
            int r1 = r6.size()
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d5
            r15 = r20
            goto L_0x00ed
        L_0x00d5:
            java.util.Iterator r1 = r6.iterator()
        L_0x00d9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            r0.m7277c((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>) r4)
            r0.m7273b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>) r4, (float) r15, (float) r12)
            goto L_0x00d9
        L_0x00ec:
            r15 = r5
        L_0x00ed:
            boolean r1 = android.text.TextUtils.equals(r9, r13)
            if (r1 == 0) goto L_0x00fe
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00fa
            r12 = r16
            goto L_0x0113
        L_0x00fa:
            r0.m7269a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>>) r6, (float) r15, (float) r12)
            goto L_0x0113
        L_0x00fe:
            java.lang.String r1 = "fixed"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto L_0x010c
            boolean r1 = android.text.TextUtils.equals(r9, r11)
            if (r1 == 0) goto L_0x0113
        L_0x010c:
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0113
            r0.m7269a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h>>) r6, (float) r15, (float) r12)
        L_0x0113:
            float r15 = r15 + r7
            float r12 = r12 + r8
            r3.f5919a = r15
            r3.f5920b = r12
            return r3
        L_0x011a:
            r3.f5919a = r4
            r3.f5920b = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p101c.C2691a.mo17185d(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    /* renamed from: a */
    private void m7269a(List<List<C2688h>> list, float f, float f2) {
        float f3;
        if (list != null && list.size() > 0) {
            boolean z = false;
            for (List<C2688h> a : list) {
                if (m7272a(a, false)) {
                    z = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (List next : list) {
                C2692a aVar = new C2692a();
                boolean a2 = m7272a((List<C2688h>) next, !z);
                C2694c b = m7273b((List<C2688h>) next, f, f2);
                if (a2) {
                    f3 = 1.0f;
                } else {
                    f3 = b.f5920b;
                }
                aVar.f5911a = f3;
                aVar.f5912b = !a2;
                arrayList.add(aVar);
            }
            List<C2692a> a3 = C2709k.m7347a(f2, arrayList);
            for (int i = 0; i < list.size(); i++) {
                if (((C2692a) arrayList.get(i)).f5911a != a3.get(i).f5911a) {
                    List list2 = list.get(i);
                    m7277c((List<C2688h>) list2);
                    m7273b((List<C2688h>) list2, f, a3.get(i).f5911a);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m7275b(List<C2688h> list) {
        boolean z;
        List<List<C2688h>> p;
        Iterator<C2688h> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().mo17160i().mo16960e().mo17081r(), "flex")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        Iterator<C2688h> it2 = list.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z2;
                }
                C2688h next = it2.next();
                if (TextUtils.equals(next.mo17160i().mo16960e().mo17081r(), TtmlNode.TEXT_EMPHASIS_AUTO) && (p = next.mo17167p()) != null) {
                    Iterator<List<C2688h>> it3 = p.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            continue;
                            break;
                        }
                        List next2 = it3.next();
                        i++;
                        if (m7275b((List<C2688h>) next2)) {
                            if (i == next2.size()) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C2694c m7273b(List<C2688h> list, float f, float f2) {
        C2694c a = mo17181a(list);
        if (a != null && (a.f5919a != 0.0f || a.f5920b != 0.0f)) {
            return a;
        }
        C2694c c = m7276c(list, f, f2);
        m7271a(list, c);
        return c;
    }

    /* renamed from: c */
    private C2694c m7276c(List<C2688h> list, float f, float f2) {
        float f3;
        m7279d(list);
        C2694c cVar = new C2694c();
        ArrayList<C2688h> arrayList = new ArrayList<>();
        ArrayList<C2688h> arrayList2 = new ArrayList<>();
        for (C2688h next : list) {
            C2686f e = next.mo17160i().mo16960e();
            if (e.mo16972J() == 1 || e.mo16972J() == 2) {
                arrayList.add(next);
            }
            if (!(e.mo16972J() == 1 || e.mo16972J() == 2)) {
                arrayList2.add(next);
            }
        }
        for (C2688h c : arrayList) {
            mo17184c(c, f, f2);
        }
        if (arrayList2.size() <= 0) {
            return cVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C2688h c2 : arrayList2) {
            arrayList3.add(Float.valueOf(mo17184c(c2, f, f2).f5919a));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            f3 = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            C2688h hVar = (C2688h) arrayList2.get(i);
            String r = hVar.mo17160i().mo16960e().mo17081r();
            float g = hVar.mo17157g();
            boolean equals = TextUtils.equals(r, "flex");
            if (TextUtils.equals(r, TtmlNode.TEXT_EMPHASIS_AUTO)) {
                List<List<C2688h>> p = hVar.mo17167p();
                if (p != null && p.size() > 0) {
                    Iterator<List<C2688h>> it = p.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (m7275b(it.next())) {
                                equals = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                equals = false;
            }
            C2692a aVar = new C2692a();
            if (!equals) {
                g = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f5911a = g;
            aVar.f5912b = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f5913c = f3;
            arrayList4.add(aVar);
            i++;
        }
        m7270a((List<C2692a>) arrayList4, f, (List<C2688h>) arrayList2);
        List<C2692a> a = C2709k.m7347a(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += a.get(i2).f5911a;
            if (((Float) arrayList3.get(i2)).floatValue() != a.get(i2).f5911a) {
                m7280d((C2688h) arrayList2.get(i2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            i3++;
            if (!m7274b((C2688h) it2.next())) {
                z = false;
                break;
            } else if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            f3 = f2;
        }
        ArrayList<C2694c> arrayList5 = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            C2688h hVar2 = (C2688h) arrayList2.get(i4);
            C2694c c3 = mo17184c(hVar2, a.get(i4).f5911a, f2);
            if (!m7274b(hVar2)) {
                f3 = Math.max(f3, c3.f5920b);
            }
            arrayList5.add(c3);
        }
        ArrayList arrayList6 = new ArrayList();
        for (C2694c cVar2 : arrayList5) {
            arrayList6.add(Float.valueOf(cVar2.f5920b));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                C2688h hVar3 = (C2688h) arrayList2.get(i5);
                if (m7274b(hVar3) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    m7280d(hVar3);
                    mo17184c(hVar3, a.get(i5).f5911a, f3);
                }
            }
        }
        cVar.f5919a = f4;
        cVar.f5920b = f3;
        return cVar;
    }

    /* renamed from: b */
    private boolean m7274b(C2688h hVar) {
        if (hVar == null) {
            return false;
        }
        if (TextUtils.equals(hVar.mo17160i().mo16960e().mo17078q(), "flex")) {
            return true;
        }
        return m7278c(hVar);
    }

    /* renamed from: c */
    private boolean m7278c(C2688h hVar) {
        List<List<C2688h>> p;
        if (!hVar.mo17168q() && TextUtils.equals(hVar.mo17160i().mo16960e().mo17078q(), TtmlNode.TEXT_EMPHASIS_AUTO) && (p = hVar.mo17167p()) != null && p.size() > 0) {
            if (p.size() == 1) {
                for (C2688h b : p.get(0)) {
                    if (!m7274b(b)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<C2688h> a : p) {
                if (m7272a(a, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m7272a(List<C2688h> list, boolean z) {
        boolean z2;
        Iterator<C2688h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String q = it.next().mo17160i().mo16960e().mo17078q();
            if (!TextUtils.equals(q, "flex") && (!z || !TextUtils.equals(q, "flex"))) {
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        for (C2688h c : list) {
            if (m7278c(c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m7270a(List<C2692a> list, float f, List<C2688h> list2) {
        float f2 = 0.0f;
        for (C2692a next : list) {
            if (next.f5912b) {
                f2 += next.f5911a;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f5912b && list2.get(i2).mo17170s()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil((double) (((f2 - f) / ((float) i)) * 1000.0f)) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    C2692a aVar = list.get(i3);
                    if (aVar.f5912b && list2.get(i3).mo17170s()) {
                        aVar.f5911a -= ceil;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17182a() {
        this.f5909c.clear();
        this.f5907a.clear();
        this.f5908b.clear();
    }

    /* renamed from: a */
    public C2694c mo17179a(C2688h hVar) {
        return this.f5907a.get(m7282e(hVar));
    }

    /* renamed from: a */
    public C2694c mo17181a(List<C2688h> list) {
        return this.f5908b.get(m7279d(list));
    }

    /* renamed from: d */
    private void m7280d(C2688h hVar) {
        this.f5907a.remove(m7282e(hVar));
        List<List<C2688h>> p = hVar.mo17167p();
        if (p != null && p.size() > 0) {
            for (List<C2688h> c : p) {
                m7277c(c);
            }
        }
    }

    /* renamed from: c */
    private void m7277c(List<C2688h> list) {
        if (list != null && list.size() > 0) {
            this.f5908b.remove(m7279d(list));
            for (C2688h d : list) {
                m7280d(d);
            }
        }
    }

    /* renamed from: e */
    private String m7282e(C2688h hVar) {
        return hVar.mo17144b();
    }

    /* renamed from: d */
    private String m7279d(List<C2688h> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String b = list.get(i).mo17144b();
            if (i < list.size() - 1) {
                sb.append(b);
                sb.append("-");
            } else {
                sb.append(b);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m7268a(C2688h hVar, C2694c cVar) {
        this.f5907a.put(m7282e(hVar), cVar);
    }

    /* renamed from: a */
    private void m7271a(List<C2688h> list, C2694c cVar) {
        this.f5908b.put(m7279d(list), cVar);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$c */
    /* compiled from: ComputeRuler */
    static class C2694c {

        /* renamed from: a */
        float f5919a;

        /* renamed from: b */
        float f5920b;

        public C2694c() {
        }

        public C2694c(float f, float f2) {
            this.f5919a = f;
            this.f5920b = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.f5919a + ", height=" + this.f5920b + '}';
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$b */
    /* compiled from: ComputeRuler */
    static class C2693b {

        /* renamed from: a */
        float f5914a;

        /* renamed from: b */
        int f5915b;

        /* renamed from: c */
        int f5916c;

        /* renamed from: d */
        double f5917d;

        /* renamed from: e */
        float f5918e;

        C2693b() {
        }

        /* renamed from: a */
        static JSONObject m7291a(C2693b bVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", (double) bVar.f5914a);
                jSONObject.put("letterSpacing", bVar.f5915b);
                jSONObject.put("lineHeight", bVar.f5917d);
                jSONObject.put("maxWidth", (double) bVar.f5918e);
                jSONObject.put("fontWeight", bVar.f5916c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$a */
    /* compiled from: ComputeRuler */
    static class C2692a implements Cloneable {

        /* renamed from: a */
        float f5911a;

        /* renamed from: b */
        boolean f5912b;

        /* renamed from: c */
        float f5913c;

        C2692a() {
        }

        public Object clone() {
            try {
                return (C2692a) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
