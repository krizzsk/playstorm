package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bykv.p068vk.openvk.component.video.api.C2515a;
import com.bykv.p068vk.openvk.component.video.api.p084b.C2519a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2520a;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2523a;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2524b;
import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bykv.p068vk.openvk.component.video.api.renderview.C2540b;
import com.bykv.p068vk.openvk.component.video.p069a.p081d.C2495d;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2510a;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3645t;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3624o;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.video.p162a.C3658a;
import com.bytedance.sdk.openadsdk.core.widget.C3761e;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.p130b.C3167j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3150o;
import com.bytedance.sdk.openadsdk.p179k.C3909e;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b */
/* compiled from: NativeVideoController */
public class C3695b extends C3658a {

    /* renamed from: A */
    private String f9431A;

    /* renamed from: B */
    private boolean f9432B;

    /* renamed from: C */
    private boolean f9433C;

    /* renamed from: D */
    private WeakReference<C2526c.C2528b> f9434D;

    /* renamed from: E */
    private boolean f9435E;

    /* renamed from: F */
    private boolean f9436F;

    /* renamed from: G */
    private boolean f9437G;

    /* renamed from: H */
    private boolean f9438H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public WeakReference<C2526c.C2530d> f9439I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public WeakReference<C3711a> f9440J;

    /* renamed from: K */
    private int f9441K;

    /* renamed from: L */
    private int f9442L;

    /* renamed from: M */
    private int f9443M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f9444N;

    /* renamed from: O */
    private boolean f9445O;

    /* renamed from: P */
    private C2522c f9446P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f9447Q;

    /* renamed from: R */
    private C3167j f9448R;

    /* renamed from: S */
    private C2515a.C2516a f9449S;

    /* renamed from: T */
    private int f9450T;

    /* renamed from: U */
    private long f9451U;

    /* renamed from: V */
    private long f9452V;

    /* renamed from: W */
    private long f9453W;

    /* renamed from: X */
    private long f9454X;

    /* renamed from: Y */
    private final BroadcastReceiver f9455Y;

    /* renamed from: Z */
    private int f9456Z;

    /* renamed from: aa */
    private boolean f9457aa;

    /* renamed from: s */
    Runnable f9458s;

    /* renamed from: t */
    private final WeakReference<ViewGroup> f9459t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public long f9460u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f9461v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2526c.C2527a f9462w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final boolean f9463x;

    /* renamed from: y */
    private boolean f9464y;

    /* renamed from: z */
    private boolean f9465z;

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$a */
    /* compiled from: NativeVideoController */
    public interface C3711a {
        /* renamed from: a */
        void mo20295a(int i);

        /* renamed from: f */
        void mo20298f();
    }

    /* renamed from: a */
    public void mo20329a(int i) {
    }

    /* renamed from: a */
    public void mo16433a(Map<String, Object> map) {
    }

    /* renamed from: g */
    public void mo20339g(boolean z) {
        this.f9438H = z;
    }

    /* renamed from: a */
    public void mo20334a(final NativeVideoTsView.C3692a aVar) {
        if (this.f9308m && this.f9299d != null) {
            this.f9299d.mo20397a((NativeVideoTsView.C3692a) new NativeVideoTsView.C3692a() {
                /* renamed from: a */
                public void mo18946a(View view, int i) {
                    NativeVideoTsView.C3692a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo18946a(view, i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20333a(TTNativeAd tTNativeAd) {
        if (this.f9308m && this.f9299d != null) {
            this.f9299d.mo20396a(tTNativeAd);
        }
    }

    /* renamed from: a */
    public void mo20330a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.f9441K = i;
            this.f9442L = i2;
            C2975l.m8384b("CSJ_VIDEO_NativeController", "width=" + i + "height=" + i2);
        }
    }

    /* renamed from: a */
    private void m11944a(Context context) {
        View view;
        EnumSet<E> noneOf = EnumSet.noneOf(C2524b.C2525a.class);
        noneOf.add(C2524b.C2525a.hideCloseBtn);
        noneOf.add(C2524b.C2525a.hideBackBtn);
        if (this.f9308m) {
            view = m11954b(context);
        } else {
            view = LayoutInflater.from(context.getApplicationContext()).inflate(C2984t.m8433f(context, "tt_video_detail_layout"), (ViewGroup) null, false);
        }
        View view2 = view;
        if (view2 != null) {
            if (this.f9308m) {
                this.f9299d = new C3720d(context, view2, true, noneOf, this.f9300e, this, mo20250G());
            } else {
                this.f9299d = new C3712c(context, view2, true, noneOf, this.f9300e, this, false);
            }
            this.f9299d.mo20395a((C2523a) this);
        }
    }

    /* renamed from: b */
    private View m11954b(Context context) {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(C2984t.m8432e(context, "tt_root_view"));
        relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout2.setId(C2984t.m8432e(context, "tt_video_loading_retry_layout"));
        relativeLayout2.setBackgroundColor(0);
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        relativeLayout.addView(relativeLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        imageView.setId(C2984t.m8432e(context, "tt_video_loading_cover_image"));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams2);
        relativeLayout2.addView(imageView);
        ProgressBar progressBar = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        progressBar.setId(C2984t.m8432e(context, "tt_video_loading_progress"));
        layoutParams3.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams3);
        progressBar.setIndeterminateDrawable(C2984t.m8430c(context, "tt_video_loading_progress_bar"));
        relativeLayout2.addView(progressBar);
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(C2984t.m8432e(context, "tt_video_play"));
        layoutParams4.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(C2984t.m8431d(context, "tt_play_movebar_textpage"));
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView2);
        ViewStub viewStub = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        viewStub.setId(C2984t.m8432e(context, "tt_video_ad_cover"));
        viewStub.setLayoutParams(layoutParams5);
        viewStub.setLayoutResource(C2984t.m8433f(context, "tt_video_ad_cover_layout"));
        relativeLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        viewStub2.setId(C2984t.m8432e(context, "tt_video_draw_layout_viewStub"));
        viewStub2.setLayoutParams(layoutParams6);
        viewStub2.setLayoutResource(C2984t.m8433f(context, "tt_video_draw_btn_layout"));
        relativeLayout.addView(viewStub2);
        return relativeLayout;
    }

    public C3695b(Context context, ViewGroup viewGroup, C3498n nVar, String str, boolean z, boolean z2, boolean z3, C3167j jVar) {
        boolean z4 = false;
        this.f9464y = false;
        this.f9465z = false;
        this.f9431A = "embeded_ad";
        this.f9432B = false;
        this.f9433C = true;
        this.f9435E = false;
        this.f9436F = false;
        this.f9437G = true;
        this.f9438H = true;
        this.f9441K = 0;
        this.f9442L = 0;
        this.f9443M = 0;
        this.f9444N = false;
        this.f9445O = true;
        this.f9449S = new C2515a.C2516a() {
            /* renamed from: b */
            public void mo16329b(C2515a aVar, int i) {
            }

            /* renamed from: c */
            public void mo16330c(C2515a aVar) {
            }

            /* renamed from: d */
            public void mo16331d(C2515a aVar) {
            }

            /* renamed from: e */
            public void mo16332e(C2515a aVar) {
            }

            /* renamed from: a */
            public void mo16320a(C2515a aVar) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.m11986x();
                    }
                });
                C3695b.this.mo20329a(4);
            }

