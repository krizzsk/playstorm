package com.tapjoy.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.gk */
public final class C11680gk extends C11679gj {

    /* renamed from: b */
    private final ThreadPoolExecutor f28419b = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C11680gk(File file, C11713hi hiVar) {
        super(file, hiVar);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            this.f28419b.shutdown();
            this.f28419b.awaitTermination(1, TimeUnit.SECONDS);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: com.tapjoy.internal.gk$a */
    class C11681a implements Runnable {

        /* renamed from: b */
        private int f28421b;

        /* renamed from: c */
        private long f28422c;

        /* renamed from: d */
        private String f28423d;

        /* renamed from: e */
        private String f28424e;

        /* renamed from: f */
        private Map<String, Long> f28425f;

        C11681a(int i, long j, String str, String str2, Map<String, Long> map) {
            this.f28421b = i;
            this.f28422c = j;
            this.f28423d = str;
            this.f28424e = str2;
            this.f28425f = map;
        }

        public final void run() {
            try {
                int i = this.f28421b;
                if (i == 1) {
                    C11680gk.super.mo72561a(this.f28422c);
                } else if (i == 2) {
                    C11680gk.super.mo72560a();
                } else if (i == 3) {
                    C11680gk.super.mo72562a(this.f28422c, this.f28423d, this.f28424e, this.f28425f);
                }
            } catch (Throwable unused) {
                C11680gk.super.mo72560a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72561a(long j) {
        try {
            this.f28419b.execute(new C11681a(1, j, (String) null, (String) null, (Map<String, Long>) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72560a() {
        try {
            this.f28419b.execute(new C11681a(2, 0, (String) null, (String) null, (Map<String, Long>) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72562a(long j, String str, String str2, Map<String, Long> map) {
        try {
            this.f28419b.execute(new C11681a(3, j, str, str2, map != null ? new HashMap(map) : null));
        } catch (Throwable unused) {
        }
    }
}
