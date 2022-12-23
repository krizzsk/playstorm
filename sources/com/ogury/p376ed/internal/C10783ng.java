package com.ogury.p376ed.internal;

import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.ng */
public final class C10783ng extends C10721lb {

    /* renamed from: a */
    private final int f27011a;

    /* renamed from: b */
    private boolean f27012b;

    /* renamed from: c */
    private int f27013c;

    /* renamed from: d */
    private final int f27014d;

    public C10783ng(int i, int i2, int i3) {
        this.f27014d = i3;
        this.f27011a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f27012b = z;
        this.f27013c = !z ? this.f27011a : i;
    }

    public final boolean hasNext() {
        return this.f27012b;
    }

    /* renamed from: a */
    public final int mo67840a() {
        int i = this.f27013c;
        if (i != this.f27011a) {
            this.f27013c = this.f27014d + i;
        } else if (this.f27012b) {
            this.f27012b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
