package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aabab */
public class aabab extends aaacc {

    /* renamed from: a */
    private final int f25637a;

    /* renamed from: b */
    private final String f25638b;

    /* renamed from: c */
    private final aabba f25639c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aabab(int i, String str, aabba aabba) {
        super((bbabb) null);
        bbabc.m30943b(str, "iabString");
        bbabc.m30943b(aabba, "retrievalMethod");
        this.f25637a = i;
        this.f25638b = str;
        this.f25639c = aabba;
    }

    public /* synthetic */ aabab(int i, String str, aabba aabba, int i2, bbabb bbabb) {
        this(i, str, aabba.UNKNOWN);
    }

    /* renamed from: a */
    public final int mo66527a() {
        return this.f25637a;
    }

    /* renamed from: b */
    public String mo66528b() {
        return this.f25638b;
    }

    /* renamed from: c */
    public final aabba mo66529c() {
        return this.f25639c;
    }
}
