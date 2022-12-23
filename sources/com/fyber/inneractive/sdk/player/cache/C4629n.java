package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.C4599c;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5368r;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.player.cache.n */
public class C4629n implements C4599c.C4605e {

    /* renamed from: f */
    public static final C4629n f11534f = new C4629n();

    /* renamed from: a */
    public Context f11535a;

    /* renamed from: b */
    public C4599c f11536b;

    /* renamed from: c */
    public boolean f11537c = false;

    /* renamed from: d */
    public final List<String> f11538d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final Runnable f11539e = new C4630a();

    /* renamed from: com.fyber.inneractive.sdk.player.cache.n$a */
    public class C4630a implements Runnable {
        public C4630a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
            com.fyber.inneractive.sdk.network.C4574r.m14050a("Failed to open cache directory", r0.getMessage(), (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.C5291e) null);
            com.fyber.inneractive.sdk.util.IAlog.m16698a("Failed to open cache directory", r0, new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.fyber.inneractive.sdk.player.cache.n r0 = com.fyber.inneractive.sdk.player.cache.C4629n.this
                android.content.Context r0 = r0.f11535a
                java.lang.String r1 = "fyb.vamp.vid.cache"
                java.io.File r0 = com.fyber.inneractive.sdk.player.cache.C4629n.m14137a((android.content.Context) r0, (java.lang.String) r1)
                if (r0 == 0) goto L_0x007c
                r1 = 0
                java.lang.String r2 = "VideoCache opening the cache in directory - %s"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x006a }
                r4[r1] = r0     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r4)     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r2 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                r4 = 52428800(0x3200000, double:2.5903269E-316)
                com.fyber.inneractive.sdk.player.cache.c r6 = com.fyber.inneractive.sdk.player.cache.C4599c.m14089a(r0, r1, r3, r4)     // Catch:{ all -> 0x006a }
                r2.f11536b = r6     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r2 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.c r2 = r2.f11536b     // Catch:{ all -> 0x006a }
                r2.getClass()     // Catch:{ all -> 0x006a }
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x006a }
                java.lang.String r7 = "DiskLruCache delete cache"
                com.fyber.inneractive.sdk.util.IAlog.m16702d(r7, r6)     // Catch:{ all -> 0x006a }
                r2.close()     // Catch:{ all -> 0x006a }
                java.io.File r2 = r2.f11443a     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.C4628m.m14136a((java.io.File) r2)     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r2 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.c r4 = com.fyber.inneractive.sdk.player.cache.C4599c.m14089a(r0, r1, r3, r4)     // Catch:{ all -> 0x006a }
                r2.f11536b = r4     // Catch:{ all -> 0x006a }
                java.lang.String r2 = "VideoCache opened the cache in directory - %s current size is %d"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x006a }
                r4[r1] = r0     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r0 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.c r0 = r0.f11536b     // Catch:{ all -> 0x006a }
                monitor-enter(r0)     // Catch:{ all -> 0x006a }
                long r5 = r0.f11450h     // Catch:{ all -> 0x0067 }
                monitor-exit(r0)     // Catch:{ all -> 0x006a }
                java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x006a }
                r4[r3] = r0     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.util.IAlog.m16699a(r2, r4)     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r0 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.c r2 = r0.f11536b     // Catch:{ all -> 0x006a }
                r2.f11454l = r0     // Catch:{ all -> 0x006a }
                boolean unused = r0.f11537c = r3     // Catch:{ all -> 0x006a }
                com.fyber.inneractive.sdk.player.cache.n r0 = com.fyber.inneractive.sdk.player.cache.C4629n.this     // Catch:{ all -> 0x006a }
                r0.getClass()     // Catch:{ all -> 0x006a }
                goto L_0x007c
            L_0x0067:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006a }
                throw r2     // Catch:{ all -> 0x006a }
            L_0x006a:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                java.lang.String r3 = "Failed to open cache directory"
                r4 = 0
                com.fyber.inneractive.sdk.network.C4574r.m14050a(r3, r2, r4, r4)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Failed to open cache directory"
                com.fyber.inneractive.sdk.util.IAlog.m16698a(r2, r0, r1)
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C4629n.C4630a.run():void");
        }
    }

    /* renamed from: a */
    public static File m14137a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z = true;
        if (C5350l.f14216a != null && C5350l.m16763b("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(C5350l.m16761b())) {
            String b = C5350l.m16761b();
            if ("mounted".equals(b) || "mounted_ro".equals(b)) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getFreeSpace() > 52428800) {
                    return new File(context.getExternalCacheDir(), str);
                }
            }
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || cacheDir.getFreeSpace() <= 52428800) {
            z = false;
        }
        if (z) {
            return new File(context.getCacheDir(), str);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo24853a() {
        return this.f11537c && C5368r.m16780a();
    }

    /* renamed from: a */
    public boolean mo24854a(C4599c cVar, String str) {
        for (String equalsIgnoreCase : this.f11538d) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
