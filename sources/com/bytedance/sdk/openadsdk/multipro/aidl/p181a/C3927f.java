package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.f */
/* compiled from: FullScreenVideoListenerManagerImpl */
public class C3927f extends C3922a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> f10127a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3927f f10128b;

    /* renamed from: a */
    public static C3927f m12881a() {
        if (f10128b == null) {
            synchronized (C3927f.class) {
                if (f10128b == null) {
                    f10128b = new C3927f();
                }
            }
        }
        return f10128b;
    }

    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        f10127a.put(str, remoteCallbackList);
    }

    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        m12882a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12882a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f10127a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f10127a.remove(str);
                } else {
                    remoteCallbackList = f10127a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iFullScreenVideoAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdClose();
                            } else if ("onVideoComplete".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onVideoComplete();
                            } else if ("onSkippedVideo".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onSkippedVideo();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onDestroy();
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
            C2975l.m8388c("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
