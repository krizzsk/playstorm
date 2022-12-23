package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.C6051ev;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.ew */
/* compiled from: GifMovieObject */
public final class C6053ew implements C6051ev {

    /* renamed from: a */
    int f15394a = 0;

    /* renamed from: b */
    private Movie f15395b;

    /* renamed from: c */
    private long f15396c;

    /* renamed from: d */
    private volatile boolean f15397d = false;

    /* renamed from: e */
    private C6051ev.C6052a f15398e;

    /* renamed from: a */
    public final void mo35171a() {
    }

    /* JADX INFO: finally extract failed */
    public C6053ew(String str) throws IOException {
        File file = new File(str);
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            C6239hv.m18613a((Closeable) fileInputStream);
            Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
            this.f15395b = decodeByteArray;
            if (decodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th) {
            C6239hv.m18613a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo35174a(boolean z) {
        this.f15397d = z;
        if (!this.f15397d) {
            this.f15396c = SystemClock.uptimeMillis() - ((long) this.f15394a);
        }
        C6051ev.C6052a aVar = this.f15398e;
        if (aVar != null) {
            aVar.mo35187a();
        }
    }

    /* renamed from: b */
    public final int mo35175b() {
        return this.f15395b.width();
    }

    /* renamed from: c */
    public final int mo35176c() {
        return this.f15395b.height();
    }

    /* renamed from: a */
    public final void mo35172a(Canvas canvas, float f, float f2) {
        this.f15395b.draw(canvas, f, f2);
        if (this.f15394a + 20 >= this.f15395b.duration()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6053ew.this.f15394a = 0;
                    C6053ew.this.mo35174a(false);
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean mo35177d() {
        return !this.f15397d;
    }

    /* renamed from: e */
    public final void mo35178e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f15396c == 0) {
            this.f15396c = uptimeMillis;
        }
        int duration = this.f15395b.duration();
        if (duration == 0) {
            duration = 1000;
        }
        int i = (int) ((uptimeMillis - this.f15396c) % ((long) duration));
        this.f15394a = i;
        this.f15395b.setTime(i);
    }

    /* renamed from: a */
    public final void mo35173a(C6051ev.C6052a aVar) {
        this.f15398e = aVar;
    }
}
