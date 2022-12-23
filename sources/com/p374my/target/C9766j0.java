package com.p374my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.p374my.target.C9897p3;
import com.p374my.target.C9977t8;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.instreamads.InstreamAdPlayer;

/* renamed from: com.my.target.j0 */
public class C9766j0 {

    /* renamed from: a */
    public final C9768b f24093a = new C9768b();

    /* renamed from: b */
    public final C10008v8 f24094b = C10008v8.m29579a(200);

    /* renamed from: c */
    public final C9769c f24095c = new C9769c();

    /* renamed from: d */
    public final C9977t8 f24096d = C9977t8.m29380b();

    /* renamed from: e */
    public float f24097e = 1.0f;

    /* renamed from: f */
    public C9634b9 f24098f;

    /* renamed from: g */
    public C9897p3 f24099g;

    /* renamed from: h */
    public InstreamAdPlayer f24100h;

    /* renamed from: i */
    public C9770d f24101i;

    /* renamed from: j */
    public C9711g2<VideoData> f24102j;

    /* renamed from: k */
    public int f24103k;

    /* renamed from: l */
    public float f24104l;

    /* renamed from: m */
    public int f24105m = 10;

    /* renamed from: n */
    public boolean f24106n;

    /* renamed from: o */
    public int f24107o = 0;

    /* renamed from: com.my.target.j0$b */
    public class C9768b implements InstreamAdPlayer.AdPlayerListener {

        /* renamed from: a */
        public float f24108a;

        public C9768b() {
            this.f24108a = 1.0f;
        }

        public void onAdVideoCompleted() {
            if (C9766j0.this.f24107o != 2) {
                if (!(C9766j0.this.f24102j == null || C9766j0.this.f24101i == null)) {
                    C9766j0.this.mo64414a();
                    if (C9766j0.this.f24102j != null) {
                        C9711g2 i = C9766j0.this.f24102j;
                        C9766j0.this.mo64421b();
                        float duration = i.getDuration();
                        C9766j0.this.f24096d.mo65476a(duration, duration);
                        C9766j0.this.f24101i.mo64439b(i);
                    }
                }
                int unused = C9766j0.this.f24107o = 2;
            }
            C9766j0.this.f24094b.mo65626b(C9766j0.this.f24095c);
        }

        public void onAdVideoError(String str) {
            if (C9766j0.this.f24100h != null) {
                C9766j0.this.f24100h.stopAdVideo();
            }
            if (!(C9766j0.this.f24102j == null || C9766j0.this.f24101i == null)) {
                C9766j0.this.f24101i.mo64438a(str, C9766j0.this.f24102j);
            }
            C9766j0.this.f24096d.mo65488f();
            C9766j0.this.f24094b.mo65626b(C9766j0.this.f24095c);
            C9766j0.this.mo64421b();
        }

        public void onAdVideoPaused() {
            C9766j0.this.f24096d.mo65487e();
            C9766j0.this.f24094b.mo65626b(C9766j0.this.f24095c);
            if (C9766j0.this.f24102j != null && C9766j0.this.f24101i != null) {
                C9766j0.this.f24101i.mo64442e(C9766j0.this.f24102j);
            }
        }

        public void onAdVideoResumed() {
            C9766j0.this.f24096d.mo65490h();
            C9766j0.this.f24094b.mo65624a((Runnable) C9766j0.this.f24095c);
            if (C9766j0.this.f24102j != null && C9766j0.this.f24101i != null) {
                C9766j0.this.f24101i.mo64441d(C9766j0.this.f24102j);
            }
        }

        public void onAdVideoStarted() {
            int unused = C9766j0.this.f24107o = 1;
            if (!C9766j0.this.f24106n && C9766j0.this.f24100h != null) {
                C9766j0 j0Var = C9766j0.this;
                j0Var.mo64415a(j0Var.f24100h.getAdVideoDuration());
            }
            C9766j0.this.f24094b.mo65624a((Runnable) C9766j0.this.f24095c);
        }

        public void onAdVideoStopped() {
            if (C9766j0.this.f24107o == 1) {
                if (!(C9766j0.this.f24102j == null || C9766j0.this.f24101i == null)) {
                    C9766j0.this.f24096d.mo65491i();
                    C9766j0.this.f24101i.mo64437a(C9766j0.this.f24102j);
                }
                int unused = C9766j0.this.f24107o = 0;
            }
            C9766j0.this.f24094b.mo65626b(C9766j0.this.f24095c);
        }

        public void onVolumeChanged(float f) {
            C9766j0.this.f24096d.mo65483b(this.f24108a, f);
            this.f24108a = f;
            float unused = C9766j0.this.f24097e = f;
        }
    }

    /* renamed from: com.my.target.j0$c */
    public class C9769c implements Runnable {
        public C9769c() {
        }

        public void run() {
            C9766j0.this.mo64414a();
        }
    }

