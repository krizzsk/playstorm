package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.tapjoy.internal.z */
public enum C11848z {
    UNSPECIFIED,
    PORTRAIT,
    LANDSCAPE,
    SQUARE,
    NATURAL_PORTRAIT(PORTRAIT),
    RIGHT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    REVERSE_PORTRAIT(PORTRAIT, NATURAL_PORTRAIT),
    LEFT_LANDSCAPE(LANDSCAPE, NATURAL_PORTRAIT),
    NATURAL_LANDSCAPE(LANDSCAPE),
    RIGHT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    REVERSE_LANDSCAPE(LANDSCAPE, NATURAL_LANDSCAPE),
    LEFT_PORTRAIT(PORTRAIT, NATURAL_LANDSCAPE),
    NATURAL_SQUARE(SQUARE),
    RIGHT_SQUARE(SQUARE, NATURAL_SQUARE),
    REVERSE_SQUARE(SQUARE, NATURAL_SQUARE),
    LEFT_SQUARE(SQUARE, NATURAL_SQUARE);
    

    /* renamed from: q */
    private final C11848z f28961q;

    /* renamed from: r */
    private final C11848z f28962r;

    private C11848z(C11848z zVar) {
        this.f28961q = zVar;
        this.f28962r = this;
    }

    private C11848z(C11848z zVar, C11848z zVar2) {
        this.f28961q = zVar;
        this.f28962r = zVar2;
    }

    /* renamed from: a */
    public final boolean mo72819a() {
        C11848z zVar = PORTRAIT;
        return this == zVar || this.f28961q == zVar;
    }

    /* renamed from: b */
    public final boolean mo72820b() {
        C11848z zVar = LANDSCAPE;
        return this == zVar || this.f28961q == zVar;
    }

    /* renamed from: c */
    public final int mo72821c() {
        if (this.f28962r != null) {
            return ordinal() - this.f28962r.ordinal();
        }
        return 0;
    }

    /* renamed from: a */
    public static C11848z m34423a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        }
        if (point.x < point.y) {
            int i = rotation & 3;
            if (i == 1) {
                return RIGHT_PORTRAIT;
            }
            if (i == 2) {
                return REVERSE_PORTRAIT;
            }
            if (i != 3) {
                return NATURAL_PORTRAIT;
            }
            return LEFT_PORTRAIT;
        } else if (point.x > point.y) {
            int i2 = rotation & 3;
            if (i2 == 1) {
                return RIGHT_LANDSCAPE;
            }
            if (i2 == 2) {
                return REVERSE_LANDSCAPE;
            }
            if (i2 != 3) {
                return NATURAL_LANDSCAPE;
            }
            return LEFT_LANDSCAPE;
        } else {
            int i3 = rotation & 3;
            if (i3 == 1) {
                return RIGHT_SQUARE;
            }
            if (i3 == 2) {
                return REVERSE_SQUARE;
            }
            if (i3 != 3) {
                return NATURAL_SQUARE;
            }
            return LEFT_SQUARE;
        }
    }

    /* renamed from: b */
    public static C11848z m34424b(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return PORTRAIT;
        }
        if (i != 2) {
            return UNSPECIFIED;
        }
        return LANDSCAPE;
    }
}
