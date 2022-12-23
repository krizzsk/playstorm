package com.p374my.target;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9955s7;

/* renamed from: com.my.target.v7 */
public class C10007v7 extends C9976t7 {
    public C10007v7(View view, View view2, C9955s7.C9956a aVar, View view3, C10038x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
    }

    /* renamed from: a */
    public final void mo65617a(int i, int i2) {
        this.f24729q.setVisibility(8);
        this.f24730r.setVisibility(8);
        this.f24726n.setVisibility(8);
        this.f24716d.setVisibility(0);
        if (mo65474a(i)) {
            this.f24731s.setVisibility(0);
            C10059y8.m29830a(this.f24731s, i, i2, Integer.MIN_VALUE);
            this.f24727o.setVisibility(8);
            int[] iArr = new int[2];
            View view = this.f24707J;
            iArr[0] = view != null ? view.getMeasuredWidth() : 0;
            iArr[1] = this.f24721i.getMeasuredWidth();
            int a = i - C10059y8.m29826a(iArr);
            C10059y8.m29830a(this.f24716d, a, a, Integer.MIN_VALUE);
        } else {
            this.f24731s.setVisibility(8);
            this.f24727o.setVisibility(0);
            C10059y8.m29830a(this.f24716d, i, i2, Integer.MIN_VALUE);
        }
        C10059y8.m29830a(this.f24727o, this.f24716d.getMeasuredWidth(), this.f24716d.getMeasuredHeight(), 1073741824);
    }

