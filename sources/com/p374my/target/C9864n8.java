package com.p374my.target;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: com.my.target.n8 */
public class C9864n8 {
    /* renamed from: a */
    public static boolean m28843a() {
        try {
            Class.forName("com.google.android.exoplayer2.ExoPlayer");
            Class.forName(C9687e9.class.getName());
            return true;
        } catch (Throwable unused) {
            C9672e0.m27882a("ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
            return false;
        }
    }

    /* renamed from: a */
    public static float[] m28844a(float f, float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = (f / 100.0f) * fArr[i];
        }
        return fArr2;
    }

    /* renamed from: a */
    public static <T extends C9983u1> float[] m28845a(C9984u2<T> u2Var, float f) {
        float f2;
        TreeSet<Float> treeSet = new TreeSet<>();
        for (C9711g2 next : u2Var.mo65534d()) {
            float point = next.getPoint();
            float pointP = next.getPointP();
            if (pointP >= 0.0f && pointP <= 100.0f) {
                point = f * (pointP / 100.0f);
            } else if (point < 0.0f || point > f) {
                C9672e0.m27882a("Midroll banner" + next.getId() + " excluded, had point=" + point + ", pointP=" + pointP + ", content duration=" + f);
            }
            float round = ((float) Math.round(point * 10.0f)) / 10.0f;
            next.setPoint(round);
            treeSet.add(Float.valueOf(round));
        }
        Iterator<C9915q1> it = u2Var.mo65537g().iterator();
        while (it.hasNext()) {
            C9915q1 next2 = it.next();
            float s = next2.mo65284s();
            float t = next2.mo65285t();
            if (t >= 0.0f && t <= 100.0f) {
                f2 = (t / 100.0f) * f;
            } else if (s < 0.0f || s > f) {
                C9672e0.m27882a("Midroll service" + next2.mo65278m() + " excluded, had point=" + s + ", pointP=" + t + ", content duration=" + f);
            } else {
                f2 = next2.mo65284s();
            }
            float round2 = ((float) Math.round(f2 * 10.0f)) / 10.0f;
            next2.mo65249b(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        int i = 0;
        for (Float floatValue : treeSet) {
            fArr[i] = floatValue.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: a */
    public static <T extends C9983u1> float[] m28846a(C9984u2<T> u2Var, float[] fArr, float f) {
        return (fArr == null || fArr.length == 0) ? m28845a(u2Var, f) : m28848b(u2Var, fArr, f);
    }

    /* renamed from: b */
    public static boolean m28847b() {
        try {
            Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static <T extends C9983u1> float[] m28848b(C9984u2<T> u2Var, float[] fArr, float f) {
        String str;
        String str2;
        Arrays.sort(fArr);
        TreeSet<Float> treeSet = new TreeSet<>();
        int i = 0;
        int i2 = 0;
        for (C9711g2 next : u2Var.mo65534d()) {
            if (i2 >= fArr.length) {
                str2 = "Midroll mediabanner missing: not enough user midPoints";
            } else {
                float f2 = fArr[i2];
                if (f2 > f) {
                    str2 = "Cannot set midPoint " + f2 + ": out of duration";
                } else {
                    next.setPoint(f2);
                    treeSet.add(Float.valueOf(f2));
                    if (!"statistics".equals(next.getType())) {
                        i2++;
                    }
                }
            }
            C9672e0.m27882a(str2);
            next.setPoint(-1.0f);
        }
        Iterator<C9915q1> it = u2Var.mo65537g().iterator();
        while (it.hasNext()) {
            C9915q1 next2 = it.next();
            if (i2 >= fArr.length) {
                str = "Midroll service missing: not enough user midPoints";
            } else {
                float f3 = fArr[i2];
                if (f3 > f) {
                    str = "Cannot set midPoint " + f3 + ": out of duration";
                } else {
                    next2.mo65249b(f3);
                    treeSet.add(Float.valueOf(f3));
                    i2++;
                }
            }
            C9672e0.m27882a(str);
            next2.mo65249b(-1.0f);
        }
        float[] fArr2 = new float[treeSet.size()];
        for (Float floatValue : treeSet) {
            fArr2[i] = floatValue.floatValue();
            i++;
        }
        return fArr2;
    }
}
