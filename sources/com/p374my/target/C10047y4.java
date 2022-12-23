package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.p374my.target.C10047y4;
import com.p374my.target.C10070z4;
import com.p374my.target.C9644c6;
import com.p374my.target.C9814l1;
import com.p374my.target.C9949s5;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.my.target.y4 */
public class C10047y4 implements C10070z4, C9949s5.C9950a {

    /* renamed from: a */
    public final C9814l1 f24972a;

    /* renamed from: b */
    public final C9661d6 f24973b;

    /* renamed from: c */
    public final Context f24974c;

    /* renamed from: d */
    public final WeakReference<Activity> f24975d;

    /* renamed from: e */
    public final C9878o1 f24976e;

    /* renamed from: f */
    public final C10049b f24977f;

    /* renamed from: g */
    public final C9814l1.C9816b f24978g;

    /* renamed from: h */
    public final C9644c6.C9645a f24979h;

    /* renamed from: i */
    public String f24980i;

    /* renamed from: j */
    public C9814l1 f24981j;

    /* renamed from: k */
    public C9755i6 f24982k;

    /* renamed from: l */
    public C9755i6 f24983l;

    /* renamed from: m */
    public C10070z4.C10071a f24984m;

    /* renamed from: n */
    public C10051d f24985n;

    /* renamed from: o */
    public C9821l2 f24986o;

    /* renamed from: p */
    public boolean f24987p;

    /* renamed from: q */
    public Uri f24988q;

    /* renamed from: r */
    public C9644c6 f24989r;

    /* renamed from: s */
    public C9949s5 f24990s;

    /* renamed from: t */
    public ViewGroup f24991t;

    /* renamed from: u */
    public C10053f f24992u;

    /* renamed from: v */
    public C10054g f24993v;

    /* renamed from: com.my.target.y4$b */
    public class C10049b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final C9814l1 f24994a;

