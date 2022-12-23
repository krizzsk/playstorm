package com.inmobi.media;

/* renamed from: com.inmobi.media.df */
/* compiled from: Orientation */
public enum C5977df {
    PORTRAIT(0),
    LANDSCAPE(90),
    REVERSE_PORTRAIT(180),
    REVERSE_LANDSCAPE(270);
    

    /* renamed from: e */
    public final int f15193e;

    private C5977df(int i) {
        this.f15193e = i;
    }

    /* renamed from: a */
    public final boolean mo35080a() {
        int i = this.f15193e;
        return i == LANDSCAPE.f15193e || i == REVERSE_LANDSCAPE.f15193e;
    }

    /* renamed from: a */
    public static C5977df m17846a(int i) {
        if (i == 2) {
            return REVERSE_PORTRAIT;
        }
        if (i == 3) {
            return LANDSCAPE;
        }
        if (i != 4) {
            return PORTRAIT;
        }
        return REVERSE_LANDSCAPE;
    }
}
