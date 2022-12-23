package com.inmobi.media;

import android.util.SparseArray;
import com.inmobi.media.C6145fs;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.hq */
/* compiled from: AdExecutorService */
public class C6229hq {

    /* renamed from: b */
    private static final String f15784b = C6229hq.class.getSimpleName();

    /* renamed from: a */
    public SparseArray<Queue<C5783af>> f15785a;

    /* renamed from: c */
    private final ExecutorService f15786c;

    /* renamed from: d */
    private byte f15787d;

    /* renamed from: com.inmobi.media.hq$a */
    /* compiled from: AdExecutorService */
    static class C6230a {

        /* renamed from: a */
        static final C6229hq f15788a = new C6229hq((byte) 0);
    }

    /* synthetic */ C6229hq(byte b) {
        this();
    }

    private C6229hq() {
        this.f15787d = -1;
        this.f15785a = new SparseArray<>();
        C6125fq fqVar = (C6125fq) C6145fs.m18321a(CampaignUnit.JSON_KEY_ADS, C6227ho.m18559f(), (C6145fs.C6148c) null);
        int i = fqVar.maxPoolSize;
        int i2 = fqVar.maxPoolSize;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 5, timeUnit, linkedBlockingQueue, new C6237ht(f15784b + "-AD"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15786c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static C6229hq m18582a() {
        return C6230a.f15788a;
    }

    /* renamed from: a */
    public final void mo35434a(int i, C5783af afVar) {
        Queue queue = this.f15785a.get(i);
        if (queue == null) {
            queue = new LinkedList();
            this.f15785a.put(i, queue);
        }
        queue.add(afVar);
        C5783af afVar2 = (C5783af) queue.peek();
        if (queue.size() == 1 && afVar2 != null) {
            mo35435a(afVar2);
        }
    }

    /* renamed from: a */
    public final void mo35435a(C5783af afVar) {
        try {
            this.f15786c.execute(afVar);
        } catch (OutOfMemoryError unused) {
            afVar.mo34437b();
        }
    }

    /* renamed from: a */
    public final void mo35433a(int i) {
        this.f15785a.remove(i);
        this.f15785a.size();
    }
}
