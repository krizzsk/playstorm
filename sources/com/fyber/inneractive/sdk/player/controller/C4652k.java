package com.fyber.inneractive.sdk.player.controller;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4167R;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4310h;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4284b;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.model.vast.C4477a;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.p192ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.C4591c;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.controller.C4663s;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p191ui.C5092a;
import com.fyber.inneractive.sdk.player.p191ui.C5093b;
import com.fyber.inneractive.sdk.player.p191ui.C5096e;
import com.fyber.inneractive.sdk.player.p191ui.C5099h;
import com.fyber.inneractive.sdk.player.p191ui.C5100i;
import com.fyber.inneractive.sdk.player.p191ui.C5105j;
import com.fyber.inneractive.sdk.player.p191ui.C5106k;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.C5313b;
import com.fyber.inneractive.sdk.util.C5317c;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.k */
public abstract class C4652k<ListenerT extends C4663s> implements C4632b<ListenerT>, C4640g.C4646f, C4640g.C4645e, C5099h {

    /* renamed from: a */
    public C4591c f11610a;

    /* renamed from: b */
    public C4346z f11611b;

    /* renamed from: c */
    public C4309s f11612c;

    /* renamed from: d */
    public C5100i f11613d;

    /* renamed from: e */
    public C4640g.C4647g f11614e;

    /* renamed from: f */
    public int f11615f;

    /* renamed from: g */
    public ListenerT f11616g;

    /* renamed from: h */
    public boolean f11617h;

    /* renamed from: i */
    public float f11618i;

    /* renamed from: j */
    public Runnable f11619j;

    /* renamed from: k */
    public boolean f11620k;

    /* renamed from: l */
    public boolean f11621l;

    /* renamed from: m */
    public Application.ActivityLifecycleCallbacks f11622m;

    /* renamed from: n */
    public boolean f11623n;

    /* renamed from: o */
    public boolean f11624o;

    /* renamed from: p */
    public Bitmap f11625p;

    /* renamed from: q */
    public AsyncTask<?, ?, ?> f11626q;

    /* renamed from: r */
    public boolean f11627r;

    /* renamed from: s */
    public boolean f11628s;

    /* renamed from: t */
    public boolean f11629t;

    /* renamed from: u */
    public boolean f11630u;

    /* renamed from: v */
    public boolean f11631v;

    /* renamed from: w */
    public C5096e f11632w;

    /* renamed from: x */
    public Skip f11633x;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$a */
    public class C4653a extends GestureDetector.SimpleOnGestureListener {
        public C4653a(C4652k kVar) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$b */
    public class C4654b extends AsyncTask<Integer, Void, Bitmap> {
        public C4654b() {
        }

        public Object doInBackground(Object[] objArr) {
            Integer[] numArr = (Integer[]) objArr;
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            C4652k.this.getClass();
            Application application = C5350l.f14216a;
            Bitmap bitmap = null;
            if (!(application == null || application.getResources() == null || application.getResources().getDisplayMetrics() == null)) {
                DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                try {
                    bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (bitmap != null) {
                        bitmap.setDensity(displayMetrics.densityDpi);
                    }
                } catch (Throwable unused) {
                }
            }
            return bitmap;
        }

        public void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            super.onPostExecute(bitmap);
            C4652k kVar = C4652k.this;
            kVar.f11625p = bitmap;
            kVar.f11626q = null;
        }
    }

    public C4652k(C4591c cVar, C5100i iVar, C4346z zVar, C4309s sVar, boolean z) {
        this(cVar, iVar, zVar, sVar, z, (Skip) null);
    }

    /* renamed from: a */
    public void mo24876a(ListenerT listenert) {
        this.f11616g = listenert;
    }

    /* renamed from: a */
    public abstract void mo24890a(C5364p0 p0Var);

    /* renamed from: a */
    public void mo24792a(Exception exc) {
    }

