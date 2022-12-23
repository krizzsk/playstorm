package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a */
public final class C5076a extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    public Context f13579a;

    /* renamed from: b */
    public volatile C4668b f13580b = C4668b.Idle;

    /* renamed from: c */
    public boolean f13581c = false;

    /* renamed from: d */
    public boolean f13582d = false;

    /* renamed from: e */
    public boolean f13583e = false;

    /* renamed from: f */
    public boolean f13584f = false;

    /* renamed from: g */
    public boolean f13585g = false;

    /* renamed from: h */
    public Handler f13586h;

    /* renamed from: i */
    public C5088l f13587i;

    /* renamed from: j */
    public Surface f13588j;

    /* renamed from: k */
    public SurfaceHolder f13589k;

    /* renamed from: l */
    public long f13590l;

    /* renamed from: m */
    public int f13591m = 0;

    /* renamed from: n */
    public HandlerThread f13592n;

    /* renamed from: o */
    public Handler f13593o;

    /* renamed from: p */
    public Runnable f13594p;

    /* renamed from: q */
    public Runnable f13595q;

    /* renamed from: r */
    public int f13596r = 0;

    /* renamed from: s */
    public int f13597s = 0;

    /* renamed from: t */
    public int f13598t = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$a */
    public class C5077a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f13599a;

        /* renamed from: b */
        public final /* synthetic */ int f13600b;

        public C5077a(int i, int i2) {
            this.f13599a = i;
            this.f13600b = i2;
        }

        public void run() {
            if (C5076a.this.f13587i != null) {
                String format = String.format(Locale.ENGLISH, "Player Error: %d, %d", new Object[]{Integer.valueOf(this.f13599a), Integer.valueOf(this.f13600b)});
                ((C4640g) C5076a.this.f13587i).mo24908a((Exception) new C5089m(format));
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$b */
    public class C5078b implements Runnable {
        public C5078b() {
        }

        public void run() {
            C5076a.m15462a(C5076a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$c */
    public class C5079c implements Runnable {
        public C5079c() {
        }

        public void run() {
            IAlog.m16699a("%sCannot wait for video size anymore", C5076a.this.mo25690c());
            C5076a aVar = C5076a.this;
            if (aVar.f13596r == 0) {
                IAlog.m16699a("%sCannot wait for video size anymore. duration is still 0 - aborting", aVar.mo25690c());
                C5076a aVar2 = C5076a.this;
                aVar2.onError(aVar2, 0, 0);
                return;
            }
            IAlog.m16699a("%sCannot wait for video size anymore. moving into ready", aVar.mo25690c());
            boolean unused = C5076a.this.f13584f = true;
            C5076a.this.mo25691d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$d */
    public class C5080d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4668b f13604a;

        public C5080d(C4668b bVar) {
            this.f13604a = bVar;
        }

        public void run() {
            C5088l lVar = C5076a.this.f13587i;
            if (lVar != null) {
                ((C4640g) lVar).mo24907a(this.f13604a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$e */
    public class C5081e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ SurfaceHolder f13606a;

        public C5081e(SurfaceHolder surfaceHolder) {
            this.f13606a = surfaceHolder;
        }

        public void run() {
            C5076a.m15464a(C5076a.this, this.f13606a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$f */
    public class C5082f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Surface f13608a;

        public C5082f(Surface surface) {
            this.f13608a = surface;
        }

        public void run() {
            C5076a.m15463a(C5076a.this, this.f13608a);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$g */
    public class C5083g implements Runnable {
        public C5083g() {
        }

        public void run() {
            C5076a.m15466b(C5076a.this);
            Handler handler = C5076a.this.f13593o;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                C5076a.this.f13593o = null;
            }
            C5076a.this.f13592n = null;
            Looper.myLooper().quit();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$h */
    public class C5084h implements Runnable {
        public C5084h() {
        }

        public void run() {
            C5076a.this.mo25693f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$i */
    public class C5085i implements Runnable {
        public C5085i() {
        }

        public void run() {
            C5076a.m15467c(C5076a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$j */
    public class C5086j implements Runnable {
        public C5086j() {
        }

        public void run() {
            C5076a.m15468d(C5076a.this);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$k */
    public class C5087k implements Runnable {
        public C5087k() {
        }

        public void run() {
            C5076a aVar = C5076a.this;
            String c = aVar.mo25690c();
            long currentTimeMillis = System.currentTimeMillis();
            aVar.setVolume(0.0f, 0.0f);
            IAlog.m16702d(c + "timelog: " + "mute" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$l */
    public interface C5088l {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$m */
    public static class C5089m extends Exception {
        public C5089m(String str) {
            super(str);
        }

        public C5089m(Throwable th, String str) {
            super(str, th);
        }
    }

    public C5076a(Context context, C5088l lVar, Handler handler) {
        this.f13579a = context;
        this.f13587i = lVar;
        this.f13586h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        mo25684a();
    }

    /* renamed from: c */
    public static void m15467c(C5076a aVar) {
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        C4668b bVar = aVar.f13580b;
        if (bVar == C4668b.Paused || bVar == C4668b.Prepared || bVar == C4668b.f11663i || bVar == C4668b.Start_in_progress) {
            super.start();
            aVar.mo25685a(C4668b.Playing);
        } else {
            IAlog.m16699a("%s Start called in wrong mState! %s", aVar.mo25690c(), bVar);
            if (aVar.f13580b == C4668b.Seeking) {
                aVar.f13581c = true;
            }
        }
        IAlog.m16702d(c + "timelog: " + "start" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: d */
    public static void m15468d(C5076a aVar) {
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.m16699a("%s paused called cannot set to pause, canceled", aVar.mo25690c());
        }
        IAlog.m16702d(c + "timelog: " + "delayed pause" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public boolean mo25689b() {
        return (this.f13580b == C4668b.Idle || this.f13580b == C4668b.Preparing) ? false : true;
    }

    /* renamed from: e */
    public void mo25692e() {
        this.f13582d = true;
        if (mo25689b()) {
            mo25686a((Runnable) new C5087k());
        } else {
            IAlog.m16699a("%s mute called when player is not ready!", mo25690c());
        }
        IAlog.m16699a("%s mute", mo25690c());
    }

    /* renamed from: f */
    public final void mo25693f() {
        String c = mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        C4668b bVar = this.f13580b;
        C4668b bVar2 = C4668b.Idle;
        if (bVar == bVar2) {
            IAlog.m16699a("%s reset called, but player is already resetted. Do nothing", mo25690c());
            return;
        }
        mo25685a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.m16702d(c + "timelog: " + "reset" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public int getCurrentPosition() {
        if (mo25689b()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        return this.f13596r;
    }

    public int getVideoHeight() {
        return this.f13598t;
    }

    public int getVideoWidth() {
        return this.f13597s;
    }

    public boolean isPlaying() {
        return mo25689b() && this.f13580b != C4668b.Paused && super.isPlaying();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mo25685a(C4668b.f11663i);
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16703e("%s onError code = %d code2 = %d", mo25690c(), Integer.valueOf(i), Integer.valueOf(i2));
        mo25693f();
        this.f13586h.post(new C5077a(i, i2));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.m16699a("%s onPrepared %s gotPrepared = %s", mo25690c(), this, Boolean.valueOf(this.f13585g));
        IAlog.m16699a("%sMedia prepare time took %d msec", mo25690c(), Long.valueOf(System.currentTimeMillis() - this.f13590l));
        if (this.f13580b != C4668b.Preparing && this.f13580b != C4668b.Seeking) {
            IAlog.m16703e("%s onPrepared: previous error encountered. Aborting", mo25690c());
        } else if (!this.f13585g) {
            this.f13585g = true;
            mo25691d();
        } else {
            IAlog.m16699a("%s onPrepared called again??? We are already prepared", mo25690c());
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.m16699a("%s onSeekComplete called current position = %d", mo25690c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f13580b != C4668b.Seeking) {
            IAlog.m16699a("%s onSeekComplete called when Story is not seeking", mo25690c());
            return;
        }
        if (this.f13582d) {
            mo25692e();
        }
        if (this.f13581c) {
            IAlog.m16699a("%s onSeekComplete mPlayAfterSeek = true", mo25690c());
            this.f13580b = C4668b.Paused;
            start();
            return;
        }
        IAlog.m16699a("%s onSeekComplete mPlayAfterSeek = false", mo25690c());
        mo25685a(C4668b.Paused);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IAlog.m16699a("%s onVideoSizeChanged %d, %d", mo25690c(), Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.f13584f) {
            Runnable runnable = this.f13594p;
            if (runnable != null) {
                C5357n.f14225b.removeCallbacks(runnable);
                IAlog.m16699a("%s onVideoSizeChanged cancelling prepared runnable", mo25690c());
            }
            this.f13584f = true;
            if (i == 0 || i2 == 0) {
                IAlog.m16703e("%s onVideoSizeChanged - Invalid video size!", mo25690c());
                onError(this, 0, 0);
                return;
            }
            IAlog.m16699a("%sMedia got video size time took %d msec", mo25690c(), Long.valueOf(System.currentTimeMillis() - this.f13590l));
            this.f13597s = i;
            this.f13598t = i2;
            mo25691d();
        }
    }

    public void pause() {
        C4668b bVar;
        if (this.f13580b == C4668b.Idle || this.f13580b == C4668b.f11663i || this.f13580b == (bVar = C4668b.Paused) || this.f13580b == C4668b.Prepared) {
            IAlog.m16699a("%s paused called when player is in mState: %s ignoring", mo25690c(), this.f13580b);
            return;
        }
        mo25685a(bVar);
        if (mo25689b()) {
            mo25686a((Runnable) new C5086j());
        } else {
            IAlog.m16699a("%s paused called when player is not ready!", mo25690c());
        }
        IAlog.m16699a("%s pause", mo25690c());
    }

    public void release() {
        if (!this.f13583e) {
            mo25686a((Runnable) new C5083g());
        }
        this.f13587i = null;
        this.f13595q = null;
        this.f13583e = true;
        IAlog.m16699a("%s release called", mo25690c());
    }

    public void reset() {
        IAlog.m16699a("%s reset called", mo25690c());
        Runnable runnable = this.f13594p;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
        }
        mo25686a((Runnable) new C5084h());
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.m16699a("%s setDisplay called", mo25690c());
        if (!mo25689b()) {
            IAlog.m16699a("%s setDisplay called when player is not ready!", mo25690c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f13589k;
        if (surfaceHolder2 == null || !surfaceHolder2.equals(surfaceHolder)) {
            this.f13589k = surfaceHolder;
            mo25686a((Runnable) new C5081e(surfaceHolder));
            return;
        }
        IAlog.m16699a("%s setDisplay called with existing surface. ignoring!", mo25690c());
    }

    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    public void setSurface(Surface surface) {
        IAlog.m16699a("%s setSurface called", mo25690c());
        Surface surface2 = this.f13588j;
        if (surface2 == null || !surface2.equals(surface)) {
            this.f13588j = surface;
            mo25686a((Runnable) new C5082f(surface));
            return;
        }
        IAlog.m16699a("%s setSurface called with existing surface. ignoring!", mo25690c());
    }

    public void start() {
        IAlog.m16699a("%s Start called", mo25690c());
        if (!mo25689b()) {
            IAlog.m16699a("%s MediaPlayer: Start called when player is not ready! - mState = %s", mo25690c(), this.f13580b);
        } else if (this.f13580b == C4668b.Seeking) {
            this.f13581c = true;
        } else if (isPlaying()) {
            IAlog.m16699a("%s MediaPlayer: Start called when player is already playing. do nothing", mo25690c());
        } else {
            mo25685a(C4668b.Start_in_progress);
            mo25686a((Runnable) new C5085i());
        }
    }

    public void stop() {
        String c = mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        if (mo25689b()) {
            super.stop();
        }
        IAlog.m16699a("%s stop called", mo25690c());
        IAlog.m16702d(c + "timelog: " + "stop" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: b */
    public static void m15466b(C5076a aVar) {
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.m16702d(c + "timelog: " + "release" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    /* renamed from: a */
    public void mo25687a(String str) {
        String c = mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        this.f13584f = false;
        this.f13585g = false;
        if (isPlaying()) {
            IAlog.m16699a("%s loadUri stopping play before refresh", mo25690c());
            stop();
        }
        this.f13590l = System.currentTimeMillis();
        mo25693f();
        IAlog.m16699a("%s calling setDataSource with %s", mo25690c(), str);
        try {
            setDataSource(str);
            IAlog.m16699a("%s setDataSource succeeded, calling prepareAsync", mo25690c());
            mo25685a(C4668b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e) {
                IAlog.m16700b("%s prepareAsync failed with illegal mState exception: %s", mo25690c(), e.getMessage());
                int i = this.f13591m + 1;
                this.f13591m = i;
                if (i < 5) {
                    mo25687a(str);
                }
                this.f13591m = 0;
            }
            IAlog.m16702d(c + "timelog: " + "loadUri" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e2) {
            IAlog.m16700b("%s error setting data source %s", mo25690c(), str);
            IAlog.m16700b("%s exception message: %s", mo25690c(), e2.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo25688b(C4668b bVar) {
        if (this.f13580b == bVar) {
            IAlog.m16699a("%s updatePlayerState - mState didn't change!", mo25690c());
            return;
        }
        IAlog.m16699a("%s updatePlayerState - changing from %s to %s", mo25690c(), this.f13580b, bVar);
        this.f13580b = bVar;
        this.f13586h.post(new C5080d(bVar));
    }

    /* renamed from: d */
    public final void mo25691d() {
        if (!this.f13585g) {
            return;
        }
        if (this.f13584f) {
            IAlog.m16699a("%sMedia load time took %d msec", mo25690c(), Long.valueOf(System.currentTimeMillis() - this.f13590l));
            this.f13596r = super.getDuration();
            mo25685a(C4668b.Prepared);
            if (this.f13582d) {
                mo25692e();
                return;
            }
            return;
        }
        IAlog.m16699a("%sGot prepared only, waiting for video size", mo25690c());
        if (this.f13594p == null) {
            this.f13594p = new C5079c();
        }
        C5357n.f14225b.postDelayed(this.f13594p, 2000);
    }

    /* renamed from: c */
    public final String mo25690c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    /* renamed from: a */
    public final void mo25684a() {
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f13592n = handlerThread;
        handlerThread.start();
        this.f13593o = new Handler(this.f13592n.getLooper());
        this.f13595q = new C5078b();
    }

    /* renamed from: a */
    public final void mo25685a(C4668b bVar) {
        IAlog.m16699a("%s updatePlayerState - %s", mo25690c(), bVar);
        synchronized (this.f13580b) {
            mo25688b(bVar);
        }
    }

    /* renamed from: a */
    public static void m15463a(C5076a aVar, Surface surface) {
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m16699a("%s setSurface called with %s", aVar.mo25690c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.m16699a("%s setSurface with null! current surface cleared", aVar.mo25690c());
            } else {
                IAlog.m16699a("%s setSurface - replacing surface!", aVar.mo25690c());
            }
            IAlog.m16702d(c + "timelog: " + "setSurface" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m16699a("%s super.setSurface threw exception!", aVar.mo25690c());
        }
    }

    /* renamed from: a */
    public static void m15464a(C5076a aVar, SurfaceHolder surfaceHolder) {
        String c = aVar.mo25690c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.m16699a("%s setDisplay called with %s", aVar.mo25690c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.m16699a("%s setDisplay with null! current display cleared", aVar.mo25690c());
            } else {
                IAlog.m16699a("%s setDisplay - replacing surface holder!", aVar.mo25690c());
            }
            IAlog.m16702d(c + "timelog: " + "setDisplayInternal" + " took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.m16699a("%s super.setDisplay threw exception!", aVar.mo25690c());
        }
    }

    /* renamed from: a */
    public final void mo25686a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f13592n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f13592n.isInterrupted() && (handler2 = this.f13593o) != null) {
            handler2.post(runnable);
        }
        if ((this.f13597s == 0 || this.f13598t == 0 || this.f13596r == 0) && (handler = this.f13593o) != null) {
            handler.post(this.f13595q);
        }
    }

    /* renamed from: a */
    public static void m15462a(C5076a aVar) {
        if (aVar.mo25689b()) {
            aVar.f13597s = super.getVideoWidth();
            aVar.f13598t = super.getVideoHeight();
            aVar.f13596r = super.getDuration();
        }
    }
}
