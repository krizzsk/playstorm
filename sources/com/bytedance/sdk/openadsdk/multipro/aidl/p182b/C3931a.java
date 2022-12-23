package com.bytedance.sdk.openadsdk.multipro.aidl.p182b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.a */
/* compiled from: AppOpenAdListenerImpl */
public class C3931a extends IAppOpenAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAppOpenAd.AppOpenAdInteractionListener f10132a;

    /* renamed from: b */
    private Handler f10133b = new Handler(Looper.getMainLooper());

    public C3931a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f10132a = appOpenAdInteractionListener;
    }

    /* renamed from: a */
    private void m12888a() {
        this.f10132a = null;
        this.f10133b = null;
    }

    /* renamed from: b */
    private Handler m12889b() {
        Handler handler = this.f10133b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10133b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12888a();
    }

    public void onAdShow() throws RemoteException {
        m12889b().post(new Runnable() {
            public void run() {
                if (C3931a.this.f10132a != null) {
                    C3931a.this.f10132a.onAdShow();
                }
            }
        });
    }

    public void onAdClicked() throws RemoteException {
        m12889b().post(new Runnable() {
            public void run() {
                if (C3931a.this.f10132a != null) {
                    C3931a.this.f10132a.onAdClicked();
                }
            }
        });
    }

    public void onAdSkip() throws RemoteException {
        m12889b().post(new Runnable() {
            public void run() {
                if (C3931a.this.f10132a != null) {
                    C3931a.this.f10132a.onAdSkip();
                }
            }
        });
    }

    public void onAdTimeOver() throws RemoteException {
        m12889b().post(new Runnable() {
            public void run() {
                if (C3931a.this.f10132a != null) {
                    C3931a.this.f10132a.onAdCountdownToZero();
                }
            }
        });
    }
}
