package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3923b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3924c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3925d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3926e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3927f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3928g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3929h;

public class BinderPoolService extends Service {

    /* renamed from: a */
    private Binder f10106a = new C3916a();

    public void onCreate() {
        super.onCreate();
        C2975l.m8384b("MultiProcess", "BinderPoolService has been created ! ");
    }

    public IBinder onBind(Intent intent) {
        C2975l.m8384b("MultiProcess", "BinderPoolService onBind ! ");
        return this.f10106a;
    }

    public void onDestroy() {
        super.onDestroy();
        C2975l.m8384b("MultiProcess", "BinderPoolService is destroy ! ");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService$a */
    public static class C3916a extends IBinderPool.Stub {
        public IBinder queryBinder(int i) throws RemoteException {
            C2975l.m8387c("MultiProcess", "queryBinder...........binderCode=" + i);
            if (i == 0) {
                return C3929h.m12884a();
            }
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
    }
}
