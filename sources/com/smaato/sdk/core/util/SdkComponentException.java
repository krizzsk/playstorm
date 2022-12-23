package com.smaato.sdk.core.util;

import java.lang.Enum;

public interface SdkComponentException<ErrorType extends Enum<ErrorType>> {
    ErrorType getErrorType();

    Exception getReason();
}
