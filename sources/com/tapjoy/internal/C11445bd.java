package com.tapjoy.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.tapjoy.internal.bd */
public final class C11445bd {

    /* renamed from: a */
    public static final C11444bc<Point> f27691a = new C11444bc<Point>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            Point point = new Point();
            bhVar.mo72223h();
            while (bhVar.mo72225j()) {
                String l = bhVar.mo72227l();
                if ("x".equals(l)) {
                    point.x = bhVar.mo72233r();
                } else if ("y".equals(l)) {
                    point.y = bhVar.mo72233r();
                } else {
                    bhVar.mo72234s();
                }
            }
            bhVar.mo72224i();
            return point;
        }
    };

    /* renamed from: b */
    public static final C11444bc<Rect> f27692b = new C11444bc<Rect>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            Rect rect = new Rect();
            int i = C114483.f27693a[bhVar.mo72226k().ordinal()];
            if (i == 1) {
                bhVar.mo72221f();
                rect.left = bhVar.mo72233r();
                rect.top = bhVar.mo72233r();
                rect.right = bhVar.mo72233r();
                rect.bottom = bhVar.mo72233r();
                while (bhVar.mo72225j()) {
                    bhVar.mo72234s();
                }
                bhVar.mo72222g();
            } else if (i == 2) {
                bhVar.mo72223h();
                while (bhVar.mo72225j()) {
                    String l = bhVar.mo72227l();
                    if ("left".equals(l)) {
                        rect.left = bhVar.mo72233r();
                    } else if ("top".equals(l)) {
                        rect.top = bhVar.mo72233r();
                    } else if ("right".equals(l)) {
                        rect.right = bhVar.mo72233r();
                    } else if (TJAdUnitConstants.String.BOTTOM.equals(l)) {
                        rect.bottom = bhVar.mo72233r();
                    } else {
                        bhVar.mo72234s();
                    }
                }
                bhVar.mo72224i();
            } else {
                throw new IllegalStateException("Unexpected token: " + bhVar.mo72226k());
            }
            return rect;
        }
    };

    /* renamed from: com.tapjoy.internal.bd$3 */
    static /* synthetic */ class C114483 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27693a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tapjoy.internal.bm[] r0 = com.tapjoy.internal.C11461bm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27693a = r0
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27693a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.bm r1 = com.tapjoy.internal.C11461bm.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11445bd.C114483.<clinit>():void");
        }
    }
}
