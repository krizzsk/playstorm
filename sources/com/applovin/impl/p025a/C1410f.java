package com.applovin.impl.p025a;

import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.applovin.impl.a.f */
public enum C1410f {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(401),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(405),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);
    

    /* renamed from: q */
    private final int f1583q;

    private C1410f(int i) {
        this.f1583q = i;
    }

    /* renamed from: a */
    public int mo12682a() {
        return this.f1583q;
    }
}
