package com.p374my.target;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.my.target.v8 */
public final class C10008v8 implements Closeable {

    /* renamed from: a */
    public static final C10008v8 f24831a = new C10008v8(1000);

    /* renamed from: b */
    public static final Handler f24832b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final int f24833c;

    /* renamed from: d */
    public final WeakHashMap<Runnable, Boolean> f24834d = new WeakHashMap<>();

    /* renamed from: e */
    public final Runnable f24835e = new Runnable() {
        public final void run() {
            C10008v8.this.mo65625b();
        }
    };

    public C10008v8(int i) {
        this.f24833c = i;
    }

    /* renamed from: a */
    public static C10008v8 m29579a(int i) {
        return new C10008v8(i);
    }

    /* renamed from: a */
    public final void mo65623a() {
        f24832b.postDelayed(this.f24835e, (long) this.f24833c);
    }

    /* renamed from: a */
    public void mo65624a(Runnable runnable) {
        synchronized (this) {
            int size = this.f24834d.size();
            if (this.f24834d.put(runnable, Boolean.TRUE) == null && size == 0) {
                mo65623a();
            }
        }
    }

    /* renamed from: b */
    public void mo65625b() {
        synchronized (this) {
            for (Runnable run : new ArrayList(this.f24834d.keySet())) {
                run.run();
            }
            if (this.f24834d.keySet().size() > 0) {
                mo65623a();
            }
        }
    }

    /* renamed from: b */
    public void mo65626b(Runnable runnable) {
        synchronized (this) {
            this.f24834d.remove(runnable);
            if (this.f24834d.size() == 0) {
                f24832b.removeCallbacks(this.f24835e);
            }
        }
    }

    public void close() {
        this.f24834d.clear();
        f24832b.removeCallbacks(this.f24835e);
    }
}
