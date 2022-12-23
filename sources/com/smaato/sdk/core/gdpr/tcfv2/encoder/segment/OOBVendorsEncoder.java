package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

import android.util.Log;
import com.smaato.sdk.core.gdpr.tcfv2.TCModel;
import com.smaato.sdk.core.gdpr.tcfv2.TCModelEnum;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.Base64Converter;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BaseEncoder;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.FieldEncoderMap;
import com.smaato.sdk.core.gdpr.tcfv2.model.Fields;
import com.smaato.sdk.core.gdpr.tcfv2.model.Segments;
import com.smaato.sdk.core.gdpr.tcfv2.model.SortedVector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.Map;

public final class OOBVendorsEncoder implements BaseSegmentEncoder {
    private static final OOBVendorsEncoder instance = new OOBVendorsEncoder();

    private OOBVendorsEncoder() {
    }

    public static OOBVendorsEncoder getInstance() {
        return instance;
    }

    public TCModel decode(String str, TCModel tCModel) {
        String str2;
        try {
            Map<String, BaseEncoder> fieldMap = FieldEncoderMap.getInstance().getFieldMap();
            String decode = Base64Converter.decode(str);
            if (TextUtils.isEmpty(decode)) {
                return null;
            }
            int intValue = ((Integer) fieldMap.get("segmentType").decode(decode.substring(0, Objects.getIntValueFromMap(BitLength.getFieldLengths(), "segmentType") + 0))).intValue();
            if (intValue == 0) {
                str2 = Segments.CORE;
            } else if (intValue == 1) {
                str2 = "vendorsDisclosed";
            } else if (intValue == 2) {
                str2 = "vendorsAllowed";
                TCModelEnum.valueOf(Fields.SUPPORT_OOB).setValue(tCModel, Boolean.TRUE);
            } else if (intValue != 3) {
                return null;
            } else {
                str2 = Segments.PUBLISHER_TC;
            }
            SortedVector sortedVector = (SortedVector) fieldMap.get(str2).decode(decode.substring(Objects.getIntValueFromMap(BitLength.getFieldLengths(), "segmentType")));
            if (!sortedVector.getSet().isEmpty()) {
                SortedVector sortedVector2 = new SortedVector();
                for (int i = 0; i <= sortedVector.getSet().first().intValue(); i++) {
                    if (sortedVector.getSet().contains(Integer.valueOf(i))) {
                        sortedVector2 = (SortedVector) TCModelEnum.valueOf(str2).getValue(tCModel);
                        sortedVector2.getSet().add(Integer.valueOf(i));
                        if (sortedVector2.getBitLength() != 0) {
                            sortedVector2.setBitLength(0);
                        }
                    }
                }
                if (sortedVector2.getSet().size() > 0) {
                    TCModelEnum.valueOf(str2).setValue(tCModel, sortedVector2);
                }
            }
            return tCModel;
        } catch (Exception e) {
            Log.e(OOBVendorsEncoder.class.getName(), "OOBVendorEncoder's decoder failed: " + e.getMessage());
            return null;
        }
    }
}
