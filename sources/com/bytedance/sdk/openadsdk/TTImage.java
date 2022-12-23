package com.bytedance.sdk.openadsdk;

public class TTImage {

    /* renamed from: a */
    private int f6919a;

    /* renamed from: b */
    private int f6920b;

    /* renamed from: c */
    private String f6921c;

    /* renamed from: d */
    private double f6922d;

    public TTImage(int i, int i2, String str, double d) {
        this.f6922d = 0.0d;
        this.f6919a = i;
        this.f6920b = i2;
        this.f6921c = str;
        this.f6922d = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }

    public int getHeight() {
        return this.f6919a;
    }

    public int getWidth() {
        return this.f6920b;
    }

    public String getImageUrl() {
        return this.f6921c;
    }

    public double getDuration() {
        return this.f6922d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r1.f6921c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
            r1 = this;
            int r0 = r1.f6919a
            if (r0 <= 0) goto L_0x0014
            int r0 = r1.f6920b
            if (r0 <= 0) goto L_0x0014
            java.lang.String r0 = r1.f6921c
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTImage.isValid():boolean");
    }
}
