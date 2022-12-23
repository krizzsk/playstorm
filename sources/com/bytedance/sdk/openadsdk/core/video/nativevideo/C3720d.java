package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2523a;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2539a;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2540b;
import com.bykv.p068vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.p068vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2511b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p146b.C3426a;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.C3758d;
import com.bytedance.sdk.openadsdk.core.widget.C3761e;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.d */
/* compiled from: NativeVideoLayout */
public class C3720d implements C2519a, C2524b<C3498n>, C2539a, C2989x.C2990a, C3758d.C3760a, C3761e.C3764b {

    /* renamed from: A */
    C3694a f9538A;

    /* renamed from: B */
    boolean f9539B;

    /* renamed from: C */
    C4026c f9540C;

    /* renamed from: D */
    C2526c f9541D;

    /* renamed from: E */
    C3426a f9542E;

    /* renamed from: F */
    C3426a f9543F;

    /* renamed from: G */
    boolean f9544G;

    /* renamed from: H */
    private View f9545H;

    /* renamed from: I */
    private TextView f9546I;

    /* renamed from: J */
    private TextView f9547J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public NativeVideoTsView.C3692a f9548K;

    /* renamed from: L */
    private final String f9549L;

    /* renamed from: a */
    View f9550a;

    /* renamed from: b */
    C2540b f9551b;

    /* renamed from: c */
    ImageView f9552c;

    /* renamed from: d */
    View f9553d;

    /* renamed from: e */
    View f9554e;

    /* renamed from: f */
    ImageView f9555f;

    /* renamed from: g */
    ViewStub f9556g;

    /* renamed from: h */
    View f9557h;

    /* renamed from: i */
    ImageView f9558i;

    /* renamed from: j */
    View f9559j;

    /* renamed from: k */
    RoundImageView f9560k;

    /* renamed from: l */
    TextView f9561l;

    /* renamed from: m */
    TextView f9562m;

    /* renamed from: n */
    TextView f9563n;

    /* renamed from: o */
    ViewStub f9564o;

    /* renamed from: p */
    int f9565p;

    /* renamed from: q */
    int f9566q;

    /* renamed from: r */
    int f9567r;

    /* renamed from: s */
    int f9568s;

    /* renamed from: t */
    boolean f9569t;

    /* renamed from: u */
    boolean f9570u;

    /* renamed from: v */
    int f9571v;

    /* renamed from: w */
    EnumSet<C2524b.C2525a> f9572w;

    /* renamed from: x */
    C3498n f9573x;

    /* renamed from: y */
    Context f9574y;

    /* renamed from: z */
    C3761e f9575z;

    /* renamed from: a */
    public void mo20358a(long j) {
    }

    /* renamed from: a */
    public void mo20359a(long j, long j2) {
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
    }

    /* renamed from: a */
    public void mo20361a(View view, boolean z) {
    }

    /* renamed from: a */
    public void mo20362a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo20364a(String str) {
    }

