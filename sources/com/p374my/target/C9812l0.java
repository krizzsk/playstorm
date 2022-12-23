package com.p374my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.exoplayer2.audio.AacUtil;
import com.p374my.target.C10072z5;
import com.p374my.target.C9644c6;
import com.p374my.target.C9897p3;
import com.p374my.target.C9949s5;
import com.p374my.target.common.models.VideoData;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.l0 */
public final class C9812l0 implements C9949s5.C9950a, C10072z5.C10073a {

    /* renamed from: a */
    public final C9777j2 f24222a;

    /* renamed from: b */
    public C9609a9 f24223b;

    /* renamed from: c */
    public WeakReference<C9949s5> f24224c;

    /* renamed from: d */
    public WeakReference<C10072z5> f24225d;

    /* renamed from: e */
    public C9813a f24226e;

    /* renamed from: f */
    public C9897p3 f24227f;

    /* renamed from: g */
    public C10072z5 f24228g;

    /* renamed from: h */
    public boolean f24229h;

    /* renamed from: i */
    public boolean f24230i;

    /* renamed from: com.my.target.l0$a */
    public interface C9813a {
        /* renamed from: a */
        void mo63988a(C9777j2 j2Var, String str, Context context);
    }

    public C9812l0(C9777j2 j2Var) {
        this.f24222a = j2Var;
    }

    /* renamed from: a */
    public static C9812l0 m28527a(C9777j2 j2Var) {
        return new C9812l0(j2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28528a(ProgressBar progressBar) {
        mo64627a(this.f24228g, progressBar);
    }

    /* renamed from: a */
    public void mo64624a(Context context) {
        C9949s5 a = C9949s5.m29241a(this, context);
        this.f24224c = new WeakReference<>(a);
        try {
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            C9672e0.m27883b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            mo64143q();
        }
    }

    /* renamed from: a */
    public void mo63609a(WebView webView) {
        C9897p3 p3Var = this.f24227f;
        if (p3Var != null) {
            p3Var.mo65200a((View) webView, new C9897p3.C9900c[0]);
            this.f24227f.mo65205c();
        }
    }

    /* renamed from: a */
    public void mo64625a(C9813a aVar) {
        this.f24226e = aVar;
    }

    /* renamed from: a */
    public final void m28529b(C9949s5 s5Var) {
        if (s5Var.isShowing()) {
            s5Var.dismiss();
        }
    }

    /* renamed from: a */
    public void mo64139a(C9949s5 s5Var, FrameLayout frameLayout) {
        C9644c6 c6Var = new C9644c6(frameLayout.getContext());
        c6Var.setOnCloseListener(new C9644c6.C9645a(s5Var) {
            public final /* synthetic */ C9949s5 f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: d */
            public final void mo63312d() {
                C9812l0.this.m28529b(this.f$1);
            }
        });
        frameLayout.addView(c6Var, -1, -1);
        C10072z5 z5Var = new C10072z5(frameLayout.getContext());
        this.f24228g = z5Var;
        z5Var.setVisibility(8);
        this.f24228g.setBannerWebViewListener(this);
        c6Var.addView(this.f24228g, new FrameLayout.LayoutParams(-1, -1));
        this.f24228g.setData(this.f24222a.getSource());
        ProgressBar progressBar = new ProgressBar(frameLayout.getContext(), (AttributeSet) null, 16842871);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        frameLayout.postDelayed(new Runnable(progressBar) {
            public final /* synthetic */ ProgressBar f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9812l0.this.m28528a(this.f$1);
            }
        }, 555);
    }

    /* renamed from: a */
    public final void mo64627a(C10072z5 z5Var, ProgressBar progressBar) {
        this.f24227f = C9897p3.m28962a(this.f24222a, 1, (C9711g2<VideoData>) null, z5Var.getContext());
        this.f24225d = new WeakReference<>(z5Var);
        progressBar.setVisibility(8);
        z5Var.setVisibility(0);
        C9609a9 a9Var = this.f24223b;
        if (a9Var != null) {
            a9Var.mo63497b();
        }
        C9609a9 a = C9609a9.m27615a(this.f24222a.getViewability(), this.f24222a.getStatHolder());
        this.f24223b = a;
        if (this.f24230i) {
            a.mo63498b(z5Var);
        }
        C10039x8.m29720c((List<C9626b3>) this.f24222a.getStatHolder().mo63675a("playbackStarted"), z5Var.getContext());
    }

    /* renamed from: a */
    public void mo63612a(String str) {
        C9672e0.m27882a("content JS error: " + str);
    }

    /* renamed from: b */
    public void mo63615b(String str) {
        C9949s5 s5Var;
        WeakReference<C9949s5> weakReference = this.f24224c;
        if (weakReference != null && (s5Var = (C9949s5) weakReference.get()) != null) {
            C9813a aVar = this.f24226e;
            if (aVar != null) {
                aVar.mo63988a(this.f24222a, str, s5Var.getContext());
            }
            this.f24229h = true;
            m28529b(s5Var);
        }
    }

    /* renamed from: b */
    public void mo64141b(boolean z) {
        C10072z5 z5Var;
        if (z != this.f24230i) {
            this.f24230i = z;
            C9609a9 a9Var = this.f24223b;
            if (a9Var != null) {
                if (z) {
                    WeakReference<C10072z5> weakReference = this.f24225d;
                    if (weakReference != null && (z5Var = (C10072z5) weakReference.get()) != null) {
                        this.f24223b.mo63498b(z5Var);
                        return;
                    }
                    return;
                }
                a9Var.mo63497b();
            }
        }
    }

    /* renamed from: q */
    public void mo64143q() {
        WeakReference<C9949s5> weakReference = this.f24224c;
        if (weakReference != null) {
            C9949s5 s5Var = (C9949s5) weakReference.get();
            if (!this.f24229h) {
                C10039x8.m29720c((List<C9626b3>) this.f24222a.getStatHolder().mo63675a("closedByUser"), s5Var.getContext());
            }
            this.f24224c.clear();
            this.f24224c = null;
        }
        C9609a9 a9Var = this.f24223b;
        if (a9Var != null) {
            a9Var.mo63497b();
            this.f24223b = null;
        }
        WeakReference<C10072z5> weakReference2 = this.f24225d;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f24225d = null;
        }
        C9897p3 p3Var = this.f24227f;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
        C10072z5 z5Var = this.f24228g;
        if (z5Var != null) {
            z5Var.mo63459a(this.f24227f != null ? AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND : 0);
        }
    }
}
