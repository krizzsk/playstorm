package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.C2690c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.common.C3227c;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3285a;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3287b;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3290c;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3299e;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3300f;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3322a;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3324b;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3329c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3384a;
import com.bytedance.sdk.openadsdk.component.reward.view.C3387b;
import com.bytedance.sdk.openadsdk.component.reward.view.C3388c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3389d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3768z;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3610e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3611f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3617j;
import com.bytedance.sdk.openadsdk.core.p146b.C3427b;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p146b.C3432e;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.core.p151e.C3485l;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3685b;
import com.bytedance.sdk.openadsdk.core.video.p164c.C3686c;
import com.bytedance.sdk.openadsdk.core.widget.C3742a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3922a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p171g.C3804b;
import com.bytedance.sdk.openadsdk.p171g.C3806d;
import com.bytedance.sdk.openadsdk.p171g.C3807e;
import com.bytedance.sdk.openadsdk.p171g.C3808f;
import com.bytedance.sdk.openadsdk.p171g.C3809g;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class TTBaseVideoActivity extends Activity implements C2989x.C2990a, C3685b, C3686c, C3808f {

    /* renamed from: A */
    protected final AtomicBoolean f6974A;

    /* renamed from: B */
    protected C3742a f6975B;

    /* renamed from: C */
    protected IListenerManager f6976C;

    /* renamed from: D */
    protected String f6977D;

    /* renamed from: E */
    protected C3809g f6978E;

    /* renamed from: F */
    boolean f6979F;

    /* renamed from: G */
    boolean f6980G;

    /* renamed from: H */
    protected boolean f6981H;

    /* renamed from: I */
    ProgressBar f6982I;

    /* renamed from: J */
    protected int f6983J;

    /* renamed from: K */
    String f6984K;

    /* renamed from: L */
    protected C3322a f6985L;

    /* renamed from: M */
    protected boolean f6986M;

    /* renamed from: N */
    public AtomicBoolean f6987N;

    /* renamed from: O */
    public int f6988O;

    /* renamed from: P */
    protected C3807e f6989P;

    /* renamed from: Q */
    protected C3806d f6990Q;

    /* renamed from: R */
    private C3432e f6991R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Double f6992S;

    /* renamed from: T */
    private long f6993T;

    /* renamed from: U */
    private AtomicBoolean f6994U;

    /* renamed from: V */
    private boolean f6995V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f6996W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public float f6997X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f6998Y;

    /* renamed from: Z */
    private int f6999Z;

    /* renamed from: a */
    protected final String f7000a;

    /* renamed from: aa */
    private int f7001aa;

    /* renamed from: ab */
    private boolean f7002ab;

    /* renamed from: ac */
    private AtomicBoolean f7003ac;

    /* renamed from: ad */
    private AtomicBoolean f7004ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C3227c f7005ae;

    /* renamed from: af */
    private LinearLayout f7006af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f7007ag;

    /* renamed from: ah */
    private int f7008ah;

    /* renamed from: b */
    Context f7009b;

    /* renamed from: c */
    C3498n f7010c;

    /* renamed from: d */
    String f7011d;

    /* renamed from: e */
    TTAdDislikeDialog f7012e;

    /* renamed from: f */
    TTAdDislikeToast f7013f;

    /* renamed from: g */
    public AtomicBoolean f7014g;

    /* renamed from: h */
    public AtomicBoolean f7015h;

    /* renamed from: i */
    C3389d f7016i;

    /* renamed from: j */
    C3384a f7017j;

    /* renamed from: k */
    C3290c f7018k;

    /* renamed from: l */
    C3387b f7019l;

    /* renamed from: m */
    C3299e f7020m;

    /* renamed from: n */
    C3285a f7021n;

    /* renamed from: o */
    C3300f f7022o;

    /* renamed from: p */
    C3287b f7023p;

    /* renamed from: q */
    final C2989x f7024q;

    /* renamed from: r */
    boolean f7025r;

    /* renamed from: s */
    int f7026s;

    /* renamed from: t */
    int f7027t;

    /* renamed from: u */
    protected int f7028u;

    /* renamed from: v */
    final AtomicBoolean f7029v;

    /* renamed from: w */
    final AtomicBoolean f7030w;

    /* renamed from: x */
    final AtomicBoolean f7031x;

    /* renamed from: y */
    final AtomicBoolean f7032y;

    /* renamed from: z */
    final AtomicBoolean f7033z;

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo18415G();

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo18416H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo18417I() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18467z() {
    }

    public TTBaseVideoActivity() {
        this.f7000a = mo18416H() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f6992S = null;
        this.f6993T = 0;
        this.f6994U = new AtomicBoolean(false);
        this.f7014g = new AtomicBoolean(false);
        this.f7015h = new AtomicBoolean(false);
        this.f7016i = mo18417I() ? new C3389d(this) : new C3388c(this);
        this.f7017j = new C3384a(this);
        this.f7018k = new C3290c(this);
        this.f7019l = new C3387b(this);
        this.f7020m = new C3299e(this);
        this.f7021n = new C3285a(this);
        this.f7022o = new C3300f(this);
        this.f7023p = new C3287b(this);
        this.f7024q = new C2989x(Looper.getMainLooper(), this);
        this.f7025r = true;
        this.f7028u = 0;
        this.f7029v = new AtomicBoolean(false);
        this.f7030w = new AtomicBoolean(false);
        this.f7031x = new AtomicBoolean(false);
        this.f7032y = new AtomicBoolean(false);
        this.f7033z = new AtomicBoolean(false);
        this.f6974A = new AtomicBoolean(false);
        this.f6995V = false;
        this.f6981H = false;
        this.f6983J = -1;
        this.f6984K = "video_player";
        this.f6996W = false;
        this.f6998Y = 1;
        this.f7002ab = true;
        this.f6987N = new AtomicBoolean(false);
        this.f7003ac = new AtomicBoolean(false);
        this.f7004ad = new AtomicBoolean(false);
        this.f7008ah = 0;
        this.f6989P = new C3807e() {
            /* renamed from: a */
            public void mo18488a() {
                TTBaseVideoActivity.this.mo18467z();
            }
        };
        this.f6990Q = new C3806d() {
            /* renamed from: a */
            public void mo18490a(int i) {
            }

            /* renamed from: b */
            public void mo18491b() {
            }

            /* renamed from: a */
            public void mo18489a() {
                if (!TTBaseVideoActivity.this.isFinishing()) {
                    if ((TTBaseVideoActivity.this.f7010c == null || TTBaseVideoActivity.this.f7010c.mo19653aG()) && TTBaseVideoActivity.this.f7010c != null && !C3501p.m10767g(TTBaseVideoActivity.this.f7010c)) {
                        TTBaseVideoActivity.this.f7024q.removeMessages(800);
                        TTBaseVideoActivity.this.f7024q.sendMessage(TTBaseVideoActivity.this.mo18518e(1));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        mo18420a(getIntent());
        mo18421a(bundle);
        try {
            C3578m.m11233a(this);
            this.f7028u = C4020v.m13311d(this, C4020v.m13322j(this));
            requestWindowFeature(1);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        if (bundle != null && bundle.getLong("video_current") > 0) {
            this.f7020m.mo19068b(bundle.getLong("video_current", 0));
        }
        this.f7009b = this;
        C3809g gVar = new C3809g(getApplicationContext());
        this.f6978E = gVar;
        gVar.mo20619a((C3808f) this);
        this.f6983J = this.f6978E.mo20628g();
        getWindow().addFlags(128);
        C2975l.m8384b("onVolumeChanged", "onCreate >>>>>> mVolume = " + this.f6983J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18419a() {
        mo18438g();
        this.f7018k.mo19032b(this.f7025r);
        mo18427b();
        if (!this.f7010c.mo19679aw()) {
            this.f7022o.mo19120h();
            String str = mo18416H() ? "reward_endcard" : "fullscreen_endcard";
            mo18429b(str);
            mo18422a(str);
        }
        mo18440i();
        if (C3501p.m10769i(this.f7010c)) {
            this.f7023p.mo19016e();
        }
        if (C3485l.m10541c(this.f7010c)) {
            this.f7024q.sendEmptyMessageDelayed(500, 100);
        }
        this.f7026s = (int) this.f7020m.mo19052C();
        this.f7016i.mo19313a(mo18436f(), this.f6997X == 100.0f);
        this.f7017j.mo19282c();
        mo18446o();
        mo18415G();
        mo18517L();
        mo18445n();
        C3498n nVar = this.f7010c;
        if (nVar != null && nVar.mo19680ax() != null && this.f7010c.mo19680ax().mo19977a() != null) {
            this.f7010c.mo19680ax().mo19977a().mo20036a(0);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f6994U.get()) {
            this.f6993T = System.currentTimeMillis();
            return;
        }
        C3156e.m9189a((System.currentTimeMillis() - this.f6993T) + "", this.f7010c, this.f7000a, this.f7020m.mo19055a());
        this.f6993T = 0;
    }

    /* renamed from: L */
    private void mo18517L() {
        if (!mo18416H()) {
            if (C3329c.m9897a(this.f7010c)) {
                C3329c cVar = new C3329c(this, this.f7010c, this.f6999Z, this.f7001aa);
                this.f6985L = cVar;
                cVar.mo19172a(this.f7018k, this.f7016i);
                this.f6985L.mo19174a(this.f7020m.mo19095z());
                this.f6985L.mo19170a(this.f6998Y);
                this.f6985L.mo19169a(this.f6997X);
                this.f6985L.mo19173a(this.f6991R);
            } else if (C3324b.m9875c(this.f7010c)) {
                C3324b bVar = new C3324b(this, this.f7010c, this.f6999Z, this.f7001aa);
                this.f6985L = bVar;
                bVar.mo19172a(this.f7018k, this.f7016i);
                this.f6985L.mo19170a(this.f6998Y);
                this.f6985L.mo19169a(this.f6997X);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18427b() {
        if (C3501p.m10761a(this.f7010c) && this.f6983J == 0) {
            this.f7025r = true;
            this.f7018k.mo19032b(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18431c() {
        if (C3501p.m10770j(this.f7010c) && this.f7025r) {
            this.f7018k.mo19032b(true);
            this.f6978E.mo20620a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18433d() {
        this.f7018k.mo19023a();
        this.f7018k.mo19029a(mo18416H(), this.f7010c);
        if (this.f7010c.mo19679aw()) {
            this.f7018k.mo19028a(false);
        } else {
            this.f7018k.mo19028a(this.f7010c.mo19672ap());
        }
        if (C3501p.m10761a(this.f7010c)) {
            this.f7022o.mo19113c().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.f7022o.mo19115d().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.f7018k.mo19035c(true);
            if (C3501p.m10769i(this.f7010c)) {
                this.f7016i.mo19315b();
                C4020v.m13282a((View) this.f7022o.mo19113c(), 4);
                C4020v.m13282a((View) this.f7022o.mo19115d(), 0);
            }
        }
        if (!C3485l.m10541c(this.f7010c) && !C3485l.m10539b(this.f7010c)) {
            this.f7016i.mo19303a(C4020v.m13315e(this.f7009b, (float) this.f6999Z), C4020v.m13315e(this.f7009b, (float) this.f7001aa));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public boolean mo18576M() {
        return this.f7010c.mo19679aw() || this.f7010c.mo19660ad() == 15 || this.f7010c.mo19660ad() == 5 || this.f7010c.mo19660ad() == 50;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18422a(String str) {
        this.f7022o.mo19106a(str, (C3300f.C3312a) new C3300f.C3312a() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:9)|10|11|(1:20)(2:15|17)) */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x0072 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo18469a(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f7010c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10769i(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.isFinishing()     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f7010c     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.mo19653aG()     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f7010c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10767g(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.component.utils.x r4 = r4.f7024q     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    r0 = 0
                    android.os.Message r5 = r5.mo18518e((int) r0)     // Catch:{ all -> 0x0036 }
                    r0 = 1000(0x3e8, double:4.94E-321)
                    r4.sendMessageDelayed(r5, r0)     // Catch:{ all -> 0x0036 }
                L_0x0036:
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f7022o     // Catch:{ all -> 0x0072 }
                    boolean r4 = r4.mo19122j()     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f7010c     // Catch:{ all -> 0x0072 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10769i(r4)     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.b r4 = r4.f7023p     // Catch:{ all -> 0x0072 }
                    r4.mo19010b()     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f7022o     // Catch:{ all -> 0x0072 }
                    r5 = 1
                    r4.mo19112b((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.f7022o     // Catch:{ all -> 0x0072 }
                    r4.mo19114c((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    android.content.Context r4 = r4.f7009b     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f7010c     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    java.lang.String r0 = r0.f7000a     // Catch:{ all -> 0x0072 }
                    java.lang.String r1 = "py_loading_success"
                    r2 = 0
                    com.bytedance.sdk.openadsdk.p130b.C3156e.m9199c((android.content.Context) r4, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5, (java.lang.String) r0, (java.lang.String) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0072 }
                L_0x0072:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C30311.mo18469a(android.webkit.WebView, java.lang.String):void");
            }

            /* renamed from: a */
            public void mo18470a(WebView webView, String str, Bitmap bitmap) {
                if (!TTBaseVideoActivity.this.f6996W && C3501p.m10769i(TTBaseVideoActivity.this.f7010c)) {
                    boolean unused = TTBaseVideoActivity.this.f6996W = true;
                    TTBaseVideoActivity.this.f7023p.mo19000a(TTBaseVideoActivity.this.f7027t, TTBaseVideoActivity.this.f7010c, TTBaseVideoActivity.this.mo18416H());
                    TTBaseVideoActivity.this.f7024q.sendEmptyMessageDelayed(600, (long) (TTBaseVideoActivity.this.f7023p.mo19021j() * 1000));
                    Message obtain = Message.obtain();
                    obtain.what = ErrorCode.UNDEFINED_ERROR;
                    obtain.arg1 = TTBaseVideoActivity.this.f7023p.mo19021j();
                    TTBaseVideoActivity.this.f7024q.sendMessage(obtain);
                    TTBaseVideoActivity.this.f7023p.mo19017f();
                    TTBaseVideoActivity.this.mo18435e();
                    TTBaseVideoActivity.this.f7023p.mo19019h();
                }
            }

            /* renamed from: a */
            public void mo18468a(WebView webView, int i) {
                try {
                    if (C3501p.m10769i(TTBaseVideoActivity.this.f7010c) && TTBaseVideoActivity.this.f7010c.mo19653aG() && !TTBaseVideoActivity.this.isFinishing()) {
                        TTBaseVideoActivity.this.f7023p.mo18999a(i);
                    } else if (TTBaseVideoActivity.this.f7007ag && TTBaseVideoActivity.this.f7005ae != null) {
                        TTBaseVideoActivity.this.f7005ae.mo18880a(webView, i);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        if (C3501p.m10769i(this.f7010c)) {
            C3300f fVar = this.f7022o;
            fVar.mo19101a(fVar.mo19115d());
            this.f7023p.mo19002a((DownloadListener) new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    TTBaseVideoActivity.this.f7021n.mo18997b();
                    TTBaseVideoActivity.this.mo18516K();
                }
            });
        }
        this.f7023p.mo19007a(this.f6979F);
        this.f7022o.mo19100a((DownloadListener) new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                TTBaseVideoActivity.this.f7021n.mo18997b();
                TTBaseVideoActivity.this.mo18516K();
            }
        });
    }

    /* renamed from: e */
    public void mo18435e() {
        if (!this.f7015h.getAndSet(true) || C3501p.m10769i(this.f7010c)) {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(this.f6977D)) {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.f6977D);
                View findViewById = findViewById(16908290);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", findViewById.getWidth());
                    jSONObject.put("height", findViewById.getHeight());
                    jSONObject.put("alpha", (double) findViewById.getAlpha());
                } catch (Throwable unused) {
                }
                hashMap.put("root_view", jSONObject.toString());
            }
            if (!this.f6994U.get() || !C3485l.m10541c(this.f7010c)) {
                this.f6994U.set(true);
                C3156e.m9175a(this.f7009b, this.f7010c, this.f7000a, (Map<String, Object>) hashMap, this.f6992S);
                mo18515J();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo18436f() {
        String a = C2984t.m8425a(this, "tt_video_download_apk");
        C3498n nVar = this.f7010c;
        if (nVar == null) {
            return a;
        }
        if (!TextUtils.isEmpty(nVar.mo19620W())) {
            return this.f7010c.mo19620W();
        }
        if (this.f7010c.mo19609L() != 4) {
            return C2984t.m8425a(this, "tt_video_mobile_go_detail");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo18438g() {
        if (this.f7023p.mo19008a() && C3501p.m10769i(this.f7010c) && C3501p.m10767g(this.f7010c)) {
            this.f7024q.sendMessageDelayed(mo18518e(2), 10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo18439h() {
        return C3578m.m11241h().mo19953j(String.valueOf(this.f7027t)) != 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Message mo18518e(int i) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18440i() {
        this.f7017j.mo19277a(this.f7010c);
        this.f7017j.mo19279a(mo18436f());
    }

    /* renamed from: N */
    private void m8640N() {
        C3498n nVar = this.f7010c;
        if (nVar != null) {
            C3814b e = C3814b.m12522b().mo20632a(mo18416H() ? 7 : 8).mo20637c(String.valueOf(C4014u.m13223f(nVar))).mo20641e(C4014u.m13235h(this.f7010c));
            e.mo20635b(this.f7022o.mo19126n()).mo20643f(this.f7022o.mo19127o());
            e.mo20645g(this.f7010c.mo19659ac()).mo20639d(this.f7010c.mo19622Y());
            C3815b.m12552a().mo20671f(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18429b(String str) {
        this.f7022o.mo19105a(Boolean.valueOf(mo18416H()), this.f6977D, this.f7025r, this.f6989P, str);
        this.f7022o.mo19117e().mo20421a(this.f7016i.mo19328k()).mo20437a(this.f6979F).mo20432a(this.f6989P).mo20431a(this.f6990Q).mo20430a((C3804b) new C3804b() {
            /* renamed from: a */
            public void mo18477a(boolean z, int i, String str) {
                C2975l.m8384b("end card load finish: ", "code=" + i + " msg=" + str + " isRenderSuc=" + z);
                StringBuilder sb = new StringBuilder();
                sb.append("loadFinish:isRenderSuc = ");
                sb.append(z);
                Log.i("TTBaseVideoActivity", sb.toString());
                if (z) {
                    TTBaseVideoActivity.this.f7023p.mo19012c();
                }
                if (C3498n.m10582b(TTBaseVideoActivity.this.f7010c) && !C3501p.m10761a(TTBaseVideoActivity.this.f7010c)) {
                    C2975l.m8384b("TTBaseVideoActivity", "TimeTrackLog report from js " + z);
                    TTBaseVideoActivity.this.f7022o.mo19108a(z, i, str);
                }
            }
        });
    }

    /* renamed from: O */
    private void m8641O() {
        this.f7024q.postDelayed(new Runnable() {
            public void run() {
                try {
                    TTBaseVideoActivity.this.getWindow().getDecorView().findViewById(16908335).setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300);
    }

    /* renamed from: j */
    public void mo18441j() {
        C3389d dVar;
        if (!(!C3485l.m10539b(this.f7010c) || (dVar = this.f7016i) == null || dVar.f8170x == null)) {
            if (this.f7016i.f8170x.mo19575c()) {
                this.f7016i.mo19335r();
                this.f7014g.set(true);
            } else {
                this.f7004ad.set(true);
                mo18425a(true, false, true);
            }
        }
        if (C3485l.m10541c(this.f7010c)) {
            mo18425a(true, false, true);
        }
    }

    /* renamed from: k */
    public void mo18442k() {
        C3299e eVar = this.f7020m;
        if (eVar != null) {
            eVar.mo19053D();
        }
    }

    /* renamed from: l */
    public View mo18443l() {
        C3299e eVar = this.f7020m;
        if (eVar != null) {
            return eVar.mo19054E();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18423a(boolean z) {
        mo18424a(z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18424a(boolean z, boolean z2) {
        mo18425a(z, z2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18425a(boolean z, boolean z2, boolean z3) {
        C3290c cVar;
        C3389d dVar = this.f7016i;
        if (dVar != null) {
            dVar.mo19330m();
        }
        if (z2) {
            this.f7003ac.set(true);
        }
        if (!this.f7014g.get() && (!C3485l.m10539b(this.f7010c) || !this.f7003ac.get() || !this.f7004ad.get())) {
            if (C3485l.m10539b(this.f7010c) && z3) {
                return;
            }
            if ((C3485l.m10539b(this.f7010c) || C3485l.m10541c(this.f7010c)) && (cVar = this.f7018k) != null) {
                cVar.mo19035c(false);
                mo18444m();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && !isFinishing()) {
            this.f7022o.mo19131s();
            this.f6984K = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
            this.f7032y.set(false);
            this.f7033z.set(false);
            TTAdDislikeToast tTAdDislikeToast = this.f7013f;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.mo18874a();
            }
            m8650X();
            if (!this.f7029v.getAndSet(true)) {
                if (mo18417I() && C3501p.m10761a(this.f7010c) && z) {
                    this.f7018k.mo19037d(true);
                }
                mo18431c();
                if (!C3501p.m10769i(this.f7010c)) {
                    this.f7031x.set(z);
                    C3742a aVar = this.f6975B;
                    if (aVar != null && aVar.isShowing()) {
                        this.f6975B.dismiss();
                    }
                    if (this.f7010c.mo19679aw()) {
                        this.f7018k.mo19037d(false);
                    } else {
                        this.f7018k.mo19037d(C3501p.m10769i(this.f7010c));
                    }
                    this.f7018k.mo19035c(C3501p.m10761a(this.f7010c));
                    if (mo18417I() && C3501p.m10761a(this.f7010c) && z) {
                        this.f7018k.mo19037d(true);
                    }
                    this.f7022o.mo19132t();
                    C3389d dVar2 = this.f7016i;
                    if (!(dVar2 == null || dVar2.f8170x == null)) {
                        this.f7016i.f8170x.mo19576d();
                    }
                    if (C3498n.m10579a(this.f7010c) || this.f7022o.mo19137y() || (!C3498n.m10580a(this.f7010c, this.f7022o.mo19122j(), this.f7023p.mo19015d(), this.f7022o.mo19133u()) && !C3501p.m10761a(this.f7010c))) {
                        if (!C3498n.m10582b(this.f7010c)) {
                            C2975l.m8384b("TTBaseVideoActivity", "TimeTrackLog report 408 from backup page");
                            this.f7022o.mo19108a(false, 408, "end_card_timeout");
                        }
                        this.f7022o.mo19134v();
                        this.f7022o.mo19098a(8);
                        if (this.f7007ag) {
                            C4020v.m13282a((View) this.f7006af, 8);
                            this.f7018k.mo19034c(0);
                            this.f7016i.mo19321d(0);
                        }
                        this.f7016i.mo19316b(8);
                        if (!this.f7010c.mo19679aw()) {
                            this.f7017j.mo19281b();
                        } else if (!this.f7017j.mo19280a(this.f7020m)) {
                            finish();
                        }
                        mo18444m();
                        this.f7018k.mo19035c(false);
                        m8640N();
                        if (!mo18416H() && this.f7020m.mo19070b() && this.f7031x.get()) {
                            this.f7020m.mo19081l();
                            return;
                        }
                        return;
                    }
                    if (!C3498n.m10582b(this.f7010c) && !C3501p.m10761a(this.f7010c)) {
                        C2975l.m8384b("TTBaseVideoActivity", "TimeTrackLog report Success from Android");
                        this.f7022o.mo19108a(true, 0, (String) null);
                    }
                    this.f7022o.mo19097a(0.0f);
                    this.f7016i.mo19306a(0.0f);
                    this.f7022o.mo19098a(0);
                    if (this.f7007ag) {
                        C4020v.m13282a((View) this.f7006af, 0);
                        this.f7018k.mo19034c(8);
                        this.f7016i.mo19321d(8);
                    }
                    if (C3501p.m10761a(this.f7010c)) {
                        int au = this.f7010c.mo19677au();
                        if (C3501p.m10769i(this.f7010c)) {
                            au = (this.f7010c.mo19676at() + 1) * 1000;
                        }
                        if (au == -1) {
                            mo18444m();
                        } else if (au >= 0) {
                            this.f7024q.sendEmptyMessageDelayed(600, (long) au);
                        }
                    } else if (!C3501p.m10761a(this.f7010c)) {
                        int av = this.f7010c.mo19678av();
                        if (av == -1) {
                            mo18444m();
                        } else if (av >= 0) {
                            this.f7024q.sendEmptyMessageDelayed(600, (long) av);
                        }
                    }
                    this.f7024q.sendEmptyMessageDelayed(500, 100);
                    this.f7022o.mo19109a(this.f7025r, true);
                    this.f7022o.mo19114c(true);
                    this.f7016i.mo19316b(8);
                    this.f7022o.mo19112b(true);
                    this.f7022o.mo19117e().mo20439a("prerender_page_show", (JSONObject) null);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo18444m() {
        if (!this.f7007ag) {
            this.f7018k.mo19036d();
            this.f7016i.mo19321d(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo18445n() {
        if (C3501p.m10769i(this.f7010c)) {
            mo18423a(false);
            return;
        }
        C3322a aVar = this.f6985L;
        if (aVar != null) {
            aVar.mo19171a(this.f7016i.mo19325h());
        }
        m8642P();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m8642P() {
        C3387b bVar;
        C3322a aVar = this.f6985L;
        if (aVar != null && !aVar.mo19176c()) {
            HashMap hashMap = new HashMap();
            if (mo18417I() && (bVar = this.f7019l) != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(bVar.mo19300i()));
            }
            if (!TextUtils.isEmpty(this.f6977D)) {
                hashMap.put("rit_scene", this.f6977D);
            }
            View findViewById = findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
                jSONObject.put("alpha", (double) findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            hashMap.put("root_view", jSONObject.toString());
            this.f6994U.set(true);
            C3156e.m9175a(this.f7009b, this.f7010c, this.f7000a, (Map<String, Object>) hashMap, this.f6992S);
            mo18515J();
        } else if (!mo18514a(this.f7020m.mo19077h(), false)) {
            this.f7024q.removeMessages(300);
            mo18464w();
            C3299e eVar = this.f7020m;
            eVar.mo19056a(true ^ eVar.mo19051B() ? 1 : 0, 4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18426a(long j, boolean z, final Map<String, Object> map) {
        boolean z2 = false;
        if (!this.f7020m.mo19093x()) {
            return false;
        }
        if (C3485l.m10541c(this.f7010c)) {
            return true;
        }
        if (!z || !this.f7020m.mo19094y()) {
            m8648V();
        }
        try {
            z2 = this.f7020m.mo19067a(j, this.f7025r);
        } catch (Exception unused) {
        }
        if (z2 && !z) {
            this.f6994U.set(true);
            final View findViewById = findViewById(16908290);
            if (findViewById == null) {
                findViewById = getWindow().getDecorView();
            }
            findViewById.post(new Runnable() {
                public void run() {
                    if (!TTBaseVideoActivity.this.f7015h.getAndSet(true)) {
                        Map map = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("width", findViewById.getWidth());
                            jSONObject.put("height", findViewById.getHeight());
                            jSONObject.put("alpha", (double) findViewById.getAlpha());
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put("root_view", jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                        C3156e.m9175a(TTBaseVideoActivity.this.f7009b, TTBaseVideoActivity.this.f7010c, TTBaseVideoActivity.this.f7000a, (Map<String, Object>) map, TTBaseVideoActivity.this.f6992S);
                        TTBaseVideoActivity.this.mo18515J();
                    }
                }
            });
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18446o() {
        if (this.f7010c != null) {
            C304119 r1 = new C3432e(this, this.f7010c, this.f7000a, mo18416H() ? 7 : 5) {
                /* renamed from: a */
                public void mo18480a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3, boolean z) {
                    View view2 = view;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ccr log, onRewardBarClick , x = ");
                    float f5 = f;
                    sb.append(f);
                    C2975l.m8384b("TTBaseVideoActivity", sb.toString());
                    if (!(TTBaseVideoActivity.this.f7010c == null || !TTBaseVideoActivity.this.f7010c.mo19679aw() || view2 == null || view.getTag() == null)) {
                        mo19403a(view.getTag().toString());
                    }
                    HashMap hashMap = new HashMap();
                    if (TTBaseVideoActivity.this.f7029v.get()) {
                        hashMap.put("click_scence", 2);
                    } else if (C3501p.m10769i(TTBaseVideoActivity.this.f7010c)) {
                        hashMap.put("click_scence", 3);
                    } else {
                        hashMap.put("click_scence", 1);
                    }
                    mo19404a((Map<String, Object>) hashMap);
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                    if (view.getId() == C2984t.m8432e(TTBaseVideoActivity.this, "tt_playable_play") && C3501p.m10769i(TTBaseVideoActivity.this.f7010c)) {
                        HashMap hashMap2 = new HashMap();
                        if (TTBaseVideoActivity.this.f7010c.mo19607J() != null) {
                            hashMap2.put("playable_url", TTBaseVideoActivity.this.f7010c.mo19607J().mo16362j());
                        }
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        C3156e.m9202e((Context) tTBaseVideoActivity, tTBaseVideoActivity.f7010c, TTBaseVideoActivity.this.f7000a, "click_playable_download_button_loading", (Map<String, Object>) hashMap2);
                    }
                    TTBaseVideoActivity.this.f7021n.mo18995a(view, f, f2, f3, f4, sparseArray, i, i2, i3, new C3285a.C3286a() {
                        /* renamed from: a */
                        public void mo18482a(String str, JSONObject jSONObject) {
                            TTBaseVideoActivity.this.m8658a(str, jSONObject);
                        }

                        /* renamed from: a */
                        public void mo18481a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3) {
                            TTBaseVideoActivity.this.m8654a(view, f, f2, f3, f4, sparseArray, i, i2, i3);
                        }
                    });
                }
            };
            this.f6991R = r1;
            r1.mo19396a(findViewById(16908290));
            this.f6991R.mo19408b(findViewById(C2984t.m8432e(C3578m.m11231a(), "tt_top_dislike")));
            if (!TextUtils.isEmpty(this.f6977D)) {
                HashMap hashMap = new HashMap();
                hashMap.put("rit_scene", this.f6977D);
                this.f6991R.mo19404a((Map<String, Object>) hashMap);
            }
            if (this.f7021n.mo18998c() != null) {
                this.f6991R.mo19402a(this.f7021n.mo18998c());
            }
            this.f7023p.mo19004a(this.f6991R);
            C304420 r9 = new C3427b(this, this.f7010c, this.f7000a, mo18416H() ? 7 : 5) {
                /* renamed from: a */
                public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
                    try {
                        TTBaseVideoActivity.this.m8654a(view, f, f2, f3, f4, sparseArray, this.f8284A, this.f8296y, this.f8297z);
                    } catch (Exception e) {
                        C2975l.m8391e("TTBaseVideoActivity", "onClickReport error :" + e.getMessage());
                    }
                }
            };
            C3389d dVar = this.f7016i;
            C3432e eVar = this.f6991R;
            dVar.mo19310a(eVar, eVar, r9, this.f7020m);
            this.f7017j.mo19276a(this.f6991R);
            this.f7017j.mo19278a(this.f7010c, this.f7000a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8654a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3) {
        if (view != null) {
            if (view.getId() == C2984t.m8432e(this, "tt_rb_score")) {
                m8658a("click_play_star_level", (JSONObject) null);
            } else if (view.getId() == C2984t.m8432e(this, "tt_comment_vertical") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_description")) {
                m8658a("click_play_star_nums", (JSONObject) null);
            } else if (view.getId() == C2984t.m8432e(this, "tt_reward_ad_appname")) {
                m8658a("click_play_source", (JSONObject) null);
            } else if (view.getId() == C2984t.m8432e(this, "tt_reward_ad_icon")) {
                m8658a("click_play_logo", (JSONObject) null);
            } else if (view.getId() == C2984t.m8432e(this, "tt_video_reward_bar") || view.getId() == C2984t.m8432e(this, "tt_click_lower_non_content_layout") || view.getId() == C2984t.m8432e(this, "tt_click_upper_non_content_layout")) {
                m8658a("click_start_play_bar", mo18457p());
            } else if (view.getId() == C2984t.m8432e(this, "tt_reward_ad_download")) {
                m8658a("click_start_play", mo18457p());
            } else if (view.getId() == C2984t.m8432e(this, "tt_video_reward_container")) {
                m8658a("click_video", mo18457p());
            } else if (view.getId() == C2984t.m8432e(this, "tt_reward_ad_download_backup") || view.getId() == C2984t.m8432e(this, "tt_reward_full_endcard_vast_image")) {
                m8658a("fallback_endcard_click", mo18457p());
            }
            m8665b(view, f, f2, f3, f4, sparseArray, i, i2, i3);
        }
    }

    /* renamed from: b */
    private void m8665b(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, int i, int i2, int i3) {
        HashMap hashMap;
        if (mo18458q() && this.f7010c != null && view != null) {
            if (view.getId() == C2984t.m8432e(this, "tt_rb_score") || view.getId() == C2984t.m8432e(this, "tt_comment_vertical") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_appname") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_icon") || view.getId() == C2984t.m8432e(this, "tt_video_reward_bar") || view.getId() == C2984t.m8432e(this, "tt_click_lower_non_content_layout") || view.getId() == C2984t.m8432e(this, "tt_click_upper_non_content_layout") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_download") || view.getId() == C2984t.m8432e(this, "tt_video_reward_container") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_download_backup") || view.getId() == C2984t.m8432e(this, "tt_reward_ad_description")) {
                if (!TextUtils.isEmpty(this.f6977D)) {
                    hashMap = new HashMap();
                    hashMap.put("rit_scene", this.f6977D);
                } else {
                    hashMap = null;
                }
                C3156e.m9177a(this.f7009b, "click_other", this.f7010c, new C3476g.C3478a().mo19532f(f).mo19530e(f2).mo19527d(f3).mo19524c(f4).mo19522b(System.currentTimeMillis()).mo19514a(0).mo19523b(C4020v.m13296a(this.f7016i.mo19329l())).mo19518a(C4020v.m13296a((View) null)).mo19526c(C4020v.m13309c(this.f7016i.mo19329l())).mo19529d(C4020v.m13309c((View) null)).mo19528d(i2).mo19531e(i3).mo19533f(i).mo19515a(sparseArray).mo19521b(C3524h.m10852d().mo19842b() ? 1 : 2).mo19525c(C4020v.m13319g(C3578m.m11231a())).mo19512a(C4020v.m13314e(C3578m.m11231a())).mo19520b(C4020v.m13317f(C3578m.m11231a())).mo19519a(), this.f7000a, true, (Map<String, Object>) hashMap, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public JSONObject mo18457p() {
        try {
            long p = this.f7020m.mo19085p();
            int q = this.f7020m.mo19086q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", p);
                jSONObject.put("percent", q);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8658a(String str, JSONObject jSONObject) {
        Context context = this.f7009b;
        C3498n nVar = this.f7010c;
        String str2 = this.f7000a;
        if (!mo18416H()) {
            jSONObject = null;
        }
        C3156e.m9173a(context, nVar, str2, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo18458q() {
        C3498n nVar = this.f7010c;
        if (nVar == null || nVar.mo19606I() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo18459r() {
        HashMap hashMap = new HashMap();
        if (C3501p.m10769i(this.f7010c)) {
            this.f7023p.mo19006a((Map<String, Object>) hashMap);
        }
        Context context = this.f7009b;
        C3498n nVar = this.f7010c;
        String str = this.f7000a;
        if (mo18416H()) {
            hashMap = null;
        }
        C3156e.m9194b(context, nVar, str, "click_close", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo18460s() {
        this.f7027t = C4014u.m13223f(this.f7010c);
        this.f7025r = C3578m.m11241h().mo19929b(this.f7027t);
        this.f6997X = this.f7010c.mo19670an();
        if (26 != Build.VERSION.SDK_INT) {
            this.f6998Y = this.f7010c.mo19669am();
        } else if (this.f7009b.getResources().getConfiguration().orientation == 1) {
            this.f6998Y = 1;
        } else {
            this.f6998Y = 2;
        }
        if (this.f6998Y == 2 || !C4020v.m13308c((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo18461t() {
        C3498n nVar = this.f7010c;
        if (nVar == null) {
            finish();
            return;
        }
        setContentView(this.f7016i.mo19305a(nVar));
        this.f7007ag = C3485l.m10543d(this.f7010c);
        mo18462u();
        this.f7016i.mo19311a(this.f7010c, this.f7000a, this.f6998Y, mo18416H(), this.f7018k);
        this.f7017j.mo19275a();
        if (!this.f7010c.mo19679aw()) {
            if (this.f7007ag) {
                m8643Q();
            }
            this.f7022o.mo19103a(this.f7010c, this.f7000a, this.f6998Y, mo18416H());
            this.f7022o.mo19111b(this.f6999Z, this.f7001aa);
        }
        this.f7023p.mo19003a(this.f7022o, this.f7010c, this.f7000a, this.f6998Y);
    }

    /* renamed from: Q */
    private void m8643Q() {
        LinearLayout linearLayout = (LinearLayout) findViewById(C2984t.m8432e(this.f7009b, "tt_lp_new_style_container"));
        this.f7006af = linearLayout;
        C4020v.m13282a((View) linearLayout, 8);
        C3227c cVar = new C3227c(this, this.f7010c, "landingpage_endcard");
        this.f7005ae = cVar;
        cVar.mo18882c().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTBaseVideoActivity.this.f7016i.mo19328k().performClick();
            }
        });
        this.f7006af.addView(this.f7005ae.mo18884e(), new LinearLayout.LayoutParams(-1, -1));
        this.f7022o.mo19102a(this.f7005ae);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo18462u() {
        float f;
        float f2;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    m8644R();
                } catch (Throwable unused) {
                }
            } else {
                m8644R();
            }
        }
        float U = m8647U();
        float T = m8646T();
        if (this.f6998Y == 2) {
            f = Math.max(U, T);
            f2 = Math.min(U, T);
        } else {
            f = Math.min(U, T);
            f2 = Math.max(U, T);
        }
        Context context = this.f7009b;
        int d = C4020v.m13311d(context, C4020v.m13322j(context));
        if (this.f6998Y != 2) {
            if (C4020v.m13308c((Activity) this)) {
                f2 -= (float) d;
            }
        } else if (C4020v.m13308c((Activity) this)) {
            f -= (float) d;
        }
        if (mo18416H()) {
            this.f6999Z = (int) f;
            this.f7001aa = (int) f2;
            return;
        }
        int i3 = 20;
        int i4 = 0;
        if (this.f6998Y != 2) {
            float f3 = this.f6997X;
            if (!(f3 == 0.0f || f3 == 100.0f)) {
                float f4 = (float) 20;
                i = (int) Math.max((f2 - (((f - f4) - f4) / f3)) / 2.0f, 0.0f);
                i4 = i;
                i2 = 20;
                float f5 = (float) i3;
                float f6 = (float) i2;
                this.f6999Z = (int) ((f - f5) - f6);
                float f7 = (float) i4;
                float f8 = (float) i;
                this.f7001aa = (int) ((f2 - f7) - f8);
                getWindow().getDecorView().setPadding(C4020v.m13315e(this, f5), C4020v.m13315e(this, f7), C4020v.m13315e(this, f6), C4020v.m13315e(this, f8));
            }
        } else {
            float f9 = this.f6997X;
            if (!(f9 == 0.0f || f9 == 100.0f)) {
                float f10 = (float) 20;
                i2 = (int) Math.max((f - (((f2 - f10) - f10) * f9)) / 2.0f, 0.0f);
                i = 20;
                i4 = 20;
                i3 = i2;
                float f52 = (float) i3;
                float f62 = (float) i2;
                this.f6999Z = (int) ((f - f52) - f62);
                float f72 = (float) i4;
                float f82 = (float) i;
                this.f7001aa = (int) ((f2 - f72) - f82);
                getWindow().getDecorView().setPadding(C4020v.m13315e(this, f52), C4020v.m13315e(this, f72), C4020v.m13315e(this, f62), C4020v.m13315e(this, f82));
            }
        }
        i2 = 0;
        i = 0;
        i3 = 0;
        float f522 = (float) i3;
        float f622 = (float) i2;
        this.f6999Z = (int) ((f - f522) - f622);
        float f722 = (float) i4;
        float f822 = (float) i;
        this.f7001aa = (int) ((f2 - f722) - f822);
        getWindow().getDecorView().setPadding(C4020v.m13315e(this, f522), C4020v.m13315e(this, f722), C4020v.m13315e(this, f622), C4020v.m13315e(this, f822));
    }

    /* renamed from: R */
    private void m8644R() {
        if (this.f6998Y != 2) {
            setRequestedOrientation(1);
        } else if (mo18463v()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo18463v() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: S */
    private void m8645S() {
        try {
            final boolean z = true;
            final boolean z2 = this.f7002ab && C3578m.m11241h().mo19971u() == 1;
            if (!this.f7002ab || !C4020v.m13308c((Activity) this) || Build.VERSION.SDK_INT < 19) {
                z = false;
            }
            if (z || z2) {
                this.f7024q.post(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.f6998Y     // Catch:{ all -> 0x00d7 }
                            r1 = 2
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.orientation     // Catch:{ all -> 0x00d7 }
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f7009b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.C4020v.m13321i(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                            goto L_0x004e
                        L_0x0033:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f7009b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.C4020v.m13320h(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                        L_0x004e:
                            if (r0 != 0) goto L_0x00d7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r2 = r0.getPaddingLeft()     // Catch:{ all -> 0x00d7 }
                            int r3 = r0.getPaddingTop()     // Catch:{ all -> 0x00d7 }
                            int r4 = r0.getPaddingRight()     // Catch:{ all -> 0x00d7 }
                            int r5 = r0.getPaddingBottom()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f6998Y     // Catch:{ all -> 0x00d7 }
                            r7 = 1
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f7009b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C4020v.m13322j(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x0089:
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r3 = r3 + r1
                            goto L_0x00bd
                        L_0x008c:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.f6998Y     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            boolean r1 = r1     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f7009b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C4020v.m13322j(r1)     // Catch:{ all -> 0x00d7 }
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 + r1
                        L_0x00b0:
                            boolean r1 = r0     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f7009b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.C4020v.m13322j(r1)     // Catch:{ all -> 0x00d7 }
                            goto L_0x0089
                        L_0x00bd:
                            boolean r1 = r0.isAttachedToWindow()     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00c6
                            r0.setPadding(r2, r3, r4, r5)     // Catch:{ all -> 0x00d7 }
                        L_0x00c6:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            float r1 = r1.f6997X     // Catch:{ all -> 0x00d7 }
                            r2 = 1120403456(0x42c80000, float:100.0)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 != 0) goto L_0x00d7
                            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x00d7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.C30432.run():void");
                    }
                });
            }
            this.f7002ab = false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f7022o.mo19135w();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f6981H = true;
        C2975l.m8384b("TTBaseVideoActivity", "onResume mIsActivityShow=" + this.f6981H + " mIsMute=" + this.f7025r);
        m8645S();
        if (m8651Y()) {
            m8650X();
        }
        if (C3501p.m10761a(this.f7010c)) {
            if (this.f6983J == 0) {
                this.f7025r = true;
            }
            if (this.f7025r) {
                this.f6978E.mo20620a(true);
                this.f7018k.mo19032b(true);
            }
        }
        if (Build.VERSION.SDK_INT > 28 || Build.VERSION.SDK_INT < 24) {
            super.onResume();
        } else {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                C2975l.m8388c("TTBaseVideoActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, true);
                } catch (Exception e2) {
                    C2975l.m8388c("TTBaseVideoActivity", "onResume set mCalled fail", e2);
                }
            }
        }
        C3389d dVar = this.f7016i;
        if (dVar != null) {
            dVar.mo19332o();
        }
        this.f7022o.mo19125m();
        C3809g gVar = this.f6978E;
        if (gVar != null) {
            gVar.mo20619a((C3808f) this);
            this.f6978E.mo20626e();
        }
        if (m8663ab()) {
            m8648V();
            this.f7020m.mo19066a(false, this, this.f7008ah != 0);
        }
        this.f7008ah++;
        if (this.f7023p.mo19020i() && C3501p.m10769i(this.f7010c)) {
            this.f7023p.mo19005a("return_foreground");
            C3742a aVar = this.f6975B;
            if ((aVar == null || !aVar.isShowing()) && this.f7023p.mo19022k() > 0) {
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.UNDEFINED_ERROR;
                obtain.arg1 = this.f7023p.mo19022k();
                this.f7024q.sendMessage(obtain);
            }
        }
        mo18409A();
        C3387b bVar = this.f7019l;
        if (bVar != null) {
            bVar.mo19298g();
        }
        m8641O();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3389d dVar = this.f7016i;
        if (dVar != null) {
            dVar.mo19334q();
        }
        this.f6981H = false;
        C2975l.m8384b("TTBaseVideoActivity", "onPause mIsActivityShow=" + this.f6981H + " mIsMute=" + this.f7025r);
        if (!this.f7032y.get()) {
            this.f7020m.mo19078i();
        }
        m8649W();
        if (C3501p.m10769i(this.f7010c)) {
            this.f7024q.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f7024q.removeMessages(600);
            this.f7023p.mo19005a("go_background");
        }
        this.f7022o.mo19124l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3389d dVar = this.f7016i;
        if (dVar != null) {
            dVar.mo19333p();
        }
        C2975l.m8384b("TTBaseVideoActivity", "onStop mIsMute=" + this.f7025r + " mLast=" + this.f6978E.mo20622b() + " mVolume=" + this.f6983J);
        this.f7022o.mo19123k();
        if (C3501p.m10769i(this.f7010c)) {
            this.f7024q.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f7024q.removeMessages(600);
            this.f7023p.mo19005a("go_background");
        }
        if (this.f7025r) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f6978E.mo20622b() > 0) {
                        TTBaseVideoActivity.this.f6978E.mo20620a(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f6993T > 0 && this.f6994U.get()) {
            C3156e.m9189a((System.currentTimeMillis() - this.f6993T) + "", this.f7010c, this.f7000a, this.f7020m.mo19055a());
            this.f6993T = 0;
        }
        C3387b bVar = this.f7019l;
        if (bVar != null) {
            bVar.mo19297f();
        }
        C3389d dVar = this.f7016i;
        if (dVar != null) {
            dVar.mo19331n();
        }
        TTAdDislikeToast tTAdDislikeToast = this.f7013f;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.mo18876b();
        }
        this.f7024q.removeCallbacksAndMessages((Object) null);
        C3300f fVar = this.f7022o;
        if (!(fVar == null || fVar.mo19113c() == null)) {
            C3768z.m12384a(this.f7009b, this.f7022o.mo19113c().getWebView());
            C3768z.m12385a(this.f7022o.mo19113c().getWebView());
        }
        this.f7020m.mo19072c(mo18416H());
        C3322a aVar = this.f6985L;
        if (aVar != null && !aVar.mo19175b() && !this.f7029v.get()) {
            this.f7022o.mo19129q();
        }
        C3300f fVar2 = this.f7022o;
        if (fVar2 != null) {
            fVar2.mo19121i();
        }
        C3809g gVar = this.f6978E;
        if (gVar != null) {
            gVar.mo20627f();
            this.f6978E.mo20619a((C3808f) null);
        }
        this.f7023p.mo19001a(getApplicationContext());
        this.f7016i.mo19330m();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f7010c != null ? this.f7010c.mo19674ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f7011d);
            bundle.putString("video_cache_url", this.f7020m.mo19095z());
            bundle.putLong("video_current", this.f7020m.mo19088s());
            bundle.putBoolean("is_mute", this.f7025r);
            bundle.putString("rit_scene", this.f6977D);
            bundle.putBoolean("has_show_skip_btn", this.f7030w.get());
            bundle.putString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, this.f6992S == null ? "" : String.valueOf(this.f6992S));
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onBackPressed() {
        int i;
        C3290c cVar;
        C3287b bVar;
        if (C3578m.m11241h().mo19946h(this.f7027t) == 1) {
            if (mo18416H()) {
                if (C3501p.m10769i(this.f7010c)) {
                    i = C3578m.m11241h().mo19924a(String.valueOf(this.f7027t), true);
                } else {
                    i = C3578m.m11241h().mo19940f(this.f7027t);
                }
            } else if (C3501p.m10769i(this.f7010c)) {
                i = C3578m.m11241h().mo19924a(String.valueOf(this.f7027t), false);
            } else {
                i = C3578m.m11241h().mo19937e(this.f7027t);
            }
            C3389d dVar = this.f7016i;
            if (dVar != null && dVar.mo19327j()) {
                C3389d dVar2 = this.f7016i;
                if (dVar2 != null) {
                    dVar2.mo19328k().performClick();
                }
            } else if ((!this.f7029v.get() || C3501p.m10769i(this.f7010c)) && i != -1) {
                C3299e eVar = this.f7020m;
                if (((eVar != null && eVar.mo19075f() >= ((long) (i * 1000))) || ((bVar = this.f7023p) != null && bVar.mo19021j() - this.f7023p.mo19022k() >= i)) && (cVar = this.f7018k) != null) {
                    cVar.mo19030b();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4020v.m13277a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTBaseVideoActivity.this.isFinishing()) {
                            TTBaseVideoActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C4020v.m13277a((Activity) TTBaseVideoActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        int i = message.what;
        if (i == 300) {
            mo18464w();
            C3299e eVar = this.f7020m;
            eVar.mo19056a(eVar.mo19051B() ^ true ? 1 : 0, this.f7020m.mo19051B() ^ true ? 1 : 0);
            if (this.f7010c.mo19680ax() != null && this.f7010c.mo19680ax().mo19977a() != null) {
                this.f7010c.mo19680ax().mo19977a().mo20039a(C3540a.GENERAL_LINEAR_AD_ERROR);
            }
        } else if (i == 400) {
            this.f7020m.mo19082m();
            mo18424a(false, true);
        } else if (i == 500) {
            if (!C3501p.m10761a(this.f7010c)) {
                this.f7018k.mo19035c(false);
            }
            SSWebView c = this.f7022o.mo19113c();
            if (!(c == null || c.getWebView() == null)) {
                c.mo17949i();
                c.getWebView().resumeTimers();
            }
            if (this.f7022o.mo19113c() != null) {
                this.f7022o.mo19097a(1.0f);
                this.f7016i.mo19306a(1.0f);
            }
            if (!mo18416H() && this.f7020m.mo19070b() && this.f7031x.get()) {
                this.f7020m.mo19081l();
            }
        } else if (i == 600) {
            mo18444m();
        } else if (i == 800) {
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            if (this.f7010c.mo19607J() != null) {
                hashMap.put("playable_url", this.f7010c.mo19607J().mo16362j());
            }
            C3156e.m9202e((Context) this, this.f7010c, this.f7000a, "remove_loading_page", (Map<String, Object>) hashMap);
            this.f7024q.removeMessages(800);
            this.f7023p.mo19018g();
        } else if (i == 900 && C3501p.m10769i(this.f7010c)) {
            int i2 = message.arg1;
            if (i2 > 0) {
                this.f7018k.mo19037d(true);
                int b = this.f7023p.mo19009b(i2);
                if (b == i2) {
                    this.f7018k.mo19027a(String.valueOf(i2), (CharSequence) null);
                } else if (b > 0) {
                    this.f7018k.mo19027a(String.valueOf(i2), (CharSequence) String.format(C2984t.m8425a(this.f7009b, "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(b)}));
                } else {
                    this.f7018k.mo19027a(String.valueOf(i2), (CharSequence) C2984t.m8425a(this.f7009b, "tt_txt_skip"));
                    this.f7018k.mo19038e(true);
                }
                Message obtain = Message.obtain();
                obtain.what = ErrorCode.UNDEFINED_ERROR;
                obtain.arg1 = i2 - 1;
                this.f7024q.sendMessageDelayed(obtain, 1000);
                this.f7023p.mo19013c(i2);
            } else {
                this.f7018k.mo19037d(false);
                this.f6987N.set(true);
                mo18444m();
                mo18519f(mo18416H() ? 10001 : 10002);
            }
            mo18467z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo18464w() {
        this.f7020m.mo19089t();
        this.f7020m.mo19082m();
        mo18424a(false, true);
        if (mo18416H()) {
            mo18519f(10000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18465x() {
        C2989x xVar = this.f7024q;
        if (xVar != null) {
            xVar.removeMessages(ErrorCode.UNDEFINED_ERROR);
            this.f7024q.removeMessages(600);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18466y() {
        Message obtain = Message.obtain();
        obtain.what = ErrorCode.UNDEFINED_ERROR;
        obtain.arg1 = this.f7023p.mo19022k();
        this.f7024q.sendMessageDelayed(obtain, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo18418a(int i) {
        if (this.f6976C == null) {
            this.f6976C = C3922a.asInterface(C3917a.m12866a(C3578m.m11231a()).mo20811a(i));
        }
        return this.f6976C;
    }

    /* renamed from: b */
    public void mo18428b(int i) {
        if (i > 0) {
            if (this.f6983J > 0) {
                this.f6983J = i;
            } else {
                C2975l.m8384b("onVolumeChanged", "onVolumeChanged >>>> 变为非静音状态通知 h5");
                this.f7022o.mo19116d(false);
                this.f6983J = i;
                C3498n nVar = this.f7010c;
                if (!(nVar == null || nVar.mo19680ax() == null || this.f7010c.mo19680ax().mo19977a() == null || this.f7020m == null)) {
                    this.f7010c.mo19680ax().mo19977a().mo20060i(this.f7020m.mo19088s());
                }
            }
        } else if (this.f6983J > 0) {
            C2975l.m8384b("onVolumeChanged", "onVolumeChanged >>>> 变为静音状态通知 h5");
            this.f7022o.mo19116d(true);
            this.f6983J = i;
            C3498n nVar2 = this.f7010c;
            if (!(nVar2 == null || nVar2.mo19680ax() == null || this.f7010c.mo19680ax().mo19977a() == null || this.f7020m == null)) {
                this.f7010c.mo19680ax().mo19977a().mo20058h(this.f7020m.mo19088s());
            }
        } else {
            this.f6983J = i;
        }
        if (C3501p.m10770j(this.f7010c) && !this.f7029v.get()) {
            return;
        }
        if (!C3501p.m10769i(this.f7010c) && !C3501p.m10770j(this.f7010c)) {
            return;
        }
        if (this.f6978E.mo20624c()) {
            C2975l.m8384b("TTBaseVideoActivity", "onVolumeChanged by SDK mIsMute=" + this.f7025r + " mVolume=" + this.f6983J + " mLastVolume=" + this.f6978E.mo20622b());
            if (this.f6983J == 0) {
                this.f7018k.mo19032b(true);
                this.f7020m.mo19069b(true);
                return;
            }
            this.f7018k.mo19032b(false);
            this.f7020m.mo19069b(false);
            return;
        }
        this.f6978E.mo20623b(-1);
        C2975l.m8384b("TTBaseVideoActivity", "onVolumeChanged by User mIsMute=" + this.f7025r + " mVolume=" + this.f6983J + " mLastVolume=" + this.f6978E.mo20622b());
        if (!this.f6981H) {
            return;
        }
        if (this.f6983J == 0) {
            this.f7025r = true;
            this.f7018k.mo19032b(true);
            this.f7020m.mo19069b(true);
            return;
        }
        this.f7025r = false;
        this.f7018k.mo19032b(false);
        this.f7020m.mo19069b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float[] mo18432c(int i) {
        float T = m8646T();
        float U = m8647U();
        if ((this.f6998Y == 1) != (T > U)) {
            float f = T + U;
            U = f - U;
            T = f - U;
        }
        if (this.f6998Y == 1) {
            T -= (float) i;
        } else {
            U -= (float) i;
        }
        return new float[]{U, T};
    }

    /* renamed from: T */
    private float m8646T() {
        return (float) C4020v.m13311d(this.f7009b, (float) C4020v.m13320h(this.f7009b));
    }

    /* renamed from: U */
    private float m8647U() {
        return (float) C4020v.m13311d(this.f7009b, (float) C4020v.m13321i(this.f7009b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo18409A() {
        if (mo18417I() && !this.f6995V) {
            this.f6995V = true;
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f7010c != null) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.m8659a(tTBaseVideoActivity.mo18410B());
                    }
                }
            });
        }
    }

    /* renamed from: B */
    public float[] mo18410B() {
        float[] fArr = {(float) (getWindow().getDecorView().getWidth() - (getWindow().getDecorView().getPaddingLeft() * 2)), (float) (getWindow().getDecorView().getHeight() - (getWindow().getDecorView().getPaddingTop() * 2))};
        fArr[0] = (float) C4020v.m13311d(this, fArr[0]);
        fArr[1] = (float) C4020v.m13311d(this, fArr[1]);
        if (fArr[0] >= 10.0f && fArr[1] >= 10.0f) {
            return fArr;
        }
        C2975l.m8384b("TTBaseVideoActivity", "get root view size error, so run backup");
        return mo18432c(this.f7028u);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8659a(float[] fArr) {
        C3387b bVar;
        this.f7019l.mo19288a(this.f7010c, new AdSlot.Builder().setCodeId(String.valueOf(C4014u.m13223f(this.f7010c))).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f7000a, this.f7025r);
        C3290c cVar = this.f7018k;
        if (!(cVar == null || (bVar = this.f7019l) == null)) {
            cVar.mo19025a((C2690c) bVar.mo19285a());
        }
        this.f7019l.mo19290a((C3617j) new C3617j() {
            /* renamed from: a */
            public void mo18495a(boolean z) {
                if (TTBaseVideoActivity.this.f7025r != z) {
                    TTBaseVideoActivity.this.f7018k.mo19033c();
                }
            }

            /* renamed from: a */
            public void mo18493a() {
                TTBaseVideoActivity.this.f7018k.mo19030b();
            }

            /* renamed from: b */
            public void mo18496b() {
                if (TTBaseVideoActivity.this.f7016i != null && TTBaseVideoActivity.this.f7016i.mo19328k() != null) {
                    TTBaseVideoActivity.this.f7016i.mo19328k().performClick();
                }
            }

            /* renamed from: a */
            public void mo18494a(int i) {
                boolean z = false;
                if (i != 1) {
                    if (i == 2) {
                        TTBaseVideoActivity.this.f7020m.mo19050A();
                        return;
                    } else if (i == 3) {
                        C3299e eVar = TTBaseVideoActivity.this.f7020m;
                        if (TTBaseVideoActivity.this.f7029v.get() || TTBaseVideoActivity.this.f7032y.get()) {
                            z = true;
                        }
                        eVar.mo19065a(z, (C3685b) TTBaseVideoActivity.this);
                        return;
                    } else if (i == 4) {
                        TTBaseVideoActivity.this.f7020m.mo19080k();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (!TTBaseVideoActivity.this.f7020m.mo19070b() && !TTBaseVideoActivity.this.f7020m.mo19073d()) {
                    TTBaseVideoActivity.this.mo18514a(0, false);
                }
            }

            /* renamed from: c */
            public long mo18498c() {
                return TTBaseVideoActivity.this.f7020m.mo19075f();
            }

            /* renamed from: d */
            public int mo18499d() {
                if (TTBaseVideoActivity.this.f7019l.mo19294c()) {
                    return 4;
                }
                if (TTBaseVideoActivity.this.f7019l.mo19295d()) {
                    return 5;
                }
                if (TTBaseVideoActivity.this.f7020m.mo19074e()) {
                    return 1;
                }
                if (TTBaseVideoActivity.this.f7020m.mo19070b()) {
                    return 2;
                }
                if (TTBaseVideoActivity.this.f7020m.mo19073d()) {
                }
                return 3;
            }

            /* renamed from: e */
            public void mo18500e() {
                TTBaseVideoActivity.this.mo18414F();
            }

            /* renamed from: b */
            public void mo18497b(int i) {
                TTBaseVideoActivity.this.f6988O = i;
            }
        });
        this.f7019l.mo19287a((TTNativeExpressAd.ExpressAdInteractionListener) new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdClicked(View view, int i) {
            }

            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
                TTBaseVideoActivity.this.f7022o.mo19107a(true);
                TTBaseVideoActivity.this.f7022o.mo19110b();
                C2975l.m8384b("TTBaseVideoActivity", "onRenderFail、、、code:" + i);
                TTBaseVideoActivity.this.f7019l.mo19296e().post(new Runnable() {
                    public void run() {
                        TTBaseVideoActivity.this.mo18423a(false);
                    }
                });
                TTBaseVideoActivity.this.m8664ac();
            }

            public void onRenderSuccess(View view, float f, float f2) {
                if (!C3501p.m10769i(TTBaseVideoActivity.this.f7010c)) {
                    if (TTBaseVideoActivity.this.f7019l.mo19299h()) {
                        TTBaseVideoActivity.this.mo18430b(true);
                    }
                    TTBaseVideoActivity.this.mo18434d(8);
                    TTBaseVideoActivity.this.f7022o.mo19107a(true);
                    TTBaseVideoActivity.this.f7022o.mo19110b();
                    if (TTBaseVideoActivity.this.f7019l.mo19299h()) {
                        TTBaseVideoActivity.this.f7019l.mo19292b().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        if (TTBaseVideoActivity.this.f6985L != null) {
                            TTBaseVideoActivity.this.f6985L.mo19171a(TTBaseVideoActivity.this.f7016i.mo19325h());
                        }
                    } else if (TTBaseVideoActivity.this.f7010c.mo19607J() != null && TTBaseVideoActivity.this.mo18576M()) {
                        TTBaseVideoActivity.this.f6986M = true;
                    }
                    TTBaseVideoActivity.this.m8642P();
                    TTBaseVideoActivity.this.m8664ac();
                }
            }
        });
        Context context = this.f7009b;
        C3498n nVar = this.f7010c;
        String str = this.f7000a;
        C303210 r5 = new C3611f(context, nVar, str, C4014u.m13176a(str)) {
            /* renamed from: a */
            public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
                super.mo18471a(view, f, f2, f3, f4, sparseArray, z);
                TTBaseVideoActivity.this.onRewardBarClick(view);
            }
        };
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f6977D)) {
            hashMap.put("rit_scene", this.f6977D);
        }
        if (C3501p.m10769i(this.f7010c)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        r5.mo19404a((Map<String, Object>) hashMap);
        Context context2 = this.f7009b;
        C3498n nVar2 = this.f7010c;
        String str2 = this.f7000a;
        C303311 r7 = new C3610e(context2, nVar2, str2, C4014u.m13176a(str2)) {
            /* renamed from: a */
            public void mo18471a(View view, float f, float f2, float f3, float f4, SparseArray<C3429c.C3430a> sparseArray, boolean z) {
                super.mo18471a(view, f, f2, f3, f4, sparseArray, z);
                if (mo19406a(view, z)) {
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.f6977D)) {
            hashMap2.put("rit_scene", this.f6977D);
        }
        if (C3501p.m10769i(this.f7010c)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        r7.mo19404a((Map<String, Object>) hashMap2);
        this.f7019l.mo19289a(r5, r7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f7016i.mo19325h().addView(this.f7019l.mo19285a(), layoutParams);
        if (!this.f7019l.mo19299h()) {
            mo18430b(false);
        }
        this.f7019l.mo19302k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18430b(boolean z) {
        if (!this.f7029v.get()) {
            if (!z) {
                this.f7018k.mo19035c(false);
                this.f7018k.mo19028a(false);
                this.f7018k.mo19037d(false);
                this.f7016i.mo19321d(8);
            } else {
                this.f7018k.mo19028a(this.f7010c.mo19672ap());
                if (C3501p.m10769i(this.f7010c) || mo18576M()) {
                    this.f7018k.mo19035c(true);
                }
                if (mo18576M() || ((this.f6985L instanceof C3324b) && mo18417I())) {
                    this.f7018k.mo19037d(true);
                } else {
                    this.f7018k.mo19036d();
                    this.f7016i.mo19321d(0);
                }
            }
            if (!z) {
                this.f7016i.mo19307a(4);
                this.f7016i.mo19316b(8);
            } else if (mo18416H() || (this.f6997X == FullRewardExpressView.f8113c && mo18576M())) {
                this.f7016i.mo19307a(0);
                this.f7016i.mo19316b(0);
            } else {
                this.f7016i.mo19307a(8);
                this.f7016i.mo19316b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo18411C() {
        Message message = new Message();
        message.what = 400;
        if (mo18416H()) {
            mo18519f(10000);
        }
        C2989x xVar = this.f7024q;
        if (xVar != null) {
            xVar.sendMessageDelayed(message, 2000);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo18412D() {
        this.f7024q.removeMessages(400);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m8648V() {
        if (!this.f7029v.get() && this.f6981H && !C3501p.m10769i(this.f7010c)) {
            if ((C3498n.m10583c(this.f7010c) || C3578m.m11241h().mo19953j(String.valueOf(this.f7027t)) != 1 || !this.f7019l.mo19295d()) && !C3485l.m10541c(this.f7010c)) {
                C3322a aVar = this.f6985L;
                if (aVar == null || aVar.mo19176c()) {
                    this.f7024q.removeMessages(300);
                    Message obtain = Message.obtain();
                    obtain.what = 300;
                    this.f7024q.sendMessageDelayed(obtain, 5000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m8649W() {
        this.f7024q.removeMessages(300);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18434d(int i) {
        if (this.f6982I == null) {
            this.f6982I = new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.f6982I.setLayoutParams(layoutParams);
            this.f6982I.setIndeterminateDrawable(getResources().getDrawable(C2984t.m8431d(this, "tt_video_loading_progress_bar")));
            this.f7016i.mo19325h().addView(this.f6982I);
        }
        this.f6982I.setVisibility(i);
    }

    /* renamed from: X */
    private void m8650X() {
        this.f7018k.mo19028a(this.f7010c.mo19672ap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo18413E() {
        if (this.f7012e == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f7010c);
            this.f7012e = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C3222a() {
                /* renamed from: c */
                public void mo18407c(View view) {
                }

                /* renamed from: a */
                public void mo18405a(View view) {
                    TTBaseVideoActivity.this.f7032y.set(true);
                    TTBaseVideoActivity.this.m8649W();
                    if (TTBaseVideoActivity.this.f7020m.mo19070b()) {
                        TTBaseVideoActivity.this.f7020m.mo19084o();
                    }
                }

                /* renamed from: b */
                public void mo18406b(View view) {
                    TTBaseVideoActivity.this.f7032y.set(false);
                    TTBaseVideoActivity.this.m8648V();
                    if (TTBaseVideoActivity.this.f7020m.mo19073d()) {
                        TTBaseVideoActivity.this.f7020m.mo19083n();
                    }
                }

                /* renamed from: a */
                public void mo18404a(int i, FilterWord filterWord) {
                    if (!TTBaseVideoActivity.this.f7033z.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTBaseVideoActivity.this.f7033z.set(true);
                        TTBaseVideoActivity.this.m8662aa();
                    }
                }
            });
            ((FrameLayout) findViewById(16908290)).addView(this.f7012e);
        }
        if (this.f7013f == null) {
            this.f7013f = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f7013f);
        }
    }

    /* renamed from: Y */
    private boolean m8651Y() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f7029v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo18414F() {
        if (!isFinishing()) {
            if (this.f7033z.get()) {
                m8652Z();
                return;
            }
            if (this.f7012e == null) {
                mo18413E();
            }
            this.f7012e.mo18867a();
        }
    }

    /* renamed from: Z */
    private void m8652Z() {
        this.f7013f.mo18875a(C3537f.f8809d);
    }

    /* access modifiers changed from: private */
    /* renamed from: aa */
    public void m8662aa() {
        this.f7013f.mo18875a(C3537f.f8810e);
    }

    /* renamed from: ab */
    private boolean m8663ab() {
        if (C3485l.m10539b(this.f7010c) && this.f6987N.get()) {
            C3389d dVar = this.f7016i;
            if (dVar != null) {
                dVar.mo19325h().setVisibility(4);
                this.f7016i.mo19325h().setVisibility(0);
            }
            return false;
        } else if (this.f7029v.get() || this.f7032y.get() || C3501p.m10769i(this.f7010c)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18420a(Intent intent) {
        if (intent != null) {
            this.f7016i.mo19317b(intent.getBooleanExtra("show_download_bar", true));
            this.f6977D = intent.getStringExtra("rit_scene");
            this.f7020m.mo19061a(intent.getStringExtra("video_cache_url"));
            this.f7011d = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f6992S = Double.valueOf(Double.parseDouble(stringExtra));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18421a(Bundle bundle) {
        if (bundle != null) {
            this.f7011d = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
            this.f7020m.mo19061a(bundle.getString("video_cache_url"));
            this.f7025r = bundle.getBoolean("is_mute");
            this.f6977D = bundle.getString("rit_scene");
            try {
                String string = bundle.getString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(string)) {
                    this.f6992S = Double.valueOf(Double.parseDouble(string));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ac */
    public void m8664ac() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f7009b, C2984t.m8439l(this.f7009b, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        TTBaseVideoActivity.this.f7016i.mo19330m();
                    }
                });
                this.f7016i.mo19309a(loadAnimation);
                return;
            }
            this.f7016i.mo19330m();
        } catch (Throwable unused) {
            this.f7016i.mo19330m();
        }
    }

    public void finish() {
        super.finish();
        if (C4003m.m13129e()) {
            C4020v.m13300b((Activity) this);
        }
    }
}
