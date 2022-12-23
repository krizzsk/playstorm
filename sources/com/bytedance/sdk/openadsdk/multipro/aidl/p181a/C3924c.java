package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.c */
/* compiled from: CommonDialogListenerManagerImpl */
public class C3924c extends C3922a {

    /* renamed from: a */
    public static HashMap<String, RemoteCallbackList<ICommonDialogListener>> f10121a = new HashMap<>();

    /* renamed from: b */
    private static volatile C3924c f10122b;

    /* renamed from: a */
    public static C3924c m12877a() {
        if (f10122b == null) {
            synchronized (C3924c.class) {
                if (f10122b == null) {
                    f10122b = new C3924c();
                }
            }
        }
        return f10122b;
    }

    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        if (iCommonDialogListener != null) {
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonDialogListener);
            f10121a.put(str, remoteCallbackList);
        }
    }

    public void broadcastDialogListener(String str, int i) throws RemoteException {
        RemoteCallbackList remove = f10121a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                ICommonDialogListener iCommonDialogListener = (ICommonDialogListener) remove.getBroadcastItem(i2);
                if (iCommonDialogListener != null) {
                    if (i == 1) {
                        iCommonDialogListener.onDialogBtnYes();
                    } else if (i == 2) {
                        iCommonDialogListener.onDialogBtnNo();
                    } else if (i != 3) {
                        iCommonDialogListener.onDialogCancel();
                    } else {
                        iCommonDialogListener.onDialogCancel();
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
