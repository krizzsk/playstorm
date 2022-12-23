package com.p374my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* renamed from: com.my.target.x7 */
public class C10038x7 {

    /* renamed from: A */
    public static final int f24904A = m29710a();

    /* renamed from: B */
    public static final int f24905B = m29710a();

    /* renamed from: C */
    public static final int f24906C = m29710a();

    /* renamed from: D */
    public static final int f24907D = m29710a();

    /* renamed from: E */
    public static final int f24908E = m29710a();

    /* renamed from: F */
    public static final int f24909F = m29710a();

    /* renamed from: G */
    public static final int f24910G = m29710a();

    /* renamed from: H */
    public static final int f24911H = m29710a();

    /* renamed from: I */
    public static final int f24912I = m29710a();

    /* renamed from: J */
    public static final int f24913J = m29710a();

    /* renamed from: K */
    public static final int f24914K = m29710a();

    /* renamed from: L */
    public static final int f24915L = m29710a();

    /* renamed from: M */
    public static final int f24916M = m29710a();

    /* renamed from: N */
    public static final int f24917N = m29710a();

    /* renamed from: O */
    public static final int f24918O = m29710a();

    /* renamed from: P */
    public static final int f24919P = m29710a();

    /* renamed from: Q */
    public static final int f24920Q = m29710a();

    /* renamed from: R */
    public static final int f24921R = m29710a();

    /* renamed from: S */
    public static final int f24922S = m29710a();

    /* renamed from: T */
    public static final int f24923T = m29710a();

    /* renamed from: U */
    public static final int f24924U = m29710a();

    /* renamed from: V */
    public static final int f24925V = m29710a();

    /* renamed from: W */
    public static int f24926W = 0;

    /* renamed from: a */
    public static final int f24927a = m29710a();

    /* renamed from: b */
    public static final int f24928b = m29710a();

    /* renamed from: c */
    public static final int f24929c = m29710a();

    /* renamed from: d */
    public static final int f24930d = m29710a();

    /* renamed from: e */
    public static final int f24931e = m29710a();

    /* renamed from: f */
    public static final int f24932f = m29710a();

    /* renamed from: g */
    public static final int f24933g = m29710a();

    /* renamed from: h */
    public static final int f24934h = m29710a();

    /* renamed from: i */
    public static final int f24935i = m29710a();

    /* renamed from: j */
    public static final int f24936j = m29710a();

    /* renamed from: k */
    public static final int f24937k = m29710a();

    /* renamed from: l */
    public static final int f24938l = m29710a();

    /* renamed from: m */
    public static final int f24939m = m29710a();

    /* renamed from: n */
    public static final int f24940n = m29710a();

    /* renamed from: o */
    public static final int f24941o = m29710a();

    /* renamed from: p */
    public static final int f24942p = m29710a();

    /* renamed from: q */
    public static final int f24943q = m29710a();

    /* renamed from: r */
    public static final int f24944r = m29710a();

    /* renamed from: s */
    public static final int f24945s = m29710a();

    /* renamed from: t */
    public static final int f24946t = m29710a();

    /* renamed from: u */
    public static final int f24947u = m29710a();

    /* renamed from: v */
    public static final int f24948v = m29710a();

    /* renamed from: w */
    public static final int f24949w = m29710a();

    /* renamed from: x */
    public static final int f24950x = m29710a();

    /* renamed from: y */
    public static final int f24951y = m29710a();

    /* renamed from: z */
    public static final int f24952z = m29710a();

    /* renamed from: X */
    public final SparseIntArray f24953X = new SparseIntArray();

    /* renamed from: Y */
    public final float f24954Y;

    public C10038x7(Context context) {
        int i;
        float f;
        C10059y8 c = C10059y8.m29843c(context);
        DisplayMetrics a = C10059y8.m29827a(context);
        int i2 = a.heightPixels;
        if (i2 <= 0 || (i = a.widthPixels) <= 0) {
            this.f24954Y = 1.0f;
            mo65715a(c);
            return;
        }
        float f2 = a.density;
        float min = Math.min(((float) i) / f2, ((float) i2) / f2);
        if (min >= 720.0f) {
            f = 2.0f;
        } else if (min >= 600.0f) {
            f = 1.2f;
        } else {
            this.f24954Y = 1.0f;
            mo65715a(c);
        }
        this.f24954Y = f;
        mo65715a(c);
    }

    /* renamed from: a */
    public static int m29710a() {
        int i = f24926W;
        f24926W = i + 1;
        return i;
    }

    /* renamed from: a */
    public static C10038x7 m29711a(Context context) {
        return new C10038x7(context);
    }

    /* renamed from: a */
    public int mo65713a(int i) {
        return this.f24953X.get(i);
    }

    /* renamed from: a */
    public final void mo65714a(int i, int i2) {
        this.f24953X.put(i, (int) (((float) i2) * this.f24954Y));
    }

    /* renamed from: a */
    public final void mo65715a(C10059y8 y8Var) {
        mo65714a(f24927a, y8Var.mo65778b(200));
        mo65714a(f24928b, y8Var.mo65778b(1));
        mo65714a(f24929c, y8Var.mo65778b(4));
        mo65714a(f24930d, 1);
        mo65714a(f24931e, 18);
        mo65714a(f24932f, y8Var.mo65778b(16));
        mo65714a(f24933g, y8Var.mo65778b(8));
        mo65714a(f24934h, y8Var.mo65778b(6));
        mo65714a(f24935i, y8Var.mo65778b(2));
        mo65714a(f24936j, y8Var.mo65778b(48));
        mo65714a(f24937k, y8Var.mo65778b(6));
        mo65714a(f24938l, y8Var.mo65778b(6));
        mo65714a(f24939m, y8Var.mo65778b(14));
        mo65714a(f24940n, y8Var.mo65778b(20));
        mo65714a(f24941o, y8Var.mo65778b(27));
        mo65714a(f24942p, 22);
        mo65714a(f24943q, 2);
        mo65714a(f24944r, 16);
        mo65714a(f24945s, 3);
        mo65714a(f24946t, 16);
        mo65714a(f24947u, y8Var.mo65778b(6));
        mo65714a(f24948v, y8Var.mo65778b(2));
        mo65714a(f24949w, 1);
        mo65714a(f24950x, y8Var.mo65778b(3));
        mo65714a(f24952z, 16);
        mo65714a(f24924U, 14);
        mo65714a(f24951y, 1);
        mo65714a(f24904A, 2);
        mo65714a(f24905B, 2);
        mo65714a(f24906C, y8Var.mo65778b(32));
        mo65714a(f24907D, y8Var.mo65778b(16));
        mo65714a(f24909F, y8Var.mo65778b(2));
        mo65714a(f24910G, 16);
        mo65714a(f24912I, 16);
        mo65714a(f24913J, 2);
        mo65714a(f24914K, 14);
        mo65714a(f24911H, 22);
        mo65714a(f24917N, 16);
        mo65714a(f24918O, 16);
        mo65714a(f24915L, y8Var.mo65778b(4));
        mo65714a(f24916M, y8Var.mo65778b(8));
        mo65714a(f24919P, y8Var.mo65778b(100));
        mo65714a(f24920Q, y8Var.mo65778b(32));
        mo65714a(f24921R, y8Var.mo65778b(136));
        mo65714a(f24922S, y8Var.mo65778b(156));
        mo65714a(f24908E, y8Var.mo65778b(24));
        mo65714a(f24923T, y8Var.mo65778b(10));
        mo65714a(f24925V, y8Var.mo65778b(40));
    }
}
