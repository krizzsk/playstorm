package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.p374my.target.C10031x4;
import com.p374my.target.C10072z5;
import com.p374my.target.C9707g0;
import com.p374my.target.C9894p1;
import com.p374my.target.common.models.ImageData;
import java.util.List;

/* renamed from: com.my.target.k4 */
public class C9797k4 implements C10072z5.C10073a, C10031x4 {

    /* renamed from: a */
    public final C10072z5 f24186a;

    /* renamed from: b */
    public final C9720g6 f24187b;

    /* renamed from: c */
    public final FrameLayout f24188c;

    /* renamed from: d */
    public final Handler f24189d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public final C10020w5 f24190e;

    /* renamed from: f */
    public C9802e f24191f;

    /* renamed from: g */
    public C9801d f24192g;

    /* renamed from: h */
    public C10031x4.C10032a f24193h;

    /* renamed from: i */
    public long f24194i;

    /* renamed from: j */
    public long f24195j;

    /* renamed from: k */
    public C9657d2 f24196k;

    /* renamed from: l */
    public long f24197l;

    /* renamed from: m */
    public long f24198m;

    /* renamed from: n */
    public C9730h0 f24199n;

    /* renamed from: com.my.target.k4$a */
    public class C9798a implements View.OnClickListener {
        public C9798a() {
        }

        public void onClick(View view) {
            C9797k4.this.mo64589c();
        }
    }

    /* renamed from: com.my.target.k4$b */
    public class C9799b implements C9707g0.C9709b {

        /* renamed from: a */
        public final /* synthetic */ C10066z1 f24201a;

        public C9799b(C10066z1 z1Var) {
            this.f24201a = z1Var;
        }

        /* renamed from: a */
        public void mo63363a(Context context) {
            if (C9797k4.this.f24193h != null) {
                C9797k4.this.f24193h.mo65209a(this.f24201a, context);
            }
        }
    }

    /* renamed from: com.my.target.k4$c */
    public static class C9800c implements View.OnClickListener {

        /* renamed from: a */
        public final C9797k4 f24203a;

        public C9800c(C9797k4 k4Var) {
            this.f24203a = k4Var;
        }

        public void onClick(View view) {
            C10031x4.C10032a d = this.f24203a.mo64591d();
            if (d != null) {
                d.mo65208a();
            }
        }
    }

    /* renamed from: com.my.target.k4$d */
    public static class C9801d implements Runnable {

        /* renamed from: a */
        public final C9797k4 f24204a;

        public C9801d(C9797k4 k4Var) {
            this.f24204a = k4Var;
        }

        public void run() {
            C10031x4.C10032a d = this.f24204a.mo64591d();
            if (d != null) {
                d.mo65637b(this.f24204a.f24188c.getContext());
            }
        }
    }

    /* renamed from: com.my.target.k4$e */
    public static class C9802e implements Runnable {

        /* renamed from: a */
        public final C9720g6 f24205a;

        public C9802e(C9720g6 g6Var) {
            this.f24205a = g6Var;
        }

        public void run() {
            C9672e0.m27882a("banner became just closeable");
            this.f24205a.setVisibility(0);
        }
    }

