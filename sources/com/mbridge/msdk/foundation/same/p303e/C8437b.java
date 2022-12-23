package com.mbridge.msdk.foundation.same.p303e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.e.b */
/* compiled from: CommonTaskLoader */
public final class C8437b {

    /* renamed from: a */
    ThreadPoolExecutor f20412a;

    /* renamed from: b */
    HashMap<Long, C8434a> f20413b;

    /* renamed from: c */
    WeakReference<Context> f20414c;

    public C8437b(Context context, int i) {
        if (i == 0) {
            this.f20412a = new ThreadPoolExecutor(1, 5, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f20412a = new ThreadPoolExecutor(i, (i * 2) + 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f20412a.allowCoreThreadTimeOut(true);
        this.f20413b = new HashMap<>();
        this.f20414c = new WeakReference<>(context);
    }

    public C8437b(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f20412a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20413b = new HashMap<>();
        this.f20414c = new WeakReference<>(context);
    }

    /* renamed from: b */
    private synchronized void m24380b(final C8434a aVar, final C8434a.C8436b bVar) {
        this.f20413b.put(Long.valueOf(C8434a.f20403b), aVar);
        aVar.f20405d = new C8434a.C8436b() {
            /* renamed from: a */
            public final void mo15705a(C8434a.C8435a aVar) {
                if (aVar == C8434a.C8435a.CANCEL) {
                    C8437b.this.f20413b.remove(Long.valueOf(C8434a.f20403b));
                } else if (aVar == C8434a.C8435a.FINISH) {
                    C8437b.this.f20413b.remove(Long.valueOf(C8434a.f20403b));
                } else if (aVar == C8434a.C8435a.RUNNING && ((Context) C8437b.this.f20414c.get()) == null) {
                    C8437b.this.mo57527a();
                }
                C8434a.C8436b bVar = bVar;
                if (bVar != null) {
                    bVar.mo15705a(aVar);
                }
            }
        };
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo57527a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f20413b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            com.mbridge.msdk.foundation.same.e.a r1 = (com.mbridge.msdk.foundation.same.p303e.C8434a) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r1.mo57525d()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x000b
        L_0x0021:
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f20413b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r0.clear()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002a:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p303e.C8437b.mo57527a():void");
    }

    /* renamed from: a */
    public final void mo57528a(C8434a aVar) {
        m24380b(aVar, (C8434a.C8436b) null);
        this.f20412a.execute(aVar);
    }

    /* renamed from: a */
    public final void mo57529a(C8434a aVar, C8434a.C8436b bVar) {
        m24380b(aVar, bVar);
        this.f20412a.execute(aVar);
    }
}
