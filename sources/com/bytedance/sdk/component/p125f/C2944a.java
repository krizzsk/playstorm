package com.bytedance.sdk.component.p125f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.a */
/* compiled from: ADThreadPoolExecutor */
class C2944a extends ThreadPoolExecutor {

    /* renamed from: a */
    private String f6680a;

    public C2944a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f6680a = str;
    }

    /* renamed from: a */
    private void m8282a(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            m8283a(runnable, e);
        } catch (Throwable th) {
            m8284a(runnable, th);
        }
    }

    /* renamed from: a */
    private void m8283a(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        m8284a(runnable, (Throwable) outOfMemoryError);
    }

    /* renamed from: a */
    private void m8284a(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                C2975l.m8388c("", "try exc failed", th2);
            }
        }
    }

    /* renamed from: a */
    private void m8285a(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() <= 0) {
            try {
                setCorePoolSize(i);
                C2975l.m8380a("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.f6680a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C2975l.m8387c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m8286a(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() >= i2) {
            try {
                setCorePoolSize(i);
                C2975l.m8380a("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.f6680a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C2975l.m8387c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    public void execute(final Runnable runnable) {
        BlockingQueue queue;
        if (runnable instanceof C2955g) {
            m8282a(new C2948b((C2955g) runnable, this));
        } else {
            m8282a(new C2948b(new C2955g("unknown") {
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (C2952e.m8319e() && !TextUtils.isEmpty(this.f6680a) && (queue = getQueue()) != null) {
            String str = this.f6680a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m8286a(queue, C2952e.f6709a + 2, getCorePoolSize() * 2);
            } else if (c == 1) {
                m8286a(queue, 5, 5);
            } else if (c == 2) {
                m8286a(queue, 6, 6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue queue;
        super.afterExecute(runnable, th);
        if (C2952e.m8319e() && !TextUtils.isEmpty(this.f6680a) && (queue = getQueue()) != null) {
            String str = this.f6680a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m8285a((BlockingQueue<Runnable>) queue, 4);
            } else if (c == 1) {
                m8285a((BlockingQueue<Runnable>) queue, 2);
            } else if (c == 2) {
                m8285a((BlockingQueue<Runnable>) queue, 2);
            }
        }
    }

    public List<Runnable> shutdownNow() {
        if ("io".equals(this.f6680a) || "aidl".equals(this.f6680a)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    public void shutdown() {
        if (!"io".equals(this.f6680a) && !"aidl".equals(this.f6680a)) {
            super.shutdown();
        }
    }

    /* renamed from: a */
    public String mo17848a() {
        return this.f6680a;
    }

    /* renamed from: com.bytedance.sdk.component.f.a$a */
    /* compiled from: ADThreadPoolExecutor */
    public static class C2946a {

        /* renamed from: a */
        private String f6683a = "io";

        /* renamed from: b */
        private int f6684b = 1;

        /* renamed from: c */
        private long f6685c = 30;

        /* renamed from: d */
        private TimeUnit f6686d = TimeUnit.SECONDS;

        /* renamed from: e */
        private int f6687e = Integer.MAX_VALUE;

        /* renamed from: f */
        private BlockingQueue<Runnable> f6688f = null;

        /* renamed from: g */
        private ThreadFactory f6689g = null;

        /* renamed from: h */
        private RejectedExecutionHandler f6690h;

        /* renamed from: i */
        private int f6691i = 5;

        /* renamed from: a */
        public C2946a mo17856a(String str) {
            this.f6683a = str;
            return this;
        }

        /* renamed from: a */
        public C2946a mo17854a(int i) {
            this.f6684b = i;
            return this;
        }

        /* renamed from: a */
        public C2946a mo17855a(long j) {
            this.f6685c = j;
            return this;
        }

        /* renamed from: a */
        public C2946a mo17859a(TimeUnit timeUnit) {
            this.f6686d = timeUnit;
            return this;
        }

        /* renamed from: b */
        public C2946a mo17861b(int i) {
            this.f6687e = i;
            return this;
        }

        /* renamed from: a */
        public C2946a mo17857a(BlockingQueue<Runnable> blockingQueue) {
            this.f6688f = blockingQueue;
            return this;
        }

        /* renamed from: a */
        public C2946a mo17858a(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f6690h = rejectedExecutionHandler;
            return this;
        }

        /* renamed from: c */
        public C2946a mo17862c(int i) {
            this.f6691i = i;
            return this;
        }

        /* renamed from: a */
        public C2944a mo17860a() {
            if (this.f6689g == null) {
                this.f6689g = new C2956h(this.f6691i, this.f6683a);
            }
            if (this.f6690h == null) {
                this.f6690h = C2952e.m8320f();
            }
            if (this.f6688f == null) {
                this.f6688f = new LinkedBlockingQueue();
            }
            return new C2944a(this.f6683a, this.f6684b, this.f6687e, this.f6685c, this.f6686d, this.f6688f, this.f6689g, this.f6690h);
        }
    }
}
