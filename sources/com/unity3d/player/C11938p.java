package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;

/* renamed from: com.unity3d.player.p */
public final class C11938p extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f29239a = false;

    /* renamed from: b */
    private final Context f29240b;

    /* renamed from: c */
    private final SurfaceView f29241c;

    /* renamed from: d */
    private final SurfaceHolder f29242d;

    /* renamed from: e */
    private final String f29243e;

    /* renamed from: f */
    private final int f29244f;

    /* renamed from: g */
    private final int f29245g;

    /* renamed from: h */
    private final boolean f29246h;

    /* renamed from: i */
    private final long f29247i;

    /* renamed from: j */
    private final long f29248j;

    /* renamed from: k */
    private final FrameLayout f29249k;

    /* renamed from: l */
    private final Display f29250l;

    /* renamed from: m */
    private int f29251m;

    /* renamed from: n */
    private int f29252n;

    /* renamed from: o */
    private int f29253o;

    /* renamed from: p */
    private int f29254p;

    /* renamed from: q */
    private MediaPlayer f29255q;

    /* renamed from: r */
    private MediaController f29256r;

    /* renamed from: s */
    private boolean f29257s = false;

    /* renamed from: t */
    private boolean f29258t = false;

    /* renamed from: u */
    private int f29259u = 0;

    /* renamed from: v */
    private boolean f29260v = false;

    /* renamed from: w */
    private boolean f29261w = false;

    /* renamed from: x */
    private C11939a f29262x;

    /* renamed from: y */
    private C11940b f29263y;

    /* renamed from: z */
    private volatile int f29264z = 0;

    /* renamed from: com.unity3d.player.p$a */
    public interface C11939a {
        /* renamed from: a */
        void mo73105a(int i);
    }

    /* renamed from: com.unity3d.player.p$b */
    public class C11940b implements Runnable {

        /* renamed from: b */
        private C11938p f29266b;

        /* renamed from: c */
        private boolean f29267c = false;

        public C11940b(C11938p pVar) {
            this.f29266b = pVar;
        }

        /* renamed from: a */
        public final void mo73106a() {
            this.f29267c = true;
        }

        public final void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (!this.f29267c) {
                if (C11938p.f29239a) {
                    C11938p.m34574b("Stopping the video player due to timeout.");
                }
                this.f29266b.CancelOnPrepare();
            }
        }
    }

    protected C11938p(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C11939a aVar) {
        super(context);
        this.f29262x = aVar;
        this.f29240b = context;
        this.f29249k = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f29241c = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f29242d = holder;
        holder.addCallback(this);
        this.f29249k.setBackgroundColor(i);
        this.f29249k.addView(this.f29241c);
        this.f29250l = ((WindowManager) this.f29240b.getSystemService("window")).getDefaultDisplay();
        this.f29243e = str;
        this.f29244f = i2;
        this.f29245g = i3;
        this.f29246h = z;
        this.f29247i = j;
        this.f29248j = j2;
        if (f29239a) {
            m34574b("fileName: " + this.f29243e);
        }
        if (f29239a) {
            m34574b("backgroundColor: " + i);
        }
        if (f29239a) {
            m34574b("controlMode: " + this.f29244f);
        }
        if (f29239a) {
            m34574b("scalingMode: " + this.f29245g);
        }
        if (f29239a) {
            m34574b("isURL: " + this.f29246h);
        }
        if (f29239a) {
            m34574b("videoOffset: " + this.f29247i);
        }
        if (f29239a) {
            m34574b("videoLength: " + this.f29248j);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private void m34572a(int i) {
        this.f29264z = i;
        C11939a aVar = this.f29262x;
        if (aVar != null) {
            aVar.mo73105a(this.f29264z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m34574b(String str) {
        Log.i("Video", "VideoPlayer: " + str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34576c() {
        /*
            r8 = this;
            android.media.MediaPlayer r0 = r8.f29255q
            if (r0 == 0) goto L_0x001c
            android.view.SurfaceHolder r1 = r8.f29242d
            r0.setDisplay(r1)
            boolean r0 = r8.f29260v
            if (r0 != 0) goto L_0x001b
            boolean r0 = f29239a
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "Resuming playback"
            m34574b(r0)
        L_0x0016:
            android.media.MediaPlayer r0 = r8.f29255q
            r0.start()
        L_0x001b:
            return
        L_0x001c:
            r0 = 0
            r8.m34572a((int) r0)
            r8.doCleanUp()
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            r8.f29255q = r0     // Catch:{ Exception -> 0x00cc }
            boolean r1 = r8.f29246h     // Catch:{ Exception -> 0x00cc }
            if (r1 == 0) goto L_0x003a
            android.content.Context r1 = r8.f29240b     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r8.f29243e     // Catch:{ Exception -> 0x00cc }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00cc }
            r0.setDataSource(r1, r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x003a:
            long r0 = r8.f29248j     // Catch:{ Exception -> 0x00cc }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f29243e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r2 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            long r4 = r8.f29247i     // Catch:{ Exception -> 0x00cc }
            long r6 = r8.f29248j     // Catch:{ Exception -> 0x00cc }
            r2.setDataSource(r3, r4, r6)     // Catch:{ Exception -> 0x00cc }
        L_0x0056:
            r0.close()     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x005a:
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ Exception -> 0x00cc }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f29243e     // Catch:{ IOException -> 0x007d }
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch:{ IOException -> 0x007d }
            android.media.MediaPlayer r1 = r8.f29255q     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            long r3 = r0.getStartOffset()     // Catch:{ IOException -> 0x007d }
            long r5 = r0.getLength()     // Catch:{ IOException -> 0x007d }
            r1.setDataSource(r2, r3, r5)     // Catch:{ IOException -> 0x007d }
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x008e
        L_0x007d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f29243e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r1 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            r1.setDataSource(r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x0056
        L_0x008e:
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            android.view.SurfaceHolder r1 = r8.f29242d     // Catch:{ Exception -> 0x00cc }
            r0.setDisplay(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r1 = 1
            r0.setScreenOnWhilePlaying(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r0.setOnBufferingUpdateListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r0.setOnCompletionListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r0.setOnPreparedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r0.setOnVideoSizeChangedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r1 = 3
            r0.setAudioStreamType(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f29255q     // Catch:{ Exception -> 0x00cc }
            r0.prepareAsync()     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.p$b r0 = new com.unity3d.player.p$b     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00cc }
            r8.f29263y = r0     // Catch:{ Exception -> 0x00cc }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.p$b r1 = r8.f29263y     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            r0.start()     // Catch:{ Exception -> 0x00cc }
            return
        L_0x00cc:
            r0 = move-exception
            boolean r1 = f29239a
            if (r1 == 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m34574b(r0)
        L_0x00e9:
            r0 = 2
            r8.m34572a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11938p.m34576c():void");
    }

    /* renamed from: d */
    private void m34577d() {
        if (!isPlaying()) {
            m34572a(1);
            if (f29239a) {
                m34574b("startVideoPlayback");
            }
            updateVideoLayout();
            if (!this.f29260v) {
                start();
            }
        }
    }

    public final void CancelOnPrepare() {
        m34572a(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73081a() {
        return this.f29260v;
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void destroyPlayer() {
        if (f29239a) {
            m34574b("destroyPlayer");
        }
        if (!this.f29260v) {
            pause();
        }
        doCleanUp();
    }

    /* access modifiers changed from: protected */
    public final void doCleanUp() {
        C11940b bVar = this.f29263y;
        if (bVar != null) {
            bVar.mo73106a();
            this.f29263y = null;
        }
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f29255q = null;
        }
        this.f29253o = 0;
        this.f29254p = 0;
        this.f29258t = false;
        this.f29257s = false;
    }

    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    public final int getBufferPercentage() {
        if (this.f29246h) {
            return this.f29259u;
        }
        return 100;
    }

    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public final int getDuration() {
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    public final boolean isPlaying() {
        boolean z = this.f29258t && this.f29257s;
        MediaPlayer mediaPlayer = this.f29255q;
        return mediaPlayer == null ? !z : mediaPlayer.isPlaying() || !z;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f29239a) {
            m34574b("onBufferingUpdate percent:" + i);
        }
        this.f29259u = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f29239a) {
            m34574b("onCompletion called");
        }
        destroyPlayer();
        m34572a(3);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 || (this.f29244f == 2 && i != 0 && !keyEvent.isSystem())) {
            destroyPlayer();
            m34572a(3);
            return true;
        }
        MediaController mediaController = this.f29256r;
        return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f29239a) {
            m34574b("onPrepared called");
        }
        C11940b bVar = this.f29263y;
        if (bVar != null) {
            bVar.mo73106a();
            this.f29263y = null;
        }
        int i = this.f29244f;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.f29240b);
            this.f29256r = mediaController;
            mediaController.setMediaPlayer(this);
            this.f29256r.setAnchorView(this);
            this.f29256r.setEnabled(true);
            Context context = this.f29240b;
            if (context instanceof Activity) {
                this.f29256r.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f29256r.show();
        }
        this.f29258t = true;
        if (1 != 0 && this.f29257s) {
            m34577d();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f29244f == 2 && action == 0) {
            destroyPlayer();
            m34572a(3);
            return true;
        }
        MediaController mediaController = this.f29256r;
        return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f29239a) {
            m34574b("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.f29257s = true;
            this.f29253o = i;
            this.f29254p = i2;
            if (this.f29258t && 1 != 0) {
                m34577d();
            }
        } else if (f29239a) {
            m34574b("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    public final void pause() {
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer != null) {
            if (this.f29261w) {
                mediaPlayer.pause();
            }
            this.f29260v = true;
        }
    }

    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public final void start() {
        if (f29239a) {
            m34574b("Start");
        }
        MediaPlayer mediaPlayer = this.f29255q;
        if (mediaPlayer != null) {
            if (this.f29261w) {
                mediaPlayer.start();
            }
            this.f29260v = false;
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f29239a) {
            m34574b("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.f29251m != i2 || this.f29252n != i3) {
            this.f29251m = i2;
            this.f29252n = i3;
            if (this.f29261w) {
                updateVideoLayout();
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f29239a) {
            m34574b("surfaceCreated called");
        }
        this.f29261w = true;
        m34576c();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f29239a) {
            m34574b("surfaceDestroyed called");
        }
        this.f29261w = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r5 <= r3) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = (int) (((float) r1) * r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r5 >= r3) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateVideoLayout() {
        /*
            r8 = this;
            boolean r0 = f29239a
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "updateVideoLayout"
            m34574b(r0)
        L_0x0009:
            android.media.MediaPlayer r0 = r8.f29255q
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r0 = r8.f29251m
            if (r0 == 0) goto L_0x0016
            int r0 = r8.f29252n
            if (r0 != 0) goto L_0x0034
        L_0x0016:
            android.content.Context r0 = r8.f29240b
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            r8.f29251m = r0
            int r0 = r1.heightPixels
            r8.f29252n = r0
        L_0x0034:
            int r0 = r8.f29251m
            int r1 = r8.f29252n
            boolean r2 = r8.f29257s
            if (r2 == 0) goto L_0x0064
            int r2 = r8.f29253o
            float r3 = (float) r2
            int r4 = r8.f29254p
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r5 = r5 / r6
            int r6 = r8.f29245g
            r7 = 1
            if (r6 != r7) goto L_0x0057
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
        L_0x004f:
            float r1 = (float) r0
            float r1 = r1 / r3
            int r1 = (int) r1
            goto L_0x006d
        L_0x0053:
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L_0x006d
        L_0x0057:
            r7 = 2
            if (r6 != r7) goto L_0x005f
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x004f
        L_0x005f:
            if (r6 != 0) goto L_0x006d
            r0 = r2
            r1 = r4
            goto L_0x006d
        L_0x0064:
            boolean r2 = f29239a
            if (r2 == 0) goto L_0x006d
            java.lang.String r2 = "updateVideoLayout: Video size is not known yet"
            m34574b(r2)
        L_0x006d:
            int r2 = r8.f29251m
            if (r2 != r0) goto L_0x0075
            int r2 = r8.f29252n
            if (r2 == r1) goto L_0x00a0
        L_0x0075:
            boolean r2 = f29239a
            if (r2 == 0) goto L_0x0092
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "frameWidth = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "; frameHeight = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            m34574b(r2)
        L_0x0092:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r0, r1, r3)
            android.widget.FrameLayout r0 = r8.f29249k
            android.view.SurfaceView r1 = r8.f29241c
            r0.updateViewLayout(r1, r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11938p.updateVideoLayout():void");
    }
}
