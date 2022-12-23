package com.ogury.p375cm.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.cm.internal.bbbab */
public final class bbbab extends bacba {

    /* renamed from: a */
    private final int f25931a;

    /* renamed from: b */
    private boolean f25932b;

    /* renamed from: c */
    private int f25933c;

    /* renamed from: d */
    private final int f25934d;

    public bbbab(int i, int i2, int i3) {
        this.f25934d = i3;
        this.f25931a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f25932b = z;
        this.f25933c = !z ? this.f25931a : i;
    }

    /* renamed from: a */
    public final int mo66714a() {
        int i = this.f25933c;
        if (i != this.f25931a) {
            this.f25933c = this.f25934d + i;
        } else if (this.f25932b) {
            this.f25932b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.f25932b;
    }
}
