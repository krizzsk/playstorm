package com.bytedance.sdk.openadsdk.multipro.aidl.p182b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.c */
/* compiled from: FullScreenVideoListenerImpl */
public class C3938c extends IFullScreenVideoAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f10142a;

    /* renamed from: b */
    private Handler f10143b = new Handler(Looper.getMainLooper());

    public C3938c(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f10142a = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    private void m12894a() {
        this.f10142a = null;
        this.f10143b = null;
    }

    /* renamed from: b */
    private Handler m12895b() {
        Handler handler = this.f10143b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10143b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12894a();
    }

    public void onAdShow() throws RemoteException {
        m12895b().post(new Runnable() {
            public void run() {
                if (C3938c.this.f10142a != null) {
                    C3938c.this.f10142a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m12895b().post(new Runnable() {
            public void run() {
                if (C3938c.this.f10142a != null) {
                    C3938c.this.f10142a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m12895b().post(new Runnable() {
            public void run() {
                if (C3938c.this.f10142a != null) {
                    C3938c.this.f10142a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m12895b().post(new Runnable() {
            public void run() {
                if (C3938c.this.f10142a != null) {
                    C3938c.this.f10142a.onVideoComplete();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m12895b().post(new Runnable() {
            public void run() {
                if (C3938c.this.f10142a != null) {
                    C3938c.this.f10142a.onSkippedVideo();
                }
            }
        });
    }
}
