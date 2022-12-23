package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3765x;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3624o;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3695b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeVideoTsView extends FrameLayout implements C2526c.C2527a, C2989x.C2990a, C3695b.C3711a {

    /* renamed from: v */
    private static Integer f9391v = 0;

    /* renamed from: w */
    private static Integer f9392w = 1;

    /* renamed from: A */
    private long f9393A;

    /* renamed from: B */
    private boolean f9394B;

    /* renamed from: C */
    private final C2989x f9395C;

    /* renamed from: D */
    private boolean f9396D;

    /* renamed from: E */
    private final String f9397E;

    /* renamed from: F */
    private ViewStub f9398F;

    /* renamed from: G */
    private C2526c.C2529c f9399G;

    /* renamed from: H */
    private boolean f9400H;

    /* renamed from: I */
    private final AtomicBoolean f9401I;

    /* renamed from: J */
    private boolean f9402J;

    /* renamed from: K */
    private AtomicBoolean f9403K;

    /* renamed from: a */
    protected final C3498n f9404a;

    /* renamed from: b */
    protected C2526c f9405b;

    /* renamed from: c */
    protected FrameLayout f9406c;

    /* renamed from: d */
    protected boolean f9407d;

    /* renamed from: e */
    public boolean f9408e;

    /* renamed from: f */
    public C3167j f9409f;

    /* renamed from: g */
    protected RelativeLayout f9410g;

    /* renamed from: h */
    protected ImageView f9411h;

    /* renamed from: i */
    protected ImageView f9412i;

    /* renamed from: j */
    protected ImageView f9413j;

    /* renamed from: k */
    protected boolean f9414k;

    /* renamed from: l */
    protected String f9415l;

    /* renamed from: m */
    protected int f9416m;

    /* renamed from: n */
    AtomicBoolean f9417n;

    /* renamed from: o */
    boolean f9418o;

    /* renamed from: p */
    public C3693b f9419p;

    /* renamed from: q */
    private final Context f9420q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ViewGroup f9421r;

    /* renamed from: s */
    private boolean f9422s;

    /* renamed from: t */
    private boolean f9423t;

    /* renamed from: u */
    private String f9424u;

    /* renamed from: x */
    private boolean f9425x;

    /* renamed from: y */
    private boolean f9426y;

    /* renamed from: z */
    private boolean f9427z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$a */
    public interface C3692a {
        /* renamed from: a */
        void mo18946a(View view, int i);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView$b */
    public interface C3693b {
        /* renamed from: a */
        void mo18947a(boolean z, long j, long j2, long j3, boolean z2);
    }

    /* renamed from: a */
    public void mo16462a() {
    }

    /* renamed from: b */
    public void mo16465b(long j, int i) {
    }

    public void setIsNeedShowDetail(boolean z) {
        this.f9400H = z;
    }

    public void setAdCreativeClickListener(C3692a aVar) {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            ((C3695b) cVar).mo20334a(aVar);
        }
    }

    public void setControllerStatusCallBack(C3693b bVar) {
        this.f9419p = bVar;
    }

    /* renamed from: a */
    public void mo16463a(long j, int i) {
        C2526c.C2529c cVar = this.f9399G;
        if (cVar != null) {
            cVar.mo16471d_();
        }
    }

    /* renamed from: d */
    private void mo20096d() {
        mo16463a(0, 0);
        this.f9399G = null;
    }

    /* renamed from: a */
    public void mo16464a(long j, long j2) {
        C2526c.C2529c cVar = this.f9399G;
        if (cVar != null) {
            cVar.mo16467a(j, j2);
        }
    }

    public NativeVideoTsView(Context context, C3498n nVar, boolean z, C3167j jVar) {
        this(context, nVar, z, "embeded_ad", false, false, jVar);
    }

    public NativeVideoTsView(Context context, C3498n nVar, String str, boolean z, boolean z2, C3167j jVar) {
        this(context, nVar, false, str, z, z2, jVar);
    }

    public NativeVideoTsView(Context context, C3498n nVar, C3167j jVar) {
        this(context, nVar, false, jVar);
    }

    public NativeVideoTsView(Context context, C3498n nVar, boolean z, String str, boolean z2, boolean z3, C3167j jVar) {
        super(context);
        this.f9422s = true;
        this.f9407d = true;
        this.f9423t = false;
        this.f9408e = false;
        this.f9425x = false;
        this.f9426y = true;
        this.f9414k = true;
        this.f9415l = "embeded_ad";
        this.f9416m = 50;
        this.f9427z = true;
        this.f9417n = new AtomicBoolean(false);
        this.f9394B = false;
        this.f9395C = new C2989x(this);
        this.f9396D = false;
        this.f9397E = Build.MODEL;
        this.f9418o = false;
        this.f9400H = true;
        this.f9401I = new AtomicBoolean(false);
        this.f9402J = true;
        this.f9403K = new AtomicBoolean(false);
        if (jVar != null) {
            this.f9409f = jVar;
        }
        this.f9415l = str;
        this.f9420q = context;
        this.f9404a = nVar;
        this.f9423t = z;
        setContentDescription("NativeVideoAdView");
        this.f9425x = z2;
        this.f9426y = z3;
        mo20094b();
        mo20097e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20094b() {
        C3498n nVar = this.f9404a;
        if (nVar != null) {
            int f = C4014u.m13223f(nVar);
            int c = C3578m.m11241h().mo19931c(f);
            int c2 = C2979o.m8409c(C3578m.m11231a());
            if (c == 1) {
                this.f9422s = C4014u.m13222e(c2);
            } else if (c == 2) {
                this.f9422s = C4014u.m13227f(c2) || C4014u.m13222e(c2) || C4014u.m13232g(c2);
            } else if (c == 3) {
                this.f9422s = false;
            } else if (c == 4) {
                this.f9418o = true;
            } else if (c == 5) {
                this.f9422s = C4014u.m13222e(c2) || C4014u.m13232g(c2);
            }
            if (this.f9423t) {
                this.f9407d = false;
            } else if (!this.f9408e || !C3624o.m11478b(this.f9415l)) {
                this.f9407d = C3578m.m11241h().mo19927a(f);
            }
            if ("open_ad".equals(this.f9415l)) {
                this.f9422s = true;
                this.f9407d = true;
            }
            C2526c cVar = this.f9405b;
            if (cVar != null) {
                cVar.mo16445d(this.f9422s);
            }
            this.f9408e = true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3693b bVar;
        C2526c cVar;
        if (!(this.f9423t || (bVar = this.f9419p) == null || (cVar = this.f9405b) == null)) {
            bVar.mo18947a(cVar.mo16459q(), this.f9405b.mo16452j(), this.f9405b.mo16453k(), this.f9405b.mo16449g(), this.f9422s);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private View m11869a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setId(C2984t.m8432e(this.f9420q, "tt_native_video_layout"));
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        this.f9421r = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(C2984t.m8432e(this.f9420q, "tt_native_video_frame"));
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.addView(frameLayout2);
        this.f9406c = frameLayout2;
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(C2984t.m8432e(this.f9420q, "tt_native_video_img_cover_viewStub"));
        viewStub.setLayoutResource(C2984t.m8433f(this.f9420q, "tt_native_video_img_cover_layout"));
        viewStub.setLayoutParams(layoutParams3);
        frameLayout.addView(viewStub);
        this.f9398F = viewStub;
        return frameLayout;
    }

    /* renamed from: e */
    private void mo20097e() {
        addView(m11869a(this.f9420q));
        m11875o();
    }

    public void setVideoAdClickListenerTTNativeAd(TTNativeAd tTNativeAd) {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            ((C3695b) cVar).mo20333a(tTNativeAd);
        }
    }

    /* renamed from: g */
    public void mo20299g() {
        ViewStub viewStub;
        if (this.f9420q != null && (viewStub = this.f9398F) != null && viewStub.getParent() != null && this.f9404a != null && this.f9410g == null) {
            this.f9410g = (RelativeLayout) this.f9398F.inflate();
            this.f9411h = (ImageView) findViewById(C2984t.m8432e(this.f9420q, "tt_native_video_img_id"));
            ImageView imageView = (ImageView) findViewById(C2984t.m8432e(this.f9420q, "tt_native_video_play"));
            this.f9413j = imageView;
            if (this.f9414k) {
                C4020v.m13282a((View) imageView, 0);
            }
            if (!(this.f9404a.mo19607J() == null || this.f9404a.mo19607J().mo16358h() == null)) {
                C3854d.m12660a().mo20704a(this.f9404a.mo19607J().mo16358h(), this.f9411h);
            }
            ImageView imageView2 = this.f9413j;
            if (imageView2 != null) {
                imageView2.setClickable(true);
                this.f9413j.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        NativeVideoTsView.this.mo20095c();
                    }
                });
            }
            m11874n();
        }
    }

    /* renamed from: n */
    private void m11874n() {
        if ((this instanceof NativeDrawVideoTsView) && !this.f9417n.get() && C3524h.m10852d().mo19868r() != null) {
            this.f9413j.setImageBitmap(C3524h.m10852d().mo19868r());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9413j.getLayoutParams();
            int b = (int) C4020v.m13297b(getContext(), (float) this.f9416m);
            layoutParams.width = b;
            layoutParams.height = b;
            this.f9413j.setLayoutParams(layoutParams);
            this.f9417n.set(true);
        }
    }

    /* renamed from: o */
    private void m11875o() {
        this.f9405b = new C3695b(this.f9420q, this.f9406c, this.f9404a, this.f9415l, !m11867A(), this.f9425x, this.f9426y, this.f9409f);
        m11876p();
        this.f9421r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (NativeVideoTsView.this.f9421r != null && NativeVideoTsView.this.f9421r.getViewTreeObserver() != null && NativeVideoTsView.this.f9405b != null) {
                    ((C3695b) NativeVideoTsView.this.f9405b).mo20330a(NativeVideoTsView.this.f9421r.getWidth(), NativeVideoTsView.this.f9421r.getHeight());
                    NativeVideoTsView.this.f9421r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    public void setVideoAdLoadListener(C2526c.C2530d dVar) {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            cVar.mo16432a(dVar);
        }
    }

    public void setNativeVideoAdListener(C2526c.C2527a aVar) {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            cVar.mo16430a(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo20296a(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.f9421r.setVisibility(0);
        if (this.f9405b == null) {
            this.f9405b = new C3695b(this.f9420q, this.f9406c, this.f9404a, this.f9415l, this.f9425x, this.f9426y, this.f9409f);
            m11876p();
        }
        this.f9393A = j;
        if (!m11867A()) {
            return true;
        }
        this.f9405b.mo16434a(false);
        C3498n nVar = this.f9404a;
        if (!(nVar == null || nVar.mo19607J() == null)) {
            C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f9404a.mo19650aD()).mo16068a(), this.f9404a);
            a.mo16382b(this.f9404a.mo19622Y());
            a.mo16374a(this.f9421r.getWidth());
            a.mo16381b(this.f9421r.getHeight());
            a.mo16385c(this.f9404a.mo19659ac());
            a.mo16375a(j);
            a.mo16379a(m11886z());
            if (z2) {
                this.f9405b.mo16439b(a);
                return true;
            }
            z3 = this.f9405b.mo16436a(a);
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (((i > 0 && !z && !z2) || (i > 0 && z && !this.f9394B)) && this.f9405b != null) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18721a(this.f9405b.mo16449g());
            aVar.mo18728c(this.f9405b.mo16452j());
            aVar.mo18725b(this.f9405b.mo16450h());
            C3133a.m9052b(this.f9405b.mo16457o(), aVar);
        }
        return z3;
    }

    /* renamed from: p */
    private void m11876p() {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            cVar.mo16445d(this.f9422s);
            ((C3695b) this.f9405b).mo20335a((C3695b.C3711a) this);
            this.f9405b.mo16430a((C2526c.C2527a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11877q();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m11877q();
    }

    /* renamed from: q */
    private void m11877q() {
        C2526c cVar = this.f9405b;
        if (cVar == null) {
            m11875o();
        } else if ((cVar instanceof C3695b) && !m11867A()) {
            ((C3695b) this.f9405b).mo20343v();
        }
        if (this.f9405b != null && this.f9401I.get()) {
            this.f9401I.set(false);
            mo20094b();
            if (mo20302h()) {
                C4020v.m13282a((View) this.f9410g, 8);
                ImageView imageView = this.f9412i;
                if (imageView != null) {
                    C4020v.m13282a((View) imageView, 8);
                }
                C3498n nVar = this.f9404a;
                if (nVar == null || nVar.mo19607J() == null) {
                    C2975l.m8391e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                    return;
                }
                C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f9404a.mo19650aD()).mo16068a(), this.f9404a);
                a.mo16382b(this.f9404a.mo19622Y());
                a.mo16374a(this.f9421r.getWidth());
                a.mo16381b(this.f9421r.getHeight());
                a.mo16385c(this.f9404a.mo19659ac());
                a.mo16375a(0);
                a.mo16379a(m11886z());
                this.f9405b.mo16436a(a);
                this.f9405b.mo16443c(false);
            } else if (this.f9405b.mo16459q()) {
                C2975l.m8384b("NativeVideoAdView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.f9405b.mo16459q());
                mo20297b(true);
            } else {
                C2975l.m8387c("NativeVideoAdView", "attachTask.......mRlImgCover.....VISIBLE");
                mo20299g();
                C4020v.m13282a((View) this.f9410g, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11878r();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m11878r();
    }

    /* renamed from: r */
    private void m11878r() {
        this.f9419p = null;
        mo20303i();
        mo20093a(false);
        m11879s();
    }

    /* renamed from: s */
    private void m11879s() {
        if (!this.f9401I.get()) {
            this.f9401I.set(true);
            C2526c cVar = this.f9405b;
            if (cVar != null) {
                cVar.mo16435a(true, 3);
            }
        }
        this.f9403K.set(false);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m11879s();
        }
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 1) {
            m11880t();
        }
    }

    /* renamed from: t */
    private void m11880t() {
        m11871a(mo20304j(), f9391v.intValue());
        this.f9395C.sendEmptyMessageDelayed(1, 500);
    }

    /* renamed from: u */
    private boolean m11881u() {
        if (m11867A()) {
            return false;
        }
        boolean a = C3966a.m12974a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (C3966a.m12974a("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || a) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m11882v() {
        if (!m11867A()) {
            C3966a.m12967a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) false);
            C3966a.m12967a("sp_multi_native_video_data", "key_video_is_from_detail_page", (Boolean) false);
        }
    }

    /* renamed from: a */
    private void m11871a(boolean z, int i) {
        if (this.f9404a != null && this.f9405b != null) {
            boolean u = m11881u();
            m11882v();
            if (u && this.f9405b.mo16459q()) {
                C2975l.m8384b("NativeVideoAdView", "changeVideoStatus---isFromDetailPage()=" + u + "，mNativeVideoController.isPlayComplete()=" + this.f9405b.mo16459q());
                mo20297b(true);
                mo20096d();
            } else if (!z || this.f9405b.mo16459q() || this.f9405b.mo16455m()) {
                if (this.f9405b.mo16456n() != null && this.f9405b.mo16456n().mo16292l()) {
                    this.f9405b.mo16437b();
                    mo20093a(true);
                    C2526c.C2529c cVar = this.f9399G;
                    if (cVar != null) {
                        cVar.mo16469b_();
                    }
                }
            } else if (this.f9405b.mo16456n() == null || !this.f9405b.mo16456n().mo16293m()) {
                if (this.f9422s && this.f9405b.mo16456n() == null) {
                    if (!this.f9401I.get()) {
                        this.f9401I.set(true);
                    }
                    this.f9403K.set(false);
                    m11877q();
                }
            } else if (this.f9422s || i == 1) {
                C2526c cVar2 = this.f9405b;
                if (cVar2 != null) {
                    setIsQuiet(cVar2.mo16458p());
                }
                if ("ALP-AL00".equals(this.f9397E)) {
                    this.f9405b.mo16444d();
                } else {
                    if (!C3524h.m10852d().mo19867q()) {
                        u = true;
                    }
                    ((C3695b) this.f9405b).mo20340h(u);
                }
                mo20093a(false);
                C2526c.C2529c cVar3 = this.f9399G;
                if (cVar3 != null) {
                    cVar3.mo16470c_();
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2526c cVar;
        C2526c cVar2;
        C2526c cVar3;
        C2526c cVar4;
        super.onWindowFocusChanged(z);
        m11883w();
        if (!m11881u() || (cVar4 = this.f9405b) == null || !cVar4.mo16459q()) {
            mo20094b();
            if (m11867A() || !mo20302h() || (cVar2 = this.f9405b) == null || cVar2.mo16455m()) {
                if (mo20302h()) {
                    return;
                }
                if (!z && (cVar = this.f9405b) != null && cVar.mo16456n() != null && this.f9405b.mo16456n().mo16292l()) {
                    this.f9395C.removeMessages(1);
                    m11871a(false, f9391v.intValue());
                } else if (z) {
                    this.f9395C.obtainMessage(1).sendToTarget();
                }
            } else if (this.f9395C == null) {
            } else {
                if (!z || (cVar3 = this.f9405b) == null || cVar3.mo16459q()) {
                    this.f9395C.removeMessages(1);
                    m11871a(false, f9391v.intValue());
                    return;
                }
                this.f9395C.obtainMessage(1).sendToTarget();
            }
        } else {
            m11882v();
            C4020v.m13282a((View) this.f9410g, 8);
            mo20297b(true);
            mo20096d();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        C2526c cVar;
        C3498n nVar;
        C2526c cVar2;
        C2526c cVar3;
        super.onWindowVisibilityChanged(i);
        m11883w();
        if (this.f9402J) {
            this.f9402J = i == 0;
        }
        if (!m11881u() || (cVar3 = this.f9405b) == null || !cVar3.mo16459q()) {
            mo20094b();
            if (!m11867A() && mo20302h() && (cVar = this.f9405b) != null && !cVar.mo16455m() && (nVar = this.f9404a) != null) {
                if (!this.f9427z || nVar.mo19607J() == null) {
                    C2975l.m8391e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
                } else {
                    this.f9404a.mo19607J();
                    C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f9404a.mo19650aD()).mo16068a(), this.f9404a);
                    a.mo16382b(this.f9404a.mo19622Y());
                    a.mo16374a(this.f9421r.getWidth());
                    a.mo16381b(this.f9421r.getHeight());
                    a.mo16385c(this.f9404a.mo19659ac());
                    a.mo16375a(this.f9393A);
                    a.mo16379a(m11886z());
                    this.f9405b.mo16436a(a);
                    this.f9427z = false;
                    C4020v.m13282a((View) this.f9410g, 8);
                }
                if (i == 0 && this.f9395C != null && (cVar2 = this.f9405b) != null && !cVar2.mo16459q()) {
                    this.f9395C.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            }
            return;
        }
        m11882v();
        C4020v.m13282a((View) this.f9410g, 8);
        mo20297b(true);
        mo20096d();
    }

    /* renamed from: w */
    private void m11883w() {
        if (!(this.f9405b == null || m11867A() || !C3966a.m12974a("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            boolean a = C3966a.m12974a("sp_multi_native_video_data", "key_native_video_complete", false);
            long a2 = C3966a.m12963a("sp_multi_native_video_data", "key_video_current_play_position", 0);
            long a3 = C3966a.m12963a("sp_multi_native_video_data", "key_video_total_play_duration", this.f9405b.mo16452j() + this.f9405b.mo16450h());
            long a4 = C3966a.m12963a("sp_multi_native_video_data", "key_video_duration", this.f9405b.mo16452j());
            this.f9405b.mo16443c(a);
            this.f9405b.mo16429a(a2);
            this.f9405b.mo16438b(a3);
            this.f9405b.mo16442c(a4);
            C3966a.m12967a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) false);
            C2975l.m8391e("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + a + ",position=" + a2 + ",totalPlayDuration=" + a3 + ",duration=" + a4);
        }
    }

    public void setNativeVideoController(C2526c cVar) {
        this.f9405b = cVar;
    }

    public C2526c getNativeVideoController() {
        return this.f9405b;
    }

    /* renamed from: h */
    public boolean mo20302h() {
        return this.f9422s;
    }

    public void setIsAutoPlay(boolean z) {
        if (!this.f9396D) {
            int c = C3578m.m11241h().mo19931c(C4014u.m13223f(this.f9404a));
            if (z && c != 4 && (!C2979o.m8411e(this.f9420q) ? !(!C2979o.m8412f(this.f9420q) ? C2979o.m8410d(this.f9420q) : m11884x() || m11885y()) : !m11884x())) {
                z = false;
            }
            this.f9422s = z;
            C2526c cVar = this.f9405b;
            if (cVar != null) {
                cVar.mo16445d(z);
            }
            if (!this.f9422s) {
                mo20299g();
                RelativeLayout relativeLayout = this.f9410g;
                if (relativeLayout != null) {
                    C4020v.m13282a((View) relativeLayout, 0);
                    C3498n nVar = this.f9404a;
                    if (!(nVar == null || nVar.mo19607J() == null)) {
                        C3854d.m12660a().mo20704a(this.f9404a.mo19607J().mo16358h(), this.f9411h);
                    }
                }
            } else {
                C4020v.m13282a((View) this.f9410g, 8);
            }
            this.f9396D = true;
        }
    }

    /* renamed from: x */
    private boolean m11884x() {
        return 2 == C3578m.m11241h().mo19931c(C4014u.m13223f(this.f9404a));
    }

    /* renamed from: y */
    private boolean m11885y() {
        return 5 == C3578m.m11241h().mo19931c(C4014u.m13223f(this.f9404a));
    }

    /* renamed from: z */
    private boolean m11886z() {
        return this.f9407d;
    }

    public void setIsQuiet(boolean z) {
        this.f9407d = z;
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            cVar.mo16440b(z);
        }
    }

    /* renamed from: A */
    private boolean m11867A() {
        return this.f9423t;
    }

    public void setVideoAdInteractionListener(C2526c.C2529c cVar) {
        this.f9399G = cVar;
    }

    /* renamed from: f */
    public void mo20298f() {
        C2526c.C2529c cVar = this.f9399G;
        if (cVar != null) {
            cVar.mo16468a_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.f9414k = z;
    }

    /* renamed from: a */
    public void mo20295a(int i) {
        mo20094b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20095c() {
        if (!mo20305k()) {
            mo20307m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20093a(boolean z) {
        if (this.f9412i == null) {
            this.f9412i = new ImageView(getContext());
            if (C3524h.m10852d().mo19868r() != null) {
                this.f9412i.setImageBitmap(C3524h.m10852d().mo19868r());
            } else {
                this.f9412i.setImageResource(C2984t.m8431d(C3578m.m11231a(), "tt_new_play_video"));
            }
            this.f9412i.setScaleType(ImageView.ScaleType.FIT_XY);
            int b = (int) C4020v.m13297b(getContext(), (float) this.f9416m);
            int b2 = (int) C4020v.m13297b(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = b2;
            layoutParams.bottomMargin = b2;
            this.f9421r.addView(this.f9412i, layoutParams);
            this.f9412i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    NativeVideoTsView.this.mo20307m();
                }
            });
        }
        if (z) {
            this.f9412i.setVisibility(0);
        } else {
            this.f9412i.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo20297b(boolean z) {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            cVar.mo16443c(z);
            C2524b o = this.f9405b.mo16457o();
            if (o != null) {
                o.mo16427b();
                View c = o.mo16428c();
                if (c != null) {
                    if (c.getParent() != null) {
                        ((ViewGroup) c.getParent()).removeView(c);
                    }
                    c.setVisibility(0);
                    addView(c);
                    o.mo16425a(this.f9404a, new WeakReference(this.f9420q), false);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo20303i() {
        C2524b o;
        C2526c cVar = this.f9405b;
        if (cVar != null && (o = cVar.mo16457o()) != null) {
            o.mo16423a();
            View c = o.mo16428c();
            if (c != null) {
                c.setVisibility(8);
                if (c.getParent() != null) {
                    ((ViewGroup) c.getParent()).removeView(c);
                }
            }
        }
    }

    /* renamed from: B */
    private void m11868B() {
        C4020v.m13316e((View) this.f9412i);
        C4020v.m13316e((View) this.f9410g);
    }

    public void setVideoCacheUrl(String str) {
        this.f9424u = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo20304j() {
        return C3765x.m12370a(this, 50, C3624o.m11478b(this.f9415l) ? 1 : 5);
    }

    /* renamed from: k */
    public boolean mo20305k() {
        boolean z = false;
        if (C2979o.m8409c(C3578m.m11231a()) == 0) {
            return false;
        }
        if (this.f9405b.mo16456n() != null && this.f9405b.mo16456n().mo16292l()) {
            m11871a(false, f9391v.intValue());
            C2989x xVar = this.f9395C;
            z = true;
            if (xVar != null) {
                xVar.removeMessages(1);
            }
        }
        return z;
    }

    /* renamed from: l */
    public void mo20306l() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof C3695b)) {
            C3695b bVar = (C3695b) getNativeVideoController();
            bVar.mo16413a((C2524b) bVar.mo16457o(), (View) this);
        }
    }

    /* renamed from: m */
    public void mo20307m() {
        if (C2979o.m8409c(C3578m.m11231a()) == 0 || !mo20304j()) {
            return;
        }
        if (this.f9405b.mo16456n() != null && this.f9405b.mo16456n().mo16293m()) {
            m11871a(true, f9392w.intValue());
            mo20094b();
            C2989x xVar = this.f9395C;
            if (xVar != null) {
                xVar.sendEmptyMessageDelayed(1, 500);
            }
        } else if (!mo20302h() && !this.f9403K.get()) {
            this.f9403K.set(true);
            m11868B();
            C3498n nVar = this.f9404a;
            if (!(nVar == null || nVar.mo19607J() == null)) {
                m11868B();
                this.f9404a.mo19607J();
                C2522c a = C3498n.m10578a(CacheDirFactory.getICacheDir(this.f9404a.mo19650aD()).mo16068a(), this.f9404a);
                a.mo16382b(this.f9404a.mo19622Y());
                a.mo16374a(this.f9421r.getWidth());
                a.mo16381b(this.f9421r.getHeight());
                a.mo16385c(this.f9404a.mo19659ac());
                a.mo16375a(this.f9393A);
                a.mo16379a(m11886z());
                a.mo16376a(CacheDirFactory.getICacheDir(this.f9404a.mo19650aD()).mo16068a());
                this.f9405b.mo16436a(a);
            }
            C2989x xVar2 = this.f9395C;
            if (xVar2 != null) {
                xVar2.sendEmptyMessageDelayed(1, 500);
            }
            mo20093a(false);
        }
    }

    public double getCurrentPlayTime() {
        C2526c cVar = this.f9405b;
        if (cVar != null) {
            return (((double) cVar.mo16449g()) * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }
}
