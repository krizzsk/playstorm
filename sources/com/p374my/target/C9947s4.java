package com.p374my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.p374my.target.C10055y5;
import com.p374my.target.C9651c9;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.s4 */
public class C9947s4 implements C9860n4, AudioManager.OnAudioFocusChangeListener, C9651c9.C9652a, C10055y5.C10056a {

    /* renamed from: a */
    public final C9948a f24625a;

    /* renamed from: b */
    public C10055y5 f24626b;

    /* renamed from: c */
    public final C9711g2<VideoData> f24627c;

    /* renamed from: d */
    public final C9651c9 f24628d;

    /* renamed from: e */
    public final C9634b9 f24629e;

    /* renamed from: f */
    public final C9977t8 f24630f;

    /* renamed from: g */
    public final float f24631g;

    /* renamed from: h */
    public boolean f24632h;

    /* renamed from: com.my.target.s4$a */
    public interface C9948a {
        /* renamed from: a */
        void mo65371a(float f, float f2);

        /* renamed from: c */
        void mo65372c();

        /* renamed from: f */
        void mo65373f();

        /* renamed from: g */
        void mo65374g();

        /* renamed from: h */
        void mo65375h();

        /* renamed from: k */
        void mo65376k();

        /* renamed from: l */
        void mo65377l();

        void onVideoCompleted();

        void onVolumeChanged(float f);
    }

    public C9947s4(C9711g2<VideoData> g2Var, C10055y5 y5Var, C9948a aVar, C9863n7 n7Var, C9651c9 c9Var) {
        this.f24625a = aVar;
        this.f24626b = y5Var;
        this.f24628d = c9Var;
        y5Var.setAdVideoViewListener(this);
        this.f24627c = g2Var;
        C9634b9 a = C9634b9.m27707a(g2Var.getStatHolder());
        this.f24629e = a;
        this.f24630f = n7Var.mo64884a(g2Var);
        a.mo63650a((View) y5Var);
        this.f24631g = g2Var.getDuration();
        c9Var.mo63727a((C9651c9.C9652a) this);
        c9Var.setVolume(g2Var.isAutoMute() ? 0.0f : 1.0f);
    }

    /* renamed from: a */
    public static C9947s4 m29211a(C9711g2<VideoData> g2Var, C10055y5 y5Var, C9948a aVar, C9863n7 n7Var, C9651c9 c9Var) {
        return new C9947s4(g2Var, y5Var, aVar, n7Var, c9Var);
    }

    /* renamed from: a */
    public void mo65364a() {
        VideoData mediaData = this.f24627c.getMediaData();
        this.f24630f.mo65485c();
        if (mediaData != null) {
            if (!this.f24628d.mo63737i()) {
                mo65368b(this.f24626b.getContext());
            }
            this.f24628d.mo63727a((C9651c9.C9652a) this);
            this.f24628d.mo63728a(this.f24626b);
            mo65367a(mediaData);
        }
    }

    /* renamed from: a */
    public void mo63745a(float f) {
        this.f24625a.onVolumeChanged(f);
    }

    /* renamed from: a */
    public void mo63746a(float f, float f2) {
        float f3 = this.f24631g;
        if (f <= f3) {
            if (f != 0.0f) {
                this.f24625a.mo65371a(f, f2);
                this.f24630f.mo65476a(f, f2);
                this.f24629e.mo63649a(f, f2);
            }
            if (f == f2) {
                if (this.f24628d.mo63730c()) {
                    onVideoCompleted();
                }
                this.f24628d.mo63733e();
                return;
            }
            return;
        }
        mo63746a(f2, f3);
    }

    /* renamed from: a */
    public final void m29212b(int i) {
        if (i == -2 || i == -1) {
            mo64867i();
            C9672e0.m27882a("Audiofocus loss, pausing");
        }
    }