        public C10049b(C9814l1 l1Var) {
            this.f24994a = l1Var;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C10047y4 y4Var = C10047y4.this;
            y4Var.f24993v = null;
            y4Var.mo65751d();
            this.f24994a.mo64633a(C10047y4.this.f24976e);
        }
    }

    /* renamed from: com.my.target.y4$c */
    public class C10050c implements C9644c6.C9645a {
        public C10050c() {
        }

        /* renamed from: d */
        public void mo63312d() {
            C9949s5 s5Var = C10047y4.this.f24990s;
            if (s5Var != null) {
                s5Var.dismiss();
            }
        }
    }

    /* renamed from: com.my.target.y4$d */
    public interface C10051d {
        /* renamed from: a */
        void mo64461a();

        /* renamed from: a */
        void mo64462a(float f, float f2, C9821l2 l2Var, Context context);

        /* renamed from: a */
        void mo64463a(String str, C9821l2 l2Var, Context context);

        /* renamed from: b */
        void mo64464b();

        void onLoad();

        void onNoAd(String str);
    }

    /* renamed from: com.my.target.y4$e */
    public static class C10052e implements Runnable {

        /* renamed from: a */
        public C9821l2 f24997a;

        /* renamed from: b */
        public Context f24998b;

        /* renamed from: c */
        public C9949s5 f24999c;

        /* renamed from: d */
        public Uri f25000d;

        /* renamed from: e */
        public C9814l1 f25001e;

        public C10052e(C9821l2 l2Var, C9949s5 s5Var, Uri uri, C9814l1 l1Var, Context context) {
            this.f24997a = l2Var;
            this.f24998b = context.getApplicationContext();
            this.f24999c = s5Var;
            this.f25000d = uri;
            this.f25001e = l1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m29790a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f25001e.mo64646f(str);
                return;
            }
            this.f25001e.mo64635a(MraidJsMethods.EXPAND, "Failed to handling mraid");
            this.f24999c.dismiss();
        }

        public void run() {
            C9676e3 d = C9676e3.m27900d();
            d.mo64164b(this.f25000d.toString(), (String) null, this.f24998b);
            C9693f0.m27983c(new Runnable(C9946s3.m29203a(this.f24997a.getMraidJs(), (String) d.mo64163b())) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C10047y4.C10052e.this.m29790a(this.f$1);
                }
            });
        }
    }

    /* renamed from: com.my.target.y4$f */
    public class C10053f implements C9814l1.C9816b {

        /* renamed from: a */
        public final C9814l1 f25002a;

        /* renamed from: b */
        public final String f25003b;

        public C10053f(C9814l1 l1Var, String str) {
            this.f25002a = l1Var;
            this.f25003b = str;
        }

        /* renamed from: a */
        public void mo65754a() {
            C10047y4 y4Var = C10047y4.this;
            C9644c6 c6Var = y4Var.f24989r;
            if (c6Var != null && y4Var.f24982k != null) {
                if (c6Var.getParent() != null) {
                    ((ViewGroup) C10047y4.this.f24989r.getParent()).removeView(C10047y4.this.f24989r);
                    C10047y4.this.f24989r.removeAllViews();
                    C10047y4 y4Var2 = C10047y4.this;
                    y4Var2.mo65744a(y4Var2.f24982k);
                    C10047y4.this.mo65749b("default");
                    C10047y4.this.f24989r.setOnCloseListener((C9644c6.C9645a) null);
                    C10047y4.this.f24989r = null;
                }
                C10051d dVar = C10047y4.this.f24985n;
                if (dVar != null) {
                    dVar.mo64461a();
                }
            }
        }

        /* renamed from: a */
        public void mo64647a(C9814l1 l1Var, WebView webView) {
            String str;
            C10047y4 y4Var;
            StringBuilder sb = new StringBuilder();
            sb.append("onPageLoaded callback from ");
            sb.append(l1Var == C10047y4.this.f24981j ? " second " : " primary ");
            sb.append("webview");
            C9672e0.m27882a(sb.toString());
            ArrayList arrayList = new ArrayList();
            if (C10047y4.this.mo65750c()) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            l1Var.mo64636a((ArrayList<String>) arrayList);
            l1Var.mo64644d(this.f25003b);
            l1Var.mo64637a(l1Var.mo64642c());
            C9949s5 s5Var = C10047y4.this.f24990s;
            if (s5Var == null || !s5Var.isShowing()) {
                y4Var = C10047y4.this;
                str = "default";
            } else {
                y4Var = C10047y4.this;
                str = "expanded";
            }
            y4Var.mo65749b(str);
            l1Var.mo64643d();
            C10047y4 y4Var2 = C10047y4.this;
            if (l1Var != y4Var2.f24981j) {
                C10051d dVar = y4Var2.f24985n;
                if (dVar != null) {
                    dVar.onLoad();
                }
                C10070z4.C10071a aVar = C10047y4.this.f24984m;
                if (aVar != null) {
                    aVar.mo64458a(webView);
                }
            }
        }

        /* renamed from: a */
        public void mo64648a(boolean z) {
            if (!z || C10047y4.this.f24990s == null) {
                this.f25002a.mo64637a(z);
            }
        }

        /* renamed from: a */
        public boolean mo64649a(float f, float f2) {
            C10051d dVar;
            C9821l2 l2Var;
            C10047y4 y4Var = C10047y4.this;
            if (!y4Var.f24987p) {
                this.f25002a.mo64635a("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            } else if (f < 0.0f || f2 < 0.0f || (dVar = y4Var.f24985n) == null || (l2Var = y4Var.f24986o) == null) {
                return true;
            } else {
                dVar.mo64462a(f, f2, l2Var, y4Var.f24974c);
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo64650a(int i, int i2, int i3, int i4, boolean z, int i5) {
            C9814l1 l1Var;
            String str;
            int i6 = i;
            int i7 = i2;
            boolean z2 = z;
            C10047y4.this.f24993v = new C10054g();
            C10047y4 y4Var = C10047y4.this;
            if (y4Var.f24991t == null) {
                C9672e0.m27882a("Unable to set resize properties: container view for resize is not defined");
                l1Var = this.f25002a;
                str = "container view for resize is not defined";
            } else if (i6 < 50 || i7 < 50) {
                C9672e0.m27882a("Unable to set resize properties: properties cannot be less than closeable container");
                l1Var = this.f25002a;
                str = "properties cannot be less than closeable container";
            } else {
                C10059y8 c = C10059y8.m29843c(y4Var.f24974c);
                C10047y4.this.f24993v.mo65758a(z2);
                C10047y4.this.f24993v.mo65756a(c.mo65778b(i6), c.mo65778b(i7), c.mo65778b(i3), c.mo65778b(i4), i5);
                if (z2) {
                    return true;
                }
                Rect rect = new Rect();
                C10047y4.this.f24991t.getGlobalVisibleRect(rect);
                if (C10047y4.this.f24993v.mo65759a(rect)) {
                    return true;
                }
                C9672e0.m27882a("Unable to set resize properties: allowOffscreen is false, maxSize is (" + rect.width() + "," + rect.height() + ") resize properties: (" + C10047y4.this.f24993v.mo65761b() + "," + C10047y4.this.f24993v.mo65755a() + ")");
                l1Var = this.f25002a;
                str = "resize properties with allowOffscreen false out of viewport";
            }
            l1Var.mo64635a("setResizeProperties", str);
            C10047y4.this.f24993v = null;
            return false;
        }

        /* renamed from: a */
        public boolean mo64651a(Uri uri) {
            return C10047y4.this.mo65748a(uri);
        }

        /* renamed from: a */
        public boolean mo64652a(ConsoleMessage consoleMessage, C9814l1 l1Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Console message: from ");
            sb.append(l1Var == C10047y4.this.f24981j ? " second " : " primary ");
            sb.append("webview: ");
            sb.append(consoleMessage.message());
            C9672e0.m27882a(sb.toString());
            return true;
        }

        /* renamed from: a */
        public boolean mo64653a(String str) {
            C9821l2 l2Var;
            C10047y4 y4Var = C10047y4.this;
            if (!y4Var.f24987p) {
                this.f25002a.mo64635a("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            C10051d dVar = y4Var.f24985n;
            if (dVar == null || (l2Var = y4Var.f24986o) == null) {
                return true;
            }
            dVar.mo64463a(str, l2Var, y4Var.f24974c);
            return true;
        }

        /* renamed from: a */
        public boolean mo64654a(String str, JsResult jsResult) {
            C9672e0.m27882a("JS Alert: " + str);
            jsResult.confirm();
            return true;
        }

        /* renamed from: a */
        public boolean mo64655a(boolean z, C9857n1 n1Var) {
            C9672e0.m27882a("Orientation properties isn't supported in standard banners");
            return false;
        }

        /* renamed from: b */
        public void mo64656b(Uri uri) {
            C9821l2 l2Var;
            C10047y4 y4Var = C10047y4.this;
            C10070z4.C10071a aVar = y4Var.f24984m;
            if (aVar != null && (l2Var = y4Var.f24986o) != null) {
                aVar.mo64460a(l2Var, uri.toString());
            }
        }

        /* renamed from: c */
        public void mo64657c() {
        }

        /* renamed from: d */
        public void mo64658d() {
            C9949s5 s5Var = C10047y4.this.f24990s;
            if (s5Var != null) {
                s5Var.dismiss();
            }
        }

        /* renamed from: f */
        public boolean mo64659f() {
            C9755i6 i6Var;
            if (!C10047y4.this.f24980i.equals("default")) {
                C9672e0.m27882a("Unable to resize: wrong state for resize: " + C10047y4.this.f24980i);
                C9814l1 l1Var = this.f25002a;
                l1Var.mo64635a(MraidJsMethods.RESIZE, "wrong state for resize " + C10047y4.this.f24980i);
                return false;
            }
            C10047y4 y4Var = C10047y4.this;
            C10054g gVar = y4Var.f24993v;
            if (gVar == null) {
                C9672e0.m27882a("Unable to resize: resize properties not set");
                this.f25002a.mo64635a(MraidJsMethods.RESIZE, "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = y4Var.f24991t;
            if (viewGroup == null || (i6Var = y4Var.f24982k) == null) {
                C9672e0.m27882a("Unable to resize: views not initialized");
                this.f25002a.mo64635a(MraidJsMethods.RESIZE, "views not initialized");
                return false;
            } else if (!gVar.mo65760a(viewGroup, i6Var)) {
                C9672e0.m27882a("Unable to resize: views not visible");
                this.f25002a.mo64635a(MraidJsMethods.RESIZE, "views not visible");
                return false;
            } else {
                C10047y4.this.f24989r = new C9644c6(C10047y4.this.f24974c);
                C10047y4 y4Var2 = C10047y4.this;
                y4Var2.f24993v.mo65757a(y4Var2.f24989r);
                C10047y4 y4Var3 = C10047y4.this;
                if (!y4Var3.f24993v.mo65762b(y4Var3.f24989r)) {
                    C9672e0.m27882a("Unable to resize: close button is out of visible range");
                    this.f25002a.mo64635a(MraidJsMethods.RESIZE, "close button is out of visible range");
                    C10047y4.this.f24989r = null;
                    return false;
                }
                ViewGroup viewGroup2 = (ViewGroup) C10047y4.this.f24982k.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(C10047y4.this.f24982k);
                }
                C10047y4 y4Var4 = C10047y4.this;
                y4Var4.f24989r.addView(y4Var4.f24982k, new FrameLayout.LayoutParams(-1, -1));
                C10047y4.this.f24989r.setOnCloseListener(new C9644c6.C9645a() {
                    /* renamed from: d */
                    public final void mo63312d() {
                        C10047y4.C10053f.this.mo65754a();
                    }
                });
                C10047y4 y4Var5 = C10047y4.this;
                y4Var5.f24991t.addView(y4Var5.f24989r);
                C10047y4.this.mo65749b("resized");
                C10051d dVar = C10047y4.this.f24985n;
                if (dVar == null) {
                    return true;
                }
                dVar.mo64464b();
                return true;
            }
        }

        /* renamed from: g */
        public void mo64660g() {
            C10047y4.this.f24987p = true;
        }
    }

    /* renamed from: com.my.target.y4$g */
    public static class C10054g {

        /* renamed from: a */
        public boolean f25005a = true;

        /* renamed from: b */
        public int f25006b;

        /* renamed from: c */
        public int f25007c;

        /* renamed from: d */
        public int f25008d;

        /* renamed from: e */
        public int f25009e;

        /* renamed from: f */
        public int f25010f;

        /* renamed from: g */
        public Rect f25011g;

        /* renamed from: h */
        public Rect f25012h;

        /* renamed from: i */
        public int f25013i;

        /* renamed from: j */
        public int f25014j;

        /* renamed from: a */
        public int mo65755a() {
            return this.f25009e;
        }

        /* renamed from: a */
        public void mo65756a(int i, int i2, int i3, int i4, int i5) {
            this.f25008d = i;
            this.f25009e = i2;
            this.f25006b = i3;
            this.f25007c = i4;
            this.f25010f = i5;
        }

        /* renamed from: a */
        public void mo65757a(C9644c6 c6Var) {
            Rect rect;
            Rect rect2 = this.f25012h;
            if (rect2 == null || (rect = this.f25011g) == null) {
                C9672e0.m27882a("Setup views before resizing");
                return;
            }
            int i = (rect2.top - rect.top) + this.f25007c;
            this.f25013i = i;
            this.f25014j = (rect2.left - rect.left) + this.f25006b;
            if (!this.f25005a) {
                if (i + this.f25009e > rect.height()) {
                    C9672e0.m27882a("Try to reposition creative vertically because of resize allowOffscreen:false and out of max size properties");
                    this.f25013i = this.f25011g.height() - this.f25009e;
                }
                if (this.f25014j + this.f25008d > this.f25011g.width()) {
                    C9672e0.m27882a("Try to reposition creative horizontally because of resize allowOffscreen:false and out of max size properties");
                    this.f25014j = this.f25011g.width() - this.f25008d;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f25008d, this.f25009e);
            layoutParams.topMargin = this.f25013i;
            layoutParams.leftMargin = this.f25014j;
            c6Var.setLayoutParams(layoutParams);
            c6Var.setCloseGravity(this.f25010f);
        }

        /* renamed from: a */
        public void mo65758a(boolean z) {
            this.f25005a = z;
        }

        /* renamed from: a */
        public boolean mo65759a(Rect rect) {
            return this.f25008d <= rect.width() && this.f25009e <= rect.height();
        }

        /* renamed from: a */
        public boolean mo65760a(ViewGroup viewGroup, C9755i6 i6Var) {
            this.f25011g = new Rect();
            this.f25012h = new Rect();
            return viewGroup.getGlobalVisibleRect(this.f25011g) && i6Var.getGlobalVisibleRect(this.f25012h);
        }

        /* renamed from: b */
        public int mo65761b() {
            return this.f25008d;
        }

        /* renamed from: b */
        public boolean mo65762b(C9644c6 c6Var) {
            if (this.f25011g == null) {
                return false;
            }
            int i = this.f25014j;
            int i2 = this.f25013i;
            Rect rect = this.f25011g;
            Rect rect2 = new Rect(i, i2, rect.right, rect.bottom);
            int i3 = this.f25014j;
            int i4 = this.f25013i;
            Rect rect3 = new Rect(i3, i4, this.f25008d + i3, this.f25009e + i4);
            Rect rect4 = new Rect();
            c6Var.mo63691b(this.f25010f, rect3, rect4);
            return rect2.contains(rect4);
        }
    }

    public C10047y4(ViewGroup viewGroup) {
        this(C9814l1.m28543b(TJAdUnitConstants.String.INLINE), new C9755i6(viewGroup.getContext()), new C9661d6(viewGroup.getContext()), viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r7 == null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10047y4(com.p374my.target.C9814l1 r4, com.p374my.target.C9755i6 r5, com.p374my.target.C9661d6 r6, android.view.ViewGroup r7) {
        /*
            r3 = this;
            r3.<init>()
            com.my.target.y4$c r0 = new com.my.target.y4$c
            r1 = 0
            r0.<init>()
            r3.f24979h = r0
            r3.f24972a = r4
            r3.f24982k = r5
            r3.f24973b = r6
            android.content.Context r6 = r7.getContext()
            r3.f24974c = r6
            boolean r0 = r6 instanceof android.app.Activity
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r0 == 0) goto L_0x0038
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.app.Activity r6 = (android.app.Activity) r6
            r7.<init>(r6)
            r3.f24975d = r7
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            android.view.View r6 = r6.findViewById(r2)
        L_0x0033:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r3.f24991t = r6
            goto L_0x0050
        L_0x0038:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r1)
            r3.f24975d = r6
            android.view.View r6 = r7.getRootView()
            if (r6 == 0) goto L_0x0050
            android.view.View r7 = r6.findViewById(r2)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r3.f24991t = r7
            if (r7 != 0) goto L_0x0050
            goto L_0x0033
        L_0x0050:
            java.lang.String r6 = "loading"
            r3.f24980i = r6
            com.my.target.o1 r6 = com.p374my.target.C9878o1.m28881e()
            r3.f24976e = r6
            r3.mo65744a((com.p374my.target.C9755i6) r5)
            com.my.target.y4$f r6 = new com.my.target.y4$f
            java.lang.String r7 = "inline"
            r6.<init>(r4, r7)
            r3.f24978g = r6
            r4.mo64632a((com.p374my.target.C9814l1.C9816b) r6)
            com.my.target.y4$b r6 = new com.my.target.y4$b
            r6.<init>(r4)
            r3.f24977f = r6
            r5.addOnLayoutChangeListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C10047y4.<init>(com.my.target.l1, com.my.target.i6, com.my.target.d6, android.view.ViewGroup):void");
    }

    /* renamed from: a */
    public static C10047y4 m29765a(ViewGroup viewGroup) {
        return new C10047y4(viewGroup);
    }

    /* renamed from: a */
    public void mo63607a() {
        C9755i6 i6Var;
        if ((this.f24990s == null || this.f24981j != null) && (i6Var = this.f24982k) != null) {
            i6Var.mo63465e();
        }
    }

    /* renamed from: a */
    public void mo63608a(int i) {
        mo65749b("hidden");
        mo65746a((C10051d) null);
        mo63611a((C10070z4.C10071a) null);
        this.f24972a.mo64629a();
        C9644c6 c6Var = this.f24989r;
        if (c6Var != null) {
            c6Var.removeAllViews();
            this.f24989r.setOnCloseListener((C9644c6.C9645a) null);
            ViewParent parent = this.f24989r.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f24989r);
            }
            this.f24989r = null;
        }
        C9755i6 i6Var = this.f24982k;
        if (i6Var != null) {
            if (i <= 0) {
                i6Var.mo64279a(true);
            }
            if (this.f24982k.getParent() != null) {
                ((ViewGroup) this.f24982k.getParent()).removeView(this.f24982k);
            }
            this.f24982k.mo63459a(i);
            this.f24982k = null;
        }
        C9814l1 l1Var = this.f24981j;
        if (l1Var != null) {
            l1Var.mo64629a();
            this.f24981j = null;
        }
        C9755i6 i6Var2 = this.f24983l;
        if (i6Var2 != null) {
            i6Var2.mo64279a(true);
            if (this.f24983l.getParent() != null) {
                ((ViewGroup) this.f24983l.getParent()).removeView(this.f24983l);
            }
            this.f24983l.mo63459a(0);
            this.f24983l = null;
        }
    }

    /* renamed from: a */
    public void mo65743a(C9644c6 c6Var, FrameLayout frameLayout) {
        this.f24973b.setVisibility(8);
        frameLayout.addView(c6Var, new ViewGroup.LayoutParams(-1, -1));
        if (this.f24988q != null) {
            this.f24981j = C9814l1.m28543b(TJAdUnitConstants.String.INLINE);
            C9755i6 i6Var = new C9755i6(this.f24974c);
            this.f24983l = i6Var;
            mo65745a(this.f24981j, i6Var, c6Var);
        } else {
            C9755i6 i6Var2 = this.f24982k;
            if (!(i6Var2 == null || i6Var2.getParent() == null)) {
                ((ViewGroup) this.f24982k.getParent()).removeView(this.f24982k);
                c6Var.addView(this.f24982k, new ViewGroup.LayoutParams(-1, -1));
                mo65749b("expanded");
            }
        }
        c6Var.setCloseVisible(true);
        c6Var.setOnCloseListener(this.f24979h);
        C10051d dVar = this.f24985n;
        if (dVar != null && this.f24988q == null) {
            dVar.mo64464b();
        }
        C9672e0.m27882a("MRAID dialog create");
    }

    /* renamed from: a */
    public void mo65744a(C9755i6 i6Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.f24973b.addView(i6Var, 0);
        i6Var.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo65745a(C9814l1 l1Var, C9755i6 i6Var, C9644c6 c6Var) {
        Uri uri;
        C10053f fVar = new C10053f(l1Var, TJAdUnitConstants.String.INLINE);
        this.f24992u = fVar;
        l1Var.mo64632a((C9814l1.C9816b) fVar);
        c6Var.addView(i6Var, new ViewGroup.LayoutParams(-1, -1));
        l1Var.mo64631a(i6Var);
        C9949s5 s5Var = this.f24990s;
        if (s5Var != null) {
            C9821l2 l2Var = this.f24986o;
            if (l2Var == null || (uri = this.f24988q) == null) {
                s5Var.dismiss();
                return;
            }
            C9693f0.m27979a(new C10052e(l2Var, s5Var, uri, l1Var, this.f24974c));
        }
    }

    /* renamed from: a */
    public void mo63610a(C9821l2 l2Var) {
        C9755i6 i6Var;
        this.f24986o = l2Var;
        String source = l2Var.getSource();
        if (source == null || (i6Var = this.f24982k) == null) {
            mo65747a("failed to load, failed MRAID initialization");
            return;
        }
        this.f24972a.mo64631a(i6Var);
        this.f24972a.mo64646f(source);
    }

    /* renamed from: a */
    public void mo64139a(C9949s5 s5Var, FrameLayout frameLayout) {
        this.f24990s = s5Var;
        C9644c6 c6Var = this.f24989r;
        if (!(c6Var == null || c6Var.getParent() == null)) {
            ((ViewGroup) this.f24989r.getParent()).removeView(this.f24989r);
        }
        C9644c6 c6Var2 = new C9644c6(this.f24974c);
        this.f24989r = c6Var2;
        mo65743a(c6Var2, frameLayout);
    }

    /* renamed from: a */
    public void mo65746a(C10051d dVar) {
        this.f24985n = dVar;
    }

    /* renamed from: a */
    public void mo63611a(C10070z4.C10071a aVar) {
        this.f24984m = aVar;
    }

    /* renamed from: a */
    public final void mo65747a(String str) {
        C10051d dVar = this.f24985n;
        if (dVar != null) {
            dVar.onNoAd(str);
        }
    }

    /* renamed from: a */
    public void mo63613a(boolean z) {
        C9755i6 i6Var;
        if ((this.f24990s == null || this.f24981j != null) && (i6Var = this.f24982k) != null) {
            i6Var.mo64279a(z);
        }
    }

    /* renamed from: a */
    public boolean mo65748a(Uri uri) {
        if (this.f24982k == null) {
            C9672e0.m27882a("Cannot expand: webview destroyed");
            return false;
        } else if (!this.f24980i.equals("default") && !this.f24980i.equals("resized")) {
            return false;
        } else {
            this.f24988q = uri;
            C9949s5.m29241a(this, this.f24974c).show();
            return true;
        }
    }

    /* renamed from: b */
    public void mo63614b() {
        C9755i6 i6Var;
        if ((this.f24990s == null || this.f24981j != null) && (i6Var = this.f24982k) != null) {
            i6Var.mo64279a(false);
        }
    }

    /* renamed from: b */
    public void mo65749b(String str) {
        C9672e0.m27882a("MRAID state set to " + str);
        this.f24980i = str;
        this.f24972a.mo64645e(str);
        C9814l1 l1Var = this.f24981j;
        if (l1Var != null) {
            l1Var.mo64645e(str);
        }
        if ("hidden".equals(str)) {
            C9672e0.m27882a("MraidPresenter: Mraid on close");
        }
    }

    /* renamed from: b */
    public void mo64141b(boolean z) {
        C9814l1 l1Var = this.f24981j;
        if (l1Var == null) {
            l1Var = this.f24972a;
        }
        l1Var.mo64637a(z);
        C9755i6 i6Var = this.f24983l;
        if (i6Var == null) {
            return;
        }
        if (z) {
            i6Var.mo63465e();
        } else {
            i6Var.mo64279a(false);
        }
    }

    /* renamed from: c */
    public boolean mo65750c() {
        C9755i6 i6Var;
        Activity activity = (Activity) this.f24975d.get();
        if (activity == null || (i6Var = this.f24982k) == null) {
            return false;
        }
        return C10059y8.m29834a(activity, (View) i6Var);
    }

    /* renamed from: d */
    public void mo65751d() {
        C9878o1 o1Var;
        int i;
        int i2;
        int measuredWidth;
        int i3;
        C9755i6 i6Var;
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.f24974c.getResources().getDisplayMetrics();
        this.f24976e.mo65148a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroup = this.f24991t;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            this.f24976e.mo65153c(iArr[0], iArr[1], iArr[0] + this.f24991t.getMeasuredWidth(), iArr[1] + this.f24991t.getMeasuredHeight());
        }
        if (!this.f24980i.equals("expanded") && !this.f24980i.equals("resized")) {
            this.f24973b.getLocationOnScreen(iArr);
            this.f24976e.mo65151b(iArr[0], iArr[1], iArr[0] + this.f24973b.getMeasuredWidth(), iArr[1] + this.f24973b.getMeasuredHeight());
        }
        C9755i6 i6Var2 = this.f24983l;
        if (i6Var2 != null) {
            i6Var2.getLocationOnScreen(iArr);
            o1Var = this.f24976e;
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = iArr[0] + this.f24983l.getMeasuredWidth();
            i3 = iArr[1];
            i6Var = this.f24983l;
        } else {
            C9755i6 i6Var3 = this.f24982k;
            if (i6Var3 != null) {
                i6Var3.getLocationOnScreen(iArr);
                o1Var = this.f24976e;
                i = iArr[0];
                i2 = iArr[1];
                measuredWidth = iArr[0] + this.f24982k.getMeasuredWidth();
                i3 = iArr[1];
                i6Var = this.f24982k;
            } else {
                return;
            }
        }
        o1Var.mo65149a(i, i2, measuredWidth, i3 + i6Var.getMeasuredHeight());
    }

    /* renamed from: f */
    public void mo63618f() {
        C9821l2 l2Var;
        C10070z4.C10071a aVar = this.f24984m;
        if (aVar != null && (l2Var = this.f24986o) != null) {
            aVar.mo64459a((C10066z1) l2Var);
        }
    }

    public C9661d6 getView() {
        return this.f24973b;
    }

    /* renamed from: q */
    public void mo64143q() {
        this.f24973b.setVisibility(0);
        if (this.f24988q != null) {
            this.f24988q = null;
            C9814l1 l1Var = this.f24981j;
            if (l1Var != null) {
                l1Var.mo64637a(false);
                this.f24981j.mo64645e("hidden");
                this.f24981j.mo64629a();
                this.f24981j = null;
                this.f24972a.mo64637a(true);
            }
            C9755i6 i6Var = this.f24983l;
            if (i6Var != null) {
                i6Var.mo64279a(true);
                if (this.f24983l.getParent() != null) {
                    ((ViewGroup) this.f24983l.getParent()).removeView(this.f24983l);
                }
                this.f24983l.mo63459a(0);
                this.f24983l = null;
            }
        } else {
            C9755i6 i6Var2 = this.f24982k;
            if (i6Var2 != null) {
                if (i6Var2.getParent() != null) {
                    ((ViewGroup) this.f24982k.getParent()).removeView(this.f24982k);
                }
                mo65744a(this.f24982k);
            }
        }
        C9644c6 c6Var = this.f24989r;
        if (!(c6Var == null || c6Var.getParent() == null)) {
            ((ViewGroup) this.f24989r.getParent()).removeView(this.f24989r);
        }
        this.f24989r = null;
        mo65749b("default");
        C10051d dVar = this.f24985n;
        if (dVar != null) {
            dVar.mo64461a();
        }
        mo65751d();
        this.f24972a.mo64633a(this.f24976e);
        this.f24982k.mo63465e();
    }
}
