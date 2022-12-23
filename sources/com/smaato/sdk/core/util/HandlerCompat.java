package com.smaato.sdk.core.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public abstract class HandlerCompat {
    private HandlerCompat() {
    }

    public static Handler create(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
