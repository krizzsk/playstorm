package com.bytedance.sdk.openadsdk.multipro.aidl.p182b;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3445a;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.b.b */
/* compiled from: DislikeClosedListenerImpl */
public class C3936b extends IDislikeClosedListener.Stub {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3445a.C3452a f10138a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f10139b;

    /* renamed from: c */
    private Handler f10140c = new Handler(Looper.getMainLooper());

    public C3936b(String str, C3445a.C3452a aVar) {
        this.f10139b = str;
        this.f10138a = aVar;
    }

    /* renamed from: a */
    private Handler m12890a() {
        Handler handler = this.f10140c;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f10140c = handler2;
        return handler2;
    }

    public void onItemClickClosed() throws RemoteException {
        m12890a().post(new Runnable() {
            public void run() {
                if (C3936b.this.f10138a != null) {
                    C3936b.this.f10138a.mo19451a();
                    TTDislikeListView.m12412a(6, C3936b.this.f10139b);
                }
            }
        });
    }
}
