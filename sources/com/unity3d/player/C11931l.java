package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

/* renamed from: com.unity3d.player.l */
public final class C11931l extends View {

    /* renamed from: a */
    final int f29218a;

    /* renamed from: b */
    final int f29219b;

    /* renamed from: c */
    Bitmap f29220c;

    /* renamed from: d */
    Bitmap f29221d;

    /* renamed from: com.unity3d.player.l$1 */
    static /* synthetic */ class C119321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29222a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.unity3d.player.C11931l.C11933a.m34556a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29222a = r0
                r1 = 1
                int r2 = com.unity3d.player.C11931l.C11933a.f29223a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f29222a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.unity3d.player.C11931l.C11933a.f29224b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f29222a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.unity3d.player.C11931l.C11933a.f29225c     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11931l.C119321.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.player.l$a */
    enum C11933a {
        ;

        static {
            f29226d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m34556a() {
            return (int[]) f29226d.clone();
        }
    }

    public C11931l(Context context, int i) {
        super(context);
        this.f29218a = i;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.f29219b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f29220c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f29220c = null;
        }
        Bitmap bitmap2 = this.f29221d;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f29221d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r13 < r11) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            int r9 = r8.f29219b
            if (r9 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.Bitmap r9 = r8.f29220c
            r10 = 0
            if (r9 != 0) goto L_0x001d
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r9.inScaled = r10
            android.content.res.Resources r11 = r8.getResources()
            int r12 = r8.f29219b
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeResource(r11, r12, r9)
            r8.f29220c = r9
        L_0x001d:
            android.graphics.Bitmap r9 = r8.f29220c
            int r9 = r9.getWidth()
            android.graphics.Bitmap r11 = r8.f29220c
            int r11 = r11.getHeight()
            int r12 = r8.getWidth()
            int r13 = r8.getHeight()
            if (r12 == 0) goto L_0x00c9
            if (r13 != 0) goto L_0x0037
            goto L_0x00c9
        L_0x0037:
            float r0 = (float) r9
            float r1 = (float) r11
            float r0 = r0 / r1
            float r1 = (float) r12
            float r2 = (float) r13
            float r3 = r1 / r2
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r4 = 1
            if (r3 > 0) goto L_0x0045
            r3 = r4
            goto L_0x0046
        L_0x0045:
            r3 = r10
        L_0x0046:
            int[] r5 = com.unity3d.player.C11931l.C119321.f29222a
            int r6 = r8.f29218a
            int r6 = r6 - r4
            r5 = r5[r6]
            r6 = 2
            if (r5 == r4) goto L_0x0066
            if (r5 == r6) goto L_0x0056
            r7 = 3
            if (r5 == r7) goto L_0x0056
            goto L_0x0070
        L_0x0056:
            int r9 = r8.f29218a
            int r11 = com.unity3d.player.C11931l.C11933a.f29225c
            if (r9 != r11) goto L_0x005e
            r9 = r4
            goto L_0x005f
        L_0x005e:
            r9 = r10
        L_0x005f:
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x006d
            float r1 = r1 / r0
            int r11 = (int) r1
            r9 = r12
            goto L_0x0070
        L_0x0066:
            if (r12 >= r9) goto L_0x006b
            float r1 = r1 / r0
            int r11 = (int) r1
            r9 = r12
        L_0x006b:
            if (r13 >= r11) goto L_0x0070
        L_0x006d:
            float r2 = r2 * r0
            int r9 = (int) r2
            r11 = r13
        L_0x0070:
            android.graphics.Bitmap r12 = r8.f29221d
            if (r12 == 0) goto L_0x008f
            int r12 = r12.getWidth()
            if (r12 != r9) goto L_0x0083
            android.graphics.Bitmap r12 = r8.f29221d
            int r12 = r12.getHeight()
            if (r12 != r11) goto L_0x0083
            return
        L_0x0083:
            android.graphics.Bitmap r12 = r8.f29221d
            android.graphics.Bitmap r13 = r8.f29220c
            if (r12 == r13) goto L_0x008f
            r12.recycle()
            r12 = 0
            r8.f29221d = r12
        L_0x008f:
            android.graphics.Bitmap r12 = r8.f29220c
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r12, r9, r11, r4)
            r8.f29221d = r9
            android.content.res.Resources r11 = r8.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.densityDpi
            r9.setDensity(r11)
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.<init>(r11)
            android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r12 = r8.getResources()
            android.graphics.Bitmap r13 = r8.f29221d
            r11.<init>(r12, r13)
            r12 = 17
            r11.setGravity(r12)
            android.graphics.drawable.LayerDrawable r12 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r6]
            r13[r10] = r9
            r13[r4] = r11
            r12.<init>(r13)
            r8.setBackground(r12)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11931l.onLayout(boolean, int, int, int, int):void");
    }
}
