package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.EOFException;

/* renamed from: com.tapjoy.internal.jh */
final class C11809jh implements C11803jd {

    /* renamed from: a */
    public final C11801jb f28829a = new C11801jb();

    /* renamed from: b */
    public final C11814jm f28830b;

    /* renamed from: c */
    boolean f28831c;

    C11809jh(C11814jm jmVar) {
        if (jmVar != null) {
            this.f28830b = jmVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public final long mo72751b(C11801jb jbVar, long j) {
        if (jbVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.f28831c) {
            throw new IllegalStateException("closed");
        } else if (this.f28829a.f28815b == 0 && this.f28830b.mo72751b(this.f28829a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        } else {
            return this.f28829a.mo72751b(jbVar, Math.min(j, this.f28829a.f28815b));
        }
    }

    /* renamed from: b */
    public final boolean mo72756b() {
        if (!this.f28831c) {
            return this.f28829a.mo72756b() && this.f28830b.mo72751b(this.f28829a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public final byte mo72762d() {
        mo72749a(1);
        return this.f28829a.mo72762d();
    }

    /* renamed from: b */
    public final C11804je mo72755b(long j) {
        mo72749a(j);
        return this.f28829a.mo72755b(j);
    }

    /* renamed from: c */
    public final String mo72759c(long j) {
        mo72749a(j);
        return this.f28829a.mo72759c(j);
    }

    /* renamed from: f */
    public final int mo72769f() {
        mo72749a(4);
        return C11817jo.m34346a(this.f28829a.mo72765e());
    }

    /* renamed from: g */
    public final long mo72772g() {
        mo72749a(8);
        return this.f28829a.mo72772g();
    }

    /* renamed from: d */
    public final void mo72764d(long j) {
        if (!this.f28831c) {
            while (j > 0) {
                if (this.f28829a.f28815b == 0 && this.f28830b.mo72751b(this.f28829a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f28829a.f28815b);
                this.f28829a.mo72764d(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f28831c) {
            this.f28831c = true;
            this.f28830b.close();
            C11801jb jbVar = this.f28829a;
            try {
                jbVar.mo72764d(jbVar.f28815b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.f28830b + ")";
    }

    /* renamed from: a */
    public final void mo72749a(long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (!this.f28831c) {
            while (true) {
                if (this.f28829a.f28815b < j) {
                    if (this.f28830b.mo72751b(this.f28829a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw new EOFException();
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
