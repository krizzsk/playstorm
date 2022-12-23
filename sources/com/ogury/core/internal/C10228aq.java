package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.aq */
/* compiled from: Ranges.kt */
public final class C10228aq extends C10225ao {
    public C10228aq(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo66784d() {
        return mo66781a() > mo66782b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10228aq)) {
            return false;
        }
        if (mo66784d() && ((C10228aq) obj).mo66784d()) {
            return true;
        }
        C10228aq aqVar = (C10228aq) obj;
        return mo66781a() == aqVar.mo66781a() && mo66782b() == aqVar.mo66782b();
    }

    public final int hashCode() {
        if (mo66784d()) {
            return -1;
        }
        return (mo66781a() * 31) + mo66782b();
    }

    public final String toString() {
        return mo66781a() + ".." + mo66782b();
    }

    /* renamed from: com.ogury.core.internal.aq$a */
    /* compiled from: Ranges.kt */
    public static final class C10229a {
        private C10229a() {
        }

        public /* synthetic */ C10229a(byte b) {
            this();
        }
    }

    static {
        new C10229a((byte) 0);
        new C10228aq(1, 0);
    }
}
