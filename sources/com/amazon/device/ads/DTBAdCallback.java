package com.amazon.device.ads;

public interface DTBAdCallback {
    void onFailure(AdError adError);

    void onSuccess(DTBAdResponse dTBAdResponse);
}
