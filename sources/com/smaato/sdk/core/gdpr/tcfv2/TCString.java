package com.smaato.sdk.core.gdpr.tcfv2;

import com.smaato.sdk.core.dns.DnsName;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.Base64Converter;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.IntEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.segment.BaseSegmentEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.segment.SegmentEncoderMap;
import com.smaato.sdk.core.util.TextUtils;
import java.util.Arrays;
import java.util.List;

public final class TCString {
    private static final TCString instance = new TCString();
    private IntEncoder intEncoder = IntEncoder.getInstance();

    private TCString() {
    }

    public static TCString getInstance() {
        return instance;
    }

    public TCModel decode(String str) {
        BaseSegmentEncoder baseSegmentEncoder;
        List asList = Arrays.asList(str.replaceAll("_", "/").replaceAll("-", "+").split(DnsName.ESCAPED_DOT));
        SegmentEncoderMap instance2 = SegmentEncoderMap.getInstance();
        TCModel tCModel = new TCModel();
        int size = asList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) asList.get(i);
            if (i == 0) {
                baseSegmentEncoder = instance2.getCore();
            } else {
                String decode = Base64Converter.decode(str2);
                Integer num = BitLength.getFieldLengths().get("segmentType");
                if (!TextUtils.isEmpty(decode) && num != null && decode.length() > num.intValue()) {
                    int intValue = this.intEncoder.decode(decode.substring(0, num.intValue())).intValue();
                    if (intValue == 1) {
                        baseSegmentEncoder = instance2.getVendorsDisclosed();
                    } else if (intValue != 2) {
                        baseSegmentEncoder = instance2.getPublisherTC();
                    } else {
                        baseSegmentEncoder = instance2.getVendorsAllowed();
                    }
                }
            }
            baseSegmentEncoder.decode(str2, tCModel);
        }
        return tCModel;
    }
}
