package com.inmobi.unifiedId;

import java.util.Arrays;

public final class InMobiUserDataTypes {
    protected String md5;
    protected String sha1;
    protected String sha256;

    /* synthetic */ InMobiUserDataTypes(String str, String str2, String str3, byte b) {
        this(str, str2, str3);
    }

    private InMobiUserDataTypes(String str, String str2, String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final String getSha256() {
        return this.sha256;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = r5.md5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.inmobi.unifiedId.InMobiUserDataTypes
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.inmobi.unifiedId.InMobiUserDataTypes r6 = (com.inmobi.unifiedId.InMobiUserDataTypes) r6
            java.lang.String r1 = r5.md5
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r6.getMd5()
            if (r1 == 0) goto L_0x0024
        L_0x0016:
            java.lang.String r1 = r5.md5
            if (r1 == 0) goto L_0x0026
            java.lang.String r3 = r6.getMd5()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0026
        L_0x0024:
            r1 = r0
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            r1 = r1 & r0
            java.lang.String r3 = r5.sha1
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = r6.getSha1()
            if (r3 == 0) goto L_0x0040
        L_0x0032:
            java.lang.String r3 = r5.sha1
            if (r3 == 0) goto L_0x0042
            java.lang.String r4 = r6.getSha1()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0042
        L_0x0040:
            r3 = r0
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            r1 = r1 & r3
            java.lang.String r3 = r5.sha256
            if (r3 != 0) goto L_0x004e
            java.lang.String r3 = r6.getSha256()
            if (r3 == 0) goto L_0x005e
        L_0x004e:
            java.lang.String r3 = r5.sha256
            if (r3 == 0) goto L_0x005d
            java.lang.String r6 = r6.getSha256()
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            r6 = r1 & r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUserDataTypes.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.md5, this.sha1, this.sha256});
    }

    public static class Builder {

        /* renamed from: a */
        protected String f16207a;

        /* renamed from: b */
        protected String f16208b;

        /* renamed from: c */
        protected String f16209c;

        public Builder md5(String str) {
            this.f16207a = str;
            return this;
        }

        public Builder sha1(String str) {
            this.f16208b = str;
            return this;
        }

        public Builder sha256(String str) {
            this.f16209c = str;
            return this;
        }

        public InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f16207a, this.f16208b, this.f16209c, (byte) 0);
        }
    }
}
