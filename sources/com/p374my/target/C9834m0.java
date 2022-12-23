package com.p374my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p374my.target.C10055y5;
import com.p374my.target.C9651c9;
import com.p374my.target.C9844m6;
import com.p374my.target.C9949s5;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;

/* renamed from: com.my.target.m0 */
public class C9834m0 implements C9651c9.C9652a, C9949s5.C9950a, C9844m6.C9849e, C10055y5.C10056a {

    /* renamed from: a */
    public final C9711g2<VideoData> f24261a;

    /* renamed from: b */
    public final VideoData f24262b;

    /* renamed from: c */
    public final AudioManager.OnAudioFocusChangeListener f24263c;

    /* renamed from: d */
    public final C9733h2 f24264d;

    /* renamed from: e */
    public final C9750i1 f24265e;

    /* renamed from: f */
    public final C9634b9 f24266f;

    /* renamed from: g */
    public Uri f24267g;

    /* renamed from: h */
    public final C9977t8 f24268h;

    /* renamed from: i */
    public View.OnClickListener f24269i;

    /* renamed from: j */
    public WeakReference<MediaAdView> f24270j;

    /* renamed from: k */
    public WeakReference<C9949s5> f24271k;

    /* renamed from: l */
    public WeakReference<C9844m6> f24272l;

    /* renamed from: m */
    public WeakReference<Context> f24273m;

    /* renamed from: n */
    public int f24274n;

    /* renamed from: o */
    public boolean f24275o;

    /* renamed from: p */
    public boolean f24276p;

    /* renamed from: q */
    public boolean f24277q;

    /* renamed from: r */
    public boolean f24278r;

    /* renamed from: s */
    public C9837c f24279s;

    /* renamed from: t */
    public C9651c9 f24280t;

    /* renamed from: u */
    public boolean f24281u;

    /* renamed from: v */
    public long f24282v;

    /* renamed from: w */
    public boolean f24283w;

    /* renamed from: x */
    public boolean f24284x;

    /* renamed from: com.my.target.m0$b */
    public class C9836b implements AudioManager.OnAudioFocusChangeListener {
        public C9836b() {
        }

        public void onAudioFocusChange(int i) {
            if (i == -3) {
                C9834m0.this.mo64711s();
            } else if (i == -2 || i == -1) {
                C9834m0.this.mo64716x();
                C9672e0.m27882a("Audiofocus loss, pausing");
            } else if ((i == 1 || i == 2 || i == 4) && C9834m0.this.f24276p) {
                C9672e0.m27882a("Audiofocus gain, unmuting");
                C9834m0.this.mo64718z();
            }
        }
    }

    /* renamed from: com.my.target.m0$c */
    public interface C9837c {
        /* renamed from: c */
        void mo63991c();

        /* renamed from: d */
        void mo63992d();

        /* renamed from: e */
        void mo63993e();

        /* renamed from: f */
        void mo63994f();
    }

    public C9834m0(C9733h2 h2Var, C9711g2<VideoData> g2Var, VideoData videoData, C9750i1 i1Var) {
        this.f24261a = g2Var;
        this.f24264d = h2Var;
        this.f24265e = i1Var;
        this.f24262b = videoData;
        String str = (String) videoData.getData();
        this.f24267g = Uri.parse(str == null ? videoData.getUrl() : str);
        this.f24275o = g2Var.isAutoPlay();
        this.f24278r = g2Var.isAutoMute();
        this.f24266f = C9634b9.m27707a(g2Var.getStatHolder());
        this.f24268h = i1Var.mo64233a(g2Var);
        this.f24263c = new C9836b();
    }

    /* renamed from: A */
    public void mo64693A() {
        MediaAdView mediaAdView;
        mo64713u();
        this.f24266f.mo63650a((View) null);
        this.f24268h.mo65477a((Context) null);
        mo64710r();
        WeakReference<MediaAdView> weakReference = this.f24270j;
        if (weakReference != null && (mediaAdView = (MediaAdView) weakReference.get()) != null && (mediaAdView.getChildAt(1) instanceof C10055y5)) {
            mediaAdView.removeViewAt(1);
        }
    }

    /* renamed from: a */
    public void mo64694a() {
        WeakReference<C9949s5> weakReference = this.f24271k;
        C9949s5 s5Var = weakReference == null ? null : (C9949s5) weakReference.get();
        if (s5Var != null && s5Var.isShowing()) {
            s5Var.dismiss();
        }
    }

