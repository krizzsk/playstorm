package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8596q;

public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: b */
    private static int f21170b = 1;

    /* renamed from: c */
    private static int f21171c;

    /* renamed from: d */
    private static int f21172d;

    /* renamed from: a */
    private boolean f21173a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f21170b, f21172d, f21171c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f21173a = false;
        f21170b = i;
        int h = C8596q.m24837h(C2350a.m5601e().mo15792g());
        int i4 = C8596q.m24838i(C2350a.m5601e().mo15792g());
        int i5 = f21170b;
        if (i5 == 1) {
            if (i4 > i3 * 4) {
                setHeight(i4 - i3);
                setWidth(h);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i5 == 2) {
            if (h > i2 * 4) {
                setWidth(h - i2);
                setHeight(i4);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f21173a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58101a() {
        return this.f21173a;
    }

    public int getOrientation() {
        return f21170b;
    }
}
