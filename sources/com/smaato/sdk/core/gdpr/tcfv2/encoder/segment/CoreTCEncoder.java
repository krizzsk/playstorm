package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.TCModel;
import com.smaato.sdk.core.gdpr.tcfv2.TCModelEnum;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.Base64Converter;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.FieldEncoderMap;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.FixedVectorEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.PurposeRestrictionVectorEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.VendorVectorEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.sequence.CoreFieldSequence;
import com.smaato.sdk.core.gdpr.tcfv2.model.PurposeRestrictionVector;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;
import com.smaato.sdk.core.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class CoreTCEncoder implements BaseSegmentEncoder {
    private static final CoreTCEncoder instance = new CoreTCEncoder();

    private CoreTCEncoder() {
    }

    public static CoreTCEncoder getInstance() {
        return instance;
    }

    public TCModel decode(String str, TCModel tCModel) {
        int i;
        Class<CoreTCEncoder> cls = CoreTCEncoder.class;
        try {
            Map<String, BaseEncoder> fieldMap = FieldEncoderMap.getInstance().getFieldMap();
            List<String> versionTwoFieldSequence = CoreFieldSequence.getInstance().getVersionTwoFieldSequence();
            String decode = Base64Converter.decode(str);
            if (decode == null) {
                return null;
            }
            AtomicInteger atomicInteger = new AtomicInteger();
            int size = versionTwoFieldSequence.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = versionTwoFieldSequence.get(i2);
                BaseEncoder baseEncoder = fieldMap.get(str2);
                if (baseEncoder != null) {
                    int intValueFromMap = Objects.getIntValueFromMap(BitLength.getFieldLengths(), str2);
                    if (intValueFromMap <= 0 || decode.length() <= atomicInteger.get() + intValueFromMap) {
                        String substring = decode.substring(atomicInteger.get());
                        if (baseEncoder instanceof PurposeRestrictionVectorEncoder) {
                            PurposeRestrictionVector purposeRestrictionVector = (PurposeRestrictionVector) baseEncoder.decode(substring);
                            TCModelEnum.valueOf(str2).setValue(tCModel, purposeRestrictionVector);
                            i = purposeRestrictionVector.getBitLength();
                        } else {
                            if (!(baseEncoder instanceof FixedVectorEncoder)) {
                                if (!(baseEncoder instanceof VendorVectorEncoder)) {
                                    Log.e(cls.getName(), "Decoder instance in incorrect " + baseEncoder.getClass());
                                    i = 0;
                                }
                            }
                            SortedVector sortedVector = (SortedVector) baseEncoder.decode(substring);
                            TCModelEnum.valueOf(str2).setValue(tCModel, sortedVector);
                            i = sortedVector.getBitLength();
                        }
                        atomicInteger.addAndGet(i);
                    } else {
                        TCModelEnum.valueOf(str2).setValue(tCModel, baseEncoder.decode(decode.substring(atomicInteger.get(), atomicInteger.addAndGet(intValueFromMap))));
                    }
                } else {
                    Log.e(cls.getName(), "Decoder is absent for the given key: " + str2);
                }
            }
            return tCModel;
        } catch (Exception e) {
            Log.e(cls.getName(), "CoreTCEncoder's decoder failed: " + e.getMessage());
            return null;
        }
    }
}
