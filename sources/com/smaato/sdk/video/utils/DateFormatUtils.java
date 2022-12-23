package com.smaato.sdk.video.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateFormatUtils {
    /* access modifiers changed from: package-private */
    public String formatDateWithFullFormat(Date date, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }

    public String offsetFromTimeInterval(long j) {
        boolean z;
        long j2;
        if (j < 0) {
            j2 = 0 - j;
            z = true;
        } else {
            j2 = j;
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j2);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j2 - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j2 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        long millis = timeUnit.toMillis(((j2 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds));
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = z ? "-" : "";
        objArr[1] = Long.valueOf(hours);
        objArr[2] = Long.valueOf(minutes);
        objArr[3] = Long.valueOf(seconds);
        objArr[4] = Long.valueOf(millis);
        return String.format(locale, "%s%02d:%02d:%02d.%03d", objArr);
    }

    public String currentTimestamp() {
        return formatDateWithFullFormat(new Date(), TimeZone.getDefault());
    }
}
