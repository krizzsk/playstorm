package com.p374my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.my.target.b9 */
public final class C9634b9 {

    /* renamed from: a */
    public final ArrayList<C10067z2> f23691a;

    /* renamed from: b */
    public final ArrayList<C10045y2> f23692b;

    /* renamed from: c */
    public WeakReference<View> f23693c;

    /* renamed from: d */
    public float f23694d = -1.0f;

    public C9634b9(ArrayList<C10067z2> arrayList, ArrayList<C10045y2> arrayList2) {
        this.f23692b = arrayList2;
        this.f23691a = arrayList;
    }

    /* renamed from: a */
    public static C9634b9 m27707a(C9641c3 c3Var) {
        return new C9634b9(c3Var.mo63680b(), c3Var.mo63674a());
    }

    /* renamed from: a */
    public void mo63647a() {
        WeakReference<View> weakReference = this.f23693c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23692b.clear();
        this.f23691a.clear();
        this.f23693c = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        if (r5.f24970f == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r5.f24970f != false) goto L_0x00ca;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63648a(double r11, float r13, float r14, android.content.Context r15) {
        /*
            r10 = this;
            java.util.ArrayList<com.my.target.z2> r0 = r10.f23691a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0011
            java.util.ArrayList<com.my.target.y2> r0 = r10.f23692b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r15 != 0) goto L_0x002c
            java.util.ArrayList<com.my.target.y2> r11 = r10.f23692b
            java.util.Iterator r11 = r11.iterator()
        L_0x001b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x002b
            java.lang.Object r12 = r11.next()
            com.my.target.y2 r12 = (com.p374my.target.C10045y2) r12
            r12.mo65741a(r0)
            goto L_0x001b
        L_0x002b:
            return
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0031:
            java.util.ArrayList<com.my.target.z2> r2 = r10.f23691a
            boolean r2 = r2.isEmpty()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0075
            java.util.ArrayList<com.my.target.z2> r2 = r10.f23691a
            int r2 = r2.size()
            int r2 = r2 - r4
            java.util.ArrayList<com.my.target.z2> r5 = r10.f23691a
            java.lang.Object r5 = r5.get(r2)
            com.my.target.z2 r5 = (com.p374my.target.C10067z2) r5
            float r5 = r5.mo65859e()
            int r5 = com.p374my.target.C9787j8.m28415a(r5, r13)
            if (r5 <= 0) goto L_0x0055
            goto L_0x0075
        L_0x0055:
            java.util.ArrayList<com.my.target.z2> r5 = r10.f23691a
            java.lang.Object r2 = r5.remove(r2)
            com.my.target.z2 r2 = (com.p374my.target.C10067z2) r2
            int r5 = r2.f23750d
            boolean r6 = r2.mo65860f()
            double r7 = (double) r5
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x0069
            r3 = r4
        L_0x0069:
            if (r3 == 0) goto L_0x006d
            if (r6 != 0) goto L_0x0071
        L_0x006d:
            if (r3 != 0) goto L_0x0031
            if (r6 != 0) goto L_0x0031
        L_0x0071:
            r1.add(r2)
            goto L_0x0031
        L_0x0075:
            float r14 = r14 - r13
            java.util.ArrayList<com.my.target.y2> r2 = r10.f23692b
            java.util.Iterator r2 = r2.iterator()
        L_0x007c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00d1
            java.lang.Object r5 = r2.next()
            com.my.target.y2 r5 = (com.p374my.target.C10045y2) r5
            int r6 = r5.f23750d
            float r7 = r5.mo65742d()
            double r8 = (double) r6
            int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0095
            r6 = r4
            goto L_0x0096
        L_0x0095:
            r6 = r3
        L_0x0096:
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x009d
            r8 = r4
            goto L_0x009e
        L_0x009d:
            r8 = r3
        L_0x009e:
            float r9 = r5.f24969e
            int r9 = com.p374my.target.C9787j8.m28415a(r14, r9)
            if (r9 >= 0) goto L_0x00af
            if (r6 != 0) goto L_0x00aa
            if (r8 == 0) goto L_0x00af
        L_0x00aa:
            boolean r6 = r5.f24970f
            if (r6 != 0) goto L_0x00cd
            goto L_0x00ca
        L_0x00af:
            if (r6 == 0) goto L_0x00b5
            r5.mo65741a(r0)
            goto L_0x007c
        L_0x00b5:
            if (r8 == 0) goto L_0x00bb
            r5.mo65741a(r13)
            goto L_0x007c
        L_0x00bb:
            float r6 = r13 - r7
            float r7 = r5.f24969e
            int r6 = com.p374my.target.C9787j8.m28415a(r6, r7)
            if (r6 >= 0) goto L_0x00c6
            goto L_0x007c
        L_0x00c6:
            boolean r6 = r5.f24970f
            if (r6 == 0) goto L_0x00cd
        L_0x00ca:
            r1.add(r5)
        L_0x00cd:
            r2.remove()
            goto L_0x007c
        L_0x00d1:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x00da
            com.p374my.target.C10039x8.m29720c((java.util.List<com.p374my.target.C9626b3>) r1, (android.content.Context) r15)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9634b9.mo63648a(double, float, float, android.content.Context):void");
    }

    /* renamed from: a */
    public void mo63649a(float f, float f2) {
        View view;
        if (C9787j8.m28415a(f, f2) >= 0 || Math.abs(f - this.f23694d) >= 1.0f) {
            Context context = null;
            double d = 0.0d;
            WeakReference<View> weakReference = this.f23693c;
            if (!(weakReference == null || (view = (View) weakReference.get()) == null)) {
                d = C9609a9.m27614a(view);
                context = view.getContext();
            }
            mo63648a(d, f, f2, context);
            this.f23694d = f;
        }
    }

    /* renamed from: a */
    public void mo63650a(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f23693c) == null) {
            this.f23693c = new WeakReference<>(view);
        } else {
            weakReference.clear();
        }
    }
}
