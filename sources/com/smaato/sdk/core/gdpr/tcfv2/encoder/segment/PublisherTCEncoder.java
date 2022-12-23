package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.TCModel;
import com.smaato.sdk.core.gdpr.tcfv2.TCModelEnum;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.Base64Converter;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.FieldEncoderMap;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.sequence.PublisherFieldSequence;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class PublisherTCEncoder implements BaseSegmentEncoder {
    private static final PublisherTCEncoder instance = new PublisherTCEncoder();

    private PublisherTCEncoder() {
    }

    public static PublisherTCEncoder getInstance() {
        return instance;
    }

    public TCModel decode(String str, TCModel tCModel) {
        List<String> list;
        try {
            Map<String, BaseEncoder> fieldMap = FieldEncoderMap.getInstance().getFieldMap();
            PublisherFieldSequence instance2 = PublisherFieldSequence.getInstance();
            if (tCModel.getVersion() == 1) {
                list = instance2.getVersionOneFieldSequence();
            } else {
                list = instance2.getVersionTwoFieldSequence();
            }
            AtomicInteger atomicInteger = new AtomicInteger();
            String decode = Base64Converter.decode(str);
            if (TextUtils.isEmpty(decode)) {
                return null;
            }
            String substring = decode.substring(Objects.getIntValueFromMap(BitLength.getFieldLengths(), "segmentType"));
            for (int i = 0; i < list.size(); i++) {
                String str2 = list.get(i);
                BaseEncoder baseEncoder = fieldMap.get(str2);
                int intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), str2);
                if (intValueFromMap <= 0) {
                    intValueFromMap = tCModel.getNumCustomPurposes();
                }
                TCModelEnum.valueOf(str2).setValue(tCModel, baseEncoder.decode(substring.substring(atomicInteger.get(), atomicInteger.get() + intValueFromMap)));
                atomicInteger.addAndGet(intValueFromMap);
            }
            return tCModel;
        } catch (Exception e) {
            String name = PublisherTCEncoder.class.getName();
            Log.e(name, "PublisherTCEncoder's decoder failed: " + e.getMessage());
            return null;
        }
    }
}
