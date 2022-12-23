package com.bytedance.sdk.openadsdk.multipro.aidl.p182b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.d */
/* compiled from: RewardVideoListenerImpl */
public class C3944d extends IRewardAdInteractionListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTRewardVideoAd.RewardAdInteractionListener f10149a;

    /* renamed from: b */
    private Handler f10150b = new Handler(Looper.getMainLooper());

    public C3944d(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f10149a = rewardAdInteractionListener;
    }

    /* renamed from: a */
    private void m12897a() {
        this.f10149a = null;
        this.f10150b = null;
    }

    /* renamed from: b */
    private Handler m12898b() {
        Handler handler = this.f10150b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10150b = handler2;
        return handler2;
    }

    public void onDestroy() throws RemoteException {
        m12897a();
    }

    public void onAdShow() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onAdShow();
                }
            }
        });
    }

    public void onAdVideoBarClick() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onAdVideoBarClick();
                }
            }
        });
    }

    public void onAdClose() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onAdClose();
                }
            }
        });
    }

    public void onVideoComplete() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onVideoComplete();
                }
            }
        });
    }

    public void onVideoError() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onVideoError();
                }
            }
        });
    }

    public void onSkippedVideo() throws RemoteException {
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onSkippedVideo();
                }
            }
        });
    }

    public void onRewardVerify(boolean z, int i, String str, int i2, String str2) throws RemoteException {
        final boolean z2 = z;
        final int i3 = i;
        final String str3 = str;
        final int i4 = i2;
        final String str4 = str2;
        m12898b().post(new Runnable() {
            public void run() {
                if (C3944d.this.f10149a != null) {
                    C3944d.this.f10149a.onRewardVerify(z2, i3, str3, i4, str4);
                }
            }
        });
    }
}
