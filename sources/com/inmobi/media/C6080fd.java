package com.inmobi.media;

import android.media.MediaPlayer;

/* renamed from: com.inmobi.media.fd */
/* compiled from: NativeMediaPlayer */
public final class C6080fd extends MediaPlayer {

    /* renamed from: d */
    private static final Object f15467d = new Object();

    /* renamed from: e */
    private static C6080fd f15468e;

    /* renamed from: f */
    private static int f15469f = 0;

    /* renamed from: a */
    public int f15470a = 0;

    /* renamed from: b */
    public int f15471b = 0;

    /* renamed from: c */
    private C6080fd f15472c;

    /* renamed from: a */
    public static C6080fd m18177a() {
        synchronized (f15467d) {
            if (f15468e == null) {
                return new C6080fd();
            }
            C6080fd fdVar = f15468e;
            f15468e = fdVar.f15472c;
            fdVar.f15472c = null;
            f15469f--;
            return fdVar;
        }
    }

    /* renamed from: b */
    public final void mo35234b() {
        if (!(3 == this.f15470a)) {
            synchronized (f15467d) {
                if (f15469f < 5) {
                    this.f15472c = f15468e;
                    f15468e = this;
                    f15469f++;
                }
            }
        }
    }
}
