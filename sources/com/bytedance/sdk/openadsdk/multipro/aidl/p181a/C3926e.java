package com.bytedance.sdk.openadsdk.multipro.aidl.p181a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.e */
/* compiled from: DislikeClosedListenerManagerImpl */
public class C3926e extends C3922a {

    /* renamed from: a */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f10125a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static volatile C3926e f10126b;

    /* renamed from: a */
    public static C3926e m12879a() {
        if (f10126b == null) {
            synchronized (C3926e.class) {
                if (f10126b == null) {
                    f10126b = new C3926e();
                }
            }
        }
        return f10126b;
    }

    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iDislikeClosedListener);
        f10125a.put(str, remoteCallbackList);
    }

    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            f10125a.remove(str);
        }
    }

    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        m12880a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12880a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (!(f10125a == null || (remoteCallbackList = f10125a.get(str)) == null)) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                    if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                        iDislikeClosedListener.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            C2975l.m8388c("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
        return;
    }
}
