package com.p374my.target;

import android.content.Context;
import android.net.Uri;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.p374my.target.C9651c9;

/* renamed from: com.my.target.e9 */
public class C9687e9 implements Player.EventListener, C9651c9 {

    /* renamed from: a */
    public final C10008v8 f23844a = C10008v8.m29579a(200);

    /* renamed from: b */
    public final SimpleExoPlayer f23845b;

    /* renamed from: c */
    public final C9688a f23846c;

    /* renamed from: d */
    public C9651c9.C9652a f23847d;

    /* renamed from: e */
    public boolean f23848e;

    /* renamed from: f */
    public boolean f23849f;

    /* renamed from: g */
    public MediaSource f23850g;

    /* renamed from: h */
    public Uri f23851h;

    /* renamed from: com.my.target.e9$a */
    public static class C9688a implements Runnable {

        /* renamed from: a */
        public final int f23852a;

        /* renamed from: b */
        public final SimpleExoPlayer f23853b;

        /* renamed from: c */
        public C9651c9.C9652a f23854c;

        /* renamed from: d */
        public int f23855d;

        /* renamed from: e */
        public float f23856e;

        public C9688a(int i, SimpleExoPlayer simpleExoPlayer) {
            this.f23852a = i;
            this.f23853b = simpleExoPlayer;
        }

        /* renamed from: a */
        public void mo63967a(C9651c9.C9652a aVar) {
            this.f23854c = aVar;
        }

        public void run() {
            try {
                float currentPosition = ((float) this.f23853b.getCurrentPosition()) / 1000.0f;
                float duration = ((float) this.f23853b.getDuration()) / 1000.0f;
                if (this.f23856e == currentPosition) {
                    this.f23855d++;
                } else {
                    C9651c9.C9652a aVar = this.f23854c;
                    if (aVar != null) {
                        aVar.mo63746a(currentPosition, duration);
                    }
                    this.f23856e = currentPosition;
                    if (this.f23855d > 0) {
                        this.f23855d = 0;
                    }
                }
                if (this.f23855d > this.f23852a) {
                    C9651c9.C9652a aVar2 = this.f23854c;
                    if (aVar2 != null) {
                        aVar2.mo63752l();
                    }
                    this.f23855d = 0;
                }
            } catch (Throwable th) {
                String str = "ExoPlayer error: " + th.getMessage();
                C9672e0.m27882a(str);
                C9651c9.C9652a aVar3 = this.f23854c;
                if (aVar3 != null) {
                    aVar3.mo63747a(str);
                }
            }
        }
    }

    public C9687e9(Context context) {
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(context).build();
        this.f23845b = build;
        this.f23846c = new C9688a(50, build);
        build.addListener((Player.EventListener) this);
    }

    /* renamed from: a */
    public static C9687e9 m27944a(Context context) {
        return new C9687e9(context);
    }

    /* renamed from: a */
    public void mo63723a() {
        try {
            if (this.f23848e) {
                this.f23845b.setPlayWhenReady(true);
                return;
            }
            MediaSource mediaSource = this.f23850g;
            if (mediaSource != null) {
                this.f23845b.setMediaSource(mediaSource, true);
                this.f23845b.prepare();
            }
        } catch (Throwable th) {
            mo63965a(th);
        }
    }

