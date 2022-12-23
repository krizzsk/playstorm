package com.p374my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.p374my.target.C9662d7;
import com.p374my.target.C9841m4;
import com.p374my.target.C9965t4;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.m4 */
public class C9841m4 {

    /* renamed from: a */
    public final C9711g2<VideoData> f24292a;

    /* renamed from: b */
    public final C9842a f24293b;

    /* renamed from: c */
    public final C10079z6 f24294c;

    /* renamed from: d */
    public final C9634b9 f24295d;

    /* renamed from: e */
    public final C9977t8 f24296e;

    /* renamed from: f */
    public float f24297f;

    /* renamed from: g */
    public boolean f24298g;

    /* renamed from: h */
    public boolean f24299h;

    /* renamed from: i */
    public boolean f24300i;

    /* renamed from: j */
    public final C9965t4.C9968c f24301j;

    /* renamed from: k */
    public final C9965t4.C9967b f24302k;

    /* renamed from: l */
    public boolean f24303l;

    /* renamed from: m */
    public boolean f24304m = true;

    /* renamed from: com.my.target.m4$a */
    public class C9842a implements C9662d7.C9664b {
        public C9842a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m28705a(int i) {
            C9841m4.this.mo64731a(i);
        }

        /* renamed from: a */
        public void mo64744a() {
            if (!C9841m4.this.f24298g) {
                C9841m4.this.mo64737c();
                C9841m4.this.f24296e.mo65484b(false);
                boolean unused = C9841m4.this.f24298g = true;
                return;
            }
            C9841m4.this.mo64743i();
            C9841m4.this.f24296e.mo65484b(true);
            boolean unused2 = C9841m4.this.f24298g = false;
        }

        /* renamed from: a */
        public void mo63745a(float f) {
            C9841m4.this.f24294c.mo63706b(f <= 0.0f);
        }

        /* renamed from: a */
        public void mo63746a(float f, float f2) {
            C9841m4.this.f24294c.setTimeChanged(f);
            boolean unused = C9841m4.this.f24303l = false;
            if (!C9841m4.this.f24300i) {
                boolean unused2 = C9841m4.this.f24300i = true;
            }
            if (C9841m4.this.f24299h && C9841m4.this.f24292a.isAutoPlay() && C9841m4.this.f24292a.getAllowCloseDelay() <= f) {
                C9841m4.this.f24294c.mo63478d();
            }
            if (f <= C9841m4.this.f24297f) {
                C9841m4.this.mo64730a(f, f2);
                if (f == C9841m4.this.f24297f) {
                    onVideoCompleted();
                    return;
                }
                return;
            }
            mo63746a(C9841m4.this.f24297f, C9841m4.this.f24297f);
        }

        /* renamed from: a */
        public void mo63747a(String str) {
            C9672e0.m27882a("Video playing error: " + str);
            C9841m4.this.f24296e.mo65488f();
            if (C9841m4.this.f24304m) {
                C9672e0.m27882a("Try to play video stream from URL");
                boolean unused = C9841m4.this.f24304m = false;
                C9841m4.this.mo64740f();
                return;
            }
            C9841m4.this.mo64729a();
            C9841m4.this.f24302k.mo63359c();
        }

        /* renamed from: b */
        public void mo63893b() {
            C9841m4.this.mo64740f();
        }

        /* renamed from: c */
        public void mo63894c() {
            C9841m4 m4Var = C9841m4.this;
            m4Var.mo64732a(m4Var.f24294c.getView().getContext());
            C9841m4.this.f24296e.mo65487e();
            C9841m4.this.f24294c.mo63705b();
        }

        /* renamed from: f */
        public void mo63748f() {
        }

        /* renamed from: g */
        public void mo63749g() {
        }

        /* renamed from: h */
        public void mo63750h() {
        }

        /* renamed from: j */
        public void mo63751j() {
        }

        /* renamed from: l */
        public void mo63752l() {
            C9841m4.this.f24296e.mo65489g();
            C9841m4.this.mo64729a();
            C9672e0.m27882a("Video playing timeout");
            C9841m4.this.f24302k.mo63359c();
        }

        /* renamed from: m */
        public void mo63895m() {
            if (!C9841m4.this.f24298g) {
                C9841m4 m4Var = C9841m4.this;
                m4Var.mo64736b(m4Var.f24294c.getView().getContext());
            }
            C9841m4.this.mo64740f();
        }

        /* renamed from: n */
        public void mo63896n() {
            C9841m4.this.f24296e.mo65490h();
            C9841m4.this.f24294c.mo63700a();
            if (C9841m4.this.f24298g) {
                C9841m4.this.mo64737c();
            } else {
                C9841m4.this.mo64743i();
            }
        }

        /* renamed from: o */
        public void mo63753o() {
            if (C9841m4.this.f24299h && C9841m4.this.f24292a.getAllowCloseDelay() == 0.0f) {
                C9841m4.this.f24294c.mo63478d();
            }
            C9841m4.this.f24294c.mo63712g();
        }

        public void onAudioFocusChange(int i) {
            if (Build.VERSION.SDK_INT >= 23 ? Looper.getMainLooper().isCurrentThread() : Thread.currentThread() == Looper.getMainLooper().getThread()) {
                C9841m4.this.mo64731a(i);
            } else {
                C9693f0.m27983c(new Runnable(i) {
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C9841m4.C9842a.this.m28705a(this.f$1);
                    }
                });
            }
        }

