package com.smaato.sdk.core.util;

import java.util.Calendar;

public class CurrentTimeProvider {
    public long currentMillisUtc() {
        return System.currentTimeMillis();
    }

    public int getCurrentYear() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentMillisUtc());
        return instance.get(1);
    }
}