    /* renamed from: a */
    public final void mo65618a(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        if (this.f24715c.getVisibility() == 0) {
            view = this.f24715c;
            i5 = this.f24705H - this.f24701D;
        } else {
            view = this.f24732t;
            i5 = this.f24705H;
        }
        C10059y8.m29838b(view, i2 + i5, (i3 - i) - i5);
        if (mo65474a(i3 - i)) {
            C9804k6 k6Var = this.f24721i;
            C10059y8.m29831a((View) k6Var, i, i2, k6Var.getMeasuredWidth() + i, i4);
            int a = C10059y8.m29826a(this.f24722j.getMeasuredHeight(), this.f24731s.getMeasuredHeight());
            int i6 = this.f24701D;
            C10059y8.m29828a(this.f24705H, this.f24721i.getRight() + this.f24705H, a + i6, i6, this.f24722j, this.f24731s);
            View view2 = this.f24707J;
            C10059y8.m29831a(view2, i, i2, (view2 != null ? view2.getMeasuredWidth() : 0) + i, i4);
            this.f24716d.layout(this.f24721i.getRight(), i2, i3, i4);
            this.f24726n.layout(0, 0, 0, 0);
            this.f24718f.mo65407a(false);
            int left = this.f24715c.getVisibility() == 0 ? (this.f24715c.getLeft() - this.f24738z) + this.f24701D : this.f24732t.getVisibility() == 0 ? this.f24732t.getLeft() - this.f24738z : i3 - this.f24705H;
            C10059y8.m29838b(this.f24723k, this.f24705H, left);
            C10059y8.m29838b(this.f24723k, this.f24705H, left);
            return;
        }
        C9804k6 k6Var2 = this.f24722j;
        int i7 = this.f24705H;
        C10059y8.m29844c(k6Var2, i7, i7);
        C10059y8.m29847e(this.f24716d, i4 - i2, i);
        C10059y8.m29831a((View) this.f24721i, i, i2, i3, i4);
        C10059y8.m29831a(this.f24707J, i, i2, i3, i4);
        this.f24725m.layout(this.f24721i.getLeft(), this.f24721i.getTop(), this.f24721i.getRight(), this.f24721i.getBottom());
        this.f24726n.layout(0, 0, 0, 0);
        C10059y8.m29844c(this.f24727o, this.f24716d.getTop(), this.f24716d.getLeft());
        this.f24718f.mo65407a(true);
        C10059y8.m29845d(this.f24723k, this.f24716d.getTop() - this.f24738z, i3 - this.f24705H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0050, code lost:
        if (android.text.TextUtils.isEmpty(r10.f24730r.getText()) == false) goto L_0x0076;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65619b(int r11, int r12) {
        /*
            r10 = this;
            android.view.View r0 = r10.f24716d
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r10.f24726n
            r0.setVisibility(r1)
            android.view.View r0 = r10.f24727o
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.f24731s
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r10.f24716d
            int r3 = r10.f24700C
            int r3 = r11 - r3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p374my.target.C10059y8.m29830a(r0, r3, r12, r4)
            android.view.View r0 = r10.f24726n
            android.view.View r3 = r10.f24716d
            int r3 = r3.getMeasuredHeight()
            r5 = 1073741824(0x40000000, float:2.0)
            com.p374my.target.C10059y8.m29830a(r0, r11, r3, r5)
            com.my.target.k6 r0 = r10.f24721i
            int r0 = r0.getMeasuredHeight()
            double r6 = (double) r0
            r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            double r6 = r6 * r8
            double r8 = (double) r12
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.f24730r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0081
            goto L_0x0076
        L_0x0053:
            android.widget.TextView r0 = r10.f24729q
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0065
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r1)
            goto L_0x006a
        L_0x0065:
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r2)
        L_0x006a:
            android.widget.TextView r0 = r10.f24730r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007c
        L_0x0076:
            android.widget.TextView r0 = r10.f24730r
            r0.setVisibility(r1)
            goto L_0x0081
        L_0x007c:
            android.widget.TextView r0 = r10.f24730r
            r0.setVisibility(r2)
        L_0x0081:
            int r0 = r10.f24738z
            int r1 = r0 * 2
            int r0 = r0 * 4
            int r0 = r11 - r0
            com.my.target.w5 r2 = r10.f24723k
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            com.my.target.k6 r2 = r10.f24722j
            int r2 = r2.getMeasuredWidth()
            int r0 = r0 - r2
            android.widget.Button r2 = r10.f24728p
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            int r3 = r10.f24704G
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r2.measure(r0, r3)
            android.widget.TextView r0 = r10.f24729q
            int r2 = r11 - r1
            int r1 = r12 - r1
            com.p374my.target.C10059y8.m29830a(r0, r2, r1, r4)
            android.widget.TextView r0 = r10.f24730r
            com.p374my.target.C10059y8.m29830a(r0, r2, r1, r4)
            android.view.View r0 = r10.f24727o
            com.p374my.target.C10059y8.m29830a(r0, r11, r12, r5)
            com.my.target.n6 r11 = r10.f24732t
            int r12 = r10.f24700C
            com.p374my.target.C10059y8.m29830a(r11, r12, r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10007v7.mo65619b(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x011a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65620b(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            com.my.target.f6 r0 = r9.f24715c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            com.my.target.f6 r0 = r9.f24715c
            int r1 = r9.f24738z
            int r2 = r9.f24701D
            int r1 = r1 - r2
            goto L_0x0014
        L_0x0010:
            com.my.target.n6 r0 = r9.f24732t
            int r1 = r9.f24738z
        L_0x0014:
            int r2 = r11 + r1
            int r3 = r12 - r10
            int r3 = r3 - r1
            com.p374my.target.C10059y8.m29838b(r0, r2, r3)
            android.view.View r0 = r9.f24716d
            com.p374my.target.C10059y8.m29844c(r0, r11, r10)
            android.widget.Button r0 = r9.f24728p
            int r1 = r9.f24702E
            int r1 = r13 - r1
            int r2 = r0.getMeasuredHeight()
            int r1 = r1 - r2
            int r2 = r9.f24702E
            int r2 = r13 - r2
            r3 = 0
            com.p374my.target.C10059y8.m29831a((android.view.View) r0, (int) r3, (int) r1, (int) r12, (int) r2)
            com.my.target.k6 r0 = r9.f24721i
            com.p374my.target.C10059y8.m29831a((android.view.View) r0, (int) r10, (int) r11, (int) r12, (int) r13)
            android.widget.TextView r11 = r9.f24730r
            int r11 = r11.getMeasuredHeight()
            int r0 = r9.f24738z
            r1 = 2
            int r0 = r0 / r1
            int r11 = r11 + r0
            android.widget.TextView r0 = r9.f24729q
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0056
            int r0 = r9.f24738z
            android.widget.TextView r2 = r9.f24729q
            int r2 = r2.getMeasuredHeight()
            int r0 = r0 + r2
            int r11 = r11 + r0
        L_0x0056:
            int r0 = r9.f24738z
            int r2 = r12 - r10
            int r4 = r0 * 2
            int r4 = r2 - r4
            android.widget.TextView r5 = r9.f24729q
            int r5 = r5.getMeasuredWidth()
            int r4 = r4 - r5
            int r4 = r4 / r1
            int r0 = r0 + r4
            int r4 = r9.f24738z
            int r5 = r4 * 2
            int r2 = r2 - r5
            android.widget.TextView r5 = r9.f24730r
            int r5 = r5.getMeasuredWidth()
            int r2 = r2 - r5
            int r2 = r2 / r1
            int r4 = r4 + r2
            com.my.target.k6 r2 = r9.f24721i
            int r2 = r2.getBottom()
            android.widget.Button r5 = r9.f24728p
            int r5 = r5.getTop()
            int r5 = r5 - r2
            r6 = 1
            if (r11 >= r5) goto L_0x00ad
            android.widget.Button r5 = r9.f24728p
            int r5 = r5.getTop()
            int r5 = r5 - r2
            int r5 = r5 - r11
            int r5 = r5 / r1
            int r2 = r2 + r5
            android.widget.TextView r11 = r9.f24729q
            com.p374my.target.C10059y8.m29844c(r11, r2, r0)
            android.widget.TextView r11 = r9.f24730r
            int[] r0 = new int[r1]
            r0[r3] = r2
            android.widget.TextView r1 = r9.f24729q
            int r1 = r1.getBottom()
            int r2 = r9.f24706I
            int r1 = r1 + r2
            r0[r6] = r1
            int r0 = com.p374my.target.C10059y8.m29826a((int[]) r0)
            com.p374my.target.C10059y8.m29844c(r11, r0, r4)
            goto L_0x00c0
        L_0x00ad:
            android.widget.Button r11 = r9.f24728p
            int r11 = r11.getTop()
            int r0 = r9.f24738z
            int r11 = r11 - r0
            android.widget.TextView r0 = r9.f24730r
            com.p374my.target.C10059y8.m29847e(r0, r11, r4)
            android.widget.TextView r11 = r9.f24729q
            r11.layout(r3, r3, r3, r3)
        L_0x00c0:
            android.widget.TextView r11 = r9.f24729q
            int r11 = r11.getTop()
            if (r11 <= 0) goto L_0x00cf
            android.widget.TextView r11 = r9.f24729q
        L_0x00ca:
            int r11 = r11.getTop()
            goto L_0x00e0
        L_0x00cf:
            android.widget.TextView r11 = r9.f24730r
            int r11 = r11.getTop()
            if (r11 <= 0) goto L_0x00da
            android.widget.TextView r11 = r9.f24730r
            goto L_0x00ca
        L_0x00da:
            android.widget.Button r11 = r9.f24728p
            int r11 = r11.getTop()
        L_0x00e0:
            int r0 = r9.f24738z
            int r11 = r11 - r0
            android.view.View r0 = r9.f24726n
            android.view.View r1 = r9.f24716d
            int r1 = r1.getTop()
            android.view.View r2 = r9.f24716d
            int r2 = r2.getLeft()
            com.p374my.target.C10059y8.m29844c(r0, r1, r2)
            android.view.View r0 = r9.f24727o
            com.p374my.target.C10059y8.m29844c(r0, r11, r10)
            com.my.target.s7$a r10 = r9.f24718f
            com.my.target.k6 r11 = r9.f24721i
            int r11 = r11.getBottom()
            android.view.View r0 = r9.f24727o
            int r0 = r0.getTop()
            int r11 = r11 - r0
            double r0 = (double) r11
            com.my.target.k6 r11 = r9.f24721i
            int r11 = r11.getMeasuredHeight()
            double r4 = (double) r11
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r4 = r4 * r7
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x011b
            r3 = r6
        L_0x011b:
            r10.mo65407a((boolean) r3)
            com.my.target.w5 r10 = r9.f24723k
            int r11 = r9.f24738z
            int r0 = r13 - r11
            int r12 = r12 - r11
            com.p374my.target.C10059y8.m29845d(r10, r0, r12)
            com.my.target.k6 r10 = r9.f24722j
            int r11 = r9.f24738z
            int r13 = r13 - r11
            com.p374my.target.C10059y8.m29847e(r10, r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10007v7.mo65620b(int, int, int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            mo65620b(i, i2, i3, i4);
        } else {
            mo65618a(i, i2, i3, i4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = r5.f24708K
            if (r0 <= 0) goto L_0x002f
            int r1 = r5.f24709L
            if (r1 <= 0) goto L_0x002f
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = r0 / r1
            float r3 = (float) r6
            float r0 = r3 / r0
            float r4 = (float) r7
            float r1 = r4 / r1
            float r1 = java.lang.Math.min(r0, r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
            float r3 = r3 / r2
            int r0 = (int) r3
            r1 = r0
            r0 = r6
            goto L_0x0031
        L_0x002c:
            float r4 = r4 * r2
            int r0 = (int) r4
            goto L_0x0030
        L_0x002f:
            r0 = r6
        L_0x0030:
            r1 = r7
        L_0x0031:
            com.my.target.k6 r2 = r5.f24721i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p374my.target.C10059y8.m29830a(r2, r0, r1, r3)
            com.my.target.k6 r0 = r5.f24722j
            int r1 = r5.f24703F
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r3)
            com.my.target.f6 r0 = r5.f24715c
            int r1 = r5.f24700C
            int r2 = r5.f24701D
            int r2 = r2 * 2
            int r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r2)
            com.my.target.n6 r0 = r5.f24732t
            int r1 = r5.f24700C
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r2)
            com.my.target.w5 r0 = r5.f24723k
            int r1 = r5.f24700C
            int r3 = r5.f24701D
            int r3 = r3 * 2
            int r1 = r1 + r3
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r2)
            if (r6 >= r7) goto L_0x0066
            r5.mo65619b(r6, r7)
            goto L_0x0069
        L_0x0066:
            r5.mo65617a(r6, r7)
        L_0x0069:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10007v7.onMeasure(int, int):void");
    }

    public void setBanner(C9697f2 f2Var) {
        super.setBanner(f2Var);
        View view = this.f24707J;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f24725m.setVisibility(8);
    }
}
