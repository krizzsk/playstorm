package com.bytedance.sdk.openadsdk.core.video.p162a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import com.bykv.p068vk.openvk.component.video.api.C2515a;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bykv.p068vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3694a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3720d;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import com.bytedance.sdk.openadsdk.utils.C4008o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.a.a */
/* compiled from: BaseController */
public abstract class C3658a implements C2526c, C2989x.C2990a, C3694a {

    /* renamed from: a */
    protected SurfaceHolder f9296a;

    /* renamed from: b */
    protected SurfaceTexture f9297b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C2515a f9298c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public C3720d f9299d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public C3498n f9300e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public long f9301f = 0;

    /* renamed from: g */
    protected long f9302g = 0;
    /* access modifiers changed from: protected */

    /* renamed from: h */
    public WeakReference<Context> f9303h;

    /* renamed from: i */
    protected List<Runnable> f9304i;

    /* renamed from: j */
    protected boolean f9305j = false;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public final C2989x f9306k = new C2989x(Looper.getMainLooper(), this);

    /* renamed from: l */
    protected boolean f9307l = false;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public boolean f9308m = true;
    /* access modifiers changed from: protected */

    /* renamed from: n */
    public boolean f9309n = false;

    /* renamed from: o */
    protected boolean f9310o = false;

    /* renamed from: p */
    protected boolean f9311p = false;
    /* access modifiers changed from: protected */

    /* renamed from: q */
    public long f9312q;

    /* renamed from: r */
    protected Runnable f9313r = new Runnable() {
        public void run() {
            C2975l.m8380a("CSJ_VIDEO_Controller", "resumeVideo: run ", Boolean.valueOf(C3658a.this.f9305j));
            C3658a.this.mo20248E();
        }
    };

    /* renamed from: s */
    private long f9314s = 0;

    /* renamed from: a */
    public void mo17318a(Message message) {
    }

    /* renamed from: a */
    public void mo16412a(C2524b bVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* renamed from: f */
    public void mo16422f(C2524b bVar, View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo20244A() {
        if (this.f9298c != null) {
            if (mo20245B()) {
                SurfaceTexture surfaceTexture = this.f9297b;
                if (surfaceTexture != null && surfaceTexture != this.f9298c.mo16287g()) {
                    this.f9298c.mo16274a(this.f9297b);
                    return;
                }
                return;
            }
            SurfaceHolder surfaceHolder = this.f9296a;
            if (surfaceHolder != null && surfaceHolder != this.f9298c.mo16286f()) {
                this.f9298c.mo16276a(this.f9296a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo20245B() {
        C3720d dVar = this.f9299d;
        if (dVar != null) {
            return dVar.mo20406q() instanceof SSRenderTextureView;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo16461s() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        C3498n nVar = this.f9300e;
        if (nVar != null && nVar.mo19650aD() == 1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if ((!C4003m.m13129e() || Build.VERSION.SDK_INT < 30) && !C4008o.m13154a(this.f9300e)) {
            return C3524h.m10852d().mo19867q();
        }
        return true;
    }

    /* renamed from: g */
    public long mo16449g() {
        return this.f9301f;
    }

    /* renamed from: a */
    public void mo16429a(long j) {
        this.f9301f = j;
        long j2 = this.f9302g;
        if (j2 > j) {
            j = j2;
        }
        this.f9302g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo20246C() {
        WeakReference<Context> weakReference = this.f9303h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20251a(Runnable runnable) {
        if (runnable != null) {
            if (!this.f9299d.mo20381m() || !this.f9305j) {
                mo20252b(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20252b(Runnable runnable) {
        if (this.f9304i == null) {
            this.f9304i = new ArrayList();
        }
        this.f9304i.add(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo20247D() {
        C2975l.m8387c("CSJ_VIDEO_Controller", "execPendingActions: before ");
        List<Runnable> list = this.f9304i;
        if (list != null && !list.isEmpty()) {
            C2975l.m8387c("CSJ_VIDEO_Controller", "execPendingActions:  exec");
            Iterator it = new ArrayList(this.f9304i).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f9304i.clear();
        }
    }

    /* renamed from: a */
    public void mo16411a(C2524b bVar, SurfaceHolder surfaceHolder) {
        this.f9305j = true;
        this.f9296a = surfaceHolder;
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo16276a(surfaceHolder);
            }
            C2975l.m8387c("CSJ_VIDEO_Controller", "surfaceCreated: ");
            mo20247D();
        }
    }

    /* renamed from: b */
    public void mo16417b(C2524b bVar, SurfaceHolder surfaceHolder) {
        this.f9305j = false;
        this.f9296a = null;
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            aVar.mo16282b(false);
        }
    }

    /* renamed from: a */
    public void mo16410a(C2524b bVar, SurfaceTexture surfaceTexture) {
        this.f9305j = true;
        this.f9297b = surfaceTexture;
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            aVar.mo16274a(surfaceTexture);
            this.f9298c.mo16282b(this.f9305j);
        }
        C2975l.m8387c("CSJ_VIDEO_Controller", "surfaceTextureCreated: ");
        mo20247D();
    }

    /* renamed from: b */
    public void mo16416b(C2524b bVar, SurfaceTexture surfaceTexture) {
        this.f9305j = false;
        C2975l.m8387c("CSJ_VIDEO_Controller", "surfaceTextureDestroyed: ");
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            aVar.mo16282b(false);
        }
        this.f9297b = null;
        mo20247D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo20248E() {
        this.f9306k.postAtFrontOfQueue(new Runnable() {
            public void run() {
                if (C3658a.this.f9298c != null) {
                    C2975l.m8380a("CSJ_VIDEO_Controller", "resumeVideo: execResumePlay", Boolean.valueOf(C3658a.this.f9305j));
                    C3658a.this.f9298c.mo16272a();
                }
            }
        });
    }

    /* renamed from: n */
    public C2515a mo16456n() {
        return this.f9298c;
    }

    /* renamed from: F */
    public C3720d mo16457o() {
        return this.f9299d;
    }

    /* renamed from: a */
    public void mo16434a(boolean z) {
        this.f9308m = z;
        C3720d dVar = this.f9299d;
        if (dVar != null) {
            dVar.mo20404d(z);
        }
    }

    /* renamed from: G */
    public boolean mo20250G() {
        return this.f9308m;
    }

    /* renamed from: m */
    public boolean mo16455m() {
        return this.f9310o;
    }

    /* renamed from: b */
    public void mo16438b(long j) {
        this.f9314s = j;
    }

    /* renamed from: c */
    public void mo16442c(long j) {
        this.f9312q = j;
    }

    /* renamed from: h */
    public long mo16450h() {
        if (mo16456n() == null) {
            return 0;
        }
        return mo16456n().mo16295o();
    }

    /* renamed from: i */
    public int mo16451i() {
        C2515a aVar = this.f9298c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo16296p();
    }

    /* renamed from: p */
    public boolean mo16458p() {
        return this.f9309n;
    }

    /* renamed from: b */
    public void mo16440b(boolean z) {
        this.f9309n = z;
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            aVar.mo16279a(z);
        }
    }

    /* renamed from: j */
    public long mo16452j() {
        C2515a aVar = this.f9298c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo16297q();
    }

    /* renamed from: q */
    public boolean mo16459q() {
        return this.f9307l;
    }

    /* renamed from: c */
    public void mo16443c(boolean z) {
        this.f9307l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo20253f(boolean z) {
        this.f9311p = z;
    }

    /* renamed from: c */
    public void mo16441c() {
        C2515a aVar = this.f9298c;
        if (aVar != null) {
            aVar.mo16283c();
        }
    }
}
