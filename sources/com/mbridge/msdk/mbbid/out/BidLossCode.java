package com.mbridge.msdk.mbbid.out;

public class BidLossCode {

    /* renamed from: a */
    private static int f21164a;

    private BidLossCode(int i) {
        f21164a = i;
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f21164a;
    }
}
