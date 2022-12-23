package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import com.inmobi.media.C5839av;
import com.inmobi.media.C6056ey;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.fj */
/* compiled from: NativeVideoView */
public class C6089fj extends TextureView implements MediaController.MediaPlayerControl, C6056ey.C6057a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f15489g = C6089fj.class.getSimpleName();

    /* renamed from: A */
    private MediaPlayer.OnCompletionListener f15490A = new MediaPlayer.OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C6089fj.m18203f(C6089fj.this);
            } catch (Exception e) {
                String unused = C6089fj.f15489g;
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
    };

    /* renamed from: B */
    private MediaPlayer.OnInfoListener f15491B = new MediaPlayer.OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (Build.VERSION.SDK_INT < 17 || 3 != i) {
                return true;
            }
            C6089fj.this.mo35253a(8, 8);
            return true;
        }
    };

    /* renamed from: C */
    private MediaPlayer.OnBufferingUpdateListener f15492C = new MediaPlayer.OnBufferingUpdateListener() {
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            int unused = C6089fj.this.f15516w = i;
        }
    };

    /* renamed from: D */
    private MediaPlayer.OnErrorListener f15493D = new MediaPlayer.OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String unused = C6089fj.f15489g;
            if (C6089fj.this.f15512s != null) {
                C6089fj.this.f15512s.mo35233a();
            }
            if (C6089fj.this.f15495a != null) {
                C6089fj.this.f15495a.f15470a = -1;
                C6089fj.this.f15495a.f15471b = -1;
            }
            if (C6089fj.this.f15515v != null) {
                C6089fj.this.f15515v.mo35240b();
            }
            C6089fj.m18205h(C6089fj.this);
            return true;
        }
    };

    /* renamed from: E */
    private final TextureView.SurfaceTextureListener f15494E = new TextureView.SurfaceTextureListener() {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface unused = C6089fj.this.f15503j = new Surface(surfaceTexture);
            C6089fj.this.m18209k();
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int intValue;
            boolean z = true;
            boolean z2 = C6089fj.this.f15495a != null && C6089fj.this.f15495a.f15471b == 3;
            if (i <= 0 || i2 <= 0) {
                z = false;
            }
            if (C6089fj.this.f15495a != null && z2 && z) {
                if (!(C6089fj.this.getTag() == null || (intValue = ((Integer) ((C5923cg) C6089fj.this.getTag()).f14913v.get("seekPosition")).intValue()) == 0)) {
                    C6089fj.this.mo35252a(intValue);
                }
                C6089fj.this.start();
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C6089fj.this.f15503j != null) {
                C6089fj.this.f15503j.release();
                Surface unused = C6089fj.this.f15503j = null;
            }
            if (C6089fj.this.f15515v != null) {
                C6089fj.this.f15515v.mo35240b();
            }
            C6089fj.this.mo35260g();
            return true;
        }
    };

    /* renamed from: a */
    public C6080fd f15495a = null;

    /* renamed from: b */
    public final C6056ey f15496b = new C6056ey(getContext(), this);

    /* renamed from: c */
    public Handler f15497c;

    /* renamed from: d */
    public boolean f15498d;

    /* renamed from: e */
    MediaPlayer.OnVideoSizeChangedListener f15499e = new MediaPlayer.OnVideoSizeChangedListener() {
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int unused = C6089fj.this.f15505l = mediaPlayer.getVideoWidth();
            int unused2 = C6089fj.this.f15506m = mediaPlayer.getVideoHeight();
            if (C6089fj.this.f15505l != 0 && C6089fj.this.f15506m != 0) {
                C6089fj.this.requestLayout();
            }
        }
    };

    /* renamed from: f */
    MediaPlayer.OnPreparedListener f15500f = new MediaPlayer.OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C6089fj.this.f15495a != null) {
                C6089fj.this.f15495a.f15470a = 2;
                C6089fj fjVar = C6089fj.this;
                boolean unused = fjVar.f15517x = fjVar.f15518y = fjVar.f15519z = true;
                if (C6089fj.this.f15515v != null) {
                    C6089fj.this.f15515v.setEnabled(true);
                }
                int unused2 = C6089fj.this.f15505l = mediaPlayer.getVideoWidth();
                int unused3 = C6089fj.this.f15506m = mediaPlayer.getVideoHeight();
                C5923cg cgVar = (C5923cg) C6089fj.this.getTag();
                int i = 0;
                if (cgVar != null && ((Boolean) cgVar.f14913v.get("didCompleteQ4")).booleanValue()) {
                    C6089fj.this.mo35253a(8, 0);
                    if (((Byte) cgVar.f14913v.get("placementType")).byteValue() == 1) {
                        return;
                    }
                }
                if (C6089fj.this.getPlaybackEventListener() != null) {
                    C6089fj.this.getPlaybackEventListener().mo35232a((byte) 0);
                }
                if (cgVar != null && !((Boolean) cgVar.f14913v.get("didCompleteQ4")).booleanValue()) {
                    i = ((Integer) cgVar.f14913v.get("seekPosition")).intValue();
                }
                if (C6089fj.this.f15505l == 0 || C6089fj.this.f15506m == 0) {
                    if (3 == C6089fj.this.f15495a.f15471b && cgVar != null && ((Boolean) cgVar.f14913v.get("isFullScreen")).booleanValue()) {
                        C6089fj.this.start();
                    }
                } else if (3 == C6089fj.this.f15495a.f15471b) {
                    if (cgVar != null && ((Boolean) cgVar.f14913v.get("isFullScreen")).booleanValue()) {
                        C6089fj.this.start();
                    }
                    if (C6089fj.this.f15515v != null) {
                        C6089fj.this.f15515v.mo35239a();
                    }
                } else if (C6089fj.this.isPlaying()) {
                } else {
                    if ((i != 0 || C6089fj.this.getCurrentPosition() > 0) && C6089fj.this.f15515v != null) {
                        C6089fj.this.f15515v.mo35239a();
                    }
                }
            }
        }
    };

    /* renamed from: h */
    private Uri f15501h;

    /* renamed from: i */
    private Map<String, String> f15502i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Surface f15503j = null;

    /* renamed from: k */
    private int f15504k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f15505l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f15506m;

    /* renamed from: n */
    private int f15507n;

    /* renamed from: o */
    private int f15508o = Integer.MIN_VALUE;

    /* renamed from: p */
    private int f15509p = 0;

    /* renamed from: q */
    private C6100c f15510q;

    /* renamed from: r */
    private C6099b f15511r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6098a f15512s;

    /* renamed from: t */
    private boolean f15513t;

    /* renamed from: u */
    private C6101d f15514u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C6086fi f15515v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f15516w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f15517x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f15518y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f15519z;

    /* renamed from: com.inmobi.media.fj$a */
    /* compiled from: NativeVideoView */
    interface C6098a {
        /* renamed from: a */
        void mo35233a();
    }

    /* renamed from: com.inmobi.media.fj$b */
    /* compiled from: NativeVideoView */
    public interface C6099b {
        /* renamed from: a */
        void mo35232a(byte b);
    }

    /* renamed from: com.inmobi.media.fj$c */
    /* compiled from: NativeVideoView */
    interface C6100c {
        /* renamed from: a */
        void mo35231a(byte b);
    }

    public void seekTo(int i) {
    }

    /* renamed from: com.inmobi.media.fj$d */
    /* compiled from: NativeVideoView */
    static final class C6101d extends Handler {

        /* renamed from: a */
        private final WeakReference<C6089fj> f15528a;

        C6101d(C6089fj fjVar) {
            this.f15528a = new WeakReference<>(fjVar);
        }

        public final void handleMessage(Message message) {
            C6089fj fjVar = (C6089fj) this.f15528a.get();
            if (fjVar != null && message.what == 1) {
                int duration = fjVar.getDuration();
                int currentPosition = fjVar.getCurrentPosition();
                if (!(duration == -1 || currentPosition == 0)) {
                    C5923cg cgVar = (C5923cg) fjVar.getTag();
                    if (!((Boolean) cgVar.f14913v.get("didCompleteQ1")).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        cgVar.f14913v.put("didCompleteQ1", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().mo35231a((byte) 0);
                    }
                    if (!((Boolean) cgVar.f14913v.get("didCompleteQ2")).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        cgVar.f14913v.put("didCompleteQ2", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().mo35231a((byte) 1);
                    }
                    if (!((Boolean) cgVar.f14913v.get("didCompleteQ3")).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        cgVar.f14913v.put("didCompleteQ3", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().mo35231a((byte) 2);
                    }
                    boolean booleanValue = ((Boolean) cgVar.f14913v.get("didQ4Fire")).booleanValue();
                    if ((((float) currentPosition) / ((float) duration)) * 100.0f > ((float) cgVar.f15011E) && !booleanValue) {
                        fjVar.getPlaybackEventListener().mo35232a((byte) 5);
                    }
                }
                sendEmptyMessageDelayed(1, 1000);
            }
            super.handleMessage(message);
        }
    }

    public C6089fj(Context context) {
        super(context);
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public final void mo35254a(C5923cg cgVar) {
        C6080fd fdVar;
        this.f15505l = 0;
        this.f15506m = 0;
        this.f15501h = Uri.parse(((C6001dt) cgVar.f14896e).mo35108b());
        if (1 == ((Byte) cgVar.f14913v.get("placementType")).byteValue()) {
            fdVar = new C6080fd();
        } else {
            fdVar = C6080fd.m18177a();
        }
        this.f15495a = fdVar;
        int i = this.f15504k;
        if (i != 0) {
            fdVar.setAudioSessionId(i);
        } else {
            this.f15504k = fdVar.getAudioSessionId();
        }
        try {
            this.f15495a.setDataSource(getContext().getApplicationContext(), this.f15501h, this.f15502i);
            setTag(cgVar);
            this.f15514u = new C6101d(this);
            setSurfaceTextureListener(this.f15494E);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
        } catch (IOException unused) {
            this.f15495a.f15470a = -1;
            this.f15495a.f15471b = -1;
        }
    }

    public C6080fd getMediaPlayer() {
        return this.f15495a;
    }

    /* renamed from: e */
    public final void mo35258e() {
        Surface surface = this.f15503j;
        if (surface != null) {
            surface.release();
            this.f15503j = null;
        }
        mo35260g();
    }

    public int getState() {
        C6080fd fdVar = this.f15495a;
        if (fdVar != null) {
            return fdVar.f15470a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r1 > r6) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r0 = getDefaultSize(r0, r6)     // Catch:{ Exception -> 0x008c }
            int r1 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r1 = getDefaultSize(r1, r7)     // Catch:{ Exception -> 0x008c }
            int r2 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            if (r2 <= 0) goto L_0x0089
            int r2 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            if (r2 <= 0) goto L_0x0089
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch:{ Exception -> 0x008c }
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch:{ Exception -> 0x008c }
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch:{ Exception -> 0x008c }
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ Exception -> 0x008c }
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x004a
            if (r1 != r2) goto L_0x004a
            int r0 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r7
            int r1 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003a
            int r7 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r7 = r7 * r6
            int r0 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r1 = r7 / r0
            goto L_0x005a
        L_0x003a:
            int r0 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r7
            int r1 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0068
            int r6 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r6 = r6 * r7
            int r0 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r0 = r6 / r0
            goto L_0x0088
        L_0x004a:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005c
            int r0 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r6
            int r2 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0059
            if (r0 <= r7) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            r1 = r0
        L_0x005a:
            r0 = r6
            goto L_0x0089
        L_0x005c:
            if (r1 != r2) goto L_0x006a
            int r1 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r7
            int r2 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0087
            if (r1 <= r6) goto L_0x0087
        L_0x0068:
            r0 = r6
            goto L_0x0088
        L_0x006a:
            int r2 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r4 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            if (r1 != r3) goto L_0x0079
            if (r4 <= r7) goto L_0x0079
            int r1 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r7
            int r2 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 / r2
            goto L_0x007b
        L_0x0079:
            r1 = r2
            r7 = r4
        L_0x007b:
            if (r0 != r3) goto L_0x0087
            if (r1 <= r6) goto L_0x0087
            int r7 = r5.f15506m     // Catch:{ Exception -> 0x008c }
            int r7 = r7 * r6
            int r0 = r5.f15505l     // Catch:{ Exception -> 0x008c }
            int r1 = r7 / r0
            goto L_0x005a
        L_0x0087:
            r0 = r1
        L_0x0088:
            r1 = r7
        L_0x0089:
            r5.setMeasuredDimension(r0, r1)     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6089fj.onMeasure(int, int):void");
    }

    public C6086fi getMediaController() {
        return this.f15515v;
    }

    /* renamed from: f */
    public final boolean mo35259f() {
        C6080fd fdVar = this.f15495a;
        return (fdVar == null || fdVar.f15470a == -1 || this.f15495a.f15470a == 0 || this.f15495a.f15470a == 1) ? false : true;
    }

    public void setIsLockScreen(boolean z) {
        this.f15513t = z;
    }

    public void start() {
        boolean z;
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        if (Build.VERSION.SDK_INT < 20) {
            z = powerManager.isScreenOn();
        } else {
            z = powerManager.isInteractive();
        }
        boolean f = mo35259f();
        C5923cg cgVar = (C5923cg) getTag();
        boolean z2 = false;
        boolean z3 = cgVar == null || ((Boolean) cgVar.f14913v.get("shouldAutoPlay")).booleanValue();
        if (f && !z3) {
            mo35253a(8, 0);
        }
        if (f && z && !this.f15495a.isPlaying() && z3 && (this.f15513t || !inKeyguardRestrictedInputMode)) {
            mo35252a((cgVar == null || ((Boolean) cgVar.f14913v.get("didCompleteQ4")).booleanValue()) ? 0 : ((Integer) cgVar.f14913v.get("seekPosition")).intValue());
            if (cgVar != null) {
                z2 = cgVar.mo34919a();
            }
            if (z2) {
                this.f15496b.mo35199b();
            } else {
                mo35274h();
            }
            this.f15495a.start();
            this.f15495a.f15470a = 3;
            mo35253a(8, 8);
            if (cgVar != null) {
                cgVar.f14913v.put("didCompleteQ4", Boolean.FALSE);
                if (((Boolean) cgVar.f14913v.get("didPause")).booleanValue()) {
                    getPlaybackEventListener().mo35232a((byte) 3);
                    cgVar.f14913v.put("didPause", Boolean.FALSE);
                } else {
                    getPlaybackEventListener().mo35232a((byte) 1);
                }
                C6101d dVar = this.f15514u;
                if (dVar != null && !dVar.hasMessages(1)) {
                    this.f15514u.sendEmptyMessage(1);
                }
            }
            C6086fi fiVar = this.f15515v;
            if (fiVar != null) {
                fiVar.mo35239a();
            }
        }
        C6080fd fdVar = this.f15495a;
        if (fdVar != null) {
            fdVar.f15471b = 3;
        }
    }

    public void pause() {
        if (mo35259f() && this.f15495a.isPlaying()) {
            this.f15495a.pause();
            this.f15495a.f15470a = 4;
            this.f15496b.mo35198a();
            if (getTag() != null) {
                C5923cg cgVar = (C5923cg) getTag();
                cgVar.f14913v.put("didPause", Boolean.TRUE);
                cgVar.f14913v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            getPlaybackEventListener().mo35232a((byte) 2);
        }
        C6080fd fdVar = this.f15495a;
        if (fdVar != null) {
            fdVar.f15471b = 4;
        }
        this.f15498d = false;
    }

    public int getDuration() {
        if (mo35259f()) {
            return this.f15495a.getDuration();
        }
        return -1;
    }

    public int getCurrentPosition() {
        if (mo35259f()) {
            return this.f15495a.getCurrentPosition();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35252a(int i) {
        if (mo35259f()) {
            this.f15495a.seekTo(i);
        }
    }

    public boolean isPlaying() {
        return mo35259f() && this.f15495a.isPlaying();
    }

    public int getBufferPercentage() {
        if (this.f15495a != null) {
            return this.f15516w;
        }
        return 0;
    }

    public boolean canPause() {
        return this.f15517x;
    }

    public boolean canSeekBackward() {
        return this.f15518y;
    }

    public boolean canSeekForward() {
        return this.f15519z;
    }

    public int getAudioSessionId() {
        if (this.f15504k == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f15504k = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f15504k;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m18209k() {
        C6080fd fdVar;
        if (this.f15501h != null && this.f15503j != null) {
            if (this.f15495a == null) {
                C5923cg cgVar = (C5923cg) getTag();
                if (1 == (cgVar != null ? ((Byte) cgVar.f14913v.get("placementType")).byteValue() : 1)) {
                    fdVar = new C6080fd();
                } else {
                    fdVar = C6080fd.m18177a();
                }
                this.f15495a = fdVar;
                int i = this.f15504k;
                if (i != 0) {
                    fdVar.setAudioSessionId(i);
                } else {
                    this.f15504k = fdVar.getAudioSessionId();
                }
                try {
                    this.f15495a.setDataSource(getContext().getApplicationContext(), this.f15501h, this.f15502i);
                } catch (IOException unused) {
                    this.f15495a.f15470a = -1;
                    this.f15495a.f15471b = -1;
                    return;
                }
            }
            try {
                C5923cg cgVar2 = (C5923cg) getTag();
                this.f15495a.setOnPreparedListener(this.f15500f);
                this.f15495a.setOnVideoSizeChangedListener(this.f15499e);
                this.f15495a.setOnCompletionListener(this.f15490A);
                this.f15495a.setOnErrorListener(this.f15493D);
                this.f15495a.setOnInfoListener(this.f15491B);
                this.f15495a.setOnBufferingUpdateListener(this.f15492C);
                this.f15495a.setSurface(this.f15503j);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15495a.setAudioAttributes(this.f15496b.f15404a);
                } else {
                    this.f15495a.setAudioStreamType(3);
                }
                this.f15495a.prepareAsync();
                this.f15516w = 0;
                this.f15495a.f15470a = 1;
                m18213o();
                if (cgVar2 != null) {
                    if (((Boolean) cgVar2.f14913v.get("shouldAutoPlay")).booleanValue()) {
                        this.f15495a.f15471b = 3;
                    }
                    if (((Boolean) cgVar2.f14913v.get("didCompleteQ4")).booleanValue()) {
                        mo35253a(8, 0);
                        return;
                    }
                }
                mo35253a(0, 0);
            } catch (Exception e) {
                this.f15495a.f15470a = -1;
                this.f15495a.f15471b = -1;
                this.f15493D.onError(this.f15495a, 1, 0);
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
    }

    /* renamed from: g */
    public final void mo35260g() {
        if (this.f15495a != null) {
            this.f15496b.mo35200c();
            C6101d dVar = this.f15514u;
            if (dVar != null) {
                dVar.removeMessages(1);
            }
            if (getTag() != null) {
                ((C5923cg) getTag()).f14913v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            this.f15495a.f15470a = 0;
            this.f15495a.f15471b = 0;
            this.f15495a.reset();
            m18210l();
            if (getTag() == null) {
                this.f15495a.mo35234b();
            } else if (((Byte) ((C5923cg) getTag()).f14913v.get("placementType")).byteValue() == 0) {
                this.f15495a.mo35234b();
            }
            this.f15495a = null;
        }
    }

    public C6056ey getAudioFocusManager() {
        return this.f15496b;
    }

    /* renamed from: a */
    public final void mo35201a() {
        m18212n();
        C6086fi fiVar = this.f15515v;
        if (fiVar != null) {
            fiVar.mo35241c();
        }
    }

    /* renamed from: b */
    public final void mo35202b() {
        m18211m();
        C6086fi fiVar = this.f15515v;
        if (fiVar != null) {
            fiVar.mo35242d();
        }
    }

    /* renamed from: c */
    public final void mo35203c() {
        if (isPlaying()) {
            m18212n();
            C6086fi fiVar = this.f15515v;
            if (fiVar != null) {
                fiVar.mo35241c();
            }
        }
    }

    /* renamed from: d */
    public final void mo35204d() {
        m18211m();
        C6086fi fiVar = this.f15515v;
        if (fiVar != null) {
            fiVar.mo35242d();
        }
    }

    /* renamed from: l */
    private void m18210l() {
        this.f15495a.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        this.f15495a.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
        this.f15495a.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        this.f15495a.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        this.f15495a.setOnInfoListener((MediaPlayer.OnInfoListener) null);
        this.f15495a.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
    }

    /* renamed from: h */
    public final void mo35274h() {
        if (this.f15495a != null) {
            this.f15496b.mo35198a();
            m18211m();
        }
    }

    /* renamed from: m */
    private void m18211m() {
        C6080fd fdVar = this.f15495a;
        if (fdVar != null) {
            this.f15507n = 0;
            fdVar.setVolume(0.0f, 0.0f);
            if (getTag() != null) {
                ((C5923cg) getTag()).f14913v.put("currentMediaVolume", 0);
            }
        }
    }

    /* renamed from: i */
    public final void mo35275i() {
        if (this.f15495a == null) {
            return;
        }
        if (isPlaying()) {
            this.f15496b.mo35199b();
        } else {
            m18212n();
        }
    }

    /* renamed from: n */
    private void m18212n() {
        C6080fd fdVar = this.f15495a;
        if (fdVar != null) {
            this.f15507n = 1;
            fdVar.setVolume(1.0f, 1.0f);
            if (getTag() != null) {
                ((C5923cg) getTag()).f14913v.put("currentMediaVolume", 15);
            }
        }
    }

    public int getVolume() {
        if (mo35259f()) {
            return this.f15507n;
        }
        return -1;
    }

    /* renamed from: o */
    private void m18213o() {
        C6086fi fiVar;
        if (this.f15495a != null && (fiVar = this.f15515v) != null) {
            fiVar.setMediaPlayer(this);
            this.f15515v.setEnabled(mo35259f());
            this.f15515v.mo35239a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35253a(int i, int i2) {
        if (this.f15495a != null) {
            ProgressBar progressBar = ((C6102fk) getParent()).getProgressBar();
            ImageView poster = ((C6102fk) getParent()).getPoster();
            progressBar.setVisibility(i);
            poster.setVisibility(i2);
        }
    }

    public int getVideoVolume() {
        if (isPlaying()) {
            return this.f15507n;
        }
        return -1;
    }

    public int getLastVolume() {
        return this.f15508o;
    }

    public void setLastVolume(int i) {
        this.f15508o = i;
    }

    public void setMediaController(C6086fi fiVar) {
        if (fiVar != null) {
            this.f15515v = fiVar;
            m18213o();
        }
    }

    public C6100c getQuartileCompletedListener() {
        return this.f15510q;
    }

    public void setQuartileCompletedListener(C6100c cVar) {
        this.f15510q = cVar;
    }

    public C6099b getPlaybackEventListener() {
        return this.f15511r;
    }

    public void setPlaybackEventListener(C6099b bVar) {
        this.f15511r = bVar;
    }

    public void setMediaErrorListener(C6098a aVar) {
        this.f15512s = aVar;
    }

    public void setVideoURI(Uri uri) {
        this.f15501h = uri;
        this.f15502i = null;
        m18209k();
        requestLayout();
        invalidate();
    }

    /* renamed from: f */
    static /* synthetic */ void m18203f(C6089fj fjVar) {
        C6080fd fdVar = fjVar.f15495a;
        if (fdVar != null) {
            fdVar.f15470a = 5;
            fjVar.f15495a.f15471b = 5;
        }
        C6086fi fiVar = fjVar.f15515v;
        if (fiVar != null) {
            fiVar.mo35240b();
        }
        C6101d dVar = fjVar.f15514u;
        if (dVar != null) {
            dVar.removeMessages(1);
        }
        if (fjVar.getTag() != null) {
            C5923cg cgVar = (C5923cg) fjVar.getTag();
            if (!((Boolean) cgVar.f14913v.get("didCompleteQ4")).booleanValue()) {
                cgVar.f14913v.put("didCompleteQ4", Boolean.TRUE);
                if (fjVar.getQuartileCompletedListener() != null) {
                    fjVar.getQuartileCompletedListener().mo35231a((byte) 3);
                }
            }
            cgVar.f14913v.put("didSignalVideoCompleted", Boolean.TRUE);
            if (cgVar != null) {
                cgVar.f14913v.put("didCompleteQ1", Boolean.FALSE);
                cgVar.f14913v.put("didCompleteQ2", Boolean.FALSE);
                cgVar.f14913v.put("didCompleteQ3", Boolean.FALSE);
                cgVar.f14913v.put("didPause", Boolean.FALSE);
                cgVar.f14913v.put("didStartPlaying", Boolean.FALSE);
                cgVar.f14913v.put("didQ4Fire", Boolean.FALSE);
            }
            if (cgVar.f15009C) {
                fjVar.start();
                return;
            }
            fjVar.f15496b.mo35198a();
            if (((Boolean) cgVar.f14913v.get("isFullScreen")).booleanValue()) {
                fjVar.mo35253a(8, 0);
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m18205h(C6089fj fjVar) {
        try {
            if (fjVar.f15501h != null) {
                String uri = fjVar.f15501h.toString();
                C5858be.m17531a();
                C6215he a = C6215he.m18482a();
                List<ContentValues> a2 = a.mo35407a("asset", C5858be.f14785a, "disk_uri=? ", new String[]{uri}, (String) null, (String) null, "created_ts DESC ", "1");
                a.mo35412b();
                C5839av a3 = a2.isEmpty() ? null : C5858be.m17529a(a2.get(0));
                C5839av.C5840a aVar = new C5839av.C5840a();
                if (a3 != null) {
                    C5839av a4 = aVar.mo34754a(a3.f14715d, 0, 0).mo34756a();
                    C5858be.m17531a();
                    C5858be.m17532b(a4);
                }
            }
        } catch (Exception unused) {
        }
    }
}
