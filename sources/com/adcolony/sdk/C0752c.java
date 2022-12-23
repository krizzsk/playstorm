package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.adcolony.sdk.C0817e0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.adcolony.sdk.c */
class C0752c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C0719a1> f305a;

    /* renamed from: b */
    private HashMap<Integer, C1023y0> f306b;

    /* renamed from: c */
    private HashMap<Integer, C0733b1> f307c;

    /* renamed from: d */
    private HashMap<Integer, C0965u> f308d;

    /* renamed from: e */
    private HashMap<Integer, C0715a0> f309e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f310f;

    /* renamed from: g */
    private HashMap<Integer, View> f311g;

    /* renamed from: h */
    private int f312h;

    /* renamed from: i */
    private int f313i;

    /* renamed from: j */
    private int f314j;

    /* renamed from: k */
    private int f315k;

    /* renamed from: l */
    private String f316l;

    /* renamed from: m */
    boolean f317m;

    /* renamed from: n */
    boolean f318n;

    /* renamed from: o */
    private float f319o = 0.0f;

    /* renamed from: p */
    private double f320p = 0.0d;

    /* renamed from: q */
    private int f321q = 0;

    /* renamed from: r */
    private int f322r = 0;

    /* renamed from: s */
    private ArrayList<C0856j0> f323s;

    /* renamed from: t */
    private ArrayList<String> f324t;

    /* renamed from: u */
    private boolean f325u;

    /* renamed from: v */
    private boolean f326v;

    /* renamed from: w */
    private boolean f327w;

    /* renamed from: x */
    private AdSession f328x;

    /* renamed from: y */
    Context f329y;

    /* renamed from: z */
    VideoView f330z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C0753a implements C0856j0 {
        C0753a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c cVar = C0752c.this;
                cVar.mo10566a((View) cVar.mo10573c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C0754b implements C0856j0 {
        C0754b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c.this.mo10584g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C0755c implements C0856j0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        class C0756a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f334a;

            C0756a(C0841h0 h0Var) {
                this.f334a = h0Var;
            }

            public void run() {
                C0752c cVar = C0752c.this;
                cVar.mo10566a((View) cVar.mo10576d(this.f334a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0755c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C1038z0.m1202b((Runnable) new C0756a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C0757d implements C0856j0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C0758a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0841h0 f337a;

            C0758a(C0841h0 h0Var) {
                this.f337a = h0Var;
            }

            public void run() {
                C0752c.this.mo10586h(this.f337a);
            }
        }

        C0757d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C1038z0.m1202b((Runnable) new C0758a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C0759e implements C0856j0 {
        C0759e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c cVar = C0752c.this;
                cVar.mo10566a(cVar.mo10570b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C0760f implements C0856j0 {
        C0760f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c.this.mo10582f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C0761g implements C0856j0 {
        C0761g() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c cVar = C0752c.this;
                cVar.mo10566a((View) cVar.mo10562a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C0762h implements C0856j0 {
        C0762h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0752c.this.mo10588i(h0Var)) {
                C0752c.this.mo10580e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C0763i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f343a;

        C0763i(boolean z) {
            this.f343a = z;
        }

        public void run() {
            C0752c cVar = C0752c.this;
            if (!cVar.f317m) {
                cVar.m259a(this.f343a);
                C0752c.this.m261b(this.f343a);
            }
        }
    }

    C0752c(Context context, String str) {
        super(context);
        this.f329y = context;
        this.f316l = str;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0719a1 mo10573c(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        C0719a1 a1Var = new C0719a1(this.f329y, h0Var, d, this);
        a1Var.mo10473d();
        this.f305a.put(Integer.valueOf(d), a1Var);
        this.f311g.put(Integer.valueOf(d), a1Var);
        return a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0733b1 mo10576d(C0841h0 h0Var) {
        C0733b1 b1Var;
        C0823f1 a = h0Var.mo10772a();
        int d = C0764c0.m332d(a, "id");
        boolean b = C0764c0.m325b(a, "is_module");
        C0857k b2 = C0714a.m136b();
        if (b) {
            b1Var = b2.mo10802B().get(Integer.valueOf(C0764c0.m332d(a, "module_id")));
            if (b1Var == null) {
                new C0817e0.C0818a().mo10684a("Module WebView created with invalid id").mo10685a(C0817e0.f433h);
                return null;
            }
            b1Var.mo10505b(h0Var, d, this);
        } else {
            try {
                b1Var = C0733b1.m224a(this.f329y, h0Var, d, this);
            } catch (RuntimeException e) {
                C0817e0.C0818a aVar = new C0817e0.C0818a();
                aVar.mo10684a(e.toString() + ": during WebView initialization.").mo10684a(" Disabling AdColony.").mo10685a(C0817e0.f433h);
                AdColony.disable();
                return null;
            }
        }
        this.f307c.put(Integer.valueOf(d), b1Var);
        this.f311g.put(Integer.valueOf(d), b1Var);
        C0823f1 b3 = C0764c0.m322b();
        C0764c0.m326b(b3, "module_id", b1Var.getWebViewModuleId());
        if (b1Var instanceof C0898l0) {
            C0764c0.m326b(b3, "mraid_module_id", ((C0898l0) b1Var).getAdcModuleId());
        }
        h0Var.mo10773a(b3).mo10776c();
        return b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10580e(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        View remove = this.f311g.remove(Integer.valueOf(d));
        C0715a0 remove2 = this.f309e.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0781d c = C0714a.m136b().mo10827c();
            String b = h0Var.mo10774b();
            c.mo10652a(b, "" + d);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10582f(C0841h0 h0Var) {
        TextView textView;
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        View remove = this.f311g.remove(Integer.valueOf(d));
        if (this.f310f.remove(Integer.valueOf(d)).booleanValue()) {
            textView = this.f308d.remove(Integer.valueOf(d));
        } else {
            textView = this.f306b.remove(Integer.valueOf(d));
        }
        if (remove == null || textView == null) {
            C0781d c = C0714a.m136b().mo10827c();
            String b = h0Var.mo10774b();
            c.mo10652a(b, "" + d);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo10584g(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        View remove = this.f311g.remove(Integer.valueOf(d));
        C0719a1 remove2 = this.f305a.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C0781d c = C0714a.m136b().mo10827c();
            String b = h0Var.mo10774b();
            c.mo10652a(b, "" + d);
            return false;
        }
        if (remove2.mo10472c()) {
            remove2.mo10478j();
        }
        remove2.mo10470a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10586h(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        C0857k b = C0714a.m136b();
        View remove = this.f311g.remove(Integer.valueOf(d));
        C0733b1 remove2 = this.f307c.remove(Integer.valueOf(d));
        if (remove2 == null || remove == null) {
            C0781d c = b.mo10827c();
            String b2 = h0Var.mo10774b();
            c.mo10652a(b2, "" + d);
            return false;
        }
        if (remove2 instanceof C0889k0) {
            b.mo10847r().mo10786b((C0889k0) remove2);
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo10588i(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        return C0764c0.m332d(a, "container_id") == this.f314j && C0764c0.m336h(a, "ad_session_id").equals(this.f316l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10590j(C0841h0 h0Var) {
        Rect rect;
        this.f305a = new HashMap<>();
        this.f306b = new HashMap<>();
        this.f307c = new HashMap<>();
        this.f308d = new HashMap<>();
        this.f309e = new HashMap<>();
        this.f310f = new HashMap<>();
        this.f311g = new HashMap<>();
        this.f323s = new ArrayList<>();
        this.f324t = new ArrayList<>();
        C0823f1 a = h0Var.mo10772a();
        if (C0764c0.m325b(a, TJAdUnitConstants.String.TRANSPARENT)) {
            setBackgroundColor(0);
        }
        this.f314j = C0764c0.m332d(a, "id");
        this.f312h = C0764c0.m332d(a, "width");
        this.f313i = C0764c0.m332d(a, "height");
        this.f315k = C0764c0.m332d(a, "module_id");
        this.f318n = C0764c0.m325b(a, "viewability_enabled");
        this.f325u = this.f314j == 1;
        C0857k b = C0714a.m136b();
        if (this.f312h == 0 && this.f313i == 0) {
            if (this.f327w) {
                rect = b.mo10843n().mo11001x();
            } else {
                rect = b.mo10843n().mo11000w();
            }
            this.f312h = rect.width();
            this.f313i = rect.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f312h, this.f313i));
        }
        this.f323s.add(C0714a.m130a("VideoView.create", (C0856j0) new C0753a(), true));
        this.f323s.add(C0714a.m130a("VideoView.destroy", (C0856j0) new C0754b(), true));
        this.f323s.add(C0714a.m130a("WebView.create", (C0856j0) new C0755c(), true));
        this.f323s.add(C0714a.m130a("WebView.destroy", (C0856j0) new C0757d(), true));
        this.f323s.add(C0714a.m130a("TextView.create", (C0856j0) new C0759e(), true));
        this.f323s.add(C0714a.m130a("TextView.destroy", (C0856j0) new C0760f(), true));
        this.f323s.add(C0714a.m130a("ImageView.create", (C0856j0) new C0761g(), true));
        this.f323s.add(C0714a.m130a("ImageView.destroy", (C0856j0) new C0762h(), true));
        this.f324t.add("VideoView.create");
        this.f324t.add("VideoView.destroy");
        this.f324t.add("WebView.create");
        this.f324t.add("WebView.destroy");
        this.f324t.add("TextView.create");
        this.f324t.add("TextView.destroy");
        this.f324t.add("ImageView.create");
        this.f324t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f329y);
        this.f330z = videoView;
        videoView.setVisibility(8);
        addView(this.f330z);
        setClipToPadding(false);
        if (this.f318n) {
            m261b(C0764c0.m325b(h0Var.mo10772a(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo10591k() {
        return this.f315k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C1023y0> mo10592l() {
        return this.f306b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C0719a1> mo10593m() {
        return this.f305a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C0733b1> mo10594n() {
        return this.f307c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo10595o() {
        return this.f326v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C0857k b = C0714a.m136b();
        C0781d c = b.mo10827c();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m326b(b2, "view_id", -1);
        C0764c0.m319a(b2, "ad_session_id", this.f316l);
        C0764c0.m326b(b2, "container_x", x);
        C0764c0.m326b(b2, "container_y", y);
        C0764c0.m326b(b2, "view_x", x);
        C0764c0.m326b(b2, "view_y", y);
        C0764c0.m326b(b2, "id", this.f314j);
        if (action == 0) {
            new C0841h0("AdContainer.on_touch_began", this.f315k, b2).mo10776c();
        } else if (action == 1) {
            if (!this.f325u) {
                b.mo10817a(c.mo10658d().get(this.f316l));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f315k, b2).mo10776c();
        } else if (action == 2) {
            new C0841h0("AdContainer.on_touch_moved", this.f315k, b2).mo10776c();
        } else if (action == 3) {
            new C0841h0("AdContainer.on_touch_cancelled", this.f315k, b2).mo10776c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", (int) motionEvent2.getX(action2));
            C0764c0.m326b(b2, "container_y", (int) motionEvent2.getY(action2));
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0841h0("AdContainer.on_touch_began", this.f315k, b2).mo10776c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", (int) motionEvent2.getX(action3));
            C0764c0.m326b(b2, "container_y", (int) motionEvent2.getY(action3));
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action3));
            C0764c0.m326b(b2, "x", (int) motionEvent2.getX(action3));
            C0764c0.m326b(b2, "y", (int) motionEvent2.getY(action3));
            if (!this.f325u) {
                b.mo10817a(c.mo10658d().get(this.f316l));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f315k, b2).mo10776c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo10598p() {
        return this.f325u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo10599q() {
        return this.f327w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0715a0 mo10562a(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "id");
        C0715a0 a0Var = new C0715a0(this.f329y, h0Var, d, this);
        a0Var.mo10467a();
        this.f309e.put(Integer.valueOf(d), a0Var);
        this.f311g.put(Integer.valueOf(d), a0Var);
        return a0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo10570b(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        int d = C0764c0.m332d(a, "id");
        if (C0764c0.m325b(a, "editable")) {
            C0965u uVar = new C0965u(this.f329y, h0Var, d, this);
            uVar.mo11065a();
            this.f308d.put(Integer.valueOf(d), uVar);
            this.f311g.put(Integer.valueOf(d), uVar);
            this.f310f.put(Integer.valueOf(d), Boolean.TRUE);
            return uVar;
        } else if (!C0764c0.m325b(a, "button")) {
            C1023y0 y0Var = new C1023y0(this.f329y, h0Var, d, this);
            y0Var.mo11134a();
            this.f306b.put(Integer.valueOf(d), y0Var);
            this.f311g.put(Integer.valueOf(d), y0Var);
            this.f310f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var;
        } else {
            C1023y0 y0Var2 = new C1023y0(this.f329y, 16974145, h0Var, d, this);
            y0Var2.mo11134a();
            this.f306b.put(Integer.valueOf(d), y0Var2);
            this.f311g.put(Integer.valueOf(d), y0Var2);
            this.f310f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C0856j0> mo10587i() {
        return this.f323s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10572c() {
        return this.f314j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m259a(boolean z) {
        C0733b1 b1Var;
        double d;
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = C0714a.m136b().mo10827c().mo10658d().get(this.f316l);
        if (adColonyAdView == null) {
            b1Var = null;
        } else {
            b1Var = adColonyAdView.getWebView();
        }
        C0733b1 b1Var2 = b1Var;
        Context a = C0714a.m129a();
        boolean z2 = true;
        float a2 = C0837g1.m559a(view, a, true, z, true, adColonyAdView != null);
        if (a == null) {
            d = 0.0d;
        } else {
            d = C1038z0.m1170a(C1038z0.m1175a(a));
        }
        int a3 = C1038z0.m1173a((View) b1Var2);
        int b = C1038z0.m1192b((View) b1Var2);
        if (a3 == this.f321q && b == this.f322r) {
            z2 = false;
        }
        if (z2) {
            this.f321q = a3;
            this.f322r = b;
            m257a(a3, b, b1Var2);
        }
        if (!(this.f319o == a2 && this.f320p == d && !z2)) {
            m256a(a2, d);
        }
        this.f319o = a2;
        this.f320p = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10574c(boolean z) {
        this.f325u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo10578e() {
        return this.f311g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10579e(boolean z) {
        this.f326v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo10583g() {
        return this.f310f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C0715a0> mo10585h() {
        return this.f309e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C0965u> mo10581f() {
        return this.f308d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m261b(boolean z) {
        C1038z0.m1187a((Runnable) new C0763i(z), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10569b() {
        return this.f313i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10571b(int i) {
        this.f312h = i;
    }

    /* renamed from: a */
    private void m257a(int i, int i2, C0733b1 b1Var) {
        float s = C0714a.m136b().mo10843n().mo10996s();
        if (b1Var != null) {
            C0823f1 b = C0764c0.m322b();
            C0764c0.m326b(b, "app_orientation", C1038z0.m1209d(C1038z0.m1216f()));
            C0764c0.m326b(b, "width", (int) (((float) b1Var.getCurrentWidth()) / s));
            C0764c0.m326b(b, "height", (int) (((float) b1Var.getCurrentHeight()) / s));
            C0764c0.m326b(b, "x", i);
            C0764c0.m326b(b, "y", i2);
            C0764c0.m319a(b, "ad_session_id", this.f316l);
            new C0841h0("MRAID.on_size_change", this.f315k, b).mo10776c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo10575d() {
        return this.f312h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10577d(boolean z) {
        this.f327w = z;
    }

    /* renamed from: a */
    private void m256a(float f, double d) {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m326b(b, "id", this.f314j);
        C0764c0.m319a(b, "ad_session_id", this.f316l);
        C0764c0.m316a(b, "exposure", (double) f);
        C0764c0.m316a(b, TapjoyConstants.TJC_VOLUME, d);
        new C0841h0("AdContainer.on_exposure_change", this.f315k, b).mo10776c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10563a() {
        return this.f316l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10564a(int i) {
        this.f313i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10567a(AdSession adSession) {
        this.f328x = adSession;
        mo10568a((Map) this.f311g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10568a(Map map) {
        if (this.f328x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo10566a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10566a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f328x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10565a(View view) {
        AdSession adSession = this.f328x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo10589j() {
        return this.f324t;
    }
}
