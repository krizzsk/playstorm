package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice implements Runnable {

    /* renamed from: h */
    private static int f29453h = 0;

    /* renamed from: i */
    private static int f29454i = 1;

    /* renamed from: j */
    private static int f29455j = 2;

    /* renamed from: k */
    private static int f29456k = 3;

    /* renamed from: a */
    private volatile Thread f29457a = null;

    /* renamed from: b */
    private volatile boolean f29458b = false;

    /* renamed from: c */
    private AudioTrack f29459c = null;

    /* renamed from: d */
    private boolean f29460d = false;

    /* renamed from: e */
    private ByteBuffer f29461e = null;

    /* renamed from: f */
    private byte[] f29462f = null;

    /* renamed from: g */
    private volatile C12472a f29463g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f29459c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f29459c.stop();
            }
            this.f29459c.release();
            this.f29459c = null;
        }
        this.f29461e = null;
        this.f29462f = null;
        this.f29460d = false;
    }

    public synchronized void close() {
        stop();
    }

    /* access modifiers changed from: package-private */
    public native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f29457a != null && this.f29457a.isAlive();
    }

    public void run() {
        int i = 3;
        while (this.f29458b) {
            if (!this.f29460d && i > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(f29453h);
                int round = Math.round(((float) AudioTrack.getMinBufferSize(fmodGetInfo, 3, 2)) * 1.1f) & -4;
                int fmodGetInfo2 = fmodGetInfo(f29454i);
                int fmodGetInfo3 = fmodGetInfo(f29455j) * fmodGetInfo2 * 4;
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, 3, 2, fmodGetInfo3 > round ? fmodGetInfo3 : round, 1);
                this.f29459c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.f29460d = z;
                if (z) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo2 * 2 * 2);
                    this.f29461e = allocateDirect;
                    this.f29462f = new byte[allocateDirect.capacity()];
                    this.f29459c.play();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f29459c.getState() + ")");
                    releaseAudioTrack();
                    i += -1;
                }
            }
            if (this.f29460d) {
                if (fmodGetInfo(f29456k) == 1) {
                    fmodProcess(this.f29461e);
                    ByteBuffer byteBuffer = this.f29461e;
                    byteBuffer.get(this.f29462f, 0, byteBuffer.capacity());
                    this.f29459c.write(this.f29462f, 0, this.f29461e.capacity());
                    this.f29461e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f29457a != null) {
            stop();
        }
        this.f29457a = new Thread(this, "FMODAudioDevice");
        this.f29457a.setPriority(10);
        this.f29458b = true;
        this.f29457a.start();
        if (this.f29463g != null) {
            this.f29463g.mo77585b();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f29463g == null) {
            this.f29463g = new C12472a(this, i, i2);
            this.f29463g.mo77585b();
        }
        return this.f29463g.mo77584a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:16:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            java.lang.Thread r0 = r1.f29457a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r1.f29458b = r0     // Catch:{ all -> 0x001c }
            java.lang.Thread r0 = r1.f29457a     // Catch:{ InterruptedException -> 0x0001 }
            r0.join()     // Catch:{ InterruptedException -> 0x0001 }
            r0 = 0
            r1.f29457a = r0     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0011:
            org.fmod.a r0 = r1.f29463g     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            org.fmod.a r0 = r1.f29463g     // Catch:{ all -> 0x001c }
            r0.mo77586c()     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fmod.FMODAudioDevice.stop():void");
    }

    public synchronized void stopAudioRecord() {
        if (this.f29463g != null) {
            this.f29463g.mo77586c();
            this.f29463g = null;
        }
    }
}
