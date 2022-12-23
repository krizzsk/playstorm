package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.q0 */
class C0942q0<T> {

    /* renamed from: a */
    private final List<Callable<T>> f707a = new ArrayList();

    /* renamed from: b */
    private boolean f708b = false;

    /* renamed from: com.adcolony.sdk.q0$a */
    interface C0943a<T> extends Callable<T> {
        /* renamed from: a */
        T mo11015a();
    }

    C0942q0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11013a(Callable<T> callable) {
        if (!this.f708b) {
            this.f707a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11014b() {
        return this.f707a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo11011a() {
        return mo11012a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo11012a(long j) {
        List<Future<T>> list;
        this.f708b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f707a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f707a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f707a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f707a.get(i) instanceof C0943a) {
                arrayList.add(((C0943a) this.f707a.get(i)).mo11015a());
            }
        }
        return arrayList;
    }
}
