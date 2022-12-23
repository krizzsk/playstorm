package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.inmobi.unification.sdk.model.ASRequestParams;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.inmobi.media.ba */
/* compiled from: AdPlacement */
public final class C5846ba implements Parcelable {
    public static final Parcelable.Creator<C5846ba> CREATOR = new Parcelable.Creator<C5846ba>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C5846ba[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C5846ba(parcel, (byte) 0);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f14746a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f14747b;

    /* renamed from: c */
    private final String f14748c;

    /* renamed from: d */
    private String f14749d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, String> f14750e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f14751f;

    /* renamed from: g */
    private final String f14752g;

    /* renamed from: h */
    private String f14753h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f14754i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f14755j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f14756k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f14757l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ASRequestParams f14758m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f14759n;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ C5846ba(long j, long j2, String str, String str2, String str3, String str4, byte b) {
        this(j, j2, str, str2, str3, str4);
    }

    /* synthetic */ C5846ba(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: com.inmobi.media.ba$a */
    /* compiled from: AdPlacement */
    public static class C5848a {

        /* renamed from: a */
        private long f14760a = Long.MIN_VALUE;

        /* renamed from: b */
        private long f14761b = Long.MIN_VALUE;

        /* renamed from: c */
        private String f14762c;

        /* renamed from: d */
        private Map<String, String> f14763d;

        /* renamed from: e */
        private String f14764e;

        /* renamed from: f */
        private String f14765f;

        /* renamed from: g */
        private String f14766g;

        /* renamed from: h */
        private String f14767h;

        /* renamed from: i */
        private String f14768i = "";

        /* renamed from: j */
        private boolean f14769j;

        /* renamed from: k */
        private String f14770k = "activity";

        /* renamed from: l */
        private ASRequestParams f14771l;

        /* renamed from: m */
        private String f14772m;

        public C5848a(String str, String str2) {
            this.f14765f = str;
            this.f14762c = str2;
            this.f14767h = UUID.randomUUID().toString();
        }

        /* renamed from: a */
        public final C5848a mo34797a(long j) {
            this.f14760a = j;
            return this;
        }

        /* renamed from: b */
        public final C5848a mo34804b(long j) {
            this.f14761b = j;
            return this;
        }

        /* renamed from: a */
        public final C5848a mo34798a(C5846ba baVar) {
            this.f14761b = baVar.f14747b;
            this.f14760a = baVar.f14746a;
            this.f14770k = baVar.f14756k;
            this.f14763d = baVar.f14750e;
            this.f14768i = baVar.f14755j;
            return this;
        }

        /* renamed from: a */
        public final C5848a mo34800a(String str) {
            this.f14768i = str;
            return this;
        }

        /* renamed from: b */
        public final C5848a mo34805b(String str) {
            this.f14770k = str;
            return this;
        }

        /* renamed from: a */
        public final C5848a mo34801a(Map<String, String> map) {
            this.f14763d = map;
            return this;
        }

        /* renamed from: c */
        public final C5848a mo34806c(String str) {
            this.f14764e = str;
            return this;
        }

        /* renamed from: a */
        public final C5848a mo34802a(boolean z) {
            this.f14769j = z;
            return this;
        }

        /* renamed from: a */
        public final C5848a mo34799a(ASRequestParams aSRequestParams) {
            this.f14771l = aSRequestParams;
            return this;
        }

        /* renamed from: d */
        public final C5848a mo34807d(String str) {
            this.f14766g = str;
            return this;
        }

        /* renamed from: e */
        public final C5848a mo34808e(String str) {
            this.f14772m = str;
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.inmobi.media.C5846ba mo34803a() {
            /*
                r11 = this;
                java.lang.String r0 = r11.f14762c
                int r1 = r0.hashCode()
                r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
                r3 = 2
                if (r1 == r2) goto L_0x001c
                r2 = 557596132(0x213c3de4, float:6.377879E-19)
                if (r1 == r2) goto L_0x0012
                goto L_0x0026
            L_0x0012:
                java.lang.String r1 = "AerServ"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = r3
                goto L_0x0027
            L_0x001c:
                java.lang.String r1 = "InMobi"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0026
                r0 = 1
                goto L_0x0027
            L_0x0026:
                r0 = -1
            L_0x0027:
                r1 = -9223372036854775808
                if (r0 == r3) goto L_0x003a
                long r3 = r11.f14760a
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0032
                goto L_0x0040
            L_0x0032:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is IM, IM-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            L_0x003a:
                long r3 = r11.f14761b
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x0080
            L_0x0040:
                com.inmobi.media.ba r0 = new com.inmobi.media.ba
                long r2 = r11.f14760a
                long r4 = r11.f14761b
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.f14763d
                java.lang.String r6 = com.inmobi.media.C5846ba.m17451a((java.util.Map<java.lang.String, java.lang.String>) r1)
                java.lang.String r7 = r11.f14765f
                java.lang.String r8 = r11.f14762c
                java.lang.String r9 = r11.f14766g
                r10 = 0
                r1 = r0
                r1.<init>(r2, r4, r6, r7, r8, r9, r10)
                java.lang.String r1 = r11.f14764e
                java.lang.String unused = r0.f14751f = r1
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.f14763d
                java.util.Map unused = r0.f14750e = r1
                java.lang.String r1 = r11.f14768i
                java.lang.String unused = r0.f14755j = r1
                java.lang.String r1 = r11.f14770k
                java.lang.String unused = r0.f14756k = r1
                java.lang.String r1 = r11.f14767h
                java.lang.String unused = r0.f14754i = r1
                boolean r1 = r11.f14769j
                boolean unused = r0.f14757l = r1
                com.inmobi.unification.sdk.model.ASRequestParams r1 = r11.f14771l
                com.inmobi.unification.sdk.model.ASRequestParams unused = r0.f14758m = r1
                java.lang.String r1 = r11.f14772m
                java.lang.String unused = r0.f14759n = r1
                return r0
            L_0x0080:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "When the integration type is AS, AS-Plc can't be empty"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5846ba.C5848a.mo34803a():com.inmobi.media.ba");
        }
    }

    private C5846ba(long j, long j2, String str, String str2, String str3, String str4) {
        this.f14755j = "";
        this.f14756k = "activity";
        this.f14746a = j;
        this.f14747b = j2;
        this.f14748c = str3;
        this.f14749d = str;
        this.f14752g = str2;
        if (str == null) {
            this.f14749d = "";
        }
        this.f14753h = str4;
    }

    private C5846ba(Parcel parcel) {
        this.f14755j = "";
        String str = "activity";
        this.f14756k = str;
        this.f14747b = parcel.readLong();
        this.f14746a = parcel.readLong();
        this.f14748c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            char c = 65535;
            int hashCode = readString.hashCode();
            if (hashCode != -1655966961) {
                if (hashCode == -1006804125 && readString.equals("others")) {
                    c = 2;
                }
            } else if (readString.equals(str)) {
                c = 1;
            }
            if (c == 2) {
                str = "others";
            }
        }
        this.f14756k = str;
        this.f14752g = parcel.readString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r2.get("tp");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17451a(java.util.Map<java.lang.String, java.lang.String> r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = "tp"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0010
            return r0
        L_0x0010:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5846ba.m17451a(java.util.Map):java.lang.String");
    }

    /* renamed from: a */
    public final String mo34771a() {
        return this.f14748c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo34773b() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f14748c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            java.lang.String r0 = "im"
            return r0
        L_0x002c:
            java.lang.String r0 = "as"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5846ba.mo34773b():java.lang.String");
    }

    /* renamed from: b */
    public final void mo34775b(Map<String, String> map) {
        this.f14750e = map;
    }

    /* renamed from: c */
    public final Map<String, String> mo34776c() {
        return this.f14750e;
    }

    /* renamed from: d */
    public final String mo34777d() {
        return this.f14751f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo34779e() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f14748c
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == r3) goto L_0x002c
            long r0 = r4.f14746a
            return r0
        L_0x002c:
            long r0 = r4.f14747b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5846ba.mo34779e():long");
    }

    /* renamed from: f */
    public final boolean mo34781f() {
        return this.f14757l;
    }

    /* renamed from: g */
    public final ASRequestParams mo34782g() {
        return this.f14758m;
    }

    /* renamed from: h */
    public final String mo34783h() {
        return this.f14759n;
    }

    /* renamed from: i */
    public final long mo34785i() {
        return this.f14747b;
    }

    /* renamed from: j */
    public final long mo34786j() {
        return this.f14746a;
    }

    /* renamed from: k */
    public final String mo34787k() {
        return this.f14749d;
    }

    /* renamed from: l */
    public final String mo34788l() {
        return this.f14752g;
    }

    /* renamed from: a */
    public final void mo34772a(String str) {
        this.f14755j = str;
    }

    /* renamed from: m */
    public final String mo34789m() {
        return this.f14755j;
    }

    /* renamed from: n */
    public final String mo34790n() {
        return this.f14756k;
    }

    /* renamed from: b */
    public final void mo34774b(String str) {
        this.f14756k = str;
    }

    /* renamed from: o */
    public final String mo34791o() {
        return this.f14754i;
    }

    /* renamed from: p */
    public final String mo34792p() {
        return this.f14753h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5846ba baVar = (C5846ba) obj;
            return this.f14746a == baVar.f14746a && this.f14747b == baVar.f14747b && this.f14748c.equals(baVar.f14748c) && this.f14756k.equals(baVar.f14756k) && this.f14749d.equals(baVar.f14749d) && this.f14752g.equals(baVar.f14752g);
        }
    }

    public final int hashCode() {
        long j = this.f14747b;
        long j2 = this.f14746a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 30) + this.f14752g.hashCode()) * 29) + this.f14756k.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mo34771a()
            int r1 = r0.hashCode()
            r2 = -2101048242(0xffffffff82c48c4e, float:-2.8880143E-37)
            r3 = 2
            if (r1 == r2) goto L_0x001e
            r2 = 557596132(0x213c3de4, float:6.377879E-19)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "AerServ"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = r3
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "InMobi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == r3) goto L_0x0032
            long r0 = r4.f14746a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0032:
            long r0 = r4.f14747b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5846ba.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14747b);
        parcel.writeLong(this.f14746a);
        parcel.writeString(this.f14748c);
        parcel.writeString(this.f14756k);
        parcel.writeString(this.f14752g);
    }
}
