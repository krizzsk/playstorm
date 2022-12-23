package com.tapjoy.internal;

import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.tapjoy.internal.bu */
public abstract class C11470bu<Result> {

    /* renamed from: a */
    public static ExecutorService f27743a;

    /* renamed from: b */
    public static C11473bx f27744b;

    /* renamed from: c */
    private Future<?> f27745c;

    /* renamed from: a */
    public abstract Result mo72254a(URI uri, InputStream inputStream);

    /* renamed from: b */
    public abstract String mo72257b();

    /* renamed from: c */
    public abstract String mo72258c();

    /* renamed from: d */
    public String mo72259d() {
        return null;
    }

    /* renamed from: a */
    public Map<String, Object> mo72255a() {
        return Collections.emptyMap();
    }

    /* renamed from: e */
    public Map<String, Object> mo72260e() {
        return new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Result mo72261f() {
        return f27744b.mo72263a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[SYNTHETIC, Splitter:B:14:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72256a(@javax.annotation.Nullable com.tapjoy.internal.C11475bz<Result> r3, java.util.concurrent.ExecutorService r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<?> r0 = r2.f27745c     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.Future<?> r0 = r2.f27745c     // Catch:{ all -> 0x0028 }
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r1 = "Call has not completed"
            if (r0 == 0) goto L_0x0022
            com.tapjoy.internal.bw r0 = new com.tapjoy.internal.bw     // Catch:{ all -> 0x0028 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0028 }
            java.util.concurrent.Future r3 = r4.submit(r0)     // Catch:{ all -> 0x0028 }
            r2.f27745c = r3     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)
            return
        L_0x0022:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11470bu.mo72256a(com.tapjoy.internal.bz, java.util.concurrent.ExecutorService):void");
    }
}
