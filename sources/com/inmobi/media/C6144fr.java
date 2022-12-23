package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.fr */
/* compiled from: Config */
public abstract class C6144fr {
    private C6163gb includeIds = new C6163gb();
    @C6261ii
    private String mAccountId;

    /* renamed from: b */
    public abstract String mo35325b();

    /* renamed from: c */
    public abstract JSONObject mo35326c();

    /* renamed from: d */
    public abstract boolean mo35327d();

    public C6144fr(String str) {
        this.mAccountId = str;
    }

    /* renamed from: f */
    public C6163gb mo35330f() {
        return this.includeIds;
    }

    /* renamed from: g */
    public String mo35331g() {
        return this.mAccountId;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof C6144fr)) {
            return false;
        }
        C6144fr frVar = (C6144fr) obj;
        if (!frVar.mo35325b().equals(mo35325b())) {
            return false;
        }
        if ((this.mAccountId != null || frVar.mAccountId != null) && ((str = this.mAccountId) == null || !str.equals(frVar.mAccountId))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = mo35325b().hashCode();
        String str = this.mAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6144fr m18314a(java.lang.String r5, java.lang.String r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r0) {
                case -60641721: goto L_0x0034;
                case 96432: goto L_0x002a;
                case 3506402: goto L_0x0020;
                case 780346297: goto L_0x0016;
                case 2088265419: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "signals"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "telemetry"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "root"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "ads"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "crashReporting"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r4
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == r4) goto L_0x005f
            if (r5 == r3) goto L_0x0059
            if (r5 == r2) goto L_0x0053
            if (r5 == r1) goto L_0x004d
            com.inmobi.media.fq r5 = new com.inmobi.media.fq
            r5.<init>(r6)
            goto L_0x0064
        L_0x004d:
            com.inmobi.media.gf r5 = new com.inmobi.media.gf
            r5.<init>(r6)
            goto L_0x0064
        L_0x0053:
            com.inmobi.media.ge r5 = new com.inmobi.media.ge
            r5.<init>(r6)
            goto L_0x0064
        L_0x0059:
            com.inmobi.media.gd r5 = new com.inmobi.media.gd
            r5.<init>(r6)
            goto L_0x0064
        L_0x005f:
            com.inmobi.media.ga r5 = new com.inmobi.media.ga
            r5.<init>(r6)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6144fr.m18314a(java.lang.String, java.lang.String):com.inmobi.media.fr");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.inmobi.media.C6144fr m18315a(java.lang.String r6, org.json.JSONObject r7, java.lang.String r8) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -60641721: goto L_0x0035;
                case 96432: goto L_0x002b;
                case 3506402: goto L_0x0021;
                case 780346297: goto L_0x0017;
                case 2088265419: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "signals"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r2
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "telemetry"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r1
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "root"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r3
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "ads"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r5
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "crashReporting"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x003f
            r6 = r4
            goto L_0x0040
        L_0x003f:
            r6 = -1
        L_0x0040:
            if (r6 == r5) goto L_0x0080
            if (r6 == r4) goto L_0x0073
            if (r6 == r3) goto L_0x0066
            if (r6 == r2) goto L_0x0059
            if (r6 == r1) goto L_0x004c
            r6 = 0
            goto L_0x008c
        L_0x004c:
            com.inmobi.media.ij r6 = com.inmobi.media.C6177gf.m18393a()
            java.lang.Class<com.inmobi.media.gf> r0 = com.inmobi.media.C6177gf.class
            java.lang.Object r6 = r6.mo35467a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fr r6 = (com.inmobi.media.C6144fr) r6
            goto L_0x008c
        L_0x0059:
            com.inmobi.media.ij r6 = com.inmobi.media.C6171ge.m18389a()
            java.lang.Class<com.inmobi.media.ge> r0 = com.inmobi.media.C6171ge.class
            java.lang.Object r6 = r6.mo35467a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fr r6 = (com.inmobi.media.C6144fr) r6
            goto L_0x008c
        L_0x0066:
            com.inmobi.media.ij r6 = com.inmobi.media.C6166gd.m18372a()
            java.lang.Class<com.inmobi.media.gd> r0 = com.inmobi.media.C6166gd.class
            java.lang.Object r6 = r6.mo35467a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fr r6 = (com.inmobi.media.C6144fr) r6
            goto L_0x008c
        L_0x0073:
            com.inmobi.media.ij r6 = com.inmobi.media.C6162ga.m18366a()
            java.lang.Class<com.inmobi.media.ga> r0 = com.inmobi.media.C6162ga.class
            java.lang.Object r6 = r6.mo35467a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fr r6 = (com.inmobi.media.C6144fr) r6
            goto L_0x008c
        L_0x0080:
            com.inmobi.media.ij r6 = com.inmobi.media.C6125fq.m18300a()
            java.lang.Class<com.inmobi.media.fq> r0 = com.inmobi.media.C6125fq.class
            java.lang.Object r6 = r6.mo35467a((org.json.JSONObject) r7, r0)
            com.inmobi.media.fr r6 = (com.inmobi.media.C6144fr) r6
        L_0x008c:
            if (r6 == 0) goto L_0x0090
            r6.mAccountId = r8
        L_0x0090:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6144fr.m18315a(java.lang.String, org.json.JSONObject, java.lang.String):com.inmobi.media.fr");
    }
}
