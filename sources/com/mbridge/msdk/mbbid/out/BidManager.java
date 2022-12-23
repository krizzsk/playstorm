package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.mbbid.common.C8720a;
import com.mbridge.msdk.mbbid.common.p328a.C8722b;

public class BidManager {

    /* renamed from: a */
    private C8722b f21165a;

    /* renamed from: b */
    private BidListennning f21166b;

    /* renamed from: c */
    private boolean f21167c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    public BidManager(String str, String str2, String str3) {
        this.f21167c = false;
        this.f21165a = new C8722b(str, str2, str3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends com.mbridge.msdk.mbbid.out.CommonBidRequestParams> BidManager(T r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L_0x0006
            r1 = r0
            goto L_0x000a
        L_0x0006:
            java.lang.String r1 = r5.getmPlacementId()
        L_0x000a:
            if (r5 != 0) goto L_0x000e
            r2 = r0
            goto L_0x0012
        L_0x000e:
            java.lang.String r2 = r5.getmUnitId()
        L_0x0012:
            if (r5 != 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            java.lang.String r0 = r5.getmFloorPrice()
        L_0x0019:
            r4.<init>(r1, r2, r0)
            boolean r0 = r5 instanceof com.mbridge.msdk.mbbid.out.BannerBidRequestParams
            if (r0 == 0) goto L_0x005e
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            r1 = r5
            com.mbridge.msdk.mbbid.out.BannerBidRequestParams r1 = (com.mbridge.msdk.mbbid.out.BannerBidRequestParams) r1
            int r2 = r1.getHeight()
            long r2 = (long) r2
            r0.mo58061a((long) r2)
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            int r1 = r1.getWidth()
            long r1 = (long) r1
            r0.mo58065b((long) r1)
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            r1 = 296(0x128, float:4.15E-43)
            r0.mo58064b((int) r1)
            boolean r0 = r5 instanceof com.mbridge.msdk.mbbid.out.SplashBidRequestParams
            if (r0 == 0) goto L_0x007f
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            com.mbridge.msdk.mbbid.out.SplashBidRequestParams r5 = (com.mbridge.msdk.mbbid.out.SplashBidRequestParams) r5
            boolean r1 = r5.mo58101a()
            r0.mo58063a((boolean) r1)
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            int r5 = r5.getOrientation()
            r0.mo58060a((int) r5)
            com.mbridge.msdk.mbbid.common.a.b r5 = r4.f21165a
            r0 = 297(0x129, float:4.16E-43)
            r5.mo58064b((int) r0)
            goto L_0x007f
        L_0x005e:
            boolean r0 = r5 instanceof com.mbridge.msdk.mbbid.out.AdvancedNativeBidRequestParams
            if (r0 == 0) goto L_0x007f
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            com.mbridge.msdk.mbbid.out.AdvancedNativeBidRequestParams r5 = (com.mbridge.msdk.mbbid.out.AdvancedNativeBidRequestParams) r5
            int r1 = r5.getHeight()
            long r1 = (long) r1
            r0.mo58061a((long) r1)
            com.mbridge.msdk.mbbid.common.a.b r0 = r4.f21165a
            int r5 = r5.getWidth()
            long r1 = (long) r5
            r0.mo58065b((long) r1)
            com.mbridge.msdk.mbbid.common.a.b r5 = r4.f21165a
            r0 = 298(0x12a, float:4.18E-43)
            r5.mo58064b((int) r0)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbid.out.BidManager.<init>(com.mbridge.msdk.mbbid.out.CommonBidRequestParams):void");
    }

    public void setRewardPlus(boolean z) {
        this.f21167c = z;
    }

    public void bid() {
        C8722b bVar = this.f21165a;
        if (bVar != null) {
            bVar.mo58066b(this.f21167c);
            return;
        }
        BidListennning bidListennning = this.f21166b;
        if (bidListennning != null) {
            bidListennning.onFailed("you need init the class :BidManager");
        }
    }

    public static String getBuyerUid(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return C8720a.m25310a(context, str);
    }

    public void setBidListener(BidListennning bidListennning) {
        this.f21166b = bidListennning;
        C8722b bVar = this.f21165a;
        if (bVar != null) {
            bVar.mo58062a(bidListennning);
        }
    }

    public static String getBuyerUid(Context context) {
        return C8720a.m25310a(context, "");
    }
}
