package com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c */
/* compiled from: DiskLruCache */
public class C2413c extends C2410a {

    /* renamed from: a */
    public final File f5103a;

    /* renamed from: b */
    private final LinkedHashMap<String, File> f5104b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    private final ReentrantReadWriteLock f5105c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.ReadLock f5106d;

    /* renamed from: e */
    private final ReentrantReadWriteLock.WriteLock f5107e;

    /* renamed from: f */
    private final Set<C2420a> f5108f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile long f5109g;

    /* renamed from: h */
    private volatile float f5110h;

    /* renamed from: i */
    private final C2421b f5111i;

    /* renamed from: j */
    private final Runnable f5112j;

    /* renamed from: k */
    private final Handler f5113k;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$a */
    /* compiled from: DiskLruCache */
    public interface C2420a {
        /* renamed from: a */
        void mo16115a(String str);

        /* renamed from: a */
        void mo16116a(Set<String> set);
    }

    /* renamed from: a */
    public void mo16107a(C2420a aVar) {
        if (aVar != null) {
            this.f5108f.add(aVar);
        }
    }

    public C2413c(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5105c = reentrantReadWriteLock;
        this.f5106d = reentrantReadWriteLock.readLock();
        this.f5107e = this.f5105c.writeLock();
        this.f5108f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f5109g = 104857600;
        this.f5110h = 0.5f;
        this.f5111i = new C2421b();
        this.f5112j = new Runnable() {
            public void run() {
                C2952e.m8307a((C2955g) new C2955g("cleanupCmd", 1) {
                    public void run() {
                        C2413c.this.m5867b(C2413c.this.f5109g);
                    }
                });
            }
        };
        this.f5113k = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            }
            throw new IOException("dir error!  " + str);
        }
        this.f5103a = file;
        C2952e.m8307a((C2955g) new C2955g("DiskLruCache", 5) {
            public void run() {
                C2413c.this.m5866b();
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5866b() {
        this.f5107e.lock();
        try {
            File[] listFiles = this.f5103a.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() {
                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        int i = ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) > 0 ? 1 : ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) == 0 ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        return i > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f5104b.put(m5864a(file2), file2);
                }
            }
            this.f5107e.unlock();
            m5869c();
        } catch (Throwable th) {
            this.f5107e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo16106a(long j) {
        this.f5109g = j;
        m5869c();
    }

    /* renamed from: c */
    private void m5869c() {
        this.f5113k.removeCallbacks(this.f5112j);
        this.f5113k.postDelayed(this.f5112j, 10000);
    }

    /* renamed from: a */
    public void mo16105a() {
        C2436d.m5913c().mo16155d();
        Context a = C2446e.m5929a();
        if (a != null) {
            C2427c.m5902a(a).mo16136a(0);
        }
        this.f5113k.removeCallbacks(this.f5112j);
        C2952e.m8307a((C2955g) new C2955g("clear", 1) {
            public void run() {
                C2413c.this.m5867b(0);
            }
        });
    }

    /* renamed from: a */
    public void mo16097a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5111i.mo16117a(str);
        }
    }

    /* renamed from: b */
    public void mo16098b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5111i.mo16118b(str);
        }
    }

    /* renamed from: c */
    public File mo16099c(String str) {
        this.f5106d.lock();
        File file = this.f5104b.get(str);
        this.f5106d.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f5103a, str);
        this.f5107e.lock();
        this.f5104b.put(str, file2);
        this.f5107e.unlock();
        for (C2420a a : this.f5108f) {
            a.mo16115a(str);
        }
        m5869c();
        return file2;
    }

    /* renamed from: d */
    public File mo16100d(String str) {
        if (!this.f5106d.tryLock()) {
            return null;
        }
        File file = this.f5104b.get(str);
        this.f5106d.unlock();
        return file;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3 A[LOOP:3: B:42:0x00dd->B:44:0x00e3, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5867b(long r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.f5107e
            r1.lock()
            r1 = 0
            r3 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r12.f5104b     // Catch:{ all -> 0x00cd }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00cd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00cd }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00cd }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00cd }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00cd }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00cd }
            long r5 = r5.length()     // Catch:{ all -> 0x00cd }
            long r1 = r1 + r5
            goto L_0x0017
        L_0x002f:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0039
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f5107e
            r13.unlock()
            return
        L_0x0039:
            float r13 = (float) r13
            float r14 = r12.f5110h     // Catch:{ all -> 0x00cd }
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch:{ all -> 0x00cd }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00cd }
            r4.<init>()     // Catch:{ all -> 0x00cd }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r12.f5104b     // Catch:{ all -> 0x00ca }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00ca }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ca }
        L_0x004d:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00ca }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00ca }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x00ca }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x00a3
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x00a3
            com.bykv.vk.openvk.component.video.a.b.a.c$b r7 = r12.f5111i     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r12.m5864a((java.io.File) r6)     // Catch:{ all -> 0x00ca }
            boolean r7 = r7.mo16119c(r8)     // Catch:{ all -> 0x00ca }
            if (r7 != 0) goto L_0x00aa
            long r7 = r6.length()     // Catch:{ all -> 0x00ca }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r10.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ all -> 0x00ca }
            r10.append(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ca }
            r9.<init>(r10)     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.renameTo(r9)     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x00aa
            r0.add(r9)     // Catch:{ all -> 0x00ca }
            long r1 = r1 - r7
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00ca }
            r4.add(r5)     // Catch:{ all -> 0x00ca }
            goto L_0x00aa
        L_0x00a3:
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00ca }
            r4.add(r5)     // Catch:{ all -> 0x00ca }
        L_0x00aa:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x004d
        L_0x00ae:
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x00ca }
        L_0x00b2:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x00ca }
            if (r14 == 0) goto L_0x00c4
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00ca }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00ca }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.f5104b     // Catch:{ all -> 0x00ca }
            r1.remove(r14)     // Catch:{ all -> 0x00ca }
            goto L_0x00b2
        L_0x00c4:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f5107e
            r13.unlock()
            goto L_0x00d7
        L_0x00ca:
            r13 = move-exception
            r3 = r4
            goto L_0x00ce
        L_0x00cd:
            r13 = move-exception
        L_0x00ce:
            r13.printStackTrace()     // Catch:{ all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f5107e
            r13.unlock()
            r4 = r3
        L_0x00d7:
            java.util.Set<com.bykv.vk.openvk.component.video.a.b.a.c$a> r13 = r12.f5108f
            java.util.Iterator r13 = r13.iterator()
        L_0x00dd:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ed
            java.lang.Object r14 = r13.next()
            com.bykv.vk.openvk.component.video.a.b.a.c$a r14 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c.C2420a) r14
            r14.mo16116a((java.util.Set<java.lang.String>) r4)
            goto L_0x00dd
        L_0x00ed:
            com.bykv.vk.openvk.component.video.a.b.a.c$5 r13 = new com.bykv.vk.openvk.component.video.a.b.a.c$5
            r14 = 1
            java.lang.String r1 = "trimSize"
            r13.<init>(r1, r14, r0)
            com.bytedance.sdk.component.p125f.C2952e.m8307a((com.bytedance.sdk.component.p125f.C2955g) r13)
            return
        L_0x00f9:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.f5107e
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c.m5867b(long):void");
    }

    /* renamed from: a */
    private String m5864a(File file) {
        return file.getName();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$b */
    /* compiled from: DiskLruCache */
    private static final class C2421b {

        /* renamed from: a */
        private final Map<String, Integer> f5122a;

        private C2421b() {
            this.f5122a = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo16117a(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f5122a.get(str);
                if (num == null) {
                    this.f5122a.put(str, 1);
                } else {
                    this.f5122a.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo16118b(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f5122a.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f5122a.remove(str);
                } else {
                    this.f5122a.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo16119c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f5122a.containsKey(str);
        }
    }
}
