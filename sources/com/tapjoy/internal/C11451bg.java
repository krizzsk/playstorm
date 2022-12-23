package com.tapjoy.internal;

import java.io.Writer;

/* renamed from: com.tapjoy.internal.bg */
public final class C11451bg implements C11450bf {

    /* renamed from: a */
    public final String f27694a;

    public C11451bg(String str) {
        this.f27694a = str;
    }

    /* renamed from: a */
    public final void mo72196a(Writer writer) {
        writer.write(this.f27694a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11451bg) {
            return this.f27694a.equals(((C11451bg) obj).f27694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27694a.hashCode();
    }

    public final String toString() {
        return this.f27694a;
    }
}
