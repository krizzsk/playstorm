package com.ogury.p375cm.internal;

import com.ogury.core.OguryError;

/* renamed from: com.ogury.cm.internal.acbcc */
public final class acbcc {

    /* renamed from: a */
    private final boolean f25857a;

    /* renamed from: b */
    private final OguryError f25858b;

    public acbcc(boolean z, OguryError oguryError) {
        bbabc.m30943b(oguryError, "error");
        this.f25857a = z;
        this.f25858b = oguryError;
    }

    public /* synthetic */ acbcc(boolean z, OguryError oguryError, int i, bbabb bbabb) {
        this(true, new OguryError(0, ""));
    }

    /* renamed from: a */
    public final boolean mo66629a() {
        return this.f25857a;
    }

    /* renamed from: b */
    public final OguryError mo66630b() {
        return this.f25858b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acbcc) {
                acbcc acbcc = (acbcc) obj;
                if (!(this.f25857a == acbcc.f25857a) || !bbabc.m30942a((Object) this.f25858b, (Object) acbcc.f25858b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f25857a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        OguryError oguryError = this.f25858b;
        return i + (oguryError != null ? oguryError.hashCode() : 0);
    }

    public final String toString() {
        return "ResponseStatus(status=" + this.f25857a + ", error=" + this.f25858b + ")";
    }
}
