package com.smaato.sdk.core.util;

import java.util.ArrayList;

public final class SdkComponentExceptionUtil {
    private SdkComponentExceptionUtil() {
    }

    public static Exception getRootReason(SdkComponentException sdkComponentException) {
        ArrayList arrayList = new ArrayList(10);
        while (true) {
            Exception reason = arrayList.isEmpty() ? sdkComponentException.getReason() : ((SdkComponentException) arrayList.get(arrayList.size() - 1)).getReason();
            Objects.requireNonNull(reason);
            if (!(reason instanceof SdkComponentException)) {
                return reason;
            }
            arrayList.add((SdkComponentException) reason);
        }
    }
}
