package com.mbridge.msdk.video.signal.p369a;

import android.app.Activity;
import com.mbridge.msdk.video.p346bt.module.MBridgeBTContainer;

/* renamed from: com.mbridge.msdk.video.signal.a.i */
/* compiled from: JSBTModule */
public final class C9424i extends C9415b {

    /* renamed from: a */
    private Activity f23034a;

    /* renamed from: b */
    private MBridgeBTContainer f23035b;

    public C9424i(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f23034a = activity;
        this.f23035b = mBridgeBTContainer;
    }

    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23035b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23035b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.handlerH5Exception(i, str);
        }
    }

    public final void click(int i, String str) {
        super.click(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23035b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.click(i, str);
        }
    }
}
