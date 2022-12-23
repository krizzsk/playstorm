package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

import com.smaato.sdk.core.gdpr.tcfv2.TCModel;

public interface BaseSegmentEncoder {
    TCModel decode(String str, TCModel tCModel);
}