    /* renamed from: a */
    public void mo63745a(float f) {
        C9844m6 m6Var;
        WeakReference<C9844m6> weakReference = this.f24272l;
        if (weakReference != null && (m6Var = (C9844m6) weakReference.get()) != null) {
            m6Var.mo64750a(f <= 0.0f);
        }
    }

    /* renamed from: a */
    public void mo63746a(float f, float f2) {
        C9651c9 c9Var;
        C9651c9 c9Var2;
        C9844m6 m6Var;
        mo63753o();
        this.f24266f.mo63649a(f, f2);
        this.f24268h.mo65476a(f, f2);
        if (!this.f24277q) {
            C9837c cVar = this.f24279s;
            if (cVar != null) {
                cVar.mo63994f();
            }
            this.f24277q = true;
        }
        float duration = this.f24261a.getDuration();
        WeakReference<C9844m6> weakReference = this.f24272l;
        if (!(weakReference == null || (m6Var = (C9844m6) weakReference.get()) == null)) {
            m6Var.mo64748a(f, duration);
        }
        if (f <= duration) {
            if (f > 0.0f && (c9Var2 = this.f24280t) != null) {
                this.f24282v = c9Var2.mo63742n();
            }
            if (f == duration && (c9Var = this.f24280t) != null) {
                if (this.f24284x) {
                    c9Var.mo63736h();
                    return;
                }
                mo63751j();
                this.f24274n = 3;
                this.f24275o = false;
                this.f24280t.mo63733e();
                C9837c cVar2 = this.f24279s;
                if (cVar2 != null) {
                    cVar2.mo63993e();
                }
                this.f24268h.mo65485c();
                return;
            }
            return;
        }
        mo63746a(duration, duration);
    }

