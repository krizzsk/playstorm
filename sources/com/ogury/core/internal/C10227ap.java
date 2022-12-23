package com.ogury.core.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.core.internal.ap */
/* compiled from: ProgressionIterators.kt */
public final class C10227ap extends C10293t {

    /* renamed from: a */
    private final int f26000a;

    /* renamed from: b */
    private boolean f26001b;

    /* renamed from: c */
    private int f26002c;

    /* renamed from: d */
    private final int f26003d;

    public C10227ap(int i, int i2, int i3) {
        this.f26003d = i3;
        this.f26000a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f26001b = z;
        this.f26002c = !z ? this.f26000a : i;
    }

    public final boolean hasNext() {
        return this.f26001b;
    }

    /* renamed from: a */
    public final int mo66789a() {
        int i = this.f26002c;
        if (i != this.f26000a) {
            this.f26002c = this.f26003d + i;
        } else if (this.f26001b) {
            this.f26001b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
