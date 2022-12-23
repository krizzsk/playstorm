package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2411b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2954f;
import com.bytedance.sdk.component.p125f.C2955g;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f */
/* compiled from: ProxyServer */
public class C2455f {

    /* renamed from: d */
    private static volatile C2455f f5206d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile ServerSocket f5207a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile int f5208b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicInteger f5209c = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile C2427c f5210e;

    /* renamed from: f */
    private volatile C2413c f5211f;

    /* renamed from: g */
    private volatile C2411b f5212g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<Set<C2465g>> f5213h = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2465g.C2470c f5214i = new C2465g.C2470c() {
        /* renamed from: a */
        public void mo16185a(C2465g gVar) {
            synchronized (C2455f.this.f5213h) {
                Set set = (Set) C2455f.this.f5213h.get(gVar.mo16094f());
                if (set != null) {
                    set.add(gVar);
                }
            }
        }

        /* renamed from: b */
        public void mo16186b(C2465g gVar) {
            if (C2446e.f5187c) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + gVar);
            }
            int f = gVar.mo16094f();
            synchronized (C2455f.this.f5213h) {
                Set set = (Set) C2455f.this.f5213h.get(f);
                if (set != null) {
                    set.remove(gVar);
                }
            }
        }
    };

    /* renamed from: j */
    private volatile C2431c f5215j;

    /* renamed from: k */
    private volatile C2431c f5216k;

    /* renamed from: l */
    private final Runnable f5217l = new Runnable() {
        public void run() {
            try {
                int i = 0;
                ServerSocket unused = C2455f.this.f5207a = new ServerSocket(0, 50, InetAddress.getByName(C2455f.this.m5979i()));
                C2455f fVar = C2455f.this;
                int unused2 = fVar.f5208b = fVar.f5207a.getLocalPort();
                if (C2455f.this.f5208b == -1) {
                    C2455f.m5967b("socket not bound", "");
                    C2455f.this.m5971e();
                    return;
                }
                C2478j.m6037a(C2455f.this.m5979i(), C2455f.this.f5208b);
                if (C2455f.this.m5975g()) {
                    C2536c.m6438b("ProxyServer", "run:  state = ", C2455f.this.f5209c);
                    if (C2455f.this.f5209c.compareAndSet(0, 1)) {
                        C2536c.m6438b("ProxyServer", "run:  state = ", C2455f.this.f5209c);
                        if (C2446e.f5187c) {
                            C2536c.m6436b("ProxyServer", "proxy server start!");
                        }
                        while (C2455f.this.f5209c.get() == 1) {
                            try {
                                Socket accept = C2455f.this.f5207a.accept();
                                C2427c h = C2455f.this.f5210e;
                                if (h != null) {
                                    final C2465g a = new C2465g.C2468a().mo16198a(h).mo16200a(accept).mo16199a(C2455f.this.f5214i).mo16201a();
                                    C2952e.m8304a().execute(new C2955g("ProxyTask", 10) {
                                        public void run() {
                                            a.run();
                                        }
                                    });
                                } else {
                                    C2482a.m6060a(accept);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                C2455f.m5967b("accept error", Log.getStackTraceString(e));
                                i++;
                                if (i > 3) {
                                    break;
                                }
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                Log.e("ProxyServer", "proxy server crashed!  " + stackTraceString);
                                C2455f.m5967b("error", stackTraceString);
                            }
                        }
                        if (C2446e.f5187c) {
                            C2536c.m6436b("ProxyServer", "proxy server closed!");
                        }
                        C2455f.this.m5971e();
                    }
                }
            } catch (IOException e2) {
                if (C2446e.f5187c) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e2));
                }
                C2455f.m5967b("create ServerSocket error", Log.getStackTraceString(e2));
                C2455f.this.m5971e();
            }
        }
    };

    /* renamed from: m */
    private final AtomicBoolean f5218m = new AtomicBoolean();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m5967b(String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16181a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r1 = r3.f5213h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r2 = r3.f5213h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.bykv.vk.openvk.component.video.a.b.g r2 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f5093h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2455f.mo16181a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C2455f m5963a() {
        if (f5206d == null) {
            synchronized (C2455f.class) {
                if (f5206d == null) {
                    f5206d = new C2455f();
                }
            }
        }
        return f5206d;
    }

    private C2455f() {
        this.f5213h.put(0, new HashSet());
        this.f5213h.put(1, new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2431c mo16182b() {
        return this.f5215j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2431c mo16183c() {
        return this.f5216k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16180a(C2427c cVar) {
        this.f5210e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16179a(C2413c cVar) {
        this.f5211f = cVar;
    }

    /* renamed from: a */
    public String mo16178a(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        String str3;
        if (strArr == null || strArr.length == 0) {
            m5967b("url", "url is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            m5967b(SDKConstants.PARAM_KEY, "key is empty");
            return strArr[0];
        } else if (this.f5210e == null) {
            m5967b(UserDataStore.DATE_OF_BIRTH, "VideoProxyDB is null");
            return strArr[0];
        } else {
            if ((z ? this.f5212g : this.f5211f) == null) {
                m5967b("cache", "Cache is null");
                return strArr[0];
            }
            int i = this.f5209c.get();
            if (i != 1) {
                m5967b("state", "ProxyServer is not running, " + i);
                return strArr[0];
            }
            List<String> a = C2482a.m6054a(strArr);
            if (a == null) {
                m5967b("url", "url not start with http/https");
                return strArr[0];
            }
            if (z2) {
                str2 = str;
            } else {
                str2 = C2535b.m6426a(str);
            }
            String a2 = C2473i.m6032a(str, str2, a);
            if (a2 == null) {
                m5967b("url", "combine proxy url error");
                return strArr[0];
            }
            if (z) {
                str3 = "https://" + m5979i() + CertificateUtil.DELIMITER + this.f5208b + "?f=" + 1 + "&" + a2;
            } else {
                str3 = "https://" + m5979i() + CertificateUtil.DELIMITER + this.f5208b + "?" + a2;
            }
            return str3.replaceFirst("s", "");
        }
    }

    /* renamed from: d */
    public void mo16184d() {
        if (this.f5218m.compareAndSet(false, true)) {
            Thread thread = new Thread(this.f5217l);
            thread.setName("tt_pangle_thread_proxy_server");
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5971e() {
        if (this.f5209c.compareAndSet(1, 2) || this.f5209c.compareAndSet(0, 2)) {
            C2482a.m6059a(this.f5207a);
            m5972f();
        }
    }

    /* renamed from: f */
    private void m5972f() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f5213h) {
            int size = this.f5213h.size();
            for (int i = 0; i < size; i++) {
                Set set = this.f5213h.get(this.f5213h.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2465g) it.next()).mo16087a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m5975g() {
        C2954f fVar = new C2954f(new C2459a(m5979i(), this.f5208b), 5, 1);
        C2952e.m8304a().submit(fVar);
        m5977h();
        try {
            if (!((Boolean) fVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                m5967b("ping error", "");
                m5971e();
                return false;
            }
            C2536c.m6436b("ProxyServer", "pingTest: ");
            if (C2446e.f5187c) {
                C2536c.m6436b("ProxyServer", "Ping OK!");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            m5967b("ping error", Log.getStackTraceString(th));
            m5971e();
            return false;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f$a */
    /* compiled from: ProxyServer */
    private static final class C2459a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f5223a;

        /* renamed from: b */
        private final int f5224b;

        C2459a(String str, int i) {
            this.f5223a = str;
            this.f5224b = i;
        }

        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                C2536c.m6436b("ProxyServer", "call: ");
                socket = new Socket(this.f5223a, this.f5224b);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C2482a.f5286a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        C2482a.m6060a(socket);
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        C2536c.m6436b("ProxyServer", "call: " + th.getMessage());
                        C2455f.m5967b("ping error", Log.getStackTraceString(th));
                        C2482a.m6060a(socket);
                        return false;
                    } catch (Throwable th3) {
                        C2482a.m6060a(socket);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                socket = null;
                th = th5;
                th.printStackTrace();
                C2536c.m6436b("ProxyServer", "call: " + th.getMessage());
                C2455f.m5967b("ping error", Log.getStackTraceString(th));
                C2482a.m6060a(socket);
                return false;
            }
            C2482a.m6060a(socket);
            return false;
        }
    }

    /* renamed from: h */
    private void m5977h() {
        Socket socket = null;
        try {
            socket = this.f5207a.accept();
            socket.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(C2482a.f5286a));
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            m5967b("ping error", Log.getStackTraceString(e));
        } catch (Throwable th) {
            C2482a.m6060a((Socket) null);
            throw th;
        }
        C2482a.m6060a(socket);
        C2536c.m6436b("ProxyServer", "answerPing: ");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m5979i() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
