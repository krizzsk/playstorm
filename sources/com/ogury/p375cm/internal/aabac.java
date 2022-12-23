package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aabac */
public final class aabac extends aabab {

    /* renamed from: a */
    private final String f25640a;

    /* renamed from: b */
    private final aabba f25641b;

    /* renamed from: c */
    private final Integer[] f25642c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabac(String str, aabba aabba, Integer[] numArr) {
        super(2, str, aabba);
        bbabc.m30943b(str, "iabString");
        bbabc.m30943b(aabba, "method");
        bbabc.m30943b(numArr, "nonIabVendorIdsAccepted");
        this.f25640a = str;
        this.f25641b = aabba;
        this.f25642c = numArr;
    }

    public /* synthetic */ aabac(String str, aabba aabba, Integer[] numArr, int i, bbabb bbabb) {
        this(str, aabba.UNKNOWN, numArr);
    }

    /* renamed from: b */
    public final String mo66528b() {
        return this.f25640a;
    }

    /* renamed from: d */
    public final Integer[] mo66530d() {
        return this.f25642c;
    }
}