    /* renamed from: a */
    public final void mo64695a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f24263c);
        }
    }

    /* renamed from: a */
    public void mo64696a(View.OnClickListener onClickListener) {
        this.f24269i = onClickListener;
    }

    /* renamed from: a */
    public void mo64697a(View view) {
        if (this.f24274n == 1) {
            C9651c9 c9Var = this.f24280t;
            if (c9Var != null) {
                c9Var.mo63729b();
            }
            mo63748f();
        }
        View.OnClickListener onClickListener = this.f24269i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    public void mo64698a(C9837c cVar) {
        this.f24279s = cVar;
    }

    /* renamed from: a */
    public void mo64699a(MediaAdView mediaAdView, Context context) {
        C10055y5 y5Var;
        WeakReference<Context> weakReference;
        C9672e0.m27882a("register video ad with view " + mediaAdView);
        if (!this.f24276p) {
            WeakReference<MediaAdView> weakReference2 = this.f24270j;
            if (weakReference2 == null || weakReference2.get() != mediaAdView || (weakReference = this.f24273m) == null || weakReference.get() != context || !(mediaAdView.getChildAt(1) instanceof C10055y5)) {
                mo64693A();
                this.f24268h.mo65477a(context);
                this.f24270j = new WeakReference<>(mediaAdView);
                this.f24273m = new WeakReference<>(context);
                C10055y5 y5Var2 = new C10055y5(mediaAdView.getContext().getApplicationContext());
                mediaAdView.addView(y5Var2, 1);
                y5Var = y5Var2;
            } else {
                y5Var = (C10055y5) mediaAdView.getChildAt(1);
            }
            y5Var.setAdVideoViewListener(this);
            this.f24266f.mo63650a((View) y5Var);
            if (this.f24275o) {
                mo63749g();
            } else {
                mo63751j();
            }
        }
    }

    /* renamed from: a */
    public void mo64139a(C9949s5 s5Var, FrameLayout frameLayout) {
        mo64700a(s5Var, frameLayout, new C9844m6(frameLayout.getContext()));
    }

    /* renamed from: a */
    public final void mo64700a(C9949s5 s5Var, FrameLayout frameLayout, C9844m6 m6Var) {
        this.f24274n = 4;
        this.f24271k = new WeakReference<>(s5Var);
        m6Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(m6Var);
        this.f24272l = new WeakReference<>(m6Var);
        m6Var.mo64749a(this.f24264d, this.f24262b);
        m6Var.setVideoDialogViewListener(this);
        m6Var.mo64750a(this.f24278r);
        this.f24268h.mo65481a(true);
        mo64701a(m6Var.getAdVideoView(), this.f24278r);
    }

    /* renamed from: a */
    public final void mo64701a(C10055y5 y5Var, boolean z) {
        if (this.f24280t == null) {
            C9651c9 a = this.f24265e.mo64232a();
            this.f24280t = a;
            a.mo63727a((C9651c9.C9652a) this);
        }
        if (z) {
            mo64715w();
        } else {
            mo64718z();
        }
        this.f24280t.mo63728a(y5Var);
        y5Var.mo65764a(this.f24262b.getWidth(), this.f24262b.getHeight());
        if (!this.f24280t.mo63730c()) {
            this.f24280t.mo63725a(this.f24267g, y5Var.getContext());
            long j = this.f24282v;
            if (j > 0) {
                this.f24280t.mo63724a(j);
                return;
            }
            return;
        }
        mo63753o();
    }

    /* renamed from: a */
    public void mo63747a(String str) {
        this.f24268h.mo65488f();
        VideoData mediaData = this.f24261a.getMediaData();
        if (mediaData == null || !this.f24267g.toString().equals(mediaData.getData())) {
            C9837c cVar = this.f24279s;
            if (cVar != null) {
                cVar.mo63991c();
                return;
            }
            return;
        }
        C9672e0.m27882a("Try to play video stream from URL");
        this.f24267g = Uri.parse(mediaData.getUrl());
        WeakReference<Context> weakReference = this.f24273m;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null && context != null) {
            c9Var.mo63725a(this.f24267g, context);
        }
    }

    /* renamed from: a */
    public void mo64702a(boolean z) {
        this.f24284x = z;
    }

    /* renamed from: b */
    public final void mo64703b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f24263c, 3, 2);
        }
    }

    /* renamed from: b */
    public void mo64704b(View view) {
        WeakReference<Context> weakReference = this.f24273m;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            context = view.getContext();
        }
        mo64703b(context);
        if (!this.f24283w) {
            if (this.f24274n == 1) {
                this.f24274n = 4;
            }
            this.f24276p = true;
            try {
                C9949s5.m29241a(this, context).show();
            } catch (Throwable th) {
                th.printStackTrace();
                C9672e0.m27883b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
                mo64143q();
            }
        }
    }

    /* renamed from: b */
    public void mo64141b(boolean z) {
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null && !z) {
            this.f24282v = c9Var.mo63742n();
            mo64710r();
            mo63748f();
        }
    }

    /* renamed from: c */
    public void mo64705c(boolean z) {
        this.f24283w = z;
    }

    /* renamed from: d */
    public void mo64706d() {
        C9651c9 c9Var = this.f24280t;
        if (c9Var == null) {
            this.f24278r = !this.f24278r;
        } else if (c9Var.mo63737i()) {
            this.f24280t.mo63738j();
            this.f24268h.mo65484b(true);
            this.f24278r = false;
        } else {
            this.f24280t.mo63743o();
            this.f24268h.mo65484b(false);
            this.f24278r = true;
        }
    }

    /* renamed from: e */
    public void mo64707e() {
        C9844m6 m6Var;
        mo64717y();
        WeakReference<C9844m6> weakReference = this.f24272l;
        if (!(weakReference == null || (m6Var = (C9844m6) weakReference.get()) == null)) {
            m6Var.mo64756g();
        }
        C9837c cVar = this.f24279s;
        if (cVar != null) {
            cVar.mo63994f();
        }
    }

    /* renamed from: f */
    public void mo63748f() {
        Context context;
        MediaAdView t = mo64712t();
        if (t != null) {
            context = t.getContext();
            if (!this.f24283w) {
                t.getPlayButtonView().setVisibility(0);
            }
            t.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        mo64716x();
        if (t != null) {
            mo64695a(context);
        }
        C9837c cVar = this.f24279s;
        if (cVar != null) {
            cVar.mo63992d();
        }
    }

    /* renamed from: g */
    public void mo63749g() {
        WeakReference<C9844m6> weakReference;
        C9844m6 m6Var;
        this.f24274n = 4;
        MediaAdView t = mo64712t();
        if (t != null) {
            if (!this.f24283w) {
                t.getProgressBarView().setVisibility(0);
            }
            t.getPlayButtonView().setVisibility(8);
        }
        if (this.f24276p && (weakReference = this.f24272l) != null && (m6Var = (C9844m6) weakReference.get()) != null) {
            m6Var.mo64753d();
        }
    }

    /* renamed from: h */
    public void mo63750h() {
    }

    /* renamed from: i */
    public void mo64708i() {
        if (this.f24274n == 1) {
            mo64716x();
            this.f24274n = 2;
            C9837c cVar = this.f24279s;
            if (cVar != null) {
                cVar.mo63992d();
            }
            WeakReference<C9949s5> weakReference = this.f24271k;
            if (weakReference != null && ((C9949s5) weakReference.get()) != null) {
                this.f24268h.mo65487e();
            }
        }
    }

    /* renamed from: j */
    public void mo63751j() {
        Context context;
        WeakReference<C9844m6> weakReference;
        C9844m6 m6Var;
        this.f24277q = false;
        this.f24282v = 0;
        MediaAdView t = mo64712t();
        if (t != null) {
            ImageView imageView = t.getImageView();
            ImageData image = this.f24261a.getImage();
            if (image != null) {
                imageView.setImageBitmap(image.getBitmap());
            }
            imageView.setVisibility(0);
            if (!this.f24283w) {
                t.getPlayButtonView().setVisibility(0);
            }
            t.getProgressBarView().setVisibility(8);
            context = t.getContext();
        } else {
            context = null;
        }
        if (!(!this.f24276p || (weakReference = this.f24272l) == null || (m6Var = (C9844m6) weakReference.get()) == null)) {
            m6Var.mo64759h();
            context = m6Var.getContext();
        }
        if (context != null) {
            mo64695a(context);
        }
    }

    /* renamed from: k */
    public void mo64709k() {
        C9949s5 s5Var;
        WeakReference<C9949s5> weakReference = this.f24271k;
        if (!(weakReference == null || (s5Var = (C9949s5) weakReference.get()) == null)) {
            s5Var.getContext();
            mo64717y();
            this.f24268h.mo65490h();
        }
        C9837c cVar = this.f24279s;
        if (cVar != null) {
            cVar.mo63994f();
        }
    }

    /* renamed from: l */
    public void mo63752l() {
        this.f24268h.mo65489g();
        C9837c cVar = this.f24279s;
        if (cVar != null) {
            cVar.mo63991c();
        }
    }

    /* renamed from: o */
    public void mo63753o() {
        WeakReference<C9844m6> weakReference;
        C9844m6 m6Var;
        if (this.f24274n != 1) {
            this.f24274n = 1;
            MediaAdView t = mo64712t();
            if (t != null) {
                t.getProgressBarView().setVisibility(8);
                t.getPlayButtonView().setVisibility(8);
            }
            if (this.f24276p && (weakReference = this.f24272l) != null && (m6Var = (C9844m6) weakReference.get()) != null) {
                if (this.f24280t != null) {
                    C10055y5 adVideoView = m6Var.getAdVideoView();
                    adVideoView.mo65764a(this.f24262b.getWidth(), this.f24262b.getHeight());
                    this.f24280t.mo63728a(adVideoView);
                }
                m6Var.mo64755f();
            }
        }
    }

    public void onVideoCompleted() {
        MediaAdView t = mo64712t();
        if (t != null) {
            t.getProgressBarView().setVisibility(8);
            if (!this.f24283w) {
                t.getPlayButtonView().setVisibility(0);
            }
        }
        this.f24282v = 0;
    }

    /* renamed from: p */
    public void mo63891p() {
        C9672e0.m27882a("Native Ad Views without hardware acceleration is not currently supported");
        C9837c cVar = this.f24279s;
        if (cVar != null) {
            cVar.mo63991c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if ((r2 instanceof com.p374my.target.C10055y5) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if ((r2 instanceof com.p374my.target.C10055y5) != false) goto L_0x0058;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64143q() {
        /*
            r7 = this;
            java.lang.String r0 = "Dismiss dialog"
            com.p374my.target.C9672e0.m27882a(r0)
            r0 = 0
            r7.f24271k = r0
            r1 = 0
            r7.f24276p = r1
            r7.mo64715w()
            com.my.target.nativeads.views.MediaAdView r2 = r7.mo64712t()
            if (r2 != 0) goto L_0x0015
            return
        L_0x0015:
            android.content.Context r3 = r2.getContext()
            r7.mo64695a((android.content.Context) r3)
            int r3 = r7.f24274n
            r4 = 4
            r5 = 1
            if (r3 == r5) goto L_0x0041
            r6 = 2
            if (r3 == r6) goto L_0x003b
            r6 = 3
            if (r3 == r6) goto L_0x003b
            if (r3 == r4) goto L_0x002d
            r7.f24275o = r1
            goto L_0x005d
        L_0x002d:
            r7.f24275o = r5
            r7.mo63749g()
            android.view.View r2 = r2.getChildAt(r5)
            boolean r3 = r2 instanceof com.p374my.target.C10055y5
            if (r3 == 0) goto L_0x005d
            goto L_0x0058
        L_0x003b:
            r7.f24275o = r1
            r7.mo63751j()
            goto L_0x005d
        L_0x0041:
            r7.f24274n = r4
            r7.mo63753o()
            com.my.target.g2<com.my.target.common.models.VideoData> r3 = r7.f24261a
            boolean r3 = r3.isAutoPlay()
            if (r3 == 0) goto L_0x0050
            r7.f24275o = r5
        L_0x0050:
            android.view.View r2 = r2.getChildAt(r5)
            boolean r3 = r2 instanceof com.p374my.target.C10055y5
            if (r3 == 0) goto L_0x005d
        L_0x0058:
            com.my.target.y5 r2 = (com.p374my.target.C10055y5) r2
            r7.mo64701a((com.p374my.target.C10055y5) r2, (boolean) r5)
        L_0x005d:
            com.my.target.t8 r2 = r7.f24268h
            r2.mo65481a((boolean) r1)
            r7.f24272l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9834m0.mo64143q():void");
    }

    /* renamed from: r */
    public final void mo64710r() {
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null) {
            c9Var.mo63727a((C9651c9.C9652a) null);
            this.f24280t.destroy();
            this.f24280t = null;
        }
    }

    /* renamed from: s */
    public final void mo64711s() {
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null && !this.f24278r) {
            c9Var.mo63740l();
        }
    }

    /* renamed from: t */
    public final MediaAdView mo64712t() {
        WeakReference<MediaAdView> weakReference = this.f24270j;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    /* renamed from: u */
    public void mo64713u() {
        C9651c9 c9Var;
        if (this.f24281u && !this.f24276p) {
            this.f24281u = false;
            if (this.f24274n == 1 && (c9Var = this.f24280t) != null) {
                c9Var.mo63729b();
                this.f24274n = 2;
            }
            C9651c9 c9Var2 = this.f24280t;
            if (c9Var2 != null) {
                c9Var2.mo63727a((C9651c9.C9652a) null);
                this.f24280t.mo63728a((C10055y5) null);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64714v() {
        /*
            r6 = this;
            com.my.target.nativeads.views.MediaAdView r0 = r6.mo64712t()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "Trying to play video in unregistered view"
            com.p374my.target.C9672e0.m27882a(r0)
            r6.mo64710r()
            return
        L_0x000f:
            int r1 = r0.getWindowVisibility()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0035
            int r0 = r6.f24274n
            if (r0 != r3) goto L_0x0031
            com.my.target.c9 r0 = r6.f24280t
            if (r0 == 0) goto L_0x0025
            long r0 = r0.mo63742n()
            r6.f24282v = r0
        L_0x0025:
            r6.mo64710r()
            r0 = 4
            r6.f24274n = r0
            r6.f24281u = r2
            r6.mo63749g()
            goto L_0x0034
        L_0x0031:
            r6.mo64710r()
        L_0x0034:
            return
        L_0x0035:
            boolean r1 = r6.f24281u
            if (r1 == 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.ref.WeakReference<android.content.Context> r1 = r6.f24273m
            r4 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            goto L_0x0047
        L_0x0046:
            r1 = r4
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r6.mo64699a((com.p374my.target.nativeads.views.MediaAdView) r0, (android.content.Context) r1)
        L_0x004c:
            r6.f24281u = r3
            android.view.View r1 = r0.getChildAt(r3)
            boolean r1 = r1 instanceof com.p374my.target.C10055y5
            if (r1 == 0) goto L_0x005d
            android.view.View r1 = r0.getChildAt(r3)
            r4 = r1
            com.my.target.y5 r4 = (com.p374my.target.C10055y5) r4
        L_0x005d:
            if (r4 != 0) goto L_0x0063
            r6.mo64710r()
            return
        L_0x0063:
            com.my.target.c9 r1 = r6.f24280t
            if (r1 == 0) goto L_0x0076
            android.net.Uri r5 = r6.f24267g
            android.net.Uri r1 = r1.mo63739k()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0076
            r6.mo64710r()
        L_0x0076:
            boolean r1 = r6.f24275o
            if (r1 != 0) goto L_0x008e
            boolean r1 = r6.f24283w
            if (r1 != 0) goto L_0x0085
            android.view.View r1 = r0.getPlayButtonView()
            r1.setVisibility(r2)
        L_0x0085:
            android.widget.ProgressBar r0 = r0.getProgressBarView()
            r1 = 8
            r0.setVisibility(r1)
        L_0x008e:
            boolean r0 = r6.f24275o
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r6.f24276p
            if (r0 != 0) goto L_0x00c5
            com.my.target.c9 r0 = r6.f24280t
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.mo63734f()
            if (r0 == 0) goto L_0x00bf
            com.my.target.c9 r0 = r6.f24280t
            r0.mo63728a((com.p374my.target.C10055y5) r4)
            com.my.target.common.models.VideoData r0 = r6.f24262b
            int r0 = r0.getWidth()
            com.my.target.common.models.VideoData r1 = r6.f24262b
            int r1 = r1.getHeight()
            r4.mo65764a(r0, r1)
            com.my.target.c9 r0 = r6.f24280t
            r0.mo63727a((com.p374my.target.C9651c9.C9652a) r6)
            com.my.target.c9 r0 = r6.f24280t
            r0.mo63723a()
            goto L_0x00c2
        L_0x00bf:
            r6.mo64701a((com.p374my.target.C10055y5) r4, (boolean) r3)
        L_0x00c2:
            r6.mo64715w()
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9834m0.mo64714v():void");
    }

    /* renamed from: w */
    public final void mo64715w() {
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null) {
            c9Var.mo63743o();
        }
    }

    /* renamed from: x */
    public final void mo64716x() {
        WeakReference<C9844m6> weakReference;
        if (this.f24276p && (weakReference = this.f24272l) != null) {
            this.f24274n = 2;
            C9844m6 m6Var = (C9844m6) weakReference.get();
            if (m6Var != null) {
                C9651c9 c9Var = this.f24280t;
                if (c9Var != null) {
                    c9Var.mo63729b();
                }
                m6Var.mo64754e();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64717y() {
        /*
            r4 = this;
            com.my.target.c9 r0 = r4.f24280t
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.mo63734f()
            if (r0 == 0) goto L_0x005d
            com.my.target.nativeads.views.MediaAdView r0 = r4.mo64712t()
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "Trying to play video in unregistered view"
            com.p374my.target.C9672e0.m27882a(r0)
            r4.mo64710r()
            return
        L_0x0019:
            r1 = 0
            boolean r2 = r4.f24276p
            if (r2 == 0) goto L_0x002d
            java.lang.ref.WeakReference<com.my.target.m6> r2 = r4.f24272l
            if (r2 == 0) goto L_0x002d
            java.lang.Object r0 = r2.get()
            com.my.target.m6 r0 = (com.p374my.target.C9844m6) r0
            com.my.target.y5 r1 = r0.getAdVideoView()
            goto L_0x003d
        L_0x002d:
            r2 = 1
            android.view.View r3 = r0.getChildAt(r2)
            boolean r3 = r3 instanceof com.p374my.target.C10055y5
            if (r3 == 0) goto L_0x003d
            android.view.View r0 = r0.getChildAt(r2)
            r1 = r0
            com.my.target.y5 r1 = (com.p374my.target.C10055y5) r1
        L_0x003d:
            if (r1 != 0) goto L_0x0043
            r4.mo64710r()
            return
        L_0x0043:
            com.my.target.common.models.VideoData r0 = r4.f24262b
            int r0 = r0.getWidth()
            com.my.target.common.models.VideoData r2 = r4.f24262b
            int r2 = r2.getHeight()
            r1.mo65764a(r0, r2)
            com.my.target.c9 r0 = r4.f24280t
            r0.mo63728a((com.p374my.target.C10055y5) r1)
            com.my.target.c9 r0 = r4.f24280t
            r0.mo63723a()
            goto L_0x0074
        L_0x005d:
            boolean r0 = r4.f24276p
            if (r0 == 0) goto L_0x0074
            java.lang.ref.WeakReference<com.my.target.m6> r0 = r4.f24272l
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r0.get()
            com.my.target.m6 r0 = (com.p374my.target.C9844m6) r0
            com.my.target.y5 r0 = r0.getAdVideoView()
            boolean r1 = r4.f24278r
            r4.mo64701a((com.p374my.target.C10055y5) r0, (boolean) r1)
        L_0x0074:
            r4.mo63749g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9834m0.mo64717y():void");
    }

    /* renamed from: z */
    public final void mo64718z() {
        C9651c9 c9Var = this.f24280t;
        if (c9Var != null) {
            c9Var.mo63738j();
        }
    }
}
