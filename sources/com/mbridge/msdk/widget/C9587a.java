package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.mbridge.msdk.widget.a */
/* compiled from: MBridgeNoDoubleClick */
public abstract class C9587a implements View.OnClickListener {

    /* renamed from: a */
    private long f23584a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58122a(View view);

    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f23584a > 2000) {
            this.f23584a = timeInMillis;
            mo58122a(view);
        }
    }
}
