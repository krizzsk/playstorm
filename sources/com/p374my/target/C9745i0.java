package com.p374my.target;

import android.content.Context;
import android.net.Uri;
import com.p374my.target.common.models.AudioData;
import com.p374my.target.instreamads.InstreamAudioAdPlayer;
import java.util.Stack;

/* renamed from: com.my.target.i0 */
public class C9745i0 {

    /* renamed from: a */
    public final C9747b f24021a = new C9747b();

    /* renamed from: b */
    public final C10008v8 f24022b = C10008v8.m29579a(200);

    /* renamed from: c */
    public final C9749d f24023c = new C9749d();

    /* renamed from: d */
    public final Stack<C9601a3> f24024d = new Stack<>();

    /* renamed from: e */
    public final C9977t8 f24025e = C9977t8.m29380b();

    /* renamed from: f */
    public float f24026f = 1.0f;

    /* renamed from: g */
    public InstreamAudioAdPlayer f24027g;

    /* renamed from: h */
    public C9748c f24028h;

    /* renamed from: i */
    public C9711g2<AudioData> f24029i;

    /* renamed from: j */
    public int f24030j;

    /* renamed from: k */
    public float f24031k;

    /* renamed from: l */
    public int f24032l = 10;

    /* renamed from: m */
    public boolean f24033m;

    /* renamed from: n */
    public int f24034n = 0;

    /* renamed from: com.my.target.i0$b */
    public class C9747b implements InstreamAudioAdPlayer.AdPlayerListener {

        /* renamed from: a */
        public float f24035a;

        public C9747b() {
            this.f24035a = 1.0f;
        }

        public void onAdAudioCompleted() {
            if (C9745i0.this.f24034n != 2) {
                if (!(C9745i0.this.f24029i == null || C9745i0.this.f24028h == null)) {
                    C9745i0.this.mo64201a();
                    C9711g2 g = C9745i0.this.f24029i;
                    C9711g2 unused = C9745i0.this.f24029i = null;
                    if (g != null) {
                        float duration = g.getDuration();
                        C9745i0.this.f24025e.mo65476a(duration, duration);
                        C9745i0.this.f24028h.mo64229b(g);
                    }
                }
                int unused2 = C9745i0.this.f24034n = 2;
            }
            C9745i0.this.f24022b.mo65626b(C9745i0.this.f24023c);
        }

        public void onAdAudioError(String str) {
            if (C9745i0.this.f24027g != null) {
                C9745i0.this.f24027g.stopAdAudio();
            }
            if (!(C9745i0.this.f24029i == null || C9745i0.this.f24028h == null)) {
                C9745i0.this.f24028h.mo64228a(str, C9745i0.this.f24029i);
            }
            C9745i0.this.f24025e.mo65488f();
            C9745i0.this.f24022b.mo65626b(C9745i0.this.f24023c);
        }

        public void onAdAudioPaused() {
            Context d = C9745i0.this.mo64212d();
            if (!(C9745i0.this.f24029i == null || d == null)) {
                C9745i0.this.f24025e.mo65487e();
            }
            C9745i0.this.f24022b.mo65626b(C9745i0.this.f24023c);
        }

        public void onAdAudioResumed() {
            Context d = C9745i0.this.mo64212d();
            if (!(C9745i0.this.f24029i == null || d == null)) {
                C9745i0.this.f24025e.mo65490h();
            }
            C9745i0.this.f24022b.mo65624a((Runnable) C9745i0.this.f24023c);
        }

        public void onAdAudioStarted() {
            int unused = C9745i0.this.f24034n = 1;
            if (!C9745i0.this.f24033m && C9745i0.this.f24027g != null) {
                C9745i0 i0Var = C9745i0.this;
                i0Var.mo64209b(i0Var.f24027g.getAdAudioDuration());
            }
            C9745i0.this.f24022b.mo65624a((Runnable) C9745i0.this.f24023c);
        }

        public void onAdAudioStopped() {
            if (C9745i0.this.f24034n == 1) {
                if (!(C9745i0.this.f24029i == null || C9745i0.this.f24028h == null)) {
                    C9745i0.this.f24025e.mo65491i();
                    C9745i0.this.f24028h.mo64227a(C9745i0.this.f24029i);
                }
                int unused = C9745i0.this.f24034n = 0;
            }
            C9745i0.this.f24022b.mo65626b(C9745i0.this.f24023c);
        }

