package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.p374my.target.C9955s7;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.w7 */
public class C10022w7 extends C9976t7 {
    public C10022w7(View view, View view2, C9955s7.C9956a aVar, View view3, C10038x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
        addView(this.f24713a);
        addView(this.f24719g);
        addView(this.f24720h);
        addView(this.f24724l);
        addView(view2);
    }

    /* renamed from: a */
    public final void mo65680a(int i, int i2) {
        this.f24729q.setVisibility(8);
        this.f24730r.setVisibility(8);
        this.f24726n.setVisibility(8);
        this.f24716d.setVisibility(0);
        if (mo65474a(i)) {
            this.f24731s.setVisibility(0);
            this.f24727o.setVisibility(8);
            C10059y8.m29830a(this.f24731s, i, i2, Integer.MIN_VALUE);
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
    public final void mo65681a(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if (this.f24715c.getVisibility() == 0) {
            view = this.f24715c;
            i5 = this.f24705H - this.f24701D;
        } else {
            view = this.f24732t;
            i5 = this.f24705H;
        }
        C10059y8.m29838b(view, i7 + i5, (i8 - i6) - i5);
        if (mo65474a(i8 - i6)) {
            C9804k6 k6Var = this.f24721i;
            C10059y8.m29831a((View) k6Var, i6, i7, k6Var.getMeasuredWidth() + i6, i9);
            View view2 = this.f24707J;
            C10059y8.m29831a(view2, i6, i7, (view2 != null ? view2.getMeasuredWidth() : 0) + i6, i9);
            View view3 = this.f24707J;
            int left = view3 != null ? view3.getLeft() : this.f24721i.getLeft();
            View view4 = this.f24707J;
            int right = view4 != null ? view4.getRight() : this.f24721i.getRight();
            View view5 = this.f24707J;
            int bottom = view5 != null ? view5.getBottom() : this.f24721i.getBottom();
            View view6 = this.f24707J;
            int top = view6 != null ? view6.getTop() : this.f24721i.getTop();
            int i10 = this.f24705H;
            int a = C10059y8.m29826a(right, this.f24721i.getRight()) + this.f24705H;
            int a2 = C10059y8.m29826a(this.f24722j.getMeasuredHeight(), this.f24731s.getMeasuredHeight());
            int i11 = this.f24701D;
            C10059y8.m29828a(i10, a, a2 + i11, i11, this.f24722j, this.f24731s);
            this.f24725m.layout(left, top, right, bottom);
            this.f24716d.layout(C10059y8.m29826a(right, this.f24721i.getRight()), i7, i8, i9);
            this.f24726n.layout(0, 0, 0, 0);
            int max = Math.max(this.f24721i.getRight(), right);
            int i12 = this.f24705H - this.f24701D;
            C10059y8.m29845d(this.f24713a, i9 - i12, max - i12);
            this.f24718f.mo65407a(false);
            C10059y8.m29844c(this.f24727o, i9, this.f24716d.getLeft());
            C10059y8.m29838b(this.f24723k, this.f24705H, this.f24715c.getVisibility() == 0 ? (this.f24715c.getLeft() - this.f24738z) + this.f24701D : this.f24732t.getVisibility() == 0 ? this.f24732t.getLeft() - this.f24738z : i8 - this.f24705H);
            return;
        }
        C9804k6 k6Var2 = this.f24722j;
        int i13 = this.f24705H;
        C10059y8.m29844c(k6Var2, i13, i13);
        C10059y8.m29847e(this.f24716d, i9 - i7, i6);
        C10059y8.m29831a((View) this.f24721i, i6, i7, i8, i9);
        C10059y8.m29831a(this.f24707J, i6, i7, i8, i9);
        this.f24725m.layout(this.f24721i.getLeft(), this.f24721i.getTop(), this.f24721i.getRight(), this.f24721i.getBottom());
        this.f24726n.layout(0, 0, 0, 0);
        C10059y8.m29844c(this.f24727o, this.f24716d.getTop(), this.f24716d.getLeft());
        int top2 = this.f24716d.getTop();
        int i14 = this.f24738z;
        int i15 = this.f24701D;
        C10059y8.m29845d(this.f24713a, top2 - (i14 - i15), i8 - (this.f24705H - i15));
        C10059y8.m29845d(this.f24723k, this.f24713a.getTop() - (this.f24738z - this.f24701D), i8 - this.f24705H);
        this.f24718f.mo65407a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        if (android.text.TextUtils.isEmpty(r10.f24730r.getText()) == false) goto L_0x008c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65682b(int r11, int r12) {
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
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r3 = r10.f24707J
            if (r3 == 0) goto L_0x003b
            int r3 = r3.getMeasuredHeight()
            goto L_0x003c
        L_0x003b:
            r3 = r1
        L_0x003c:
            r0[r1] = r3
            com.my.target.k6 r3 = r10.f24721i
            int r3 = r3.getMeasuredHeight()
            r6 = 1
            r0[r6] = r3
            int r0 = com.p374my.target.C10059y8.m29826a((int[]) r0)
            double r6 = (double) r0
            r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            double r6 = r6 * r8
            double r8 = (double) r12
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.f24730r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0097
            goto L_0x008c
        L_0x0069:
            android.widget.TextView r0 = r10.f24729q
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007b
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r1)
            goto L_0x0080
        L_0x007b:
            android.widget.TextView r0 = r10.f24729q
            r0.setVisibility(r2)
        L_0x0080:
            android.widget.TextView r0 = r10.f24730r
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
        L_0x008c:
            android.widget.TextView r0 = r10.f24730r
            r0.setVisibility(r1)
            goto L_0x0097
        L_0x0092:
            android.widget.TextView r0 = r10.f24730r
            r0.setVisibility(r2)
        L_0x0097:
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
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10022w7.mo65682b(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65683b(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            com.my.target.f6 r0 = r10.f24715c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            com.my.target.f6 r0 = r10.f24715c
            int r1 = r10.f24738z
            int r2 = r10.f24701D
            int r1 = r1 - r2
            goto L_0x0014
        L_0x0010:
            com.my.target.n6 r0 = r10.f24732t
            int r1 = r10.f24738z
        L_0x0014:
            int r2 = r12 + r1
            int r3 = r13 - r11
            int r3 = r3 - r1
            com.p374my.target.C10059y8.m29838b(r0, r2, r3)
            android.view.View r0 = r10.f24716d
            com.p374my.target.C10059y8.m29844c(r0, r12, r11)
            android.widget.Button r0 = r10.f24728p
            int r1 = r10.f24702E
            int r1 = r14 - r1
            int r2 = r0.getMeasuredHeight()
            int r1 = r1 - r2
            int r2 = r10.f24702E
            int r2 = r14 - r2
            r3 = 0
            com.p374my.target.C10059y8.m29831a((android.view.View) r0, (int) r3, (int) r1, (int) r13, (int) r2)
            android.view.View r0 = r10.f24707J
            com.p374my.target.C10059y8.m29831a((android.view.View) r0, (int) r11, (int) r12, (int) r13, (int) r14)
            com.my.target.k6 r0 = r10.f24721i
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x004e
            com.my.target.k6 r0 = r10.f24721i
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L_0x004e
            com.my.target.k6 r0 = r10.f24721i
            com.p374my.target.C10059y8.m29831a((android.view.View) r0, (int) r11, (int) r12, (int) r13, (int) r14)
        L_0x004e:
            android.view.View r12 = r10.f24707J
            if (r12 == 0) goto L_0x0057
            int r12 = r12.getLeft()
            goto L_0x0058
        L_0x0057:
            r12 = r3
        L_0x0058:
            android.view.View r0 = r10.f24707J
            if (r0 == 0) goto L_0x0061
            int r0 = r0.getTop()
            goto L_0x0062
        L_0x0061:
            r0 = r3
        L_0x0062:
            r1 = 2
            int[] r2 = new int[r1]
            android.view.View r4 = r10.f24707J
            if (r4 == 0) goto L_0x006e
            int r4 = r4.getRight()
            goto L_0x006f
        L_0x006e:
            r4 = r3
        L_0x006f:
            r2[r3] = r4
            com.my.target.k6 r4 = r10.f24721i
            int r4 = r4.getRight()
            r5 = 1
            r2[r5] = r4
            int r2 = com.p374my.target.C10059y8.m29826a((int[]) r2)
            int[] r4 = new int[r1]
            android.view.View r6 = r10.f24707J
            if (r6 == 0) goto L_0x0089
            int r6 = r6.getBottom()
            goto L_0x008a
        L_0x0089:
            r6 = r3
        L_0x008a:
            r4[r3] = r6
            com.my.target.k6 r6 = r10.f24721i
            int r6 = r6.getBottom()
            r4[r5] = r6
            int r4 = com.p374my.target.C10059y8.m29826a((int[]) r4)
            android.view.View r6 = r10.f24725m
            r6.layout(r12, r0, r2, r4)
            android.widget.TextView r12 = r10.f24730r
            int r12 = r12.getMeasuredHeight()
            int r0 = r10.f24738z
            int r0 = r0 / r1
            int r12 = r12 + r0
            android.widget.TextView r0 = r10.f24729q
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b9
            int r0 = r10.f24738z
            android.widget.TextView r2 = r10.f24729q
            int r2 = r2.getMeasuredHeight()
            int r0 = r0 + r2
            int r12 = r12 + r0
        L_0x00b9:
            int r0 = r10.f24738z
            int r2 = r13 - r11
            int r6 = r0 * 2
            int r6 = r2 - r6
            android.widget.TextView r7 = r10.f24729q
            int r7 = r7.getMeasuredWidth()
            int r6 = r6 - r7
            int r6 = r6 / r1
            int r0 = r0 + r6
            int r6 = r10.f24738z
            int r7 = r6 * 2
            int r2 = r2 - r7
            android.widget.TextView r7 = r10.f24730r
            int r7 = r7.getMeasuredWidth()
            int r2 = r2 - r7
            int r2 = r2 / r1
            int r6 = r6 + r2
            int[] r2 = new int[r1]
            com.my.target.k6 r7 = r10.f24721i
            int r7 = r7.getBottom()
            r2[r3] = r7
            r2[r5] = r4
            int r2 = com.p374my.target.C10059y8.m29826a((int[]) r2)
            android.widget.Button r7 = r10.f24728p
            int r7 = r7.getTop()
            int r7 = r7 - r2
            if (r12 >= r7) goto L_0x0119
            android.widget.Button r7 = r10.f24728p
            int r7 = r7.getTop()
            int r7 = r7 - r2
            int r7 = r7 - r12
            int r7 = r7 / r1
            int r2 = r2 + r7
            android.widget.TextView r12 = r10.f24729q
            com.p374my.target.C10059y8.m29844c(r12, r2, r0)
            android.widget.TextView r12 = r10.f24730r
            int[] r0 = new int[r1]
            r0[r3] = r2
            android.widget.TextView r1 = r10.f24729q
            int r1 = r1.getBottom()
            int r2 = r10.f24706I
            int r1 = r1 + r2
            r0[r5] = r1
            int r0 = com.p374my.target.C10059y8.m29826a((int[]) r0)
            com.p374my.target.C10059y8.m29844c(r12, r0, r6)
            goto L_0x012c
        L_0x0119:
            android.widget.Button r12 = r10.f24728p
            int r12 = r12.getTop()
            int r0 = r10.f24738z
            int r12 = r12 - r0
            android.widget.TextView r0 = r10.f24730r
            com.p374my.target.C10059y8.m29847e(r0, r12, r6)
            android.widget.TextView r12 = r10.f24729q
            r12.layout(r3, r3, r3, r3)
        L_0x012c:
            android.widget.TextView r12 = r10.f24729q
            int r12 = r12.getTop()
            if (r12 <= 0) goto L_0x013b
            android.widget.TextView r12 = r10.f24729q
        L_0x0136:
            int r12 = r12.getTop()
            goto L_0x014c
        L_0x013b:
            android.widget.TextView r12 = r10.f24730r
            int r12 = r12.getTop()
            if (r12 <= 0) goto L_0x0146
            android.widget.TextView r12 = r10.f24730r
            goto L_0x0136
        L_0x0146:
            android.widget.Button r12 = r10.f24728p
            int r12 = r12.getTop()
        L_0x014c:
            int r0 = r10.f24738z
            int r12 = r12 - r0
            android.view.View r0 = r10.f24726n
            android.view.View r1 = r10.f24716d
            int r1 = r1.getTop()
            android.view.View r2 = r10.f24716d
            int r2 = r2.getLeft()
            com.p374my.target.C10059y8.m29844c(r0, r1, r2)
            android.view.View r0 = r10.f24727o
            com.p374my.target.C10059y8.m29844c(r0, r12, r11)
            android.view.View r11 = r10.f24727o
            int r11 = r11.getTop()
            com.my.target.k6 r12 = r10.f24721i
            int r12 = r12.getBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r11 = java.lang.Math.min(r11, r12)
            int r12 = r10.f24738z
            int r0 = r10.f24701D
            int r12 = r12 - r0
            int r11 = r11 - r12
            com.my.target.f6 r0 = r10.f24713a
            int r12 = r13 - r12
            com.p374my.target.C10059y8.m29845d(r0, r11, r12)
            com.my.target.s7$a r11 = r10.f24718f
            com.my.target.k6 r12 = r10.f24721i
            int r12 = r12.getBottom()
            android.view.View r0 = r10.f24727o
            int r0 = r0.getTop()
            int r12 = r12 - r0
            double r0 = (double) r12
            com.my.target.k6 r12 = r10.f24721i
            int r12 = r12.getMeasuredHeight()
            double r6 = (double) r12
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r6 = r6 * r8
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a8
            r3 = r5
        L_0x01a8:
            r11.mo65407a((boolean) r3)
            android.view.View r11 = r10.f24717e
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x01b9
            android.view.View r11 = r10.f24717e
            int r14 = r11.getTop()
        L_0x01b9:
            com.my.target.w5 r11 = r10.f24723k
            int r12 = r10.f24738z
            int r0 = r14 - r12
            int r13 = r13 - r12
            com.p374my.target.C10059y8.m29845d(r11, r0, r13)
            com.my.target.k6 r11 = r10.f24722j
            int r12 = r10.f24738z
            int r14 = r14 - r12
            com.p374my.target.C10059y8.m29847e(r11, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10022w7.mo65683b(int, int, int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f24717e.getVisibility() == 0) {
            C10059y8.m29847e(this.f24717e, i4 - i2, i);
        }
        if (i3 - i < i4 - i2) {
            mo65683b(i, i2, i3, i4);
        } else {
            mo65681a(i, i2, i3, i4);
        }
        View view = this.f24707J;
        int left = view != null ? view.getLeft() : this.f24721i.getLeft();
        View view2 = this.f24707J;
        int top = view2 != null ? view2.getTop() : this.f24721i.getTop();
        int[] iArr = new int[2];
        View view3 = this.f24707J;
        iArr[0] = view3 != null ? view3.getRight() : 0;
        iArr[1] = this.f24721i.getRight();
        int a = C10059y8.m29826a(iArr);
        int[] iArr2 = new int[2];
        View view4 = this.f24707J;
        iArr2[0] = view4 != null ? view4.getBottom() : 0;
        iArr2[1] = this.f24721i.getBottom();
        int a2 = C10059y8.m29826a(iArr2);
        if (this.f24724l.getVisibility() == 0) {
            C10059y8.m29831a((View) this.f24724l, left, top, a, a2);
        }
        if (this.f24719g.getVisibility() == 0) {
            if (this.f24720h.getVisibility() != 0) {
                C10059y8.m29831a((View) this.f24719g, left, top, a, a2);
                return;
            }
            int measuredWidth = left + (((a - left) - ((this.f24719g.getMeasuredWidth() + this.f24738z) + this.f24720h.getMeasuredWidth())) / 2);
            int measuredHeight = top + (((a2 - top) - this.f24719g.getMeasuredHeight()) / 2);
            C10059y8.m29844c(this.f24719g, measuredHeight, measuredWidth);
            C10059y8.m29844c(this.f24720h, measuredHeight, this.f24719g.getRight() + this.f24738z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
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
            android.view.View r2 = r5.f24707J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            com.p374my.target.C10059y8.m29830a(r2, r0, r1, r3)
            com.my.target.k6 r2 = r5.f24721i
            com.p374my.target.C10059y8.m29830a(r2, r0, r1, r3)
            android.view.View r2 = r5.f24725m
            r4 = 1073741824(0x40000000, float:2.0)
            com.p374my.target.C10059y8.m29830a(r2, r0, r1, r4)
            com.my.target.k6 r0 = r5.f24722j
            int r1 = r5.f24703F
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r3)
            com.my.target.f6 r0 = r5.f24713a
            int r1 = r5.f24700C
            int r2 = r5.f24701D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            com.my.target.f6 r0 = r5.f24715c
            int r1 = r5.f24700C
            int r2 = r5.f24701D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            com.my.target.n6 r0 = r5.f24732t
            int r1 = r5.f24700C
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            com.my.target.w5 r0 = r5.f24723k
            int r1 = r5.f24700C
            int r2 = r5.f24701D
            int r2 = r2 * 2
            int r1 = r1 + r2
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            if (r6 >= r7) goto L_0x007c
            r5.mo65682b(r6, r7)
            goto L_0x007f
        L_0x007c:
            r5.mo65680a(r6, r7)
        L_0x007f:
            com.my.target.y6 r0 = r5.f24719g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00a9
            com.my.target.y6 r0 = r5.f24719g
            int r1 = r5.f24698A
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            android.widget.Button r0 = r5.f24720h
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00a9
            android.widget.Button r0 = r5.f24720h
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            com.my.target.y6 r2 = r5.f24719g
            int r2 = r2.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            r0.measure(r1, r2)
        L_0x00a9:
            android.widget.ProgressBar r0 = r5.f24724l
            int r1 = r5.f24698A
            com.p374my.target.C10059y8.m29830a(r0, r1, r1, r4)
            android.view.View r0 = r5.f24717e
            int r1 = r5.f24699B
            com.p374my.target.C10059y8.m29830a(r0, r6, r1, r4)
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10022w7.onMeasure(int, int):void");
    }

    public void setBanner(C9697f2 f2Var) {
        String str;
        C9702f6 f6Var;
        ImageData image;
        Bitmap bitmap;
        super.setBanner(f2Var);
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f24717e.setVisibility(0);
            this.f24713a.setVisibility(0);
            this.f24713a.setOnClickListener(this);
            if (videoBanner.isAutoMute()) {
                this.f24713a.mo64026a(this.f24734v, false);
                f6Var = this.f24713a;
                str = "sound_off";
            } else {
                this.f24713a.mo64026a(this.f24733u, false);
                f6Var = this.f24713a;
                str = "sound_on";
            }
            f6Var.setContentDescription(str);
            this.f24719g.setImageBitmap(this.f24735w);
            this.f24711N = 0;
            View view = this.f24707J;
            if (view != null) {
                view.setOnClickListener(this);
            }
            this.f24725m.setOnClickListener(this);
            VideoData mediaData = videoBanner.getMediaData();
            ImageData preview = videoBanner.getPreview();
            if (mediaData != null) {
                this.f24708K = mediaData.getWidth();
                this.f24709L = mediaData.getHeight();
            }
            if ((this.f24708K <= 0 || this.f24709L <= 0) && preview != null) {
                this.f24708K = preview.getWidth();
                this.f24709L = preview.getHeight();
            }
            if ((this.f24708K <= 0 || this.f24709L <= 0) && (image = f2Var.getImage()) != null) {
                this.f24708K = image.getWidth();
                int height = image.getHeight();
                this.f24709L = height;
                if ((this.f24708K <= 0 || height <= 0) && (bitmap = image.getBitmap()) != null) {
                    this.f24708K = bitmap.getWidth();
                    this.f24709L = bitmap.getHeight();
                }
            }
        }
    }
}
