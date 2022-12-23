package com.mbridge.msdk.video.dynview.endcard.cloudview;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import com.mbridge.msdk.video.dynview.endcard.cloudview.p355a.C9272a;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.a */
/* compiled from: CTag */
public final class C9271a implements Comparable<C9271a> {

    /* renamed from: a */
    private int f22466a;

    /* renamed from: b */
    private float f22467b;

    /* renamed from: c */
    private float[] f22468c;

    /* renamed from: d */
    private View f22469d;

    /* renamed from: e */
    private PointF f22470e;

    /* renamed from: f */
    private C9272a f22471f;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22467b > ((C9271a) obj).f22467b ? 1 : -1;
    }

    public C9271a() {
        this(0.0f, 0.0f, 0.0f, 1.0f, 0);
    }

    public C9271a(int i) {
        this(0.0f, 0.0f, 0.0f, 1.0f, i);
    }

    private C9271a(float f, float f2, float f3, float f4, int i) {
        this.f22471f = new C9272a(f, f2, f3);
        this.f22470e = new PointF(0.0f, 0.0f);
        this.f22468c = new float[]{1.0f, 0.5f, 0.5f, 0.5f};
        this.f22467b = f4;
        this.f22466a = i;
    }

    /* renamed from: a */
    public final float mo62423a() {
        return this.f22471f.f22472a;
    }

    /* renamed from: a */
    public final void mo62424a(float f) {
        this.f22471f.f22472a = f;
    }

    /* renamed from: b */
    public final float mo62427b() {
        return this.f22471f.f22473b;
    }

    /* renamed from: b */
    public final void mo62428b(float f) {
        this.f22471f.f22473b = f;
    }

    /* renamed from: c */
    public final float mo62429c() {
        return this.f22471f.f22474c;
    }

    /* renamed from: c */
    public final void mo62430c(float f) {
        this.f22471f.f22474c = f;
    }

    /* renamed from: d */
    public final float mo62432d() {
        return this.f22467b;
    }

    /* renamed from: d */
    public final void mo62433d(float f) {
        this.f22467b = f;
    }

    /* renamed from: e */
    public final View mo62434e() {
        return this.f22469d;
    }

    /* renamed from: a */
    public final void mo62425a(View view) {
        this.f22469d = view;
    }

    /* renamed from: e */
    public final void mo62435e(float f) {
        this.f22468c[0] = f;
    }

    /* renamed from: f */
    public final int mo62436f() {
        return this.f22466a;
    }

    /* renamed from: g */
    public final float mo62438g() {
        return this.f22470e.x;
    }

    /* renamed from: f */
    public final void mo62437f(float f) {
        this.f22470e.x = f;
    }

    /* renamed from: h */
    public final float mo62440h() {
        return this.f22470e.y;
    }

    /* renamed from: g */
    public final void mo62439g(float f) {
        this.f22470e.y = f;
    }

    /* renamed from: a */
    public final void mo62426a(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = this.f22468c;
            System.arraycopy(fArr, 0, fArr2, fArr2.length - fArr.length, fArr.length);
        }
    }

    /* renamed from: i */
    public final float mo62441i() {
        return this.f22468c[0];
    }

    /* renamed from: j */
    public final int mo62442j() {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = (int) (this.f22468c[i] * 255.0f);
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
