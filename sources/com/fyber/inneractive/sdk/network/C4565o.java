package com.fyber.inneractive.sdk.network;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.fyber.inneractive.sdk.network.o */
public enum C4565o {
    VAST_ERROR_INVALID_RESPONSE(ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR),
    VAST_ERROR_TOO_MANY_WRAPPERS(302),
    VAST_ERROR_NO_MEDIA_FILES(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR),
    VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE(ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR),
    VAST_ERROR_PRE_BUFFER_TIMEOUT(306),
    VAST_ERROR_BUFFER_TIMEOUT(307),
    VAST_ERROR_FAILED_PLAYING_MEDIA_FILE(308),
    VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES(311),
    VAST_ERROR_UNSECURE_URL(312),
    MRAID_ERROR_UNSECURE_CONTENT(313),
    VPAID_ERROR_UNSECURE_CONTENT(314),
    VAST_UNKNOWN_PLAYER_ERROR(399),
    MRAID_AUTO_ACTION_DETECTED(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE),
    INTERNAL_CONFIG_MISMATCH(601),
    FATAL_CONFIGURATION_ERROR(701),
    FATAL_FEATURES_CONFIG_ERROR(704),
    MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION(390),
    VAST_COMPANION_FAILED_LOADING(70),
    VAST_COMPANION_INCOMPATIBLE_MIMETYPE(75),
    CLICK_PARSING_FAILURE(991),
    MISSMATCH_SPOTID(992),
    IA_AD_LOAD_FAILED(801),
    IA_AD_EXPIRED(802),
    IA_AD_DESTROYED_WITHOUT_SHOW(803),
    FETCH_TOKEN_DV_ERROR(1000),
    DV_ERROR_PHASE(1001),
    FMP_SDK_INIT_FAILED(62),
    FATAL_ADM_PARSING_ERROR(603),
    FATAL_ADM_MARKUP_FETCHING_ERROR(604),
    TOKEN_EXCEEDS_LIMIT(IronSourceError.ERROR_BN_LOAD_EXCEPTION);
    

    /* renamed from: a */
    public int f11332a;

    /* access modifiers changed from: public */
    C4565o(int i) {
        this.f11332a = i;
    }
}
