package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aaaac */
public abstract class aaaac {

    /* renamed from: com.ogury.cm.internal.aaaac$aaaaa */
    static final class aaaaa extends bbaca implements bbaab<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ aaaac f25587a;

        /* renamed from: b */
        final /* synthetic */ int f25588b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(aaaac aaaac, int i) {
            super(1);
            this.f25587a = aaaac;
            this.f25588b = i;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo66506a(Object obj) {
            ((Number) obj).intValue();
            aabcc aabcc = aabcc.f25668a;
            return Boolean.valueOf(aabcc.m30658a(this.f25587a.mo66503a().mo66582c(), this.f25588b));
        }
    }

    /* renamed from: a */
    public static boolean m30577a(int i, Integer[] numArr, bbaab<? super Integer, Boolean> bbaab) {
        bbabc.m30943b(numArr, "conditionValues");
        bbabc.m30943b(bbaab, "unit");
        if (m30578a(numArr, i)) {
            return bbaab.mo66506a(Integer.valueOf(i)).booleanValue();
        }
        abbbc abbbc = abbbc.f25732a;
        abbbc.m30745a("Value that you are trying to check is not valid.");
        return false;
    }

    /* renamed from: a */
    private static boolean m30578a(Integer[] numArr, int i) {
        if (numArr.length == 0) {
            return true;
        }
        if (i != 0) {
            aabcc aabcc = aabcc.f25668a;
            bbabc.m30943b(numArr, "receiver$0");
            int i2 = 0;
            for (Integer intValue : numArr) {
                i2 += intValue.intValue();
            }
            if (aabcc.m30658a(i2, i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract abcab mo66503a();

    /* renamed from: a */
    public final boolean mo66504a(int i) {
        return m30577a(i, mo66505b(), new aaaaa(this, i));
    }

    /* renamed from: b */
    public abstract Integer[] mo66505b();
}
