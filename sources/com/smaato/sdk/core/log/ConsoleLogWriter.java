package com.smaato.sdk.core.log;

import android.os.Build;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.smaato.sdk.core.util.Objects;

class ConsoleLogWriter extends LogWriter {
    ConsoleLogWriter(LogLevel logLevel) {
        super(logLevel);
    }

    /* access modifiers changed from: protected */
    public void log(LogLevel logLevel, String str, String str2) {
        int min;
        Objects.requireNonNull(logLevel);
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        String shrinkTagIfNeeded = shrinkTagIfNeeded(str);
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(10, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i + TTAdSdk.INIT_LOCAL_FAIL_CODE);
                Log.println(mapToAndroidLogLevel(logLevel), shrinkTagIfNeeded, str2.substring(i, min));
                if (min >= indexOf) {
                    break;
                }
                i = min;
            }
            i = min + 1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean isLoggable(LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        return logLevel.ordinal() >= getLogLevel().ordinal();
    }

    /* renamed from: com.smaato.sdk.core.log.ConsoleLogWriter$1 */
    static /* synthetic */ class C110221 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$log$LogLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.core.log.LogLevel[] r0 = com.smaato.sdk.core.log.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$log$LogLevel = r0
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$log$LogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.log.LogLevel r1 = com.smaato.sdk.core.log.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.log.ConsoleLogWriter.C110221.<clinit>():void");
        }
    }

    private int mapToAndroidLogLevel(LogLevel logLevel) {
        int i = C110221.$SwitchMap$com$smaato$sdk$core$log$LogLevel[logLevel.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 6;
        }
        throw new IllegalArgumentException("Unknown level: " + logLevel);
    }

    private String shrinkTagIfNeeded(String str) {
        Objects.requireNonNull(str);
        return (Build.VERSION.SDK_INT >= 24 || str.length() <= 23) ? str : str.substring(0, 23);
    }
}
