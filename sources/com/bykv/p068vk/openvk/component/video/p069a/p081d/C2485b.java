package com.bykv.p068vk.openvk.component.video.p069a.p081d;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.C2398a;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2407c;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.b */
/* compiled from: AndroidMediaPlayer */
public class C2485b extends C2484a {

    /* renamed from: b */
    private final MediaPlayer f5297b;

    /* renamed from: c */
    private final C2486a f5298c;

    /* renamed from: d */
    private C2398a f5299d;

    /* renamed from: e */
    private Surface f5300e;

    /* renamed from: f */
    private final Object f5301f;

    /* renamed from: g */
    private volatile boolean f5302g;

    public C2485b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f5301f = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f5297b = mediaPlayer;
        }
        m6084a(mediaPlayer);
        try {
            this.f5297b.setAudioStreamType(3);
        } catch (Throwable th) {
            C2536c.m6441c("CSJ_VIDEO", "setAudioStreamType error: ", th);
        }
        this.f5298c = new C2486a(this);
        m6086p();
    }

    /* renamed from: a */
    private void m6084a(MediaPlayer mediaPlayer) {
        Field declaredField;
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(new Class[]{Context.class, cls, Class.forName("android.media.SubtitleController$Listener")}).newInstance(new Object[]{C2518b.m6270a(), null, null});
                declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", new Class[]{cls2, cls3}).invoke(mediaPlayer, new Object[]{newInstance, null});
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "setSubtitleController error: ", th);
            }
        }
    }

    /* renamed from: a */
    public void mo16240a(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f5301f) {
            try {
                if (!this.f5302g && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f5289a) {
                    this.f5297b.setDisplay(surfaceHolder);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo16239a(Surface surface) {
        m6087q();
        this.f5300e = surface;
        this.f5297b.setSurface(surface);
    }

    /* renamed from: a */
    public void mo16243a(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase(ShareInternalUtility.STAGING_PARAM)) {
            this.f5297b.setDataSource(str);
        } else {
            this.f5297b.setDataSource(parse.getPath());
        }
    }

    /* renamed from: a */
    public void mo16242a(FileDescriptor fileDescriptor) throws Throwable {
        this.f5297b.setDataSource(fileDescriptor);
    }

    /* renamed from: a */
    public synchronized void mo16241a(C2522c cVar) {
        this.f5299d = C2398a.m5785a(C2518b.m6270a(), cVar);
        C2407c.m5842a(cVar);
        this.f5297b.setDataSource(this.f5299d);
    }

    /* renamed from: o */
    private void m6085o() {
        C2398a aVar;
        if (Build.VERSION.SDK_INT >= 23 && (aVar = this.f5299d) != null) {
            try {
                aVar.close();
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "releaseMediaDataSource error: ", th);
            }
            this.f5299d = null;
        }
    }

    /* renamed from: e */
    public void mo16247e() throws Throwable {
        this.f5297b.start();
    }

    /* renamed from: f */
    public void mo16248f() throws Throwable {
        this.f5297b.stop();
    }

    /* renamed from: g */
    public void mo16250g() throws Throwable {
        this.f5297b.pause();
    }

    /* renamed from: h */
    public void mo16251h() {
        MediaPlayer mediaPlayer = this.f5297b;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    /* renamed from: b */
    public void mo16244b(boolean z) throws Throwable {
        this.f5297b.setScreenOnWhilePlaying(z);
    }

    /* renamed from: a */
    public void mo16238a(long j) throws Throwable {
        this.f5297b.seekTo((int) j);
    }

    /* renamed from: i */
    public long mo16252i() {
        try {
            return (long) this.f5297b.getCurrentPosition();
        } catch (Throwable th) {
            C2536c.m6441c("CSJ_VIDEO", "getCurrentPosition error: ", th);
            return 0;
        }
    }

    /* renamed from: j */
    public long mo16253j() {
        try {
            return (long) this.f5297b.getDuration();
        } catch (Throwable th) {
            C2536c.m6441c("CSJ_VIDEO", "getDuration error: ", th);
            return 0;
        }
    }

    /* renamed from: k */
    public void mo16254k() throws Throwable {
        synchronized (this.f5301f) {
            if (!this.f5302g) {
                this.f5297b.release();
                this.f5302g = true;
                m6087q();
                m6085o();
                mo16222a();
                m6086p();
            }
        }
    }

    /* renamed from: l */
    public void mo16255l() throws Throwable {
        try {
            this.f5297b.reset();
        } catch (Throwable th) {
            C2536c.m6441c("CSJ_VIDEO", "reset error: ", th);
        }
        m6085o();
        mo16222a();
        m6086p();
    }

    /* renamed from: c */
    public void mo16245c(boolean z) throws Throwable {
        this.f5297b.setLooping(z);
    }

    /* renamed from: d */
    public void mo16246d(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f5297b;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    /* renamed from: m */
    public int mo16256m() {
        MediaPlayer mediaPlayer = this.f5297b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public int mo16257n() {
        MediaPlayer mediaPlayer = this.f5297b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: p */
    private void m6086p() {
        this.f5297b.setOnPreparedListener(this.f5298c);
        this.f5297b.setOnBufferingUpdateListener(this.f5298c);
        this.f5297b.setOnCompletionListener(this.f5298c);
        this.f5297b.setOnSeekCompleteListener(this.f5298c);
        this.f5297b.setOnVideoSizeChangedListener(this.f5298c);
        this.f5297b.setOnErrorListener(this.f5298c);
        this.f5297b.setOnInfoListener(this.f5298c);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.b$a */
    /* compiled from: AndroidMediaPlayer */
    private static class C2486a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C2485b> f5303a;

        public C2486a(C2485b bVar) {
            this.f5303a = new WeakReference<>(bVar);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2536c.m6436b("CSJ_VIDEO", "onInfo: ");
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar == null || !bVar.mo16235b(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th);
                return false;
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2536c.m6438b("CSJ_VIDEO", "onError: ", Integer.valueOf(i), Integer.valueOf(i2));
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar == null || !bVar.mo16233a(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th);
                return false;
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar != null) {
                    bVar.mo16224a(i, i2, 1, 1);
                }
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th);
            }
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar != null) {
                    bVar.mo16237d();
                }
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th);
            }
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar != null) {
                    bVar.mo16223a(i);
                }
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th);
            }
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar != null) {
                    bVar.mo16236c();
                }
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th);
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C2485b bVar = (C2485b) this.f5303a.get();
                if (bVar != null) {
                    bVar.mo16234b();
                }
            } catch (Throwable th) {
                C2536c.m6441c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        m6087q();
    }

    /* renamed from: q */
    private void m6087q() {
        try {
            if (this.f5300e != null) {
                this.f5300e.release();
                this.f5300e = null;
            }
        } catch (Throwable unused) {
        }
    }
}
