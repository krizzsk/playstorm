package com.smaato.sdk.core.p378ad;

/* renamed from: com.smaato.sdk.core.ad.FullscreenAdDimensionMapper */
public final class FullscreenAdDimensionMapper {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.smaato.sdk.core.p378ad.AdDimension getDimension(java.lang.String r5) {
        /*
            r4 = this;
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1762874990: goto L_0x002f;
                case 667133493: goto L_0x0024;
                case 1366559536: goto L_0x0019;
                case 1726410933: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003a
        L_0x000e:
            java.lang.String r0 = "full_480x320"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            r0 = r1
            goto L_0x003b
        L_0x0019:
            java.lang.String r0 = "full_768x1024"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x003a
        L_0x0022:
            r0 = r2
            goto L_0x003b
        L_0x0024:
            java.lang.String r0 = "full_320x480"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            r0 = r3
            goto L_0x003b
        L_0x002f:
            java.lang.String r0 = "full_1024x768"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = -1
        L_0x003b:
            if (r0 == 0) goto L_0x0063
            if (r0 == r3) goto L_0x0060
            if (r0 == r2) goto L_0x005d
            if (r0 != r1) goto L_0x0046
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_LANDSCAPE
            return r5
        L_0x0046:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown dimension: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x005d:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_PORTRAIT_TABLET
            return r5
        L_0x0060:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_PORTRAIT
            return r5
        L_0x0063:
            com.smaato.sdk.core.ad.AdDimension r5 = com.smaato.sdk.core.p378ad.AdDimension.FULLSCREEN_LANDSCAPE_TABLET
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.FullscreenAdDimensionMapper.getDimension(java.lang.String):com.smaato.sdk.core.ad.AdDimension");
    }
}
