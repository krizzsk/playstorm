package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3923b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3924c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3925d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3926e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3927f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3928g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3929h;
import com.bytedance.sdk.openadsdk.utils.C4014u;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a */
/* compiled from: BinderPool */
public class C3917a {

    /* renamed from: c */
    private static C3917a f10107c = new C3917a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C3930b f10108d;

    /* renamed from: a */
    private Context f10109a = C3578m.m11231a().getApplicationContext();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public IBinderPool f10110b;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f10111e = 0;

    /* renamed from: f */
    private ServiceConnection f10112f = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            C2975l.m8387c("MultiProcess", "BinderPool......onServiceDisconnected");
        }

        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C2952e.m8308a(new C2955g("onServiceConnected") {
                public void run() {
                    IBinderPool unused = C3917a.this.f10110b = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        C3917a.this.f10110b.asBinder().linkToDeath(C3917a.this.f10113g, 0);
                    } catch (RemoteException e) {
                        C2975l.m8388c("MultiProcess", "onServiceConnected throws :", e);
                    }
                    C2975l.m8384b("MultiProcess", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - C3917a.this.f10111e));
                    if (C3917a.f10108d != null) {
                        C3917a.f10108d.mo18248a();
                    }
                }
            }, 5);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IBinder.DeathRecipient f10113g = new IBinder.DeathRecipient() {
        public void binderDied() {
            C2952e.m8308a(new C2955g("binderDied") {
                public void run() {
                    C2975l.m8390d("MultiProcess", "binder died.");
                    C3917a.this.f10110b.asBinder().unlinkToDeath(C3917a.this.f10113g, 0);
                    IBinderPool unused = C3917a.this.f10110b = null;
                    C3917a.this.m12871c();
                }
            }, 5);
        }
    };

    private C3917a() {
        m12871c();
    }

    /* renamed from: a */
    public static C3917a m12866a(Context context) {
        return f10107c;
    }

    /* renamed from: a */
    public void mo20812a() {
        this.f10109a.bindService(new Intent(this.f10109a, BinderPoolService.class), this.f10112f, 1);
        this.f10111e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m12867a(C3930b bVar) {
        f10108d = bVar;
    }

    /* renamed from: a */
    public IBinder mo20811a(int i) {
        try {
            if (C3953b.m12901c()) {
                try {
                    if (this.f10110b != null) {
                        return this.f10110b.queryBinder(i);
                    }
                    return null;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    C4014u.m13249l("queryBinder error");
                    return null;
                }
            } else if (i == 0) {
                return C3929h.m12884a();
            } else {
                if (i == 1) {
                    return C3927f.m12881a();
                }
                if (i == 2) {
                    return C3924c.m12877a();
                }
                if (i == 4) {
                    return C3925d.m12878a();
                }
                if (i == 5) {
                    return C3928g.m12883a();
                }
                if (i == 6) {
                    return C3926e.m12879a();
                }
                if (i != 7) {
                    return null;
                }
                return C3923b.m12875a();
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12871c() {
        if (C3953b.m12901c()) {
            C2975l.m8387c("MultiProcess", "BinderPool......connectBinderPoolService");
            mo20812a();
        }
    }
}
