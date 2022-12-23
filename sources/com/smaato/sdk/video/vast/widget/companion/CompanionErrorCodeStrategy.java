package com.smaato.sdk.video.vast.widget.companion;

import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementException;
import com.smaato.sdk.video.vast.widget.element.VastElementLoadingException;

public final class CompanionErrorCodeStrategy implements VastElementErrorCodeStrategy {
    public int getVastErrorCode(VastElementException vastElementException) {
        if (vastElementException instanceof VastElementLoadingException) {
            return 603;
        }
        return ErrorCode.UNDEFINED_ERROR;
    }
}