    /* renamed from: a */
    public void mo63724a(long j) {
        try {
            this.f23845b.seekTo(j);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo63725a(Uri uri, Context context) {
        this.f23851h = uri;
        C9672e0.m27882a("Play video in ExoPlayer");
        this.f23849f = false;
        C9651c9.C9652a aVar = this.f23847d;
        if (aVar != null) {
            aVar.mo63749g();
        }
        try {
            if (!this.f23848e) {
                MediaSource a = C9705f9.m28042a(uri, context);
                this.f23850g = a;
                this.f23845b.setMediaSource(a);
                this.f23845b.prepare();
            }
            this.f23845b.setPlayWhenReady(true);
        } catch (Throwable th) {
            String str = "ExoPlayer error: " + th.getMessage();
            C9672e0.m27882a(str);
            C9651c9.C9652a aVar2 = this.f23847d;
            if (aVar2 != null) {
                aVar2.mo63747a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo63726a(Uri uri, C10055y5 y5Var) {
        mo63728a(y5Var);
        mo63725a(uri, y5Var.getContext());
    }

    /* renamed from: a */
    public void mo63727a(C9651c9.C9652a aVar) {
        this.f23847d = aVar;
        this.f23846c.mo63967a(aVar);
    }

    /* renamed from: a */
    public void mo63728a(C10055y5 y5Var) {
        if (y5Var != null) {
            try {
                y5Var.setExoPlayer(this.f23845b);
            } catch (Throwable th) {
                mo63965a(th);
            }
        } else {
            this.f23845b.setVideoTextureView((TextureView) null);
        }
    }

    /* renamed from: a */
    public final void mo63965a(Throwable th) {
        String str = "ExoPlayer error: " + th.getMessage();
        C9672e0.m27882a(str);
        C9651c9.C9652a aVar = this.f23847d;
        if (aVar != null) {
            aVar.mo63747a(str);
        }
    }

    /* renamed from: b */
    public void mo63729b() {
        if (this.f23848e && !this.f23849f) {
            try {
                this.f23845b.setPlayWhenReady(false);
            } catch (Throwable th) {
                mo63965a(th);
            }
        }
    }

    /* renamed from: c */
    public boolean mo63730c() {
        return this.f23848e && !this.f23849f;
    }

    /* renamed from: d */
    public void mo63731d() {
        try {
            setVolume(((double) this.f23845b.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
    }

    public void destroy() {
        this.f23851h = null;
        this.f23848e = false;
        this.f23849f = false;
        this.f23847d = null;
        try {
            this.f23845b.setVideoTextureView((TextureView) null);
            this.f23845b.stop();
            this.f23845b.release();
            this.f23845b.removeListener((Player.EventListener) this);
            this.f23844a.mo65626b(this.f23846c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public void mo63733e() {
        try {
            this.f23845b.stop(true);
        } catch (Throwable th) {
            mo63965a(th);
        }
    }

    /* renamed from: f */
    public boolean mo63734f() {
        return this.f23848e && this.f23849f;
    }

    /* renamed from: g */
    public boolean mo63735g() {
        return this.f23848e;
    }

    /* renamed from: h */
    public void mo63736h() {
        try {
            this.f23845b.seekTo(0);
            this.f23845b.setPlayWhenReady(true);
        } catch (Throwable th) {
            mo63965a(th);
        }
    }

    /* renamed from: i */
    public boolean mo63737i() {
        try {
            return this.f23845b.getVolume() == 0.0f;
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: j */
    public void mo63738j() {
        try {
            this.f23845b.setVolume(1.0f);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
        C9651c9.C9652a aVar = this.f23847d;
        if (aVar != null) {
            aVar.mo63745a(1.0f);
        }
    }

    /* renamed from: k */
    public Uri mo63739k() {
        return this.f23851h;
    }

    /* renamed from: l */
    public void mo63740l() {
        try {
            this.f23845b.setVolume(0.2f);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
    }

    /* renamed from: m */
    public float mo63741m() {
        try {
            return ((float) this.f23845b.getDuration()) / 1000.0f;
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: n */
    public long mo63742n() {
        try {
            return this.f23845b.getCurrentPosition();
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
            return 0;
        }
    }

    /* renamed from: o */
    public void mo63743o() {
        try {
            this.f23845b.setVolume(0.0f);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
        C9651c9.C9652a aVar = this.f23847d;
        if (aVar != null) {
            aVar.mo63745a(0.0f);
        }
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        this.f23849f = false;
        this.f23848e = false;
        if (this.f23847d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExoPlayer error: ");
            sb.append(exoPlaybackException != null ? exoPlaybackException.getMessage() : "Unknown video error");
            this.f23847d.mo63747a(sb.toString());
        }
    }

    public void onPlayerStateChanged(boolean z, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f23849f = false;
                        this.f23848e = false;
                        float m = mo63741m();
                        C9651c9.C9652a aVar = this.f23847d;
                        if (aVar != null) {
                            aVar.mo63746a(m, m);
                        }
                        C9651c9.C9652a aVar2 = this.f23847d;
                        if (aVar2 != null) {
                            aVar2.onVideoCompleted();
                        }
                    } else {
                        return;
                    }
                } else if (z) {
                    C9651c9.C9652a aVar3 = this.f23847d;
                    if (aVar3 != null) {
                        aVar3.mo63753o();
                    }
                    if (!this.f23848e) {
                        this.f23848e = true;
                    } else if (this.f23849f) {
                        this.f23849f = false;
                        C9651c9.C9652a aVar4 = this.f23847d;
                        if (aVar4 != null) {
                            aVar4.mo63750h();
                        }
                    }
                } else if (!this.f23849f) {
                    this.f23849f = true;
                    C9651c9.C9652a aVar5 = this.f23847d;
                    if (aVar5 != null) {
                        aVar5.mo63748f();
                    }
                }
            } else if (!z || this.f23848e) {
                return;
            }
            this.f23844a.mo65624a((Runnable) this.f23846c);
            return;
        } else if (this.f23848e) {
            this.f23848e = false;
            C9651c9.C9652a aVar6 = this.f23847d;
            if (aVar6 != null) {
                aVar6.mo63751j();
            }
        }
        this.f23844a.mo65626b(this.f23846c);
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onShuffleModeEnabledChanged(boolean z) {
    }

    public void setVolume(float f) {
        try {
            this.f23845b.setVolume(f);
        } catch (Throwable th) {
            C9672e0.m27882a("ExoPlayer error: " + th.getMessage());
        }
        C9651c9.C9652a aVar = this.f23847d;
        if (aVar != null) {
            aVar.mo63745a(f);
        }
    }
}
