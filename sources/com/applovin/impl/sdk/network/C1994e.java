package com.applovin.impl.sdk.network;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1857b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.sdk.network.e */
class C1994e {

    /* renamed from: a */
    private final PriorityBlockingQueue<C1998b> f3818a = new PriorityBlockingQueue<>();

    /* renamed from: b */
    private final C1959m f3819b;

    /* renamed from: com.applovin.impl.sdk.network.e$a */
    static class C1996a extends Thread {

        /* renamed from: a */
        private final BlockingQueue<C1998b> f3820a;

        /* renamed from: b */
        private final C1959m f3821b;

        private C1996a(BlockingQueue<C1998b> blockingQueue, int i, C1959m mVar) {
            super("AL-Network-" + i);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            } else if (mVar != null) {
                this.f3820a = blockingQueue;
                this.f3821b = mVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private void m4611a() throws InterruptedException {
            m4612a(this.f3820a.take());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.Closeable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.net.HttpURLConnection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.net.HttpURLConnection} */
        /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[SYNTHETIC, Splitter:B:27:0x0073] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m4612a(final com.applovin.impl.sdk.network.C1994e.C1998b r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
                java.net.HttpURLConnection r2 = r9.m4613b(r10)     // Catch:{ all -> 0x005b }
                byte[] r3 = r10.f3829e     // Catch:{ all -> 0x0058 }
                if (r3 == 0) goto L_0x002d
                byte[] r3 = r10.f3829e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                if (r3 <= 0) goto L_0x002d
                r3 = 1
                r2.setDoOutput(r3)     // Catch:{ all -> 0x0058 }
                byte[] r3 = r10.f3829e     // Catch:{ all -> 0x0058 }
                int r3 = r3.length     // Catch:{ all -> 0x0058 }
                r2.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x0058 }
                java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ all -> 0x0058 }
                byte[] r4 = r10.f3829e     // Catch:{ all -> 0x0058 }
                r3.write(r4)     // Catch:{ all -> 0x0058 }
                r3.close()     // Catch:{ all -> 0x0058 }
            L_0x002d:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0058 }
                if (r1 <= 0) goto L_0x0043
                java.io.InputStream r3 = r2.getInputStream()     // Catch:{ all -> 0x0058 }
                com.applovin.impl.sdk.m r4 = r9.f3821b     // Catch:{ all -> 0x003e }
                java.lang.String r4 = com.applovin.impl.sdk.utils.C2040h.m4892a((java.io.InputStream) r3, (com.applovin.impl.sdk.C1959m) r4)     // Catch:{ all -> 0x003e }
                goto L_0x0045
            L_0x003e:
                r4 = move-exception
                r8 = r4
                r4 = r3
                r3 = r8
                goto L_0x005e
            L_0x0043:
                r3 = r0
                r4 = r3
            L_0x0045:
                com.applovin.impl.sdk.m r5 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r3, r5)
                com.applovin.impl.sdk.m r3 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r0, r3)
                com.applovin.impl.sdk.m r3 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r3)
                r3 = r0
                r6 = r3
                r0 = r4
                goto L_0x0092
            L_0x0058:
                r3 = move-exception
                r4 = r0
                goto L_0x005e
            L_0x005b:
                r3 = move-exception
                r2 = r0
                r4 = r2
            L_0x005e:
                boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x00b7 }
                if (r5 == 0) goto L_0x0071
                com.applovin.impl.sdk.m r5 = r9.f3821b     // Catch:{ all -> 0x00b7 }
                com.applovin.impl.sdk.v r5 = r5.mo14286A()     // Catch:{ all -> 0x00b7 }
                java.lang.String r6 = "NetworkCommunicationThread"
                java.lang.String r7 = "Failed to make HTTP request"
                r5.mo14788a((java.lang.String) r6, (java.lang.String) r7, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00b7 }
            L_0x0071:
                if (r2 == 0) goto L_0x0081
                java.io.InputStream r5 = r2.getErrorStream()     // Catch:{ all -> 0x007e }
                com.applovin.impl.sdk.m r6 = r9.f3821b     // Catch:{ all -> 0x007f }
                java.lang.String r6 = com.applovin.impl.sdk.utils.C2040h.m4892a((java.io.InputStream) r5, (com.applovin.impl.sdk.C1959m) r6)     // Catch:{ all -> 0x007f }
                goto L_0x0083
            L_0x007e:
                r5 = r0
            L_0x007f:
                r6 = r0
                goto L_0x0083
            L_0x0081:
                r5 = r0
                r6 = r5
            L_0x0083:
                com.applovin.impl.sdk.m r7 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r4, r7)
                com.applovin.impl.sdk.m r4 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r5, r4)
                com.applovin.impl.sdk.m r4 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r4)
            L_0x0092:
                com.applovin.impl.sdk.network.e$c$a r2 = com.applovin.impl.sdk.network.C1994e.C2000c.m4638d()
                com.applovin.impl.sdk.network.e$c$a r1 = r2.mo14535a((int) r1)
                com.applovin.impl.sdk.network.e$c$a r0 = r1.mo14536a((java.lang.String) r0)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo14539b((java.lang.String) r6)
                com.applovin.impl.sdk.network.e$c$a r0 = r0.mo14537a((java.lang.Throwable) r3)
                com.applovin.impl.sdk.network.e$c r0 = r0.mo14538a()
                java.util.concurrent.Executor r1 = r10.f3832h
                com.applovin.impl.sdk.network.e$a$1 r2 = new com.applovin.impl.sdk.network.e$a$1
                r2.<init>(r10, r0)
                r1.execute(r2)
                return
            L_0x00b7:
                r10 = move-exception
                com.applovin.impl.sdk.m r1 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r4, r1)
                com.applovin.impl.sdk.m r1 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.close(r0, r1)
                com.applovin.impl.sdk.m r0 = r9.f3821b
                com.applovin.impl.sdk.utils.Utils.disconnect(r2, r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C1994e.C1996a.m4612a(com.applovin.impl.sdk.network.e$b):void");
        }

        /* renamed from: b */
        private HttpURLConnection m4613b(C1998b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f3826b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f3827c);
            httpURLConnection.setConnectTimeout(bVar.f3830f);
            httpURLConnection.setReadTimeout(bVar.f3830f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f3828d.isEmpty()) {
                for (Map.Entry entry : bVar.f3828d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m4611a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$b */
    static class C1998b implements Comparable<C1998b> {

        /* renamed from: a */
        private static final AtomicInteger f3825a = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f3826b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f3827c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Map<String, String> f3828d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final byte[] f3829e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f3830f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Consumer<C2000c> f3831g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final Executor f3832h;

        /* renamed from: i */
        private final int f3833i;

        /* renamed from: com.applovin.impl.sdk.network.e$b$a */
        static class C1999a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f3834a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f3835b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public Map<String, String> f3836c = new HashMap();
            /* access modifiers changed from: private */

            /* renamed from: d */
            public byte[] f3837d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f3838e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public Consumer<C2000c> f3839f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public Executor f3840g;

            C1999a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14523a(int i) {
                this.f3838e = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14524a(Consumer<C2000c> consumer) {
                this.f3839f = consumer;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14525a(String str) {
                this.f3834a = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14526a(String str, String str2) {
                this.f3836c.put(str, str2);
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14527a(Map<String, String> map) {
                if (map == null) {
                    map = new HashMap<>();
                }
                this.f3836c = map;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14528a(Executor executor) {
                this.f3840g = executor;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1999a mo14529a(byte[] bArr) {
                this.f3837d = bArr;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C1998b mo14530a() {
                return new C1998b(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C1999a mo14531b(String str) {
                this.f3835b = str;
                return this;
            }
        }

        private C1998b(C1999a aVar) {
            this.f3826b = aVar.f3834a;
            this.f3827c = aVar.f3835b;
            this.f3828d = aVar.f3836c != null ? aVar.f3836c : Collections.emptyMap();
            this.f3829e = aVar.f3837d;
            this.f3830f = aVar.f3838e;
            this.f3831g = aVar.f3839f;
            this.f3832h = aVar.f3840g;
            this.f3833i = f3825a.incrementAndGet();
        }

        /* renamed from: a */
        public int compareTo(C1998b bVar) {
            return this.f3833i - bVar.f3833i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.e$c */
    static class C2000c {

        /* renamed from: a */
        private final int f3841a;

        /* renamed from: b */
        private final String f3842b;

        /* renamed from: c */
        private final String f3843c;

        /* renamed from: d */
        private final Throwable f3844d;

        /* renamed from: com.applovin.impl.sdk.network.e$c$a */
        static class C2001a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public int f3845a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f3846b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public String f3847c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public Throwable f3848d;

            C2001a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2001a mo14535a(int i) {
                this.f3845a = i;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2001a mo14536a(String str) {
                this.f3846b = str;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2001a mo14537a(Throwable th) {
                this.f3848d = th;
                return this;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public C2000c mo14538a() {
                return new C2000c(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C2001a mo14539b(String str) {
                this.f3847c = str;
                return this;
            }
        }

        private C2000c(C2001a aVar) {
            this.f3841a = aVar.f3845a;
            this.f3842b = aVar.f3846b;
            this.f3843c = aVar.f3847c;
            this.f3844d = aVar.f3848d;
        }

        /* renamed from: d */
        static C2001a m4638d() {
            return new C2001a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo14532a() throws Throwable {
            Throwable th = this.f3844d;
            if (th == null) {
                return this.f3841a;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo14533b() throws Throwable {
            Throwable th = this.f3844d;
            if (th == null) {
                return this.f3842b;
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo14534c() {
            return this.f3843c;
        }
    }

    C1994e(C1959m mVar) {
        this.f3819b = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14517a() {
        for (int i = 0; i < ((Integer) this.f3819b.mo14311a(C1857b.f3112ap)).intValue(); i++) {
            new C1996a(this.f3818a, i, this.f3819b).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14518a(C1998b bVar) {
        if (bVar != null) {
            this.f3818a.add(bVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
