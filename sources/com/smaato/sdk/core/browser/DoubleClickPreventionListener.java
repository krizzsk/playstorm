package com.smaato.sdk.core.browser;

import android.view.View;

public abstract class DoubleClickPreventionListener implements View.OnClickListener {
    private long lastClickTimestamp;

    /* access modifiers changed from: protected */
    public void processClick() {
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTimestamp >= 1000) {
            this.lastClickTimestamp = currentTimeMillis;
            processClick();
        }
    }
}
