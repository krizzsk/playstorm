package com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b;

import android.content.Context;
import android.os.Build;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.c */
/* compiled from: VideoFileManager */
public class C2407c {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C2405b> f5084a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static synchronized void m5841a(Context context, C2522c cVar, C2531a.C2532a aVar) {
        synchronized (C2407c.class) {
            if (cVar == null) {
                C2536c.m6432a(" url、dir and hash is must property   in VideoInfoModel");
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C2405b bVar = f5084a.get(cVar.mo16399k());
                if (bVar == null) {
                    bVar = new C2405b(context, cVar);
                    f5084a.put(cVar.mo16399k(), bVar);
                    C2536c.m6438b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo16380b()), cVar.mo16399k());
                }
                bVar.mo16084a(aVar);
            }
            C2536c.m6438b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo16380b()), cVar.mo16399k());
        }
    }

    /* renamed from: a */
    public static synchronized void m5842a(C2522c cVar) {
        synchronized (C2407c.class) {
            if (Build.VERSION.SDK_INT >= 23) {
                C2405b remove = f5084a.remove(cVar.mo16399k());
                if (remove != null) {
                    remove.mo16085a(true);
                }
                C2536c.m6438b("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(cVar.mo16380b()), cVar.mo16399k());
            }
        }
    }
}