        public void onVolumeChanged(float f) {
            C9977t8 h;
            boolean z;
            float f2 = this.f24035a;
            if (f != f2) {
                int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i <= 0 || f > 0.0f) {
                    if (i == 0 && f > 0.0f && C9745i0.this.mo64212d() != null && C9745i0.this.f24029i != null) {
                        h = C9745i0.this.f24025e;
                        z = true;
                    } else {
                        return;
                    }
                } else if (C9745i0.this.mo64212d() != null && C9745i0.this.f24029i != null) {
                    h = C9745i0.this.f24025e;
                    z = false;
                } else {
                    return;
                }
                h.mo65484b(z);
                this.f24035a = f;
                float unused = C9745i0.this.f24026f = f;
            }
        }
    }

    /* renamed from: com.my.target.i0$c */
    public interface C9748c {
        /* renamed from: a */
        void mo64226a(float f, float f2, C9711g2 g2Var);

        /* renamed from: a */
        void mo64227a(C9711g2 g2Var);

        /* renamed from: a */
        void mo64228a(String str, C9711g2 g2Var);

        /* renamed from: b */
        void mo64229b(C9711g2 g2Var);

        /* renamed from: c */
        void mo64230c(C9711g2 g2Var);
    }

    /* renamed from: com.my.target.i0$d */
    public class C9749d implements Runnable {
        public C9749d() {
        }

        public void run() {
            C9745i0.this.mo64201a();
        }
    }

    /* renamed from: h */
    public static C9745i0 m28192h() {
        return new C9745i0();
    }

    /* renamed from: a */
    public void mo64201a() {
        float f;
        float f2;
        float f3;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        C9711g2<AudioData> g2Var = this.f24029i;
        float duration = g2Var != null ? g2Var.getDuration() : 0.0f;
        if (this.f24029i == null) {
            this.f24022b.mo65626b(this.f24023c);
            return;
        }
        if (this.f24034n != 1 || (instreamAudioAdPlayer = this.f24027g) == null) {
            f3 = 0.0f;
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f3 = instreamAudioAdPlayer.getAdAudioDuration();
            f2 = this.f24027g.getAdAudioPosition();
            f = duration - f2;
        }
        if (this.f24034n != 1 || this.f24031k == f2 || f3 <= 0.0f) {
            this.f24030j++;
        } else {
            mo64203a(f, f2, duration);
        }
        if (this.f24030j >= (this.f24032l * 1000) / 200) {
            mo64215g();
        }
    }

    /* renamed from: a */
    public final void mo64202a(float f) {
        C9711g2<AudioData> g2Var;
        this.f24025e.mo65476a(f, f);
        C9748c cVar = this.f24028h;
        if (!(cVar == null || (g2Var = this.f24029i) == null)) {
            cVar.mo64226a(0.0f, f, g2Var);
        }
        mo64208b();
    }

    /* renamed from: a */
    public final void mo64203a(float f, float f2, float f3) {
        C9711g2<AudioData> g2Var;
        this.f24030j = 0;
        this.f24031k = f2;
        if (f2 < f3) {
            this.f24025e.mo65476a(f2, f3);
            C9748c cVar = this.f24028h;
            if (cVar != null && (g2Var = this.f24029i) != null) {
                cVar.mo64226a(f, f3, g2Var);
                return;
            }
            return;
        }
        mo64202a(f3);
    }

    /* renamed from: a */
    public void mo64204a(int i) {
        this.f24032l = i;
    }

    /* renamed from: a */
    public void mo64205a(C9711g2<AudioData> g2Var) {
        this.f24029i = g2Var;
        this.f24025e.mo65478a((C9711g2) g2Var);
        this.f24033m = false;
        g2Var.getStatHolder().mo63681b(this.f24024d);
        AudioData mediaData = g2Var.getMediaData();
        if (mediaData != null) {
            Uri parse = Uri.parse(mediaData.getUrl());
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.setVolume(this.f24026f);
                this.f24027g.playAdAudio(parse);
            }
        }
    }

    /* renamed from: a */
    public void mo64206a(C9748c cVar) {
        this.f24028h = cVar;
    }

    /* renamed from: a */
    public void mo64207a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.f24027g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener((InstreamAudioAdPlayer.AdPlayerListener) null);
        }
        this.f24027g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setAdPlayerListener(this.f24021a);
            this.f24025e.mo65477a(instreamAudioAdPlayer.getCurrentContext());
            return;
        }
        this.f24025e.mo65477a((Context) null);
    }

    /* renamed from: b */
    public final void mo64208b() {
        C9748c cVar;
        this.f24022b.mo65626b(this.f24023c);
        if (this.f24034n != 2) {
            this.f24034n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            C9711g2<AudioData> g2Var = this.f24029i;
            if (g2Var != null && (cVar = this.f24028h) != null) {
                this.f24029i = null;
                cVar.mo64229b(g2Var);
            }
        }
    }

    /* renamed from: b */
    public final void mo64209b(float f) {
        C9711g2<AudioData> g2Var;
        C9748c cVar;
        C9711g2<AudioData> g2Var2 = this.f24029i;
        if (!(g2Var2 == null || (cVar = this.f24028h) == null)) {
            cVar.mo64230c(g2Var2);
        }
        C9748c cVar2 = this.f24028h;
        if (!(cVar2 == null || (g2Var = this.f24029i) == null)) {
            cVar2.mo64226a(0.0f, f, g2Var);
        }
        this.f24025e.mo65476a(0.0f, f);
        this.f24033m = true;
    }

    /* renamed from: c */
    public void mo64210c() {
        this.f24022b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.f24027g = null;
    }

    /* renamed from: c */
    public void mo64211c(float f) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f);
        }
        this.f24026f = f;
    }

    /* renamed from: d */
    public Context mo64212d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    /* renamed from: e */
    public InstreamAudioAdPlayer mo64213e() {
        return this.f24027g;
    }

    /* renamed from: f */
    public float mo64214f() {
        return this.f24026f;
    }

    /* renamed from: g */
    public final void mo64215g() {
        C9711g2<AudioData> g2Var;
        C9672e0.m27882a("video freeze more then " + this.f24032l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.f24022b.mo65626b(this.f24023c);
        this.f24025e.mo65489g();
        C9748c cVar = this.f24028h;
        if (cVar != null && (g2Var = this.f24029i) != null) {
            cVar.mo64228a("Timeout", g2Var);
        }
    }

    /* renamed from: i */
    public void mo64216i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    /* renamed from: j */
    public void mo64217j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    /* renamed from: k */
    public void mo64218k() {
        if (this.f24034n == 1) {
            if (!(this.f24029i == null || this.f24028h == null)) {
                this.f24025e.mo65491i();
                this.f24028h.mo64227a(this.f24029i);
            }
            this.f24034n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f24027g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }
}