        public void onVideoCompleted() {
            if (!C9841m4.this.f24303l) {
                boolean unused = C9841m4.this.f24303l = true;
                C9672e0.m27882a("Video playing complete:");
                C9841m4.this.mo64742h();
                C9841m4.this.f24301j.mo65460a(C9841m4.this.f24294c.getView().getContext());
                C9841m4.this.f24294c.mo63478d();
                C9841m4.this.f24294c.mo63714h();
                C9841m4.this.f24296e.mo65485c();
            }
        }
    }

    public C9841m4(C9850m7 m7Var, C9711g2<VideoData> g2Var, C10079z6 z6Var, C9965t4.C9968c cVar, C9965t4.C9967b bVar) {
        this.f24292a = g2Var;
        this.f24301j = cVar;
        this.f24302k = bVar;
        C9842a aVar = new C9842a();
        this.f24293b = aVar;
        this.f24294c = z6Var;
        z6Var.setMediaListener(aVar);
        C9634b9 a = C9634b9.m27707a(g2Var.getStatHolder());
        this.f24295d = a;
        a.mo63650a((View) z6Var.getPromoMediaView());
        this.f24296e = m7Var.mo64768a(g2Var);
    }

    /* renamed from: a */
    public static C9841m4 m28666a(C9850m7 m7Var, C9711g2<VideoData> g2Var, C10079z6 z6Var, C9965t4.C9968c cVar, C9965t4.C9967b bVar) {
        return new C9841m4(m7Var, g2Var, z6Var, cVar, bVar);
    }

    /* renamed from: a */
    public void mo64729a() {
        mo64732a(this.f24294c.getView().getContext());
        this.f24294c.destroy();
    }

    /* renamed from: a */
    public final void mo64730a(float f, float f2) {
        this.f24295d.mo63649a(f, f2);
        this.f24296e.mo65476a(f, f2);
    }

    /* renamed from: a */
    public final void mo64731a(int i) {
        if (i == -3) {
            C9672e0.m27882a("Audiofocus loss can duck, set volume to 0.3");
            if (!this.f24298g) {
                mo64735b();
            }
        } else if (i == -2 || i == -1) {
            mo64739e();
            C9672e0.m27882a("Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            C9672e0.m27882a("Audiofocus gain, unmuting");
            if (!this.f24298g) {
                mo64743i();
            }
        }
    }

    /* renamed from: a */
    public final void mo64732a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f24293b);
        }
    }

    /* renamed from: a */
    public void mo64733a(C9697f2 f2Var) {
        this.f24294c.mo63478d();
        this.f24294c.mo63702a(f2Var);
    }

    /* renamed from: a */
    public void mo64734a(C9711g2<VideoData> g2Var, Context context) {
        VideoData mediaData = g2Var.getMediaData();
        if (mediaData != null && mediaData.getData() == null) {
            this.f24304m = false;
        }
        boolean isAllowClose = g2Var.isAllowClose();
        this.f24299h = isAllowClose;
        if (isAllowClose && g2Var.getAllowCloseDelay() == 0.0f && g2Var.isAutoPlay()) {
            C9672e0.m27882a("banner is allowed to close");
            this.f24294c.mo63478d();
        }
        this.f24297f = g2Var.getDuration();
        boolean isAutoMute = g2Var.isAutoMute();
        this.f24298g = isAutoMute;
        if (isAutoMute) {
            this.f24294c.mo63701a(0);
            return;
        }
        if (g2Var.isAutoPlay()) {
            mo64736b(context);
        }
        this.f24294c.mo63701a(2);
    }

    /* renamed from: b */
    public final void mo64735b() {
        this.f24294c.mo63701a(1);
    }

    /* renamed from: b */
    public final void mo64736b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f24293b, 3, 2);
        }
    }

    /* renamed from: c */
    public final void mo64737c() {
        mo64732a(this.f24294c.getView().getContext());
        this.f24294c.mo63701a(0);
    }

    /* renamed from: d */
    public void mo64738d() {
        this.f24294c.mo63704a(true);
        mo64732a(this.f24294c.getView().getContext());
        if (this.f24300i) {
            this.f24296e.mo65486d();
        }
    }

    /* renamed from: e */
    public void mo64739e() {
        this.f24294c.mo63705b();
        mo64732a(this.f24294c.getView().getContext());
        if (this.f24294c.mo63709c() && !this.f24294c.mo63711f()) {
            this.f24296e.mo65487e();
        }
    }

    /* renamed from: f */
    public final void mo64740f() {
        this.f24294c.mo63708c(this.f24304m);
    }

    /* renamed from: g */
    public void mo64741g() {
        mo64732a(this.f24294c.getView().getContext());
    }

    /* renamed from: h */
    public final void mo64742h() {
        this.f24294c.mo63478d();
        mo64732a(this.f24294c.getView().getContext());
        this.f24294c.mo63704a(this.f24292a.isAllowReplay());
    }

    /* renamed from: i */
    public final void mo64743i() {
        if (this.f24294c.mo63709c()) {
            mo64736b(this.f24294c.getView().getContext());
        }
        this.f24294c.mo63701a(2);
    }
}
