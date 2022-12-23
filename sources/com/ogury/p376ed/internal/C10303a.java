package com.ogury.p376ed.internal;

import com.ogury.p376ed.OguryBannerAdSize;

/* renamed from: com.ogury.ed.internal.a */
public final class C10303a {

    /* renamed from: a */
    public static final C10303a f26109a = new C10303a();

    /* renamed from: com.ogury.ed.internal.a$a */
    public /* synthetic */ class C10304a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26110a;

        static {
            int[] iArr = new int[OguryBannerAdSize.values().length];
            iArr[OguryBannerAdSize.MPU_300x250.ordinal()] = 1;
            iArr[OguryBannerAdSize.SMALL_BANNER_320x50.ordinal()] = 2;
            f26110a = iArr;
        }
    }

    private C10303a() {
    }

    /* renamed from: a */
    public static C10491ej m31147a(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return null;
        }
        int i = C10304a.f26110a[oguryBannerAdSize.ordinal()];
        if (i == 1) {
            return C10491ej.MEDIUM_RECTANGLE;
        }
        if (i == 2) {
            return C10491ej.SMALL_BANNER;
        }
        throw new C10677jy();
    }

    /* renamed from: b */
    public static C10407cn m31148b(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return new C10407cn(0, 0);
        }
        return new C10407cn(C10556gi.m32087b(oguryBannerAdSize.getWidth()), C10556gi.m32087b(oguryBannerAdSize.getHeight()));
    }
}
