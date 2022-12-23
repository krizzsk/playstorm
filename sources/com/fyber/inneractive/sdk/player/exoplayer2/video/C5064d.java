package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d */
public final class C5064d {

    /* renamed from: a */
    public final C5065a f13544a;

    /* renamed from: b */
    public final long f13545b;

    /* renamed from: c */
    public final long f13546c;

    /* renamed from: d */
    public long f13547d;

    /* renamed from: e */
    public long f13548e;

    /* renamed from: f */
    public long f13549f;

    /* renamed from: g */
    public boolean f13550g;

    /* renamed from: h */
    public long f13551h;

    /* renamed from: i */
    public long f13552i;

    /* renamed from: j */
    public long f13553j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d$a */
    public static final class C5065a implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e */
        public static final C5065a f13554e = new C5065a();

        /* renamed from: a */
        public volatile long f13555a;

        /* renamed from: b */
        public final Handler f13556b;

        /* renamed from: c */
        public Choreographer f13557c;

        /* renamed from: d */
        public int f13558d;

        public C5065a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f13556b = handler;
            handler.sendEmptyMessage(0);
        }

        /* renamed from: a */
        public static C5065a m15432a() {
            return f13554e;
        }

        public void doFrame(long j) {
            this.f13555a = j;
            this.f13557c.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f13557c = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f13558d + 1;
                this.f13558d = i2;
                if (i2 == 1) {
                    this.f13557c.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f13558d - 1;
                this.f13558d = i3;
                if (i3 == 0) {
                    this.f13557c.removeFrameCallback(this);
                    this.f13555a = 0;
                }
                return true;
            }
        }
    }

    public C5064d(Context context) {
        this((double) m15430a(context), true);
    }

    /* renamed from: a */
    public final boolean mo25669a(long j, long j2) {
        return Math.abs((j2 - this.f13551h) - (j - this.f13552i)) > 20000000;
    }

    public C5064d(double d, boolean z) {
        if (z) {
            this.f13544a = C5065a.m15432a();
            long j = (long) (1.0E9d / d);
            this.f13545b = j;
            this.f13546c = (j * 80) / 100;
            return;
        }
        this.f13544a = null;
        this.f13545b = -1;
        this.f13546c = -1;
    }

    /* renamed from: a */
    public static float m15430a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
