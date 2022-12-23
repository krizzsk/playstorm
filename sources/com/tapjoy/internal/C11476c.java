package com.tapjoy.internal;

import android.app.Dialog;
import android.content.Context;

/* renamed from: com.tapjoy.internal.c */
public final class C11476c extends Dialog {

    /* renamed from: a */
    private boolean f27751a = false;

    public C11476c(Context context) {
        super(context, 16973835);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(17170445);
    }

    public final void show() {
        this.f27751a = false;
        super.show();
    }

    public final void cancel() {
        this.f27751a = true;
        super.cancel();
    }

    /* renamed from: a */
    public final void mo72266a() {
        getWindow().setLayout(-1, -1);
    }
}
