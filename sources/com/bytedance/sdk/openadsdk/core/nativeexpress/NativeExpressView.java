package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C2690c;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2700f;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2705h;
import com.bytedance.sdk.component.adexpress.p095b.C2620b;
import com.bytedance.sdk.component.adexpress.p095b.C2622c;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2624e;
import com.bytedance.sdk.component.adexpress.p095b.C2627g;
import com.bytedance.sdk.component.adexpress.p095b.C2628h;
import com.bytedance.sdk.component.adexpress.p095b.C2629i;
import com.bytedance.sdk.component.adexpress.p095b.C2632k;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p095b.C2636n;
import com.bytedance.sdk.component.adexpress.p095b.C2637o;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3728w;
import com.bytedance.sdk.openadsdk.core.C3765x;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3445a;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p161a.C3594a;
import com.bytedance.sdk.openadsdk.core.p146b.C3429c;
import com.bytedance.sdk.openadsdk.core.p147c.C3456a;
import com.bytedance.sdk.openadsdk.core.p147c.p149b.C3459a;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3778b;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.C3185u;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class NativeExpressView extends FrameLayout implements C2627g, C2636n, C2690c, C3617j {

    /* renamed from: p */
    public static int f9047p = 500;

    /* renamed from: A */
    private C3185u f9048A;

    /* renamed from: B */
    private String f9049B;

    /* renamed from: C */
    private C3445a.C3452a f9050C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public AtomicBoolean f9051D = new AtomicBoolean(false);

    /* renamed from: E */
    private C3595b f9052E;

    /* renamed from: F */
    private final ViewTreeObserver.OnScrollChangedListener f9053F = new ViewTreeObserver.OnScrollChangedListener() {
        public void onScrollChanged() {
            NativeExpressView.this.m11311s();
            NativeExpressView nativeExpressView = NativeExpressView.this;
            nativeExpressView.removeCallbacks(nativeExpressView.f9054G);
            NativeExpressView nativeExpressView2 = NativeExpressView.this;
            nativeExpressView2.postDelayed(nativeExpressView2.f9054G, 500);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Runnable f9054G = new Runnable() {
        public void run() {
            if (C3765x.m12370a(NativeExpressView.this, 0, 5)) {
                NativeExpressView nativeExpressView = NativeExpressView.this;
                nativeExpressView.mo20113d(nativeExpressView.getVisibility());
                return;
            }
            NativeExpressView.this.mo20113d(8);
        }
    };

    /* renamed from: H */
    private final Runnable f9055H = new Runnable() {
        public void run() {
            NativeExpressView.this.mo20113d(0);
        }
    };

    /* renamed from: I */
    private final Runnable f9056I = new Runnable() {
        public void run() {
            NativeExpressView.this.mo20113d(8);
        }
    };

    /* renamed from: J */
    private ThemeStatusBroadcastReceiver f9057J;

    /* renamed from: K */
    private C3624o f9058K;

    /* renamed from: L */
    private C2629i.C2630a f9059L;

    /* renamed from: M */
    private List<C2629i> f9060M;

    /* renamed from: N */
    private C2637o f9061N;

    /* renamed from: O */
    private C2624e f9062O;

    /* renamed from: P */
    private C2628h f9063P;

    /* renamed from: Q */
    private C2633l f9064Q;

    /* renamed from: R */
    private SparseArray<C3429c.C3430a> f9065R = new SparseArray<>();

    /* renamed from: S */
    private float f9066S = -1.0f;

    /* renamed from: T */
    private float f9067T = -1.0f;

    /* renamed from: U */
    private float f9068U = -1.0f;

    /* renamed from: V */
    private float f9069V = -1.0f;

    /* renamed from: W */
    private long f9070W = 0;

    /* renamed from: a */
    private boolean f9071a = true;

    /* renamed from: b */
    private int f9072b = 0;

    /* renamed from: c */
    private C3778b f9073c;

    /* renamed from: d */
    private TTDislikeDialogAbstract f9074d;

    /* renamed from: e */
    private TTNativeExpressAd.ExpressAdInteractionListener f9075e;

    /* renamed from: f */
    protected final Context f9076f;

    /* renamed from: g */
    protected String f9077g = "embeded_ad";

    /* renamed from: h */
    protected AdSlot f9078h;
    /* access modifiers changed from: protected */

    /* renamed from: i */
    public C3498n f9079i;

    /* renamed from: j */
    protected TTNativeExpressAd.ExpressVideoAdListener f9080j;

    /* renamed from: k */
    protected FrameLayout f9081k;

    /* renamed from: l */
    protected boolean f9082l;

    /* renamed from: m */
    protected boolean f9083m = false;

    /* renamed from: n */
    protected C2622c f9084n;

    /* renamed from: o */
    protected boolean f9085o = false;

    /* renamed from: q */
    public boolean f9086q = false;

    /* renamed from: r */
    public C3167j f9087r = new C3167j();

    /* renamed from: s */
    protected C2620b f9088s;

    /* renamed from: t */
    public C2623d<? extends View> f9089t;

    /* renamed from: u */
    private C3610e f9090u;

    /* renamed from: v */
    private C3611f f9091v;

    /* renamed from: w */
    private final AtomicBoolean f9092w = new AtomicBoolean(false);

    /* renamed from: x */
    private String f9093x = null;

    /* renamed from: y */
    private float f9094y;

    /* renamed from: z */
    private float f9095z;

    /* renamed from: a */
    public void mo18493a() {
    }

    /* renamed from: a */
    public void mo18494a(int i) {
    }

    /* renamed from: a */
    public void mo18495a(boolean z) {
    }

    /* renamed from: b */
    public void mo18496b() {
    }

    /* renamed from: b */
    public void mo18497b(int i) {
    }

    /* renamed from: c */
    public long mo18498c() {
        return 0;
    }

    /* renamed from: d */
    public int mo18499d() {
        return 0;
    }

    /* renamed from: e */
    public void mo18500e() {
    }

    /* renamed from: f */
    public void mo17176f() {
    }

    public void setTimeUpdate(int i) {
    }

    public C3167j getAdShowTime() {
        return this.f9087r;
    }

    public void setClosedListenerKey(String str) {
        this.f9049B = str;
        C3595b bVar = this.f9052E;
        if (bVar != null) {
            bVar.mo20155a(str);
        }
    }

    public String getClosedListenerKey() {
        return this.f9049B;
    }

    public void setBannerClickClosedListener(C3445a.C3452a aVar) {
        this.f9050C = aVar;
    }

    public NativeExpressView(Context context, C3498n nVar, AdSlot adSlot, String str) {
        super(context);
        this.f9077g = str;
        this.f9076f = context;
        this.f9079i = nVar;
        this.f9078h = adSlot;
        this.f9086q = false;
        mo19268g();
    }

    public NativeExpressView(Context context, C3498n nVar, AdSlot adSlot, String str, boolean z) {
        super(context);
        this.f9077g = str;
        this.f9076f = context;
        this.f9079i = nVar;
        this.f9078h = adSlot;
        this.f9086q = z;
        mo19268g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19268g() {
        this.f9057J = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f9078h;
        if (adSlot != null) {
            this.f9094y = adSlot.getExpressViewAcceptedWidth();
            this.f9095z = this.f9078h.getExpressViewAcceptedHeight();
            this.f9093x = this.f9078h.getCodeId();
        }
        setBackgroundColor(0);
        if (this.f9079i.mo19681ay()) {
            this.f9052E = new C3595b(this.f9076f, this, this.f9079i);
            return;
        }
        mo20109h();
        this.f9060M = new ArrayList();
        m11307o();
        C2637o oVar = this.f9061N;
        if (oVar != null) {
            this.f9058K = (C3624o) oVar.mo16810d();
        }
    }

    public SSWebView getWebView() {
        C3624o oVar = this.f9058K;
        if (oVar == null) {
            return null;
        }
        return oVar.mo16813a();
    }

    /* renamed from: h */
    private void mo20109h() {
        long j;
        JSONObject a = C3594a.m11340a(this.f9094y, this.f9095z, this.f9083m, this.f9079i);
        boolean z = true;
        this.f9048A = new C3185u(1, this.f9077g, this.f9079i);
        this.f9063P = new C3614i(this.f9048A, this.f9077g, this.f9079i, this.f9093x);
        boolean z2 = false;
        try {
            j = new JSONObject(this.f9079i.mo19604G().mo19772g()).optLong("render_delay_time");
            try {
                if (C3498n.m10583c(this.f9079i) || C3578m.m11241h().mo19953j(this.f9093x) != 1) {
                    z = false;
                }
                z2 = z;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        this.f9064Q = new C2633l.C2634a().mo16770a(this.f9077g).mo16776b(this.f9079i.mo19622Y()).mo16779c(C4014u.m13239i(this.f9079i)).mo16780d(this.f9079i.mo19659ac()).mo16772a(a).mo16769a(this.f9063P).mo16767a(C3578m.m11241h().mo19959m()).mo16773a(this.f9079i.mo19672ap()).mo16775b(this.f9079i.mo19746t()).mo16768a(Math.min(Math.max(j, 0), 10000)).mo16778c(this.f9079i.mo19609L()).mo16771a(C3594a.m11344b(this.f9079i)).mo16777b(z2).mo16774a();
    }

    /* renamed from: o */
    private void m11307o() {
        if (m11315w()) {
            m11308p();
            return;
        }
        try {
            m11309q();
            this.f9058K = new C3624o(this.f9076f, this.f9064Q, this.f9057J, this.f9048A, this.f9079i);
            C2637o oVar = new C2637o(this.f9076f, this.f9064Q, this.f9058K, this);
            this.f9061N = oVar;
            this.f9060M.add(oVar);
        } catch (Exception e) {
            C2975l.m8388c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        C2624e eVar = new C2624e(this.f9076f, this.f9064Q, new C3619l(this, this.f9057J, this.f9064Q));
        this.f9062O = eVar;
        this.f9060M.add(eVar);
        this.f9059L = new C2632k(this.f9060M, this.f9063P);
    }

    /* renamed from: p */
    private void m11308p() {
        this.f9072b = this.f9079i.mo19739q();
        try {
            m11309q();
            m11310r();
        } catch (Exception e) {
            C2975l.m8388c("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = true;
        if (this.f9079i.mo19742r() != 1) {
            z = false;
        }
        this.f9071a = z;
        if (z) {
            C2624e eVar = new C2624e(this.f9076f, this.f9064Q, new C3619l(this, this.f9057J, this.f9064Q));
            this.f9062O = eVar;
            this.f9060M.add(eVar);
        }
        this.f9059L = new C2632k(this.f9060M, this.f9063P);
    }

    /* renamed from: q */
    private void m11309q() {
        if (!TTAdSdk.isInitSuccess()) {
            C3568k.m11189b();
        }
    }

    /* renamed from: r */
    private void m11310r() {
        C3459a aVar = new C3459a();
        int i = this.f9072b;
        if (i == 1) {
            C2620b bVar = new C2620b(this.f9076f, this.f9064Q, this.f9057J, this.f9086q, new C2700f(this.f9076f, C3456a.m10360a(this.f9064Q, this.f9079i)), this, aVar);
            this.f9088s = bVar;
            this.f9060M.add(bVar);
        } else if (i == 2) {
            C2700f fVar = new C2700f(this.f9076f, C3456a.m10360a(this.f9064Q, this.f9079i));
            this.f9058K = new C3624o(this.f9076f, this.f9064Q, this.f9057J, this.f9048A, this.f9079i);
            this.f9061N = new C2637o(this.f9076f, this.f9064Q, this.f9058K, this);
            this.f9088s = new C2620b(this.f9076f, this.f9064Q, this.f9057J, this.f9086q, fVar, this, aVar);
            this.f9060M.add(this.f9061N);
            this.f9060M.add(this.f9088s);
        } else if (i != 3) {
            this.f9058K = new C3624o(this.f9076f, this.f9064Q, this.f9057J, this.f9048A, this.f9079i);
            C2637o oVar = new C2637o(this.f9076f, this.f9064Q, this.f9058K, this);
            this.f9061N = oVar;
            this.f9060M.add(oVar);
        } else {
            C2620b bVar2 = new C2620b(this.f9076f, this.f9064Q, this.f9057J, this.f9086q, new C2705h(), this, aVar);
            this.f9088s = bVar2;
            this.f9060M.add(bVar2);
        }
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f9080j = expressVideoAdListener;
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        C2623d<? extends View> dVar = this.f9089t;
        if (!(dVar == null || !(dVar instanceof C3619l) || (backupView = (BackupView) dVar.mo16720e()) == null)) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        C3595b bVar = this.f9052E;
        if (bVar != null) {
            bVar.mo20154a(tTDislikeDialogAbstract);
        }
        this.f9074d = tTDislikeDialogAbstract;
    }

    public void setDislike(C3778b bVar) {
        BackupView backupView;
        C2623d<? extends View> dVar = this.f9089t;
        if (!(dVar == null || !(dVar instanceof C3619l) || (backupView = (BackupView) dVar.mo16720e()) == null)) {
            backupView.setDislikeInner(bVar);
        }
        C3595b bVar2 = this.f9052E;
        if (bVar2 != null) {
            bVar2.mo20153a((TTAdDislike) bVar);
        }
        this.f9073c = bVar;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f9075e = expressAdInteractionListener;
    }

    public void setClickCreativeListener(C3610e eVar) {
        this.f9090u = eVar;
    }

    public C3610e getClickCreativeListener() {
        return this.f9090u;
    }

    public C3611f getClickListener() {
        return this.f9091v;
    }

    public void setClickListener(C3611f fVar) {
        this.f9091v = fVar;
    }

    public void setBackupListener(C2622c cVar) {
        this.f9084n = cVar;
        C2624e eVar = this.f9062O;
        if (eVar != null) {
            eVar.mo16721a(cVar);
        }
    }

    /* renamed from: i */
    public void mo20124i() {
        C2623d<? extends View> dVar = this.f9089t;
        if ((dVar instanceof C3624o) && dVar != null) {
            ((C3624o) dVar).mo16824j();
        }
    }

    /* renamed from: d */
    public void mo20113d(int i) {
        C2623d<? extends View> dVar = this.f9089t;
        if (dVar != null && (dVar instanceof C3624o)) {
            ((C3624o) dVar).mo16814a(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        removeCallbacks(this.f9056I);
        removeCallbacks(this.f9055H);
        if (i == 0) {
            postDelayed(this.f9055H, 50);
        } else {
            postDelayed(this.f9056I, 50);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        m11311s();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m11311s() {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                if (NativeExpressView.this.f9051D.get()) {
                    NativeExpressView.this.f9087r.mo18770a(System.currentTimeMillis(), C3765x.m12368a(NativeExpressView.this));
                }
            }
        });
    }

    /* renamed from: j */
    public void mo20125j() {
        if (this.f9079i.mo19681ay()) {
            C3595b bVar = this.f9052E;
            if (bVar == null) {
                mo16809a_(106);
                return;
            }
            bVar.mo20152a((C2636n) this);
            this.f9052E.mo20151a();
            return;
        }
        this.f9048A.mo18807a();
        C2629i.C2630a aVar = this.f9059L;
        if (aVar != null) {
            aVar.mo16742a((C2636n) this);
        }
        this.f9059L.mo16740a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f9090u
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r13.getDeviceId()
            r0.mo19407b((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f9090u
            int r2 = r13.getSource()
            r0.mo19394a((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r0 = r12.f9090u
            int r2 = r13.getToolType(r1)
            r0.mo19409c((int) r2)
        L_0x001e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f9091v
            if (r0 == 0) goto L_0x003b
            int r2 = r13.getDeviceId()
            r0.mo19407b((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f9091v
            int r2 = r13.getSource()
            r0.mo19394a((int) r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r0 = r12.f9091v
            int r2 = r13.getToolType(r1)
            r0.mo19409c((int) r2)
        L_0x003b:
            int r0 = r13.getActionMasked()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x009c
            if (r0 == r4) goto L_0x009a
            if (r0 == r3) goto L_0x004f
            if (r0 == r2) goto L_0x004d
            r1 = -1
        L_0x004b:
            r5 = r1
            goto L_0x00af
        L_0x004d:
            r1 = 4
            goto L_0x004b
        L_0x004f:
            float r0 = r12.f9068U
            float r1 = r13.getX()
            float r2 = r12.f9066S
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.f9068U = r0
            float r0 = r12.f9069V
            float r1 = r13.getY()
            float r2 = r12.f9067T
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.f9069V = r0
            float r0 = r13.getX()
            r12.f9066S = r0
            float r0 = r13.getY()
            r12.f9067T = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r12.f9070W
            long r0 = r0 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            float r0 = r12.f9068U
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            float r0 = r12.f9069V
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
        L_0x0096:
            r5 = r4
            goto L_0x00af
        L_0x0098:
            r5 = r3
            goto L_0x00af
        L_0x009a:
            r5 = r2
            goto L_0x00af
        L_0x009c:
            float r0 = r13.getRawX()
            r12.f9066S = r0
            float r0 = r13.getRawY()
            r12.f9067T = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.f9070W = r2
            goto L_0x004b
        L_0x00af:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.f9065R
            if (r0 == 0) goto L_0x00ce
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r3 = r13.getPressure()
            double r8 = (double) r3
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
        L_0x00ce:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16722a(android.view.View r24, int r25, com.bytedance.sdk.component.adexpress.C2618b r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = -1
            if (r2 == r3) goto L_0x01d3
            if (r26 != 0) goto L_0x000d
            goto L_0x01d3
        L_0x000d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.sdk.openadsdk.core.e.n r4 = r0.f9079i
            boolean r4 = com.bytedance.sdk.openadsdk.core.p151e.C3501p.m10769i(r4)
            java.lang.String r5 = "click_scence"
            r6 = 1
            if (r4 == 0) goto L_0x0026
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r4)
            goto L_0x002d
        L_0x0026:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r4)
        L_0x002d:
            r4 = r26
            com.bytedance.sdk.openadsdk.core.e.j r4 = (com.bytedance.sdk.openadsdk.core.p151e.C3481j) r4
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f9090u
            if (r5 == 0) goto L_0x0041
            int r7 = r23.getDynamicShowType()
            r5.mo19411d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r5 = r0.f9090u
            r5.mo19404a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0041:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f9091v
            if (r5 == 0) goto L_0x0051
            int r7 = r23.getDynamicShowType()
            r5.mo19411d((int) r7)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r5 = r0.f9091v
            r5.mo19404a((java.util.Map<java.lang.String, java.lang.Object>) r3)
        L_0x0051:
            float r9 = r4.f8480a
            float r10 = r4.f8481b
            float r11 = r4.f8482c
            float r12 = r4.f8483d
            boolean r14 = r4.f8494o
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r4.f8493n
            if (r3 == 0) goto L_0x0065
            int r5 = r3.size()
            if (r5 != 0) goto L_0x0067
        L_0x0065:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r3 = r0.f9065R
        L_0x0067:
            r13 = r3
            java.lang.String r3 = r4.f8490k
            r5 = 0
            if (r1 != 0) goto L_0x006f
            r8 = r0
            goto L_0x0076
        L_0x006f:
            if (r1 == r0) goto L_0x0075
            org.json.JSONObject r5 = m11302a((android.view.View) r24)
        L_0x0075:
            r8 = r1
        L_0x0076:
            if (r4 == 0) goto L_0x0082
            r4.f8491l = r2
            if (r5 == 0) goto L_0x0082
            org.json.JSONObject r1 = r4.f8492m
            if (r1 != 0) goto L_0x0082
            r4.f8492m = r5
        L_0x0082:
            switch(r2) {
                case 1: goto L_0x0191;
                case 2: goto L_0x0167;
                case 3: goto L_0x014d;
                case 4: goto L_0x009f;
                case 5: goto L_0x0097;
                case 6: goto L_0x0092;
                case 7: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x01d3
        L_0x0087:
            android.content.Context r1 = r0.f9076f
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f9079i
            java.lang.String r3 = r0.f9077g
            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.m8985a(r1, r2, r3)
            goto L_0x01d3
        L_0x0092:
            r23.mo18493a()
            goto L_0x01d3
        L_0x0097:
            boolean r1 = r0.f9086q
            r1 = r1 ^ r6
            r0.mo18495a((boolean) r1)
            goto L_0x01d3
        L_0x009f:
            android.widget.FrameLayout r1 = r0.f9081k
            if (r1 == 0) goto L_0x00b6
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x00b6:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f9079i
            if (r1 == 0) goto L_0x00c3
            int r1 = r1.mo19711h()
            if (r1 != r6) goto L_0x00c3
            if (r14 != 0) goto L_0x00c3
            return
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Creativity....mAdType="
            r1.append(r2)
            java.lang.String r2 = r0.f9077g
            r1.append(r2)
            java.lang.String r2 = ",!mVideoPause="
            r1.append(r2)
            boolean r2 = r0.f9082l
            r2 = r2 ^ r6
            r1.append(r2)
            java.lang.String r2 = "，isAutoPlay="
            r1.append(r2)
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f9079i
            boolean r2 = com.bytedance.sdk.openadsdk.utils.C4014u.m13243j((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ClickCreativeListener"
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r2, (java.lang.String) r1)
            java.lang.String r1 = r0.f9077g
            java.lang.String r5 = "embeded_ad"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0128
            boolean r1 = r23.m11312t()
            if (r1 == 0) goto L_0x0128
            boolean r1 = r0.f9082l
            if (r1 != 0) goto L_0x0128
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f9079i
            boolean r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13243j((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1)
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = "Creative...."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f9090u
            if (r1 == 0) goto L_0x013e
            r1.mo20182a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f9090u
            r1.mo19403a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f9090u
            r7.mo18471a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x013e
        L_0x0128:
            java.lang.String r1 = "normal...."
            com.bytedance.sdk.component.utils.C2975l.m8384b((java.lang.String) r2, (java.lang.String) r1)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f9091v
            if (r1 == 0) goto L_0x013e
            r1.mo20183a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f9091v
            r1.mo19403a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f9091v
            r7.mo18471a(r8, r9, r10, r11, r12, r13, r14)
        L_0x013e:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f9075e
            if (r1 == 0) goto L_0x01d3
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f9079i
            int r2 = r2.mo19609L()
            r1.onAdClicked(r0, r2)
            goto L_0x01d3
        L_0x014d:
            com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract r1 = r0.f9074d
            if (r1 == 0) goto L_0x0156
            r1.show()
            goto L_0x01d3
        L_0x0156:
            com.bytedance.sdk.openadsdk.dislike.b r1 = r0.f9073c
            if (r1 == 0) goto L_0x015f
            r1.showDislikeDialog()
            goto L_0x01d3
        L_0x015f:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f9079i
            java.lang.String r2 = r0.f9049B
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.m8755a((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1, (java.lang.String) r2)
            goto L_0x01d3
        L_0x0167:
            int r1 = r4.f8495p
            if (r1 <= 0) goto L_0x016e
            com.bytedance.sdk.openadsdk.core.C3766y.m12377a(r6)
        L_0x016e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f9090u
            if (r1 == 0) goto L_0x017f
            r1.mo20182a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r1 = r0.f9090u
            r1.mo19403a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.e r7 = r0.f9090u
            r7.mo18471a(r8, r9, r10, r11, r12, r13, r14)
        L_0x017f:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f9075e
            if (r1 == 0) goto L_0x018c
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f9079i
            int r2 = r2.mo19609L()
            r1.onAdClicked(r0, r2)
        L_0x018c:
            r1 = 0
            com.bytedance.sdk.openadsdk.core.C3766y.m12377a(r1)
            goto L_0x01d3
        L_0x0191:
            android.widget.FrameLayout r1 = r0.f9081k
            if (r1 == 0) goto L_0x01a8
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r15, r17, r19, r20, r21, r22)
            r1.dispatchTouchEvent(r2)
        L_0x01a8:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r0.f9079i
            if (r1 == 0) goto L_0x01b5
            int r1 = r1.mo19711h()
            if (r1 != r6) goto L_0x01b5
            if (r14 != 0) goto L_0x01b5
            return
        L_0x01b5:
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f9091v
            if (r1 == 0) goto L_0x01c6
            r1.mo20183a(r4)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r1 = r0.f9091v
            r1.mo19403a((java.lang.String) r3)
            com.bytedance.sdk.openadsdk.core.nativeexpress.f r7 = r0.f9091v
            r7.mo18471a(r8, r9, r10, r11, r12, r13, r14)
        L_0x01c6:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r1 = r0.f9075e
            if (r1 == 0) goto L_0x01d3
            com.bytedance.sdk.openadsdk.core.e.n r2 = r0.f9079i
            int r2 = r2.mo19609L()
            r1.onAdClicked(r0, r2)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo16722a(android.view.View, int, com.bytedance.sdk.component.adexpress.b):void");
    }

    /* renamed from: a */
    public static JSONObject m11302a(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: t */
    private boolean m11312t() {
        return C3498n.m10583c(this.f9079i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getAdSlotType() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f9077g
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1695837674: goto L_0x004a;
                case -1364000502: goto L_0x0040;
                case -1263194568: goto L_0x0036;
                case -764631662: goto L_0x002c;
                case -712491894: goto L_0x0022;
                case 1844104722: goto L_0x0018;
                case 1912999166: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r1 = "draw_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r5
            goto L_0x0055
        L_0x0018:
            java.lang.String r1 = "interaction"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r2
            goto L_0x0055
        L_0x0022:
            java.lang.String r1 = "embeded_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "fullscreen_interstitial_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r3
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "open_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 6
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "rewarded_video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "banner_ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 4
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            switch(r0) {
                case 1: goto L_0x0061;
                case 2: goto L_0x005f;
                case 3: goto L_0x005c;
                case 4: goto L_0x005b;
                case 5: goto L_0x005a;
                case 6: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r2
        L_0x0059:
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r5
        L_0x005c:
            r0 = 8
            return r0
        L_0x005f:
            r0 = 7
            return r0
        L_0x0061:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.getAdSlotType():int");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11311s();
        m11313u();
        C2975l.m8391e("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.f9053F);
        C3524h.m10852d().mo19835a(this.f9049B, this.f9050C);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m11311s();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        C2975l.m8391e("webviewpool", "onFinishTemporaryDetach+++");
    }

    /* renamed from: u */
    private void m11313u() {
        List<C2629i> list = this.f9060M;
        if (list != null) {
            for (C2629i next : list) {
                if (next != null) {
                    next.mo16713b();
                }
            }
        }
    }

    /* renamed from: v */
    private void m11314v() {
        List<C2629i> list = this.f9060M;
        if (list != null) {
            for (C2629i next : list) {
                if (next != null) {
                    next.mo16714c();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo20126k() {
        C3624o oVar = this.f9058K;
        if (oVar != null && oVar.mo16720e() != null) {
            this.f9058K.mo16820f();
        }
    }

    /* renamed from: l */
    public void mo20127l() {
        try {
            if (this.f9052E != null) {
                this.f9052E.mo20156b();
            }
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            if (this.f9060M != null) {
                for (C2629i a : this.f9060M) {
                    a.mo16711a();
                }
            }
            this.f9073c = null;
            this.f9074d = null;
            this.f9078h = null;
            this.f9079i = null;
            this.f9075e = null;
            this.f9090u = null;
            this.f9084n = null;
            this.f9091v = null;
            this.f9080j = null;
        } catch (Throwable th) {
            C2975l.m8388c("NativeExpressView", "detach error", th);
        }
    }

    /* renamed from: m */
    public void mo20128m() {
        try {
            if (this.f9081k != null && this.f9081k.getParent() != null) {
                removeView(this.f9081k);
            }
        } catch (Throwable th) {
            C2975l.m8379a("NativeExpressView", "backupDestroy remove video container error", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f9053F);
        C3524h.m10852d().mo19856f(this.f9049B);
        m11314v();
        C2975l.m8391e("webviewpool", "onDetachedFromWindow===");
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C2975l.m8391e("webviewpool", "onStartTemporaryDetach===");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.d<? extends android.view.View>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16808a(com.bytedance.sdk.component.adexpress.p095b.C2623d<? extends android.view.View> r5, com.bytedance.sdk.component.adexpress.p095b.C2635m r6) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f9051D
            r1 = 1
            r0.set(r1)
            r4.f9089t = r5
            int r0 = r5.mo16710c()
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f9079i
            int r0 = r0.mo19705f()
            if (r0 != r1) goto L_0x001d
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f9079i
            r0.mo19685b((int) r3)
        L_0x001d:
            int r0 = r5.mo16710c()
            r1 = 2
            if (r0 == r1) goto L_0x0030
            int r0 = r5.mo16710c()
            if (r0 == 0) goto L_0x0030
            int r0 = r5.mo16710c()
            if (r0 != r2) goto L_0x007a
        L_0x0030:
            android.view.View r0 = r5.mo16720e()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0043
            android.view.ViewParent r1 = r0.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L_0x0043:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r3
        L_0x0049:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L_0x0059
            android.view.View r2 = r4.getChildAt(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0059:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0073
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof com.bytedance.sdk.component.widget.SSWebView
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.get(r3)
            android.view.View r1 = (android.view.View) r1
            r4.removeView(r1)
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0073:
            android.view.View r5 = r5.mo16720e()
            r4.addView(r5)
        L_0x007a:
            com.bytedance.sdk.component.adexpress.b.h r5 = r4.f9063P
            if (r5 == 0) goto L_0x0083
            com.bytedance.sdk.openadsdk.core.nativeexpress.i r5 = (com.bytedance.sdk.openadsdk.core.nativeexpress.C3614i) r5
            r5.mo20184i()
        L_0x0083:
            com.bytedance.sdk.openadsdk.TTNativeExpressAd$ExpressAdInteractionListener r5 = r4.f9075e
            if (r5 == 0) goto L_0x0094
            double r0 = r6.mo16787b()
            float r0 = (float) r0
            double r1 = r6.mo16792c()
            float r6 = (float) r1
            r5.onRenderSuccess(r4, r0, r6)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.mo16808a(com.bytedance.sdk.component.adexpress.b.d, com.bytedance.sdk.component.adexpress.b.m):void");
    }

    /* renamed from: a_ */
    public void mo16809a_(int i) {
        C2628h hVar = this.f9063P;
        if (hVar != null) {
            if (!this.f9071a) {
                hVar.mo16735f();
            }
            this.f9063P.mo16737g();
            ((C3614i) this.f9063P).mo20184i();
        }
        TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = this.f9075e;
        if (expressAdInteractionListener != null) {
            expressAdInteractionListener.onRenderFail(this, C3513g.m10825a(i), i);
        }
    }

    /* renamed from: n */
    public boolean mo20129n() {
        C2623d<? extends View> dVar = this.f9089t;
        return dVar != null && dVar.mo16710c() == 1;
    }

    public int getDynamicShowType() {
        C2623d<? extends View> dVar = this.f9089t;
        if (dVar != null) {
            return dVar.mo16710c();
        }
        return 0;
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f9094y).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.f9095z).intValue();
    }

    public C3728w getJsObject() {
        C3624o oVar = this.f9058K;
        if (oVar != null) {
            return oVar.mo20199p();
        }
        return null;
    }

    /* renamed from: w */
    private boolean m11315w() {
        return TextUtils.equals(this.f9077g, "fullscreen_interstitial_ad") || TextUtils.equals(this.f9077g, "rewarded_video") || C3624o.m11478b(this.f9077g);
    }

    /* renamed from: a */
    public void mo17175a(CharSequence charSequence, int i, int i2) {
        mo20112b(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    public void setSoundMute(boolean z) {
        this.f9086q = z;
        C2620b bVar = this.f9088s;
        if (bVar != null && bVar.mo16715d() != null) {
            this.f9088s.mo16715d().setSoundMute(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20112b(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.f9077g, "fullscreen_interstitial_ad")) {
            i3 = C3578m.m11241h().mo19937e(Integer.valueOf(this.f9093x).intValue());
        } else if (TextUtils.equals(this.f9077g, "rewarded_video")) {
            i3 = C3578m.m11241h().mo19941f(this.f9093x);
        } else {
            return;
        }
        if (i3 < 0) {
            i3 = 5;
        }
        int i4 = 0;
        int i5 = (i2 >= i3 || mo18499d() == 5) ? 1 : 0;
        if (i2 <= i3) {
            i4 = i3 - i2;
        }
        C2620b bVar = this.f9088s;
        if (bVar != null && bVar.mo16715d() != null) {
            this.f9088s.mo16715d().mo17175a(String.valueOf(i), i5, i4);
        }
    }
}