    /* renamed from: com.my.target.j0$d */
    public interface C9770d {
        /* renamed from: a */
        void mo64436a(float f, float f2, C9711g2 g2Var);

        /* renamed from: a */
        void mo64437a(C9711g2 g2Var);

        /* renamed from: a */
        void mo64438a(String str, C9711g2 g2Var);

        /* renamed from: b */
        void mo64439b(C9711g2 g2Var);

        /* renamed from: c */
        void mo64440c(C9711g2 g2Var);

        /* renamed from: d */
        void mo64441d(C9711g2 g2Var);

        /* renamed from: e */
        void mo64442e(C9711g2 g2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m28330i() {
        InstreamAdPlayer instreamAdPlayer;
        C9897p3 p3Var = this.f24099g;
        if (p3Var != null && (instreamAdPlayer = this.f24100h) != null) {
            p3Var.mo65200a(instreamAdPlayer.getView(), new C9897p3.C9900c[0]);
            this.f24099g.mo65205c();
        }
    }

    /* renamed from: j */
    public static C9766j0 m28331j() {
        return new C9766j0();
    }

    /* renamed from: a */
    public void mo64414a() {
        float f;
        float f2;
        float f3;
        InstreamAdPlayer instreamAdPlayer;
        C9711g2<VideoData> g2Var = this.f24102j;
        float duration = g2Var != null ? g2Var.getDuration() : 0.0f;
        if (this.f24102j == null) {
            this.f24094b.mo65626b(this.f24095c);
            return;
        }
        if (this.f24107o != 1 || (instreamAdPlayer = this.f24100h) == null) {
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f3 = instreamAdPlayer.getAdVideoDuration();
            f2 = this.f24100h.getAdVideoPosition();
            f = duration - f2;
        }
        if (this.f24107o != 1 || this.f24104l == f2 || f3 <= 0.0f) {
            this.f24103k++;
        } else {
            mo64416a(f, f2, duration);
        }
        if (this.f24103k >= (this.f24105m * 1000) / 200) {
            mo64430h();
        }
    }

    /* renamed from: a */
    public final void mo64415a(float f) {
        C9711g2<VideoData> g2Var;
        C9770d dVar;
        C9711g2<VideoData> g2Var2 = this.f24102j;
        if (!(g2Var2 == null || (dVar = this.f24101i) == null)) {
            dVar.mo64440c(g2Var2);
        }
        C9770d dVar2 = this.f24101i;
        if (!(dVar2 == null || (g2Var = this.f24102j) == null)) {
            dVar2.mo64436a(f, f, g2Var);
        }
        this.f24096d.mo65476a(0.0f, f);
        this.f24106n = true;
    }

    /* renamed from: a */
    public final void mo64416a(float f, float f2, float f3) {
        C9711g2<VideoData> g2Var;
        this.f24103k = 0;
        this.f24104l = f2;
        if (f2 < f3) {
            this.f24096d.mo65476a(f2, f3);
            C9634b9 b9Var = this.f24098f;
            if (b9Var != null) {
                b9Var.mo63649a(f2, f3);
            }
            C9770d dVar = this.f24101i;
            if (dVar != null && (g2Var = this.f24102j) != null) {
                dVar.mo64436a(f, f3, g2Var);
                return;
            }
            return;
        }
        mo64422b(f3);
    }

    /* renamed from: a */
    public void mo64417a(int i) {
        this.f24105m = i;
    }

    /* renamed from: a */
    public void mo64418a(C9711g2<VideoData> g2Var) {
        this.f24102j = g2Var;
        this.f24106n = false;
        this.f24096d.mo65478a((C9711g2) g2Var);
        this.f24098f = C9634b9.m27707a(g2Var.getStatHolder());
        C9897p3 p3Var = this.f24099g;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            View view = instreamAdPlayer.getView();
            this.f24098f.mo63650a(view);
            this.f24099g = C9897p3.m28962a(g2Var, 3, this.f24102j, view.getContext());
        }
        this.f24096d.mo65479a(this.f24099g);
        this.f24096d.mo65480a((C9977t8.C9978a) new C9977t8.C9978a() {
            /* renamed from: a */
            public final void mo63346a() {
                C9766j0.this.m28330i();
            }
        });
        VideoData mediaData = g2Var.getMediaData();
        if (mediaData != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            InstreamAdPlayer instreamAdPlayer2 = this.f24100h;
            if (instreamAdPlayer2 != null) {
                instreamAdPlayer2.setVolume(this.f24097e);
                this.f24100h.playAdVideo(parse, mediaData.getWidth(), mediaData.getHeight());
            }
        }
    }

