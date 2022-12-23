package com.p374my.target;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.internal.AnalyticsEvents;
import com.p374my.target.C9651c9;

/* renamed from: com.my.target.d9 */
public class C9668d9 implements C9651c9, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener, MediaPlayer.OnInfoListener {

    /* renamed from: a */
    public final C10008v8 f23777a;

    /* renamed from: b */
    public final C9669a f23778b;

    /* renamed from: c */
    public final MediaPlayer f23779c;

    /* renamed from: d */
    public C9651c9.C9652a f23780d;

    /* renamed from: e */
    public Surface f23781e;

    /* renamed from: f */
    public int f23782f;

    /* renamed from: g */
    public float f23783g;

    /* renamed from: h */
    public int f23784h;

    /* renamed from: i */
    public long f23785i;

    /* renamed from: j */
    public C10055y5 f23786j;

    /* renamed from: k */
    public Uri f23787k;

    /* renamed from: com.my.target.d9$a */
    public static class C9669a implements Runnable {

        /* renamed from: a */
        public final int f23788a;

        /* renamed from: b */
        public C9668d9 f23789b;

        /* renamed from: c */
        public C9651c9.C9652a f23790c;

        /* renamed from: d */
        public int f23791d;

        /* renamed from: e */
        public float f23792e;

        public C9669a(int i) {
            this.f23788a = i;
        }

        /* renamed from: a */
        public void mo63913a(C9651c9.C9652a aVar) {
            this.f23790c = aVar;
        }

        /* renamed from: a */
        public void mo63914a(C9668d9 d9Var) {
            this.f23789b = d9Var;
        }

        public void run() {
            C9668d9 d9Var = this.f23789b;
            if (d9Var != null) {
                float n = ((float) d9Var.mo63742n()) / 1000.0f;
                float m = this.f23789b.mo63741m();
                if (this.f23792e == n) {
                    this.f23791d++;
                } else {
                    C9651c9.C9652a aVar = this.f23790c;
                    if (aVar != null) {
                        aVar.mo63746a(n, m);
                    }
                    this.f23792e = n;
                    if (this.f23791d > 0) {
                        this.f23791d = 0;
                    }
                }
                if (this.f23791d > this.f23788a) {
                    C9651c9.C9652a aVar2 = this.f23790c;
                    if (aVar2 != null) {
                        aVar2.mo63752l();
                    }
                    this.f23791d = 0;
                }
            }
        }
    }

    public C9668d9() {
        this(new MediaPlayer(), new C9669a(50));
    }

    public C9668d9(MediaPlayer mediaPlayer, C9669a aVar) {
        this.f23777a = C10008v8.m29579a(200);
        this.f23782f = 0;
        this.f23783g = 1.0f;
        this.f23785i = 0;
        this.f23779c = mediaPlayer;
        this.f23778b = aVar;
        aVar.mo63914a(this);
    }

    /* renamed from: p */
    public static C9651c9 m27851p() {
        return new C9668d9();
    }

    /* renamed from: a */
    public void mo63723a() {
        if (this.f23782f == 2) {
            this.f23777a.mo65624a((Runnable) this.f23778b);
            try {
                this.f23779c.start();
            } catch (Throwable unused) {
                C9672e0.m27882a("start called in wrong state");
            }
            int i = this.f23784h;
            if (i > 0) {
                try {
                    this.f23779c.seekTo(i);
                } catch (Throwable unused2) {
                    C9672e0.m27882a("seekTo called in wrong state");
                }
                this.f23784h = 0;
            }
            this.f23782f = 1;
            C9651c9.C9652a aVar = this.f23780d;
            if (aVar != null) {
                aVar.mo63750h();
            }
        }
    }

    /* renamed from: a */
    public void mo63724a(long j) {
        this.f23785i = j;
        if (mo63912r()) {
            try {
                this.f23779c.seekTo((int) j);
                this.f23785i = 0;
            } catch (Throwable unused) {
                C9672e0.m27882a("seekTo called in wrong state");
            }
        }
    }

