package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.bbcaa */
public final class bbcaa {

    /* renamed from: a */
    private final String f25959a;

    /* renamed from: b */
    private final bbbac f25960b;

    public bbcaa(String str, bbbac bbbac) {
        bbabc.m30943b(str, "value");
        bbabc.m30943b(bbbac, SessionDescription.ATTR_RANGE);
        this.f25959a = str;
        this.f25960b = bbbac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbcaa)) {
            return false;
        }
        bbcaa bbcaa = (bbcaa) obj;
        return bbabc.m30942a((Object) this.f25959a, (Object) bbcaa.f25959a) && bbabc.m30942a((Object) this.f25960b, (Object) bbcaa.f25960b);
    }

    public final int hashCode() {
        String str = this.f25959a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        bbbac bbbac = this.f25960b;
        if (bbbac != null) {
            i = bbbac.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f25959a + ", range=" + this.f25960b + ")";
    }
}
