package com.smaato.sdk.video.vast.widget.icon;

import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementException;

public final class IconErrorCodeStrategy implements VastElementErrorCodeStrategy {
    public int getVastErrorCode(VastElementException vastElementException) {
        return ErrorCode.UNDEFINED_ERROR;
    }
}
