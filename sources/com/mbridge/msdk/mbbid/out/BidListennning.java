package com.mbridge.msdk.mbbid.out;

public interface BidListennning {
    void onFailed(String str);

    void onSuccessed(BidResponsed bidResponsed);
}
