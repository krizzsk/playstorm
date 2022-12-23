package com.bytedance.sdk.openadsdk.p178j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.j.g */
/* compiled from: PlayablePlugin */
public class C3890g {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public WeakReference<View> f10018A;

    /* renamed from: B */
    private C3861e f10019B;

    /* renamed from: C */
    private C3855a f10020C;

    /* renamed from: D */
    private C3859c f10021D;

    /* renamed from: E */
    private int f10022E = 0;

    /* renamed from: F */
    private int f10023F = 0;

    /* renamed from: G */
    private JSONObject f10024G = new JSONObject();

    /* renamed from: H */
    private String f10025H;

    /* renamed from: I */
    private String f10026I;

    /* renamed from: J */
    private String f10027J;

    /* renamed from: K */
    private Map<String, String> f10028K = new HashMap();

    /* renamed from: L */
    private JSONObject f10029L;

    /* renamed from: M */
    private String f10030M;

    /* renamed from: N */
    private JSONObject f10031N;

    /* renamed from: O */
    private float f10032O;

    /* renamed from: P */
    private int f10033P;

    /* renamed from: Q */
    private int f10034Q;

    /* renamed from: R */
    private int f10035R;

    /* renamed from: S */
    private int f10036S;

    /* renamed from: T */
    private int f10037T;

    /* renamed from: U */
    private int f10038U;

    /* renamed from: V */
    private int f10039V;

    /* renamed from: W */
    private int f10040W;

    /* renamed from: X */
    private int f10041X;

    /* renamed from: Y */
    private int f10042Y;

    /* renamed from: Z */
    private String f10043Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f10044a = new Handler(Looper.getMainLooper());

    /* renamed from: aa */
    private boolean f10045aa;

    /* renamed from: ab */
    private boolean f10046ab;

    /* renamed from: ac */
    private boolean f10047ac;

    /* renamed from: ad */
    private boolean f10048ad;

    /* renamed from: ae */
    private String f10049ae;

    /* renamed from: af */
    private String f10050af;

    /* renamed from: ag */
    private boolean f10051ag = false;

    /* renamed from: ah */
    private ViewTreeObserver.OnGlobalLayoutListener f10052ah = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            try {
                View view = (View) C3890g.this.f10018A.get();
                if (view != null) {
                    C3890g.this.m12733b(view);
                }
            } catch (Throwable th) {
                C3888f.m12722a("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Runnable f10053b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f10054c;

    /* renamed from: d */
    private Timer f10055d = new Timer();

    /* renamed from: e */
    private TimerTask f10056e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3856b f10057f;

    /* renamed from: g */
    private boolean f10058g = true;

    /* renamed from: h */
    private Set<String> f10059h = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));

    /* renamed from: i */
    private String f10060i = null;

    /* renamed from: j */
    private String f10061j = "embeded_ad";

    /* renamed from: k */
    private boolean f10062k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10063l = true;

    /* renamed from: m */
    private boolean f10064m = true;

    /* renamed from: n */
    private long f10065n = 10;

    /* renamed from: o */
    private long f10066o = 10;

    /* renamed from: p */
    private long f10067p = 0;

    /* renamed from: q */
    private long f10068q = 0;

    /* renamed from: r */
    private long f10069r = -1;

    /* renamed from: s */
    private long f10070s = -1;

    /* renamed from: t */
    private long f10071t = -1;

    /* renamed from: u */
    private long f10072u = -1;

    /* renamed from: v */
    private int f10073v = 0;

    /* renamed from: w */
    private int f10074w = 0;

    /* renamed from: x */
    private C3899a f10075x = C3899a.MAIN;

    /* renamed from: y */
    private Context f10076y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public WebView f10077z;

    /* renamed from: com.bytedance.sdk.openadsdk.j.g$a */
    /* compiled from: PlayablePlugin */
    enum C3899a {
        MAIN,
        RIFLE
    }

    /* renamed from: q */
    public void mo20767q() {
    }

    /* renamed from: r */
    public void mo20768r() {
    }

    /* renamed from: w */
    public String mo20773w() {
        return "function playable_callJS(){return \"Android调用了JS的callJS方法\";}";
    }

    /* renamed from: h */
    static /* synthetic */ int m12741h(C3890g gVar) {
        int i = gVar.f10073v;
        gVar.f10073v = i + 1;
        return i;
    }

    private C3890g(Context context, WebView webView, C3859c cVar, C3855a aVar) {
        this.f10077z = webView;
        C3900h.m12795a(webView);
        mo20733a((View) webView);
        m12728a(context, cVar, aVar);
        m12742x();
    }

