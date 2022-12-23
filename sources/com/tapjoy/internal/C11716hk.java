package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.hk */
public class C11716hk implements C11696gy {

    /* renamed from: a */
    private static final C11716hk f28502a = new C11716hk() {
        /* renamed from: a */
        public final void mo71656a(String str) {
        }

        /* renamed from: a */
        public final void mo71657a(String str, C11693gv gvVar) {
        }

        /* renamed from: a */
        public final void mo71658a(String str, String str2, C11693gv gvVar) {
        }

        /* renamed from: b */
        public final void mo71659b(String str) {
        }

        /* renamed from: c */
        public final void mo71660c(String str) {
        }

        /* renamed from: d */
        public final void mo71661d(String str) {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11696gy f28503b;

    /* renamed from: c */
    private final C11435au f28504c;

    /* synthetic */ C11716hk(byte b) {
        this();
    }

    /* renamed from: a */
    public static C11716hk m34031a(C11696gy gyVar) {
        if (gyVar != null) {
            return new C11716hk(gyVar);
        }
        return f28502a;
    }

    private C11716hk() {
        this.f28503b = null;
        this.f28504c = null;
    }

    private C11716hk(C11696gy gyVar) {
        Handler handler;
        this.f28503b = gyVar;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C11689gr.m33925a(myLooper);
            handler = myLooper == Looper.getMainLooper() ? C11839t.m34404a() : new Handler(myLooper);
        } else {
            handler = null;
        }
        if (handler != null) {
            this.f28504c = C11839t.m34405a(handler);
            Object[] objArr = new Object[1];
            handler.getLooper();
        } else if (Thread.currentThread() == C11700hb.m33956b()) {
            this.f28504c = C11700hb.f28440a;
        } else {
            this.f28504c = C11839t.m34405a(C11839t.m34404a());
        }
    }

    /* renamed from: a */
    public void mo71656a(final String str) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71656a(str);
            }
        });
    }

    /* renamed from: b */
    public void mo71659b(final String str) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71659b(str);
            }
        });
    }

    /* renamed from: c */
    public void mo71660c(final String str) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71660c(str);
            }
        });
    }

    /* renamed from: d */
    public void mo71661d(final String str) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71661d(str);
            }
        });
    }

    /* renamed from: a */
    public void mo71657a(final String str, final C11693gv gvVar) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71657a(str, gvVar);
            }
        });
    }

    /* renamed from: a */
    public void mo71658a(final String str, final String str2, final C11693gv gvVar) {
        this.f28504c.mo72182a(new Runnable() {
            public final void run() {
                C11716hk.this.f28503b.mo71658a(str, str2, gvVar);
            }
        });
    }
}