    /* renamed from: b */
    public void mo16500b(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: b */
    public void mo16501b(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    /* renamed from: b */
    public void mo20367b(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo20368b(boolean z) {
    }

    /* renamed from: b */
    public boolean mo20369b(int i) {
        return false;
    }

    /* renamed from: c */
    public void mo20371c(boolean z) {
    }

    /* renamed from: e */
    public void mo20373e() {
    }

    /* renamed from: f */
    public void mo20374f() {
    }

    /* renamed from: j */
    public boolean mo20378j() {
        return false;
    }

    /* renamed from: n */
    public void mo20382n() {
    }

    public C3720d(Context context, View view, boolean z, EnumSet<C2524b.C2525a> enumSet, C3498n nVar, C2526c cVar, boolean z2) {
        this.f9569t = true;
        this.f9539B = true;
        this.f9544G = true;
        this.f9549L = Build.MODEL;
        if (!(this instanceof C3712c)) {
            this.f9574y = C3578m.m11231a().getApplicationContext();
            mo20404d(z2);
            this.f9550a = view;
            this.f9569t = z;
            this.f9572w = enumSet == null ? EnumSet.noneOf(C2524b.C2525a.class) : enumSet;
            this.f9541D = cVar;
            this.f9573x = nVar;
            mo20370c(8);
            mo20360a(context, this.f9550a);
            mo20372d();
            mo20405p();
        }
    }

    public C3720d(Context context, View view, boolean z, EnumSet<C2524b.C2525a> enumSet, C3498n nVar, C2526c cVar) {
        this(context, view, z, enumSet, nVar, cVar, true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20405p() {
        /*
            r9 = this;
            boolean r0 = r9.f9539B
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "embeded_ad"
            goto L_0x0009
        L_0x0007:
            java.lang.String r0 = "embeded_ad_landingpage"
        L_0x0009:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9573x
            boolean r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13203b((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1)
            r2 = 1
            if (r1 == 0) goto L_0x001d
            boolean r0 = r9.f9539B
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "draw_ad"
            goto L_0x001b
        L_0x0019:
            java.lang.String r0 = "draw_ad_landingpage"
        L_0x001b:
            r1 = 6
            goto L_0x0028
        L_0x001d:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9573x
            boolean r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13210c((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1)
            if (r1 == 0) goto L_0x002b
            r1 = 7
            java.lang.String r0 = "rewarded_video"
        L_0x0028:
            r7 = r0
            r8 = r1
            goto L_0x0039
        L_0x002b:
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9573x
            boolean r1 = com.bytedance.sdk.openadsdk.utils.C4014u.m13216d((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r1)
            if (r1 == 0) goto L_0x0037
            r1 = 5
            java.lang.String r0 = "fullscreen_interstitial_ad"
            goto L_0x0028
        L_0x0037:
            r7 = r0
            r8 = r2
        L_0x0039:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r9.f9573x
            int r0 = r0.mo19609L()
            r1 = 4
            if (r0 != r1) goto L_0x004c
            android.content.Context r0 = r9.f9574y
            com.bytedance.sdk.openadsdk.core.e.n r1 = r9.f9573x
            com.com.bytedance.overseas.sdk.a.c r0 = com.com.bytedance.overseas.sdk.p186a.C4027d.m13342a(r0, r1, r7)
            r9.f9540C = r0
        L_0x004c:
            r9.m12096z()
            com.bytedance.sdk.openadsdk.core.b.a r0 = new com.bytedance.sdk.openadsdk.core.b.a
            android.content.Context r1 = r9.f9574y
            com.bytedance.sdk.openadsdk.core.e.n r3 = r9.f9573x
            r0.<init>(r1, r3, r7, r8)
            r9.f9542E = r0
            r0.mo19389b((boolean) r2)
            boolean r0 = r9.f9539B
            r1 = 0
            if (r0 == 0) goto L_0x0068
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            r0.mo19387a(r2)
            goto L_0x0072
        L_0x0068:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            r0.mo19387a(r1)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            r0.mo19391c(r2)
        L_0x0072:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            com.bykv.vk.openvk.component.video.api.d.c r3 = r9.f9541D
            r0.mo19397a((com.bykv.p068vk.openvk.component.video.api.p086d.C2526c) r3)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            r0.mo19412d((boolean) r2)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9542E
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$1 r3 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$1
            r3.<init>()
            r0.mo19400a((com.bytedance.sdk.openadsdk.core.p146b.C3427b.C3428a) r3)
            com.com.bytedance.overseas.sdk.a.c r0 = r9.f9540C
            if (r0 == 0) goto L_0x0093
            com.bytedance.sdk.openadsdk.core.b.a r3 = r9.f9542E
            if (r3 == 0) goto L_0x0093
            r3.mo19402a((com.com.bytedance.overseas.sdk.p186a.C4026c) r0)
        L_0x0093:
            boolean r0 = r9.m12095y()
            if (r0 == 0) goto L_0x00e7
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$2 r0 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$2
            android.content.Context r5 = r9.f9574y
            com.bytedance.sdk.openadsdk.core.e.n r6 = r9.f9573x
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.f9543F = r0
            com.bytedance.sdk.openadsdk.core.video.nativevideo.d$3 r3 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.d$3
            r3.<init>()
            r0.mo19400a((com.bytedance.sdk.openadsdk.core.p146b.C3427b.C3428a) r3)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9543F
            r0.mo19389b((boolean) r2)
            boolean r0 = r9.f9539B
            if (r0 == 0) goto L_0x00bd
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9543F
            r0.mo19387a(r2)
            goto L_0x00c2
        L_0x00bd:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9543F
            r0.mo19387a(r1)
        L_0x00c2:
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9543F
            com.bykv.vk.openvk.component.video.api.d.c r1 = r9.f9541D
            r0.mo19397a((com.bykv.p068vk.openvk.component.video.api.p086d.C2526c) r1)
            com.bytedance.sdk.openadsdk.core.b.a r0 = r9.f9543F
            r0.mo19412d((boolean) r2)
            com.com.bytedance.overseas.sdk.a.c r0 = r9.f9540C
            if (r0 == 0) goto L_0x00d7
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9543F
            r1.mo19402a((com.com.bytedance.overseas.sdk.p186a.C4026c) r0)
        L_0x00d7:
            android.view.View r0 = r9.f9550a
            if (r0 == 0) goto L_0x00e7
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9543F
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f9550a
            com.bytedance.sdk.openadsdk.core.b.a r1 = r9.f9543F
            r0.setOnTouchListener(r1)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.C3720d.mo20405p():void");
    }

    /* renamed from: y */
    private boolean m12095y() {
        return C3498n.m10583c(this.f9573x) && this.f9573x.mo19604G() == null && this.f9573x.mo19736p() == 1;
    }

    /* renamed from: a */
    public void mo20397a(NativeVideoTsView.C3692a aVar) {
        this.f9548K = aVar;
    }

    /* renamed from: a */
    public void mo20396a(TTNativeAd tTNativeAd) {
        C3426a aVar = this.f9542E;
        if (aVar != null) {
            aVar.mo19398a(tTNativeAd);
        }
        C3426a aVar2 = this.f9543F;
        if (aVar2 != null) {
            aVar2.mo19398a(tTNativeAd);
        }
    }

    /* renamed from: z */
    private void m12096z() {
        if (this.f9574y != null && this.f9550a != null) {
            C37244 r0 = new View(this.f9574y) {
                /* renamed from: a */
                private void m12163a() {
                }

                /* renamed from: b */
                private void m12164b() {
                }

                public void onFinishTemporaryDetach() {
                    super.onFinishTemporaryDetach();
                    m12163a();
                }

                /* access modifiers changed from: protected */
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    m12164b();
                }

                public void onStartTemporaryDetach() {
                    super.onStartTemporaryDetach();
                    m12164b();
                }
            };
            View view = this.f9550a;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).addView(r0, 0, new RelativeLayout.LayoutParams(0, 0));
            }
        }
    }

    /* renamed from: q */
    public C2540b mo20406q() {
        return this.f9551b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20360a(Context context, View view) {
        View view2;
        long currentTimeMillis = System.currentTimeMillis();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        C2526c cVar = this.f9541D;
        if (cVar == null || !cVar.mo16461s()) {
            view2 = new SSRenderSurfaceView(this.f9574y);
            C2975l.m8384b("NewLiveViewLayout", "use SurfaceView......");
        } else {
            view2 = new SSRenderTextureView(this.f9574y);
            C2975l.m8384b("NewLiveViewLayout", "use TextureView......");
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(view2, 0, layoutParams);
        }
        C4020v.m13282a(view2, 8);
        this.f9551b = (C2540b) view2;
        this.f9552c = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_play"));
        this.f9553d = view.findViewById(C2984t.m8432e(context, "tt_video_loading_retry_layout"));
        this.f9554e = view.findViewById(C2984t.m8432e(context, "tt_video_loading_progress"));
        this.f9555f = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_loading_cover_image"));
        this.f9556g = (ViewStub) view.findViewById(C2984t.m8432e(context, "tt_video_ad_cover"));
        this.f9564o = (ViewStub) view.findViewById(C2984t.m8432e(context, "tt_video_draw_layout_viewStub"));
        C2975l.m8384b("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20394a(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f9556g) != null && viewStub.getParent() != null && this.f9557h == null) {
            this.f9557h = this.f9556g.inflate();
            this.f9558i = (ImageView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_finish_cover_image"));
            this.f9559j = view.findViewById(C2984t.m8432e(context, "tt_video_ad_cover_center_layout"));
            this.f9560k = (RoundImageView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_logo_image"));
            this.f9561l = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_btn_ad_image_tv"));
            this.f9562m = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_name"));
            this.f9563n = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_button"));
        }
    }

    /* renamed from: b */
    private void m12092b(View view, Context context) {
        ViewStub viewStub;
        if (view != null && context != null && (viewStub = this.f9564o) != null && viewStub.getParent() != null && this.f9545H == null) {
            this.f9564o.inflate();
            this.f9545H = view.findViewById(C2984t.m8432e(context, "tt_video_ad_cover_center_layout_draw"));
            this.f9546I = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_button_draw"));
            this.f9547J = (TextView) view.findViewById(C2984t.m8432e(context, "tt_video_ad_replay"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo20407r() {
        if (this.f9538A != null && this.f9575z == null) {
            long currentTimeMillis = System.currentTimeMillis();
            C3761e eVar = new C3761e();
            this.f9575z = eVar;
            eVar.mo20567a(this.f9574y, this.f9550a);
            this.f9575z.mo20568a(this.f9538A, (C3761e.C3764b) this);
            C2975l.m8384b("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public boolean mo20398a(int i, C2521b bVar, boolean z) {
        C3761e eVar = this.f9575z;
        return eVar == null || eVar.mo20571a(i, bVar, z);
    }

    /* renamed from: s */
    public void mo20408s() {
        C3761e eVar = this.f9575z;
        if (eVar != null) {
            eVar.mo20569a(false);
        }
    }

    /* renamed from: a */
    public void mo20395a(C2523a aVar) {
        if (aVar instanceof C3694a) {
            this.f9538A = (C3694a) aVar;
            mo20407r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo20409t() {
        if (this.f9538A != null) {
            return true;
        }
        C2975l.m8391e("NewLiveViewLayout", "callback is null");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo20372d() {
        this.f9551b.mo16479a(this);
        this.f9552c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!C3720d.this.mo20409t()) {
                    return;
                }
                if (C3720d.this.f9563n == null || C3720d.this.f9563n.getVisibility() != 0) {
                    C3720d.this.f9538A.mo16413a((C2524b) C3720d.this, view);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo20403d(int i) {
        C4020v.m13282a(this.f9550a, 0);
        C2540b bVar = this.f9551b;
        if (bVar != null) {
            bVar.setVisibility(i);
        }
    }

    /* renamed from: d */
    public void mo20404d(boolean z) {
        this.f9539B = z;
        if (z) {
            C3426a aVar = this.f9542E;
            if (aVar != null) {
                aVar.mo19387a(true);
            }
            C3426a aVar2 = this.f9543F;
            if (aVar2 != null) {
                aVar2.mo19387a(true);
                return;
            }
            return;
        }
        C3426a aVar3 = this.f9542E;
        if (aVar3 != null) {
            aVar3.mo19387a(false);
        }
        C3426a aVar4 = this.f9543F;
        if (aVar4 != null) {
            aVar4.mo19387a(false);
        }
    }

    /* renamed from: a */
    public void mo20393a(int i, int i2) {
        if (i == -1) {
            i = C4020v.m13306c(this.f9574y);
        }
        if (i > 0) {
            this.f9565p = i;
            if (mo20379k() || mo20378j() || this.f9572w.contains(C2524b.C2525a.fixedSize)) {
                this.f9566q = i2;
            } else {
                this.f9566q = m12093e(i);
            }
            mo20399b(this.f9565p, this.f9566q);
        }
    }

    /* renamed from: b */
    public void mo20400b(boolean z, boolean z2) {
        ImageView imageView = this.f9552c;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageResource(C2984t.m8431d(this.f9574y, "tt_play_movebar_textpage"));
        } else {
            imageView.setImageResource(C2984t.m8431d(this.f9574y, "tt_stop_movebar_textpage"));
        }
    }

    /* renamed from: b */
    public void mo20399b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f9550a.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f9550a.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private int m12093e(int i) {
        if (this.f9567r <= 0 || this.f9568s <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f9574y.getResources().getDimensionPixelSize(C2984t.m8436i(this.f9574y, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.f9574y.getResources().getDimensionPixelSize(C2984t.m8436i(this.f9574y, "tt_video_container_minheight"));
        int i2 = (int) (((float) this.f9568s) * ((((float) i) * 1.0f) / ((float) this.f9567r)));
        if (i2 > dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    /* renamed from: c */
    public void mo20401c(int i, int i2) {
        this.f9567r = i;
        this.f9568s = i2;
    }

    /* renamed from: a */
    public void mo20357a(int i) {
        C2975l.m8387c("Progress", "setSeekProgress-percent=" + i);
    }

    /* renamed from: c */
    public void mo20402c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            if (this.f9550a.getParent() == null) {
                viewGroup.addView(this.f9550a);
            }
            mo20370c(0);
        }
    }

    /* renamed from: c */
    public View mo16428c() {
        return this.f9550a;
    }

    /* renamed from: g */
    public void mo20375g() {
        C3498n nVar;
        C4020v.m13318f(this.f9553d);
        C4020v.m13318f(this.f9554e);
        if (!(this.f9555f == null || (nVar = this.f9573x) == null || nVar.mo19607J() == null || this.f9573x.mo19607J().mo16358h() == null)) {
            C4020v.m13318f((View) this.f9555f);
            C3854d.m12660a().mo20704a(this.f9573x.mo19607J().mo16358h(), this.f9555f);
        }
        if (this.f9552c.getVisibility() == 0) {
            C4020v.m13282a((View) this.f9552c, 8);
        }
    }

    /* renamed from: u */
    public void mo20410u() {
        C4020v.m13318f(this.f9553d);
        C4020v.m13318f(this.f9554e);
        if (this.f9552c.getVisibility() == 0) {
            C4020v.m13282a((View) this.f9552c, 8);
        }
    }

    /* renamed from: a */
    public void mo16423a() {
        mo20365a(false, this.f9569t);
        mo20412w();
    }

    /* renamed from: v */
    public void mo20411v() {
        C4020v.m13282a(this.f9550a, 0);
        C2540b bVar = this.f9551b;
        if (bVar != null) {
            C4020v.m13282a(bVar.getView(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo20412w() {
        try {
            C4020v.m13282a(this.f9557h, 8);
            C4020v.m13282a((View) this.f9558i, 8);
            C4020v.m13282a(this.f9559j, 8);
            C4020v.m13282a((View) this.f9560k, 8);
            C4020v.m13282a((View) this.f9561l, 8);
            C4020v.m13282a((View) this.f9562m, 8);
            C4020v.m13282a((View) this.f9563n, 8);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m12094f(int i) {
        C4020v.m13282a(this.f9559j, i);
        C4020v.m13282a(this.f9545H, i);
    }

    /* renamed from: a */
    public void mo16426a(boolean z) {
        this.f9544G = z;
    }

    /* renamed from: a */
    public void mo16425a(C3498n nVar, WeakReference<Context> weakReference, boolean z) {
        String str;
        C3498n nVar2;
        C3498n nVar3;
        C3498n nVar4;
        if (nVar != null) {
            mo20365a(false, this.f9569t);
            mo20394a(this.f9550a, C3578m.m11231a());
            View view = this.f9557h;
            if (view != null) {
                C4020v.m13282a(view, 0);
            }
            ImageView imageView = this.f9558i;
            if (imageView != null) {
                C4020v.m13282a((View) imageView, 0);
            }
            if (C4014u.m13203b(this.f9573x)) {
                m12092b(this.f9550a, C3578m.m11231a());
                C4020v.m13282a(this.f9559j, 8);
                C4020v.m13282a((View) this.f9558i, 0);
                C4020v.m13282a(this.f9545H, 0);
                C4020v.m13282a((View) this.f9546I, 0);
                C4020v.m13282a((View) this.f9547J, 0);
                if (this.f9547J != null && C2979o.m8409c(C3578m.m11231a()) == 0) {
                    C4020v.m13282a((View) this.f9547J, 8);
                }
                View view2 = this.f9557h;
                if (view2 != null) {
                    view2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (C3720d.this.f9541D != null) {
                                ((C2523a) C3720d.this.f9541D).mo16407a();
                            }
                        }
                    });
                }
                if (!(this.f9558i == null || (nVar4 = this.f9573x) == null || nVar4.mo19607J() == null || this.f9573x.mo19607J().mo16358h() == null)) {
                    C2511b.m6218a((long) this.f9573x.mo19607J().mo16353f(), this.f9573x.mo19607J().mo16360i(), new C2511b.C2513b() {
                        /* renamed from: a */
                        public void mo16319a(Bitmap bitmap) {
                            if (bitmap != null) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C3720d.this.f9558i.getLayoutParams();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    layoutParams.width = C4020v.m13306c(C3578m.m11231a());
                                    layoutParams.height = (int) ((float) ((bitmap.getHeight() * C4020v.m13306c(C3578m.m11231a())) / bitmap.getWidth()));
                                    layoutParams.addRule(13);
                                    C3720d.this.f9558i.setLayoutParams(layoutParams);
                                }
                                C3720d.this.f9558i.setImageBitmap(bitmap);
                                return;
                            }
                            C3854d.m12660a().mo20704a(C3720d.this.f9573x.mo19607J().mo16358h(), C3720d.this.f9558i);
                        }
                    });
                }
            } else {
                C4020v.m13282a(this.f9559j, 0);
                if (!(this.f9558i == null || (nVar3 = this.f9573x) == null || nVar3.mo19607J() == null || this.f9573x.mo19607J().mo16358h() == null)) {
                    C3854d.m12660a().mo20704a(this.f9573x.mo19607J().mo16358h(), this.f9558i);
                }
            }
            if (!TextUtils.isEmpty(nVar.mo19608K())) {
                str = nVar.mo19608K();
            } else if (!TextUtils.isEmpty(nVar.mo19618U())) {
                str = nVar.mo19618U();
            } else {
                str = !TextUtils.isEmpty(nVar.mo19619V()) ? nVar.mo19619V() : "";
            }
            if (this.f9560k != null && (nVar2 = this.f9573x) != null && nVar2.mo19610M() != null && this.f9573x.mo19610M().mo19559a() != null) {
                C4020v.m13282a((View) this.f9560k, 0);
                C4020v.m13282a((View) this.f9561l, 4);
                C3854d.m12660a().mo20703a(this.f9573x.mo19610M(), (ImageView) this.f9560k);
                if (m12095y()) {
                    this.f9560k.setOnClickListener(this.f9543F);
                    this.f9560k.setOnTouchListener(this.f9543F);
                } else {
                    this.f9560k.setOnClickListener(this.f9542E);
                    this.f9560k.setOnTouchListener(this.f9542E);
                }
            } else if (!TextUtils.isEmpty(str)) {
                C4020v.m13282a((View) this.f9560k, 4);
                C4020v.m13282a((View) this.f9561l, 0);
                TextView textView = this.f9561l;
                if (textView != null) {
                    textView.setText(str.substring(0, 1));
                    if (m12095y()) {
                        this.f9561l.setOnClickListener(this.f9543F);
                        this.f9561l.setOnTouchListener(this.f9543F);
                    } else {
                        this.f9561l.setOnClickListener(this.f9542E);
                        this.f9561l.setOnTouchListener(this.f9542E);
                    }
                }
            }
            if (this.f9562m != null && !TextUtils.isEmpty(str)) {
                this.f9562m.setText(str);
            }
            C4020v.m13282a((View) this.f9562m, 0);
            C4020v.m13282a((View) this.f9563n, 0);
            String W = nVar.mo19620W();
            if (TextUtils.isEmpty(W)) {
                int L = nVar.mo19609L();
                if (L == 2 || L == 3) {
                    W = C2984t.m8425a(this.f9574y, "tt_video_mobile_go_detail");
                } else if (L != 4) {
                    W = L != 5 ? C2984t.m8425a(this.f9574y, "tt_video_mobile_go_detail") : C2984t.m8425a(this.f9574y, "tt_video_dial_phone");
                } else {
                    W = C2984t.m8425a(this.f9574y, "tt_video_download_apk");
                }
            }
            TextView textView2 = this.f9563n;
            if (textView2 != null) {
                textView2.setText(W);
                this.f9563n.setOnClickListener(this.f9542E);
                this.f9563n.setOnTouchListener(this.f9542E);
            }
            TextView textView3 = this.f9546I;
            if (textView3 != null) {
                textView3.setText(W);
                this.f9546I.setOnClickListener(this.f9542E);
                this.f9546I.setOnTouchListener(this.f9542E);
            }
            if (!this.f9544G) {
                m12094f(4);
            }
        }
    }

    /* renamed from: b */
    public void mo16427b() {
        C4020v.m13316e(this.f9553d);
        C4020v.m13316e(this.f9554e);
        ImageView imageView = this.f9555f;
        if (imageView != null) {
            C4020v.m13316e((View) imageView);
        }
    }

    /* renamed from: h */
    public void mo20376h() {
        C4020v.m13316e(this.f9553d);
    }

    /* renamed from: a */
    public void mo16497a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f9551b.getHolder()) {
            this.f9570u = true;
            if (mo20409t()) {
                this.f9538A.mo16411a((C2524b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo16498a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f9551b.getHolder() && mo20409t()) {
            this.f9538A.mo16412a(this, surfaceHolder, i, i2, i3);
        }
    }

    /* renamed from: b */
    public void mo16502b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f9551b.getHolder()) {
            this.f9570u = false;
            if (mo20409t()) {
                this.f9538A.mo16417b((C2524b) this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public void mo16496a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f9570u = true;
        if (mo20409t()) {
            this.f9538A.mo16410a((C2524b) this, surfaceTexture);
        }
    }

    /* renamed from: a */
    public boolean mo16499a(SurfaceTexture surfaceTexture) {
        this.f9570u = false;
        if (!mo20409t()) {
            return true;
        }
        this.f9538A.mo16416b((C2524b) this, surfaceTexture);
        return true;
    }

    /* renamed from: i */
    public void mo20377i() {
        mo20370c(8);
        if (mo20413x()) {
            this.f9551b.setVisibility(8);
        }
        ImageView imageView = this.f9555f;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        mo20370c(8);
        C4020v.m13282a(this.f9557h, 8);
        C4020v.m13282a((View) this.f9558i, 8);
        C4020v.m13282a(this.f9559j, 8);
        C4020v.m13282a((View) this.f9560k, 8);
        C4020v.m13282a((View) this.f9561l, 8);
        C4020v.m13282a((View) this.f9562m, 8);
        C3761e eVar = this.f9575z;
        if (eVar != null) {
            eVar.mo20569a(true);
        }
    }

    /* renamed from: k */
    public boolean mo20379k() {
        return this.f9569t;
    }

    /* renamed from: a */
    public void mo20366a(boolean z, boolean z2, boolean z3) {
        C4020v.m13282a((View) this.f9552c, (!z || this.f9553d.getVisibility() == 0) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo20365a(boolean z, boolean z2) {
        C4020v.m13282a((View) this.f9552c, 8);
    }

    /* renamed from: l */
    public void mo20380l() {
        mo20365a(true, false);
    }

    /* renamed from: m */
    public boolean mo20381m() {
        return this.f9570u;
    }

    /* renamed from: c */
    public void mo20370c(int i) {
        this.f9571v = i;
        C4020v.m13282a(this.f9550a, i);
    }

    /* renamed from: o */
    public boolean mo20383o() {
        C3761e eVar = this.f9575z;
        return eVar != null && eVar.mo20570a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo20413x() {
        return !this.f9572w.contains(C2524b.C2525a.alwayShowMediaView) || this.f9569t;
    }

    /* renamed from: a */
    public void mo16424a(Drawable drawable) {
        View view = this.f9550a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }
}
