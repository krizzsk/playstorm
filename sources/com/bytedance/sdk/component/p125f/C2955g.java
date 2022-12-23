package com.bytedance.sdk.component.p125f;

import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.f.g */
/* compiled from: TTRunnable */
public abstract class C2955g implements Comparable<C2955g>, Runnable {

    /* renamed from: a */
    private int f6720a;

    /* renamed from: b */
    private String f6721b;

    /* renamed from: c */
    private String f6722c;

    public C2955g(String str, int i) {
        this.f6720a = 0;
        this.f6720a = i == 0 ? 5 : i;
        this.f6721b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f6722c = str;
    }

    public C2955g(String str) {
        this.f6720a = 0;
        this.f6720a = 5;
        this.f6721b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f6722c = str;
    }

    /* renamed from: a */
    public void mo17879a(int i) {
        this.f6720a = i;
    }

    /* renamed from: a */
    public int mo17877a() {
        return this.f6720a;
    }

    /* renamed from: a */
    public int compareTo(C2955g gVar) {
        if (mo17877a() < gVar.mo17877a()) {
            return 1;
        }
        return mo17877a() >= gVar.mo17877a() ? -1 : 0;
    }

    /* renamed from: b */
    public String mo17880b() {
        return this.f6722c;
    }
}
