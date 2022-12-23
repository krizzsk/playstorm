package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: com.inmobi.media.ey */
/* compiled from: NativeAudioFocusManager */
public final class C6056ey {

    /* renamed from: a */
    final AudioAttributes f15404a = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();

    /* renamed from: b */
    private final Context f15405b;

    /* renamed from: c */
    private final C6057a f15406c;

    /* renamed from: d */
    private boolean f15407d = false;

    /* renamed from: e */
    private final Object f15408e = new Object();

    /* renamed from: f */
    private AudioFocusRequest f15409f;

    /* renamed from: g */
    private AudioManager.OnAudioFocusChangeListener f15410g;

    /* renamed from: com.inmobi.media.ey$a */
    /* compiled from: NativeAudioFocusManager */
    interface C6057a {
        /* renamed from: a */
        void mo35201a();

        /* renamed from: b */
        void mo35202b();

        /* renamed from: c */
        void mo35203c();

        /* renamed from: d */
        void mo35204d();
    }

    protected C6056ey(Context context, C6057a aVar) {
        this.f15405b = context;
        this.f15406c = aVar;
    }

    /* renamed from: a */
    public final void mo35198a() {
        synchronized (this.f15408e) {
            AudioManager audioManager = (AudioManager) this.f15405b.getSystemService("audio");
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f15409f != null) {
                        audioManager.abandonAudioFocusRequest(this.f15409f);
                    }
                } else if (this.f15410g != null) {
                    audioManager.abandonAudioFocus(this.f15410g);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35199b() {
        int i;
        synchronized (this.f15408e) {
            AudioManager audioManager = (AudioManager) this.f15405b.getSystemService("audio");
            if (audioManager != null) {
                if (this.f15410g == null) {
                    this.f15410g = new AudioManager.OnAudioFocusChangeListener() {
                        public final void onAudioFocusChange(int i) {
                            C6056ey.this.m18129a(i);
                        }
                    };
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f15409f == null) {
                        this.f15409f = new AudioFocusRequest.Builder(2).setAudioAttributes(this.f15404a).setOnAudioFocusChangeListener(this.f15410g).build();
                    }
                    i = audioManager.requestAudioFocus(this.f15409f);
                } else {
                    i = audioManager.requestAudioFocus(this.f15410g, 3, 2);
                }
            } else {
                i = 0;
            }
        }
        if (i == 1) {
            this.f15406c.mo35201a();
        } else {
            this.f15406c.mo35202b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18129a(int i) {
        if (i == -2) {
            synchronized (this.f15408e) {
                this.f15407d = true;
            }
            this.f15406c.mo35204d();
        } else if (i == -1) {
            synchronized (this.f15408e) {
                this.f15407d = false;
            }
            this.f15406c.mo35204d();
        } else if (i == 1) {
            synchronized (this.f15408e) {
                if (this.f15407d) {
                    this.f15406c.mo35203c();
                }
                this.f15407d = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35200c() {
        mo35198a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15409f = null;
        }
        this.f15410g = null;
    }
}
