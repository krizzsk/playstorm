package com.applovin.impl.sdk.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: com.applovin.impl.sdk.utils.q */
public class C2085q {
    /* renamed from: a */
    public static void m5018a(final View view, long j, final Runnable runnable) {
        view.setVisibility(4);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public static boolean m5019a(int i) {
        return i == 0;
    }

    /* renamed from: a */
    public static boolean m5020a(int i, int i2) {
        return m5019a(i) != m5019a(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if ((r6 & 16) == 16) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if ((r6 & 1) == 1) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m5021a(int r6, int r7, int r8) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x000c
            int[] r6 = new int[r0]
            r6[r1] = r7
            r6[r2] = r8
            return r6
        L_0x000c:
            r3 = r6 & 119(0x77, float:1.67E-43)
            r4 = 119(0x77, float:1.67E-43)
            if (r3 != r4) goto L_0x0019
            int[] r6 = new int[r2]
            r7 = 13
            r6[r1] = r7
            return r6
        L_0x0019:
            r3 = r6 & 112(0x70, float:1.57E-43)
            r4 = 15
            r5 = 112(0x70, float:1.57E-43)
            if (r3 != r5) goto L_0x0023
        L_0x0021:
            r7 = r4
            goto L_0x003c
        L_0x0023:
            r3 = r6 & 48
            r5 = 48
            if (r3 != r5) goto L_0x002c
            r7 = 10
            goto L_0x003c
        L_0x002c:
            r3 = r6 & 80
            r5 = 80
            if (r3 != r5) goto L_0x0035
            r7 = 12
            goto L_0x003c
        L_0x0035:
            r3 = r6 & 16
            r5 = 16
            if (r3 != r5) goto L_0x003c
            goto L_0x0021
        L_0x003c:
            r3 = r6 & 7
            r4 = 14
            r5 = 7
            if (r3 != r5) goto L_0x0045
        L_0x0043:
            r8 = r4
            goto L_0x0079
        L_0x0045:
            boolean r3 = com.applovin.impl.sdk.utils.C2039g.m4883b()
            if (r3 == 0) goto L_0x0055
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r5 = r6 & r3
            if (r5 != r3) goto L_0x0055
            r8 = 20
            goto L_0x0079
        L_0x0055:
            r3 = r6 & 3
            r5 = 3
            if (r3 != r5) goto L_0x005d
            r8 = 9
            goto L_0x0079
        L_0x005d:
            boolean r3 = com.applovin.impl.sdk.utils.C2039g.m4883b()
            if (r3 == 0) goto L_0x006d
            r3 = 8388613(0x800005, float:1.175495E-38)
            r5 = r6 & r3
            if (r5 != r3) goto L_0x006d
            r8 = 21
            goto L_0x0079
        L_0x006d:
            r3 = r6 & 5
            r5 = 5
            if (r3 != r5) goto L_0x0075
            r8 = 11
            goto L_0x0079
        L_0x0075:
            r6 = r6 & r2
            if (r6 != r2) goto L_0x0079
            goto L_0x0043
        L_0x0079:
            int[] r6 = new int[r0]
            r6[r1] = r8
            r6[r2] = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C2085q.m5021a(int, int, int):int[]");
    }

    /* renamed from: b */
    public static String m5022b(int i) {
        return i == 0 ? "VISIBLE" : i == 4 ? "INVISIBLE" : i == 8 ? "GONE" : String.valueOf(i);
    }

    /* renamed from: b */
    public static void m5023b(final View view, long j, final Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }
}
