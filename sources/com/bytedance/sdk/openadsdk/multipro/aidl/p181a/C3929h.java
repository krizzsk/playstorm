package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.h */
/* compiled from: RewardAdVideoListenerManagerImpl */
public class C3929h extends C3922a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IRewardAdInteractionListener>> f10130a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3929h f10131b;

    /* renamed from: a */
    public static C3929h m12884a() {
        if (f10131b == null) {
            synchronized (C3929h.class) {
                if (f10131b == null) {
                    f10131b = new C3929h();
                }
            }
        }
        return f10131b;
    }

    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iRewardAdInteractionListener);
        f10130a.put(str, remoteCallbackList);
    }

    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        m12885a(str, str2, z, i, str3, i2, str4);
    }

    /* renamed from: a */
    private synchronized void m12885a(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        RemoteCallbackList remoteCallbackList;
        String str5 = str;
        String str6 = str2;
        synchronized (this) {
            try {
                if (f10130a != null) {
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList = f10130a.remove(str);
                    } else {
                        remoteCallbackList = f10130a.get(str);
                    }
                    RemoteCallbackList remoteCallbackList2 = remoteCallbackList;
                    if (remoteCallbackList2 != null) {
                        int beginBroadcast = remoteCallbackList2.beginBroadcast();
                        for (int i3 = 0; i3 < beginBroadcast; i3++) {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackList2.getBroadcastItem(i3);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onVideoComplete".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoComplete();
                                } else if ("onVideoError".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoError();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("onSkippedVideo".equals(str2)) {
                                    iRewardAdInteractionListener.onSkippedVideo();
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        }
                        remoteCallbackList2.finishBroadcast();
                        if ("recycleRes".equals(str2)) {
                            remoteCallbackList2.kill();
                        }
                    }
                }
            } catch (Throwable th) {
                C2975l.m8388c("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th);
            }
        }
        return;
    }
}
