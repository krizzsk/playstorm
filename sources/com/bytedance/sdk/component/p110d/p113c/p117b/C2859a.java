package com.bytedance.sdk.component.p110d.p113c.p117b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: com.bytedance.sdk.component.d.c.b.a */
/* compiled from: DefaultDecoder */
public class C2859a {

    /* renamed from: a */
    public static final ImageView.ScaleType f6453a = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: b */
    public static final Bitmap.Config f6454b = Bitmap.Config.ARGB_4444;

    /* renamed from: c */
    private final Bitmap.Config f6455c;

    /* renamed from: d */
    private final int f6456d;

    /* renamed from: e */
    private final int f6457e;

    /* renamed from: f */
    private final ImageView.ScaleType f6458f;

    public C2859a(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config) {
        this.f6455c = config;
        this.f6456d = i;
        this.f6457e = i2;
        this.f6458f = scaleType;
    }

    /* renamed from: a */
    static int m7924a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    /* renamed from: a */
    private static int m7925a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = (double) i2;
            return ((double) i) * d < d2 ? (int) (d2 / d) : i;
        }
        double d3 = (double) i2;
        return ((double) i) * d > d3 ? (int) (d3 / d) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a1655274989226dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p110d.p113c.p117b.C2859a.a1655274989226dc(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public Bitmap mo17680a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f6456d == 0 && this.f6457e == 0) {
            options.inPreferredConfig = this.f6455c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int a = m7925a(this.f6456d, this.f6457e, i, i2, this.f6458f);
        int a2 = m7925a(this.f6457e, this.f6456d, i2, i, this.f6458f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = m7924a(i, i2, a, a2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return decodeByteArray;
        }
        if (decodeByteArray.getWidth() <= a && decodeByteArray.getHeight() <= a2) {
            return decodeByteArray;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
        if (createScaledBitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return createScaledBitmap;
    }
}