    /* renamed from: a */
    public void mo63725a(Uri uri, Context context) {
        this.f23787k = uri;
        C9672e0.m27882a("Play video in Android MediaPlayer: " + uri.toString());
        if (this.f23782f != 0) {
            this.f23779c.reset();
            this.f23782f = 0;
        }
        this.f23779c.setOnCompletionListener(this);
        this.f23779c.setOnErrorListener(this);
        this.f23779c.setOnPreparedListener(this);
        this.f23779c.setOnInfoListener(this);
        try {
            this.f23779c.setDataSource(context, uri);
            C9651c9.C9652a aVar = this.f23780d;
            if (aVar != null) {
                aVar.mo63749g();
            }
            try {
                this.f23779c.prepareAsync();
            } catch (Throwable unused) {
                C9672e0.m27882a("prepareAsync called in wrong state");
            }
            this.f23777a.mo65624a((Runnable) this.f23778b);
        } catch (Throwable th) {
            if (this.f23780d != null) {
                this.f23780d.mo63747a("ExoPlayer dataSource error: " + th.getMessage());
            }
            C9672e0.m27882a("DefaultVideoPlayerUnable to parse video source " + th.getMessage());
            this.f23782f = 5;
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo63726a(Uri uri, C10055y5 y5Var) {
        mo63728a(y5Var);
        mo63725a(uri, y5Var.getContext());
    }

    /* renamed from: a */
    public final void mo63902a(Surface surface) {
        this.f23779c.setSurface(surface);
        Surface surface2 = this.f23781e;
        if (!(surface2 == null || surface2 == surface)) {
            surface2.release();
        }
        this.f23781e = surface;
    }

    /* renamed from: a */
    public void mo63727a(C9651c9.C9652a aVar) {
        this.f23780d = aVar;
        this.f23778b.mo63913a(aVar);
    }

    /* renamed from: a */
    public void mo63728a(C10055y5 y5Var) {
        mo63911q();
        Surface surface = null;
        if (!(y5Var instanceof C10055y5)) {
            this.f23786j = null;
            mo63902a((Surface) null);
            return;
        }
        this.f23786j = y5Var;
        TextureView textureView = y5Var.getTextureView();
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("DefaultVideoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture != null) {
            surface = new Surface(surfaceTexture);
        }
        mo63902a(surface);
    }

    /* renamed from: b */
    public void mo63729b() {
        if (this.f23782f == 1) {
            this.f23784h = this.f23779c.getCurrentPosition();
            this.f23777a.mo65626b(this.f23778b);
            try {
                this.f23779c.pause();
            } catch (Throwable unused) {
                C9672e0.m27882a("pause called in wrong state");
            }
            this.f23782f = 2;
            C9651c9.C9652a aVar = this.f23780d;
            if (aVar != null) {
                aVar.mo63748f();
            }
        }
    }

    /* renamed from: c */
    public boolean mo63730c() {
        return this.f23782f == 1;
    }

    /* renamed from: d */
    public void mo63731d() {
        if (this.f23783g == 1.0f) {
            setVolume(0.0f);
        } else {
            setVolume(1.0f);
        }
    }

    public void destroy() {
        this.f23780d = null;
        this.f23782f = 5;
        this.f23777a.mo65626b(this.f23778b);
        mo63911q();
        if (mo63912r()) {
            try {
                this.f23779c.stop();
            } catch (Throwable unused) {
                C9672e0.m27882a("stop called in wrong state");
            }
        }
        this.f23779c.release();
        this.f23786j = null;
    }

    /* renamed from: e */
    public void mo63733e() {
        this.f23777a.mo65626b(this.f23778b);
        try {
            this.f23779c.stop();
        } catch (Throwable unused) {
            C9672e0.m27882a("stop called in wrong state");
        }
        C9651c9.C9652a aVar = this.f23780d;
        if (aVar != null) {
            aVar.mo63751j();
        }
        this.f23782f = 3;
    }

    /* renamed from: f */
    public boolean mo63734f() {
        return this.f23782f == 2;
    }

    /* renamed from: g */
    public boolean mo63735g() {
        int i = this.f23782f;
        return i >= 1 && i < 3;
    }

    /* renamed from: h */
    public void mo63736h() {
        try {
            this.f23779c.start();
            this.f23782f = 1;
        } catch (Throwable unused) {
            C9672e0.m27882a("replay called in wrong state");
        }
        mo63724a(0);
    }

    /* renamed from: i */
    public boolean mo63737i() {
        return this.f23783g == 0.0f;
    }

    /* renamed from: j */
    public void mo63738j() {
        setVolume(1.0f);
    }

    /* renamed from: k */
    public Uri mo63739k() {
        return this.f23787k;
    }

    /* renamed from: l */
    public void mo63740l() {
        setVolume(0.2f);
    }

    /* renamed from: m */
    public float mo63741m() {
        if (mo63912r()) {
            return ((float) this.f23779c.getDuration()) / 1000.0f;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public long mo63742n() {
        if (!mo63912r() || this.f23782f == 3) {
            return 0;
        }
        return (long) this.f23779c.getCurrentPosition();
    }

    /* renamed from: o */
    public void mo63743o() {
        setVolume(0.0f);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C9651c9.C9652a aVar;
        float m = mo63741m();
        this.f23782f = 4;
        if (m > 0.0f && (aVar = this.f23780d) != null) {
            aVar.mo63746a(m, m);
        }
        C9651c9.C9652a aVar2 = this.f23780d;
        if (aVar2 != null) {
            aVar2.onVideoCompleted();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f23777a.mo65626b(this.f23778b);
        mo63911q();
        mo63902a((Surface) null);
        String str = (i == 100 ? "Server died" : "Unknown error") + " (reason: " + (i2 == -1004 ? "IO error" : i2 == -1007 ? "Malformed error" : i2 == -1010 ? "Unsupported error" : i2 == -110 ? "Timed out error" : i2 == Integer.MIN_VALUE ? "Low-level system error" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN) + ")";
        C9672e0.m27882a("DefaultVideoPlayerVideo error: " + str);
        C9651c9.C9652a aVar = this.f23780d;
        if (aVar != null) {
            aVar.mo63747a(str);
        }
        if (this.f23782f > 0) {
            try {
                this.f23779c.reset();
            } catch (Throwable unused) {
                C9672e0.m27882a("reset called in wrong state");
            }
        }
        this.f23782f = 0;
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        C9651c9.C9652a aVar = this.f23780d;
        if (aVar == null) {
            return true;
        }
        aVar.mo63753o();
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        float f = this.f23783g;
        mediaPlayer.setVolume(f, f);
        this.f23782f = 1;
        try {
            mediaPlayer.start();
            long j = this.f23785i;
            if (j > 0) {
                mo63724a(j);
            }
        } catch (Throwable unused) {
            C9672e0.m27882a("start called in wrong state");
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        mo63902a(new Surface(surfaceTexture));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo63902a((Surface) null);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: q */
    public final void mo63911q() {
        C10055y5 y5Var = this.f23786j;
        TextureView textureView = y5Var != null ? y5Var.getTextureView() : null;
        if (textureView == null) {
            return;
        }
        if (textureView.getSurfaceTextureListener() != this) {
            Log.w("DefaultVideoPlayer", "SurfaceTextureListener already unset or replaced.");
        } else {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
    }

    /* renamed from: r */
    public final boolean mo63912r() {
        int i = this.f23782f;
        return i >= 1 && i <= 4;
    }

    public void setVolume(float f) {
        this.f23783g = f;
        if (mo63912r()) {
            this.f23779c.setVolume(f, f);
        }
        C9651c9.C9652a aVar = this.f23780d;
        if (aVar != null) {
            aVar.mo63745a(f);
        }
    }
}
