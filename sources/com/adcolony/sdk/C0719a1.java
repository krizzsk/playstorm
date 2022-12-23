package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0817e0;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.a1 */
class C0719a1 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private boolean f196A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f197B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f198C;

    /* renamed from: D */
    private boolean f199D;

    /* renamed from: E */
    private String f200E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f201F;

    /* renamed from: G */
    private FileInputStream f202G;

    /* renamed from: H */
    private C0841h0 f203H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C0752c f204I;

    /* renamed from: J */
    private Surface f205J;

    /* renamed from: K */
    private SurfaceTexture f206K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public RectF f207L = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C0729j f208M;

    /* renamed from: N */
    private ProgressBar f209N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public MediaPlayer f210O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C0823f1 f211P = C0764c0.m322b();

    /* renamed from: Q */
    private ExecutorService f212Q = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C0841h0 f213R;

    /* renamed from: a */
    private float f214a;

    /* renamed from: b */
    private float f215b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f216c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f217d;

    /* renamed from: e */
    private float f218e;

    /* renamed from: f */
    private float f219f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f220g;

    /* renamed from: h */
    private boolean f221h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Paint f222i = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Paint f223j = new Paint(1);

    /* renamed from: k */
    private int f224k;

    /* renamed from: l */
    private int f225l;

    /* renamed from: m */
    private int f226m;

    /* renamed from: n */
    private int f227n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f228o;

    /* renamed from: p */
    private int f229p;

    /* renamed from: q */
    private int f230q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public double f231r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public double f232s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f233t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f234u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f235v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f236w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f237x;

    /* renamed from: y */
    private boolean f238y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f239z;

    /* renamed from: com.adcolony.sdk.a1$a */
    class C0720a implements C0856j0 {
        C0720a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                C0719a1.this.mo10477i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$b */
    class C0721b implements C0856j0 {
        C0721b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                C0719a1.this.m168c(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$c */
    class C0722c implements C0856j0 {
        C0722c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                C0719a1.this.m170d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$d */
    class C0723d implements C0856j0 {
        C0723d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                C0719a1.this.mo10476h();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$e */
    class C0724e implements C0856j0 {
        C0724e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                boolean unused = C0719a1.this.m165b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$f */
    class C0725f implements C0856j0 {
        C0725f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0719a1.this.m160a(h0Var)) {
                boolean unused = C0719a1.this.m175e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$g */
    class C0726g implements Runnable {
        C0726g() {
        }

        public void run() {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C0719a1.this.f213R != null) {
                C0823f1 b = C0764c0.m322b();
                C0764c0.m326b(b, "id", C0719a1.this.f228o);
                C0764c0.m319a(b, "ad_session_id", C0719a1.this.f201F);
                C0764c0.m328b(b, "success", true);
                C0719a1.this.f213R.mo10773a(b).mo10776c();
                C0841h0 unused = C0719a1.this.f213R = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$h */
    class C0727h implements Runnable {
        C0727h() {
        }

        public void run() {
            long unused = C0719a1.this.f233t = 0;
            while (!C0719a1.this.f234u && !C0719a1.this.f237x && C0714a.m138c()) {
                Context a = C0714a.m129a();
                if (!C0719a1.this.f234u && !C0719a1.this.f239z && a != null && (a instanceof Activity)) {
                    if (C0719a1.this.f210O.isPlaying()) {
                        if (C0719a1.this.f233t == 0 && C0714a.f179d) {
                            long unused2 = C0719a1.this.f233t = System.currentTimeMillis();
                        }
                        boolean unused3 = C0719a1.this.f236w = true;
                        C0719a1 a1Var = C0719a1.this;
                        double unused4 = a1Var.f231r = ((double) a1Var.f210O.getCurrentPosition()) / 1000.0d;
                        C0719a1 a1Var2 = C0719a1.this;
                        double unused5 = a1Var2.f232s = ((double) a1Var2.f210O.getDuration()) / 1000.0d;
                        if (System.currentTimeMillis() - C0719a1.this.f233t > 1000 && !C0719a1.this.f198C && C0714a.f179d) {
                            if (C0719a1.this.f231r == 0.0d) {
                                new C0817e0.C0818a().mo10684a("getCurrentPosition() not working, firing ").mo10684a("AdSession.on_error").mo10685a(C0817e0.f434i);
                                C0719a1.this.m178g();
                            } else {
                                boolean unused6 = C0719a1.this.f198C = true;
                            }
                        }
                        if (C0719a1.this.f197B) {
                            C0719a1.this.mo10474e();
                        }
                    }
                    if (C0719a1.this.f236w && !C0719a1.this.f234u && !C0719a1.this.f237x) {
                        C0764c0.m326b(C0719a1.this.f211P, "id", C0719a1.this.f228o);
                        C0764c0.m326b(C0719a1.this.f211P, "container_id", C0719a1.this.f204I.mo10572c());
                        C0764c0.m319a(C0719a1.this.f211P, "ad_session_id", C0719a1.this.f201F);
                        C0764c0.m316a(C0719a1.this.f211P, "elapsed", C0719a1.this.f231r);
                        C0764c0.m316a(C0719a1.this.f211P, "duration", C0719a1.this.f232s);
                        new C0841h0("VideoView.on_progress", C0719a1.this.f204I.mo10591k(), C0719a1.this.f211P).mo10776c();
                    }
                    if (C0719a1.this.f235v || ((Activity) a).isFinishing()) {
                        boolean unused7 = C0719a1.this.f235v = false;
                        C0719a1.this.mo10478j();
                        return;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException unused8) {
                        C0719a1.this.m178g();
                        new C0817e0.C0818a().mo10684a("InterruptedException in ADCVideoView's update thread.").mo10685a(C0817e0.f433h);
                    }
                } else {
                    return;
                }
            }
            if (C0719a1.this.f235v) {
                C0719a1.this.mo10478j();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a1$i */
    class C0728i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f248a;

        C0728i(Context context) {
            this.f248a = context;
        }

        public void run() {
            C0729j unused = C0719a1.this.f208M = new C0729j(this.f248a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C0719a1.this.f216c * 4.0f), (int) (C0719a1.this.f216c * 4.0f));
            layoutParams.setMargins(0, C0719a1.this.f204I.mo10569b() - ((int) (C0719a1.this.f216c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            C0719a1.this.f204I.addView(C0719a1.this.f208M, layoutParams);
        }
    }

    /* renamed from: com.adcolony.sdk.a1$j */
    private class C0729j extends View {
        C0729j(Context context) {
            super(context);
            setWillNotDraw(false);
            Class<C0729j> cls = C0729j.class;
            try {
                cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
            } catch (Exception unused) {
            }
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(C0719a1.this.f207L, 270.0f, C0719a1.this.f217d, false, C0719a1.this.f222i);
            canvas.drawText("" + C0719a1.this.f220g, C0719a1.this.f207L.centerX(), (float) (((double) C0719a1.this.f207L.centerY()) + (((double) C0719a1.this.f223j.getFontMetrics().bottom) * 1.35d)), C0719a1.this.f223j);
            invalidate();
        }
    }

    C0719a1(Context context, C0841h0 h0Var, int i, C0752c cVar) {
        super(context);
        this.f204I = cVar;
        this.f203H = h0Var;
        this.f228o = i;
        setSurfaceTextureListener(this);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f234u = true;
        this.f231r = this.f232s;
        C0764c0.m326b(this.f211P, "id", this.f228o);
        C0764c0.m326b(this.f211P, "container_id", this.f204I.mo10572c());
        C0764c0.m319a(this.f211P, "ad_session_id", this.f201F);
        C0764c0.m316a(this.f211P, "elapsed", this.f231r);
        C0764c0.m316a(this.f211P, "duration", this.f232s);
        new C0841h0("VideoView.on_progress", this.f204I.mo10591k(), this.f211P).mo10776c();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m178g();
        C0817e0.C0818a aVar = new C0817e0.C0818a();
        aVar.mo10684a("MediaPlayer error: " + i + "," + i2).mo10685a(C0817e0.f433h);
        return true;
    }

    public void onMeasure(int i, int i2) {
        m184l();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f238y = true;
        if (this.f199D) {
            this.f204I.removeView(this.f209N);
        }
        if (this.f196A) {
            this.f229p = mediaPlayer.getVideoWidth();
            this.f230q = mediaPlayer.getVideoHeight();
            m184l();
            new C0817e0.C0818a().mo10684a("MediaPlayer getVideoWidth = ").mo10682a(mediaPlayer.getVideoWidth()).mo10685a(C0817e0.f430e);
            new C0817e0.C0818a().mo10684a("MediaPlayer getVideoHeight = ").mo10682a(mediaPlayer.getVideoHeight()).mo10685a(C0817e0.f430e);
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m326b(b, "id", this.f228o);
        C0764c0.m326b(b, "container_id", this.f204I.mo10572c());
        C0764c0.m319a(b, "ad_session_id", this.f201F);
        new C0841h0("VideoView.on_ready", this.f204I.mo10591k(), b).mo10776c();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f212Q;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.f212Q.submit(new C0726g());
            } catch (RejectedExecutionException unused) {
                m178g();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.f239z) {
            new C0817e0.C0818a().mo10684a("Null texture provided by system's onSurfaceTextureAvailable or ").mo10684a("MediaPlayer has been destroyed.").mo10685a(C0817e0.f434i);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f205J = surface;
        try {
            this.f210O.setSurface(surface);
        } catch (IllegalStateException unused) {
            new C0817e0.C0818a().mo10684a("IllegalStateException thrown when calling MediaPlayer.setSurface()").mo10685a(C0817e0.f433h);
            m178g();
        }
        this.f206K = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f206K = surfaceTexture;
        if (!this.f239z) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f206K = surfaceTexture;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f206K = surfaceTexture;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0857k b = C0714a.m136b();
        C0781d c = b.mo10827c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m326b(b2, "view_id", this.f228o);
        C0764c0.m319a(b2, "ad_session_id", this.f201F);
        C0764c0.m326b(b2, "container_x", this.f224k + x);
        C0764c0.m326b(b2, "container_y", this.f225l + y);
        C0764c0.m326b(b2, "view_x", x);
        C0764c0.m326b(b2, "view_y", y);
        C0764c0.m326b(b2, "id", this.f204I.mo10572c());
        if (action == 0) {
            new C0841h0("AdContainer.on_touch_began", this.f204I.mo10591k(), b2).mo10776c();
        } else if (action == 1) {
            if (!this.f204I.mo10598p()) {
                b.mo10817a(c.mo10658d().get(this.f201F));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f204I.mo10591k(), b2).mo10776c();
        } else if (action == 2) {
            new C0841h0("AdContainer.on_touch_moved", this.f204I.mo10591k(), b2).mo10776c();
        } else if (action == 3) {
            new C0841h0("AdContainer.on_touch_cancelled", this.f204I.mo10591k(), b2).mo10776c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f224k);
            C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f225l);
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0841h0("AdContainer.on_touch_began", this.f204I.mo10591k(), b2).mo10776c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f224k);
            C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f225l);
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f204I.mo10598p()) {
                b.mo10817a(c.mo10658d().get(this.f201F));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f204I.mo10591k(), b2).mo10776c();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m178g() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "id", this.f201F);
        new C0841h0("AdSession.on_error", this.f204I.mo10591k(), b).mo10776c();
        this.f234u = true;
    }

    /* renamed from: l */
    private void m184l() {
        double min = Math.min(((double) this.f226m) / ((double) this.f229p), ((double) this.f227n) / ((double) this.f230q));
        int i = (int) (((double) this.f229p) * min);
        int i2 = (int) (((double) this.f230q) * min);
        new C0817e0.C0818a().mo10684a("setMeasuredDimension to ").mo10682a(i).mo10684a(" by ").mo10682a(i2).mo10685a(C0817e0.f430e);
        setMeasuredDimension(i, i2);
        if (this.f196A) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: m */
    private void m187m() {
        try {
            this.f212Q.submit(new C0727h());
        } catch (RejectedExecutionException unused) {
            m178g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10476h() {
        if (!this.f238y) {
            new C0817e0.C0818a().mo10684a("ADCVideoView pause() called while MediaPlayer is not prepared.").mo10685a(C0817e0.f432g);
            return false;
        } else if (!this.f236w) {
            return false;
        } else {
            this.f210O.getCurrentPosition();
            this.f232s = (double) this.f210O.getDuration();
            this.f210O.pause();
            this.f237x = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10477i() {
        if (!this.f238y) {
            return false;
        }
        if (!this.f237x && C0714a.f179d) {
            this.f210O.start();
            m187m();
        } else if (!this.f234u && C0714a.f179d) {
            this.f210O.start();
            this.f237x = false;
            if (!this.f212Q.isShutdown()) {
                m187m();
            }
            C0729j jVar = this.f208M;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10478j() {
        new C0817e0.C0818a().mo10684a("MediaPlayer stopped and released.").mo10685a(C0817e0.f430e);
        try {
            if (!this.f234u && this.f238y && this.f210O.isPlaying()) {
                this.f210O.stop();
            }
        } catch (IllegalStateException unused) {
            new C0817e0.C0818a().mo10684a("Caught IllegalStateException when calling stop on MediaPlayer").mo10685a(C0817e0.f432g);
        }
        ProgressBar progressBar = this.f209N;
        if (progressBar != null) {
            this.f204I.removeView(progressBar);
        }
        this.f234u = true;
        this.f238y = false;
        this.f210O.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10479k() {
        this.f235v = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10473d() {
        Context a;
        C0823f1 a2 = this.f203H.mo10772a();
        this.f201F = C0764c0.m336h(a2, "ad_session_id");
        this.f224k = C0764c0.m332d(a2, "x");
        this.f225l = C0764c0.m332d(a2, "y");
        this.f226m = C0764c0.m332d(a2, "width");
        this.f227n = C0764c0.m332d(a2, "height");
        this.f197B = C0764c0.m325b(a2, "enable_timer");
        this.f199D = C0764c0.m325b(a2, "enable_progress");
        this.f200E = C0764c0.m336h(a2, "filepath");
        this.f229p = C0764c0.m332d(a2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH);
        this.f230q = C0764c0.m332d(a2, AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT);
        this.f219f = C0714a.m136b().mo10843n().mo10996s();
        new C0817e0.C0818a().mo10684a("Original video dimensions = ").mo10682a(this.f229p).mo10684a("x").mo10682a(this.f230q).mo10685a(C0817e0.f428c);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f226m, this.f227n);
        layoutParams.setMargins(this.f224k, this.f225l, 0, 0);
        layoutParams.gravity = 0;
        this.f204I.addView(this, layoutParams);
        if (this.f199D && (a = C0714a.m129a()) != null) {
            ProgressBar progressBar = new ProgressBar(a);
            this.f209N = progressBar;
            C0752c cVar = this.f204I;
            int i = (int) (this.f219f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
        }
        this.f210O = new MediaPlayer();
        this.f238y = false;
        try {
            if (!this.f200E.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f200E);
                this.f202G = fileInputStream;
                this.f210O.setDataSource(fileInputStream.getFD());
            } else {
                this.f196A = true;
                this.f210O.setDataSource(this.f200E);
            }
            this.f210O.setOnErrorListener(this);
            this.f210O.setOnPreparedListener(this);
            this.f210O.setOnCompletionListener(this);
            this.f210O.prepareAsync();
        } catch (IOException e) {
            new C0817e0.C0818a().mo10684a("Failed to create/prepare MediaPlayer: ").mo10684a(e.toString()).mo10685a(C0817e0.f433h);
            m178g();
        }
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.play", (C0856j0) new C0720a(), true));
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.set_bounds", (C0856j0) new C0721b(), true));
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.set_visible", (C0856j0) new C0722c(), true));
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.pause", (C0856j0) new C0723d(), true));
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.seek_to_time", (C0856j0) new C0724e(), true));
        this.f204I.mo10587i().add(C0714a.m130a("VideoView.set_volume", (C0856j0) new C0725f(), true));
        this.f204I.mo10589j().add("VideoView.play");
        this.f204I.mo10589j().add("VideoView.set_bounds");
        this.f204I.mo10589j().add("VideoView.set_visible");
        this.f204I.mo10589j().add("VideoView.pause");
        this.f204I.mo10589j().add("VideoView.seek_to_time");
        this.f204I.mo10589j().add("VideoView.set_volume");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10474e() {
        if (this.f221h) {
            this.f218e = (float) (360.0d / this.f232s);
            this.f223j.setColor(-3355444);
            this.f223j.setShadowLayer((float) ((int) (this.f219f * 2.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f223j.setTextAlign(Paint.Align.CENTER);
            this.f223j.setLinearText(true);
            this.f223j.setTextSize(this.f219f * 12.0f);
            this.f222i.setStyle(Paint.Style.STROKE);
            float f = this.f219f * 2.0f;
            if (f > 6.0f) {
                f = 6.0f;
            }
            if (f < 4.0f) {
                f = 4.0f;
            }
            this.f222i.setStrokeWidth(f);
            this.f222i.setShadowLayer((float) ((int) (this.f219f * 3.0f)), 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
            this.f222i.setColor(-3355444);
            Rect rect = new Rect();
            this.f223j.getTextBounds("0123456789", 0, 9, rect);
            this.f216c = (float) rect.height();
            Context a = C0714a.m129a();
            if (a != null) {
                C1038z0.m1202b((Runnable) new C0728i(a));
            }
            this.f221h = false;
        }
        this.f220g = (int) (this.f232s - this.f231r);
        float f2 = this.f216c;
        float f3 = (float) ((int) f2);
        this.f214a = f3;
        float f4 = (float) ((int) (3.0f * f2));
        this.f215b = f4;
        float f5 = f2 / 2.0f;
        float f6 = f2 * 2.0f;
        this.f207L.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
        this.f217d = (float) (((double) this.f218e) * (this.f232s - this.f231r));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10475f() {
        return this.f234u;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m168c(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f224k = C0764c0.m332d(a, "x");
        this.f225l = C0764c0.m332d(a, "y");
        this.f226m = C0764c0.m332d(a, "width");
        this.f227n = C0764c0.m332d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f224k, this.f225l, 0, 0);
        layoutParams.width = this.f226m;
        layoutParams.height = this.f227n;
        setLayoutParams(layoutParams);
        if (this.f197B && this.f208M != null) {
            int i = (int) (this.f216c * 4.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
            layoutParams2.setMargins(0, this.f204I.mo10569b() - ((int) (this.f216c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.f208M.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m165b(C0841h0 h0Var) {
        if (!this.f238y) {
            return false;
        }
        if (this.f234u) {
            this.f234u = false;
        }
        this.f213R = h0Var;
        int d = C0764c0.m332d(h0Var.mo10772a(), "time");
        int duration = this.f210O.getDuration() / 1000;
        this.f210O.setOnSeekCompleteListener(this);
        this.f210O.seekTo(d * 1000);
        if (duration == d) {
            this.f234u = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10470a() {
        if (this.f206K != null) {
            this.f239z = true;
        }
        this.f212Q.shutdown();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m160a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        return C0764c0.m332d(a, "id") == this.f228o && C0764c0.m332d(a, "container_id") == this.f204I.mo10572c() && C0764c0.m336h(a, "ad_session_id").equals(this.f204I.mo10563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10472c() {
        return this.f210O != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public MediaPlayer mo10471b() {
        return this.f210O;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m175e(C0841h0 h0Var) {
        boolean z = false;
        if (!this.f238y) {
            return false;
        }
        float c = (float) C0764c0.m330c(h0Var.mo10772a(), TapjoyConstants.TJC_VOLUME);
        AdColonyInterstitial j = C0714a.m136b().mo10839j();
        if (j != null) {
            if (((double) c) <= 0.0d) {
                z = true;
            }
            j.mo10373a(z);
        }
        this.f210O.setVolume(c, c);
        C0823f1 b = C0764c0.m322b();
        C0764c0.m328b(b, "success", true);
        h0Var.mo10773a(b).mo10776c();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m170d(C0841h0 h0Var) {
        C0729j jVar;
        C0729j jVar2;
        if (C0764c0.m325b(h0Var.mo10772a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
            if (this.f197B && (jVar2 = this.f208M) != null) {
                jVar2.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.f197B && (jVar = this.f208M) != null) {
            jVar.setVisibility(4);
        }
    }
}