    public C9797k4(Context context) {
        C10072z5 z5Var = new C10072z5(context);
        this.f24186a = z5Var;
        C9720g6 g6Var = new C9720g6(context);
        this.f24187b = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24188c = frameLayout;
        g6Var.setContentDescription("Close");
        C10059y8.m29840b(g6Var, "close_button");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        g6Var.setVisibility(8);
        g6Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        z5Var.setLayoutParams(layoutParams2);
        frameLayout.addView(z5Var);
        if (g6Var.getParent() == null) {
            frameLayout.addView(g6Var);
        }
        Bitmap a = C9905p5.m28985a(C10059y8.m29843c(context).mo65778b(28));
        if (a != null) {
            g6Var.mo64102a(a, false);
        }
        C10020w5 w5Var = new C10020w5(context);
        this.f24190e = w5Var;
        int a2 = C10059y8.m29824a(10, context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(a2, a2, a2, a2);
        frameLayout.addView(w5Var, layoutParams3);
    }

    /* renamed from: a */
    public static C9797k4 m28473a(Context context) {
        return new C9797k4(context);
    }

    /* renamed from: a */
    public void mo64581a() {
        long j = this.f24195j;
        if (j > 0) {
            mo64583a(j);
        }
        long j2 = this.f24198m;
        if (j2 > 0) {
            mo64588b(j2);
        }
    }

    /* renamed from: a */
    public void mo64582a(int i) {
        this.f24188c.removeView(this.f24186a);
        this.f24186a.mo63459a(i);
    }

    /* renamed from: a */
    public final void mo64583a(long j) {
        C9802e eVar = this.f24191f;
        if (eVar != null) {
            this.f24189d.removeCallbacks(eVar);
            this.f24194i = System.currentTimeMillis();
            this.f24189d.postDelayed(this.f24191f, j);
        }
    }

    /* renamed from: a */
    public void mo63609a(WebView webView) {
        C10031x4.C10032a aVar = this.f24193h;
        if (aVar != null) {
            aVar.mo65635a(webView);
        }
    }

    /* renamed from: a */
    public void mo64584a(C9963t2 t2Var, C9657d2 d2Var) {
        this.f24196k = d2Var;
        this.f24186a.setBannerWebViewListener(this);
        String source = d2Var.getSource();
        if (source != null) {
            this.f24186a.setData(source);
            ImageData closeIcon = d2Var.getCloseIcon();
            if (closeIcon != null) {
                this.f24187b.mo64102a(closeIcon.getBitmap(), false);
            }
            this.f24187b.setOnClickListener(new C9800c(this));
            if (d2Var.getAllowCloseDelay() > 0.0f) {
                C9672e0.m27882a("banner will be allowed to close in " + d2Var.getAllowCloseDelay() + " seconds");
                this.f24191f = new C9802e(this.f24187b);
                long allowCloseDelay = (long) (d2Var.getAllowCloseDelay() * 1000.0f);
                this.f24195j = allowCloseDelay;
                mo64583a(allowCloseDelay);
            } else {
                C9672e0.m27882a("banner is allowed to close");
                this.f24187b.setVisibility(0);
            }
            float timeToReward = d2Var.getTimeToReward();
            if (timeToReward > 0.0f) {
                this.f24192g = new C9801d(this);
                long j = ((long) timeToReward) * 1000;
                this.f24198m = j;
                mo64588b(j);
            }
            mo64586a((C10066z1) d2Var);
            C10031x4.C10032a aVar = this.f24193h;
            if (aVar != null) {
                aVar.mo65210a((C10066z1) d2Var, mo64595j());
                return;
            }
            return;
        }
        mo64590c("failed to load, null source");
    }

    /* renamed from: a */
    public void mo64585a(C10031x4.C10032a aVar) {
        this.f24193h = aVar;
    }

    /* renamed from: a */
    public final void mo64586a(C10066z1 z1Var) {
        C9894p1 adChoices = z1Var.getAdChoices();
        if (adChoices == null) {
            this.f24190e.setVisibility(8);
            return;
        }
        this.f24190e.setImageBitmap(adChoices.mo65194c().getBitmap());
        this.f24190e.setOnClickListener(new C9798a());
        List<C9894p1.C9895a> a = adChoices.mo65191a();
        if (a != null) {
            C9730h0 a2 = C9730h0.m28115a(a);
            this.f24199n = a2;
            a2.mo64137a((C9707g0.C9709b) new C9799b(z1Var));
        }
    }

    /* renamed from: a */
    public void mo63612a(String str) {
        mo64590c(str);
    }

    /* renamed from: b */
    public void mo64587b() {
        if (this.f24194i > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f24194i;
            if (currentTimeMillis > 0) {
                long j = this.f24195j;
                if (currentTimeMillis < j) {
                    this.f24195j = j - currentTimeMillis;
                }
            }
            this.f24195j = 0;
        }
        if (this.f24197l > 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - this.f24197l;
            if (currentTimeMillis2 > 0) {
                long j2 = this.f24198m;
                if (currentTimeMillis2 < j2) {
                    this.f24198m = j2 - currentTimeMillis2;
                }
            }
            this.f24198m = 0;
        }
        C9801d dVar = this.f24192g;
        if (dVar != null) {
            this.f24189d.removeCallbacks(dVar);
        }
        C9802e eVar = this.f24191f;
        if (eVar != null) {
            this.f24189d.removeCallbacks(eVar);
        }
    }

    /* renamed from: b */
    public final void mo64588b(long j) {
        C9801d dVar = this.f24192g;
        if (dVar != null) {
            this.f24189d.removeCallbacks(dVar);
            this.f24197l = System.currentTimeMillis();
            this.f24189d.postDelayed(this.f24192g, j);
        }
    }

    /* renamed from: b */
    public void mo63615b(String str) {
        C10031x4.C10032a aVar = this.f24193h;
        if (aVar != null) {
            aVar.mo65211a(this.f24196k, str, mo64595j().getContext());
        }
    }

    /* renamed from: c */
    public void mo64589c() {
        C9894p1 adChoices;
        C9657d2 d2Var = this.f24196k;
        if (d2Var != null && (adChoices = d2Var.getAdChoices()) != null) {
            C9730h0 h0Var = this.f24199n;
            if (h0Var == null || !h0Var.mo64142c()) {
                Context context = mo64595j().getContext();
                if (h0Var == null) {
                    C9832l8.m28605a(adChoices.mo65193b(), context);
                } else {
                    h0Var.mo64136a(context);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo64590c(String str) {
        C10031x4.C10032a aVar = this.f24193h;
        if (aVar != null) {
            aVar.onNoAd(str);
        }
    }

    /* renamed from: d */
    public C10031x4.C10032a mo64591d() {
        return this.f24193h;
    }

    public void destroy() {
        mo64582a(0);
    }

    /* renamed from: e */
    public void mo64593e() {
    }

    public View getCloseButton() {
        return this.f24187b;
    }

    /* renamed from: j */
    public View mo64595j() {
        return this.f24188c;
    }
}
