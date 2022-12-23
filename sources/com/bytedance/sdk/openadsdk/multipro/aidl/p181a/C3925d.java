package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.d */
/* compiled from: CommonPermissionListenerManagerImpl */
public class C3925d extends C3922a {

    /* renamed from: a */
    private static HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f10123a = new HashMap<>();

    /* renamed from: b */
    private static volatile C3925d f10124b;

    /* renamed from: a */
    public static C3925d m12878a() {
        if (f10124b == null) {
            synchronized (C3925d.class) {
                if (f10124b == null) {
                    f10124b = new C3925d();
                }
            }
        }
        return f10124b;
    }

    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener != null) {
            C2975l.m8384b("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonPermissionListener);
            f10123a.put(str, remoteCallbackList);
        }
    }

    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        C2975l.m8384b("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + String.valueOf(str) + ", " + str2);
        RemoteCallbackList remove = f10123a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remove.getBroadcastItem(i);
                if (iCommonPermissionListener != null) {
                    C2975l.m8384b("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + String.valueOf(str) + ", " + str2);
                    if (str2 == null) {
                        iCommonPermissionListener.onGranted();
                    } else {
                        iCommonPermissionListener.onDenied(str2);
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
