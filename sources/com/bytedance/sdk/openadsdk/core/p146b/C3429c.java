package com.bytedance.sdk.openadsdk.core.p146b;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.c */
/* compiled from: InteractionListener */
public abstract class C3429c implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: B */
    protected static int f8278B = ViewConfiguration.get(C3578m.m11231a()).getScaledTouchSlop();

    /* renamed from: a */
    private static float f8279a = 0.0f;

    /* renamed from: b */
    private static float f8280b = 0.0f;

    /* renamed from: c */
    private static float f8281c = 0.0f;

    /* renamed from: d */
    private static float f8282d = 0.0f;

    /* renamed from: e */
    private static long f8283e = 0;

    /* renamed from: A */
    protected int f8284A = -1;

    /* renamed from: C */
    protected boolean f8285C = true;

    /* renamed from: D */
    protected View f8286D;

    /* renamed from: E */
    public SparseArray<C3430a> f8287E = new SparseArray<>();

    /* renamed from: f */
    private int f8288f = 0;

    /* renamed from: g */
    private int f8289g = 0;

    /* renamed from: s */
    protected float f8290s = -1.0f;

    /* renamed from: t */
    protected float f8291t = -1.0f;

    /* renamed from: u */
    protected float f8292u = -1.0f;

    /* renamed from: v */
    protected float f8293v = -1.0f;

    /* renamed from: w */
    protected long f8294w = -1;

    /* renamed from: x */
    protected long f8295x = -1;

    /* renamed from: y */
    protected int f8296y = -1;

    /* renamed from: z */
    protected int f8297z = -1024;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3430a> sparseArray, boolean z);

    static {
        if (ViewConfiguration.get(C3578m.m11231a()) != null) {
        }
    }

    public void onClick(View view) {
        if (C3536e.m10968a()) {
            mo18471a(view, this.f8290s, this.f8291t, this.f8292u, this.f8293v, this.f8287E, this.f8285C);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        this.f8297z = motionEvent.getDeviceId();
        this.f8296y = motionEvent.getToolType(0);
        this.f8284A = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 3;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f8292u = motionEvent.getRawX();
                this.f8293v = motionEvent.getRawY();
                this.f8295x = System.currentTimeMillis();
                if (Math.abs(this.f8292u - ((float) this.f8288f)) >= ((float) C3578m.f9006a) || Math.abs(this.f8293v - ((float) this.f8289g)) >= ((float) C3578m.f9006a)) {
                    this.f8285C = false;
                }
                Point point = new Point((int) this.f8292u, (int) this.f8293v);
                if (view != null && !C3427b.m10249c(view) && m10274a((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                f8281c += Math.abs(motionEvent.getX() - f8279a);
                f8282d += Math.abs(motionEvent.getY() - f8280b);
                f8279a = motionEvent.getX();
                f8280b = motionEvent.getY();
                if (System.currentTimeMillis() - f8283e > 200) {
                    float f = f8281c;
                    int i3 = f8278B;
                    if (f > ((float) i3) || f8282d > ((float) i3)) {
                        i2 = 1;
                        this.f8292u = motionEvent.getRawX();
                        this.f8293v = motionEvent.getRawY();
                        if (Math.abs(this.f8292u - ((float) this.f8288f)) >= ((float) C3578m.f9006a) || Math.abs(this.f8293v - ((float) this.f8289g)) >= ((float) C3578m.f9006a)) {
                            this.f8285C = false;
                        }
                    }
                }
                i2 = 2;
                this.f8292u = motionEvent.getRawX();
                this.f8293v = motionEvent.getRawY();
                this.f8285C = false;
            }
            i = i2;
        } else {
            this.f8288f = (int) motionEvent.getRawX();
            this.f8289g = (int) motionEvent.getRawY();
            this.f8290s = motionEvent.getRawX();
            this.f8291t = motionEvent.getRawY();
            this.f8294w = System.currentTimeMillis();
            this.f8296y = motionEvent.getToolType(0);
            this.f8297z = motionEvent.getDeviceId();
            this.f8284A = motionEvent.getSource();
            f8283e = System.currentTimeMillis();
            this.f8285C = true;
            this.f8286D = view;
            i = 0;
        }
        this.f8287E.put(motionEvent.getActionMasked(), new C3430a(i, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    /* renamed from: a */
    private boolean m10274a(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (C3427b.m10249c(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (!view.isShown() || point.x < iArr[0] || point.x > iArr[0] + childAt.getWidth() || point.y < iArr[1] || point.y > iArr[1] + childAt.getHeight()) {
                        return false;
                    }
                    return true;
                } else if (m10274a(childAt, point)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.c$a */
    /* compiled from: InteractionListener */
    public static class C3430a {

        /* renamed from: a */
        public int f8298a = -1;

        /* renamed from: b */
        public double f8299b = -1.0d;

        /* renamed from: c */
        public double f8300c = -1.0d;

        /* renamed from: d */
        public long f8301d = -1;

        public C3430a(int i, double d, double d2, long j) {
            this.f8298a = i;
            this.f8299b = d;
            this.f8300c = d2;
            this.f8301d = j;
        }
    }
}
