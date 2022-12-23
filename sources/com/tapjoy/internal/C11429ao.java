package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.util.LinkedList;

/* renamed from: com.tapjoy.internal.ao */
public final class C11429ao<E> extends C11427an<E> implements C11432ar<E>, Closeable, Flushable {

    /* renamed from: a */
    private final C11432ar<E> f27675a;

    /* renamed from: b */
    private final LinkedList<E> f27676b = new LinkedList<>();

    /* renamed from: c */
    private final LinkedList<E> f27677c = new LinkedList<>();

    /* renamed from: d */
    private int f27678d;

    /* renamed from: e */
    private boolean f27679e;

    /* renamed from: a */
    public static <E> C11429ao<E> m33220a(C11432ar<E> arVar) {
        return new C11429ao<>(arVar);
    }

    private C11429ao(C11432ar<E> arVar) {
        this.f27675a = arVar;
        int size = arVar.size();
        this.f27678d = size;
        this.f27679e = size == 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        try {
            flush();
        } finally {
            C11432ar<E> arVar = this.f27675a;
            if (arVar instanceof Closeable) {
                ((Closeable) arVar).close();
            }
        }
    }

    public final void flush() {
        if (!this.f27677c.isEmpty()) {
            this.f27675a.addAll(this.f27677c);
            if (this.f27679e) {
                this.f27676b.addAll(this.f27677c);
            }
            this.f27677c.clear();
        }
    }

    public final int size() {
        return this.f27678d;
    }

    public final boolean offer(E e) {
        this.f27677c.add(e);
        this.f27678d++;
        return true;
    }

    public final E poll() {
        E e;
        if (this.f27678d <= 0) {
            return null;
        }
        if (!this.f27676b.isEmpty()) {
            e = this.f27676b.remove();
            this.f27675a.mo72133b(1);
        } else if (this.f27679e) {
            e = this.f27677c.remove();
        } else {
            e = this.f27675a.remove();
            if (this.f27678d == this.f27677c.size() + 1) {
                this.f27679e = true;
            }
        }
        this.f27678d--;
        return e;
    }

    public final E peek() {
        if (this.f27678d <= 0) {
            return null;
        }
        if (!this.f27676b.isEmpty()) {
            return this.f27676b.element();
        }
        if (this.f27679e) {
            return this.f27677c.element();
        }
        E peek = this.f27675a.peek();
        this.f27676b.add(peek);
        if (this.f27678d == this.f27676b.size() + this.f27677c.size()) {
            this.f27679e = true;
        }
        return peek;
    }

    /* renamed from: a */
    public final E mo72132a(int i) {
        if (i < 0 || i >= this.f27678d) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f27676b.size();
        if (i < size) {
            return this.f27676b.get(i);
        }
        if (this.f27679e) {
            return this.f27677c.get(i - size);
        }
        if (i >= this.f27675a.size()) {
            return this.f27677c.get(i - this.f27675a.size());
        }
        E e = null;
        while (size <= i) {
            e = this.f27675a.mo72132a(size);
            this.f27676b.add(e);
            size++;
        }
        if (i + 1 + this.f27677c.size() == this.f27678d) {
            this.f27679e = true;
        }
        return e;
    }

    /* renamed from: b */
    public final void mo72133b(int i) {
        if (i <= 0 || i > this.f27678d) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= this.f27676b.size()) {
            C11431aq.m33225a(this.f27676b, i);
            this.f27675a.mo72133b(i);
        } else {
            this.f27676b.clear();
            int size = (this.f27677c.size() + i) - this.f27678d;
            if (size < 0) {
                this.f27675a.mo72133b(i);
            } else {
                this.f27675a.clear();
                this.f27679e = true;
                if (size > 0) {
                    C11431aq.m33225a(this.f27677c, size);
                }
            }
        }
        this.f27678d -= i;
    }
}