    /* renamed from: a */
    public final void mo65366a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    /* renamed from: a */
    public final void mo65367a(VideoData videoData) {
        String str = (String) videoData.getData();
        this.f24626b.mo65764a(videoData.getWidth(), videoData.getHeight());
        if (str != null) {
            this.f24632h = true;
            this.f24628d.mo63725a(Uri.parse(str), this.f24626b.getContext());
            return;
        }
        this.f24632h = false;
        this.f24628d.mo63725a(Uri.parse(videoData.getUrl()), this.f24626b.getContext());
    }

    /* renamed from: a */
    public void mo63747a(String str) {
        C9672e0.m27882a("Video playing error: " + str);
        this.f24630f.mo65488f();
        if (this.f24632h) {
            C9672e0.m27882a("Try to play video stream from URL");
            this.f24632h = false;
            VideoData mediaData = this.f24627c.getMediaData();
            if (mediaData != null) {
                this.f24628d.mo63725a(Uri.parse(mediaData.getUrl()), this.f24626b.getContext());
                return;
            }
        }
        this.f24625a.mo65372c();
        this.f24628d.mo63733e();
        this.f24628d.destroy();
    }

    /* renamed from: b */
    public final void mo65368b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    /* renamed from: d */
    public void mo64864d() {
        this.f24628d.mo63731d();
        this.f24630f.mo65484b(!this.f24628d.mo63737i());
    }

    public void destroy() {
        mo64867i();
        this.f24628d.destroy();
        this.f24629e.mo63647a();
    }

    /* renamed from: e */
    public void mo64866e() {
        this.f24630f.mo65486d();
        destroy();
    }

    /* renamed from: f */
    public void mo63748f() {
        this.f24625a.mo65373f();
    }

    /* renamed from: g */
    public void mo63749g() {
        this.f24625a.mo65374g();
    }

    /* renamed from: h */
    public void mo63750h() {
        this.f24625a.mo65375h();
    }

    /* renamed from: i */
    public void mo64867i() {
        mo65366a(this.f24626b.getContext());
        this.f24628d.mo63729b();
    }

    /* renamed from: j */
    public void mo63751j() {
    }

    /* renamed from: k */
    public void mo64868k() {
        if (this.f24627c.isAutoPlay()) {
            this.f24625a.mo65374g();
            mo65364a();
            return;
        }
        this.f24625a.mo65377l();
    }

    /* renamed from: l */
    public void mo63752l() {
        C9672e0.m27882a("Video playing timeout");
        this.f24630f.mo65489g();
        this.f24625a.mo65372c();
        this.f24628d.mo63733e();
        this.f24628d.destroy();
    }

    /* renamed from: o */
    public void mo63753o() {
        this.f24625a.mo65376k();
    }

    public void onAudioFocusChange(int i) {
        if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m29212b(i);
        } else {
            C9693f0.m27983c(new Runnable(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C9947s4.this.m29212b(this.f$1);
                }
            });
        }
    }

    public void onVideoCompleted() {
        this.f24625a.onVideoCompleted();
        this.f24628d.mo63733e();
    }

    /* renamed from: p */
    public void mo63891p() {
        if (this.f24628d instanceof C9687e9) {
            this.f24626b.setViewMode(1);
            this.f24628d.mo63728a(this.f24626b);
            VideoData mediaData = this.f24627c.getMediaData();
            if (this.f24628d.mo63730c() && mediaData != null) {
                if (mediaData.getData() != null) {
                    this.f24632h = true;
                }
                mo65367a(mediaData);
                return;
            }
            return;
        }
        mo63747a("Playback within no hardware accelerated view is available only with ExoPlayer");
    }

    /* renamed from: q */
    public void mo64869q() {
        if (this.f24628d.mo63730c()) {
            mo64867i();
            this.f24630f.mo65487e();
        } else if (this.f24628d.mo63742n() > 0) {
            mo65370r();
            this.f24630f.mo65490h();
        } else {
            mo65364a();
        }
    }

    /* renamed from: r */
    public void mo65370r() {
        this.f24628d.mo63723a();
        if (this.f24628d.mo63737i()) {
            mo65366a(this.f24626b.getContext());
        } else if (this.f24628d.mo63730c()) {
            mo65368b(this.f24626b.getContext());
        }
    }
}
