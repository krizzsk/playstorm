package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.bbbac */
public final class bbbac extends bbbaa {

    /* renamed from: b */
    public static final aaaaa f25935b = new aaaaa((bbabb) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final bbbac f25936c = new bbbac(1, 0);

    /* renamed from: com.ogury.cm.internal.bbbac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public bbbac(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: d */
    public final boolean mo66727d() {
        return mo66724a() > mo66725b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbbac)) {
            return false;
        }
        if (mo66727d() && ((bbbac) obj).mo66727d()) {
            return true;
        }
        bbbac bbbac = (bbbac) obj;
        return mo66724a() == bbbac.mo66724a() && mo66725b() == bbbac.mo66725b();
    }

    public final int hashCode() {
        if (mo66727d()) {
            return -1;
        }
        return (mo66724a() * 31) + mo66725b();
    }

    public final String toString() {
        return mo66724a() + ".." + mo66725b();
    }
}
