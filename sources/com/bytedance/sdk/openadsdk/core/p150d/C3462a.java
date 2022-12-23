package com.bytedance.sdk.openadsdk.core.p150d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.a */
/* compiled from: FrequentCallController */
public class C3462a {

    /* renamed from: a */
    private static volatile C3462a f8397a;

    /* renamed from: b */
    private static volatile boolean f8398b;

    /* renamed from: c */
    private static volatile long f8399c;

    /* renamed from: d */
    private final Queue<C3464a> f8400d = new LinkedList();

    /* renamed from: e */
    private Handler f8401e;

    /* renamed from: f */
    private final C3537f f8402f = C3578m.m11241h();

    private C3462a() {
    }

    /* renamed from: a */
    public static C3462a m10377a() {
        if (f8397a == null) {
            synchronized (C3462a.class) {
                if (f8397a == null) {
                    f8397a = new C3462a();
                }
            }
        }
        return f8397a;
    }

    /* renamed from: b */
    private synchronized boolean m10382b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f8402f.mo19949i();
        long h = this.f8402f.mo19947h();
        if (this.f8400d.size() <= 0 || this.f8400d.size() < i) {
            this.f8400d.offer(new C3464a(currentTimeMillis, str));
        } else {
            long abs = Math.abs(currentTimeMillis - this.f8400d.peek().f8404a);
            if (abs <= h) {
                m10381b(h - abs);
                return true;
            }
            this.f8400d.poll();
            this.f8400d.offer(new C3464a(currentTimeMillis, str));
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo19467a(String str) {
        if (m10382b(str)) {
            m10380a(true);
            m10378a(f8399c);
        } else {
            m10380a(false);
        }
        return f8398b;
    }

    /* renamed from: a */
    private synchronized void m10378a(long j) {
        if (this.f8401e == null) {
            this.f8401e = new Handler(Looper.getMainLooper());
        }
        this.f8401e.postDelayed(new Runnable() {
            public void run() {
                C3462a.this.m10380a(false);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m10380a(boolean z) {
        f8398b = z;
    }

    /* renamed from: b */
    public synchronized boolean mo19468b() {
        return f8398b;
    }

    /* renamed from: b */
    private synchronized void m10381b(long j) {
        f8399c = j;
    }

    /* renamed from: c */
    public synchronized String mo19469c() {
        String str;
        HashMap hashMap = new HashMap();
        for (C3464a aVar : this.f8400d) {
            if (hashMap.containsKey(aVar.f8405b)) {
                hashMap.put(aVar.f8405b, Integer.valueOf(((Integer) hashMap.get(aVar.f8405b)).intValue() + 1));
            } else {
                hashMap.put(aVar.f8405b, 1);
            }
        }
        int i = Integer.MIN_VALUE;
        str = "";
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.d.a$a */
    /* compiled from: FrequentCallController */
    private static class C3464a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f8404a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f8405b;

        private C3464a(long j, String str) {
            this.f8404a = j;
            this.f8405b = str;
        }
    }
}
