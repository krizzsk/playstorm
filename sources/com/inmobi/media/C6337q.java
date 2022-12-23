package com.inmobi.media;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C6012eb;
import com.inmobi.media.C6014ec;
import com.inmobi.media.C6042er;
import com.inmobi.media.C6125fq;
import com.inmobi.media.C6286j;
import com.inmobi.media.C6299jg;
import com.inmobi.media.C6364z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p374my.tracker.ads.AdFormat;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.q */
/* compiled from: RenderView */
public final class C6337q extends WebView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, C5956cw, C6286j, C6299jg.C6304a, C6316l, C6364z.C6365a {

    /* renamed from: a */
    public static final C6357s f16049a = new C6357s() {
        /* renamed from: c_ */
        public final C6305jh mo34515c_() {
            return C6305jh.m18842a();
        }
    };

    /* renamed from: aB */
    private static final C6012eb.C6013a f16050aB = new C6012eb.C6013a() {

        /* renamed from: a */
        private long f16149a;

        /* renamed from: a */
        public final boolean mo35134a(View view) {
            View view2 = view;
            if (!(view2 instanceof C6337q)) {
                return false;
            }
            C6337q qVar = (C6337q) view2;
            Rect rect = new Rect();
            if (qVar.getGlobalVisibleRect(rect) && rect.intersect(qVar.getAdFrameRect())) {
                Bitmap createBitmap = Bitmap.createBitmap(qVar.getWidth(), qVar.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                qVar.draw(canvas);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, C6252ic.m18660b(qVar.getWidth()), C6252ic.m18660b(qVar.getHeight()), true);
                int i = qVar.f16090am[0];
                int i2 = qVar.f16090am[1];
                int i3 = qVar.f16090am[2] + i;
                int i4 = qVar.f16090am[3] + i2;
                Bitmap bitmap = null;
                if (i < createScaledBitmap.getWidth() && i2 < createScaledBitmap.getHeight()) {
                    if (i < 0) {
                        i = 0;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    if (i3 > createScaledBitmap.getWidth()) {
                        i3 = createScaledBitmap.getWidth();
                    }
                    if (i4 > createScaledBitmap.getHeight()) {
                        i4 = createScaledBitmap.getHeight();
                    }
                    bitmap = Bitmap.createBitmap(createScaledBitmap, i, i2, Math.max(i3 - i, 0), Math.max(i4 - i2, 0));
                }
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    return false;
                }
                int width = bitmap2.getWidth() * bitmap2.getHeight();
                int[] iArr = new int[width];
                bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                int i5 = 0;
                for (int i6 = 0; i6 < width; i6++) {
                    int i7 = iArr[i6];
                    if (i7 > -16777216 && i7 < 0 && (i5 = i5 + 1) >= qVar.f16092ao) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo35151a(View view, View view2, int i, Object obj) {
            if (!(view2 == null || view2.getVisibility() != 0 || view == null || view.getParent() == null || !view2.isShown())) {
                C6337q qVar = null;
                if (view2 instanceof C6337q) {
                    qVar = (C6337q) view2;
                }
                if (qVar == null) {
                    return false;
                }
                if (qVar.getPlacementType() != 1 && (qVar.getHeight() <= 0 || qVar.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!qVar.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f16149a = ((long) rect.height()) * ((long) rect.width());
                if (qVar.getPlacementType() == 1) {
                    long unused = qVar.f16091an = (long) (qVar.getWidth() * qVar.getHeight());
                }
                if (qVar.f16091an <= 0 || this.f16149a * 100 < ((long) i) * qVar.f16091an) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0078 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo35150a(android.view.View r11, android.view.View r12, int r13) {
            /*
                r10 = this;
                android.view.ViewParent r0 = r11.getParent()
                boolean r0 = r0 instanceof android.view.ViewGroup
                if (r0 == 0) goto L_0x000f
                android.view.ViewParent r0 = r11.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x001d
                boolean r3 = r10.mo35150a(r0, r12, r13)
                if (r3 == 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r1
                goto L_0x001e
            L_0x001d:
                r3 = r2
            L_0x001e:
                if (r0 == 0) goto L_0x007f
                int r11 = r0.indexOfChild(r11)
                int r11 = r11 + r2
            L_0x0025:
                int r4 = r0.getChildCount()
                if (r11 >= r4) goto L_0x007f
                android.view.View r4 = r0.getChildAt(r11)
                int r5 = r4.getVisibility()
                if (r5 != 0) goto L_0x007c
                boolean r5 = r12 instanceof com.inmobi.media.C6337q
                if (r5 != 0) goto L_0x003b
            L_0x0039:
                r4 = r2
                goto L_0x0076
            L_0x003b:
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                r12.getGlobalVisibleRect(r5)
                r4.getGlobalVisibleRect(r6)
                boolean r4 = r6.intersect(r5)
                int r5 = r6.width()
                int r6 = r6.height()
                int r5 = r5 * r6
                if (r4 == 0) goto L_0x0075
                int r5 = r5 * 100
                long r4 = (long) r5
                long r6 = r10.f16149a
                r8 = 100
                long r6 = r6 * r8
                long r4 = r4 - r6
                long r4 = java.lang.Math.abs(r4)
                r6 = r12
                com.inmobi.media.q r6 = (com.inmobi.media.C6337q) r6
                long r6 = r6.f16091an
                long r8 = (long) r13
                long r6 = r6 * r8
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x0075
                goto L_0x0039
            L_0x0075:
                r4 = r1
            L_0x0076:
                if (r4 == 0) goto L_0x007c
                java.lang.String unused = com.inmobi.media.C6337q.f16051z
                return r1
            L_0x007c:
                int r11 = r11 + 1
                goto L_0x0025
            L_0x007f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6337q.C63537.mo35150a(android.view.View, android.view.View, int):boolean");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final String f16051z = C6337q.class.getSimpleName();

    /* renamed from: A */
    private byte f16052A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C6337q f16053B = null;

    /* renamed from: C */
    private WeakReference<ViewGroup> f16054C;

    /* renamed from: D */
    private C6357s f16055D;

    /* renamed from: E */
    private C6125fq f16056E;

    /* renamed from: F */
    private boolean f16057F;

    /* renamed from: G */
    private C5957cx f16058G;

    /* renamed from: H */
    private C5976de f16059H;

    /* renamed from: I */
    private JSONObject f16060I;

    /* renamed from: J */
    private JSONObject f16061J;

    /* renamed from: K */
    private boolean f16062K = true;

    /* renamed from: L */
    private final Object f16063L = new Object();

    /* renamed from: M */
    private final Object f16064M = new Object();

    /* renamed from: N */
    private boolean f16065N = true;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public View f16066O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public WebChromeClient.CustomViewCallback f16067P;

    /* renamed from: Q */
    private int f16068Q = -1;

    /* renamed from: R */
    private boolean f16069R = false;

    /* renamed from: S */
    private long f16070S = Long.MIN_VALUE;

    /* renamed from: T */
    private String f16071T;

    /* renamed from: U */
    private String f16072U;

    /* renamed from: V */
    private C6286j f16073V;

    /* renamed from: W */
    private boolean f16074W = false;

    /* renamed from: aA */
    private final C6014ec.C6016a f16075aA = new C6014ec.C6016a() {
        /* renamed from: a */
        public final void mo35143a(View view, Object obj) {
            if (view instanceof C6337q) {
                C6337q.this.mo35657h();
            }
        }
    };

    /* renamed from: aC */
    private final C6286j.C6287a f16076aC = new C6286j.C6287a() {
        /* renamed from: a */
        public final void mo35510a() {
            String unused = C6337q.f16051z;
            C6337q.this.getListener().mo34464a();
        }

        /* renamed from: a */
        public final void mo35511a(Object obj) {
            String unused = C6337q.f16051z;
            if (C6337q.this.f16107e == 0) {
                if (C6337q.this.f16053B != null) {
                    C6337q.this.f16053B.setAndUpdateViewState("Expanded");
                } else {
                    C6337q.this.setAndUpdateViewState("Expanded");
                }
                boolean unused2 = C6337q.this.f16120r = false;
            }
            C6337q.this.getListener().mo34610a_(C6337q.this);
        }

        /* renamed from: b */
        public final void mo35512b(Object obj) {
            String unused = C6337q.f16051z;
            if (C6337q.this.f16107e == 0) {
                C6337q.this.setAndUpdateViewState("Default");
                if (C6337q.this.f16053B != null) {
                    C6337q.this.f16053B.setAndUpdateViewState("Default");
                }
            } else if ("Default".equals(C6337q.this.f16106d)) {
                C6337q.this.setAndUpdateViewState("Hidden");
            }
            C6337q.this.getListener().mo34616b_(C6337q.this);
        }
    };

    /* renamed from: aD */
    private final WebChromeClient f16077aD = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C6337q.f16051z;
            if (!C6337q.m19042a(C6337q.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C6337q.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setCancelable(false).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C6337q.f16051z;
            if (!C6337q.m19042a(C6337q.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C6337q.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.cancel();
                    }
                }).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            String unused = C6337q.f16051z;
            if (!C6337q.m19042a(C6337q.this, (JsResult) jsPromptResult)) {
                return true;
            }
            if (C6337q.this.getFullScreenActivity() != null) {
                return false;
            }
            jsPromptResult.cancel();
            return true;
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C6337q.this.f16104b != null && C6337q.this.f16104b.get() != null) {
                View unused = C6337q.this.f16066O = view;
                WebChromeClient.CustomViewCallback unused2 = C6337q.this.f16067P = customViewCallback;
                C6337q.this.f16066O.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
                C6337q.this.f16066O.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                ((FrameLayout) ((Activity) C6337q.this.f16104b.get()).findViewById(16908290)).addView(C6337q.this.f16066O, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
                C6337q.this.f16066O.requestFocus();
                View m = C6337q.this.f16066O;
                m.setOnKeyListener(new View.OnKeyListener() {
                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
                            return false;
                        }
                        String unused = C6337q.f16051z;
                        C633910.this.m19100a();
                        return true;
                    }
                });
                m.setFocusable(true);
                m.setFocusableInTouchMode(true);
                m.requestFocus();
            }
        }

        public final void onHideCustomView() {
            m19100a();
            super.onHideCustomView();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m19100a() {
            if (C6337q.this.f16066O != null) {
                if (C6337q.this.f16067P != null) {
                    C6337q.this.f16067P.onCustomViewHidden();
                    WebChromeClient.CustomViewCallback unused = C6337q.this.f16067P = null;
                }
                if (C6337q.this.f16066O != null && C6337q.this.f16066O.getParent() != null) {
                    ((ViewGroup) C6337q.this.f16066O.getParent()).removeView(C6337q.this.f16066O);
                    View unused2 = C6337q.this.f16066O = null;
                }
            }
        }

        public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            if (!(C6337q.this.f16104b == null || C6337q.this.f16104b.get() == null)) {
                new AlertDialog.Builder((Context) C6337q.this.f16104b.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, true, false);
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, false, false);
                    }
                }).create().show();
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            consoleMessage.sourceId();
            String unused = C6337q.f16051z;
            return true;
        }
    };

    /* renamed from: aa */
    private long f16078aa = -1;

    /* renamed from: ab */
    private String f16079ab = TJAdUnitConstants.String.HTML;

    /* renamed from: ac */
    private C6028ei f16080ac;

    /* renamed from: ad */
    private C6014ec f16081ad;

    /* renamed from: ae */
    private final Set<C6002du> f16082ae;

    /* renamed from: af */
    private C6004dw f16083af;

    /* renamed from: ag */
    private boolean f16084ag;

    /* renamed from: ah */
    private boolean f16085ah;

    /* renamed from: ai */
    private boolean f16086ai = true;

    /* renamed from: aj */
    private int f16087aj;

    /* renamed from: ak */
    private int f16088ak;

    /* renamed from: al */
    private String f16089al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public int[] f16090am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public long f16091an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public int f16092ao;

    /* renamed from: ap */
    private int f16093ap = Integer.MIN_VALUE;

    /* renamed from: aq */
    private int f16094aq = Integer.MIN_VALUE;

    /* renamed from: ar */
    private final C6364z f16095ar;

    /* renamed from: as */
    private final GestureDetector f16096as;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public C6317m f16097at;

    /* renamed from: au */
    private C5975dd f16098au;

    /* renamed from: av */
    private final C6356r f16099av = new C6356r();

    /* renamed from: aw */
    private C6361w f16100aw;

    /* renamed from: ax */
    private String f16101ax = "DEFAULT";

    /* renamed from: ay */
    private final C6060f f16102ay = new C6060f() {
        /* renamed from: a */
        public final void mo35211a(String str) {
            C6337q.this.f16097at.mo35546a(str);
        }

        /* renamed from: a */
        public final void mo35210a() {
            String unused = C6337q.f16051z;
            C6337q.this.getListener().mo34610a_(C6337q.this);
            C6337q.this.mo35617c((String) null, (String) null, (String) null);
        }

        /* renamed from: b */
        public final void mo35212b() {
            String unused = C6337q.f16051z;
            C6337q.this.getListener().mo34616b_(C6337q.this);
        }
    };

    /* renamed from: az */
    private final C6225hm f16103az = new C6225hm() {
        /* renamed from: a */
        public final void mo35429a() {
            C6337q.this.getListener().mo34495a_();
        }

        /* renamed from: a */
        public final void mo35431a(String str, String str2, String str3) {
            C6337q.this.mo35614b(str, str2, str3);
        }

        /* renamed from: b */
        public final void mo35432b(String str, String str2, String str3) {
            C6337q.this.mo35617c(str, str2, str3);
        }

        /* renamed from: a */
        public final void mo35430a(Intent intent) {
            InMobiAdActivity.m23429a(C6337q.this);
            C6227ho.m18540a(C6337q.this.getContainerContext(), intent);
        }
    };

    /* renamed from: b */
    public WeakReference<Activity> f16104b = new WeakReference<>((Object) null);

    /* renamed from: c */
    boolean f16105c = false;

    /* renamed from: d */
    public String f16106d = "Default";

    /* renamed from: e */
    public byte f16107e;

    /* renamed from: f */
    public C5962cz f16108f;

    /* renamed from: g */
    public C5973dc f16109g;

    /* renamed from: h */
    public C5966db f16110h;

    /* renamed from: i */
    public boolean f16111i;

    /* renamed from: j */
    public boolean f16112j = true;

    /* renamed from: k */
    public boolean f16113k = true;

    /* renamed from: l */
    public boolean f16114l = false;

    /* renamed from: m */
    public boolean f16115m = false;

    /* renamed from: n */
    public boolean f16116n = false;

    /* renamed from: o */
    public boolean f16117o = false;

    /* renamed from: p */
    public String f16118p = null;

    /* renamed from: q */
    public AtomicBoolean f16119q = new AtomicBoolean(false);

    /* renamed from: r */
    public boolean f16120r;

    /* renamed from: s */
    public String f16121s;

    /* renamed from: t */
    public C5798ai f16122t;

    /* renamed from: u */
    public boolean f16123u;

    /* renamed from: v */
    public C6315k f16124v;

    /* renamed from: w */
    public boolean f16125w = false;

    /* renamed from: x */
    public String f16126x;

    /* renamed from: y */
    public final C5871bh f16127y = new C5871bh() {
        /* renamed from: a */
        public final void mo34829a(C5841aw awVar, byte b) {
            if (awVar.f14737f != null && awVar.f14732a.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", awVar.f14732a.get(0).f14715d);
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, awVar.f14732a.get(0).f14723l);
                } catch (JSONException unused) {
                }
                String unused2 = C6337q.f16051z;
                C6337q.this.mo35611a(awVar.f14737f, "sendSaveContentResult(\"saveContent_" + awVar.f14738g + "\", 'failed', \"" + jSONObject.toString().replace("\"", "\\\"") + "\");");
            }
        }

        /* renamed from: a */
        public final void mo34828a(C5841aw awVar) {
            if (awVar.f14737f != null && awVar.f14732a.size() > 0) {
                String unused = C6337q.f16051z;
                C6337q.this.mo35611a(awVar.f14737f, "sendSaveContentResult(\"saveContent_" + awVar.f14738g + "\", 'success', \"" + awVar.f14732a.get(0).f14722k + "\");");
            }
        }
    };

    public final Object getDataModel() {
        return null;
    }

    public final View getVideoContainerView() {
        return null;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public final void mo35609a(C6364z zVar) {
        if (getRenderingConfig().gestures.contains(2)) {
            zVar.f16176h.length();
            mo35620d("window.imraidview.onGestureDetected('2', '" + zVar.f16176h.toString() + "');");
        }
    }

    /* renamed from: a */
    public final void mo35606a(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(4)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf((motionEvent.getX() + motionEvent.getX(1)) / 2.0f), Float.valueOf((motionEvent.getY() + motionEvent.getY(1)) / 2.0f)})));
            mo35620d("window.imraidview.onGestureDetected('4', '" + jSONArray.toString() + "');");
        }
    }

    /* renamed from: a */
    public final void mo35607a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (getRenderingConfig().gestures.contains(3)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1))})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent2.getX()), Float.valueOf(motionEvent2.getY())})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent2.getX(1)), Float.valueOf(motionEvent2.getY(1))})));
            mo35620d("window.imraidview.onGestureDetected('3', '" + jSONArray.toString() + "');");
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f16078aa = SystemClock.elapsedRealtime();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(5)) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put((double) motionEvent.getX());
                jSONArray.put((double) motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            mo35620d("window.imraidview.onGestureDetected('5', '" + jSONArray2.toString() + "');");
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!getRenderingConfig().gestures.contains(0)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put((double) motionEvent.getX());
            jSONArray.put((double) motionEvent.getY());
        } catch (JSONException unused) {
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        mo35620d("window.imraidview.onGestureDetected('0', '" + jSONArray2.toString() + "');");
        return false;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (!getRenderingConfig().gestures.contains(1)) {
            return false;
        }
        this.f16078aa = SystemClock.elapsedRealtime();
        if (motionEvent.getAction() == 1) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put((double) motionEvent.getX());
                jSONArray.put((double) motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            mo35620d("window.imraidview.onGestureDetected('1', '" + jSONArray2.toString() + "');");
        }
        return false;
    }

    public C6337q(Context context, byte b, Set<C6002du> set, String str, Boolean bool, String str2) {
        super(context.getApplicationContext());
        boolean z = false;
        this.f16107e = b;
        this.f16120r = false;
        this.f16082ae = set;
        this.f16121s = str;
        setReferenceContainer(this);
        this.f16073V = this;
        this.f16085ah = true;
        this.f16105c = bool.booleanValue();
        this.f16101ax = str2;
        this.f16095ar = new C6364z(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f16096as = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        this.f16096as.setIsLongpressEnabled(b == 1 ? true : z);
        this.f16098au = new C5975dd();
    }

    public final void setAdPodHandler(C6315k kVar) {
        this.f16124v = kVar;
    }

    public final C6315k getAdPodHandler() {
        return this.f16124v;
    }

    public final void setAdSize(String str) {
        this.f16071T = str;
        this.f16088ak = C6252ic.m18654a(Integer.parseInt(str.split("x")[0]));
        int a = C6252ic.m18654a(Integer.parseInt(str.split("x")[1]));
        this.f16087aj = a;
        this.f16091an = (long) (a * this.f16088ak);
    }

    public final void setIsPreload(boolean z) {
        this.f16123u = z;
    }

    public final void setPlacementId(long j) {
        this.f16070S = j;
    }

    public final void setImpressionId(String str) {
        this.f16121s = str;
    }

    public final void setCreativeId(String str) {
        this.f16072U = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.f16074W = z;
    }

    public final void setBlobProvider(C5798ai aiVar) {
        this.f16122t = aiVar;
    }

    public final String getImpressionId() {
        return this.f16121s;
    }

    public final String getCreativeId() {
        return this.f16072U;
    }

    public final long getPlacementId() {
        return this.f16070S;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f16074W;
    }

    public final void setOriginalRenderView(C6337q qVar) {
        this.f16053B = qVar;
    }

    public final C6337q getOriginalRenderView() {
        return this.f16053B;
    }

    public final C6286j.C6287a getFullScreenEventsListener() {
        return this.f16076aC;
    }

    public final byte getPlacementType() {
        return this.f16107e;
    }

    public final String getState() {
        return this.f16106d;
    }

    public final Object getDefaultPositionMonitor() {
        return this.f16063L;
    }

    public final Object getCurrentPositionMonitor() {
        return this.f16064M;
    }

    public final void setShouldFireRenderBeacon(boolean z) {
        this.f16086ai = z;
    }

    public final String getContentUrl() {
        return this.f16089al;
    }

    public final void setContentUrl(String str) {
        this.f16089al = str;
    }

    public final Context getContainerContext() {
        WeakReference<Activity> weakReference = this.f16104b;
        if (weakReference == null || weakReference.get() == null) {
            return getContext();
        }
        return (Context) this.f16104b.get();
    }

    /* renamed from: d */
    public final void mo35619d() {
        int[] iArr = new int[2];
        this.f16060I = new JSONObject();
        if (this.f16054C == null) {
            this.f16054C = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f16054C.get() != null) {
            ((ViewGroup) this.f16054C.get()).getLocationOnScreen(iArr);
            try {
                this.f16060I.put("x", C6252ic.m18660b(iArr[0]));
                this.f16060I.put("y", C6252ic.m18660b(iArr[1]));
                int b = C6252ic.m18660b(((ViewGroup) this.f16054C.get()).getWidth());
                int b2 = C6252ic.m18660b(((ViewGroup) this.f16054C.get()).getHeight());
                this.f16060I.put("width", b);
                this.f16060I.put("height", b2);
            } catch (JSONException unused) {
            }
        } else {
            this.f16060I.put("x", 0);
            this.f16060I.put("y", 0);
            this.f16060I.put("width", 0);
            this.f16060I.put("height", 0);
        }
        synchronized (this.f16063L) {
            this.f16112j = false;
            this.f16063L.notifyAll();
        }
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.f16060I;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* renamed from: e */
    public final void mo35622e() {
        this.f16061J = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            this.f16061J.put("x", C6252ic.m18660b(iArr[0]));
            this.f16061J.put("y", C6252ic.m18660b(iArr[1]));
            int b = C6252ic.m18660b(getWidth());
            int b2 = C6252ic.m18660b(getHeight());
            this.f16061J.put("width", b);
            this.f16061J.put("height", b2);
        } catch (JSONException unused) {
        }
        synchronized (this.f16064M) {
            this.f16113k = false;
            this.f16064M.notifyAll();
        }
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.f16061J;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final void setFullScreenActivityContext(Activity activity) {
        this.f16104b = new WeakReference<>(activity);
        m19061n();
    }

    /* renamed from: n */
    private void m19061n() {
        Activity activity = (Activity) this.f16104b.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).mo56396a(this.f16098au);
        }
    }

    public final void setEmbeddedBrowserJSCallbacks(C6361w wVar) {
        this.f16100aw = wVar;
    }

    /* renamed from: a */
    public final void mo35032a(C5977df dfVar) {
        if ("Resized".equals(this.f16106d) && getResizeProperties() != null) {
            this.f16109g.mo35077a();
        }
    }

    public final Activity getFullScreenActivity() {
        WeakReference<Activity> weakReference = this.f16104b;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final C6125fq.C6138i getRenderingConfig() {
        return this.f16056E.rendering;
    }

    public final C6125fq.C6136g getMraidConfig() {
        return this.f16056E.mraid;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            int b = C6252ic.m18660b(i);
            int b2 = C6252ic.m18660b(i2);
            mo35620d("window.mraidview.broadcastEvent('sizeChange'," + b + "," + b2 + ");");
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m19050f(i == 0);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f16069R = !z;
        if (z) {
            z = isShown() && f16050aB.mo35151a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed, (Object) null) && f16050aB.mo35150a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed);
        }
        m19048e(z);
    }

    public final void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (i == 0) {
            m19048e(false);
        } else if (!this.f16069R) {
            m19048e(true);
        }
    }

    /* renamed from: e */
    private void m19048e(boolean z) {
        if (this.f16115m != z) {
            if (Build.VERSION.SDK_INT <= 23 || getFullScreenActivity() == null || !getFullScreenActivity().isInMultiWindowMode()) {
                m19050f(z);
            }
        }
    }

    /* renamed from: f */
    private void m19050f(boolean z) {
        if (this.f16115m != z && !this.f16120r) {
            this.f16115m = z;
            if (z) {
                getListener().mo34529f(this);
            }
            m19052g(this.f16115m);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16057F = isHardwareAccelerated();
        if (this.f16054C == null) {
            this.f16054C = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f16086ai && this.f16084ag) {
            C6299jg jgVar = new C6299jg(this, this);
            long b = (long) getListener().mo34515c_().mo35531b();
            C6299jg.C63001 r3 = new TimerTask() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.jg.1.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.jg.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            View view = (View) jgVar.f15942a.get();
            if (view != null) {
                view.post(new Runnable(r3, b) {

                    /* renamed from: a */
                    final /* synthetic */ TimerTask f15947a;

                    /* renamed from: b */
                    final /* synthetic */ long f15948b;

                    public final void run(
/*
Method generation error in method: com.inmobi.media.jg.2.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.jg.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f16107e == 1) {
            C6364z zVar = this.f16095ar;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                zVar.f16173e = motionEvent2.getPointerId(motionEvent.getActionIndex());
                zVar.f16176h = new JSONArray();
                zVar.f16176h.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())})));
            } else if (actionMasked == 1) {
                zVar.f16173e = -1;
                if (zVar.f16176h.length() > 5) {
                    zVar.f16179k.mo35609a(zVar);
                    zVar.f16176h = new JSONArray();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    zVar.f16173e = -1;
                    zVar.f16174f = -1;
                } else if (actionMasked == 5) {
                    zVar.f16174f = motionEvent2.getPointerId(motionEvent.getActionIndex());
                    zVar.f16177i = MotionEvent.obtain(motionEvent);
                    int findPointerIndex = motionEvent2.findPointerIndex(zVar.f16173e);
                    int findPointerIndex2 = motionEvent2.findPointerIndex(zVar.f16174f);
                    if (findPointerIndex >= 0) {
                        zVar.f16171c = motionEvent2.getX(findPointerIndex);
                        zVar.f16172d = motionEvent2.getY(findPointerIndex);
                    } else {
                        C6181gg a = C6181gg.m18398a();
                        a.mo35357a(new C6217hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16173e + " is" + findPointerIndex + " | Pointer count=" + motionEvent.getPointerCount())));
                    }
                    if (findPointerIndex2 >= 0) {
                        zVar.f16169a = motionEvent2.getX(findPointerIndex2);
                        zVar.f16170b = motionEvent2.getY(findPointerIndex2);
                    } else {
                        C6181gg a2 = C6181gg.m18398a();
                        a2.mo35357a(new C6217hg(new IllegalArgumentException("Index for mPtrID2=" + zVar.f16174f + " is" + findPointerIndex2 + " | Pointer count=" + motionEvent.getPointerCount())));
                    }
                    zVar.f16178j = C6364z.m19150a(zVar.f16171c, zVar.f16169a, zVar.f16172d, zVar.f16170b);
                } else if (actionMasked == 6) {
                    zVar.f16174f = -1;
                    if (zVar.f16175g > 30.0f) {
                        zVar.f16179k.mo35607a(zVar.f16177i, motionEvent2);
                        zVar.f16175g = 0.0f;
                    }
                    if (Math.abs(C6364z.m19150a(motionEvent.getX(), motionEvent2.getX(1), motionEvent.getY(), motionEvent2.getY(1)) - zVar.f16178j) > 500) {
                        zVar.f16179k.mo35606a(motionEvent2);
                        zVar.f16178j = Integer.MAX_VALUE;
                    }
                }
            } else if (zVar.f16173e != -1 && zVar.f16174f != -1) {
                int findPointerIndex3 = motionEvent2.findPointerIndex(zVar.f16173e);
                int findPointerIndex4 = motionEvent2.findPointerIndex(zVar.f16174f);
                if (findPointerIndex3 >= 0) {
                    float x = motionEvent2.getX(findPointerIndex3);
                    f = motionEvent2.getY(findPointerIndex3);
                    f2 = x;
                } else {
                    C6181gg a3 = C6181gg.m18398a();
                    a3.mo35357a(new C6217hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16173e + " is" + findPointerIndex3 + " | Pointer count=" + motionEvent.getPointerCount())));
                    f2 = 0.0f;
                    f = 0.0f;
                }
                if (findPointerIndex4 >= 0) {
                    float x2 = motionEvent2.getX(findPointerIndex4);
                    f3 = motionEvent2.getY(findPointerIndex4);
                    f4 = x2;
                } else {
                    C6181gg a4 = C6181gg.m18398a();
                    a4.mo35357a(new C6217hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16174f + " is" + findPointerIndex4 + " | Pointer count=" + motionEvent.getPointerCount())));
                    f4 = 0.0f;
                    f3 = 0.0f;
                }
                zVar.f16175g = Math.abs(C6364z.m19149a(zVar.f16169a, zVar.f16170b, zVar.f16171c, zVar.f16172d, f4, f3, f2, f));
            } else if (zVar.f16173e != -1 && zVar.f16176h.length() > 0 && zVar.f16176h.length() < 50) {
                try {
                    float x3 = motionEvent.getX();
                    float y = motionEvent.getY();
                    JSONArray jSONArray = zVar.f16176h.getJSONArray(zVar.f16176h.length() - 1);
                    JSONArray jSONArray2 = new JSONArray(Arrays.asList(new Float[]{Float.valueOf(x3), Float.valueOf(y)}));
                    if (C6364z.m19150a((float) jSONArray.getInt(0), (float) jSONArray2.getInt(0), (float) jSONArray.getInt(1), (float) jSONArray2.getInt(1)) > 100) {
                        zVar.f16176h.put(jSONArray2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.f16096as.onTouchEvent(motionEvent2);
        return super.onTouchEvent(motionEvent);
    }

    public final void onDetachedFromWindow() {
        this.f16099av.mo35720a();
        getMediaProcessor().mo35069b();
        getMediaProcessor().mo35070c();
        getMediaProcessor().mo35071e();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: o */
    private void m19062o() {
        m19065r();
        m19064q();
        m19063p();
    }

    /* renamed from: p */
    private void m19063p() {
        byte b;
        if (this.f16071T != null) {
            b = this.f16056E.viewability.banner.impressionType;
        } else {
            b = this.f16056E.viewability.interstitial.impressionType;
        }
        this.f16052A = b;
    }

    /* renamed from: q */
    private void m19064q() {
        if ("video".equals(this.f16126x)) {
            this.f16094aq = this.f16056E.viewability.video.impressionMinPercentageViewed;
        } else {
            this.f16094aq = this.f16056E.viewability.web.impressionMinPercentageViewed;
        }
    }

    /* renamed from: r */
    private void m19065r() {
        if ("video".equals(this.f16126x)) {
            this.f16093ap = this.f16056E.viewability.video.impressionMinTimeViewed;
        } else {
            this.f16093ap = this.f16056E.viewability.web.impressionMinTimeViewed;
        }
    }

    public final byte getImpressionType() {
        return this.f16052A;
    }

    /* renamed from: a */
    public final void mo35608a(C6357s sVar, C6125fq fqVar, boolean z, boolean z2) {
        int i;
        if (Build.VERSION.SDK_INT >= 21 && this.f16079ab.equals("htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        this.f16056E = fqVar;
        if (this.f16082ae == null) {
            m19062o();
        } else {
            try {
                m19062o();
                for (C6002du next : this.f16082ae) {
                    if (next.f15269a == 2) {
                        if (next.f15270b.containsKey("type")) {
                            this.f16052A = (byte) ((Integer) next.f15270b.get("type")).intValue();
                        } else {
                            m19063p();
                        }
                        if (next.f15270b.containsKey("time")) {
                            this.f16093ap = ((Integer) next.f15270b.get("time")).intValue();
                        } else {
                            m19065r();
                        }
                        if (next.f15270b.containsKey("view")) {
                            this.f16094aq = ((Integer) next.f15270b.get("view")).intValue();
                        } else {
                            m19064q();
                        }
                        if (getImpressionType() == 2) {
                            if (next.f15270b.containsKey("pixel")) {
                                this.f16092ao = ((Integer) next.f15270b.get("pixel")).intValue();
                            } else {
                                m19063p();
                            }
                            if (next.f15270b.containsKey("frame")) {
                                JSONArray jSONArray = (JSONArray) next.f15270b.get("frame");
                                this.f16090am = new int[jSONArray.length()];
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    this.f16090am[i2] = ((Integer) jSONArray.get(i2)).intValue();
                                }
                            } else {
                                m19063p();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                m19062o();
            } catch (Exception unused2) {
                m19062o();
            }
        }
        this.f16097at = new C6317m(getContext(), new C6226hn(this.f16105c, this.f16101ax, this.f16056E.cctEnabled), this.f16102ay, this.f16103az);
        if ((getImpressionType() == 1 || getImpressionType() == 2) && !"video".equals(this.f16126x)) {
            this.f16080ac = new C6012eb(f16050aB, this.f16056E.viewability, getImpressionType());
            this.f16081ad = new C6014ec(this.f16056E.viewability, this.f16080ac, this.f16075aA);
        }
        this.f16055D = sVar;
        this.f16084ag = z;
        this.f16054C = new WeakReference<>((ViewGroup) getParent());
        this.f16086ai = z2;
        if (getRenderingConfig() != null) {
            setBackgroundColor(getRenderingConfig().mo35328a());
        }
        if (getMraidConfig() != null) {
            C5964da daVar = new C5964da(getMraidConfig().url, getMraidConfig().maxRetries, getMraidConfig().retryInterval, getMraidConfig().expiry);
            if (daVar.f15156a != null) {
                daVar.f15157b = new C6206gx(ShareTarget.METHOD_GET, daVar.f15156a);
                daVar.f15157b.f15715o = false;
                daVar.f15157b.f15720t = false;
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
                daVar.f15157b.mo35385a((Map<String, String>) hashMap);
                new Thread(new Runnable() {
                    public final void run(
/*
Method generation error in method: com.inmobi.media.da.1.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.da.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }).start();
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            setImportantForAccessibility(2);
        }
        setScrollable(false);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setGeolocationEnabled(true);
        C6356r rVar = this.f16099av;
        if (this.f16107e == 0) {
            i = this.f16056E.rendering.bannerNetworkLoadsLimit;
        } else {
            i = this.f16056E.rendering.otherNetworkLoadsLimit;
        }
        rVar.f16154a = (short) i;
        setWebViewClient(this.f16099av);
        setWebChromeClient(this.f16077aD);
        addJavascriptInterface(new C5934cq(this, this.f16107e), "sdkController");
        this.f16108f = new C5962cz(this, this.f16079ab);
        this.f16109g = new C5973dc(this);
        this.f16110h = new C5966db(this);
        this.f16058G = new C5957cx();
        this.f16059H = new C5976de(C5976de.DEFAULT_POSITION, Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = false;
        if (view instanceof C6337q) {
            if (i == 0) {
                z = true;
            }
            m19050f(z);
            return;
        }
        m19050f(false);
    }

    /* access modifiers changed from: private */
    public Rect getAdFrameRect() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        int[] iArr2 = this.f16090am;
        int i2 = i + iArr2[0];
        int i3 = iArr[1] + iArr2[1];
        int[] iArr3 = this.f16090am;
        return new Rect(i2, i3, iArr3[2] + i2, iArr3[3] + i3);
    }

    public final void setScrollable(boolean z) {
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    /* renamed from: c */
    public final boolean mo35500c() {
        return this.f16119q.get();
    }

    /* renamed from: f */
    public final void mo35624f() {
        super.destroy();
    }

    public final void destroy() {
        if (!this.f16119q.get()) {
            if (!this.f16062K) {
                this.f16062K = true;
                return;
            }
            this.f16119q.set(true);
            this.f16120r = true;
            this.f16068Q = -1;
            removeJavascriptInterface("sdkController");
            WeakReference<Activity> weakReference = this.f16104b;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference<ViewGroup> weakReference2 = this.f16054C;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            C6004dw dwVar = this.f16083af;
            if (dwVar != null) {
                dwVar.mo35122d();
                this.f16083af.mo35123e();
            }
            this.f16100aw = null;
            this.f16055D = null;
            this.f16124v = null;
            this.f16073V = null;
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
                removeAllViews();
            }
            C6125fq.C6137h hVar = this.f16056E.viewability.omidConfig;
            if (!this.f16085ah || !hVar.omidEnabled || !C6042er.C6043a.f15376a.mo35170a()) {
                super.destroy();
                return;
            }
            C6120fm fmVar = new C6120fm(this, hVar.webViewRetainTime);
            new Handler().postDelayed(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.fp.1.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.fp.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, fmVar.f15574b);
        }
    }

    /* renamed from: a */
    public final void mo35498a(byte b, Map<String, String> map) {
        if (b == 2) {
            mo35620d("inmobi.recordEvent(120,null);");
        }
    }

    public final C6361w getEmbeddedBrowserJSCallbacks() {
        return this.f16100aw;
    }

    public final void setOrientationProperties(C5975dd ddVar) {
        this.f16098au = ddVar;
        m19061n();
    }

    public final C5975dd getOrientationProperties() {
        return this.f16098au;
    }

    public final void setReferenceContainer(C6286j jVar) {
        this.f16073V = jVar;
    }

    public final C6286j getReferenceContainer() {
        return this.f16073V;
    }

    public final C6125fq getAdConfig() {
        return this.f16056E;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.inmobi.media.ed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.inmobi.media.dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.inmobi.media.ed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.inmobi.media.ed} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.inmobi.media.C6004dw getViewableAd() {
        /*
            r8 = this;
            java.lang.String r0 = "deferred"
            com.inmobi.media.dw r1 = r8.f16083af
            if (r1 != 0) goto L_0x00a0
            com.inmobi.media.ec r1 = r8.f16081ad
            if (r1 == 0) goto L_0x0039
            com.inmobi.media.ed r1 = new com.inmobi.media.ed
            com.inmobi.media.ec r4 = r8.f16081ad
            com.inmobi.media.dx r5 = new com.inmobi.media.dx
            r5.<init>(r8)
            int r2 = r8.f16094aq
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L_0x0023
            com.inmobi.media.fq r2 = r8.getAdConfig()
            com.inmobi.media.fq$m r2 = r2.viewability
            com.inmobi.media.fq$n r2 = r2.web
            int r2 = r2.impressionMinPercentageViewed
        L_0x0023:
            r6 = r2
            int r2 = r8.f16093ap
            if (r2 != r3) goto L_0x0032
            com.inmobi.media.fq r2 = r8.getAdConfig()
            com.inmobi.media.fq$m r2 = r2.viewability
            com.inmobi.media.fq$n r2 = r2.web
            int r2 = r2.impressionMinTimeViewed
        L_0x0032:
            r7 = r2
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x003e
        L_0x0039:
            com.inmobi.media.dx r1 = new com.inmobi.media.dx
            r1.<init>(r8)
        L_0x003e:
            r8.f16083af = r1
            java.util.Set<com.inmobi.media.du> r1 = r8.f16082ae
            if (r1 == 0) goto L_0x00a0
            java.util.Iterator r1 = r1.iterator()
        L_0x0048:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r1.next()
            com.inmobi.media.du r2 = (com.inmobi.media.C6002du) r2
            byte r3 = r2.f15269a     // Catch:{ Exception -> 0x0048 }
            r4 = 3
            if (r3 == r4) goto L_0x005a
            goto L_0x0048
        L_0x005a:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f15270b     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = "omidAdSession"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0048 }
            com.inmobi.media.ek r3 = (com.inmobi.media.C6034ek) r3     // Catch:{ Exception -> 0x0048 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f15270b     // Catch:{ Exception -> 0x0048 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x007c
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f15270b     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0048 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f15270b     // Catch:{ Exception -> 0x0048 }
            java.lang.String r5 = "customReferenceData"
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r8.getContentUrl()     // Catch:{ Exception -> 0x0048 }
            com.iab.omid.library.inmobi.adsession.AdSessionContext r2 = com.inmobi.media.C6039eo.m18055a((com.inmobi.media.C6337q) r8, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x0048 }
            r3.mo35165a((com.iab.omid.library.inmobi.adsession.AdSessionContext) r2)     // Catch:{ Exception -> 0x0048 }
        L_0x0094:
            if (r3 == 0) goto L_0x0048
            com.inmobi.media.eo r2 = new com.inmobi.media.eo     // Catch:{ Exception -> 0x0048 }
            com.inmobi.media.dw r4 = r8.f16083af     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r8, r4, r3)     // Catch:{ Exception -> 0x0048 }
            r8.f16083af = r2     // Catch:{ Exception -> 0x0048 }
            goto L_0x0048
        L_0x00a0:
            com.inmobi.media.dw r0 = r8.f16083af
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6337q.getViewableAd():com.inmobi.media.dw");
    }

    public final String getMarkupType() {
        return this.f16079ab;
    }

    public final void setMarkupType(String str) {
        this.f16079ab = str;
    }

    /* renamed from: a */
    public final void mo35610a(String str) {
        this.f16120r = false;
        if (!this.f16119q.get()) {
            loadDataWithBaseURL("", str, "text/html", "UTF-8", (String) null);
        }
    }

    /* renamed from: b */
    public final void mo35613b(String str) {
        this.f16120r = false;
        if (!this.f16119q.get()) {
            loadUrl(str);
        }
    }

    public final void stopLoading() {
        if (!this.f16119q.get()) {
            super.stopLoading();
        }
    }

    /* renamed from: a */
    public final void mo35612a(boolean z) {
        mo35620d("window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");");
    }

    /* renamed from: g */
    public final void mo35625g() {
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f16072U);
        hashMap.put("impressionId", getImpressionId());
        m19041a("NetworkLoadLimitExceeded", (Map<String, Object>) hashMap);
    }

    /* renamed from: g */
    private void m19052g(boolean z) {
        mo35620d("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    /* renamed from: h */
    public final void mo35657h() {
        if (!"video".equals(this.f16126x)) {
            mo35620d("window.imraidview.impressionRendered();");
            getListener().mo34536i(this);
        }
    }

    /* renamed from: b */
    public final void mo35614b(String str, String str2, String str3) {
        if (str != null && str3 != null) {
            mo35611a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
        }
    }

    /* renamed from: a */
    public final void mo35611a(String str, String str2) {
        if (str != null) {
            mo35620d(str + "." + str2);
        }
    }

    /* renamed from: a */
    private void m19041a(String str, Map<String, Object> map) {
        getListener().mo34486a(str, map);
    }

    /* renamed from: d */
    public final void mo35620d(final String str) {
        new Handler(getContainerContext().getMainLooper()).postAtFrontOfQueue(new Runnable() {
            public final void run() {
                try {
                    if (!C6337q.this.f16119q.get()) {
                        String str = "javascript:try{" + str + "}catch(e){}";
                        String unused = C6337q.f16051z;
                        if (Build.VERSION.SDK_INT < 19) {
                            C6337q.this.loadUrl(str);
                        } else {
                            C6337q.this.evaluateJavascript(str, (ValueCallback) null);
                        }
                    }
                } catch (Exception unused2) {
                    String unused3 = C6337q.f16051z;
                }
            }
        });
    }

    public final void setUseCustomClose(boolean z) {
        this.f16114l = z;
    }

    public final void setCloseRegionDisabled(boolean z) {
        this.f16116n = z;
    }

    public final void setDisableBackButton(boolean z) {
        this.f16117o = z;
    }

    /* renamed from: b */
    public final void mo35615b(boolean z) {
        C5933cp cpVar;
        setCloseRegionDisabled(z);
        View rootView = getRootView();
        if (rootView != null && (cpVar = (C5933cp) rootView.findViewById(C6248i.f15816e)) != null) {
            cpVar.setVisibility(this.f16116n ? 8 : 0);
        }
    }

    /* renamed from: c */
    public final void mo35618c(boolean z) {
        C5933cp cpVar;
        setUseCustomClose(z);
        View rootView = getRootView();
        if (rootView != null && (cpVar = (C5933cp) rootView.findViewById(C6248i.f15815d)) != null) {
            cpVar.setVisibility(this.f16114l ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final void mo35499b() {
        View view;
        View view2;
        View view3;
        View view4;
        ViewGroup viewGroup;
        View rootView;
        C5966db dbVar = this.f16110h;
        ViewGroup viewGroup2 = null;
        if (dbVar.f15164b != null) {
            dbVar.f15164b.mo35044a();
            dbVar.f15164b = null;
        }
        if ("Expanded".equals(this.f16106d)) {
            if (!"Default".equals(this.f16106d)) {
                this.f16120r = true;
                C5962cz czVar = this.f16108f;
                if (!(czVar.f15150a.getOriginalRenderView() != null || czVar.f15152c == null || (rootView = czVar.f15152c.getRootView()) == null)) {
                    View findViewById = rootView.findViewById(C6248i.f15812a);
                    ((ViewGroup) czVar.f15150a.getParent()).removeView(czVar.f15150a);
                    if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
                        viewGroup2 = (ViewGroup) findViewById.getParent();
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(findViewById);
                    }
                    czVar.f15152c.addView(czVar.f15150a, czVar.f15153d, new RelativeLayout.LayoutParams(czVar.f15152c.getWidth(), czVar.f15152c.getHeight()));
                    czVar.f15150a.m19067t();
                }
                m19066s();
                this.f16120r = false;
            }
            this.f16062K = false;
        } else if ("Resized".equals(this.f16106d)) {
            if (!"Default".equals(this.f16106d)) {
                this.f16120r = true;
                C5973dc dcVar = this.f16109g;
                ViewGroup viewGroup3 = dcVar.f15179a.getParent() instanceof ViewGroup ? (ViewGroup) dcVar.f15179a.getParent() : null;
                if (viewGroup3 == null) {
                    view = null;
                } else {
                    view = viewGroup3.getRootView();
                }
                if (view == null) {
                    view2 = null;
                } else {
                    view2 = view.findViewById(C6248i.f15813b);
                }
                if (dcVar.f15180b == null) {
                    view3 = null;
                } else {
                    view3 = dcVar.f15180b.getRootView();
                }
                if (view3 == null) {
                    view4 = null;
                } else {
                    view4 = view3.findViewById(C6248i.f15812a);
                }
                if (view4 == null) {
                    viewGroup = null;
                } else {
                    viewGroup = (ViewGroup) view4.getParent();
                }
                if (view2 != null) {
                    viewGroup2 = (ViewGroup) view2.getParent();
                }
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view4);
                }
                if (viewGroup3 != null) {
                    viewGroup3.removeView(dcVar.f15179a);
                }
                if (dcVar.f15180b != null) {
                    dcVar.f15180b.addView(dcVar.f15179a, dcVar.f15181c, new RelativeLayout.LayoutParams(dcVar.f15180b.getWidth(), dcVar.f15180b.getHeight()));
                }
                dcVar.f15179a.m19067t();
                setAndUpdateViewState("Default");
                getListener().mo34616b_(this);
                this.f16120r = false;
            }
        } else if ("Default".equals(this.f16106d)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            if (1 == this.f16107e) {
                m19066s();
            } else if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        C6315k kVar = this.f16124v;
        if (kVar != null && this.f16115m) {
            kVar.mo34482a(this, (Context) this.f16104b.get());
        }
        this.f16099av.mo35720a();
    }

    /* renamed from: s */
    private void m19066s() {
        InMobiAdActivity.m23431a((Object) this);
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            C6315k kVar = this.f16124v;
            if (kVar == null || !kVar.mo34506b(this)) {
                ((InMobiAdActivity) fullScreenActivity).f19389b = true;
                fullScreenActivity.finish();
                int i = this.f16068Q;
                if (i != -1) {
                    fullScreenActivity.overridePendingTransition(0, i);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f16107e == 0) {
            setAndUpdateViewState("Default");
            C6337q qVar = this.f16053B;
            if (qVar != null) {
                qVar.setAndUpdateViewState("Default");
            }
        } else if ("Default".equals(this.f16106d)) {
            setAndUpdateViewState("Hidden");
        }
        getListener().mo34616b_(this);
    }

    public final void setExitAnimation(int i) {
        this.f16068Q = i;
    }

    public final void setRenderViewEventListener(C6357s sVar) {
        this.f16055D = sVar;
    }

    public final C6357s getListener() {
        C6357s sVar = this.f16055D;
        if (sVar != null) {
            return sVar;
        }
        C6357s sVar2 = f16049a;
        this.f16055D = sVar2;
        return sVar2;
    }

    public final String getViewState() {
        return this.f16106d;
    }

    public final C5966db getMediaProcessor() {
        return this.f16110h;
    }

    public final C5957cx getExpandProperties() {
        return this.f16058G;
    }

    public final C5976de getResizeProperties() {
        return this.f16059H;
    }

    public final void setResizeProperties(C5976de deVar) {
        this.f16059H = deVar;
    }

    public final void setAndUpdateViewState(String str) {
        this.f16106d = str;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        mo35620d("window.mraidview.broadcastEvent('stateChange','" + lowerCase + "');");
    }

    /* renamed from: t */
    private void m19067t() {
        setVisibility(0);
        requestLayout();
    }

    public final String getMraidJsString() {
        String b = new C6241hx(getContext(), "mraid_js_store").mo35453b("mraid_js_string");
        return b == null ? "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(f){imraidview.showAlert(\"executeNativesetExpandProperties: \"+f+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(c){imraidview.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(b){var c,f;try{c=parseInt(b.width);f=parseInt(b.height);if(isNaN(c)||isNaN(f)||1>c||1>f)throw\"Invalid\";b.width=c;b.height=f;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\n\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getResizeProperties: \"+b)}};a.open=function(b){\"undefined\"==typeof b&&(b=null);try{sdkController.open(\"window.mraidview\",b)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getScreenSize: \"+b)}};a.getMaxSize=\nfunction(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getMaxSize: \"+b)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getCurrentPosition: \"+b)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getDefaultPosition: \"+b)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(b){imraidview.showAlert(\"getState: \"+\nb)}};a.isViewable=function(){try{return sdkController.isViewable(\"window.mraidview\")}catch(b){imraidview.showAlert(\"isViewable: \"+b)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(b){imraidview.showAlert(\"close: \"+b)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(b){return 0==this.indexOf(b)});a.playVideo=function(b){var a=\"\";null!=b&&(a=b);try{sdkController.playVideo(\"window.mraidview\",\na)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===typeof JSON){var c=\"\",f;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(f=0;f<b.length;f++)0<f&&(c+=\",\"),c+=a.stringifyArg(b[f]);return c+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(b){var a,c,g;c=typeof b;a=\"\";if(\"number\"===c||\"boolean\"===c)a+=args;else if(b instanceof Array)a=a+\"[\"+b+\"]\";else if(b instanceof Object){c=!0;a+=\"{\";for(g in b)null!==b[g]&&(c||(a+=\",\"),a=a+'\"'+g+'\":',c=\ntypeof b[g],a=\"number\"===c||\"boolean\"===c?a+b[g]:\"function\"===typeof b[g]?a+'\"\"':b[g]instanceof Object?a+this.stringify(args[i][g]):a+'\"'+b[g]+'\"',c=!1);a+=\"}\"}else b=b.replace(/\\\\/g,\"\\\\\\\\\"),b=b.replace(/\"/g,'\\\\\"'),a=a+'\"'+b+'\"';imraidview.showAlert(\"json:\"+a);return a};getPID=function(b){var a=\"\";null!=b&&(\"undefined\"!=typeof b.id&&null!=b.id)&&(a=b.id);return a};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\n\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),\n!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(b,a){};a.fireMediaErrorEvent=function(b,a){};a.fireMediaTimeUpdateEvent=function(b,a,c){};a.fireMediaCloseEvent=function(b,a,c){};a.fireMediaVolumeChangeEvent=function(b,a,c){};a.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.firePopupBlockedBeacon=function(b){if(\"undefined\"!=typeof inmobi&&\ninmobi.recordEvent){var a={};a.trigger=b;inmobi.recordEvent(136,a)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);\nb.setExpandProperties(c)};a.getResizeProperties=b.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(b){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?\na.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=b.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(b){window.imraid.broadcastEvent(\"postStatus\",b)};a.fireMediaTrackingEvent=function(b,a){var e={};e.name=b;var d=\"inmobi_media_\"+b;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,e)};a.fireMediaErrorEvent=function(b,a){var e={name:\"error\"};e.code=a;var d=\"inmobi_media_\"+e.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\ne)};a.fireMediaTimeUpdateEvent=function(b,a,e){var d={name:\"timeupdate\",target:{}};d.target.currentTime=a;d.target.duration=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.saveContent=function(b,a,e){window.imraid.addEventListener(\"saveContent_\"+b,e);sdkController.saveContent(\"window.imraidview\",b,a)};a.cancelSaveContent=function(b){sdkController.cancelSaveContent(\"window.imraidview\",b)};a.disableCloseRegion=function(b){sdkController.disableCloseRegion(\"window.imraidview\",\nb)};a.fireGalleryImageSelectedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(b,a,e){var d={name:\"close\"};d.viaUserInteraction=a;d.target={};d.target.currentTime=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=\ntypeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireMediaVolumeChangeEvent=function(b,a,e){var d={name:\"volumechange\",target:{}};d.target.volume=a;d.target.muted=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",b)}catch(e){a.showAlert(\"openExternal: \"+e)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,e=\"\",d=0;d<c;d++)e+=b[d];return parseInt(e)};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,e,d){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(c){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=function(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+\nc+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,c,e){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,c,e)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,c){700<=getSdkVersionInt()&&sdkController.getBlob(a,c)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(c){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(c){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(c){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(c){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpand=function(b,c,e,d,f){try{void 0==e||\"number\"!=typeof e?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==d||\"boolean\"!=typeof d?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?\nconsole.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,e,d,f)}catch(g){a.showAlert(\"executeNativeCustomExpand: \"+g+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+e+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+d)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,c){window.imraid.broadcastEvent(\"onGestureDetected\",a,c)};a.onUserLandingCompleted=\nfunction(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,d){var f=arguments.length,g,h=null;if(3>f){if(\"function\"===typeof arguments[f-1])g=arguments[f-1];else return;h={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],h={reason:11,url:arguments[1]});\"function\"!==!g&&(h?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(h))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,d)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,e)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,e,d,f){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,e,d,f)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a,e,d,f,g,h,k,l){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a,e,d,f,g,h,k,l)};a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=\nfunction(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=\nb.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(f){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nl=0}imIsObjValid(f)?imIsObjValid(d)?(m=f.url,q=f.fallbackUrl,p=f.urlType,g=d.url,h=d.pingWV,k=d.fr):(m=f.url,p=f.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(g)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(f)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();\n" : b;
    }

    /* renamed from: a */
    public final void mo35497a() {
        this.f16065N = false;
        try {
            getClass().getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35623e(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1886160473: goto L_0x0035;
                case -1647691422: goto L_0x002b;
                case 1509574865: goto L_0x0021;
                case 1642189884: goto L_0x0017;
                case 1772979069: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "redirectFraudDetection"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r4
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "saveContent"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r3
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "html5video"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r1
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "inlineVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "playVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r5
            goto L_0x0040
        L_0x003f:
            r7 = -1
        L_0x0040:
            if (r7 == r5) goto L_0x0053
            if (r7 == r3) goto L_0x0053
            if (r7 == r2) goto L_0x0049
            if (r7 == r1) goto L_0x0049
            return r4
        L_0x0049:
            boolean r7 = r6.f16057F
            if (r7 == 0) goto L_0x0052
            boolean r7 = r6.f16065N
            if (r7 == 0) goto L_0x0052
            return r5
        L_0x0052:
            return r4
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6337q.mo35623e(java.lang.String):boolean");
    }

    /* renamed from: i */
    public final boolean mo35658i() {
        C6125fq.C6138i renderingConfig = getRenderingConfig();
        if (renderingConfig == null) {
            return false;
        }
        boolean z = this.f16078aa != -1 && SystemClock.elapsedRealtime() - this.f16078aa < renderingConfig.userTouchResetTime * 1000;
        if (!renderingConfig.autoRedirectionEnforcement || this.f16074W || z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo35543a(String str, String str2, String str3) {
        mo35611a(str, str2 + "(" + str3 + ");");
    }

    public final void setCloseEndCardTracker(String str) {
        C6102fk fkVar;
        C5923cg cgVar;
        C6286j referenceContainer = getReferenceContainer();
        if ((referenceContainer instanceof C6332o) && (fkVar = (C6102fk) ((C6332o) referenceContainer).getVideoContainerView()) != null && (cgVar = (C5923cg) fkVar.getVideoView().getTag()) != null && cgVar.mo34920b() != null && cgVar.mo34920b().mo35112f() != null) {
            cgVar.mo34920b().mo35112f().mo35094a(new C5922cf(str, 0, "closeEndCard", (Map<String, String>) null));
        }
    }

    /* renamed from: j */
    public final void mo35528j() {
        if (!this.f16119q.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6337q.this.getListener().mo34526f();
                }
            });
        }
    }

    /* renamed from: k */
    public final void mo35529k() {
        if (!this.f16119q.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6337q.this.getListener().mo34530g();
                }
            });
        }
    }

    public final int getCurrentRenderingPodAdIndex() {
        C6315k kVar = this.f16124v;
        if (kVar != null) {
            return kVar.mo34462a(this);
        }
        return 0;
    }

    public final JSONArray getRenderableAdIndexes() {
        C6315k kVar = this.f16124v;
        if (kVar != null) {
            return kVar.mo34508c();
        }
        return new JSONArray();
    }

    public final long getShowTimeStamp() {
        C6315k kVar = this.f16124v;
        if (kVar != null) {
            return kVar.mo34516d();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo35621d(boolean z) {
        getCurrentRenderingPodAdIndex();
        mo35620d("window.imraidview.broadcastEvent('adShowSuccess'," + z + ");");
    }

    public final String getLandingScheme() {
        return this.f16101ax;
    }

    public final C6317m getLandingPageHandler() {
        return this.f16097at;
    }

    /* renamed from: c */
    public final void mo35617c(String str, String str2, String str3) {
        mo35620d("window.imraid.broadcastEvent('onUserLandingCompleted');");
        if (str2 != null) {
            mo35611a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
        }
    }

    /* renamed from: c */
    public final void mo35616c(String str) {
        mo35620d("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
        String str2 = this.f16071T != null ? AdFormat.BANNER : "int";
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f16072U);
        hashMap.put("trigger", str);
        hashMap.put("impressionId", getImpressionId());
        hashMap.put(C11286Ad.AD_TYPE, str2);
        m19041a("BlockAutoRedirection", (Map<String, Object>) hashMap);
    }

    public final void setExpandProperties(C5957cx cxVar) {
        if (cxVar.f15131b) {
            setUseCustomClose(cxVar.f15130a);
        }
        this.f16058G = cxVar;
    }

    /* renamed from: l */
    public final void mo35659l() {
        mo35620d("window.mraidview.onUserInteraction();");
        getListener().mo34534h(this);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m19042a(C6337q qVar, JsResult jsResult) {
        C6125fq.C6138i renderingConfig = qVar.getRenderingConfig();
        if (renderingConfig != null && renderingConfig.shouldRenderPopup) {
            return true;
        }
        jsResult.cancel();
        qVar.mo35620d("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }
}
