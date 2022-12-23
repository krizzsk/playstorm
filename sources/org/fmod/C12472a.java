package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: org.fmod.a */
final class C12472a implements Runnable {

    /* renamed from: a */
    private final FMODAudioDevice f29464a;

    /* renamed from: b */
    private final ByteBuffer f29465b;

    /* renamed from: c */
    private final int f29466c;

    /* renamed from: d */
    private final int f29467d;

    /* renamed from: e */
    private final int f29468e = 2;

    /* renamed from: f */
    private volatile Thread f29469f;

    /* renamed from: g */
    private volatile boolean f29470g;

    /* renamed from: h */
    private AudioRecord f29471h;

    /* renamed from: i */
    private boolean f29472i;

    C12472a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f29464a = fMODAudioDevice;
        this.f29466c = i;
        this.f29467d = i2;
        this.f29465b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    /* renamed from: d */
    private void m34814d() {
        AudioRecord audioRecord = this.f29471h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f29471h.stop();
            }
            this.f29471h.release();
            this.f29471h = null;
        }
        this.f29465b.position(0);
        this.f29472i = false;
    }

    /* renamed from: a */
    public final int mo77584a() {
        return this.f29465b.capacity();
    }

    /* renamed from: b */
    public final void mo77585b() {
        if (this.f29469f != null) {
            mo77586c();
        }
        this.f29470g = true;
        this.f29469f = new Thread(this);
        this.f29469f.start();
    }

    /* renamed from: c */
    public final void mo77586c() {
        while (this.f29469f != null) {
            this.f29470g = false;
            try {
                this.f29469f.join();
                this.f29469f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void run() {
        int i = 3;
        while (this.f29470g) {
            if (!this.f29472i && i > 0) {
                m34814d();
                AudioRecord audioRecord = new AudioRecord(1, this.f29466c, this.f29467d, this.f29468e, this.f29465b.capacity());
                this.f29471h = audioRecord;
                int state = audioRecord.getState();
                boolean z = true;
                if (state != 1) {
                    z = false;
                }
                this.f29472i = z;
                if (z) {
                    this.f29465b.position(0);
                    this.f29471h.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f29471h.getState() + ")");
                    i += -1;
                    m34814d();
                }
            }
            if (this.f29472i && this.f29471h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f29471h;
                ByteBuffer byteBuffer = this.f29465b;
                this.f29464a.fmodProcessMicData(this.f29465b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f29465b.position(0);
            }
        }
        m34814d();
    }
}
