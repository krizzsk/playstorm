package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.j */
/* compiled from: RequestQueue */
public class C8499j {

    /* renamed from: a */
    private static final String f20586a = C8499j.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f20587b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8455c f20588c;

    /* renamed from: d */
    private Set<C8498i> f20589d = new HashSet();

    /* renamed from: e */
    private ExecutorService f20590e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: f */
    private AtomicInteger f20591f = new AtomicInteger();

    public C8499j(Context context) {
        this.f20587b = context.getApplicationContext();
        this.f20588c = new C8458d(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void mo57638a(final C8498i iVar) {
        iVar.mo57612a(this);
        synchronized (this) {
            this.f20589d.add(iVar);
        }
        iVar.mo57611a(this.f20591f.incrementAndGet());
        this.f20590e.execute(new Runnable() {
            public final void run() {
                new C8497h(C8499j.this.f20587b, (SSLSocketFactory) null, C8499j.this.f20588c).mo57609a(iVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo57639b(C8498i iVar) {
        synchronized (this) {
            this.f20589d.remove(iVar);
        }
    }
}