    /* renamed from: a */
    public void mo64419a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.f24100h;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener((InstreamAdPlayer.AdPlayerListener) null);
        }
        this.f24100h = instreamAdPlayer;
        if (instreamAdPlayer != null) {
            View view = instreamAdPlayer.getView();
            C9634b9 b9Var = this.f24098f;
            if (b9Var != null) {
                b9Var.mo63650a(view);
            }
            instreamAdPlayer.setAdPlayerListener(this.f24093a);
            this.f24096d.mo65477a(view.getContext());
            C9897p3 p3Var = this.f24099g;
            if (p3Var != null) {
                p3Var.mo65199a(instreamAdPlayer.getView());
                return;
            }
            return;
        }
        C9634b9 b9Var2 = this.f24098f;
        if (b9Var2 != null) {
            b9Var2.mo63650a((View) null);
        }
        this.f24096d.mo65477a((Context) null);
    }

    /* renamed from: a */
    public void mo64420a(C9770d dVar) {
        this.f24101i = dVar;
    }

    /* renamed from: b */
    public final void mo64421b() {
        this.f24102j = null;
        C9634b9 b9Var = this.f24098f;
        if (b9Var != null) {
            b9Var.mo63647a();
            this.f24098f = null;
        }
        C9897p3 p3Var = this.f24099g;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
    }

    /* renamed from: b */
    public final void mo64422b(float f) {
        C9711g2<VideoData> g2Var;
        this.f24096d.mo65476a(f, f);
        this.f24104l = f;
        C9634b9 b9Var = this.f24098f;
        if (b9Var != null) {
            b9Var.mo63649a(f, f);
        }
        C9770d dVar = this.f24101i;
        if (!(dVar == null || (g2Var = this.f24102j) == null)) {
            dVar.mo64436a(0.0f, f, g2Var);
        }
        mo64424c();
    }

    /* renamed from: b */
    public void mo64423b(InstreamAdPlayer instreamAdPlayer) {
        VideoData mediaData;
        InstreamAdPlayer instreamAdPlayer2 = this.f24100h;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener((InstreamAdPlayer.AdPlayerListener) null);
            this.f24100h.stopAdVideo();
        }
        this.f24100h = instreamAdPlayer;
        C9634b9 b9Var = this.f24098f;
        if (instreamAdPlayer != null) {
            if (b9Var != null) {
                b9Var.mo63650a(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this.f24093a);
            this.f24096d.mo65477a(instreamAdPlayer.getView().getContext());
            C9897p3 p3Var = this.f24099g;
            if (p3Var != null) {
                p3Var.mo65199a(instreamAdPlayer.getView());
            }
        } else {
            if (b9Var != null) {
                b9Var.mo63650a((View) null);
            }
            this.f24096d.mo65477a((Context) null);
        }
        C9711g2<VideoData> g2Var = this.f24102j;
        if (g2Var != null && (mediaData = g2Var.getMediaData()) != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            if (instreamAdPlayer != null) {
                instreamAdPlayer.setVolume(this.f24097e);
                instreamAdPlayer.playAdVideo(parse, mediaData.getWidth(), mediaData.getHeight(), this.f24104l);
            }
        }
    }

    /* renamed from: c */
    public final void mo64424c() {
        C9770d dVar;
        this.f24094b.mo65626b(this.f24095c);
        if (this.f24107o != 2) {
            this.f24107o = 2;
            InstreamAdPlayer instreamAdPlayer = this.f24100h;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            C9711g2<VideoData> g2Var = this.f24102j;
            mo64421b();
            if (g2Var != null && (dVar = this.f24101i) != null) {
                dVar.mo64439b(g2Var);
            }
        }
    }

    /* renamed from: c */
    public void mo64425c(float f) {
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f);
        }
        this.f24097e = f;
    }

    /* renamed from: d */
    public void mo64426d() {
        this.f24094b.close();
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
        }
        this.f24100h = null;
        mo64421b();
    }

    /* renamed from: e */
    public Context mo64427e() {
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    /* renamed from: f */
    public InstreamAdPlayer mo64428f() {
        return this.f24100h;
    }

    /* renamed from: g */
    public float mo64429g() {
        return this.f24097e;
    }

    /* renamed from: h */
    public final void mo64430h() {
        C9711g2<VideoData> g2Var;
        C9672e0.m27882a("video freeze more then " + this.f24105m + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.f24094b.mo65626b(this.f24095c);
        this.f24096d.mo65489g();
        C9770d dVar = this.f24101i;
        if (!(dVar == null || (g2Var = this.f24102j) == null)) {
            dVar.mo64438a("Timeout", g2Var);
        }
        mo64421b();
    }

    /* renamed from: k */
    public void mo64431k() {
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    /* renamed from: l */
    public void mo64432l() {
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    /* renamed from: m */
    public void mo64433m() {
        if (this.f24107o == 1) {
            if (!(this.f24102j == null || this.f24101i == null)) {
                this.f24096d.mo65491i();
                this.f24101i.mo64437a(this.f24102j);
            }
            this.f24107o = 0;
        }
        InstreamAdPlayer instreamAdPlayer = this.f24100h;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        mo64421b();
    }

    /* renamed from: n */
    public void mo64434n() {
        C9897p3 p3Var = this.f24099g;
        if (p3Var != null) {
            p3Var.mo65197a(2);
        }
    }
}