    /* renamed from: b */
    public void mo24892b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r2 != null && r2.getVisibility() == 0 && r0.f13664o.isEnabled()) == false) goto L_0x002f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24879c() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.c r0 = r5.f11610a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r5.f11617h
            r3 = 1
            if (r2 != 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11406b
            if (r0 == 0) goto L_0x0011
            r0 = r3
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.ui.i r0 = r5.f11613d
            if (r0 == 0) goto L_0x002f
            android.widget.TextView r2 = r0.f13664o
            if (r2 == 0) goto L_0x002c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x002c
            android.widget.TextView r0 = r0.f13664o
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x002c
            r0 = r3
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 != 0) goto L_0x0050
        L_0x002f:
            com.fyber.inneractive.sdk.player.c r0 = r5.f11610a
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11406b
            int r0 = r0.mo24865d()
            com.fyber.inneractive.sdk.player.c r2 = r5.f11610a
            r4 = r2
            com.fyber.inneractive.sdk.player.f r4 = (com.fyber.inneractive.sdk.player.C5066f) r4
            com.fyber.inneractive.sdk.config.z r4 = r4.f13560A
            int r2 = com.fyber.inneractive.sdk.player.C4591c.m14068a((com.fyber.inneractive.sdk.player.C4591c) r2)
            boolean r0 = com.fyber.inneractive.sdk.player.C4591c.m14070a((int) r0, (com.fyber.inneractive.sdk.config.C4346z) r4, (int) r2)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.f11617h
            if (r0 != 0) goto L_0x0051
            int r0 = r5.f11615f
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r1 = r3
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4652k.mo24879c():boolean");
    }

    public void destroy() {
        C4640g gVar;
        Application application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f11622m;
        if (!(activityLifecycleCallbacks == null || (application = C5350l.f14216a) == null)) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        IAlog.m16699a("%sdestroy called", IAlog.m16696a((Object) this));
        C4591c cVar = this.f11610a;
        if (!(cVar == null || (gVar = cVar.f11406b) == null)) {
            List<C4640g.C4646f> list = gVar.f11580b;
            if (list != null) {
                list.remove(this);
            }
            List<C4640g.C4645e> list2 = this.f11610a.f11406b.f11581c;
            if (list2 != null) {
                list2.remove(this);
            }
        }
        mo24929j();
        mo24942h();
        AsyncTask<?, ?, ?> asyncTask = this.f11626q;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f11616g = null;
    }

    /* renamed from: e */
    public void mo24916e() {
        if (this.f11627r && !this.f11621l) {
            this.f11621l = true;
            this.f11613d.mo25746b(false);
        }
    }

    /* renamed from: e */
    public void mo24798e(boolean z) {
    }

    /* renamed from: f */
    public void mo24939f(boolean z) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (!(cVar == null || (gVar = cVar.f11406b) == null)) {
            gVar.mo24863b(z);
        }
        this.f11613d.setMuteButtonState(true);
    }

    /* renamed from: g */
    public void mo24941g() {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null) {
            List<C4640g.C4646f> list = gVar.f11580b;
            if (list != null && !list.contains(this)) {
                gVar.f11580b.add(this);
            }
            C4640g gVar2 = this.f11610a.f11406b;
            List<C4640g.C4645e> list2 = gVar2.f11581c;
            if (list2 != null && !list2.contains(this)) {
                gVar2.f11581c.add(this);
            }
        }
    }

    /* renamed from: h */
    public void mo24928h(boolean z) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar == null) {
            return;
        }
        if (!cVar.f11415k) {
            mo24901y();
        } else if (!z || (gVar = cVar.f11406b) == null) {
            cVar.mo24800g();
        } else {
            gVar.mo24857a(0, true);
        }
    }

    /* renamed from: i */
    public void mo24943i(boolean z) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (!(cVar == null || (gVar = cVar.f11406b) == null)) {
            gVar.mo24866d(z);
        }
        this.f11613d.setMuteButtonState(false);
    }

    /* renamed from: j */
    public void mo24929j() {
        Bitmap g;
        if (this.f11632w != null) {
            IAlog.m16699a("%sdestroyTextureView", IAlog.m16696a((Object) this));
            if ((this.f11625p != null) && (g = mo24940g(false)) != null) {
                this.f11613d.setLastFrameBitmap(g);
                this.f11613d.mo25746b(true);
            }
        }
    }

    /* renamed from: k */
    public void mo24944k() {
        if (mo24900w()) {
            C4309s sVar = this.f11612c;
            String str = null;
            C4284b bVar = sVar != null ? (C4284b) sVar.mo24338a(C4284b.class) : null;
            if (bVar != null) {
                bVar.mo24309e(IAConfigManager.f10525J.f10551p);
                C4477a aVar = bVar.f10624e;
                if (aVar != null && aVar.f11059d) {
                    str = aVar.f11057b;
                }
            }
            if (str != null) {
                this.f11613d.setSkipText(str);
            } else {
                C5100i iVar = this.f11613d;
                iVar.setSkipText(iVar.getContext().getString(C4167R.string.ia_video_skip_text));
            }
            TextView textView = this.f11613d.f13664o;
            if (textView != null) {
                textView.setEnabled(true);
            }
            this.f11615f = 0;
            ListenerT listenert = this.f11616g;
            if (listenert != null) {
                listenert.mo24995e();
            }
        }
    }

    /* renamed from: l */
    public abstract int mo24894l();

    /* renamed from: m */
    public final float mo24945m() {
        try {
            return (float) ((AudioManager) this.f11613d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* renamed from: n */
    public abstract int mo24895n();

    /* renamed from: o */
    public boolean mo24946o() {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar == null || (gVar = cVar.f11406b) == null) {
            return false;
        }
        if (gVar.mo24871i()) {
            return true;
        }
        if (mo24945m() == 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public abstract void mo24896p();

    public void pauseVideo() {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null) {
            if (gVar.f11583e != C4668b.Paused) {
                IAlog.m16699a("%spauseVideo %s", IAlog.m16696a((Object) this), this.f11613d);
                TextureView textureView = this.f11610a.f11406b.f11588j;
                if (textureView != null && textureView.getParent() != null && textureView.getParent().equals(this.f11613d.getTextureHost())) {
                    this.f11610a.f11406b.mo24872k();
                    return;
                }
                return;
            }
            IAlog.m16699a("%spauseVideo called in bad state! %s", IAlog.m16696a((Object) this), this.f11610a.f11406b.f11583e);
        }
    }

    /* renamed from: q */
    public void mo24947q() {
        if (!this.f11613d.mo25750d()) {
            this.f11613d.mo25744a(false);
            mo24942h();
            mo24901y();
            this.f11620k = false;
            this.f11617h = true;
        }
    }

    /* renamed from: r */
    public abstract void mo24897r();

    /* renamed from: s */
    public void mo24930s() {
        mo24942h();
        this.f11613d.mo25744a(false);
        mo24901y();
    }

    /* renamed from: t */
    public abstract void mo24898t();

    /* renamed from: u */
    public void mo24931u() {
    }

    /* renamed from: v */
    public void mo24899v() {
        C4640g gVar;
        this.f11613d.mo25744a(false);
        this.f11613d.mo25748c(false);
        C5100i iVar = this.f11613d;
        C5093b bVar = new C5093b();
        bVar.f13629b = false;
        iVar.mo25742a(new C5092a(bVar));
        IAsmoothProgressBar iAsmoothProgressBar = this.f11613d.f13671v;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(0);
        }
        ImageView imageView = this.f11613d.f13669t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = this.f11613d.f13663n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        mo24942h();
        if (this.f11610a != null && mo24900w() && !this.f11617h) {
            int d = this.f11610a.f11406b.mo24865d();
            C4591c cVar = this.f11610a;
            if (C4591c.m14070a(d, ((C5066f) cVar).f13560A, C4591c.m14068a(cVar))) {
                if (this.f11615f <= 0) {
                    this.f11613d.mo25749d(true);
                    mo24944k();
                } else {
                    C4591c cVar2 = this.f11610a;
                    if (cVar2 != null && (gVar = cVar2.f11406b) != null && this.f11615f >= gVar.mo24865d() / 1000) {
                        this.f11613d.mo25749d(false);
                    } else if (!this.f11628s) {
                        this.f11613d.mo25749d(true);
                        mo24938c(this.f11615f);
                        this.f11628s = true;
                    }
                }
            }
        }
        ListenerT listenert = this.f11616g;
        if (listenert != null && !this.f11620k) {
            this.f11620k = true;
            listenert.mo25000l();
        }
        this.f11624o = false;
        this.f11629t = false;
    }

    /* renamed from: w */
    public abstract boolean mo24900w();

    /* renamed from: x */
    public void mo24948x() {
        boolean z;
        C4309s sVar = this.f11612c;
        String str = null;
        C4292j jVar = sVar != null ? (C4292j) sVar.mo24338a(C4292j.class) : null;
        C4309s sVar2 = this.f11612c;
        C4284b bVar = sVar2 != null ? (C4284b) sVar2.mo24338a(C4284b.class) : null;
        boolean z2 = true;
        if (jVar != null) {
            z2 = jVar.mo24313a("show_cta", true);
            z = jVar.mo24320c();
        } else {
            z = false;
        }
        if (bVar != null) {
            bVar.mo24309e(IAConfigManager.f10525J.f10551p);
            C4477a aVar = bVar.f10624e;
            if (aVar != null && aVar.f11059d) {
                str = aVar.f11056a;
            }
        }
        this.f11613d.mo25745a(z2, z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24901y() {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003e
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11406b
            if (r0 == 0) goto L_0x0015
            com.fyber.inneractive.sdk.player.enums.b r0 = r0.f11583e
            com.fyber.inneractive.sdk.player.enums.b r4 = com.fyber.inneractive.sdk.player.enums.C4668b.f11663i
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0019
        L_0x0015:
            boolean r0 = r13.f11629t
            if (r0 == 0) goto L_0x003e
        L_0x0019:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            com.fyber.inneractive.sdk.measurement.g r0 = r0.f11413i
            if (r0 == 0) goto L_0x003e
            com.iab.omid.library.fyber.adsession.AdSession r4 = r0.f11013a
            if (r4 == 0) goto L_0x0038
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "OMVideo"
            r4[r3] = r5
            java.lang.String r5 = "%s destroy"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r5, r4)
            com.iab.omid.library.fyber.adsession.AdSession r4 = r0.f11013a     // Catch:{ all -> 0x0034 }
            r4.finish()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r4 = move-exception
            r0.mo24663a((java.lang.Throwable) r4)
        L_0x0038:
            r0.f11014b = r2
            r0.f11013a = r2
            r0.f11015c = r2
        L_0x003e:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.i r4 = r0.f10557v
            com.fyber.inneractive.sdk.config.h r4 = r4.f10660b
            java.lang.String r5 = "endcard"
            com.fyber.inneractive.sdk.config.f r4 = r4.mo24346a((java.lang.String) r5)
            java.lang.String r5 = "dsos"
            boolean r4 = r4.mo24302a(r5, r3)
            com.fyber.inneractive.sdk.player.c r5 = r13.f11610a
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.controller.g r5 = r5.f11406b
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.enums.b r5 = r5.f11583e
            com.fyber.inneractive.sdk.player.enums.b r6 = com.fyber.inneractive.sdk.player.enums.C4668b.f11663i
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x006c
        L_0x0062:
            boolean r5 = r13.f11629t
            if (r5 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x006c
        L_0x0068:
            boolean r6 = r13.f11630u
            if (r6 == 0) goto L_0x02a0
        L_0x006c:
            com.fyber.inneractive.sdk.player.c r4 = r13.f11610a
            if (r4 == 0) goto L_0x0075
            android.view.View r4 = r4.mo24796c()
            goto L_0x0076
        L_0x0075:
            r4 = r2
        L_0x0076:
            com.fyber.inneractive.sdk.player.ui.i r5 = r13.f11613d
            r5.mo25749d(r3)
            android.widget.ImageView r6 = r5.f13669t
            r7 = 4
            if (r6 == 0) goto L_0x0083
            r6.setVisibility(r7)
        L_0x0083:
            com.fyber.inneractive.sdk.ui.IAsmoothProgressBar r6 = r5.f13671v
            if (r6 == 0) goto L_0x008a
            r6.setVisibility(r7)
        L_0x008a:
            android.widget.TextView r6 = r5.f13663n
            if (r6 == 0) goto L_0x0091
            r6.setVisibility(r7)
        L_0x0091:
            r5.mo25745a((boolean) r3, (boolean) r3, (java.lang.String) r2)
            android.widget.ImageView r5 = r5.f13670u
            if (r5 == 0) goto L_0x009b
            r5.setVisibility(r7)
        L_0x009b:
            com.fyber.inneractive.sdk.config.global.s r5 = r13.f11612c
            if (r5 == 0) goto L_0x00a8
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C4292j.class
            com.fyber.inneractive.sdk.config.global.features.e r5 = r5.mo24338a(r6)
            com.fyber.inneractive.sdk.config.global.features.j r5 = (com.fyber.inneractive.sdk.config.global.features.C4292j) r5
            goto L_0x00a9
        L_0x00a8:
            r5 = r2
        L_0x00a9:
            com.fyber.inneractive.sdk.config.global.s r6 = r13.f11612c
            if (r6 == 0) goto L_0x00b6
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r8 = com.fyber.inneractive.sdk.config.global.features.C4284b.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r6.mo24338a(r8)
            com.fyber.inneractive.sdk.config.global.features.b r6 = (com.fyber.inneractive.sdk.config.global.features.C4284b) r6
            goto L_0x00b7
        L_0x00b6:
            r6 = r2
        L_0x00b7:
            r8 = 500(0x1f4, float:7.0E-43)
            r9 = 10
            java.lang.String r10 = "autoClickDelay"
            java.lang.String r11 = "shouldEnableEndCardAutoClick"
            r12 = 3
            if (r4 == 0) goto L_0x01c6
            boolean r0 = r4 instanceof com.fyber.inneractive.sdk.web.C5405c
            if (r0 == 0) goto L_0x010d
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24797d()
            com.fyber.inneractive.sdk.player.controller.n r6 = new com.fyber.inneractive.sdk.player.controller.n
            r6.<init>(r13)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11546a
            if (r0 == 0) goto L_0x00d8
            r0.setListener(r6)
        L_0x00d8:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24797d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f11546a
            if (r6 == 0) goto L_0x00ea
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f11548c
            com.fyber.inneractive.sdk.util.C5326e0.m16723a(r0)
            r6.mo26421m()
        L_0x00ea:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24797d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11546a
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.mo26555h()
            if (r0 == 0) goto L_0x00fc
            r0 = r1
            goto L_0x00fd
        L_0x00fc:
            r0 = r3
        L_0x00fd:
            if (r0 == 0) goto L_0x0100
            return
        L_0x0100:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24797d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11546a
            if (r0 == 0) goto L_0x010d
            r0.mo26419e(r1)
        L_0x010d:
            r13.mo24929j()
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            r0.mo25746b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            android.view.ViewGroup r0 = r0.f13659j
            if (r0 == 0) goto L_0x011e
            r0.setVisibility(r7)
        L_0x011e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            r0.mo25748c(r3)
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            if (r0 == 0) goto L_0x012c
            com.fyber.inneractive.sdk.model.vast.c r0 = r0.mo24799f()
            goto L_0x012d
        L_0x012c:
            r0 = r2
        L_0x012d:
            com.fyber.inneractive.sdk.player.ui.i r6 = r13.f11613d
            if (r0 == 0) goto L_0x0134
            com.fyber.inneractive.sdk.model.vast.g r0 = r0.f11069a
            goto L_0x0135
        L_0x0134:
            r0 = r2
        L_0x0135:
            if (r5 == 0) goto L_0x013a
            r5.mo24320c()
        L_0x013a:
            if (r5 == 0) goto L_0x0144
            boolean r11 = r5.mo24313a((java.lang.String) r11, (boolean) r3)
            if (r11 == 0) goto L_0x0144
            r11 = r1
            goto L_0x0145
        L_0x0144:
            r11 = r3
        L_0x0145:
            if (r5 == 0) goto L_0x0159
            java.lang.Integer r10 = r5.mo24314b(r10)
            if (r10 == 0) goto L_0x0152
            int r10 = r10.intValue()
            goto L_0x0153
        L_0x0152:
            r10 = r12
        L_0x0153:
            if (r10 < 0) goto L_0x0159
            if (r10 <= r9) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r12 = r10
        L_0x0159:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            if (r11 == 0) goto L_0x0160
            r2 = r9
        L_0x0160:
            if (r5 == 0) goto L_0x0167
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = r5.mo24324g()
            goto L_0x0169
        L_0x0167:
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = com.fyber.inneractive.sdk.config.global.features.C4292j.C4295c.NONE
        L_0x0169:
            if (r5 == 0) goto L_0x016f
            int r8 = r5.mo24323f()
        L_0x016f:
            r6.getClass()
            r6.f13665p = r4
            android.view.ViewGroup r5 = r6.f13674y
            if (r5 == 0) goto L_0x01bc
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L_0x0189
            boolean r10 = r5 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x0189
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r10 = r6.f13665p
            r5.removeView(r10)
        L_0x0189:
            com.fyber.inneractive.sdk.model.vast.g r5 = com.fyber.inneractive.sdk.model.vast.C4483g.Static
            if (r5 != r0) goto L_0x019c
            com.fyber.inneractive.sdk.config.global.features.j$c r10 = com.fyber.inneractive.sdk.config.global.features.C4292j.C4295c.NONE
            boolean r10 = r10.equals(r9)
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x019c
            android.view.ViewGroup r10 = r6.f13674y
            r6.mo25741a((android.view.View) r10, (com.fyber.inneractive.sdk.config.global.features.C4292j.C4295c) r9, (int) r8)
            goto L_0x01a1
        L_0x019c:
            android.view.ViewGroup r8 = r6.f13674y
            r8.setVisibility(r3)
        L_0x01a1:
            android.view.ViewGroup r8 = r6.f13674y
            android.view.View r9 = r6.f13665p
            r8.addView(r9, r3)
            if (r5 != r0) goto L_0x01bc
            android.view.View r0 = r6.f13665p
            r6.mo25740a((android.view.View) r0, (int) r7)
            if (r2 == 0) goto L_0x01b2
            goto L_0x01b3
        L_0x01b2:
            r1 = r3
        L_0x01b3:
            if (r1 == 0) goto L_0x01bc
            int r0 = r2.intValue()
            r6.mo25738a((int) r7, (int) r0)
        L_0x01bc:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            r0.mo24793a((boolean) r3)
            r4.requestFocus()
            goto L_0x02b4
        L_0x01c6:
            com.fyber.inneractive.sdk.player.ui.e r4 = r13.f11632w
            if (r4 == 0) goto L_0x01d6
            android.graphics.Bitmap r4 = r13.mo24940g(r1)
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f11613d
            r7.setLastFrameBitmap(r4)
            goto L_0x01e5
        L_0x01d6:
            com.fyber.inneractive.sdk.player.c r4 = r13.f11610a
            if (r4 == 0) goto L_0x01dd
            android.graphics.Bitmap r4 = r4.f11416l
            goto L_0x01de
        L_0x01dd:
            r4 = r2
        L_0x01de:
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f11613d
            r7.setLastFrameBitmap(r4)
        L_0x01e5:
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f11613d
            r4.mo25746b(r1)
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f11613d
            r4.mo25748c(r3)
            com.fyber.inneractive.sdk.player.ui.b r4 = new com.fyber.inneractive.sdk.player.ui.b
            r4.<init>()
            r4.f13629b = r1
            if (r5 == 0) goto L_0x0200
            boolean r7 = r5.mo24320c()
            if (r7 == 0) goto L_0x0200
            r7 = r1
            goto L_0x0201
        L_0x0200:
            r7 = r3
        L_0x0201:
            r4.f13630c = r7
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f10551p
            r6.mo24309e(r0)
            com.fyber.inneractive.sdk.model.vast.a r0 = r6.f10624e
            if (r0 == 0) goto L_0x0215
            boolean r6 = r0.f11059d
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f11056a
            goto L_0x0216
        L_0x0215:
            r0 = r2
        L_0x0216:
            r4.f13632e = r0
            if (r5 == 0) goto L_0x0222
            boolean r0 = r5.mo24313a((java.lang.String) r11, (boolean) r3)
            if (r0 == 0) goto L_0x0222
            r0 = r1
            goto L_0x0223
        L_0x0222:
            r0 = r3
        L_0x0223:
            if (r5 == 0) goto L_0x0237
            java.lang.Integer r6 = r5.mo24314b(r10)
            if (r6 == 0) goto L_0x0230
            int r6 = r6.intValue()
            goto L_0x0231
        L_0x0230:
            r6 = r12
        L_0x0231:
            if (r6 < 0) goto L_0x0237
            if (r6 <= r9) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r12 = r6
        L_0x0237:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            if (r0 == 0) goto L_0x023f
            r4.f13633f = r6
        L_0x023f:
            if (r5 == 0) goto L_0x0246
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = r5.mo24324g()
            goto L_0x0248
        L_0x0246:
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = com.fyber.inneractive.sdk.config.global.features.C4292j.C4295c.NONE
        L_0x0248:
            if (r5 == 0) goto L_0x024e
            int r8 = r5.mo24323f()
        L_0x024e:
            r4.f13636i = r0
            r4.f13637j = r8
            com.fyber.inneractive.sdk.config.global.s r0 = r13.f11612c
            if (r0 == 0) goto L_0x025f
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.f> r2 = com.fyber.inneractive.sdk.config.global.features.C4288f.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo24338a(r2)
            r2 = r0
            com.fyber.inneractive.sdk.config.global.features.f r2 = (com.fyber.inneractive.sdk.config.global.features.C4288f) r2
        L_0x025f:
            if (r2 == 0) goto L_0x028e
            java.lang.String r0 = "should_show_hand"
            boolean r0 = r2.mo24313a((java.lang.String) r0, (boolean) r3)
            r4.f13628a = r0
            r5 = 4608533498473480192(0x3ff4ccccc0000000, double:1.2999999523162842)
            java.lang.String r0 = "scale_up_to"
            java.lang.Double r0 = r2.mo24310a((java.lang.String) r0)
            if (r0 == 0) goto L_0x027a
            double r5 = r0.doubleValue()
        L_0x027a:
            float r0 = (float) r5
            r2 = 1071225242(0x3fd9999a, float:1.7)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0289
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x028c
        L_0x0289:
            r0 = 1067869798(0x3fa66666, float:1.3)
        L_0x028c:
            r4.f13631d = r0
        L_0x028e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            com.fyber.inneractive.sdk.player.ui.a r2 = new com.fyber.inneractive.sdk.player.ui.a
            r2.<init>(r4)
            r0.mo25742a((com.fyber.inneractive.sdk.player.p191ui.C5092a) r2)
            com.fyber.inneractive.sdk.player.c r0 = r13.f11610a
            if (r0 == 0) goto L_0x02b4
            r0.mo24793a((boolean) r1)
            goto L_0x02b4
        L_0x02a0:
            if (r5 == 0) goto L_0x02af
            if (r4 == 0) goto L_0x02af
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            r0.mo25746b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            r0.mo25748c(r3)
            goto L_0x02b4
        L_0x02af:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11613d
            r0.mo25748c(r1)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4652k.mo24901y():void");
    }

    /* renamed from: z */
    public void mo24949z() {
        C5100i iVar = this.f11613d;
        if (iVar.f13669t != null) {
            iVar.setMuteButtonState(mo24946o());
        }
    }

    public C4652k(C4591c cVar, C5100i iVar, C4346z zVar, C4309s sVar, boolean z, Skip skip) {
        this.f11615f = 0;
        this.f11617h = false;
        this.f11618i = -0.1f;
        this.f11621l = false;
        this.f11624o = false;
        this.f11625p = null;
        this.f11626q = null;
        this.f11627r = false;
        this.f11628s = false;
        this.f11629t = false;
        this.f11630u = false;
        this.f11631v = false;
        this.f11633x = null;
        this.f11633x = skip;
        this.f11610a = cVar;
        this.f11611b = zVar;
        this.f11612c = sVar;
        this.f11613d = iVar;
        this.f11623n = z;
        iVar.setListener(this);
        mo24941g();
        new GestureDetector(iVar.getContext(), new C4653a(this));
    }

    /* renamed from: a */
    public final void mo24933a(int i, int i2) {
        Bitmap bitmap = this.f11625p;
        if (!(bitmap != null && bitmap.getWidth() == i && this.f11625p.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.f11626q;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.f11625p = null;
            C4654b bVar = new C4654b();
            this.f11626q = bVar;
            bVar.executeOnExecutor(C5357n.f14224a, new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: d */
    public void mo24880d(boolean z) {
        IAlog.m16699a("%sinitUI", IAlog.m16696a((Object) this));
        C4591c cVar = this.f11610a;
        if (cVar != null && cVar.f11406b != null) {
            this.f11613d.setUnitConfig(this.f11611b);
            C5100i iVar = this.f11613d;
            int h = this.f11610a.f11406b.mo24870h();
            int g = this.f11610a.f11406b.mo24869g();
            boolean z2 = this.f11623n;
            iVar.f13666q = h;
            iVar.f13667r = g;
            iVar.f13668s = z2;
            if (this.f11610a.f11406b.mo24870h() > 0 && this.f11610a.f11406b.mo24869g() > 0) {
                mo24933a(this.f11610a.f11406b.mo24870h(), this.f11610a.f11406b.mo24869g());
            }
            if (mo24900w()) {
                this.f11615f = mo24895n();
            } else {
                this.f11613d.mo25749d(false);
            }
            if (!z) {
                mo24914a(this.f11610a.f11406b.mo24864c());
                mo24935a(this.f11610a.f11406b.f11583e, false);
            }
            mo24949z();
        }
    }

    /* renamed from: f */
    public void mo24882f() {
        C5096e eVar;
        C5100i iVar = this.f11613d;
        if (iVar != null) {
            iVar.mo25735g();
        }
        C4591c cVar = this.f11610a;
        if (!(cVar == null || cVar.f11406b == null || (eVar = this.f11632w) == null)) {
            eVar.invalidate();
            this.f11632w.requestLayout();
        }
        C5100i iVar2 = this.f11613d;
        if (iVar2 != null) {
            iVar2.invalidate();
            this.f11613d.requestLayout();
        }
    }

    /* renamed from: i */
    public boolean mo24893i() {
        C4640g gVar;
        C4640g gVar2;
        C5096e eVar;
        TextureView textureView;
        C4466g gVar3;
        if (this.f11632w == null) {
            C5096e eVar2 = new C5096e(this.f11613d);
            this.f11632w = eVar2;
            C4591c cVar = this.f11610a;
            if (!(cVar == null || (gVar3 = cVar.f11413i) == null)) {
                View[] trackingFriendlyView = this.f11613d.getTrackingFriendlyView();
                AdSession adSession = gVar3.f11013a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(eVar2);
                    } catch (Throwable th) {
                        gVar3.mo24663a(th);
                    }
                }
                if (!(gVar3.f11013a == null || trackingFriendlyView == null)) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                gVar3.f11013a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                            } catch (Throwable th2) {
                                gVar3.mo24663a(th2);
                            }
                        }
                    }
                }
            }
        }
        IAlog.m16699a("%sconnectToTextureView called %s", IAlog.m16696a((Object) this), this.f11613d.getTextureHost());
        if (this.f11632w == null || !this.f11613d.getTextureHost().equals(this.f11632w.getParent())) {
            C4591c cVar2 = this.f11610a;
            if (!(cVar2 == null || (gVar2 = cVar2.f11406b) == null || (textureView = gVar2.f11588j) == (eVar = this.f11632w))) {
                if (textureView != null) {
                    textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                }
                gVar2.f11588j = eVar;
                if (gVar2.f11591m == null) {
                    gVar2.f11591m = new C4638f(gVar2);
                }
                eVar.setSurfaceTextureListener(gVar2.f11591m);
                if (gVar2.f11589k != null) {
                    IAlog.m16699a("%scalling setSurfaceTexture with cached texture", IAlog.m16696a((Object) gVar2));
                    if (gVar2.f11588j.getSurfaceTexture() == null || !gVar2.f11588j.getSurfaceTexture().equals(gVar2.f11589k)) {
                        IAlog.m16699a("%scalling setSurfaceTexture with cached texture success", IAlog.m16696a((Object) gVar2));
                        gVar2.f11588j.setSurfaceTexture(gVar2.f11589k);
                    } else {
                        IAlog.m16699a("%scalling setSurfaceTexture with cached texture failed", IAlog.m16696a((Object) gVar2));
                    }
                }
            }
            C5096e eVar3 = this.f11632w;
            if (eVar3 != null) {
                eVar3.setId(C4167R.C4169id.inn_texture_view);
            }
            IAlog.m16699a("%supdateView adding texture to parent", IAlog.m16696a((Object) this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.f11632w.getParent() == null) {
                this.f11613d.getTextureHost().addView(this.f11632w, layoutParams);
            }
            this.f11621l = false;
            C4659p pVar = new C4659p(this);
            this.f11614e = pVar;
            C4591c cVar3 = this.f11610a;
            if (!(cVar3 == null || (gVar = cVar3.f11406b) == null)) {
                gVar.f11582d = pVar;
            }
        } else {
            IAlog.m16699a("%sconnectToTextureView called but already connected", IAlog.m16696a((Object) this));
        }
        return true;
    }

    /* renamed from: h */
    public final void mo24942h() {
        Runnable runnable = this.f11619j;
        if (runnable != null) {
            this.f11613d.removeCallbacks(runnable);
            this.f11619j = null;
        }
    }

    /* renamed from: g */
    public Bitmap mo24940g(boolean z) {
        C4591c cVar;
        C4640g gVar;
        if (!(this.f11625p == null || (cVar = this.f11610a) == null || (gVar = cVar.f11406b) == null)) {
            if (this.f11624o) {
                return cVar.f11416l;
            }
            TextureView textureView = gVar.f11588j;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.m16696a((Object) this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.m16699a("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.m16702d("creating bitmap on object - %s", this.f11625p);
                    Bitmap bitmap = textureView.getBitmap(this.f11625p);
                    if (this.f11613d.getVideoWidth() > 0 && this.f11613d.getVideoHeight() > 0) {
                        this.f11625p = null;
                        mo24933a(this.f11613d.getVideoWidth(), this.f11613d.getVideoHeight());
                    }
                    if (z) {
                        C5317c cVar2 = new C5317c();
                        cVar2.f14154c = 20;
                        cVar2.f14155d = 1;
                        cVar2.f14152a = bitmap.getWidth();
                        cVar2.f14153b = bitmap.getHeight();
                        this.f11610a.mo24789a(C5313b.m16709a(this.f11613d.getContext(), bitmap, cVar2));
                        this.f11624o = true;
                    } else {
                        this.f11610a.mo24789a(bitmap);
                    }
                    IAlog.m16702d("%ssave snapshot succeeded", IAlog.m16696a((Object) this));
                    return this.f11610a.f11416l;
                } catch (Exception unused) {
                    IAlog.m16702d("%ssave snapshot failed with exception", IAlog.m16696a((Object) this));
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo24878c(boolean z) {
        C4591c cVar;
        C4640g gVar;
        C4262a0 a0Var;
        ListenerT listenert;
        C4640g gVar2;
        C4346z zVar;
        C4262a0 a0Var2;
        this.f11629t = true;
        C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
        if (!(!z || d0Var == null || (zVar = this.f11611b) == null || (a0Var2 = ((C4345y) zVar).f10750f) == null)) {
            d0Var.mo24287a(a0Var2.f10579j, "LAST_VAST_SKIPED", "1");
        }
        C4591c cVar2 = this.f11610a;
        if (!(cVar2 == null || (gVar2 = cVar2.f11406b) == null)) {
            gVar2.mo24910m();
            this.f11610a.f11406b.mo24872k();
            C4466g gVar3 = this.f11610a.f11413i;
            if (!(gVar3 == null || gVar3.f11015c == null)) {
                IAlog.m16699a("%s skipped", "OMVideo");
                try {
                    gVar3.f11015c.skipped();
                } catch (Throwable th) {
                    gVar3.mo24663a(th);
                }
            }
        }
        if (!this.f11613d.mo25750d()) {
            this.f11613d.mo25744a(false);
            mo24942h();
            mo24901y();
            this.f11620k = false;
            this.f11617h = true;
            C4346z zVar2 = this.f11611b;
            if (!(zVar2 == null || (a0Var = ((C4345y) zVar2).f10750f) == null || a0Var.f10579j != UnitDisplayType.REWARDED || (listenert = this.f11616g) == null)) {
                listenert.onCompleted();
            }
        }
        if (this.f11616g != null && (this.f11615f <= 0 || this.f11617h || !((cVar = this.f11610a) == null || (gVar = cVar.f11406b) == null || !gVar.f11583e.equals(C4668b.f11663i)))) {
            this.f11616g.mo24993a(z);
        }
        mo24929j();
    }

    /* renamed from: a */
    public final void mo24936a(String str) {
        C4271d0 d0Var = IAConfigManager.f10525J.f10559x;
        C4346z zVar = this.f11611b;
        if (zVar != null) {
            C4345y yVar = (C4345y) zVar;
            if (yVar.f10750f != null) {
                d0Var.mo24287a(yVar.f10750f.f10579j, "LAST_VAST_CLICKED_TYPE", str);
            }
        }
    }

    /* renamed from: a */
    public void mo24915a(C4668b bVar) {
        IAlog.m16699a("%sonPlayerStateChanged with %s", IAlog.m16696a((Object) this), bVar);
        mo24935a(bVar, true);
    }

    /* renamed from: a */
    public final void mo24935a(C4668b bVar, boolean z) {
        ListenerT listenert;
        int ordinal = bVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                switch (ordinal) {
                    case 6:
                        if (this.f11627r) {
                            mo24899v();
                            return;
                        }
                        return;
                    case 7:
                        mo24930s();
                        return;
                    case 8:
                        if (this.f11627r && !this.f11631v) {
                            this.f11631v = true;
                            mo24947q();
                            if (z && (listenert = this.f11616g) != null) {
                                listenert.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    case 9:
                        if (this.f11627r) {
                            mo24878c(false);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (this.f11627r) {
                this.f11613d.mo25744a(true);
                this.f11613d.mo25748c(false);
                Runnable runnable = this.f11619j;
                if (runnable == null) {
                    if (runnable == null) {
                        this.f11619j = new C4655l(this);
                    }
                    int l = mo24894l();
                    IAlog.m16699a("%s Starting buffering timeout with %d", IAlog.m16696a((Object) this), Integer.valueOf(l));
                    this.f11613d.postDelayed(this.f11619j, (long) l);
                }
            }
        } else if (this.f11627r) {
            this.f11613d.mo25746b(true);
            mo24901y();
            mo24931u();
        }
    }

    /* renamed from: d */
    public void mo24927d() {
        IAlog.m16699a("%sonVideoViewDetachedFromWindow", IAlog.m16696a((Object) this));
        mo24929j();
    }

    /* renamed from: c */
    public final void mo24938c(int i) {
        if (this.f11613d != null) {
            C4309s sVar = this.f11612c;
            String str = null;
            C4284b bVar = sVar != null ? (C4284b) sVar.mo24338a(C4284b.class) : null;
            if (bVar != null) {
                bVar.mo24309e(IAConfigManager.f10525J.f10551p);
                C4477a aVar = bVar.f10624e;
                if (aVar != null && aVar.f11059d) {
                    str = aVar.f11058c;
                }
            }
            if (str != null) {
                this.f11613d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
                return;
            }
            C5100i iVar = this.f11613d;
            iVar.setSkipText(iVar.getContext().getString(C4167R.string.ia_video_before_skip_format, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo24914a(int i) {
        int i2;
        C4346z zVar;
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && cVar.f11406b != null) {
            float m = mo24945m();
            C4591c cVar2 = this.f11610a;
            if (!(cVar2 == null || (gVar = cVar2.f11406b) == null || !gVar.mo24888j())) {
                float f = this.f11618i;
                if (m != f) {
                    int i3 = (m > 0.0f ? 1 : (m == 0.0f ? 0 : -1));
                    if (i3 > 0 && f >= 0.0f && mo24946o()) {
                        mo24943i(true);
                    } else if (i3 == 0 && !mo24946o()) {
                        mo24939f(true);
                    }
                }
                mo24949z();
            }
            this.f11618i = m;
            int d = this.f11610a.f11406b.mo24865d();
            int c = this.f11610a.f11406b.mo24864c();
            int i4 = c / 1000;
            int i5 = d / 1000;
            int i6 = i5 - i4;
            if (i6 < 0 || (!this.f11610a.f11406b.mo24888j() && c == d)) {
                i6 = 0;
            }
            C5100i iVar = this.f11613d;
            if (iVar.f13663n != null || iVar.f13671v != null) {
                iVar.setRemainingTime(Integer.toString(i6));
                if (this.f11615f < i5) {
                    if (mo24900w()) {
                        int d2 = this.f11610a.f11406b.mo24865d();
                        C4591c cVar3 = this.f11610a;
                        if (C4591c.m14070a(d2, ((C5066f) cVar3).f13560A, C4591c.m14068a(cVar3)) && !this.f11617h) {
                            int i7 = this.f11615f;
                            if (i4 < i7) {
                                mo24938c(i7 - i4);
                            } else {
                                this.f11615f = 0;
                                mo24944k();
                            }
                            this.f11613d.mo25749d(true);
                        }
                    }
                    this.f11613d.mo25749d(false);
                } else {
                    this.f11613d.mo25749d(false);
                }
                if (this.f11610a.f11406b.f11583e != C4668b.Paused) {
                    C5100i iVar2 = this.f11613d;
                    if (iVar2.f13671v != null) {
                        Runnable runnable = iVar2.f13652E;
                        if (runnable != null) {
                            iVar2.removeCallbacks(runnable);
                            iVar2.f13652E = null;
                        }
                        int i8 = i5 * 1000;
                        iVar2.f13671v.setMax(i8);
                        int i9 = i8 - (i6 * 1000);
                        int i10 = i9 + 1000;
                        iVar2.f13651D = i10;
                        int i11 = i9 + 200;
                        if (i10 > 0 && i10 <= i8) {
                            int i12 = iVar2.f13650C;
                            if (i11 >= i12 || i12 <= 0) {
                                iVar2.f13650C = i11;
                                iVar2.f13671v.setProgress(i11);
                                C5106k kVar = new C5106k(iVar2);
                                iVar2.f13652E = kVar;
                                iVar2.postDelayed(kVar, 200);
                            } else {
                                iVar2.f13671v.setProgress(i10);
                            }
                        }
                    }
                    C4310h hVar = IAConfigManager.f10525J.f10557v.f10660b;
                    int i13 = 30;
                    String num = Integer.toString(30);
                    if (hVar.f10657a.containsKey("max_rv_tsec")) {
                        num = hVar.f10657a.get("max_rv_tsec");
                    }
                    try {
                        i2 = Integer.parseInt(num);
                    } catch (Throwable unused) {
                        i2 = 30;
                    }
                    if (i2 >= 1) {
                        i13 = i2;
                    }
                    if (i5 > i13 && i4 > i13 && (zVar = this.f11611b) != null) {
                        C4345y yVar = (C4345y) zVar;
                        if (yVar.f10750f != null && yVar.f10750f.f10579j == UnitDisplayType.REWARDED) {
                            mo24944k();
                            this.f11613d.mo25749d(true);
                        }
                    }
                }
                ListenerT listenert = this.f11616g;
                if (listenert != null) {
                    listenert.onProgress(d, c);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24891a(boolean z) {
        C4591c cVar;
        C4640g gVar;
        C5100i iVar;
        Application application;
        if (this.f11627r != z && (cVar = this.f11610a) != null && cVar.f11406b != null) {
            IAlog.m16699a("%sonVisibilityChanged: %s my video view is%s", IAlog.m16696a((Object) this), Boolean.valueOf(z), this.f11613d);
            if (z) {
                this.f11627r = true;
                C4668b bVar = this.f11610a.f11406b.f11583e;
                if (bVar.equals(C4668b.f11663i) || this.f11613d.mo25750d()) {
                    if (!this.f11631v) {
                        this.f11631v = true;
                        mo24947q();
                        ListenerT listenert = this.f11616g;
                        if (listenert != null) {
                            listenert.onCompleted();
                        }
                    }
                    C5100i iVar2 = this.f11613d;
                    if (iVar2 != null && iVar2.f13653F != null) {
                        IAlog.m16699a("Autoclick resumed", new Object[0]);
                        iVar2.f13653F.mo26485b();
                        return;
                    }
                    return;
                }
                if (!bVar.equals(C4668b.Error)) {
                    if (bVar.equals(C4668b.Idle)) {
                        this.f11610a.getClass();
                    } else {
                        if (bVar == C4668b.Start_in_progress || bVar == C4668b.Playing) {
                            mo24899v();
                        }
                        C4591c cVar2 = this.f11610a;
                        if (!cVar2.f11421q) {
                            C5066f fVar = (C5066f) cVar2;
                            fVar.mo24791a(fVar.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_CREATIVE_VIEW);
                            cVar2.f11421q = true;
                        }
                        mo24893i();
                        if (this.f11622m == null && (application = C5350l.f14216a) != null) {
                            C4656m mVar = new C4656m(this);
                            this.f11622m = mVar;
                            application.registerActivityLifecycleCallbacks(mVar);
                            return;
                        }
                        return;
                    }
                }
                mo24878c(false);
                return;
            }
            this.f11627r = false;
            C4591c cVar3 = this.f11610a;
            if (!(cVar3 == null || (gVar = cVar3.f11406b) == null || !gVar.f11582d.equals(this.f11614e))) {
                IAlog.m16699a("%sonVisibilityChanged pausing video", IAlog.m16696a((Object) this));
                pauseVideo();
                if (this.f11610a.f11406b.f11583e == C4668b.f11663i || ((iVar = this.f11613d) != null && iVar.mo25750d())) {
                    C5100i iVar3 = this.f11613d;
                    if (iVar3.f13653F != null) {
                        IAlog.m16699a("Autoclick paused", new Object[0]);
                        iVar3.f13653F.mo26483a();
                    }
                }
            }
            mo24929j();
        }
    }

    /* renamed from: a */
    public void mo24934a(int i, C5364p0 p0Var) {
        IAlog.m16699a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (mo24946o()) {
                    mo24943i(true);
                    C4591c cVar = this.f11610a;
                    if (cVar != null) {
                        C5066f fVar = (C5066f) cVar;
                        fVar.mo24791a(fVar.f13563x, VideoClickOrigin.MUTE, C4493q.EVENT_UNMUTE);
                    }
                } else {
                    mo24939f(true);
                    C4591c cVar2 = this.f11610a;
                    if (cVar2 != null) {
                        C5066f fVar2 = (C5066f) cVar2;
                        fVar2.mo24791a(fVar2.f13563x, VideoClickOrigin.MUTE, C4493q.EVENT_MUTE);
                    }
                }
                mo24949z();
                return;
            case 2:
                mo24898t();
                return;
            case 3:
                mo24936a("1");
                mo24937a(false, VideoClickOrigin.CTA, p0Var);
                return;
            case 4:
                mo24936a("2");
                C4591c cVar3 = this.f11610a;
                String str = null;
                C4479c f = cVar3 != null ? cVar3.mo24799f() : null;
                if (f != null && f.f11069a == C4483g.Static) {
                    str = f.f11075g;
                    C4591c cVar4 = this.f11610a;
                    if (cVar4 != null) {
                        cVar4.mo24791a((C5295i) f, VideoClickOrigin.COMPANION, C4493q.EVENT_CLICK);
                    }
                }
                C5100i iVar = this.f11613d;
                if (iVar != null) {
                    iVar.mo25751e();
                    iVar.f13654G = true;
                }
                ListenerT listenert = this.f11616g;
                if (listenert != null) {
                    listenert.mo24990a(str, p0Var);
                    return;
                }
                return;
            case 5:
                mo24897r();
                return;
            case 6:
                mo24878c(true);
                return;
            case 7:
                mo24890a(p0Var);
                return;
            case 8:
                mo24936a("2");
                mo24937a(true, VideoClickOrigin.COMPANION, p0Var);
                return;
            case 9:
                C4591c cVar5 = this.f11610a;
                if (cVar5 != null && !this.f11613d.f13645h) {
                    cVar5.f11415k = true;
                    mo24928h(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r5.f14158a != com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED) goto L_0x0079;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24937a(boolean r5, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r6, com.fyber.inneractive.sdk.util.C5364p0 r7) {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.ui.i r0 = r4.f11613d
            r1 = 1
            if (r0 == 0) goto L_0x000a
            r0.mo25751e()
            r0.f13654G = r1
        L_0x000a:
            ListenerT r0 = r4.f11616g
            r2 = 0
            if (r0 == 0) goto L_0x0078
            if (r5 == 0) goto L_0x0032
            com.fyber.inneractive.sdk.player.c r5 = r4.f11610a
            if (r5 == 0) goto L_0x0078
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.C5066f) r5
            com.fyber.inneractive.sdk.model.vast.b r5 = r5.f13563x
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = r5.f11061b
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            r0.mo24990a((java.lang.String) r5, (com.fyber.inneractive.sdk.util.C5364p0) r7)
            com.fyber.inneractive.sdk.player.c r5 = r4.f11610a
            com.fyber.inneractive.sdk.model.vast.q[] r7 = new com.fyber.inneractive.sdk.model.vast.C4493q[r1]
            com.fyber.inneractive.sdk.model.vast.q r0 = com.fyber.inneractive.sdk.model.vast.C4493q.EVENT_CLICK
            r7[r2] = r0
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.C5066f) r5
            com.fyber.inneractive.sdk.model.vast.b r0 = r5.f13563x
            r5.mo24791a(r0, r6, r7)
            goto L_0x0078
        L_0x0032:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L_0x0039
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.C5325e.VIDEO_CLICK
            goto L_0x003b
        L_0x0039:
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.C5325e.VIDEO_CTA
        L_0x003b:
            com.fyber.inneractive.sdk.util.d0$a r5 = r0.mo24989a((com.fyber.inneractive.sdk.util.C5364p0) r7, (com.fyber.inneractive.sdk.util.C5325e) r5)
            com.fyber.inneractive.sdk.player.c r7 = r4.f11610a
            if (r7 == 0) goto L_0x0071
            com.fyber.inneractive.sdk.model.vast.q[] r0 = new com.fyber.inneractive.sdk.model.vast.C4493q[r1]
            com.fyber.inneractive.sdk.model.vast.q r3 = com.fyber.inneractive.sdk.model.vast.C4493q.EVENT_CLICK
            r0[r2] = r3
            com.fyber.inneractive.sdk.player.f r7 = (com.fyber.inneractive.sdk.player.C5066f) r7
            com.fyber.inneractive.sdk.model.vast.b r3 = r7.f13563x
            r7.mo24791a(r3, r6, r0)
            com.fyber.inneractive.sdk.player.c r7 = r4.f11610a
            com.fyber.inneractive.sdk.measurement.g r7 = r7.f11413i
            if (r7 == 0) goto L_0x0071
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f11015c
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "OMVideo"
            r0[r2] = r3
            java.lang.String r3 = "%s click"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r3, r0)
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f11015c     // Catch:{ all -> 0x006d }
            com.iab.omid.library.fyber.adsession.media.InteractionType r3 = com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK     // Catch:{ all -> 0x006d }
            r0.adUserInteraction(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r7.mo24663a((java.lang.Throwable) r0)
        L_0x0071:
            com.fyber.inneractive.sdk.util.d0$c r5 = r5.f14158a
            com.fyber.inneractive.sdk.util.d0$c r7 = com.fyber.inneractive.sdk.util.C5320d0.C5323c.FAILED
            if (r5 == r7) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L_0x0082
            java.lang.String r5 = "3"
            r4.mo24936a((java.lang.String) r5)
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4652k.mo24937a(boolean, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin, com.fyber.inneractive.sdk.util.p0):boolean");
    }

    /* renamed from: a */
    public void mo24875a(Bitmap bitmap) {
        C4640g gVar;
        C4591c cVar = this.f11610a;
        if (cVar != null && (gVar = cVar.f11406b) != null && gVar.f11583e != C4668b.f11663i) {
            this.f11613d.mo25744a(cVar.f11415k);
            this.f11613d.mo25746b(true);
            this.f11613d.setLastFrameBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public void mo24874a(long j) {
        View view;
        C4591c cVar = this.f11610a;
        View c = cVar != null ? cVar.mo24796c() : null;
        C5100i iVar = this.f11613d;
        boolean z = c == null;
        ObjectAnimator objectAnimator = iVar.f13655H;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j) {
                ViewGroup viewGroup = iVar.f13674y;
                if (viewGroup != null) {
                    iVar.mo25740a((View) viewGroup.getParent(), 4);
                }
                iVar.f13655H.start();
                iVar.f13655H.addListener(new C5105j(iVar));
            } else {
                iVar.f13656I = true;
                iVar.f13655H = null;
                ViewGroup viewGroup2 = iVar.f13674y;
                if (!(viewGroup2 == null || viewGroup2.getParent() == null)) {
                    ((View) iVar.f13674y.getParent()).setOnTouchListener((View.OnTouchListener) null);
                }
            }
            if (!z || (view = iVar.f13673x) == null) {
                ViewGroup viewGroup3 = iVar.f13674y;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    return;
                }
                return;
            }
            view.setVisibility(0);
        }
    }
}
