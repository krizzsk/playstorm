package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.util.Log;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2471h;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2410a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2425a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2433b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2434c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2435d;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.g */
/* compiled from: ProxyTask */
class C2465g extends C2408a {

    /* renamed from: m */
    private final Socket f5241m;

    /* renamed from: n */
    private final C2470c f5242n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2436d f5243o;

    /* renamed from: p */
    private volatile C2422b f5244p;

    /* renamed from: q */
    private volatile boolean f5245q = true;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$c */
    /* compiled from: ProxyTask */
    public interface C2470c {
        /* renamed from: a */
        void mo16185a(C2465g gVar);

        /* renamed from: b */
        void mo16186b(C2465g gVar);
    }

    /* renamed from: a */
    private void m6007a(boolean z, int i, int i2, int i3, int i4) {
    }

    C2465g(C2468a aVar) {
        super(aVar.f5249a, aVar.f5250b);
        this.f5241m = aVar.f5251c;
        this.f5242n = aVar.f5252d;
        this.f5243o = C2436d.m5913c();
    }

    /* renamed from: h */
    private C2469b m6013h() {
        try {
            this.f5094i = C2473i.m6031a(this.f5241m.getInputStream());
            OutputStream outputStream = this.f5241m.getOutputStream();
            C2410a aVar = this.f5094i.f5259c.f5260a == 1 ? C2446e.f5185a : C2446e.f5186b;
            if (aVar == null) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.f5086a = aVar;
            this.f5092g = this.f5094i.f5259c.f5261b;
            this.f5093h = this.f5094i.f5259c.f5262c;
            this.f5095j = new C2480l(this.f5094i.f5259c.f5266g);
            this.f5091f = this.f5094i.f5258b;
            if (C2446e.f5187c) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f5094i.toString());
            }
            return new C2469b(outputStream, this.f5094i.f5259c.f5263d);
        } catch (IOException e) {
            C2482a.m6060a(this.f5241m);
            if (C2446e.f5187c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
            mo16089a(this.f5086a == null ? null : Boolean.valueOf(mo16095g()), this.f5092g, e);
            return null;
        } catch (C2473i.C2477d e2) {
            C2482a.m6060a(this.f5241m);
            if (C2446e.f5187c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            mo16089a(this.f5086a == null ? null : Boolean.valueOf(mo16095g()), this.f5092g, e2);
            return null;
        }
    }

    public void run() {
        C2425a a;
        C2469b h = m6013h();
        if (h != null) {
            C2470c cVar = this.f5242n;
            if (cVar != null) {
                cVar.mo16185a(this);
            }
            this.f5086a.mo16097a(this.f5093h);
            if (C2446e.f5192h != 0 && ((a = this.f5087b.mo16135a(this.f5093h, this.f5094i.f5259c.f5260a)) == null || this.f5086a.mo16099c(this.f5093h).length() < ((long) a.f5141c))) {
                this.f5243o.mo16150a(mo16095g(), this.f5093h);
            }
            try {
                m6008a(h);
            } catch (C2432a e) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
                }
            } catch (Throwable th) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
                }
            }
            this.f5086a.mo16098b(this.f5093h);
            this.f5243o.mo16150a(mo16095g(), (String) null);
            mo16087a();
            C2482a.m6060a(this.f5241m);
            C2470c cVar2 = this.f5242n;
            if (cVar2 != null) {
                cVar2.mo16186b(this);
            }
        }
    }

    /* renamed from: a */
    private boolean m6008a(C2469b bVar) throws C2432a {
        while (this.f5095j.mo16216a()) {
            mo16093e();
            C2480l.C2481a b = this.f5095j.mo16217b();
            try {
                m6006a(bVar, b);
                return true;
            } catch (C2434c e) {
                b.mo16218a();
                mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo16219b();
                }
                if (!mo16090b()) {
                    mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e2);
                } else if (C2446e.f5187c) {
                    if ("Canceled".equalsIgnoreCase(e2.getMessage())) {
                        Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                    } else {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                    }
                }
            } catch (C2435d e3) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                }
                return true;
            } catch (C2471h.C2472a e4) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                }
                this.f5245q = false;
                mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e4);
            } catch (C2433b e5) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
                return false;
            } catch (Exception e6) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e6));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m6006a(C2469b bVar, C2480l.C2481a aVar) throws C2435d, IOException, C2471h.C2472a, C2432a, C2433b {
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(this.f5094i.f5257a.f5269a)) {
            m6010b(bVar, aVar);
        } else {
            m6011c(bVar, aVar);
        }
    }

    /* renamed from: b */
    private void m6010b(C2469b bVar, C2480l.C2481a aVar) throws IOException, C2435d {
        byte[] a = m6009a(this.f5087b.mo16135a(this.f5093h, this.f5094i.f5259c.f5260a), bVar, aVar);
        if (a != null) {
            bVar.mo16202a(a, 0, a.length);
        }
    }

    /* renamed from: c */
    private void m6011c(C2469b bVar, C2480l.C2481a aVar) throws C2471h.C2472a, C2435d, IOException, C2432a, C2433b {
        int i;
        if (this.f5245q) {
            File c = this.f5086a.mo16099c(this.f5093h);
            long length = c.length();
            C2425a a = this.f5087b.mo16135a(this.f5093h, this.f5094i.f5259c.f5260a);
            int b = bVar.mo16204b();
            long j = length - ((long) b);
            int i2 = (int) j;
            if (a == null) {
                i = -1;
            } else {
                i = a.f5141c;
            }
            if (length > ((long) bVar.mo16204b())) {
                if (C2446e.f5187c) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + j);
                }
                m6007a(true, i2, i, (int) length, b);
                m6005a(a, c, bVar, aVar);
                return;
            }
            m6007a(false, i2, i, (int) length, b);
        } else {
            m6007a(false, 0, 0, 0, bVar.mo16204b());
        }
        m6012d(bVar, aVar);
    }

    /* renamed from: a */
    private byte[] m6009a(C2425a aVar, C2469b bVar, C2480l.C2481a aVar2) throws IOException {
        if (aVar != null) {
            if (C2446e.f5187c) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return C2482a.m6049a(aVar, bVar.mo16204b()).getBytes(C2482a.f5286a);
        }
        C2448a a = mo16086a(aVar2, 0, -1, VersionInfo.GIT_BRANCH);
        if (a == null) {
            return null;
        }
        try {
            String a2 = C2482a.m6051a(a, false, false);
            if (a2 == null) {
                C2425a a3 = C2482a.m6047a(a, this.f5087b, this.f5093h, this.f5094i.f5259c.f5260a);
                if (C2446e.f5187c) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return C2482a.m6049a(a3, bVar.mo16204b()).getBytes(C2482a.f5286a);
            }
            throw new C2434c(a2 + ", rawKey: " + this.f5092g + ", url: " + aVar2);
        } finally {
            C2482a.m6056a((Closeable) a.mo16172d());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd A[SYNTHETIC, Splitter:B:92:0x01cd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6005a(com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2425a r8, java.io.File r9, com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g.C2469b r10, com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l.C2481a r11) throws java.io.IOException, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2435d, com.bykv.p068vk.openvk.component.video.p069a.p073b.C2471h.C2472a, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2433b {
        /*
            r7 = this;
            boolean r0 = r10.mo16203a()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            byte[] r0 = r7.m6009a(r8, r10, r11)
            r7.mo16093e()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r2 = r0.length
            r10.mo16202a(r0, r1, r2)
        L_0x0015:
            r0 = 0
            if (r8 != 0) goto L_0x0068
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f5087b
            java.lang.String r2 = r7.f5093h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f5094i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f5259c
            int r3 = r3.f5260a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo16135a((java.lang.String) r2, (int) r3)
            if (r8 != 0) goto L_0x0068
            boolean r8 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r8 == 0) goto L_0x0033
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info from db"
            android.util.Log.e(r8, r2)
        L_0x0033:
            r7.m6009a(r0, r10, r11)
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f5087b
            java.lang.String r2 = r7.f5093h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f5094i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f5259c
            int r3 = r3.f5260a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo16135a((java.lang.String) r2, (int) r3)
            if (r8 == 0) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "failed to get header, rawKey: "
            r9.append(r10)
            java.lang.String r10 = r7.f5092g
            r9.append(r10)
            java.lang.String r10 = ", url: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0068:
            long r2 = r9.length()
            int r4 = r8.f5141c
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e4
            com.bykv.vk.openvk.component.video.a.b.b r2 = r7.f5244p
            if (r2 == 0) goto L_0x0083
            boolean r3 = r2.mo16090b()
            if (r3 != 0) goto L_0x0083
            boolean r2 = r2.mo16092d()
            if (r2 == 0) goto L_0x00e4
        L_0x0083:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a
            r2.<init>()
            com.bykv.vk.openvk.component.video.a.b.a.a r3 = r7.f5086a
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16124a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2410a) r3)
            com.bykv.vk.openvk.component.video.a.b.b.c r3 = r7.f5087b
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16126a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c) r3)
            java.lang.String r3 = r7.f5092g
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16130a((java.lang.String) r3)
            java.lang.String r3 = r7.f5093h
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16133b(r3)
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l
            java.lang.String r4 = r11.f5283a
            r3.<init>((java.lang.String) r4)
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16128a((com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l) r3)
            java.util.List r3 = r7.f5091f
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16131a((java.util.List<com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i.C2475b>) r3)
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f5094i
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16127a((com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i) r3)
            com.bykv.vk.openvk.component.video.a.b.g$1 r3 = new com.bykv.vk.openvk.component.video.a.b.g$1
            r3.<init>()
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16125a((com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b.C2424b) r3)
            com.bykv.vk.openvk.component.video.a.b.b r2 = r2.mo16132a()
            r7.f5244p = r2
            com.bytedance.sdk.component.f.f r3 = new com.bytedance.sdk.component.f.f
            r4 = 10
            r5 = 1
            r3.<init>(r2, r0, r4, r5)
            com.bykv.vk.openvk.component.video.a.b.g$2 r2 = new com.bykv.vk.openvk.component.video.a.b.g$2
            java.lang.String r4 = "processCacheNetWorkConcurrent"
            r2.<init>(r4, r3)
            com.bytedance.sdk.component.p125f.C2952e.m8307a((com.bytedance.sdk.component.p125f.C2955g) r2)
            boolean r2 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r4 = "fire download in process cache task"
            android.util.Log.e(r2, r4)
            goto L_0x00e5
        L_0x00e4:
            r3 = r0
        L_0x00e5:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "r"
            r4.<init>(r9, r5)     // Catch:{ all -> 0x01c5 }
            int r9 = r10.mo16204b()     // Catch:{ all -> 0x01c2 }
            long r5 = (long) r9     // Catch:{ all -> 0x01c2 }
            r4.mo16208a((long) r5)     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f5094i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f5259c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f5264e     // Catch:{ all -> 0x01c2 }
            if (r9 <= 0) goto L_0x010d
            int r8 = r8.f5141c     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f5094i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f5259c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f5264e     // Catch:{ all -> 0x01c2 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x010d:
            int r8 = r8.f5141c     // Catch:{ all -> 0x01c2 }
        L_0x010f:
            int r9 = r10.mo16204b()     // Catch:{ all -> 0x01c2 }
            if (r9 >= r8) goto L_0x018b
            r7.mo16093e()     // Catch:{ all -> 0x01c2 }
            int r9 = r4.mo16206a((byte[]) r2)     // Catch:{ all -> 0x01c2 }
            if (r9 > 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.b r9 = r7.f5244p     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x0131
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = r9.mo16121i()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0130
            com.bykv.vk.openvk.component.video.a.b.h$a r0 = r9.mo16120h()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0130:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0131:
            if (r9 == 0) goto L_0x0158
            boolean r0 = r9.mo16090b()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r9.mo16092d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0158
        L_0x0140:
            r7.mo16093e()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r9.f5123m     // Catch:{ all -> 0x01c2 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Object r9 = r9.f5123m     // Catch:{ InterruptedException -> 0x0150 }
            r5 = 1000(0x3e8, double:4.94E-321)
            r9.wait(r5)     // Catch:{ InterruptedException -> 0x0150 }
            goto L_0x0154
        L_0x014e:
            r8 = move-exception
            goto L_0x0156
        L_0x0150:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x014e }
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0187
        L_0x0156:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0158:
            boolean r8 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01c2 }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r9 = "download task has finished!!!"
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0163:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r9.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = "illegal state download task has finished, rawKey: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = r7.f5092g     // Catch:{ all -> 0x01c2 }
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", url: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            r9.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c2 }
            r8.<init>(r9)     // Catch:{ all -> 0x01c2 }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0184:
            r10.mo16205b(r2, r1, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0187:
            r7.mo16093e()     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x018b:
            boolean r9 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r11.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "read cache file complete: "
            r11.append(r0)     // Catch:{ all -> 0x01c2 }
            int r10 = r10.mo16204b()     // Catch:{ all -> 0x01c2 }
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", "
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            r11.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.i(r9, r8)     // Catch:{ all -> 0x01c2 }
        L_0x01b1:
            r7.mo16091c()     // Catch:{ all -> 0x01c2 }
            r4.mo16207a()
            if (r3 == 0) goto L_0x01c1
            r3.get()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r8 = move-exception
            r8.printStackTrace()
        L_0x01c1:
            return
        L_0x01c2:
            r8 = move-exception
            r0 = r4
            goto L_0x01c6
        L_0x01c5:
            r8 = move-exception
        L_0x01c6:
            if (r0 == 0) goto L_0x01cb
            r0.mo16207a()
        L_0x01cb:
            if (r3 == 0) goto L_0x01d5
            r3.get()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r9 = move-exception
            r9.printStackTrace()
        L_0x01d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g.m6005a(com.bykv.vk.openvk.component.video.a.b.b.a, java.io.File, com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad A[EDGE_INSN: B:100:0x01ad->B:77:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015c A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b1 A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0208  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6012d(com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g.C2469b r13, com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l.C2481a r14) throws com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2435d, java.io.IOException, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2433b {
        /*
            r12 = this;
            r12.m6014i()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r13.mo16204b()
            com.bykv.vk.openvk.component.video.a.b.i r3 = r12.f5094i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f5259c
            int r3 = r3.f5264e
            java.lang.String r4 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r3 = r12.mo16086a(r14, r2, r3, r4)
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r4 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6051a(r3, r6, r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", rawKey: "
            if (r4 != 0) goto L_0x01dc
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f5087b     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r12.f5093h     // Catch:{ all -> 0x01fe }
            int r9 = r12.mo16094f()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo16135a((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x01fe }
            int r8 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6045a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a) r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.f5141c     // Catch:{ all -> 0x01fe }
            if (r10 == r8) goto L_0x00a4
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01fe }
            if (r13 == 0) goto L_0x0069
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r13.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "Content-Length not match, old: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r4.f5141c     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            r13.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", key: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f5093h     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.e(r9, r13)     // Catch:{ all -> 0x01fe }
        L_0x0069:
            com.bykv.vk.openvk.component.video.a.b.c.b r13 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "Content-Length not match, old length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            int r9 = r4.f5141c     // Catch:{ all -> 0x01fe }
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = ", new length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            r2.append(r8)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f5092g     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", currentUrl: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = ", previousInfo: "
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r4.f5143e     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x00a4:
            boolean r14 = r13.mo16203a()     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00bb
            java.lang.String r14 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6050a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a) r3, (int) r2)     // Catch:{ all -> 0x01fe }
            r12.mo16093e()     // Catch:{ all -> 0x01fe }
            java.nio.charset.Charset r2 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.f5286a     // Catch:{ all -> 0x01fe }
            byte[] r14 = r14.getBytes(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r14.length     // Catch:{ all -> 0x01fe }
            r13.mo16202a(r14, r6, r2)     // Catch:{ all -> 0x01fe }
        L_0x00bb:
            r12.mo16093e()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.a.a r14 = r12.f5086a     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f5093h     // Catch:{ all -> 0x01fe }
            java.io.File r14 = r14.mo16100d(r2)     // Catch:{ all -> 0x01fe }
            boolean r2 = r12.f5245q     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", from: "
            if (r2 == 0) goto L_0x0127
            if (r14 == 0) goto L_0x0127
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            int r2 = r13.mo16204b()     // Catch:{ all -> 0x01fe }
            long r10 = (long) r2     // Catch:{ all -> 0x01fe }
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0127
            com.bykv.vk.openvk.component.video.a.b.b.c r2 = r12.f5087b     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f5093h     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i r8 = r12.f5094i     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i$a r8 = r8.f5259c     // Catch:{ all -> 0x01fe }
            int r8 = r8.f5260a     // Catch:{ all -> 0x01fe }
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6047a(r3, r2, r7, r8)     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.h r2 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ a -> 0x00fa }
            java.lang.String r7 = "rwd"
            r2.<init>(r14, r7)     // Catch:{ a -> 0x00fa }
            int r7 = r13.mo16204b()     // Catch:{ a -> 0x00f8 }
            long r7 = (long) r7     // Catch:{ a -> 0x00f8 }
            r2.mo16208a((long) r7)     // Catch:{ a -> 0x00f8 }
            goto L_0x0100
        L_0x00f8:
            r7 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r7 = move-exception
            r2 = r5
        L_0x00fc:
            r7.printStackTrace()     // Catch:{ all -> 0x01d9 }
            r2 = r5
        L_0x0100:
            boolean r7 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x014e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r7.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "can write to cache file in network task, cache file size: "
            r7.append(r8)     // Catch:{ all -> 0x01d9 }
            long r10 = r14.length()     // Catch:{ all -> 0x01d9 }
            r7.append(r10)     // Catch:{ all -> 0x01d9 }
            r7.append(r4)     // Catch:{ all -> 0x01d9 }
            int r14 = r13.mo16204b()     // Catch:{ all -> 0x01d9 }
            r7.append(r14)     // Catch:{ all -> 0x01d9 }
            java.lang.String r14 = r7.toString()     // Catch:{ all -> 0x01d9 }
            android.util.Log.i(r9, r14)     // Catch:{ all -> 0x01d9 }
            goto L_0x014e
        L_0x0127:
            boolean r2 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x014d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = "can't write to cache file in network task, cache file size: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            int r14 = r13.mo16204b()     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.w(r9, r14)     // Catch:{ all -> 0x01fe }
        L_0x014d:
            r2 = r5
        L_0x014e:
            com.bykv.vk.openvk.component.video.a.b.b.c r14 = r12.f5087b     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r12.f5093h     // Catch:{ all -> 0x01d9 }
            int r7 = r12.mo16094f()     // Catch:{ all -> 0x01d9 }
            com.bykv.vk.openvk.component.video.a.b.b.a r14 = r14.mo16135a((java.lang.String) r4, (int) r7)     // Catch:{ all -> 0x01d9 }
            if (r14 != 0) goto L_0x015e
            r14 = r6
            goto L_0x0160
        L_0x015e:
            int r14 = r14.f5141c     // Catch:{ all -> 0x01d9 }
        L_0x0160:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x01d9 }
            java.io.InputStream r7 = r3.mo16172d()     // Catch:{ all -> 0x01d9 }
            r8 = r6
        L_0x0169:
            int r10 = r7.read(r4)     // Catch:{ all -> 0x01d5 }
            if (r10 < 0) goto L_0x01ad
            r12.mo16093e()     // Catch:{ all -> 0x01d5 }
            if (r10 <= 0) goto L_0x01a9
            r13.mo16205b(r4, r6, r10)     // Catch:{ all -> 0x01d5 }
            int r8 = r8 + r10
            if (r2 == 0) goto L_0x01a2
            r2.mo16209a(r4, r6, r10)     // Catch:{ all -> 0x017e }
            goto L_0x01a2
        L_0x017e:
            r10 = move-exception
            r2.mo16207a()     // Catch:{ all -> 0x01d5 }
            boolean r2 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01a0 }
            if (r2 == 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
            r2.<init>()     // Catch:{ all -> 0x01a0 }
            java.lang.String r11 = "append to cache file error in network task!!! "
            r2.append(r11)     // Catch:{ all -> 0x01a0 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x01a0 }
            r2.append(r10)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a0 }
            android.util.Log.e(r9, r2)     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            r2 = r5
            goto L_0x01a2
        L_0x01a0:
            r13 = move-exception
            goto L_0x01d7
        L_0x01a2:
            int r10 = r13.mo16204b()     // Catch:{ all -> 0x01d5 }
            r12.mo16088a(r14, r10)     // Catch:{ all -> 0x01d5 }
        L_0x01a9:
            r12.mo16093e()     // Catch:{ all -> 0x01d5 }
            goto L_0x0169
        L_0x01ad:
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01d5 }
            if (r13 == 0) goto L_0x01b6
            java.lang.String r13 = "read from net complete!"
            android.util.Log.i(r9, r13)     // Catch:{ all -> 0x01d5 }
        L_0x01b6:
            r12.mo16091c()     // Catch:{ all -> 0x01d5 }
            java.io.InputStream r13 = r3.mo16172d()
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r13)
            if (r2 == 0) goto L_0x01c5
            r2.mo16207a()
        L_0x01c5:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.f5088c
            r13.addAndGet(r8)
            java.util.concurrent.atomic.AtomicLong r13 = r12.f5089d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r13.addAndGet(r2)
            return
        L_0x01d5:
            r13 = move-exception
            r5 = r2
        L_0x01d7:
            r6 = r8
            goto L_0x01ff
        L_0x01d9:
            r13 = move-exception
            r5 = r2
            goto L_0x01ff
        L_0x01dc:
            com.bykv.vk.openvk.component.video.a.b.c.c r13 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = r12.f5092g     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", url: "
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r13 = move-exception
        L_0x01ff:
            java.io.InputStream r14 = r3.mo16172d()
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r14)
            if (r5 == 0) goto L_0x020b
            r5.mo16207a()
        L_0x020b:
            java.util.concurrent.atomic.AtomicInteger r14 = r12.f5088c
            r14.addAndGet(r6)
            java.util.concurrent.atomic.AtomicLong r14 = r12.f5089d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r14.addAndGet(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2465g.m6012d(com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: a */
    public void mo16087a() {
        super.mo16087a();
        m6014i();
    }

    /* renamed from: i */
    private void m6014i() {
        C2422b bVar = this.f5244p;
        this.f5244p = null;
        if (bVar != null) {
            bVar.mo16087a();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$b */
    /* compiled from: ProxyTask */
    private static class C2469b {

        /* renamed from: a */
        private final OutputStream f5253a;

        /* renamed from: b */
        private int f5254b;

        /* renamed from: c */
        private boolean f5255c;

        C2469b(OutputStream outputStream, int i) {
            this.f5253a = outputStream;
            this.f5254b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16203a() {
            return this.f5255c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16202a(byte[] bArr, int i, int i2) throws C2435d {
            if (!this.f5255c) {
                try {
                    this.f5253a.write(bArr, i, i2);
                    this.f5255c = true;
                } catch (IOException e) {
                    throw new C2435d(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16205b(byte[] bArr, int i, int i2) throws C2435d {
            try {
                this.f5253a.write(bArr, i, i2);
                this.f5254b += i2;
            } catch (IOException e) {
                throw new C2435d(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo16204b() {
            return this.f5254b;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$a */
    /* compiled from: ProxyTask */
    static final class C2468a {

        /* renamed from: a */
        C2410a f5249a;

        /* renamed from: b */
        C2427c f5250b;

        /* renamed from: c */
        Socket f5251c;

        /* renamed from: d */
        C2470c f5252d;

        C2468a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2468a mo16198a(C2427c cVar) {
            if (cVar != null) {
                this.f5250b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2468a mo16200a(Socket socket) {
            if (socket != null) {
                this.f5251c = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2468a mo16199a(C2470c cVar) {
            this.f5252d = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2465g mo16201a() {
            if (this.f5250b != null && this.f5251c != null) {
                return new C2465g(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
