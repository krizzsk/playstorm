package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* renamed from: com.ironsource.sdk.controller.b */
public final class C8187b {

    /* renamed from: a */
    private int f19546a = C8188a.f19549a;

    /* renamed from: b */
    private ArrayList f19547b = new ArrayList();

    /* renamed from: c */
    private String f19548c;

    /* renamed from: com.ironsource.sdk.controller.b$a */
    enum C8188a {
        ;
        

        /* renamed from: a */
        public static final int f19549a = 1;

        /* renamed from: b */
        public static final int f19550b = 2;

        static {
            f19551c = new int[]{1, 2};
        }
    }

    public C8187b(String str) {
        this.f19548c = str;
    }

    /* renamed from: a */
    public final synchronized void mo56504a() {
        this.f19546a = C8188a.f19550b;
    }

    /* renamed from: a */
    public final synchronized void mo56505a(Runnable runnable) {
        if (this.f19546a != C8188a.f19550b) {
            this.f19547b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final synchronized void mo56506b() {
        Object[] array = this.f19547b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f19547b.clear();
    }
}
