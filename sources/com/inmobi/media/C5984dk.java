package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.inmobi.media.dk */
/* compiled from: TimeOutManager */
public class C5984dk {

    /* renamed from: a */
    private static final String f15203a = C5984dk.class.getSimpleName();

    /* renamed from: d */
    private static byte f15204d = -1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5983dj f15205b;

    /* renamed from: c */
    private HashMap<Byte, Timer> f15206c = new HashMap<>();

    public C5984dk(C5983dj djVar) {
        this.f15205b = djVar;
    }

    /* renamed from: a */
    public final boolean mo35089a(final byte b, long j) {
        if (this.f15206c.containsKey(Byte.valueOf(b))) {
            mo35088a(b);
        }
        try {
            Timer timer = new Timer(f15203a);
            this.f15206c.put(Byte.valueOf(b), timer);
            timer.schedule(new TimerTask() {
                public final void run() {
                    new Handler(Looper.getMainLooper()).post(new Runnable(b) {
                        public final void run() {
                            C5984dk.this.f15205b.mo34509c(r3);
                        }
                    });
                }
            }, j);
            return true;
        } catch (OutOfMemoryError unused) {
            C6238hu.m18605a((byte) 1, f15203a, "Could not execute timer due to OutOfMemory.");
            this.f15205b.mo34517d(b);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo35088a(byte b) {
        Timer timer = this.f15206c.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.f15206c.remove(Byte.valueOf(b));
        }
    }
}
