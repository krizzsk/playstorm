package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p333c.C8738a;
import com.mbridge.msdk.mbnative.p334d.C8775b;
import com.mbridge.msdk.mbsignalcommon.base.C8793a;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8818a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.C8833a;
import com.mbridge.msdk.nativex.listener.C8834b;
import com.mbridge.msdk.nativex.view.MediaViewPlayerView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.C8874a;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9572h;
import com.mbridge.msdk.videocommon.download.C9581k;
import com.mbridge.msdk.videocommon.listener.C9584a;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.C9587a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "MBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* renamed from: o */
    private static int f21489o = 2;

    /* renamed from: p */
    private static int f21490p = 1;

    /* renamed from: A */
    private WindVaneWebViewForNV f21491A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public WindVaneWebViewForNV f21492B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public MyImageView f21493C;

    /* renamed from: D */
    private ProgressBar f21494D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public View f21495E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public BaseView f21496F;

    /* renamed from: G */
    private RelativeLayout f21497G;

    /* renamed from: H */
    private RelativeLayout f21498H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public TextView f21499I;

    /* renamed from: J */
    private ProgressBar f21500J;

    /* renamed from: K */
    private RelativeLayout f21501K;

    /* renamed from: L */
    private int f21502L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f21503M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public CampaignEx f21504N;

    /* renamed from: O */
    private int f21505O;

    /* renamed from: P */
    private int f21506P;

    /* renamed from: Q */
    private double f21507Q;

    /* renamed from: R */
    private double f21508R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f21509S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f21510T;

    /* renamed from: U */
    private C8858e f21511U;

    /* renamed from: V */
    private SensorManager f21512V;

    /* renamed from: W */
    private Sensor f21513W;

    /* renamed from: a */
    private boolean f21514a = true;

    /* renamed from: aa */
    private C9552a f21515aa = null;
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public C8854a f21516ab = null;

    /* renamed from: ac */
    private OnMBMediaViewListener f21517ac;

    /* renamed from: ad */
    private OnMBMediaViewListenerPlus f21518ad;

    /* renamed from: ae */
    private int f21519ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f21520af = false;

    /* renamed from: ag */
    private boolean f21521ag = false;

    /* renamed from: ah */
    private RelativeLayout f21522ah;

    /* renamed from: ai */
    private ImageView f21523ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f21524aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f21525ak = false;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public Context f21526al;

    /* renamed from: am */
    private boolean f21527am = false;

    /* renamed from: an */
    private Runnable f21528an = new Runnable() {
        public final void run() {
            try {
                if (!MBMediaView.this.f21535h) {
                    if (!MBMediaView.this.m25732a((View) MBMediaView.this)) {
                        MBMediaView.m25718S(MBMediaView.this);
                    } else {
                        MBMediaView.m25719T(MBMediaView.this);
                    }
                }
                MBMediaView.this.f21503M.postDelayed(this, 300);
            } catch (Exception e) {
                C8608u.m24884d(MBMediaView.TAG, e.getMessage());
            }
        }
    };

    /* renamed from: b */
    private boolean f21529b = true;

    /* renamed from: c */
    private boolean f21530c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21531d = true;

    /* renamed from: e */
    private boolean f21532e = true;

    /* renamed from: f */
    private boolean f21533f = false;

    /* renamed from: g */
    private boolean f21534g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21535h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f21536i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f21537j = false;

    /* renamed from: k */
    private boolean f21538k = true;

    /* renamed from: l */
    private boolean f21539l = true;

    /* renamed from: m */
    private ArrayList<String> f21540m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<String> f21541n = new ArrayList<>();

    /* renamed from: q */
    private boolean f21542q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f21543r = false;

    /* renamed from: s */
    private AdSession f21544s = null;

    /* renamed from: t */
    private AdEvents f21545t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public MediaEvents f21546u = null;

    /* renamed from: v */
    private int f21547v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public MediaViewPlayerView f21548w;

    /* renamed from: x */
    private RelativeLayout f21549x;

    /* renamed from: y */
    private RelativeLayout f21550y;

    /* renamed from: z */
    private RelativeLayout f21551z;

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$a */
    private enum C8854a {
        BIG_IMAGE,
        f21573b,
        GIF
    }

    public void handlerPlayableException(Object obj, String str) {
    }

    public void notifyCloseBtn(Object obj, String str) {
    }

    public void onPlayProgressMS(int i, int i2) {
    }

    public void setOrientation(Object obj, String str) {
    }

    public MBMediaView(Context context) {
        super(context);
        m25726a(context);
    }

    public MBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25726a(context);
    }

    /* renamed from: a */
    private void m25726a(Context context) {
        try {
            m25743c();
            m25736b();
            this.f21526al = context;
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: a */
    private void m25725a() {
        C9552a aVar = this.f21515aa;
        if (aVar != null) {
            aVar.mo63201b((C9584a) null);
        }
    }

    /* renamed from: b */
    private void m25736b() {
        int a = C8594o.m24812a(getContext(), "mbridge_nativex_mbmediaview", "layout");
        if (a == -1) {
            C8608u.m24884d(TAG, "can not find mediaview resource");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(a, (ViewGroup) null);
        this.f21550y = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f21549x = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.f21493C = (MyImageView) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_my_big_img", "id"));
        this.f21494D = (ProgressBar) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_native_pb", "id"));
        this.f21551z = (RelativeLayout) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f21491A = (WindVaneWebViewForNV) inflate.findViewById(C8594o.m24812a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f21550y.setClickable(true);
        addView(inflate, -1, -1);
    }

    /* renamed from: c */
    private void m25743c() {
        this.f21503M = new Handler() {
            public final void handleMessage(Message message) {
                if (message != null) {
                    try {
                        int i = message.what;
                        if (i == 1) {
                            MBMediaView.this.m25775q();
                        } else if (i == 3) {
                            Object obj = message.obj;
                            if (obj != null && (obj instanceof View)) {
                                if (MBMediaView.this.m25732a((View) obj)) {
                                    MBMediaView.m25739b(MBMediaView.this);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f21530c) {
                SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                this.f21512V = sensorManager;
                this.f21513W = sensorManager.getDefaultSensor(1);
                C8858e eVar = new C8858e();
                this.f21511U = eVar;
                this.f21512V.registerListener(eVar, this.f21513W, 2);
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            this.f21534g = isHardwareAccelerated();
        }
        this.f21524aj = getOrientation();
        m25748d();
        this.f21503M.postDelayed(this.f21528an, 300);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f21544s != null) {
                if (this.f21548w != null) {
                    this.f21548w.unregisterView();
                }
                this.f21544s.finish();
                this.f21544s = null;
            }
            if (this.f21546u != null) {
                this.f21546u = null;
            }
            if (this.f21545t != null) {
                this.f21545t = null;
            }
            this.f21503M.removeCallbacks(this.f21528an);
            if (this.f21503M != null) {
                this.f21503M.removeCallbacksAndMessages((Object) null);
            }
            if (!(this.f21512V == null || this.f21511U == null)) {
                this.f21512V.unregisterListener(this.f21511U);
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return;
        }
        m25725a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            this.f21532e = z;
            if (this.f21516ab == C8854a.f21573b && this.f21548w != null) {
                this.f21548w.setIsFrontDesk(z);
            }
            if (this.f21535h) {
                if (this.f21548w == null) {
                    C8608u.m24884d(TAG, "fullscreen playerview is null return");
                } else if (!this.f21532e) {
                    this.f21548w.pause();
                } else if (this.f21548w.isPlaying()) {
                    C8608u.m24882b(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                } else if (this.f21548w != null && !this.f21548w.isComplete() && !this.f21548w.getIsActiviePause()) {
                    this.f21548w.onClickPlayButton();
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return;
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            this.f21505O = getHeight();
            int width = getWidth();
            this.f21506P = width;
            if (width == 0) {
                this.f21506P = getMeasuredWidth();
            }
            if (this.f21505O == 0) {
                this.f21505O = getMeasuredHeight();
            }
            if (this.f21506P == 0 && this.f21505O == 0) {
                this.f21506P = (int) m25694A();
            }
            if (this.f21516ab == C8854a.f21573b && !this.f21535h) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.f21505O == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.f21505O = (int) ((((double) this.f21506P) * this.f21508R) / this.f21507Q);
                }
                m25757h();
            } else if (this.f21516ab == C8854a.BIG_IMAGE && !this.f21535h) {
                m25753f();
            } else if (this.f21516ab == C8854a.GIF && !this.f21535h) {
                m25756g();
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9 A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNativeAd(com.mbridge.msdk.out.Campaign r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x000c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            if (r0 != r9) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r8.f21532e = r0     // Catch:{ all -> 0x0110 }
            r8.f21534g = r0     // Catch:{ all -> 0x0110 }
            r0 = 0
            r8.f21535h = r0     // Catch:{ all -> 0x0110 }
            r8.f21536i = r0     // Catch:{ all -> 0x0110 }
            r8.f21537j = r0     // Catch:{ all -> 0x0110 }
            r8.f21543r = r0     // Catch:{ all -> 0x0110 }
            r8.m25792y()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = (com.mbridge.msdk.foundation.entity.CampaignEx) r9     // Catch:{ all -> 0x0110 }
            r8.f21504N = r9     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx$b r9 = r9.getMediaViewHolder()     // Catch:{ all -> 0x0110 }
            if (r9 != 0) goto L_0x0039
            com.mbridge.msdk.foundation.entity.CampaignEx$b r9 = new com.mbridge.msdk.foundation.entity.CampaignEx$b     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.util.Map r0 = r0.getAdvImpList()     // Catch:{ all -> 0x0110 }
            r9.f20175l = r0     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            r0.setMediaViewHolder(r9)     // Catch:{ all -> 0x0110 }
        L_0x0039:
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            int r9 = r9.getAdType()     // Catch:{ all -> 0x0110 }
            r0 = 94
            if (r9 == r0) goto L_0x0073
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            int r9 = r9.getAdType()     // Catch:{ all -> 0x0110 }
            r0 = 287(0x11f, float:4.02E-43)
            if (r9 != r0) goto L_0x004e
            goto L_0x0073
        L_0x004e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getBidToken()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0110 }
            goto L_0x0097
        L_0x0073:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getRequestId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0110 }
        L_0x0097:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9556c.getInstance()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r8.m25771o()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.videocommon.download.a r9 = r0.mo63224a(r1, r9)     // Catch:{ all -> 0x0110 }
            r8.f21515aa = r9     // Catch:{ all -> 0x0110 }
            boolean r9 = r8.f21542q     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00ca
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = r8.f21544s     // Catch:{ all -> 0x0110 }
            r0 = 0
            if (r9 == 0) goto L_0x00be
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r9 = r8.f21548w     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00b7
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r9 = r8.f21548w     // Catch:{ all -> 0x0110 }
            r9.unregisterView()     // Catch:{ all -> 0x0110 }
        L_0x00b7:
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = r8.f21544s     // Catch:{ all -> 0x0110 }
            r9.finish()     // Catch:{ all -> 0x0110 }
            r8.f21544s = r0     // Catch:{ all -> 0x0110 }
        L_0x00be:
            com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r9 = r8.f21546u     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00c4
            r8.f21546u = r0     // Catch:{ all -> 0x0110 }
        L_0x00c4:
            com.iab.omid.library.mmadbridge.adsession.AdEvents r9 = r8.f21545t     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00ca
            r8.f21545t = r0     // Catch:{ all -> 0x0110 }
        L_0x00ca:
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x0108
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            boolean r9 = r9.isActiveOm()     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x0108
            android.content.Context r0 = r8.getContext()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r9.getOmid()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r9.getRequestId()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = r9.getId()     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = r8.m25771o()     // Catch:{ all -> 0x0110 }
            java.lang.String r6 = ""
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21504N     // Catch:{ all -> 0x0110 }
            java.lang.String r7 = r9.getRequestIdNotice()     // Catch:{ all -> 0x0110 }
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = com.mbridge.msdk.p051a.C2265b.m5114a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0110 }
            r8.f21544s = r9     // Catch:{ all -> 0x0110 }
        L_0x0108:
            boolean r9 = r8.f21542q     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x011a
            r8.m25748d()     // Catch:{ all -> 0x0110 }
            goto L_0x011a
        L_0x0110:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBMediaView"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r9)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.setNativeAd(com.mbridge.msdk.out.Campaign):void");
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f21517ac = onMBMediaViewListener;
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f21518ad = onMBMediaViewListenerPlus;
    }

    public void setIsAllowFullScreen(boolean z) {
        this.f21531d = z;
    }

    public void setAllowVideoRefresh(boolean z) {
        this.f21514a = z;
    }

    public void setAllowLoopPlay(boolean z) {
        this.f21529b = z;
    }

    public void setAllowScreenChange(boolean z) {
        this.f21530c = z;
    }

    public void destory() {
        try {
            if (this.f21548w != null) {
                this.f21548w.release();
            }
            m25725a();
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: d */
    private void m25748d() {
        try {
            this.f21516ab = m25722a(true);
            changeNoticeURL();
            if (this.f21516ab == C8854a.BIG_IMAGE) {
                if (!(this.f21504N == null || !TextUtils.isEmpty(this.f21504N.getVideoUrlEncode()) || this.f21544s == null)) {
                    this.f21544s.registerAdView(this.f21493C);
                    this.f21545t = AdEvents.createAdEvents(this.f21544s);
                    this.f21544s.start();
                    if (this.f21545t != null) {
                        this.f21545t.impressionOccurred();
                    }
                }
                m25762j();
                m25768m();
            } else if (this.f21516ab == C8854a.f21573b) {
                m25752e();
            } else if (this.f21516ab == C8854a.GIF) {
                m25769n();
                m25766l();
            }
        } catch (Exception e) {
            C8608u.m24880a("omsdk", e.getMessage());
        } catch (Throwable th) {
            C8608u.m24881a(TAG, th.getMessage(), th);
            return;
        }
        this.f21542q = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25752e() {
        m25793z();
        m25764k();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25753f() {
        try {
            if (this.f21516ab == C8854a.BIG_IMAGE && this.f21506P != 0 && this.f21510T != 0 && this.f21509S != 0) {
                int i = (this.f21506P * this.f21510T) / this.f21509S;
                if (this.f21493C != null && i != 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21493C.getLayoutParams();
                    layoutParams.width = this.f21506P;
                    layoutParams.height = i;
                    this.f21493C.setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25756g() {
        try {
            if (this.f21516ab != C8854a.GIF) {
                return;
            }
            if (this.f21506P != 0 && this.f21510T != 0 && this.f21509S != 0) {
                int i = (this.f21506P * this.f21510T) / this.f21509S;
                if (this.f21551z != null && i != 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21551z.getLayoutParams();
                    layoutParams.width = this.f21506P;
                    layoutParams.height = i;
                    layoutParams.addRule(13);
                    this.f21551z.setLayoutParams(layoutParams);
                }
            } else if (this.f21506P != 0 && this.f21551z != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f21551z.getLayoutParams();
                layoutParams2.width = this.f21506P;
                layoutParams2.height = (this.f21506P * 627) / IronSourceConstants.RV_INSTANCE_LOAD_FAILED;
                layoutParams2.addRule(13);
                this.f21551z.setLayoutParams(layoutParams2);
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m25757h() {
        try {
            if (this.f21516ab == C8854a.f21573b && this.f21549x != null) {
                int A = (int) m25694A();
                int j = C8613y.m24954j(getContext());
                if (!this.f21535h) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21549x.getLayoutParams();
                    layoutParams.width = this.f21506P;
                    layoutParams.height = this.f21505O;
                    layoutParams.addRule(13);
                    this.f21549x.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f21497G.getLayoutParams();
                    layoutParams2.width = A;
                    layoutParams2.height = j;
                    layoutParams2.addRule(13);
                    this.f21497G.setLayoutParams(layoutParams2);
                }
                m25775q();
                if (!this.f21535h) {
                    m25727a((View) this.f21548w, (float) this.f21506P, (float) this.f21505O);
                } else {
                    m25727a((View) this.f21548w, (float) A, (float) j);
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: i */
    private void m25759i() {
        try {
            this.f21548w.showSoundIndicator(this.f21539l);
            this.f21548w.showProgressView(this.f21538k);
            if (this.f21517ac != null) {
                this.f21517ac.onExitFullscreen();
            }
            if (this.f21518ad != null) {
                this.f21518ad.onExitFullscreen();
            }
            if (this.f21546u != null) {
                this.f21546u.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58334a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !this.f21540m.contains(str)) {
                this.f21540m.add(str);
                if (this.f21517ac != null) {
                    this.f21517ac.onVideoStart();
                }
                if (this.f21518ad != null) {
                    this.f21518ad.onVideoStart();
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58335b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !this.f21541n.contains(str)) {
                this.f21541n.add(str);
                if (this.f21518ad != null) {
                    this.f21518ad.onVideoComplete();
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: j */
    private void m25762j() {
        try {
            C8613y.m24922a((ImageView) this.f21493C);
            this.f21493C.setVisibility(0);
            this.f21549x.setVisibility(8);
            this.f21551z.setVisibility(8);
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: k */
    private void m25764k() {
        try {
            this.f21549x.setVisibility(0);
            this.f21493C.setVisibility(8);
            this.f21551z.setVisibility(8);
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m25766l() {
        try {
            this.f21549x.setVisibility(8);
            this.f21493C.setVisibility(8);
            this.f21551z.setVisibility(0);
            this.f21491A.setVisibility(0);
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: m */
    private void m25768m() {
        try {
            if (this.f21504N != null) {
                String imageUrl = this.f21504N.getImageUrl();
                if (!C8556ac.m24737a(imageUrl) && getContext() != null) {
                    C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57506a(imageUrl, (C8428c) new C8428c() {
                        public final void onFailedLoad(String str, String str2) {
                        }

                        public final void onSuccessLoad(Bitmap bitmap, String str) {
                            if (MBMediaView.this.f21493C != null && MBMediaView.this.f21516ab == C8854a.BIG_IMAGE) {
                                if (bitmap != null) {
                                    int unused = MBMediaView.this.f21509S = bitmap.getWidth();
                                    int unused2 = MBMediaView.this.f21510T = bitmap.getHeight();
                                    MBMediaView.this.f21493C.setImageUrl(str);
                                    MBMediaView.this.f21493C.setImageBitmap(bitmap);
                                }
                                MBMediaView.this.f21493C.setOnClickListener(new C9587a() {
                                    /* access modifiers changed from: protected */
                                    /* renamed from: a */
                                    public final void mo58122a(View view) {
                                        if (MBMediaView.this.f21526al != null) {
                                            MBMediaView.this.m25737b(MBMediaView.this.f21526al);
                                        } else {
                                            MBMediaView.this.m25737b(view.getContext());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: n */
    private void m25769n() {
        try {
            if (this.f21504N != null) {
                String gifUrl = this.f21504N.getGifUrl();
                if (!C8556ac.m24737a(gifUrl) && getContext() != null) {
                    this.f21491A.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", "utf-8", (String) null);
                    this.f21491A.setInterceptTouch(true);
                    this.f21551z.setOnClickListener(new C9587a() {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public final void mo58122a(View view) {
                            if (MBMediaView.this.f21526al != null) {
                                MBMediaView mBMediaView = MBMediaView.this;
                                mBMediaView.m25737b(mBMediaView.f21526al);
                            } else {
                                MBMediaView.this.m25737b(view.getContext());
                            }
                            C8608u.m24882b(MBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
                        }
                    });
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public String m25771o() {
        try {
            if (this.f21504N == null || !C8556ac.m24738b(this.f21504N.getCampaignUnitId())) {
                return null;
            }
            return this.f21504N.getCampaignUnitId();
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private C8854a m25722a(boolean z) {
        C8854a aVar = null;
        try {
            if (this.f21504N == null) {
                return null;
            }
            if (C8556ac.m24737a(this.f21504N.getVideoUrlEncode())) {
                if (C8556ac.m24738b(this.f21504N.getImageUrl())) {
                    aVar = C8854a.BIG_IMAGE;
                }
                if (!C8556ac.m24738b(this.f21504N.getGifUrl())) {
                    return aVar;
                }
                if (C8556ac.m24737a(this.f21504N.getImageUrl())) {
                    aVar = C8854a.GIF;
                }
                this.f21491A.setWebViewClient(new C8862g(this));
                m25769n();
                return aVar;
            } else if (Build.VERSION.SDK_INT < 14 || !this.f21534g || this.f21515aa == null) {
                return C8854a.BIG_IMAGE;
            } else {
                if (C8556ac.m24738b(this.f21504N.getVideoUrlEncode()) && C8556ac.m24737a(this.f21504N.getImageUrl())) {
                    return C8854a.f21573b;
                }
                if (!C8556ac.m24738b(this.f21504N.getVideoUrlEncode()) || !C8556ac.m24738b(this.f21504N.getImageUrl())) {
                    return null;
                }
                if (C9581k.m27504a(this.f21515aa, m25779s())) {
                    return C8854a.f21573b;
                }
                C8854a aVar2 = C8854a.BIG_IMAGE;
                if (!z || !this.f21514a) {
                    return aVar2;
                }
                this.f21515aa.mo63201b((C9584a) new C8861f(this));
                return aVar2;
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return C8854a.BIG_IMAGE;
        }
    }

    /* renamed from: p */
    private void m25773p() {
        try {
            if (this.f21504N == null) {
                C8608u.m24882b(TAG, "campaign is null addPlayerView return");
            }
            if (!(this.f21548w == null || this.f21548w.getParent() == null)) {
                ((ViewGroup) this.f21548w.getParent()).removeView(this.f21548w);
            }
            m25764k();
            MediaViewPlayerView mediaViewPlayerView = new MediaViewPlayerView(getContext());
            this.f21548w = mediaViewPlayerView;
            mediaViewPlayerView.showProgressView(this.f21538k);
            this.f21548w.showSoundIndicator(this.f21539l);
            if (this.f21533f) {
                this.f21548w.openSound();
            } else {
                this.f21548w.closeSound();
            }
            this.f21548w.setAllowLoopPlay(this.f21529b);
            this.f21548w.initPlayerViewData(m25777r(), this.f21504N, m25784u(), this, this.f21515aa, m25771o());
            this.f21548w.setOnMediaViewPlayerViewListener(new C8856c(this));
            this.f21549x.addView(this.f21548w, -1, -1);
            if (this.f21548w != null) {
                this.f21548w.setOnClickListener(new C9587a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58122a(View view) {
                        try {
                            if (!MBMediaView.this.f21535h) {
                                MBMediaView.m25749d(MBMediaView.this);
                            }
                            MBMediaView.this.f21548w.showSoundIndicator(true);
                            MBMediaView.this.f21548w.showProgressView(true);
                            if (MBMediaView.this.f21531d && !MBMediaView.this.f21535h && (MBMediaView.this.f21495E == null || MBMediaView.this.f21495E.getParent() == null)) {
                                if (!MBMediaView.this.f21548w.halfLoadingViewisVisible()) {
                                    if (MBMediaView.this.f21548w.isPlaying()) {
                                        MBMediaView.m25758h(MBMediaView.this);
                                        return;
                                    }
                                }
                                C8608u.m24882b(MBMediaView.TAG, "is loading or no playing return;");
                            } else if (MBMediaView.this.f21535h) {
                                C8608u.m24882b(MBMediaView.TAG, "fullScreenShowUI");
                                MBMediaView.m25760i(MBMediaView.this);
                            } else {
                                if (MBMediaView.this.f21526al != null) {
                                    MBMediaView.this.m25737b(MBMediaView.this.f21526al);
                                } else {
                                    MBMediaView.this.m25737b(view.getContext());
                                }
                                if (MBMediaView.this.f21546u != null) {
                                    MBMediaView.this.f21546u.adUserInteraction(InteractionType.CLICK);
                                }
                            }
                        } catch (Throwable th) {
                            C8608u.m24881a(MBMediaView.TAG, th.getMessage(), th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return;
        }
        if (this.f21544s != null) {
            if (this.f21548w != null) {
                this.f21548w.registerView(this.f21544s);
            }
            this.f21545t = AdEvents.createAdEvents(this.f21544s);
            this.f21546u = MediaEvents.createMediaEvents(this.f21544s);
            this.f21544s.start();
            this.f21545t.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            this.f21548w.setVideoEvents(this.f21546u);
            try {
                if (this.f21545t != null) {
                    this.f21545t.impressionOccurred();
                }
            } catch (Exception e) {
                C8608u.m24880a("omsdk", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m25775q() {
        try {
            if (getVisibility() == 0) {
                if (m25732a((View) this)) {
                    int i = 0;
                    C2294d t = m25781t();
                    if (t != null) {
                        i = t.mo15590d();
                    }
                    Message obtainMessage = this.f21503M.obtainMessage();
                    obtainMessage.what = 3;
                    obtainMessage.obj = this;
                    this.f21503M.sendMessageDelayed(obtainMessage, (long) (i * 1000));
                }
                if (this.f21516ab != C8854a.f21573b) {
                    return;
                }
                if (this.f21548w == null) {
                    m25773p();
                } else if (this.f21504N != this.f21548w.getCampaign()) {
                    this.f21548w.release();
                    m25773p();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: r */
    private String m25777r() {
        try {
            if (this.f21504N == null) {
                return null;
            }
            if (this.f21515aa != null && this.f21515aa.mo63211f() == 5) {
                String d = this.f21515aa.mo63207d();
                if (new File(d).exists() && this.f21515aa.mo63209e() == C8613y.m24914a(new File(d))) {
                    return d;
                }
            }
            String videoUrlEncode = this.f21504N.getVideoUrlEncode();
            if (C8556ac.m24738b(videoUrlEncode)) {
                return videoUrlEncode;
            }
            return null;
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25732a(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0) {
                    Rect rect = new Rect();
                    if (!view.getLocalVisibleRect(rect)) {
                        return false;
                    }
                    long height = (long) (rect.height() * rect.width());
                    long height2 = (long) (view.getHeight() * view.getWidth());
                    long j = (long) (((float) height2) * 0.5f);
                    if (height2 > 0 && C8613y.m24957l(getContext()) && this.f21532e && height >= j && isShown()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(TAG, th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: s */
    private int m25779s() {
        if (m25781t() != null) {
            return m25781t().mo15591e();
        }
        return 100;
    }

    /* renamed from: t */
    private C2294d m25781t() {
        try {
            if (this.f21504N == null) {
                return null;
            }
            if (C8556ac.m24737a(this.f21504N.getCampaignUnitId())) {
                return null;
            }
            String campaignUnitId = this.f21504N.getCampaignUnitId();
            String h = C2350a.m5601e().mo15793h();
            if (!C8556ac.m24737a(campaignUnitId)) {
                if (!C8556ac.m24737a(h)) {
                    C2294d e = C2283b.m5275a().mo15569e(h, campaignUnitId);
                    if (e != null) {
                        return e;
                    }
                    return C2294d.m5325d(campaignUnitId);
                }
            }
            return C2294d.m5325d(campaignUnitId);
        } catch (Exception e2) {
            C8608u.m24884d(TAG, e2.getMessage());
            return null;
        }
    }

    /* renamed from: u */
    private boolean m25784u() {
        try {
            C2294d t = m25781t();
            if (t == null) {
                return false;
            }
            int i = t.mo15596i();
            if (i == 1) {
                if (C8613y.m24934b(getContext())) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                return false;
            } else {
                if (i == 3) {
                    if (C8613y.m24939c(getContext())) {
                        return true;
                    }
                    return false;
                } else if (C8613y.m24934b(getContext())) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    public void onPlayStarted(int i) {
        MediaEvents mediaEvents = this.f21546u;
        if (mediaEvents != null) {
            try {
                mediaEvents.start((float) i, this.f21533f ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e) {
                C8608u.m24880a("omsdk", e.getMessage());
            }
        }
    }

    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.f21546u;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    public void onPlayError(final String str) {
        try {
            C8608u.m24882b("error", str);
            C884215 r0 = new Runnable() {
                public final void run() {
                    MBMediaView.m25778r(MBMediaView.this);
                    MBMediaView.m25731a(MBMediaView.this, str);
                    NativeController.insertExcludeId(MBMediaView.this.f21504N.getCampaignUnitId(), MBMediaView.this.f21504N);
                }
            };
            if (C2358b.m5644a().mo15829d()) {
                C8442b.m24388a().execute(r0);
            } else {
                r0.run();
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    public void onBufferingStart(String str) {
        C8608u.m24882b("bufferMsg", str);
        MediaEvents mediaEvents = this.f21546u;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    public void onBufferingEnd() {
        C8608u.m24882b("bufferend", "bufferend");
        MediaEvents mediaEvents = this.f21546u;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    public void onPlaySetDataSourceError(String str) {
        C8608u.m24882b("errorstr", str);
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$10 */
    static /* synthetic */ class C883610 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21553a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a[] r0 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21553a = r0
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.FULL_MIDDLE_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21553a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8873a.FULL_TOP_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.C883610.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public View m25785v() {
        try {
            this.f21522ah = new RelativeLayout(getContext());
            this.f21522ah.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.f21523ai = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8613y.m24929b(getContext(), 30.0f), C8613y.m24929b(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = C8613y.m24929b(getContext(), 8.0f);
            layoutParams.rightMargin = C8613y.m24929b(getContext(), 8.0f);
            this.f21523ai.setLayoutParams(layoutParams);
            this.f21523ai.setBackgroundResource(C8594o.m24812a(getContext(), "mbridge_nativex_close", "drawable"));
            this.f21523ai.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBMediaView.this.exitFullScreen();
                }
            });
            this.f21492B.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f21522ah.addView(this.f21492B);
            this.f21522ah.addView(this.f21523ai);
            return this.f21522ah;
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
            return null;
        }
    }

    public void exitFullScreen() {
        try {
            m25788w();
            if (this.f21529b) {
                this.f21548w.onClickPlayButton();
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.f21523ai;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.f21523ai.setVisibility(0);
        }
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.f21523ai;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.f21523ai.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25788w() {
        /*
            r12 = this;
            java.lang.String r0 = "mbridge_full_player_parent"
            java.lang.String r1 = "mbridge_full_rl_playcontainer"
            java.lang.String r2 = "id"
            android.view.View r3 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x023e }
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3     // Catch:{ Exception -> 0x023e }
            android.view.View r4 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            r5 = 100
            android.view.View r4 = r4.findViewById(r5)     // Catch:{ Exception -> 0x023e }
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch:{ Exception -> 0x023e }
            android.view.View r5 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            r6 = 101(0x65, float:1.42E-43)
            android.view.View r5 = r5.findViewById(r6)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5     // Catch:{ Exception -> 0x023e }
            android.view.View r6 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            r7 = 103(0x67, float:1.44E-43)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6     // Catch:{ Exception -> 0x023e }
            if (r6 != 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            android.view.View r6 = r5.findViewById(r7)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6     // Catch:{ Exception -> 0x023e }
        L_0x0041:
            android.view.View r7 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            int r8 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r8, r1, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r7 = r7.findViewById(r8)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7     // Catch:{ Exception -> 0x023e }
            if (r7 != 0) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            android.content.Context r7 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            int r1 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r7, r1, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ Exception -> 0x023e }
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7     // Catch:{ Exception -> 0x023e }
        L_0x0066:
            android.view.View r1 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            int r8 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r8, r0, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r1 = r1.findViewById(r8)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch:{ Exception -> 0x023e }
            if (r1 != 0) goto L_0x008b
            if (r7 == 0) goto L_0x008b
            android.content.Context r1 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            int r0 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r1, r0, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x023e }
            r1 = r0
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch:{ Exception -> 0x023e }
        L_0x008b:
            android.view.View r0 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            java.lang.String r9 = "mbridge_full_pb_loading"
            int r8 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r8, r9, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r0 = r0.findViewById(r8)     // Catch:{ Exception -> 0x023e }
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0     // Catch:{ Exception -> 0x023e }
            android.view.View r8 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            android.content.Context r9 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            java.lang.String r10 = "mbridge_full_rl_install"
            int r9 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r9, r10, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r8 = r8.findViewById(r9)     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8     // Catch:{ Exception -> 0x023e }
            android.view.View r9 = r12.getRootView()     // Catch:{ Exception -> 0x023e }
            android.content.Context r10 = r12.getContext()     // Catch:{ Exception -> 0x023e }
            java.lang.String r11 = "mbridge_full_ll_pro_dur"
            int r2 = com.mbridge.msdk.foundation.tools.C8594o.m24812a(r10, r11, r2)     // Catch:{ Exception -> 0x023e }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ Exception -> 0x023e }
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch:{ Exception -> 0x023e }
            r9 = 0
            if (r4 == 0) goto L_0x00d1
            android.view.ViewParent r10 = r4.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ Exception -> 0x023e }
            goto L_0x00d2
        L_0x00d1:
            r10 = r9
        L_0x00d2:
            if (r6 == 0) goto L_0x00d8
            r6.removeView(r2)     // Catch:{ Exception -> 0x023e }
            goto L_0x00e9
        L_0x00d8:
            if (r2 == 0) goto L_0x00e9
            android.view.ViewParent r11 = r2.getParent()     // Catch:{ Exception -> 0x023e }
            if (r11 == 0) goto L_0x00e9
            android.view.ViewParent r11 = r2.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11     // Catch:{ Exception -> 0x023e }
            r11.removeView(r2)     // Catch:{ Exception -> 0x023e }
        L_0x00e9:
            android.widget.RelativeLayout r2 = r12.f21522ah     // Catch:{ Exception -> 0x023e }
            if (r2 == 0) goto L_0x0118
            if (r6 == 0) goto L_0x00f5
            android.widget.RelativeLayout r2 = r12.f21522ah     // Catch:{ Exception -> 0x023e }
            r6.removeView(r2)     // Catch:{ Exception -> 0x023e }
            goto L_0x010a
        L_0x00f5:
            android.widget.RelativeLayout r2 = r12.f21522ah     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ Exception -> 0x023e }
            if (r2 == 0) goto L_0x010a
            android.widget.RelativeLayout r2 = r12.f21522ah     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r11 = r12.f21522ah     // Catch:{ Exception -> 0x023e }
            r2.removeView(r11)     // Catch:{ Exception -> 0x023e }
        L_0x010a:
            com.mbridge.msdk.nativex.view.WindVaneWebViewForNV r2 = r12.f21492B     // Catch:{ Exception -> 0x023e }
            r2.setBackListener(r9)     // Catch:{ Exception -> 0x023e }
            com.mbridge.msdk.nativex.view.WindVaneWebViewForNV r2 = r12.f21492B     // Catch:{ Exception -> 0x023e }
            r2.setObject(r9)     // Catch:{ Exception -> 0x023e }
            r12.f21492B = r9     // Catch:{ Exception -> 0x023e }
            r12.f21522ah = r9     // Catch:{ Exception -> 0x023e }
        L_0x0118:
            if (r6 == 0) goto L_0x011e
            r6.removeView(r8)     // Catch:{ Exception -> 0x023e }
            goto L_0x012f
        L_0x011e:
            if (r8 == 0) goto L_0x012f
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ Exception -> 0x023e }
            if (r2 == 0) goto L_0x012f
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x023e }
            r2.removeView(r8)     // Catch:{ Exception -> 0x023e }
        L_0x012f:
            if (r6 == 0) goto L_0x0135
            r6.removeView(r0)     // Catch:{ Exception -> 0x023e }
            goto L_0x0146
        L_0x0135:
            if (r0 == 0) goto L_0x0146
            android.view.ViewParent r2 = r0.getParent()     // Catch:{ Exception -> 0x023e }
            if (r2 == 0) goto L_0x0146
            android.view.ViewParent r2 = r0.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x023e }
            r2.removeView(r0)     // Catch:{ Exception -> 0x023e }
        L_0x0146:
            if (r1 == 0) goto L_0x014d
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r1.removeView(r0)     // Catch:{ Exception -> 0x023e }
        L_0x014d:
            if (r7 == 0) goto L_0x0153
            r7.removeView(r1)     // Catch:{ Exception -> 0x023e }
            goto L_0x0166
        L_0x0153:
            if (r1 == 0) goto L_0x0166
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0166
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            r0.removeView(r1)     // Catch:{ Exception -> 0x023e }
        L_0x0166:
            if (r6 == 0) goto L_0x016c
            r6.removeView(r7)     // Catch:{ Exception -> 0x023e }
            goto L_0x018b
        L_0x016c:
            if (r7 == 0) goto L_0x0180
            android.view.ViewParent r0 = r7.getParent()     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0180
            android.view.ViewParent r0 = r7.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            r0.removeView(r7)     // Catch:{ Exception -> 0x023e }
            goto L_0x018b
        L_0x0180:
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r0 = r12.f21496F     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x018b
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r0 = r12.f21496F     // Catch:{ Exception -> 0x023e }
            android.widget.RelativeLayout r1 = r12.f21497G     // Catch:{ Exception -> 0x023e }
            r0.removeView(r1)     // Catch:{ Exception -> 0x023e }
        L_0x018b:
            if (r5 == 0) goto L_0x0191
            r5.removeView(r6)     // Catch:{ Exception -> 0x023e }
            goto L_0x01bf
        L_0x0191:
            if (r6 == 0) goto L_0x01a5
            android.view.ViewParent r0 = r6.getParent()     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x01a5
            android.view.ViewParent r0 = r6.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            r0.removeView(r6)     // Catch:{ Exception -> 0x023e }
            goto L_0x01bf
        L_0x01a5:
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x01bf
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r1 = r12.f21496F     // Catch:{ Exception -> 0x023e }
            r0.removeView(r1)     // Catch:{ Exception -> 0x023e }
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            android.view.View r1 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            r0.removeView(r1)     // Catch:{ Exception -> 0x023e }
        L_0x01bf:
            if (r3 == 0) goto L_0x01e8
            if (r5 == 0) goto L_0x01c7
            r3.removeView(r5)     // Catch:{ Exception -> 0x023e }
            goto L_0x01e8
        L_0x01c7:
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            r3.removeView(r0)     // Catch:{ Exception -> 0x023e }
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x01e8
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x023e }
            android.view.View r1 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            r0.removeView(r1)     // Catch:{ Exception -> 0x023e }
            android.view.View r0 = r12.f21495E     // Catch:{ Exception -> 0x023e }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x023e }
        L_0x01e8:
            r0 = 0
            r12.setVisibility(r0)     // Catch:{ Exception -> 0x023e }
            r12.requestLayout()     // Catch:{ Exception -> 0x023e }
            if (r10 == 0) goto L_0x021b
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x023e }
            if (r1 == 0) goto L_0x020e
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x023e }
            if (r1 == r10) goto L_0x020e
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x023e }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Exception -> 0x023e }
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r2 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r1.removeView(r2)     // Catch:{ Exception -> 0x023e }
        L_0x020e:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            int r2 = r12.f21502L     // Catch:{ Exception -> 0x023e }
            r10.addView(r1, r2)     // Catch:{ Exception -> 0x023e }
            r10.removeView(r4)     // Catch:{ Exception -> 0x023e }
            r10.invalidate()     // Catch:{ Exception -> 0x023e }
        L_0x021b:
            r12.m25759i()     // Catch:{ Exception -> 0x023e }
            r12.f21535h = r0     // Catch:{ Exception -> 0x023e }
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0248
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r0.setExitFullScreen()     // Catch:{ Exception -> 0x023e }
            boolean r0 = r12.f21533f     // Catch:{ Exception -> 0x023e }
            if (r0 == 0) goto L_0x0233
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r0.openSound()     // Catch:{ Exception -> 0x023e }
            goto L_0x0238
        L_0x0233:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r0.closeSound()     // Catch:{ Exception -> 0x023e }
        L_0x0238:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21548w     // Catch:{ Exception -> 0x023e }
            r0.gonePauseView()     // Catch:{ Exception -> 0x023e }
            goto L_0x0248
        L_0x023e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "MBMediaView"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r1, r0)
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.m25788w():void");
    }

    /* renamed from: x */
    private boolean m25790x() {
        try {
            this.f21497G = this.f21496F.getMBridgeFullPlayContainer();
            this.f21501K = this.f21496F.getMBridgeFullPlayerParent();
            this.f21498H = this.f21496F.getMBridgeFullClose();
            this.f21499I = this.f21496F.getMBridgeFullTvInstall();
            this.f21500J = this.f21496F.getMBridgeFullPb();
            return true;
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return false;
        }
    }

    /* renamed from: y */
    private void m25792y() {
        try {
            this.f21536i = C8613y.m24952i(getContext()) >= C8613y.m24954j(getContext());
            this.f21537j = this.f21536i;
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: z */
    private void m25793z() {
        try {
            if (this.f21504N == null) {
                return;
            }
            if (!C8556ac.m24737a(this.f21504N.getVideoResolution())) {
                String[] split = this.f21504N.getVideoResolution().split("x");
                if (split != null && split.length == 2) {
                    String str = split[0];
                    String str2 = split[1];
                    double b = C8613y.m24928b(str);
                    double b2 = C8613y.m24928b(str2);
                    if (b > 0.0d && b2 > 0.0d) {
                        this.f21507Q = b;
                        this.f21508R = b2;
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public float m25694A() {
        try {
            float i = (float) C8613y.m24952i(getContext());
            return this.f21536i ? i + ((float) C8613y.m24956k(getContext())) : i;
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: B */
    private float m25696B() {
        try {
            float j = (float) C8613y.m24954j(getContext());
            return !this.f21536i ? j + ((float) C8613y.m24956k(getContext())) : j;
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: c */
    private boolean m25745c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: a */
    private void m25727a(View view, float f, float f2) {
        if (view != null) {
            try {
                double d = 0.0d;
                if (this.f21507Q > 0.0d) {
                    if (this.f21508R > 0.0d) {
                        double d2 = this.f21507Q / this.f21508R;
                        if (f > 0.0f && f2 > 0.0f) {
                            d = (double) (f / f2);
                        }
                        double a = C8613y.m24910a(Double.valueOf(d2));
                        double a2 = C8613y.m24910a(Double.valueOf(d));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21549x.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                        boolean z = m25745c(getContext()) && this.f21536i;
                        int i = -1;
                        if (a > a2) {
                            double d3 = (((double) f) * this.f21508R) / this.f21507Q;
                            layoutParams2.width = -1;
                            if (!z) {
                                i = (int) d3;
                            }
                            layoutParams2.height = i;
                            layoutParams2.addRule(13);
                            layoutParams.width = this.f21506P;
                            layoutParams.height = (int) d3;
                            layoutParams.addRule(13);
                        } else if (a < a2) {
                            double d4 = ((double) f2) * d2;
                            layoutParams2.width = z ? -1 : (int) d4;
                            layoutParams2.height = -1;
                            layoutParams2.addRule(13);
                            layoutParams.width = (int) d4;
                            layoutParams.height = this.f21505O;
                            layoutParams.addRule(13);
                        } else {
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            layoutParams.width = this.f21506P;
                            layoutParams.height = this.f21505O;
                            layoutParams.addRule(13);
                        }
                        if (!this.f21535h) {
                            this.f21549x.setLayoutParams(layoutParams);
                        }
                        view.setLayoutParams(layoutParams2);
                        return;
                    }
                }
                m25738b(view);
            } catch (Throwable th) {
                C8608u.m24884d(TAG, th.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m25738b(View view) {
        if (view != null) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = -1;
                if (this.f21536i) {
                    layoutParams.height = -1;
                } else {
                    layoutParams.height = (((int) m25694A()) * 9) / 16;
                    layoutParams.addRule(13);
                }
                view.setLayoutParams(layoutParams);
            } catch (Exception e) {
                C8608u.m24884d(TAG, e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m25698C() {
        try {
            if (this.f21498H != null || this.f21523ai != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8613y.m24929b(getContext(), 30.0f), C8613y.m24929b(getContext(), 30.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.topMargin = C8613y.m24929b(getContext(), 8.0f);
                layoutParams.rightMargin = C8613y.m24929b(getContext(), 8.0f);
                if (this.f21498H != null) {
                    this.f21498H.setLayoutParams(layoutParams);
                }
                if (this.f21523ai != null) {
                    this.f21523ai.setLayoutParams(layoutParams);
                }
                updateViewManger(false);
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m25701D() {
        try {
            if (this.f21498H != null || this.f21523ai != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8613y.m24929b(getContext(), 30.0f), C8613y.m24929b(getContext(), 30.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                if (this.f21519ae != 0 || !C8613y.m24769a(getContext())) {
                    layoutParams.rightMargin = C8613y.m24929b(getContext(), 8.0f);
                } else {
                    layoutParams.rightMargin = C8613y.m24956k(getContext()) + C8613y.m24929b(getContext(), 8.0f);
                }
                layoutParams.topMargin = C8613y.m24929b(getContext(), 8.0f);
                if (this.f21498H != null) {
                    this.f21498H.setLayoutParams(layoutParams);
                }
                if (this.f21523ai != null) {
                    this.f21523ai.setLayoutParams(layoutParams);
                }
                updateViewManger(true);
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    public void updateViewManger(boolean z) {
        C8874a a = C8874a.m25853a(getContext());
        boolean z2 = true;
        int i = 0;
        if (a != null) {
            try {
                this.f21496F.getmAnimationPlayer().clearAnimation();
                a.mo58476a(z, !this.f21548w.isComplete(), this.f21496F);
                a.mo58475a(z, this.f21496F, this.f21519ae);
            } catch (NullPointerException e) {
                e.printStackTrace();
                return;
            }
        }
        if ((this.f21496F instanceof MBridgeTopFullView) && a != null) {
            if (z) {
                z2 = false;
            }
            BaseView baseView = this.f21496F;
            if (baseView instanceof MBridgeTopFullView) {
                MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
                if (!z2) {
                    i = 8;
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i);
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i);
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i);
                mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i);
            }
        }
    }

    /* renamed from: E */
    private void m25702E() {
        int i;
        try {
            if (this.f21504N != null && this.f21504N.getNativeVideoTracking() != null) {
                String[] a = this.f21504N.getNativeVideoTracking().mo57376a();
                if (this.f21536i) {
                    i = f21489o;
                } else {
                    i = f21490p;
                }
                for (String str : a) {
                    if (!TextUtils.isEmpty(str)) {
                        C2295a.m5360a(getContext(), this.f21504N, this.f21504N.getCampaignUnitId(), str + "&orienation=" + i, false, false);
                    }
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.f21504N;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (!TextUtils.isEmpty(noticeUrl)) {
                if (!noticeUrl.contains("is_video")) {
                    if (this.f21516ab == C8854a.f21573b) {
                        str = "1";
                    } else {
                        str = this.f21516ab == C8854a.BIG_IMAGE ? "2" : "";
                    }
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&is_video=");
                        sb.append(str);
                    } else {
                        sb.append("?is_video=");
                        sb.append(str);
                    }
                    noticeUrl = sb.toString();
                } else if (this.f21516ab == C8854a.f21573b) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (this.f21516ab == C8854a.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
                this.f21504N.setNoticeUrl(noticeUrl);
            }
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.f21504N;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.f21504N.getNvT2();
    }

    public boolean canShowVideo() {
        if (m25722a(false) == C8854a.f21573b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$e */
    private class C8858e implements SensorEventListener {
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        private C8858e() {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            int i;
            if (!MBMediaView.this.f21525ak) {
                try {
                    float[] fArr = sensorEvent.values;
                    float f = -fArr[0];
                    float f2 = -fArr[1];
                    float f3 = -fArr[2];
                    if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                        i = 90 - Math.round(((float) Math.atan2((double) (-f2), (double) f)) * 57.29578f);
                        while (i >= 360) {
                            i -= 360;
                        }
                        while (i < 0) {
                            i += 360;
                        }
                    } else {
                        i = -1;
                    }
                    float D = MBMediaView.this.m25694A();
                    int j = C8613y.m24954j(MBMediaView.this.getContext());
                    if ((i <= 45 || i >= 135) && (i <= 225 || i >= 315)) {
                        if (((i > 135 && i < 225) || ((i > 315 && i < 360) || ((i >= 0 && i <= 45) || i == -1))) && D <= ((float) j) && MBMediaView.this.f21537j) {
                            boolean unused = MBMediaView.this.f21536i = false;
                            boolean unused2 = MBMediaView.this.f21537j = false;
                            MBMediaView.this.f21503M.postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        C8874a.m25853a(MBMediaView.this.getContext()).mo58474a(MBMediaView.this.f21496F, MBMediaView.this.f21536i);
                                        MBMediaView.this.m25698C();
                                        MBMediaView.this.m25757h();
                                        MBMediaView.this.m25753f();
                                        MBMediaView.this.m25756g();
                                        if (MBMediaView.this.f21492B != null) {
                                            MBMediaView.this.f21492B.orientation(MBMediaView.this.f21536i);
                                        }
                                    } catch (Exception e) {
                                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                                    }
                                }
                            }, 200);
                        }
                    } else if (D >= ((float) j) && !MBMediaView.this.f21537j) {
                        boolean unused3 = MBMediaView.this.f21536i = true;
                        boolean unused4 = MBMediaView.this.f21537j = true;
                        MBMediaView.this.f21503M.postDelayed(new Runnable() {
                            public final void run() {
                                try {
                                    C8874a.m25853a(MBMediaView.this.getContext()).mo58474a(MBMediaView.this.f21496F, MBMediaView.this.f21536i);
                                    MBMediaView.this.m25701D();
                                    MBMediaView.this.m25757h();
                                    MBMediaView.this.m25753f();
                                    MBMediaView.this.m25756g();
                                    if (MBMediaView.this.f21492B != null) {
                                        MBMediaView.this.f21492B.orientation(MBMediaView.this.f21536i);
                                    }
                                } catch (Exception e) {
                                    C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                                }
                            }
                        }, 200);
                    }
                } catch (Throwable th) {
                    C8608u.m24881a(MBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public WindVaneWebViewForNV m25704F() {
        try {
            if (this.f21492B != null && this.f21521ag) {
                return this.f21492B;
            }
            if (this.f21521ag) {
                return null;
            }
            m25741b(true);
            return null;
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private void m25741b(boolean z) {
        try {
            int nvT2 = this.f21504N.getNvT2();
            if (this.f21492B == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.f21492B = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.f21492B.setBackListener(new C8834b() {
                    /* renamed from: a */
                    public final void mo58333a() {
                        MBMediaView.this.exitFullScreen();
                    }
                });
                this.f21492B.setWebViewListener(new C8790b() {
                    /* renamed from: a */
                    public final void mo57902a(WebView webView, String str) {
                        super.mo57902a(webView, str);
                        boolean unused = MBMediaView.this.f21520af = true;
                    }

                    /* renamed from: a */
                    public final void mo57900a(WebView webView, int i, String str, String str2) {
                        super.mo57900a(webView, i, str, str2);
                        boolean unused = MBMediaView.this.f21520af = false;
                    }
                });
            }
            if (nvT2 == 3) {
                String str = this.f21504N.getendcard_url();
                if (!TextUtils.isEmpty(str)) {
                    this.f21504N.getMediaViewHolder();
                    if (!str.contains(".zip") || !str.contains("md5filename")) {
                        String b = C9572h.m27477a().mo63246b(str);
                        if (C8556ac.m24738b(b)) {
                            C8608u.m24880a(TAG, "load html...");
                            this.f21521ag = true;
                            this.f21492B.loadDataWithBaseURL(str, b, "text/html", "UTF-8", (String) null);
                            return;
                        }
                        return;
                    }
                    String b2 = C9563g.m27460a().mo63242b(str);
                    if (C8556ac.m24738b(b2)) {
                        this.f21521ag = true;
                        this.f21492B.loadUrl(b2);
                    }
                }
            } else if (nvT2 == 4) {
                this.f21521ag = true;
                if (this.f21504N != null) {
                    BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f21504N);
                    mBDownloadListener.setTitle(this.f21504N.getAppName());
                    this.f21492B.setDownloadListener(mBDownloadListener);
                    this.f21492B.setFilter(new C8857d());
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$g */
    private static final class C8862g extends WebViewClient {

        /* renamed from: a */
        WeakReference<MBMediaView> f21582a;

        public C8862g(MBMediaView mBMediaView) {
            this.f21582a = new WeakReference<>(mBMediaView);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                MBMediaView mBMediaView = (MBMediaView) this.f21582a.get();
                if (mBMediaView != null && mBMediaView.f21516ab != null && mBMediaView.f21516ab == C8854a.BIG_IMAGE) {
                    mBMediaView.m25766l();
                    C8854a unused = mBMediaView.f21516ab = C8854a.GIF;
                    mBMediaView.changeNoticeURL();
                }
            } catch (Exception e) {
                C8608u.m24884d(MBMediaView.TAG, e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$f */
    private static final class C8861f implements C9584a {

        /* renamed from: a */
        WeakReference<MBMediaView> f21581a;

        /* renamed from: a */
        public final void mo58397a(String str, String str2) {
        }

        public C8861f(MBMediaView mBMediaView) {
            this.f21581a = new WeakReference<>(mBMediaView);
        }

        /* renamed from: a */
        public final void mo58396a(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f21581a.get();
            if (mBMediaView != null) {
                mBMediaView.f21503M.post(new C8855b(mBMediaView));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$b */
    private static final class C8855b implements Runnable {

        /* renamed from: a */
        WeakReference<MBMediaView> f21576a;

        public C8855b(MBMediaView mBMediaView) {
            this.f21576a = new WeakReference<>(mBMediaView);
        }

        public final void run() {
            MBMediaView mBMediaView = (MBMediaView) this.f21576a.get();
            if (mBMediaView != null) {
                try {
                    if (mBMediaView.f21516ab != null && mBMediaView.f21516ab == C8854a.BIG_IMAGE) {
                        mBMediaView.m25752e();
                        C8854a unused = mBMediaView.f21516ab = C8854a.f21573b;
                        mBMediaView.changeNoticeURL();
                    }
                } catch (Throwable th) {
                    C8608u.m24881a(MBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$c */
    private static final class C8856c implements C8833a {

        /* renamed from: a */
        WeakReference<MBMediaView> f21577a;

        public C8856c(MBMediaView mBMediaView) {
            this.f21577a = new WeakReference<>(mBMediaView);
        }

        /* renamed from: a */
        public final void mo58327a() {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                MBMediaView.m25713N(mBMediaView);
            }
        }

        /* renamed from: b */
        public final void mo58329b() {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                MBMediaView.m25714O(mBMediaView);
            }
        }

        /* renamed from: c */
        public final void mo58331c() {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                MBMediaView.m25715P(mBMediaView);
            }
        }

        /* renamed from: d */
        public final void mo58332d() {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                MBMediaView.m25716Q(mBMediaView);
            }
        }

        /* renamed from: a */
        public final void mo58328a(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                mBMediaView.mo58334a(str);
            }
        }

        /* renamed from: b */
        public final void mo58330b(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f21577a.get();
            if (mBMediaView != null) {
                mBMediaView.mo58335b(str);
            }
        }
    }

    public BaseView.C8873a handleViewStyleResult(Context context) {
        int nvT2 = this.f21504N.getNvT2();
        if (nvT2 == 1) {
            m25737b(context);
        } else if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
            return BaseView.C8873a.FULL_MIDDLE_VIEW;
        } else {
            if (nvT2 == 6) {
                return BaseView.C8873a.FULL_TOP_VIEW;
            }
        }
        return null;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$d */
    private static final class C8857d implements C8793a {
        private C8857d() {
        }

        /* renamed from: a */
        public final boolean mo58206a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (C8611x.C8612a.m24906a(str)) {
                        C8611x.m24901a(C2350a.m5601e().mo15792g(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    } else if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    } else {
                        C8611x.m24903b(C2350a.m5601e().mo15792g(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d(MBMediaView.TAG, e.getMessage());
            }
            return false;
        }
    }

    public void setProgressVisibility(boolean z) {
        this.f21538k = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21548w;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z);
        }
    }

    public void setSoundIndicatorVisibility(boolean z) {
        this.f21539l = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21548w;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z);
        }
    }

    public void setVideoSoundOnOff(boolean z) {
        this.f21533f = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21548w;
        if (mediaViewPlayerView == null) {
            return;
        }
        if (z) {
            mediaViewPlayerView.openSound();
        } else {
            mediaViewPlayerView.closeSound();
        }
    }

    public BaseView getFullScreenViewByStyle(Context context, BaseView.C8873a aVar) {
        BaseView baseView;
        BaseView baseView2;
        int i = C883610.f21553a[aVar.ordinal()];
        if (i == 1) {
            baseView2 = new MBridgeFullView(context);
        } else if (i != 2) {
            baseView = null;
            baseView.setStytle(aVar);
            return baseView;
        } else {
            baseView2 = new MBridgeTopFullView(context);
        }
        baseView = baseView2;
        baseView.setStytle(aVar);
        return baseView;
    }

    public void setFullScreenViewBackgroundColor(int i) {
        this.f21547v = i;
    }

    public void setFollowActivityOrientation(boolean z) {
        this.f21525ak = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21525ak && this.f21524aj != configuration.orientation) {
            int i = configuration.orientation;
            this.f21524aj = i;
            boolean z = true;
            this.f21536i = i == 0;
            if (this.f21524aj != 0) {
                z = false;
            }
            this.f21537j = z;
            this.f21503M.postDelayed(new Runnable() {
                public final void run() {
                    try {
                        C8874a.m25853a(MBMediaView.this.getContext()).mo58474a(MBMediaView.this.f21496F, MBMediaView.this.f21536i);
                        if (MBMediaView.this.f21524aj == 0) {
                            MBMediaView.this.m25701D();
                        } else {
                            MBMediaView.this.m25698C();
                        }
                        MBMediaView.this.m25757h();
                        MBMediaView.this.m25753f();
                        MBMediaView.this.m25756g();
                        if (MBMediaView.this.f21492B != null) {
                            MBMediaView.this.f21492B.orientation(MBMediaView.this.f21536i);
                        }
                    } catch (Exception e) {
                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                    }
                }
            }, 200);
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f21535h;
    }

    public void cai(Object obj, String str) {
        C8608u.m24880a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    C8805b.m25604a(obj, "packageName is empty");
                }
                int i = C8613y.m24940c(C2350a.m5601e().mo15792g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", C8805b.f21411b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                    jSONObject.put("data", jSONObject2);
                    C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C8805b.m25604a(obj, e.getMessage());
                    C8608u.m24880a(TAG, e.getMessage());
                }
            } catch (JSONException e2) {
                C8805b.m25604a(obj, "exception: " + e2.getLocalizedMessage());
                C8608u.m24881a(TAG, "cai", e2);
            } catch (Throwable th) {
                C8805b.m25604a(obj, "exception: " + th.getLocalizedMessage());
                C8608u.m24881a(TAG, "cai", th);
            }
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f21504N);
            String a = m25724a((List<CampaignEx>) arrayList, m25771o(), "MAL_16.1.61,3.0.1");
            String encodeToString = !TextUtils.isEmpty(a) ? Base64.encodeToString(a.getBytes(), 2) : "";
            C8608u.m24884d(TAG, "getEndScreenInfo-mCampaign.name:" + this.f21504N.getAppName());
            C8824g.m25670a().mo58311a(obj, encodeToString);
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (this.f21526al != null) {
                m25737b(this.f21526al);
            } else if ((obj instanceof C8818a) && (windVaneWebView = ((C8818a) obj).f21444a) != null) {
                m25737b(windVaneWebView.getContext());
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C8608u.m24884d(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is null");
            return;
        }
        Context g = C2350a.m5601e().mo15792g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8818a) && (windVaneWebView = ((C8818a) obj).f21444a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8608u.m24884d(TAG, e.getMessage());
                }
            }
            if (g != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C2309b.m5447a(g, optString);
                    } else if (optInt == 2) {
                        C2309b.m5449b(g, optString);
                    }
                } catch (JSONException e2) {
                    C8608u.m24884d(TAG, e2.getMessage());
                } catch (Throwable th) {
                    C8608u.m24884d(TAG, th.getMessage());
                }
            }
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e) {
                    C8608u.m24884d(TAG, e.getMessage());
                }
            }
            C8608u.m24884d(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            C8824g.m25670a().mo58311a(obj, m25723a(0));
        } catch (Exception e2) {
            C8608u.m24884d(TAG, e2.getMessage());
            C8824g.m25670a().mo58313b(obj, m25723a(1));
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            C8824g.m25670a().mo58311a(obj, m25723a(0));
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
            C8824g.m25670a().mo58313b(obj, m25723a(1));
        }
    }

    /* renamed from: a */
    private String m25723a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8608u.m24884d(TAG, "code to string is error");
            return "";
        }
    }

    /* renamed from: a */
    private String m25724a(List<CampaignEx> list, String str, String str2) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25737b(Context context) {
        try {
            if (this.f21517ac != null) {
                this.f21517ac.onVideoAdClicked(this.f21504N);
            }
            if (this.f21518ad != null) {
                this.f21518ad.onVideoAdClicked(this.f21504N);
            }
        } catch (Exception e) {
            try {
                C8608u.m24884d(TAG, e.getMessage());
            } catch (Exception e2) {
                C8608u.m24884d(TAG, e2.getMessage());
                return;
            }
        }
        if (this.f21504N == null) {
            return;
        }
        if (!C8556ac.m24737a(m25771o())) {
            if (!this.f21504N.isReportClick()) {
                this.f21504N.setReportClick(true);
                if (!(this.f21504N == null || this.f21504N.getNativeVideoTracking() == null || this.f21504N.getNativeVideoTracking().mo57384e() == null)) {
                    C2295a.m5362a(getContext(), this.f21504N, this.f21504N.getCampaignUnitId(), this.f21504N.getNativeVideoTracking().mo57384e(), false, false);
                }
            }
            C2295a aVar = new C2295a(getContext(), m25771o());
            aVar.mo15642a((NativeListener.NativeTrackingListener) new NativeListener.NativeTrackingListener() {
                public final void onDismissLoading(Campaign campaign) {
                }

                public final void onDownloadFinish(Campaign campaign) {
                }

                public final void onDownloadProgress(int i) {
                }

                public final void onDownloadStart(Campaign campaign) {
                }

                public final boolean onInterceptDefaultLoadingDialog() {
                    return true;
                }

                public final void onShowLoading(Campaign campaign) {
                }

                public final void onStartRedirection(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25770n(MBMediaView.this);
                        MBMediaView.m25772o(MBMediaView.this);
                        MBMediaView.m25730a(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                    }
                }

                public final void onRedirectionFailed(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25774p(MBMediaView.this);
                        MBMediaView.m25776q(MBMediaView.this);
                        MBMediaView.m25740b(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                    }
                }

                public final void onFinishRedirection(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25774p(MBMediaView.this);
                        MBMediaView.m25776q(MBMediaView.this);
                        MBMediaView.m25744c(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                    }
                }
            });
            aVar.mo15639a(this.f21504N);
        }
    }

    public void onPlayProgress(int i, int i2) {
        int i3;
        String str;
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx.C8397b mediaViewHolder2;
        int i4 = i;
        try {
            if (!(this.f21504N == null || (mediaViewHolder2 = this.f21504N.getMediaViewHolder()) == null || mediaViewHolder2.f20171h || mediaViewHolder2.f20175l == null || mediaViewHolder2.f20175l.size() <= 0)) {
                Map<Integer, String> map = mediaViewHolder2.f20175l;
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str2 = (String) next.getValue();
                    if (i4 >= ((Integer) next.getKey()).intValue() && !TextUtils.isEmpty(str2)) {
                        C2295a.m5360a(getContext(), this.f21504N, this.f21504N.getCampaignUnitId(), str2, false, false);
                        it.remove();
                    }
                }
                if (map.size() <= 0) {
                    mediaViewHolder2.f20171h = true;
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
        int i5 = 0;
        try {
            if (!(this.f21504N == null || (mediaViewHolder = this.f21504N.getMediaViewHolder()) == null || mediaViewHolder.f20172i || i2 == 0)) {
                List<Map<Integer, String>> b = this.f21504N.getNativeVideoTracking().mo57377b();
                int i6 = ((i4 + 1) * 100) / i2;
                if (b != null) {
                    int i7 = 0;
                    while (i7 < b.size()) {
                        Map map2 = b.get(i7);
                        if (map2 != null && map2.size() > 0) {
                            Iterator it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                int intValue = ((Integer) entry.getKey()).intValue();
                                String str3 = (String) entry.getValue();
                                if (intValue <= i6 && !TextUtils.isEmpty(str3)) {
                                    C2295a.m5362a(getContext(), this.f21504N, this.f21504N.getCampaignUnitId(), new String[]{str3}, false, true);
                                    it2.remove();
                                    b.remove(i7);
                                    i7--;
                                }
                            }
                        }
                        i7++;
                    }
                    if (b.size() <= 0) {
                        mediaViewHolder.f20172i = true;
                    }
                }
            }
        } catch (Throwable unused) {
            C8608u.m24884d(TAG, "reportPlayPercentageData error");
        }
        MediaEvents mediaEvents = this.f21546u;
        if (mediaEvents != null) {
            int i8 = (i4 * 100) / i2;
            int i9 = ((i4 + 1) * 100) / i2;
            if (i8 <= 25 && 25 < i9) {
                mediaEvents.firstQuartile();
            } else if (i8 <= 50 && 50 < i9) {
                this.f21546u.midpoint();
            } else if (i8 <= 75 && 75 < i9) {
                this.f21546u.thirdQuartile();
            }
        }
        if (m25779s() != 100 && !this.f21527am) {
            if (m25781t() != null) {
                i5 = m25781t().mo15592f();
            }
            int s = m25779s();
            if (s != 0) {
                if (i5 > s) {
                    i5 = s / 2;
                }
                if (i5 >= 0 && i4 >= (i3 = (i5 * i2) / 100)) {
                    if (this.f21504N.getAdType() == 94 || this.f21504N.getAdType() == 287) {
                        str = this.f21504N.getRequestId() + this.f21504N.getId() + this.f21504N.getVideoUrlEncode();
                    } else {
                        str = this.f21504N.getId() + this.f21504N.getVideoUrlEncode() + this.f21504N.getBidToken();
                    }
                    C9552a a = C9556c.getInstance().mo63224a(m25771o(), str);
                    if (a != null) {
                        a.mo63215j();
                        this.f21527am = true;
                        C8608u.m24884d(TAG, "CDRate is : " + i3 + " and start download !");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25739b(MBMediaView mBMediaView) {
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && campaignEx.getMediaViewHolder() != null) {
            C2350a.m5601e().mo15778a(mBMediaView.getContext());
            C8775b.m25513a(mBMediaView.f21504N, mBMediaView.getContext(), mBMediaView.m25771o(), (C8738a) null);
            CampaignEx.C8397b mediaViewHolder = mBMediaView.f21504N.getMediaViewHolder();
            if (!mediaViewHolder.f20164a && mBMediaView.f21516ab == C8854a.f21573b && C8556ac.m24738b(mBMediaView.f21504N.getImpressionURL())) {
                mediaViewHolder.f20164a = true;
                String impressionURL = mBMediaView.f21504N.getImpressionURL();
                if (!impressionURL.contains("is_video=1")) {
                    StringBuilder sb = new StringBuilder(impressionURL);
                    if (impressionURL.contains("?")) {
                        sb.append("&is_video=1");
                    } else {
                        sb.append("?is_video=1");
                    }
                    impressionURL = sb.toString();
                }
                Context context = mBMediaView.getContext();
                CampaignEx campaignEx2 = mBMediaView.f21504N;
                C2295a.m5361a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, C2302a.f4733g);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25749d(MBMediaView mBMediaView) {
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20170g && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57398l() != null) {
            mediaViewHolder.f20170g = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57398l(), false, false);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m25758h(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.getRootView() != null) {
                if (mBMediaView.getRootView() instanceof ViewGroup) {
                    BaseView.C8873a handleViewStyleResult = mBMediaView.handleViewStyleResult(mBMediaView.getContext());
                    if (handleViewStyleResult != null) {
                        BaseView fullScreenViewByStyle = mBMediaView.getFullScreenViewByStyle(mBMediaView.getContext(), handleViewStyleResult);
                        mBMediaView.f21496F = fullScreenViewByStyle;
                        if (fullScreenViewByStyle != null) {
                            if (mBMediaView.m25790x()) {
                                C8874a.m25853a(mBMediaView.getContext()).mo58473a(mBMediaView.f21496F.style, mBMediaView.f21504N, mBMediaView.f21496F);
                                mBMediaView.f21535h = true;
                                mBMediaView.f21543r = false;
                                if (mBMediaView.f21548w != null) {
                                    mBMediaView.f21548w.setEnterFullScreen();
                                    mBMediaView.f21548w.setIsActivePause(false);
                                }
                                try {
                                    if (mBMediaView.f21517ac != null) {
                                        mBMediaView.f21517ac.onEnterFullscreen();
                                    }
                                    if (mBMediaView.f21518ad != null) {
                                        mBMediaView.f21518ad.onEnterFullscreen();
                                    }
                                    if (mBMediaView.f21546u != null) {
                                        mBMediaView.f21546u.playerStateChange(PlayerState.FULLSCREEN);
                                    }
                                } catch (Exception e) {
                                    C8608u.m24884d(TAG, e.getMessage());
                                }
                                FrameLayout frameLayout = (FrameLayout) mBMediaView.getRootView().findViewById(16908290);
                                RelativeLayout relativeLayout = new RelativeLayout(mBMediaView.getContext());
                                mBMediaView.f21495E = relativeLayout;
                                relativeLayout.setClickable(true);
                                ViewGroup viewGroup = (ViewGroup) mBMediaView.f21548w.getParent();
                                int childCount = viewGroup.getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        break;
                                    } else if (viewGroup.getChildAt(i) == mBMediaView.f21548w) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                mBMediaView.f21502L = i;
                                FrameLayout frameLayout2 = new FrameLayout(mBMediaView.getContext());
                                frameLayout2.setId(100);
                                viewGroup.addView(frameLayout2, i, new ViewGroup.LayoutParams(mBMediaView.getWidth(), mBMediaView.getHeight()));
                                viewGroup.removeView(mBMediaView.f21548w);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                relativeLayout.setId(101);
                                new RelativeLayout.LayoutParams(-1, -1);
                                mBMediaView.f21501K.addView(mBMediaView.f21548w, new RelativeLayout.LayoutParams(-1, -1));
                                frameLayout.addView(relativeLayout, layoutParams);
                                int i2 = ViewCompat.MEASURED_STATE_MASK;
                                if (C883610.f21553a[mBMediaView.f21496F.style.ordinal()] == 2) {
                                    i2 = -1;
                                }
                                if (mBMediaView.f21547v != 0) {
                                    relativeLayout.setBackgroundColor(mBMediaView.f21547v);
                                } else {
                                    relativeLayout.setBackgroundColor(i2);
                                }
                                mBMediaView.f21496F.setId(103);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                                int[] iArr = new int[2];
                                frameLayout.getLocationInWindow(iArr);
                                int i3 = iArr[1];
                                mBMediaView.f21519ae = i3;
                                if (i3 == 0) {
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        WindowInsets rootWindowInsets = mBMediaView.getRootWindowInsets();
                                        if (rootWindowInsets != null) {
                                            layoutParams2.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                                        }
                                    } else {
                                        layoutParams2.setMargins(0, C8613y.m24944e(mBMediaView.getContext()), 0, 0);
                                    }
                                }
                                relativeLayout.addView(mBMediaView.f21496F, layoutParams2);
                                try {
                                    mBMediaView.m25792y();
                                    mBMediaView.m25727a((View) mBMediaView.f21497G, mBMediaView.m25694A(), mBMediaView.m25696B());
                                    C8874a.m25853a(mBMediaView.getContext()).mo58474a(mBMediaView.f21496F, mBMediaView.f21536i);
                                    if (mBMediaView.f21536i) {
                                        mBMediaView.m25701D();
                                    } else {
                                        mBMediaView.m25698C();
                                    }
                                    mBMediaView.f21503M.postDelayed(new Runnable() {
                                        public final void run() {
                                            boolean unused = MBMediaView.this.f21543r = true;
                                            if (MBMediaView.this.f21535h) {
                                                TextView unused2 = MBMediaView.this.f21499I;
                                            }
                                        }
                                    }, 3000);
                                } catch (Throwable th) {
                                    C8608u.m24884d(TAG, th.getMessage());
                                }
                                try {
                                    mBMediaView.f21495E.setFocusableInTouchMode(true);
                                    mBMediaView.f21495E.requestFocus();
                                    mBMediaView.f21495E.setOnKeyListener(new View.OnKeyListener() {
                                        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                                            try {
                                                if (keyEvent.getKeyCode() != 4) {
                                                    return false;
                                                }
                                                MBMediaView.this.m25788w();
                                                return true;
                                            } catch (Throwable th) {
                                                C8608u.m24884d(MBMediaView.TAG, th.getMessage());
                                                return false;
                                            }
                                        }
                                    });
                                    mBMediaView.f21495E.setOnClickListener(new View.OnClickListener() {
                                        public final void onClick(View view) {
                                            MBMediaView.m25760i(MBMediaView.this);
                                        }
                                    });
                                    mBMediaView.f21498H.setOnClickListener(new View.OnClickListener() {
                                        public final void onClick(View view) {
                                            MBMediaView.this.m25788w();
                                        }
                                    });
                                    mBMediaView.f21499I.setOnClickListener(new C9587a() {
                                        /* access modifiers changed from: protected */
                                        /* renamed from: a */
                                        public final void mo58122a(View view) {
                                            try {
                                                MBMediaView.this.m25737b(view.getContext());
                                                if (MBMediaView.this.f21546u != null) {
                                                    MBMediaView.this.f21546u.adUserInteraction(InteractionType.CLICK);
                                                }
                                            } catch (Exception e) {
                                                C8608u.m24884d(MBMediaView.TAG, e.getMessage());
                                            }
                                        }
                                    });
                                } catch (Exception e2) {
                                    C8608u.m24884d(TAG, e2.getMessage());
                                }
                                if (mBMediaView.f21548w != null) {
                                    mBMediaView.f21548w.openSound();
                                }
                                mBMediaView.f21548w.setMediaViewPlayListener(new MediaViewPlayerView.C8871a(mBMediaView.f21548w) {
                                    /* renamed from: a */
                                    public final void mo58383a() {
                                        int nvT2 = MBMediaView.this.f21504N.getNvT2();
                                        if (!MBMediaView.this.f21535h || !(nvT2 == 3 || nvT2 == 4)) {
                                            super.mo58383a();
                                            return;
                                        }
                                        WindVaneWebViewForNV t = MBMediaView.this.m25704F();
                                        if (t != null) {
                                            View u = MBMediaView.this.m25785v();
                                            if (u == null) {
                                                super.mo58383a();
                                                return;
                                            }
                                            if (nvT2 == 3 && MBMediaView.this.f21520af) {
                                                C8874a.m25853a(MBMediaView.this.getContext()).mo58472a(u, MBMediaView.this.f21496F);
                                                Context context = MBMediaView.this.getContext();
                                                CampaignEx s = MBMediaView.this.f21504N;
                                                String campaignUnitId = MBMediaView.this.f21504N.getCampaignUnitId();
                                                if (s != null) {
                                                    try {
                                                        if (!(s.getNativeVideoTracking() == null || s.getNativeVideoTracking().mo57394j() == null)) {
                                                            for (String str : s.getNativeVideoTracking().mo57394j()) {
                                                                if (!TextUtils.isEmpty(str)) {
                                                                    C2295a.m5360a(context, s, campaignUnitId, str, false, true);
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            } else if (nvT2 == 4) {
                                                C8874a.m25853a(MBMediaView.this.getContext()).mo58472a(u, MBMediaView.this.f21496F);
                                                String clickURL = MBMediaView.this.f21504N.getClickURL();
                                                if (!TextUtils.isEmpty(clickURL)) {
                                                    C2295a.m5361a(MBMediaView.this.getContext(), MBMediaView.this.f21504N, MBMediaView.this.m25771o(), MBMediaView.this.getAddNVT2ToNoticeURL(), true, false, C2302a.f4735i);
                                                    MBMediaView.this.f21492B.loadUrl(clickURL);
                                                }
                                            } else {
                                                super.mo58383a();
                                                return;
                                            }
                                            t.webViewShow(MBMediaView.this.f21504N, MBMediaView.this.m25771o());
                                            t.orientation(MBMediaView.this.f21536i);
                                            return;
                                        }
                                        super.mo58383a();
                                    }
                                });
                                mBMediaView.m25741b(false);
                                if (mBMediaView.f21504N != null && mBMediaView.f21504N.getMediaViewHolder() != null && !mBMediaView.f21504N.getMediaViewHolder().f20174k && !TextUtils.isEmpty(mBMediaView.f21504N.getCampaignUnitId()) && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57376a() != null) {
                                    mBMediaView.f21504N.getMediaViewHolder().f20174k = true;
                                    mBMediaView.m25702E();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C8608u.m24882b(TAG, "rootView is null");
        } catch (Exception e3) {
            C8608u.m24884d(TAG, e3.getMessage());
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m25760i(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21548w != null) {
                mBMediaView.f21548w.onClickPlayerView();
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m25770n(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21494D != null) {
                mBMediaView.f21494D.setVisibility(0);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: o */
    static /* synthetic */ void m25772o(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21500J != null) {
                mBMediaView.f21500J.setVisibility(0);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25730a(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21517ac != null) {
                mBMediaView.f21517ac.onStartRedirection(campaign, str);
            }
            if (mBMediaView.f21518ad != null) {
                mBMediaView.f21518ad.onStartRedirection(campaign, str);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m25774p(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21494D != null) {
                mBMediaView.f21494D.setVisibility(8);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m25776q(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21500J != null) {
                mBMediaView.f21500J.setVisibility(8);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25740b(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21517ac != null) {
                mBMediaView.f21517ac.onRedirectionFailed(campaign, str);
            }
            if (mBMediaView.f21518ad != null) {
                mBMediaView.f21518ad.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m25744c(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21517ac != null) {
                mBMediaView.f21517ac.onFinishRedirection(campaign, str);
            }
            if (mBMediaView.f21518ad != null) {
                mBMediaView.f21518ad.onFinishRedirection(campaign, str);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m25778r(MBMediaView mBMediaView) {
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && campaignEx.getMediaViewHolder() != null && !mBMediaView.f21504N.getMediaViewHolder().f20167d && !TextUtils.isEmpty(mBMediaView.f21504N.getCampaignUnitId()) && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57390h() != null) {
            mBMediaView.f21504N.getMediaViewHolder().f20167d = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57390h(), false, false);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25731a(MBMediaView mBMediaView, String str) {
        try {
            C2385p a = C2385p.m5777a((C2374f) C2376g.m5723a(mBMediaView.getContext()));
            C8412m mVar = null;
            if (!TextUtils.isEmpty(mBMediaView.f21504N.getNoticeUrl())) {
                int n = C8596q.m24849n(mBMediaView.getContext());
                mVar = new C8412m("2000021", n, mBMediaView.f21504N.getNoticeUrl(), str, C8596q.m24818a(mBMediaView.getContext(), n));
            } else if (!TextUtils.isEmpty(mBMediaView.f21504N.getClickURL())) {
                int n2 = C8596q.m24849n(mBMediaView.getContext());
                mVar = new C8412m("2000021", n2, mBMediaView.f21504N.getClickURL(), str, C8596q.m24818a(mBMediaView.getContext(), n2));
            }
            if (mVar != null) {
                mVar.mo57469n(mBMediaView.f21504N.getId());
                mVar.mo57451e(mBMediaView.f21504N.getVideoUrlEncode());
                mVar.mo57473p(str);
                mVar.mo57463k(mBMediaView.f21504N.getRequestId());
                mVar.mo57465l(mBMediaView.f21504N.getRequestIdNotice());
                mVar.mo57467m(mBMediaView.m25771o());
                a.mo15934a(mVar);
            }
        } catch (Exception e) {
            C8608u.m24884d(TAG, e.getMessage());
        }
    }

    /* renamed from: N */
    static /* synthetic */ void m25713N(MBMediaView mBMediaView) {
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20165b && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57380c() != null) {
            mediaViewHolder.f20165b = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57380c(), false, false);
        }
    }

    /* renamed from: O */
    static /* synthetic */ void m25714O(MBMediaView mBMediaView) {
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20166c && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57382d() != null) {
            mediaViewHolder.f20166c = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57382d(), false, false);
        }
    }

    /* renamed from: P */
    static /* synthetic */ void m25715P(MBMediaView mBMediaView) {
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20168e && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57386f() != null) {
            mediaViewHolder.f20168e = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57386f(), false, false);
        }
    }

    /* renamed from: Q */
    static /* synthetic */ void m25716Q(MBMediaView mBMediaView) {
        CampaignEx.C8397b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21504N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20169f && mBMediaView.f21504N.getNativeVideoTracking() != null && mBMediaView.f21504N.getNativeVideoTracking().mo57388g() != null) {
            mediaViewHolder.f20169f = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21504N;
            C2295a.m5362a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21504N.getNativeVideoTracking().mo57388g(), false, false);
        }
    }

    /* renamed from: S */
    static /* synthetic */ void m25718S(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21548w != null && mBMediaView.f21548w.hasPrepare() && mBMediaView.f21548w.isPlaying()) {
                if (mBMediaView.f21548w != null) {
                    mBMediaView.f21548w.pause();
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }

    /* renamed from: T */
    static /* synthetic */ void m25719T(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21548w != null) {
                if (mBMediaView.f21548w.hasPrepare()) {
                    if (!mBMediaView.f21548w.isPlaying()) {
                        if (!mBMediaView.f21548w.isComplete()) {
                            if (mBMediaView.f21548w.hasPrepare()) {
                                mBMediaView.f21548w.startOrPlayVideo();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d(TAG, th.getMessage());
        }
    }
}
