package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.h */
/* compiled from: WindVanePlugin */
public abstract class C8825h {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public Context f21468a;

    /* renamed from: b */
    protected Object f21469b;

    /* renamed from: c */
    protected WindVaneWebView f21470c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f21468a = context;
        this.f21470c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f21469b = obj;
        this.f21470c = windVaneWebView;
    }
}
