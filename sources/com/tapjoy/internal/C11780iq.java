package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.nio.ByteBuffer;

/* renamed from: com.tapjoy.internal.iq */
public final class C11780iq extends ImageView implements Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11775im f28746a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f28747b;

    /* renamed from: c */
    private final Handler f28748c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f28749d;

    /* renamed from: e */
    private boolean f28750e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f28751f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Thread f28752g;

    /* renamed from: h */
    private C11784b f28753h = null;

    /* renamed from: i */
    private long f28754i = -1;

    /* renamed from: j */
    private C11783a f28755j = null;

    /* renamed from: k */
    private final Runnable f28756k = new Runnable() {
        public final void run() {
            if (C11780iq.this.f28747b != null && !C11780iq.this.f28747b.isRecycled()) {
                C11780iq iqVar = C11780iq.this;
                iqVar.setImageBitmap(iqVar.f28747b);
            }
        }
    };

    /* renamed from: l */
    private final Runnable f28757l = new Runnable() {
        public final void run() {
            Bitmap unused = C11780iq.this.f28747b = null;
            C11775im unused2 = C11780iq.this.f28746a = null;
            Thread unused3 = C11780iq.this.f28752g = null;
            boolean unused4 = C11780iq.this.f28751f = false;
        }
    };

    /* renamed from: com.tapjoy.internal.iq$a */
    public interface C11783a {
    }

    /* renamed from: com.tapjoy.internal.iq$b */
    public interface C11784b {
        /* renamed from: a */
        Bitmap mo72723a();
    }

    public C11780iq(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo72707a(C11778io ioVar, byte[] bArr) {
        try {
            this.f28746a = new C11775im(new C11785ir(), ioVar, ByteBuffer.wrap(bArr));
            if (this.f28749d) {
                m34212f();
            } else {
                m34209d();
            }
        } catch (Exception unused) {
            this.f28746a = null;
            Object[] objArr = new Object[1];
        }
    }

    public final void setBytes(byte[] bArr) {
        C11775im imVar = new C11775im();
        this.f28746a = imVar;
        try {
            imVar.mo72698a(bArr);
            if (this.f28749d) {
                m34212f();
            } else {
                m34209d();
            }
        } catch (Exception unused) {
            this.f28746a = null;
            Object[] objArr = new Object[1];
        }
    }

    public final long getFramesDisplayDuration() {
        return this.f28754i;
    }

    public final void setFramesDisplayDuration(long j) {
        this.f28754i = j;
    }

    /* renamed from: a */
    public final void mo72706a() {
        this.f28749d = true;
        m34212f();
    }

    /* renamed from: b */
    public final void mo72708b() {
        this.f28749d = false;
        Thread thread = this.f28752g;
        if (thread != null) {
            thread.interrupt();
            this.f28752g = null;
        }
    }

    /* renamed from: d */
    private void m34209d() {
        if (this.f28746a.f28694a != 0 && this.f28746a.mo72699a() && !this.f28749d) {
            this.f28750e = true;
            m34212f();
        }
    }

    /* renamed from: c */
    public final void mo72709c() {
        this.f28749d = false;
        this.f28750e = false;
        this.f28751f = true;
        mo72708b();
        this.f28748c.post(this.f28757l);
    }

    /* renamed from: e */
    private boolean m34210e() {
        return (this.f28749d || this.f28750e) && this.f28746a != null && this.f28752g == null;
    }

    public final int getGifWidth() {
        return this.f28746a.f28696c.f28734f;
    }

    public final int getGifHeight() {
        return this.f28746a.f28696c.f28735g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0008  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b3 A[ADDED_TO_REGION, EDGE_INSN: B:64:0x00b3->B:56:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.f28749d
            if (r0 != 0) goto L_0x0008
            boolean r0 = r11.f28750e
            if (r0 == 0) goto L_0x00b5
        L_0x0008:
            com.tapjoy.internal.im r0 = r11.f28746a
            com.tapjoy.internal.io r1 = r0.f28696c
            int r1 = r1.f28731c
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 > 0) goto L_0x0015
        L_0x0013:
            r0 = r3
            goto L_0x003d
        L_0x0015:
            int r1 = r0.f28694a
            com.tapjoy.internal.io r5 = r0.f28696c
            int r5 = r5.f28731c
            int r5 = r5 - r4
            if (r1 != r5) goto L_0x0023
            int r1 = r0.f28695b
            int r1 = r1 + r4
            r0.f28695b = r1
        L_0x0023:
            com.tapjoy.internal.io r1 = r0.f28696c
            int r1 = r1.f28741m
            if (r1 == r2) goto L_0x0032
            int r1 = r0.f28695b
            com.tapjoy.internal.io r5 = r0.f28696c
            int r5 = r5.f28741m
            if (r1 <= r5) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            int r1 = r0.f28694a
            int r1 = r1 + r4
            com.tapjoy.internal.io r5 = r0.f28696c
            int r5 = r5.f28731c
            int r1 = r1 % r5
            r0.f28694a = r1
            r0 = r4
        L_0x003d:
            r5 = 0
            long r7 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            com.tapjoy.internal.im r1 = r11.f28746a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            android.graphics.Bitmap r1 = r1.mo72700b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            r11.f28747b = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            com.tapjoy.internal.iq$b r1 = r11.f28753h     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            if (r1 == 0) goto L_0x0057
            com.tapjoy.internal.iq$b r1 = r11.f28753h     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            android.graphics.Bitmap r1 = r1.mo72723a()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            r11.f28747b = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
        L_0x0057:
            long r9 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            long r9 = r9 - r7
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r7
            android.os.Handler r1 = r11.f28748c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            java.lang.Runnable r7 = r11.f28756k     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            r1.post(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            goto L_0x006f
        L_0x0068:
            r9 = r5
        L_0x0069:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            goto L_0x006f
        L_0x006c:
            r9 = r5
        L_0x006d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
        L_0x006f:
            r11.f28750e = r3
            boolean r1 = r11.f28749d
            if (r1 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x0078
            goto L_0x00b3
        L_0x0078:
            com.tapjoy.internal.im r0 = r11.f28746a     // Catch:{ InterruptedException -> 0x00ae }
            com.tapjoy.internal.io r1 = r0.f28696c     // Catch:{ InterruptedException -> 0x00ae }
            int r1 = r1.f28731c     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 <= 0) goto L_0x009c
            int r1 = r0.f28694a     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 >= 0) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            int r1 = r0.f28694a     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 < 0) goto L_0x009b
            com.tapjoy.internal.io r3 = r0.f28696c     // Catch:{ InterruptedException -> 0x00ae }
            int r3 = r3.f28731c     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 >= r3) goto L_0x009b
            com.tapjoy.internal.io r0 = r0.f28696c     // Catch:{ InterruptedException -> 0x00ae }
            java.util.List<com.tapjoy.internal.in> r0 = r0.f28733e     // Catch:{ InterruptedException -> 0x00ae }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ InterruptedException -> 0x00ae }
            com.tapjoy.internal.in r0 = (com.tapjoy.internal.C11777in) r0     // Catch:{ InterruptedException -> 0x00ae }
            int r2 = r0.f28726i     // Catch:{ InterruptedException -> 0x00ae }
        L_0x009b:
            r3 = r2
        L_0x009c:
            long r0 = (long) r3     // Catch:{ InterruptedException -> 0x00ae }
            long r0 = r0 - r9
            int r0 = (int) r0     // Catch:{ InterruptedException -> 0x00ae }
            if (r0 <= 0) goto L_0x00ae
            long r1 = r11.f28754i     // Catch:{ InterruptedException -> 0x00ae }
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00aa
            long r0 = r11.f28754i     // Catch:{ InterruptedException -> 0x00ae }
            goto L_0x00ab
        L_0x00aa:
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00ae }
        L_0x00ab:
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00ae }
        L_0x00ae:
            boolean r0 = r11.f28749d
            if (r0 != 0) goto L_0x0000
            goto L_0x00b5
        L_0x00b3:
            r11.f28749d = r3
        L_0x00b5:
            boolean r0 = r11.f28751f
            if (r0 == 0) goto L_0x00c0
            android.os.Handler r0 = r11.f28748c
            java.lang.Runnable r1 = r11.f28757l
            r0.post(r1)
        L_0x00c0:
            r0 = 0
            r11.f28752g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11780iq.run():void");
    }

    public final C11784b getOnFrameAvailable() {
        return this.f28753h;
    }

    public final void setOnFrameAvailable(C11784b bVar) {
        this.f28753h = bVar;
    }

    public final C11783a getOnAnimationStop() {
        return this.f28755j;
    }

    public final void setOnAnimationStop(C11783a aVar) {
        this.f28755j = aVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo72709c();
    }

    /* renamed from: f */
    private void m34212f() {
        if (m34210e()) {
            Thread thread = new Thread(this);
            this.f28752g = thread;
            thread.start();
        }
    }
}
