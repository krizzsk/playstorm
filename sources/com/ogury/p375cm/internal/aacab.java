package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.aacab */
public final class aacab {

    /* renamed from: a */
    public static final aaaaa f25670a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.aacab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
            if (r3.equals("assetKey-unknown") != false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
            if (r3.equals("no-such-assetKey") != false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
            r1 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            if (r3.equals("assetType-not-matching") != false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
            if (r3.equals("bundle-not-matching") != false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
            r1 = 2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.ogury.core.OguryError m30668a(java.lang.String r3) {
            /*
                if (r3 == 0) goto L_0x00ad
                org.json.JSONObject r3 = com.ogury.p375cm.internal.aacaa.aaaaa.m30662a((java.lang.String) r3)
                if (r3 == 0) goto L_0x00ad
                java.lang.String r0 = "error"
                boolean r1 = r3.has(r0)
                if (r1 == 0) goto L_0x00ad
                com.ogury.cm.internal.aacab$aaaaa r1 = com.ogury.p375cm.internal.aacab.f25670a
                java.lang.String r1 = "sdk"
                boolean r2 = r3.has(r1)
                if (r2 == 0) goto L_0x0038
                org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch:{ Exception -> 0x002e }
                com.ogury.cm.internal.abbba r2 = com.ogury.p375cm.internal.abbba.f25716a     // Catch:{ Exception -> 0x002e }
                java.lang.String r2 = "sdkObject"
                com.ogury.p375cm.internal.bbabc.m30940a((java.lang.Object) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x002e }
                com.ogury.p375cm.internal.acbbb.m30840a(r1)     // Catch:{ Exception -> 0x002e }
                com.ogury.cm.internal.abbba r2 = com.ogury.p375cm.internal.abbba.f25716a     // Catch:{ Exception -> 0x002e }
                com.ogury.p375cm.internal.acbbb.m30841b(r1)     // Catch:{ Exception -> 0x002e }
                goto L_0x0038
            L_0x002e:
                r1 = move-exception
                com.ogury.cm.internal.abbbc r2 = com.ogury.p375cm.internal.abbbc.f25732a
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.String r2 = "Error while parsing json config: "
                com.ogury.p375cm.internal.abbbc.m30746a(r2, r1)
            L_0x0038:
                java.lang.String r3 = r3.optString(r0)
                r1 = 4
                if (r3 != 0) goto L_0x0040
                goto L_0x00a0
            L_0x0040:
                int r2 = r3.hashCode()
                switch(r2) {
                    case -1570691213: goto L_0x0096;
                    case -398774240: goto L_0x008f;
                    case -303694790: goto L_0x0084;
                    case -92841694: goto L_0x007a;
                    case 85866586: goto L_0x0071;
                    case 199821065: goto L_0x0067;
                    case 680846796: goto L_0x005e;
                    case 1299590356: goto L_0x0053;
                    case 1884026692: goto L_0x0048;
                    default: goto L_0x0047;
                }
            L_0x0047:
                goto L_0x00a0
            L_0x0048:
                java.lang.String r2 = "edit-disabled-device-id-restricted"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                r1 = 1007(0x3ef, float:1.411E-42)
                goto L_0x00a0
            L_0x0053:
                java.lang.String r2 = "region-restricted"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                r1 = 1000(0x3e8, float:1.401E-42)
                goto L_0x00a0
            L_0x005e:
                java.lang.String r2 = "assetKey-unknown"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                goto L_0x006f
            L_0x0067:
                java.lang.String r2 = "no-such-assetKey"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
            L_0x006f:
                r1 = 1
                goto L_0x00a0
            L_0x0071:
                java.lang.String r2 = "assetType-not-matching"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                goto L_0x0082
            L_0x007a:
                java.lang.String r2 = "bundle-not-matching"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
            L_0x0082:
                r1 = 2
                goto L_0x00a0
            L_0x0084:
                java.lang.String r2 = "edit-disabled-georestricted-user"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                r1 = 1008(0x3f0, float:1.413E-42)
                goto L_0x00a0
            L_0x008f:
                java.lang.String r2 = "domain-not-matching"
                boolean r2 = r3.equals(r2)
                goto L_0x00a0
            L_0x0096:
                java.lang.String r2 = "edit-disabled-user-has-paid"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00a0
                r1 = 1006(0x3ee, float:1.41E-42)
            L_0x00a0:
                com.ogury.core.OguryError r2 = new com.ogury.core.OguryError
                com.ogury.p375cm.internal.bbabc.m30940a((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.String r3 = com.ogury.p375cm.internal.aacaa.aaaaa.m30667e(r3)
                r2.<init>(r1, r3)
                return r2
            L_0x00ad:
                com.ogury.core.OguryError r3 = new com.ogury.core.OguryError
                r0 = 1004(0x3ec, float:1.407E-42)
                java.lang.String r1 = "parsing-error"
                java.lang.String r1 = com.ogury.p375cm.internal.aacaa.aaaaa.m30667e(r1)
                r3.<init>(r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ogury.p375cm.internal.aacab.aaaaa.m30668a(java.lang.String):com.ogury.core.OguryError");
        }
    }
}