            /* renamed from: a */
            public void mo16324a(C2515a aVar, long j) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                            C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                            boolean unused = C3695b.this.f9444N = false;
                        }
                        if (!(!C3695b.this.f9308m || C3695b.this.f9440J == null || C3695b.this.f9440J.get() == null)) {
                            ((C3711a) C3695b.this.f9440J.get()).mo20298f();
                        }
                        C3695b.this.m11925L();
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                    }
                });
                C3695b.this.m11990z();
                long unused = C3695b.this.f9447Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo16328b(C2515a aVar) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (!(C3695b.this.f9439I == null || C3695b.this.f9439I.get() == null)) {
                            ((C2526c.C2530d) C3695b.this.f9439I.get()).mo16473e_();
                        }
                        if (!C3695b.this.f9463x) {
                            C3695b.this.m11990z();
                        }
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                        }
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                    }
                });
            }

            /* renamed from: a */
            public void mo16326a(C2515a aVar, final C2520a aVar2) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo16333a();
                        int b = aVar2.mo16334b();
                        C3695b.this.m11956b(a, b);
                        C2975l.m8391e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C3695b.this.mo20342u() || b == -1004) {
                            C2975l.m8391e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C3695b.this.m11965d(a, b)) {
                                C2975l.m8391e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C3695b.this.f9299d.mo16425a(C3695b.this.f9300e, (WeakReference<Context>) C3695b.this.f9303h, false);
                                C3695b.this.mo16443c(true);
                                C3695b.this.mo16448f();
                            }
                            if (C3695b.this.f9299d != null) {
                                C3695b.this.f9299d.mo16427b();
                            }
                            if (C3695b.this.f9462w != null) {
                                C3695b.this.f9462w.mo16465b(C3695b.this.f9461v, C2510a.m6215a(C3695b.this.f9301f, C3695b.this.f9312q));
                            }
                            if (C3695b.this.f9439I != null && C3695b.this.f9439I.get() != null && !C3695b.this.mo20342u()) {
                                ((C2526c.C2530d) C3695b.this.f9439I.get()).mo16472a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16327a(C2515a aVar, boolean z) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16322a(C2515a aVar, int i, int i2) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.m11917H();
                    }
                });
            }

            /* renamed from: a */
            public void mo16323a(C2515a aVar, int i, int i2, int i3) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo20410u();
                            C3695b.this.f9306k.postDelayed(C3695b.this.f9458s, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                            boolean unused = C3695b.this.f9444N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16321a(C2515a aVar, int i) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.f9299d.mo16427b();
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                        boolean unused = C3695b.this.f9444N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo16325a(C2515a aVar, long j, long j2) {
                if (Math.abs(j - C3695b.this.f9301f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C3695b.this.f9306k.post(new Runnable() {
                        public void run() {
                            C3695b.this.m11942a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f9450T = 0;
        this.f9451U = 0;
        this.f9458s = new Runnable() {
            public void run() {
                if (C3695b.this.f9299d != null) {
                    C3695b.this.f9299d.mo16425a(C3695b.this.f9300e, (WeakReference<Context>) C3695b.this.f9303h, false);
                    C3695b.this.f9299d.mo16427b();
                    C3695b.this.mo16443c(true);
                    C2975l.m8391e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f9452V = 0;
        this.f9453W = 0;
        this.f9455Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C3695b.this.mo16437b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = C2979o.m8409c(context);
                        }
                    }
                    C3695b.this.m11960c(context, i);
                }
            }
        };
        this.f9456Z = 1;
        this.f9457aa = false;
        this.f9456Z = C2979o.m8409c(context);
        mo16434a(z);
        this.f9431A = str;
        try {
            this.f9441K = viewGroup.getWidth();
            this.f9442L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f9459t = new WeakReference<>(viewGroup);
        this.f9303h = new WeakReference(context);
        this.f9300e = nVar;
        m11944a(context);
        this.f9463x = Build.VERSION.SDK_INT >= 17 ? true : z4;
        this.f9432B = z2;
        this.f9433C = z3;
        if (jVar != null) {
            this.f9448R = jVar;
        }
    }

    public C3695b(Context context, ViewGroup viewGroup, C3498n nVar, String str, boolean z, boolean z2, C3167j jVar) {
        boolean z3 = false;
        this.f9464y = false;
        this.f9465z = false;
        this.f9431A = "embeded_ad";
        this.f9432B = false;
        this.f9433C = true;
        this.f9435E = false;
        this.f9436F = false;
        this.f9437G = true;
        this.f9438H = true;
        this.f9441K = 0;
        this.f9442L = 0;
        this.f9443M = 0;
        this.f9444N = false;
        this.f9445O = true;
        this.f9449S = new C2515a.C2516a() {
            /* renamed from: b */
            public void mo16329b(C2515a aVar, int i) {
            }

            /* renamed from: c */
            public void mo16330c(C2515a aVar) {
            }

            /* renamed from: d */
            public void mo16331d(C2515a aVar) {
            }

            /* renamed from: e */
            public void mo16332e(C2515a aVar) {
            }

            /* renamed from: a */
            public void mo16320a(C2515a aVar) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.m11986x();
                    }
                });
                C3695b.this.mo20329a(4);
            }

            /* renamed from: a */
            public void mo16324a(C2515a aVar, long j) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                            C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                            boolean unused = C3695b.this.f9444N = false;
                        }
                        if (!(!C3695b.this.f9308m || C3695b.this.f9440J == null || C3695b.this.f9440J.get() == null)) {
                            ((C3711a) C3695b.this.f9440J.get()).mo20298f();
                        }
                        C3695b.this.m11925L();
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                    }
                });
                C3695b.this.m11990z();
                long unused = C3695b.this.f9447Q = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo16328b(C2515a aVar) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (!(C3695b.this.f9439I == null || C3695b.this.f9439I.get() == null)) {
                            ((C2526c.C2530d) C3695b.this.f9439I.get()).mo16473e_();
                        }
                        if (!C3695b.this.f9463x) {
                            C3695b.this.m11990z();
                        }
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                        }
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                    }
                });
            }

            /* renamed from: a */
            public void mo16326a(C2515a aVar, final C2520a aVar2) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        int a = aVar2.mo16333a();
                        int b = aVar2.mo16334b();
                        C3695b.this.m11956b(a, b);
                        C2975l.m8391e("CSJ_VIDEO_NativeController", "CALLBACK_ON_ERROR、、before isVideoPlaying、、、、、");
                        if (!C3695b.this.mo20342u() || b == -1004) {
                            C2975l.m8391e("CSJ_VIDEO_NativeController", "Video play error： errorcode,extra、、、、、、、" + a + "," + b);
                            if (C3695b.this.m11965d(a, b)) {
                                C2975l.m8391e("CSJ_VIDEO_NativeController", "Play video error，show result page、、、、、、、");
                                C3695b.this.f9299d.mo16425a(C3695b.this.f9300e, (WeakReference<Context>) C3695b.this.f9303h, false);
                                C3695b.this.mo16443c(true);
                                C3695b.this.mo16448f();
                            }
                            if (C3695b.this.f9299d != null) {
                                C3695b.this.f9299d.mo16427b();
                            }
                            if (C3695b.this.f9462w != null) {
                                C3695b.this.f9462w.mo16465b(C3695b.this.f9461v, C2510a.m6215a(C3695b.this.f9301f, C3695b.this.f9312q));
                            }
                            if (C3695b.this.f9439I != null && C3695b.this.f9439I.get() != null && !C3695b.this.mo20342u()) {
                                ((C2526c.C2530d) C3695b.this.f9439I.get()).mo16472a(a, b);
                            }
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16327a(C2515a aVar, boolean z) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo16427b();
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16322a(C2515a aVar, int i, int i2) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.m11917H();
                    }
                });
            }

            /* renamed from: a */
            public void mo16323a(C2515a aVar, int i, int i2, int i3) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        if (C3695b.this.f9299d != null) {
                            C3695b.this.f9299d.mo20410u();
                            C3695b.this.f9306k.postDelayed(C3695b.this.f9458s, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                            boolean unused = C3695b.this.f9444N = true;
                        }
                    }
                });
            }

            /* renamed from: a */
            public void mo16321a(C2515a aVar, int i) {
                C3695b.this.f9306k.post(new Runnable() {
                    public void run() {
                        C3695b.this.f9299d.mo16427b();
                        C3695b.this.f9306k.removeCallbacks(C3695b.this.f9458s);
                        boolean unused = C3695b.this.f9444N = false;
                    }
                });
            }

            /* renamed from: a */
            public void mo16325a(C2515a aVar, long j, long j2) {
                if (Math.abs(j - C3695b.this.f9301f) >= 50) {
                    final long j3 = j;
                    final long j4 = j2;
                    C3695b.this.f9306k.post(new Runnable() {
                        public void run() {
                            C3695b.this.m11942a(j3, j4);
                        }
                    });
                }
            }
        };
        this.f9450T = 0;
        this.f9451U = 0;
        this.f9458s = new Runnable() {
            public void run() {
                if (C3695b.this.f9299d != null) {
                    C3695b.this.f9299d.mo16425a(C3695b.this.f9300e, (WeakReference<Context>) C3695b.this.f9303h, false);
                    C3695b.this.f9299d.mo16427b();
                    C3695b.this.mo16443c(true);
                    C2975l.m8391e("CSJ_VIDEO_NativeController", "Show result page after error.......showAdCard");
                }
            }
        };
        this.f9452V = 0;
        this.f9453W = 0;
        this.f9455Y = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C3695b.this.mo16437b();
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    int i = 0;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                        if (networkInfo != null) {
                            int type = networkInfo.getType();
                            if (type == 1) {
                                i = 4;
                            } else if (type == 0) {
                                i = 1;
                            }
                        } else {
                            i = C2979o.m8409c(context);
                        }
                    }
                    C3695b.this.m11960c(context, i);
                }
            }
        };
        this.f9456Z = 1;
        this.f9457aa = false;
        this.f9456Z = C2979o.m8409c(context);
        try {
            this.f9441K = viewGroup.getWidth();
            this.f9442L = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        this.f9459t = new WeakReference<>(viewGroup);
        this.f9431A = str;
        this.f9303h = new WeakReference(context);
        this.f9300e = nVar;
        m11944a(context);
        this.f9463x = Build.VERSION.SDK_INT >= 17 ? true : z3;
        this.f9432B = z;
        this.f9433C = z2;
        if (jVar != null) {
            this.f9448R = jVar;
        }
    }

    /* renamed from: F */
    public C3720d mo16457o() {
        return this.f9299d;
    }

    /* renamed from: a */
    public void mo16432a(C2526c.C2530d dVar) {
        this.f9439I = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public boolean mo16436a(C2522c cVar) {
        mo16443c(false);
        C2975l.m8384b("tag_video_play", "[video] start NativeVideoController#playVideoUrl and video url is :\r\n" + cVar.mo16398j());
        if (TextUtils.isEmpty(cVar.mo16398j())) {
            C2975l.m8391e("tag_video_play", "[video] play video stop , because no video info");
            return false;
        }
        this.f9446P = cVar;
        m11927M();
        this.f9309n = cVar.mo16393f();
        if (!C3624o.m11478b(this.f9431A) || this.f9301f <= 0) {
            this.f9301f = cVar.mo16389e();
        }
        if (cVar.mo16389e() <= 0) {
            this.f9465z = false;
            this.f9464y = false;
        }
        if (cVar.mo16389e() > 0) {
            this.f9301f = cVar.mo16389e();
            this.f9302g = this.f9302g > this.f9301f ? this.f9302g : this.f9301f;
        }
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
            if (this.f9450T == 0) {
                this.f9299d.mo20375g();
            }
            this.f9299d.mo20401c(cVar.mo16383c(), cVar.mo16386d());
            this.f9299d.mo20402c((ViewGroup) this.f9459t.get());
            this.f9299d.mo20393a(cVar.mo16383c(), cVar.mo16386d());
        }
        if (!(this.f9298c != null || cVar.mo16400l() == -2 || cVar.mo16400l() == 1)) {
            this.f9298c = new C2495d();
        }
        if (this.f9298c != null) {
            this.f9298c.mo16277a(this.f9449S);
        }
        mo20244A();
        C2975l.m8384b("tag_video_play", "[video] new MediaPlayer");
        this.f9461v = 0;
        try {
            m11961c(cVar);
            return true;
        } catch (Exception e) {
            C2975l.m8391e("tag_video_play", "[video] invoke NativeVideoController#playVideo cause exception :" + e.toString());
            return false;
        }
    }

    /* renamed from: l */
    public int mo16454l() {
        return C2510a.m6215a(this.f9302g, this.f9312q);
    }

    /* renamed from: c */
    private void m11961c(C2522c cVar) {
        C2975l.m8384b("tag_video_play", "[video] NativeVideoController#playVideo has invoke !");
        if (cVar == null) {
            C2975l.m8384b("tag_video_play", "VideoUrlModel is null  !!!");
            return;
        }
        if (this.f9298c != null) {
            if (this.f9300e != null) {
                cVar.mo16388d(String.valueOf(C4014u.m13223f(this.f9300e)));
            }
            cVar.mo16384c(0);
            this.f9298c.mo16278a(cVar);
            C2975l.m8384b("tag_video_play", "[video] MediaPlayerProxy has setDataSource !");
        }
        this.f9460u = System.currentTimeMillis();
        if (!TextUtils.isEmpty(cVar.mo16398j())) {
            this.f9299d.mo20403d(8);
            this.f9299d.mo20403d(0);
            mo20251a((Runnable) new Runnable() {
                public void run() {
                    long unused = C3695b.this.f9460u = System.currentTimeMillis();
                    C3695b.this.f9299d.mo20370c(0);
                    if (C3695b.this.f9298c != null && C3695b.this.f9301f == 0) {
                        C3695b.this.f9298c.mo16280a(true, 0, C3695b.this.f9309n);
                    } else if (C3695b.this.f9298c != null) {
                        C3695b.this.f9298c.mo16280a(true, C3695b.this.f9301f, C3695b.this.f9309n);
                    }
                }
            });
        }
        if (this.f9308m) {
            mo20343v();
        }
    }

    /* renamed from: a */
    public void mo16431a(C2526c.C2528b bVar) {
        this.f9434D = new WeakReference<>(bVar);
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
        if (mo16456n() == null) {
            return 0;
        }
        return mo16456n().mo16296p();
    }

    /* renamed from: j */
    public long mo16452j() {
        if (mo16456n() == null) {
            return 0;
        }
        return mo16456n().mo16297q();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m11986x() {
        this.f9450T++;
        if (mo20246C() && this.f9299d != null) {
            this.f9299d.mo16427b();
            C2526c.C2527a aVar = this.f9462w;
            if (aVar != null) {
                aVar.mo16463a(this.f9461v, C2510a.m6215a(this.f9301f, this.f9312q));
            }
            this.f9461v = System.currentTimeMillis() - this.f9460u;
            if ((!C4014u.m13203b(this.f9300e) || this.f9450T >= 2) && this.f9438H) {
                this.f9299d.mo16425a(this.f9300e, (WeakReference<Context>) this.f9303h, true);
            }
            if (!this.f9465z) {
                this.f9465z = true;
                m11942a(this.f9312q, this.f9312q);
                long j = this.f9312q;
                this.f9301f = j;
                this.f9302g = j;
                C3150o.C3151a aVar2 = new C3150o.C3151a();
                aVar2.mo18721a(mo16449g());
                aVar2.mo18728c(mo16452j());
                aVar2.mo18725b(mo16450h());
                aVar2.mo18734f(mo16451i());
                C3133a.m9053b(this.f9299d, aVar2, this.f9448R);
            }
            if (!this.f9308m && this.f9311p) {
                mo16421e(this.f9299d, (View) null);
            }
            this.f9307l = true;
            if (C4014u.m13203b(this.f9300e) && this.f9450T < 2) {
                mo16407a();
            }
        }
    }

    /* renamed from: a */
    public void mo16430a(C2526c.C2527a aVar) {
        this.f9462w = aVar;
    }

    /* renamed from: b */
    public void mo16437b() {
        if (this.f9298c != null) {
            this.f9298c.mo16281b();
        }
        if (!this.f9465z && this.f9464y) {
            if (C3953b.m12901c()) {
                if (C3966a.m12974a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", true)) {
                    C3150o.C3151a aVar = new C3150o.C3151a();
                    aVar.mo18721a(mo16449g());
                    aVar.mo18728c(mo16452j());
                    aVar.mo18725b(mo16450h());
                    C3133a.m9042a((C2519a) this.f9299d, aVar);
                }
                C3966a.m12967a("sp_multi_single_app_data_class", "IsCanLoadPauseLog", (Boolean) true);
                return;
            }
            if (C3645t.m11590a().mo20224b()) {
                C3150o.C3151a aVar2 = new C3150o.C3151a();
                aVar2.mo18721a(mo16449g());
                aVar2.mo18728c(mo16452j());
                aVar2.mo18725b(mo16450h());
                C3133a.m9042a((C2519a) this.f9299d, aVar2);
            }
            C3645t.m11590a().mo20222a(true);
        }
    }

    /* renamed from: d */
    public void mo16444d() {
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
        }
        if (this.f9299d != null) {
            this.f9299d.mo20411v();
        }
        m11988y();
    }

    /* renamed from: h */
    public void mo20340h(boolean z) {
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
        }
        if (this.f9299d != null && z) {
            this.f9299d.mo20411v();
        }
        m11988y();
    }

    /* renamed from: y */
    private void m11988y() {
        C2975l.m8380a("CSJ_VIDEO_NativeController", "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.f9305j));
        if (this.f9298c != null) {
            if (this.f9298c.mo16293m()) {
                if (this.f9305j) {
                    mo20248E();
                } else {
                    mo20252b(this.f9313r);
                }
                C2975l.m8380a("CSJ_VIDEO_NativeController", "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.f9305j));
            } else {
                this.f9298c.mo16280a(false, this.f9301f, this.f9309n);
            }
        }
        if (this.f9464y) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18721a(mo16449g());
            aVar.mo18728c(mo16452j());
            aVar.mo18725b(mo16450h());
            C3133a.m9052b(mo16457o(), aVar);
        }
    }

    /* renamed from: d */
    public void mo20338d(long j) {
        this.f9301f = j;
        this.f9302g = this.f9302g > this.f9301f ? this.f9302g : this.f9301f;
        if (this.f9299d != null) {
            this.f9299d.mo16423a();
        }
        if (this.f9298c != null) {
            this.f9298c.mo16280a(true, this.f9301f, this.f9309n);
        }
    }

    /* renamed from: e */
    public void mo16446e() {
        mo16435a(true, 3);
    }

    /* renamed from: a */
    public void mo16435a(boolean z, int i) {
        if (this.f9308m) {
            this.f9451U = mo16452j();
            mo20329a(1);
        }
        if (!this.f9465z && this.f9464y) {
            if (z) {
                C3150o.C3151a aVar = new C3150o.C3151a();
                aVar.mo18721a(mo16449g());
                aVar.mo18728c(mo16452j());
                aVar.mo18725b(mo16450h());
                aVar.mo18732e(i);
                aVar.mo18734f(mo16451i());
                C3133a.m9043a((C2519a) this.f9299d, aVar, this.f9448R);
                this.f9465z = false;
            } else {
                C3150o.C3151a aVar2 = new C3150o.C3151a();
                aVar2.mo18721a(mo16449g());
                aVar2.mo18728c(mo16452j());
                aVar2.mo18725b(mo16450h());
                C3133a.m9042a((C2519a) this.f9299d, aVar2);
            }
        }
        mo16448f();
    }

    /* renamed from: f */
    public void mo16448f() {
        if (this.f9298c != null) {
            this.f9298c.mo16284d();
            this.f9298c = null;
        }
        if (!C4014u.m13203b(this.f9300e) || this.f9450T == 2) {
            if (this.f9438H) {
                this.f9299d.mo16425a(this.f9300e, (WeakReference<Context>) this.f9303h, true);
            } else {
                return;
            }
        }
        if (this.f9306k != null) {
            this.f9306k.removeCallbacksAndMessages((Object) null);
        }
        if (this.f9304i != null) {
            this.f9304i.clear();
        }
        if (this.f9308m) {
            mo20344w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m11990z() {
        if (!this.f9464y) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18722a(this.f9437G);
            aVar.mo18728c(mo16452j());
            C3133a.m9041a(C3578m.m11231a(), (C2519a) this.f9299d, aVar, this.f9448R);
            this.f9464y = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11956b(int i, int i2) {
        if (this.f9300e != null) {
            C3150o.C3151a aVar = new C3150o.C3151a();
            aVar.mo18725b(mo16450h());
            aVar.mo18728c(mo16452j());
            aVar.mo18721a(mo16449g());
            aVar.mo18720a(i);
            aVar.mo18724b(i2);
            C3133a.m9056c(mo16457o(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m11917H() {
        int i;
        int i2;
        C2975l.m8384b("ChangeVideoSize", "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (!(this.f9303h == null || this.f9303h.get() == null || m11918I() == null || this.f9298c == null || this.f9459t == null)) {
                if (this.f9459t.get() != null) {
                    int j = this.f9298c.mo16290j();
                    int k = this.f9298c.mo16291k();
                    int width = ((ViewGroup) this.f9459t.get()).getWidth();
                    int height = ((ViewGroup) this.f9459t.get()).getHeight();
                    if (width > 0 && height > 0 && k > 0) {
                        if (j > 0) {
                            if (j == k) {
                                i2 = width > height ? height : width;
                                i = i2;
                            } else if (j > k) {
                                i2 = (int) ((((double) width) * 1.0d) / ((double) ((((float) j) * 1.0f) / ((float) k))));
                                i = width;
                            } else {
                                i = (int) ((((double) height) * 1.0d) / ((double) ((((float) k) * 1.0f) / ((float) j))));
                                i2 = height;
                            }
                            if (i2 <= height) {
                                if (i2 > 0) {
                                    height = i2;
                                }
                            }
                            if (i <= width) {
                                if (i > 0) {
                                    width = i;
                                }
                            }
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(13);
                            if (m11918I() instanceof TextureView) {
                                ((TextureView) m11918I()).setLayoutParams(layoutParams);
                                C2975l.m8384b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                return;
                            } else if (m11918I() instanceof SurfaceView) {
                                ((SurfaceView) m11918I()).setLayoutParams(layoutParams);
                                C2975l.m8384b("ChangeVideoSize", "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    C2975l.m8384b("ChangeVideoSize", " container or video exist size <= 0");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[step-1] >>>>> mContextRef=");
            sb.append(this.f9303h);
            sb.append(",mContextRef.get()=");
            sb.append(this.f9303h != null ? (Context) this.f9303h.get() : null);
            sb.append(",getIRenderView() =");
            sb.append(m11918I());
            C2975l.m8384b("ChangeVideoSize", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z = true;
            sb2.append(this.f9298c == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f9298c == null) {
                z = false;
            }
            sb2.append(z);
            C2975l.m8384b("ChangeVideoSize", sb2.toString());
        } catch (Throwable th) {
            C2975l.m8384b("ChangeVideoSize", "[step-11] >>>>> changeVideoSize error !!!!! ：" + th.toString());
        }
    }

    /* renamed from: I */
    private C2540b m11918I() {
        if (this.f9303h == null || this.f9303h.get() == null || ((Context) this.f9303h.get()).getResources().getConfiguration().orientation != 1 || this.f9299d == null) {
            return null;
        }
        return this.f9299d.mo20406q();
    }

    /* renamed from: a */
    public void mo16413a(C2524b bVar, View view) {
        if (this.f9298c != null && mo20246C()) {
            if (this.f9298c.mo16292l()) {
                mo16437b();
                this.f9299d.mo20400b(true, false);
                this.f9299d.mo20374f();
            } else if (!this.f9298c.mo16293m()) {
                if (this.f9299d != null) {
                    this.f9299d.mo20402c((ViewGroup) this.f9459t.get());
                }
                mo20338d(this.f9301f);
                if (this.f9299d != null) {
                    this.f9299d.mo20400b(false, false);
                }
            } else {
                mo20340h(false);
                if (this.f9299d != null) {
                    this.f9299d.mo20400b(false, false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16408a(C2524b bVar, int i) {
        if (this.f9298c != null) {
            m11943a(this.f9454X, m11962c(i));
        }
    }

    /* renamed from: b */
    public void mo16415b(C2524b bVar, int i) {
        if (this.f9299d != null) {
            this.f9299d.mo20374f();
        }
    }

    /* renamed from: a */
    public void mo16409a(C2524b bVar, int i, boolean z) {
        if (mo20246C()) {
            long n = (long) ((((float) (((long) i) * this.f9312q)) * 1.0f) / ((float) C2984t.m8441n((Context) this.f9303h.get(), "tt_video_progress_max")));
            if (this.f9312q > 0) {
                this.f9454X = (long) ((int) n);
            } else {
                this.f9454X = 0;
            }
            if (this.f9299d != null) {
                this.f9299d.mo20358a(this.f9454X);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11942a(long j, long j2) {
        this.f9301f = j;
        this.f9312q = j2;
        this.f9299d.mo20359a(j, j2);
        this.f9299d.mo20357a(C2510a.m6215a(j, j2));
        try {
            if (this.f9462w != null) {
                this.f9462w.mo16464a(j, j2);
            }
        } catch (Throwable th) {
            C2975l.m8388c("CSJ_VIDEO_NativeController", "onProgressUpdate error: ", th);
        }
    }

    /* renamed from: b */
    public void mo16418b(C2524b bVar, View view) {
        mo20337b(bVar, view, false, false);
    }

    /* renamed from: b */
    public void mo20337b(C2524b bVar, View view, boolean z, boolean z2) {
        if (mo20246C()) {
            mo20253f(!this.f9311p);
            if (!(this.f9303h.get() instanceof Activity)) {
                C2975l.m8384b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9311p) {
                mo20336b(z ? 8 : 0);
                if (this.f9299d != null) {
                    this.f9299d.mo20362a((ViewGroup) this.f9459t.get());
                    this.f9299d.mo20371c(false);
                }
            } else {
                mo20336b(1);
                if (this.f9299d != null) {
                    this.f9299d.mo20367b((ViewGroup) this.f9459t.get());
                    this.f9299d.mo20371c(false);
                }
            }
            WeakReference<C2526c.C2528b> weakReference = this.f9434D;
            C2526c.C2528b bVar2 = weakReference != null ? (C2526c.C2528b) weakReference.get() : null;
            if (bVar2 != null) {
                bVar2.mo16466a(this.f9311p);
            }
        }
    }

    /* renamed from: b */
    public void mo20336b(int i) {
        if (mo20246C()) {
            boolean z = i == 0 || i == 8;
            Context context = (Context) this.f9303h.get();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    activity.setRequestedOrientation(i);
                } catch (Throwable unused) {
                }
                if (!z) {
                    activity.getWindow().setFlags(1024, 1024);
                } else {
                    activity.getWindow().clearFlags(1024);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16419c(C2524b bVar, View view) {
        if (this.f9299d != null) {
            this.f9299d.mo20377i();
        }
        mo16446e();
    }

    /* renamed from: a */
    public void mo16414a(C2524b bVar, View view, boolean z, boolean z2) {
        if (this.f9308m) {
            mo16437b();
        }
        if (z && !this.f9308m && !mo20341t()) {
            this.f9299d.mo20400b(!mo20342u(), false);
            this.f9299d.mo20366a(z2, true, false);
        }
        if (this.f9298c == null || !this.f9298c.mo16292l()) {
            this.f9299d.mo20374f();
            return;
        }
        this.f9299d.mo20374f();
        this.f9299d.mo20373e();
    }

    /* renamed from: d */
    public void mo16420d(C2524b bVar, View view) {
        if (this.f9311p) {
            mo20253f(false);
            if (this.f9299d != null) {
                this.f9299d.mo20367b((ViewGroup) this.f9459t.get());
            }
            mo20336b(1);
            return;
        }
        mo16446e();
    }

    /* renamed from: e */
    public void mo16421e(C2524b bVar, View view) {
        mo20332a(bVar, view, false);
    }

    /* renamed from: a */
    public void mo20332a(C2524b bVar, View view, boolean z) {
        m11921J();
    }

    /* renamed from: J */
    private void m11921J() {
        if (mo20246C()) {
            mo20253f(!this.f9311p);
            if (!(this.f9303h.get() instanceof Activity)) {
                C2975l.m8384b("CSJ_VIDEO_NativeController", "context is not activity, not support this function.");
                return;
            }
            if (this.f9299d != null) {
                this.f9299d.mo20367b((ViewGroup) this.f9459t.get());
                this.f9299d.mo20371c(false);
            }
            mo20336b(1);
            WeakReference<C2526c.C2528b> weakReference = this.f9434D;
            C2526c.C2528b bVar = weakReference != null ? (C2526c.C2528b) weakReference.get() : null;
            if (bVar != null) {
                bVar.mo16466a(this.f9311p);
            }
        }
    }

    /* renamed from: t */
    public boolean mo20341t() {
        return this.f9298c == null || this.f9298c.mo16288h();
    }

    /* renamed from: a */
    public void mo16407a() {
        if (C2979o.m8409c(C3578m.m11231a()) != 0) {
            mo16448f();
            C2522c cVar = this.f9446P;
            if (cVar != null) {
                cVar.mo16382b(this.f9300e.mo19622Y());
                this.f9446P.mo16374a(this.f9441K);
                this.f9446P.mo16381b(this.f9442L);
                this.f9446P.mo16378a((List<String>) null);
                this.f9446P.mo16385c(this.f9300e.mo19659ac());
                this.f9446P.mo16375a(0);
                this.f9446P.mo16379a(mo16458p());
                C2522c cVar2 = this.f9446P;
                cVar2.mo16376a(cVar2.mo16373a());
                mo16436a(this.f9446P);
                mo16443c(false);
            }
        }
    }

    /* renamed from: u */
    public boolean mo20342u() {
        return this.f9298c != null && this.f9298c.mo16292l();
    }

    /* renamed from: a */
    private void m11943a(long j, boolean z) {
        if (this.f9298c != null) {
            if (z) {
                m11923K();
            }
            this.f9298c.mo16273a(j);
        }
    }

    /* renamed from: c */
    private boolean m11962c(int i) {
        return this.f9299d.mo20369b(i);
    }

    /* renamed from: K */
    private void m11923K() {
        if (this.f9299d != null) {
            this.f9299d.mo20370c(0);
            this.f9299d.mo20365a(false, false);
            this.f9299d.mo20371c(false);
            this.f9299d.mo20373e();
            this.f9299d.mo20375g();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.nativevideo.b$6 */
    /* compiled from: NativeVideoController */
    static /* synthetic */ class C37106 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.widget.e$a[] r0 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9484a = r0
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.PAUSE_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9484a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.RELEASE_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9484a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.widget.e$a r1 = com.bytedance.sdk.openadsdk.core.widget.C3761e.C3763a.START_VIDEO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.C3695b.C37106.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo20277a(C3761e.C3763a aVar, String str) {
        int i = C37106.f9484a[aVar.ordinal()];
        if (i == 1) {
            mo16437b();
        } else if (i == 2) {
            mo16446e();
        } else if (i == 3) {
            mo16444d();
            this.f9310o = false;
            this.f9435E = true;
        }
    }

    /* renamed from: c */
    private boolean m11963c(int i, int i2) {
        if (i2 == 0) {
            mo16437b();
            this.f9310o = true;
            if (this.f9299d != null) {
                this.f9299d.mo16425a(this.f9300e, (WeakReference<Context>) this.f9303h, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.f9299d != null) {
                this.f9299d.mo16423a();
            }
            mo16437b();
            this.f9310o = true;
            this.f9435E = false;
            if (!(this.f9299d == null || this.f9300e == null)) {
                return this.f9299d.mo20398a(i, this.f9300e.mo19607J(), this.f9433C);
            }
        } else if (i2 == 4) {
            this.f9310o = false;
            if (this.f9299d != null) {
                this.f9299d.mo20408s();
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m11957b(Context context, int i) {
        if (mo20246C() && context != null && this.f9456Z != i) {
            this.f9456Z = i;
            if (!(i == 4 || i == 0)) {
                this.f9435E = false;
            }
            if (!this.f9435E && !mo16459q() && this.f9432B) {
                m11963c(2, i);
            }
            WeakReference<C3711a> weakReference = this.f9440J;
            if (weakReference != null && weakReference.get() != null) {
                ((C3711a) this.f9440J.get()).mo20295a(this.f9456Z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11960c(Context context, int i) {
        m11957b(context, i);
        if (i == 4) {
            this.f9310o = false;
        }
    }

    /* renamed from: a */
    public void mo20331a(Context context, int i) {
        m11957b(context, i);
        if (i == 4) {
            this.f9310o = false;
            mo16444d();
        }
    }

    /* renamed from: v */
    public void mo20343v() {
        if (!this.f9457aa && this.f9445O) {
            Context applicationContext = C3578m.m11231a().getApplicationContext();
            this.f9457aa = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                applicationContext.registerReceiver(this.f9455Y, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: w */
    public void mo20344w() {
        if (this.f9457aa && this.f9445O) {
            Context applicationContext = C3578m.m11231a().getApplicationContext();
            this.f9457aa = false;
            try {
                applicationContext.unregisterReceiver(this.f9455Y);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo20335a(C3711a aVar) {
        this.f9440J = new WeakReference<>(aVar);
    }

    /* renamed from: c */
    public void mo16443c(boolean z) {
        this.f9307l = z;
    }

    /* renamed from: d */
    public void mo16445d(boolean z) {
        this.f9437G = z;
    }

    /* renamed from: r */
    public boolean mo16460r() {
        return this.f9444N;
    }

    /* renamed from: e */
    public void mo16447e(boolean z) {
        this.f9445O = z;
    }

    /* renamed from: b */
    public void mo16439b(C2522c cVar) {
        this.f9446P = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m11965d(int i, int i2) {
        C2975l.m8384b("TTVideoLandingPage", "OnError - Error code: " + i + " Extra code: " + i2);
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* renamed from: k */
    public long mo16453k() {
        return mo16449g() + mo16450h();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m11925L() {
        if (this.f9300e != null) {
            C3578m.m11240g().mo20785a(C3909e.m12827a(this.f9300e.mo19617T(), true, this.f9300e));
        }
    }

    /* renamed from: M */
    private void m11927M() {
        if (this.f9303h != null) {
            C3133a.m9049a(this.f9300e, (C2519a) this.f9299d, this.f9446P);
        }
    }
}
