package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.b */
/* compiled from: AppOpenAdListenerManagerImpl */
public class C3923b extends C3922a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f10119a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3923b f10120b;

    /* renamed from: a */
    public static C3923b m12875a() {
        if (f10120b == null) {
            synchronized (C3923b.class) {
                if (f10120b == null) {
                    f10120b = new C3923b();
                }
            }
        }
        return f10120b;
    }

    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f10119a.put(str, remoteCallbackList);
    }

    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        m12876a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12876a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f10119a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f10119a.remove(str);
                } else {
                    remoteCallbackList = f10119a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iAppOpenAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdTimeOver();
                            } else if ("recycleRes".equals(str2)) {
                                iAppOpenAdInteractionListener.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            C2975l.m8388c("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
