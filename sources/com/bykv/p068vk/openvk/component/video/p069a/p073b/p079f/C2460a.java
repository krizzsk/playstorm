package com.bykv.p068vk.openvk.component.video.p069a.p073b.p079f;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2455f;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.component.utils.C2975l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a */
/* compiled from: VideoCachePreloader */
public class C2460a {

    /* renamed from: a */
    public static final boolean f5225a = C2536c.m6439b();

    /* renamed from: b */
    private HashMap<String, Boolean> f5226b;

    /* renamed from: c */
    private C2462a f5227c;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$b */
    /* compiled from: VideoCachePreloader */
    private static class C2464b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2460a f5240a = new C2460a();
    }

    private C2460a() {
        this.f5226b = new HashMap<>();
        mo16193b();
    }

    /* renamed from: a */
    public static C2460a m5990a() {
        return C2464b.f5240a;
    }

    /* renamed from: b */
    public boolean mo16193b() {
        if (this.f5227c != null) {
            return true;
        }
        C2413c c = m5991c();
        if (c == null) {
            return false;
        }
        C2446e.m5932a(true);
        C2446e.m5934b(true);
        C2446e.m5930a(1);
        C2455f.m5963a().mo16184d();
        try {
            C2462a aVar = new C2462a();
            this.f5227c = aVar;
            aVar.setName("tt_pangle_thread_video_cache_preloader");
            this.f5227c.start();
            C2446e.m5931a(c, C2518b.m6270a());
            C2436d.m5913c().mo16146a(30000, 30000, 30000);
            C2436d.m5913c().mo16145a(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo16191a(C2522c cVar) {
        if (!mo16193b()) {
            return false;
        }
        this.f5227c.mo16194a(cVar);
        return true;
    }

    /* renamed from: b */
    public String mo16192b(C2522c cVar) {
        if (cVar == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(cVar.mo16399k());
        return C2455f.m5963a().mo16178a(false, z, z ? cVar.mo16399k() : cVar.mo16398j(), cVar.mo16398j());
    }

    /* renamed from: c */
    private static C2413c m5991c() {
        File file = new File(C2518b.m6270a().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        C2413c cVar = null;
        try {
            C2413c cVar2 = new C2413c(file);
            try {
                cVar2.mo16106a(104857600);
                return cVar2;
            } catch (IOException e) {
                e = e;
                cVar = cVar2;
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a */
    /* compiled from: VideoCachePreloader */
    class C2462a extends Thread {

        /* renamed from: b */
        private Queue<C2463a> f5229b = new LinkedBlockingQueue();

        /* renamed from: c */
        private boolean f5230c = true;

        /* renamed from: d */
        private final Queue<C2463a> f5231d = new ArrayBlockingQueue(10);

        /* renamed from: e */
        private Queue<C2463a> f5232e = new LinkedBlockingQueue();

        /* renamed from: a */
        private void m5996a() {
        }

        /* renamed from: b */
        private void m5998b() {
        }

        public C2462a() {
        }

        /* renamed from: a */
        private C2463a m5995a(int i, C2522c cVar) {
            m5998b();
            C2975l.m8384b("VideoCachePreloader", "pool: " + this.f5231d.size());
            C2463a poll = this.f5231d.poll();
            if (poll == null) {
                poll = new C2463a();
            }
            poll.f5233a = i;
            poll.f5238f = cVar;
            return poll;
        }

        /* renamed from: a */
        private void m5997a(C2463a aVar) {
            m5996a();
            aVar.f5235c = null;
            aVar.f5234b = null;
            aVar.f5233a = -1;
            aVar.f5238f = null;
            this.f5231d.offer(aVar);
        }

        /* renamed from: b */
        private synchronized void m5999b(C2463a aVar) {
            m5998b();
            this.f5232e.add(aVar);
            notify();
        }

        /* renamed from: c */
        private void m6001c(C2463a aVar) {
            m5996a();
            if (aVar != null) {
                this.f5229b.offer(aVar);
                notify();
            }
        }

        public void run() {
            while (this.f5230c) {
                synchronized (this) {
                    if (!this.f5232e.isEmpty()) {
                        m6000c();
                    }
                    while (!this.f5229b.isEmpty()) {
                        C2463a poll = this.f5229b.poll();
                        if (poll != null) {
                            int i = poll.f5233a;
                            if (i != 0) {
                                if (i == 1) {
                                    C2436d.m5913c().mo16149a(poll.f5234b);
                                } else if (i == 2) {
                                    C2436d.m5913c().mo16155d();
                                } else if (i == 3) {
                                    C2436d.m5913c().mo16155d();
                                    if (C2446e.m5935c() != null) {
                                        C2446e.m5935c().mo16101a();
                                    }
                                    if (C2446e.m5933b() != null) {
                                        C2446e.m5933b().mo16105a();
                                    }
                                } else if (i == 4) {
                                    C2436d.m5913c().mo16155d();
                                    this.f5230c = false;
                                }
                            } else if (poll.f5235c != null && poll.f5235c.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : poll.f5235c) {
                                    if (C2482a.m6061a(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                C2436d.m5913c().mo16152a(false, !TextUtils.isEmpty(poll.f5237e), poll.f5236d, poll.f5234b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            m5997a(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* renamed from: c */
        private void m6000c() {
            m5996a();
            while (true) {
                C2463a poll = this.f5232e.poll();
                if (poll != null) {
                    poll.f5234b = poll.f5238f.mo16398j();
                    poll.f5235c = new String[]{poll.f5238f.mo16398j()};
                    poll.f5236d = poll.f5238f.mo16380b();
                    poll.f5237e = poll.f5238f.mo16399k();
                    if (!TextUtils.isEmpty(poll.f5238f.mo16399k())) {
                        poll.f5234b = poll.f5238f.mo16399k();
                    }
                    poll.f5238f = null;
                    m6001c(poll);
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo16194a(C2522c cVar) {
            m5999b(m5995a(0, cVar));
        }

        /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a$a */
        /* compiled from: VideoCachePreloader */
        private class C2463a {

            /* renamed from: a */
            public int f5233a;

            /* renamed from: b */
            public String f5234b;

            /* renamed from: c */
            public String[] f5235c;

            /* renamed from: d */
            public int f5236d;

            /* renamed from: e */
            public String f5237e;

            /* renamed from: f */
            public C2522c f5238f;

            public C2463a() {
            }
        }
    }
}