    /* renamed from: a */
    private void m12728a(Context context, C3859c cVar, C3855a aVar) {
        this.f10060i = UUID.randomUUID().toString();
        this.f10076y = context;
        this.f10019B = new C3861e(this);
        this.f10020C = aVar;
        this.f10021D = cVar;
    }

    /* renamed from: x */
    private void m12742x() {
        this.f10057f = new C3856b(this);
        this.f10053b = new Runnable() {
            public void run() {
                if (C3890g.this.f10063l) {
                    boolean unused = C3890g.this.f10063l = false;
                    C3890g.this.f10044a.removeCallbacks(C3890g.this.f10054c);
                    C3890g.this.mo20731a(2, "容器加载超时");
                }
            }
        };
        this.f10054c = new Runnable() {
            public void run() {
                if (C3890g.this.f10063l) {
                    boolean unused = C3890g.this.f10063l = false;
                    C3890g.this.f10044a.removeCallbacks(C3890g.this.f10053b);
                    C3890g.this.mo20731a(3, "JSSDK加载超时");
                }
            }
        };
        this.f10056e = new TimerTask() {
            public void run() {
                C3890g.this.f10044a.post(new Runnable() {
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 19 && C3890g.this.f10077z != null) {
                            C3890g.this.f10077z.evaluateJavascript("javascript:playable_callJS()", new ValueCallback<String>() {
                                /* renamed from: a */
                                public void onReceiveValue(String str) {
                                    if (C3890g.this.f10057f != null) {
                                        C3890g.this.f10057f.mo20714a(System.currentTimeMillis());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
    }

    /* renamed from: y */
    private boolean m12743y() {
        String str = this.f10030M;
        if (str != null) {
            return str.contains("/union-fe/playable/") || this.f10030M.contains("/union-fe-sg/playable/") || this.f10030M.contains("/union-fe-i18n/playable/");
        }
        return false;
    }

    /* renamed from: a */
    public void mo20733a(View view) {
        if (view != null) {
            try {
                this.f10018A = new WeakReference<>(view);
                m12733b(view);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f10052ah);
            } catch (Throwable th) {
                C3888f.m12722a("PlayablePlugin", "setViewForScreenSize error", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12733b(View view) {
        if (view != null) {
            try {
                if (this.f10022E != view.getWidth() || this.f10023F != view.getHeight()) {
                    this.f10022E = view.getWidth();
                    this.f10023F = view.getHeight();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", this.f10022E);
                    jSONObject.put("height", this.f10023F);
                    mo20734a(MraidJsMethods.RESIZE, jSONObject);
                    this.f10024G = jSONObject;
                }
            } catch (Throwable th) {
                C3888f.m12722a("PlayablePlugin", "resetViewDataJsonByView error", th);
            }
        }
    }

    /* renamed from: a */
    public Context mo20726a() {
        return this.f10076y;
    }

    /* renamed from: a */
    public C3890g mo20728a(String str, String str2) {
        this.f10028K.put(str, str2);
        return this;
    }

    /* renamed from: b */
    public Map<String, String> mo20738b() {
        return this.f10028K;
    }

    /* renamed from: a */
    public C3890g mo20727a(String str) {
        this.f10025H = str;
        return this;
    }

    /* renamed from: b */
    public C3890g mo20736b(String str) {
        this.f10026I = str;
        return this;
    }

    /* renamed from: c */
    public JSONObject mo20743c() {
        return this.f10031N;
    }

    /* renamed from: c */
    public C3890g mo20741c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.f10031N = jSONObject;
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    /* renamed from: d */
    public String mo20747d() {
        return this.f10026I;
    }

    /* renamed from: e */
    public String mo20750e() {
        return this.f10025H;
    }

    /* renamed from: d */
    public C3890g mo20746d(String str) {
        this.f10027J = str;
        return this;
    }

    /* renamed from: f */
    public String mo20753f() {
        return this.f10027J;
    }

    /* renamed from: e */
    public C3890g mo20749e(String str) {
        this.f10043Z = str;
        return this;
    }

    /* renamed from: g */
    public String mo20754g() {
        return this.f10043Z;
    }

    /* renamed from: a */
    public C3890g mo20730a(boolean z) {
        this.f10045aa = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.f10045aa);
            mo20734a("volumeChange", jSONObject);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    /* renamed from: h */
    public boolean mo20757h() {
        return this.f10045aa;
    }

    /* renamed from: b */
    public C3890g mo20737b(boolean z) {
        if (this.f10046ab == z) {
            return this;
        }
        this.f10046ab = z;
        m12737d(z ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", (JSONObject) null);
        if (this.f10070s == -1 && this.f10046ab) {
            this.f10070s = System.currentTimeMillis();
            m12737d("PL_sdk_page_show", (JSONObject) null);
        }
        if (this.f10046ab) {
            this.f10069r = System.currentTimeMillis();
        } else if (this.f10069r != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10069r;
            C3888f.m12721a("PlayablePlugin", "playable show time +" + currentTimeMillis);
            this.f10067p = this.f10067p + currentTimeMillis;
            this.f10069r = -1;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", this.f10046ab);
            mo20734a("viewableChange", jSONObject);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "setViewable error", th);
        }
        return this;
    }

    /* renamed from: i */
    public boolean mo20759i() {
        return this.f10046ab;
    }

    /* renamed from: c */
    public C3890g mo20742c(boolean z) {
        this.f10047ac = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f10047ac);
            mo20734a("change_playable_click", jSONObject);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    /* renamed from: j */
    public Set<String> mo20760j() {
        return this.f10019B.mo20718a();
    }

    /* renamed from: a */
    public void mo20734a(String str, JSONObject jSONObject) {
        if (C3888f.m12723a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CALL JS [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            C3888f.m12721a("PlayablePlugin", sb.toString());
        }
        C3859c cVar = this.f10021D;
        if (cVar != null) {
            cVar.mo18573a(str, jSONObject);
        }
    }

    /* renamed from: k */
    public C3860d mo20761k() {
        return this.f10020C.mo18568a();
    }

    /* renamed from: l */
    public C3855a mo20762l() {
        return this.f10020C;
    }

    /* renamed from: m */
    public JSONObject mo20763m() {
        return this.f10024G;
    }

    /* renamed from: n */
    public JSONObject mo20764n() {
        return this.f10029L;
    }

    /* renamed from: a */
    public C3890g mo20729a(JSONObject jSONObject) {
        this.f10029L = jSONObject;
        return this;
    }

    /* renamed from: f */
    public C3890g mo20752f(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } catch (Throwable unused) {
            }
        }
        this.f10030M = str;
        return this;
    }

    /* renamed from: o */
    public JSONObject mo20765o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", (double) this.f10032O);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.f10033P);
            jSONObject2.put("height", this.f10034Q);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.f10036S);
            jSONObject3.put("y", this.f10035R);
            jSONObject3.put("width", this.f10037T);
            jSONObject3.put("height", this.f10038U);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f10040W);
            jSONObject4.put("y", this.f10039V);
            jSONObject4.put("width", this.f10041X);
            jSONObject4.put("height", this.f10042Y);
            jSONObject.put(TJAdUnitConstants.String.VISIBLE, jSONObject4);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    /* renamed from: p */
    public void mo20766p() {
        this.f10020C.mo18570b();
    }

    /* renamed from: g */
    public void mo20755g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f10071t = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f10070s != -1) {
                j = this.f10071t - this.f10070s;
            }
            jSONObject.put("playable_page_show_duration", j);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        m12737d("PL_sdk_html_load_start", jSONObject);
        if (this.f10062k && this.f10075x == C3899a.MAIN) {
            this.f10044a.postDelayed(this.f10053b, this.f10065n * 1000);
            this.f10044a.postDelayed(this.f10054c, this.f10066o * 1000);
            this.f10062k = false;
        }
    }

    /* renamed from: h */
    public void mo20756h(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f10072u = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j = 0;
            if (this.f10071t != -1) {
                j = this.f10072u - this.f10071t;
            }
            jSONObject.put("playable_html_load_start_duration", j);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        m12737d("PL_sdk_html_load_finish", jSONObject);
        this.f10044a.removeCallbacks(this.f10053b);
        if (Build.VERSION.SDK_INT >= 19 && this.f10058g) {
            this.f10058g = false;
            this.f10077z.evaluateJavascript(mo20773w(), new ValueCallback<String>() {
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C3888f.m12721a("Playable_CrashMonitor", "加载注入js=" + str);
                }
            });
        }
        try {
            if (this.f10075x == C3899a.MAIN && this.f10064m && this.f10057f != null) {
                this.f10064m = false;
                this.f10057f.mo20714a(System.currentTimeMillis());
                this.f10055d.schedule(this.f10056e, 0, 1500);
                this.f10057f.mo20713a(1000);
            }
        } catch (Throwable th2) {
            C3888f.m12722a("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    /* renamed from: s */
    public void mo20769s() {
        this.f10044a.removeCallbacks(this.f10053b);
        this.f10044a.removeCallbacks(this.f10054c);
    }

    /* renamed from: b */
    public void mo20740b(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.optBoolean("success", true) && this.f10063l) {
            this.f10063l = false;
            this.f10044a.removeCallbacks(this.f10053b);
            this.f10044a.removeCallbacks(this.f10054c);
            mo20731a(4, "素材渲染失败");
        }
    }

    /* renamed from: b */
    private void m12732b(int i, String str) {
        if (this.f10020C != null && m12743y()) {
            this.f10020C.mo20707a(i, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20731a(int i, String str) {
        m12732b(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "reportRenderFatal error", th);
        }
        m12737d("PL_sdk_global_faild", jSONObject);
    }

    /* renamed from: t */
    public void mo20770t() {
        C3888f.m12721a("Playable_CrashMonitor", "-- 检测到页面卡顿超过2s  需要上报");
        m12737d("PL_sdk_page_stuck", (JSONObject) null);
        Timer timer = this.f10055d;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20739b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            m12737d(str, jSONObject);
        }
    }

    /* renamed from: b */
    private String m12731b(String str, String str2) {
        return String.format("rubeex://playable-lynx?accessKey=%1s&groupId=%2s&cardId=main", new Object[]{str, str2});
    }

    /* renamed from: d */
    private void m12737d(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("playable_event", str);
                jSONObject.put("playable_ts", System.currentTimeMillis());
                jSONObject.put("playable_viewable", this.f10046ab);
                jSONObject.put("playable_session_id", this.f10060i);
                if (this.f10075x == C3899a.MAIN) {
                    jSONObject.put("playable_url", this.f10030M);
                } else {
                    jSONObject.put("playable_url", m12731b(this.f10049ae, this.f10050af));
                }
                jSONObject.put("playable_is_prerender", this.f10048ad);
                jSONObject.put("playable_render_type", this.f10075x.ordinal());
                jSONObject.put("playable_sdk_version", "5.2.2");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ad_extra_data", jSONObject);
                jSONObject2.put("tag", this.f10061j);
                jSONObject2.put("nt", 4);
                jSONObject2.put("category", "umeng");
                jSONObject2.put("is_ad_event", "1");
                jSONObject2.put("refer", "playable");
                jSONObject2.put("value", this.f10029L.opt(BidResponsedEx.KEY_CID));
                jSONObject2.put("log_extra", this.f10029L.opt("log_extra"));
                if (this.f10020C != null) {
                    if (this.f10075x == C3899a.MAIN) {
                        if (m12743y()) {
                            C3888f.m12721a("PlayablePlugin", "reportEvent by ActionProxy");
                            this.f10020C.mo20708a("playable_track", jSONObject2);
                            this.f10020C.mo18572c(jSONObject);
                            return;
                        }
                    }
                    if (this.f10075x != C3899a.MAIN) {
                        C3888f.m12721a("PlayablePlugin", "reportEvent by ActionProxy");
                        this.f10020C.mo20708a("playable_track", jSONObject2);
                        this.f10020C.mo18572c(jSONObject);
                        return;
                    }
                    C3888f.m12721a("PlayablePlugin", "reportEvent error no not playable url");
                    return;
                }
                C3888f.m12721a("PlayablePlugin", "reportEvent error no impl");
            } catch (Throwable th) {
                C3888f.m12722a("PlayablePlugin", "reportEvent error", th);
            }
        }
    }

    /* renamed from: i */
    public void mo20758i(String str) {
        this.f10044a.post(new Runnable() {
            public void run() {
                C3890g.m12741h(C3890g.this);
            }
        });
    }

    /* renamed from: u */
    public void mo20771u() {
        this.f10032O = 0.0f;
        this.f10033P = 0;
        this.f10034Q = 0;
        this.f10035R = 0;
        this.f10036S = 0;
        this.f10037T = 0;
        this.f10038U = 0;
        this.f10039V = 0;
        this.f10040W = 0;
        this.f10041X = 0;
        this.f10042Y = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|(2:7|(1:9)(1:10))|11|12|13|14|(1:16)|17|(1:19)|22|23|24|25|(1:27)|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[Catch:{ all -> 0x00ba }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20772v() {
        /*
            r7 = this;
            boolean r0 = r7.f10051ag
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r7.f10051ag = r0
            r0 = 0
            r7.f10068q = r0
            r7.mo20771u()
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f10018A     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            r2 = 16
            if (r1 < r2) goto L_0x0029
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f10052ah     // Catch:{ all -> 0x0032 }
            r0.removeOnGlobalLayoutListener(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0032
        L_0x0029:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.f10052ah     // Catch:{ all -> 0x0032 }
            r0.removeGlobalOnLayoutListener(r1)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            com.bytedance.sdk.openadsdk.j.e r0 = r7.f10019B     // Catch:{ all -> 0x0037 }
            r0.mo20720b()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            java.util.Timer r0 = r7.f10055d     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0040
            java.util.Timer r0 = r7.f10055d     // Catch:{ all -> 0x004d }
            r0.cancel()     // Catch:{ all -> 0x004d }
        L_0x0040:
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f10057f     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0065
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f10057f     // Catch:{ all -> 0x004d }
            r0.mo20712a()     // Catch:{ all -> 0x004d }
            r0 = 0
            r7.f10057f = r0     // Catch:{ all -> 0x004d }
            goto L_0x0065
        L_0x004d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "发生crash -- "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Playable_CrashMonitor"
            com.bytedance.sdk.openadsdk.p178j.C3888f.m12721a(r1, r0)
        L_0x0065:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x007d }
            r0.<init>()     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "playable_all_times"
            int r2 = r7.f10073v     // Catch:{ all -> 0x007d }
            r0.put(r1, r2)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "playable_hit_times"
            int r2 = r7.f10074w     // Catch:{ all -> 0x007d }
            r0.put(r1, r2)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "PL_sdk_preload_times"
            r7.m12737d(r1, r0)     // Catch:{ all -> 0x007d }
        L_0x007d:
            long r0 = r7.f10069r     // Catch:{ all -> 0x00ba }
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            long r4 = r7.f10069r     // Catch:{ all -> 0x00ba }
            long r0 = r0 - r4
            java.lang.String r4 = "PlayablePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r5.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = "playable show time +"
            r5.append(r6)     // Catch:{ all -> 0x00ba }
            r5.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ba }
            com.bytedance.sdk.openadsdk.p178j.C3888f.m12721a(r4, r5)     // Catch:{ all -> 0x00ba }
            long r4 = r7.f10067p     // Catch:{ all -> 0x00ba }
            long r4 = r4 + r0
            r7.f10067p = r4     // Catch:{ all -> 0x00ba }
            r7.f10069r = r2     // Catch:{ all -> 0x00ba }
        L_0x00a9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00ba }
            r0.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "playable_user_play_duration"
            long r2 = r7.f10067p     // Catch:{ all -> 0x00ba }
            r0.put(r1, r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "PL_sdk_user_play_duration"
            r7.m12737d(r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178j.C3890g.mo20772v():void");
    }

    /* renamed from: a */
    public void mo20732a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            jSONObject.put("description", str);
            jSONObject.put("failingUrl", str2);
        } catch (Throwable th) {
            C3888f.m12722a("PlayablePlugin", "onWebReceivedError error", th);
        }
        m12737d("PL_sdk_html_load_error", jSONObject);
        if (this.f10063l) {
            this.f10063l = false;
            this.f10044a.removeCallbacks(this.f10053b);
            this.f10044a.removeCallbacks(this.f10054c);
            mo20731a(1, "容器加载失败");
        }
    }

    /* renamed from: a */
    public void mo20735a(boolean z, String str, int i) {
        if (z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
                jSONObject.put("failingUrl", str);
            } catch (Throwable th) {
                C3888f.m12722a("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            m12737d("PL_sdk_html_load_error", jSONObject);
            if (this.f10063l) {
                this.f10063l = false;
                this.f10044a.removeCallbacks(this.f10053b);
                this.f10044a.removeCallbacks(this.f10054c);
                mo20731a(1, "容器加载失败");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20745c(JSONObject jSONObject) {
        this.f10020C.mo20709d(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20748d(JSONObject jSONObject) {
        this.f10020C.mo20710e(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20751e(JSONObject jSONObject) {
        this.f10020C.mo20711f(jSONObject);
    }

    /* renamed from: c */
    public JSONObject mo20744c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (C3888f.m12723a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayablePlugin JSB-REQ [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : str2);
            C3888f.m12721a("PlayablePlugin", sb.toString());
        }
        JSONObject a = this.f10019B.mo20719a(str, jSONObject);
        if (C3888f.m12723a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PlayablePlugin JSB-RSP [");
            sb2.append(str);
            sb2.append("] time:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ");
            if (a != null) {
                str2 = a.toString();
            }
            sb2.append(str2);
            C3888f.m12721a("PlayablePlugin", sb2.toString());
        }
        return a;
    }

    /* renamed from: a */
    public static C3890g m12726a(Context context, WebView webView, C3859c cVar, C3855a aVar) {
        if (webView == null || cVar == null || aVar == null) {
            return null;
        }
        return new C3890g(context, webView, cVar, aVar);
    }
}
